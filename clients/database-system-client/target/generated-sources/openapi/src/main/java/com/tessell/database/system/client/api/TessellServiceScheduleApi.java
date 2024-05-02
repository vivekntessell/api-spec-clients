package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.CreateStartStopSchedulePayload;
import com.tessell.database.system.client.model.DeletionScheduleDTO;
import com.tessell.database.system.client.model.DeletionSchedulePayload;
import com.tessell.database.system.client.model.DeletionScheduleResponse;
import com.tessell.database.system.client.model.ServiceSchedulesResponse;
import com.tessell.database.system.client.model.StartStopScheduleDTO;
import com.tessell.database.system.client.model.StartStopScheduleOpsDTO;
import com.tessell.database.system.client.model.StartStopScheduleOpsResponse;
import com.tessell.database.system.client.model.StartStopScheduleResponse;
import com.tessell.database.system.client.model.StartStopScheduleStatus;
import java.util.UUID;
import com.tessell.database.system.client.model.UpdateStartStopSchedulePayload;

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
@Component("com.tessell.database.system.client.api.TessellServiceScheduleApi")
public class TessellServiceScheduleApi {
    private ApiClient apiClient;

    public TessellServiceScheduleApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellServiceScheduleApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deletionSchedulePayload  (required)
     * @return DeletionScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletionScheduleDTO createServiceDeletionSchedule(UUID serviceId, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        return createServiceDeletionScheduleWithHttpInfo(serviceId, deletionSchedulePayload).getBody();
    }

