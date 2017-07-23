# UtilsApi

All URIs are relative to *https://api.thesmsworks.co.uk:8080/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**hello**](UtilsApi.md#hello) | **GET** /utils/hello | 


<a name="hello"></a>
# **hello**
> HelloWorldResponse hello(name)



Returns &#39;Hello&#39; to the caller

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.UtilsApi;


UtilsApi apiInstance = new UtilsApi();
String name = "name_example"; // String | The name of the person to whom to say hello
try {
    HelloWorldResponse result = apiInstance.hello(name);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UtilsApi#hello");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| The name of the person to whom to say hello | [optional]

### Return type

[**HelloWorldResponse**](HelloWorldResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json;charset=UTF-8

