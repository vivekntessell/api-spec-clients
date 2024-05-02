package com.tessell.security.client.api;

import com.tessell.security.client.invoker.ApiClient;

import com.tessell.security.client.model.TessellApiErrorDTO;
import com.tessell.security.client.model.TessellEncryptionKeyDTODTO;
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
@Component("com.tessell.security.client.api.EncryptionKeysInternalViewApi")
public class EncryptionKeysInternalViewApi {
    private ApiClient apiClient;

    public EncryptionKeysInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public EncryptionKeysInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
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
    public TessellEncryptionKeyDTODTO registerEncryptionKeyV2InternalView(String tenantId, TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO) throws RestClientException {
        return registerEncryptionKeyV2InternalViewWithHttpInfo(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO).getBody();
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
    public ResponseEntity<TessellEncryptionKeyDTODTO> registerEncryptionKeyV2InternalViewWithHttpInfo(String tenantId, TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO) throws RestClientException {
        Object postBody = tessellRegisterEncryptionKeyPayloadV2DTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling registerEncryptionKeyV2InternalView");
        }
        
        // verify the required parameter 'tessellRegisterEncryptionKeyPayloadV2DTO' is set
        if (tessellRegisterEncryptionKeyPayloadV2DTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRegisterEncryptionKeyPayloadV2DTO' when calling registerEncryptionKeyV2InternalView");
        }
        
        String path = apiClient.expandPath("/tessell-internal/v2/encryption-keys/register", Collections.<String, Object>emptyMap());

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
