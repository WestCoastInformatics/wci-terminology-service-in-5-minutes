# openapi_client.LoginApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**auth**](LoginApi.md#auth) | **POST** /auth/token | Login


# **auth**
> AuthResponse auth(auth_request)

Login

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.auth_request import AuthRequest
from openapi_client.models.auth_response import AuthResponse
from openapi_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://termserver.westcoastinformatics.com
# See configuration.py for a list of all supported configuration parameters.
configuration = openapi_client.Configuration(
    host = "https://termserver.westcoastinformatics.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# Configure Bearer authorization (Bearer [token]): bearerAuth
configuration = openapi_client.Configuration(
    access_token = os.environ["BEARER_TOKEN"]
)

# Enter a context with an instance of the API client
with openapi_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = openapi_client.LoginApi(api_client)
    auth_request = openapi_client.AuthRequest() # AuthRequest | Authorization information

    try:
        # Login
        api_response = api_instance.auth(auth_request)
        print("The response of LoginApi->auth:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling LoginApi->auth: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auth_request** | [**AuthRequest**](AuthRequest.md)| Authorization information | 

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
**200** | Acquire access token for subsequent calls |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

