# TessellStorageControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createStorage**](TessellStorageControllerApi.md#createStorage) | **POST** /tessell-ops/storages | Create a new Managed Storage metadata
[**deleteStorage**](TessellStorageControllerApi.md#deleteStorage) | **DELETE** /tessell-ops/storages/{id} | Delete a Tessell Managed Storage metadata
[**getStorage**](TessellStorageControllerApi.md#getStorage) | **GET** /tessell-ops/storages/{id} | View details about a Tessell Managed Storage
[**getStorages**](TessellStorageControllerApi.md#getStorages) | **GET** /tessell-ops/storages | View a list of available Tessell Managed Storages
[**updateStorage**](TessellStorageControllerApi.md#updateStorage) | **PATCH** /tessell-ops/storages/{id} | Update a Tessell Managed Storage metadata



## createStorage

> TessellStorageDTO createStorage(tessellStorageDTO)

Create a new Managed Storage metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellStorageControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellStorageControllerApi apiInstance = new TessellStorageControllerApi(defaultClient);
        TessellStorageDTO tessellStorageDTO = new TessellStorageDTO(); // TessellStorageDTO | 
        try {
            TessellStorageDTO result = apiInstance.createStorage(tessellStorageDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageControllerApi#createStorage");
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
 **tessellStorageDTO** | [**TessellStorageDTO**](TessellStorageDTO.md)|  |

### Return type

[**TessellStorageDTO**](TessellStorageDTO.md)

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


## deleteStorage

> ApiStatus deleteStorage(id, softDelete)

Delete a Tessell Managed Storage metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellStorageControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellStorageControllerApi apiInstance = new TessellStorageControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteStorage(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageControllerApi#deleteStorage");
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


## getStorage

> TessellStorageDTO getStorage(id, timeZone)

View details about a Tessell Managed Storage

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellStorageControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellStorageControllerApi apiInstance = new TessellStorageControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellStorageDTO result = apiInstance.getStorage(id, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageControllerApi#getStorage");
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
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellStorageDTO**](TessellStorageDTO.md)

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


## getStorages

> TessellStorageListResponse getStorages(name, statuses, skipStatuses, type, cloudResourceId, cloudLocationId, storageTiers, pageSize, pageOffset, timeZone)

View a list of available Tessell Managed Storages

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellStorageControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellStorageControllerApi apiInstance = new TessellStorageControllerApi(defaultClient);
        String name = "name_example"; // String | name
        List<TessellStorageStatus> statuses = Arrays.asList(); // List<TessellStorageStatus> | Statuses of Tessell Storage to be included.
        List<TessellStorageStatus> skipStatuses = Arrays.asList(); // List<TessellStorageStatus> | Statuses of Tessell Storage not to be included.
        StorageType type = StorageType.fromValue("DB_DATA"); // StorageType | type
        String cloudResourceId = "cloudResourceId_example"; // String | Cloud resource id like AWS storage id: vol-0a8b520b873aae582
        String cloudLocationId = "cloudLocationId_example"; // String | Cloud location id like aws/ap-south-1/ap-south-1a
        List<StorageTier> storageTiers = Arrays.asList(); // List<StorageTier> | Storage tier of Tessell Storage
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellStorageListResponse result = apiInstance.getStorages(name, statuses, skipStatuses, type, cloudResourceId, cloudLocationId, storageTiers, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageControllerApi#getStorages");
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
 **name** | **String**| name | [optional]
 **statuses** | [**List&lt;TessellStorageStatus&gt;**](TessellStorageStatus.md)| Statuses of Tessell Storage to be included. | [optional]
 **skipStatuses** | [**List&lt;TessellStorageStatus&gt;**](TessellStorageStatus.md)| Statuses of Tessell Storage not to be included. | [optional]
 **type** | [**StorageType**](.md)| type | [optional] [enum: DB_DATA, ARCHIVE_DATA, DB_TXN_LOGS, DB_SOFTWARE, OS_SOFTWARE, TESSELL_CLIENT_LIBRARY, TEMPORARY_PATCH_SOFTWARE_HOME, DB_BACKUP, MONITORING_DATA, S3_BUCKET, TEMPORARY_NATIVE_BACKUP_DISK]
 **cloudResourceId** | **String**| Cloud resource id like AWS storage id: vol-0a8b520b873aae582 | [optional]
 **cloudLocationId** | **String**| Cloud location id like aws/ap-south-1/ap-south-1a | [optional]
 **storageTiers** | [**List&lt;StorageTier&gt;**](StorageTier.md)| Storage tier of Tessell Storage | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellStorageListResponse**](TessellStorageListResponse.md)

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


## updateStorage

> TessellStorageDTO updateStorage(id, tessellStorageDTO)

Update a Tessell Managed Storage metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellStorageControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellStorageControllerApi apiInstance = new TessellStorageControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellStorageDTO tessellStorageDTO = new TessellStorageDTO(); // TessellStorageDTO | 
        try {
            TessellStorageDTO result = apiInstance.updateStorage(id, tessellStorageDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellStorageControllerApi#updateStorage");
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
 **tessellStorageDTO** | [**TessellStorageDTO**](TessellStorageDTO.md)|  |

### Return type

[**TessellStorageDTO**](TessellStorageDTO.md)

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

