package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import java.util.Set;
import com.tessell.iam.client.model.TessellAcceptInviteUserPayload;
import com.tessell.iam.client.model.TessellActivateUserInternalPayload;
import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellChangePasswordPayload;
import com.tessell.iam.client.model.TessellChangeStatusPayload;
import com.tessell.iam.client.model.TessellConsumerType;
import com.tessell.iam.client.model.TessellCreateUserInternalPayload;
import com.tessell.iam.client.model.TessellEmailToUserIdMapping;
import com.tessell.iam.client.model.TessellFeatureStatusResponse;
import com.tessell.iam.client.model.TessellForceResetPasswordPayload;
import com.tessell.iam.client.model.TessellIamApiResponse;
import com.tessell.iam.client.model.TessellInviteUserPayload;
import com.tessell.iam.client.model.TessellLoginUserPayload;
import com.tessell.iam.client.model.TessellLoginUserResponse;
import com.tessell.iam.client.model.TessellRefreshTokenResponse;
import com.tessell.iam.client.model.TessellResetPasswordOnExpiryPayload;
import com.tessell.iam.client.model.TessellResetPasswordPayload;
import com.tessell.iam.client.model.TessellResourceBulkDeletePayloadOps;
import com.tessell.iam.client.model.TessellResourceBulkDeleteResponseOps;
import com.tessell.iam.client.model.TessellUpdateUserPayload;
import com.tessell.iam.client.model.TessellUpdateUserProfilePayload;
import com.tessell.iam.client.model.TessellUserDetails;
import com.tessell.iam.client.model.TessellUserServiceConsumerDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@Component("com.tessell.iam.client.api.UsersApi")
public class UsersApi {
    private ApiClient apiClient;

    public UsersApi() {
        this(new ApiClient());
    }

    @Autowired
    public UsersApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Accept invite
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellAcceptInviteUserPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus acceptInvite(TessellAcceptInviteUserPayload tessellAcceptInviteUserPayload) throws RestClientException {
        return acceptInviteWithHttpInfo(tessellAcceptInviteUserPayload).getBody();
    }

