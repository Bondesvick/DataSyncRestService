package com.stanbic.service.salesforce.data.sync.service.DTOs;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Product {

    private String accountName;
    private String accountNumber;
    private String branchAddress;
    private String branchCity;
    private String branchName;
    private String branchState;
    private String clientCif;
    private String clientSalesforceId;
    private String currencyType;
    private String endOfDayBalance;
//    private java.sql.Timestamp extractionDateTime;
    private String generalLedgerSubHead;
    private String guarantor1;
    private String guarantor2;
    private String id;
    private String ownerSalesforceId;
    private String pricingOptions;
    private String productHouseCode;
//    private java.sql.Timestamp pushDateTime;
//    private String pushResponseCode;
//    private String pushResponseDescription;
//    private String pushResponseStatus;
    private String salesforceId;
    private String schemeCode;
    private String statementDispatchMode;
    private String workPlaceBankingCorporateName;
    private String workPlaceBankingEnabled;
}
