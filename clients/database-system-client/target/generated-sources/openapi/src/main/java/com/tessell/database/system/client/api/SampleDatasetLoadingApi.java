package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.LoadSampleDatasetRequestPayload;
import com.tessell.database.system.client.model.ManageLoadSampleDatasetSuggestionPayload;
import com.tessell.database.system.client.model.SampleDatasetSuggestionsResponse;
import com.tessell.database.system.client.model.ServiceSampleDatasetInfoResponse;
import java.util.UUID;
import com.tessell.database.system.client.model.UpdateServiceSampleDatasetInfoPayload;

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
@Component("com.tessell.database.system.client.api.SampleDatasetLoadingApi")
public class SampleDatasetLoadingApi {
    private ApiClient apiClient;

    public SampleDatasetLoadingApi() {
        this(new ApiClient());
    }

    @Autowired
    public SampleDatasetLoadingApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get details about existing sample datasets being/already loaded in the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ServiceSampleDatasetInfoResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ServiceSampleDatasetInfoResponse getSampleDatasetLoadingInfo(UUID serviceId) throws RestClientException {
        return getSampleDatasetLoadingInfoWithHttpInfo(serviceId).getBody();
    }

    /**
     * Get details about existing sample datasets being/already loaded in the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ResponseEntity&lt;ServiceSampleDatasetInfoResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ServiceSampleDatasetInfoResponse> getSampleDatasetLoadingInfoWithHttpInfo(UUID serviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getSampleDatasetLoadingInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/sample-datasets", uriVariables);

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

    ParameterizedTypeReference<ServiceSampleDatasetInfoResponse> returnType = new ParameterizedTypeReference<ServiceSampleDatasetInfoResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns details about sample datasets that can be loaded in the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return SampleDatasetSuggestionsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SampleDatasetSuggestionsResponse getSampleDatasetSuggestions(UUID serviceId) throws RestClientException {
        return getSampleDatasetSuggestionsWithHttpInfo(serviceId).getBody();
    }

    /**
     * Returns details about sample datasets that can be loaded in the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @return ResponseEntity&lt;SampleDatasetSuggestionsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SampleDatasetSuggestionsResponse> getSampleDatasetSuggestionsWithHttpInfo(UUID serviceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getSampleDatasetSuggestions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/sample-datasets/suggestions", uriVariables);

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

    ParameterizedTypeReference<SampleDatasetSuggestionsResponse> returnType = new ParameterizedTypeReference<SampleDatasetSuggestionsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submits a request to load sample-dataset in given DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param loadSampleDatasetRequestPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus loadSampleDatasetRequest(UUID serviceId, LoadSampleDatasetRequestPayload loadSampleDatasetRequestPayload) throws RestClientException {
        return loadSampleDatasetRequestWithHttpInfo(serviceId, loadSampleDatasetRequestPayload).getBody();
    }

    /**
     * Submits a request to load sample-dataset in given DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param loadSampleDatasetRequestPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> loadSampleDatasetRequestWithHttpInfo(UUID serviceId, LoadSampleDatasetRequestPayload loadSampleDatasetRequestPayload) throws RestClientException {
        Object postBody = loadSampleDatasetRequestPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling loadSampleDatasetRequest");
        }
        
        // verify the required parameter 'loadSampleDatasetRequestPayload' is set
        if (loadSampleDatasetRequestPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'loadSampleDatasetRequestPayload' when calling loadSampleDatasetRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/sample-datasets", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Controls if the sample data loading suggestions should be shown for the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param manageLoadSampleDatasetSuggestionPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateSampleDatasetSuggestion(UUID serviceId, ManageLoadSampleDatasetSuggestionPayload manageLoadSampleDatasetSuggestionPayload) throws RestClientException {
        return updateSampleDatasetSuggestionWithHttpInfo(serviceId, manageLoadSampleDatasetSuggestionPayload).getBody();
    }

    /**
     * Controls if the sample data loading suggestions should be shown for the given DB Service
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param manageLoadSampleDatasetSuggestionPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateSampleDatasetSuggestionWithHttpInfo(UUID serviceId, ManageLoadSampleDatasetSuggestionPayload manageLoadSampleDatasetSuggestionPayload) throws RestClientException {
        Object postBody = manageLoadSampleDatasetSuggestionPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateSampleDatasetSuggestion");
        }
        
        // verify the required parameter 'manageLoadSampleDatasetSuggestionPayload' is set
        if (manageLoadSampleDatasetSuggestionPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'manageLoadSampleDatasetSuggestionPayload' when calling updateSampleDatasetSuggestion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/services/{serviceId}/sample-datasets/manage-suggestions", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update sample-dataset metadata for given service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param updateServiceSampleDatasetInfoPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateServiceSampleDatasetInfoOps(UUID serviceId, UpdateServiceSampleDatasetInfoPayload updateServiceSampleDatasetInfoPayload) throws RestClientException {
        return updateServiceSampleDatasetInfoOpsWithHttpInfo(serviceId, updateServiceSampleDatasetInfoPayload).getBody();
    }

    /**
     * Update sample-dataset metadata for given service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId The ID of the DB Service (required)
     * @param updateServiceSampleDatasetInfoPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateServiceSampleDatasetInfoOpsWithHttpInfo(UUID serviceId, UpdateServiceSampleDatasetInfoPayload updateServiceSampleDatasetInfoPayload) throws RestClientException {
        Object postBody = updateServiceSampleDatasetInfoPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateServiceSampleDatasetInfoOps");
        }
        
        // verify the required parameter 'updateServiceSampleDatasetInfoPayload' is set
        if (updateServiceSampleDatasetInfoPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateServiceSampleDatasetInfoPayload' when calling updateServiceSampleDatasetInfoOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("serviceId", serviceId);
        String path = apiClient.expandPath("/tessell-ops/services/{serviceId}/sample-datasets", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