    /**
     * Accept invite
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellAcceptInviteUserPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> acceptInviteWithHttpInfo(TessellAcceptInviteUserPayload tessellAcceptInviteUserPayload) throws RestClientException {
        Object postBody = tessellAcceptInviteUserPayload;
        
        String path = apiClient.expandPath("/iam/users/accept-invite", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * First time activate user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellActivateUserInternalPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus activateUserInternal(String tenantId, TessellActivateUserInternalPayload tessellActivateUserInternalPayload) throws RestClientException {
        return activateUserInternalWithHttpInfo(tenantId, tessellActivateUserInternalPayload).getBody();
    }

    /**
     * First time activate user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellActivateUserInternalPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> activateUserInternalWithHttpInfo(String tenantId, TessellActivateUserInternalPayload tessellActivateUserInternalPayload) throws RestClientException {
        Object postBody = tessellActivateUserInternalPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling activateUserInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users/activate", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param emailId emailId (required)
     * @param tessellUpdateUserPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus adminUpdateUser(String tenantId, String emailId, TessellUpdateUserPayload tessellUpdateUserPayload) throws RestClientException {
        return adminUpdateUserWithHttpInfo(tenantId, emailId, tessellUpdateUserPayload).getBody();
    }

    /**
     * Update a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param emailId emailId (required)
     * @param tessellUpdateUserPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> adminUpdateUserWithHttpInfo(String tenantId, String emailId, TessellUpdateUserPayload tessellUpdateUserPayload) throws RestClientException {
        Object postBody = tessellUpdateUserPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling adminUpdateUser");
        }
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling adminUpdateUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email-id", emailId);
        String path = apiClient.expandPath("/iam/users/{email-id}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Bulk delete all users of tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps bulkDeleteUsersOfTenant(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return bulkDeleteUsersOfTenantWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Bulk delete all users of tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> bulkDeleteUsersOfTenantWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/users/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Change current user&#39;s password
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellChangePasswordPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus changePassword(TessellChangePasswordPayload tessellChangePasswordPayload) throws RestClientException {
        return changePasswordWithHttpInfo(tessellChangePasswordPayload).getBody();
    }

    /**
     * Change current user&#39;s password
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellChangePasswordPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> changePasswordWithHttpInfo(TessellChangePasswordPayload tessellChangePasswordPayload) throws RestClientException {
        Object postBody = tessellChangePasswordPayload;
        
        String path = apiClient.expandPath("/iam/users/change-password", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Change status of a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @param tessellChangeStatusPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus changeStatus(String emailId, TessellChangeStatusPayload tessellChangeStatusPayload) throws RestClientException {
        return changeStatusWithHttpInfo(emailId, tessellChangeStatusPayload).getBody();
    }

    /**
     * Change status of a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @param tessellChangeStatusPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> changeStatusWithHttpInfo(String emailId, TessellChangeStatusPayload tessellChangeStatusPayload) throws RestClientException {
        Object postBody = tessellChangeStatusPayload;
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling changeStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email-id", emailId);
        String path = apiClient.expandPath("/iam/users/{email-id}/change-status", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if a feature is enabled and is active
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param appFamily app family name (required)
     * @param app app name (required)
     * @param featureName feature name (required)
     * @return TessellFeatureStatusResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureStatusResponse checkFeatureEnabled(String tenantId, String appFamily, String app, String featureName) throws RestClientException {
        return checkFeatureEnabledWithHttpInfo(tenantId, appFamily, app, featureName).getBody();
    }

    /**
     * Check if a feature is enabled and is active
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param appFamily app family name (required)
     * @param app app name (required)
     * @param featureName feature name (required)
     * @return ResponseEntity&lt;TessellFeatureStatusResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureStatusResponse> checkFeatureEnabledWithHttpInfo(String tenantId, String appFamily, String app, String featureName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkFeatureEnabled");
        }
        
        // verify the required parameter 'appFamily' is set
        if (appFamily == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'appFamily' when calling checkFeatureEnabled");
        }
        
        // verify the required parameter 'app' is set
        if (app == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'app' when calling checkFeatureEnabled");
        }
        
        // verify the required parameter 'featureName' is set
        if (featureName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'featureName' when calling checkFeatureEnabled");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("app-family", appFamily);
        uriVariables.put("app", app);
        uriVariables.put("feature-name", featureName);
        String path = apiClient.expandPath("/iam/tessell-internal/users/{app-family}/{app}/check-feature-enabled/{feature-name}", uriVariables);

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

    ParameterizedTypeReference<TessellFeatureStatusResponse> returnType = new ParameterizedTypeReference<TessellFeatureStatusResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Validate if user has a given privilege or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return Map&lt;String, Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Map<String, Boolean> checkPrivileges(String tenantId, List<String> requestBody) throws RestClientException {
        return checkPrivilegesWithHttpInfo(tenantId, requestBody).getBody();
    }

    /**
     * Validate if user has a given privilege or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return ResponseEntity&lt;Map&lt;String, Boolean&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Map<String, Boolean>> checkPrivilegesWithHttpInfo(String tenantId, List<String> requestBody) throws RestClientException {
        Object postBody = requestBody;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkPrivileges");
        }
        
        String path = apiClient.expandPath("/iam/tessell-internal/users/check-privileges", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Map<String, Boolean>> returnType = new ParameterizedTypeReference<Map<String, Boolean>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create User in non Active state
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreateUserInternalPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus createUserInternal(String tenantId, TessellCreateUserInternalPayload tessellCreateUserInternalPayload) throws RestClientException {
        return createUserInternalWithHttpInfo(tenantId, tessellCreateUserInternalPayload).getBody();
    }

    /**
     * Create User in non Active state
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreateUserInternalPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> createUserInternalWithHttpInfo(String tenantId, TessellCreateUserInternalPayload tessellCreateUserInternalPayload) throws RestClientException {
        Object postBody = tessellCreateUserInternalPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createUserInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users/create", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a user
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus delete(String emailId, String tenantId) throws RestClientException {
        return deleteWithHttpInfo(emailId, tenantId).getBody();
    }

    /**
     * Delete a user
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteWithHttpInfo(String emailId, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling delete");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling delete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email-id", emailId);
        String path = apiClient.expandPath("/iam/users/{email-id}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete all the users of a tenant (Internal API)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId TenantId for which all the users to be deleted (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteAllUsersInTenantInternal(String tenantId) throws RestClientException {
        return deleteAllUsersInTenantInternalWithHttpInfo(tenantId).getBody();
    }

    /**
     * Delete all the users of a tenant (Internal API)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId TenantId for which all the users to be deleted (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteAllUsersInTenantInternalWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteAllUsersInTenantInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a user (Internal API)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param emailId EmailId of the user to be deleted (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteUser(String emailId, String tenantId) throws RestClientException {
        return deleteUserWithHttpInfo(emailId, tenantId).getBody();
    }

    /**
     * Delete a user (Internal API)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param emailId EmailId of the user to be deleted (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteUserWithHttpInfo(String emailId, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling deleteUser");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteUser");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email-id", emailId);
        String path = apiClient.expandPath("/tessell-internal/iam/users/{email-id}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Forcefully reset password for a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellForceResetPasswordPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus forceResetPassword(TessellForceResetPasswordPayload tessellForceResetPasswordPayload) throws RestClientException {
        return forceResetPasswordWithHttpInfo(tessellForceResetPasswordPayload).getBody();
    }

    /**
     * Forcefully reset password for a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellForceResetPasswordPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> forceResetPasswordWithHttpInfo(TessellForceResetPasswordPayload tessellForceResetPasswordPayload) throws RestClientException {
        Object postBody = tessellForceResetPasswordPayload;
        
        String path = apiClient.expandPath("/iam/users/force-reset-password", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Forgot Password
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus forgotPassword(String emailId) throws RestClientException {
        return forgotPasswordWithHttpInfo(emailId).getBody();
    }

    /**
     * Forgot Password
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param emailId email-id (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> forgotPasswordWithHttpInfo(String emailId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'emailId' is set
        if (emailId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'emailId' when calling forgotPassword");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("email-id", emailId);
        String path = apiClient.expandPath("/iam/users/forgot-password/{email-id}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Given a set of user ids, return the corresponding user details
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param UUID  (optional)
     * @return List&lt;TessellUserDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellUserDetails> getDetails(String tenantId, Set<UUID> UUID) throws RestClientException {
        return getDetailsWithHttpInfo(tenantId, UUID).getBody();
    }

    /**
     * Given a set of user ids, return the corresponding user details
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param UUID  (optional)
     * @return ResponseEntity&lt;List&lt;TessellUserDetails&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellUserDetails>> getDetailsWithHttpInfo(String tenantId, Set<UUID> UUID) throws RestClientException {
        Object postBody = UUID;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getDetails");
        }
        
        String path = apiClient.expandPath("/iam/tessell-internal/users/details", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<TessellUserDetails>> returnType = new ParameterizedTypeReference<List<TessellUserDetails>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Given a set of email ids, return the corresponding user ids
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return List&lt;TessellEmailToUserIdMapping&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellEmailToUserIdMapping> getIds(String tenantId, Set<String> requestBody) throws RestClientException {
        return getIdsWithHttpInfo(tenantId, requestBody).getBody();
    }

    /**
     * Given a set of email ids, return the corresponding user ids
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return ResponseEntity&lt;List&lt;TessellEmailToUserIdMapping&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellEmailToUserIdMapping>> getIdsWithHttpInfo(String tenantId, Set<String> requestBody) throws RestClientException {
        Object postBody = requestBody;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIds");
        }
        
        String path = apiClient.expandPath("/iam/tessell-internal/users/ids", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<TessellEmailToUserIdMapping>> returnType = new ParameterizedTypeReference<List<TessellEmailToUserIdMapping>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status of bulk deletion of users
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteUsersOfTenant(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return getStatusOfBulkDeleteUsersOfTenantWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Get status of bulk deletion of users
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> getStatusOfBulkDeleteUsersOfTenantWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/users/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param personas Personas that users are belonging to (optional)
     * @param loadApps Flag to include/exclude Application details in response (optional, default to false)
     * @param loadPersonas Flag to include/exclude Persona details in response (optional, default to false)
     * @param loadSubscriptions Flag to include/exclude Subscriptions details in response. (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param consumerType consumer-type ( Deprecated ) (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getUsers(String tenantId, List<String> personas, Boolean loadApps, Boolean loadPersonas, Boolean loadSubscriptions, Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        return getUsersWithHttpInfo(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType).getBody();
    }

    /**
     * Get list of all the users
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param personas Personas that users are belonging to (optional)
     * @param loadApps Flag to include/exclude Application details in response (optional, default to false)
     * @param loadPersonas Flag to include/exclude Persona details in response (optional, default to false)
     * @param loadSubscriptions Flag to include/exclude Subscriptions details in response. (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param consumerType consumer-type ( Deprecated ) (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getUsersWithHttpInfo(String tenantId, List<String> personas, Boolean loadApps, Boolean loadPersonas, Boolean loadSubscriptions, Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getUsers");
        }
        
        String path = apiClient.expandPath("/iam/users", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "personas", personas));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-apps", loadApps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-personas", loadPersonas));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscriptions", loadSubscriptions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellIamApiResponse> returnType = new ParameterizedTypeReference<TessellIamApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getUsersByPrivileges(String tenantId, List<String> requestBody) throws RestClientException {
        return getUsersByPrivilegesWithHttpInfo(tenantId, requestBody).getBody();
    }

    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param requestBody  (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getUsersByPrivilegesWithHttpInfo(String tenantId, List<String> requestBody) throws RestClientException {
        Object postBody = requestBody;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getUsersByPrivileges");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellIamApiResponse> returnType = new ParameterizedTypeReference<TessellIamApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users internal API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param personas Personas that users are belonging to (optional)
     * @param loadApps Flag to include/exclude Application details in response. (optional, default to false)
     * @param loadPersonas Flag to include/exclude Persona details in response. (optional, default to false)
     * @param loadSubscriptions Flag to include/exclude Subscriptions details in response. (optional, default to false)
     * @param pageSize page-size (paging is not implemented yet) (optional, default to 10)
     * @param pageOffset page-offset (paging is not implemented yet) (optional, default to 0)
     * @param timeZone time-zone (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getUsersInternal(String tenantId, List<String> personas, Boolean loadApps, Boolean loadPersonas, Boolean loadSubscriptions, Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        return getUsersInternalWithHttpInfo(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType).getBody();
    }

    /**
     * Get list of all the users internal API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param personas Personas that users are belonging to (optional)
     * @param loadApps Flag to include/exclude Application details in response. (optional, default to false)
     * @param loadPersonas Flag to include/exclude Persona details in response. (optional, default to false)
     * @param loadSubscriptions Flag to include/exclude Subscriptions details in response. (optional, default to false)
     * @param pageSize page-size (paging is not implemented yet) (optional, default to 10)
     * @param pageOffset page-offset (paging is not implemented yet) (optional, default to 0)
     * @param timeZone time-zone (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getUsersInternalWithHttpInfo(String tenantId, List<String> personas, Boolean loadApps, Boolean loadPersonas, Boolean loadSubscriptions, Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getUsersInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "personas", personas));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-apps", loadApps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-personas", loadPersonas));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscriptions", loadSubscriptions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellIamApiResponse> returnType = new ParameterizedTypeReference<TessellIamApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of a user for internal consumption
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return TessellUserDetails
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUserDetails internalWhoami(String tenantId) throws RestClientException {
        return internalWhoamiWithHttpInfo(tenantId).getBody();
    }

    /**
     * Get details of a user for internal consumption
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellUserDetails&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUserDetails> internalWhoamiWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling internalWhoami");
        }
        
        String path = apiClient.expandPath("/tessell-internal/iam/users/whoami", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellUserDetails> returnType = new ParameterizedTypeReference<TessellUserDetails>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create for a new user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellInviteUserPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus inviteUser(String tenantId, TessellInviteUserPayload tessellInviteUserPayload) throws RestClientException {
        return inviteUserWithHttpInfo(tenantId, tessellInviteUserPayload).getBody();
    }

    /**
     * Create for a new user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellInviteUserPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> inviteUserWithHttpInfo(String tenantId, TessellInviteUserPayload tessellInviteUserPayload) throws RestClientException {
        Object postBody = tessellInviteUserPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling inviteUser");
        }
        
        String path = apiClient.expandPath("/iam/users/invite-user", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Login a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellLoginUserPayload  (optional)
     * @return TessellLoginUserResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLoginUserResponse login(TessellLoginUserPayload tessellLoginUserPayload) throws RestClientException {
        return loginWithHttpInfo(tessellLoginUserPayload).getBody();
    }

    /**
     * Login a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellLoginUserPayload  (optional)
     * @return ResponseEntity&lt;TessellLoginUserResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLoginUserResponse> loginWithHttpInfo(TessellLoginUserPayload tessellLoginUserPayload) throws RestClientException {
        Object postBody = tessellLoginUserPayload;
        
        String path = apiClient.expandPath("/iam/users/login", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellLoginUserResponse> returnType = new ParameterizedTypeReference<TessellLoginUserResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Logout a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus logout() throws RestClientException {
        return logoutWithHttpInfo().getBody();
    }

    /**
     * Logout a user
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> logoutWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/iam/users/logout", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Acquire new access-token using refresh-token
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return TessellRefreshTokenResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRefreshTokenResponse refreshToken(String tenantId) throws RestClientException {
        return refreshTokenWithHttpInfo(tenantId).getBody();
    }

    /**
     * Acquire new access-token using refresh-token
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellRefreshTokenResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRefreshTokenResponse> refreshTokenWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling refreshToken");
        }
        
        String path = apiClient.expandPath("/iam/users/refresh-token", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellRefreshTokenResponse> returnType = new ParameterizedTypeReference<TessellRefreshTokenResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Reset password for a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResetPasswordPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus resetPassword(TessellResetPasswordPayload tessellResetPasswordPayload) throws RestClientException {
        return resetPasswordWithHttpInfo(tessellResetPasswordPayload).getBody();
    }

    /**
     * Reset password for a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResetPasswordPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> resetPasswordWithHttpInfo(TessellResetPasswordPayload tessellResetPasswordPayload) throws RestClientException {
        Object postBody = tessellResetPasswordPayload;
        
        String path = apiClient.expandPath("/iam/users/reset-password", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Reset password for a user when password has been expired
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResetPasswordOnExpiryPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus resetPasswordOnExpiry(TessellResetPasswordOnExpiryPayload tessellResetPasswordOnExpiryPayload) throws RestClientException {
        return resetPasswordOnExpiryWithHttpInfo(tessellResetPasswordOnExpiryPayload).getBody();
    }

    /**
     * Reset password for a user when password has been expired
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResetPasswordOnExpiryPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> resetPasswordOnExpiryWithHttpInfo(TessellResetPasswordOnExpiryPayload tessellResetPasswordOnExpiryPayload) throws RestClientException {
        Object postBody = tessellResetPasswordOnExpiryPayload;
        
        String path = apiClient.expandPath("/iam/users/reset-password-on-expiry", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update self profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellUpdateUserProfilePayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus updateUserProfile(TessellUpdateUserProfilePayload tessellUpdateUserProfilePayload) throws RestClientException {
        return updateUserProfileWithHttpInfo(tessellUpdateUserProfilePayload).getBody();
    }

    /**
     * Update self profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellUpdateUserProfilePayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> updateUserProfileWithHttpInfo(TessellUpdateUserProfilePayload tessellUpdateUserProfilePayload) throws RestClientException {
        Object postBody = tessellUpdateUserProfilePayload;
        
        String path = apiClient.expandPath("/iam/users/profile", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Validate if a token is valid or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tokenId token-id (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean validateToken(String tokenId) throws RestClientException {
        return validateTokenWithHttpInfo(tokenId).getBody();
    }

    /**
     * Validate if a token is valid or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tokenId token-id (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> validateTokenWithHttpInfo(String tokenId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tokenId' is set
        if (tokenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tokenId' when calling validateToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("token-id", tokenId);
        String path = apiClient.expandPath("/iam/tessell-internal/users/validate-token/{token-id}", uriVariables);

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

    ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellUserServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUserServiceConsumerDTO whoami() throws RestClientException {
        return whoamiWithHttpInfo().getBody();
    }

    /**
     * Get details of a user
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellUserServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUserServiceConsumerDTO> whoamiWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/iam/users/whoami", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellUserServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellUserServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
