# MessagesApi

All URIs are relative to *https://api.thesmsworks.co.uk:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelScheduledJob**](MessagesApi.md#cancelScheduledJob) | **DELETE** /messages/schedule/{messageid} | 
[**getMessageById**](MessagesApi.md#getMessageById) | **GET** /messages/{messageid} | 
[**getMessages**](MessagesApi.md#getMessages) | **POST** /messages | 
[**scheduleMessage**](MessagesApi.md#scheduleMessage) | **POST** /message/schedule | 
[**sendMessage**](MessagesApi.md#sendMessage) | **POST** /message/send | 


<a name="cancelScheduledJob"></a>
# **cancelScheduledJob**
> CancelledMessageResponse cancelScheduledJob(messageid)



Cancels a scheduled SMS message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
String messageid = "messageid_example"; // String | The ID of the message you would like returned
try {
    CancelledMessageResponse result = apiInstance.cancelScheduledJob(messageid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#cancelScheduledJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageid** | **String**| The ID of the message you would like returned |

### Return type

[**CancelledMessageResponse**](CancelledMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getMessageById"></a>
# **getMessageById**
> MessageResponse getMessageById(messageid)



Retrieve a logged message by the message ID

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
String messageid = "messageid_example"; // String | The ID of the message you would like returned
try {
    MessageResponse result = apiInstance.getMessageById(messageid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getMessageById");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **messageid** | **String**| The ID of the message you would like returned |

### Return type

[**MessageResponse**](MessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="getMessages"></a>
# **getMessages**
> MessagesResponse getMessages(query)



Get messages matching your search criteria

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
Query query = new Query(); // Query | 
try {
    MessagesResponse result = apiInstance.getMessages(query);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#getMessages");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | [**Query**](Query.md)|  |

### Return type

[**MessagesResponse**](MessagesResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="scheduleMessage"></a>
# **scheduleMessage**
> ScheduledMessageResponse scheduleMessage(smsMessage)



Schedules an SMS message to be sent at the date-time you specify

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
Message smsMessage = new Message(); // Message | Message properties
try {
    ScheduledMessageResponse result = apiInstance.scheduleMessage(smsMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#scheduleMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessage** | [**Message**](Message.md)| Message properties |

### Return type

[**ScheduledMessageResponse**](ScheduledMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="sendMessage"></a>
# **sendMessage**
> SendMessageResponse sendMessage(smsMessage)



Sends an SMS message

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MessagesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: JWT
ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
JWT.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//JWT.setApiKeyPrefix("Token");

MessagesApi apiInstance = new MessagesApi();
Message smsMessage = new Message(); // Message | Message properties
try {
    SendMessageResponse result = apiInstance.sendMessage(smsMessage);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MessagesApi#sendMessage");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **smsMessage** | [**Message**](Message.md)| Message properties |

### Return type

[**SendMessageResponse**](SendMessageResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

