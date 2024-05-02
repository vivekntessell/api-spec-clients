package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorOpsDTO;
import com.tessell.gov.client.model.TessellFeatureApiResponseDTO;
import com.tessell.gov.client.model.TessellFeatureCreatePayloadDTO;
import com.tessell.gov.client.model.TessellFeatureDTO;
import com.tessell.gov.client.model.TessellFeatureUpdatePayloadDTO;
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
@Component("com.tessell.gov.client.api.TessellFeatureControllerApi")
public class TessellFeatureControllerApi {
    private ApiClient apiClient;

    public TessellFeatureControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellFeatureControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellFeatureCreatePayloadDTO  (optional)
     * @return TessellFeatureDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureDTO createFeature(TessellFeatureCreatePayloadDTO tessellFeatureCreatePayloadDTO) throws RestClientException {
        return createFeatureWithHttpInfo(tessellFeatureCreatePayloadDTO).getBody();
    }

    /**
     * Create a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellFeatureCreatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellFeatureDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureDTO> createFeatureWithHttpInfo(TessellFeatureCreatePayloadDTO tessellFeatureCreatePayloadDTO) throws RestClientException {
        Object postBody = tessellFeatureCreatePayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/features", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellFeatureDTO> returnType = new ParameterizedTypeReference<TessellFeatureDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return TessellGovernStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGovernStatusDTO deleteFeature(String name, Boolean softDelete) throws RestClientException {
        return deleteFeatureWithHttpInfo(name, softDelete).getBody();
    }

    /**
     * Delete a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;TessellGovernStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGovernStatusDTO> deleteFeatureWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteFeature");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/features/{name}", uriVariables);

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
     * Get details of an feature
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return TessellFeatureDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureDTO getFeature(String name) throws RestClientException {
        return getFeatureWithHttpInfo(name).getBody();
    }

    /**
     * Get details of an feature
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return ResponseEntity&lt;TessellFeatureDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureDTO> getFeatureWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getFeature");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/features/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellFeatureDTO> returnType = new ParameterizedTypeReference<TessellFeatureDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of features
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id Header (optional)
     * @param app App name (optional)
     * @param appFamily App family name (optional)
     * @param features List of feature names (optional)
     * @param withoutTenantContext Load all features irrespective of tenantId (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellFeatureApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureApiResponseDTO getFeatures(String tenantId, String app, String appFamily, List<String> features, Boolean withoutTenantContext, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getFeaturesWithHttpInfo(tenantId, app, appFamily, features, withoutTenantContext, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of features
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id Header (optional)
     * @param app App name (optional)
     * @param appFamily App family name (optional)
     * @param features List of feature names (optional)
     * @param withoutTenantContext Load all features irrespective of tenantId (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellFeatureApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureApiResponseDTO> getFeaturesWithHttpInfo(String tenantId, String app, String appFamily, List<String> features, Boolean withoutTenantContext, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/features", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "app", app));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "app-family", appFamily));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "features", features));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "without-tenant-context", withoutTenantContext));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellFeatureApiResponseDTO> returnType = new ParameterizedTypeReference<TessellFeatureApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellFeatureUpdatePayloadDTO  (optional)
     * @return TessellFeatureDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureDTO updateFeature(String name, TessellFeatureUpdatePayloadDTO tessellFeatureUpdatePayloadDTO) throws RestClientException {
        return updateFeatureWithHttpInfo(name, tessellFeatureUpdatePayloadDTO).getBody();
    }

    /**
     * Update a feature
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellFeatureUpdatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellFeatureDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureDTO> updateFeatureWithHttpInfo(String name, TessellFeatureUpdatePayloadDTO tessellFeatureUpdatePayloadDTO) throws RestClientException {
        Object postBody = tessellFeatureUpdatePayloadDTO;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateFeature");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/features/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellFeatureDTO> returnType = new ParameterizedTypeReference<TessellFeatureDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
