package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorDTO;
import com.tessell.gov.client.model.TessellApiErrorOpsDTO;
import com.tessell.gov.client.model.TessellGovernStatusDTO;
import com.tessell.gov.client.model.TessellServicePlanApiResponseDTO;
import com.tessell.gov.client.model.TessellServicePlanCreatePayloadDTO;
import com.tessell.gov.client.model.TessellServicePlanDTO;

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
@Component("com.tessell.gov.client.api.TessellServicePlanControllerApi")
public class TessellServicePlanControllerApi {
    private ApiClient apiClient;

    public TessellServicePlanControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellServicePlanControllerApi(ApiClient apiClient) {
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
     * @param tessellServicePlanCreatePayloadDTO  (optional)
     * @return TessellServicePlanDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServicePlanDTO createServicePlan(TessellServicePlanCreatePayloadDTO tessellServicePlanCreatePayloadDTO) throws RestClientException {
        return createServicePlanWithHttpInfo(tessellServicePlanCreatePayloadDTO).getBody();
    }

    /**
     * Create an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellServicePlanCreatePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellServicePlanDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServicePlanDTO> createServicePlanWithHttpInfo(TessellServicePlanCreatePayloadDTO tessellServicePlanCreatePayloadDTO) throws RestClientException {
        Object postBody = tessellServicePlanCreatePayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/service-plans", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellServicePlanDTO> returnType = new ParameterizedTypeReference<TessellServicePlanDTO>() {};
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
    public TessellGovernStatusDTO deleteServicePlan(String name, Boolean softDelete) throws RestClientException {
        return deleteServicePlanWithHttpInfo(name, softDelete).getBody();
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
    public ResponseEntity<TessellGovernStatusDTO> deleteServicePlanWithHttpInfo(String name, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteServicePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/service-plans/{name}", uriVariables);

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
     * @return TessellServicePlanDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServicePlanDTO getServicePlan(String name) throws RestClientException {
        return getServicePlanWithHttpInfo(name).getBody();
    }

    /**
     * Get details of an Tessell App
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @return ResponseEntity&lt;TessellServicePlanDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServicePlanDTO> getServicePlanWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getServicePlan");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/service-plans/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellServicePlanDTO> returnType = new ParameterizedTypeReference<TessellServicePlanDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Tessell Service Plans
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadApps load-apps (optional)
     * @param loadFeatures load-features (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellServicePlanApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellServicePlanApiResponseDTO getServicePlans(String loadApps, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getServicePlansWithHttpInfo(loadApps, loadFeatures, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Tessell Service Plans
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadApps load-apps (optional)
     * @param loadFeatures load-features (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellServicePlanApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellServicePlanApiResponseDTO> getServicePlansWithHttpInfo(String loadApps, String loadFeatures, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/service-plans", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellServicePlanApiResponseDTO> returnType = new ParameterizedTypeReference<TessellServicePlanApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
