package com.tessell.secretstore.client.api;

import com.tessell.secretstore.client.invoker.ApiClient;

import com.tessell.secretstore.client.model.ApiErrorOps;
import com.tessell.secretstore.client.model.BulkDeleteSecretsPayload;
import com.tessell.secretstore.client.model.BulkDeleteSecretsStatusPayload;
import com.tessell.secretstore.client.model.CloudType;
import com.tessell.secretstore.client.model.CreateSecretPayload;
import com.tessell.secretstore.client.model.DeleteSecretPayload;
import com.tessell.secretstore.client.model.ReplicateSecret;
import com.tessell.secretstore.client.model.ResourceBulkDeleteResponseOps;
import com.tessell.secretstore.client.model.SecretDTO;
import com.tessell.secretstore.client.model.SecretType;
import com.tessell.secretstore.client.model.SecretsApiResponse;
import com.tessell.secretstore.client.model.SecretsMigrationApiResponse;
import com.tessell.secretstore.client.model.TagsAdditionApiResponse;
import java.util.UUID;
import com.tessell.secretstore.client.model.UpdateSecretAvailability;
import com.tessell.secretstore.client.model.UpdateSecretPayload;

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
@Component("com.tessell.secretstore.client.api.SecretStoreApi")
public class SecretStoreApi {
    private ApiClient apiClient;

    public SecretStoreApi() {
        this(new ApiClient());
    }

    @Autowired
    public SecretStoreApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Add tags required to clean up the existing secrets
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TagsAdditionApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TagsAdditionApiResponse addAdditionalTagsToSecrets() throws RestClientException {
        return addAdditionalTagsToSecretsWithHttpInfo().getBody();
    }

