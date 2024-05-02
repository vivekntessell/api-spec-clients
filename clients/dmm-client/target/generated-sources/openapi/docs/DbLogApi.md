# DbLogApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDbLog**](DbLogApi.md#createDbLog) | **POST** /tessell-ops/dmms/{dmmId}/db-logs | Request to create a new Tessell Database Log
[**createDbLog_0**](DbLogApi.md#createDbLog_0) | **POST** /tessell-ops/dmms/{dmmId}/availability-machine/db-logs | Request to create a new Tessell Database Log
[**deleteDbLog**](DbLogApi.md#deleteDbLog) | **DELETE** /tessell-ops/dmms/{dmmId}/db-logs/{dbLogId} | Delete a Tessell Database Backup
[**getDbLog**](DbLogApi.md#getDbLog) | **GET** /tessell-ops/dmms/{dmmId}/db-logs/{dbLogId} | View details about a Tessell Database Log
[**getDbLogs**](DbLogApi.md#getDbLogs) | **GET** /tessell-ops/dmms/{dmmId}/db-logs | View a list of available Tessell Database Logs
[**getDbLogsByFilter**](DbLogApi.md#getDbLogsByFilter) | **GET** /tessell-ops/dmms/db-logs | View a list of Tessell Database Logs for given filter
[**getDbLogs_0**](DbLogApi.md#getDbLogs_0) | **GET** /tessell-ops/dmms/{dmmId}/availability-machine/db-logs | View a list of available Tessell Database Logs
[**updateDbLog**](DbLogApi.md#updateDbLog) | **PATCH** /tessell-ops/dmms/{dmmId}/db-logs/{dbLogId} | Update a Tessell Database Log



## createDbLog

> TessellDbLogDTO createDbLog(dmmId, tessellDbLogDTO)

Request to create a new Tessell Database Log

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        TessellDbLogDTO tessellDbLogDTO = new TessellDbLogDTO(); // TessellDbLogDTO | 
        try {
            TessellDbLogDTO result = apiInstance.createDbLog(dmmId, tessellDbLogDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#createDbLog");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **tessellDbLogDTO** | [**TessellDbLogDTO**](TessellDbLogDTO.md)|  |

### Return type

[**TessellDbLogDTO**](TessellDbLogDTO.md)

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


## createDbLog_0

> TessellDbLogDTO createDbLog_0(dmmId, tessellDbLogDTO)

Request to create a new Tessell Database Log

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        TessellDbLogDTO tessellDbLogDTO = new TessellDbLogDTO(); // TessellDbLogDTO | 
        try {
            TessellDbLogDTO result = apiInstance.createDbLog_0(dmmId, tessellDbLogDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#createDbLog_0");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **tessellDbLogDTO** | [**TessellDbLogDTO**](TessellDbLogDTO.md)|  |

### Return type

[**TessellDbLogDTO**](TessellDbLogDTO.md)

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


## deleteDbLog

> ApiStatus deleteDbLog(dmmId, dbLogId)

Delete a Tessell Database Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dbLogId = new UUID(); // UUID | dbLogId
        try {
            ApiStatus result = apiInstance.deleteDbLog(dmmId, dbLogId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#deleteDbLog");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dbLogId** | [**UUID**](.md)| dbLogId |

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


## getDbLog

> TessellDbLogDTO getDbLog(dmmId, dbLogId, lightWeight, timeZone)

View details about a Tessell Database Log

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dbLogId = new UUID(); // UUID | dbLogId
        Boolean lightWeight = true; // Boolean | If set to true, plugin related fields like driverInfo/metadata won't be returned.
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDbLogDTO result = apiInstance.getDbLog(dmmId, dbLogId, lightWeight, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#getDbLog");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dbLogId** | [**UUID**](.md)| dbLogId |
 **lightWeight** | **Boolean**| If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDbLogDTO**](TessellDbLogDTO.md)

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


## getDbLogs

> GetDbLogsApiResponse getDbLogs(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone)

View a list of available Tessell Database Logs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        List<DbLogStatus> status = Arrays.asList(); // List<DbLogStatus> | status
        String rangeFromTime = "2022-04-10 04:20:30"; // String | range-from-time
        String rangeToTime = "2022-04-10 04:20:30"; // String | range-to-time
        Boolean lightWeight = true; // Boolean | If set to true, plugin related fields like driverInfo/metadata won't be returned.
        Boolean dapBased = true; // Boolean | Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned. 
        UUID dapId = new UUID(); // UUID | Data access policy id to filter the results upon.
        String cloudLocation = "cloudLocation_example"; // String | Cloud-location of the resource
        UUID storageId = new UUID(); // UUID | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDbLogsApiResponse result = apiInstance.getDbLogs(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#getDbLogs");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **status** | [**List&lt;DbLogStatus&gt;**](DbLogStatus.md)| status | [optional]
 **rangeFromTime** | **String**| range-from-time | [optional]
 **rangeToTime** | **String**| range-to-time | [optional]
 **lightWeight** | **Boolean**| If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. | [optional]
 **dapBased** | **Boolean**| Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  | [optional]
 **dapId** | [**UUID**](.md)| Data access policy id to filter the results upon. | [optional]
 **cloudLocation** | **String**| Cloud-location of the resource | [optional]
 **storageId** | [**UUID**](.md)|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDbLogsApiResponse**](GetDbLogsApiResponse.md)

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


## getDbLogsByFilter

> GetDbLogsApiResponse getDbLogsByFilter(status, lightWeight, pageSize, pageOffset, timeZone)

View a list of Tessell Database Logs for given filter

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        List<DbLogStatus> status = Arrays.asList(); // List<DbLogStatus> | status
        Boolean lightWeight = true; // Boolean | If set to true, plugin related fields like driverInfo/metadata won't be returned.
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDbLogsApiResponse result = apiInstance.getDbLogsByFilter(status, lightWeight, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#getDbLogsByFilter");
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
 **status** | [**List&lt;DbLogStatus&gt;**](DbLogStatus.md)| status |
 **lightWeight** | **Boolean**| If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDbLogsApiResponse**](GetDbLogsApiResponse.md)

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


## getDbLogs_0

> GetDbLogsApiResponse getDbLogs_0(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone)

View a list of available Tessell Database Logs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        List<DbLogStatus> status = Arrays.asList(); // List<DbLogStatus> | status
        String rangeFromTime = "2022-04-10 04:20:30"; // String | range-from-time
        String rangeToTime = "2022-04-10 04:20:30"; // String | range-to-time
        Boolean lightWeight = true; // Boolean | If set to true, plugin related fields like driverInfo/metadata won't be returned.
        Boolean dapBased = true; // Boolean | Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned. 
        UUID dapId = new UUID(); // UUID | Data access policy id to filter the results upon.
        String cloudLocation = "cloudLocation_example"; // String | Cloud-location of the resource
        UUID storageId = new UUID(); // UUID | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDbLogsApiResponse result = apiInstance.getDbLogs_0(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#getDbLogs_0");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **status** | [**List&lt;DbLogStatus&gt;**](DbLogStatus.md)| status | [optional]
 **rangeFromTime** | **String**| range-from-time | [optional]
 **rangeToTime** | **String**| range-to-time | [optional]
 **lightWeight** | **Boolean**| If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. | [optional]
 **dapBased** | **Boolean**| Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  | [optional]
 **dapId** | [**UUID**](.md)| Data access policy id to filter the results upon. | [optional]
 **cloudLocation** | **String**| Cloud-location of the resource | [optional]
 **storageId** | [**UUID**](.md)|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDbLogsApiResponse**](GetDbLogsApiResponse.md)

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


## updateDbLog

> TessellDbLogDTO updateDbLog(dmmId, dbLogId, tessellDbLogDTO)

Update a Tessell Database Log

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbLogApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbLogApi apiInstance = new DbLogApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dbLogId = new UUID(); // UUID | dbLogId
        TessellDbLogDTO tessellDbLogDTO = new TessellDbLogDTO(); // TessellDbLogDTO | 
        try {
            TessellDbLogDTO result = apiInstance.updateDbLog(dmmId, dbLogId, tessellDbLogDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbLogApi#updateDbLog");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dbLogId** | [**UUID**](.md)| dbLogId |
 **tessellDbLogDTO** | [**TessellDbLogDTO**](TessellDbLogDTO.md)|  |

### Return type

[**TessellDbLogDTO**](TessellDbLogDTO.md)

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

