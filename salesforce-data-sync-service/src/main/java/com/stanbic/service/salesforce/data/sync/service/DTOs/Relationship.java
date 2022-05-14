package com.stanbic.service.salesforce.data.sync.service.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Relationship {

    private String clientCif;
    private String clientSalesforceId;
    private String compositeKey;
    private String contactCif;
    private String contactSalesforceId;
    private String description;
    private String email;
//    private java.sql.Timestamp extractionDateTime;
    private String id;
    private String jobTitle;
    private String keyContact;
    private String ownerSalesforceId;
    private String ownershipPercentage;
    private String phone;
//    private java.sql.Timestamp pushDateTime;
//    private String pushResponseCode;
//    private String pushResponseDescription;
//    private String pushResponseStatus;
    private String role;
    private String salesforceId;
}
