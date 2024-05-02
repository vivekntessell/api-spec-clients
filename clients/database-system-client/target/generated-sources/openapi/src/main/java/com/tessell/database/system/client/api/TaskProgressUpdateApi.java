package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.PublishTaskProgressEventPayload;
import com.tessell.database.system.client.model.TaskProgressUpdateResponse;

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
@Component("com.tessell.database.system.client.api.TaskProgressUpdateApi")
public class TaskProgressUpdateApi {
    private ApiClient apiClient;

    public TaskProgressUpdateApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskProgressUpdateApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Return the task progress updates for the given resource type and id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param resourceId Tessell Entity resource Id (required)
     * @param resourceType Tessell Entity type (required)
     * @param availabilityMachineId Availability Machine id which would be looked up only when resource-type is \&quot;DB_SNAPSHOT\&quot; (optional)
     * @return TaskProgressUpdateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskProgressUpdateResponse getTaskProgressUpdate(String resourceId, String resourceType, String availabilityMachineId) throws RestClientException {
        return getTaskProgressUpdateWithHttpInfo(resourceId, resourceType, availabilityMachineId).getBody();
    }

    /**
     * Return the task progress updates for the given resource type and id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param resourceId Tessell Entity resource Id (required)
     * @param resourceType Tessell Entity type (required)
     * @param availabilityMachineId Availability Machine id which would be looked up only when resource-type is \&quot;DB_SNAPSHOT\&quot; (optional)
     * @return ResponseEntity&lt;TaskProgressUpdateResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskProgressUpdateResponse> getTaskProgressUpdateWithHttpInfo(String resourceId, String resourceType, String availabilityMachineId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'resourceId' is set
        if (resourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceId' when calling getTaskProgressUpdate");
        }
        
        // verify the required parameter 'resourceType' is set
        if (resourceType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resourceType' when calling getTaskProgressUpdate");
        }
        
        String path = apiClient.expandPath("/task-updates", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource-id", resourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource-type", resourceType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availability-machine-id", availabilityMachineId));

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

    ParameterizedTypeReference<TaskProgressUpdateResponse> returnType = new ParameterizedTypeReference<TaskProgressUpdateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Publishes an ActivityLog event to update the task progress
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param publishTaskProgressEventPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus publishTaskProgressEvent(PublishTaskProgressEventPayload publishTaskProgressEventPayload) throws RestClientException {
        return publishTaskProgressEventWithHttpInfo(publishTaskProgressEventPayload).getBody();
    }

    /**
     * Publishes an ActivityLog event to update the task progress
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param publishTaskProgressEventPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> publishTaskProgressEventWithHttpInfo(PublishTaskProgressEventPayload publishTaskProgressEventPayload) throws RestClientException {
        Object postBody = publishTaskProgressEventPayload;
        
        // verify the required parameter 'publishTaskProgressEventPayload' is set
        if (publishTaskProgressEventPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'publishTaskProgressEventPayload' when calling publishTaskProgressEvent");
        }
        
        String path = apiClient.expandPath("/tessell-ops/task-progress-event", Collections.<String, Object>emptyMap());

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
}
