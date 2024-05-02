package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.MaintenanceWindowDTO;
import com.tessell.database.system.client.model.MaintenanceWindowListResponse;
import com.tessell.database.system.client.model.MaintenanceWindowOpsDTO;
import com.tessell.database.system.client.model.MaintenanceWindowOpsListResponse;
import com.tessell.database.system.client.model.MaintenanceWindowStatus;
import com.tessell.database.system.client.model.MaintenanceWindowTaskApplyRequest;
import com.tessell.database.system.client.model.MaintenanceWindowTaskCancelRequest;
import com.tessell.database.system.client.model.MaintenanceWindowTriggerRequest;
import com.tessell.database.system.client.model.MaintenanceWindowType;
import com.tessell.database.system.client.model.MaintenanceWindowUpdateRequest;
import com.tessell.database.system.client.model.TaskOpsDTO;
import com.tessell.database.system.client.model.TaskResponse;
import com.tessell.database.system.client.model.TessellServiceMaintenanceWindow;
import com.tessell.database.system.client.model.TriggerMaintenanceWindowCallbackPayload;
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
@Component("com.tessell.database.system.client.api.MaintenanceWindowApi")
public class MaintenanceWindowApi {
    private ApiClient apiClient;

    public MaintenanceWindowApi() {
        this(new ApiClient());
    }

    @Autowired
    public MaintenanceWindowApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply Maintenance Window Task
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowTaskApplyRequest  (required)
     * @return TaskResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskResponse applyMaintenanceWindowTasks(UUID id, MaintenanceWindowTaskApplyRequest maintenanceWindowTaskApplyRequest) throws RestClientException {
        return applyMaintenanceWindowTasksWithHttpInfo(id, maintenanceWindowTaskApplyRequest).getBody();
    }

