package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellIamApiResponse;
import com.tessell.iam.client.model.TessellUserpoolDTO;
import com.tessell.iam.client.model.TessellUserpoolPayload;

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
@Component("com.tessell.iam.client.api.UserpoolApi")
public class UserpoolApi {
    private ApiClient apiClient;

    public UserpoolApi() {
        this(new ApiClient());
    }

    @Autowired
    public UserpoolApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create for a new userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellUserpoolPayload  (optional)
     * @return TessellUserpoolDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUserpoolDTO createUserpool(TessellUserpoolPayload tessellUserpoolPayload) throws RestClientException {
        return createUserpoolWithHttpInfo(tessellUserpoolPayload).getBody();
    }

    /**
     * Create for a new userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellUserpoolPayload  (optional)
     * @return ResponseEntity&lt;TessellUserpoolDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUserpoolDTO> createUserpoolWithHttpInfo(TessellUserpoolPayload tessellUserpoolPayload) throws RestClientException {
        Object postBody = tessellUserpoolPayload;
        
        String path = apiClient.expandPath("/iam/i/userpools", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellUserpoolDTO> returnType = new ParameterizedTypeReference<TessellUserpoolDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param userpoolId userpoolId (required)
     * @param softDelete softDelete (optional, default to true)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteUserpool(String userpoolId, Boolean softDelete) throws RestClientException {
        return deleteUserpoolWithHttpInfo(userpoolId, softDelete).getBody();
    }

    /**
     * Delete a userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param userpoolId userpoolId (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteUserpoolWithHttpInfo(String userpoolId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'userpoolId' is set
        if (userpoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userpoolId' when calling deleteUserpool");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userpoolId", userpoolId);
        String path = apiClient.expandPath("/iam/i/userpools/{userpoolId}", uriVariables);

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
     * Get list of all the userpools
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getUserpools(String id, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getUserpoolsWithHttpInfo(id, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of all the userpools
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getUserpoolsWithHttpInfo(String id, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/iam/i/userpools", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
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

    ParameterizedTypeReference<TessellIamApiResponse> returnType = new ParameterizedTypeReference<TessellIamApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param userpoolId userpoolId (required)
     * @param tessellUserpoolPayload  (optional)
     * @return TessellUserpoolDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUserpoolDTO updateUserpool(String userpoolId, TessellUserpoolPayload tessellUserpoolPayload) throws RestClientException {
        return updateUserpoolWithHttpInfo(userpoolId, tessellUserpoolPayload).getBody();
    }

    /**
     * Update a userpool
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param userpoolId userpoolId (required)
     * @param tessellUserpoolPayload  (optional)
     * @return ResponseEntity&lt;TessellUserpoolDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUserpoolDTO> updateUserpoolWithHttpInfo(String userpoolId, TessellUserpoolPayload tessellUserpoolPayload) throws RestClientException {
        Object postBody = tessellUserpoolPayload;
        
        // verify the required parameter 'userpoolId' is set
        if (userpoolId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'userpoolId' when calling updateUserpool");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("userpoolId", userpoolId);
        String path = apiClient.expandPath("/iam/i/userpools/{userpoolId}", uriVariables);

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

    ParameterizedTypeReference<TessellUserpoolDTO> returnType = new ParameterizedTypeReference<TessellUserpoolDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
