# OneTimePasswordApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**otpMessageidGet**](OneTimePasswordApi.md#otpMessageidGet) | **GET** /otp/{messageid} |  |
| [**otpSendPost**](OneTimePasswordApi.md#otpSendPost) | **POST** /otp/send |  |
| [**otpVerifyPost**](OneTimePasswordApi.md#otpVerifyPost) | **POST** /otp/verify |  |


<a id="otpMessageidGet"></a>
# **otpMessageidGet**
> OTPVerifyResponse otpMessageidGet(messageid)



Retrieve an OTP by it&#39;s message ID

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OneTimePasswordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    OneTimePasswordApi apiInstance = new OneTimePasswordApi(defaultClient);
    String messageid = "messageid_example"; // String | The ID of the OTP you would like returned
    try {
      OTPVerifyResponse result = apiInstance.otpMessageidGet(messageid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OneTimePasswordApi#otpMessageidGet");
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
| **messageid** | **String**| The ID of the OTP you would like returned | |

### Return type

[**OTPVerifyResponse**](OTPVerifyResponse.md)

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

<a id="otpSendPost"></a>
# **otpSendPost**
> OTPResponse otpSendPost(otp)



Generates and sends a One-Time Password

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OneTimePasswordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    OneTimePasswordApi apiInstance = new OneTimePasswordApi(defaultClient);
    OTP otp = new OTP(); // OTP | OTP properties
    try {
      OTPResponse result = apiInstance.otpSendPost(otp);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OneTimePasswordApi#otpSendPost");
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
| **otp** | [**OTP**](OTP.md)| OTP properties | |

### Return type

[**OTPResponse**](OTPResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success |  -  |
| **0** | Error |  -  |

<a id="otpVerifyPost"></a>
# **otpVerifyPost**
> OTPVerifyResponse otpVerifyPost(passcode)



Generates and sends a One-Time Password

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OneTimePasswordApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    OneTimePasswordApi apiInstance = new OneTimePasswordApi(defaultClient);
    OTPVerify passcode = new OTPVerify(); // OTPVerify | One-Time Password
    try {
      OTPVerifyResponse result = apiInstance.otpVerifyPost(passcode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OneTimePasswordApi#otpVerifyPost");
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
| **passcode** | [**OTPVerify**](OTPVerify.md)| One-Time Password | |

### Return type

[**OTPVerifyResponse**](OTPVerifyResponse.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Error |  -  |
| **0** | Error |  -  |

