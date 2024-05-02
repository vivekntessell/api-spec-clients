package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.DeleteTessellServiceInstancePayloadOps;
import com.tessell.database.system.client.model.TaskSummary;
import com.tessell.database.system.client.model.TessellAgentLcmInfo;
import com.tessell.database.system.client.model.TessellServiceInstanceDTO;
import com.tessell.database.system.client.model.TessellServiceInstanceOpsDTO;
import com.tessell.database.system.client.model.TessellServiceInstanceStatusOps;
import com.tessell.database.system.client.model.TessellServiceInstancesOpsResponse;
import com.tessell.database.system.client.model.TessellServiceInstancesResponse;
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
@Component("com.tessell.database.system.client.api.TessellServiceInstanceControllerApi")
public class TessellServiceInstanceControllerApi {
    private ApiClient apiClient;

    public TessellServiceInstanceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellServiceInstanceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a DB Service Instance Object (ops)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param tessellServiceInstanceOpsDTO  (required)
     * @return TessellServiceInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstanceOpsDTO createTessellServiceInstanceOps(UUID serviceId, TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO) throws RestClientException {
        return createTessellServiceInstanceOpsWithHttpInfo(serviceId, tessellServiceInstanceOpsDTO).getBody();
    }

    /**
     * Create a DB Service Instance Object (ops)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param tessellServiceInstanceOpsDTO  (required)
     * @return ResponseEntity&lt;TessellServiceInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstanceOpsDTO> createTessellServiceInstanceOpsWithHttpInfo(UUID serviceId, TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO) throws RestClientException {
        Object postBody = tessellServiceInstanceOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createTessellServiceInstanceOps");
        }
        
        // verify the required parameter 'tessellServiceInstanceOpsDTO' is set
        if (tessellServiceInstanceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceInstanceOpsDTO' when calling createTessellServiceInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances", uriVariables);

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

    ParameterizedTypeReference<TessellServiceInstanceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a DB Service Instance
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServiceInstanceOps(UUID serviceId, UUID instanceId, Boolean softDelete) throws RestClientException {
        return deleteTessellServiceInstanceOpsWithHttpInfo(serviceId, instanceId, softDelete).getBody();
    }

    /**
     * Delete a DB Service Instance
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServiceInstanceOpsWithHttpInfo(UUID serviceId, UUID instanceId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceInstanceOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling deleteTessellServiceInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances/{instance-id}", uriVariables);

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
     * Delete DB service Instances Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The id of the DB Service (required)
     * @param deleteTessellServiceInstancePayloadOps  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellServiceInstancesInternal(UUID serviceId, DeleteTessellServiceInstancePayloadOps deleteTessellServiceInstancePayloadOps) throws RestClientException {
        return deleteTessellServiceInstancesInternalWithHttpInfo(serviceId, deleteTessellServiceInstancePayloadOps).getBody();
    }

    /**
     * Delete DB service Instances Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId The id of the DB Service (required)
     * @param deleteTessellServiceInstancePayloadOps  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceInstancesInternalWithHttpInfo(UUID serviceId, DeleteTessellServiceInstancePayloadOps deleteTessellServiceInstancePayloadOps) throws RestClientException {
        Object postBody = deleteTessellServiceInstancePayloadOps;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteTessellServiceInstancesInternal");
        }
        
        // verify the required parameter 'deleteTessellServiceInstancePayloadOps' is set
        if (deleteTessellServiceInstancePayloadOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteTessellServiceInstancePayloadOps' when calling deleteTessellServiceInstancesInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances/delete", uriVariables);

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
     * View a list of available DB Services Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param parameterProfileIds parameterProfiles (optional)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param consumableInstancesOnly consumable-instances-only (optional, default to false)
     * @param nonConsumableInstancesOnly non-consumable-instances-only (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceInstancesOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstancesOpsResponse getAllServiceInstancesOps(List<TessellServiceInstanceStatusOps> statuses, List<TessellServiceInstanceStatusOps> skipStatuses, List<UUID> parameterProfileIds, Boolean loadComputeResources, Boolean consumableInstancesOnly, Boolean nonConsumableInstancesOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAllServiceInstancesOpsWithHttpInfo(statuses, skipStatuses, parameterProfileIds, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available DB Services Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param parameterProfileIds parameterProfiles (optional)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param consumableInstancesOnly consumable-instances-only (optional, default to false)
     * @param nonConsumableInstancesOnly non-consumable-instances-only (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceInstancesOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstancesOpsResponse> getAllServiceInstancesOpsWithHttpInfo(List<TessellServiceInstanceStatusOps> statuses, List<TessellServiceInstanceStatusOps> skipStatuses, List<UUID> parameterProfileIds, Boolean loadComputeResources, Boolean consumableInstancesOnly, Boolean nonConsumableInstancesOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/service-instances", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "parameterProfileIds", parameterProfileIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resources", loadComputeResources));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumable-instances-only", consumableInstancesOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "non-consumable-instances-only", nonConsumableInstancesOnly));
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

    ParameterizedTypeReference<TessellServiceInstancesOpsResponse> returnType = new ParameterizedTypeReference<TessellServiceInstancesOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a DB Service instance by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceInstanceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstanceDTO getTessellServiceInstance(UUID serviceId, UUID id, String timeZone) throws RestClientException {
        return getTessellServiceInstanceWithHttpInfo(serviceId, id, timeZone).getBody();
    }

    /**
     * Get a DB Service instance by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceInstanceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstanceDTO> getTessellServiceInstanceWithHttpInfo(UUID serviceId, UUID id, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceInstance");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceInstance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{service-id}/service-instances/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellServiceInstanceDTO> returnType = new ParameterizedTypeReference<TessellServiceInstanceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a DB Service Instance By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstanceOpsDTO getTessellServiceInstanceOps(UUID serviceId, UUID instanceId, Boolean loadComputeResources, String timeZone) throws RestClientException {
        return getTessellServiceInstanceOpsWithHttpInfo(serviceId, instanceId, loadComputeResources, timeZone).getBody();
    }

    /**
     * Get a DB Service Instance By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstanceOpsDTO> getTessellServiceInstanceOpsWithHttpInfo(UUID serviceId, UUID instanceId, Boolean loadComputeResources, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceInstanceOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling getTessellServiceInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances/{instance-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resources", loadComputeResources));
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

    ParameterizedTypeReference<TessellServiceInstanceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available DB Service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id service id (required)
     * @param instanceGroupId Filter all instances belonging to specified instance-group-id (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceInstancesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstancesResponse getTessellServiceInstances(UUID id, UUID instanceGroupId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServiceInstancesWithHttpInfo(id, instanceGroupId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available DB Service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id service id (required)
     * @param instanceGroupId Filter all instances belonging to specified instance-group-id (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceInstancesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstancesResponse> getTessellServiceInstancesWithHttpInfo(UUID id, UUID instanceGroupId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceInstances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/service-instances", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "instance-group-id", instanceGroupId));
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

    ParameterizedTypeReference<TessellServiceInstancesResponse> returnType = new ParameterizedTypeReference<TessellServiceInstancesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available DB Services Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param name name (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param consumableInstancesOnly consumable-instances-only (optional, default to false)
     * @param nonConsumableInstancesOnly non-consumable-instances-only (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceInstancesOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstancesOpsResponse getTessellServiceInstancesOps(UUID serviceId, String name, List<TessellServiceInstanceStatusOps> statuses, List<TessellServiceInstanceStatusOps> skipStatuses, Boolean loadComputeResources, Boolean consumableInstancesOnly, Boolean nonConsumableInstancesOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServiceInstancesOpsWithHttpInfo(serviceId, name, statuses, skipStatuses, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available DB Services Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param name name (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param loadComputeResources load-compute-resources (optional, default to false)
     * @param consumableInstancesOnly consumable-instances-only (optional, default to false)
     * @param nonConsumableInstancesOnly non-consumable-instances-only (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceInstancesOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstancesOpsResponse> getTessellServiceInstancesOpsWithHttpInfo(UUID serviceId, String name, List<TessellServiceInstanceStatusOps> statuses, List<TessellServiceInstanceStatusOps> skipStatuses, Boolean loadComputeResources, Boolean consumableInstancesOnly, Boolean nonConsumableInstancesOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getTessellServiceInstancesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-compute-resources", loadComputeResources));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumable-instances-only", consumableInstancesOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "non-consumable-instances-only", nonConsumableInstancesOnly));
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

    ParameterizedTypeReference<TessellServiceInstancesOpsResponse> returnType = new ParameterizedTypeReference<TessellServiceInstancesOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a DB Service Instance&#39;s Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param instanceId instance-id (required)
     * @param tessellAgentLcmInfo  (required)
     * @return TessellAgentLcmInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAgentLcmInfo updateTessellServiceInstanceAgentLcmInfoOps(UUID serviceId, UUID instanceId, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        return updateTessellServiceInstanceAgentLcmInfoOpsWithHttpInfo(serviceId, instanceId, tessellAgentLcmInfo).getBody();
    }

    /**
     * Update a DB Service Instance&#39;s Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param instanceId instance-id (required)
     * @param tessellAgentLcmInfo  (required)
     * @return ResponseEntity&lt;TessellAgentLcmInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAgentLcmInfo> updateTessellServiceInstanceAgentLcmInfoOpsWithHttpInfo(UUID serviceId, UUID instanceId, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        Object postBody = tessellAgentLcmInfo;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateTessellServiceInstanceAgentLcmInfoOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling updateTessellServiceInstanceAgentLcmInfoOps");
        }
        
        // verify the required parameter 'tessellAgentLcmInfo' is set
        if (tessellAgentLcmInfo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellAgentLcmInfo' when calling updateTessellServiceInstanceAgentLcmInfoOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances/{instance-id}/agent-lcm", uriVariables);

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
     * Update a DB Service Instance
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param tessellServiceInstanceOpsDTO  (required)
     * @param callingFromHealthMonitor calling-from-health-monitor (optional, default to false)
     * @return TessellServiceInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceInstanceOpsDTO updateTessellServiceInstanceOps(UUID serviceId, UUID instanceId, TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO, Boolean callingFromHealthMonitor) throws RestClientException {
        return updateTessellServiceInstanceOpsWithHttpInfo(serviceId, instanceId, tessellServiceInstanceOpsDTO, callingFromHealthMonitor).getBody();
    }

    /**
     * Update a DB Service Instance
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId Id of the DB Service (required)
     * @param instanceId Id of the DB Service Instance (required)
     * @param tessellServiceInstanceOpsDTO  (required)
     * @param callingFromHealthMonitor calling-from-health-monitor (optional, default to false)
     * @return ResponseEntity&lt;TessellServiceInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceInstanceOpsDTO> updateTessellServiceInstanceOpsWithHttpInfo(UUID serviceId, UUID instanceId, TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO, Boolean callingFromHealthMonitor) throws RestClientException {
        Object postBody = tessellServiceInstanceOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateTessellServiceInstanceOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling updateTessellServiceInstanceOps");
        }
        
        // verify the required parameter 'tessellServiceInstanceOpsDTO' is set
        if (tessellServiceInstanceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceInstanceOpsDTO' when calling updateTessellServiceInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/service-instances/{instance-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "calling-from-health-monitor", callingFromHealthMonitor));

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

    ParameterizedTypeReference<TessellServiceInstanceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
