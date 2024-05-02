# TessellDbServerSystemControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDBServerSystem**](TessellDbServerSystemControllerApi.md#createDBServerSystem) | **POST** /tessell-ops/dbserver-systems | Create a new Tessell DBServer System
[**createDbssCrMapping**](TessellDbServerSystemControllerApi.md#createDbssCrMapping) | **POST** /tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources | Create a new Tessell DBServer System and Compute Resource Mapping
[**deleteDBServerSystem**](TessellDbServerSystemControllerApi.md#deleteDBServerSystem) | **DELETE** /tessell-ops/dbserver-systems/{id} | Delete a Tessell DBServer System
[**deleteDbssCrMapping**](TessellDbServerSystemControllerApi.md#deleteDbssCrMapping) | **DELETE** /tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources/{computeResourceId} | Delete a Tessell DBServer System and Compute Resource Mapping
[**getDBServerSystemById**](TessellDbServerSystemControllerApi.md#getDBServerSystemById) | **GET** /tessell-ops/dbserver-systems/{id} | View available Tessell DBServer Systems By Id
[**getDBServerSystems**](TessellDbServerSystemControllerApi.md#getDBServerSystems) | **GET** /tessell-ops/dbserver-systems | View a list of available Tessell DBServer Systems
[**getDbssCrMapping**](TessellDbServerSystemControllerApi.md#getDbssCrMapping) | **GET** /tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resource | View a list of available Tessell DBServer System and Compute Resource Mappings
[**getDbssCrMappings**](TessellDbServerSystemControllerApi.md#getDbssCrMappings) | **GET** /tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources | View a list of available Tessell DBServer System and Compute Resource Mappings
[**updateDBServerSystem**](TessellDbServerSystemControllerApi.md#updateDBServerSystem) | **PATCH** /tessell-ops/dbserver-systems/{id} | Update a Tessell DBServer System
[**updateDbssCrMapping**](TessellDbServerSystemControllerApi.md#updateDbssCrMapping) | **PATCH** /tessell-ops/dbserver-systems/{dbserverSystemId}/compute-resources/{computeResourceId} | Update a Tessell DBServer System and Compute Resource Mapping



## createDBServerSystem

> TessellDBServerSystemDTO createDBServerSystem(tessellDBServerSystemDTO)

Create a new Tessell DBServer System

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        TessellDBServerSystemDTO tessellDBServerSystemDTO = new TessellDBServerSystemDTO(); // TessellDBServerSystemDTO | 
        try {
            TessellDBServerSystemDTO result = apiInstance.createDBServerSystem(tessellDBServerSystemDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#createDBServerSystem");
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
 **tessellDBServerSystemDTO** | [**TessellDBServerSystemDTO**](TessellDBServerSystemDTO.md)|  |

### Return type

[**TessellDBServerSystemDTO**](TessellDBServerSystemDTO.md)

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


## createDbssCrMapping

> TessellDbssCrMappingDTO createDbssCrMapping(dbserverSystemId, tessellDbssCrMappingDTO)

Create a new Tessell DBServer System and Compute Resource Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID dbserverSystemId = new UUID(); // UUID | dbserverSystemId
        TessellDbssCrMappingDTO tessellDbssCrMappingDTO = new TessellDbssCrMappingDTO(); // TessellDbssCrMappingDTO | 
        try {
            TessellDbssCrMappingDTO result = apiInstance.createDbssCrMapping(dbserverSystemId, tessellDbssCrMappingDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#createDbssCrMapping");
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
 **dbserverSystemId** | [**UUID**](.md)| dbserverSystemId |
 **tessellDbssCrMappingDTO** | [**TessellDbssCrMappingDTO**](TessellDbssCrMappingDTO.md)|  |

### Return type

[**TessellDbssCrMappingDTO**](TessellDbssCrMappingDTO.md)

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


## deleteDBServerSystem

> ApiStatus deleteDBServerSystem(id, softDelete)

Delete a Tessell DBServer System

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDBServerSystem(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#deleteDBServerSystem");
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


## deleteDbssCrMapping

> ApiStatus deleteDbssCrMapping(dbserverSystemId, computeResourceId, softDelete)

Delete a Tessell DBServer System and Compute Resource Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID dbserverSystemId = new UUID(); // UUID | dbserverSystemId
        UUID computeResourceId = new UUID(); // UUID | computeResourceId
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDbssCrMapping(dbserverSystemId, computeResourceId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#deleteDbssCrMapping");
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
 **dbserverSystemId** | [**UUID**](.md)| dbserverSystemId |
 **computeResourceId** | [**UUID**](.md)| computeResourceId |
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


## getDBServerSystemById

> TessellDBServerSystemDTO getDBServerSystemById(id, loadComputeResourceMappings, loadComputeResources)

View available Tessell DBServer Systems By Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean loadComputeResourceMappings = true; // Boolean | load-compute-resource-mappings
        Boolean loadComputeResources = true; // Boolean | load-compute-resources
        try {
            TessellDBServerSystemDTO result = apiInstance.getDBServerSystemById(id, loadComputeResourceMappings, loadComputeResources);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#getDBServerSystemById");
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
 **loadComputeResourceMappings** | **Boolean**| load-compute-resource-mappings | [optional] [default to true]
 **loadComputeResources** | **Boolean**| load-compute-resources | [optional] [default to true]

### Return type

[**TessellDBServerSystemDTO**](TessellDBServerSystemDTO.md)

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


## getDBServerSystems

> TessellDBServerSystemListResponse getDBServerSystems(name, status, engineType, all, loadComputeResourceMappings, loadComputeResources, pageSize, pageOffset, timeZone)

View a list of available Tessell DBServer Systems

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        String name = "name_example"; // String | name
        String status = "status_example"; // String | status
        String engineType = "engineType_example"; // String | engine-type
        Boolean all = true; // Boolean | all
        Boolean loadComputeResourceMappings = true; // Boolean | load-compute-resource-mappings
        Boolean loadComputeResources = true; // Boolean | load-compute-resources
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDBServerSystemListResponse result = apiInstance.getDBServerSystems(name, status, engineType, all, loadComputeResourceMappings, loadComputeResources, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#getDBServerSystems");
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
 **status** | **String**| status | [optional]
 **engineType** | **String**| engine-type | [optional]
 **all** | **Boolean**| all | [optional] [default to true]
 **loadComputeResourceMappings** | **Boolean**| load-compute-resource-mappings | [optional] [default to true]
 **loadComputeResources** | **Boolean**| load-compute-resources | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDBServerSystemListResponse**](TessellDBServerSystemListResponse.md)

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


## getDbssCrMapping

> TessellDbssCrMappingDTO getDbssCrMapping(dbserverSystemId, computeResourceId)

View a list of available Tessell DBServer System and Compute Resource Mappings

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID dbserverSystemId = new UUID(); // UUID | dbserverSystemId
        UUID computeResourceId = new UUID(); // UUID | compute-resource-id
        try {
            TessellDbssCrMappingDTO result = apiInstance.getDbssCrMapping(dbserverSystemId, computeResourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#getDbssCrMapping");
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
 **dbserverSystemId** | [**UUID**](.md)| dbserverSystemId |
 **computeResourceId** | [**UUID**](.md)| compute-resource-id | [optional]

### Return type

[**TessellDbssCrMappingDTO**](TessellDbssCrMappingDTO.md)

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


## getDbssCrMappings

> TessellDbssCrMappingListResponse getDbssCrMappings(dbserverSystemId, status, pageSize, pageOffset, timeZone)

View a list of available Tessell DBServer System and Compute Resource Mappings

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID dbserverSystemId = new UUID(); // UUID | dbserverSystemId
        String status = "status_example"; // String | status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDbssCrMappingListResponse result = apiInstance.getDbssCrMappings(dbserverSystemId, status, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#getDbssCrMappings");
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
 **dbserverSystemId** | [**UUID**](.md)| dbserverSystemId |
 **status** | **String**| status | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDbssCrMappingListResponse**](TessellDbssCrMappingListResponse.md)

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


## updateDBServerSystem

> TessellDBServerSystemDTO updateDBServerSystem(id, tessellDBServerSystemDTO)

Update a Tessell DBServer System

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellDBServerSystemDTO tessellDBServerSystemDTO = new TessellDBServerSystemDTO(); // TessellDBServerSystemDTO | 
        try {
            TessellDBServerSystemDTO result = apiInstance.updateDBServerSystem(id, tessellDBServerSystemDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#updateDBServerSystem");
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
 **tessellDBServerSystemDTO** | [**TessellDBServerSystemDTO**](TessellDBServerSystemDTO.md)|  |

### Return type

[**TessellDBServerSystemDTO**](TessellDBServerSystemDTO.md)

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


## updateDbssCrMapping

> TessellDbssCrMappingDTO updateDbssCrMapping(dbserverSystemId, computeResourceId, tessellDbssCrMappingDTO)

Update a Tessell DBServer System and Compute Resource Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDbServerSystemControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDbServerSystemControllerApi apiInstance = new TessellDbServerSystemControllerApi(defaultClient);
        UUID dbserverSystemId = new UUID(); // UUID | dbserverSystemId
        UUID computeResourceId = new UUID(); // UUID | computeResourceId
        TessellDbssCrMappingDTO tessellDbssCrMappingDTO = new TessellDbssCrMappingDTO(); // TessellDbssCrMappingDTO | 
        try {
            TessellDbssCrMappingDTO result = apiInstance.updateDbssCrMapping(dbserverSystemId, computeResourceId, tessellDbssCrMappingDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbServerSystemControllerApi#updateDbssCrMapping");
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
 **dbserverSystemId** | [**UUID**](.md)| dbserverSystemId |
 **computeResourceId** | [**UUID**](.md)| computeResourceId |
 **tessellDbssCrMappingDTO** | [**TessellDbssCrMappingDTO**](TessellDbssCrMappingDTO.md)|  |

### Return type

[**TessellDbssCrMappingDTO**](TessellDbssCrMappingDTO.md)

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