    /**
     * Add tags required to clean up the existing secrets
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TagsAdditionApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TagsAdditionApiResponse> addAdditionalTagsToSecretsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/add-tags", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TagsAdditionApiResponse> returnType = new ParameterizedTypeReference<TagsAdditionApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * delete the secrets for subscription or tenant-id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSecretsPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps bulkDeleteSecrets(BulkDeleteSecretsPayload bulkDeleteSecretsPayload) throws RestClientException {
        return bulkDeleteSecretsWithHttpInfo(bulkDeleteSecretsPayload).getBody();
    }

    /**
     * delete the secrets for subscription or tenant-id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSecretsPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> bulkDeleteSecretsWithHttpInfo(BulkDeleteSecretsPayload bulkDeleteSecretsPayload) throws RestClientException {
        Object postBody = bulkDeleteSecretsPayload;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (optional)
     * @param createSecretPayload  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO createSecret(String tenantId, CreateSecretPayload createSecretPayload) throws RestClientException {
        return createSecretWithHttpInfo(tenantId, createSecretPayload).getBody();
    }

    /**
     * Create a secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (optional)
     * @param createSecretPayload  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> createSecretWithHttpInfo(String tenantId, CreateSecretPayload createSecretPayload) throws RestClientException {
        Object postBody = createSecretPayload;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete secret&#39;s value
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param deleteInAllRegions Secrets in all regions will be deleted (optional, default to true)
     * @param deleteSecretPayload  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO deleteSecretValue(UUID id, String tenantId, Boolean deleteInAllRegions, DeleteSecretPayload deleteSecretPayload) throws RestClientException {
        return deleteSecretValueWithHttpInfo(id, tenantId, deleteInAllRegions, deleteSecretPayload).getBody();
    }

    /**
     * Delete secret&#39;s value
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param deleteInAllRegions Secrets in all regions will be deleted (optional, default to true)
     * @param deleteSecretPayload  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> deleteSecretValueWithHttpInfo(UUID id, String tenantId, Boolean deleteInAllRegions, DeleteSecretPayload deleteSecretPayload) throws RestClientException {
        Object postBody = deleteSecretPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSecretValue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "delete-in-all-regions", deleteInAllRegions));

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete secrets on given condition
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param keyName Secrets in given regions will be deleted for the keyName (optional)
     * @param deleteByGroupId Secrets in all regions will be deleted for the given group (optional)
     * @param deleteInAllRegions Secrets in all regions will be deleted (optional, default to true)
     * @param deleteSecretPayload  (optional)
     * @return SecretsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretsApiResponse deleteSecrets(String keyName, String deleteByGroupId, Boolean deleteInAllRegions, DeleteSecretPayload deleteSecretPayload) throws RestClientException {
        return deleteSecretsWithHttpInfo(keyName, deleteByGroupId, deleteInAllRegions, deleteSecretPayload).getBody();
    }

    /**
     * Delete secrets on given condition
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param keyName Secrets in given regions will be deleted for the keyName (optional)
     * @param deleteByGroupId Secrets in all regions will be deleted for the given group (optional)
     * @param deleteInAllRegions Secrets in all regions will be deleted (optional, default to true)
     * @param deleteSecretPayload  (optional)
     * @return ResponseEntity&lt;SecretsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretsApiResponse> deleteSecretsWithHttpInfo(String keyName, String deleteByGroupId, Boolean deleteInAllRegions, DeleteSecretPayload deleteSecretPayload) throws RestClientException {
        Object postBody = deleteSecretPayload;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key-name", keyName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "delete-by-group-id", deleteByGroupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "delete-in-all-regions", deleteInAllRegions));

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

    ParameterizedTypeReference<SecretsApiResponse> returnType = new ParameterizedTypeReference<SecretsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * encrypt all existing secrets that are not already encrypted
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return SecretsMigrationApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretsMigrationApiResponse encryptAllSecrets(String tenantId) throws RestClientException {
        return encryptAllSecretsWithHttpInfo(tenantId).getBody();
    }

    /**
     * encrypt all existing secrets that are not already encrypted
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;SecretsMigrationApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretsMigrationApiResponse> encryptAllSecretsWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling encryptAllSecrets");
        }
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/encrypt-secrets", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SecretsMigrationApiResponse> returnType = new ParameterizedTypeReference<SecretsMigrationApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all secrets metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (optional)
     * @param secretType Type of the Secret (optional)
     * @param groupId Group ID for the secret, eg serviceID (optional)
     * @return SecretsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretsApiResponse getAllSecrets(String tenantId, SecretType secretType, String groupId) throws RestClientException {
        return getAllSecretsWithHttpInfo(tenantId, secretType, groupId).getBody();
    }

    /**
     * Get all secrets metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (optional)
     * @param secretType Type of the Secret (optional)
     * @param groupId Group ID for the secret, eg serviceID (optional)
     * @return ResponseEntity&lt;SecretsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretsApiResponse> getAllSecretsWithHttpInfo(String tenantId, SecretType secretType, String groupId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secrets", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "secret-type", secretType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group-id", groupId));

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

    ParameterizedTypeReference<SecretsApiResponse> returnType = new ParameterizedTypeReference<SecretsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSecretsStatusPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps getBulkDeleteSecretsStatus(BulkDeleteSecretsStatusPayload bulkDeleteSecretsStatusPayload) throws RestClientException {
        return getBulkDeleteSecretsStatusWithHttpInfo(bulkDeleteSecretsStatusPayload).getBody();
    }

    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSecretsStatusPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> getBulkDeleteSecretsStatusWithHttpInfo(BulkDeleteSecretsStatusPayload bulkDeleteSecretsStatusPayload) throws RestClientException {
        Object postBody = bulkDeleteSecretsStatusPayload;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param secretType Type of the Secret (required)
     * @param tenantId tenant-id (optional)
     * @param id UUID of the secret (optional)
     * @param keyName Key name of the secret (optional)
     * @param externalId External Id of the secret (optional)
     * @param groupId Group ID for the secret, eg serviceID (optional)
     * @param subscriptionId Subscription Id (optional)
     * @param cloud cloud (optional)
     * @param cloudAccountId Cloud Account Id of the secret (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO getSecret(SecretType secretType, String tenantId, UUID id, String keyName, String externalId, String groupId, UUID subscriptionId, CloudType cloud, UUID cloudAccountId) throws RestClientException {
        return getSecretWithHttpInfo(secretType, tenantId, id, keyName, externalId, groupId, subscriptionId, cloud, cloudAccountId).getBody();
    }

    /**
     * Get a secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param secretType Type of the Secret (required)
     * @param tenantId tenant-id (optional)
     * @param id UUID of the secret (optional)
     * @param keyName Key name of the secret (optional)
     * @param externalId External Id of the secret (optional)
     * @param groupId Group ID for the secret, eg serviceID (optional)
     * @param subscriptionId Subscription Id (optional)
     * @param cloud cloud (optional)
     * @param cloudAccountId Cloud Account Id of the secret (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> getSecretWithHttpInfo(SecretType secretType, String tenantId, UUID id, String keyName, String externalId, String groupId, UUID subscriptionId, CloudType cloud, UUID cloudAccountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'secretType' is set
        if (secretType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'secretType' when calling getSecret");
        }
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "secret-type", secretType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "key-name", keyName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "external-id", externalId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "group-id", groupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id (required)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO getSecretById(String tenantId, UUID id) throws RestClientException {
        return getSecretByIdWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * Get secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id id (required)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> getSecretByIdWithHttpInfo(String tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getSecretById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSecretById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/{id}", uriVariables);

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Replicate secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param replicateSecret  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO replicateSecretByKeyName(ReplicateSecret replicateSecret) throws RestClientException {
        return replicateSecretByKeyNameWithHttpInfo(replicateSecret).getBody();
    }

    /**
     * Replicate secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param replicateSecret  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> replicateSecretByKeyNameWithHttpInfo(ReplicateSecret replicateSecret) throws RestClientException {
        Object postBody = replicateSecret;
        
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/replicate", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Replicate secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param replicateSecret  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO replicateSecretToDifferentCloudAccount(UUID id, ReplicateSecret replicateSecret) throws RestClientException {
        return replicateSecretToDifferentCloudAccountWithHttpInfo(id, replicateSecret).getBody();
    }

    /**
     * Replicate secret
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param replicateSecret  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> replicateSecretToDifferentCloudAccountWithHttpInfo(UUID id, ReplicateSecret replicateSecret) throws RestClientException {
        Object postBody = replicateSecret;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling replicateSecretToDifferentCloudAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/{id}/replicate", uriVariables);

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update secret&#39;s availability
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param updateSecretAvailability  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO updateSecretAvailability(UUID id, String tenantId, UpdateSecretAvailability updateSecretAvailability) throws RestClientException {
        return updateSecretAvailabilityWithHttpInfo(id, tenantId, updateSecretAvailability).getBody();
    }

    /**
     * Update secret&#39;s availability
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param updateSecretAvailability  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> updateSecretAvailabilityWithHttpInfo(UUID id, String tenantId, UpdateSecretAvailability updateSecretAvailability) throws RestClientException {
        Object postBody = updateSecretAvailability;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSecretAvailability");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/{id}/availability", uriVariables);

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update secret&#39;s value
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param updateSecretPayload  (optional)
     * @return SecretDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SecretDTO updateSecretValue(UUID id, String tenantId, UpdateSecretPayload updateSecretPayload) throws RestClientException {
        return updateSecretValueWithHttpInfo(id, tenantId, updateSecretPayload).getBody();
    }

    /**
     * Update secret&#39;s value
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param updateSecretPayload  (optional)
     * @return ResponseEntity&lt;SecretDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SecretDTO> updateSecretValueWithHttpInfo(UUID id, String tenantId, UpdateSecretPayload updateSecretPayload) throws RestClientException {
        Object postBody = updateSecretPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSecretValue");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/secret-store/secret/{id}", uriVariables);

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

    ParameterizedTypeReference<SecretDTO> returnType = new ParameterizedTypeReference<SecretDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
