package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.entities.LocalSalesforceUser;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.repositories.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;

    public List<LocalSalesforceUser> getAllUsers(){

        log.info("fetching all users");

        log.info("fetching all Salesforce users");
        return userRepository.findAll();
    }

    public void save(LocalSalesforceUser localSalesforceUser) throws DataSyncException{
        try {
            log.info("Saving user detail to data base");
            userRepository.save(localSalesforceUser);

        } catch (Exception e){
            log.error("Error saving user detail to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }

    public void saveAll(List<LocalSalesforceUser> localSalesforceUser) throws DataSyncException{

        try {
            log.info("Saving user list details to data base");
            userRepository.saveAll(localSalesforceUser);

        } catch (Exception e){
            log.error("Error saving user list details to database -> "+ e.getMessage(), e);
            throw new DataSyncException(e.getMessage());
        }
    }
}
