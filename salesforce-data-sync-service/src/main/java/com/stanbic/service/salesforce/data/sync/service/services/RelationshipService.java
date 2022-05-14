package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleRelationship;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.repositories.RelationshipRepository;
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
public class RelationshipService {
    private final Logger log = LoggerFactory.getLogger(RelationshipService.class);

    @Autowired
    private RelationshipRepository relationshipRepository;

    public List<LocalFinacleRelationship> getByFrequency(Integer frequency)  throws DataSyncException {

        try {

            log.info("fetching " + frequency + "relationships");

            Integer toTake = frequency;

            if (frequency > 100){
                toTake =  100;
            }

            Pageable pageable = PageRequest.of(0, toTake, Sort.by("id").ascending());

            return relationshipRepository.findByPushResponseStatus
                    ("PENDING",pageable);
        } catch (Exception e){
            log.error(e.getMessage(),e);

            throw new DataSyncException(e.getMessage());
        }
    }

    public void save(LocalFinacleRelationship localFinacleRelationship) throws DataSyncException{
        try {
            log.info("Saving relationship detail to data base");
            relationshipRepository.save(localFinacleRelationship);

        } catch (Exception e){
            log.error("Error relationship client detail to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

    public void saveAll(List<LocalFinacleRelationship> localFinacleRelationshipList) throws DataSyncException{
        try {
            log.info("Saving relationship list details to data base");
            relationshipRepository.saveAll(localFinacleRelationshipList);
        } catch (Exception e){
            log.error("Error saving relationship list details to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }
}
