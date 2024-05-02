package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.AclEligibleUser;
import com.tessell.tenant.client.model.AclPayload;
import com.tessell.tenant.client.model.AclRevokePayload;
import com.tessell.tenant.client.model.Action;
import com.tessell.tenant.client.model.ApiError;
import com.tessell.tenant.client.model.ApiStatus;
import com.tessell.tenant.client.model.CreateSubscriptionPayload;
import com.tessell.tenant.client.model.SubscriptionAdminView;
import com.tessell.tenant.client.model.SubscriptionByoaStaticMetadata;
import com.tessell.tenant.client.model.SubscriptionCloudConfigMap;
import com.tessell.tenant.client.model.SubscriptionStatus;
import com.tessell.tenant.client.model.SubscriptionUserRole;
import com.tessell.tenant.client.model.SubscriptionUsersAdminView;
import com.tessell.tenant.client.model.SubscriptionsAdminApiResponse;
import com.tessell.tenant.client.model.SubscriptionsUserViewApiResponse;
import com.tessell.tenant.client.model.UpdateRegionsPayload;
import com.tessell.tenant.client.model.UpdateSubscriptionServicePayload;

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
@Component("com.tessell.tenant.client.api.SubscriptionServiceApi")
public class SubscriptionServiceApi {
    private ApiClient apiClient;

