package com.tessell.security.client.api;

import com.tessell.security.client.invoker.ApiClient;

import java.io.File;
import com.tessell.security.client.model.TessellAclEligibleUserDTO;
import com.tessell.security.client.model.TessellAclPayloadDTO;
import com.tessell.security.client.model.TessellAclRevokePayloadDTO;
import com.tessell.security.client.model.TessellApiErrorDTO;
import com.tessell.security.client.model.TessellApiErrorOpsDTO;
import com.tessell.security.client.model.TessellApiStatusDTO;
import com.tessell.security.client.model.TessellBulkDeleteEncryptionKeysPayloadDTO;
import com.tessell.security.client.model.TessellBulkDeleteEncryptionKeysStatusPayloadDTO;
import com.tessell.security.client.model.TessellCheckEncryptionKeyPayloadDTO;
import com.tessell.security.client.model.TessellCloudAvailabilityDTO;
import com.tessell.security.client.model.TessellCloudTypeDTO;
import com.tessell.security.client.model.TessellCreateEncryptionKeyPayloadDTO;
import com.tessell.security.client.model.TessellCreateInternalEncryptionKeyPayloadDTO;
import com.tessell.security.client.model.TessellEligibleEncryptionKeyConsumerViewApiResponseDTO;
import com.tessell.security.client.model.TessellEncryptionFileDTODTO;
import com.tessell.security.client.model.TessellEncryptionKeyApiResponseDTO;
import com.tessell.security.client.model.TessellEncryptionKeyConsumerViewApiResponseDTO;
import com.tessell.security.client.model.TessellEncryptionKeyDTODTO;
import com.tessell.security.client.model.TessellEncryptionKeyDetailsDTODTO;
import com.tessell.security.client.model.TessellEncryptionKeyEligibilityResponseDTO;
import com.tessell.security.client.model.TessellEncryptionKeyInternalViewApiResponseDTO;
import com.tessell.security.client.model.TessellEncryptionKeyStatusDTO;
import com.tessell.security.client.model.TessellRegisterEncryptionKeyPayloadDTO;
import com.tessell.security.client.model.TessellResourceBulkDeleteResponseOpsDTO;
import com.tessell.security.client.model.TessellSecurityStatusDTO;
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
@Component("com.tessell.security.client.api.EncryptionKeysApi")
public class EncryptionKeysApi {
    private ApiClient apiClient;

    public EncryptionKeysApi() {
        this(new ApiClient());
    }

    @Autowired
    public EncryptionKeysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the encryption keys for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteEncryptionKeysPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO bulkDeleteEncryptionKeys(TessellBulkDeleteEncryptionKeysPayloadDTO tessellBulkDeleteEncryptionKeysPayloadDTO) throws RestClientException {
        return bulkDeleteEncryptionKeysWithHttpInfo(tessellBulkDeleteEncryptionKeysPayloadDTO).getBody();
    }

