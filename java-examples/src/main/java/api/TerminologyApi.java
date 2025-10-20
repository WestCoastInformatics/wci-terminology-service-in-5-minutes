package api;

import api.invoker.ApiException;
import api.invoker.ApiClient;
import api.invoker.ApiResponse;
import api.invoker.Configuration;
import api.invoker.Pair;

import jakarta.ws.rs.core.GenericType;

import com.wci.terminology.client.model.Concept;
import com.wci.terminology.client.model.ConceptTreePosition;
import com.wci.terminology.client.model.Mapset;
import com.wci.terminology.client.model.ResultListConcept;
import com.wci.terminology.client.model.ResultListConceptRelationship;
import com.wci.terminology.client.model.ResultListConceptTreePosition;
import com.wci.terminology.client.model.ResultListMapping;
import com.wci.terminology.client.model.ResultListMapset;
import com.wci.terminology.client.model.ResultListSubset;
import java.util.Set;
import com.wci.terminology.client.model.Subset;
import com.wci.terminology.client.model.Terminology;
import com.wci.terminology.client.model.TerminologyMetadata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.5.0")
public class TerminologyApi {
  private ApiClient apiClient;

  public TerminologyApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TerminologyApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get the API client
   *
   * @return API client
   */
  public ApiClient getApiClient() {
    return apiClient;
  }

  /**
   * Set the API client
   *
   * @param apiClient an instance of API client
   */
  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Autocomplete
   * Find concepts for a type-ahead search field
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param query search query, e.g. heart attack (optional)
   * @param expression ECL Expression, e.g. &lt;404684003 (optional)
   * @param clause  (optional)
   * @param limit limit of results to return (optional)
   * @return ResultListConcept
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConcept autocompleteConcepts(String terminology, String query, String expression, String clause, Integer limit) throws ApiException {
    return autocompleteConceptsWithHttpInfo(terminology, query, expression, clause, limit).getData();
  }

