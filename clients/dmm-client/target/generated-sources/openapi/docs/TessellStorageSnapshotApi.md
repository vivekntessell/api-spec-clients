# TessellStorageSnapshotApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorageSnapshotOps**](TessellStorageSnapshotApi.md#createStorageSnapshotOps) | **POST** /tessell-ops/storages/{storage-id}/snapshots | Creates a metadata entry for Snapshot of a Storage
[**createStorageSnapshotsOps**](TessellStorageSnapshotApi.md#createStorageSnapshotsOps) | **POST** /tessell-ops/storages/snapshots | Creates metadata entries for given storage snapshots
[**deleteStorageSnapshotOps**](TessellStorageSnapshotApi.md#deleteStorageSnapshotOps) | **DELETE** /tessell-ops/storages/{storage-id}/snapshots/{snapshot-id} | Delete the snapshot of a storage
[**getStorageSnapshotOps**](TessellStorageSnapshotApi.md#getStorageSnapshotOps) | **GET** /tessell-ops/storages/{storage-id}/snapshots/{snapshot-id} | Returns the snapshot of a storage details
[**getStorageSnapshotsOps**](TessellStorageSnapshotApi.md#getStorageSnapshotsOps) | **GET** /tessell-ops/storages/snapshots | Returns all the storage-snapshot entities per the filter parameters
[**updateStorageSnapshotOps**](TessellStorageSnapshotApi.md#updateStorageSnapshotOps) | **PATCH** /tessell-ops/storages/{storage-id}/snapshots/{snapshot-id} | Updates a metadata entry for Snapshot of a Storage
[**updateStorageSnapshotsOps**](TessellStorageSnapshotApi.md#updateStorageSnapshotsOps) | **PATCH** /tessell-ops/storages/snapshots | Updates multiple metadata storage-snapshot entries.



## createStorageSnapshotOps

> StorageSnapshotOps createStorageSnapshotOps(storageId, storageSnapshotOps)

Creates a metadata entry for Snapshot of a Storage

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        UUID storageId = new UUID(); // UUID | 
        StorageSnapshotOps storageSnapshotOps = new StorageSnapshotOps(); // StorageSnapshotOps | 
        try {
            StorageSnapshotOps result = apiInstance.createStorageSnapshotOps(storageId, storageSnapshotOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#createStorageSnapshotOps");
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
 **storageId** | [**UUID**](.md)|  |
 **storageSnapshotOps** | [**StorageSnapshotOps**](StorageSnapshotOps.md)|  |

### Return type

[**StorageSnapshotOps**](StorageSnapshotOps.md)

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


## createStorageSnapshotsOps

> List&lt;StorageSnapshotOps&gt; createStorageSnapshotsOps(storageSnapshotOps)

Creates metadata entries for given storage snapshots

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        List<StorageSnapshotOps> storageSnapshotOps = Arrays.asList(); // List<StorageSnapshotOps> | 
        try {
            List<StorageSnapshotOps> result = apiInstance.createStorageSnapshotsOps(storageSnapshotOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#createStorageSnapshotsOps");
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
 **storageSnapshotOps** | [**List&lt;StorageSnapshotOps&gt;**](StorageSnapshotOps.md)|  |

### Return type

[**List&lt;StorageSnapshotOps&gt;**](StorageSnapshotOps.md)

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


## deleteStorageSnapshotOps

> ApiStatus deleteStorageSnapshotOps(storageId, snapshotId, softDelete)

Delete the snapshot of a storage

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        UUID storageId = new UUID(); // UUID | 
        UUID snapshotId = new UUID(); // UUID | 
        Boolean softDelete = true; // Boolean | 
        try {
            ApiStatus result = apiInstance.deleteStorageSnapshotOps(storageId, snapshotId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#deleteStorageSnapshotOps");
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
 **storageId** | [**UUID**](.md)|  |
 **snapshotId** | [**UUID**](.md)|  |
 **softDelete** | **Boolean**|  | [optional] [default to true]

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


## getStorageSnapshotOps

> StorageSnapshotOps getStorageSnapshotOps(storageId, snapshotId)

Returns the snapshot of a storage details

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        UUID storageId = new UUID(); // UUID | 
        UUID snapshotId = new UUID(); // UUID | 
        try {
            StorageSnapshotOps result = apiInstance.getStorageSnapshotOps(storageId, snapshotId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#getStorageSnapshotOps");
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
 **storageId** | [**UUID**](.md)|  |
 **snapshotId** | [**UUID**](.md)|  |

### Return type

[**StorageSnapshotOps**](StorageSnapshotOps.md)

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


## getStorageSnapshotsOps

> StorageSnapshotsResponseOps getStorageSnapshotsOps(storageId, databaseBackupId, statuses, skipStatuses, storageTypes, pageOffset, pageSize)

Returns all the storage-snapshot entities per the filter parameters

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        UUID storageId = new UUID(); // UUID | 
        UUID databaseBackupId = new UUID(); // UUID | 
        List<StorageSnapshotStatusOps> statuses = Arrays.asList(); // List<StorageSnapshotStatusOps> | 
        List<StorageSnapshotStatusOps> skipStatuses = Arrays.asList(); // List<StorageSnapshotStatusOps> | 
        List<StorageType> storageTypes = Arrays.asList(); // List<StorageType> | 
        Integer pageOffset = 0; // Integer | Page offset for get query
        Integer pageSize = 10; // Integer | Page size for get query
        try {
            StorageSnapshotsResponseOps result = apiInstance.getStorageSnapshotsOps(storageId, databaseBackupId, statuses, skipStatuses, storageTypes, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#getStorageSnapshotsOps");
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
 **storageId** | [**UUID**](.md)|  | [optional]
 **databaseBackupId** | [**UUID**](.md)|  | [optional]
 **statuses** | [**List&lt;StorageSnapshotStatusOps&gt;**](StorageSnapshotStatusOps.md)|  | [optional]
 **skipStatuses** | [**List&lt;StorageSnapshotStatusOps&gt;**](StorageSnapshotStatusOps.md)|  | [optional]
 **storageTypes** | [**List&lt;StorageType&gt;**](StorageType.md)|  | [optional]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]

### Return type

[**StorageSnapshotsResponseOps**](StorageSnapshotsResponseOps.md)

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


## updateStorageSnapshotOps

> StorageSnapshotOps updateStorageSnapshotOps(storageId, snapshotId, storageSnapshotOps)

Updates a metadata entry for Snapshot of a Storage

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        UUID storageId = new UUID(); // UUID | 
        UUID snapshotId = new UUID(); // UUID | 
        StorageSnapshotOps storageSnapshotOps = new StorageSnapshotOps(); // StorageSnapshotOps | 
        try {
            StorageSnapshotOps result = apiInstance.updateStorageSnapshotOps(storageId, snapshotId, storageSnapshotOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#updateStorageSnapshotOps");
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
 **storageId** | [**UUID**](.md)|  |
 **snapshotId** | [**UUID**](.md)|  |
 **storageSnapshotOps** | [**StorageSnapshotOps**](StorageSnapshotOps.md)|  |

### Return type

[**StorageSnapshotOps**](StorageSnapshotOps.md)

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


## updateStorageSnapshotsOps

> List&lt;StorageSnapshotOps&gt; updateStorageSnapshotsOps(storageSnapshotOps)

Updates multiple metadata storage-snapshot entries.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellStorageSnapshotApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellStorageSnapshotApi apiInstance = new TessellStorageSnapshotApi(defaultClient);
        List<StorageSnapshotOps> storageSnapshotOps = Arrays.asList(); // List<StorageSnapshotOps> | 
        try {
            List<StorageSnapshotOps> result = apiInstance.updateStorageSnapshotsOps(storageSnapshotOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageSnapshotApi#updateStorageSnapshotsOps");
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
 **storageSnapshotOps** | [**List&lt;StorageSnapshotOps&gt;**](StorageSnapshotOps.md)|  |

### Return type

[**List&lt;StorageSnapshotOps&gt;**](StorageSnapshotOps.md)

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

