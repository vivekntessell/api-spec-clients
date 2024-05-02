package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.ApiStatus;
import com.tessell.tenant.client.model.BulkDeleteSubscriptionsPayload;
import com.tessell.tenant.client.model.BulkDeleteSubscriptionsStatusPayload;
import com.tessell.tenant.client.model.CreateSubscriptionPayload;
import com.tessell.tenant.client.model.EnableECRAccessPayload;
import com.tessell.tenant.client.model.ResourceBulkDeleteResponseOps;
import com.tessell.tenant.client.model.Subscription;
import com.tessell.tenant.client.model.SubscriptionApiResponseOps;
import com.tessell.tenant.client.model.SubscriptionApiResponseOpsV2;
import com.tessell.tenant.client.model.SubscriptionStatus;
import com.tessell.tenant.client.model.SubscriptionV2;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@Component("com.tessell.tenant.client.api.SubscriptionOpsApi")
public class SubscriptionOpsApi {
    private ApiClient apiClient;

    public SubscriptionOpsApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionOpsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bulk delete Tessell subscriptions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSubscriptionsPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps bulkDeleteSubscription(BulkDeleteSubscriptionsPayload bulkDeleteSubscriptionsPayload) throws RestClientException {
        return bulkDeleteSubscriptionWithHttpInfo(bulkDeleteSubscriptionsPayload).getBody();
    }

