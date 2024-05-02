package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.DeleteGenericPropertyPayload;
import com.tessell.database.system.client.model.GenericProperty;
import com.tessell.database.system.client.model.GlobalEngineConfigDTO;
import com.tessell.database.system.client.model.GlobalEngineConfigResponse;
import com.tessell.database.system.client.model.TessellFeatureConfig;
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
@Component("com.tessell.database.system.client.api.TessellGlobalEngineControllerApi")
public class TessellGlobalEngineControllerApi {
    private ApiClient apiClient;

    public TessellGlobalEngineControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellGlobalEngineControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a property
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param genericProperty  (required)
     * @return List&lt;GenericProperty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenericProperty> createDbGenericProperties(List<GenericProperty> genericProperty) throws RestClientException {
        return createDbGenericPropertiesWithHttpInfo(genericProperty).getBody();
    }

    /**
     * Create a property
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param genericProperty  (required)
     * @return ResponseEntity&lt;List&lt;GenericProperty&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenericProperty>> createDbGenericPropertiesWithHttpInfo(List<GenericProperty> genericProperty) throws RestClientException {
        Object postBody = genericProperty;
        
        // verify the required parameter 'genericProperty' is set
        if (genericProperty == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'genericProperty' when calling createDbGenericProperties");
        }
        
        String path = apiClient.expandPath("/tessell-ops/db/generic-properties", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<GenericProperty>> returnType = new ParameterizedTypeReference<List<GenericProperty>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete properties
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deleteGenericPropertyPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDbGenericProperties(DeleteGenericPropertyPayload deleteGenericPropertyPayload) throws RestClientException {
        return deleteDbGenericPropertiesWithHttpInfo(deleteGenericPropertyPayload).getBody();
    }

    /**
     * Delete properties
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param deleteGenericPropertyPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDbGenericPropertiesWithHttpInfo(DeleteGenericPropertyPayload deleteGenericPropertyPayload) throws RestClientException {
        Object postBody = deleteGenericPropertyPayload;
        
        // verify the required parameter 'deleteGenericPropertyPayload' is set
        if (deleteGenericPropertyPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteGenericPropertyPayload' when calling deleteDbGenericProperties");
        }
        
        String path = apiClient.expandPath("/tessell-ops/db/generic-properties", Collections.<String, Object>emptyMap());

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
     * Delete Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param engine engine (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteGlobalEngineConfig(String engine) throws RestClientException {
        return deleteGlobalEngineConfigWithHttpInfo(engine).getBody();
    }

    /**
     * Delete Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param engine engine (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteGlobalEngineConfigWithHttpInfo(String engine) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'engine' is set
        if (engine == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'engine' when calling deleteGlobalEngineConfig");
        }
        
        String path = apiClient.expandPath("/tessell-ops/config/global-engine", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine", engine));

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * getDbGenericProperties
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param names property names (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return List&lt;GenericProperty&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenericProperty> getDbGenericProperties(List<String> names, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbGenericPropertiesWithHttpInfo(names, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * getDbGenericProperties
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param names property names (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;List&lt;GenericProperty&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenericProperty>> getDbGenericPropertiesWithHttpInfo(List<String> names, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/db/generic-properties", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "names", names));
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

    ParameterizedTypeReference<List<GenericProperty>> returnType = new ParameterizedTypeReference<List<GenericProperty>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Feature Config
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellFeatureConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureConfig getFeatureConfig() throws RestClientException {
        return getFeatureConfigWithHttpInfo().getBody();
    }

    /**
     * Get Feature Config
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellFeatureConfig&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureConfig> getFeatureConfigWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/services/feature-config", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellFeatureConfig> returnType = new ParameterizedTypeReference<TessellFeatureConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Feature Config Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellFeatureConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureConfig getFeatureConfigOps() throws RestClientException {
        return getFeatureConfigOpsWithHttpInfo().getBody();
    }

    /**
     * Get Feature Config Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellFeatureConfig&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureConfig> getFeatureConfigOpsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/services/feature-config", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellFeatureConfig> returnType = new ParameterizedTypeReference<TessellFeatureConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param engine Returns global engine config for specified engine (optional)
     * @param tenantId Returns global engine config for specified tenant. (optional)
     * @param defaultOnly Returns global engine configuration without tenant-specific computation if flag is enabled. (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GlobalEngineConfigResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GlobalEngineConfigResponse getGlobalEngineConfig(String engine, UUID tenantId, Boolean defaultOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getGlobalEngineConfigWithHttpInfo(engine, tenantId, defaultOnly, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * get Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param engine Returns global engine config for specified engine (optional)
     * @param tenantId Returns global engine config for specified tenant. (optional)
     * @param defaultOnly Returns global engine configuration without tenant-specific computation if flag is enabled. (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GlobalEngineConfigResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GlobalEngineConfigResponse> getGlobalEngineConfigWithHttpInfo(String engine, UUID tenantId, Boolean defaultOnly, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/config/global-engine", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine", engine));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "default-only", defaultOnly));
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

    ParameterizedTypeReference<GlobalEngineConfigResponse> returnType = new ParameterizedTypeReference<GlobalEngineConfigResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get tessell service start stop config
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object getStartStopServiceConfiguration() throws RestClientException {
        return getStartStopServiceConfigurationWithHttpInfo().getBody();
    }

    /**
     * get tessell service start stop config
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Object&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Object> getStartStopServiceConfigurationWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/config/start-stop", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upsert Feature Config Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tessellFeatureConfig  (required)
     * @return TessellFeatureConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellFeatureConfig upsertFeatureConfigOps(TessellFeatureConfig tessellFeatureConfig) throws RestClientException {
        return upsertFeatureConfigOpsWithHttpInfo(tessellFeatureConfig).getBody();
    }

    /**
     * Upsert Feature Config Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tessellFeatureConfig  (required)
     * @return ResponseEntity&lt;TessellFeatureConfig&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellFeatureConfig> upsertFeatureConfigOpsWithHttpInfo(TessellFeatureConfig tessellFeatureConfig) throws RestClientException {
        Object postBody = tessellFeatureConfig;
        
        // verify the required parameter 'tessellFeatureConfig' is set
        if (tessellFeatureConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellFeatureConfig' when calling upsertFeatureConfigOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/feature-config", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellFeatureConfig> returnType = new ParameterizedTypeReference<TessellFeatureConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create or Update a new Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param globalEngineConfigDTO  (required)
     * @return GlobalEngineConfigDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GlobalEngineConfigDTO upsertGlobalEngineConfig(GlobalEngineConfigDTO globalEngineConfigDTO) throws RestClientException {
        return upsertGlobalEngineConfigWithHttpInfo(globalEngineConfigDTO).getBody();
    }

    /**
     * Create or Update a new Tessell Global Engine configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param globalEngineConfigDTO  (required)
     * @return ResponseEntity&lt;GlobalEngineConfigDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GlobalEngineConfigDTO> upsertGlobalEngineConfigWithHttpInfo(GlobalEngineConfigDTO globalEngineConfigDTO) throws RestClientException {
        Object postBody = globalEngineConfigDTO;
        
        // verify the required parameter 'globalEngineConfigDTO' is set
        if (globalEngineConfigDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'globalEngineConfigDTO' when calling upsertGlobalEngineConfig");
        }
        
        String path = apiClient.expandPath("/tessell-ops/config/global-engine", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GlobalEngineConfigDTO> returnType = new ParameterizedTypeReference<GlobalEngineConfigDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
