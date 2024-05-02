package com.tessell.monitoring.client.api;

import com.tessell.monitoring.client.invoker.ApiClient;

import com.tessell.monitoring.client.model.AddEntityMonitoringPayload;
import com.tessell.monitoring.client.model.AggregationType;
import com.tessell.monitoring.client.model.ApiError;
import com.tessell.monitoring.client.model.ApiErrorOps;
import com.tessell.monitoring.client.model.ApiStatus;
import com.tessell.monitoring.client.model.CloudType;
import com.tessell.monitoring.client.model.ComputeResourceMonitoringSummaryResponse;
import com.tessell.monitoring.client.model.MonitoringDeploymentOpsDTO;
import com.tessell.monitoring.client.model.MonitoringDeploymentStatusOps;
import com.tessell.monitoring.client.model.MonitoringDeploymentsResponse;
import com.tessell.monitoring.client.model.MonitoringEntityType;
import com.tessell.monitoring.client.model.MonitoringInstanceOpsDTO;
import com.tessell.monitoring.client.model.MonitoringInstanceStatusOps;
import com.tessell.monitoring.client.model.MonitoringInstancesResponse;
import com.tessell.monitoring.client.model.PatchMonitoringFeaturePayload;
import com.tessell.monitoring.client.model.RemoveEntityMonitoringPayload;
import com.tessell.monitoring.client.model.TessellMonitoringChartDTO;
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
@Component("com.tessell.monitoring.client.api.TessellMonitoringControllerApi")
public class TessellMonitoringControllerApi {
    private ApiClient apiClient;

