package com.tessell.infra.client.api;

import com.tessell.infra.client.invoker.ApiClient;

import com.tessell.infra.client.model.ApiErrorOps;
import com.tessell.infra.client.model.ApiStatus;
import com.tessell.infra.client.model.TaskWorkflowVariablesPayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:55.674992+05:30[Asia/Kolkata]")
@Component("com.tessell.infra.client.api.TaskWorkflowApi")
public class TaskWorkflowApi {
    private ApiClient apiClient;

    public TaskWorkflowApi() {
        this(new ApiClient());
    }

    @Autowired
    public TaskWorkflowApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deletes task workflow variables
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTaskWorkflowVariables(String deploymentId, String deploymentType) throws RestClientException {
        return deleteTaskWorkflowVariablesWithHttpInfo(deploymentId, deploymentType).getBody();
    }

    /**
     * Deletes task workflow variables
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTaskWorkflowVariablesWithHttpInfo(String deploymentId, String deploymentType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling deleteTaskWorkflowVariables");
        }
        
        // verify the required parameter 'deploymentType' is set
        if (deploymentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentType' when calling deleteTaskWorkflowVariables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/task-workflows/{deployment-id}/variables", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deployment-type", deploymentType));

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
     * Get task workflow variables.
     * 
     * <p><b>200</b> - Task Workflow variables response
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @return TaskWorkflowVariablesPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskWorkflowVariablesPayload getTaskWorkflowVariables(String deploymentId, String deploymentType) throws RestClientException {
        return getTaskWorkflowVariablesWithHttpInfo(deploymentId, deploymentType).getBody();
    }

    /**
     * Get task workflow variables.
     * 
     * <p><b>200</b> - Task Workflow variables response
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @return ResponseEntity&lt;TaskWorkflowVariablesPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskWorkflowVariablesPayload> getTaskWorkflowVariablesWithHttpInfo(String deploymentId, String deploymentType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getTaskWorkflowVariables");
        }
        
        // verify the required parameter 'deploymentType' is set
        if (deploymentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentType' when calling getTaskWorkflowVariables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/task-workflows/{deployment-id}/variables", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deployment-type", deploymentType));

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

    ParameterizedTypeReference<TaskWorkflowVariablesPayload> returnType = new ParameterizedTypeReference<TaskWorkflowVariablesPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Store task workflow variables
     * Store task workflow variables
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @param taskWorkflowVariablesPayload Task Workflow variable request (required)
     * @return TaskWorkflowVariablesPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskWorkflowVariablesPayload storeTaskWorkflowVariables(String deploymentId, String deploymentType, TaskWorkflowVariablesPayload taskWorkflowVariablesPayload) throws RestClientException {
        return storeTaskWorkflowVariablesWithHttpInfo(deploymentId, deploymentType, taskWorkflowVariablesPayload).getBody();
    }

    /**
     * Store task workflow variables
     * Store task workflow variables
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param deploymentId Workflow deployment ID (required)
     * @param deploymentType Filter for a specific deployment type (required)
     * @param taskWorkflowVariablesPayload Task Workflow variable request (required)
     * @return ResponseEntity&lt;TaskWorkflowVariablesPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskWorkflowVariablesPayload> storeTaskWorkflowVariablesWithHttpInfo(String deploymentId, String deploymentType, TaskWorkflowVariablesPayload taskWorkflowVariablesPayload) throws RestClientException {
        Object postBody = taskWorkflowVariablesPayload;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling storeTaskWorkflowVariables");
        }
        
        // verify the required parameter 'deploymentType' is set
        if (deploymentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentType' when calling storeTaskWorkflowVariables");
        }
        
        // verify the required parameter 'taskWorkflowVariablesPayload' is set
        if (taskWorkflowVariablesPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taskWorkflowVariablesPayload' when calling storeTaskWorkflowVariables");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/task-workflows/{deployment-id}/variables", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "deployment-type", deploymentType));

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

    ParameterizedTypeReference<TaskWorkflowVariablesPayload> returnType = new ParameterizedTypeReference<TaskWorkflowVariablesPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
