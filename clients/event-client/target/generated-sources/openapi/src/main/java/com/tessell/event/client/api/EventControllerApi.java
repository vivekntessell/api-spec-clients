package com.tessell.event.client.api;

import com.tessell.event.client.invoker.ApiClient;

import com.tessell.event.client.model.TessellApiErrorDTO;
import com.tessell.event.client.model.TessellEventApiResponseDTO;
import com.tessell.event.client.model.TessellEventDTO;
import com.tessell.event.client.model.TessellInlineObject1DTO;
import com.tessell.event.client.model.TessellInlineObjectDTO;

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
@Component("com.tessell.event.client.api.EventControllerApi")
public class EventControllerApi {
    private ApiClient apiClient;

    public EventControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public EventControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Reads event for the current user.
     * Reads event for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Type (optional)
     * @param entityID Entity/Resource ID (optional)
     * @param severity Severity of the event (optional)
     * @param parentEventId Parent event identifier (optional)
     * @param eventType Event Type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return TessellEventApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEventApiResponseDTO getEvents(String startTime, String endTime, String entityType, String entityID, String severity, String parentEventId, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getEventsWithHttpInfo(startTime, endTime, entityType, entityID, severity, parentEventId, eventType, pageOffset, pageSize).getBody();
    }

    /**
     * Reads event for the current user.
     * Reads event for the current user.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param startTime Start timestamp, when searching events in a range (optional)
     * @param endTime End timestamp, when searching events in a range (optional)
     * @param entityType Entity Type (optional)
     * @param entityID Entity/Resource ID (optional)
     * @param severity Severity of the event (optional)
     * @param parentEventId Parent event identifier (optional)
     * @param eventType Event Type (optional)
     * @param pageOffset Page offset (optional, default to 0)
     * @param pageSize Page Size (optional, default to 10)
     * @return ResponseEntity&lt;TessellEventApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEventApiResponseDTO> getEventsWithHttpInfo(String startTime, String endTime, String entityType, String entityID, String severity, String parentEventId, String eventType, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/event-service/events", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityType", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entityID", entityID));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "severity", severity));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "parentEventId", parentEventId));
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

    ParameterizedTypeReference<TessellEventApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEventApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Suppress an event type
     * Suppress an event type
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param eventType  (required)
     * @param tessellInlineObjectDTO  (optional)
     * @return TessellEventDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEventDTO suppressEvent(String eventType, TessellInlineObjectDTO tessellInlineObjectDTO) throws RestClientException {
        return suppressEventWithHttpInfo(eventType, tessellInlineObjectDTO).getBody();
    }

    /**
     * Suppress an event type
     * Suppress an event type
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param eventType  (required)
     * @param tessellInlineObjectDTO  (optional)
     * @return ResponseEntity&lt;TessellEventDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEventDTO> suppressEventWithHttpInfo(String eventType, TessellInlineObjectDTO tessellInlineObjectDTO) throws RestClientException {
        Object postBody = tessellInlineObjectDTO;
        
        // verify the required parameter 'eventType' is set
        if (eventType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventType' when calling suppressEvent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventType", eventType);
        String path = apiClient.expandPath("/event-service/event/{eventType}/suppress", uriVariables);

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

    ParameterizedTypeReference<TessellEventDTO> returnType = new ParameterizedTypeReference<TessellEventDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Unsuppress a previous suppressed event.
     * Unsuppress a previously suppressed event.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param eventType  (required)
     * @param tessellInlineObject1DTO  (optional)
     * @return TessellEventDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEventDTO unsuppressEvent(String eventType, TessellInlineObject1DTO tessellInlineObject1DTO) throws RestClientException {
        return unsuppressEventWithHttpInfo(eventType, tessellInlineObject1DTO).getBody();
    }

    /**
     * Unsuppress a previous suppressed event.
     * Unsuppress a previously suppressed event.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param eventType  (required)
     * @param tessellInlineObject1DTO  (optional)
     * @return ResponseEntity&lt;TessellEventDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEventDTO> unsuppressEventWithHttpInfo(String eventType, TessellInlineObject1DTO tessellInlineObject1DTO) throws RestClientException {
        Object postBody = tessellInlineObject1DTO;
        
        // verify the required parameter 'eventType' is set
        if (eventType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'eventType' when calling unsuppressEvent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("eventType", eventType);
        String path = apiClient.expandPath("/event-service/event/{eventType}/unsuppress", uriVariables);

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

    ParameterizedTypeReference<TessellEventDTO> returnType = new ParameterizedTypeReference<TessellEventDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
