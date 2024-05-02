# TessellMonitoringControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addEntityMonitoring**](TessellMonitoringControllerApi.md#addEntityMonitoring) | **POST** /tessell-ops/monitoring/entity | 
[**createMonitoringDeploymentOps**](TessellMonitoringControllerApi.md#createMonitoringDeploymentOps) | **POST** /tessell-ops/monitoring/deployments | 
[**createMonitoringInstanceOps**](TessellMonitoringControllerApi.md#createMonitoringInstanceOps) | **POST** /tessell-ops/monitoring/deployments/{deployment-id}/instances | 
[**getComputeResourcesMonitoringSummary**](TessellMonitoringControllerApi.md#getComputeResourcesMonitoringSummary) | **GET** /monitoring/compute-resources/summary | 
[**getContainerMonitoringMetricsOps**](TessellMonitoringControllerApi.md#getContainerMonitoringMetricsOps) | **GET** /tessell-ops/monitoring/infra/container-metrics | 
[**getContainerMonitoringSummaryMetricsOps**](TessellMonitoringControllerApi.md#getContainerMonitoringSummaryMetricsOps) | **GET** /tessell-ops/monitoring/infra/container-metrics/summary | 
[**getMonitoringDeployment**](TessellMonitoringControllerApi.md#getMonitoringDeployment) | **GET** /monitoring/deployments/{deployment-id} | 
[**getMonitoringDeploymentOps**](TessellMonitoringControllerApi.md#getMonitoringDeploymentOps) | **GET** /tessell-ops/monitoring/deployments/{deployment-id} | 
[**getMonitoringDeployments**](TessellMonitoringControllerApi.md#getMonitoringDeployments) | **GET** /monitoring/deployments | 
[**getMonitoringDeploymentsOps**](TessellMonitoringControllerApi.md#getMonitoringDeploymentsOps) | **GET** /tessell-ops/monitoring/deployments | 
[**getMonitoringInstanceOps**](TessellMonitoringControllerApi.md#getMonitoringInstanceOps) | **GET** /tessell-ops/monitoring/deployments/{deployment-id}/instances/{instance-id} | 
[**getMonitoringInstancesOps**](TessellMonitoringControllerApi.md#getMonitoringInstancesOps) | **GET** /tessell-ops/monitoring/deployments/{deployment-id}/instances | 
[**getMonitoringMetrics**](TessellMonitoringControllerApi.md#getMonitoringMetrics) | **GET** /monitoring/metrics | 
[**getMonitoringMetricsForOps**](TessellMonitoringControllerApi.md#getMonitoringMetricsForOps) | **GET** /tessell-ops/monitoring/metrics | 
[**patchMonitoringFeature**](TessellMonitoringControllerApi.md#patchMonitoringFeature) | **PATCH** /monitoring/service/{id}/features/{feature-name} | 
[**removeEntityMonitoring**](TessellMonitoringControllerApi.md#removeEntityMonitoring) | **DELETE** /tessell-ops/monitoring/entity | 
[**updateEntityMonitoring**](TessellMonitoringControllerApi.md#updateEntityMonitoring) | **PATCH** /tessell-ops/monitoring/entity | 
[**updateMonitoringDeploymentOps**](TessellMonitoringControllerApi.md#updateMonitoringDeploymentOps) | **PATCH** /tessell-ops/monitoring/deployments/{deployment-id} | 
[**updateMonitoringInstanceOps**](TessellMonitoringControllerApi.md#updateMonitoringInstanceOps) | **PATCH** /tessell-ops/monitoring/deployments/{deployment-id}/instances/{instance-id} | 



## addEntityMonitoring

> ApiStatus addEntityMonitoring(addEntityMonitoringPayload)



Add monitoring for entity.

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        AddEntityMonitoringPayload addEntityMonitoringPayload = new AddEntityMonitoringPayload(); // AddEntityMonitoringPayload | 
        try {
            ApiStatus result = apiInstance.addEntityMonitoring(addEntityMonitoringPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#addEntityMonitoring");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addEntityMonitoringPayload** | [**AddEntityMonitoringPayload**](AddEntityMonitoringPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Monitoring dashboard details |  -  |
| **0** | API error response |  -  |


## createMonitoringDeploymentOps

> MonitoringDeploymentOpsDTO createMonitoringDeploymentOps(monitoringDeploymentOpsDTO)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO = new MonitoringDeploymentOpsDTO(); // MonitoringDeploymentOpsDTO | 
        try {
            MonitoringDeploymentOpsDTO result = apiInstance.createMonitoringDeploymentOps(monitoringDeploymentOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#createMonitoringDeploymentOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitoringDeploymentOpsDTO** | [**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)|  |

### Return type

[**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created monitoring deployment |  -  |
| **0** | API error response |  -  |


## createMonitoringInstanceOps

> MonitoringInstanceOpsDTO createMonitoringInstanceOps(deploymentId, monitoringInstanceOpsDTO)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        MonitoringInstanceOpsDTO monitoringInstanceOpsDTO = new MonitoringInstanceOpsDTO(); // MonitoringInstanceOpsDTO | 
        try {
            MonitoringInstanceOpsDTO result = apiInstance.createMonitoringInstanceOps(deploymentId, monitoringInstanceOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#createMonitoringInstanceOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **monitoringInstanceOpsDTO** | [**MonitoringInstanceOpsDTO**](MonitoringInstanceOpsDTO.md)|  |

### Return type

[**MonitoringInstanceOpsDTO**](MonitoringInstanceOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The created monitoring instance |  -  |
| **0** | API error response |  -  |


## getComputeResourcesMonitoringSummary

> ComputeResourceMonitoringSummaryResponse getComputeResourcesMonitoringSummary(tenantId, computeResourceIds, timeDurationForAggregation, aggregationType)



View a list of available Compute Resources

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        List<UUID> computeResourceIds = Arrays.asList(); // List<UUID> | Array of Compute Resource Ids
        Integer timeDurationForAggregation = 5; // Integer | Time duration in minutes to aggregate the metrics, defaults to 5mins.
        AggregationType aggregationType = AggregationType.fromValue("AVG"); // AggregationType | Type of aggregation to be performed on the metric
        try {
            ComputeResourceMonitoringSummaryResponse result = apiInstance.getComputeResourcesMonitoringSummary(tenantId, computeResourceIds, timeDurationForAggregation, aggregationType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getComputeResourcesMonitoringSummary");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**UUID**](.md)| Tenant ID |
 **computeResourceIds** | [**List&lt;UUID&gt;**](UUID.md)| Array of Compute Resource Ids |
 **timeDurationForAggregation** | **Integer**| Time duration in minutes to aggregate the metrics, defaults to 5mins. | [optional] [default to 5]
 **aggregationType** | [**AggregationType**](.md)| Type of aggregation to be performed on the metric | [optional] [enum: AVG]

### Return type

[**ComputeResourceMonitoringSummaryResponse**](ComputeResourceMonitoringSummaryResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## getContainerMonitoringMetricsOps

> List&lt;TessellMonitoringChartDTO&gt; getContainerMonitoringMetricsOps(containerName, namespace, startTime, endTime, step)



Returns the metrics data of a K8s container

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        String containerName = "containerName_example"; // String | Name of the container for which metrics is required
        String namespace = "namespace_example"; // String | Name of the namespace in which container is present
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String step = "step_example"; // String | Specifies the frequency at which data points are sampled or aggregated within the specified time range
        try {
            List<TessellMonitoringChartDTO> result = apiInstance.getContainerMonitoringMetricsOps(containerName, namespace, startTime, endTime, step);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getContainerMonitoringMetricsOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **containerName** | **String**| Name of the container for which metrics is required |
 **namespace** | **String**| Name of the namespace in which container is present |
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **step** | **String**| Specifies the frequency at which data points are sampled or aggregated within the specified time range | [optional]

### Return type

[**List&lt;TessellMonitoringChartDTO&gt;**](TessellMonitoringChartDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of metrics |  -  |
| **0** | API error response |  -  |


## getContainerMonitoringSummaryMetricsOps

> List&lt;TessellMonitoringChartDTO&gt; getContainerMonitoringSummaryMetricsOps(namespace, startTime, endTime, step)



Returns the metrics data of all the containers in a namespace

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        String namespace = "namespace_example"; // String | Name of the namespace in which container is present
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String step = "step_example"; // String | Specifies the frequency at which data points are sampled or aggregated within the specified time range
        try {
            List<TessellMonitoringChartDTO> result = apiInstance.getContainerMonitoringSummaryMetricsOps(namespace, startTime, endTime, step);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getContainerMonitoringSummaryMetricsOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| Name of the namespace in which container is present |
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **step** | **String**| Specifies the frequency at which data points are sampled or aggregated within the specified time range | [optional]

### Return type

[**List&lt;TessellMonitoringChartDTO&gt;**](TessellMonitoringChartDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of metrics |  -  |
| **0** | API error response |  -  |


## getMonitoringDeployment

> MonitoringDeploymentOpsDTO getMonitoringDeployment(deploymentId, loadInstances)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        Boolean loadInstances = true; // Boolean | Boolean to indicate if instances to be fetched or not
        try {
            MonitoringDeploymentOpsDTO result = apiInstance.getMonitoringDeployment(deploymentId, loadInstances);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringDeployment");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **loadInstances** | **Boolean**| Boolean to indicate if instances to be fetched or not | [optional]

### Return type

[**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The monitoring deployment |  -  |
| **0** | API error response |  -  |


## getMonitoringDeploymentOps

> MonitoringDeploymentOpsDTO getMonitoringDeploymentOps(deploymentId, loadInstances)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        Boolean loadInstances = true; // Boolean | Boolean to indicate if instances to be fetched or not
        try {
            MonitoringDeploymentOpsDTO result = apiInstance.getMonitoringDeploymentOps(deploymentId, loadInstances);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringDeploymentOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **loadInstances** | **Boolean**| Boolean to indicate if instances to be fetched or not | [optional]

### Return type

[**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The monitoring deployment |  -  |
| **0** | API error response |  -  |


## getMonitoringDeployments

> MonitoringDeploymentsResponse getMonitoringDeployments(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        CloudType cloud = CloudType.fromValue("AWS"); // CloudType | Cloud Type, e.g AWS, AZURE, etc,.
        String region = "region_example"; // String | Region in the cloud, e.g ap-south-1
        UUID vpcId = new UUID(); // UUID | VPC ID
        UUID subscriptionId = new UUID(); // UUID | Subscription ID
        Boolean loadInstances = true; // Boolean | Boolean to indicate if instances to be fetched or not
        List<MonitoringDeploymentStatusOps> statuses = Arrays.asList(); // List<MonitoringDeploymentStatusOps> | 
        List<MonitoringDeploymentStatusOps> skipStatuses = Arrays.asList(); // List<MonitoringDeploymentStatusOps> | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            MonitoringDeploymentsResponse result = apiInstance.getMonitoringDeployments(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringDeployments");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**CloudType**](.md)| Cloud Type, e.g AWS, AZURE, etc,. | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Region in the cloud, e.g ap-south-1 | [optional]
 **vpcId** | [**UUID**](.md)| VPC ID | [optional]
 **subscriptionId** | [**UUID**](.md)| Subscription ID | [optional]
 **loadInstances** | **Boolean**| Boolean to indicate if instances to be fetched or not | [optional]
 **statuses** | [**List&lt;MonitoringDeploymentStatusOps&gt;**](MonitoringDeploymentStatusOps.md)|  | [optional]
 **skipStatuses** | [**List&lt;MonitoringDeploymentStatusOps&gt;**](MonitoringDeploymentStatusOps.md)|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**MonitoringDeploymentsResponse**](MonitoringDeploymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of monitoring deployments |  -  |
| **0** | API error response |  -  |


## getMonitoringDeploymentsOps

> MonitoringDeploymentsResponse getMonitoringDeploymentsOps(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        CloudType cloud = CloudType.fromValue("AWS"); // CloudType | Cloud Type, e.g AWS, AZURE, etc,.
        String region = "region_example"; // String | Region in the cloud, e.g ap-south-1
        UUID vpcId = new UUID(); // UUID | VPC ID
        UUID subscriptionId = new UUID(); // UUID | Subscription ID
        Boolean loadInstances = true; // Boolean | Boolean to indicate if instances to be fetched or not
        List<MonitoringDeploymentStatusOps> statuses = Arrays.asList(); // List<MonitoringDeploymentStatusOps> | 
        List<MonitoringDeploymentStatusOps> skipStatuses = Arrays.asList(); // List<MonitoringDeploymentStatusOps> | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            MonitoringDeploymentsResponse result = apiInstance.getMonitoringDeploymentsOps(cloud, region, vpcId, subscriptionId, loadInstances, statuses, skipStatuses, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringDeploymentsOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloud** | [**CloudType**](.md)| Cloud Type, e.g AWS, AZURE, etc,. | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Region in the cloud, e.g ap-south-1 | [optional]
 **vpcId** | [**UUID**](.md)| VPC ID | [optional]
 **subscriptionId** | [**UUID**](.md)| Subscription ID | [optional]
 **loadInstances** | **Boolean**| Boolean to indicate if instances to be fetched or not | [optional]
 **statuses** | [**List&lt;MonitoringDeploymentStatusOps&gt;**](MonitoringDeploymentStatusOps.md)|  | [optional]
 **skipStatuses** | [**List&lt;MonitoringDeploymentStatusOps&gt;**](MonitoringDeploymentStatusOps.md)|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**MonitoringDeploymentsResponse**](MonitoringDeploymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of monitoring deployments |  -  |
| **0** | API error response |  -  |


## getMonitoringInstanceOps

> MonitoringInstanceOpsDTO getMonitoringInstanceOps(deploymentId, instanceId)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        UUID instanceId = new UUID(); // UUID | 
        try {
            MonitoringInstanceOpsDTO result = apiInstance.getMonitoringInstanceOps(deploymentId, instanceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringInstanceOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **instanceId** | [**UUID**](.md)|  |

### Return type

[**MonitoringInstanceOpsDTO**](MonitoringInstanceOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The monitoring instance |  -  |
| **0** | API error response |  -  |


## getMonitoringInstancesOps

> MonitoringInstancesResponse getMonitoringInstancesOps(deploymentId, statuses, skipStatuses)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        List<MonitoringInstanceStatusOps> statuses = Arrays.asList(); // List<MonitoringInstanceStatusOps> | 
        List<MonitoringInstanceStatusOps> skipStatuses = Arrays.asList(); // List<MonitoringInstanceStatusOps> | 
        try {
            MonitoringInstancesResponse result = apiInstance.getMonitoringInstancesOps(deploymentId, statuses, skipStatuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringInstancesOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **statuses** | [**List&lt;MonitoringInstanceStatusOps&gt;**](MonitoringInstanceStatusOps.md)|  | [optional]
 **skipStatuses** | [**List&lt;MonitoringInstanceStatusOps&gt;**](MonitoringInstanceStatusOps.md)|  | [optional]

### Return type

[**MonitoringInstancesResponse**](MonitoringInstancesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of monitoring instances |  -  |
| **0** | API error response |  -  |


## getMonitoringMetrics

> List&lt;TessellMonitoringChartDTO&gt; getMonitoringMetrics(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step)



Returns the metrics data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        MonitoringEntityType entityType = MonitoringEntityType.fromValue("NODE"); // MonitoringEntityType | Monitoring entity type
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service. This parameter is required when entity-type is one of DB Engines
        UUID serviceInstanceId = new UUID(); // UUID | The ID of the service's instance. This parameter is required when entity-type is one of DB Engines
        UUID computeResourceId = new UUID(); // UUID | The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String step = "step_example"; // String | Specifies the frequency at which data points are sampled or aggregated within the specified time range
        try {
            List<TessellMonitoringChartDTO> result = apiInstance.getMonitoringMetrics(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringMetrics");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**UUID**](.md)| Tenant ID |
 **entityType** | [**MonitoringEntityType**](.md)| Monitoring entity type | [enum: NODE, DB, K8S_INFRA]
 **serviceId** | [**UUID**](.md)| The ID of the DB Service. This parameter is required when entity-type is one of DB Engines | [optional]
 **serviceInstanceId** | [**UUID**](.md)| The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines | [optional]
 **computeResourceId** | [**UUID**](.md)| The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE | [optional]
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **step** | **String**| Specifies the frequency at which data points are sampled or aggregated within the specified time range | [optional]

### Return type

[**List&lt;TessellMonitoringChartDTO&gt;**](TessellMonitoringChartDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of metrics |  -  |
| **0** | API error response |  -  |


## getMonitoringMetricsForOps

> List&lt;TessellMonitoringChartDTO&gt; getMonitoringMetricsForOps(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step)



Returns the metrics data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        MonitoringEntityType entityType = MonitoringEntityType.fromValue("NODE"); // MonitoringEntityType | Monitoring entity type
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service. This parameter is required when entity-type is one of DB Engines
        UUID serviceInstanceId = new UUID(); // UUID | The ID of the service's instance. This parameter is required when entity-type is one of DB Engines
        UUID computeResourceId = new UUID(); // UUID | The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String step = "step_example"; // String | Specifies the frequency at which data points are sampled or aggregated within the specified time range
        try {
            List<TessellMonitoringChartDTO> result = apiInstance.getMonitoringMetricsForOps(tenantId, entityType, serviceId, serviceInstanceId, computeResourceId, startTime, endTime, step);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#getMonitoringMetricsForOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenantId** | [**UUID**](.md)| Tenant ID |
 **entityType** | [**MonitoringEntityType**](.md)| Monitoring entity type | [enum: NODE, DB, K8S_INFRA]
 **serviceId** | [**UUID**](.md)| The ID of the DB Service. This parameter is required when entity-type is one of DB Engines | [optional]
 **serviceInstanceId** | [**UUID**](.md)| The ID of the service&#39;s instance. This parameter is required when entity-type is one of DB Engines | [optional]
 **computeResourceId** | [**UUID**](.md)| The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE | [optional]
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **step** | **String**| Specifies the frequency at which data points are sampled or aggregated within the specified time range | [optional]

### Return type

[**List&lt;TessellMonitoringChartDTO&gt;**](TessellMonitoringChartDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of metrics |  -  |
| **0** | API error response |  -  |


## patchMonitoringFeature

> ApiStatus patchMonitoringFeature(id, featureName, patchMonitoringFeaturePayload)



Patches (enable / disable) monitoring features on a specific service

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String featureName = "featureName_example"; // String | feature name
        PatchMonitoringFeaturePayload patchMonitoringFeaturePayload = new PatchMonitoringFeaturePayload(); // PatchMonitoringFeaturePayload | 
        try {
            ApiStatus result = apiInstance.patchMonitoringFeature(id, featureName, patchMonitoringFeaturePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#patchMonitoringFeature");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**UUID**](.md)| id |
 **featureName** | **String**| feature name | [enum: perf-insights]
 **patchMonitoringFeaturePayload** | [**PatchMonitoringFeaturePayload**](PatchMonitoringFeaturePayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## removeEntityMonitoring

> ApiStatus removeEntityMonitoring(removeEntityMonitoringPayload)



Remove entity monitoring.

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        RemoveEntityMonitoringPayload removeEntityMonitoringPayload = new RemoveEntityMonitoringPayload(); // RemoveEntityMonitoringPayload | 
        try {
            ApiStatus result = apiInstance.removeEntityMonitoring(removeEntityMonitoringPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#removeEntityMonitoring");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **removeEntityMonitoringPayload** | [**RemoveEntityMonitoringPayload**](RemoveEntityMonitoringPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Monitoring dashboard details |  -  |
| **0** | API error response |  -  |


## updateEntityMonitoring

> ApiStatus updateEntityMonitoring(addEntityMonitoringPayload)



Update monitoring entity.

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        AddEntityMonitoringPayload addEntityMonitoringPayload = new AddEntityMonitoringPayload(); // AddEntityMonitoringPayload | 
        try {
            ApiStatus result = apiInstance.updateEntityMonitoring(addEntityMonitoringPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#updateEntityMonitoring");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addEntityMonitoringPayload** | [**AddEntityMonitoringPayload**](AddEntityMonitoringPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Monitoring dashboard details |  -  |
| **0** | API error response |  -  |


## updateMonitoringDeploymentOps

> MonitoringDeploymentOpsDTO updateMonitoringDeploymentOps(deploymentId, monitoringDeploymentOpsDTO)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        MonitoringDeploymentOpsDTO monitoringDeploymentOpsDTO = new MonitoringDeploymentOpsDTO(); // MonitoringDeploymentOpsDTO | 
        try {
            MonitoringDeploymentOpsDTO result = apiInstance.updateMonitoringDeploymentOps(deploymentId, monitoringDeploymentOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#updateMonitoringDeploymentOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **monitoringDeploymentOpsDTO** | [**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)|  |

### Return type

[**MonitoringDeploymentOpsDTO**](MonitoringDeploymentOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated monitoring deployment |  -  |
| **0** | API error response |  -  |


## updateMonitoringInstanceOps

> MonitoringInstanceOpsDTO updateMonitoringInstanceOps(deploymentId, instanceId, monitoringInstanceOpsDTO)



Returns the monitoring service details data

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringControllerApi apiInstance = new TessellMonitoringControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        UUID instanceId = new UUID(); // UUID | 
        MonitoringInstanceOpsDTO monitoringInstanceOpsDTO = new MonitoringInstanceOpsDTO(); // MonitoringInstanceOpsDTO | 
        try {
            MonitoringInstanceOpsDTO result = apiInstance.updateMonitoringInstanceOps(deploymentId, instanceId, monitoringInstanceOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringControllerApi#updateMonitoringInstanceOps");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **deploymentId** | [**UUID**](.md)|  |
 **instanceId** | [**UUID**](.md)|  |
 **monitoringInstanceOpsDTO** | [**MonitoringInstanceOpsDTO**](MonitoringInstanceOpsDTO.md)|  |

### Return type

[**MonitoringInstanceOpsDTO**](MonitoringInstanceOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The updated monitoring instance |  -  |
| **0** | API error response |  -  |

