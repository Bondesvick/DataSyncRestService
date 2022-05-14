package com.stanbic.service.salesforce.data.sync.service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RBX_T_SALESFORCE_USER")
public class LocalSalesforceUser implements Serializable {

    private static final long serialVersionUID = 6347822196913734042L;

    @Id
//	@GeneratedValue(generator="system-uuid")
//	@GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "id")
    private String id;

    @Column(name = "username")
    private String username;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "name")
    private String name;

    @Column(name = "company_Name")
    private String companyName;

    @Column(name = "division")
    private String division;

    @Column(name = "department")
    private String department;

    @Column(name = "title")
    private String title;

    @Column(name = "street")
    private String street;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_Code")
    private String postalCode;

    @Column(name = "country_code")
    private String countryCode;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "fax")
    private String fax;

    @Column(name = "mobile_Phone")
    private String mobilePhone;

    @Column(name = "alias")
    private String alias;

    @Column(name = "community_Nickname")
    private String communityNickname;

    @Column(name = "is_Active")
    private String isActive;

    @Column(name = "user_Role_Id")
    private String userRoleId;

    @Column(name = "profile_Id")
    private String profileId;

    @Column(name = "user_Type")
    private String userType;

    @Column(name = "employee_Number")
    private String employeeNumber;

    @Column(name = "delegated_Approver_Id")
    private String delegatedApproverId;

    @Column(name = "manager_Id")
    private String managerId;

    @Column(name = "last_Login_Date")
    private String lastLoginDate;

    @Column(name = "createdDate")
    private String createdDate;

    @Column(name = "created_By_Id")
    private String createdById;

    @Column(name = "external_ID")
    private String externalId;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "division_code")
    private String divisionCode;

    @Column(name = "sap_id")
    private String sapId;

    @Column(name = "last_updated_on")
    private Timestamp lastUpdatedOn;
}
