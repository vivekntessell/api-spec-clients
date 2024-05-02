package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.CreateDatabasePayload;
import com.tessell.database.system.client.model.CrudDatabaseCallbackPayload;
import com.tessell.database.system.client.model.DatabaseStatusOps;
import com.tessell.database.system.client.model.DatabaseStorageMappingStatus;
import com.tessell.database.system.client.model.TaskSummary;
import com.tessell.database.system.client.model.TessellDatabaseDeleteOpsRequestPayload;
import com.tessell.database.system.client.model.TessellDatabaseOpsDTO;
import com.tessell.database.system.client.model.TessellDatabaseStorageMappingListResponse;
import com.tessell.database.system.client.model.TessellDatabasesOpsResponse;
import com.tessell.database.system.client.model.TessellServiceMetadataDTO;
import com.tessell.database.system.client.model.TessellServiceMetadataListResponse;
import com.tessell.database.system.client.model.TessellServiceStorageMappingDTO;
import java.util.UUID;
import com.tessell.database.system.client.model.UpdateDatabasePayload;

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
@Component("com.tessell.database.system.client.api.TessellDatabaseControllerApi")
public class TessellDatabaseControllerApi {
    private ApiClient apiClient;

    public TessellDatabaseControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellDatabaseControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param tessellDatabaseOpsDTO  (required)
     * @return TessellDatabaseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOpsDTO createDatabaseOps(UUID serviceId, TessellDatabaseOpsDTO tessellDatabaseOpsDTO) throws RestClientException {
        return createDatabaseOpsWithHttpInfo(serviceId, tessellDatabaseOpsDTO).getBody();
    }

