# \TerminologyAPI

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddSynonym**](TerminologyAPI.md#AddSynonym) | **Post** /terminology/concept/{terminology}/{code}/atom | Add synonym
[**AutocompleteConcepts1**](TerminologyAPI.md#AutocompleteConcepts1) | **Get** /terminology/concept/{terminology}/autocomplete | Autocomplete
[**FindConcepts**](TerminologyAPI.md#FindConcepts) | **Get** /terminology/concept/{terminology} | Find concepts
[**FindConcepts2**](TerminologyAPI.md#FindConcepts2) | **Get** /terminology/concept | Find concepts (across all terminologies)
[**FindMappings1**](TerminologyAPI.md#FindMappings1) | **Get** /terminology/mapset/{terminology}/{code}/mapping | Find mappings
[**FindSubsetMemberships1**](TerminologyAPI.md#FindSubsetMemberships1) | **Get** /terminology/concept/{terminology}/{code}/subsets | Get concept subset memberships
[**FindTreePositionChildren1**](TerminologyAPI.md#FindTreePositionChildren1) | **Get** /terminology/concept/{terminology}/{code}/trees/children | Find tree position children
[**FindTreePositions1**](TerminologyAPI.md#FindTreePositions1) | **Get** /terminology/concept/{terminology}/{code}/trees | Find tree positions
[**GetConcept1**](TerminologyAPI.md#GetConcept1) | **Get** /terminology/concept/{terminology}/{code} | Get concept
[**GetConceptMappings1**](TerminologyAPI.md#GetConceptMappings1) | **Get** /terminology/concept/{terminology}/{code}/mapping | Get concept mappings
[**GetConfigProperties1**](TerminologyAPI.md#GetConfigProperties1) | **Get** /terminology/properties | Get properties
[**GetMapset1**](TerminologyAPI.md#GetMapset1) | **Get** /terminology/mapset/{terminology}/{code} | Get mapset
[**GetMapsets1**](TerminologyAPI.md#GetMapsets1) | **Get** /terminology/mapset/{terminology} | Get mapsets
[**GetRelationships1**](TerminologyAPI.md#GetRelationships1) | **Get** /terminology/concept/{terminology}/{code}/relationships | Get concept relationships
[**GetSubset1**](TerminologyAPI.md#GetSubset1) | **Get** /terminology/subset/{terminology}/{code} | Get subset
[**GetSubsets1**](TerminologyAPI.md#GetSubsets1) | **Get** /terminology/subset/{terminology} | Get subsets
[**GetSubtree1**](TerminologyAPI.md#GetSubtree1) | **Get** /terminology/concept/{terminology}/{code}/subtree | Get subtree
[**GetTerminologies1**](TerminologyAPI.md#GetTerminologies1) | **Get** /terminology | Get terminologies
[**GetTerminology1**](TerminologyAPI.md#GetTerminology1) | **Get** /terminology/{terminology} | Get terminology
[**GetTerminologyMetadata1**](TerminologyAPI.md#GetTerminologyMetadata1) | **Get** /terminology/metadata/{terminology} | Get terminology metadata
[**ResolveExpression1**](TerminologyAPI.md#ResolveExpression1) | **Get** /terminology/expr/{terminology} | Resolve expression



## AddSynonym

> Atom AddSynonym(ctx, terminology, code).Name(name).TermType(termType).RequestBody(requestBody).Execute()

Add synonym



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US
    code := "code_example" // string | code, e.g. 80891009
    name := "name_example" // string | synonym name, e.g. \"test name\" (optional)
    termType := "termType_example" // string | term type, e.g. INDEX_SY (optional)
    requestBody := map[string]string{"key": "Inner_example"} // map[string]string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.AddSynonym(context.Background(), terminology, code).Name(name).TermType(termType).RequestBody(requestBody).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.AddSynonym``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AddSynonym`: Atom
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.AddSynonym`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | 
**code** | **string** | code, e.g. 80891009 | 

### Other Parameters

Other parameters are passed through a pointer to a apiAddSynonymRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **name** | **string** | synonym name, e.g. \&quot;test name\&quot; | 
 **termType** | **string** | term type, e.g. INDEX_SY | 
 **requestBody** | **map[string]string** |  | 

### Return type

[**Atom**](Atom.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## AutocompleteConcepts1

> ResultListConcept AutocompleteConcepts1(ctx, terminology).Query(query).Expression(expression).Clause(clause).Limit(limit).Execute()

Autocomplete



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    query := "query_example" // string |  (optional)
    expression := "expression_example" // string |  (optional)
    clause := "clause_example" // string |  (optional)
    limit := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.AutocompleteConcepts1(context.Background(), terminology).Query(query).Expression(expression).Clause(clause).Limit(limit).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.AutocompleteConcepts1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `AutocompleteConcepts1`: ResultListConcept
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.AutocompleteConcepts1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiAutocompleteConcepts1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **query** | **string** |  | 
 **expression** | **string** |  | 
 **clause** | **string** |  | 
 **limit** | **int32** |  | 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindConcepts

> ResultListConcept FindConcepts(ctx, terminology).Query(query).Expression(expression).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Handler(handler).Resolver(resolver).Active(active).Leaf(leaf).Execute()

Find concepts



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    query := "query_example" // string | query, e.g. \"heart attack\" (optional)
    expression := "expression_example" // string | ECL Expression, e.g. <<80891009 (optional)
    offset := int32(56) // int32 | offset, e.g. 0 (optional)
    limit := int32(56) // int32 | limit, e.g. 10 (optional)
    ascending := true // bool | ascending, e.g. true (optional)
    sort := "sort_example" // string | sort field, e.g. code (optional)
    handler := "handler_example" // string | search handler, e.g. STANDARD, EXACT, NGRAM (optional)
    resolver := "resolver_example" // string | graph resolver, e.g. DEFAULT, MIN (optional)
    active := true // bool | active only, e.g. true (optional)
    leaf := true // bool | leaf nodes only, e.g. false (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindConcepts(context.Background(), terminology).Query(query).Expression(expression).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Handler(handler).Resolver(resolver).Active(active).Leaf(leaf).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindConcepts``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindConcepts`: ResultListConcept
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindConcepts`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiFindConceptsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **query** | **string** | query, e.g. \&quot;heart attack\&quot; | 
 **expression** | **string** | ECL Expression, e.g. &lt;&lt;80891009 | 
 **offset** | **int32** | offset, e.g. 0 | 
 **limit** | **int32** | limit, e.g. 10 | 
 **ascending** | **bool** | ascending, e.g. true | 
 **sort** | **string** | sort field, e.g. code | 
 **handler** | **string** | search handler, e.g. STANDARD, EXACT, NGRAM | 
 **resolver** | **string** | graph resolver, e.g. DEFAULT, MIN | 
 **active** | **bool** | active only, e.g. true | 
 **leaf** | **bool** | leaf nodes only, e.g. false | 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindConcepts2

> ResultListConcept FindConcepts2(ctx).Query(query).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Handler(handler).Resolver(resolver).Active(active).Leaf(leaf).Execute()

Find concepts (across all terminologies)



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
    query := "query_example" // string | query, e.g. \"heart attack\" (optional)
    offset := int32(56) // int32 | offset, e.g. 0 (optional)
    limit := int32(56) // int32 | limit, e.g. 10 (optional)
    ascending := true // bool | ascending, e.g. true (optional)
    sort := "sort_example" // string | sort field, e.g. code (optional)
    handler := "handler_example" // string | search handler, e.g. STANDARD, EXACT, NGRAM (optional)
    resolver := "resolver_example" // string | graph resolver, e.g. DEFAULT, MIN (optional)
    active := true // bool | active only, e.g. true (optional)
    leaf := true // bool | leaf nodes only, e.g. false (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindConcepts2(context.Background()).Query(query).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Handler(handler).Resolver(resolver).Active(active).Leaf(leaf).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindConcepts2``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindConcepts2`: ResultListConcept
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindConcepts2`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiFindConcepts2Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **string** | query, e.g. \&quot;heart attack\&quot; | 
 **offset** | **int32** | offset, e.g. 0 | 
 **limit** | **int32** | limit, e.g. 10 | 
 **ascending** | **bool** | ascending, e.g. true | 
 **sort** | **string** | sort field, e.g. code | 
 **handler** | **string** | search handler, e.g. STANDARD, EXACT, NGRAM | 
 **resolver** | **string** | graph resolver, e.g. DEFAULT, MIN | 
 **active** | **bool** | active only, e.g. true | 
 **leaf** | **bool** | leaf nodes only, e.g. false | 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindMappings1

> ResultListMapping FindMappings1(ctx, terminology, code).Query(query).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()

Find mappings



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 6011000124106
    query := "query_example" // string |  (optional)
    offset := int32(56) // int32 |  (optional)
    limit := int32(56) // int32 |  (optional)
    ascending := true // bool |  (optional)
    sort := "sort_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindMappings1(context.Background(), terminology, code).Query(query).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindMappings1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindMappings1`: ResultListMapping
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindMappings1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 6011000124106 | 

### Other Parameters

Other parameters are passed through a pointer to a apiFindMappings1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **query** | **string** |  | 
 **offset** | **int32** |  | 
 **limit** | **int32** |  | 
 **ascending** | **bool** |  | 
 **sort** | **string** |  | 

### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindSubsetMemberships1

> ResultListSubset FindSubsetMemberships1(ctx, terminology, code).Execute()

Get concept subset memberships



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 723264001

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindSubsetMemberships1(context.Background(), terminology, code).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindSubsetMemberships1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindSubsetMemberships1`: ResultListSubset
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindSubsetMemberships1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 723264001 | 

### Other Parameters

Other parameters are passed through a pointer to a apiFindSubsetMemberships1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindTreePositionChildren1

> ResultListConceptTreePosition FindTreePositionChildren1(ctx, terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()

Find tree position children



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 71388002
    offset := int32(56) // int32 |  (optional)
    limit := int32(56) // int32 |  (optional)
    ascending := true // bool |  (optional)
    sort := "sort_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindTreePositionChildren1(context.Background(), terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindTreePositionChildren1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindTreePositionChildren1`: ResultListConceptTreePosition
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindTreePositionChildren1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 71388002 | 

### Other Parameters

Other parameters are passed through a pointer to a apiFindTreePositionChildren1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **offset** | **int32** |  | 
 **limit** | **int32** |  | 
 **ascending** | **bool** |  | 
 **sort** | **string** |  | 

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## FindTreePositions1

> ResultListConceptTreePosition FindTreePositions1(ctx, terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()

Find tree positions



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 71388002
    offset := int32(56) // int32 |  (optional)
    limit := int32(56) // int32 |  (optional)
    ascending := true // bool |  (optional)
    sort := "sort_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.FindTreePositions1(context.Background(), terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.FindTreePositions1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `FindTreePositions1`: ResultListConceptTreePosition
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.FindTreePositions1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 71388002 | 

### Other Parameters

Other parameters are passed through a pointer to a apiFindTreePositions1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **offset** | **int32** |  | 
 **limit** | **int32** |  | 
 **ascending** | **bool** |  | 
 **sort** | **string** |  | 

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetConcept1

> Concept GetConcept1(ctx, terminology, code).Resolver(resolver).Execute()

Get concept



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 71388002
    resolver := "resolver_example" // string | graph resolver, e.g. DEFAULT, MIN (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetConcept1(context.Background(), terminology, code).Resolver(resolver).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetConcept1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetConcept1`: Concept
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetConcept1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 71388002 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetConcept1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **resolver** | **string** | graph resolver, e.g. DEFAULT, MIN | 

### Return type

[**Concept**](Concept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetConceptMappings1

> ResultListMapping GetConceptMappings1(ctx, terminology, code).Execute()

Get concept mappings



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 283231003

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetConceptMappings1(context.Background(), terminology, code).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetConceptMappings1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetConceptMappings1`: ResultListMapping
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetConceptMappings1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 283231003 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetConceptMappings1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetConfigProperties1

> GetConfigProperties1(ctx).Execute()

Get properties



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    r, err := apiClient.TerminologyAPI.GetConfigProperties1(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetConfigProperties1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetConfigProperties1Request struct via the builder pattern


### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMapset1

> Mapset GetMapset1(ctx, terminology, code).Execute()

Get mapset



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 6011000124106

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetMapset1(context.Background(), terminology, code).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetMapset1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMapset1`: Mapset
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetMapset1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 6011000124106 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetMapset1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Mapset**](Mapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetMapsets1

> ResultListMapset GetMapsets1(ctx, terminology).Execute()

Get mapsets



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetMapsets1(context.Background(), terminology).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetMapsets1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetMapsets1`: ResultListMapset
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetMapsets1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiGetMapsets1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ResultListMapset**](ResultListMapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetRelationships1

> ResultListConceptRelationship GetRelationships1(ctx, terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Inverse(inverse).Active(active).Filter(filter).Execute()

Get concept relationships



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 71388002
    offset := int32(56) // int32 |  (optional)
    limit := int32(56) // int32 |  (optional) (default to 100)
    ascending := true // bool |  (optional)
    sort := "sort_example" // string |  (optional)
    inverse := true // bool |  (optional)
    active := true // bool |  (optional)
    filter := "filter_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetRelationships1(context.Background(), terminology, code).Offset(offset).Limit(limit).Ascending(ascending).Sort(sort).Inverse(inverse).Active(active).Filter(filter).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetRelationships1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetRelationships1`: ResultListConceptRelationship
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetRelationships1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 71388002 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetRelationships1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **offset** | **int32** |  | 
 **limit** | **int32** |  | [default to 100]
 **ascending** | **bool** |  | 
 **sort** | **string** |  | 
 **inverse** | **bool** |  | 
 **active** | **bool** |  | 
 **filter** | **string** |  | 

### Return type

[**ResultListConceptRelationship**](ResultListConceptRelationship.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSubset1

> Subset GetSubset1(ctx, terminology, code).Execute()

Get subset



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 723264001

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetSubset1(context.Background(), terminology, code).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetSubset1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSubset1`: Subset
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetSubset1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 723264001 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSubset1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



### Return type

[**Subset**](Subset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSubsets1

> ResultListSubset GetSubsets1(ctx, terminology).Execute()

Get subsets



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetSubsets1(context.Background(), terminology).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetSubsets1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSubsets1`: ResultListSubset
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetSubsets1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiGetSubsets1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetSubtree1

> ConceptTreePosition GetSubtree1(ctx, terminology, code).MaxLevel(maxLevel).Execute()

Get subtree



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    code := "code_example" // string | concept code, e.g. 71388002
    maxLevel := int32(56) // int32 |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetSubtree1(context.Background(), terminology, code).MaxLevel(maxLevel).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetSubtree1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetSubtree1`: ConceptTreePosition
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetSubtree1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]
**code** | **string** | concept code, e.g. 71388002 | 

### Other Parameters

Other parameters are passed through a pointer to a apiGetSubtree1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **maxLevel** | **int32** |  | 

### Return type

[**ConceptTreePosition**](ConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTerminologies1

> []Terminology GetTerminologies1(ctx).Execute()

Get terminologies



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

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetTerminologies1(context.Background()).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetTerminologies1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTerminologies1`: []Terminology
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetTerminologies1`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiGetTerminologies1Request struct via the builder pattern


### Return type

[**[]Terminology**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTerminology1

> Terminology GetTerminology1(ctx, terminology).Execute()

Get terminology



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.GetTerminology1(context.Background(), terminology).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetTerminology1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `GetTerminology1`: Terminology
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.GetTerminology1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiGetTerminology1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

[**Terminology**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## GetTerminologyMetadata1

> GetTerminologyMetadata1(ctx, terminology).Execute()

Get terminology metadata



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    r, err := apiClient.TerminologyAPI.GetTerminologyMetadata1(context.Background(), terminology).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.GetTerminologyMetadata1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiGetTerminologyMetadata1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


### Return type

 (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## ResolveExpression1

> []string ResolveExpression1(ctx, terminology).Expression(expression).Execute()

Resolve expression



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
    terminology := "terminology_example" // string | terminology, e.g. SNOMEDCT_US (default to "SNOMEDCT_US")
    expression := "expression_example" // string |  (optional)

    configuration := openapiclient.NewConfiguration()
    apiClient := openapiclient.NewAPIClient(configuration)
    resp, r, err := apiClient.TerminologyAPI.ResolveExpression1(context.Background(), terminology).Expression(expression).Execute()
    if err != nil {
        fmt.Fprintf(os.Stderr, "Error when calling `TerminologyAPI.ResolveExpression1``: %v\n", err)
        fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
    }
    // response from `ResolveExpression1`: []string
    fmt.Fprintf(os.Stdout, "Response from `TerminologyAPI.ResolveExpression1`: %v\n", resp)
}
```

### Path Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
**terminology** | **string** | terminology, e.g. SNOMEDCT_US | [default to &quot;SNOMEDCT_US&quot;]

### Other Parameters

Other parameters are passed through a pointer to a apiResolveExpression1Request struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------

 **expression** | **string** |  | 

### Return type

**[]string**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

