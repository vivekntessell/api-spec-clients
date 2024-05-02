package com.tessell.event.client.api;

import com.tessell.event.client.invoker.ApiClient;

import com.tessell.event.client.model.TessellApiErrorDTO;
import com.tessell.event.client.model.TessellApiErrorOpsDTO;
import com.tessell.event.client.model.TessellBatchAcknowledgeRequestDTO;
import com.tessell.event.client.model.TessellNotificationApiResponseDTO;
import com.tessell.event.client.model.TessellNotificationCountDTO;
import com.tessell.event.client.model.TessellNotificationSummaryApiResponseDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:47.078643+05:30[Asia/Kolkata]")
@Component("com.tessell.event.client.api.NotificationControllerApi")
public class NotificationControllerApi {
    private ApiClient apiClient;

    public NotificationControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public NotificationControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Acknowledge notifications
     * Acknowledges notifications
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBatchAcknowledgeRequestDTO Batch Acknowledge Body (required)
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> batchAcknowledgeNotification(TessellBatchAcknowledgeRequestDTO tessellBatchAcknowledgeRequestDTO) throws RestClientException {
        return batchAcknowledgeNotificationWithHttpInfo(tessellBatchAcknowledgeRequestDTO).getBody();
    }

    /**
     * Acknowledge notifications
     * Acknowledges notifications
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBatchAcknowledgeRequestDTO Batch Acknowledge Body (required)
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> batchAcknowledgeNotificationWithHttpInfo(TessellBatchAcknowledgeRequestDTO tessellBatchAcknowledgeRequestDTO) throws RestClientException {
        Object postBody = tessellBatchAcknowledgeRequestDTO;
        
        // verify the required parameter 'tessellBatchAcknowledgeRequestDTO' is set
        if (tessellBatchAcknowledgeRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBatchAcknowledgeRequestDTO' when calling batchAcknowledgeNotification");
        }
        
        String path = apiClient.expandPath("/event-service/notifications/batch-acknowledge", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get notifications summary
     * Get latest notifications summary for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return TessellNotificationSummaryApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellNotificationSummaryApiResponseDTO getNotificationSummary(String startTime, String endTime, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getNotificationSummaryWithHttpInfo(startTime, endTime, pageOffset, pageSize).getBody();
    }

    /**
     * Get notifications summary
     * Get latest notifications summary for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;TessellNotificationSummaryApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellNotificationSummaryApiResponseDTO> getNotificationSummaryWithHttpInfo(String startTime, String endTime, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/event-service/notifications/summary", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

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

    ParameterizedTypeReference<TessellNotificationSummaryApiResponseDTO> returnType = new ParameterizedTypeReference<TessellNotificationSummaryApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the events for the user
     * Reads notification for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Name (optional)
     * @param entityName Entity Name (optional)
     * @param severity Severity of the event (optional)
     * @param eventType Event type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return List&lt;TessellNotificationApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellNotificationApiResponseDTO> getNotifications(String startTime, String endTime, String entityType, String entityName, String severity, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getNotificationsWithHttpInfo(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize).getBody();
    }

    /**
     * Returns the events for the user
     * Reads notification for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Name (optional)
     * @param entityName Entity Name (optional)
     * @param severity Severity of the event (optional)
     * @param eventType Event type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;TessellNotificationApiResponseDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellNotificationApiResponseDTO>> getNotificationsWithHttpInfo(String startTime, String endTime, String entityType, String entityName, String severity, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/event-service/notifications", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityType", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityName", entityName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "severity", severity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventType", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

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

    ParameterizedTypeReference<List<TessellNotificationApiResponseDTO>> returnType = new ParameterizedTypeReference<List<TessellNotificationApiResponseDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get notification count
     * Get the current count of active notifications in the specified time
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @return TessellNotificationCountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellNotificationCountDTO getNotificationsCount(String startTime, String endTime) throws RestClientException {
        return getNotificationsCountWithHttpInfo(startTime, endTime).getBody();
    }

    /**
     * Get notification count
     * Get the current count of active notifications in the specified time
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @return ResponseEntity&lt;TessellNotificationCountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellNotificationCountDTO> getNotificationsCountWithHttpInfo(String startTime, String endTime) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/event-service/notifications/count", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));

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

    ParameterizedTypeReference<TessellNotificationCountDTO> returnType = new ParameterizedTypeReference<TessellNotificationCountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the events for the user
     * Reads notification for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Name (optional)
     * @param entityName Entity Name (optional)
     * @param severity Severity of the event (optional)
     * @param eventType Event type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return List&lt;TessellNotificationApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellNotificationApiResponseDTO> getNotificationsOps(String startTime, String endTime, String entityType, String entityName, String severity, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getNotificationsOpsWithHttpInfo(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize).getBody();
    }

    /**
     * Returns the events for the user
     * Reads notification for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Name (optional)
     * @param entityName Entity Name (optional)
     * @param severity Severity of the event (optional)
     * @param eventType Event type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;List&lt;TessellNotificationApiResponseDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellNotificationApiResponseDTO>> getNotificationsOpsWithHttpInfo(String startTime, String endTime, String entityType, String entityName, String severity, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/event-service/notifications", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityType", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityName", entityName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "severity", severity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "eventType", eventType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));

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

    ParameterizedTypeReference<List<TessellNotificationApiResponseDTO>> returnType = new ParameterizedTypeReference<List<TessellNotificationApiResponseDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