    /**
     * Delete the encryption keys for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteEncryptionKeysPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> bulkDeleteEncryptionKeysWithHttpInfo(TessellBulkDeleteEncryptionKeysPayloadDTO tessellBulkDeleteEncryptionKeysPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteEncryptionKeysPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-ops/encryption-key/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if encryption key is available or can be made available in the given subscription, region
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCheckEncryptionKeyPayloadDTO  (optional)
     * @return TessellEncryptionKeyEligibilityResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyEligibilityResponseDTO checkEncryptionKeyEligibility(String tenantId, TessellCheckEncryptionKeyPayloadDTO tessellCheckEncryptionKeyPayloadDTO) throws RestClientException {
        return checkEncryptionKeyEligibilityWithHttpInfo(tenantId, tessellCheckEncryptionKeyPayloadDTO).getBody();
    }

    /**
     * Check if encryption key is available or can be made available in the given subscription, region
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCheckEncryptionKeyPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyEligibilityResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyEligibilityResponseDTO> checkEncryptionKeyEligibilityWithHttpInfo(String tenantId, TessellCheckEncryptionKeyPayloadDTO tessellCheckEncryptionKeyPayloadDTO) throws RestClientException {
        Object postBody = tessellCheckEncryptionKeyPayloadDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkEncryptionKeyEligibility");
        }
        
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/validate", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEncryptionKeyEligibilityResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyEligibilityResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Creates new encryption key
     * Creates new encryption key
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param tessellCreateEncryptionKeyPayloadDTO  (optional)
     * @return TessellEncryptionKeyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDTODTO createEncryptionKey(String tenantId, TessellCreateEncryptionKeyPayloadDTO tessellCreateEncryptionKeyPayloadDTO) throws RestClientException {
        return createEncryptionKeyWithHttpInfo(tenantId, tessellCreateEncryptionKeyPayloadDTO).getBody();
    }

    /**
     * Creates new encryption key
     * Creates new encryption key
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param tessellCreateEncryptionKeyPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDTODTO> createEncryptionKeyWithHttpInfo(String tenantId, TessellCreateEncryptionKeyPayloadDTO tessellCreateEncryptionKeyPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateEncryptionKeyPayloadDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createEncryptionKey");
        }
        
        String path = apiClient.expandPath("/encryption-keys/governance", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEncryptionKeyDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Creates/updates encryption key acls
     * Creates/updates encryption key acls
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return TessellAclPayloadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclPayloadDTO createEncryptionKeyAcls(UUID id, String tenantId, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        return createEncryptionKeyAclsWithHttpInfo(id, tenantId, tessellAclPayloadDTO).getBody();
    }

    /**
     * Creates/updates encryption key acls
     * Creates/updates encryption key acls
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAclPayloadDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclPayloadDTO> createEncryptionKeyAclsWithHttpInfo(UUID id, String tenantId, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        Object postBody = tessellAclPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createEncryptionKeyAcls");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createEncryptionKeyAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/encryption-keys/governance/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellAclPayloadDTO> returnType = new ParameterizedTypeReference<TessellAclPayloadDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreateInternalEncryptionKeyPayloadDTO  (optional)
     * @return TessellEncryptionKeyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDTODTO createInternalEncryptionKey(String tenantId, TessellCreateInternalEncryptionKeyPayloadDTO tessellCreateInternalEncryptionKeyPayloadDTO) throws RestClientException {
        return createInternalEncryptionKeyWithHttpInfo(tenantId, tessellCreateInternalEncryptionKeyPayloadDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreateInternalEncryptionKeyPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDTODTO> createInternalEncryptionKeyWithHttpInfo(String tenantId, TessellCreateInternalEncryptionKeyPayloadDTO tessellCreateInternalEncryptionKeyPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateInternalEncryptionKeyPayloadDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createInternalEncryptionKey");
        }
        
        String path = apiClient.expandPath("/tessell-internal/encryption-keys", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEncryptionKeyDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete All Encryption Key in a Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param scheduleDeletionAfterDays days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) (optional)
     * @return TessellSecurityStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSecurityStatusDTO deleteAllEncryptionKeysInternal(String tenantId, Integer scheduleDeletionAfterDays) throws RestClientException {
        return deleteAllEncryptionKeysInternalWithHttpInfo(tenantId, scheduleDeletionAfterDays).getBody();
    }

    /**
     * Delete All Encryption Key in a Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param scheduleDeletionAfterDays days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) (optional)
     * @return ResponseEntity&lt;TessellSecurityStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSecurityStatusDTO> deleteAllEncryptionKeysInternalWithHttpInfo(String tenantId, Integer scheduleDeletionAfterDays) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteAllEncryptionKeysInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/encryption-keys", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "schedule-deletion-after-days", scheduleDeletionAfterDays));

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

    ParameterizedTypeReference<TessellSecurityStatusDTO> returnType = new ParameterizedTypeReference<TessellSecurityStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Encryption Key by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id (required)
     * @param scheduleDeletionAfterDays days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) (optional)
     * @return TessellSecurityStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSecurityStatusDTO deleteEncryptionKeyByIdInternal(String tenantId, UUID id, Integer scheduleDeletionAfterDays) throws RestClientException {
        return deleteEncryptionKeyByIdInternalWithHttpInfo(tenantId, id, scheduleDeletionAfterDays).getBody();
    }

    /**
     * Delete Encryption Key by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id (required)
     * @param scheduleDeletionAfterDays days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) (optional)
     * @return ResponseEntity&lt;TessellSecurityStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSecurityStatusDTO> deleteEncryptionKeyByIdInternalWithHttpInfo(String tenantId, UUID id, Integer scheduleDeletionAfterDays) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteEncryptionKeyByIdInternal");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteEncryptionKeyByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "schedule-deletion-after-days", scheduleDeletionAfterDays));

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

    ParameterizedTypeReference<TessellSecurityStatusDTO> returnType = new ParameterizedTypeReference<TessellSecurityStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Disable Encryption Key
     * Disables Encryption Key by ID
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @return TessellSecurityStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSecurityStatusDTO disableEncryptionKeyById(UUID id, String tenantId) throws RestClientException {
        return disableEncryptionKeyByIdWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Disable Encryption Key
     * Disables Encryption Key by ID
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @return ResponseEntity&lt;TessellSecurityStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSecurityStatusDTO> disableEncryptionKeyByIdWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling disableEncryptionKeyById");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling disableEncryptionKeyById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/encryption-keys/governance/{id}/disable", uriVariables);

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

    ParameterizedTypeReference<TessellSecurityStatusDTO> returnType = new ParameterizedTypeReference<TessellSecurityStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Download Tessell encryption file
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Id of the Tessell file (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] downloadEncryptionKeyFile(String tenantId, UUID id) throws RestClientException {
        return downloadEncryptionKeyFileWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * Download Tessell encryption file
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Id of the Tessell file (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> downloadEncryptionKeyFileWithHttpInfo(String tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling downloadEncryptionKeyFile");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling downloadEncryptionKeyFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/download-file/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enables Encryption Key
     * Enables Encryption Key by ID
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @return TessellSecurityStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSecurityStatusDTO enableEncryptionKeyById(UUID id, String tenantId) throws RestClientException {
        return enableEncryptionKeyByIdWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Enables Encryption Key
     * Enables Encryption Key by ID
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @return ResponseEntity&lt;TessellSecurityStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSecurityStatusDTO> enableEncryptionKeyByIdWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling enableEncryptionKeyById");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling enableEncryptionKeyById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/encryption-keys/governance/{id}/enable", uriVariables);

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

    ParameterizedTypeReference<TessellSecurityStatusDTO> returnType = new ParameterizedTypeReference<TessellSecurityStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteEncryptionKeysStatusPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteEncryptionKeyStatus(TessellBulkDeleteEncryptionKeysStatusPayloadDTO tessellBulkDeleteEncryptionKeysStatusPayloadDTO) throws RestClientException {
        return getBulkDeleteEncryptionKeyStatusWithHttpInfo(tessellBulkDeleteEncryptionKeysStatusPayloadDTO).getBody();
    }

    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteEncryptionKeysStatusPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> getBulkDeleteEncryptionKeyStatusWithHttpInfo(TessellBulkDeleteEncryptionKeysStatusPayloadDTO tessellBulkDeleteEncryptionKeysStatusPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteEncryptionKeysStatusPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-ops/encryption-key/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of eligible Tessell Encryption keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellEligibleEncryptionKeyConsumerViewApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEligibleEncryptionKeyConsumerViewApiResponseDTO getEligibleEncryptionKeys(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getEligibleEncryptionKeysWithHttpInfo(tenantId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of eligible Tessell Encryption keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellEligibleEncryptionKeyConsumerViewApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO> getEligibleEncryptionKeysWithHttpInfo(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEligibleEncryptionKeys");
        }
        
        String path = apiClient.expandPath("/encryption-keys/governance/eligible", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of eligible Tessell Encryption keys
     * Get a list of eligible Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellEligibleEncryptionKeyConsumerViewApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEligibleEncryptionKeyConsumerViewApiResponseDTO getEligibleEncryptionKeysConsumerView(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getEligibleEncryptionKeysConsumerViewWithHttpInfo(tenantId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of eligible Tessell Encryption keys
     * Get a list of eligible Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellEligibleEncryptionKeyConsumerViewApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO> getEligibleEncryptionKeysConsumerViewWithHttpInfo(String tenantId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEligibleEncryptionKeysConsumerView");
        }
        
        String path = apiClient.expandPath("/encryption-keys/eligible", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEligibleEncryptionKeyConsumerViewApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users by privileges
     * Gets list of all the users by privileges
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param role role (optional)
     * @return List&lt;TessellAclEligibleUserDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAclEligibleUserDTO> getEligibleUsersForEncryptionKeys(UUID id, String tenantId, List<String> role) throws RestClientException {
        return getEligibleUsersForEncryptionKeysWithHttpInfo(id, tenantId, role).getBody();
    }

    /**
     * Get list of all the users by privileges
     * Gets list of all the users by privileges
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param role role (optional)
     * @return ResponseEntity&lt;List&lt;TessellAclEligibleUserDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAclEligibleUserDTO>> getEligibleUsersForEncryptionKeysWithHttpInfo(UUID id, String tenantId, List<String> role) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEligibleUsersForEncryptionKeys");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEligibleUsersForEncryptionKeys");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/encryption-keys/governance/{id}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "role", role));

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

    ParameterizedTypeReference<List<TessellAclEligibleUserDTO>> returnType = new ParameterizedTypeReference<List<TessellAclEligibleUserDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of a encryption key
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (required)
     * @return TessellEncryptionKeyDetailsDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDetailsDTODTO getEncryptionKeyByIdInternalView(UUID id, String tenantId) throws RestClientException {
        return getEncryptionKeyByIdInternalViewWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Get details of a encryption key
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellEncryptionKeyDetailsDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDetailsDTODTO> getEncryptionKeyByIdInternalViewWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEncryptionKeyByIdInternalView");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeyByIdInternalView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellEncryptionKeyDetailsDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyDetailsDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Download Tessell encryption file
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Id of the Tessell file (required)
     * @return TessellEncryptionFileDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionFileDTODTO getEncryptionKeyFile(String tenantId, UUID id) throws RestClientException {
        return getEncryptionKeyFileWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * Download Tessell encryption file
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Id of the Tessell file (required)
     * @return ResponseEntity&lt;TessellEncryptionFileDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionFileDTODTO> getEncryptionKeyFileWithHttpInfo(String tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeyFile");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEncryptionKeyFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/file/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellEncryptionFileDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionFileDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Encryption keys
     * Get a list of Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param name name of the encryption key (optional)
     * @param cloud cloud type (optional)
     * @param includeSharedWithUsers Flag indicating whether to load users with whom entity is shared (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellEncryptionKeyApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyApiResponseDTO getEncryptionKeys(String tenantId, String name, TessellCloudTypeDTO cloud, Boolean includeSharedWithUsers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getEncryptionKeysWithHttpInfo(tenantId, name, cloud, includeSharedWithUsers, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Encryption keys
     * Get a list of Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param name name of the encryption key (optional)
     * @param cloud cloud type (optional)
     * @param includeSharedWithUsers Flag indicating whether to load users with whom entity is shared (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellEncryptionKeyApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyApiResponseDTO> getEncryptionKeysWithHttpInfo(String tenantId, String name, TessellCloudTypeDTO cloud, Boolean includeSharedWithUsers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeys");
        }
        
        String path = apiClient.expandPath("/encryption-keys/governance", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-shared-with-users", includeSharedWithUsers));
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

    ParameterizedTypeReference<TessellEncryptionKeyApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Encryption keys
     * Get a list of Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param cloud cloud type (optional)
     * @param name name of the encryption key (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellEncryptionKeyConsumerViewApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyConsumerViewApiResponseDTO getEncryptionKeysConsumerView(String tenantId, TessellCloudTypeDTO cloud, String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getEncryptionKeysConsumerViewWithHttpInfo(tenantId, cloud, name, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Encryption keys
     * Get a list of Tessell Encryption keys
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param cloud cloud type (optional)
     * @param name name of the encryption key (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellEncryptionKeyConsumerViewApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyConsumerViewApiResponseDTO> getEncryptionKeysConsumerViewWithHttpInfo(String tenantId, TessellCloudTypeDTO cloud, String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeysConsumerView");
        }
        
        String path = apiClient.expandPath("/encryption-keys", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<TessellEncryptionKeyConsumerViewApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyConsumerViewApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Encryption keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param cloud cloud (optional)
     * @param name name of the encryption key (optional)
     * @param status status of the encryption key (optional)
     * @param includeSharedWithUsers Flag indicating whether to load users with whom entity is shared (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellEncryptionKeyInternalViewApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyInternalViewApiResponseDTO getEncryptionKeysInternalView(String tenantId, TessellCloudTypeDTO cloud, String name, TessellEncryptionKeyStatusDTO status, Boolean includeSharedWithUsers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getEncryptionKeysInternalViewWithHttpInfo(tenantId, cloud, name, status, includeSharedWithUsers, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Encryption keys
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param cloud cloud (optional)
     * @param name name of the encryption key (optional)
     * @param status status of the encryption key (optional)
     * @param includeSharedWithUsers Flag indicating whether to load users with whom entity is shared (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellEncryptionKeyInternalViewApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyInternalViewApiResponseDTO> getEncryptionKeysInternalViewWithHttpInfo(String tenantId, TessellCloudTypeDTO cloud, String name, TessellEncryptionKeyStatusDTO status, Boolean includeSharedWithUsers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeysInternalView");
        }
        
        String path = apiClient.expandPath("/tessell-internal/encryption-keys", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-shared-with-users", includeSharedWithUsers));
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

    ParameterizedTypeReference<TessellEncryptionKeyInternalViewApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyInternalViewApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id uuid of the encryption key (required)
     * @param tessellCloudAvailabilityDTO  (optional)
     * @return TessellEncryptionKeyInternalViewApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyInternalViewApiResponseDTO makeEncryptionKeyAvailableInRegions(String tenantId, UUID id, List<TessellCloudAvailabilityDTO> tessellCloudAvailabilityDTO) throws RestClientException {
        return makeEncryptionKeyAvailableInRegionsWithHttpInfo(tenantId, id, tessellCloudAvailabilityDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id uuid of the encryption key (required)
     * @param tessellCloudAvailabilityDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyInternalViewApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyInternalViewApiResponseDTO> makeEncryptionKeyAvailableInRegionsWithHttpInfo(String tenantId, UUID id, List<TessellCloudAvailabilityDTO> tessellCloudAvailabilityDTO) throws RestClientException {
        Object postBody = tessellCloudAvailabilityDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling makeEncryptionKeyAvailableInRegions");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling makeEncryptionKeyAvailableInRegions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/{id}/availability", uriVariables);

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

    ParameterizedTypeReference<TessellEncryptionKeyInternalViewApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyInternalViewApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param validateMetadata validate-metadata (optional, default to false)
     * @param tessellRegisterEncryptionKeyPayloadDTO  (optional)
     * @return TessellEncryptionKeyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDTODTO registerEncryptionKey(String tenantId, Boolean validateMetadata, TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO) throws RestClientException {
        return registerEncryptionKeyWithHttpInfo(tenantId, validateMetadata, tessellRegisterEncryptionKeyPayloadDTO).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param validateMetadata validate-metadata (optional, default to false)
     * @param tessellRegisterEncryptionKeyPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDTODTO> registerEncryptionKeyWithHttpInfo(String tenantId, Boolean validateMetadata, TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterEncryptionKeyPayloadDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling registerEncryptionKey");
        }
        
        String path = apiClient.expandPath("/tessell-internal/encryption-keys/register", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "validate-metadata", validateMetadata));

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

    ParameterizedTypeReference<TessellEncryptionKeyDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Registers encryption key
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param tessellRegisterEncryptionKeyPayloadDTO  (optional)
     * @return TessellEncryptionKeyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDTODTO registerEncryptionKeyExternal(String tenantId, TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO) throws RestClientException {
        return registerEncryptionKeyExternalWithHttpInfo(tenantId, tessellRegisterEncryptionKeyPayloadDTO).getBody();
    }

    /**
     * 
     * Registers encryption key
     * <p><b>200</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param tessellRegisterEncryptionKeyPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellEncryptionKeyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDTODTO> registerEncryptionKeyExternalWithHttpInfo(String tenantId, TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterEncryptionKeyPayloadDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling registerEncryptionKeyExternal");
        }
        
        String path = apiClient.expandPath("/encryption-keys/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellEncryptionKeyDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revokes encryption key acls
     * Revokes encryption key acls
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO revokeEncryptionKeyAcls(UUID id, String tenantId, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        return revokeEncryptionKeyAclsWithHttpInfo(id, tenantId, tessellAclRevokePayloadDTO).getBody();
    }

    /**
     * Revokes encryption key acls
     * Revokes encryption key acls
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id encryption key uuid (required)
     * @param tenantId Tenant ID (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> revokeEncryptionKeyAclsWithHttpInfo(UUID id, String tenantId, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        Object postBody = tessellAclRevokePayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling revokeEncryptionKeyAcls");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling revokeEncryptionKeyAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/encryption-keys/governance/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upload encryption key file blob
     * Upload encryption key file blob
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param blob File content (optional)
     * @return TessellEncryptionFileDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionFileDTODTO uploadEncryptionKeyFile(String tenantId, File blob) throws RestClientException {
        return uploadEncryptionKeyFileWithHttpInfo(tenantId, blob).getBody();
    }

    /**
     * Upload encryption key file blob
     * Upload encryption key file blob
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param blob File content (optional)
     * @return ResponseEntity&lt;TessellEncryptionFileDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionFileDTODTO> uploadEncryptionKeyFileWithHttpInfo(String tenantId, File blob) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling uploadEncryptionKeyFile");
        }
        
        String path = apiClient.expandPath("/encryption-keys/upload-file", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

        if (blob != null)
            formParams.add("blob", new FileSystemResource(blob));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellEncryptionFileDTODTO> returnType = new ParameterizedTypeReference<TessellEncryptionFileDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
