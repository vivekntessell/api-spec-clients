# MonitoringInfraControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMonitoringInfra**](MonitoringInfraControllerApi.md#deleteMonitoringInfra) | **DELETE** /monitoring/infra/{id} | 
[**provisionMonitoringInfra**](MonitoringInfraControllerApi.md#provisionMonitoringInfra) | **POST** /monitoring/infra | 



## deleteMonitoringInfra

> TaskSummary deleteMonitoringInfra(tenantId, id)



Deletes a monitoring infra

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.MonitoringInfraControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MonitoringInfraControllerApi apiInstance = new MonitoringInfraControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        UUID id = new UUID(); // UUID | The ID of the Monitoring infra
        try {
            TaskSummary result = apiInstance.deleteMonitoringInfra(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitoringInfraControllerApi#deleteMonitoringInfra");
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
 **id** | [**UUID**](.md)| The ID of the Monitoring infra |

### Return type

[**TaskSummary**](TaskSummary.md)

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


## provisionMonitoringInfra

> TaskSummary provisionMonitoringInfra(tenantId, provisionMonitoringInfraPayload)



Provisioning a monitoring infra

### Example

```java
// Import classes:
import com.tessell.monitoring.client.invoker.ApiClient;
import com.tessell.monitoring.client.invoker.ApiException;
import com.tessell.monitoring.client.invoker.Configuration;
import com.tessell.monitoring.client.invoker.models.*;
import com.tessell.monitoring.client.api.MonitoringInfraControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MonitoringInfraControllerApi apiInstance = new MonitoringInfraControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        ProvisionMonitoringInfraPayload provisionMonitoringInfraPayload = new ProvisionMonitoringInfraPayload(); // ProvisionMonitoringInfraPayload | 
        try {
            TaskSummary result = apiInstance.provisionMonitoringInfra(tenantId, provisionMonitoringInfraPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MonitoringInfraControllerApi#provisionMonitoringInfra");
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
 **provisionMonitoringInfraPayload** | [**ProvisionMonitoringInfraPayload**](ProvisionMonitoringInfraPayload.md)|  | [optional]

### Return type

[**TaskSummary**](TaskSummary.md)

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

