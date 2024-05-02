package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellConsumerType;
import com.tessell.iam.client.model.TessellIamApiResponse;
import com.tessell.iam.client.model.TessellPrivilegeCreatePayload;
import com.tessell.iam.client.model.TessellPrivilegeDTO;
import com.tessell.iam.client.model.TessellPrivilegeUpdatePayload;

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
@Component("com.tessell.iam.client.api.PrivilegesApi")
public class PrivilegesApi {
    private ApiClient apiClient;

    public PrivilegesApi() {
        this(new ApiClient());
    }

    @Autowired
    public PrivilegesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellPrivilegeCreatePayload  (optional)
     * @return TessellPrivilegeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivilegeDTO createPrivilege(TessellPrivilegeCreatePayload tessellPrivilegeCreatePayload) throws RestClientException {
        return createPrivilegeWithHttpInfo(tessellPrivilegeCreatePayload).getBody();
    }

    /**
     * Create a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellPrivilegeCreatePayload  (optional)
     * @return ResponseEntity&lt;TessellPrivilegeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivilegeDTO> createPrivilegeWithHttpInfo(TessellPrivilegeCreatePayload tessellPrivilegeCreatePayload) throws RestClientException {
        Object postBody = tessellPrivilegeCreatePayload;
        
        String path = apiClient.expandPath("/iam/i/privileges", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPrivilegeDTO> returnType = new ParameterizedTypeReference<TessellPrivilegeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deletePrivilege(String name, Boolean softDelete) throws RestClientException {
        return deletePrivilegeWithHttpInfo(name, softDelete).getBody();
    }

    /**
     * Delete a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deletePrivilegeWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deletePrivilege");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/iam/i/privileges/{name}", uriVariables);

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
     * Get details of an privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return TessellPrivilegeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivilegeDTO getPrivilege(String name) throws RestClientException {
        return getPrivilegeWithHttpInfo(name).getBody();
    }

    /**
     * Get details of an privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return ResponseEntity&lt;TessellPrivilegeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivilegeDTO> getPrivilegeWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getPrivilege");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/iam/privileges/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellPrivilegeDTO> returnType = new ParameterizedTypeReference<TessellPrivilegeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getPrivileges(Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        return getPrivilegesWithHttpInfo(pageSize, pageOffset, timeZone, consumerType).getBody();
    }

    /**
     * Get list of privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getPrivilegesWithHttpInfo(Integer pageSize, Integer pageOffset, String timeZone, TessellConsumerType consumerType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/iam/privileges", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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
     * Update a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellPrivilegeUpdatePayload  (optional)
     * @return TessellPrivilegeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivilegeDTO updatePrivilege(String name, TessellPrivilegeUpdatePayload tessellPrivilegeUpdatePayload) throws RestClientException {
        return updatePrivilegeWithHttpInfo(name, tessellPrivilegeUpdatePayload).getBody();
    }

    /**
     * Update a privilege
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellPrivilegeUpdatePayload  (optional)
     * @return ResponseEntity&lt;TessellPrivilegeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivilegeDTO> updatePrivilegeWithHttpInfo(String name, TessellPrivilegeUpdatePayload tessellPrivilegeUpdatePayload) throws RestClientException {
        Object postBody = tessellPrivilegeUpdatePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updatePrivilege");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/iam/i/privileges/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellPrivilegeDTO> returnType = new ParameterizedTypeReference<TessellPrivilegeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
