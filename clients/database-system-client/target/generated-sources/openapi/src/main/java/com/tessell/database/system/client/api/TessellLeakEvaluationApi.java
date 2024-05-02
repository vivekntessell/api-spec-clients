package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.LeakEvaluationCRPayload;
import com.tessell.database.system.client.model.LeakEvaluationForCR;
import com.tessell.database.system.client.model.LeakEvaluationForStorage;
import com.tessell.database.system.client.model.LeakEvaluationStoragePayload;
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
@Component("com.tessell.database.system.client.api.TessellLeakEvaluationApi")
public class TessellLeakEvaluationApi {
    private ApiClient apiClient;

    public TessellLeakEvaluationApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellLeakEvaluationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Detects the compute resource leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationCRPayload  (required)
     * @return List&lt;LeakEvaluationForCR&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LeakEvaluationForCR> getLeakEvaluationForCRs(UUID tenantId, List<LeakEvaluationCRPayload> leakEvaluationCRPayload) throws RestClientException {
        return getLeakEvaluationForCRsWithHttpInfo(tenantId, leakEvaluationCRPayload).getBody();
    }

    /**
     * Detects the compute resource leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationCRPayload  (required)
     * @return ResponseEntity&lt;List&lt;LeakEvaluationForCR&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LeakEvaluationForCR>> getLeakEvaluationForCRsWithHttpInfo(UUID tenantId, List<LeakEvaluationCRPayload> leakEvaluationCRPayload) throws RestClientException {
        Object postBody = leakEvaluationCRPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getLeakEvaluationForCRs");
        }
        
        // verify the required parameter 'leakEvaluationCRPayload' is set
        if (leakEvaluationCRPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'leakEvaluationCRPayload' when calling getLeakEvaluationForCRs");
        }
        
        String path = apiClient.expandPath("/tessell-ops/leaks/compute-resources", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<LeakEvaluationForCR>> returnType = new ParameterizedTypeReference<List<LeakEvaluationForCR>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Detects the volume leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationStoragePayload  (required)
     * @return List&lt;LeakEvaluationForStorage&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LeakEvaluationForStorage> getLeakEvaluationForStorages(UUID tenantId, List<LeakEvaluationStoragePayload> leakEvaluationStoragePayload) throws RestClientException {
        return getLeakEvaluationForStoragesWithHttpInfo(tenantId, leakEvaluationStoragePayload).getBody();
    }

    /**
     * Detects the volume leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationStoragePayload  (required)
     * @return ResponseEntity&lt;List&lt;LeakEvaluationForStorage&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LeakEvaluationForStorage>> getLeakEvaluationForStoragesWithHttpInfo(UUID tenantId, List<LeakEvaluationStoragePayload> leakEvaluationStoragePayload) throws RestClientException {
        Object postBody = leakEvaluationStoragePayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getLeakEvaluationForStorages");
        }
        
        // verify the required parameter 'leakEvaluationStoragePayload' is set
        if (leakEvaluationStoragePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'leakEvaluationStoragePayload' when calling getLeakEvaluationForStorages");
        }
        
        String path = apiClient.expandPath("/tessell-ops/leaks/storages", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<LeakEvaluationForStorage>> returnType = new ParameterizedTypeReference<List<LeakEvaluationForStorage>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
