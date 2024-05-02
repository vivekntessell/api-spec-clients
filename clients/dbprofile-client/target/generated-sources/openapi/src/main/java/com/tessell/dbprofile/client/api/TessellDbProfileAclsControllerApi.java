package com.tessell.dbprofile.client.api;

import com.tessell.dbprofile.client.invoker.ApiClient;

import com.tessell.dbprofile.client.model.AclEligibleUser;
import com.tessell.dbprofile.client.model.AclPayload;
import com.tessell.dbprofile.client.model.AclRevokePayload;
import com.tessell.dbprofile.client.model.ApiError;
import com.tessell.dbprofile.client.model.ApiStatus;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:18.047782+05:30[Asia/Kolkata]")
@Component("com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi")
public class TessellDbProfileAclsControllerApi {
    private ApiClient apiClient;

    public TessellDbProfileAclsControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellDbProfileAclsControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create/Update ACLs of an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclPayload  (optional)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload createDBOptionsProfileAcls(String name, AclPayload aclPayload) throws RestClientException {
        return createDBOptionsProfileAclsWithHttpInfo(name, aclPayload).getBody();
    }

    /**
     * Create/Update ACLs of an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclPayload  (optional)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> createDBOptionsProfileAclsWithHttpInfo(String name, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDBOptionsProfileAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<AclPayload> returnType = new ParameterizedTypeReference<AclPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create/Update ACLs of a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclPayload  (optional)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload createDBParameterProfileAcls(String name, AclPayload aclPayload) throws RestClientException {
        return createDBParameterProfileAclsWithHttpInfo(name, aclPayload).getBody();
    }

    /**
     * Create/Update ACLs of a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclPayload  (optional)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> createDBParameterProfileAclsWithHttpInfo(String name, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createDBParameterProfileAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/parameter-profiles/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<AclPayload> returnType = new ParameterizedTypeReference<AclPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of all users along with role they are eligible on an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param role Name of role (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getPrivilegedUserForDBOptionsProfile(String name, String role) throws RestClientException {
        return getPrivilegedUserForDBOptionsProfileWithHttpInfo(name, role).getBody();
    }

    /**
     * Get a list of all users along with role they are eligible on an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param role Name of role (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getPrivilegedUserForDBOptionsProfileWithHttpInfo(String name, String role) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getPrivilegedUserForDBOptionsProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles/{name}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));

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
     * Get a list of all users along with role they are eligible on a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (required)
     * @param role role (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getPrivilegedUserForDBParameterProfile(String name, String role) throws RestClientException {
        return getPrivilegedUserForDBParameterProfileWithHttpInfo(name, role).getBody();
    }

    /**
     * Get a list of all users along with role they are eligible on a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (required)
     * @param role role (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getPrivilegedUserForDBParameterProfileWithHttpInfo(String name, String role) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getPrivilegedUserForDBParameterProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/parameter-profiles/{name}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "role", role));

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
     * Revoke access of given users from an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclRevokePayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeDBOptionsProfileAcls(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeDBOptionsProfileAclsWithHttpInfo(name, aclRevokePayload).getBody();
    }

    /**
     * Revoke access of given users from an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclRevokePayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeDBOptionsProfileAclsWithHttpInfo(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling revokeDBOptionsProfileAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revoke access of given users from a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclRevokePayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeDBParameterProfileAcls(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeDBParameterProfileAclsWithHttpInfo(name, aclRevokePayload).getBody();
    }

    /**
     * Revoke access of given users from a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param aclRevokePayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeDBParameterProfileAclsWithHttpInfo(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling revokeDBParameterProfileAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/parameter-profiles/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Options Profile&#39;s Maturity Status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param action Actions like DRAFT/PUBLISH/UNPUBLISH (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateOptionProfileStatus(String name, String action) throws RestClientException {
        return updateOptionProfileStatusWithHttpInfo(name, action).getBody();
    }

    /**
     * Update Options Profile&#39;s Maturity Status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param action Actions like DRAFT/PUBLISH/UNPUBLISH (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateOptionProfileStatusWithHttpInfo(String name, String action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateOptionProfileStatus");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateOptionProfileStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles/{name}/{action}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Parameter Profile&#39;s Maturity Status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (required)
     * @param action Actions like DRAFT/PUBLISH/UNPUBLISH (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateParameterProfileStatus(String name, String action) throws RestClientException {
        return updateParameterProfileStatusWithHttpInfo(name, action).getBody();
    }

    /**
     * Update Parameter Profile&#39;s Maturity Status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (required)
     * @param action Actions like DRAFT/PUBLISH/UNPUBLISH (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateParameterProfileStatusWithHttpInfo(String name, String action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateParameterProfileStatus");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateParameterProfileStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/databases/profiles/governance/parameter-profiles/{name}/{action}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
