package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.ConnectionPoolListOpsResponse;
import com.tessell.database.system.client.model.ConnectionPoolListResponse;
import com.tessell.database.system.client.model.ConnectionPoolOpsInfo;
import com.tessell.database.system.client.model.CreateConnectionPoolCallbackPayload;
import com.tessell.database.system.client.model.CreateConnectionPoolPayload;
import com.tessell.database.system.client.model.DeleteConnectionPoolCallbackPayload;
import com.tessell.database.system.client.model.DeleteConnectionPoolPayload;
import com.tessell.database.system.client.model.TaskSummary;
import java.util.UUID;
import com.tessell.database.system.client.model.UpdateConnectionPoolCallbackPayload;
import com.tessell.database.system.client.model.UpdateConnectionPoolPayload;

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
@Component("com.tessell.database.system.client.api.TessellConnectionPoolApi")
public class TessellConnectionPoolApi {
    private ApiClient apiClient;

    public TessellConnectionPoolApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellConnectionPoolApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a new connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createConnectionPoolPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createConnectionPoolForTessellService(UUID serviceId, CreateConnectionPoolPayload createConnectionPoolPayload) throws RestClientException {
        return createConnectionPoolForTessellServiceWithHttpInfo(serviceId, createConnectionPoolPayload).getBody();
    }

