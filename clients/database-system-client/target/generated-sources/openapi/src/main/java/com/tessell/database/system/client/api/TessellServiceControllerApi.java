package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.AddDbServiceInstancesPayload;
import com.tessell.database.system.client.model.AddInstancesCallbackPayload;
import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.BulkDeleteTessellServicesPayload;
import com.tessell.database.system.client.model.BulkDeleteTessellServicesStatusPayload;
import com.tessell.database.system.client.model.CloneTessellServicePayload;
import com.tessell.database.system.client.model.CreateNativeBackupOpsPayload;
import com.tessell.database.system.client.model.CreateUpdateTessellTagPayload;
import com.tessell.database.system.client.model.DBServiceParameterProfileUpdateImpactResponse;
import com.tessell.database.system.client.model.DBServiceParameterProfileUpdateOpsRequest;
import com.tessell.database.system.client.model.DBServiceParameterProfileUpdateRequest;
import com.tessell.database.system.client.model.DBServiceUpgradeEligibilityOpsResponse;
import com.tessell.database.system.client.model.DatabaseEngineType;
import com.tessell.database.system.client.model.DbServiceAddIntegrationCallbackPayload;
import com.tessell.database.system.client.model.DbServiceUpdateConnectivityCallbackPayload;
import com.tessell.database.system.client.model.DbServiceUpdateCredsCallbackPayload;
import com.tessell.database.system.client.model.DeleteInstancesCallbackPayload;
import com.tessell.database.system.client.model.DeleteTagPayload;
import com.tessell.database.system.client.model.DeleteTessellServiceInstancePayload;
import com.tessell.database.system.client.model.DeleteTessellServicePayload;
import com.tessell.database.system.client.model.PatchDbServicePayload;
import com.tessell.database.system.client.model.PatchTessellServiceCallbackPayload;
import com.tessell.database.system.client.model.ProvisionTessellServiceCallbackPayload;
import com.tessell.database.system.client.model.ProvisionTessellServicePayload;
import com.tessell.database.system.client.model.RebootDBServiceRequestCallbackPayload;
import com.tessell.database.system.client.model.ResetTessellServiceCredsPayload;
import com.tessell.database.system.client.model.ResizeDBServiceRequest;
import com.tessell.database.system.client.model.ResizeDBServiceRequestCallbackPayload;
import com.tessell.database.system.client.model.ResourceBulkDeleteResponseOps;
import com.tessell.database.system.client.model.RestoreTessellServicePayload;
import com.tessell.database.system.client.model.SanitizeBackupClonePayload;
import com.tessell.database.system.client.model.StartTessellServiceCallbackPayload;
import com.tessell.database.system.client.model.StartTessellServiceOpsPayload;
import com.tessell.database.system.client.model.StartTessellServicePayload;
import com.tessell.database.system.client.model.StopDatabaseInternalPayload;
import com.tessell.database.system.client.model.StopTessellServiceCallbackPayload;
import com.tessell.database.system.client.model.StopTessellServicePayload;
import com.tessell.database.system.client.model.SwitchOverTessellServicePayload;
import com.tessell.database.system.client.model.SwitchoverTessellServiceCallbackPayload;
import com.tessell.database.system.client.model.TaskResponse;
import com.tessell.database.system.client.model.TaskSummary;
import com.tessell.database.system.client.model.TessellAgentLcmInfo;
import com.tessell.database.system.client.model.TessellServiceCredsDTO;
import com.tessell.database.system.client.model.TessellServiceDTO;
import com.tessell.database.system.client.model.TessellServiceGenieInfoOps;
import com.tessell.database.system.client.model.TessellServiceOpsDTO;
import com.tessell.database.system.client.model.TessellServiceStatus;
import com.tessell.database.system.client.model.TessellServiceStatusOps;
import com.tessell.database.system.client.model.TessellServiceTimelineResponse;
import com.tessell.database.system.client.model.TessellServicesOpsResponse;
import com.tessell.database.system.client.model.TessellServicesResponse;
import com.tessell.database.system.client.model.TessellTag;
import com.tessell.database.system.client.model.TessellUpdateDatabaseIntegrationDTO;
import java.util.UUID;
import com.tessell.database.system.client.model.UpdateDBServiceParameterProfileCallbackPayload;
import com.tessell.database.system.client.model.UpdateServiceConnectivityPayloadOps;
import com.tessell.database.system.client.model.UpdateTessellServiceConnectivityPayload;
import com.tessell.database.system.client.model.UpdateTessellServicePayload;

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
@Component("com.tessell.database.system.client.api.TessellServiceControllerApi")
public class TessellServiceControllerApi {
    private ApiClient apiClient;

    public TessellServiceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellServiceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Callback for add DB service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param instanceGroupId instance-group-id (required)
     * @param addInstancesCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus addInstancesCallback(UUID serviceId, UUID instanceGroupId, AddInstancesCallbackPayload addInstancesCallbackPayload) throws RestClientException {
        return addInstancesCallbackWithHttpInfo(serviceId, instanceGroupId, addInstancesCallbackPayload).getBody();
    }

