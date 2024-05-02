package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorOpsDTO;
import com.tessell.gov.client.model.TessellAppFamilyApiResponseDTO;
import com.tessell.gov.client.model.TessellAppFamilyCreatePayloadDTO;
import com.tessell.gov.client.model.TessellAppFamilyDTO;
import com.tessell.gov.client.model.TessellAppFamilyUpdatePayloadDTO;
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
@Component("com.tessell.gov.client.api.TessellAppFamilyControllerApi")
public class TessellAppFamilyControllerApi {
    private ApiClient apiClient;

    public TessellAppFamilyControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellAppFamilyControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create an App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellAppFamilyCreatePayloadDTO  (optional)
     * @return TessellAppFamilyDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppFamilyDTO createAppFamily(TessellAppFamilyCreatePayloadDTO tessellAppFamilyCreatePayloadDTO) throws RestClientException {
        return createAppFamilyWithHttpInfo(tessellAppFamilyCreatePayloadDTO).getBody();
    }

    /**
     * Create an App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellAppFamilyCreatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAppFamilyDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppFamilyDTO> createAppFamilyWithHttpInfo(TessellAppFamilyCreatePayloadDTO tessellAppFamilyCreatePayloadDTO) throws RestClientException {
        Object postBody = tessellAppFamilyCreatePayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/apps-families", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAppFamilyDTO> returnType = new ParameterizedTypeReference<TessellAppFamilyDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional)
     * @return TessellGovernStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGovernStatusDTO deleteAppFamily(String name, Boolean softDelete) throws RestClientException {
        return deleteAppFamilyWithHttpInfo(name, softDelete).getBody();
    }

    /**
     * Delete App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param softDelete softDelete (optional)
     * @return ResponseEntity&lt;TessellGovernStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGovernStatusDTO> deleteAppFamilyWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteAppFamily");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/apps-families/{name}", uriVariables);

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
     * Get a list of App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadApps load-apps (optional, default to false)
     * @param loadFeatures load-features (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellAppFamilyApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppFamilyApiResponseDTO getAppsFamilies(String loadApps, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAppsFamiliesWithHttpInfo(loadApps, loadFeatures, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadApps load-apps (optional, default to false)
     * @param loadFeatures load-features (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellAppFamilyApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppFamilyApiResponseDTO> getAppsFamiliesWithHttpInfo(String loadApps, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/apps-families", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-apps", loadApps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-features", loadFeatures));
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

    ParameterizedTypeReference<TessellAppFamilyApiResponseDTO> returnType = new ParameterizedTypeReference<TessellAppFamilyApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellAppFamilyUpdatePayloadDTO  (optional)
     * @return TessellAppFamilyDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAppFamilyDTO updateAppFamily(String name, TessellAppFamilyUpdatePayloadDTO tessellAppFamilyUpdatePayloadDTO) throws RestClientException {
        return updateAppFamilyWithHttpInfo(name, tessellAppFamilyUpdatePayloadDTO).getBody();
    }

    /**
     * Update App Family
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param tessellAppFamilyUpdatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAppFamilyDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAppFamilyDTO> updateAppFamilyWithHttpInfo(String name, TessellAppFamilyUpdatePayloadDTO tessellAppFamilyUpdatePayloadDTO) throws RestClientException {
        Object postBody = tessellAppFamilyUpdatePayloadDTO;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateAppFamily");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/apps-families/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellAppFamilyDTO> returnType = new ParameterizedTypeReference<TessellAppFamilyDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