    public TessellMonitoringControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellMonitoringControllerApi(ApiClient apiClient) {
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
     * Add monitoring for entity.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param addEntityMonitoringPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus addEntityMonitoring(AddEntityMonitoringPayload addEntityMonitoringPayload) throws RestClientException {
        return addEntityMonitoringWithHttpInfo(addEntityMonitoringPayload).getBody();
    }

    /**
     * 
     * Add monitoring for entity.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param addEntityMonitoringPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> addEntityMonitoringWithHttpInfo(AddEntityMonitoringPayload addEntityMonitoringPayload) throws RestClientException {
        Object postBody = addEntityMonitoringPayload;
        
        // verify the required parameter 'addEntityMonitoringPayload' is set
        if (addEntityMonitoringPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addEntityMonitoringPayload' when calling addEntityMonitoring");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/entity", Collections.<String, Object>emptyMap());

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
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The created monitoring deployment
     * <p><b>0</b> - API error response
     * @param monitoringDeploymentOpsDTO  (required)
     * @return MonitoringDeploymentOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentOpsDTO createMonitoringDeploymentOps(MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO) throws RestClientException {
        return createMonitoringDeploymentOpsWithHttpInfo(monitoringDeploymentOpsDTO).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The created monitoring deployment
     * <p><b>0</b> - API error response
     * @param monitoringDeploymentOpsDTO  (required)
     * @return ResponseEntity&lt;MonitoringDeploymentOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentOpsDTO> createMonitoringDeploymentOpsWithHttpInfo(MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO) throws RestClientException {
        Object postBody = monitoringDeploymentOpsDTO;
        
        // verify the required parameter 'monitoringDeploymentOpsDTO' is set
        if (monitoringDeploymentOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'monitoringDeploymentOpsDTO' when calling createMonitoringDeploymentOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<MonitoringDeploymentOpsDTO> returnType = new ParameterizedTypeReference<MonitoringDeploymentOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The created monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param monitoringInstanceOpsDTO  (required)
     * @return MonitoringInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringInstanceOpsDTO createMonitoringInstanceOps(UUID deploymentId, MonitoringInstanceOpsDTO monitoringInstanceOpsDTO) throws RestClientException {
        return createMonitoringInstanceOpsWithHttpInfo(deploymentId, monitoringInstanceOpsDTO).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The created monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param monitoringInstanceOpsDTO  (required)
     * @return ResponseEntity&lt;MonitoringInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringInstanceOpsDTO> createMonitoringInstanceOpsWithHttpInfo(UUID deploymentId, MonitoringInstanceOpsDTO monitoringInstanceOpsDTO) throws RestClientException {
        Object postBody = monitoringInstanceOpsDTO;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling createMonitoringInstanceOps");
        }
        
        // verify the required parameter 'monitoringInstanceOpsDTO' is set
        if (monitoringInstanceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'monitoringInstanceOpsDTO' when calling createMonitoringInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}/instances", uriVariables);

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

    ParameterizedTypeReference<MonitoringInstanceOpsDTO> returnType = new ParameterizedTypeReference<MonitoringInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * View a list of available Compute Resources
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceIds Array of Compute Resource Ids (required)
     * @param timeDurationForAggregation Time duration in minutes to aggregate the metrics, defaults to 5mins. (optional, default to 5)
     * @param aggregationType Type of aggregation to be performed on the metric (optional)
     * @return ComputeResourceMonitoringSummaryResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ComputeResourceMonitoringSummaryResponse getComputeResourcesMonitoringSummary(UUID tenantId, List<UUID> computeResourceIds, Integer timeDurationForAggregation, AggregationType aggregationType) throws RestClientException {
        return getComputeResourcesMonitoringSummaryWithHttpInfo(tenantId, computeResourceIds, timeDurationForAggregation, aggregationType).getBody();
    }

    /**
     * 
     * View a list of available Compute Resources
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param computeResourceIds Array of Compute Resource Ids (required)
     * @param timeDurationForAggregation Time duration in minutes to aggregate the metrics, defaults to 5mins. (optional, default to 5)
     * @param aggregationType Type of aggregation to be performed on the metric (optional)
     * @return ResponseEntity&lt;ComputeResourceMonitoringSummaryResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ComputeResourceMonitoringSummaryResponse> getComputeResourcesMonitoringSummaryWithHttpInfo(UUID tenantId, List<UUID> computeResourceIds, Integer timeDurationForAggregation, AggregationType aggregationType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getComputeResourcesMonitoringSummary");
        }
        
        // verify the required parameter 'computeResourceIds' is set
        if (computeResourceIds == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'computeResourceIds' when calling getComputeResourcesMonitoringSummary");
        }
        
        String path = apiClient.expandPath("/monitoring/compute-resources/summary", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "compute-resource-ids", computeResourceIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-duration-for-aggregation", timeDurationForAggregation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "aggregation-type", aggregationType));

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

    ParameterizedTypeReference<ComputeResourceMonitoringSummaryResponse> returnType = new ParameterizedTypeReference<ComputeResourceMonitoringSummaryResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the metrics data of a K8s container
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param containerName Name of the container for which metrics is required (required)
     * @param namespace Name of the namespace in which container is present (required)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return List&lt;TessellMonitoringChartDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellMonitoringChartDTO> getContainerMonitoringMetricsOps(String containerName, String namespace, String startTime, String endTime, String step) throws RestClientException {
        return getContainerMonitoringMetricsOpsWithHttpInfo(containerName, namespace, startTime, endTime, step).getBody();
    }

    /**
     * 
     * Returns the metrics data of a K8s container
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param containerName Name of the container for which metrics is required (required)
     * @param namespace Name of the namespace in which container is present (required)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return ResponseEntity&lt;List&lt;TessellMonitoringChartDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellMonitoringChartDTO>> getContainerMonitoringMetricsOpsWithHttpInfo(String containerName, String namespace, String startTime, String endTime, String step) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'containerName' is set
        if (containerName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'containerName' when calling getContainerMonitoringMetricsOps");
        }
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespace' when calling getContainerMonitoringMetricsOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/infra/container-metrics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "container-name", containerName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "namespace", namespace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "step", step));

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

    ParameterizedTypeReference<List<TessellMonitoringChartDTO>> returnType = new ParameterizedTypeReference<List<TessellMonitoringChartDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the metrics data of all the containers in a namespace
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param namespace Name of the namespace in which container is present (required)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return List&lt;TessellMonitoringChartDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellMonitoringChartDTO> getContainerMonitoringSummaryMetricsOps(String namespace, String startTime, String endTime, String step) throws RestClientException {
        return getContainerMonitoringSummaryMetricsOpsWithHttpInfo(namespace, startTime, endTime, step).getBody();
    }

    /**
     * 
     * Returns the metrics data of all the containers in a namespace
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param namespace Name of the namespace in which container is present (required)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return ResponseEntity&lt;List&lt;TessellMonitoringChartDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellMonitoringChartDTO>> getContainerMonitoringSummaryMetricsOpsWithHttpInfo(String namespace, String startTime, String endTime, String step) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespace' when calling getContainerMonitoringSummaryMetricsOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/infra/container-metrics/summary", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "namespace", namespace));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "step", step));

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

    ParameterizedTypeReference<List<TessellMonitoringChartDTO>> returnType = new ParameterizedTypeReference<List<TessellMonitoringChartDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @return MonitoringDeploymentOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentOpsDTO getMonitoringDeployment(UUID deploymentId, Boolean loadInstances) throws RestClientException {
        return getMonitoringDeploymentWithHttpInfo(deploymentId, loadInstances).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @return ResponseEntity&lt;MonitoringDeploymentOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentOpsDTO> getMonitoringDeploymentWithHttpInfo(UUID deploymentId, Boolean loadInstances) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getMonitoringDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/monitoring/deployments/{deployment-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));

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

    ParameterizedTypeReference<MonitoringDeploymentOpsDTO> returnType = new ParameterizedTypeReference<MonitoringDeploymentOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @return MonitoringDeploymentOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentOpsDTO getMonitoringDeploymentOps(UUID deploymentId, Boolean loadInstances) throws RestClientException {
        return getMonitoringDeploymentOpsWithHttpInfo(deploymentId, loadInstances).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @return ResponseEntity&lt;MonitoringDeploymentOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentOpsDTO> getMonitoringDeploymentOpsWithHttpInfo(UUID deploymentId, Boolean loadInstances) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getMonitoringDeploymentOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));

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

    ParameterizedTypeReference<MonitoringDeploymentOpsDTO> returnType = new ParameterizedTypeReference<MonitoringDeploymentOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring deployments
     * <p><b>0</b> - API error response
     * @param cloud Cloud Type, e.g AWS, AZURE, etc,. (optional)
     * @param region Region in the cloud, e.g ap-south-1 (optional)
     * @param vpcId VPC ID (optional)
     * @param subscriptionId Subscription ID (optional)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return MonitoringDeploymentsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentsResponse getMonitoringDeployments(CloudType cloud, String region, UUID vpcId, UUID subscriptionId, Boolean loadInstances, List<MonitoringDeploymentStatusOps> statuses, List<MonitoringDeploymentStatusOps> skipStatuses, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getMonitoringDeploymentsWithHttpInfo(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring deployments
     * <p><b>0</b> - API error response
     * @param cloud Cloud Type, e.g AWS, AZURE, etc,. (optional)
     * @param region Region in the cloud, e.g ap-south-1 (optional)
     * @param vpcId VPC ID (optional)
     * @param subscriptionId Subscription ID (optional)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;MonitoringDeploymentsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentsResponse> getMonitoringDeploymentsWithHttpInfo(CloudType cloud, String region, UUID vpcId, UUID subscriptionId, Boolean loadInstances, List<MonitoringDeploymentStatusOps> statuses, List<MonitoringDeploymentStatusOps> skipStatuses, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/monitoring/deployments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vpc-id", vpcId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<MonitoringDeploymentsResponse> returnType = new ParameterizedTypeReference<MonitoringDeploymentsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring deployments
     * <p><b>0</b> - API error response
     * @param cloud Cloud Type, e.g AWS, AZURE, etc,. (optional)
     * @param region Region in the cloud, e.g ap-south-1 (optional)
     * @param vpcId VPC ID (optional)
     * @param subscriptionId Subscription ID (optional)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return MonitoringDeploymentsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentsResponse getMonitoringDeploymentsOps(CloudType cloud, String region, UUID vpcId, UUID subscriptionId, Boolean loadInstances, List<MonitoringDeploymentStatusOps> statuses, List<MonitoringDeploymentStatusOps> skipStatuses, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getMonitoringDeploymentsOpsWithHttpInfo(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring deployments
     * <p><b>0</b> - API error response
     * @param cloud Cloud Type, e.g AWS, AZURE, etc,. (optional)
     * @param region Region in the cloud, e.g ap-south-1 (optional)
     * @param vpcId VPC ID (optional)
     * @param subscriptionId Subscription ID (optional)
     * @param loadInstances Boolean to indicate if instances to be fetched or not (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;MonitoringDeploymentsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentsResponse> getMonitoringDeploymentsOpsWithHttpInfo(CloudType cloud, String region, UUID vpcId, UUID subscriptionId, Boolean loadInstances, List<MonitoringDeploymentStatusOps> statuses, List<MonitoringDeploymentStatusOps> skipStatuses, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud", cloud));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vpc-id", vpcId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-instances", loadInstances));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<MonitoringDeploymentsResponse> returnType = new ParameterizedTypeReference<MonitoringDeploymentsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param instanceId  (required)
     * @return MonitoringInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringInstanceOpsDTO getMonitoringInstanceOps(UUID deploymentId, UUID instanceId) throws RestClientException {
        return getMonitoringInstanceOpsWithHttpInfo(deploymentId, instanceId).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param instanceId  (required)
     * @return ResponseEntity&lt;MonitoringInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringInstanceOpsDTO> getMonitoringInstanceOpsWithHttpInfo(UUID deploymentId, UUID instanceId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getMonitoringInstanceOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling getMonitoringInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}/instances/{instance-id}", uriVariables);

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

    ParameterizedTypeReference<MonitoringInstanceOpsDTO> returnType = new ParameterizedTypeReference<MonitoringInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring instances
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @return MonitoringInstancesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringInstancesResponse getMonitoringInstancesOps(UUID deploymentId, List<MonitoringInstanceStatusOps> statuses, List<MonitoringInstanceStatusOps> skipStatuses) throws RestClientException {
        return getMonitoringInstancesOpsWithHttpInfo(deploymentId, statuses, skipStatuses).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The list of monitoring instances
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @return ResponseEntity&lt;MonitoringInstancesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringInstancesResponse> getMonitoringInstancesOpsWithHttpInfo(UUID deploymentId, List<MonitoringInstanceStatusOps> statuses, List<MonitoringInstanceStatusOps> skipStatuses) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getMonitoringInstancesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}/instances", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));

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

    ParameterizedTypeReference<MonitoringInstancesResponse> returnType = new ParameterizedTypeReference<MonitoringInstancesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the metrics data
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param entityType Monitoring entity type (required)
     * @param serviceId The ID of the DB Service. This parameter is required when entity-type is one of DB Engines (optional)
     * @param serviceInstanceId The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines (optional)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return List&lt;TessellMonitoringChartDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellMonitoringChartDTO> getMonitoringMetrics(UUID tenantId, MonitoringEntityType entityType, UUID serviceId, UUID serviceInstanceId, UUID computeResourceId, String startTime, String endTime, String step) throws RestClientException {
        return getMonitoringMetricsWithHttpInfo(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step).getBody();
    }

    /**
     * 
     * Returns the metrics data
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param entityType Monitoring entity type (required)
     * @param serviceId The ID of the DB Service. This parameter is required when entity-type is one of DB Engines (optional)
     * @param serviceInstanceId The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines (optional)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return ResponseEntity&lt;List&lt;TessellMonitoringChartDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellMonitoringChartDTO>> getMonitoringMetricsWithHttpInfo(UUID tenantId, MonitoringEntityType entityType, UUID serviceId, UUID serviceInstanceId, UUID computeResourceId, String startTime, String endTime, String step) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getMonitoringMetrics");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getMonitoringMetrics");
        }
        
        String path = apiClient.expandPath("/monitoring/metrics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-type", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-id", serviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-instance-id", serviceInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-resource-id", computeResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "step", step));

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

    ParameterizedTypeReference<List<TessellMonitoringChartDTO>> returnType = new ParameterizedTypeReference<List<TessellMonitoringChartDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the metrics data
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param entityType Monitoring entity type (required)
     * @param serviceId The ID of the DB Service. This parameter is required when entity-type is one of DB Engines (optional)
     * @param serviceInstanceId The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines (optional)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return List&lt;TessellMonitoringChartDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellMonitoringChartDTO> getMonitoringMetricsForOps(UUID tenantId, MonitoringEntityType entityType, UUID serviceId, UUID serviceInstanceId, UUID computeResourceId, String startTime, String endTime, String step) throws RestClientException {
        return getMonitoringMetricsForOpsWithHttpInfo(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step).getBody();
    }

    /**
     * 
     * Returns the metrics data
     * <p><b>200</b> - The list of metrics
     * <p><b>0</b> - API error response
     * @param tenantId Tenant ID (required)
     * @param entityType Monitoring entity type (required)
     * @param serviceId The ID of the DB Service. This parameter is required when entity-type is one of DB Engines (optional)
     * @param serviceInstanceId The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines (optional)
     * @param computeResourceId The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE (optional)
     * @param startTime Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param endTime End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; (optional)
     * @param step Specifies the frequency at which data points are sampled or aggregated within the specified time range (optional)
     * @return ResponseEntity&lt;List&lt;TessellMonitoringChartDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellMonitoringChartDTO>> getMonitoringMetricsForOpsWithHttpInfo(UUID tenantId, MonitoringEntityType entityType, UUID serviceId, UUID serviceInstanceId, UUID computeResourceId, String startTime, String endTime, String step) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getMonitoringMetricsForOps");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getMonitoringMetricsForOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/metrics", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-type", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-id", serviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-instance-id", serviceInstanceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-resource-id", computeResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-time", startTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-time", endTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "step", step));

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

    ParameterizedTypeReference<List<TessellMonitoringChartDTO>> returnType = new ParameterizedTypeReference<List<TessellMonitoringChartDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Patches (enable / disable) monitoring features on a specific service
     * <p><b>200</b> - OK
     * @param id id (required)
     * @param featureName feature name (required)
     * @param patchMonitoringFeaturePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus patchMonitoringFeature(UUID id, String featureName, PatchMonitoringFeaturePayload patchMonitoringFeaturePayload) throws RestClientException {
        return patchMonitoringFeatureWithHttpInfo(id, featureName, patchMonitoringFeaturePayload).getBody();
    }

    /**
     * 
     * Patches (enable / disable) monitoring features on a specific service
     * <p><b>200</b> - OK
     * @param id id (required)
     * @param featureName feature name (required)
     * @param patchMonitoringFeaturePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> patchMonitoringFeatureWithHttpInfo(UUID id, String featureName, PatchMonitoringFeaturePayload patchMonitoringFeaturePayload) throws RestClientException {
        Object postBody = patchMonitoringFeaturePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling patchMonitoringFeature");
        }
        
        // verify the required parameter 'featureName' is set
        if (featureName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'featureName' when calling patchMonitoringFeature");
        }
        
        // verify the required parameter 'patchMonitoringFeaturePayload' is set
        if (patchMonitoringFeaturePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'patchMonitoringFeaturePayload' when calling patchMonitoringFeature");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("feature-name", featureName);
        String path = apiClient.expandPath("/monitoring/service/{id}/features/{feature-name}", uriVariables);

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
     * 
     * Remove entity monitoring.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param removeEntityMonitoringPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus removeEntityMonitoring(RemoveEntityMonitoringPayload removeEntityMonitoringPayload) throws RestClientException {
        return removeEntityMonitoringWithHttpInfo(removeEntityMonitoringPayload).getBody();
    }

    /**
     * 
     * Remove entity monitoring.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param removeEntityMonitoringPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> removeEntityMonitoringWithHttpInfo(RemoveEntityMonitoringPayload removeEntityMonitoringPayload) throws RestClientException {
        Object postBody = removeEntityMonitoringPayload;
        
        // verify the required parameter 'removeEntityMonitoringPayload' is set
        if (removeEntityMonitoringPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'removeEntityMonitoringPayload' when calling removeEntityMonitoring");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/entity", Collections.<String, Object>emptyMap());

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
     * 
     * Update monitoring entity.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param addEntityMonitoringPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateEntityMonitoring(AddEntityMonitoringPayload addEntityMonitoringPayload) throws RestClientException {
        return updateEntityMonitoringWithHttpInfo(addEntityMonitoringPayload).getBody();
    }

    /**
     * 
     * Update monitoring entity.
     * <p><b>200</b> - Monitoring dashboard details
     * <p><b>0</b> - API error response
     * @param addEntityMonitoringPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateEntityMonitoringWithHttpInfo(AddEntityMonitoringPayload addEntityMonitoringPayload) throws RestClientException {
        Object postBody = addEntityMonitoringPayload;
        
        // verify the required parameter 'addEntityMonitoringPayload' is set
        if (addEntityMonitoringPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'addEntityMonitoringPayload' when calling updateEntityMonitoring");
        }
        
        String path = apiClient.expandPath("/tessell-ops/monitoring/entity", Collections.<String, Object>emptyMap());

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
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The updated monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param monitoringDeploymentOpsDTO  (required)
     * @return MonitoringDeploymentOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringDeploymentOpsDTO updateMonitoringDeploymentOps(UUID deploymentId, MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO) throws RestClientException {
        return updateMonitoringDeploymentOpsWithHttpInfo(deploymentId, monitoringDeploymentOpsDTO).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The updated monitoring deployment
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param monitoringDeploymentOpsDTO  (required)
     * @return ResponseEntity&lt;MonitoringDeploymentOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringDeploymentOpsDTO> updateMonitoringDeploymentOpsWithHttpInfo(UUID deploymentId, MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO) throws RestClientException {
        Object postBody = monitoringDeploymentOpsDTO;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling updateMonitoringDeploymentOps");
        }
        
        // verify the required parameter 'monitoringDeploymentOpsDTO' is set
        if (monitoringDeploymentOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'monitoringDeploymentOpsDTO' when calling updateMonitoringDeploymentOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}", uriVariables);

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

    ParameterizedTypeReference<MonitoringDeploymentOpsDTO> returnType = new ParameterizedTypeReference<MonitoringDeploymentOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The updated monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param instanceId  (required)
     * @param monitoringInstanceOpsDTO  (required)
     * @return MonitoringInstanceOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public MonitoringInstanceOpsDTO updateMonitoringInstanceOps(UUID deploymentId, UUID instanceId, MonitoringInstanceOpsDTO monitoringInstanceOpsDTO) throws RestClientException {
        return updateMonitoringInstanceOpsWithHttpInfo(deploymentId, instanceId, monitoringInstanceOpsDTO).getBody();
    }

    /**
     * 
     * Returns the monitoring service details data
     * <p><b>200</b> - The updated monitoring instance
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param instanceId  (required)
     * @param monitoringInstanceOpsDTO  (required)
     * @return ResponseEntity&lt;MonitoringInstanceOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<MonitoringInstanceOpsDTO> updateMonitoringInstanceOpsWithHttpInfo(UUID deploymentId, UUID instanceId, MonitoringInstanceOpsDTO monitoringInstanceOpsDTO) throws RestClientException {
        Object postBody = monitoringInstanceOpsDTO;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling updateMonitoringInstanceOps");
        }
        
        // verify the required parameter 'instanceId' is set
        if (instanceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'instanceId' when calling updateMonitoringInstanceOps");
        }
        
        // verify the required parameter 'monitoringInstanceOpsDTO' is set
        if (monitoringInstanceOpsDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'monitoringInstanceOpsDTO' when calling updateMonitoringInstanceOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deployment-id", deploymentId);
        uriVariables.put("instance-id", instanceId);
        String path = apiClient.expandPath("/tessell-ops/monitoring/deployments/{deployment-id}/instances/{instance-id}", uriVariables);

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

    ParameterizedTypeReference<MonitoringInstanceOpsDTO> returnType = new ParameterizedTypeReference<MonitoringInstanceOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
