# openapi_client.TerminologyApi

All URIs are relative to *https://termserver.westcoastinformatics.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_synonym**](TerminologyApi.md#add_synonym) | **POST** /terminology/concept/{terminology}/{code}/atom | Add synonym
[**autocomplete_concepts1**](TerminologyApi.md#autocomplete_concepts1) | **GET** /terminology/concept/{terminology}/autocomplete | Autocomplete
[**find_concepts**](TerminologyApi.md#find_concepts) | **GET** /terminology/concept/{terminology} | Find concepts
[**find_concepts2**](TerminologyApi.md#find_concepts2) | **GET** /terminology/concept | Find concepts (across all terminologies)
[**find_mappings1**](TerminologyApi.md#find_mappings1) | **GET** /terminology/mapset/{terminology}/{code}/mapping | Find mappings
[**find_subset_memberships1**](TerminologyApi.md#find_subset_memberships1) | **GET** /terminology/concept/{terminology}/{code}/subsets | Get concept subset memberships
[**find_tree_position_children1**](TerminologyApi.md#find_tree_position_children1) | **GET** /terminology/concept/{terminology}/{code}/trees/children | Find tree position children
[**find_tree_positions1**](TerminologyApi.md#find_tree_positions1) | **GET** /terminology/concept/{terminology}/{code}/trees | Find tree positions
[**get_concept1**](TerminologyApi.md#get_concept1) | **GET** /terminology/concept/{terminology}/{code} | Get concept
[**get_concept_mappings1**](TerminologyApi.md#get_concept_mappings1) | **GET** /terminology/concept/{terminology}/{code}/mapping | Get concept mappings
[**get_config_properties1**](TerminologyApi.md#get_config_properties1) | **GET** /terminology/properties | Get properties
[**get_mapset1**](TerminologyApi.md#get_mapset1) | **GET** /terminology/mapset/{terminology}/{code} | Get mapset
[**get_mapsets1**](TerminologyApi.md#get_mapsets1) | **GET** /terminology/mapset/{terminology} | Get mapsets
[**get_relationships1**](TerminologyApi.md#get_relationships1) | **GET** /terminology/concept/{terminology}/{code}/relationships | Get concept relationships
[**get_subset1**](TerminologyApi.md#get_subset1) | **GET** /terminology/subset/{terminology}/{code} | Get subset
[**get_subsets1**](TerminologyApi.md#get_subsets1) | **GET** /terminology/subset/{terminology} | Get subsets
[**get_subtree1**](TerminologyApi.md#get_subtree1) | **GET** /terminology/concept/{terminology}/{code}/subtree | Get subtree
[**get_terminologies1**](TerminologyApi.md#get_terminologies1) | **GET** /terminology | Get terminologies
[**get_terminology1**](TerminologyApi.md#get_terminology1) | **GET** /terminology/{terminology} | Get terminology
[**get_terminology_metadata1**](TerminologyApi.md#get_terminology_metadata1) | **GET** /terminology/metadata/{terminology} | Get terminology metadata
[**resolve_expression1**](TerminologyApi.md#resolve_expression1) | **GET** /terminology/expr/{terminology} | Resolve expression


# **add_synonym**
> Atom add_synonym(terminology, code, name=name, term_type=term_type, request_body=request_body)

Add synonym

Add synonym with specified parameters

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.atom import Atom
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'terminology_example' # str | terminology, e.g. SNOMEDCT_US
    code = 'code_example' # str | code, e.g. 80891009
    name = 'name_example' # str | synonym name, e.g. \"test name\" (optional)
    term_type = 'term_type_example' # str | term type, e.g. INDEX_SY (optional)
    request_body = {'key': 'request_body_example'} # Dict[str, str] |  (optional)

    try:
        # Add synonym
        api_response = api_instance.add_synonym(terminology, code, name=name, term_type=term_type, request_body=request_body)
        print("The response of TerminologyApi->add_synonym:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->add_synonym: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | 
 **code** | **str**| code, e.g. 80891009 | 
 **name** | **str**| synonym name, e.g. \&quot;test name\&quot; | [optional] 
 **term_type** | **str**| term type, e.g. INDEX_SY | [optional] 
 **request_body** | [**Dict[str, str]**](str.md)|  | [optional] 

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
**200** | Synonym added |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **autocomplete_concepts1**
> ResultListConcept autocomplete_concepts1(terminology, query=query, expression=expression, clause=clause, limit=limit)

Autocomplete

Find concepts for a type-ahead search field

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept import ResultListConcept
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    query = 'query_example' # str |  (optional)
    expression = 'expression_example' # str |  (optional)
    clause = 'clause_example' # str |  (optional)
    limit = 56 # int |  (optional)

    try:
        # Autocomplete
        api_response = api_instance.autocomplete_concepts1(terminology, query=query, expression=expression, clause=clause, limit=limit)
        print("The response of TerminologyApi->autocomplete_concepts1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->autocomplete_concepts1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **query** | **str**|  | [optional] 
 **expression** | **str**|  | [optional] 
 **clause** | **str**|  | [optional] 
 **limit** | **int**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_concepts**
> ResultListConcept find_concepts(terminology, query=query, expression=expression, offset=offset, limit=limit, ascending=ascending, sort=sort, handler=handler, resolver=resolver, active=active, leaf=leaf)

Find concepts

Find concepts matching the specified search criteria

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept import ResultListConcept
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    query = 'query_example' # str | query, e.g. \"heart attack\" (optional)
    expression = 'expression_example' # str | ECL Expression, e.g. <<80891009 (optional)
    offset = 56 # int | offset, e.g. 0 (optional)
    limit = 56 # int | limit, e.g. 10 (optional)
    ascending = True # bool | ascending, e.g. true (optional)
    sort = 'sort_example' # str | sort field, e.g. code (optional)
    handler = 'handler_example' # str | search handler, e.g. STANDARD, EXACT, NGRAM (optional)
    resolver = 'resolver_example' # str | graph resolver, e.g. DEFAULT, MIN (optional)
    active = True # bool | active only, e.g. true (optional)
    leaf = True # bool | leaf nodes only, e.g. false (optional)

    try:
        # Find concepts
        api_response = api_instance.find_concepts(terminology, query=query, expression=expression, offset=offset, limit=limit, ascending=ascending, sort=sort, handler=handler, resolver=resolver, active=active, leaf=leaf)
        print("The response of TerminologyApi->find_concepts:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_concepts: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **query** | **str**| query, e.g. \&quot;heart attack\&quot; | [optional] 
 **expression** | **str**| ECL Expression, e.g. &lt;&lt;80891009 | [optional] 
 **offset** | **int**| offset, e.g. 0 | [optional] 
 **limit** | **int**| limit, e.g. 10 | [optional] 
 **ascending** | **bool**| ascending, e.g. true | [optional] 
 **sort** | **str**| sort field, e.g. code | [optional] 
 **handler** | **str**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] 
 **resolver** | **str**| graph resolver, e.g. DEFAULT, MIN | [optional] 
 **active** | **bool**| active only, e.g. true | [optional] 
 **leaf** | **bool**| leaf nodes only, e.g. false | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_concepts2**
> ResultListConcept find_concepts2(query=query, offset=offset, limit=limit, ascending=ascending, sort=sort, handler=handler, resolver=resolver, active=active, leaf=leaf)

Find concepts (across all terminologies)

Find concepts matching the specified search criteria

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept import ResultListConcept
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
    api_instance = openapi_client.TerminologyApi(api_client)
    query = 'query_example' # str | query, e.g. \"heart attack\" (optional)
    offset = 56 # int | offset, e.g. 0 (optional)
    limit = 56 # int | limit, e.g. 10 (optional)
    ascending = True # bool | ascending, e.g. true (optional)
    sort = 'sort_example' # str | sort field, e.g. code (optional)
    handler = 'handler_example' # str | search handler, e.g. STANDARD, EXACT, NGRAM (optional)
    resolver = 'resolver_example' # str | graph resolver, e.g. DEFAULT, MIN (optional)
    active = True # bool | active only, e.g. true (optional)
    leaf = True # bool | leaf nodes only, e.g. false (optional)

    try:
        # Find concepts (across all terminologies)
        api_response = api_instance.find_concepts2(query=query, offset=offset, limit=limit, ascending=ascending, sort=sort, handler=handler, resolver=resolver, active=active, leaf=leaf)
        print("The response of TerminologyApi->find_concepts2:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_concepts2: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **str**| query, e.g. \&quot;heart attack\&quot; | [optional] 
 **offset** | **int**| offset, e.g. 0 | [optional] 
 **limit** | **int**| limit, e.g. 10 | [optional] 
 **ascending** | **bool**| ascending, e.g. true | [optional] 
 **sort** | **str**| sort field, e.g. code | [optional] 
 **handler** | **str**| search handler, e.g. STANDARD, EXACT, NGRAM | [optional] 
 **resolver** | **str**| graph resolver, e.g. DEFAULT, MIN | [optional] 
 **active** | **bool**| active only, e.g. true | [optional] 
 **leaf** | **bool**| leaf nodes only, e.g. false | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_mappings1**
> ResultListMapping find_mappings1(terminology, code, query=query, offset=offset, limit=limit, ascending=ascending, sort=sort)

Find mappings

Find mappings for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_mapping import ResultListMapping
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 6011000124106
    query = 'query_example' # str |  (optional)
    offset = 56 # int |  (optional)
    limit = 56 # int |  (optional)
    ascending = True # bool |  (optional)
    sort = 'sort_example' # str |  (optional)

    try:
        # Find mappings
        api_response = api_instance.find_mappings1(terminology, code, query=query, offset=offset, limit=limit, ascending=ascending, sort=sort)
        print("The response of TerminologyApi->find_mappings1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_mappings1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 6011000124106 | 
 **query** | **str**|  | [optional] 
 **offset** | **int**|  | [optional] 
 **limit** | **int**|  | [optional] 
 **ascending** | **bool**|  | [optional] 
 **sort** | **str**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_subset_memberships1**
> ResultListSubset find_subset_memberships1(terminology, code)

Get concept subset memberships

Get subsets that the specified terminology and code are a member of

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_subset import ResultListSubset
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 723264001

    try:
        # Get concept subset memberships
        api_response = api_instance.find_subset_memberships1(terminology, code)
        print("The response of TerminologyApi->find_subset_memberships1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_subset_memberships1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 723264001 | 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_tree_position_children1**
> ResultListConceptTreePosition find_tree_position_children1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort)

Find tree position children

Find the child tree position nodes for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept_tree_position import ResultListConceptTreePosition
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 71388002
    offset = 56 # int |  (optional)
    limit = 56 # int |  (optional)
    ascending = True # bool |  (optional)
    sort = 'sort_example' # str |  (optional)

    try:
        # Find tree position children
        api_response = api_instance.find_tree_position_children1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort)
        print("The response of TerminologyApi->find_tree_position_children1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_tree_position_children1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 71388002 | 
 **offset** | **int**|  | [optional] 
 **limit** | **int**|  | [optional] 
 **ascending** | **bool**|  | [optional] 
 **sort** | **str**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **find_tree_positions1**
> ResultListConceptTreePosition find_tree_positions1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort)

Find tree positions

Find tree positions for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept_tree_position import ResultListConceptTreePosition
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 71388002
    offset = 56 # int |  (optional)
    limit = 56 # int |  (optional)
    ascending = True # bool |  (optional)
    sort = 'sort_example' # str |  (optional)

    try:
        # Find tree positions
        api_response = api_instance.find_tree_positions1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort)
        print("The response of TerminologyApi->find_tree_positions1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->find_tree_positions1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 71388002 | 
 **offset** | **int**|  | [optional] 
 **limit** | **int**|  | [optional] 
 **ascending** | **bool**|  | [optional] 
 **sort** | **str**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_concept1**
> Concept get_concept1(terminology, code, resolver=resolver)

Get concept

Get concept object for the specified terminology, code, and resolver

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.concept import Concept
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 71388002
    resolver = 'resolver_example' # str | graph resolver, e.g. DEFAULT, MIN (optional)

    try:
        # Get concept
        api_response = api_instance.get_concept1(terminology, code, resolver=resolver)
        print("The response of TerminologyApi->get_concept1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_concept1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 71388002 | 
 **resolver** | **str**| graph resolver, e.g. DEFAULT, MIN | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_concept_mappings1**
> ResultListMapping get_concept_mappings1(terminology, code)

Get concept mappings

Get mappings that the specified terminology and code are mapped from

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_mapping import ResultListMapping
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 283231003

    try:
        # Get concept mappings
        api_response = api_instance.get_concept_mappings1(terminology, code)
        print("The response of TerminologyApi->get_concept_mappings1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_concept_mappings1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 283231003 | 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_config_properties1**
> get_config_properties1()

Get properties

Get configuration information used to drive certain UI functionality

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
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
    api_instance = openapi_client.TerminologyApi(api_client)

    try:
        # Get properties
        api_instance.get_config_properties1()
    except Exception as e:
        print("Exception when calling TerminologyApi->get_config_properties1: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapset1**
> Mapset get_mapset1(terminology, code)

Get mapset

Get mapsets for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.mapset import Mapset
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 6011000124106

    try:
        # Get mapset
        api_response = api_instance.get_mapset1(terminology, code)
        print("The response of TerminologyApi->get_mapset1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_mapset1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 6011000124106 | 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_mapsets1**
> ResultListMapset get_mapsets1(terminology)

Get mapsets

Get all mapsets for the specified terminology

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_mapset import ResultListMapset
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')

    try:
        # Get mapsets
        api_response = api_instance.get_mapsets1(terminology)
        print("The response of TerminologyApi->get_mapsets1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_mapsets1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_relationships1**
> ResultListConceptRelationship get_relationships1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort, inverse=inverse, active=active, filter=filter)

Get concept relationships

Get relationships for for specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_concept_relationship import ResultListConceptRelationship
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 71388002
    offset = 56 # int |  (optional)
    limit = 100 # int |  (optional) (default to 100)
    ascending = True # bool |  (optional)
    sort = 'sort_example' # str |  (optional)
    inverse = True # bool |  (optional)
    active = True # bool |  (optional)
    filter = 'filter_example' # str |  (optional)

    try:
        # Get concept relationships
        api_response = api_instance.get_relationships1(terminology, code, offset=offset, limit=limit, ascending=ascending, sort=sort, inverse=inverse, active=active, filter=filter)
        print("The response of TerminologyApi->get_relationships1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_relationships1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 71388002 | 
 **offset** | **int**|  | [optional] 
 **limit** | **int**|  | [optional] [default to 100]
 **ascending** | **bool**|  | [optional] 
 **sort** | **str**|  | [optional] 
 **inverse** | **bool**|  | [optional] 
 **active** | **bool**|  | [optional] 
 **filter** | **str**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subset1**
> Subset get_subset1(terminology, code)

Get subset

Get subsets for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.subset import Subset
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 723264001

    try:
        # Get subset
        api_response = api_instance.get_subset1(terminology, code)
        print("The response of TerminologyApi->get_subset1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_subset1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 723264001 | 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subsets1**
> ResultListSubset get_subsets1(terminology)

Get subsets

Get all subsets for the specified terminology

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.result_list_subset import ResultListSubset
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')

    try:
        # Get subsets
        api_response = api_instance.get_subsets1(terminology)
        print("The response of TerminologyApi->get_subsets1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_subsets1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_subtree1**
> ConceptTreePosition get_subtree1(terminology, code, max_level=max_level)

Get subtree

Get the subtree for the specified terminology and code

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.concept_tree_position import ConceptTreePosition
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    code = 'code_example' # str | concept code, e.g. 71388002
    max_level = 56 # int |  (optional)

    try:
        # Get subtree
        api_response = api_instance.get_subtree1(terminology, code, max_level=max_level)
        print("The response of TerminologyApi->get_subtree1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_subtree1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **code** | **str**| concept code, e.g. 71388002 | 
 **max_level** | **int**|  | [optional] 

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_terminologies1**
> List[Terminology] get_terminologies1()

Get terminologies

Get all terminologies

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.terminology import Terminology
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
    api_instance = openapi_client.TerminologyApi(api_client)

    try:
        # Get terminologies
        api_response = api_instance.get_terminologies1()
        print("The response of TerminologyApi->get_terminologies1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_terminologies1: %s\n" % e)
```



### Parameters
This endpoint does not need any parameter.

### Return type

[**List[Terminology]**](Terminology.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_terminology1**
> Terminology get_terminology1(terminology)

Get terminology

Get terminology object for the specified terminology

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
from openapi_client.models.terminology import Terminology
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')

    try:
        # Get terminology
        api_response = api_instance.get_terminology1(terminology)
        print("The response of TerminologyApi->get_terminology1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_terminology1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

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
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_terminology_metadata1**
> get_terminology_metadata1(terminology)

Get terminology metadata

Get map of terminology abbreviations to metadata for specified terminology

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')

    try:
        # Get terminology metadata
        api_instance.get_terminology_metadata1(terminology)
    except Exception as e:
        print("Exception when calling TerminologyApi->get_terminology_metadata1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]

### Return type

void (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **resolve_expression1**
> List[str] resolve_expression1(terminology, expression=expression)

Resolve expression

Get concept ids corresponding to thespecified terminology and expression. For more information on working with expressions, see <a href=\"https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md\">https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md</a>.

### Example

* Bearer (Bearer [token]) Authentication (bearerAuth):
```python
import time
import os
import openapi_client
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
    api_instance = openapi_client.TerminologyApi(api_client)
    terminology = 'SNOMEDCT_US' # str | terminology, e.g. SNOMEDCT_US (default to 'SNOMEDCT_US')
    expression = 'expression_example' # str |  (optional)

    try:
        # Resolve expression
        api_response = api_instance.resolve_expression1(terminology, expression=expression)
        print("The response of TerminologyApi->resolve_expression1:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling TerminologyApi->resolve_expression1: %s\n" % e)
```



### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **terminology** | **str**| terminology, e.g. SNOMEDCT_US | [default to &#39;SNOMEDCT_US&#39;]
 **expression** | **str**|  | [optional] 

### Return type

**List[str]**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal server error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

