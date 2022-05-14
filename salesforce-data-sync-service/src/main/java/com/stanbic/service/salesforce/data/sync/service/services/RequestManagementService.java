package com.stanbic.service.salesforce.data.sync.service.services;

import com.stanbic.service.salesforce.data.sync.service.DTOs.*;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleClient;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleContact;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleProduct;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleRelationship;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.mappers.*;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class RequestManagementService {
    private final Logger log = LoggerFactory.getLogger(RequestManagementService.class);

    @Autowired
    private ClientService clientService;

    @Autowired
    private ContactService contactService;

    @Autowired
    private ProductService productService;

    @Autowired
    private RelationshipService relationshipService;

    @Autowired
    private UserService userService;

    @Autowired
    private ClientMapper clientMapper;

    @Autowired
    private ContactMapper contactMapper;

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private RelationshipMapper relationshipMapper;

    @Autowired
    private UserMapper userMapper;

    public List<Client> getClientsByFrequency(Integer frequency) throws DataSyncException {

        log.info("fetching " + frequency + "clients");

        var clients = clientService.getByFrequency(frequency);

        var mapped = clientMapper.getClients(clients);

        for (LocalFinacleClient client: clients
             ) {
            client.setPushResponseStatus("OK");
        }

        clientService.saveAll(clients);

        return mapped;
    }

    public List<Contact> getContactsByFrequency(Integer frequency) throws DataSyncException {

        log.info("fetching " + frequency + "clients");

       var contacts = contactService.getByFrequency(frequency);

        var mapped = contactMapper.getContacts(contacts);

        for (LocalFinacleContact contact: contacts
        ) {
            contact.setPushResponseStatus("OK");
        }

        contactService.saveAll(contacts);

       return mapped;
    }

    public List<Product> getProductsByFrequency(Integer frequency)  throws DataSyncException{

        log.info("fetching " + frequency + "clients");

        var products = productService.getByFrequency(frequency);

        var mapped = productMapper.getProducts(products);

        for (LocalFinacleProduct product: products
        ) {
            product.setPushResponseStatus("OK");
        }

        productService.saveAll(products);

        return mapped;
    }

    public List<Relationship> getRelationshipsByFrequency(Integer frequency)  throws DataSyncException{

        log.info("fetching " + frequency + "clients");

       var relationships = relationshipService.getByFrequency(frequency);

        var mapped = relationshipMapper.getRelationships(relationships);

        for (LocalFinacleRelationship relationship: relationships
        ) {
            relationship.setPushResponseStatus("OK");
        }

        relationshipService.saveAll(relationships);

       return mapped;
    }

    public void saveUsers (List<User> users) throws DataSyncException {
        var mapped = userMapper.setUsers(users);

        userService.saveAll(mapped);
    }

    public void saveUser(User user) throws DataSyncException {
        var mapped = userMapper.setUser(user);

        userService.save(mapped);
    }

}
