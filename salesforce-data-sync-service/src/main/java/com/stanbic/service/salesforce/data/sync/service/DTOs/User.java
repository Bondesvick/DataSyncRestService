package com.stanbic.service.salesforce.data.sync.service.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class User {

    private String id;
    private String username;
    private String lastName;
    private String firstName;
    private String name;
    private String companyName;
    private String division;
    private String department;
    private String title;
    private String street;
    private String city;
    private String state;
    private String postalCode;
    private String countryCode;
    private String address;
    private String email;
    private String phone;
    private String fax;
    private String mobilePhone;
    private String alias;
    private String communityNickname;
    private String isActive;
    private String userRoleId;
    private String profileId;
    private String userType;
    private String employeeNumber;
    private String delegatedApproverId;
    private String managerId;
    private String lastLoginDate;
    private String createdDate;
    private String createdById;
    private String externalId;
    private String countryName;
    private String divisionCode;
    private String sapId;
//    private Timestamp lastUpdatedOn;
}