  /**
   * Autocomplete
   * Find concepts for a type-ahead search field
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param query search query, e.g. heart attack (optional)
   * @param expression ECL Expression, e.g. &lt;404684003 (optional)
   * @param clause  (optional)
   * @param limit limit of results to return (optional)
   * @return ApiResponse&lt;ResultListConcept&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConcept> autocompleteConceptsWithHttpInfo(String terminology, String query, String expression, String clause, Integer limit) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling autocompleteConcepts");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/autocomplete"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expression", expression));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "clause", clause));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConcept> localVarReturnType = new GenericType<ResultListConcept>() {};
    return apiClient.invokeAPI("TerminologyApi.autocompleteConcepts", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find concepts (across all terminologies)
   * Find concepts matching the specified search criteria
   * @param query search query, e.g. heart attack (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param handler search handler, e.g. STANDARD, EXACT, NGRAM. If &#39;SNOMED&#39; handler is used, a small delay may be added to prevent being blocked by 3rd party integration. (optional)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @param active active only, e.g. true (optional)
   * @param leaf active only, e.g. true (optional)
   * @return ResultListConcept
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConcept findConcepts(String query, Integer offset, Integer limit, Boolean ascending, String sort, String handler, String resolver, Boolean active, Boolean leaf) throws ApiException {
    return findConceptsWithHttpInfo(query, offset, limit, ascending, sort, handler, resolver, active, leaf).getData();
  }

  /**
   * Find concepts (across all terminologies)
   * Find concepts matching the specified search criteria
   * @param query search query, e.g. heart attack (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param handler search handler, e.g. STANDARD, EXACT, NGRAM. If &#39;SNOMED&#39; handler is used, a small delay may be added to prevent being blocked by 3rd party integration. (optional)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @param active active only, e.g. true (optional)
   * @param leaf active only, e.g. true (optional)
   * @return ApiResponse&lt;ResultListConcept&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConcept> findConceptsWithHttpInfo(String query, Integer offset, Integer limit, Boolean ascending, String sort, String handler, String resolver, Boolean active, Boolean leaf) throws ApiException {
    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "handler", handler));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolver", resolver));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "leaf", leaf));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConcept> localVarReturnType = new GenericType<ResultListConcept>() {};
    return apiClient.invokeAPI("TerminologyApi.findConcepts", "/terminology/concept", "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find concepts
   * Find concepts matching the specified search criteria
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param query search query, e.g. heart attack (optional)
   * @param expression ECL Expression, e.g. &lt;404684003 (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param handler search handler, e.g. STANDARD, EXACT, NGRAM. If &#39;SNOMED&#39; handler is used, a small delay may be added to prevent being blocked by 3rd party integration. (optional)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @param active active only, e.g. true (optional)
   * @param leaf active only, e.g. true (optional)
   * @return ResultListConcept
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConcept findConcepts1(String terminology, String query, String expression, Integer offset, Integer limit, Boolean ascending, String sort, String handler, String resolver, Boolean active, Boolean leaf) throws ApiException {
    return findConcepts1WithHttpInfo(terminology, query, expression, offset, limit, ascending, sort, handler, resolver, active, leaf).getData();
  }

  /**
   * Find concepts
   * Find concepts matching the specified search criteria
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param query search query, e.g. heart attack (optional)
   * @param expression ECL Expression, e.g. &lt;404684003 (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param handler search handler, e.g. STANDARD, EXACT, NGRAM. If &#39;SNOMED&#39; handler is used, a small delay may be added to prevent being blocked by 3rd party integration. (optional)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @param active active only, e.g. true (optional)
   * @param leaf active only, e.g. true (optional)
   * @return ApiResponse&lt;ResultListConcept&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConcept> findConcepts1WithHttpInfo(String terminology, String query, String expression, Integer offset, Integer limit, Boolean ascending, String sort, String handler, String resolver, Boolean active, Boolean leaf) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findConcepts1");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "expression", expression));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "handler", handler));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolver", resolver));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "leaf", leaf));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConcept> localVarReturnType = new GenericType<ResultListConcept>() {};
    return apiClient.invokeAPI("TerminologyApi.findConcepts1", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find mappings
   * Find mappings for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 6011000124106 (required)
   * @param query search query, e.g. heart attack (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @return ResultListMapping
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListMapping findMappings(String terminology, String code, String query, Integer offset, Integer limit, Boolean ascending, String sort) throws ApiException {
    return findMappingsWithHttpInfo(terminology, code, query, offset, limit, ascending, sort).getData();
  }

  /**
   * Find mappings
   * Find mappings for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 6011000124106 (required)
   * @param query search query, e.g. heart attack (optional)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @return ApiResponse&lt;ResultListMapping&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListMapping> findMappingsWithHttpInfo(String terminology, String code, String query, Integer offset, Integer limit, Boolean ascending, String sort) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findMappings");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling findMappings");
    }

    // Path parameters
    String localVarPath = "/terminology/mapset/{terminology}/{code}/mapping"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "query", query)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListMapping> localVarReturnType = new GenericType<ResultListMapping>() {};
    return apiClient.invokeAPI("TerminologyApi.findMappings", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get concept subset memberships
   * Get subsets that the specified terminology and code are a member of
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @return ResultListSubset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListSubset findSubsetMemberships(String terminology, String code) throws ApiException {
    return findSubsetMembershipsWithHttpInfo(terminology, code).getData();
  }

  /**
   * Get concept subset memberships
   * Get subsets that the specified terminology and code are a member of
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @return ApiResponse&lt;ResultListSubset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListSubset> findSubsetMembershipsWithHttpInfo(String terminology, String code) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findSubsetMemberships");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling findSubsetMemberships");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/subsets"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListSubset> localVarReturnType = new GenericType<ResultListSubset>() {};
    return apiClient.invokeAPI("TerminologyApi.findSubsetMemberships", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find tree position children
   * Find the child tree position nodes for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset  (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ResultListConceptTreePosition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConceptTreePosition findTreePositionChildren(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    return findTreePositionChildrenWithHttpInfo(terminology, code, offset, limit, ascending, sort, conceptFlag).getData();
  }

  /**
   * Find tree position children
   * Find the child tree position nodes for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset  (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ApiResponse&lt;ResultListConceptTreePosition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConceptTreePosition> findTreePositionChildrenWithHttpInfo(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findTreePositionChildren");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling findTreePositionChildren");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/trees/children"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "offset", offset)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conceptFlag", conceptFlag));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConceptTreePosition> localVarReturnType = new GenericType<ResultListConceptTreePosition>() {};
    return apiClient.invokeAPI("TerminologyApi.findTreePositionChildren", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find tree position descendants
   * Find the descendant tree position nodes for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset  (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ResultListConceptTreePosition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConceptTreePosition findTreePositionDescendants(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    return findTreePositionDescendantsWithHttpInfo(terminology, code, offset, limit, ascending, sort, conceptFlag).getData();
  }

  /**
   * Find tree position descendants
   * Find the descendant tree position nodes for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset  (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ApiResponse&lt;ResultListConceptTreePosition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConceptTreePosition> findTreePositionDescendantsWithHttpInfo(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findTreePositionDescendants");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling findTreePositionDescendants");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/trees/descendants"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "offset", offset)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conceptFlag", conceptFlag));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConceptTreePosition> localVarReturnType = new GenericType<ResultListConceptTreePosition>() {};
    return apiClient.invokeAPI("TerminologyApi.findTreePositionDescendants", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Find tree positions
   * Find tree positions for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ResultListConceptTreePosition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConceptTreePosition findTreePositions(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    return findTreePositionsWithHttpInfo(terminology, code, offset, limit, ascending, sort, conceptFlag).getData();
  }

  /**
   * Find tree positions
   * Find tree positions for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ApiResponse&lt;ResultListConceptTreePosition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConceptTreePosition> findTreePositionsWithHttpInfo(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean conceptFlag) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling findTreePositions");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling findTreePositions");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/trees"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "offset", offset)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conceptFlag", conceptFlag));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConceptTreePosition> localVarReturnType = new GenericType<ResultListConceptTreePosition>() {};
    return apiClient.invokeAPI("TerminologyApi.findTreePositions", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get concept
   * Get concept object for the specified terminology, code, and resolver
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param resolver graph resover, e.g. DEFAULT (optional)
   * @return Concept
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public Concept getConcept(String terminology, String code, String resolver) throws ApiException {
    return getConceptWithHttpInfo(terminology, code, resolver).getData();
  }

  /**
   * Get concept
   * Get concept object for the specified terminology, code, and resolver
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param resolver graph resover, e.g. DEFAULT (optional)
   * @return ApiResponse&lt;Concept&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Concept> getConceptWithHttpInfo(String terminology, String code, String resolver) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getConcept");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getConcept");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "resolver", resolver)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<Concept> localVarReturnType = new GenericType<Concept>() {};
    return apiClient.invokeAPI("TerminologyApi.getConcept", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get concept mappings
   * Get mappings that the specified terminology and code are mapped from
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 283231003 (required)
   * @return ResultListMapping
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListMapping getConceptMappings(String terminology, String code) throws ApiException {
    return getConceptMappingsWithHttpInfo(terminology, code).getData();
  }

  /**
   * Get concept mappings
   * Get mappings that the specified terminology and code are mapped from
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 283231003 (required)
   * @return ApiResponse&lt;ResultListMapping&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListMapping> getConceptMappingsWithHttpInfo(String terminology, String code) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getConceptMappings");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getConceptMappings");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/mapping"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListMapping> localVarReturnType = new GenericType<ResultListMapping>() {};
    return apiClient.invokeAPI("TerminologyApi.getConceptMappings", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get concepts
   * Get concepts for the specified terminology, code list, and resolver
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param codes concept codes, e.g. 71388002,404684003 (required)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @return List&lt;Concept&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<Concept> getConcepts(String terminology, String codes, String resolver) throws ApiException {
    return getConceptsWithHttpInfo(terminology, codes, resolver).getData();
  }

  /**
   * Get concepts
   * Get concepts for the specified terminology, code list, and resolver
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param codes concept codes, e.g. 71388002,404684003 (required)
   * @param resolver graph resolver, e.g. DEFAULT (optional)
   * @return ApiResponse&lt;List&lt;Concept&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Concept>> getConceptsWithHttpInfo(String terminology, String codes, String resolver) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getConcepts");
    }
    if (codes == null) {
      throw new ApiException(400, "Missing the required parameter 'codes' when calling getConcepts");
    }

    // Path parameters
    String localVarPath = "/terminology/concepts/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "codes", codes)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "resolver", resolver));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<Concept>> localVarReturnType = new GenericType<List<Concept>>() {};
    return apiClient.invokeAPI("TerminologyApi.getConcepts", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get properties
   * Get configuration information used to drive certain UI functionality
   * @return Map&lt;String, String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public Map<String, String> getConfigProperties() throws ApiException {
    return getConfigPropertiesWithHttpInfo().getData();
  }

  /**
   * Get properties
   * Get configuration information used to drive certain UI functionality
   * @return ApiResponse&lt;Map&lt;String, String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Map<String, String>> getConfigPropertiesWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<Map<String, String>> localVarReturnType = new GenericType<Map<String, String>>() {};
    return apiClient.invokeAPI("TerminologyApi.getConfigProperties", "/terminology/properties", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get mapset
   * Get mapsets for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 6011000124106 (required)
   * @return Mapset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public Mapset getMapset(String terminology, String code) throws ApiException {
    return getMapsetWithHttpInfo(terminology, code).getData();
  }

  /**
   * Get mapset
   * Get mapsets for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 6011000124106 (required)
   * @return ApiResponse&lt;Mapset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Mapset> getMapsetWithHttpInfo(String terminology, String code) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getMapset");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getMapset");
    }

    // Path parameters
    String localVarPath = "/terminology/mapset/{terminology}/{code}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<Mapset> localVarReturnType = new GenericType<Mapset>() {};
    return apiClient.invokeAPI("TerminologyApi.getMapset", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get mapsets
   * Get all mapsets for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ResultListMapset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListMapset getMapsets(String terminology) throws ApiException {
    return getMapsetsWithHttpInfo(terminology).getData();
  }

  /**
   * Get mapsets
   * Get all mapsets for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ApiResponse&lt;ResultListMapset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListMapset> getMapsetsWithHttpInfo(String terminology) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getMapsets");
    }

    // Path parameters
    String localVarPath = "/terminology/mapset/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListMapset> localVarReturnType = new GenericType<ResultListMapset>() {};
    return apiClient.invokeAPI("TerminologyApi.getMapsets", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get concept relationships
   * Get relationships for for specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param inverse search inverse side of relationships, e.g. false (optional)
   * @param active active only, e.g. true (optional)
   * @param filter  (optional)
   * @return ResultListConceptRelationship
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListConceptRelationship getRelationships(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean inverse, Boolean active, String filter) throws ApiException {
    return getRelationshipsWithHttpInfo(terminology, code, offset, limit, ascending, sort, inverse, active, filter).getData();
  }

  /**
   * Get concept relationships
   * Get relationships for for specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @param offset start index for search results (optional)
   * @param limit limit of results to return (optional)
   * @param ascending &lt;code&gt;true&lt;/code&gt; for ascending, &lt;code&gt;false&lt;/code&gt; for descending, &lt;code&gt;null&lt;/code&gt; for unspecified (optional)
   * @param sort comma-separated list of fields to sort on (optional)
   * @param inverse search inverse side of relationships, e.g. false (optional)
   * @param active active only, e.g. true (optional)
   * @param filter  (optional)
   * @return ApiResponse&lt;ResultListConceptRelationship&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListConceptRelationship> getRelationshipsWithHttpInfo(String terminology, String code, Integer offset, Integer limit, Boolean ascending, String sort, Boolean inverse, Boolean active, String filter) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getRelationships");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getRelationships");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/relationships"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "offset", offset)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "ascending", ascending));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "sort", sort));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "inverse", inverse));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListConceptRelationship> localVarReturnType = new GenericType<ResultListConceptRelationship>() {};
    return apiClient.invokeAPI("TerminologyApi.getRelationships", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get subset
   * Get subsets for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @return Subset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public Subset getSubset(String terminology, String code) throws ApiException {
    return getSubsetWithHttpInfo(terminology, code).getData();
  }

  /**
   * Get subset
   * Get subsets for the specified terminology and code
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 (required)
   * @return ApiResponse&lt;Subset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Subset> getSubsetWithHttpInfo(String terminology, String code) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getSubset");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getSubset");
    }

    // Path parameters
    String localVarPath = "/terminology/subset/{terminology}/{code}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<Subset> localVarReturnType = new GenericType<Subset>() {};
    return apiClient.invokeAPI("TerminologyApi.getSubset", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get subsets
   * Get all subsets for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ResultListSubset
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ResultListSubset getSubsets(String terminology) throws ApiException {
    return getSubsetsWithHttpInfo(terminology).getData();
  }

  /**
   * Get subsets
   * Get all subsets for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ApiResponse&lt;ResultListSubset&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ResultListSubset> getSubsetsWithHttpInfo(String terminology) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getSubsets");
    }

    // Path parameters
    String localVarPath = "/terminology/subset/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ResultListSubset> localVarReturnType = new GenericType<ResultListSubset>() {};
    return apiClient.invokeAPI("TerminologyApi.getSubsets", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get subtree
   * Get the subtree for the specified terminology and code. Use the special value &lt;i&gt;local&lt;/i&gt; for terminologies with anamespace-id attribute to compute the subtree of all local content.
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 or &#39;local&#39; (required)
   * @param maxLevel max level of depth to read, e.g. 3 (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ConceptTreePosition
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ConceptTreePosition getSubtree(String terminology, String code, Integer maxLevel, Boolean conceptFlag) throws ApiException {
    return getSubtreeWithHttpInfo(terminology, code, maxLevel, conceptFlag).getData();
  }

  /**
   * Get subtree
   * Get the subtree for the specified terminology and code. Use the special value &lt;i&gt;local&lt;/i&gt; for terminologies with anamespace-id attribute to compute the subtree of all local content.
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param code concept code, e.g. 71388002 or &#39;local&#39; (required)
   * @param maxLevel max level of depth to read, e.g. 3 (optional)
   * @param conceptFlag read concept information, e.g. true (optional)
   * @return ApiResponse&lt;ConceptTreePosition&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<ConceptTreePosition> getSubtreeWithHttpInfo(String terminology, String code, Integer maxLevel, Boolean conceptFlag) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getSubtree");
    }
    if (code == null) {
      throw new ApiException(400, "Missing the required parameter 'code' when calling getSubtree");
    }

    // Path parameters
    String localVarPath = "/terminology/concept/{terminology}/{code}/subtree"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology))
            .replaceAll("\\{code}", apiClient.escapeString(code));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "maxLevel", maxLevel)
    );
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "conceptFlag", conceptFlag));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<ConceptTreePosition> localVarReturnType = new GenericType<ConceptTreePosition>() {};
    return apiClient.invokeAPI("TerminologyApi.getSubtree", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get terminologies
   * Get all terminologies
   * @return List&lt;Terminology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<Terminology> getTerminologies() throws ApiException {
    return getTerminologiesWithHttpInfo().getData();
  }

  /**
   * Get terminologies
   * Get all terminologies
   * @return ApiResponse&lt;List&lt;Terminology&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<Terminology>> getTerminologiesWithHttpInfo() throws ApiException {
    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<Terminology>> localVarReturnType = new GenericType<List<Terminology>>() {};
    return apiClient.invokeAPI("TerminologyApi.getTerminologies", "/terminology", "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get terminology
   * Get terminology object for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return Terminology
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public Terminology getTerminology(String terminology) throws ApiException {
    return getTerminologyWithHttpInfo(terminology).getData();
  }

  /**
   * Get terminology
   * Get terminology object for the specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ApiResponse&lt;Terminology&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Terminology> getTerminologyWithHttpInfo(String terminology) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getTerminology");
    }

    // Path parameters
    String localVarPath = "/terminology/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<Terminology> localVarReturnType = new GenericType<Terminology>() {};
    return apiClient.invokeAPI("TerminologyApi.getTerminology", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
  /**
   * Get terminology metadata
   * Get map of terminology abbreviations to metadata for specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public void getTerminologyMetadata(String terminology) throws ApiException {
    getTerminologyMetadataWithHttpInfo(terminology);
  }

  /**
   * Get terminology metadata
   * Get map of terminology abbreviations to metadata for specified terminology
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<Void> getTerminologyMetadataWithHttpInfo(String terminology) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling getTerminologyMetadata");
    }

    // Path parameters
    String localVarPath = "/terminology/metadata/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    return apiClient.invokeAPI("TerminologyApi.getTerminologyMetadata", localVarPath, "GET", new ArrayList<>(), null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, null, false);
  }
  /**
   * Resolve expression
   * Get concept ids corresponding to thespecified terminology and expression. For more information on working with expressions, see &lt;a href&#x3D;\&quot;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md\&quot;&gt;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md&lt;/a&gt;.
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param expression ECL Expression, e.g. &lt;404684003 (required)
   * @return List&lt;String&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public List<String> resolveExpression(String terminology, String expression) throws ApiException {
    return resolveExpressionWithHttpInfo(terminology, expression).getData();
  }

  /**
   * Resolve expression
   * Get concept ids corresponding to thespecified terminology and expression. For more information on working with expressions, see &lt;a href&#x3D;\&quot;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md\&quot;&gt;https://github.com/WestCoastInformatics/wci-terminology-service-in-5-minutes/blob/master/doc/EXPRESSION.md&lt;/a&gt;.
   * @param terminology terminology, e.g. SNOMEDCT_US (required)
   * @param expression ECL Expression, e.g. &lt;404684003 (required)
   * @return ApiResponse&lt;List&lt;String&gt;&gt;
   * @throws ApiException if fails to make API call
   * @http.response.details
     <table summary="Response Details" border="1">
       <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
       <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
       <tr><td> 401 </td><td> Unauthorized </td><td>  -  </td></tr>
       <tr><td> 403 </td><td> Forbidden </td><td>  -  </td></tr>
       <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
   */
  public ApiResponse<List<String>> resolveExpressionWithHttpInfo(String terminology, String expression) throws ApiException {
    // Check required parameters
    if (terminology == null) {
      throw new ApiException(400, "Missing the required parameter 'terminology' when calling resolveExpression");
    }
    if (expression == null) {
      throw new ApiException(400, "Missing the required parameter 'expression' when calling resolveExpression");
    }

    // Path parameters
    String localVarPath = "/terminology/expr/{terminology}"
            .replaceAll("\\{terminology}", apiClient.escapeString(terminology));

    // Query parameters
    List<Pair> localVarQueryParams = new ArrayList<>(
            apiClient.parameterToPairs("", "expression", expression)
    );

    String localVarAccept = apiClient.selectHeaderAccept("application/json");
    String localVarContentType = apiClient.selectHeaderContentType();
    String[] localVarAuthNames = new String[] {"bearerAuth"};
    GenericType<List<String>> localVarReturnType = new GenericType<List<String>>() {};
    return apiClient.invokeAPI("TerminologyApi.resolveExpression", localVarPath, "GET", localVarQueryParams, null,
                               new LinkedHashMap<>(), new LinkedHashMap<>(), new LinkedHashMap<>(), localVarAccept, localVarContentType,
                               localVarAuthNames, localVarReturnType, false);
  }
}
