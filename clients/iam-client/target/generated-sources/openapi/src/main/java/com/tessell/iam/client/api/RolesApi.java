package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellCreateRolePayload;
import com.tessell.iam.client.model.TessellRoleApiResponse;
import com.tessell.iam.client.model.TessellRoleResponse;

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
@Component("com.tessell.iam.client.api.RolesApi")
public class RolesApi {
    private ApiClient apiClient;

    public RolesApi() {
        this(new ApiClient());
    }

    @Autowired
    public RolesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Role
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellCreateRolePayload  (optional)
     * @return TessellRoleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRoleResponse createRole(TessellCreateRolePayload tessellCreateRolePayload) throws RestClientException {
        return createRoleWithHttpInfo(tessellCreateRolePayload).getBody();
    }

    /**
     * Create a Role
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellCreateRolePayload  (optional)
     * @return ResponseEntity&lt;TessellRoleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRoleResponse> createRoleWithHttpInfo(TessellCreateRolePayload tessellCreateRolePayload) throws RestClientException {
        Object postBody = tessellCreateRolePayload;
        
        String path = apiClient.expandPath("/tessell-internal/iam/roles", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellRoleResponse> returnType = new ParameterizedTypeReference<TessellRoleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Role
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param roleName role-name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteRole(String entityType, String roleName, Boolean softDelete) throws RestClientException {
        return deleteRoleWithHttpInfo(entityType, roleName, softDelete).getBody();
    }

    /**
     * Delete an Role
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param roleName role-name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteRoleWithHttpInfo(String entityType, String roleName, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling deleteRole");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleName' when calling deleteRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("role-name", roleName);
        String path = apiClient.expandPath("/tessell-internal/iam/roles/{entity-type}/{role-name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "softDelete", softDelete));

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
     * Get details of an Role
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param roleName role-name (required)
     * @return TessellRoleResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRoleResponse getRole(String entityType, String roleName) throws RestClientException {
        return getRoleWithHttpInfo(entityType, roleName).getBody();
    }

    /**
     * Get details of an Role
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param roleName role-name (required)
     * @return ResponseEntity&lt;TessellRoleResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRoleResponse> getRoleWithHttpInfo(String entityType, String roleName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getRole");
        }
        
        // verify the required parameter 'roleName' is set
        if (roleName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'roleName' when calling getRole");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("role-name", roleName);
        String path = apiClient.expandPath("/tessell-internal/iam/roles/{entity-type}/{role-name}", uriVariables);

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

    ParameterizedTypeReference<TessellRoleResponse> returnType = new ParameterizedTypeReference<TessellRoleResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Roles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellRoleApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRoleApiResponse getRoles(String entityType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getRolesWithHttpInfo(entityType, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Roles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellRoleApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRoleApiResponse> getRolesWithHttpInfo(String entityType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/iam/roles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-type", entityType));
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

    ParameterizedTypeReference<TessellRoleApiResponse> returnType = new ParameterizedTypeReference<TessellRoleApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
