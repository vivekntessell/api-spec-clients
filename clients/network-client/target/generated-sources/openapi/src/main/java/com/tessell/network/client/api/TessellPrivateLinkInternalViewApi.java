package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorOpsDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellCreatePrivateLinkPayloadDTO;
import com.tessell.network.client.model.TessellPrivateLinkDTO;
import com.tessell.network.client.model.TessellUpdatePrivateLinkPayloadDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@Component("com.tessell.network.client.api.TessellPrivateLinkInternalViewApi")
public class TessellPrivateLinkInternalViewApi {
    private ApiClient apiClient;

    public TessellPrivateLinkInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellPrivateLinkInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreatePrivateLinkPayloadDTO Private Link Information (required)
     * @return TessellPrivateLinkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivateLinkDTO createPrivateLinkInternal(TessellCreatePrivateLinkPayloadDTO tessellCreatePrivateLinkPayloadDTO) throws RestClientException {
        return createPrivateLinkInternalWithHttpInfo(tessellCreatePrivateLinkPayloadDTO).getBody();
    }

    /**
     * Create a Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreatePrivateLinkPayloadDTO Private Link Information (required)
     * @return ResponseEntity&lt;TessellPrivateLinkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivateLinkDTO> createPrivateLinkInternalWithHttpInfo(TessellCreatePrivateLinkPayloadDTO tessellCreatePrivateLinkPayloadDTO) throws RestClientException {
        Object postBody = tessellCreatePrivateLinkPayloadDTO;
        
        // verify the required parameter 'tessellCreatePrivateLinkPayloadDTO' is set
        if (tessellCreatePrivateLinkPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreatePrivateLinkPayloadDTO' when calling createPrivateLinkInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/network/private-link", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPrivateLinkDTO> returnType = new ParameterizedTypeReference<TessellPrivateLinkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deletePrivateLinkInternal(UUID id) throws RestClientException {
        return deletePrivateLinkInternalWithHttpInfo(id).getBody();
    }

    /**
     * Delete Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deletePrivateLinkInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deletePrivateLinkInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/private-link/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Private Link by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellPrivateLinkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivateLinkDTO getPrivateLinkByIdInternal(UUID id) throws RestClientException {
        return getPrivateLinkByIdInternalWithHttpInfo(id).getBody();
    }

    /**
     * Get Private Link by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellPrivateLinkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivateLinkDTO> getPrivateLinkByIdInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getPrivateLinkByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/private-link/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellPrivateLinkDTO> returnType = new ParameterizedTypeReference<TessellPrivateLinkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Is Private Link Service Deletable
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO isPrivateLinkDeletableInternal(UUID id) throws RestClientException {
        return isPrivateLinkDeletableInternalWithHttpInfo(id).getBody();
    }

    /**
     * Is Private Link Service Deletable
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> isPrivateLinkDeletableInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling isPrivateLinkDeletableInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/private-link/{id}/deletable", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdatePrivateLinkPayloadDTO Private Link Update Information (required)
     * @return TessellPrivateLinkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPrivateLinkDTO updatePrivateLinkInternal(UUID id, TessellUpdatePrivateLinkPayloadDTO tessellUpdatePrivateLinkPayloadDTO) throws RestClientException {
        return updatePrivateLinkInternalWithHttpInfo(id, tessellUpdatePrivateLinkPayloadDTO).getBody();
    }

    /**
     * Update Private Link
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdatePrivateLinkPayloadDTO Private Link Update Information (required)
     * @return ResponseEntity&lt;TessellPrivateLinkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPrivateLinkDTO> updatePrivateLinkInternalWithHttpInfo(UUID id, TessellUpdatePrivateLinkPayloadDTO tessellUpdatePrivateLinkPayloadDTO) throws RestClientException {
        Object postBody = tessellUpdatePrivateLinkPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updatePrivateLinkInternal");
        }
        
        // verify the required parameter 'tessellUpdatePrivateLinkPayloadDTO' is set
        if (tessellUpdatePrivateLinkPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellUpdatePrivateLinkPayloadDTO' when calling updatePrivateLinkInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/private-link/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellPrivateLinkDTO> returnType = new ParameterizedTypeReference<TessellPrivateLinkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