    /**
     * Create a Database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param tessellDatabaseOpsDTO  (required)
     * @return ResponseEntity&lt;TessellDatabaseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOpsDTO> createDatabaseOpsWithHttpInfo(UUID serviceId, TessellDatabaseOpsDTO tessellDatabaseOpsDTO) throws RestClientException {
        Object postBody = tessellDatabaseOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDatabaseOps");
        }
        
        // verify the required parameter 'tessellDatabaseOpsDTO' is set
        if (tessellDatabaseOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDatabaseOpsDTO' when calling createDatabaseOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOpsDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new database in a Tessell service. Note that this is an \&quot;tessell-ops\&quot; version of post &#39;/services/{service-id}/databases&#39;
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param createDatabasePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createDatabaseOpsRequest(UUID serviceId, List<CreateDatabasePayload> createDatabasePayload) throws RestClientException {
        return createDatabaseOpsRequestWithHttpInfo(serviceId, createDatabasePayload).getBody();
    }

    /**
     * Create a new database in a Tessell service. Note that this is an \&quot;tessell-ops\&quot; version of post &#39;/services/{service-id}/databases&#39;
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param createDatabasePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createDatabaseOpsRequestWithHttpInfo(UUID serviceId, List<CreateDatabasePayload> createDatabasePayload) throws RestClientException {
        Object postBody = createDatabasePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDatabaseOpsRequest");
        }
        
        // verify the required parameter 'createDatabasePayload' is set
        if (createDatabasePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDatabasePayload' when calling createDatabaseOpsRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/create", uriVariables);

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
     * Create a new database in a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service to which database will be added (required)
     * @param createDatabasePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createTessellServiceDatabase(UUID serviceId, List<CreateDatabasePayload> createDatabasePayload) throws RestClientException {
        return createTessellServiceDatabaseWithHttpInfo(serviceId, createDatabasePayload).getBody();
    }

    /**
     * Create a new database in a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service to which database will be added (required)
     * @param createDatabasePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createTessellServiceDatabaseWithHttpInfo(UUID serviceId, List<CreateDatabasePayload> createDatabasePayload) throws RestClientException {
        Object postBody = createDatabasePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createTessellServiceDatabase");
        }
        
        // verify the required parameter 'createDatabasePayload' is set
        if (createDatabasePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDatabasePayload' when calling createTessellServiceDatabase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/databases", uriVariables);

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
     * Create a new Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param tessellServiceStorageMappingDTO  (required)
     * @return TessellServiceStorageMappingDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceStorageMappingDTO createUpdateDatabaseStorageMapping(UUID serviceId, TessellServiceStorageMappingDTO tessellServiceStorageMappingDTO) throws RestClientException {
        return createUpdateDatabaseStorageMappingWithHttpInfo(serviceId, tessellServiceStorageMappingDTO).getBody();
    }

    /**
     * Create a new Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param tessellServiceStorageMappingDTO  (required)
     * @return ResponseEntity&lt;TessellServiceStorageMappingDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceStorageMappingDTO> createUpdateDatabaseStorageMappingWithHttpInfo(UUID serviceId, TessellServiceStorageMappingDTO tessellServiceStorageMappingDTO) throws RestClientException {
        Object postBody = tessellServiceStorageMappingDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createUpdateDatabaseStorageMapping");
        }
        
        // verify the required parameter 'tessellServiceStorageMappingDTO' is set
        if (tessellServiceStorageMappingDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceStorageMappingDTO' when calling createUpdateDatabaseStorageMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/storages", uriVariables);

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

    ParameterizedTypeReference<TessellServiceStorageMappingDTO> returnType = new ParameterizedTypeReference<TessellServiceStorageMappingDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell Database Node Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param tessellServiceMetadataDTO  (required)
     * @return TessellServiceMetadataDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceMetadataDTO createUpdateTessellServiceInstanceMetadata(UUID serviceId, UUID id, TessellServiceMetadataDTO tessellServiceMetadataDTO) throws RestClientException {
        return createUpdateTessellServiceInstanceMetadataWithHttpInfo(serviceId, id, tessellServiceMetadataDTO).getBody();
    }

    /**
     * Create a new Tessell Database Node Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param tessellServiceMetadataDTO  (required)
     * @return ResponseEntity&lt;TessellServiceMetadataDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceMetadataDTO> createUpdateTessellServiceInstanceMetadataWithHttpInfo(UUID serviceId, UUID id, TessellServiceMetadataDTO tessellServiceMetadataDTO) throws RestClientException {
        Object postBody = tessellServiceMetadataDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createUpdateTessellServiceInstanceMetadata");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createUpdateTessellServiceInstanceMetadata");
        }
        
        // verify the required parameter 'tessellServiceMetadataDTO' is set
        if (tessellServiceMetadataDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceMetadataDTO' when calling createUpdateTessellServiceInstanceMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/service-instances/{id}/metadata", uriVariables);

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

    ParameterizedTypeReference<TessellServiceMetadataDTO> returnType = new ParameterizedTypeReference<TessellServiceMetadataDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param crudDatabaseCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus crudDatabaseCallback(UUID serviceId, CrudDatabaseCallbackPayload crudDatabaseCallbackPayload) throws RestClientException {
        return crudDatabaseCallbackWithHttpInfo(serviceId, crudDatabaseCallbackPayload).getBody();
    }

    /**
     * Callback corresponding to delete connection workflow.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param crudDatabaseCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> crudDatabaseCallbackWithHttpInfo(UUID serviceId, CrudDatabaseCallbackPayload crudDatabaseCallbackPayload) throws RestClientException {
        Object postBody = crudDatabaseCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling crudDatabaseCallback");
        }
        
        // verify the required parameter 'crudDatabaseCallbackPayload' is set
        if (crudDatabaseCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'crudDatabaseCallbackPayload' when calling crudDatabaseCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/callback", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param storageId storageId (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDBStorageMapping(UUID serviceId, UUID storageId, Boolean softDelete) throws RestClientException {
        return deleteDBStorageMappingWithHttpInfo(serviceId, storageId, softDelete).getBody();
    }

    /**
     * Delete a Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param storageId storageId (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDBStorageMappingWithHttpInfo(UUID serviceId, UUID storageId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDBStorageMapping");
        }
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling deleteDBStorageMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("storageId", storageId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/storages/{storageId}", uriVariables);

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
     * Delete a Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseStorageMapping(UUID serviceId, UUID cloudAccountId, String cloudLocation, Boolean softDelete) throws RestClientException {
        return deleteDatabaseStorageMappingWithHttpInfo(serviceId, cloudAccountId, cloudLocation, softDelete).getBody();
    }

    /**
     * Delete a Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseStorageMappingWithHttpInfo(UUID serviceId, UUID cloudAccountId, String cloudLocation, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDatabaseStorageMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/storages", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
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
     * Delete a database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param databaseId The ID of the database in the DB Service (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellServiceDatabase(UUID serviceId, UUID databaseId) throws RestClientException {
        return deleteTessellServiceDatabaseWithHttpInfo(serviceId, databaseId).getBody();
    }

    /**
     * Delete a database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param databaseId The ID of the database in the DB Service (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceDatabaseWithHttpInfo(UUID serviceId, UUID databaseId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceDatabase");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling deleteTessellServiceDatabase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}", uriVariables);

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServiceDatabaseOps(UUID serviceId, UUID id, Boolean softDelete) throws RestClientException {
        return deleteTessellServiceDatabaseOpsWithHttpInfo(serviceId, id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServiceDatabaseOpsWithHttpInfo(UUID serviceId, UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceDatabaseOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceDatabaseOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{id}", uriVariables);

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
     * Delete a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param tessellDatabaseDeleteOpsRequestPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellServiceDatabaseOpsRequest(UUID serviceId, UUID id, TessellDatabaseDeleteOpsRequestPayload tessellDatabaseDeleteOpsRequestPayload) throws RestClientException {
        return deleteTessellServiceDatabaseOpsRequestWithHttpInfo(serviceId, id, tessellDatabaseDeleteOpsRequestPayload).getBody();
    }

    /**
     * Delete a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param tessellDatabaseDeleteOpsRequestPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceDatabaseOpsRequestWithHttpInfo(UUID serviceId, UUID id, TessellDatabaseDeleteOpsRequestPayload tessellDatabaseDeleteOpsRequestPayload) throws RestClientException {
        Object postBody = tessellDatabaseDeleteOpsRequestPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceDatabaseOpsRequest");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceDatabaseOpsRequest");
        }
        
        // verify the required parameter 'tessellDatabaseDeleteOpsRequestPayload' is set
        if (tessellDatabaseDeleteOpsRequestPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDatabaseDeleteOpsRequestPayload' when calling deleteTessellServiceDatabaseOpsRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{id}/delete", uriVariables);

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
     * Delete a Tessell Database Node
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param version version (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServiceInstanceMetadata(UUID serviceId, UUID id, Integer version) throws RestClientException {
        return deleteTessellServiceInstanceMetadataWithHttpInfo(serviceId, id, version).getBody();
    }

    /**
     * Delete a Tessell Database Node
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param version version (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServiceInstanceMetadataWithHttpInfo(UUID serviceId, UUID id, Integer version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceInstanceMetadata");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceInstanceMetadata");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling deleteTessellServiceInstanceMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/service-instances/{id}/metadata", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

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
     * View a list of available Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param storageId storageId (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceStorageMappingDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceStorageMappingDTO getDBStorageMapping(UUID serviceId, UUID storageId, String timeZone) throws RestClientException {
        return getDBStorageMappingWithHttpInfo(serviceId, storageId, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param storageId storageId (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceStorageMappingDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceStorageMappingDTO> getDBStorageMappingWithHttpInfo(UUID serviceId, UUID storageId, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDBStorageMapping");
        }
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling getDBStorageMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("storageId", storageId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/storages/{storageId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TessellServiceStorageMappingDTO> returnType = new ParameterizedTypeReference<TessellServiceStorageMappingDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param storagePurpose  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseStorageMappingListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseStorageMappingListResponse getDatabaseStorageMappings(UUID serviceId, UUID cloudAccountId, String cloudLocation, List<DatabaseStorageMappingStatus> statuses, List<DatabaseStorageMappingStatus> skipStatuses, String storagePurpose, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseStorageMappingsWithHttpInfo(serviceId, cloudAccountId, cloudLocation, statuses, skipStatuses, storagePurpose, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Database Storage Mapping
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param storagePurpose  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseStorageMappingListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseStorageMappingListResponse> getDatabaseStorageMappingsWithHttpInfo(UUID serviceId, UUID cloudAccountId, String cloudLocation, List<DatabaseStorageMappingStatus> statuses, List<DatabaseStorageMappingStatus> skipStatuses, String storagePurpose, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDatabaseStorageMappings");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/storages", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "storage-purpose", storagePurpose));
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

    ParameterizedTypeReference<TessellDatabaseStorageMappingListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseStorageMappingListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a Tessell Databases by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @return TessellDatabaseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOpsDTO getTessellServiceDatabaseOps(UUID serviceId, UUID id) throws RestClientException {
        return getTessellServiceDatabaseOpsWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * View a Tessell Databases by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @return ResponseEntity&lt;TessellDatabaseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOpsDTO> getTessellServiceDatabaseOpsWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceDatabaseOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceDatabaseOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOpsDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get databases
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param name name (optional)
     * @param status list of status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabasesOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabasesOpsResponse getTessellServiceDatabasesOps(UUID serviceId, String name, List<DatabaseStatusOps> status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServiceDatabasesOpsWithHttpInfo(serviceId, name, status, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get databases
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param name name (optional)
     * @param status list of status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabasesOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabasesOpsResponse> getTessellServiceDatabasesOpsWithHttpInfo(UUID serviceId, String name, List<DatabaseStatusOps> status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceDatabasesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
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

    ParameterizedTypeReference<TessellDatabasesOpsResponse> returnType = new ParameterizedTypeReference<TessellDatabasesOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Database Node Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param all all (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceMetadataListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceMetadataListResponse getTessellServiceInstanceMetadata(UUID serviceId, UUID id, Boolean all, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServiceInstanceMetadataWithHttpInfo(serviceId, id, all, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Database Node Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param all all (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceMetadataListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceMetadataListResponse> getTessellServiceInstanceMetadataWithHttpInfo(UUID serviceId, UUID id, Boolean all, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceInstanceMetadata");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceInstanceMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/service-instances/{id}/metadata", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "all", all));
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

    ParameterizedTypeReference<TessellServiceMetadataListResponse> returnType = new ParameterizedTypeReference<TessellServiceMetadataListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available DB Service Instance Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param version version (required)
     * @return TessellServiceMetadataDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceMetadataDTO getTessellServiceInstanceMetadataLatestVersion(UUID serviceId, UUID id, String version) throws RestClientException {
        return getTessellServiceInstanceMetadataLatestVersionWithHttpInfo(serviceId, id, version).getBody();
    }

    /**
     * View a list of available DB Service Instance Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId serviceId (required)
     * @param id id (required)
     * @param version version (required)
     * @return ResponseEntity&lt;TessellServiceMetadataDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceMetadataDTO> getTessellServiceInstanceMetadataLatestVersionWithHttpInfo(UUID serviceId, UUID id, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceInstanceMetadataLatestVersion");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceInstanceMetadataLatestVersion");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getTessellServiceInstanceMetadataLatestVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/service-instances/{id}/metadata/version/{version}", uriVariables);

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

    ParameterizedTypeReference<TessellServiceMetadataDTO> returnType = new ParameterizedTypeReference<TessellServiceMetadataDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param databaseId The ID of the database in the DB Service (required)
     * @param updateDatabasePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateTessellServiceDatabase(UUID serviceId, UUID databaseId, UpdateDatabasePayload updateDatabasePayload) throws RestClientException {
        return updateTessellServiceDatabaseWithHttpInfo(serviceId, databaseId, updateDatabasePayload).getBody();
    }

    /**
     * Update a database
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param databaseId The ID of the database in the DB Service (required)
     * @param updateDatabasePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateTessellServiceDatabaseWithHttpInfo(UUID serviceId, UUID databaseId, UpdateDatabasePayload updateDatabasePayload) throws RestClientException {
        Object postBody = updateDatabasePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateTessellServiceDatabase");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling updateTessellServiceDatabase");
        }
        
        // verify the required parameter 'updateDatabasePayload' is set
        if (updateDatabasePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDatabasePayload' when calling updateTessellServiceDatabase");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param tessellDatabaseOpsDTO  (required)
     * @return TessellDatabaseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOpsDTO updateTessellServiceDatabaseOps(UUID serviceId, UUID id, TessellDatabaseOpsDTO tessellDatabaseOpsDTO) throws RestClientException {
        return updateTessellServiceDatabaseOpsWithHttpInfo(serviceId, id, tessellDatabaseOpsDTO).getBody();
    }

    /**
     * Update a Tessell Database
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param id Database Id (required)
     * @param tessellDatabaseOpsDTO  (required)
     * @return ResponseEntity&lt;TessellDatabaseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOpsDTO> updateTessellServiceDatabaseOpsWithHttpInfo(UUID serviceId, UUID id, TessellDatabaseOpsDTO tessellDatabaseOpsDTO) throws RestClientException {
        Object postBody = tessellDatabaseOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateTessellServiceDatabaseOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceDatabaseOps");
        }
        
        // verify the required parameter 'tessellDatabaseOpsDTO' is set
        if (tessellDatabaseOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDatabaseOpsDTO' when calling updateTessellServiceDatabaseOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOpsDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
