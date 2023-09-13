# WestCoastInformaticsTerminologyApi.LoginApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth**](LoginApi.md#auth) | **POST** /auth/token | Login



## auth

> AuthResponse auth(authRequest)

Login

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.LoginApi();
let authRequest = new WestCoastInformaticsTerminologyApi.AuthRequest(); // AuthRequest | Authorization information
apiInstance.auth(authRequest, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRequest** | [**AuthRequest**](AuthRequest.md)| Authorization information | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

