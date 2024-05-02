package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.TaskProgressConfigResponse;

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
@Component("com.tessell.database.system.client.api.TaskProgressConfigApi")
public class TaskProgressConfigApi {
    private ApiClient apiClient;

    public TaskProgressConfigApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskProgressConfigApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns the JSON configuration for task progress
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TaskProgressConfigResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskProgressConfigResponse getTaskProgressConfig() throws RestClientException {
        return getTaskProgressConfigWithHttpInfo().getBody();
    }

    /**
     * Returns the JSON configuration for task progress
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TaskProgressConfigResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskProgressConfigResponse> getTaskProgressConfigWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/task-progress-config", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TaskProgressConfigResponse> returnType = new ParameterizedTypeReference<TaskProgressConfigResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
