package com.stanbic.service.salesforce.data.sync.service.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "RBX_T_SALESFORCE_PRODUCT")
public class LocalFinacleProduct implements Serializable {
    private static final long serialVersionUID = -46745746004364828L;
    @Column(name = "account_Name")
    private String accountName;
    @Column(name = "account_Number")
    private String accountNumber;
    @Column(name = "branch_address")
    private String branchAddress;
    @Column(name = "branch_city")
    private String branchCity;
    @Column(name = "branch_name")
    private String branchName;
    @Column(name = "branch_state")
    private String branchState;
    @Column(name = "client_CIF")
    private String clientCif;
    @Column(name = "client_salesforce_id")
    private String clientSalesforceId;
    @Column(name = "currency_Type")
    private String currencyType;
    @Column(name = "end_of_day_balance")
    private String endOfDayBalance;
    @Column(name = "extraction_Date_Time")
    private java.sql.Timestamp extractionDateTime;
    @Column(name = "gl_Sub_head")
    private String generalLedgerSubHead;
    @Column(name = "guarantor_1")
    private String guarantor1;
    @Column(name = "guarantor_2")
    private String guarantor2;
    @Id
    @Column(name = "id")
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(name = "owner_salesforce_id")
    private String ownerSalesforceId;
    @Column(name = "pricing_Options")
    private String pricingOptions;
    @Column(name = "product_House_Code")
    private String productHouseCode;
    @Column(name = "push_Date_Time")
    private java.sql.Timestamp pushDateTime;
    @Column(name = "push_Resp_Code")
    private String pushResponseCode;
    @Column(name = "push_Resp_Desc")
    private String pushResponseDescription;
    @Column(name = "push_Resp_Status")
    private String pushResponseStatus;
    @Column(name = "salesforce_id")
    private String salesforceId;
    @Column(name = "scheme_Code")
    private String schemeCode;
    @Column(name = "stmt_dispatch_Mode")
    private String statementDispatchMode;
    @Column(name = "wpb_Corporate_Name")
    private String workPlaceBankingCorporateName;
    @Column(name = "wpb_Enabled_flag")
    private String workPlaceBankingEnabled;

}
