package com.tessell.security.client.api;

import com.tessell.security.client.invoker.ApiClient;

import com.tessell.security.client.model.TessellApiErrorDTO;
import com.tessell.security.client.model.TessellCloudTypeDTO;
import com.tessell.security.client.model.TessellEncryptionKeyDTODTO;
import com.tessell.security.client.model.TessellEncryptionKeysToRegisterApiResponseDTO;
import com.tessell.security.client.model.TessellRegisterEncryptionKeyPayloadV2DTO;

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
@Component("com.tessell.security.client.api.EncryptionKeysAdminViewApi")
public class EncryptionKeysAdminViewApi {
    private ApiClient apiClient;

    public EncryptionKeysAdminViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public EncryptionKeysAdminViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * List Encryption Keys from a BYOA Subscription to register in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param subscriptionName Subscription name (required)
     * @param cloudType Cloud Type (required)
     * @param region Region (required)
     * @return TessellEncryptionKeysToRegisterApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeysToRegisterApiResponseDTO getEncryptionKeysToRegister(String tenantId, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return getEncryptionKeysToRegisterWithHttpInfo(tenantId, subscriptionName, cloudType, region).getBody();
    }

    /**
     * List Encryption Keys from a BYOA Subscription to register in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param subscriptionName Subscription name (required)
     * @param cloudType Cloud Type (required)
     * @param region Region (required)
     * @return ResponseEntity&lt;TessellEncryptionKeysToRegisterApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeysToRegisterApiResponseDTO> getEncryptionKeysToRegisterWithHttpInfo(String tenantId, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEncryptionKeysToRegister");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getEncryptionKeysToRegister");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getEncryptionKeysToRegister");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getEncryptionKeysToRegister");
        }
        
        String path = apiClient.expandPath("/encryption-keys/governance/register", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-name", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));
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

    ParameterizedTypeReference<TessellEncryptionKeysToRegisterApiResponseDTO> returnType = new ParameterizedTypeReference<TessellEncryptionKeysToRegisterApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register Encryption Key from a BYOA Subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellRegisterEncryptionKeyPayloadV2DTO  (required)
     * @return TessellEncryptionKeyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEncryptionKeyDTODTO registerEncryptionKeyV2(String tenantId, TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO) throws RestClientException {
        return registerEncryptionKeyV2WithHttpInfo(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO).getBody();
    }

    /**
     * Register Encryption Key from a BYOA Subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellRegisterEncryptionKeyPayloadV2DTO  (required)
     * @return ResponseEntity&lt;TessellEncryptionKeyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEncryptionKeyDTODTO> registerEncryptionKeyV2WithHttpInfo(String tenantId, TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO) throws RestClientException {
        Object postBody = tessellRegisterEncryptionKeyPayloadV2DTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling registerEncryptionKeyV2");
        }
        
        // verify the required parameter 'tessellRegisterEncryptionKeyPayloadV2DTO' is set
        if (tessellRegisterEncryptionKeyPayloadV2DTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRegisterEncryptionKeyPayloadV2DTO' when calling registerEncryptionKeyV2");
        }
        
        String path = apiClient.expandPath("/encryption-keys/governance/register", Collections.<String, Object>emptyMap());

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
}
