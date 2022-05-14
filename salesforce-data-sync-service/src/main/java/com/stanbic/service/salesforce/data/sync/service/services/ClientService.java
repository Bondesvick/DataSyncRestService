package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleClient;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.repositories.ClientRepository;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final Logger log = LoggerFactory.getLogger(ClientService.class);

    @Autowired
    private ClientRepository clientRepository;

    public List<LocalFinacleClient> getByFrequency(Integer frequency)
            throws DataSyncException {

        try {
            log.info("fetching " + frequency + "clients");

            Integer toTake = frequency;

            if (frequency > 100){
                toTake =  100;
            }

            Pageable pageable = PageRequest.of(0, toTake, Sort.by("id").ascending());

            return clientRepository.findByPushResponseStatus("PENDING", pageable);
        }catch (Exception e){
            log.error(e.getMessage(),e);

            throw new DataSyncException(e.getMessage());
        }
    }

    public void save(LocalFinacleClient localFinacleClient) throws DataSyncException{
        try {
            log.info("Saving client detail to data base");
            clientRepository.save(localFinacleClient);

        } catch (Exception e){
            log.error("Error saving client detail to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

    public void saveAll(List<LocalFinacleClient> localFinacleClientList) throws DataSyncException{
        try {
            log.info("Saving client list details to data base");

            clientRepository.saveAll(localFinacleClientList);

        } catch (Exception e){
            log.error("Error saving client list details to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

}
