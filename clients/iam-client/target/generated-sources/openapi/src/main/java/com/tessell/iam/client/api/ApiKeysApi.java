package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiKeyApiResponse;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellAuthorizeApiKeyPayload;
import com.tessell.iam.client.model.TessellAuthorizeApiKeyResponse;
import com.tessell.iam.client.model.TessellCreateApiKeyDTO;
import com.tessell.iam.client.model.TessellCreateApiKeyPayload;
import com.tessell.iam.client.model.TessellResourceBulkDeletePayloadOps;
import com.tessell.iam.client.model.TessellResourceBulkDeleteResponseOps;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@Component("com.tessell.iam.client.api.ApiKeysApi")
public class ApiKeysApi {
    private ApiClient apiClient;

    public ApiKeysApi() {
        this(new ApiClient());
    }

    @Autowired
    public ApiKeysApi(ApiClient apiClient) {
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
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellAuthorizeApiKeyPayload  (optional)
     * @return TessellAuthorizeApiKeyResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAuthorizeApiKeyResponse authorizeApiKey(String tenantId, TessellAuthorizeApiKeyPayload tessellAuthorizeApiKeyPayload) throws RestClientException {
        return authorizeApiKeyWithHttpInfo(tenantId, tessellAuthorizeApiKeyPayload).getBody();
    }

    /**
     * 
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellAuthorizeApiKeyPayload  (optional)
     * @return ResponseEntity&lt;TessellAuthorizeApiKeyResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAuthorizeApiKeyResponse> authorizeApiKeyWithHttpInfo(String tenantId, TessellAuthorizeApiKeyPayload tessellAuthorizeApiKeyPayload) throws RestClientException {
        Object postBody = tessellAuthorizeApiKeyPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling authorizeApiKey");
        }
        
        String path = apiClient.expandPath("/iam/authorize", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAuthorizeApiKeyResponse> returnType = new ParameterizedTypeReference<TessellAuthorizeApiKeyResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Bulk delete API Keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps bulkDeleteApiKeys(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return bulkDeleteApiKeysWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Bulk delete API Keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> bulkDeleteApiKeysWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/api-keys/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreateApiKeyPayload  (optional)
     * @return TessellCreateApiKeyDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCreateApiKeyDTO createApiKey(String tenantId, TessellCreateApiKeyPayload tessellCreateApiKeyPayload) throws RestClientException {
        return createApiKeyWithHttpInfo(tenantId, tessellCreateApiKeyPayload).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreateApiKeyPayload  (optional)
     * @return ResponseEntity&lt;TessellCreateApiKeyDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCreateApiKeyDTO> createApiKeyWithHttpInfo(String tenantId, TessellCreateApiKeyPayload tessellCreateApiKeyPayload) throws RestClientException {
        Object postBody = tessellCreateApiKeyPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createApiKey");
        }
        
        String path = apiClient.expandPath("/iam/api-keys", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellCreateApiKeyDTO> returnType = new ParameterizedTypeReference<TessellCreateApiKeyDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellApiKeyApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiKeyApiResponse getApiKeys(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getApiKeysWithHttpInfo(tenantId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellApiKeyApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiKeyApiResponse> getApiKeysWithHttpInfo(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getApiKeys");
        }
        
        String path = apiClient.expandPath("/iam/api-keys", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellApiKeyApiResponse> returnType = new ParameterizedTypeReference<TessellApiKeyApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status of bulk deletion of API Keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteApiKeys(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return getStatusOfBulkDeleteApiKeysWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Get status of bulk deletion of API Keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> getStatusOfBulkDeleteApiKeysWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/api-keys/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell api key
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param label label (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus revokeApiKey(String tenantId, String label) throws RestClientException {
        return revokeApiKeyWithHttpInfo(tenantId, label).getBody();
    }

    /**
     * Delete a Tessell api key
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param label label (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> revokeApiKeyWithHttpInfo(String tenantId, String label) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling revokeApiKey");
        }
        
        // verify the required parameter 'label' is set
        if (label == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'label' when calling revokeApiKey");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("label", label);
        String path = apiClient.expandPath("/iam/api-keys/{label}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
