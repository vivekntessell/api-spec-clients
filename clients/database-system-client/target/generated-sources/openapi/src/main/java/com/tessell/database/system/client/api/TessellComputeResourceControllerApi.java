package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.CloudType;
import com.tessell.database.system.client.model.ComputeResourceHostingInfo;
import com.tessell.database.system.client.model.ComputeResourceStatusOps;
import com.tessell.database.system.client.model.ComputeResourceType;
import com.tessell.database.system.client.model.ComputeResourceUpgradeEligibilityOpsResponse;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.DeleteTessellServerCallbackPayload;
import com.tessell.database.system.client.model.MachineType;
import com.tessell.database.system.client.model.SharableDbserverComputeResourceListResponse;
import com.tessell.database.system.client.model.TaskSummary;
import com.tessell.database.system.client.model.TessellAgentLcmInfo;
import com.tessell.database.system.client.model.TessellComputeResourceListOpsResponse;
import com.tessell.database.system.client.model.TessellComputeResourceLogs;
import com.tessell.database.system.client.model.TessellComputeResourceMetadata;
import com.tessell.database.system.client.model.TessellComputeResourceOpsDTO;
import com.tessell.database.system.client.model.TessellDbserverComputeResourceDTO;
import com.tessell.database.system.client.model.TessellDbserverComputeResourceListResponse;
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
@Component("com.tessell.database.system.client.api.TessellComputeResourceControllerApi")
public class TessellComputeResourceControllerApi {
    private ApiClient apiClient;

    public TessellComputeResourceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellComputeResourceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param tessellComputeResourceMetadata  (required)
     * @return TessellComputeResourceMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceMetadata createComputeResourceMetadata(UUID computeResourceId, TessellComputeResourceMetadata tessellComputeResourceMetadata) throws RestClientException {
        return createComputeResourceMetadataWithHttpInfo(computeResourceId, tessellComputeResourceMetadata).getBody();
    }

