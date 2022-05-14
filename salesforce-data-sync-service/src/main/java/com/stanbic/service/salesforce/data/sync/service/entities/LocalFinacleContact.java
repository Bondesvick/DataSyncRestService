package com.stanbic.service.salesforce.data.sync.service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RBX_T_SALESFORCE_CONTACT")
public class LocalFinacleContact implements Serializable {

    private static final long serialVersionUID = 1725319587675441282L;
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
    @Column(name = "bvn")
    private String bvn;
    @Column(name = "cif")
    private String cif;
    @Column(name = "client_CIF")
    private String clientCif;
    @Column(name = "client_salesforce_id")
    private String clientSalesforceId;
    @Column(name = "country_Of_Birth")
    private String countryOfBirth;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
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
    @Column(name = "email")
    private String email;
    @Column(name = "employment_Type")
    private String employmentType;
    @Column(name = "extraction_Date_Time")
    private java.sql.Timestamp extractionDateTime;
    @Column(name = "facebook_Id")
    private String facebookId;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "gender")
    private String gender;
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "instagram_Id")
    private String instagramId;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "marital_Status")
    private String maritalStatus;
    @Column(name = "means_of_Id_Doc_Type")
    private String meansOfIdDocumentType;
    @Column(name = "middle_Name")
    private String middleName;
    @Column(name = "minor_Indicator")
    private String minorIndicator;
    @Column(name = "mother_Maiden_Name")
    private String motherMaidenName;
    @Column(name = "nationality")
    private String nationality;
    @Column(name = "next_Of_Kin1_Date_Of_Birth")
    private String nextOfKin1DateOfBirth;
    @Column(name = "next_Of_Kin1_Full_Name")
    private String nextOfKin1FullName;
    @Column(name = "next_Of_Kin1_Gender")
    private String nextOfKin1Gender;
    @Column(name = "next_Of_Kin1_Rel_Type")
    private String nextOfKin1RelationshipType;
    @Column(name = "occupation")
    private String occupation;
    @Column(name = "owner_salesforce_id")
    private String ownerSalesforceId;
    @Column(name = "pep")
    private String pep;
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
    @Column(name = "record_Type")
    private String recordType;
    @Column(name = "related_Party")
    private String relatedParty;
    @Column(name = "religion")
    private String religion;
    @Column(name = "salesforce_id")
    private String salesforceId;
    @Column(name = "segment")
    private String segment;
    @Column(name = "state_Of_Origin")
    private String stateOfOrigin;
    @Column(name = "sub_Segment")
    private String subSegment;
    @Column(name = "title")
    private String title;
    @Column(name = "twitter_Id")
    private String twitterId;
    @Column(name = "unique_Id")
    private String uniqueId;
}
