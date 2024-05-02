# MaintenanceWindowApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyMaintenanceWindowTasks**](MaintenanceWindowApi.md#applyMaintenanceWindowTasks) | **POST** /maintenance-windows/{id}/tasks | Apply Maintenance Window Task
[**cancelMaintenanceWindowTask**](MaintenanceWindowApi.md#cancelMaintenanceWindowTask) | **DELETE** /maintenance-windows/{id}/tasks | Remove task from existing maintenance window
[**getMaintenanceWindowById**](MaintenanceWindowApi.md#getMaintenanceWindowById) | **GET** /maintenance-windows/{id} | Get maintenance window by Id
[**getMaintenanceWindowOpsById**](MaintenanceWindowApi.md#getMaintenanceWindowOpsById) | **GET** /tessell-ops/maintenance-windows/{id} | Get maintenance window by Id
[**getMaintenanceWindowsForService**](MaintenanceWindowApi.md#getMaintenanceWindowsForService) | **GET** /services/{id}/maintenance-windows | Get maintenance windows for given service
[**getMaintenanceWindowsOps**](MaintenanceWindowApi.md#getMaintenanceWindowsOps) | **GET** /tessell-ops/maintenance-windows | Get maintenance windows
[**scheduleMaintenanceWindowForService**](MaintenanceWindowApi.md#scheduleMaintenanceWindowForService) | **POST** /tessell-ops/services/{id}/maintenance-windows | Schedule Maintenance Window for Service
[**triggerMaintenanceWindow**](MaintenanceWindowApi.md#triggerMaintenanceWindow) | **POST** /maintenance-windows/{id} | Trigger maintenance window
[**triggerMaintenanceWindowCallback**](MaintenanceWindowApi.md#triggerMaintenanceWindowCallback) | **POST** /tessell-ops/maintenance-windows/{id}/callback | Process response for Maintenance Window workflow
[**triggerMaintenanceWindowOps**](MaintenanceWindowApi.md#triggerMaintenanceWindowOps) | **POST** /tessell-ops/maintenance-windows | Trigger maintenance window
[**updateMaintenanceWindow**](MaintenanceWindowApi.md#updateMaintenanceWindow) | **PATCH** /maintenance-windows/{id} | Update maintenance window
[**updateMaintenanceWindowForService**](MaintenanceWindowApi.md#updateMaintenanceWindowForService) | **PATCH** /services/{id}/maintenance-windows | Update maintenance window config for given service
[**updateMaintenanceWindowOps**](MaintenanceWindowApi.md#updateMaintenanceWindowOps) | **PATCH** /tessell-ops/maintenance-windows/{id} | Update maintenance window
[**updateTaskOps**](MaintenanceWindowApi.md#updateTaskOps) | **PATCH** /tessell-ops/maintenance-windows/{id}/tasks | Update maintenance window task



## applyMaintenanceWindowTasks

> TaskResponse applyMaintenanceWindowTasks(id, maintenanceWindowTaskApplyRequest)

Apply Maintenance Window Task

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        MaintenanceWindowTaskApplyRequest maintenanceWindowTaskApplyRequest = new MaintenanceWindowTaskApplyRequest(); // MaintenanceWindowTaskApplyRequest | 
        try {
            TaskResponse result = apiInstance.applyMaintenanceWindowTasks(id, maintenanceWindowTaskApplyRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#applyMaintenanceWindowTasks");
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
 **id** | [**UUID**](.md)| Id of entity |
 **maintenanceWindowTaskApplyRequest** | [**MaintenanceWindowTaskApplyRequest**](MaintenanceWindowTaskApplyRequest.md)|  |

### Return type

[**TaskResponse**](TaskResponse.md)

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


## cancelMaintenanceWindowTask

> ApiStatus cancelMaintenanceWindowTask(id, maintenanceWindowTaskCancelRequest)

Remove task from existing maintenance window

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        MaintenanceWindowTaskCancelRequest maintenanceWindowTaskCancelRequest = new MaintenanceWindowTaskCancelRequest(); // MaintenanceWindowTaskCancelRequest | 
        try {
            ApiStatus result = apiInstance.cancelMaintenanceWindowTask(id, maintenanceWindowTaskCancelRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#cancelMaintenanceWindowTask");
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
 **id** | [**UUID**](.md)| Id of entity |
 **maintenanceWindowTaskCancelRequest** | [**MaintenanceWindowTaskCancelRequest**](MaintenanceWindowTaskCancelRequest.md)|  |

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
| **0** | API error response |  -  |


## getMaintenanceWindowById

> MaintenanceWindowDTO getMaintenanceWindowById(id)

Get maintenance window by Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        try {
            MaintenanceWindowDTO result = apiInstance.getMaintenanceWindowById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowById");
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
 **id** | [**UUID**](.md)| Id of entity |

### Return type

[**MaintenanceWindowDTO**](MaintenanceWindowDTO.md)

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


## getMaintenanceWindowOpsById

> MaintenanceWindowOpsDTO getMaintenanceWindowOpsById(id)

Get maintenance window by Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        try {
            MaintenanceWindowOpsDTO result = apiInstance.getMaintenanceWindowOpsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowOpsById");
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
 **id** | [**UUID**](.md)| Id of entity |

### Return type

[**MaintenanceWindowOpsDTO**](MaintenanceWindowOpsDTO.md)

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


## getMaintenanceWindowsForService

> MaintenanceWindowListResponse getMaintenanceWindowsForService(id, statuses, loadTasks, pageSize, pageOffset, timeZone)

Get maintenance windows for given service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        List<MaintenanceWindowStatus> statuses = Arrays.asList(); // List<MaintenanceWindowStatus> | 
        Boolean loadTasks = false; // Boolean | Load the tasks that are part of the Maintenance Windows
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            MaintenanceWindowListResponse result = apiInstance.getMaintenanceWindowsForService(id, statuses, loadTasks, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowsForService");
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
 **id** | [**UUID**](.md)| Id of entity |
 **statuses** | [**List&lt;MaintenanceWindowStatus&gt;**](MaintenanceWindowStatus.md)|  | [optional]
 **loadTasks** | **Boolean**| Load the tasks that are part of the Maintenance Windows | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**MaintenanceWindowListResponse**](MaintenanceWindowListResponse.md)

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


## getMaintenanceWindowsOps

> MaintenanceWindowOpsListResponse getMaintenanceWindowsOps(entityId, statuses, type, loadTasks, pageSize, pageOffset, timeZone)

Get maintenance windows

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID entityId = new UUID(); // UUID | Load the Maintenance Window for particular entity
        List<MaintenanceWindowStatus> statuses = Arrays.asList(); // List<MaintenanceWindowStatus> | 
        MaintenanceWindowType type = MaintenanceWindowType.fromValue("SYSTEM"); // MaintenanceWindowType | Load the Maintenance Window of particular type
        Boolean loadTasks = false; // Boolean | Load the tasks that are part of the Maintenance Windows
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            MaintenanceWindowOpsListResponse result = apiInstance.getMaintenanceWindowsOps(entityId, statuses, type, loadTasks, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#getMaintenanceWindowsOps");
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
 **entityId** | [**UUID**](.md)| Load the Maintenance Window for particular entity | [optional]
 **statuses** | [**List&lt;MaintenanceWindowStatus&gt;**](MaintenanceWindowStatus.md)|  | [optional]
 **type** | [**MaintenanceWindowType**](.md)| Load the Maintenance Window of particular type | [optional] [enum: SYSTEM, CUSTOM]
 **loadTasks** | **Boolean**| Load the tasks that are part of the Maintenance Windows | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**MaintenanceWindowOpsListResponse**](MaintenanceWindowOpsListResponse.md)

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


## scheduleMaintenanceWindowForService

> MaintenanceWindowOpsDTO scheduleMaintenanceWindowForService(id, body)

Schedule Maintenance Window for Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        Object body = null; // Object | 
        try {
            MaintenanceWindowOpsDTO result = apiInstance.scheduleMaintenanceWindowForService(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#scheduleMaintenanceWindowForService");
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
 **id** | [**UUID**](.md)| Id of entity |
 **body** | **Object**|  |

### Return type

[**MaintenanceWindowOpsDTO**](MaintenanceWindowOpsDTO.md)

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


## triggerMaintenanceWindow

> MaintenanceWindowDTO triggerMaintenanceWindow(id, body)

Trigger maintenance window

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        Object body = null; // Object | 
        try {
            MaintenanceWindowDTO result = apiInstance.triggerMaintenanceWindow(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#triggerMaintenanceWindow");
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
 **id** | [**UUID**](.md)| Id of entity |
 **body** | **Object**|  |

### Return type

[**MaintenanceWindowDTO**](MaintenanceWindowDTO.md)

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


## triggerMaintenanceWindowCallback

> ApiStatus triggerMaintenanceWindowCallback(id, triggerMaintenanceWindowCallbackPayload)

Process response for Maintenance Window workflow

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        TriggerMaintenanceWindowCallbackPayload triggerMaintenanceWindowCallbackPayload = new TriggerMaintenanceWindowCallbackPayload(); // TriggerMaintenanceWindowCallbackPayload | 
        try {
            ApiStatus result = apiInstance.triggerMaintenanceWindowCallback(id, triggerMaintenanceWindowCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#triggerMaintenanceWindowCallback");
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
 **id** | [**UUID**](.md)| Id of entity |
 **triggerMaintenanceWindowCallbackPayload** | [**TriggerMaintenanceWindowCallbackPayload**](TriggerMaintenanceWindowCallbackPayload.md)|  |

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
| **0** | API error response |  -  |


## triggerMaintenanceWindowOps

> List&lt;MaintenanceWindowOpsDTO&gt; triggerMaintenanceWindowOps(maintenanceWindowTriggerRequest)

Trigger maintenance window

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        MaintenanceWindowTriggerRequest maintenanceWindowTriggerRequest = new MaintenanceWindowTriggerRequest(); // MaintenanceWindowTriggerRequest | 
        try {
            List<MaintenanceWindowOpsDTO> result = apiInstance.triggerMaintenanceWindowOps(maintenanceWindowTriggerRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#triggerMaintenanceWindowOps");
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
 **maintenanceWindowTriggerRequest** | [**MaintenanceWindowTriggerRequest**](MaintenanceWindowTriggerRequest.md)|  |

### Return type

[**List&lt;MaintenanceWindowOpsDTO&gt;**](MaintenanceWindowOpsDTO.md)

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


## updateMaintenanceWindow

> MaintenanceWindowDTO updateMaintenanceWindow(id, maintenanceWindowUpdateRequest)

Update maintenance window

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        MaintenanceWindowUpdateRequest maintenanceWindowUpdateRequest = new MaintenanceWindowUpdateRequest(); // MaintenanceWindowUpdateRequest | 
        try {
            MaintenanceWindowDTO result = apiInstance.updateMaintenanceWindow(id, maintenanceWindowUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#updateMaintenanceWindow");
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
 **id** | [**UUID**](.md)| Id of entity |
 **maintenanceWindowUpdateRequest** | [**MaintenanceWindowUpdateRequest**](MaintenanceWindowUpdateRequest.md)|  |

### Return type

[**MaintenanceWindowDTO**](MaintenanceWindowDTO.md)

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


## updateMaintenanceWindowForService

> TessellServiceMaintenanceWindow updateMaintenanceWindowForService(id, tessellServiceMaintenanceWindow)

Update maintenance window config for given service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        TessellServiceMaintenanceWindow tessellServiceMaintenanceWindow = new TessellServiceMaintenanceWindow(); // TessellServiceMaintenanceWindow | 
        try {
            TessellServiceMaintenanceWindow result = apiInstance.updateMaintenanceWindowForService(id, tessellServiceMaintenanceWindow);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#updateMaintenanceWindowForService");
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
 **id** | [**UUID**](.md)| Id of entity |
 **tessellServiceMaintenanceWindow** | [**TessellServiceMaintenanceWindow**](TessellServiceMaintenanceWindow.md)|  |

### Return type

[**TessellServiceMaintenanceWindow**](TessellServiceMaintenanceWindow.md)

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


## updateMaintenanceWindowOps

> MaintenanceWindowOpsDTO updateMaintenanceWindowOps(id, maintenanceWindowOpsDTO)

Update maintenance window

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        MaintenanceWindowOpsDTO maintenanceWindowOpsDTO = new MaintenanceWindowOpsDTO(); // MaintenanceWindowOpsDTO | 
        try {
            MaintenanceWindowOpsDTO result = apiInstance.updateMaintenanceWindowOps(id, maintenanceWindowOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#updateMaintenanceWindowOps");
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
 **id** | [**UUID**](.md)| Id of entity |
 **maintenanceWindowOpsDTO** | [**MaintenanceWindowOpsDTO**](MaintenanceWindowOpsDTO.md)|  |

### Return type

[**MaintenanceWindowOpsDTO**](MaintenanceWindowOpsDTO.md)

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


## updateTaskOps

> TaskOpsDTO updateTaskOps(id, taskOpsDTO)

Update maintenance window task

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.MaintenanceWindowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MaintenanceWindowApi apiInstance = new MaintenanceWindowApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of entity
        TaskOpsDTO taskOpsDTO = new TaskOpsDTO(); // TaskOpsDTO | 
        try {
            TaskOpsDTO result = apiInstance.updateTaskOps(id, taskOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MaintenanceWindowApi#updateTaskOps");
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
 **id** | [**UUID**](.md)| Id of entity |
 **taskOpsDTO** | [**TaskOpsDTO**](TaskOpsDTO.md)|  |

### Return type

[**TaskOpsDTO**](TaskOpsDTO.md)

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

