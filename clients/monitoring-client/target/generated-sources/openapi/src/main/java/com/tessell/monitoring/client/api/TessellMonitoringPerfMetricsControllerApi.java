package com.tessell.monitoring.client.api;

import com.tessell.monitoring.client.invoker.ApiClient;

import com.tessell.monitoring.client.model.ApiError;
import com.tessell.monitoring.client.model.ApiErrorOps;
import com.tessell.monitoring.client.model.AvgDbLoadPayload;
import com.tessell.monitoring.client.model.AvgDbLoadResponse;
import com.tessell.monitoring.client.model.ExtendedPerfMetricsPayload;
import com.tessell.monitoring.client.model.ExtendedPerfMetricsResponse;
import com.tessell.monitoring.client.model.TopDimensionsPayload;
import com.tessell.monitoring.client.model.TopDimensionsResponse;
import com.tessell.monitoring.client.model.TopProcessesResponse;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@Component("com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi")
public class TessellMonitoringPerfMetricsControllerApi {
    private ApiClient apiClient;

    public TessellMonitoringPerfMetricsControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellMonitoringPerfMetricsControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Returns Average DB Load
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param avgDbLoadPayload  (optional)
     * @return AvgDbLoadResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvgDbLoadResponse getAvgDbLoad(AvgDbLoadPayload avgDbLoadPayload) throws RestClientException {
        return getAvgDbLoadWithHttpInfo(avgDbLoadPayload).getBody();
    }

    /**
     * 
     * Returns Average DB Load
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param avgDbLoadPayload  (optional)
     * @return ResponseEntity&lt;AvgDbLoadResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvgDbLoadResponse> getAvgDbLoadWithHttpInfo(AvgDbLoadPayload avgDbLoadPayload) throws RestClientException {
        Object postBody = avgDbLoadPayload;
        
        String path = apiClient.expandPath("/monitoring/metrics/avg-db-load", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<AvgDbLoadResponse> returnType = new ParameterizedTypeReference<AvgDbLoadResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns Extended Perf Insights Metrics for a given metric
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param extendedPerfMetricsPayload  (optional)
     * @return ExtendedPerfMetricsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ExtendedPerfMetricsResponse getExtendedPerfMetrics(ExtendedPerfMetricsPayload extendedPerfMetricsPayload) throws RestClientException {
        return getExtendedPerfMetricsWithHttpInfo(extendedPerfMetricsPayload).getBody();
    }

    /**
     * 
     * Returns Extended Perf Insights Metrics for a given metric
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param extendedPerfMetricsPayload  (optional)
     * @return ResponseEntity&lt;ExtendedPerfMetricsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ExtendedPerfMetricsResponse> getExtendedPerfMetricsWithHttpInfo(ExtendedPerfMetricsPayload extendedPerfMetricsPayload) throws RestClientException {
        Object postBody = extendedPerfMetricsPayload;
        
        String path = apiClient.expandPath("/monitoring/metrics/extended-perf-metrics", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ExtendedPerfMetricsResponse> returnType = new ParameterizedTypeReference<ExtendedPerfMetricsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns Top dimensions
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param topDimensionsPayload  (optional)
     * @return TopDimensionsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopDimensionsResponse getTopDimensions(TopDimensionsPayload topDimensionsPayload) throws RestClientException {
        return getTopDimensionsWithHttpInfo(topDimensionsPayload).getBody();
    }

    /**
     * 
     * Returns Top dimensions
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param topDimensionsPayload  (optional)
     * @return ResponseEntity&lt;TopDimensionsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopDimensionsResponse> getTopDimensionsWithHttpInfo(TopDimensionsPayload topDimensionsPayload) throws RestClientException {
        Object postBody = topDimensionsPayload;
        
        String path = apiClient.expandPath("/monitoring/metrics/top-dimensions", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TopDimensionsResponse> returnType = new ParameterizedTypeReference<TopDimensionsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns top processes running on the vm
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param numTopK Number of top entities (optional, default to 10)
     * @return TopProcessesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopProcessesResponse getTopProcesses(UUID tenantId, UUID computeResourceId, String startTime, String endTime, Integer numTopK) throws RestClientException {
        return getTopProcessesWithHttpInfo(tenantId, computeResourceId, startTime, endTime, numTopK).getBody();
    }

    /**
     * 
     * Returns top processes running on the vm
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param numTopK Number of top entities (optional, default to 10)
     * @return ResponseEntity&lt;TopProcessesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopProcessesResponse> getTopProcessesWithHttpInfo(UUID tenantId, UUID computeResourceId, String startTime, String endTime, Integer numTopK) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTopProcesses");
        }
        
        String path = apiClient.expandPath("/monitoring/metrics/top-processes", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-resource-id", computeResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "num-top-k", numTopK));

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

    ParameterizedTypeReference<TopProcessesResponse> returnType = new ParameterizedTypeReference<TopProcessesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns top processes running on the vm
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param numTopK Number of top entities (optional, default to 10)
     * @return TopProcessesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TopProcessesResponse getTopProcessesForOps(UUID tenantId, UUID computeResourceId, String startTime, String endTime, Integer numTopK) throws RestClientException {
        return getTopProcessesForOpsWithHttpInfo(tenantId, computeResourceId, startTime, endTime, numTopK).getBody();
    }

    /**
     * 
     * Returns top processes running on the vm
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param numTopK Number of top entities (optional, default to 10)
     * @return ResponseEntity&lt;TopProcessesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TopProcessesResponse> getTopProcessesForOpsWithHttpInfo(UUID tenantId, UUID computeResourceId, String startTime, String endTime, Integer numTopK) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTopProcessesForOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/metrics/top-processes", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-resource-id", computeResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "num-top-k", numTopK));

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

    ParameterizedTypeReference<TopProcessesResponse> returnType = new ParameterizedTypeReference<TopProcessesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
