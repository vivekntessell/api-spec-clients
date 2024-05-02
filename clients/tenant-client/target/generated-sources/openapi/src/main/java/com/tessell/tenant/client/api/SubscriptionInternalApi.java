package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.AddUsersToSubscriptionsInternalRequest;
import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.GetUserSubscriptionsMappingsRequest;
import com.tessell.tenant.client.model.SubscriptionApiResponseOps;
import com.tessell.tenant.client.model.SubscriptionApiResponseOpsV2;
import com.tessell.tenant.client.model.UserSubscriptionsMappings;

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
@Component("com.tessell.tenant.client.api.SubscriptionInternalApi")
public class SubscriptionInternalApi {
    private ApiClient apiClient;

    public SubscriptionInternalApi() {
        this(new ApiClient());
    }

    @Autowired
    public SubscriptionInternalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Adds users to multiple Tessell subscriptions
     * 
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param addUsersToSubscriptionsInternalRequest Add Users To Subscriptions Request (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void addUsersToSubscriptions(AddUsersToSubscriptionsInternalRequest addUsersToSubscriptionsInternalRequest) throws RestClientException {
        addUsersToSubscriptionsWithHttpInfo(addUsersToSubscriptionsInternalRequest);
    }

    /**
     * Adds users to multiple Tessell subscriptions
     * 
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param addUsersToSubscriptionsInternalRequest Add Users To Subscriptions Request (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> addUsersToSubscriptionsWithHttpInfo(AddUsersToSubscriptionsInternalRequest addUsersToSubscriptionsInternalRequest) throws RestClientException {
        Object postBody = addUsersToSubscriptionsInternalRequest;
        
        // verify the required parameter 'addUsersToSubscriptionsInternalRequest' is set
        if (addUsersToSubscriptionsInternalRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addUsersToSubscriptionsInternalRequest' when calling addUsersToSubscriptions");
        }
        
        String path = apiClient.expandPath("/tessell-internal/subscriptions/bulk/add-users", Collections.<String, Object>emptyMap());

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
     * Get subscriptions
     * Get subscriptions for a user
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription Name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return SubscriptionApiResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionApiResponseOps getSubscriptions(String name, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getSubscriptionsWithHttpInfo(name, pageSize, pageOffset).getBody();
    }

    /**
     * Get subscriptions
     * Get subscriptions for a user
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription Name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;SubscriptionApiResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionApiResponseOps> getSubscriptionsWithHttpInfo(String name, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<SubscriptionApiResponseOps> returnType = new ParameterizedTypeReference<SubscriptionApiResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get subscriptions for a user light weight api
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription Name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return SubscriptionApiResponseOpsV2
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SubscriptionApiResponseOpsV2 getSubscriptionsV2(String name, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getSubscriptionsV2WithHttpInfo(name, pageSize, pageOffset).getBody();
    }

    /**
     * 
     * Get subscriptions for a user light weight api
     * <p><b>200</b> - Details of a subscriptions
     * <p><b>0</b> - API error response
     * @param name Subscription Name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;SubscriptionApiResponseOpsV2&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SubscriptionApiResponseOpsV2> getSubscriptionsV2WithHttpInfo(String name, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/v2/subscriptions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<SubscriptionApiResponseOpsV2> returnType = new ParameterizedTypeReference<SubscriptionApiResponseOpsV2>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get user subscriptions mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param getUserSubscriptionsMappingsRequest User list for which the mapping is required (required)
     * @return UserSubscriptionsMappings
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public UserSubscriptionsMappings getUserSubscriptionMappings(GetUserSubscriptionsMappingsRequest getUserSubscriptionsMappingsRequest) throws RestClientException {
        return getUserSubscriptionMappingsWithHttpInfo(getUserSubscriptionsMappingsRequest).getBody();
    }

    /**
     * Get user subscriptions mappings
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param getUserSubscriptionsMappingsRequest User list for which the mapping is required (required)
     * @return ResponseEntity&lt;UserSubscriptionsMappings&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<UserSubscriptionsMappings> getUserSubscriptionMappingsWithHttpInfo(GetUserSubscriptionsMappingsRequest getUserSubscriptionsMappingsRequest) throws RestClientException {
        Object postBody = getUserSubscriptionsMappingsRequest;
        
        // verify the required parameter 'getUserSubscriptionsMappingsRequest' is set
        if (getUserSubscriptionsMappingsRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'getUserSubscriptionsMappingsRequest' when calling getUserSubscriptionMappings");
        }
        
        String path = apiClient.expandPath("/tessell-internal/get-user-subscription-mappings", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<UserSubscriptionsMappings> returnType = new ParameterizedTypeReference<UserSubscriptionsMappings>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
