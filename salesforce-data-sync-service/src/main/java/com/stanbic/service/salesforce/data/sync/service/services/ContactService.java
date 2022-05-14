package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleContact;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.repositories.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class ContactService {
    private final Logger log = LoggerFactory.getLogger(ContactService.class);

    @Autowired
    private ContactRepository contactRepository;

    public List<LocalFinacleContact> getByFrequency(Integer frequency) throws DataSyncException{

        try {

            log.info("fetching " + frequency + "contacts");

            Integer toTake = frequency;

            if (frequency > 100){
                toTake =  100;
            }

            Pageable pageable = PageRequest.of(0, toTake, Sort.by("id").ascending());

            return contactRepository.findByPushResponseStatus("PENDING",pageable);

        } catch (Exception e){
            log.error(e.getMessage(),e);

            throw new DataSyncException(e.getMessage());
        }
    }

    public void save(LocalFinacleContact localFinacleContact) throws DataSyncException{
        try {
            log.info("Saving contact detail to data base");
            contactRepository.save(localFinacleContact);

        } catch (Exception e){
            log.error("Error saving contact detail to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

    public void saveAll(List<LocalFinacleContact> localFinacleContactList) throws DataSyncException{
        try {
            log.info("Saving contact list details to data base");
            contactRepository.saveAll(localFinacleContactList);

        } catch (Exception e){
            log.error("Error saving contact list details to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

}
