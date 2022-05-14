package com.stanbic.service.salesforce.data.sync.service.controllers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.*;
import com.stanbic.service.salesforce.data.sync.service.exceptions.DataSyncException;
import com.stanbic.service.salesforce.data.sync.service.services.RequestManagementService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.var;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import java.util.List;

@CrossOrigin
//@Validated
@RestController
@RequestMapping(path = "/salesforce-data-sync-service")
@Api(value = "Data Sync Request", tags = "Data Sync Request")
public class DataSyncController {

    private final Logger log = LoggerFactory.getLogger(DataSyncController.class);

    @Autowired
    private RequestManagementService requestManagementService;

    @GetMapping(path = "/get-clients/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Get list of clients according frequency number provided number")
    public ResponseEntity<StandardJSONResponseBody<List<Client>>> getListOfClients(
            HttpServletRequest request,
            @NotBlank @RequestParam(name = "frequency") Integer number
    ) throws Exception {
        log.info("Received a request to fetch " + number + "pending clients");

        log.info("Returning API response to client");

        var clients = requestManagementService.getClientsByFrequency(number);

        StandardJSONResponseBody<List<Client>> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(clients);
        responseBody.setMessage(clients.size() > 0 ? "Here is the list of requested clients" : "Not data found");
        responseBody.setStatusCode(clients.size() > 0 ? "200" : "404");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping(path = "/get-contacts/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Get list of contacts according frequency number provided number")
    public ResponseEntity< StandardJSONResponseBody<List<Contact>>> getListOfContacts(
            HttpServletRequest request,
            @NotBlank @RequestParam(name = "frequency") Integer number
    ) throws DataSyncException {
        log.info("Received a request to fetch " + number + "pending contacts");

        log.info("Returning API response to client");

        var contacts = requestManagementService.getContactsByFrequency(number);

        StandardJSONResponseBody<List<Contact>> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(contacts);
        responseBody.setMessage(contacts.size() > 0 ? "Here is the list of requested contacts" : "Not data found");
        responseBody.setStatusCode(contacts.size() > 0 ? "200" : "404");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping(path = "/get-products/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Get list of products according frequency number provided number")
    public ResponseEntity<StandardJSONResponseBody<List<Product>>> getListOfProducts(
            HttpServletRequest request,
            @NotBlank @RequestParam(name = "frequency") Integer number
    ) throws DataSyncException {
        log.info("Received a request to fetch " + number + "pending products");

        log.info("Returning API response to client");

        var products = requestManagementService.getProductsByFrequency(number);

        StandardJSONResponseBody<List<Product>> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(products);
        responseBody.setMessage(products.size() > 0 ? "Here is the list of requested products" : "Not data found");
        responseBody.setStatusCode(products.size() > 0 ? "200" : "404");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @GetMapping(path = "/get-relationships/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Get list of relationships according frequency number provided number")
    public ResponseEntity<StandardJSONResponseBody<List<Relationship>>> getListOfRelationships(
            HttpServletRequest request,
            @NotBlank @RequestParam(name = "frequency") Integer number
    ) throws DataSyncException {
        log.info("Received a request to fetch " + number + "pending relationships");

        log.info("Returning API response to client");

        var relationships = requestManagementService.getRelationshipsByFrequency(number);

        StandardJSONResponseBody<List<Relationship>> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(relationships);
        responseBody.setMessage(relationships.size() > 0 ? "Here is the list of requested relationships" : "Not data found");
        responseBody.setStatusCode(relationships.size() > 0 ? "200" : "404");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

    @PostMapping(path = "/save-user/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Save user details to the database")
    public ResponseEntity<StandardJSONResponseBody<User>> postUser(
            HttpServletRequest request,
            @Valid @RequestBody User user)
            throws DataSyncException {
        log.info("Received a request to save a user");

        requestManagementService.saveUser(user);

        log.info("Returning API response to client");

        StandardJSONResponseBody<User> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(user);
        responseBody.setMessage("User details were saved successfully");
        responseBody.setStatusCode("204");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }


    @PostMapping(path = "/save-users/", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation("Save list of users to the database")
    public ResponseEntity<StandardJSONResponseBody<List<User>>> postListOfUsers(
                HttpServletRequest request,
                @Valid @RequestBody List<User> users)
                throws DataSyncException {
            log.info("Received a request to save " + users.size() + "user");

            requestManagementService.saveUsers(users);

        log.info("Returning API response to client");

        StandardJSONResponseBody<List<User>> responseBody;

        // Setup the response body
        responseBody = new StandardJSONResponseBody<>();
        responseBody.setPath(
                (String) request.getAttribute(
                        HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE
                )
        );
        responseBody.setData(users);
        responseBody.setMessage("Users details were saved successfully");
        responseBody.setStatusCode("204");

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
    }

//    @GetMapping(path = "/get-users/", produces = MediaType.APPLICATION_JSON_VALUE)
//    @ApiOperation("Get list of users according frequency number provided number")
//    public ResponseEntity<List<User>> getListOfUsers(
//            HttpServletRequest request,
//            @NotBlank @RequestParam(name = "frequency") String number
//    ) throws Exception {
//        log.info("Received a request to fetch all accounts opened by an RM");
//
//        log.info("Returning API response to client");
//
//        return new ResponseEntity<>("ok", HttpStatus.OK);
//    }
}
