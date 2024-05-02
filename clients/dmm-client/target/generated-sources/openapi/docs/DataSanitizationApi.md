# DataSanitizationApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAmSanitizationSchedulesServiceView**](DataSanitizationApi.md#createAmSanitizationSchedulesServiceView) | **POST** /availability-machines/{id}/sanitization-schedules | Create a new Sanitization Schedule for an Availability Machine
[**deleteAmSanitizationSchedule**](DataSanitizationApi.md#deleteAmSanitizationSchedule) | **DELETE** /tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Request to delete a sanitization schedule
[**deleteAmSanitizationScheduleServiceView**](DataSanitizationApi.md#deleteAmSanitizationScheduleServiceView) | **DELETE** /availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Submit a request to delete the Sanitization Schedule
[**getAmSanitizationSchedule**](DataSanitizationApi.md#getAmSanitizationSchedule) | **GET** /tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Request to get a Sanitization Schedule
[**getAmSanitizationScheduleServiceView**](DataSanitizationApi.md#getAmSanitizationScheduleServiceView) | **GET** /availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Get details about a Sanitization Schedule
[**getAmSanitizationSchedules**](DataSanitizationApi.md#getAmSanitizationSchedules) | **GET** /tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules | Request to get Sanitization Schedules
[**getAmSanitizationSchedulesServiceView**](DataSanitizationApi.md#getAmSanitizationSchedulesServiceView) | **GET** /availability-machines/{id}/sanitization-schedules | Get list of Sanitization Schedules that are associated with an Availability Machine
[**updateAmSanitizationSchedule**](DataSanitizationApi.md#updateAmSanitizationSchedule) | **PATCH** /tessell-ops/dmms/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Request to update a Sanitization Schedule
[**updateAmSanitizationScheduleServiceView**](DataSanitizationApi.md#updateAmSanitizationScheduleServiceView) | **PATCH** /availability-machines/{availabilityMachineId}/sanitization-schedules/{sanitizationScheduleId} | Update a Sanitization Schedule



## createAmSanitizationSchedulesServiceView

> TessellSanitizationScheduleServiceDTO createAmSanitizationSchedulesServiceView(id, tessellSanitizationScheduleCreatePayload)

Create a new Sanitization Schedule for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        TessellSanitizationScheduleCreatePayload tessellSanitizationScheduleCreatePayload = new TessellSanitizationScheduleCreatePayload(); // TessellSanitizationScheduleCreatePayload | 
        try {
            TessellSanitizationScheduleServiceDTO result = apiInstance.createAmSanitizationSchedulesServiceView(id, tessellSanitizationScheduleCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#createAmSanitizationSchedulesServiceView");
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
 **id** | [**UUID**](.md)| ID of the Availability Machine |
 **tessellSanitizationScheduleCreatePayload** | [**TessellSanitizationScheduleCreatePayload**](TessellSanitizationScheduleCreatePayload.md)|  |

### Return type

[**TessellSanitizationScheduleServiceDTO**](TessellSanitizationScheduleServiceDTO.md)

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


## deleteAmSanitizationSchedule

> ApiStatus deleteAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, softDelete)

Request to delete a sanitization schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        UUID sanitizationScheduleId = new UUID(); // UUID | Id of the Sanitization Schedule
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#deleteAmSanitizationSchedule");
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
 **availabilityMachineId** | [**UUID**](.md)| Id of the Availability Machine |
 **sanitizationScheduleId** | [**UUID**](.md)| Id of the Sanitization Schedule |
 **softDelete** | **Boolean**| soft-delete | [optional]

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


## deleteAmSanitizationScheduleServiceView

> ApiStatus deleteAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId)

Submit a request to delete the Sanitization Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID sanitizationScheduleId = new UUID(); // UUID | ID of the Sanitization Schedule
        try {
            ApiStatus result = apiInstance.deleteAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#deleteAmSanitizationScheduleServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **sanitizationScheduleId** | [**UUID**](.md)| ID of the Sanitization Schedule |

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


## getAmSanitizationSchedule

> TessellSanitizationScheduleDTO getAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone)

Request to get a Sanitization Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | availabilityMachineId
        UUID sanitizationScheduleId = new UUID(); // UUID | sanitizationScheduleId
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellSanitizationScheduleDTO result = apiInstance.getAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#getAmSanitizationSchedule");
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
 **availabilityMachineId** | [**UUID**](.md)| availabilityMachineId |
 **sanitizationScheduleId** | [**UUID**](.md)| sanitizationScheduleId |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellSanitizationScheduleDTO**](TessellSanitizationScheduleDTO.md)

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


## getAmSanitizationScheduleServiceView

> TessellSanitizationScheduleServiceDTO getAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone)

Get details about a Sanitization Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID sanitizationScheduleId = new UUID(); // UUID | ID of the Sanitization Schedule
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellSanitizationScheduleServiceDTO result = apiInstance.getAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#getAmSanitizationScheduleServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **sanitizationScheduleId** | [**UUID**](.md)| ID of the Sanitization Schedule |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellSanitizationScheduleServiceDTO**](TessellSanitizationScheduleServiceDTO.md)

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


## getAmSanitizationSchedules

> GetSanitizationSchedulesApiResponse getAmSanitizationSchedules(availabilityMachineId, name, loadAcls, pageSize, pageOffset, timeZone)

Request to get Sanitization Schedules

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | availabilityMachineId
        String name = "name_example"; // String | Sanitization Schedule name
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSanitizationSchedulesApiResponse result = apiInstance.getAmSanitizationSchedules(availabilityMachineId, name, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#getAmSanitizationSchedules");
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
 **availabilityMachineId** | [**UUID**](.md)| availabilityMachineId |
 **name** | **String**| Sanitization Schedule name | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSanitizationSchedulesApiResponse**](GetSanitizationSchedulesApiResponse.md)

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


## getAmSanitizationSchedulesServiceView

> GetSanitizationSchedulesServiceApiResponse getAmSanitizationSchedulesServiceView(id, name, loadAcls, pageSize, pageOffset, timeZone)

Get list of Sanitization Schedules that are associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        String name = "name_example"; // String | Filter the result based on Sanitization Schedule name
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSanitizationSchedulesServiceApiResponse result = apiInstance.getAmSanitizationSchedulesServiceView(id, name, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#getAmSanitizationSchedulesServiceView");
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
 **id** | [**UUID**](.md)| ID of the Availability Machine |
 **name** | **String**| Filter the result based on Sanitization Schedule name | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSanitizationSchedulesServiceApiResponse**](GetSanitizationSchedulesServiceApiResponse.md)

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


## updateAmSanitizationSchedule

> TessellSanitizationScheduleDTO updateAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleDTO)

Request to update a Sanitization Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | availabilityMachineId
        UUID sanitizationScheduleId = new UUID(); // UUID | sanitizationScheduleId
        TessellSanitizationScheduleDTO tessellSanitizationScheduleDTO = new TessellSanitizationScheduleDTO(); // TessellSanitizationScheduleDTO | 
        try {
            TessellSanitizationScheduleDTO result = apiInstance.updateAmSanitizationSchedule(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#updateAmSanitizationSchedule");
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
 **availabilityMachineId** | [**UUID**](.md)| availabilityMachineId |
 **sanitizationScheduleId** | [**UUID**](.md)| sanitizationScheduleId |
 **tessellSanitizationScheduleDTO** | [**TessellSanitizationScheduleDTO**](TessellSanitizationScheduleDTO.md)|  |

### Return type

[**TessellSanitizationScheduleDTO**](TessellSanitizationScheduleDTO.md)

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


## updateAmSanitizationScheduleServiceView

> TessellSanitizationScheduleServiceDTO updateAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleUpdatePayload)

Update a Sanitization Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DataSanitizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DataSanitizationApi apiInstance = new DataSanitizationApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID sanitizationScheduleId = new UUID(); // UUID | ID of the Sanitization Schedule
        TessellSanitizationScheduleUpdatePayload tessellSanitizationScheduleUpdatePayload = new TessellSanitizationScheduleUpdatePayload(); // TessellSanitizationScheduleUpdatePayload | 
        try {
            TessellSanitizationScheduleServiceDTO result = apiInstance.updateAmSanitizationScheduleServiceView(availabilityMachineId, sanitizationScheduleId, tessellSanitizationScheduleUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataSanitizationApi#updateAmSanitizationScheduleServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **sanitizationScheduleId** | [**UUID**](.md)| ID of the Sanitization Schedule |
 **tessellSanitizationScheduleUpdatePayload** | [**TessellSanitizationScheduleUpdatePayload**](TessellSanitizationScheduleUpdatePayload.md)|  |

### Return type

[**TessellSanitizationScheduleServiceDTO**](TessellSanitizationScheduleServiceDTO.md)

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