    /**
     * Create a new Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param tessellComputeResourceMetadata  (required)
     * @return ResponseEntity&lt;TessellComputeResourceMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceMetadata> createComputeResourceMetadataWithHttpInfo(UUID computeResourceId, TessellComputeResourceMetadata tessellComputeResourceMetadata) throws RestClientException {
        Object postBody = tessellComputeResourceMetadata;
        
        // verify the required parameter 'computeResourceId' is set
        if (computeResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceId' when calling createComputeResourceMetadata");
        }
        
        // verify the required parameter 'tessellComputeResourceMetadata' is set
        if (tessellComputeResourceMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellComputeResourceMetadata' when calling createComputeResourceMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("computeResourceId", computeResourceId);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{computeResourceId}/metadata", uriVariables);

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

    ParameterizedTypeReference<TessellComputeResourceMetadata> returnType = new ParameterizedTypeReference<TessellComputeResourceMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellComputeResourceOpsDTO  (required)
     * @return TessellComputeResourceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceOpsDTO createComputeResourceOps(TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO) throws RestClientException {
        return createComputeResourceOpsWithHttpInfo(tessellComputeResourceOpsDTO).getBody();
    }

    /**
     * Create a new Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellComputeResourceOpsDTO  (required)
     * @return ResponseEntity&lt;TessellComputeResourceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceOpsDTO> createComputeResourceOpsWithHttpInfo(TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO) throws RestClientException {
        Object postBody = tessellComputeResourceOpsDTO;
        
        // verify the required parameter 'tessellComputeResourceOpsDTO' is set
        if (tessellComputeResourceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellComputeResourceOpsDTO' when calling createComputeResourceOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/compute-resources", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellComputeResourceOpsDTO> returnType = new ParameterizedTypeReference<TessellComputeResourceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteComputeResource(UUID id, Boolean softDelete) throws RestClientException {
        return deleteComputeResourceWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteComputeResourceWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteComputeResource");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}", uriVariables);

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
     * Delete a Database Server
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteDbserverComputeResource(UUID id) throws RestClientException {
        return deleteDbserverComputeResourceWithHttpInfo(id).getBody();
    }

    /**
     * Delete a Database Server
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteDbserverComputeResourceWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDbserverComputeResource");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/compute-resources/dbservers/{id}", uriVariables);

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
     * Callback for delete server
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deleteTessellServerCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServerCallback(DeleteTessellServerCallbackPayload deleteTessellServerCallbackPayload) throws RestClientException {
        return deleteTessellServerCallbackWithHttpInfo(deleteTessellServerCallbackPayload).getBody();
    }

    /**
     * Callback for delete server
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deleteTessellServerCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServerCallbackWithHttpInfo(DeleteTessellServerCallbackPayload deleteTessellServerCallbackPayload) throws RestClientException {
        Object postBody = deleteTessellServerCallbackPayload;
        
        // verify the required parameter 'deleteTessellServerCallbackPayload' is set
        if (deleteTessellServerCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteTessellServerCallbackPayload' when calling deleteTessellServerCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/compute-resources/callback/delete-server", Collections.<String, Object>emptyMap());

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
     * Get a compute resource&#39;s hosting info by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the compute resource (required)
     * @param loadTenantInfo load-tenant-info (optional, default to false)
     * @param loadInfraConfig load-infra-config (optional, default to false)
     * @param loadGenieConfig load-genie-config (optional, default to false)
     * @param loadNetworkProfile load-network-profile (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ComputeResourceHostingInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ComputeResourceHostingInfo getComputeResourceHostingInfoOps(UUID id, Boolean loadTenantInfo, Boolean loadInfraConfig, Boolean loadGenieConfig, Boolean loadNetworkProfile, String timeZone) throws RestClientException {
        return getComputeResourceHostingInfoOpsWithHttpInfo(id, loadTenantInfo, loadInfraConfig, loadGenieConfig, loadNetworkProfile, timeZone).getBody();
    }

    /**
     * Get a compute resource&#39;s hosting info by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the compute resource (required)
     * @param loadTenantInfo load-tenant-info (optional, default to false)
     * @param loadInfraConfig load-infra-config (optional, default to false)
     * @param loadGenieConfig load-genie-config (optional, default to false)
     * @param loadNetworkProfile load-network-profile (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;ComputeResourceHostingInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComputeResourceHostingInfo> getComputeResourceHostingInfoOpsWithHttpInfo(UUID id, Boolean loadTenantInfo, Boolean loadInfraConfig, Boolean loadGenieConfig, Boolean loadNetworkProfile, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getComputeResourceHostingInfoOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}/hosting-info", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-tenant-info", loadTenantInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-infra-config", loadInfraConfig));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-genie-config", loadGenieConfig));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-network-profile", loadNetworkProfile));
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

    ParameterizedTypeReference<ComputeResourceHostingInfo> returnType = new ParameterizedTypeReference<ComputeResourceHostingInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View logs for given file name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Compute resource id (required)
     * @param filePath  (required)
     * @param lineLimit  (optional, default to 200)
     * @param offset  (optional, default to 0)
     * @return TessellComputeResourceLogs
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceLogs getComputeResourceLogs(UUID id, String filePath, Integer lineLimit, Integer offset) throws RestClientException {
        return getComputeResourceLogsWithHttpInfo(id, filePath, lineLimit, offset).getBody();
    }

    /**
     * View logs for given file name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Compute resource id (required)
     * @param filePath  (required)
     * @param lineLimit  (optional, default to 200)
     * @param offset  (optional, default to 0)
     * @return ResponseEntity&lt;TessellComputeResourceLogs&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceLogs> getComputeResourceLogsWithHttpInfo(UUID id, String filePath, Integer lineLimit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getComputeResourceLogs");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filePath' when calling getComputeResourceLogs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}/logs", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filePath", filePath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "line-limit", lineLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

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

    ParameterizedTypeReference<TessellComputeResourceLogs> returnType = new ParameterizedTypeReference<TessellComputeResourceLogs>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return List&lt;TessellComputeResourceMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellComputeResourceMetadata> getComputeResourceMetadata(UUID computeResourceId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getComputeResourceMetadataWithHttpInfo(computeResourceId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;List&lt;TessellComputeResourceMetadata&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellComputeResourceMetadata>> getComputeResourceMetadataWithHttpInfo(UUID computeResourceId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'computeResourceId' is set
        if (computeResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceId' when calling getComputeResourceMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("computeResourceId", computeResourceId);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{computeResourceId}/metadata", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<List<TessellComputeResourceMetadata>> returnType = new ParameterizedTypeReference<List<TessellComputeResourceMetadata>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param version version (required)
     * @return TessellComputeResourceMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceMetadata getComputeResourceMetadataUsingVersion(UUID computeResourceId, String version) throws RestClientException {
        return getComputeResourceMetadataUsingVersionWithHttpInfo(computeResourceId, version).getBody();
    }

    /**
     * View a list of available Tessell Compute Resource Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param computeResourceId computeResourceId (required)
     * @param version version (required)
     * @return ResponseEntity&lt;TessellComputeResourceMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceMetadata> getComputeResourceMetadataUsingVersionWithHttpInfo(UUID computeResourceId, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'computeResourceId' is set
        if (computeResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceId' when calling getComputeResourceMetadataUsingVersion");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getComputeResourceMetadataUsingVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("computeResourceId", computeResourceId);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{computeResourceId}/metadata/version/{version}", uriVariables);

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

    ParameterizedTypeReference<TessellComputeResourceMetadata> returnType = new ParameterizedTypeReference<TessellComputeResourceMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell Compute Resources By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return TessellComputeResourceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceOpsDTO getComputeResourceOpsById(UUID id) throws RestClientException {
        return getComputeResourceOpsByIdWithHttpInfo(id).getBody();
    }

    /**
     * View available Tessell Compute Resources By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;TessellComputeResourceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceOpsDTO> getComputeResourceOpsByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getComputeResourceOpsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellComputeResourceOpsDTO> returnType = new ParameterizedTypeReference<TessellComputeResourceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Compute Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses List of status to filter on (optional)
     * @param skipStatuses List of status to skip (optional)
     * @param machineType machine-type (optional)
     * @param engineType engine-type (optional)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudResourceId cloud-resource-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param tenantId tenant-id (optional)
     * @param types compute-resource-type (optional)
     * @param subscriptionId Filter compute-resources based on subscription-id (optional)
     * @param computeSharingEnabled Filter compute-resources based on compute-sharing-enabled (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellComputeResourceListOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceListOpsResponse getComputeResourcesOps(String name, List<ComputeResourceStatusOps> statuses, List<ComputeResourceStatusOps> skipStatuses, MachineType machineType, DatabaseEngineType engineType, UUID cloudAccountId, String cloudResourceId, String cloudLocation, String tenantId, List<ComputeResourceType> types, UUID subscriptionId, Boolean computeSharingEnabled, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getComputeResourcesOpsWithHttpInfo(name, statuses, skipStatuses, machineType, engineType, cloudAccountId, cloudResourceId, cloudLocation, tenantId, types, subscriptionId, computeSharingEnabled, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Compute Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses List of status to filter on (optional)
     * @param skipStatuses List of status to skip (optional)
     * @param machineType machine-type (optional)
     * @param engineType engine-type (optional)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudResourceId cloud-resource-id (optional)
     * @param cloudLocation cloud-location (optional)
     * @param tenantId tenant-id (optional)
     * @param types compute-resource-type (optional)
     * @param subscriptionId Filter compute-resources based on subscription-id (optional)
     * @param computeSharingEnabled Filter compute-resources based on compute-sharing-enabled (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellComputeResourceListOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceListOpsResponse> getComputeResourcesOpsWithHttpInfo(String name, List<ComputeResourceStatusOps> statuses, List<ComputeResourceStatusOps> skipStatuses, MachineType machineType, DatabaseEngineType engineType, UUID cloudAccountId, String cloudResourceId, String cloudLocation, String tenantId, List<ComputeResourceType> types, UUID subscriptionId, Boolean computeSharingEnabled, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/compute-resources", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "machine-type", machineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-id", cloudResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-sharing-enabled", computeSharingEnabled));
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

    ParameterizedTypeReference<TessellComputeResourceListOpsResponse> returnType = new ParameterizedTypeReference<TessellComputeResourceListOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a Compute Resource by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the Compute Resource (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDbserverComputeResourceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbserverComputeResourceDTO getDbserverComputeResource(UUID id, String timeZone) throws RestClientException {
        return getDbserverComputeResourceWithHttpInfo(id, timeZone).getBody();
    }

    /**
     * Get a Compute Resource by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the Compute Resource (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDbserverComputeResourceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbserverComputeResourceDTO> getDbserverComputeResourceWithHttpInfo(UUID id, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDbserverComputeResource");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/compute-resources/dbservers/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDbserverComputeResourceDTO> returnType = new ParameterizedTypeReference<TessellDbserverComputeResourceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Compute Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter Compute Resource based on name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDbserverComputeResourceListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbserverComputeResourceListResponse getDbserverComputeResources(String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbserverComputeResourcesWithHttpInfo(name, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Compute Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter Compute Resource based on name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDbserverComputeResourceListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbserverComputeResourceListResponse> getDbserverComputeResourcesWithHttpInfo(String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/compute-resources/dbservers", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<TessellDbserverComputeResourceListResponse> returnType = new ParameterizedTypeReference<TessellDbserverComputeResourceListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Compute Resources that can be used for newer provisioning
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionId Filter Compute Resources based on subscription ID (optional)
     * @param engineType Filter Compute Resources based on engine type (optional)
     * @param cloud Filter Compute Resources based on cloud type (optional)
     * @param region Filter Compute Resources based on cloud region (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return SharableDbserverComputeResourceListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SharableDbserverComputeResourceListResponse getSharingEnabledDbserverComputeResources(UUID subscriptionId, DatabaseEngineType engineType, CloudType cloud, String region, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSharingEnabledDbserverComputeResourcesWithHttpInfo(subscriptionId, engineType, cloud, region, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Compute Resources that can be used for newer provisioning
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionId Filter Compute Resources based on subscription ID (optional)
     * @param engineType Filter Compute Resources based on engine type (optional)
     * @param cloud Filter Compute Resources based on cloud type (optional)
     * @param region Filter Compute Resources based on cloud region (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;SharableDbserverComputeResourceListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SharableDbserverComputeResourceListResponse> getSharingEnabledDbserverComputeResourcesWithHttpInfo(UUID subscriptionId, DatabaseEngineType engineType, CloudType cloud, String region, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/compute-resources/dbservers/sharing-enabled", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
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

    ParameterizedTypeReference<SharableDbserverComputeResourceListResponse> returnType = new ParameterizedTypeReference<SharableDbserverComputeResourceListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellComputeResourceOpsDTO  (required)
     * @return TessellComputeResourceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeResourceOpsDTO updateComputeResource(UUID id, TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO) throws RestClientException {
        return updateComputeResourceWithHttpInfo(id, tessellComputeResourceOpsDTO).getBody();
    }

    /**
     * Update a Tessell Compute Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellComputeResourceOpsDTO  (required)
     * @return ResponseEntity&lt;TessellComputeResourceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeResourceOpsDTO> updateComputeResourceWithHttpInfo(UUID id, TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO) throws RestClientException {
        Object postBody = tessellComputeResourceOpsDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateComputeResource");
        }
        
        // verify the required parameter 'tessellComputeResourceOpsDTO' is set
        if (tessellComputeResourceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellComputeResourceOpsDTO' when calling updateComputeResource");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellComputeResourceOpsDTO> returnType = new ParameterizedTypeReference<TessellComputeResourceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a DB Service Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellAgentLcmInfo  (optional)
     * @return TessellAgentLcmInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAgentLcmInfo updateComputeResourceAgentLcmInfoOps(UUID id, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        return updateComputeResourceAgentLcmInfoOpsWithHttpInfo(id, tessellAgentLcmInfo).getBody();
    }

    /**
     * Update a DB Service Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellAgentLcmInfo  (optional)
     * @return ResponseEntity&lt;TessellAgentLcmInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAgentLcmInfo> updateComputeResourceAgentLcmInfoOpsWithHttpInfo(UUID id, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        Object postBody = tessellAgentLcmInfo;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateComputeResourceAgentLcmInfoOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}/agent-lcm", uriVariables);

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

    ParameterizedTypeReference<TessellAgentLcmInfo> returnType = new ParameterizedTypeReference<TessellAgentLcmInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if Tessell libraries on a compute-resource related can be upgraded
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Compute resource id (required)
     * @return ComputeResourceUpgradeEligibilityOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ComputeResourceUpgradeEligibilityOpsResponse upgradeEligibilityForComputeResourceOps(UUID id) throws RestClientException {
        return upgradeEligibilityForComputeResourceOpsWithHttpInfo(id).getBody();
    }

    /**
     * Check if Tessell libraries on a compute-resource related can be upgraded
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Compute resource id (required)
     * @return ResponseEntity&lt;ComputeResourceUpgradeEligibilityOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComputeResourceUpgradeEligibilityOpsResponse> upgradeEligibilityForComputeResourceOpsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upgradeEligibilityForComputeResourceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/compute-resources/{id}/library-upgrade-eligibility", uriVariables);

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

    ParameterizedTypeReference<ComputeResourceUpgradeEligibilityOpsResponse> returnType = new ParameterizedTypeReference<ComputeResourceUpgradeEligibilityOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
