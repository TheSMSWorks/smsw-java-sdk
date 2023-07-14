# MessagesApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messageSchedulePost**](MessagesApi.md#messageSchedulePost) | **POST** /message/schedule |  |
| [**messageSendPost**](MessagesApi.md#messageSendPost) | **POST** /message/send |  |
| [**messagesFailedPost**](MessagesApi.md#messagesFailedPost) | **POST** /messages/failed |  |
| [**messagesInboxPost**](MessagesApi.md#messagesInboxPost) | **POST** /messages/inbox |  |
| [**messagesMessageidDelete**](MessagesApi.md#messagesMessageidDelete) | **DELETE** /messages/{messageid} |  |
| [**messagesMessageidGet**](MessagesApi.md#messagesMessageidGet) | **GET** /messages/{messageid} |  |
| [**messagesPost**](MessagesApi.md#messagesPost) | **POST** /messages |  |
| [**messagesScheduleGet**](MessagesApi.md#messagesScheduleGet) | **GET** /messages/schedule |  |
| [**messagesScheduleMessageidDelete**](MessagesApi.md#messagesScheduleMessageidDelete) | **DELETE** /messages/schedule/{messageid} |  |
| [**sendFlashMessage**](MessagesApi.md#sendFlashMessage) | **POST** /message/flash |  |


<a id="messageSchedulePost"></a>
# **messageSchedulePost**
> List&lt;ScheduledMessageResponse&gt; messageSchedulePost(smsMessage)



Schedules an SMS message to be sent at the date-time you specify

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Message smsMessage = new Message(); // Message | Message properties
    try {
      List<ScheduledMessageResponse> result = apiInstance.messageSchedulePost(smsMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messageSchedulePost");
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
| **smsMessage** | [**Message**](Message.md)| Message properties | |

### Return type

[**List&lt;ScheduledMessageResponse&gt;**](ScheduledMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error |  -  |

<a id="messageSendPost"></a>
# **messageSendPost**
> SendMessageResponse messageSendPost(smsMessage)



Send an SMS Message

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Message smsMessage = new Message(); // Message | Message properties
    try {
      SendMessageResponse result = apiInstance.messageSendPost(smsMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messageSendPost");
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
| **smsMessage** | [**Message**](Message.md)| Message properties | |

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

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

<a id="messagesFailedPost"></a>
# **messagesFailedPost**
> List&lt;MessageResponse&gt; messagesFailedPost(query)



Get failed messages matching your search criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Query query = new Query(); // Query | 
    try {
      List<MessageResponse> result = apiInstance.messagesFailedPost(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesFailedPost");
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
| **query** | [**Query**](Query.md)|  | |

### Return type

[**List&lt;MessageResponse&gt;**](MessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error |  -  |

<a id="messagesInboxPost"></a>
# **messagesInboxPost**
> List&lt;MessageResponse&gt; messagesInboxPost(query)



Get unread uncoming messages matching your search criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Query query = new Query(); // Query | 
    try {
      List<MessageResponse> result = apiInstance.messagesInboxPost(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesInboxPost");
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
| **query** | [**Query**](Query.md)|  | |

### Return type

[**List&lt;MessageResponse&gt;**](MessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error |  -  |

<a id="messagesMessageidDelete"></a>
# **messagesMessageidDelete**
> DeletedMessageResponse messagesMessageidDelete(messageid)



Delete the message with the mathcing messageid

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String messageid = "messageid_example"; // String | The ID of the message you would like returned
    try {
      DeletedMessageResponse result = apiInstance.messagesMessageidDelete(messageid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesMessageidDelete");
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
| **messageid** | **String**| The ID of the message you would like returned | |

### Return type

[**DeletedMessageResponse**](DeletedMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Error |  -  |
| **0** | Error |  -  |

<a id="messagesMessageidGet"></a>
# **messagesMessageidGet**
> MessageResponse messagesMessageidGet(messageid)



Retrieve a logged message by the message ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String messageid = "messageid_example"; // String | The ID of the message you would like returned
    try {
      MessageResponse result = apiInstance.messagesMessageidGet(messageid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesMessageidGet");
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
| **messageid** | **String**| The ID of the message you would like returned | |

### Return type

[**MessageResponse**](MessageResponse.md)

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

<a id="messagesPost"></a>
# **messagesPost**
> List&lt;MessageResponse&gt; messagesPost(query)



Retrieve up to 1000 messages matching your search criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Query query = new Query(); // Query | 
    try {
      List<MessageResponse> result = apiInstance.messagesPost(query);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesPost");
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
| **query** | [**Query**](Query.md)|  | |

### Return type

[**List&lt;MessageResponse&gt;**](MessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **0** | Error |  -  |

<a id="messagesScheduleGet"></a>
# **messagesScheduleGet**
> ScheduledMessagesResponse messagesScheduleGet()



Returns a list of messages scheduled from your account, comprising any messages scheduled in the last 3 months and any scheduled to send in the future

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    try {
      ScheduledMessagesResponse result = apiInstance.messagesScheduleGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesScheduleGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ScheduledMessagesResponse**](ScheduledMessagesResponse.md)

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

<a id="messagesScheduleMessageidDelete"></a>
# **messagesScheduleMessageidDelete**
> CancelledMessageResponse messagesScheduleMessageidDelete(messageid)



Cancels a scheduled SMS message

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    String messageid = "messageid_example"; // String | The ID of the message you would like returned
    try {
      CancelledMessageResponse result = apiInstance.messagesScheduleMessageidDelete(messageid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#messagesScheduleMessageidDelete");
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
| **messageid** | **String**| The ID of the message you would like returned | |

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

<a id="sendFlashMessage"></a>
# **sendFlashMessage**
> SendMessageResponse sendFlashMessage(smsMessage)



Sends an SMS flash message, which appears on the recipients lock screen

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessagesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    MessagesApi apiInstance = new MessagesApi(defaultClient);
    Message smsMessage = new Message(); // Message | Message properties
    try {
      SendMessageResponse result = apiInstance.sendFlashMessage(smsMessage);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MessagesApi#sendFlashMessage");
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
| **smsMessage** | [**Message**](Message.md)| Message properties | |

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

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

