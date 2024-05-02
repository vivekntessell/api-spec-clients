package com.tessell.benchmark.client.api;

import com.tessell.benchmark.client.invoker.ApiClient;

import com.tessell.benchmark.client.model.TessellApiErrorDTO;
import com.tessell.benchmark.client.model.TessellApiErrorOpsDTO;
import com.tessell.benchmark.client.model.TessellBenchmarkCatalogDTO;
import com.tessell.benchmark.client.model.TessellBenchmarkDTO;
import java.util.UUID;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.tessell.common.context.APIContextPropagation;

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:13.006260+05:30[Asia/Kolkata]")
@Component("com.tessell.benchmark.client.api.BenchmarkControllerApi")
public class BenchmarkControllerApi {
    private ApiClient apiClient;

    public BenchmarkControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public BenchmarkControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create new benchmark request
     * Create new benchmark request
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBenchmarkDTO Create benchmark (required)
     * @return TessellBenchmarkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBenchmarkDTO createBenchmark(TessellBenchmarkDTO tessellBenchmarkDTO) throws RestClientException {
        return createBenchmarkWithHttpInfo(tessellBenchmarkDTO).getBody();
    }

    /**
     * Create new benchmark request
     * Create new benchmark request
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBenchmarkDTO Create benchmark (required)
     * @return ResponseEntity&lt;TessellBenchmarkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBenchmarkDTO> createBenchmarkWithHttpInfo(TessellBenchmarkDTO tessellBenchmarkDTO) throws RestClientException {
        Object postBody = tessellBenchmarkDTO;
        
        // verify the required parameter 'tessellBenchmarkDTO' is set
        if (tessellBenchmarkDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBenchmarkDTO' when calling createBenchmark");
        }
        
        String path = apiClient.expandPath("/benchmarks", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBenchmarkDTO> returnType = new ParameterizedTypeReference<TessellBenchmarkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Fetch benchmark by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return TessellBenchmarkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBenchmarkDTO getBenchmarkById(UUID id) throws RestClientException {
        return getBenchmarkByIdWithHttpInfo(id).getBody();
    }

    /**
     * Fetch benchmark by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return ResponseEntity&lt;TessellBenchmarkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBenchmarkDTO> getBenchmarkByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBenchmarkById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/benchmarks/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBenchmarkDTO> returnType = new ParameterizedTypeReference<TessellBenchmarkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Fetch list of supported benchmarks (catalog)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param engineType Engine type for the benchmark (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return List&lt;TessellBenchmarkCatalogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBenchmarkCatalogDTO> getBenchmarkCatalog(String tenantId, String engineType, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getBenchmarkCatalogWithHttpInfo(tenantId, engineType, pageOffset, pageSize).getBody();
    }

    /**
     * Fetch list of supported benchmarks (catalog)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param engineType Engine type for the benchmark (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;TessellBenchmarkCatalogDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBenchmarkCatalogDTO>> getBenchmarkCatalogWithHttpInfo(String tenantId, String engineType, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBenchmarkCatalog");
        }
        
        String path = apiClient.expandPath("/benchmark-catalog", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engineType", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<List<TessellBenchmarkCatalogDTO>> returnType = new ParameterizedTypeReference<List<TessellBenchmarkCatalogDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Fetch benchmark catalog entry by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return TessellBenchmarkCatalogDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBenchmarkCatalogDTO getBenchmarkCatalogEntryById(UUID id) throws RestClientException {
        return getBenchmarkCatalogEntryByIdWithHttpInfo(id).getBody();
    }

    /**
     * Fetch benchmark catalog entry by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return ResponseEntity&lt;TessellBenchmarkCatalogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBenchmarkCatalogDTO> getBenchmarkCatalogEntryByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBenchmarkCatalogEntryById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/benchmarks-catalog/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBenchmarkCatalogDTO> returnType = new ParameterizedTypeReference<TessellBenchmarkCatalogDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Fetch list of current benchmarks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Benchmark id (optional)
     * @param service Service id (optional)
     * @param username Username of the benchmark submitter (optional)
     * @param status status (optional)
     * @param timeRangeStart Start time of time range to compare against benchmark update timestamp (optional)
     * @param timeRangeEnd End time of time range to compare against benchmark update timestamp (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return List&lt;TessellBenchmarkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBenchmarkDTO> getBenchmarks(String tenantId, UUID id, UUID service, String username, String status, String timeRangeStart, String timeRangeEnd, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getBenchmarksWithHttpInfo(tenantId, id, service, username, status, timeRangeStart, timeRangeEnd, pageOffset, pageSize).getBody();
    }

    /**
     * Fetch list of current benchmarks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Benchmark id (optional)
     * @param service Service id (optional)
     * @param username Username of the benchmark submitter (optional)
     * @param status status (optional)
     * @param timeRangeStart Start time of time range to compare against benchmark update timestamp (optional)
     * @param timeRangeEnd End time of time range to compare against benchmark update timestamp (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;TessellBenchmarkDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBenchmarkDTO>> getBenchmarksWithHttpInfo(String tenantId, UUID id, UUID service, String username, String status, String timeRangeStart, String timeRangeEnd, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBenchmarks");
        }
        
        String path = apiClient.expandPath("/benchmarks", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service", service));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "username", username));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeRangeStart", timeRangeStart));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeRangeEnd", timeRangeEnd));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<List<TessellBenchmarkDTO>> returnType = new ParameterizedTypeReference<List<TessellBenchmarkDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update benchmark by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @param tessellBenchmarkDTO Update benchmark (required)
     * @return TessellBenchmarkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBenchmarkDTO updateBenchmarkById(UUID id, TessellBenchmarkDTO tessellBenchmarkDTO) throws RestClientException {
        return updateBenchmarkByIdWithHttpInfo(id, tessellBenchmarkDTO).getBody();
    }

    /**
     * Update benchmark by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @param tessellBenchmarkDTO Update benchmark (required)
     * @return ResponseEntity&lt;TessellBenchmarkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBenchmarkDTO> updateBenchmarkByIdWithHttpInfo(UUID id, TessellBenchmarkDTO tessellBenchmarkDTO) throws RestClientException {
        Object postBody = tessellBenchmarkDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateBenchmarkById");
        }
        
        // verify the required parameter 'tessellBenchmarkDTO' is set
        if (tessellBenchmarkDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBenchmarkDTO' when calling updateBenchmarkById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/benchmarks/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBenchmarkDTO> returnType = new ParameterizedTypeReference<TessellBenchmarkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
