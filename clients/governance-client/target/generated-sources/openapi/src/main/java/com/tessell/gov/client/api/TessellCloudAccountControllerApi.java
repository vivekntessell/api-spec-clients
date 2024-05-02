package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorDTO;
import com.tessell.gov.client.model.TessellApiResponseDTO;
import com.tessell.gov.client.model.TessellCloudAccountDTO;
import com.tessell.gov.client.model.TessellCloudAccountTypeDTO;
import com.tessell.gov.client.model.TessellConsumerTypeDTO;
import com.tessell.gov.client.model.TessellGovernStatusDTO;
import com.tessell.gov.client.model.TessellParameterDTO;
import com.tessell.gov.client.model.TessellRegisterCloudAccountRequestPayloadDTO;
import com.tessell.gov.client.model.TessellTaskSummaryDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@Component("com.tessell.gov.client.api.TessellCloudAccountControllerApi")
public class TessellCloudAccountControllerApi {
    private ApiClient apiClient;

    public TessellCloudAccountControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellCloudAccountControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add a cloud account in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellCloudAccountDTO  (optional)
     * @return TessellCloudAccountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCloudAccountDTO addCloudAccount(TessellCloudAccountDTO tessellCloudAccountDTO) throws RestClientException {
        return addCloudAccountWithHttpInfo(tessellCloudAccountDTO).getBody();
    }

    /**
     * Add a cloud account in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellCloudAccountDTO  (optional)
     * @return ResponseEntity&lt;TessellCloudAccountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCloudAccountDTO> addCloudAccountWithHttpInfo(TessellCloudAccountDTO tessellCloudAccountDTO) throws RestClientException {
        Object postBody = tessellCloudAccountDTO;
        
        String path = apiClient.expandPath("/cloud-accounts/i", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellCloudAccountDTO> returnType = new ParameterizedTypeReference<TessellCloudAccountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a cloud account
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional)
     * @return TessellGovernStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGovernStatusDTO deleteTenant(UUID id, Boolean softDelete) throws RestClientException {
        return deleteTenantWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a cloud account
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional)
     * @return ResponseEntity&lt;TessellGovernStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGovernStatusDTO> deleteTenantWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/cloud-accounts/i/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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

    ParameterizedTypeReference<TessellGovernStatusDTO> returnType = new ParameterizedTypeReference<TessellGovernStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a Tessell cloud account by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudName cloudName (required)
     * @param byId by-id (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellCloudAccountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCloudAccountDTO getCloudAccount(String cloudName, Boolean byId, TessellConsumerTypeDTO consumerType) throws RestClientException {
        return getCloudAccountWithHttpInfo(cloudName, byId, consumerType).getBody();
    }

    /**
     * Get a Tessell cloud account by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudName cloudName (required)
     * @param byId by-id (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellCloudAccountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCloudAccountDTO> getCloudAccountWithHttpInfo(String cloudName, Boolean byId, TessellConsumerTypeDTO consumerType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cloudName' is set
        if (cloudName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudName' when calling getCloudAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudName", cloudName);
        String path = apiClient.expandPath("/cloud-accounts/{cloudName}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "by-id", byId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellCloudAccountDTO> returnType = new ParameterizedTypeReference<TessellCloudAccountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a cloud&#39;s credential
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return Map&lt;String, TessellParameterDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, TessellParameterDTO> getCloudAccountSecret(UUID id) throws RestClientException {
        return getCloudAccountSecretWithHttpInfo(id).getBody();
    }

    /**
     * Get a cloud&#39;s credential
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;Map&lt;String, TessellParameterDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, TessellParameterDTO>> getCloudAccountSecretWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCloudAccountSecret");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/cloud-accounts/i/{id}/secret", uriVariables);

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

    ParameterizedTypeReference<Map<String, TessellParameterDTO>> returnType = new ParameterizedTypeReference<Map<String, TessellParameterDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of enabled cloud accounts in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param cloudAccountType cloudAccountType (optional)
     * @param name name (optional)
     * @param pageSize pageSize (optional, default to 10)
     * @param pageOffset pageOffset (optional, default to 0)
     * @param timezone timezone (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiResponseDTO getCloudAccounts(UUID id, TessellCloudAccountTypeDTO cloudAccountType, String name, Integer pageSize, Integer pageOffset, String timezone, TessellConsumerTypeDTO consumerType) throws RestClientException {
        return getCloudAccountsWithHttpInfo(id, cloudAccountType, name, pageSize, pageOffset, timezone, consumerType).getBody();
    }

    /**
     * Get a list of enabled cloud accounts in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param cloudAccountType cloudAccountType (optional)
     * @param name name (optional)
     * @param pageSize pageSize (optional, default to 10)
     * @param pageOffset pageOffset (optional, default to 0)
     * @param timezone timezone (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiResponseDTO> getCloudAccountsWithHttpInfo(UUID id, TessellCloudAccountTypeDTO cloudAccountType, String name, Integer pageSize, Integer pageOffset, String timezone, TessellConsumerTypeDTO consumerType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cloud-accounts", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudAccountType", cloudAccountType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timezone", timezone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellApiResponseDTO> returnType = new ParameterizedTypeReference<TessellApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register cloud asset account for tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param consumerType consumer-type (optional)
     * @param tessellRegisterCloudAccountRequestPayloadDTO  (optional)
     * @return TessellTaskSummaryDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTaskSummaryDTO registerCloudAssetAccount(TessellConsumerTypeDTO consumerType, TessellRegisterCloudAccountRequestPayloadDTO tessellRegisterCloudAccountRequestPayloadDTO) throws RestClientException {
        return registerCloudAssetAccountWithHttpInfo(consumerType, tessellRegisterCloudAccountRequestPayloadDTO).getBody();
    }

    /**
     * Register cloud asset account for tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param consumerType consumer-type (optional)
     * @param tessellRegisterCloudAccountRequestPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellTaskSummaryDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTaskSummaryDTO> registerCloudAssetAccountWithHttpInfo(TessellConsumerTypeDTO consumerType, TessellRegisterCloudAccountRequestPayloadDTO tessellRegisterCloudAccountRequestPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterCloudAccountRequestPayloadDTO;
        
        String path = apiClient.expandPath("/cloud-accounts", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellTaskSummaryDTO> returnType = new ParameterizedTypeReference<TessellTaskSummaryDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a cloud-account
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param updateSecret update-secret (optional)
     * @param tessellCloudAccountDTO  (optional)
     * @return TessellCloudAccountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCloudAccountDTO updateTenant(UUID id, Boolean updateSecret, TessellCloudAccountDTO tessellCloudAccountDTO) throws RestClientException {
        return updateTenantWithHttpInfo(id, updateSecret, tessellCloudAccountDTO).getBody();
    }

    /**
     * Update a cloud-account
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param updateSecret update-secret (optional)
     * @param tessellCloudAccountDTO  (optional)
     * @return ResponseEntity&lt;TessellCloudAccountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCloudAccountDTO> updateTenantWithHttpInfo(UUID id, Boolean updateSecret, TessellCloudAccountDTO tessellCloudAccountDTO) throws RestClientException {
        Object postBody = tessellCloudAccountDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/cloud-accounts/i/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "update-secret", updateSecret));

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

    ParameterizedTypeReference<TessellCloudAccountDTO> returnType = new ParameterizedTypeReference<TessellCloudAccountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
