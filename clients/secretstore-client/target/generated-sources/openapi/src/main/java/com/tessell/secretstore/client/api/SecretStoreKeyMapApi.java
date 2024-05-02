package com.tessell.secretstore.client.api;

import com.tessell.secretstore.client.invoker.ApiClient;

import com.tessell.secretstore.client.model.ApiErrorOps;
import com.tessell.secretstore.client.model.CloudType;
import com.tessell.secretstore.client.model.SecretEncryptionEntity;
import com.tessell.secretstore.client.model.SecretKeyMapApiResponse;
import com.tessell.secretstore.client.model.SecretKeyMapCreatePayload;
import com.tessell.secretstore.client.model.SecretKeyMapUpdatePayload;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@Component("com.tessell.secretstore.client.api.SecretStoreKeyMapApi")
public class SecretStoreKeyMapApi {
    private ApiClient apiClient;

    public SecretStoreKeyMapApi() {
        this(new ApiClient());
    }

    @Autowired
    public SecretStoreKeyMapApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * create a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param secretKeyMapCreatePayload  (optional)
     * @return List&lt;SecretEncryptionEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<SecretEncryptionEntity> createSecretEncryptionKeyMapping(String tenantId, List<SecretKeyMapCreatePayload> secretKeyMapCreatePayload) throws RestClientException {
        return createSecretEncryptionKeyMappingWithHttpInfo(tenantId, secretKeyMapCreatePayload).getBody();
    }

    /**
     * create a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param secretKeyMapCreatePayload  (optional)
     * @return ResponseEntity&lt;List&lt;SecretEncryptionEntity&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<SecretEncryptionEntity>> createSecretEncryptionKeyMappingWithHttpInfo(String tenantId, List<SecretKeyMapCreatePayload> secretKeyMapCreatePayload) throws RestClientException {
        Object postBody = secretKeyMapCreatePayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createSecretEncryptionKeyMapping");
        }
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret-encryption-key-mappings", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<SecretEncryptionEntity>> returnType = new ParameterizedTypeReference<List<SecretEncryptionEntity>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * delete a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id of the key mapping (required)
     * @return SecretEncryptionEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretEncryptionEntity deleteSecretEncryptionKeyMapping(String tenantId, UUID id) throws RestClientException {
        return deleteSecretEncryptionKeyMappingWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * delete a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id of the key mapping (required)
     * @return ResponseEntity&lt;SecretEncryptionEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretEncryptionEntity> deleteSecretEncryptionKeyMappingWithHttpInfo(String tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteSecretEncryptionKeyMapping");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSecretEncryptionKeyMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret-encryption-key-mappings/{id}", uriVariables);

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

    ParameterizedTypeReference<SecretEncryptionEntity> returnType = new ParameterizedTypeReference<SecretEncryptionEntity>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get current mappings for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param subscriptionId Subscription Id (optional)
     * @param cloud cloud (optional)
     * @param cloudAccountId Cloud Account Id of the key (optional)
     * @param region Region of the key (optional)
     * @return SecretKeyMapApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretKeyMapApiResponse getSecretEncryptionKeyMapping(String tenantId, UUID subscriptionId, CloudType cloud, UUID cloudAccountId, String region) throws RestClientException {
        return getSecretEncryptionKeyMappingWithHttpInfo(tenantId, subscriptionId, cloud, cloudAccountId, region).getBody();
    }

    /**
     * get current mappings for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param subscriptionId Subscription Id (optional)
     * @param cloud cloud (optional)
     * @param cloudAccountId Cloud Account Id of the key (optional)
     * @param region Region of the key (optional)
     * @return ResponseEntity&lt;SecretKeyMapApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretKeyMapApiResponse> getSecretEncryptionKeyMappingWithHttpInfo(String tenantId, UUID subscriptionId, CloudType cloud, UUID cloudAccountId, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getSecretEncryptionKeyMapping");
        }
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret-encryption-key-mappings", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
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

    ParameterizedTypeReference<SecretKeyMapApiResponse> returnType = new ParameterizedTypeReference<SecretKeyMapApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * update a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id of the key mapping (required)
     * @param secretKeyMapUpdatePayload  (optional)
     * @return SecretEncryptionEntity
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretEncryptionEntity updateSecretEncryptionKeyMapping(String tenantId, UUID id, SecretKeyMapUpdatePayload secretKeyMapUpdatePayload) throws RestClientException {
        return updateSecretEncryptionKeyMappingWithHttpInfo(tenantId, id, secretKeyMapUpdatePayload).getBody();
    }

    /**
     * update a mapping for key to be used to encrypt secret in a cloud location
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id of the key mapping (required)
     * @param secretKeyMapUpdatePayload  (optional)
     * @return ResponseEntity&lt;SecretEncryptionEntity&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretEncryptionEntity> updateSecretEncryptionKeyMappingWithHttpInfo(String tenantId, UUID id, SecretKeyMapUpdatePayload secretKeyMapUpdatePayload) throws RestClientException {
        Object postBody = secretKeyMapUpdatePayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateSecretEncryptionKeyMapping");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSecretEncryptionKeyMapping");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret-encryption-key-mappings/{id}", uriVariables);

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

    ParameterizedTypeReference<SecretEncryptionEntity> returnType = new ParameterizedTypeReference<SecretEncryptionEntity>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
