package com.stanbic.service.salesforce.data.sync.service.utils;

public class SalesforceConstant {

	public static final String FAILURE_RESPONSE_STATUS = "FAILED";
	public static final String FINACLE_CLIENT_OBJECT = "finacleClientObject";
	public static final String FINACLE_CLIENT_OBJECT_LIST = "finacleClientObjectList";
	public static final String FINACLE_CONTACT_OBJECT = "finacleContactObject";
	public static final String FINACLE_CONTACT_OBJECT_LIST = "finacleContactObjectList";
	public static final String FINACLE_PRODUCT_OBJECT = "finacleProductObject";
	public static final String FINACLE_PRODUCT_OBJECT_LIST = "finacleProductObjectList";
	public static final String FINACLE_RELATIONSHIP_OBJECT = "finacleRelationshipObject";
	public static final String FINACLE_RELATIONSHIP_OBJECT_LIST = "finacleRelationshipObjectList";
	public static final String PROCESSING_ERROR_FLAG = "hasErrorOccurred";
	public static final String SUCCESS_RESPONSE_STATUS = "SUCCESS";
	public static final String UNKNOWN_RESPONSE_STATUS = "UNKNOWN";
	public static final String RETAIL_CLIENT_BUSINESS_TYPE = "RETAIL";
	public static final String CORPORATE_CLIENT_BUSINESS_TYPE = "CORPORATE";
	public static final String PENDING_RESPONSE_STATUS = "PENDING";
	public static final String IN_PROGRESS_RESPONSE_STATUS = "IN_PROGRESS";

	public static final String SUCCESS_CODE = "200";
	public static final String NOT_FOUND_CODE = "404";
	public static final String ERROR_CODE = "500";

	public static final String SUCCESS_MESSAGE = "IN_PROGRESS";
	public static final String NOT_FOUND_MESSAGE = "No data was found";
	public static final String ERROR_MESSAGE = "An error occurred";

	private SalesforceConstant() {
		throw new IllegalStateException("SalesforceConstant is a Utility class");
	}
}