    /**
     * Callback for add DB service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param instanceGroupId instance-group-id (required)
     * @param addInstancesCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> addInstancesCallbackWithHttpInfo(UUID serviceId, UUID instanceGroupId, AddInstancesCallbackPayload addInstancesCallbackPayload) throws RestClientException {
        Object postBody = addInstancesCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling addInstancesCallback");
        }
        
        // verify the required parameter 'instanceGroupId' is set
        if (instanceGroupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceGroupId' when calling addInstancesCallback");
        }
        
        // verify the required parameter 'addInstancesCallbackPayload' is set
        if (addInstancesCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addInstancesCallbackPayload' when calling addInstancesCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("instance-group-id", instanceGroupId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/instances/add/{instance-group-id}/callback", uriVariables);

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
     * Add DB service Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param addDbServiceInstancesPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary addTessellServiceInstances(UUID id, AddDbServiceInstancesPayload addDbServiceInstancesPayload) throws RestClientException {
        return addTessellServiceInstancesWithHttpInfo(id, addDbServiceInstancesPayload).getBody();
    }

    /**
     * Add DB service Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param addDbServiceInstancesPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> addTessellServiceInstancesWithHttpInfo(UUID id, AddDbServiceInstancesPayload addDbServiceInstancesPayload) throws RestClientException {
        Object postBody = addDbServiceInstancesPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling addTessellServiceInstances");
        }
        
        // verify the required parameter 'addDbServiceInstancesPayload' is set
        if (addDbServiceInstancesPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addDbServiceInstancesPayload' when calling addTessellServiceInstances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/service-instances", uriVariables);

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
     * Delete the tessell services for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellServicesPayload  (required)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps bulkDeleteTessellServices(BulkDeleteTessellServicesPayload bulkDeleteTessellServicesPayload) throws RestClientException {
        return bulkDeleteTessellServicesWithHttpInfo(bulkDeleteTessellServicesPayload).getBody();
    }

    /**
     * Delete the tessell services for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellServicesPayload  (required)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> bulkDeleteTessellServicesWithHttpInfo(BulkDeleteTessellServicesPayload bulkDeleteTessellServicesPayload) throws RestClientException {
        Object postBody = bulkDeleteTessellServicesPayload;
        
        // verify the required parameter 'bulkDeleteTessellServicesPayload' is set
        if (bulkDeleteTessellServicesPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bulkDeleteTessellServicesPayload' when calling bulkDeleteTessellServices");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Cleanup a failed DB service entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus cleanupFailedTessellServiceEntry(UUID id) throws RestClientException {
        return cleanupFailedTessellServiceEntryWithHttpInfo(id).getBody();
    }

    /**
     * Cleanup a failed DB service entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> cleanupFailedTessellServiceEntryWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cleanupFailedTessellServiceEntry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/cleanup-entry", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a clone for backup sanitization
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param sanitizeBackupClonePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary cloneForBackupSanitization(UUID availabilityMachineId, SanitizeBackupClonePayload sanitizeBackupClonePayload) throws RestClientException {
        return cloneForBackupSanitizationWithHttpInfo(availabilityMachineId, sanitizeBackupClonePayload).getBody();
    }

    /**
     * Create a clone for backup sanitization
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param sanitizeBackupClonePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> cloneForBackupSanitizationWithHttpInfo(UUID availabilityMachineId, SanitizeBackupClonePayload sanitizeBackupClonePayload) throws RestClientException {
        Object postBody = sanitizeBackupClonePayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling cloneForBackupSanitization");
        }
        
        // verify the required parameter 'sanitizeBackupClonePayload' is set
        if (sanitizeBackupClonePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizeBackupClonePayload' when calling cloneForBackupSanitization");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availability-machine-id", availabilityMachineId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availability-machine-id}/sanitization-clones", uriVariables);

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
     * Create a native backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param createNativeBackupOpsPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary cloneForNativeBackup(UUID availabilityMachineId, CreateNativeBackupOpsPayload createNativeBackupOpsPayload) throws RestClientException {
        return cloneForNativeBackupWithHttpInfo(availabilityMachineId, createNativeBackupOpsPayload).getBody();
    }

    /**
     * Create a native backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param createNativeBackupOpsPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> cloneForNativeBackupWithHttpInfo(UUID availabilityMachineId, CreateNativeBackupOpsPayload createNativeBackupOpsPayload) throws RestClientException {
        Object postBody = createNativeBackupOpsPayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling cloneForNativeBackup");
        }
        
        // verify the required parameter 'createNativeBackupOpsPayload' is set
        if (createNativeBackupOpsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createNativeBackupOpsPayload' when calling cloneForNativeBackup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availability-machine-id", availabilityMachineId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availability-machine-id}/native-backups", uriVariables);

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
     * Clone a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param cloneTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary cloneTessellService(UUID availabilityMachineId, CloneTessellServicePayload cloneTessellServicePayload) throws RestClientException {
        return cloneTessellServiceWithHttpInfo(availabilityMachineId, cloneTessellServicePayload).getBody();
    }

    /**
     * Clone a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId The Id of the Availability Machine (required)
     * @param cloneTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> cloneTessellServiceWithHttpInfo(UUID availabilityMachineId, CloneTessellServicePayload cloneTessellServicePayload) throws RestClientException {
        Object postBody = cloneTessellServicePayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling cloneTessellService");
        }
        
        // verify the required parameter 'cloneTessellServicePayload' is set
        if (cloneTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloneTessellServicePayload' when calling cloneTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availability-machine-id", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availability-machine-id}/clones", uriVariables);

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
     * Create a DB Service Object (ops)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellServiceOpsDTO  (required)
     * @param haUpgradeOldServiceId If this entry is being created as part of HA upgrade flow, specify the old service (dbsystem) id (optional)
     * @return TessellServiceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceOpsDTO createTessellServiceOps(TessellServiceOpsDTO tessellServiceOpsDTO, UUID haUpgradeOldServiceId) throws RestClientException {
        return createTessellServiceOpsWithHttpInfo(tessellServiceOpsDTO, haUpgradeOldServiceId).getBody();
    }

    /**
     * Create a DB Service Object (ops)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellServiceOpsDTO  (required)
     * @param haUpgradeOldServiceId If this entry is being created as part of HA upgrade flow, specify the old service (dbsystem) id (optional)
     * @return ResponseEntity&lt;TessellServiceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceOpsDTO> createTessellServiceOpsWithHttpInfo(TessellServiceOpsDTO tessellServiceOpsDTO, UUID haUpgradeOldServiceId) throws RestClientException {
        Object postBody = tessellServiceOpsDTO;
        
        // verify the required parameter 'tessellServiceOpsDTO' is set
        if (tessellServiceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceOpsDTO' when calling createTessellServiceOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "ha-upgrade-old-service-id", haUpgradeOldServiceId));

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

    ParameterizedTypeReference<TessellServiceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for DB service add integrations
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceAddIntegrationCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus dbServiceAddIntegrationCallback(DbServiceAddIntegrationCallbackPayload dbServiceAddIntegrationCallbackPayload) throws RestClientException {
        return dbServiceAddIntegrationCallbackWithHttpInfo(dbServiceAddIntegrationCallbackPayload).getBody();
    }

    /**
     * Callback for DB service add integrations
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceAddIntegrationCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> dbServiceAddIntegrationCallbackWithHttpInfo(DbServiceAddIntegrationCallbackPayload dbServiceAddIntegrationCallbackPayload) throws RestClientException {
        Object postBody = dbServiceAddIntegrationCallbackPayload;
        
        // verify the required parameter 'dbServiceAddIntegrationCallbackPayload' is set
        if (dbServiceAddIntegrationCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceAddIntegrationCallbackPayload' when calling dbServiceAddIntegrationCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/add-integrations", Collections.<String, Object>emptyMap());

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
     * Callback for DB Service connectivity updates
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceUpdateConnectivityCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus dbServiceConnectivityUpdateCallback(DbServiceUpdateConnectivityCallbackPayload dbServiceUpdateConnectivityCallbackPayload) throws RestClientException {
        return dbServiceConnectivityUpdateCallbackWithHttpInfo(dbServiceUpdateConnectivityCallbackPayload).getBody();
    }

    /**
     * Callback for DB Service connectivity updates
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceUpdateConnectivityCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> dbServiceConnectivityUpdateCallbackWithHttpInfo(DbServiceUpdateConnectivityCallbackPayload dbServiceUpdateConnectivityCallbackPayload) throws RestClientException {
        Object postBody = dbServiceUpdateConnectivityCallbackPayload;
        
        // verify the required parameter 'dbServiceUpdateConnectivityCallbackPayload' is set
        if (dbServiceUpdateConnectivityCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceUpdateConnectivityCallbackPayload' when calling dbServiceConnectivityUpdateCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/connectivity-updates", Collections.<String, Object>emptyMap());

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
     * Callback for DB Service cred updates
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceUpdateCredsCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus dbServiceCredUpdateCallback(DbServiceUpdateCredsCallbackPayload dbServiceUpdateCredsCallbackPayload) throws RestClientException {
        return dbServiceCredUpdateCallbackWithHttpInfo(dbServiceUpdateCredsCallbackPayload).getBody();
    }

    /**
     * Callback for DB Service cred updates
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dbServiceUpdateCredsCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> dbServiceCredUpdateCallbackWithHttpInfo(DbServiceUpdateCredsCallbackPayload dbServiceUpdateCredsCallbackPayload) throws RestClientException {
        Object postBody = dbServiceUpdateCredsCallbackPayload;
        
        // verify the required parameter 'dbServiceUpdateCredsCallbackPayload' is set
        if (dbServiceUpdateCredsCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceUpdateCredsCallbackPayload' when calling dbServiceCredUpdateCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/cred-updates", Collections.<String, Object>emptyMap());

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
     * Callback for add DB service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param deleteInstancesCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteInstancesCallback(UUID serviceId, DeleteInstancesCallbackPayload deleteInstancesCallbackPayload) throws RestClientException {
        return deleteInstancesCallbackWithHttpInfo(serviceId, deleteInstancesCallbackPayload).getBody();
    }

    /**
     * Callback for add DB service instances
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId service-id (required)
     * @param deleteInstancesCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteInstancesCallbackWithHttpInfo(UUID serviceId, DeleteInstancesCallbackPayload deleteInstancesCallbackPayload) throws RestClientException {
        Object postBody = deleteInstancesCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteInstancesCallback");
        }
        
        // verify the required parameter 'deleteInstancesCallbackPayload' is set
        if (deleteInstancesCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteInstancesCallbackPayload' when calling deleteInstancesCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/instances/delete/callback", uriVariables);

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
     * Delete a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param deleteTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellService(UUID id, DeleteTessellServicePayload deleteTessellServicePayload) throws RestClientException {
        return deleteTessellServiceWithHttpInfo(id, deleteTessellServicePayload).getBody();
    }

    /**
     * Delete a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param deleteTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceWithHttpInfo(UUID id, DeleteTessellServicePayload deleteTessellServicePayload) throws RestClientException {
        Object postBody = deleteTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellService");
        }
        
        // verify the required parameter 'deleteTessellServicePayload' is set
        if (deleteTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteTessellServicePayload' when calling deleteTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}", uriVariables);

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
     * Delete DB service Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The id of the DB Service (required)
     * @param deleteTessellServiceInstancePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellServiceInstances(UUID id, DeleteTessellServiceInstancePayload deleteTessellServiceInstancePayload) throws RestClientException {
        return deleteTessellServiceInstancesWithHttpInfo(id, deleteTessellServiceInstancePayload).getBody();
    }

    /**
     * Delete DB service Instances
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The id of the DB Service (required)
     * @param deleteTessellServiceInstancePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceInstancesWithHttpInfo(UUID id, DeleteTessellServiceInstancePayload deleteTessellServiceInstancePayload) throws RestClientException {
        Object postBody = deleteTessellServiceInstancePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceInstances");
        }
        
        // verify the required parameter 'deleteTessellServiceInstancePayload' is set
        if (deleteTessellServiceInstancePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteTessellServiceInstancePayload' when calling deleteTessellServiceInstances");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/service-instances", uriVariables);

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
     * Delete a DB Service Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServiceOps(UUID id, Boolean softDelete) throws RestClientException {
        return deleteTessellServiceOpsWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a DB Service Metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServiceOpsWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}", uriVariables);

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
     * Delete a DB Service Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param deleteTessellServicePayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteTessellServiceOpsRequest(UUID id, DeleteTessellServicePayload deleteTessellServicePayload) throws RestClientException {
        return deleteTessellServiceOpsRequestWithHttpInfo(id, deleteTessellServicePayload).getBody();
    }

    /**
     * Delete a DB Service Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param deleteTessellServicePayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteTessellServiceOpsRequestWithHttpInfo(UUID id, DeleteTessellServicePayload deleteTessellServicePayload) throws RestClientException {
        Object postBody = deleteTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceOpsRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/delete", uriVariables);

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
     * Delete tags for a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param deleteTagPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTessellServiceTags(UUID id, DeleteTagPayload deleteTagPayload) throws RestClientException {
        return deleteTessellServiceTagsWithHttpInfo(id, deleteTagPayload).getBody();
    }

    /**
     * Delete tags for a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param deleteTagPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTessellServiceTagsWithHttpInfo(UUID id, DeleteTagPayload deleteTagPayload) throws RestClientException {
        Object postBody = deleteTagPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTessellServiceTags");
        }
        
        // verify the required parameter 'deleteTagPayload' is set
        if (deleteTagPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteTagPayload' when calling deleteTessellServiceTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/tags", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Failover a DB Service (for now, hidden from service consumers)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param body  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary failoverTessellServiceOps(UUID id, Object body) throws RestClientException {
        return failoverTessellServiceOpsWithHttpInfo(id, body).getBody();
    }

    /**
     * Failover a DB Service (for now, hidden from service consumers)
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param body  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> failoverTessellServiceOpsWithHttpInfo(UUID id, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling failoverTessellServiceOps");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling failoverTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/failover", uriVariables);

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
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellServicesStatusPayload  (required)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps getBulkDeleteTessellServicesStatus(BulkDeleteTessellServicesStatusPayload bulkDeleteTessellServicesStatusPayload) throws RestClientException {
        return getBulkDeleteTessellServicesStatusWithHttpInfo(bulkDeleteTessellServicesStatusPayload).getBody();
    }

    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellServicesStatusPayload  (required)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> getBulkDeleteTessellServicesStatusWithHttpInfo(BulkDeleteTessellServicesStatusPayload bulkDeleteTessellServicesStatusPayload) throws RestClientException {
        Object postBody = bulkDeleteTessellServicesStatusPayload;
        
        // verify the required parameter 'bulkDeleteTessellServicesStatusPayload' is set
        if (bulkDeleteTessellServicesStatusPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bulkDeleteTessellServicesStatusPayload' when calling getBulkDeleteTessellServicesStatus");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Impact assessment for update parameter profile request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service ID (required)
     * @param dbServiceParameterProfileUpdateRequest  (required)
     * @return DBServiceParameterProfileUpdateImpactResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DBServiceParameterProfileUpdateImpactResponse getDBServiceParameterProfileUpdateImpact(UUID serviceId, DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest) throws RestClientException {
        return getDBServiceParameterProfileUpdateImpactWithHttpInfo(serviceId, dbServiceParameterProfileUpdateRequest).getBody();
    }

    /**
     * Impact assessment for update parameter profile request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service ID (required)
     * @param dbServiceParameterProfileUpdateRequest  (required)
     * @return ResponseEntity&lt;DBServiceParameterProfileUpdateImpactResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DBServiceParameterProfileUpdateImpactResponse> getDBServiceParameterProfileUpdateImpactWithHttpInfo(UUID serviceId, DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest) throws RestClientException {
        Object postBody = dbServiceParameterProfileUpdateRequest;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDBServiceParameterProfileUpdateImpact");
        }
        
        // verify the required parameter 'dbServiceParameterProfileUpdateRequest' is set
        if (dbServiceParameterProfileUpdateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceParameterProfileUpdateRequest' when calling getDBServiceParameterProfileUpdateImpact");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/parameter-profiles/impact", uriVariables);

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

    ParameterizedTypeReference<DBServiceParameterProfileUpdateImpactResponse> returnType = new ParameterizedTypeReference<DBServiceParameterProfileUpdateImpactResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a DB Service by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param loadInstances Load the instances that are part of the DB Service (optional, default to true)
     * @param loadDatabases Load the databases that are part of the DB Service (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceDTO getTessellService(UUID id, Boolean loadInstances, Boolean loadDatabases, Boolean loadAcls, String timeZone) throws RestClientException {
        return getTessellServiceWithHttpInfo(id, loadInstances, loadDatabases, loadAcls, timeZone).getBody();
    }

    /**
     * Get a DB Service by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param loadInstances Load the instances that are part of the DB Service (optional, default to true)
     * @param loadDatabases Load the databases that are part of the DB Service (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceDTO> getTessellServiceWithHttpInfo(UUID id, Boolean loadInstances, Boolean loadDatabases, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-databases", loadDatabases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<TessellServiceDTO> returnType = new ParameterizedTypeReference<TessellServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get credentials for a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return TessellServiceCredsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceCredsDTO getTessellServiceCredentials(UUID id) throws RestClientException {
        return getTessellServiceCredentialsWithHttpInfo(id).getBody();
    }

    /**
     * Get credentials for a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ResponseEntity&lt;TessellServiceCredsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceCredsDTO> getTessellServiceCredentialsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceCredentials");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/creds", uriVariables);

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

    ParameterizedTypeReference<TessellServiceCredsDTO> returnType = new ParameterizedTypeReference<TessellServiceCredsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a DB Service By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the DB Service (required)
     * @param loadInstances load-instances (optional, default to false)
     * @param loadDatabases load-databases (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServiceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceOpsDTO getTessellServiceOps(UUID id, Boolean loadInstances, Boolean loadDatabases, Boolean loadSubscriptionInfo, Boolean loadAcls, String timeZone) throws RestClientException {
        return getTessellServiceOpsWithHttpInfo(id, loadInstances, loadDatabases, loadSubscriptionInfo, loadAcls, timeZone).getBody();
    }

    /**
     * Get a DB Service By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the DB Service (required)
     * @param loadInstances load-instances (optional, default to false)
     * @param loadDatabases load-databases (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServiceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceOpsDTO> getTessellServiceOpsWithHttpInfo(UUID id, Boolean loadInstances, Boolean loadDatabases, Boolean loadSubscriptionInfo, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-databases", loadDatabases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<TessellServiceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View tags for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return List&lt;TessellTag&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellTag> getTessellServiceTags(UUID id) throws RestClientException {
        return getTessellServiceTagsWithHttpInfo(id).getBody();
    }

    /**
     * View tags for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ResponseEntity&lt;List&lt;TessellTag&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellTag>> getTessellServiceTagsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/tags", uriVariables);

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

    ParameterizedTypeReference<List<TessellTag>> returnType = new ParameterizedTypeReference<List<TessellTag>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a DB timeline by service ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return TessellServiceTimelineResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceTimelineResponse getTessellServiceTimeline(UUID id) throws RestClientException {
        return getTessellServiceTimelineWithHttpInfo(id).getBody();
    }

    /**
     * Get a DB timeline by service ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ResponseEntity&lt;TessellServiceTimelineResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceTimelineResponse> getTessellServiceTimelineWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTessellServiceTimeline");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/timeline", uriVariables);

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

    ParameterizedTypeReference<TessellServiceTimelineResponse> returnType = new ParameterizedTypeReference<TessellServiceTimelineResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View list of available DB Services
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter DB Service based on name (optional)
     * @param statuses Filter DB Service based on status/es (optional)
     * @param engineTypes Filter DB Service based on engine type (optional)
     * @param clonedFromServiceId Filter DB Service based on ID of the DB Service from which the services are cloned (optional)
     * @param clonedFromAvailabilityMachineId Filter DB Service based on ID of the Availability Machine from which the services are cloned (optional)
     * @param loadInstances Load the instances that are part of the DB Service (optional, default to true)
     * @param loadDatabases Load the databases that are part of the DB Service (optional, default to true)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServicesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServicesResponse getTessellServices(String name, List<TessellServiceStatus> statuses, List<DatabaseEngineType> engineTypes, UUID clonedFromServiceId, UUID clonedFromAvailabilityMachineId, Boolean loadInstances, Boolean loadDatabases, List<String> owners, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServicesWithHttpInfo(name, statuses, engineTypes, clonedFromServiceId, clonedFromAvailabilityMachineId, loadInstances, loadDatabases, owners, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View list of available DB Services
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter DB Service based on name (optional)
     * @param statuses Filter DB Service based on status/es (optional)
     * @param engineTypes Filter DB Service based on engine type (optional)
     * @param clonedFromServiceId Filter DB Service based on ID of the DB Service from which the services are cloned (optional)
     * @param clonedFromAvailabilityMachineId Filter DB Service based on ID of the Availability Machine from which the services are cloned (optional)
     * @param loadInstances Load the instances that are part of the DB Service (optional, default to true)
     * @param loadDatabases Load the databases that are part of the DB Service (optional, default to true)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServicesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServicesResponse> getTessellServicesWithHttpInfo(String name, List<TessellServiceStatus> statuses, List<DatabaseEngineType> engineTypes, UUID clonedFromServiceId, UUID clonedFromAvailabilityMachineId, Boolean loadInstances, Boolean loadDatabases, List<String> owners, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/services", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "engine-types", engineTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloned-from-service-id", clonedFromServiceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloned-from-availability-machine-id", clonedFromAvailabilityMachineId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-databases", loadDatabases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<TessellServicesResponse> returnType = new ParameterizedTypeReference<TessellServicesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available DB Services Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param engineTypes engine-types (optional)
     * @param loadInstances load-instances (optional, default to false)
     * @param loadDatabases load-databases (optional, default to false)
     * @param includeExternal include-external (optional, default to true)
     * @param includeInternal include-internal (optional, default to true)
     * @param clonedFromServiceId The id of the DB Service from which the services are cloned (optional)
     * @param clonedFromAvailabilityMachineId The id of the Availability Machine from which the services are cloned (optional)
     * @param networkProfileId network-profile-id (optional)
     * @param subscriptionIds List of subscription ids (optional)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param consumableServicesOnly consumable-services-only (optional, default to false)
     * @param nonConsumableServicesOnly non-consumable-services-only (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServicesOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServicesOpsResponse getTessellServicesOps(String name, List<TessellServiceStatusOps> statuses, List<TessellServiceStatusOps> skipStatuses, List<DatabaseEngineType> engineTypes, Boolean loadInstances, Boolean loadDatabases, Boolean includeExternal, Boolean includeInternal, UUID clonedFromServiceId, UUID clonedFromAvailabilityMachineId, UUID networkProfileId, List<UUID> subscriptionIds, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, Boolean loadSubscriptionInfo, Boolean consumableServicesOnly, Boolean nonConsumableServicesOnly, List<String> owners, Boolean loadAcls, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getTessellServicesOpsWithHttpInfo(name, statuses, skipStatuses, engineTypes, loadInstances, loadDatabases, includeExternal, includeInternal, clonedFromServiceId, clonedFromAvailabilityMachineId, networkProfileId, subscriptionIds, filterOnLastStartedTime, filterOnLastStoppedTime, loadSubscriptionInfo, consumableServicesOnly, nonConsumableServicesOnly, owners, loadAcls, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available DB Services Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param engineTypes engine-types (optional)
     * @param loadInstances load-instances (optional, default to false)
     * @param loadDatabases load-databases (optional, default to false)
     * @param includeExternal include-external (optional, default to true)
     * @param includeInternal include-internal (optional, default to true)
     * @param clonedFromServiceId The id of the DB Service from which the services are cloned (optional)
     * @param clonedFromAvailabilityMachineId The id of the Availability Machine from which the services are cloned (optional)
     * @param networkProfileId network-profile-id (optional)
     * @param subscriptionIds List of subscription ids (optional)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param consumableServicesOnly consumable-services-only (optional, default to false)
     * @param nonConsumableServicesOnly non-consumable-services-only (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServicesOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServicesOpsResponse> getTessellServicesOpsWithHttpInfo(String name, List<TessellServiceStatusOps> statuses, List<TessellServiceStatusOps> skipStatuses, List<DatabaseEngineType> engineTypes, Boolean loadInstances, Boolean loadDatabases, Boolean includeExternal, Boolean includeInternal, UUID clonedFromServiceId, UUID clonedFromAvailabilityMachineId, UUID networkProfileId, List<UUID> subscriptionIds, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, Boolean loadSubscriptionInfo, Boolean consumableServicesOnly, Boolean nonConsumableServicesOnly, List<String> owners, Boolean loadAcls, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/services", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "engine-types", engineTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-databases", loadDatabases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-external", includeExternal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-internal", includeInternal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloned-from-service-id", clonedFromServiceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloned-from-availability-machine-id", clonedFromAvailabilityMachineId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "network-profile-id", networkProfileId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "subscription-ids", subscriptionIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-started-time", filterOnLastStartedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-stopped-time", filterOnLastStoppedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumable-services-only", consumableServicesOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "non-consumable-services-only", nonConsumableServicesOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-begin-at", timeRangeBeginAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-end-at", timeRangeEndAt));
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

    ParameterizedTypeReference<TessellServicesOpsResponse> returnType = new ParameterizedTypeReference<TessellServicesOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Patches the DB Service Software
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param patchDbServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary patchSoftwareForTessellService(UUID id, PatchDbServicePayload patchDbServicePayload) throws RestClientException {
        return patchSoftwareForTessellServiceWithHttpInfo(id, patchDbServicePayload).getBody();
    }

    /**
     * Patches the DB Service Software
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param patchDbServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> patchSoftwareForTessellServiceWithHttpInfo(UUID id, PatchDbServicePayload patchDbServicePayload) throws RestClientException {
        Object postBody = patchDbServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling patchSoftwareForTessellService");
        }
        
        // verify the required parameter 'patchDbServicePayload' is set
        if (patchDbServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchDbServicePayload' when calling patchSoftwareForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/patch-software", uriVariables);

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
     * Callback for patch Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param patchTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus patchTessellServiceCallback(PatchTessellServiceCallbackPayload patchTessellServiceCallbackPayload) throws RestClientException {
        return patchTessellServiceCallbackWithHttpInfo(patchTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for patch Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param patchTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> patchTessellServiceCallbackWithHttpInfo(PatchTessellServiceCallbackPayload patchTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = patchTessellServiceCallbackPayload;
        
        // verify the required parameter 'patchTessellServiceCallbackPayload' is set
        if (patchTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchTessellServiceCallbackPayload' when calling patchTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/patch-software", Collections.<String, Object>emptyMap());

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
     * Provision a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param provisionTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary provisionTessellService(ProvisionTessellServicePayload provisionTessellServicePayload) throws RestClientException {
        return provisionTessellServiceWithHttpInfo(provisionTessellServicePayload).getBody();
    }

    /**
     * Provision a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param provisionTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> provisionTessellServiceWithHttpInfo(ProvisionTessellServicePayload provisionTessellServicePayload) throws RestClientException {
        Object postBody = provisionTessellServicePayload;
        
        // verify the required parameter 'provisionTessellServicePayload' is set
        if (provisionTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provisionTessellServicePayload' when calling provisionTessellService");
        }
        
        String path = apiClient.expandPath("/services", Collections.<String, Object>emptyMap());

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
     * Callback for provision Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param provisionTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus provisionTessellServiceCallback(ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload) throws RestClientException {
        return provisionTessellServiceCallbackWithHttpInfo(provisionTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for provision Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param provisionTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> provisionTessellServiceCallbackWithHttpInfo(ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = provisionTessellServiceCallbackPayload;
        
        // verify the required parameter 'provisionTessellServiceCallbackPayload' is set
        if (provisionTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provisionTessellServiceCallbackPayload' when calling provisionTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/provision", Collections.<String, Object>emptyMap());

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
     * Reboot a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param body  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary rebootDBService(UUID serviceId, Object body) throws RestClientException {
        return rebootDBServiceWithHttpInfo(serviceId, body).getBody();
    }

    /**
     * Reboot a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param body  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> rebootDBServiceWithHttpInfo(UUID serviceId, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling rebootDBService");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling rebootDBService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/reboot", uriVariables);

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
     * Process response for DB reboot plugins workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param rebootDBServiceRequestCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus rebootDBServiceCallback(UUID serviceId, RebootDBServiceRequestCallbackPayload rebootDBServiceRequestCallbackPayload) throws RestClientException {
        return rebootDBServiceCallbackWithHttpInfo(serviceId, rebootDBServiceRequestCallbackPayload).getBody();
    }

    /**
     * Process response for DB reboot plugins workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param rebootDBServiceRequestCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> rebootDBServiceCallbackWithHttpInfo(UUID serviceId, RebootDBServiceRequestCallbackPayload rebootDBServiceRequestCallbackPayload) throws RestClientException {
        Object postBody = rebootDBServiceRequestCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling rebootDBServiceCallback");
        }
        
        // verify the required parameter 'rebootDBServiceRequestCallbackPayload' is set
        if (rebootDBServiceRequestCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'rebootDBServiceRequestCallbackPayload' when calling rebootDBServiceCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/callback/reboot", uriVariables);

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
     * Resize DB service storage/compute
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param resizeDBServiceRequest  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary resizeDBService(UUID id, ResizeDBServiceRequest resizeDBServiceRequest) throws RestClientException {
        return resizeDBServiceWithHttpInfo(id, resizeDBServiceRequest).getBody();
    }

    /**
     * Resize DB service storage/compute
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param resizeDBServiceRequest  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> resizeDBServiceWithHttpInfo(UUID id, ResizeDBServiceRequest resizeDBServiceRequest) throws RestClientException {
        Object postBody = resizeDBServiceRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resizeDBService");
        }
        
        // verify the required parameter 'resizeDBServiceRequest' is set
        if (resizeDBServiceRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resizeDBServiceRequest' when calling resizeDBService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/resize", uriVariables);

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
     * Update the service status as per resize operation status
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The id of the DB Service (required)
     * @param resizeDBServiceRequestCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus resizeDBServiceCallback(UUID id, ResizeDBServiceRequestCallbackPayload resizeDBServiceRequestCallbackPayload) throws RestClientException {
        return resizeDBServiceCallbackWithHttpInfo(id, resizeDBServiceRequestCallbackPayload).getBody();
    }

    /**
     * Update the service status as per resize operation status
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The id of the DB Service (required)
     * @param resizeDBServiceRequestCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> resizeDBServiceCallbackWithHttpInfo(UUID id, ResizeDBServiceRequestCallbackPayload resizeDBServiceRequestCallbackPayload) throws RestClientException {
        Object postBody = resizeDBServiceRequestCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resizeDBServiceCallback");
        }
        
        // verify the required parameter 'resizeDBServiceRequestCallbackPayload' is set
        if (resizeDBServiceRequestCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resizeDBServiceRequestCallbackPayload' when calling resizeDBServiceCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/callback/resize", uriVariables);

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
     * Restore a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param restoreTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary restoreTessellService(UUID id, RestoreTessellServicePayload restoreTessellServicePayload) throws RestClientException {
        return restoreTessellServiceWithHttpInfo(id, restoreTessellServicePayload).getBody();
    }

    /**
     * Restore a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param restoreTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> restoreTessellServiceWithHttpInfo(UUID id, RestoreTessellServicePayload restoreTessellServicePayload) throws RestClientException {
        Object postBody = restoreTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling restoreTessellService");
        }
        
        // verify the required parameter 'restoreTessellServicePayload' is set
        if (restoreTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'restoreTessellServicePayload' when calling restoreTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/restore", uriVariables);

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
     * Callback for restore Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param provisionTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus restoreTessellServiceCallback(ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload) throws RestClientException {
        return restoreTessellServiceCallbackWithHttpInfo(provisionTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for restore Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param provisionTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> restoreTessellServiceCallbackWithHttpInfo(ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = provisionTessellServiceCallbackPayload;
        
        // verify the required parameter 'provisionTessellServiceCallbackPayload' is set
        if (provisionTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provisionTessellServiceCallbackPayload' when calling restoreTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/restore", Collections.<String, Object>emptyMap());

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
     * Starts the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param startTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary startTessellService(UUID id, StartTessellServicePayload startTessellServicePayload) throws RestClientException {
        return startTessellServiceWithHttpInfo(id, startTessellServicePayload).getBody();
    }

    /**
     * Starts the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param startTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> startTessellServiceWithHttpInfo(UUID id, StartTessellServicePayload startTessellServicePayload) throws RestClientException {
        Object postBody = startTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling startTessellService");
        }
        
        // verify the required parameter 'startTessellServicePayload' is set
        if (startTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTessellServicePayload' when calling startTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/start", uriVariables);

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
     * Callback for start Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param startTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus startTessellServiceCallback(StartTessellServiceCallbackPayload startTessellServiceCallbackPayload) throws RestClientException {
        return startTessellServiceCallbackWithHttpInfo(startTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for start Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param startTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> startTessellServiceCallbackWithHttpInfo(StartTessellServiceCallbackPayload startTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = startTessellServiceCallbackPayload;
        
        // verify the required parameter 'startTessellServiceCallbackPayload' is set
        if (startTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTessellServiceCallbackPayload' when calling startTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/start", Collections.<String, Object>emptyMap());

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
     * Start a DB Service Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param startTessellServiceOpsPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary startTessellServiceOpsRequest(UUID id, StartTessellServiceOpsPayload startTessellServiceOpsPayload) throws RestClientException {
        return startTessellServiceOpsRequestWithHttpInfo(id, startTessellServiceOpsPayload).getBody();
    }

    /**
     * Start a DB Service Internal Request
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param startTessellServiceOpsPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> startTessellServiceOpsRequestWithHttpInfo(UUID id, StartTessellServiceOpsPayload startTessellServiceOpsPayload) throws RestClientException {
        Object postBody = startTessellServiceOpsPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling startTessellServiceOpsRequest");
        }
        
        // verify the required parameter 'startTessellServiceOpsPayload' is set
        if (startTessellServiceOpsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startTessellServiceOpsPayload' when calling startTessellServiceOpsRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/start", uriVariables);

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
     * Stops the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param stopTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary stopTessellService(UUID id, StopTessellServicePayload stopTessellServicePayload) throws RestClientException {
        return stopTessellServiceWithHttpInfo(id, stopTessellServicePayload).getBody();
    }

    /**
     * Stops the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param stopTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> stopTessellServiceWithHttpInfo(UUID id, StopTessellServicePayload stopTessellServicePayload) throws RestClientException {
        Object postBody = stopTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling stopTessellService");
        }
        
        // verify the required parameter 'stopTessellServicePayload' is set
        if (stopTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stopTessellServicePayload' when calling stopTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/stop", uriVariables);

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
     * Callback for stop Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param stopTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus stopTessellServiceCallback(StopTessellServiceCallbackPayload stopTessellServiceCallbackPayload) throws RestClientException {
        return stopTessellServiceCallbackWithHttpInfo(stopTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for stop Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param stopTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> stopTessellServiceCallbackWithHttpInfo(StopTessellServiceCallbackPayload stopTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = stopTessellServiceCallbackPayload;
        
        // verify the required parameter 'stopTessellServiceCallbackPayload' is set
        if (stopTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stopTessellServiceCallbackPayload' when calling stopTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/stop", Collections.<String, Object>emptyMap());

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
     * Stop a DB Service Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param stopDatabaseInternalPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary stopTessellServiceOps(UUID id, StopDatabaseInternalPayload stopDatabaseInternalPayload) throws RestClientException {
        return stopTessellServiceOpsWithHttpInfo(id, stopDatabaseInternalPayload).getBody();
    }

    /**
     * Stop a DB Service Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param stopDatabaseInternalPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> stopTessellServiceOpsWithHttpInfo(UUID id, StopDatabaseInternalPayload stopDatabaseInternalPayload) throws RestClientException {
        Object postBody = stopDatabaseInternalPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling stopTessellServiceOps");
        }
        
        // verify the required parameter 'stopDatabaseInternalPayload' is set
        if (stopDatabaseInternalPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'stopDatabaseInternalPayload' when calling stopTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/stop", uriVariables);

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
     * Switchover a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param switchOverTessellServicePayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary switchoverTessellService(UUID id, SwitchOverTessellServicePayload switchOverTessellServicePayload) throws RestClientException {
        return switchoverTessellServiceWithHttpInfo(id, switchOverTessellServicePayload).getBody();
    }

    /**
     * Switchover a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param switchOverTessellServicePayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> switchoverTessellServiceWithHttpInfo(UUID id, SwitchOverTessellServicePayload switchOverTessellServicePayload) throws RestClientException {
        Object postBody = switchOverTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling switchoverTessellService");
        }
        
        // verify the required parameter 'switchOverTessellServicePayload' is set
        if (switchOverTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'switchOverTessellServicePayload' when calling switchoverTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/switchover", uriVariables);

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
     * Callback for switchover Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param switchoverTessellServiceCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus switchoverTessellServiceCallback(SwitchoverTessellServiceCallbackPayload switchoverTessellServiceCallbackPayload) throws RestClientException {
        return switchoverTessellServiceCallbackWithHttpInfo(switchoverTessellServiceCallbackPayload).getBody();
    }

    /**
     * Callback for switchover Tessell service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param switchoverTessellServiceCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> switchoverTessellServiceCallbackWithHttpInfo(SwitchoverTessellServiceCallbackPayload switchoverTessellServiceCallbackPayload) throws RestClientException {
        Object postBody = switchoverTessellServiceCallbackPayload;
        
        // verify the required parameter 'switchoverTessellServiceCallbackPayload' is set
        if (switchoverTessellServiceCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'switchoverTessellServiceCallbackPayload' when calling switchoverTessellServiceCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/callback/switchover", Collections.<String, Object>emptyMap());

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
     * Update parameter profile/s for instances in service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service ID (required)
     * @param dbServiceParameterProfileUpdateRequest  (required)
     * @return TaskResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskResponse updateDBServiceParameterProfiles(UUID serviceId, DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest) throws RestClientException {
        return updateDBServiceParameterProfilesWithHttpInfo(serviceId, dbServiceParameterProfileUpdateRequest).getBody();
    }

    /**
     * Update parameter profile/s for instances in service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service ID (required)
     * @param dbServiceParameterProfileUpdateRequest  (required)
     * @return ResponseEntity&lt;TaskResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskResponse> updateDBServiceParameterProfilesWithHttpInfo(UUID serviceId, DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest) throws RestClientException {
        Object postBody = dbServiceParameterProfileUpdateRequest;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDBServiceParameterProfiles");
        }
        
        // verify the required parameter 'dbServiceParameterProfileUpdateRequest' is set
        if (dbServiceParameterProfileUpdateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceParameterProfileUpdateRequest' when calling updateDBServiceParameterProfiles");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/services/{service-id}/parameter-profiles", uriVariables);

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

    ParameterizedTypeReference<TaskResponse> returnType = new ParameterizedTypeReference<TaskResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Process response for DB parameter profile update workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param updateDBServiceParameterProfileCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateDBServiceParameterProfilesCallback(UUID serviceId, UpdateDBServiceParameterProfileCallbackPayload updateDBServiceParameterProfileCallbackPayload) throws RestClientException {
        return updateDBServiceParameterProfilesCallbackWithHttpInfo(serviceId, updateDBServiceParameterProfileCallbackPayload).getBody();
    }

    /**
     * Process response for DB parameter profile update workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param updateDBServiceParameterProfileCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateDBServiceParameterProfilesCallbackWithHttpInfo(UUID serviceId, UpdateDBServiceParameterProfileCallbackPayload updateDBServiceParameterProfileCallbackPayload) throws RestClientException {
        Object postBody = updateDBServiceParameterProfileCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDBServiceParameterProfilesCallback");
        }
        
        // verify the required parameter 'updateDBServiceParameterProfileCallbackPayload' is set
        if (updateDBServiceParameterProfileCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDBServiceParameterProfileCallbackPayload' when calling updateDBServiceParameterProfilesCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/parameter-profiles/callback/update", uriVariables);

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
     * Update parameter profile/s for instances in service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param dbServiceParameterProfileUpdateOpsRequest  (required)
     * @return TaskResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskResponse updateDBServiceParameterProfilesOps(UUID serviceId, DBServiceParameterProfileUpdateOpsRequest dbServiceParameterProfileUpdateOpsRequest) throws RestClientException {
        return updateDBServiceParameterProfilesOpsWithHttpInfo(serviceId, dbServiceParameterProfileUpdateOpsRequest).getBody();
    }

    /**
     * Update parameter profile/s for instances in service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id (required)
     * @param dbServiceParameterProfileUpdateOpsRequest  (required)
     * @return ResponseEntity&lt;TaskResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskResponse> updateDBServiceParameterProfilesOpsWithHttpInfo(UUID serviceId, DBServiceParameterProfileUpdateOpsRequest dbServiceParameterProfileUpdateOpsRequest) throws RestClientException {
        Object postBody = dbServiceParameterProfileUpdateOpsRequest;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDBServiceParameterProfilesOps");
        }
        
        // verify the required parameter 'dbServiceParameterProfileUpdateOpsRequest' is set
        if (dbServiceParameterProfileUpdateOpsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbServiceParameterProfileUpdateOpsRequest' when calling updateDBServiceParameterProfilesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/parameter-profiles", uriVariables);

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

    ParameterizedTypeReference<TaskResponse> returnType = new ParameterizedTypeReference<TaskResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param updateTessellServicePayload  (required)
     * @return TessellServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceDTO updateTessellService(UUID id, UpdateTessellServicePayload updateTessellServicePayload) throws RestClientException {
        return updateTessellServiceWithHttpInfo(id, updateTessellServicePayload).getBody();
    }

    /**
     * Update a DB service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param updateTessellServicePayload  (required)
     * @return ResponseEntity&lt;TessellServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceDTO> updateTessellServiceWithHttpInfo(UUID id, UpdateTessellServicePayload updateTessellServicePayload) throws RestClientException {
        Object postBody = updateTessellServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellService");
        }
        
        // verify the required parameter 'updateTessellServicePayload' is set
        if (updateTessellServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTessellServicePayload' when calling updateTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellServiceDTO> returnType = new ParameterizedTypeReference<TessellServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a DB Service Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellAgentLcmInfo  (required)
     * @return TessellAgentLcmInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAgentLcmInfo updateTessellServiceAgentLcmInfoOps(UUID id, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        return updateTessellServiceAgentLcmInfoOpsWithHttpInfo(id, tessellAgentLcmInfo).getBody();
    }

    /**
     * Update a DB Service Agent LCM Info
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellAgentLcmInfo  (required)
     * @return ResponseEntity&lt;TessellAgentLcmInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAgentLcmInfo> updateTessellServiceAgentLcmInfoOpsWithHttpInfo(UUID id, TessellAgentLcmInfo tessellAgentLcmInfo) throws RestClientException {
        Object postBody = tessellAgentLcmInfo;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceAgentLcmInfoOps");
        }
        
        // verify the required parameter 'tessellAgentLcmInfo' is set
        if (tessellAgentLcmInfo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellAgentLcmInfo' when calling updateTessellServiceAgentLcmInfoOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/agent-lcm", uriVariables);

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
     * Update DB Service Connectivity
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param updateTessellServiceConnectivityPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateTessellServiceConnectivity(UUID id, UpdateTessellServiceConnectivityPayload updateTessellServiceConnectivityPayload) throws RestClientException {
        return updateTessellServiceConnectivityWithHttpInfo(id, updateTessellServiceConnectivityPayload).getBody();
    }

    /**
     * Update DB Service Connectivity
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param updateTessellServiceConnectivityPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateTessellServiceConnectivityWithHttpInfo(UUID id, UpdateTessellServiceConnectivityPayload updateTessellServiceConnectivityPayload) throws RestClientException {
        Object postBody = updateTessellServiceConnectivityPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceConnectivity");
        }
        
        // verify the required parameter 'updateTessellServiceConnectivityPayload' is set
        if (updateTessellServiceConnectivityPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTessellServiceConnectivityPayload' when calling updateTessellServiceConnectivity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/connectivity", uriVariables);

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
     * Update Tessell service Connectivity internal API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param updateServiceConnectivityPayloadOps  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateTessellServiceConnectivityOps(UUID serviceId, UpdateServiceConnectivityPayloadOps updateServiceConnectivityPayloadOps) throws RestClientException {
        return updateTessellServiceConnectivityOpsWithHttpInfo(serviceId, updateServiceConnectivityPayloadOps).getBody();
    }

    /**
     * Update Tessell service Connectivity internal API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param updateServiceConnectivityPayloadOps  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateTessellServiceConnectivityOpsWithHttpInfo(UUID serviceId, UpdateServiceConnectivityPayloadOps updateServiceConnectivityPayloadOps) throws RestClientException {
        Object postBody = updateServiceConnectivityPayloadOps;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateTessellServiceConnectivityOps");
        }
        
        // verify the required parameter 'updateServiceConnectivityPayloadOps' is set
        if (updateServiceConnectivityPayloadOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateServiceConnectivityPayloadOps' when calling updateTessellServiceConnectivityOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/connectivity", uriVariables);

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
     * Update DB service credentials
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param resetTessellServiceCredsPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateTessellServiceCredentials(UUID id, ResetTessellServiceCredsPayload resetTessellServiceCredsPayload) throws RestClientException {
        return updateTessellServiceCredentialsWithHttpInfo(id, resetTessellServiceCredsPayload).getBody();
    }

    /**
     * Update DB service credentials
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param resetTessellServiceCredsPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateTessellServiceCredentialsWithHttpInfo(UUID id, ResetTessellServiceCredsPayload resetTessellServiceCredsPayload) throws RestClientException {
        Object postBody = resetTessellServiceCredsPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceCredentials");
        }
        
        // verify the required parameter 'resetTessellServiceCredsPayload' is set
        if (resetTessellServiceCredsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resetTessellServiceCredsPayload' when calling updateTessellServiceCredentials");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/creds", uriVariables);

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
     * Update a DB Service&#39;s Genie Config Information Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param tessellServiceGenieInfoOps  (required)
     * @return TessellServiceGenieInfoOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceGenieInfoOps updateTessellServiceGenieConfigOps(UUID id, TessellServiceGenieInfoOps tessellServiceGenieInfoOps) throws RestClientException {
        return updateTessellServiceGenieConfigOpsWithHttpInfo(id, tessellServiceGenieInfoOps).getBody();
    }

    /**
     * Update a DB Service&#39;s Genie Config Information Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the DB Service (required)
     * @param tessellServiceGenieInfoOps  (required)
     * @return ResponseEntity&lt;TessellServiceGenieInfoOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceGenieInfoOps> updateTessellServiceGenieConfigOpsWithHttpInfo(UUID id, TessellServiceGenieInfoOps tessellServiceGenieInfoOps) throws RestClientException {
        Object postBody = tessellServiceGenieInfoOps;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceGenieConfigOps");
        }
        
        // verify the required parameter 'tessellServiceGenieInfoOps' is set
        if (tessellServiceGenieInfoOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceGenieInfoOps' when calling updateTessellServiceGenieConfigOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/genie", uriVariables);

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

    ParameterizedTypeReference<TessellServiceGenieInfoOps> returnType = new ParameterizedTypeReference<TessellServiceGenieInfoOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Add/update an integration for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param tessellUpdateDatabaseIntegrationDTO  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateTessellServiceIntegration(UUID id, List<TessellUpdateDatabaseIntegrationDTO> tessellUpdateDatabaseIntegrationDTO) throws RestClientException {
        return updateTessellServiceIntegrationWithHttpInfo(id, tessellUpdateDatabaseIntegrationDTO).getBody();
    }

    /**
     * Add/update an integration for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param tessellUpdateDatabaseIntegrationDTO  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateTessellServiceIntegrationWithHttpInfo(UUID id, List<TessellUpdateDatabaseIntegrationDTO> tessellUpdateDatabaseIntegrationDTO) throws RestClientException {
        Object postBody = tessellUpdateDatabaseIntegrationDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceIntegration");
        }
        
        // verify the required parameter 'tessellUpdateDatabaseIntegrationDTO' is set
        if (tessellUpdateDatabaseIntegrationDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellUpdateDatabaseIntegrationDTO' when calling updateTessellServiceIntegration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/integrations", uriVariables);

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
     * Update a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellServiceOpsDTO  (required)
     * @param resetDegradeMonitorData Specify if the service&#39;s degrade monitor is to be reset (optional, default to false)
     * @return TessellServiceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceOpsDTO updateTessellServiceOps(UUID id, TessellServiceOpsDTO tessellServiceOpsDTO, Boolean resetDegradeMonitorData) throws RestClientException {
        return updateTessellServiceOpsWithHttpInfo(id, tessellServiceOpsDTO, resetDegradeMonitorData).getBody();
    }

    /**
     * Update a DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellServiceOpsDTO  (required)
     * @param resetDegradeMonitorData Specify if the service&#39;s degrade monitor is to be reset (optional, default to false)
     * @return ResponseEntity&lt;TessellServiceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceOpsDTO> updateTessellServiceOpsWithHttpInfo(UUID id, TessellServiceOpsDTO tessellServiceOpsDTO, Boolean resetDegradeMonitorData) throws RestClientException {
        Object postBody = tessellServiceOpsDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceOps");
        }
        
        // verify the required parameter 'tessellServiceOpsDTO' is set
        if (tessellServiceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceOpsDTO' when calling updateTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "reset-degrade-monitor-data", resetDegradeMonitorData));

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

    ParameterizedTypeReference<TessellServiceOpsDTO> returnType = new ParameterizedTypeReference<TessellServiceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if Tessell libraries on computes related to a DB Service can be upgraded
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return DBServiceUpgradeEligibilityOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DBServiceUpgradeEligibilityOpsResponse upgradeEligibilityForTessellServiceOps(UUID id) throws RestClientException {
        return upgradeEligibilityForTessellServiceOpsWithHttpInfo(id).getBody();
    }

    /**
     * Check if Tessell libraries on computes related to a DB Service can be upgraded
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @return ResponseEntity&lt;DBServiceUpgradeEligibilityOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DBServiceUpgradeEligibilityOpsResponse> upgradeEligibilityForTessellServiceOpsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upgradeEligibilityForTessellServiceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/library-upgrade-eligibility", uriVariables);

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

    ParameterizedTypeReference<DBServiceUpgradeEligibilityOpsResponse> returnType = new ParameterizedTypeReference<DBServiceUpgradeEligibilityOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create/update (override) tags for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param createUpdateTessellTagPayload  (required)
     * @return List&lt;TessellTag&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellTag> upsertTessellServiceTags(UUID id, CreateUpdateTessellTagPayload createUpdateTessellTagPayload) throws RestClientException {
        return upsertTessellServiceTagsWithHttpInfo(id, createUpdateTessellTagPayload).getBody();
    }

    /**
     * Create/update (override) tags for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param createUpdateTessellTagPayload  (required)
     * @return ResponseEntity&lt;List&lt;TessellTag&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellTag>> upsertTessellServiceTagsWithHttpInfo(UUID id, CreateUpdateTessellTagPayload createUpdateTessellTagPayload) throws RestClientException {
        Object postBody = createUpdateTessellTagPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upsertTessellServiceTags");
        }
        
        // verify the required parameter 'createUpdateTessellTagPayload' is set
        if (createUpdateTessellTagPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUpdateTessellTagPayload' when calling upsertTessellServiceTags");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/tags", uriVariables);

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

    ParameterizedTypeReference<List<TessellTag>> returnType = new ParameterizedTypeReference<List<TessellTag>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
