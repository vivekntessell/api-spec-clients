package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorDTO;
import com.tessell.gov.client.model.TessellApiErrorOpsDTO;
import com.tessell.gov.client.model.TessellAppApiResponseDTO;
import com.tessell.gov.client.model.TessellAppCreatePayloadDTO;
import com.tessell.gov.client.model.TessellAppDTO;
import com.tessell.gov.client.model.TessellAppUpdatePayloadDTO;
import com.tessell.gov.client.model.TessellGovernStatusDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@Component("com.tessell.gov.client.api.TessellAppControllerApi")
public class TessellAppControllerApi {
    private ApiClient apiClient;

    public TessellAppControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellAppControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellAppCreatePayloadDTO  (optional)
     * @return TessellAppDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppDTO createApp(TessellAppCreatePayloadDTO tessellAppCreatePayloadDTO) throws RestClientException {
        return createAppWithHttpInfo(tessellAppCreatePayloadDTO).getBody();
    }

    /**
     * Create an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellAppCreatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAppDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppDTO> createAppWithHttpInfo(TessellAppCreatePayloadDTO tessellAppCreatePayloadDTO) throws RestClientException {
        Object postBody = tessellAppCreatePayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/apps", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAppDTO> returnType = new ParameterizedTypeReference<TessellAppDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional)
     * @return TessellGovernStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGovernStatusDTO deleteApp(String name, Boolean softDelete) throws RestClientException {
        return deleteAppWithHttpInfo(name, softDelete).getBody();
    }

    /**
     * Delete a Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional)
     * @return ResponseEntity&lt;TessellGovernStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGovernStatusDTO> deleteAppWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteApp");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/apps/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellGovernStatusDTO> returnType = new ParameterizedTypeReference<TessellGovernStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return TessellAppDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppDTO getApp(String name) throws RestClientException {
        return getAppWithHttpInfo(name).getBody();
    }

    /**
     * Get details of an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return ResponseEntity&lt;TessellAppDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppDTO> getAppWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getApp");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/apps/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellAppDTO> returnType = new ParameterizedTypeReference<TessellAppDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param loadFeatures load-features (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param consumerType API consumer type (optional, default to OPS)
     * @return TessellAppApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppApiResponseDTO getApps(String tenantId, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone, String consumerType) throws RestClientException {
        return getAppsWithHttpInfo(tenantId, loadFeatures, pageSize, pageOffset, timeZone, consumerType).getBody();
    }

    /**
     * Get a list of Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param loadFeatures load-features (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param consumerType API consumer type (optional, default to OPS)
     * @return ResponseEntity&lt;TessellAppApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppApiResponseDTO> getAppsWithHttpInfo(String tenantId, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone, String consumerType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getApps");
        }
        
        String path = apiClient.expandPath("/apps", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-features", loadFeatures));
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

    ParameterizedTypeReference<TessellAppApiResponseDTO> returnType = new ParameterizedTypeReference<TessellAppApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellAppUpdatePayloadDTO  (optional)
     * @return TessellAppDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppDTO updateApp(String name, TessellAppUpdatePayloadDTO tessellAppUpdatePayloadDTO) throws RestClientException {
        return updateAppWithHttpInfo(name, tessellAppUpdatePayloadDTO).getBody();
    }

    /**
     * Update a Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellAppUpdatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAppDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppDTO> updateAppWithHttpInfo(String name, TessellAppUpdatePayloadDTO tessellAppUpdatePayloadDTO) throws RestClientException {
        Object postBody = tessellAppUpdatePayloadDTO;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateApp");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/apps/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellAppDTO> returnType = new ParameterizedTypeReference<TessellAppDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
