package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.TessellDBServerSystemDTO;
import com.tessell.database.system.client.model.TessellDBServerSystemListResponse;
import com.tessell.database.system.client.model.TessellDbssCrMappingDTO;
import com.tessell.database.system.client.model.TessellDbssCrMappingListResponse;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@Component("com.tessell.database.system.client.api.TessellDbServerSystemControllerApi")
public class TessellDbServerSystemControllerApi {
    private ApiClient apiClient;

    public TessellDbServerSystemControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellDbServerSystemControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDBServerSystemDTO  (required)
     * @return TessellDBServerSystemDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDBServerSystemDTO createDBServerSystem(TessellDBServerSystemDTO tessellDBServerSystemDTO) throws RestClientException {
        return createDBServerSystemWithHttpInfo(tessellDBServerSystemDTO).getBody();
    }

    /**
     * Create a new Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDBServerSystemDTO  (required)
     * @return ResponseEntity&lt;TessellDBServerSystemDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDBServerSystemDTO> createDBServerSystemWithHttpInfo(TessellDBServerSystemDTO tessellDBServerSystemDTO) throws RestClientException {
        Object postBody = tessellDBServerSystemDTO;
        
        // verify the required parameter 'tessellDBServerSystemDTO' is set
        if (tessellDBServerSystemDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDBServerSystemDTO' when calling createDBServerSystem");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellDBServerSystemDTO> returnType = new ParameterizedTypeReference<TessellDBServerSystemDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param tessellDbssCrMappingDTO  (required)
     * @return TessellDbssCrMappingDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbssCrMappingDTO createDbssCrMapping(UUID dbserverSystemId, TessellDbssCrMappingDTO tessellDbssCrMappingDTO) throws RestClientException {
        return createDbssCrMappingWithHttpInfo(dbserverSystemId, tessellDbssCrMappingDTO).getBody();
    }

    /**
     * Create a new Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param tessellDbssCrMappingDTO  (required)
     * @return ResponseEntity&lt;TessellDbssCrMappingDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbssCrMappingDTO> createDbssCrMappingWithHttpInfo(UUID dbserverSystemId, TessellDbssCrMappingDTO tessellDbssCrMappingDTO) throws RestClientException {
        Object postBody = tessellDbssCrMappingDTO;
        
        // verify the required parameter 'dbserverSystemId' is set
        if (dbserverSystemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbserverSystemId' when calling createDbssCrMapping");
        }
        
        // verify the required parameter 'tessellDbssCrMappingDTO' is set
        if (tessellDbssCrMappingDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDbssCrMappingDTO' when calling createDbssCrMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dbserverSystemId", dbserverSystemId);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources", uriVariables);

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

    ParameterizedTypeReference<TessellDbssCrMappingDTO> returnType = new ParameterizedTypeReference<TessellDbssCrMappingDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDBServerSystem(UUID id, Boolean softDelete) throws RestClientException {
        return deleteDBServerSystemWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDBServerSystemWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDBServerSystem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId computeResourceId (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDbssCrMapping(UUID dbserverSystemId, UUID computeResourceId, Boolean softDelete) throws RestClientException {
        return deleteDbssCrMappingWithHttpInfo(dbserverSystemId, computeResourceId, softDelete).getBody();
    }

    /**
     * Delete a Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId computeResourceId (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDbssCrMappingWithHttpInfo(UUID dbserverSystemId, UUID computeResourceId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dbserverSystemId' is set
        if (dbserverSystemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbserverSystemId' when calling deleteDbssCrMapping");
        }
        
        // verify the required parameter 'computeResourceId' is set
        if (computeResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceId' when calling deleteDbssCrMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dbserverSystemId", dbserverSystemId);
        uriVariables.put("computeResourceId", computeResourceId);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources/{computeResourceId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell DBServer Systems By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param loadComputeResourceMappings load-compute-resource-mappings (optional, default to true)
     * @param loadComputeResources load-compute-resources (optional, default to true)
     * @return TessellDBServerSystemDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDBServerSystemDTO getDBServerSystemById(UUID id, Boolean loadComputeResourceMappings, Boolean loadComputeResources) throws RestClientException {
        return getDBServerSystemByIdWithHttpInfo(id, loadComputeResourceMappings, loadComputeResources).getBody();
    }

    /**
     * View available Tessell DBServer Systems By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param loadComputeResourceMappings load-compute-resource-mappings (optional, default to true)
     * @param loadComputeResources load-compute-resources (optional, default to true)
     * @return ResponseEntity&lt;TessellDBServerSystemDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDBServerSystemDTO> getDBServerSystemByIdWithHttpInfo(UUID id, Boolean loadComputeResourceMappings, Boolean loadComputeResources) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDBServerSystemById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resource-mappings", loadComputeResourceMappings));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resources", loadComputeResources));

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

    ParameterizedTypeReference<TessellDBServerSystemDTO> returnType = new ParameterizedTypeReference<TessellDBServerSystemDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell DBServer Systems
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param all all (optional, default to true)
     * @param loadComputeResourceMappings load-compute-resource-mappings (optional, default to true)
     * @param loadComputeResources load-compute-resources (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDBServerSystemListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDBServerSystemListResponse getDBServerSystems(String name, String status, String engineType, Boolean all, Boolean loadComputeResourceMappings, Boolean loadComputeResources, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDBServerSystemsWithHttpInfo(name, status, engineType, all, loadComputeResourceMappings, loadComputeResources, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell DBServer Systems
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param all all (optional, default to true)
     * @param loadComputeResourceMappings load-compute-resource-mappings (optional, default to true)
     * @param loadComputeResources load-compute-resources (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDBServerSystemListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDBServerSystemListResponse> getDBServerSystemsWithHttpInfo(String name, String status, String engineType, Boolean all, Boolean loadComputeResourceMappings, Boolean loadComputeResources, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "all", all));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resource-mappings", loadComputeResourceMappings));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resources", loadComputeResources));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellDBServerSystemListResponse> returnType = new ParameterizedTypeReference<TessellDBServerSystemListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell DBServer System and Compute Resource Mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId compute-resource-id (optional)
     * @return TessellDbssCrMappingDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbssCrMappingDTO getDbssCrMapping(UUID dbserverSystemId, UUID computeResourceId) throws RestClientException {
        return getDbssCrMappingWithHttpInfo(dbserverSystemId, computeResourceId).getBody();
    }

    /**
     * View a list of available Tessell DBServer System and Compute Resource Mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId compute-resource-id (optional)
     * @return ResponseEntity&lt;TessellDbssCrMappingDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbssCrMappingDTO> getDbssCrMappingWithHttpInfo(UUID dbserverSystemId, UUID computeResourceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dbserverSystemId' is set
        if (dbserverSystemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbserverSystemId' when calling getDbssCrMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dbserverSystemId", dbserverSystemId);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resource", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-resource-id", computeResourceId));

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

    ParameterizedTypeReference<TessellDbssCrMappingDTO> returnType = new ParameterizedTypeReference<TessellDbssCrMappingDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell DBServer System and Compute Resource Mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDbssCrMappingListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbssCrMappingListResponse getDbssCrMappings(UUID dbserverSystemId, String status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbssCrMappingsWithHttpInfo(dbserverSystemId, status, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell DBServer System and Compute Resource Mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDbssCrMappingListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbssCrMappingListResponse> getDbssCrMappingsWithHttpInfo(UUID dbserverSystemId, String status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dbserverSystemId' is set
        if (dbserverSystemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbserverSystemId' when calling getDbssCrMappings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dbserverSystemId", dbserverSystemId);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellDbssCrMappingListResponse> returnType = new ParameterizedTypeReference<TessellDbssCrMappingListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDBServerSystemDTO  (required)
     * @return TessellDBServerSystemDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDBServerSystemDTO updateDBServerSystem(UUID id, TessellDBServerSystemDTO tessellDBServerSystemDTO) throws RestClientException {
        return updateDBServerSystemWithHttpInfo(id, tessellDBServerSystemDTO).getBody();
    }

    /**
     * Update a Tessell DBServer System
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDBServerSystemDTO  (required)
     * @return ResponseEntity&lt;TessellDBServerSystemDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDBServerSystemDTO> updateDBServerSystemWithHttpInfo(UUID id, TessellDBServerSystemDTO tessellDBServerSystemDTO) throws RestClientException {
        Object postBody = tessellDBServerSystemDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDBServerSystem");
        }
        
        // verify the required parameter 'tessellDBServerSystemDTO' is set
        if (tessellDBServerSystemDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDBServerSystemDTO' when calling updateDBServerSystem");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDBServerSystemDTO> returnType = new ParameterizedTypeReference<TessellDBServerSystemDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId computeResourceId (required)
     * @param tessellDbssCrMappingDTO  (required)
     * @return TessellDbssCrMappingDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbssCrMappingDTO updateDbssCrMapping(UUID dbserverSystemId, UUID computeResourceId, TessellDbssCrMappingDTO tessellDbssCrMappingDTO) throws RestClientException {
        return updateDbssCrMappingWithHttpInfo(dbserverSystemId, computeResourceId, tessellDbssCrMappingDTO).getBody();
    }

    /**
     * Update a Tessell DBServer System and Compute Resource Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbserverSystemId dbserverSystemId (required)
     * @param computeResourceId computeResourceId (required)
     * @param tessellDbssCrMappingDTO  (required)
     * @return ResponseEntity&lt;TessellDbssCrMappingDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbssCrMappingDTO> updateDbssCrMappingWithHttpInfo(UUID dbserverSystemId, UUID computeResourceId, TessellDbssCrMappingDTO tessellDbssCrMappingDTO) throws RestClientException {
        Object postBody = tessellDbssCrMappingDTO;
        
        // verify the required parameter 'dbserverSystemId' is set
        if (dbserverSystemId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbserverSystemId' when calling updateDbssCrMapping");
        }
        
        // verify the required parameter 'computeResourceId' is set
        if (computeResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceId' when calling updateDbssCrMapping");
        }
        
        // verify the required parameter 'tessellDbssCrMappingDTO' is set
        if (tessellDbssCrMappingDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDbssCrMappingDTO' when calling updateDbssCrMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dbserverSystemId", dbserverSystemId);
        uriVariables.put("computeResourceId", computeResourceId);
        String path = apiClient.expandPath("/tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources/{computeResourceId}", uriVariables);

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

    ParameterizedTypeReference<TessellDbssCrMappingDTO> returnType = new ParameterizedTypeReference<TessellDbssCrMappingDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
