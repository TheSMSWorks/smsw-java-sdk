# UtilsApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**utilsErrorsErrorcodeGet**](UtilsApi.md#utilsErrorsErrorcodeGet) | **GET** /utils/errors/{errorcode} |  |
| [**utilsTestGet**](UtilsApi.md#utilsTestGet) | **GET** /utils/test |  |


<a id="utilsErrorsErrorcodeGet"></a>
# **utilsErrorsErrorcodeGet**
> ExtendedErrorModel utilsErrorsErrorcodeGet(errorcode)



Returns a sample error object for the given error code. Useful for designing code to react to errors when they occur for real.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    String errorcode = "errorcode_example"; // String | The code of the error you would like returned
    try {
      ExtendedErrorModel result = apiInstance.utilsErrorsErrorcodeGet(errorcode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#utilsErrorsErrorcodeGet");
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
| **errorcode** | **String**| The code of the error you would like returned | |

### Return type

[**ExtendedErrorModel**](ExtendedErrorModel.md)

### Authorization

[JWT](../README.md#JWT)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=UTF-8

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Error |  -  |

<a id="utilsTestGet"></a>
# **utilsTestGet**
> TestResponse utilsTestGet()



Returns the customer ID to the caller

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UtilsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    UtilsApi apiInstance = new UtilsApi(defaultClient);
    try {
      TestResponse result = apiInstance.utilsTestGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UtilsApi#utilsTestGet");
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

[**TestResponse**](TestResponse.md)

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

