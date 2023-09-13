# \LoginAPI

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Auth**](LoginAPI.md#Auth) | **Post** /auth/token | Login



## Auth

> AuthResponse Auth(ctx).AuthRequest(authRequest).Execute()

Login

### Example

```go
package main

import (
    "context"
    "fmt"
    "os"
    openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
)

func main() {
    authRequest := *openapiclient.NewAuthRequest("GrantType_example") // AuthRequest | Authorization information

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.LoginAPI.Auth(context.Background()).AuthRequest(authRequest).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `LoginAPI.Auth``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `Auth`: AuthResponse
    fmt.Fprintf(os.Stdout, "Response from `LoginAPI.Auth`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiAuthRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authRequest** | [**AuthRequest**](AuthRequest.md) | Authorization information | 

### Return type

[**AuthResponse**](AuthResponse.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

