package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ProvisionDatabaseCallbackResponse;
import com.tessell.dmm.client.model.RefreshDatabaseCallbackResponse;
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
@Component("com.tessell.dmm.client.api.DbCloneApi")
public class DbCloneApi {
    private ApiClient apiClient;

    public DbCloneApi() {
        this(new ApiClient());
    }

    @Autowired
    public DbCloneApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Callback for clone database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param provisionDatabaseCallbackResponse  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void cloneDatabaseCallback(UUID id, ProvisionDatabaseCallbackResponse provisionDatabaseCallbackResponse) throws RestClientException {
        cloneDatabaseCallbackWithHttpInfo(id, provisionDatabaseCallbackResponse);
    }

    /**
     * Callback for clone database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param provisionDatabaseCallbackResponse  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> cloneDatabaseCallbackWithHttpInfo(UUID id, ProvisionDatabaseCallbackResponse provisionDatabaseCallbackResponse) throws RestClientException {
        Object postBody = provisionDatabaseCallbackResponse;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling cloneDatabaseCallback");
        }
        
        // verify the required parameter 'provisionDatabaseCallbackResponse' is set
        if (provisionDatabaseCallbackResponse == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'provisionDatabaseCallbackResponse' when calling cloneDatabaseCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/callback/data-management/clone", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for refresh database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param cloneId Id of the Clone (required)
     * @param refreshDatabaseCallbackResponse  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void refreshDatabaseCallback(UUID availabilityMachineId, UUID cloneId, RefreshDatabaseCallbackResponse refreshDatabaseCallbackResponse) throws RestClientException {
        refreshDatabaseCallbackWithHttpInfo(availabilityMachineId, cloneId, refreshDatabaseCallbackResponse);
    }

    /**
     * Callback for refresh database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param cloneId Id of the Clone (required)
     * @param refreshDatabaseCallbackResponse  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> refreshDatabaseCallbackWithHttpInfo(UUID availabilityMachineId, UUID cloneId, RefreshDatabaseCallbackResponse refreshDatabaseCallbackResponse) throws RestClientException {
        Object postBody = refreshDatabaseCallbackResponse;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling refreshDatabaseCallback");
        }
        
        // verify the required parameter 'cloneId' is set
        if (cloneId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloneId' when calling refreshDatabaseCallback");
        }
        
        // verify the required parameter 'refreshDatabaseCallbackResponse' is set
        if (refreshDatabaseCallbackResponse == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'refreshDatabaseCallbackResponse' when calling refreshDatabaseCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("cloneId", cloneId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{availabilityMachineId}/callback/data-management/{cloneId}/refresh", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
