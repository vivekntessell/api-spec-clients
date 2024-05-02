package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.CreateSampleDatasetPayload;
import com.tessell.database.system.client.model.SampleDatasetOpsDTO;
import com.tessell.database.system.client.model.SampleDatasetOpsStatus;
import com.tessell.database.system.client.model.SampleDatasetsOpsResponse;
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
@Component("com.tessell.database.system.client.api.SampleDatasetApi")
public class SampleDatasetApi {
    private ApiClient apiClient;

    public SampleDatasetApi() {
        this(new ApiClient());
    }

    @Autowired
    public SampleDatasetApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create supported sample datasets.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSampleDatasetPayload  (required)
     * @return SampleDatasetOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SampleDatasetOpsDTO createSampleDatasetOps(CreateSampleDatasetPayload createSampleDatasetPayload) throws RestClientException {
        return createSampleDatasetOpsWithHttpInfo(createSampleDatasetPayload).getBody();
    }

    /**
     * Create supported sample datasets.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param createSampleDatasetPayload  (required)
     * @return ResponseEntity&lt;SampleDatasetOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SampleDatasetOpsDTO> createSampleDatasetOpsWithHttpInfo(CreateSampleDatasetPayload createSampleDatasetPayload) throws RestClientException {
        Object postBody = createSampleDatasetPayload;
        
        // verify the required parameter 'createSampleDatasetPayload' is set
        if (createSampleDatasetPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createSampleDatasetPayload' when calling createSampleDatasetOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/services/sample-datasets", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SampleDatasetOpsDTO> returnType = new ParameterizedTypeReference<SampleDatasetOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete sample dataset for given sample dataset id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteSampleDatasetOps(UUID sampleDatasetId) throws RestClientException {
        return deleteSampleDatasetOpsWithHttpInfo(sampleDatasetId).getBody();
    }

    /**
     * Delete sample dataset for given sample dataset id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteSampleDatasetOpsWithHttpInfo(UUID sampleDatasetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sampleDatasetId' is set
        if (sampleDatasetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sampleDatasetId' when calling deleteSampleDatasetOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sample-dataset-id", sampleDatasetId);
        String path = apiClient.expandPath("/tessell-ops/services/sample-datasets/{sample-dataset-id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get sample dataset for given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @return SampleDatasetsOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SampleDatasetsOpsResponse getSampleDatasetOps(UUID sampleDatasetId) throws RestClientException {
        return getSampleDatasetOpsWithHttpInfo(sampleDatasetId).getBody();
    }

    /**
     * Get sample dataset for given id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @return ResponseEntity&lt;SampleDatasetsOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SampleDatasetsOpsResponse> getSampleDatasetOpsWithHttpInfo(UUID sampleDatasetId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sampleDatasetId' is set
        if (sampleDatasetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sampleDatasetId' when calling getSampleDatasetOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sample-dataset-id", sampleDatasetId);
        String path = apiClient.expandPath("/tessell-ops/services/sample-datasets/{sample-dataset-id}", uriVariables);

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

    ParameterizedTypeReference<SampleDatasetsOpsResponse> returnType = new ParameterizedTypeReference<SampleDatasetsOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all sample datasets supported.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param statusList Status of the dataset to be returned. (optional)
     * @param name Name of the dataset (optional)
     * @return SampleDatasetsOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SampleDatasetsOpsResponse getSampleDatasetsOps(List<SampleDatasetOpsStatus> statusList, String name) throws RestClientException {
        return getSampleDatasetsOpsWithHttpInfo(statusList, name).getBody();
    }

    /**
     * Get list of all sample datasets supported.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param statusList Status of the dataset to be returned. (optional)
     * @param name Name of the dataset (optional)
     * @return ResponseEntity&lt;SampleDatasetsOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SampleDatasetsOpsResponse> getSampleDatasetsOpsWithHttpInfo(List<SampleDatasetOpsStatus> statusList, String name) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/services/sample-datasets", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statusList", statusList));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    ParameterizedTypeReference<SampleDatasetsOpsResponse> returnType = new ParameterizedTypeReference<SampleDatasetsOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update sample dataset for given sample dataset id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @param sampleDatasetOpsDTO  (required)
     * @return SampleDatasetOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SampleDatasetOpsDTO updateSampleDatasetOps(UUID sampleDatasetId, SampleDatasetOpsDTO sampleDatasetOpsDTO) throws RestClientException {
        return updateSampleDatasetOpsWithHttpInfo(sampleDatasetId, sampleDatasetOpsDTO).getBody();
    }

    /**
     * Update sample dataset for given sample dataset id.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param sampleDatasetId Id of the dataset (required)
     * @param sampleDatasetOpsDTO  (required)
     * @return ResponseEntity&lt;SampleDatasetOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SampleDatasetOpsDTO> updateSampleDatasetOpsWithHttpInfo(UUID sampleDatasetId, SampleDatasetOpsDTO sampleDatasetOpsDTO) throws RestClientException {
        Object postBody = sampleDatasetOpsDTO;
        
        // verify the required parameter 'sampleDatasetId' is set
        if (sampleDatasetId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sampleDatasetId' when calling updateSampleDatasetOps");
        }
        
        // verify the required parameter 'sampleDatasetOpsDTO' is set
        if (sampleDatasetOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sampleDatasetOpsDTO' when calling updateSampleDatasetOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("sample-dataset-id", sampleDatasetId);
        String path = apiClient.expandPath("/tessell-ops/services/sample-datasets/{sample-dataset-id}", uriVariables);

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

    ParameterizedTypeReference<SampleDatasetOpsDTO> returnType = new ParameterizedTypeReference<SampleDatasetOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
