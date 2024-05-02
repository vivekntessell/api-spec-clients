package com.tessell.infra.client.api;

import com.tessell.infra.client.invoker.ApiClient;

import com.tessell.infra.client.model.ApiErrorOps;
import com.tessell.infra.client.model.ApiStatus;
import com.tessell.infra.client.model.InfraResource;
import com.tessell.infra.client.model.InfraResourceStatus;
import com.tessell.infra.client.model.InfraResourceType;
import com.tessell.infra.client.model.K8sName;
import com.tessell.infra.client.model.PresignedUrl;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:55.674992+05:30[Asia/Kolkata]")
@Component("com.tessell.infra.client.api.TessellInfraResourceControllerApi")
public class TessellInfraResourceControllerApi {
    private ApiClient apiClient;

    public TessellInfraResourceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellInfraResourceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param infraResource  (optional)
     * @return List&lt;InfraResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InfraResource> createInfraResource(List<InfraResource> infraResource) throws RestClientException {
        return createInfraResourceWithHttpInfo(infraResource).getBody();
    }

    /**
     * Create a new Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param infraResource  (optional)
     * @return ResponseEntity&lt;List&lt;InfraResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InfraResource>> createInfraResourceWithHttpInfo(List<InfraResource> infraResource) throws RestClientException {
        Object postBody = infraResource;
        
        String path = apiClient.expandPath("/tessell-ops/infra/resources", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<InfraResource>> returnType = new ParameterizedTypeReference<List<InfraResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (required)
     * @param softDelete Soft delete an entity (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteInfraResource(String cloudResourceUrl, Boolean softDelete) throws RestClientException {
        return deleteInfraResourceWithHttpInfo(cloudResourceUrl, softDelete).getBody();
    }

    /**
     * Delete a Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (required)
     * @param softDelete Soft delete an entity (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteInfraResourceWithHttpInfo(String cloudResourceUrl, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'cloudResourceUrl' is set
        if (cloudResourceUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudResourceUrl' when calling deleteInfraResource");
        }
        
        String path = apiClient.expandPath("/tessell-ops/infra/resources", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-url", cloudResourceUrl));
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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Infra Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (optional, default to )
     * @param cloudAccountId Cloud Account Id (optional)
     * @param cloudLocation Cloud Location (optional, default to )
     * @param purpose Resource Purpose (optional, default to )
     * @param status Infra Resource Status (optional)
     * @param resourceType Infra Resource Type (optional)
     * @param includeSecrets Whether to include secrets in the response (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return List&lt;InfraResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<InfraResource> getInfraResources(String cloudResourceUrl, UUID cloudAccountId, String cloudLocation, String purpose, InfraResourceStatus status, InfraResourceType resourceType, Boolean includeSecrets, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getInfraResourcesWithHttpInfo(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, resourceType, includeSecrets, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Infra Resources
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (optional, default to )
     * @param cloudAccountId Cloud Account Id (optional)
     * @param cloudLocation Cloud Location (optional, default to )
     * @param purpose Resource Purpose (optional, default to )
     * @param status Infra Resource Status (optional)
     * @param resourceType Infra Resource Type (optional)
     * @param includeSecrets Whether to include secrets in the response (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;List&lt;InfraResource&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<InfraResource>> getInfraResourcesWithHttpInfo(String cloudResourceUrl, UUID cloudAccountId, String cloudLocation, String purpose, InfraResourceStatus status, InfraResourceType resourceType, Boolean includeSecrets, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/infra/resources", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-url", cloudResourceUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "purpose", purpose));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "resource-type", resourceType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-secrets", includeSecrets));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<List<InfraResource>> returnType = new ParameterizedTypeReference<List<InfraResource>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View the K8s name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (optional, default to )
     * @param cloudAccountId Cloud Account Id (optional)
     * @param cloudLocation Cloud Location (optional, default to )
     * @param purpose Resource Purpose (optional, default to )
     * @param status Infra Resource Status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return K8sName
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public K8sName getK8sName(String cloudResourceUrl, UUID cloudAccountId, String cloudLocation, String purpose, InfraResourceStatus status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getK8sNameWithHttpInfo(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View the K8s name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (optional, default to )
     * @param cloudAccountId Cloud Account Id (optional)
     * @param cloudLocation Cloud Location (optional, default to )
     * @param purpose Resource Purpose (optional, default to )
     * @param status Infra Resource Status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;K8sName&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<K8sName> getK8sNameWithHttpInfo(String cloudResourceUrl, UUID cloudAccountId, String cloudLocation, String purpose, InfraResourceStatus status, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/infra/resources/k8s-name", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-url", cloudResourceUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "purpose", purpose));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<K8sName> returnType = new ParameterizedTypeReference<K8sName>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Fetches the presigned url for the provided s3 object
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param objectId object id of the aws resource for which presigned url has to be generated (required)
     * @param tenantId Tenant Id Header (optional)
     * @param expirationMinutes Number of minutes the presigned url is valid (optional, default to 60)
     * @param region location of the s3 object provided (optional, default to us-east-1)
     * @param isExternal If the url to be generated for external or internal consumption (optional, default to true)
     * @return PresignedUrl
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PresignedUrl getPresignedURL(String objectId, String tenantId, Integer expirationMinutes, String region, Boolean isExternal) throws RestClientException {
        return getPresignedURLWithHttpInfo(objectId, tenantId, expirationMinutes, region, isExternal).getBody();
    }

    /**
     * Fetches the presigned url for the provided s3 object
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param objectId object id of the aws resource for which presigned url has to be generated (required)
     * @param tenantId Tenant Id Header (optional)
     * @param expirationMinutes Number of minutes the presigned url is valid (optional, default to 60)
     * @param region location of the s3 object provided (optional, default to us-east-1)
     * @param isExternal If the url to be generated for external or internal consumption (optional, default to true)
     * @return ResponseEntity&lt;PresignedUrl&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PresignedUrl> getPresignedURLWithHttpInfo(String objectId, String tenantId, Integer expirationMinutes, String region, Boolean isExternal) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'objectId' is set
        if (objectId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'objectId' when calling getPresignedURL");
        }
        
        String path = apiClient.expandPath("/tessell-ops/libraries/presigned-url", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "object-id", objectId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "expiration-minutes", expirationMinutes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "is-external", isExternal));

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

    ParameterizedTypeReference<PresignedUrl> returnType = new ParameterizedTypeReference<PresignedUrl>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (required)
     * @param updateSecrets Whether to update the secrets or not (optional, default to false)
     * @param infraResource  (optional)
     * @return InfraResource
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraResource updateInfraResource(String cloudResourceUrl, Boolean updateSecrets, InfraResource infraResource) throws RestClientException {
        return updateInfraResourceWithHttpInfo(cloudResourceUrl, updateSecrets, infraResource).getBody();
    }

    /**
     * Update a Tessell Infra Resource
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param cloudResourceUrl Cloud Resource Url (required)
     * @param updateSecrets Whether to update the secrets or not (optional, default to false)
     * @param infraResource  (optional)
     * @return ResponseEntity&lt;InfraResource&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraResource> updateInfraResourceWithHttpInfo(String cloudResourceUrl, Boolean updateSecrets, InfraResource infraResource) throws RestClientException {
        Object postBody = infraResource;
        
        // verify the required parameter 'cloudResourceUrl' is set
        if (cloudResourceUrl == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudResourceUrl' when calling updateInfraResource");
        }
        
        String path = apiClient.expandPath("/tessell-ops/infra/resources", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-url", cloudResourceUrl));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "update-secrets", updateSecrets));

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

    ParameterizedTypeReference<InfraResource> returnType = new ParameterizedTypeReference<InfraResource>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
