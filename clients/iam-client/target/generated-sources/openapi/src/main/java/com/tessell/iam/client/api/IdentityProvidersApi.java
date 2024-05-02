package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellConfiguredIdpsApiResponse;
import com.tessell.iam.client.model.TessellCreateIdpPayload;
import com.tessell.iam.client.model.TessellIdentityProviderDTO;
import com.tessell.iam.client.model.TessellResourceBulkDeletePayloadOps;
import com.tessell.iam.client.model.TessellResourceBulkDeleteResponseOps;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@Component("com.tessell.iam.client.api.IdentityProvidersApi")
public class IdentityProvidersApi {
    private ApiClient apiClient;

    public IdentityProvidersApi() {
        this(new ApiClient());
    }

    @Autowired
    public IdentityProvidersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bulk delete Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps bulkDeleteIdps(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return bulkDeleteIdpsWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Bulk delete Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> bulkDeleteIdpsWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/idps/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Create a new integration with an Identity Provider
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreateIdpPayload  (optional)
     * @return TessellIdentityProviderDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIdentityProviderDTO createIdpConfiguration(String tenantId, TessellCreateIdpPayload tessellCreateIdpPayload) throws RestClientException {
        return createIdpConfigurationWithHttpInfo(tenantId, tessellCreateIdpPayload).getBody();
    }

    /**
     * Create a new integration with an Identity Provider
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreateIdpPayload  (optional)
     * @return ResponseEntity&lt;TessellIdentityProviderDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIdentityProviderDTO> createIdpConfigurationWithHttpInfo(String tenantId, TessellCreateIdpPayload tessellCreateIdpPayload) throws RestClientException {
        Object postBody = tessellCreateIdpPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createIdpConfiguration");
        }
        
        String path = apiClient.expandPath("/iam/idps", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellIdentityProviderDTO> returnType = new ParameterizedTypeReference<TessellIdentityProviderDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Identity Provider integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param idpId UUID of an Identity Provider Integration (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteIdpConfiguration(String tenantId, UUID idpId) throws RestClientException {
        return deleteIdpConfigurationWithHttpInfo(tenantId, idpId).getBody();
    }

    /**
     * Delete an Identity Provider integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param idpId UUID of an Identity Provider Integration (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteIdpConfigurationWithHttpInfo(String tenantId, UUID idpId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteIdpConfiguration");
        }
        
        // verify the required parameter 'idpId' is set
        if (idpId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idpId' when calling deleteIdpConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("idp-id", idpId);
        String path = apiClient.expandPath("/iam/idps/{idp-id}", uriVariables);

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
    /**
     * Get a list of integrated Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellConfiguredIdpsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellConfiguredIdpsApiResponse getConfiguredIdps() throws RestClientException {
        return getConfiguredIdpsWithHttpInfo().getBody();
    }

    /**
     * Get a list of integrated Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellConfiguredIdpsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellConfiguredIdpsApiResponse> getConfiguredIdpsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/iam/idps/configured-idps", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellConfiguredIdpsApiResponse> returnType = new ParameterizedTypeReference<TessellConfiguredIdpsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status of bulk deletion of Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteIdps(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return getStatusOfBulkDeleteIdpsWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Get status of bulk deletion of Identity Providers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> getStatusOfBulkDeleteIdpsWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/idps/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Update an Identity Provider
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param idpId UUID of an Identity Provider Integration (required)
     * @param tessellCreateIdpPayload  (optional)
     * @return TessellIdentityProviderDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIdentityProviderDTO updateIdpConfiguration(String tenantId, UUID idpId, TessellCreateIdpPayload tessellCreateIdpPayload) throws RestClientException {
        return updateIdpConfigurationWithHttpInfo(tenantId, idpId, tessellCreateIdpPayload).getBody();
    }

    /**
     * Update an Identity Provider
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param idpId UUID of an Identity Provider Integration (required)
     * @param tessellCreateIdpPayload  (optional)
     * @return ResponseEntity&lt;TessellIdentityProviderDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIdentityProviderDTO> updateIdpConfigurationWithHttpInfo(String tenantId, UUID idpId, TessellCreateIdpPayload tessellCreateIdpPayload) throws RestClientException {
        Object postBody = tessellCreateIdpPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateIdpConfiguration");
        }
        
        // verify the required parameter 'idpId' is set
        if (idpId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'idpId' when calling updateIdpConfiguration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("idp-id", idpId);
        String path = apiClient.expandPath("/iam/idps/{idp-id}", uriVariables);

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

    ParameterizedTypeReference<TessellIdentityProviderDTO> returnType = new ParameterizedTypeReference<TessellIdentityProviderDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
