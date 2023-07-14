# BatchMessagesApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**batchAnyPost**](BatchMessagesApi.md#batchAnyPost) | **POST** /batch/any |  |
| [**batchBatchidGet**](BatchMessagesApi.md#batchBatchidGet) | **GET** /batch/{batchid} |  |
| [**batchSchedulePost**](BatchMessagesApi.md#batchSchedulePost) | **POST** /batch/schedule |  |
| [**batchSendPost**](BatchMessagesApi.md#batchSendPost) | **POST** /batch/send |  |
| [**batchesScheduleBatchidDelete**](BatchMessagesApi.md#batchesScheduleBatchidDelete) | **DELETE** /batches/schedule/{batchid} |  |


<a id="batchAnyPost"></a>
# **batchAnyPost**
> BatchMessageResponse batchAnyPost(messages)



Sends a collection of unique SMS messages. Batches may contain up to 5000 messages at a time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    BatchMessagesApi apiInstance = new BatchMessagesApi(defaultClient);
    List<Message> messages = Arrays.asList(); // List<Message> | An array of messages
    try {
      BatchMessageResponse result = apiInstance.batchAnyPost(messages);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchMessagesApi#batchAnyPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **messages** | [**List&lt;Message&gt;**](Message.md)| An array of messages | |

### Return type

[**BatchMessageResponse**](BatchMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **402** | Error |  -  |
| **0** | Error |  -  |

<a id="batchBatchidGet"></a>
# **batchBatchidGet**
> List&lt;MessageResponse&gt; batchBatchidGet(batchid)



Retrieve all messages in a batch with the given batch ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    BatchMessagesApi apiInstance = new BatchMessagesApi(defaultClient);
    String batchid = "batchid_example"; // String | The ID of the batch you would like returned
    try {
      List<MessageResponse> result = apiInstance.batchBatchidGet(batchid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchMessagesApi#batchBatchidGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchid** | **String**| The ID of the batch you would like returned | |

### Return type

[**List&lt;MessageResponse&gt;**](MessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Error |  -  |
| **0** | Error |  -  |

<a id="batchSchedulePost"></a>
# **batchSchedulePost**
> ScheduledBatchResponse batchSchedulePost(smsMessage)



Schedules a batch of SMS messages to be sent at the date time you specify

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    BatchMessagesApi apiInstance = new BatchMessagesApi(defaultClient);
    BatchMessage smsMessage = new BatchMessage(); // BatchMessage | Message properties
    try {
      ScheduledBatchResponse result = apiInstance.batchSchedulePost(smsMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchMessagesApi#batchSchedulePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **smsMessage** | [**BatchMessage**](BatchMessage.md)| Message properties | |

### Return type

[**ScheduledBatchResponse**](ScheduledBatchResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **402** | Error |  -  |
| **0** | Error |  -  |

<a id="batchSendPost"></a>
# **batchSendPost**
> BatchMessageResponse batchSendPost(smsMessage)



Send a single SMS message to multiple recipients.  Batches may contain up to 5000 messages at a time.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    BatchMessagesApi apiInstance = new BatchMessagesApi(defaultClient);
    BatchMessage smsMessage = new BatchMessage(); // BatchMessage | Message properties
    try {
      BatchMessageResponse result = apiInstance.batchSendPost(smsMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchMessagesApi#batchSendPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **smsMessage** | [**BatchMessage**](BatchMessage.md)| Message properties | |

### Return type

[**BatchMessageResponse**](BatchMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **402** | Error |  -  |
| **0** | Error |  -  |

<a id="batchesScheduleBatchidDelete"></a>
# **batchesScheduleBatchidDelete**
> CancelledMessageResponse batchesScheduleBatchidDelete(batchid)



Cancels a scheduled SMS message

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BatchMessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    BatchMessagesApi apiInstance = new BatchMessagesApi(defaultClient);
    String batchid = "batchid_example"; // String | The ID of the batch you would like returned
    try {
      CancelledMessageResponse result = apiInstance.batchesScheduleBatchidDelete(batchid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BatchMessagesApi#batchesScheduleBatchidDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **batchid** | **String**| The ID of the batch you would like returned | |

### Return type

[**CancelledMessageResponse**](CancelledMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error |  -  |

