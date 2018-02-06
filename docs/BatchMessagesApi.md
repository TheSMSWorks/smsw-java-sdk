# BatchMessagesApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelScheduledBatchJob**](BatchMessagesApi.md#cancelScheduledBatchJob) | **DELETE** /batches/schedule/{batchid} | 
[**getBatchById**](BatchMessagesApi.md#getBatchById) | **GET** /batch/{batchid} | 
[**scheduleBatch**](BatchMessagesApi.md#scheduleBatch) | **POST** /batch/schedule | 
[**sendBatch**](BatchMessagesApi.md#sendBatch) | **POST** /batch/send | 


<a name="cancelScheduledBatchJob"></a>
# **cancelScheduledBatchJob**
> CancelledMessageResponse cancelScheduledBatchJob(batchid)



Cancels a scheduled SMS message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

BatchMessagesApi apiInstance = new BatchMessagesApi();
String batchid = "batchid_example"; // String | The ID of the batch you would like returned
try {
    CancelledMessageResponse result = apiInstance.cancelScheduledBatchJob(batchid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchMessagesApi#cancelScheduledBatchJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchid** | **String**| The ID of the batch you would like returned |

### Return type

[**CancelledMessageResponse**](CancelledMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getBatchById"></a>
# **getBatchById**
> MessagesResponse getBatchById(batchid)



Retrieve all messages in a batch with the given batch ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

BatchMessagesApi apiInstance = new BatchMessagesApi();
String batchid = "batchid_example"; // String | The ID of the batch you would like returned
try {
    MessagesResponse result = apiInstance.getBatchById(batchid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchMessagesApi#getBatchById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batchid** | **String**| The ID of the batch you would like returned |

### Return type

[**MessagesResponse**](MessagesResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="scheduleBatch"></a>
# **scheduleBatch**
> ScheduledBatchResponse scheduleBatch(smsMessage)



Schedules a batch of SMS messages to be sent at the date-time you specify

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

BatchMessagesApi apiInstance = new BatchMessagesApi();
BatchMessage smsMessage = new BatchMessage(); // BatchMessage | Message properties
try {
    ScheduledBatchResponse result = apiInstance.scheduleBatch(smsMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchMessagesApi#scheduleBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessage** | [**BatchMessage**](BatchMessage.md)| Message properties |

### Return type

[**ScheduledBatchResponse**](ScheduledBatchResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendBatch"></a>
# **sendBatch**
> BatchMessageResponse sendBatch(smsMessage)



Send a single SMS message to multiple recipients

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.BatchMessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

BatchMessagesApi apiInstance = new BatchMessagesApi();
BatchMessage smsMessage = new BatchMessage(); // BatchMessage | Message properties
try {
    BatchMessageResponse result = apiInstance.sendBatch(smsMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling BatchMessagesApi#sendBatch");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessage** | [**BatchMessage**](BatchMessage.md)| Message properties |

### Return type

[**BatchMessageResponse**](BatchMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