    /**
     * Creates a new connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createConnectionPoolPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createConnectionPoolForTessellServiceWithHttpInfo(UUID serviceId, CreateConnectionPoolPayload createConnectionPoolPayload) throws RestClientException {
        Object postBody = createConnectionPoolPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createConnectionPoolForTessellService");
        }
        
        // verify the required parameter 'createConnectionPoolPayload' is set
        if (createConnectionPoolPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createConnectionPoolPayload' when calling createConnectionPoolForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/connection-pools", uriVariables);

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createConnectionPoolCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createConnectionPoolForTessellServiceCallback(UUID serviceId, CreateConnectionPoolCallbackPayload createConnectionPoolCallbackPayload) throws RestClientException {
        createConnectionPoolForTessellServiceCallbackWithHttpInfo(serviceId, createConnectionPoolCallbackPayload);
    }

    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createConnectionPoolCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createConnectionPoolForTessellServiceCallbackWithHttpInfo(UUID serviceId, CreateConnectionPoolCallbackPayload createConnectionPoolCallbackPayload) throws RestClientException {
        Object postBody = createConnectionPoolCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createConnectionPoolForTessellServiceCallback");
        }
        
        // verify the required parameter 'createConnectionPoolCallbackPayload' is set
        if (createConnectionPoolCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createConnectionPoolCallbackPayload' when calling createConnectionPoolForTessellServiceCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/callback/create", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an existing connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deleteConnectionPoolPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteConnectionPoolForTessellService(UUID serviceId, DeleteConnectionPoolPayload deleteConnectionPoolPayload) throws RestClientException {
        return deleteConnectionPoolForTessellServiceWithHttpInfo(serviceId, deleteConnectionPoolPayload).getBody();
    }

    /**
     * Delete an existing connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deleteConnectionPoolPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteConnectionPoolForTessellServiceWithHttpInfo(UUID serviceId, DeleteConnectionPoolPayload deleteConnectionPoolPayload) throws RestClientException {
        Object postBody = deleteConnectionPoolPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteConnectionPoolForTessellService");
        }
        
        // verify the required parameter 'deleteConnectionPoolPayload' is set
        if (deleteConnectionPoolPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteConnectionPoolPayload' when calling deleteConnectionPoolForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/connection-pools", uriVariables);

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deleteConnectionPoolCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteConnectionPoolForTessellServiceCallback(UUID serviceId, DeleteConnectionPoolCallbackPayload deleteConnectionPoolCallbackPayload) throws RestClientException {
        deleteConnectionPoolForTessellServiceCallbackWithHttpInfo(serviceId, deleteConnectionPoolCallbackPayload);
    }

    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deleteConnectionPoolCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteConnectionPoolForTessellServiceCallbackWithHttpInfo(UUID serviceId, DeleteConnectionPoolCallbackPayload deleteConnectionPoolCallbackPayload) throws RestClientException {
        Object postBody = deleteConnectionPoolCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteConnectionPoolForTessellServiceCallback");
        }
        
        // verify the required parameter 'deleteConnectionPoolCallbackPayload' is set
        if (deleteConnectionPoolCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteConnectionPoolCallbackPayload' when calling deleteConnectionPoolForTessellServiceCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/callback/delete", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteConnectionPoolForTessellServiceOps(UUID serviceId, UUID connectionPoolId, Boolean softDelete) throws RestClientException {
        return deleteConnectionPoolForTessellServiceOpsWithHttpInfo(serviceId, connectionPoolId, softDelete).getBody();
    }

    /**
     * Delete the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteConnectionPoolForTessellServiceOpsWithHttpInfo(UUID serviceId, UUID connectionPoolId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteConnectionPoolForTessellServiceOps");
        }
        
        // verify the required parameter 'connectionPoolId' is set
        if (connectionPoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolId' when calling deleteConnectionPoolForTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("connection-pool-id", connectionPoolId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/{connection-pool-id}", uriVariables);

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
     * Get the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @return ConnectionPoolOpsInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectionPoolOpsInfo getConnectionPoolForTessellServiceOps(UUID serviceId, UUID connectionPoolId) throws RestClientException {
        return getConnectionPoolForTessellServiceOpsWithHttpInfo(serviceId, connectionPoolId).getBody();
    }

    /**
     * Get the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @return ResponseEntity&lt;ConnectionPoolOpsInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectionPoolOpsInfo> getConnectionPoolForTessellServiceOpsWithHttpInfo(UUID serviceId, UUID connectionPoolId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getConnectionPoolForTessellServiceOps");
        }
        
        // verify the required parameter 'connectionPoolId' is set
        if (connectionPoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolId' when calling getConnectionPoolForTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("connection-pool-id", connectionPoolId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/{connection-pool-id}", uriVariables);

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

    ParameterizedTypeReference<ConnectionPoolOpsInfo> returnType = new ParameterizedTypeReference<ConnectionPoolOpsInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of connection pools for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param name Name of connection pool whose details will be returned. (optional)
     * @return ConnectionPoolListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectionPoolListResponse getConnectionPoolsForTessellService(UUID serviceId, String name) throws RestClientException {
        return getConnectionPoolsForTessellServiceWithHttpInfo(serviceId, name).getBody();
    }

    /**
     * Get list of connection pools for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param name Name of connection pool whose details will be returned. (optional)
     * @return ResponseEntity&lt;ConnectionPoolListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectionPoolListResponse> getConnectionPoolsForTessellServiceWithHttpInfo(UUID serviceId, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getConnectionPoolsForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/connection-pools", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    ParameterizedTypeReference<ConnectionPoolListResponse> returnType = new ParameterizedTypeReference<ConnectionPoolListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of connection pools
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param name Name of connection pool whose details will be returned. (optional)
     * @return ConnectionPoolListOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectionPoolListOpsResponse getConnectionPoolsForTessellServiceOps(UUID serviceId, String name) throws RestClientException {
        return getConnectionPoolsForTessellServiceOpsWithHttpInfo(serviceId, name).getBody();
    }

    /**
     * Get list of connection pools
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param name Name of connection pool whose details will be returned. (optional)
     * @return ResponseEntity&lt;ConnectionPoolListOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectionPoolListOpsResponse> getConnectionPoolsForTessellServiceOpsWithHttpInfo(UUID serviceId, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getConnectionPoolsForTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    ParameterizedTypeReference<ConnectionPoolListOpsResponse> returnType = new ParameterizedTypeReference<ConnectionPoolListOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update an existing connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId The ID of the connection pool (required)
     * @param updateConnectionPoolPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateConnectionPoolForTessellService(UUID serviceId, UUID connectionPoolId, UpdateConnectionPoolPayload updateConnectionPoolPayload) throws RestClientException {
        return updateConnectionPoolForTessellServiceWithHttpInfo(serviceId, connectionPoolId, updateConnectionPoolPayload).getBody();
    }

    /**
     * Update an existing connection pool for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId The ID of the connection pool (required)
     * @param updateConnectionPoolPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateConnectionPoolForTessellServiceWithHttpInfo(UUID serviceId, UUID connectionPoolId, UpdateConnectionPoolPayload updateConnectionPoolPayload) throws RestClientException {
        Object postBody = updateConnectionPoolPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateConnectionPoolForTessellService");
        }
        
        // verify the required parameter 'connectionPoolId' is set
        if (connectionPoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolId' when calling updateConnectionPoolForTessellService");
        }
        
        // verify the required parameter 'updateConnectionPoolPayload' is set
        if (updateConnectionPoolPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateConnectionPoolPayload' when calling updateConnectionPoolForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("connection-pool-id", connectionPoolId);
        String path = apiClient.expandPath("/services/{service-id}/connection-pools/{connection-pool-id}", uriVariables);

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param updateConnectionPoolCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateConnectionPoolForTessellServiceCallback(UUID serviceId, UpdateConnectionPoolCallbackPayload updateConnectionPoolCallbackPayload) throws RestClientException {
        updateConnectionPoolForTessellServiceCallbackWithHttpInfo(serviceId, updateConnectionPoolCallbackPayload);
    }

    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param updateConnectionPoolCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateConnectionPoolForTessellServiceCallbackWithHttpInfo(UUID serviceId, UpdateConnectionPoolCallbackPayload updateConnectionPoolCallbackPayload) throws RestClientException {
        Object postBody = updateConnectionPoolCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateConnectionPoolForTessellServiceCallback");
        }
        
        // verify the required parameter 'updateConnectionPoolCallbackPayload' is set
        if (updateConnectionPoolCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateConnectionPoolCallbackPayload' when calling updateConnectionPoolForTessellServiceCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/callback/update", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @param connectionPoolOpsInfo  (required)
     * @return ConnectionPoolOpsInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ConnectionPoolOpsInfo updateConnectionPoolForTessellServiceOps(UUID serviceId, UUID connectionPoolId, ConnectionPoolOpsInfo connectionPoolOpsInfo) throws RestClientException {
        return updateConnectionPoolForTessellServiceOpsWithHttpInfo(serviceId, connectionPoolId, connectionPoolOpsInfo).getBody();
    }

    /**
     * Update the connection pool corresponding to given uuid.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param connectionPoolId Connection Pool Id (required)
     * @param connectionPoolOpsInfo  (required)
     * @return ResponseEntity&lt;ConnectionPoolOpsInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ConnectionPoolOpsInfo> updateConnectionPoolForTessellServiceOpsWithHttpInfo(UUID serviceId, UUID connectionPoolId, ConnectionPoolOpsInfo connectionPoolOpsInfo) throws RestClientException {
        Object postBody = connectionPoolOpsInfo;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateConnectionPoolForTessellServiceOps");
        }
        
        // verify the required parameter 'connectionPoolId' is set
        if (connectionPoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolId' when calling updateConnectionPoolForTessellServiceOps");
        }
        
        // verify the required parameter 'connectionPoolOpsInfo' is set
        if (connectionPoolOpsInfo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'connectionPoolOpsInfo' when calling updateConnectionPoolForTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("connection-pool-id", connectionPoolId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connection-pools/{connection-pool-id}", uriVariables);

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

    ParameterizedTypeReference<ConnectionPoolOpsInfo> returnType = new ParameterizedTypeReference<ConnectionPoolOpsInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
