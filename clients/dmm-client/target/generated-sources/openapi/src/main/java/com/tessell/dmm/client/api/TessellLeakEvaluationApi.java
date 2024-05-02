package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.LeakEvaluationBackupPayload;
import com.tessell.dmm.client.model.LeakEvaluationForBackup;
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
@Component("com.tessell.dmm.client.api.TessellLeakEvaluationApi")
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
     * Detects the snapshot leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationBackupPayload  (required)
     * @return List&lt;LeakEvaluationForBackup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<LeakEvaluationForBackup> getLeakEvaluationForBackups(UUID tenantId, List<LeakEvaluationBackupPayload> leakEvaluationBackupPayload) throws RestClientException {
        return getLeakEvaluationForBackupsWithHttpInfo(tenantId, leakEvaluationBackupPayload).getBody();
    }

    /**
     * Detects the snapshot leaks
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param leakEvaluationBackupPayload  (required)
     * @return ResponseEntity&lt;List&lt;LeakEvaluationForBackup&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<LeakEvaluationForBackup>> getLeakEvaluationForBackupsWithHttpInfo(UUID tenantId, List<LeakEvaluationBackupPayload> leakEvaluationBackupPayload) throws RestClientException {
        Object postBody = leakEvaluationBackupPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getLeakEvaluationForBackups");
        }
        
        // verify the required parameter 'leakEvaluationBackupPayload' is set
        if (leakEvaluationBackupPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'leakEvaluationBackupPayload' when calling getLeakEvaluationForBackups");
        }
        
        String path = apiClient.expandPath("/tessell-ops/leaks/backups", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<LeakEvaluationForBackup>> returnType = new ParameterizedTypeReference<List<LeakEvaluationForBackup>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
