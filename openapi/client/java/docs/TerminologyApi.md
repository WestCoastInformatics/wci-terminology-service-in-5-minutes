# TerminologyApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSynonym**](TerminologyApi.md#addSynonym) | **POST** /terminology/concept/{terminology}/{code}/atom | Add synonym |
| [**autocompleteConcepts1**](TerminologyApi.md#autocompleteConcepts1) | **GET** /terminology/concept/{terminology}/autocomplete | Autocomplete |
| [**findConcepts**](TerminologyApi.md#findConcepts) | **GET** /terminology/concept/{terminology} | Find concepts |
| [**findConcepts2**](TerminologyApi.md#findConcepts2) | **GET** /terminology/concept | Find concepts (across all terminologies) |
| [**findMappings1**](TerminologyApi.md#findMappings1) | **GET** /terminology/mapset/{terminology}/{code}/mapping | Find mappings |
| [**findSubsetMemberships1**](TerminologyApi.md#findSubsetMemberships1) | **GET** /terminology/concept/{terminology}/{code}/subsets | Get concept subset memberships |
| [**findTreePositionChildren1**](TerminologyApi.md#findTreePositionChildren1) | **GET** /terminology/concept/{terminology}/{code}/trees/children | Find tree position children |
| [**findTreePositions1**](TerminologyApi.md#findTreePositions1) | **GET** /terminology/concept/{terminology}/{code}/trees | Find tree positions |
| [**getConcept1**](TerminologyApi.md#getConcept1) | **GET** /terminology/concept/{terminology}/{code} | Get concept |
| [**getConceptMappings1**](TerminologyApi.md#getConceptMappings1) | **GET** /terminology/concept/{terminology}/{code}/mapping | Get concept mappings |
| [**getConfigProperties1**](TerminologyApi.md#getConfigProperties1) | **GET** /terminology/properties | Get properties |
| [**getMapset1**](TerminologyApi.md#getMapset1) | **GET** /terminology/mapset/{terminology}/{code} | Get mapset |
| [**getMapsets1**](TerminologyApi.md#getMapsets1) | **GET** /terminology/mapset/{terminology} | Get mapsets |
| [**getRelationships1**](TerminologyApi.md#getRelationships1) | **GET** /terminology/concept/{terminology}/{code}/relationships | Get concept relationships |
| [**getSubset1**](TerminologyApi.md#getSubset1) | **GET** /terminology/subset/{terminology}/{code} | Get subset |
| [**getSubsets1**](TerminologyApi.md#getSubsets1) | **GET** /terminology/subset/{terminology} | Get subsets |
| [**getSubtree1**](TerminologyApi.md#getSubtree1) | **GET** /terminology/concept/{terminology}/{code}/subtree | Get subtree |
| [**getTerminologies1**](TerminologyApi.md#getTerminologies1) | **GET** /terminology | Get terminologies |
| [**getTerminology1**](TerminologyApi.md#getTerminology1) | **GET** /terminology/{terminology} | Get terminology |
| [**getTerminologyMetadata1**](TerminologyApi.md#getTerminologyMetadata1) | **GET** /terminology/metadata/{terminology} | Get terminology metadata |
| [**resolveExpression1**](TerminologyApi.md#resolveExpression1) | **GET** /terminology/expr/{terminology} | Resolve expression |


<a id="addSynonym"></a>
# **addSynonym**
> Atom addSynonym(terminology, code, name, termType, requestBody)

Add synonym

Add synonym with specified parameters

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "terminology_example"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | code, e.g. 80891009
    String name = "name_example"; // String | synonym name, e.g. \"test name\"
    String termType = "termType_example"; // String | term type, e.g. INDEX_SY
    Map<String, String> requestBody = new HashMap(); // Map<String, String> | 
    try {
      Atom result = apiInstance.addSynonym(terminology, code, name, termType, requestBody);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#addSynonym");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | |
| **code** | **String**| code, e.g. 80891009 | |
| **name** | **String**| synonym name, e.g. \&quot;test name\&quot; | [optional] |
| **termType** | **String**| term type, e.g. INDEX_SY | [optional] |
| **requestBody** | [**Map&lt;String, String&gt;**](String.md)|  | [optional] |

### Return type

[**Atom**](Atom.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json, application/xml
 - **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Synonym added |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="autocompleteConcepts1"></a>
# **autocompleteConcepts1**
> ResultListConcept autocompleteConcepts1(terminology, query, expression, clause, limit)

Autocomplete

Find concepts for a type-ahead search field

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String query = "query_example"; // String | 
    String expression = "expression_example"; // String | 
    String clause = "clause_example"; // String | 
    Integer limit = 56; // Integer | 
    try {
      ResultListConcept result = apiInstance.autocompleteConcepts1(terminology, query, expression, clause, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#autocompleteConcepts1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **query** | **String**|  | [optional] |
| **expression** | **String**|  | [optional] |
| **clause** | **String**|  | [optional] |
| **limit** | **Integer**|  | [optional] |

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findConcepts"></a>
# **findConcepts**
> ResultListConcept findConcepts(terminology, query, expression, offset, limit, ascending, sort, handler, resolver, active, leaf)

Find concepts

Find concepts matching the specified search criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String query = "query_example"; // String | query, e.g. \"heart attack\"
    String expression = "expression_example"; // String | ECL Expression, e.g. <<80891009
    Integer offset = 56; // Integer | offset, e.g. 0
    Integer limit = 56; // Integer | limit, e.g. 10
    Boolean ascending = true; // Boolean | ascending, e.g. true
    String sort = "sort_example"; // String | sort field, e.g. code
    String handler = "handler_example"; // String | search handler, e.g. STANDARD, EXACT, NGRAM
    String resolver = "resolver_example"; // String | graph resolver, e.g. DEFAULT, MIN
    Boolean active = true; // Boolean | active only, e.g. true
    Boolean leaf = true; // Boolean | leaf nodes only, e.g. false
    try {
      ResultListConcept result = apiInstance.findConcepts(terminology, query, expression, offset, limit, ascending, sort, handler, resolver, active, leaf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findConcepts");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **query** | **String**| query, e.g. \&quot;heart attack\&quot; | [optional] |
| **expression** | **String**| ECL Expression, e.g. &lt;&lt;80891009 | [optional] |
| **offset** | **Integer**| offset, e.g. 0 | [optional] |
| **limit** | **Integer**| limit, e.g. 10 | [optional] |
| **ascending** | **Boolean**| ascending, e.g. true | [optional] |
| **sort** | **String**| sort field, e.g. code | [optional] |
| **handler** | **String**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] |
| **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] |
| **active** | **Boolean**| active only, e.g. true | [optional] |
| **leaf** | **Boolean**| leaf nodes only, e.g. false | [optional] |

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findConcepts2"></a>
# **findConcepts2**
> ResultListConcept findConcepts2(query, offset, limit, ascending, sort, handler, resolver, active, leaf)

Find concepts (across all terminologies)

Find concepts matching the specified search criteria

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String query = "query_example"; // String | query, e.g. \"heart attack\"
    Integer offset = 56; // Integer | offset, e.g. 0
    Integer limit = 56; // Integer | limit, e.g. 10
    Boolean ascending = true; // Boolean | ascending, e.g. true
    String sort = "sort_example"; // String | sort field, e.g. code
    String handler = "handler_example"; // String | search handler, e.g. STANDARD, EXACT, NGRAM
    String resolver = "resolver_example"; // String | graph resolver, e.g. DEFAULT, MIN
    Boolean active = true; // Boolean | active only, e.g. true
    Boolean leaf = true; // Boolean | leaf nodes only, e.g. false
    try {
      ResultListConcept result = apiInstance.findConcepts2(query, offset, limit, ascending, sort, handler, resolver, active, leaf);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findConcepts2");
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
| **query** | **String**| query, e.g. \&quot;heart attack\&quot; | [optional] |
| **offset** | **Integer**| offset, e.g. 0 | [optional] |
| **limit** | **Integer**| limit, e.g. 10 | [optional] |
| **ascending** | **Boolean**| ascending, e.g. true | [optional] |
| **sort** | **String**| sort field, e.g. code | [optional] |
| **handler** | **String**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] |
| **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] |
| **active** | **Boolean**| active only, e.g. true | [optional] |
| **leaf** | **Boolean**| leaf nodes only, e.g. false | [optional] |

### Return type

[**ResultListConcept**](ResultListConcept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findMappings1"></a>
# **findMappings1**
> ResultListMapping findMappings1(terminology, code, query, offset, limit, ascending, sort)

Find mappings

Find mappings for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 6011000124106
    String query = "query_example"; // String | 
    Integer offset = 56; // Integer | 
    Integer limit = 56; // Integer | 
    Boolean ascending = true; // Boolean | 
    String sort = "sort_example"; // String | 
    try {
      ResultListMapping result = apiInstance.findMappings1(terminology, code, query, offset, limit, ascending, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findMappings1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 6011000124106 | |
| **query** | **String**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **ascending** | **Boolean**|  | [optional] |
| **sort** | **String**|  | [optional] |

### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findSubsetMemberships1"></a>
# **findSubsetMemberships1**
> ResultListSubset findSubsetMemberships1(terminology, code)

Get concept subset memberships

Get subsets that the specified terminology and code are a member of

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 723264001
    try {
      ResultListSubset result = apiInstance.findSubsetMemberships1(terminology, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findSubsetMemberships1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 723264001 | |

### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findTreePositionChildren1"></a>
# **findTreePositionChildren1**
> ResultListConceptTreePosition findTreePositionChildren1(terminology, code, offset, limit, ascending, sort)

Find tree position children

Find the child tree position nodes for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 71388002
    Integer offset = 56; // Integer | 
    Integer limit = 56; // Integer | 
    Boolean ascending = true; // Boolean | 
    String sort = "sort_example"; // String | 
    try {
      ResultListConceptTreePosition result = apiInstance.findTreePositionChildren1(terminology, code, offset, limit, ascending, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findTreePositionChildren1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 71388002 | |
| **offset** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **ascending** | **Boolean**|  | [optional] |
| **sort** | **String**|  | [optional] |

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="findTreePositions1"></a>
# **findTreePositions1**
> ResultListConceptTreePosition findTreePositions1(terminology, code, offset, limit, ascending, sort)

Find tree positions

Find tree positions for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 71388002
    Integer offset = 56; // Integer | 
    Integer limit = 56; // Integer | 
    Boolean ascending = true; // Boolean | 
    String sort = "sort_example"; // String | 
    try {
      ResultListConceptTreePosition result = apiInstance.findTreePositions1(terminology, code, offset, limit, ascending, sort);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#findTreePositions1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 71388002 | |
| **offset** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] |
| **ascending** | **Boolean**|  | [optional] |
| **sort** | **String**|  | [optional] |

### Return type

[**ResultListConceptTreePosition**](ResultListConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getConcept1"></a>
# **getConcept1**
> Concept getConcept1(terminology, code, resolver)

Get concept

Get concept object for the specified terminology, code, and resolver

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 71388002
    String resolver = "resolver_example"; // String | graph resolver, e.g. DEFAULT, MIN
    try {
      Concept result = apiInstance.getConcept1(terminology, code, resolver);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getConcept1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 71388002 | |
| **resolver** | **String**| graph resolver, e.g. DEFAULT, MIN | [optional] |

### Return type

[**Concept**](Concept.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getConceptMappings1"></a>
# **getConceptMappings1**
> ResultListMapping getConceptMappings1(terminology, code)

Get concept mappings

Get mappings that the specified terminology and code are mapped from

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 283231003
    try {
      ResultListMapping result = apiInstance.getConceptMappings1(terminology, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getConceptMappings1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 283231003 | |

### Return type

[**ResultListMapping**](ResultListMapping.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getConfigProperties1"></a>
# **getConfigProperties1**
> getConfigProperties1()

Get properties

Get configuration information used to drive certain UI functionality

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    try {
      apiInstance.getConfigProperties1();
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getConfigProperties1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
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

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal server error |  -  |

<a id="getMapset1"></a>
# **getMapset1**
> Mapset getMapset1(terminology, code)

Get mapset

Get mapsets for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 6011000124106
    try {
      Mapset result = apiInstance.getMapset1(terminology, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getMapset1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 6011000124106 | |

### Return type

[**Mapset**](Mapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getMapsets1"></a>
# **getMapsets1**
> ResultListMapset getMapsets1(terminology)

Get mapsets

Get all mapsets for the specified terminology

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    try {
      ResultListMapset result = apiInstance.getMapsets1(terminology);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getMapsets1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |

### Return type

[**ResultListMapset**](ResultListMapset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getRelationships1"></a>
# **getRelationships1**
> ResultListConceptRelationship getRelationships1(terminology, code, offset, limit, ascending, sort, inverse, active, filter)

Get concept relationships

Get relationships for for specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 71388002
    Integer offset = 56; // Integer | 
    Integer limit = 100; // Integer | 
    Boolean ascending = true; // Boolean | 
    String sort = "sort_example"; // String | 
    Boolean inverse = true; // Boolean | 
    Boolean active = true; // Boolean | 
    String filter = "filter_example"; // String | 
    try {
      ResultListConceptRelationship result = apiInstance.getRelationships1(terminology, code, offset, limit, ascending, sort, inverse, active, filter);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getRelationships1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 71388002 | |
| **offset** | **Integer**|  | [optional] |
| **limit** | **Integer**|  | [optional] [default to 100] |
| **ascending** | **Boolean**|  | [optional] |
| **sort** | **String**|  | [optional] |
| **inverse** | **Boolean**|  | [optional] |
| **active** | **Boolean**|  | [optional] |
| **filter** | **String**|  | [optional] |

### Return type

[**ResultListConceptRelationship**](ResultListConceptRelationship.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getSubset1"></a>
# **getSubset1**
> Subset getSubset1(terminology, code)

Get subset

Get subsets for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 723264001
    try {
      Subset result = apiInstance.getSubset1(terminology, code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getSubset1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 723264001 | |

### Return type

[**Subset**](Subset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getSubsets1"></a>
# **getSubsets1**
> ResultListSubset getSubsets1(terminology)

Get subsets

Get all subsets for the specified terminology

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    try {
      ResultListSubset result = apiInstance.getSubsets1(terminology);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getSubsets1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |

### Return type

[**ResultListSubset**](ResultListSubset.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getSubtree1"></a>
# **getSubtree1**
> ConceptTreePosition getSubtree1(terminology, code, maxLevel)

Get subtree

Get the subtree for the specified terminology and code

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String code = "code_example"; // String | concept code, e.g. 71388002
    Integer maxLevel = 56; // Integer | 
    try {
      ConceptTreePosition result = apiInstance.getSubtree1(terminology, code, maxLevel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getSubtree1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **code** | **String**| concept code, e.g. 71388002 | |
| **maxLevel** | **Integer**|  | [optional] |

### Return type

[**ConceptTreePosition**](ConceptTreePosition.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getTerminologies1"></a>
# **getTerminologies1**
> List&lt;Terminology&gt; getTerminologies1()

Get terminologies

Get all terminologies

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    try {
      List<Terminology> result = apiInstance.getTerminologies1();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getTerminologies1");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Terminology&gt;**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getTerminology1"></a>
# **getTerminology1**
> Terminology getTerminology1(terminology)

Get terminology

Get terminology object for the specified terminology

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    try {
      Terminology result = apiInstance.getTerminology1(terminology);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getTerminology1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |

### Return type

[**Terminology**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="getTerminologyMetadata1"></a>
# **getTerminologyMetadata1**
> getTerminologyMetadata1(terminology)

Get terminology metadata

Get map of terminology abbreviations to metadata for specified terminology

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    try {
      apiInstance.getTerminologyMetadata1(terminology);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#getTerminologyMetadata1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

<a id="resolveExpression1"></a>
# **resolveExpression1**
> List&lt;String&gt; resolveExpression1(terminology, expression)

Resolve expression

Get concept ids corresponding to thespecified terminology and expression. For more information on working with expressions, see &lt;a href&#x3D;\&quot;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md\&quot;&gt;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md&lt;/a&gt;.

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TerminologyApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://termserver.westcoastinformatics.com");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    TerminologyApi apiInstance = new TerminologyApi(defaultClient);
    String terminology = "SNOMEDCT_US"; // String | terminology, e.g. SNOMEDCT_US
    String expression = "expression_example"; // String | 
    try {
      List<String> result = apiInstance.resolveExpression1(terminology, expression);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TerminologyApi#resolveExpression1");
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
| **terminology** | **String**| terminology, e.g. SNOMEDCT_US | [default to SNOMEDCT_US] |
| **expression** | **String**|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |

