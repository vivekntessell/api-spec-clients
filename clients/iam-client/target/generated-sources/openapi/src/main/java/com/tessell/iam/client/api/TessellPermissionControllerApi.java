package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellPermissionApiResponse;
import com.tessell.iam.client.model.TessellPermissionCreatePayload;
import com.tessell.iam.client.model.TessellPermissionDTO;
import com.tessell.iam.client.model.TessellPermissionUpdatePayload;

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
@Component("com.tessell.iam.client.api.TessellPermissionControllerApi")
public class TessellPermissionControllerApi {
    private ApiClient apiClient;

    public TessellPermissionControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellPermissionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellPermissionCreatePayload  (optional)
     * @return TessellPermissionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPermissionDTO createPermission(TessellPermissionCreatePayload tessellPermissionCreatePayload) throws RestClientException {
        return createPermissionWithHttpInfo(tessellPermissionCreatePayload).getBody();
    }

    /**
     * Create an Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellPermissionCreatePayload  (optional)
     * @return ResponseEntity&lt;TessellPermissionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPermissionDTO> createPermissionWithHttpInfo(TessellPermissionCreatePayload tessellPermissionCreatePayload) throws RestClientException {
        Object postBody = tessellPermissionCreatePayload;
        
        String path = apiClient.expandPath("/tessell-internal/permissions", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPermissionDTO> returnType = new ParameterizedTypeReference<TessellPermissionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deletePermission(String entityType, String permission) throws RestClientException {
        return deletePermissionWithHttpInfo(entityType, permission).getBody();
    }

    /**
     * Delete a Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deletePermissionWithHttpInfo(String entityType, String permission) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling deletePermission");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling deletePermission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("permission", permission);
        String path = apiClient.expandPath("/tessell-internal/iam/{entity-type}/permissions/{permission}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of an Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @return TessellPermissionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPermissionDTO getPermission(String entityType, String permission) throws RestClientException {
        return getPermissionWithHttpInfo(entityType, permission).getBody();
    }

    /**
     * Get details of an Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @return ResponseEntity&lt;TessellPermissionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPermissionDTO> getPermissionWithHttpInfo(String entityType, String permission) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getPermission");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling getPermission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("permission", permission);
        String path = apiClient.expandPath("/tessell-internal/iam/{entity-type}/permissions/{permission}", uriVariables);

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

    ParameterizedTypeReference<TessellPermissionDTO> returnType = new ParameterizedTypeReference<TessellPermissionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Permissions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param loadInternalPermissions load-internal-permissions (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellPermissionApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPermissionApiResponse getPermissions(String entityType, String loadInternalPermissions, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getPermissionsWithHttpInfo(entityType, loadInternalPermissions, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Permissions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param loadInternalPermissions load-internal-permissions (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellPermissionApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPermissionApiResponse> getPermissionsWithHttpInfo(String entityType, String loadInternalPermissions, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getPermissions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        String path = apiClient.expandPath("/tessell-internal/iam/{entity-type}/permissions", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-internal-permissions", loadInternalPermissions));
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

    ParameterizedTypeReference<TessellPermissionApiResponse> returnType = new ParameterizedTypeReference<TessellPermissionApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @param tessellPermissionUpdatePayload  (optional)
     * @return TessellPermissionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPermissionDTO updatePermission(String entityType, String permission, TessellPermissionUpdatePayload tessellPermissionUpdatePayload) throws RestClientException {
        return updatePermissionWithHttpInfo(entityType, permission, tessellPermissionUpdatePayload).getBody();
    }

    /**
     * Update a Tessell Permission
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param entityType entity-type (required)
     * @param permission permission (required)
     * @param tessellPermissionUpdatePayload  (optional)
     * @return ResponseEntity&lt;TessellPermissionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPermissionDTO> updatePermissionWithHttpInfo(String entityType, String permission, TessellPermissionUpdatePayload tessellPermissionUpdatePayload) throws RestClientException {
        Object postBody = tessellPermissionUpdatePayload;
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling updatePermission");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling updatePermission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("permission", permission);
        String path = apiClient.expandPath("/tessell-internal/iam/{entity-type}/permissions/{permission}", uriVariables);

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

    ParameterizedTypeReference<TessellPermissionDTO> returnType = new ParameterizedTypeReference<TessellPermissionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
