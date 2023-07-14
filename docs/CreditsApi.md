# CreditsApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**creditsBalanceGet**](CreditsApi.md#creditsBalanceGet) | **GET** /credits/balance |  |


<a id="creditsBalanceGet"></a>
# **creditsBalanceGet**
> CreditsResponse creditsBalanceGet()



Returns the number of credits currently available on the account

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreditsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.thesmsworks.co.uk/v1");
    
    // Configure API key authorization: JWT
    ApiKeyAuth JWT = (ApiKeyAuth) defaultClient.getAuthentication("JWT");
    JWT.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //JWT.setApiKeyPrefix("Token");

    CreditsApi apiInstance = new CreditsApi(defaultClient);
    try {
      CreditsResponse result = apiInstance.creditsBalanceGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CreditsApi#creditsBalanceGet");
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

[**CreditsResponse**](CreditsResponse.md)

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

