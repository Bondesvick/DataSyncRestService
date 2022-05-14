package com.stanbic.service.salesforce.data.sync.service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RBX_T_SALESFORCE_RELATION")
public class LocalFinacleRelationship implements Serializable {

    private static final long serialVersionUID = -3799849265258952376L;
    @Column(name = "client_CIF")
    private String clientCif;
    @Column(name = "client_salesforce_id")
    private String clientSalesforceId;
    @Column(name = "composite_Key")
    private String compositeKey;
    @Column(name = "contact_Cif")
    private String contactCif;
    @Column(name = "contact_salesforce_id")
    private String contactSalesforceId;
    @Column(name = "description")
    private String description;
    @Column(name = "email")
    private String email;
    @Column(name = "extraction_Date_Time")
    private java.sql.Timestamp extractionDateTime;
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "job_Title")
    private String jobTitle;
    @Column(name = "key_Contact")
    private String keyContact;
    @Column(name = "owner_salesforce_id")
    private String ownerSalesforceId;
    @Column(name = "ownership_Percentage")
    private String ownershipPercentage;
    @Column(name = "phone")
    private String phone;
    @Column(name = "push_Date_Time")
    private java.sql.Timestamp pushDateTime;
    @Column(name = "push_Resp_Code")
    private String pushResponseCode;
    @Column(name = "push_Resp_Desc")
    private String pushResponseDescription;
    @Column(name = "push_Resp_Status")
    private String pushResponseStatus;
    @Column(name = "role")
    private String role;
    @Column(name = "salesforce_id")
    private String salesforceId;
}
