# TessellMonitoringPerfMetricsControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvgDbLoad**](TessellMonitoringPerfMetricsControllerApi.md#getAvgDbLoad) | **POST** /monitoring/metrics/avg-db-load | 
[**getExtendedPerfMetrics**](TessellMonitoringPerfMetricsControllerApi.md#getExtendedPerfMetrics) | **POST** /monitoring/metrics/extended-perf-metrics | 
[**getTopDimensions**](TessellMonitoringPerfMetricsControllerApi.md#getTopDimensions) | **POST** /monitoring/metrics/top-dimensions | 
[**getTopProcesses**](TessellMonitoringPerfMetricsControllerApi.md#getTopProcesses) | **GET** /monitoring/metrics/top-processes | 
[**getTopProcessesForOps**](TessellMonitoringPerfMetricsControllerApi.md#getTopProcessesForOps) | **GET** /tessell-ops/monitoring/metrics/top-processes | 



## getAvgDbLoad

> AvgDbLoadResponse getAvgDbLoad(avgDbLoadPayload)



Returns Average DB Load

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringPerfMetricsControllerApi apiInstance = new TessellMonitoringPerfMetricsControllerApi(defaultClient);
        AvgDbLoadPayload avgDbLoadPayload = new AvgDbLoadPayload(); // AvgDbLoadPayload | 
        try {
            AvgDbLoadResponse result = apiInstance.getAvgDbLoad(avgDbLoadPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringPerfMetricsControllerApi#getAvgDbLoad");
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
 **avgDbLoadPayload** | [**AvgDbLoadPayload**](AvgDbLoadPayload.md)|  | [optional]

### Return type

[**AvgDbLoadResponse**](AvgDbLoadResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## getExtendedPerfMetrics

> ExtendedPerfMetricsResponse getExtendedPerfMetrics(extendedPerfMetricsPayload)



Returns Extended Perf Insights Metrics for a given metric

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringPerfMetricsControllerApi apiInstance = new TessellMonitoringPerfMetricsControllerApi(defaultClient);
        ExtendedPerfMetricsPayload extendedPerfMetricsPayload = new ExtendedPerfMetricsPayload(); // ExtendedPerfMetricsPayload | 
        try {
            ExtendedPerfMetricsResponse result = apiInstance.getExtendedPerfMetrics(extendedPerfMetricsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringPerfMetricsControllerApi#getExtendedPerfMetrics");
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
 **extendedPerfMetricsPayload** | [**ExtendedPerfMetricsPayload**](ExtendedPerfMetricsPayload.md)|  | [optional]

### Return type

[**ExtendedPerfMetricsResponse**](ExtendedPerfMetricsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## getTopDimensions

> TopDimensionsResponse getTopDimensions(topDimensionsPayload)



Returns Top dimensions

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringPerfMetricsControllerApi apiInstance = new TessellMonitoringPerfMetricsControllerApi(defaultClient);
        TopDimensionsPayload topDimensionsPayload = new TopDimensionsPayload(); // TopDimensionsPayload | 
        try {
            TopDimensionsResponse result = apiInstance.getTopDimensions(topDimensionsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringPerfMetricsControllerApi#getTopDimensions");
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
 **topDimensionsPayload** | [**TopDimensionsPayload**](TopDimensionsPayload.md)|  | [optional]

### Return type

[**TopDimensionsResponse**](TopDimensionsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## getTopProcesses

> TopProcessesResponse getTopProcesses(tenantId, computeResourceId, startTime, endTime, numTopK)



Returns top processes running on the vm

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringPerfMetricsControllerApi apiInstance = new TessellMonitoringPerfMetricsControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        UUID computeResourceId = new UUID(); // UUID | The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        Integer numTopK = 10; // Integer | Number of top entities
        try {
            TopProcessesResponse result = apiInstance.getTopProcesses(tenantId, computeResourceId, startTime, endTime, numTopK);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringPerfMetricsControllerApi#getTopProcesses");
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
 **computeResourceId** | [**UUID**](.md)| The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE | [optional]
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **numTopK** | **Integer**| Number of top entities | [optional] [default to 10]

### Return type

[**TopProcessesResponse**](TopProcessesResponse.md)

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


## getTopProcessesForOps

> TopProcessesResponse getTopProcessesForOps(tenantId, computeResourceId, startTime, endTime, numTopK)



Returns top processes running on the vm

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.TessellMonitoringPerfMetricsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellMonitoringPerfMetricsControllerApi apiInstance = new TessellMonitoringPerfMetricsControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        UUID computeResourceId = new UUID(); // UUID | The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE
        String startTime = "startTime_example"; // String | Start timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        String endTime = "endTime_example"; // String | End timestamp in prometheus date-time format yyyy-MM-dd'T'HH:mm:ss.SSSSSSSSS'Z'
        Integer numTopK = 10; // Integer | Number of top entities
        try {
            TopProcessesResponse result = apiInstance.getTopProcessesForOps(tenantId, computeResourceId, startTime, endTime, numTopK);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellMonitoringPerfMetricsControllerApi#getTopProcessesForOps");
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
 **computeResourceId** | [**UUID**](.md)| The ID of the Compute Resource(NODE). This parameter is required when entity-type is NODE | [optional]
 **startTime** | **String**| Start timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **endTime** | **String**| End timestamp in prometheus date-time format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSSSSSSS&#39;Z&#39; | [optional]
 **numTopK** | **Integer**| Number of top entities | [optional] [default to 10]

### Return type

[**TopProcessesResponse**](TopProcessesResponse.md)

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

