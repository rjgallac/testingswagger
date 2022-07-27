# HelloControllerApi

All URIs are relative to *https://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsingGET**](HelloControllerApi.md#getUsingGET) | **GET** /hello | get


<a name="getUsingGET"></a>
# **getUsingGET**
> getUsingGET()

get

### Example
```java
// Import classes:
//import io.swagger.client.ApiException;
//import io.swagger.client.api.HelloControllerApi;


HelloControllerApi apiInstance = new HelloControllerApi();
try {
    apiInstance.getUsingGET();
} catch (ApiException e) {
    System.err.println("Exception when calling HelloControllerApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

