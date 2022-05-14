package com.stanbic.service.salesforce.data.sync.service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RBX_T_SALESFORCE_CLIENT")
public class LocalFinacleClient implements Serializable {

    private static final long serialVersionUID = 6354000341724133277L;
    @Column(name = "address_2_City")
    private String address2City;
    @Column(name = "address_2_Country")
    private String address2Country;
    @Column(name = "address_2_House_Number")
    private String address2HouseNumber;
    @Column(name = "address_2_State")
    private String address2State;
    @Column(name = "address_2_Street")
    private String address2Street;
    @Column(name = "address_City")
    private String addressCity;
    @Column(name = "address_country")
    private String addressCountry;
    @Column(name = "address_house_Number")
    private String addressHouseNumber;
    @Column(name = "address_Start_Date")
    private String addressStartDate;
    @Column(name = "address_State")
    private String addressState;
    @Column(name = "address_Street")
    private String addressStreet;
    @Column(name = "address_Type")
    private String addressType;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "branch_city")
    private String branchCity;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "branch_state")
    private String branchState;
    @Column(name = "business_Type")
    private String businessType;
    @Column(name = "bvn")
    private String bvn;
    @Column(name = "cif_Type")
    private String cifType;
    @Column(name = "client_CIF")
    private String clientCif;
    @Column(name = "client_creation_date")
    private String clientCreationDate;
    @Column(name = "client_Name")
    private String clientName;
    @Column(name = "doc_Code")
    private String documentCode;
    @Column(name = "doc_Code_Desc")
    private String documentCodeDescription;
    @Column(name = "doc_Country_Of_Issue")
    private String documentCountryOfIssue;
    @Column(name = "doc_Expiry_Date")
    private String documentExpiryDate;
    @Column(name = "doc_Issue_Date")
    private String documentIssueDate;
    @Column(name = "doc_Issuer")
    private String documentIssuer;
    @Column(name = "doc_Place_Of_Issue")
    private String documentPlaceOfIssue;
    @Column(name = "doc_Reference_Number")
    private String documentReferenceNumber;
    @Column(name = "doc_Type_Code")
    private String documentTypeCode;
    @Column(name = "doc_Type_Desc")
    private String documentTypeDescription;
    @Column(name = "doc_Unique_Id")
    private String documentUniqueId;
    @Column(name = "ecosystem_status")
    private String ecosystemStatus;
    @Column(name = "email")
    private String email;
    @Column(name = "extraction_Date_Time")
    private java.sql.Timestamp extractionDateTime;
    @Column(name = "facebook_Id")
    private String facebookId;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "free_Text_1")
    private String freeText1;
    @Column(name = "free_Text_10")
    private String freeText10;
    @Column(name = "free_Text_2")
    private String freeText2;
    @Column(name = "free_Text_3")
    private String freeText3;
    @Column(name = "free_Text_4")
    private String freeText4;
    @Column(name = "free_Text_5")
    private String freeText5;
    @Column(name = "free_Text_6")
    private String freeText6;
    @Column(name = "free_Text_7")
    private String freeText7;
    @Column(name = "free_Text_8")
    private String freeText8;
    @Column(name = "free_Text_9")
    private String freeText9;
    @Column(name = "group_Id")
    private String groupId;
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "industry")
    private String industry;
    @Column(name = "instagram_Id")
    private String instagramId;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "middle_Name")
    private String middleName;
    @Column(name = "next_of_Kin_1")
    private String nextOfKin1;
    @Column(name = "next_of_Kin_2")
    private String nextOfKin2;
    @Column(name = "owner_salesforce_id")
    private String ownerSalesforceId;
    @Column(name = "pep")
    private String pep;
    @Column(name = "phone")
    private String phone;
    @Column(name = "preferred_Address_Type")
    private String preferredAddressType;
    @Column(name = "primary_cif")
    private String primaryCif;
    @Column(name = "primary_Rel_Mgr_Id")
    private String primaryRelationshipManagerId;
    @Column(name = "primary_SOL_Id")
    private String primarySolId;
    @Column(name = "push_Date_Time")
    private java.sql.Timestamp pushDateTime;
    @Column(name = "push_Resp_Code")
    private String pushResponseCode;
    @Column(name = "push_Resp_Desc")
    private String pushResponseDescription;
    @Column(name = "push_Resp_Status")
    private String pushResponseStatus;
    @Column(name = "rc_Number")
    private String rcNumber;
    @Column(name = "record_Type")
    private String recordType;
    @Column(name = "Rel_Mgr_Email")
    private String relationshipManagerEmail;
    @Column(name = "Rel_Mgr_Sap_Id")
    private String relationshipManagerSapId;
    @Column(name = "salesforce_id")
    private String salesforceId;
    @Column(name = "segment")
    private String segment;
    @Column(name = "sub_Segment")
    private String subSegment;
    @Column(name = "tax_Id_Number")
    private String taxIdentificationNumber;
    @Column(name = "tier")
    private String tier;
    @Column(name = "trans_Regional")
    private String transRegional;
    @Column(name = "twitter_Id")
    private String twitterId;
    @Column(name = "unique_Id")
    private String uniqueId;
}