    /**
     * Bulk delete Tessell subscriptions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSubscriptionsPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> bulkDeleteSubscriptionWithHttpInfo(BulkDeleteSubscriptionsPayload bulkDeleteSubscriptionsPayload) throws RestClientException {
        Object postBody = bulkDeleteSubscriptionsPayload;
        
        String path = apiClient.expandPath("/tessell-ops/subscriptions/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Create a new Tessell subscription.
     * Create a new Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSubscriptionPayload Subscription Information (required)
     * @param _default Specify if this is the default subscription (optional, default to false)
     * @return Subscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Subscription createSubscriptionOps(CreateSubscriptionPayload createSubscriptionPayload, Boolean _default) throws RestClientException {
        return createSubscriptionOpsWithHttpInfo(createSubscriptionPayload, _default).getBody();
    }

    /**
     * Create a new Tessell subscription.
     * Create a new Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSubscriptionPayload Subscription Information (required)
     * @param _default Specify if this is the default subscription (optional, default to false)
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Subscription> createSubscriptionOpsWithHttpInfo(CreateSubscriptionPayload createSubscriptionPayload, Boolean _default) throws RestClientException {
        Object postBody = createSubscriptionPayload;
        
        // verify the required parameter 'createSubscriptionPayload' is set
        if (createSubscriptionPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createSubscriptionPayload' when calling createSubscriptionOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "default", _default));

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

    ParameterizedTypeReference<Subscription> returnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Subscription metadata entry
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteSubscriptionMetadataOps(UUID id, Boolean softDelete) throws RestClientException {
        return deleteSubscriptionMetadataOpsWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete Subscription metadata entry
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteSubscriptionMetadataOpsWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSubscriptionMetadataOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/subscriptions/{id}/delete-metadata", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submits a delete subscription workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return Subscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Subscription deleteSubscriptionOps(UUID id, Boolean softDelete) throws RestClientException {
        return deleteSubscriptionOpsWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Submits a delete subscription workflow
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Subscription> deleteSubscriptionOpsWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSubscriptionOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/subscriptions/{id}", uriVariables);

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

    ParameterizedTypeReference<Subscription> returnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enable ECR access for provisioning different services for the subscription
     * Enable ECR access for provisioning different services for the subscription
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param subscriptionId Tessell subscription that is to be enabled for the different service provisioning (required)
     * @param enableECRAccessPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void enableECRAccess(UUID subscriptionId, EnableECRAccessPayload enableECRAccessPayload) throws RestClientException {
        enableECRAccessWithHttpInfo(subscriptionId, enableECRAccessPayload);
    }

    /**
     * Enable ECR access for provisioning different services for the subscription
     * Enable ECR access for provisioning different services for the subscription
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param subscriptionId Tessell subscription that is to be enabled for the different service provisioning (required)
     * @param enableECRAccessPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> enableECRAccessWithHttpInfo(UUID subscriptionId, EnableECRAccessPayload enableECRAccessPayload) throws RestClientException {
        Object postBody = enableECRAccessPayload;
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling enableECRAccess");
        }
        
        // verify the required parameter 'enableECRAccessPayload' is set
        if (enableECRAccessPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'enableECRAccessPayload' when calling enableECRAccess");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("subscription-id", subscriptionId);
        String path = apiClient.expandPath("/tessell-internal/subscriptions/{subscription-id}/enable-ecr-access", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Bulk delete subscriptions status
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSubscriptionsStatusPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps getBulkDeleteSubscriptionStatus(BulkDeleteSubscriptionsStatusPayload bulkDeleteSubscriptionsStatusPayload) throws RestClientException {
        return getBulkDeleteSubscriptionStatusWithHttpInfo(bulkDeleteSubscriptionsStatusPayload).getBody();
    }

    /**
     * Bulk delete subscriptions status
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteSubscriptionsStatusPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> getBulkDeleteSubscriptionStatusWithHttpInfo(BulkDeleteSubscriptionsStatusPayload bulkDeleteSubscriptionsStatusPayload) throws RestClientException {
        Object postBody = bulkDeleteSubscriptionsStatusPayload;
        
        String path = apiClient.expandPath("/tessell-ops/subscriptions/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Get subscription by Id
     * Get subscription by Id
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param includeSharedWith Whether to include shared with users details (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param tenantId Tenant Id Header (optional)
     * @return Subscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Subscription getSubscriptionId(UUID id, Boolean includeSharedWith, String timeZone, String tenantId) throws RestClientException {
        return getSubscriptionIdWithHttpInfo(id, includeSharedWith, timeZone, tenantId).getBody();
    }

    /**
     * Get subscription by Id
     * Get subscription by Id
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param includeSharedWith Whether to include shared with users details (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param tenantId Tenant Id Header (optional)
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Subscription> getSubscriptionIdWithHttpInfo(UUID id, Boolean includeSharedWith, String timeZone, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSubscriptionId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/subscriptions/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-shared-with", includeSharedWith));
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

    ParameterizedTypeReference<Subscription> returnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get subscription by Id light weight api
     * Get subscription by Id light weight api
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param includeSharedWith Whether to include shared with users details (optional, default to false)
     * @param tenantId Tenant Id Header (optional)
     * @return SubscriptionV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionV2 getSubscriptionV2(UUID id, Boolean includeSharedWith, String tenantId) throws RestClientException {
        return getSubscriptionV2WithHttpInfo(id, includeSharedWith, tenantId).getBody();
    }

    /**
     * Get subscription by Id light weight api
     * Get subscription by Id light weight api
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param includeSharedWith Whether to include shared with users details (optional, default to false)
     * @param tenantId Tenant Id Header (optional)
     * @return ResponseEntity&lt;SubscriptionV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionV2> getSubscriptionV2WithHttpInfo(UUID id, Boolean includeSharedWith, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSubscriptionV2");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/v2/subscriptions/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-shared-with", includeSharedWith));

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

    ParameterizedTypeReference<SubscriptionV2> returnType = new ParameterizedTypeReference<SubscriptionV2>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription name (optional)
     * @param statuses List of subscription statuses (optional)
     * @param _default Specify if this is the default subscription (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param tenantId Tenant Id Header (optional)
     * @return SubscriptionApiResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionApiResponseOps getSubscriptionsOps(String name, List<SubscriptionStatus> statuses, Boolean _default, String timeZone, Integer pageSize, Integer pageOffset, String tenantId) throws RestClientException {
        return getSubscriptionsOpsWithHttpInfo(name, statuses, _default, timeZone, pageSize, pageOffset, tenantId).getBody();
    }

    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription name (optional)
     * @param statuses List of subscription statuses (optional)
     * @param _default Specify if this is the default subscription (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param tenantId Tenant Id Header (optional)
     * @return ResponseEntity&lt;SubscriptionApiResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionApiResponseOps> getSubscriptionsOpsWithHttpInfo(String name, List<SubscriptionStatus> statuses, Boolean _default, String timeZone, Integer pageSize, Integer pageOffset, String tenantId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "default", _default));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<SubscriptionApiResponseOps> returnType = new ParameterizedTypeReference<SubscriptionApiResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription name (optional)
     * @param statuses List of subscription statuses (optional)
     * @param _default Specify if this is the default subscription (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param tenantId Tenant Id Header (optional)
     * @return SubscriptionApiResponseOpsV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionApiResponseOpsV2 getSubscriptionsOpsV2(String name, List<SubscriptionStatus> statuses, Boolean _default, Integer pageSize, Integer pageOffset, String tenantId) throws RestClientException {
        return getSubscriptionsOpsV2WithHttpInfo(name, statuses, _default, pageSize, pageOffset, tenantId).getBody();
    }

    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription name (optional)
     * @param statuses List of subscription statuses (optional)
     * @param _default Specify if this is the default subscription (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param tenantId Tenant Id Header (optional)
     * @return ResponseEntity&lt;SubscriptionApiResponseOpsV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionApiResponseOpsV2> getSubscriptionsOpsV2WithHttpInfo(String name, List<SubscriptionStatus> statuses, Boolean _default, Integer pageSize, Integer pageOffset, String tenantId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/v2/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "default", _default));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<SubscriptionApiResponseOpsV2> returnType = new ParameterizedTypeReference<SubscriptionApiResponseOpsV2>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param subscription Update Subscription Body (required)
     * @return Subscription
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Subscription updateSubscriptionOps(UUID id, Subscription subscription) throws RestClientException {
        return updateSubscriptionOpsWithHttpInfo(id, subscription).getBody();
    }

    /**
     * Update a Tessell Subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Subscription Id (required)
     * @param subscription Update Subscription Body (required)
     * @return ResponseEntity&lt;Subscription&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Subscription> updateSubscriptionOpsWithHttpInfo(UUID id, Subscription subscription) throws RestClientException {
        Object postBody = subscription;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSubscriptionOps");
        }
        
        // verify the required parameter 'subscription' is set
        if (subscription == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscription' when calling updateSubscriptionOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/subscriptions/{id}", uriVariables);

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

    ParameterizedTypeReference<Subscription> returnType = new ParameterizedTypeReference<Subscription>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
