# AuthApi

All URIs are relative to *https://api.thesmsworks.co.uk:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keySecret**](AuthApi.md#keySecret) | **GET** /auth/getApiKey | 
[**login**](AuthApi.md#login) | **POST** /auth/token | 


<a name="keySecret"></a>
# **keySecret**
> ApiKeyResponse keySecret(customerid)



Generates an API Key/Secret pair

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
String customerid = "customerid_example"; // String | The Customer ID
try {
    ApiKeyResponse result = apiInstance.keySecret(customerid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#keySecret");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerid** | **String**| The Customer ID |

### Return type

[**ApiKeyResponse**](ApiKeyResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

<a name="login"></a>
# **login**
> TokenResponse login(credentials)



Generates a Json Web Token

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.AuthApi;


AuthApi apiInstance = new AuthApi();
Login credentials = new Login(); // Login | API Key & Secret
try {
    TokenResponse result = apiInstance.login(credentials);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthApi#login");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **credentials** | [**Login**](Login.md)| API Key &amp; Secret |

### Return type

[**TokenResponse**](TokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

