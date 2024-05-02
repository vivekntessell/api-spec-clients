package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.GetSanitizationSchedulesApiResponse;
import com.tessell.dmm.client.model.GetSanitizationSchedulesServiceApiResponse;
import com.tessell.dmm.client.model.TessellSanitizationScheduleCreatePayload;
import com.tessell.dmm.client.model.TessellSanitizationScheduleDTO;
import com.tessell.dmm.client.model.TessellSanitizationScheduleServiceDTO;
import com.tessell.dmm.client.model.TessellSanitizationScheduleUpdatePayload;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@Component("com.tessell.dmm.client.api.DataSanitizationApi")
public class DataSanitizationApi {
    private ApiClient apiClient;

    public DataSanitizationApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataSanitizationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Sanitization Schedule for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param tessellSanitizationScheduleCreatePayload  (required)
     * @return TessellSanitizationScheduleServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSanitizationScheduleServiceDTO createAmSanitizationSchedulesServiceView(UUID id, TessellSanitizationScheduleCreatePayload tessellSanitizationScheduleCreatePayload) throws RestClientException {
        return createAmSanitizationSchedulesServiceViewWithHttpInfo(id, tessellSanitizationScheduleCreatePayload).getBody();
    }

    /**
     * Create a new Sanitization Schedule for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param tessellSanitizationScheduleCreatePayload  (required)
     * @return ResponseEntity&lt;TessellSanitizationScheduleServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSanitizationScheduleServiceDTO> createAmSanitizationSchedulesServiceViewWithHttpInfo(UUID id, TessellSanitizationScheduleCreatePayload tessellSanitizationScheduleCreatePayload) throws RestClientException {
        Object postBody = tessellSanitizationScheduleCreatePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createAmSanitizationSchedulesServiceView");
        }
        
        // verify the required parameter 'tessellSanitizationScheduleCreatePayload' is set
        if (tessellSanitizationScheduleCreatePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellSanitizationScheduleCreatePayload' when calling createAmSanitizationSchedulesServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sanitization-schedules", uriVariables);

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

    ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO> returnType = new ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to delete a sanitization schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param sanitizationScheduleId Id of the Sanitization Schedule (required)
     * @param softDelete soft-delete (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteAmSanitizationSchedule(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean softDelete) throws RestClientException {
        return deleteAmSanitizationScheduleWithHttpInfo(availabilityMachineId, sanitizationScheduleId, softDelete).getBody();
    }

    /**
     * Request to delete a sanitization schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param sanitizationScheduleId Id of the Sanitization Schedule (required)
     * @param softDelete soft-delete (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteAmSanitizationScheduleWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteAmSanitizationSchedule");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling deleteAmSanitizationSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

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
     * Submit a request to delete the Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteAmSanitizationScheduleServiceView(UUID availabilityMachineId, UUID sanitizationScheduleId) throws RestClientException {
        return deleteAmSanitizationScheduleServiceViewWithHttpInfo(availabilityMachineId, sanitizationScheduleId).getBody();
    }

    /**
     * Submit a request to delete the Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteAmSanitizationScheduleServiceViewWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteAmSanitizationScheduleServiceView");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling deleteAmSanitizationScheduleServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

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
     * Request to get a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param sanitizationScheduleId sanitizationScheduleId (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellSanitizationScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSanitizationScheduleDTO getAmSanitizationSchedule(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean loadAcls, String timeZone) throws RestClientException {
        return getAmSanitizationScheduleWithHttpInfo(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone).getBody();
    }

    /**
     * Request to get a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param sanitizationScheduleId sanitizationScheduleId (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellSanitizationScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSanitizationScheduleDTO> getAmSanitizationScheduleWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getAmSanitizationSchedule");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling getAmSanitizationSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TessellSanitizationScheduleDTO> returnType = new ParameterizedTypeReference<TessellSanitizationScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellSanitizationScheduleServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSanitizationScheduleServiceDTO getAmSanitizationScheduleServiceView(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean loadAcls, String timeZone) throws RestClientException {
        return getAmSanitizationScheduleServiceViewWithHttpInfo(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone).getBody();
    }

    /**
     * Get details about a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellSanitizationScheduleServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSanitizationScheduleServiceDTO> getAmSanitizationScheduleServiceViewWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getAmSanitizationScheduleServiceView");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling getAmSanitizationScheduleServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO> returnType = new ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to get Sanitization Schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param name Sanitization Schedule name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSanitizationSchedulesApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSanitizationSchedulesApiResponse getAmSanitizationSchedules(UUID availabilityMachineId, String name, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAmSanitizationSchedulesWithHttpInfo(availabilityMachineId, name, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Request to get Sanitization Schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param name Sanitization Schedule name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSanitizationSchedulesApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSanitizationSchedulesApiResponse> getAmSanitizationSchedulesWithHttpInfo(UUID availabilityMachineId, String name, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getAmSanitizationSchedules");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<GetSanitizationSchedulesApiResponse> returnType = new ParameterizedTypeReference<GetSanitizationSchedulesApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of Sanitization Schedules that are associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param name Filter the result based on Sanitization Schedule name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSanitizationSchedulesServiceApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSanitizationSchedulesServiceApiResponse getAmSanitizationSchedulesServiceView(UUID id, String name, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAmSanitizationSchedulesServiceViewWithHttpInfo(id, name, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of Sanitization Schedules that are associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param name Filter the result based on Sanitization Schedule name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSanitizationSchedulesServiceApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSanitizationSchedulesServiceApiResponse> getAmSanitizationSchedulesServiceViewWithHttpInfo(UUID id, String name, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAmSanitizationSchedulesServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sanitization-schedules", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<GetSanitizationSchedulesServiceApiResponse> returnType = new ParameterizedTypeReference<GetSanitizationSchedulesServiceApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to update a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param sanitizationScheduleId sanitizationScheduleId (required)
     * @param tessellSanitizationScheduleDTO  (required)
     * @return TessellSanitizationScheduleDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSanitizationScheduleDTO updateAmSanitizationSchedule(UUID availabilityMachineId, UUID sanitizationScheduleId, TessellSanitizationScheduleDTO tessellSanitizationScheduleDTO) throws RestClientException {
        return updateAmSanitizationScheduleWithHttpInfo(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleDTO).getBody();
    }

    /**
     * Request to update a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId availabilityMachineId (required)
     * @param sanitizationScheduleId sanitizationScheduleId (required)
     * @param tessellSanitizationScheduleDTO  (required)
     * @return ResponseEntity&lt;TessellSanitizationScheduleDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSanitizationScheduleDTO> updateAmSanitizationScheduleWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId, TessellSanitizationScheduleDTO tessellSanitizationScheduleDTO) throws RestClientException {
        Object postBody = tessellSanitizationScheduleDTO;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling updateAmSanitizationSchedule");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling updateAmSanitizationSchedule");
        }
        
        // verify the required parameter 'tessellSanitizationScheduleDTO' is set
        if (tessellSanitizationScheduleDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellSanitizationScheduleDTO' when calling updateAmSanitizationSchedule");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

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

    ParameterizedTypeReference<TessellSanitizationScheduleDTO> returnType = new ParameterizedTypeReference<TessellSanitizationScheduleDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @param tessellSanitizationScheduleUpdatePayload  (required)
     * @return TessellSanitizationScheduleServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSanitizationScheduleServiceDTO updateAmSanitizationScheduleServiceView(UUID availabilityMachineId, UUID sanitizationScheduleId, TessellSanitizationScheduleUpdatePayload tessellSanitizationScheduleUpdatePayload) throws RestClientException {
        return updateAmSanitizationScheduleServiceViewWithHttpInfo(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleUpdatePayload).getBody();
    }

    /**
     * Update a Sanitization Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param sanitizationScheduleId ID of the Sanitization Schedule (required)
     * @param tessellSanitizationScheduleUpdatePayload  (required)
     * @return ResponseEntity&lt;TessellSanitizationScheduleServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSanitizationScheduleServiceDTO> updateAmSanitizationScheduleServiceViewWithHttpInfo(UUID availabilityMachineId, UUID sanitizationScheduleId, TessellSanitizationScheduleUpdatePayload tessellSanitizationScheduleUpdatePayload) throws RestClientException {
        Object postBody = tessellSanitizationScheduleUpdatePayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling updateAmSanitizationScheduleServiceView");
        }
        
        // verify the required parameter 'sanitizationScheduleId' is set
        if (sanitizationScheduleId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sanitizationScheduleId' when calling updateAmSanitizationScheduleServiceView");
        }
        
        // verify the required parameter 'tessellSanitizationScheduleUpdatePayload' is set
        if (tessellSanitizationScheduleUpdatePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellSanitizationScheduleUpdatePayload' when calling updateAmSanitizationScheduleServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("sanitizationScheduleId", sanitizationScheduleId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId}", uriVariables);

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

    ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO> returnType = new ParameterizedTypeReference<TessellSanitizationScheduleServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