    /**
     * Creates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deletionSchedulePayload  (required)
     * @return ResponseEntity&lt;DeletionScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeletionScheduleDTO> createServiceDeletionScheduleWithHttpInfo(UUID serviceId, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        Object postBody = deletionSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createServiceDeletionSchedule");
        }
        
        // verify the required parameter 'deletionSchedulePayload' is set
        if (deletionSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deletionSchedulePayload' when calling createServiceDeletionSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/delete", uriVariables);

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

    ParameterizedTypeReference<DeletionScheduleDTO> returnType = new ParameterizedTypeReference<DeletionScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Creates a start/stop schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createStartStopSchedulePayload  (required)
     * @return StartStopScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleDTO createServiceStartStopSchedule(UUID serviceId, CreateStartStopSchedulePayload createStartStopSchedulePayload) throws RestClientException {
        return createServiceStartStopScheduleWithHttpInfo(serviceId, createStartStopSchedulePayload).getBody();
    }

    /**
     * Creates a start/stop schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createStartStopSchedulePayload  (required)
     * @return ResponseEntity&lt;StartStopScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleDTO> createServiceStartStopScheduleWithHttpInfo(UUID serviceId, CreateStartStopSchedulePayload createStartStopSchedulePayload) throws RestClientException {
        Object postBody = createStartStopSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createServiceStartStopSchedule");
        }
        
        // verify the required parameter 'createStartStopSchedulePayload' is set
        if (createStartStopSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createStartStopSchedulePayload' when calling createServiceStartStopSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleDTO> returnType = new ParameterizedTypeReference<StartStopScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createStartStopSchedulePayload  (required)
     * @return StartStopScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleDTO createServiceStartStopScheduleOps(UUID serviceId, CreateStartStopSchedulePayload createStartStopSchedulePayload) throws RestClientException {
        return createServiceStartStopScheduleOpsWithHttpInfo(serviceId, createStartStopSchedulePayload).getBody();
    }

    /**
     * Create tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param createStartStopSchedulePayload  (required)
     * @return ResponseEntity&lt;StartStopScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleDTO> createServiceStartStopScheduleOpsWithHttpInfo(UUID serviceId, CreateStartStopSchedulePayload createStartStopSchedulePayload) throws RestClientException {
        Object postBody = createStartStopSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createServiceStartStopScheduleOps");
        }
        
        // verify the required parameter 'createStartStopSchedulePayload' is set
        if (createStartStopSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createStartStopSchedulePayload' when calling createServiceStartStopScheduleOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/schedules/start-stop", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleDTO> returnType = new ParameterizedTypeReference<StartStopScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deletes the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteServiceDeletionSchedule(UUID serviceId) throws RestClientException {
        return deleteServiceDeletionScheduleWithHttpInfo(serviceId).getBody();
    }

    /**
     * Deletes the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteServiceDeletionScheduleWithHttpInfo(UUID serviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteServiceDeletionSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/delete", uriVariables);

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
     * Deletes the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteServiceDeletionScheduleTFP(UUID serviceId, UUID id) throws RestClientException {
        return deleteServiceDeletionScheduleTFPWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * Deletes the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteServiceDeletionScheduleTFPWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteServiceDeletionScheduleTFP");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteServiceDeletionScheduleTFP");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{service-id}/schedules/delete/{id}", uriVariables);

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
     * Deletes the given start/stop schedule for the DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteServiceStartStopSchedule(UUID serviceId, UUID id) throws RestClientException {
        return deleteServiceStartStopScheduleWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * Deletes the given start/stop schedule for the DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteServiceStartStopScheduleWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteServiceStartStopSchedule");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteServiceStartStopSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop/{id}", uriVariables);

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
     * Returns the deletion schedule details for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return DeletionScheduleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletionScheduleResponse getServiceDeletionSchedule(UUID serviceId) throws RestClientException {
        return getServiceDeletionScheduleWithHttpInfo(serviceId).getBody();
    }

    /**
     * Returns the deletion schedule details for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ResponseEntity&lt;DeletionScheduleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeletionScheduleResponse> getServiceDeletionScheduleWithHttpInfo(UUID serviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceDeletionSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/delete", uriVariables);

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

    ParameterizedTypeReference<DeletionScheduleResponse> returnType = new ParameterizedTypeReference<DeletionScheduleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the deletion schedule details for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @return DeletionScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletionScheduleDTO getServiceDeletionScheduleTFP(UUID serviceId, UUID id) throws RestClientException {
        return getServiceDeletionScheduleTFPWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * Returns the deletion schedule details for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @return ResponseEntity&lt;DeletionScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeletionScheduleDTO> getServiceDeletionScheduleTFPWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceDeletionScheduleTFP");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getServiceDeletionScheduleTFP");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{service-id}/schedules/delete/{id}", uriVariables);

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

    ParameterizedTypeReference<DeletionScheduleDTO> returnType = new ParameterizedTypeReference<DeletionScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the details about all the automated schedules on the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ServiceSchedulesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceSchedulesResponse getServiceSchedules(UUID serviceId) throws RestClientException {
        return getServiceSchedulesWithHttpInfo(serviceId).getBody();
    }

    /**
     * Returns the details about all the automated schedules on the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ResponseEntity&lt;ServiceSchedulesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceSchedulesResponse> getServiceSchedulesWithHttpInfo(UUID serviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceSchedules");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules", uriVariables);

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

    ParameterizedTypeReference<ServiceSchedulesResponse> returnType = new ParameterizedTypeReference<ServiceSchedulesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Return the details about the start/stop schedule for given schedule ID for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return StartStopScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleDTO getServiceStartStopSchedule(UUID serviceId, UUID id) throws RestClientException {
        return getServiceStartStopScheduleWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * Return the details about the start/stop schedule for given schedule ID for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return ResponseEntity&lt;StartStopScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleDTO> getServiceStartStopScheduleWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceStartStopSchedule");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getServiceStartStopSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop/{id}", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleDTO> returnType = new ParameterizedTypeReference<StartStopScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return StartStopScheduleOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleOpsDTO getServiceStartStopScheduleOps(UUID serviceId, UUID id) throws RestClientException {
        return getServiceStartStopScheduleOpsWithHttpInfo(serviceId, id).getBody();
    }

    /**
     * Get tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @return ResponseEntity&lt;StartStopScheduleOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleOpsDTO> getServiceStartStopScheduleOpsWithHttpInfo(UUID serviceId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceStartStopScheduleOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getServiceStartStopScheduleOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/schedules/start-stop/{id}", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleOpsDTO> returnType = new ParameterizedTypeReference<StartStopScheduleOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get the details of start/stop schedules for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param status DB Service schedule status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return StartStopScheduleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleResponse getServiceStartStopSchedules(UUID serviceId, List<StartStopScheduleStatus> status, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getServiceStartStopSchedulesWithHttpInfo(serviceId, status, pageSize, pageOffset).getBody();
    }

    /**
     * Get the details of start/stop schedules for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param status DB Service schedule status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;StartStopScheduleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleResponse> getServiceStartStopSchedulesWithHttpInfo(UUID serviceId, List<StartStopScheduleStatus> status, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceStartStopSchedules");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<StartStopScheduleResponse> returnType = new ParameterizedTypeReference<StartStopScheduleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get tessell service start stop schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param status tessell service schedule status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return StartStopScheduleOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleOpsResponse getServiceStartStopSchedulesOps(UUID serviceId, List<StartStopScheduleStatus> status, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getServiceStartStopSchedulesOpsWithHttpInfo(serviceId, status, pageSize, pageOffset).getBody();
    }

    /**
     * get tessell service start stop schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param status tessell service schedule status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;StartStopScheduleOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleOpsResponse> getServiceStartStopSchedulesOpsWithHttpInfo(UUID serviceId, List<StartStopScheduleStatus> status, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getServiceStartStopSchedulesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/schedules/start-stop", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<StartStopScheduleOpsResponse> returnType = new ParameterizedTypeReference<StartStopScheduleOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deletionSchedulePayload  (required)
     * @return DeletionScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletionScheduleDTO updateServiceDeletionSchedule(UUID serviceId, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        return updateServiceDeletionScheduleWithHttpInfo(serviceId, deletionSchedulePayload).getBody();
    }

    /**
     * Updates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param deletionSchedulePayload  (required)
     * @return ResponseEntity&lt;DeletionScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeletionScheduleDTO> updateServiceDeletionScheduleWithHttpInfo(UUID serviceId, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        Object postBody = deletionSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateServiceDeletionSchedule");
        }
        
        // verify the required parameter 'deletionSchedulePayload' is set
        if (deletionSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deletionSchedulePayload' when calling updateServiceDeletionSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/delete", uriVariables);

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

    ParameterizedTypeReference<DeletionScheduleDTO> returnType = new ParameterizedTypeReference<DeletionScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @param deletionSchedulePayload  (required)
     * @return DeletionScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeletionScheduleDTO updateServiceDeletionScheduleTFP(UUID serviceId, UUID id, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        return updateServiceDeletionScheduleTFPWithHttpInfo(serviceId, id, deletionSchedulePayload).getBody();
    }

    /**
     * Updates the deletion schedule for the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param id Id of entity (required)
     * @param deletionSchedulePayload  (required)
     * @return ResponseEntity&lt;DeletionScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeletionScheduleDTO> updateServiceDeletionScheduleTFPWithHttpInfo(UUID serviceId, UUID id, DeletionSchedulePayload deletionSchedulePayload) throws RestClientException {
        Object postBody = deletionSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateServiceDeletionScheduleTFP");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateServiceDeletionScheduleTFP");
        }
        
        // verify the required parameter 'deletionSchedulePayload' is set
        if (deletionSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deletionSchedulePayload' when calling updateServiceDeletionScheduleTFP");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{service-id}/schedules/delete/{id}", uriVariables);

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

    ParameterizedTypeReference<DeletionScheduleDTO> returnType = new ParameterizedTypeReference<DeletionScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates the given start/stop schedule on the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @param updateStartStopSchedulePayload  (required)
     * @return StartStopScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleDTO updateServiceStartStopSchedule(UUID serviceId, UUID id, UpdateStartStopSchedulePayload updateStartStopSchedulePayload) throws RestClientException {
        return updateServiceStartStopScheduleWithHttpInfo(serviceId, id, updateStartStopSchedulePayload).getBody();
    }

    /**
     * Updates the given start/stop schedule on the DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @param updateStartStopSchedulePayload  (required)
     * @return ResponseEntity&lt;StartStopScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleDTO> updateServiceStartStopScheduleWithHttpInfo(UUID serviceId, UUID id, UpdateStartStopSchedulePayload updateStartStopSchedulePayload) throws RestClientException {
        Object postBody = updateStartStopSchedulePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateServiceStartStopSchedule");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateServiceStartStopSchedule");
        }
        
        // verify the required parameter 'updateStartStopSchedulePayload' is set
        if (updateStartStopSchedulePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateStartStopSchedulePayload' when calling updateServiceStartStopSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop/{id}", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleDTO> returnType = new ParameterizedTypeReference<StartStopScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @param startStopScheduleOpsDTO  (required)
     * @return StartStopScheduleOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StartStopScheduleOpsDTO updateServiceStartStopScheduleOps(UUID serviceId, UUID id, StartStopScheduleOpsDTO startStopScheduleOpsDTO) throws RestClientException {
        return updateServiceStartStopScheduleOpsWithHttpInfo(serviceId, id, startStopScheduleOpsDTO).getBody();
    }

    /**
     * Update tessell service start stop schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param id The ID of the start/stop schedule (required)
     * @param startStopScheduleOpsDTO  (required)
     * @return ResponseEntity&lt;StartStopScheduleOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StartStopScheduleOpsDTO> updateServiceStartStopScheduleOpsWithHttpInfo(UUID serviceId, UUID id, StartStopScheduleOpsDTO startStopScheduleOpsDTO) throws RestClientException {
        Object postBody = startStopScheduleOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateServiceStartStopScheduleOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateServiceStartStopScheduleOps");
        }
        
        // verify the required parameter 'startStopScheduleOpsDTO' is set
        if (startStopScheduleOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startStopScheduleOpsDTO' when calling updateServiceStartStopScheduleOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/schedules/start-stop/{id}", uriVariables);

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

    ParameterizedTypeReference<StartStopScheduleOpsDTO> returnType = new ParameterizedTypeReference<StartStopScheduleOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update the status of the given start/stop schedule for the DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param scheduleId The ID of the schedule (required)
     * @param action Action (like resume/pause) to be taken on the start/stop schedule (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateStartStopScheduleStatus(UUID serviceId, UUID scheduleId, String action) throws RestClientException {
        return updateStartStopScheduleStatusWithHttpInfo(serviceId, scheduleId, action).getBody();
    }

    /**
     * Update the status of the given start/stop schedule for the DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param scheduleId The ID of the schedule (required)
     * @param action Action (like resume/pause) to be taken on the start/stop schedule (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateStartStopScheduleStatusWithHttpInfo(UUID serviceId, UUID scheduleId, String action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateStartStopScheduleStatus");
        }
        
        // verify the required parameter 'scheduleId' is set
        if (scheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'scheduleId' when calling updateStartStopScheduleStatus");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateStartStopScheduleStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        uriVariables.put("scheduleId", scheduleId);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/services/{serviceId}/schedules/start-stop/{scheduleId}/{action}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
