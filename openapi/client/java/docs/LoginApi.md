# LoginApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**auth**](LoginApi.md#auth) | **POST** /auth/token | Login |


<a id="auth"></a>
# **auth**
> AuthResponse auth(authRequest)

Login

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoginApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    LoginApi apiInstance = new LoginApi(defaultClient);
    AuthRequest authRequest = new AuthRequest(); // AuthRequest | Authorization information
    try {
      AuthResponse result = apiInstance.auth(authRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoginApi#auth");
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
| **authRequest** | [**AuthRequest**](AuthRequest.md)| Authorization information | |

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Acquire access token for subsequent calls |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