    /**
     * Apply Maintenance Window Task
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowTaskApplyRequest  (required)
     * @return ResponseEntity&lt;TaskResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskResponse> applyMaintenanceWindowTasksWithHttpInfo(UUID id, MaintenanceWindowTaskApplyRequest maintenanceWindowTaskApplyRequest) throws RestClientException {
        Object postBody = maintenanceWindowTaskApplyRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling applyMaintenanceWindowTasks");
        }
        
        // verify the required parameter 'maintenanceWindowTaskApplyRequest' is set
        if (maintenanceWindowTaskApplyRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maintenanceWindowTaskApplyRequest' when calling applyMaintenanceWindowTasks");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/maintenance-windows/{id}/tasks", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Remove task from existing maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowTaskCancelRequest  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus cancelMaintenanceWindowTask(UUID id, MaintenanceWindowTaskCancelRequest maintenanceWindowTaskCancelRequest) throws RestClientException {
        return cancelMaintenanceWindowTaskWithHttpInfo(id, maintenanceWindowTaskCancelRequest).getBody();
    }

    /**
     * Remove task from existing maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowTaskCancelRequest  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> cancelMaintenanceWindowTaskWithHttpInfo(UUID id, MaintenanceWindowTaskCancelRequest maintenanceWindowTaskCancelRequest) throws RestClientException {
        Object postBody = maintenanceWindowTaskCancelRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cancelMaintenanceWindowTask");
        }
        
        // verify the required parameter 'maintenanceWindowTaskCancelRequest' is set
        if (maintenanceWindowTaskCancelRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maintenanceWindowTaskCancelRequest' when calling cancelMaintenanceWindowTask");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/maintenance-windows/{id}/tasks", uriVariables);

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
     * Get maintenance window by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @return MaintenanceWindowDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowDTO getMaintenanceWindowById(UUID id) throws RestClientException {
        return getMaintenanceWindowByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get maintenance window by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @return ResponseEntity&lt;MaintenanceWindowDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowDTO> getMaintenanceWindowByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getMaintenanceWindowById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/maintenance-windows/{id}", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get maintenance window by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @return MaintenanceWindowOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowOpsDTO getMaintenanceWindowOpsById(UUID id) throws RestClientException {
        return getMaintenanceWindowOpsByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get maintenance window by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @return ResponseEntity&lt;MaintenanceWindowOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowOpsDTO> getMaintenanceWindowOpsByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getMaintenanceWindowOpsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows/{id}", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowOpsDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get maintenance windows for given service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param statuses  (optional)
     * @param loadTasks Load the tasks that are part of the Maintenance Windows (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return MaintenanceWindowListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowListResponse getMaintenanceWindowsForService(UUID id, List<MaintenanceWindowStatus> statuses, Boolean loadTasks, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getMaintenanceWindowsForServiceWithHttpInfo(id, statuses, loadTasks, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get maintenance windows for given service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param statuses  (optional)
     * @param loadTasks Load the tasks that are part of the Maintenance Windows (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;MaintenanceWindowListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowListResponse> getMaintenanceWindowsForServiceWithHttpInfo(UUID id, List<MaintenanceWindowStatus> statuses, Boolean loadTasks, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getMaintenanceWindowsForService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/maintenance-windows", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-tasks", loadTasks));
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

    ParameterizedTypeReference<MaintenanceWindowListResponse> returnType = new ParameterizedTypeReference<MaintenanceWindowListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get maintenance windows
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityId Load the Maintenance Window for particular entity (optional)
     * @param statuses  (optional)
     * @param type Load the Maintenance Window of particular type (optional)
     * @param loadTasks Load the tasks that are part of the Maintenance Windows (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return MaintenanceWindowOpsListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowOpsListResponse getMaintenanceWindowsOps(UUID entityId, List<MaintenanceWindowStatus> statuses, MaintenanceWindowType type, Boolean loadTasks, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getMaintenanceWindowsOpsWithHttpInfo(entityId, statuses, type, loadTasks, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get maintenance windows
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityId Load the Maintenance Window for particular entity (optional)
     * @param statuses  (optional)
     * @param type Load the Maintenance Window of particular type (optional)
     * @param loadTasks Load the tasks that are part of the Maintenance Windows (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;MaintenanceWindowOpsListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowOpsListResponse> getMaintenanceWindowsOpsWithHttpInfo(UUID entityId, List<MaintenanceWindowStatus> statuses, MaintenanceWindowType type, Boolean loadTasks, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-id", entityId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-tasks", loadTasks));
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

    ParameterizedTypeReference<MaintenanceWindowOpsListResponse> returnType = new ParameterizedTypeReference<MaintenanceWindowOpsListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Schedule Maintenance Window for Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param body  (required)
     * @return MaintenanceWindowOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowOpsDTO scheduleMaintenanceWindowForService(UUID id, Object body) throws RestClientException {
        return scheduleMaintenanceWindowForServiceWithHttpInfo(id, body).getBody();
    }

    /**
     * Schedule Maintenance Window for Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MaintenanceWindowOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowOpsDTO> scheduleMaintenanceWindowForServiceWithHttpInfo(UUID id, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling scheduleMaintenanceWindowForService");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling scheduleMaintenanceWindowForService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{id}/maintenance-windows", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowOpsDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Trigger maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param body  (required)
     * @return MaintenanceWindowDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowDTO triggerMaintenanceWindow(UUID id, Object body) throws RestClientException {
        return triggerMaintenanceWindowWithHttpInfo(id, body).getBody();
    }

    /**
     * Trigger maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param body  (required)
     * @return ResponseEntity&lt;MaintenanceWindowDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowDTO> triggerMaintenanceWindowWithHttpInfo(UUID id, Object body) throws RestClientException {
        Object postBody = body;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling triggerMaintenanceWindow");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'body' when calling triggerMaintenanceWindow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/maintenance-windows/{id}", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Process response for Maintenance Window workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param triggerMaintenanceWindowCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus triggerMaintenanceWindowCallback(UUID id, TriggerMaintenanceWindowCallbackPayload triggerMaintenanceWindowCallbackPayload) throws RestClientException {
        return triggerMaintenanceWindowCallbackWithHttpInfo(id, triggerMaintenanceWindowCallbackPayload).getBody();
    }

    /**
     * Process response for Maintenance Window workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param triggerMaintenanceWindowCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> triggerMaintenanceWindowCallbackWithHttpInfo(UUID id, TriggerMaintenanceWindowCallbackPayload triggerMaintenanceWindowCallbackPayload) throws RestClientException {
        Object postBody = triggerMaintenanceWindowCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling triggerMaintenanceWindowCallback");
        }
        
        // verify the required parameter 'triggerMaintenanceWindowCallbackPayload' is set
        if (triggerMaintenanceWindowCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'triggerMaintenanceWindowCallbackPayload' when calling triggerMaintenanceWindowCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows/{id}/callback", uriVariables);

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
     * Trigger maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param maintenanceWindowTriggerRequest  (required)
     * @return List&lt;MaintenanceWindowOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<MaintenanceWindowOpsDTO> triggerMaintenanceWindowOps(MaintenanceWindowTriggerRequest maintenanceWindowTriggerRequest) throws RestClientException {
        return triggerMaintenanceWindowOpsWithHttpInfo(maintenanceWindowTriggerRequest).getBody();
    }

    /**
     * Trigger maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param maintenanceWindowTriggerRequest  (required)
     * @return ResponseEntity&lt;List&lt;MaintenanceWindowOpsDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<MaintenanceWindowOpsDTO>> triggerMaintenanceWindowOpsWithHttpInfo(MaintenanceWindowTriggerRequest maintenanceWindowTriggerRequest) throws RestClientException {
        Object postBody = maintenanceWindowTriggerRequest;
        
        // verify the required parameter 'maintenanceWindowTriggerRequest' is set
        if (maintenanceWindowTriggerRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maintenanceWindowTriggerRequest' when calling triggerMaintenanceWindowOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<MaintenanceWindowOpsDTO>> returnType = new ParameterizedTypeReference<List<MaintenanceWindowOpsDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowUpdateRequest  (required)
     * @return MaintenanceWindowDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowDTO updateMaintenanceWindow(UUID id, MaintenanceWindowUpdateRequest maintenanceWindowUpdateRequest) throws RestClientException {
        return updateMaintenanceWindowWithHttpInfo(id, maintenanceWindowUpdateRequest).getBody();
    }

    /**
     * Update maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowUpdateRequest  (required)
     * @return ResponseEntity&lt;MaintenanceWindowDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowDTO> updateMaintenanceWindowWithHttpInfo(UUID id, MaintenanceWindowUpdateRequest maintenanceWindowUpdateRequest) throws RestClientException {
        Object postBody = maintenanceWindowUpdateRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateMaintenanceWindow");
        }
        
        // verify the required parameter 'maintenanceWindowUpdateRequest' is set
        if (maintenanceWindowUpdateRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maintenanceWindowUpdateRequest' when calling updateMaintenanceWindow");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/maintenance-windows/{id}", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update maintenance window config for given service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param tessellServiceMaintenanceWindow  (required)
     * @return TessellServiceMaintenanceWindow
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServiceMaintenanceWindow updateMaintenanceWindowForService(UUID id, TessellServiceMaintenanceWindow tessellServiceMaintenanceWindow) throws RestClientException {
        return updateMaintenanceWindowForServiceWithHttpInfo(id, tessellServiceMaintenanceWindow).getBody();
    }

    /**
     * Update maintenance window config for given service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param tessellServiceMaintenanceWindow  (required)
     * @return ResponseEntity&lt;TessellServiceMaintenanceWindow&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServiceMaintenanceWindow> updateMaintenanceWindowForServiceWithHttpInfo(UUID id, TessellServiceMaintenanceWindow tessellServiceMaintenanceWindow) throws RestClientException {
        Object postBody = tessellServiceMaintenanceWindow;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateMaintenanceWindowForService");
        }
        
        // verify the required parameter 'tessellServiceMaintenanceWindow' is set
        if (tessellServiceMaintenanceWindow == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellServiceMaintenanceWindow' when calling updateMaintenanceWindowForService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/maintenance-windows", uriVariables);

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

    ParameterizedTypeReference<TessellServiceMaintenanceWindow> returnType = new ParameterizedTypeReference<TessellServiceMaintenanceWindow>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowOpsDTO  (required)
     * @return MaintenanceWindowOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MaintenanceWindowOpsDTO updateMaintenanceWindowOps(UUID id, MaintenanceWindowOpsDTO maintenanceWindowOpsDTO) throws RestClientException {
        return updateMaintenanceWindowOpsWithHttpInfo(id, maintenanceWindowOpsDTO).getBody();
    }

    /**
     * Update maintenance window
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param maintenanceWindowOpsDTO  (required)
     * @return ResponseEntity&lt;MaintenanceWindowOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MaintenanceWindowOpsDTO> updateMaintenanceWindowOpsWithHttpInfo(UUID id, MaintenanceWindowOpsDTO maintenanceWindowOpsDTO) throws RestClientException {
        Object postBody = maintenanceWindowOpsDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateMaintenanceWindowOps");
        }
        
        // verify the required parameter 'maintenanceWindowOpsDTO' is set
        if (maintenanceWindowOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maintenanceWindowOpsDTO' when calling updateMaintenanceWindowOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows/{id}", uriVariables);

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

    ParameterizedTypeReference<MaintenanceWindowOpsDTO> returnType = new ParameterizedTypeReference<MaintenanceWindowOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update maintenance window task
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param taskOpsDTO  (required)
     * @return TaskOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskOpsDTO updateTaskOps(UUID id, TaskOpsDTO taskOpsDTO) throws RestClientException {
        return updateTaskOpsWithHttpInfo(id, taskOpsDTO).getBody();
    }

    /**
     * Update maintenance window task
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of entity (required)
     * @param taskOpsDTO  (required)
     * @return ResponseEntity&lt;TaskOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskOpsDTO> updateTaskOpsWithHttpInfo(UUID id, TaskOpsDTO taskOpsDTO) throws RestClientException {
        Object postBody = taskOpsDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTaskOps");
        }
        
        // verify the required parameter 'taskOpsDTO' is set
        if (taskOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskOpsDTO' when calling updateTaskOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/maintenance-windows/{id}/tasks", uriVariables);

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

    ParameterizedTypeReference<TaskOpsDTO> returnType = new ParameterizedTypeReference<TaskOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