    public SubscriptionServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Submits request to enable or disable a Tessell Subscription
     * Submits request to enable or disable a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param action Action on the subscription. Eg. enable/disable (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView actionOnSubscription(String name, Action action) throws RestClientException {
        return actionOnSubscriptionWithHttpInfo(name, action).getBody();
    }

    /**
     * Submits request to enable or disable a Tessell Subscription
     * Submits request to enable or disable a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param action Action on the subscription. Eg. enable/disable (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> actionOnSubscriptionWithHttpInfo(String name, Action action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling actionOnSubscription");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling actionOnSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/{action}", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enables or disables a cloud type in a Tessell Subscription
     * Enables or disables a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param cloudType Cloud type (required)
     * @param action Action on the subscription. Eg. enable/disable (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView actionOnSubscriptionCloudType(String name, String cloudType, Action action) throws RestClientException {
        return actionOnSubscriptionCloudTypeWithHttpInfo(name, cloudType, action).getBody();
    }

    /**
     * Enables or disables a cloud type in a Tessell Subscription
     * Enables or disables a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param cloudType Cloud type (required)
     * @param action Action on the subscription. Eg. enable/disable (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> actionOnSubscriptionCloudTypeWithHttpInfo(String name, String cloudType, Action action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling actionOnSubscriptionCloudType");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling actionOnSubscriptionCloudType");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling actionOnSubscriptionCloudType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("cloud-type", cloudType);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/cloud-type/{cloud-type}/{action}", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Adds cloud type to a new Tessell subscription
     * Adds cloud type to a new Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param subscriptionCloudConfigMap Cloud details (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView addCloudTypeToSubscription(String name, SubscriptionCloudConfigMap subscriptionCloudConfigMap) throws RestClientException {
        return addCloudTypeToSubscriptionWithHttpInfo(name, subscriptionCloudConfigMap).getBody();
    }

    /**
     * Adds cloud type to a new Tessell subscription
     * Adds cloud type to a new Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param subscriptionCloudConfigMap Cloud details (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> addCloudTypeToSubscriptionWithHttpInfo(String name, SubscriptionCloudConfigMap subscriptionCloudConfigMap) throws RestClientException {
        Object postBody = subscriptionCloudConfigMap;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling addCloudTypeToSubscription");
        }
        
        // verify the required parameter 'subscriptionCloudConfigMap' is set
        if (subscriptionCloudConfigMap == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionCloudConfigMap' when calling addCloudTypeToSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/cloud-type", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Add regions for a cloud type in a Tessell Subscription
     * Add regions for a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param subscriptionCloudConfigMap Cloud config map (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView addRegionsInSubscription(String name, SubscriptionCloudConfigMap subscriptionCloudConfigMap) throws RestClientException {
        return addRegionsInSubscriptionWithHttpInfo(name, subscriptionCloudConfigMap).getBody();
    }

    /**
     * Add regions for a cloud type in a Tessell Subscription
     * Add regions for a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param subscriptionCloudConfigMap Cloud config map (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> addRegionsInSubscriptionWithHttpInfo(String name, SubscriptionCloudConfigMap subscriptionCloudConfigMap) throws RestClientException {
        Object postBody = subscriptionCloudConfigMap;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling addRegionsInSubscription");
        }
        
        // verify the required parameter 'subscriptionCloudConfigMap' is set
        if (subscriptionCloudConfigMap == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionCloudConfigMap' when calling addRegionsInSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/add-regions", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Adds users to a Tessell subscription
     * Adds users to a Tessell subscription
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param aclPayload Add Users To Subscription Request (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addUsersToSubscription(String name, AclPayload aclPayload) throws RestClientException {
        addUsersToSubscriptionWithHttpInfo(name, aclPayload);
    }

    /**
     * Adds users to a Tessell subscription
     * Adds users to a Tessell subscription
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param aclPayload Add Users To Subscription Request (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addUsersToSubscriptionWithHttpInfo(String name, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling addUsersToSubscription");
        }
        
        // verify the required parameter 'aclPayload' is set
        if (aclPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclPayload' when calling addUsersToSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/acls", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell subscription.
     * Creates a new Tessell subscription based on deployment type(shared/byoa) and cloud configurations.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSubscriptionPayload Subscription Information (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView createSubscription(CreateSubscriptionPayload createSubscriptionPayload) throws RestClientException {
        return createSubscriptionWithHttpInfo(createSubscriptionPayload).getBody();
    }

    /**
     * Create a new Tessell subscription.
     * Creates a new Tessell subscription based on deployment type(shared/byoa) and cloud configurations.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSubscriptionPayload Subscription Information (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> createSubscriptionWithHttpInfo(CreateSubscriptionPayload createSubscriptionPayload) throws RestClientException {
        Object postBody = createSubscriptionPayload;
        
        // verify the required parameter 'createSubscriptionPayload' is set
        if (createSubscriptionPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createSubscriptionPayload' when calling createSubscription");
        }
        
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submits request to delete a Tessell Subscription
     * Submits request to delete a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteSubscription(String name, Boolean softDelete) throws RestClientException {
        return deleteSubscriptionWithHttpInfo(name, softDelete).getBody();
    }

    /**
     * Submits request to delete a Tessell Subscription
     * Submits request to delete a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteSubscriptionWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param status List of subscription statuses (optional)
     * @param entityOwner Filter based on subscription owners (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return SubscriptionsAdminApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionsAdminApiResponse getAdminViewSubscriptions(List<SubscriptionStatus> status, List<String> entityOwner, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getAdminViewSubscriptionsWithHttpInfo(status, entityOwner, timeZone, pageSize, pageOffset).getBody();
    }

    /**
     * Returns details about the Tessell Subscriptions
     * Returns details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param status List of subscription statuses (optional)
     * @param entityOwner Filter based on subscription owners (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;SubscriptionsAdminApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionsAdminApiResponse> getAdminViewSubscriptionsWithHttpInfo(List<SubscriptionStatus> status, List<String> entityOwner, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "entity-owner", entityOwner));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<SubscriptionsAdminApiResponse> returnType = new ParameterizedTypeReference<SubscriptionsAdminApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get users which can be added to the subscription
     * Returns a list of users which can be added to the subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param role User role (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getEligibleUsersForSubscription(String name, SubscriptionUserRole role, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getEligibleUsersForSubscriptionWithHttpInfo(name, role, timeZone, pageSize, pageOffset).getBody();
    }

    /**
     * Get users which can be added to the subscription
     * Returns a list of users which can be added to the subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param role User role (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getEligibleUsersForSubscriptionWithHttpInfo(String name, SubscriptionUserRole role, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getEligibleUsersForSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<List<AclEligibleUser>> returnType = new ParameterizedTypeReference<List<AclEligibleUser>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get subscription related metadata
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return SubscriptionByoaStaticMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionByoaStaticMetadata getSubscriptionByoaStaticMetadata() throws RestClientException {
        return getSubscriptionByoaStaticMetadataWithHttpInfo().getBody();
    }

    /**
     * 
     * Get subscription related metadata
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;SubscriptionByoaStaticMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionByoaStaticMetadata> getSubscriptionByoaStaticMetadataWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/subscription-service/governance/subscription-metadata/byoa", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SubscriptionByoaStaticMetadata> returnType = new ParameterizedTypeReference<SubscriptionByoaStaticMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submits request to get the subscription details
     * Submits request to get the subscription details
     * <p><b>200</b> - Details of a subscription
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView getSubscriptionName(String name, String timeZone) throws RestClientException {
        return getSubscriptionNameWithHttpInfo(name, timeZone).getBody();
    }

    /**
     * Submits request to get the subscription details
     * Submits request to get the subscription details
     * <p><b>200</b> - Details of a subscription
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> getSubscriptionNameWithHttpInfo(String name, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSubscriptionName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get subscription&#39;s users&#39; details
     * Get the details of subscription&#39;s users
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return SubscriptionUsersAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionUsersAdminView getSubscriptionUsersDetails(String name, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getSubscriptionUsersDetailsWithHttpInfo(name, timeZone, pageSize, pageOffset).getBody();
    }

    /**
     * Get subscription&#39;s users&#39; details
     * Get the details of subscription&#39;s users
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;SubscriptionUsersAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionUsersAdminView> getSubscriptionUsersDetailsWithHttpInfo(String name, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSubscriptionUsersDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<SubscriptionUsersAdminView> returnType = new ParameterizedTypeReference<SubscriptionUsersAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns details about the Tessell Subscriptions
     * It returns the details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param status List of subscription statuses (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return SubscriptionsUserViewApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionsUserViewApiResponse getUserViewSubscriptions(List<SubscriptionStatus> status, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getUserViewSubscriptionsWithHttpInfo(status, timeZone, pageSize, pageOffset).getBody();
    }

    /**
     * Returns details about the Tessell Subscriptions
     * It returns the details about the Tessell Subscriptions
     * <p><b>200</b> - List of subscriptions
     * <p><b>0</b> - API error response
     * @param status List of subscription statuses (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;SubscriptionsUserViewApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionsUserViewApiResponse> getUserViewSubscriptionsWithHttpInfo(List<SubscriptionStatus> status, String timeZone, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<SubscriptionsUserViewApiResponse> returnType = new ParameterizedTypeReference<SubscriptionsUserViewApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Removes users from a Tessell subscription
     * Removes users from a Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param aclRevokePayload Remove Users To Subscription Request (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView removeUsersFromSubscription(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        return removeUsersFromSubscriptionWithHttpInfo(name, aclRevokePayload).getBody();
    }

    /**
     * Removes users from a Tessell subscription
     * Removes users from a Tessell subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param aclRevokePayload Remove Users To Subscription Request (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> removeUsersFromSubscriptionWithHttpInfo(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling removeUsersFromSubscription");
        }
        
        // verify the required parameter 'aclRevokePayload' is set
        if (aclRevokePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclRevokePayload' when calling removeUsersFromSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update regions for a cloud type in a Tessell Subscription
     * Update regions for a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param cloudType Cloud type (required)
     * @param updateRegionsPayload Region list (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView updateRegionsInSubscription(String name, String cloudType, UpdateRegionsPayload updateRegionsPayload) throws RestClientException {
        return updateRegionsInSubscriptionWithHttpInfo(name, cloudType, updateRegionsPayload).getBody();
    }

    /**
     * Update regions for a cloud type in a Tessell Subscription
     * Update regions for a cloud type in a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param cloudType Cloud type (required)
     * @param updateRegionsPayload Region list (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> updateRegionsInSubscriptionWithHttpInfo(String name, String cloudType, UpdateRegionsPayload updateRegionsPayload) throws RestClientException {
        Object postBody = updateRegionsPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateRegionsInSubscription");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling updateRegionsInSubscription");
        }
        
        // verify the required parameter 'updateRegionsPayload' is set
        if (updateRegionsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateRegionsPayload' when calling updateRegionsInSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("cloud-type", cloudType);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}/cloud-type/{cloud-type}/regions", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submits request to update a Tessell Subscription
     * Submits request to update a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param updateSubscriptionServicePayload Update Subscription Body (required)
     * @return SubscriptionAdminView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionAdminView updateSubscription(String name, UpdateSubscriptionServicePayload updateSubscriptionServicePayload) throws RestClientException {
        return updateSubscriptionWithHttpInfo(name, updateSubscriptionServicePayload).getBody();
    }

    /**
     * Submits request to update a Tessell Subscription
     * Submits request to update a Tessell Subscription
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Subscription Name (required)
     * @param updateSubscriptionServicePayload Update Subscription Body (required)
     * @return ResponseEntity&lt;SubscriptionAdminView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionAdminView> updateSubscriptionWithHttpInfo(String name, UpdateSubscriptionServicePayload updateSubscriptionServicePayload) throws RestClientException {
        Object postBody = updateSubscriptionServicePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateSubscription");
        }
        
        // verify the required parameter 'updateSubscriptionServicePayload' is set
        if (updateSubscriptionServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateSubscriptionServicePayload' when calling updateSubscription");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/{name}", uriVariables);

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

    ParameterizedTypeReference<SubscriptionAdminView> returnType = new ParameterizedTypeReference<SubscriptionAdminView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Verify the azure oauth code.
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param code Azure auth code (required)
     * @param azureTenantId Azure tenant ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifyAzureTenantId(String code, String azureTenantId) throws RestClientException {
        verifyAzureTenantIdWithHttpInfo(code, azureTenantId);
    }

    /**
     * 
     * Verify the azure oauth code.
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param code Azure auth code (required)
     * @param azureTenantId Azure tenant ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifyAzureTenantIdWithHttpInfo(String code, String azureTenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling verifyAzureTenantId");
        }
        
        // verify the required parameter 'azureTenantId' is set
        if (azureTenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'azureTenantId' when calling verifyAzureTenantId");
        }
        
        String path = apiClient.expandPath("/subscription-service/governance/subscriptions/azureauth/callback", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "azure-tenant-id", azureTenantId));

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
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
