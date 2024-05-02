package com.tessell.security.client.api;

import com.tessell.security.client.invoker.ApiClient;

import com.tessell.security.client.model.TessellApiErrorDTO;
import com.tessell.security.client.model.TessellApiErrorOpsDTO;
import com.tessell.security.client.model.TessellApiStatusDTO;
import com.tessell.security.client.model.TessellAzureKeyVaultDTODTO;
import com.tessell.security.client.model.TessellCreateAzureKeyVaultPayloadDTO;
import com.tessell.security.client.model.TessellRegisterKeyVaultPayloadDTO;
import com.tessell.security.client.model.TessellWorkflowCallbackPayloadDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@Component("com.tessell.security.client.api.KeyVaultsApi")
public class KeyVaultsApi {
    private ApiClient apiClient;

    public KeyVaultsApi() {
        this(new ApiClient());
    }

    @Autowired
    public KeyVaultsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Callback API after workflow execution is complete
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Key Vault (required)
     * @param tessellWorkflowCallbackPayloadDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO callbackForCreateKeyVaultWorkflowInternal(UUID id, TessellWorkflowCallbackPayloadDTO tessellWorkflowCallbackPayloadDTO) throws RestClientException {
        return callbackForCreateKeyVaultWorkflowInternalWithHttpInfo(id, tessellWorkflowCallbackPayloadDTO).getBody();
    }

    /**
     * Callback API after workflow execution is complete
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Key Vault (required)
     * @param tessellWorkflowCallbackPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> callbackForCreateKeyVaultWorkflowInternalWithHttpInfo(UUID id, TessellWorkflowCallbackPayloadDTO tessellWorkflowCallbackPayloadDTO) throws RestClientException {
        Object postBody = tessellWorkflowCallbackPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling callbackForCreateKeyVaultWorkflowInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults/{id}/callback/create-key-vault", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Creates a Key Vault in given region (if not already exists)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateAzureKeyVaultPayloadDTO  (optional)
     * @return TessellAzureKeyVaultDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAzureKeyVaultDTODTO createKeyVaultInternal(TessellCreateAzureKeyVaultPayloadDTO tessellCreateAzureKeyVaultPayloadDTO) throws RestClientException {
        return createKeyVaultInternalWithHttpInfo(tessellCreateAzureKeyVaultPayloadDTO).getBody();
    }

    /**
     * Creates a Key Vault in given region (if not already exists)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateAzureKeyVaultPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAzureKeyVaultDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAzureKeyVaultDTODTO> createKeyVaultInternalWithHttpInfo(TessellCreateAzureKeyVaultPayloadDTO tessellCreateAzureKeyVaultPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateAzureKeyVaultPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAzureKeyVaultDTODTO> returnType = new ParameterizedTypeReference<TessellAzureKeyVaultDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete key-vault metadata for the particular cloudAccountId
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudAccountId Cloud account Id (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteKeyVaultMetadata(UUID cloudAccountId) throws RestClientException {
        return deleteKeyVaultMetadataWithHttpInfo(cloudAccountId).getBody();
    }

    /**
     * Delete key-vault metadata for the particular cloudAccountId
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudAccountId Cloud account Id (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteKeyVaultMetadataWithHttpInfo(UUID cloudAccountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cloudAccountId' is set
        if (cloudAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudAccountId' when calling deleteKeyVaultMetadata");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudAccountId", cloudAccountId);
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults/delete-metadata/{cloudAccountId}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get existing key vault
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionId Subscription Id (required)
     * @param region Region (required)
     * @return TessellAzureKeyVaultDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAzureKeyVaultDTODTO getExistingKeyVault(UUID subscriptionId, String region) throws RestClientException {
        return getExistingKeyVaultWithHttpInfo(subscriptionId, region).getBody();
    }

    /**
     * get existing key vault
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionId Subscription Id (required)
     * @param region Region (required)
     * @return ResponseEntity&lt;TessellAzureKeyVaultDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAzureKeyVaultDTODTO> getExistingKeyVaultWithHttpInfo(UUID subscriptionId, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling getExistingKeyVault");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getExistingKeyVault");
        }
        
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));

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

    ParameterizedTypeReference<TessellAzureKeyVaultDTODTO> returnType = new ParameterizedTypeReference<TessellAzureKeyVaultDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get existing key vault
     * Get existing key vault
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param subscriptionName Subscription Name (required)
     * @param region Region (required)
     * @return TessellAzureKeyVaultDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAzureKeyVaultDTODTO getExistingKeyVaultExternal(String tenantId, String subscriptionName, String region) throws RestClientException {
        return getExistingKeyVaultExternalWithHttpInfo(tenantId, subscriptionName, region).getBody();
    }

    /**
     * Get existing key vault
     * Get existing key vault
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param subscriptionName Subscription Name (required)
     * @param region Region (required)
     * @return ResponseEntity&lt;TessellAzureKeyVaultDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAzureKeyVaultDTODTO> getExistingKeyVaultExternalWithHttpInfo(String tenantId, String subscriptionName, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getExistingKeyVaultExternal");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getExistingKeyVaultExternal");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getExistingKeyVaultExternal");
        }
        
        String path = apiClient.expandPath("/security/key-vaults", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-name", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));

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

    ParameterizedTypeReference<TessellAzureKeyVaultDTODTO> returnType = new ParameterizedTypeReference<TessellAzureKeyVaultDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Key Vault details by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of Key Vault (required)
     * @return TessellAzureKeyVaultDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAzureKeyVaultDTODTO getKeyVaultByIdInternal(UUID id) throws RestClientException {
        return getKeyVaultByIdInternalWithHttpInfo(id).getBody();
    }

    /**
     * Get Key Vault details by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of Key Vault (required)
     * @return ResponseEntity&lt;TessellAzureKeyVaultDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAzureKeyVaultDTODTO> getKeyVaultByIdInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getKeyVaultByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellAzureKeyVaultDTODTO> returnType = new ParameterizedTypeReference<TessellAzureKeyVaultDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Patch existing key vaults
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudAccountId Cloud Account Id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void patchExistingKeyVaults(UUID cloudAccountId) throws RestClientException {
        patchExistingKeyVaultsWithHttpInfo(cloudAccountId);
    }

    /**
     * Patch existing key vaults
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudAccountId Cloud Account Id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> patchExistingKeyVaultsWithHttpInfo(UUID cloudAccountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cloudAccountId' is set
        if (cloudAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudAccountId' when calling patchExistingKeyVaults");
        }
        
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Registers a Key Vault in given region
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterKeyVaultPayloadDTO  (optional)
     * @return TessellAzureKeyVaultDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAzureKeyVaultDTODTO registerKeyVaultInternal(TessellRegisterKeyVaultPayloadDTO tessellRegisterKeyVaultPayloadDTO) throws RestClientException {
        return registerKeyVaultInternalWithHttpInfo(tessellRegisterKeyVaultPayloadDTO).getBody();
    }

    /**
     * Registers a Key Vault in given region
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterKeyVaultPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAzureKeyVaultDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAzureKeyVaultDTODTO> registerKeyVaultInternalWithHttpInfo(TessellRegisterKeyVaultPayloadDTO tessellRegisterKeyVaultPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterKeyVaultPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/security/key-vaults/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAzureKeyVaultDTODTO> returnType = new ParameterizedTypeReference<TessellAzureKeyVaultDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
