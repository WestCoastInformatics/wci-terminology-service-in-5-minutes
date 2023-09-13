# WestCoastInformaticsTerminologyApi.TerminologyApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addSynonym**](TerminologyApi.md#addSynonym) | **POST** /terminology/concept/{terminology}/{code}/atom | Add synonym
[**autocompleteConcepts1**](TerminologyApi.md#autocompleteConcepts1) | **GET** /terminology/concept/{terminology}/autocomplete | Autocomplete
[**findConcepts**](TerminologyApi.md#findConcepts) | **GET** /terminology/concept/{terminology} | Find concepts
[**findConcepts2**](TerminologyApi.md#findConcepts2) | **GET** /terminology/concept | Find concepts (across all terminologies)
[**findMappings1**](TerminologyApi.md#findMappings1) | **GET** /terminology/mapset/{terminology}/{code}/mapping | Find mappings
[**findSubsetMemberships1**](TerminologyApi.md#findSubsetMemberships1) | **GET** /terminology/concept/{terminology}/{code}/subsets | Get concept subset memberships
[**findTreePositionChildren1**](TerminologyApi.md#findTreePositionChildren1) | **GET** /terminology/concept/{terminology}/{code}/trees/children | Find tree position children
[**findTreePositions1**](TerminologyApi.md#findTreePositions1) | **GET** /terminology/concept/{terminology}/{code}/trees | Find tree positions
[**getConcept1**](TerminologyApi.md#getConcept1) | **GET** /terminology/concept/{terminology}/{code} | Get concept
[**getConceptMappings1**](TerminologyApi.md#getConceptMappings1) | **GET** /terminology/concept/{terminology}/{code}/mapping | Get concept mappings
[**getConfigProperties1**](TerminologyApi.md#getConfigProperties1) | **GET** /terminology/properties | Get properties
[**getMapset1**](TerminologyApi.md#getMapset1) | **GET** /terminology/mapset/{terminology}/{code} | Get mapset
[**getMapsets1**](TerminologyApi.md#getMapsets1) | **GET** /terminology/mapset/{terminology} | Get mapsets
[**getRelationships1**](TerminologyApi.md#getRelationships1) | **GET** /terminology/concept/{terminology}/{code}/relationships | Get concept relationships
[**getSubset1**](TerminologyApi.md#getSubset1) | **GET** /terminology/subset/{terminology}/{code} | Get subset
[**getSubsets1**](TerminologyApi.md#getSubsets1) | **GET** /terminology/subset/{terminology} | Get subsets
[**getSubtree1**](TerminologyApi.md#getSubtree1) | **GET** /terminology/concept/{terminology}/{code}/subtree | Get subtree
[**getTerminologies1**](TerminologyApi.md#getTerminologies1) | **GET** /terminology | Get terminologies
[**getTerminology1**](TerminologyApi.md#getTerminology1) | **GET** /terminology/{terminology} | Get terminology
[**getTerminologyMetadata1**](TerminologyApi.md#getTerminologyMetadata1) | **GET** /terminology/metadata/{terminology} | Get terminology metadata
[**resolveExpression1**](TerminologyApi.md#resolveExpression1) | **GET** /terminology/expr/{terminology} | Resolve expression



## addSynonym

> Atom addSynonym(terminology, code, opts)

Add synonym

Add synonym with specified parameters

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "terminology_example"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | code, e.g. 80891009
let opts = {
  'name': "name_example", // String | synonym name, e.g. \"test name\"
  'termType': "termType_example", // String | term type, e.g. INDEX_SY
  'requestBody': {key: "null"} // {String: String} | 
};
apiInstance.addSynonym(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | 
 **code** | **String**| code, e.g. 80891009 | 
 **name** | **String**| synonym name, e.g. \&quot;test name\&quot; | [optional] 
 **termType** | **String**| term type, e.g. INDEX_SY | [optional] 
 **requestBody** | [**{String: String}**](String.md)|  | [optional] 

### Return type

[**Atom**](Atom.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


## autocompleteConcepts1

> ResultListConcept autocompleteConcepts1(terminology, opts)

Autocomplete

Find concepts for a type-ahead search field

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let opts = {
  'query': "query_example", // String | 
  'expression': "expression_example", // String | 
  'clause': "clause_example", // String | 
  'limit': 56 // Number | 
};
apiInstance.autocompleteConcepts1(terminology, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **query** | **String**|  | [optional] 
 **expression** | **String**|  | [optional] 
 **clause** | **String**|  | [optional] 
 **limit** | **Number**|  | [optional] 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findConcepts

> ResultListConcept findConcepts(terminology, opts)

Find concepts

Find concepts matching the specified search criteria

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let opts = {
  'query': "query_example", // String | query, e.g. \"heart attack\"
  'expression': "expression_example", // String | ECL Expression, e.g. <<80891009
  'offset': 56, // Number | offset, e.g. 0
  'limit': 56, // Number | limit, e.g. 10
  'ascending': true, // Boolean | ascending, e.g. true
  'sort': "sort_example", // String | sort field, e.g. code
  'handler': "handler_example", // String | search handler, e.g. STANDARD, EXACT, NGRAM
  'resolver': "resolver_example", // String | graph resolver, e.g. DEFAULT, MIN
  'active': true, // Boolean | active only, e.g. true
  'leaf': true // Boolean | leaf nodes only, e.g. false
};
apiInstance.findConcepts(terminology, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **query** | **String**| query, e.g. \&quot;heart attack\&quot; | [optional] 
 **expression** | **String**| ECL Expression, e.g. &lt;&lt;80891009 | [optional] 
 **offset** | **Number**| offset, e.g. 0 | [optional] 
 **limit** | **Number**| limit, e.g. 10 | [optional] 
 **ascending** | **Boolean**| ascending, e.g. true | [optional] 
 **sort** | **String**| sort field, e.g. code | [optional] 
 **handler** | **String**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] 
 **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] 
 **active** | **Boolean**| active only, e.g. true | [optional] 
 **leaf** | **Boolean**| leaf nodes only, e.g. false | [optional] 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findConcepts2

> ResultListConcept findConcepts2(opts)

Find concepts (across all terminologies)

Find concepts matching the specified search criteria

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let opts = {
  'query': "query_example", // String | query, e.g. \"heart attack\"
  'offset': 56, // Number | offset, e.g. 0
  'limit': 56, // Number | limit, e.g. 10
  'ascending': true, // Boolean | ascending, e.g. true
  'sort': "sort_example", // String | sort field, e.g. code
  'handler': "handler_example", // String | search handler, e.g. STANDARD, EXACT, NGRAM
  'resolver': "resolver_example", // String | graph resolver, e.g. DEFAULT, MIN
  'active': true, // Boolean | active only, e.g. true
  'leaf': true // Boolean | leaf nodes only, e.g. false
};
apiInstance.findConcepts2(opts, (error, data, response) => {
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
 **query** | **String**| query, e.g. \&quot;heart attack\&quot; | [optional] 
 **offset** | **Number**| offset, e.g. 0 | [optional] 
 **limit** | **Number**| limit, e.g. 10 | [optional] 
 **ascending** | **Boolean**| ascending, e.g. true | [optional] 
 **sort** | **String**| sort field, e.g. code | [optional] 
 **handler** | **String**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] 
 **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] 
 **active** | **Boolean**| active only, e.g. true | [optional] 
 **leaf** | **Boolean**| leaf nodes only, e.g. false | [optional] 

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findMappings1

> ResultListMapping findMappings1(terminology, code, opts)

Find mappings

Find mappings for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 6011000124106
let opts = {
  'query': "query_example", // String | 
  'offset': 56, // Number | 
  'limit': 56, // Number | 
  'ascending': true, // Boolean | 
  'sort': "sort_example" // String | 
};
apiInstance.findMappings1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 6011000124106 | 
 **query** | **String**|  | [optional] 
 **offset** | **Number**|  | [optional] 
 **limit** | **Number**|  | [optional] 
 **ascending** | **Boolean**|  | [optional] 
 **sort** | **String**|  | [optional] 

### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findSubsetMemberships1

> ResultListSubset findSubsetMemberships1(terminology, code)

Get concept subset memberships

Get subsets that the specified terminology and code are a member of

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 723264001
apiInstance.findSubsetMemberships1(terminology, code, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 723264001 | 

### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findTreePositionChildren1

> ResultListConceptTreePosition findTreePositionChildren1(terminology, code, opts)

Find tree position children

Find the child tree position nodes for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 71388002
let opts = {
  'offset': 56, // Number | 
  'limit': 56, // Number | 
  'ascending': true, // Boolean | 
  'sort': "sort_example" // String | 
};
apiInstance.findTreePositionChildren1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 71388002 | 
 **offset** | **Number**|  | [optional] 
 **limit** | **Number**|  | [optional] 
 **ascending** | **Boolean**|  | [optional] 
 **sort** | **String**|  | [optional] 

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## findTreePositions1

> ResultListConceptTreePosition findTreePositions1(terminology, code, opts)

Find tree positions

Find tree positions for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 71388002
let opts = {
  'offset': 56, // Number | 
  'limit': 56, // Number | 
  'ascending': true, // Boolean | 
  'sort': "sort_example" // String | 
};
apiInstance.findTreePositions1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 71388002 | 
 **offset** | **Number**|  | [optional] 
 **limit** | **Number**|  | [optional] 
 **ascending** | **Boolean**|  | [optional] 
 **sort** | **String**|  | [optional] 

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConcept1

> Concept getConcept1(terminology, code, opts)

Get concept

Get concept object for the specified terminology, code, and resolver

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 71388002
let opts = {
  'resolver': "resolver_example" // String | graph resolver, e.g. DEFAULT, MIN
};
apiInstance.getConcept1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 71388002 | 
 **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] 

### Return type

[**Concept**](Concept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConceptMappings1

> ResultListMapping getConceptMappings1(terminology, code)

Get concept mappings

Get mappings that the specified terminology and code are mapped from

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 283231003
apiInstance.getConceptMappings1(terminology, code, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 283231003 | 

### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getConfigProperties1

> getConfigProperties1()

Get properties

Get configuration information used to drive certain UI functionality

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
apiInstance.getConfigProperties1((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


## getMapset1

> Mapset getMapset1(terminology, code)

Get mapset

Get mapsets for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 6011000124106
apiInstance.getMapset1(terminology, code, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 6011000124106 | 

### Return type

[**Mapset**](Mapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getMapsets1

> ResultListMapset getMapsets1(terminology)

Get mapsets

Get all mapsets for the specified terminology

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
apiInstance.getMapsets1(terminology, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

### Return type

[**ResultListMapset**](ResultListMapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getRelationships1

> ResultListConceptRelationship getRelationships1(terminology, code, opts)

Get concept relationships

Get relationships for for specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 71388002
let opts = {
  'offset': 56, // Number | 
  'limit': 100, // Number | 
  'ascending': true, // Boolean | 
  'sort': "sort_example", // String | 
  'inverse': true, // Boolean | 
  'active': true, // Boolean | 
  'filter': "filter_example" // String | 
};
apiInstance.getRelationships1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 71388002 | 
 **offset** | **Number**|  | [optional] 
 **limit** | **Number**|  | [optional] [default to 100]
 **ascending** | **Boolean**|  | [optional] 
 **sort** | **String**|  | [optional] 
 **inverse** | **Boolean**|  | [optional] 
 **active** | **Boolean**|  | [optional] 
 **filter** | **String**|  | [optional] 

### Return type

[**ResultListConceptRelationship**](ResultListConceptRelationship.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubset1

> Subset getSubset1(terminology, code)

Get subset

Get subsets for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 723264001
apiInstance.getSubset1(terminology, code, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 723264001 | 

### Return type

[**Subset**](Subset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubsets1

> ResultListSubset getSubsets1(terminology)

Get subsets

Get all subsets for the specified terminology

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
apiInstance.getSubsets1(terminology, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getSubtree1

> ConceptTreePosition getSubtree1(terminology, code, opts)

Get subtree

Get the subtree for the specified terminology and code

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let code = "code_example"; // String | concept code, e.g. 71388002
let opts = {
  'maxLevel': 56 // Number | 
};
apiInstance.getSubtree1(terminology, code, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **String**| concept code, e.g. 71388002 | 
 **maxLevel** | **Number**|  | [optional] 

### Return type

[**ConceptTreePosition**](ConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTerminologies1

> [Terminology] getTerminologies1()

Get terminologies

Get all terminologies

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
apiInstance.getTerminologies1((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**[Terminology]**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTerminology1

> Terminology getTerminology1(terminology)

Get terminology

Get terminology object for the specified terminology

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
apiInstance.getTerminology1(terminology, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

### Return type

[**Terminology**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getTerminologyMetadata1

> getTerminologyMetadata1(terminology)

Get terminology metadata

Get map of terminology abbreviations to metadata for specified terminology

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
apiInstance.getTerminologyMetadata1(terminology, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## resolveExpression1

> [String] resolveExpression1(terminology, opts)

Resolve expression

Get concept ids corresponding to thespecified terminology and expression. For more information on working with expressions, see &lt;a href&#x3D;\&quot;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md\&quot;&gt;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md&lt;/a&gt;.

### Example

```javascript
import WestCoastInformaticsTerminologyApi from 'west_coast_informatics_terminology_api';
let defaultClient = WestCoastInformaticsTerminologyApi.ApiClient.instance;
// Configure Bearer (Bearer [token]) access token for authorization: bearerAuth
let bearerAuth = defaultClient.authentications['bearerAuth'];
bearerAuth.accessToken = "YOUR ACCESS TOKEN"

let apiInstance = new WestCoastInformaticsTerminologyApi.TerminologyApi();
let terminology = "'SNOMEDCT_US'"; // String | terminology, e.g. SNOMEDCT_US
let opts = {
  'expression': "expression_example" // String | 
};
apiInstance.resolveExpression1(terminology, opts, (error, data, response) => {
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
 **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **expression** | **String**|  | [optional] 

### Return type

**[String]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

