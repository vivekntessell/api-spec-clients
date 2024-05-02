package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.AclEligibleUser;
import com.tessell.database.system.client.model.AclPayload;
import com.tessell.database.system.client.model.AclRevokePayload;
import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiStatus;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@Component("com.tessell.database.system.client.api.TessellServiceAclControllerApi")
public class TessellServiceAclControllerApi {
    private ApiClient apiClient;

    public TessellServiceAclControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellServiceAclControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get list of all the users by privileges for the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param roles Filter based on the privilege roles (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getPrivilegedUsersForTessellService(UUID id, List<String> roles) throws RestClientException {
        return getPrivilegedUsersForTessellServiceWithHttpInfo(id, roles).getBody();
    }

    /**
     * Get list of all the users by privileges for the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param roles Filter based on the privilege roles (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getPrivilegedUsersForTessellServiceWithHttpInfo(UUID id, List<String> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getPrivilegedUsersForTessellService");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "roles", roles));

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
     * Revoke DB Service ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param aclRevokePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeTessellServiceAcls(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeTessellServiceAclsWithHttpInfo(id, aclRevokePayload).getBody();
    }

    /**
     * Revoke DB Service ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param aclRevokePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeTessellServiceAclsWithHttpInfo(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling revokeTessellServiceAcls");
        }
        
        // verify the required parameter 'aclRevokePayload' is set
        if (aclRevokePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclRevokePayload' when calling revokeTessellServiceAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/acls", uriVariables);

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
     * Create or update the DB Service ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param aclPayload  (required)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload updateTessellServiceAcls(UUID id, AclPayload aclPayload) throws RestClientException {
        return updateTessellServiceAclsWithHttpInfo(id, aclPayload).getBody();
    }

    /**
     * Create or update the DB Service ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id The ID of the DB Service (required)
     * @param aclPayload  (required)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> updateTessellServiceAclsWithHttpInfo(UUID id, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTessellServiceAcls");
        }
        
        // verify the required parameter 'aclPayload' is set
        if (aclPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclPayload' when calling updateTessellServiceAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/services/{id}/acls", uriVariables);

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
}
