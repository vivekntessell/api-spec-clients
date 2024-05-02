package com.tessell.monitoring.client.api;

import com.tessell.monitoring.client.invoker.ApiClient;

import com.tessell.monitoring.client.model.ApiError;
import com.tessell.monitoring.client.model.ProvisionMonitoringInfraPayload;
import com.tessell.monitoring.client.model.TaskSummary;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@Component("com.tessell.monitoring.client.api.MonitoringInfraControllerApi")
public class MonitoringInfraControllerApi {
    private ApiClient apiClient;

    public MonitoringInfraControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public MonitoringInfraControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Deletes a monitoring infra
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param id The ID of the Monitoring infra (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteMonitoringInfra(UUID tenantId, UUID id) throws RestClientException {
        return deleteMonitoringInfraWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * 
     * Deletes a monitoring infra
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param id The ID of the Monitoring infra (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteMonitoringInfraWithHttpInfo(UUID tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteMonitoringInfra");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteMonitoringInfra");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/monitoring/infra/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Provisioning a monitoring infra
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param provisionMonitoringInfraPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary provisionMonitoringInfra(UUID tenantId, ProvisionMonitoringInfraPayload provisionMonitoringInfraPayload) throws RestClientException {
        return provisionMonitoringInfraWithHttpInfo(tenantId, provisionMonitoringInfraPayload).getBody();
    }

    /**
     * 
     * Provisioning a monitoring infra
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param provisionMonitoringInfraPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> provisionMonitoringInfraWithHttpInfo(UUID tenantId, ProvisionMonitoringInfraPayload provisionMonitoringInfraPayload) throws RestClientException {
        Object postBody = provisionMonitoringInfraPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling provisionMonitoringInfra");
        }
        
        String path = apiClient.expandPath("/monitoring/infra", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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
}
