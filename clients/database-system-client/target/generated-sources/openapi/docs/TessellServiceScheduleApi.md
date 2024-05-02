# TessellServiceScheduleApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServiceDeletionSchedule**](TessellServiceScheduleApi.md#createServiceDeletionSchedule) | **POST** /services/{serviceId}/schedules/delete | Creates the deletion schedule for the DB Service
[**createServiceStartStopSchedule**](TessellServiceScheduleApi.md#createServiceStartStopSchedule) | **POST** /services/{serviceId}/schedules/start-stop | Creates a start/stop schedule for the DB Service
[**createServiceStartStopScheduleOps**](TessellServiceScheduleApi.md#createServiceStartStopScheduleOps) | **POST** /tessell-ops/services/{serviceId}/schedules/start-stop | Create tessell service start stop schedule
[**deleteServiceDeletionSchedule**](TessellServiceScheduleApi.md#deleteServiceDeletionSchedule) | **DELETE** /services/{serviceId}/schedules/delete | Deletes the deletion schedule for the DB Service
[**deleteServiceDeletionScheduleTFP**](TessellServiceScheduleApi.md#deleteServiceDeletionScheduleTFP) | **DELETE** /services/{service-id}/schedules/delete/{id} | Deletes the deletion schedule for the DB Service
[**deleteServiceStartStopSchedule**](TessellServiceScheduleApi.md#deleteServiceStartStopSchedule) | **DELETE** /services/{serviceId}/schedules/start-stop/{id} | Deletes the given start/stop schedule for the DB Service.
[**getServiceDeletionSchedule**](TessellServiceScheduleApi.md#getServiceDeletionSchedule) | **GET** /services/{serviceId}/schedules/delete | Returns the deletion schedule details for the DB Service
[**getServiceDeletionScheduleTFP**](TessellServiceScheduleApi.md#getServiceDeletionScheduleTFP) | **GET** /services/{service-id}/schedules/delete/{id} | Returns the deletion schedule details for the DB Service
[**getServiceSchedules**](TessellServiceScheduleApi.md#getServiceSchedules) | **GET** /services/{serviceId}/schedules | Returns the details about all the automated schedules on the DB Service
[**getServiceStartStopSchedule**](TessellServiceScheduleApi.md#getServiceStartStopSchedule) | **GET** /services/{serviceId}/schedules/start-stop/{id} | Return the details about the start/stop schedule for given schedule ID for the DB Service
[**getServiceStartStopScheduleOps**](TessellServiceScheduleApi.md#getServiceStartStopScheduleOps) | **GET** /tessell-ops/services/{serviceId}/schedules/start-stop/{id} | Get tessell service start stop schedule
[**getServiceStartStopSchedules**](TessellServiceScheduleApi.md#getServiceStartStopSchedules) | **GET** /services/{serviceId}/schedules/start-stop | Get the details of start/stop schedules for the DB Service
[**getServiceStartStopSchedulesOps**](TessellServiceScheduleApi.md#getServiceStartStopSchedulesOps) | **GET** /tessell-ops/services/{serviceId}/schedules/start-stop | get tessell service start stop schedules
[**updateServiceDeletionSchedule**](TessellServiceScheduleApi.md#updateServiceDeletionSchedule) | **PATCH** /services/{serviceId}/schedules/delete | Updates the deletion schedule for the DB Service
[**updateServiceDeletionScheduleTFP**](TessellServiceScheduleApi.md#updateServiceDeletionScheduleTFP) | **PATCH** /services/{service-id}/schedules/delete/{id} | Updates the deletion schedule for the DB Service
[**updateServiceStartStopSchedule**](TessellServiceScheduleApi.md#updateServiceStartStopSchedule) | **PATCH** /services/{serviceId}/schedules/start-stop/{id} | Updates the given start/stop schedule on the DB Service
[**updateServiceStartStopScheduleOps**](TessellServiceScheduleApi.md#updateServiceStartStopScheduleOps) | **PATCH** /tessell-ops/services/{serviceId}/schedules/start-stop/{id} | Update tessell service start stop schedule
[**updateStartStopScheduleStatus**](TessellServiceScheduleApi.md#updateStartStopScheduleStatus) | **PATCH** /services/{serviceId}/schedules/start-stop/{scheduleId}/{action} | Update the status of the given start/stop schedule for the DB Service.



## createServiceDeletionSchedule

> DeletionScheduleDTO createServiceDeletionSchedule(serviceId, deletionSchedulePayload)

Creates the deletion schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        DeletionSchedulePayload deletionSchedulePayload = new DeletionSchedulePayload(); // DeletionSchedulePayload | 
        try {
            DeletionScheduleDTO result = apiInstance.createServiceDeletionSchedule(serviceId, deletionSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#createServiceDeletionSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **deletionSchedulePayload** | [**DeletionSchedulePayload**](DeletionSchedulePayload.md)|  |

### Return type

[**DeletionScheduleDTO**](DeletionScheduleDTO.md)

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


## createServiceStartStopSchedule

> StartStopScheduleDTO createServiceStartStopSchedule(serviceId, createStartStopSchedulePayload)

Creates a start/stop schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        CreateStartStopSchedulePayload createStartStopSchedulePayload = new CreateStartStopSchedulePayload(); // CreateStartStopSchedulePayload | 
        try {
            StartStopScheduleDTO result = apiInstance.createServiceStartStopSchedule(serviceId, createStartStopSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#createServiceStartStopSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **createStartStopSchedulePayload** | [**CreateStartStopSchedulePayload**](CreateStartStopSchedulePayload.md)|  |

### Return type

[**StartStopScheduleDTO**](StartStopScheduleDTO.md)

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


## createServiceStartStopScheduleOps

> StartStopScheduleDTO createServiceStartStopScheduleOps(serviceId, createStartStopSchedulePayload)

Create tessell service start stop schedule

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        CreateStartStopSchedulePayload createStartStopSchedulePayload = new CreateStartStopSchedulePayload(); // CreateStartStopSchedulePayload | 
        try {
            StartStopScheduleDTO result = apiInstance.createServiceStartStopScheduleOps(serviceId, createStartStopSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#createServiceStartStopScheduleOps");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **createStartStopSchedulePayload** | [**CreateStartStopSchedulePayload**](CreateStartStopSchedulePayload.md)|  |

### Return type

[**StartStopScheduleDTO**](StartStopScheduleDTO.md)

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


## deleteServiceDeletionSchedule

> ApiStatus deleteServiceDeletionSchedule(serviceId)

Deletes the deletion schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        try {
            ApiStatus result = apiInstance.deleteServiceDeletionSchedule(serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#deleteServiceDeletionSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |

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


## deleteServiceDeletionScheduleTFP

> ApiStatus deleteServiceDeletionScheduleTFP(serviceId, id)

Deletes the deletion schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID id = new UUID(); // UUID | Id of entity
        try {
            ApiStatus result = apiInstance.deleteServiceDeletionScheduleTFP(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#deleteServiceDeletionScheduleTFP");
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


## deleteServiceStartStopSchedule

> ApiStatus deleteServiceStartStopSchedule(serviceId, id)

Deletes the given start/stop schedule for the DB Service.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID id = new UUID(); // UUID | The ID of the start/stop schedule
        try {
            ApiStatus result = apiInstance.deleteServiceStartStopSchedule(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#deleteServiceStartStopSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **id** | [**UUID**](.md)| The ID of the start/stop schedule |

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


## getServiceDeletionSchedule

> DeletionScheduleResponse getServiceDeletionSchedule(serviceId)

Returns the deletion schedule details for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        try {
            DeletionScheduleResponse result = apiInstance.getServiceDeletionSchedule(serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceDeletionSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**DeletionScheduleResponse**](DeletionScheduleResponse.md)

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


## getServiceDeletionScheduleTFP

> DeletionScheduleDTO getServiceDeletionScheduleTFP(serviceId, id)

Returns the deletion schedule details for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID id = new UUID(); // UUID | Id of entity
        try {
            DeletionScheduleDTO result = apiInstance.getServiceDeletionScheduleTFP(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceDeletionScheduleTFP");
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

### Return type

[**DeletionScheduleDTO**](DeletionScheduleDTO.md)

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


## getServiceSchedules

> ServiceSchedulesResponse getServiceSchedules(serviceId)

Returns the details about all the automated schedules on the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        try {
            ServiceSchedulesResponse result = apiInstance.getServiceSchedules(serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceSchedules");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**ServiceSchedulesResponse**](ServiceSchedulesResponse.md)

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


## getServiceStartStopSchedule

> StartStopScheduleDTO getServiceStartStopSchedule(serviceId, id)

Return the details about the start/stop schedule for given schedule ID for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID id = new UUID(); // UUID | The ID of the start/stop schedule
        try {
            StartStopScheduleDTO result = apiInstance.getServiceStartStopSchedule(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceStartStopSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **id** | [**UUID**](.md)| The ID of the start/stop schedule |

### Return type

[**StartStopScheduleDTO**](StartStopScheduleDTO.md)

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


## getServiceStartStopScheduleOps

> StartStopScheduleOpsDTO getServiceStartStopScheduleOps(serviceId, id)

Get tessell service start stop schedule

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID id = new UUID(); // UUID | The ID of the start/stop schedule
        try {
            StartStopScheduleOpsDTO result = apiInstance.getServiceStartStopScheduleOps(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceStartStopScheduleOps");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **id** | [**UUID**](.md)| The ID of the start/stop schedule |

### Return type

[**StartStopScheduleOpsDTO**](StartStopScheduleOpsDTO.md)

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


## getServiceStartStopSchedules

> StartStopScheduleResponse getServiceStartStopSchedules(serviceId, status, pageSize, pageOffset)

Get the details of start/stop schedules for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        List<StartStopScheduleStatus> status = Arrays.asList(); // List<StartStopScheduleStatus> | DB Service schedule status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            StartStopScheduleResponse result = apiInstance.getServiceStartStopSchedules(serviceId, status, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceStartStopSchedules");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **status** | [**List&lt;StartStopScheduleStatus&gt;**](StartStopScheduleStatus.md)| DB Service schedule status | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**StartStopScheduleResponse**](StartStopScheduleResponse.md)

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


## getServiceStartStopSchedulesOps

> StartStopScheduleOpsResponse getServiceStartStopSchedulesOps(serviceId, status, pageSize, pageOffset)

get tessell service start stop schedules

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        List<StartStopScheduleStatus> status = Arrays.asList(); // List<StartStopScheduleStatus> | tessell service schedule status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            StartStopScheduleOpsResponse result = apiInstance.getServiceStartStopSchedulesOps(serviceId, status, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#getServiceStartStopSchedulesOps");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **status** | [**List&lt;StartStopScheduleStatus&gt;**](StartStopScheduleStatus.md)| tessell service schedule status | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**StartStopScheduleOpsResponse**](StartStopScheduleOpsResponse.md)

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


## updateServiceDeletionSchedule

> DeletionScheduleDTO updateServiceDeletionSchedule(serviceId, deletionSchedulePayload)

Updates the deletion schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        DeletionSchedulePayload deletionSchedulePayload = new DeletionSchedulePayload(); // DeletionSchedulePayload | 
        try {
            DeletionScheduleDTO result = apiInstance.updateServiceDeletionSchedule(serviceId, deletionSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#updateServiceDeletionSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **deletionSchedulePayload** | [**DeletionSchedulePayload**](DeletionSchedulePayload.md)|  |

### Return type

[**DeletionScheduleDTO**](DeletionScheduleDTO.md)

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


## updateServiceDeletionScheduleTFP

> DeletionScheduleDTO updateServiceDeletionScheduleTFP(serviceId, id, deletionSchedulePayload)

Updates the deletion schedule for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID id = new UUID(); // UUID | Id of entity
        DeletionSchedulePayload deletionSchedulePayload = new DeletionSchedulePayload(); // DeletionSchedulePayload | 
        try {
            DeletionScheduleDTO result = apiInstance.updateServiceDeletionScheduleTFP(serviceId, id, deletionSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#updateServiceDeletionScheduleTFP");
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
 **deletionSchedulePayload** | [**DeletionSchedulePayload**](DeletionSchedulePayload.md)|  |

### Return type

[**DeletionScheduleDTO**](DeletionScheduleDTO.md)

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


## updateServiceStartStopSchedule

> StartStopScheduleDTO updateServiceStartStopSchedule(serviceId, id, updateStartStopSchedulePayload)

Updates the given start/stop schedule on the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID id = new UUID(); // UUID | The ID of the start/stop schedule
        UpdateStartStopSchedulePayload updateStartStopSchedulePayload = new UpdateStartStopSchedulePayload(); // UpdateStartStopSchedulePayload | 
        try {
            StartStopScheduleDTO result = apiInstance.updateServiceStartStopSchedule(serviceId, id, updateStartStopSchedulePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#updateServiceStartStopSchedule");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **id** | [**UUID**](.md)| The ID of the start/stop schedule |
 **updateStartStopSchedulePayload** | [**UpdateStartStopSchedulePayload**](UpdateStartStopSchedulePayload.md)|  |

### Return type

[**StartStopScheduleDTO**](StartStopScheduleDTO.md)

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


## updateServiceStartStopScheduleOps

> StartStopScheduleOpsDTO updateServiceStartStopScheduleOps(serviceId, id, startStopScheduleOpsDTO)

Update tessell service start stop schedule

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID id = new UUID(); // UUID | The ID of the start/stop schedule
        StartStopScheduleOpsDTO startStopScheduleOpsDTO = new StartStopScheduleOpsDTO(); // StartStopScheduleOpsDTO | 
        try {
            StartStopScheduleOpsDTO result = apiInstance.updateServiceStartStopScheduleOps(serviceId, id, startStopScheduleOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#updateServiceStartStopScheduleOps");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **id** | [**UUID**](.md)| The ID of the start/stop schedule |
 **startStopScheduleOpsDTO** | [**StartStopScheduleOpsDTO**](StartStopScheduleOpsDTO.md)|  |

### Return type

[**StartStopScheduleOpsDTO**](StartStopScheduleOpsDTO.md)

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


## updateStartStopScheduleStatus

> ApiStatus updateStartStopScheduleStatus(serviceId, scheduleId, action)

Update the status of the given start/stop schedule for the DB Service.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceScheduleApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceScheduleApi apiInstance = new TessellServiceScheduleApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID scheduleId = new UUID(); // UUID | The ID of the schedule
        String action = "action_example"; // String | Action (like resume/pause) to be taken on the start/stop schedule
        try {
            ApiStatus result = apiInstance.updateStartStopScheduleStatus(serviceId, scheduleId, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceScheduleApi#updateStartStopScheduleStatus");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **scheduleId** | [**UUID**](.md)| The ID of the schedule |
 **action** | **String**| Action (like resume/pause) to be taken on the start/stop schedule |

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
| **0** | API error response |  -  |

