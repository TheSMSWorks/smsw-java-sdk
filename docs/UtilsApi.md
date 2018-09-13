# UtilsApi

All URIs are relative to *https://api.thesmsworks.co.uk/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**test**](UtilsApi.md#test) | **GET** /utils/test | 


<a name="test"></a>
# **test**
> TestResponse test()



Returns the customer ID to the caller

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilsApi;


UtilsApi apiInstance = new UtilsApi();
try {
    TestResponse result = apiInstance.test();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#test");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**TestResponse**](TestResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

