# TessellServiceInstanceControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTessellServiceInstanceOps**](TessellServiceInstanceControllerApi.md#createTessellServiceInstanceOps) | **POST** /tessell-ops/services/{service-id}/service-instances | Create a DB Service Instance Object (ops)
[**deleteTessellServiceInstanceOps**](TessellServiceInstanceControllerApi.md#deleteTessellServiceInstanceOps) | **DELETE** /tessell-ops/services/{service-id}/service-instances/{instance-id} | Delete a DB Service Instance
[**deleteTessellServiceInstancesInternal**](TessellServiceInstanceControllerApi.md#deleteTessellServiceInstancesInternal) | **DELETE** /tessell-ops/services/{service-id}/service-instances/delete | Delete DB service Instances Internal Request
[**getAllServiceInstancesOps**](TessellServiceInstanceControllerApi.md#getAllServiceInstancesOps) | **GET** /tessell-ops/service-instances | View a list of available DB Services Instances
[**getTessellServiceInstance**](TessellServiceInstanceControllerApi.md#getTessellServiceInstance) | **GET** /services/{service-id}/service-instances/{id} | Get a DB Service instance by Id
[**getTessellServiceInstanceOps**](TessellServiceInstanceControllerApi.md#getTessellServiceInstanceOps) | **GET** /tessell-ops/services/{service-id}/service-instances/{instance-id} | Get a DB Service Instance By Id
[**getTessellServiceInstances**](TessellServiceInstanceControllerApi.md#getTessellServiceInstances) | **GET** /services/{id}/service-instances | View a list of available DB Service instances
[**getTessellServiceInstancesOps**](TessellServiceInstanceControllerApi.md#getTessellServiceInstancesOps) | **GET** /tessell-ops/services/{service-id}/service-instances | View a list of available DB Services Ops
[**updateTessellServiceInstanceAgentLcmInfoOps**](TessellServiceInstanceControllerApi.md#updateTessellServiceInstanceAgentLcmInfoOps) | **PATCH** /tessell-ops/services/{service-id}/service-instances/{instance-id}/agent-lcm | Update a DB Service Instance&#39;s Agent LCM Info
[**updateTessellServiceInstanceOps**](TessellServiceInstanceControllerApi.md#updateTessellServiceInstanceOps) | **PATCH** /tessell-ops/services/{service-id}/service-instances/{instance-id} | Update a DB Service Instance



## createTessellServiceInstanceOps

> TessellServiceInstanceOpsDTO createTessellServiceInstanceOps(serviceId, tessellServiceInstanceOpsDTO)

Create a DB Service Instance Object (ops)

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO = new TessellServiceInstanceOpsDTO(); // TessellServiceInstanceOpsDTO | 
        try {
            TessellServiceInstanceOpsDTO result = apiInstance.createTessellServiceInstanceOps(serviceId, tessellServiceInstanceOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#createTessellServiceInstanceOps");
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
 **serviceId** | [**UUID**](.md)| service-id |
 **tessellServiceInstanceOpsDTO** | [**TessellServiceInstanceOpsDTO**](TessellServiceInstanceOpsDTO.md)|  |

### Return type

[**TessellServiceInstanceOpsDTO**](TessellServiceInstanceOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteTessellServiceInstanceOps

> ApiStatus deleteTessellServiceInstanceOps(serviceId, instanceId, softDelete)

Delete a DB Service Instance

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | Id of the DB Service
        UUID instanceId = new UUID(); // UUID | Id of the DB Service Instance
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteTessellServiceInstanceOps(serviceId, instanceId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#deleteTessellServiceInstanceOps");
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
 **serviceId** | [**UUID**](.md)| Id of the DB Service |
 **instanceId** | [**UUID**](.md)| Id of the DB Service Instance |
 **softDelete** | **Boolean**| soft-delete | [optional] [default to true]

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## deleteTessellServiceInstancesInternal

> TaskSummary deleteTessellServiceInstancesInternal(serviceId, deleteTessellServiceInstancePayloadOps)

Delete DB service Instances Internal Request

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The id of the DB Service
        DeleteTessellServiceInstancePayloadOps deleteTessellServiceInstancePayloadOps = new DeleteTessellServiceInstancePayloadOps(); // DeleteTessellServiceInstancePayloadOps | 
        try {
            TaskSummary result = apiInstance.deleteTessellServiceInstancesInternal(serviceId, deleteTessellServiceInstancePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#deleteTessellServiceInstancesInternal");
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
 **serviceId** | [**UUID**](.md)| The id of the DB Service |
 **deleteTessellServiceInstancePayloadOps** | [**DeleteTessellServiceInstancePayloadOps**](DeleteTessellServiceInstancePayloadOps.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## getAllServiceInstancesOps

> TessellServiceInstancesOpsResponse getAllServiceInstancesOps(statuses, skipStatuses, parameterProfileIds, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone)

View a list of available DB Services Instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        List<TessellServiceInstanceStatusOps> statuses = Arrays.asList(); // List<TessellServiceInstanceStatusOps> | statuses
        List<TessellServiceInstanceStatusOps> skipStatuses = Arrays.asList(); // List<TessellServiceInstanceStatusOps> | skip-statuses
        List<UUID> parameterProfileIds = Arrays.asList(); // List<UUID> | parameterProfiles
        Boolean loadComputeResources = false; // Boolean | load-compute-resources
        Boolean consumableInstancesOnly = false; // Boolean | consumable-instances-only
        Boolean nonConsumableInstancesOnly = false; // Boolean | non-consumable-instances-only
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceInstancesOpsResponse result = apiInstance.getAllServiceInstancesOps(statuses, skipStatuses, parameterProfileIds, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#getAllServiceInstancesOps");
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
 **statuses** | [**List&lt;TessellServiceInstanceStatusOps&gt;**](TessellServiceInstanceStatusOps.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;TessellServiceInstanceStatusOps&gt;**](TessellServiceInstanceStatusOps.md)| skip-statuses | [optional]
 **parameterProfileIds** | [**List&lt;UUID&gt;**](UUID.md)| parameterProfiles | [optional]
 **loadComputeResources** | **Boolean**| load-compute-resources | [optional] [default to false]
 **consumableInstancesOnly** | **Boolean**| consumable-instances-only | [optional] [default to false]
 **nonConsumableInstancesOnly** | **Boolean**| non-consumable-instances-only | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceInstancesOpsResponse**](TessellServiceInstancesOpsResponse.md)

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


## getTessellServiceInstance

> TessellServiceInstanceDTO getTessellServiceInstance(serviceId, id, timeZone)

Get a DB Service instance by Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID id = new UUID(); // UUID | Id of entity
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceInstanceDTO result = apiInstance.getTessellServiceInstance(serviceId, id, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#getTessellServiceInstance");
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
 **serviceId** | [**UUID**](.md)|  |
 **id** | [**UUID**](.md)| Id of entity |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceInstanceDTO**](TessellServiceInstanceDTO.md)

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


## getTessellServiceInstanceOps

> TessellServiceInstanceOpsDTO getTessellServiceInstanceOps(serviceId, instanceId, loadComputeResources, timeZone)

Get a DB Service Instance By Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | Id of the DB Service
        UUID instanceId = new UUID(); // UUID | Id of the DB Service Instance
        Boolean loadComputeResources = false; // Boolean | load-compute-resources
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceInstanceOpsDTO result = apiInstance.getTessellServiceInstanceOps(serviceId, instanceId, loadComputeResources, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#getTessellServiceInstanceOps");
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
 **serviceId** | [**UUID**](.md)| Id of the DB Service |
 **instanceId** | [**UUID**](.md)| Id of the DB Service Instance |
 **loadComputeResources** | **Boolean**| load-compute-resources | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceInstanceOpsDTO**](TessellServiceInstanceOpsDTO.md)

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


## getTessellServiceInstances

> TessellServiceInstancesResponse getTessellServiceInstances(id, instanceGroupId, pageSize, pageOffset, timeZone)

View a list of available DB Service instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | service id
        UUID instanceGroupId = new UUID(); // UUID | Filter all instances belonging to specified instance-group-id
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceInstancesResponse result = apiInstance.getTessellServiceInstances(id, instanceGroupId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#getTessellServiceInstances");
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
 **id** | [**UUID**](.md)| service id |
 **instanceGroupId** | [**UUID**](.md)| Filter all instances belonging to specified instance-group-id | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceInstancesResponse**](TessellServiceInstancesResponse.md)

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


## getTessellServiceInstancesOps

> TessellServiceInstancesOpsResponse getTessellServiceInstancesOps(serviceId, name, statuses, skipStatuses, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone)

View a list of available DB Services Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        String name = "name_example"; // String | name
        List<TessellServiceInstanceStatusOps> statuses = Arrays.asList(); // List<TessellServiceInstanceStatusOps> | statuses
        List<TessellServiceInstanceStatusOps> skipStatuses = Arrays.asList(); // List<TessellServiceInstanceStatusOps> | skip-statuses
        Boolean loadComputeResources = false; // Boolean | load-compute-resources
        Boolean consumableInstancesOnly = false; // Boolean | consumable-instances-only
        Boolean nonConsumableInstancesOnly = false; // Boolean | non-consumable-instances-only
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceInstancesOpsResponse result = apiInstance.getTessellServiceInstancesOps(serviceId, name, statuses, skipStatuses, loadComputeResources, consumableInstancesOnly, nonConsumableInstancesOnly, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#getTessellServiceInstancesOps");
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
 **serviceId** | [**UUID**](.md)| service-id |
 **name** | **String**| name | [optional]
 **statuses** | [**List&lt;TessellServiceInstanceStatusOps&gt;**](TessellServiceInstanceStatusOps.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;TessellServiceInstanceStatusOps&gt;**](TessellServiceInstanceStatusOps.md)| skip-statuses | [optional]
 **loadComputeResources** | **Boolean**| load-compute-resources | [optional] [default to false]
 **consumableInstancesOnly** | **Boolean**| consumable-instances-only | [optional] [default to false]
 **nonConsumableInstancesOnly** | **Boolean**| non-consumable-instances-only | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceInstancesOpsResponse**](TessellServiceInstancesOpsResponse.md)

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


## updateTessellServiceInstanceAgentLcmInfoOps

> TessellAgentLcmInfo updateTessellServiceInstanceAgentLcmInfoOps(serviceId, instanceId, tessellAgentLcmInfo)

Update a DB Service Instance&#39;s Agent LCM Info

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID instanceId = new UUID(); // UUID | instance-id
        TessellAgentLcmInfo tessellAgentLcmInfo = new TessellAgentLcmInfo(); // TessellAgentLcmInfo | 
        try {
            TessellAgentLcmInfo result = apiInstance.updateTessellServiceInstanceAgentLcmInfoOps(serviceId, instanceId, tessellAgentLcmInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#updateTessellServiceInstanceAgentLcmInfoOps");
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
 **serviceId** | [**UUID**](.md)| service-id |
 **instanceId** | [**UUID**](.md)| instance-id |
 **tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)|  |

### Return type

[**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## updateTessellServiceInstanceOps

> TessellServiceInstanceOpsDTO updateTessellServiceInstanceOps(serviceId, instanceId, tessellServiceInstanceOpsDTO, callingFromHealthMonitor)

Update a DB Service Instance

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceInstanceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceInstanceControllerApi apiInstance = new TessellServiceInstanceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | Id of the DB Service
        UUID instanceId = new UUID(); // UUID | Id of the DB Service Instance
        TessellServiceInstanceOpsDTO tessellServiceInstanceOpsDTO = new TessellServiceInstanceOpsDTO(); // TessellServiceInstanceOpsDTO | 
        Boolean callingFromHealthMonitor = false; // Boolean | calling-from-health-monitor
        try {
            TessellServiceInstanceOpsDTO result = apiInstance.updateTessellServiceInstanceOps(serviceId, instanceId, tessellServiceInstanceOpsDTO, callingFromHealthMonitor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceInstanceControllerApi#updateTessellServiceInstanceOps");
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
 **serviceId** | [**UUID**](.md)| Id of the DB Service |
 **instanceId** | [**UUID**](.md)| Id of the DB Service Instance |
 **tessellServiceInstanceOpsDTO** | [**TessellServiceInstanceOpsDTO**](TessellServiceInstanceOpsDTO.md)|  |
 **callingFromHealthMonitor** | **Boolean**| calling-from-health-monitor | [optional] [default to false]

### Return type

[**TessellServiceInstanceOpsDTO**](TessellServiceInstanceOpsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **0** | API error response |  -  |

