# TessellConnectionPoolApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConnectionPoolForTessellService**](TessellConnectionPoolApi.md#createConnectionPoolForTessellService) | **POST** /services/{service-id}/connection-pools | Creates a new connection pool for the DB Service
[**createConnectionPoolForTessellServiceCallback**](TessellConnectionPoolApi.md#createConnectionPoolForTessellServiceCallback) | **POST** /tessell-ops/services/{service-id}/connection-pools/callback/create | Callback corresponding to delete connection workflow.
[**deleteConnectionPoolForTessellService**](TessellConnectionPoolApi.md#deleteConnectionPoolForTessellService) | **DELETE** /services/{service-id}/connection-pools | Delete an existing connection pool for the DB Service
[**deleteConnectionPoolForTessellServiceCallback**](TessellConnectionPoolApi.md#deleteConnectionPoolForTessellServiceCallback) | **POST** /tessell-ops/services/{service-id}/connection-pools/callback/delete | Callback corresponding to delete connection workflow.
[**deleteConnectionPoolForTessellServiceOps**](TessellConnectionPoolApi.md#deleteConnectionPoolForTessellServiceOps) | **DELETE** /tessell-ops/services/{service-id}/connection-pools/{connection-pool-id} | Delete the connection pool corresponding to given uuid.
[**getConnectionPoolForTessellServiceOps**](TessellConnectionPoolApi.md#getConnectionPoolForTessellServiceOps) | **GET** /tessell-ops/services/{service-id}/connection-pools/{connection-pool-id} | Get the connection pool corresponding to given uuid.
[**getConnectionPoolsForTessellService**](TessellConnectionPoolApi.md#getConnectionPoolsForTessellService) | **GET** /services/{service-id}/connection-pools | Get list of connection pools for the DB Service
[**getConnectionPoolsForTessellServiceOps**](TessellConnectionPoolApi.md#getConnectionPoolsForTessellServiceOps) | **GET** /tessell-ops/services/{service-id}/connection-pools | Get list of connection pools
[**updateConnectionPoolForTessellService**](TessellConnectionPoolApi.md#updateConnectionPoolForTessellService) | **PATCH** /services/{service-id}/connection-pools/{connection-pool-id} | Update an existing connection pool for the DB Service
[**updateConnectionPoolForTessellServiceCallback**](TessellConnectionPoolApi.md#updateConnectionPoolForTessellServiceCallback) | **POST** /tessell-ops/services/{service-id}/connection-pools/callback/update | Callback corresponding to delete connection workflow.
[**updateConnectionPoolForTessellServiceOps**](TessellConnectionPoolApi.md#updateConnectionPoolForTessellServiceOps) | **PATCH** /tessell-ops/services/{service-id}/connection-pools/{connection-pool-id} | Update the connection pool corresponding to given uuid.



## createConnectionPoolForTessellService

> TaskSummary createConnectionPoolForTessellService(serviceId, createConnectionPoolPayload)

Creates a new connection pool for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        CreateConnectionPoolPayload createConnectionPoolPayload = new CreateConnectionPoolPayload(); // CreateConnectionPoolPayload | 
        try {
            TaskSummary result = apiInstance.createConnectionPoolForTessellService(serviceId, createConnectionPoolPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#createConnectionPoolForTessellService");
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
 **createConnectionPoolPayload** | [**CreateConnectionPoolPayload**](CreateConnectionPoolPayload.md)|  |

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


## createConnectionPoolForTessellServiceCallback

> createConnectionPoolForTessellServiceCallback(serviceId, createConnectionPoolCallbackPayload)

Callback corresponding to delete connection workflow.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        CreateConnectionPoolCallbackPayload createConnectionPoolCallbackPayload = new CreateConnectionPoolCallbackPayload(); // CreateConnectionPoolCallbackPayload | 
        try {
            apiInstance.createConnectionPoolForTessellServiceCallback(serviceId, createConnectionPoolCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#createConnectionPoolForTessellServiceCallback");
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
 **createConnectionPoolCallbackPayload** | [**CreateConnectionPoolCallbackPayload**](CreateConnectionPoolCallbackPayload.md)|  |

### Return type

null (empty response body)

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


## deleteConnectionPoolForTessellService

> TaskSummary deleteConnectionPoolForTessellService(serviceId, deleteConnectionPoolPayload)

Delete an existing connection pool for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        DeleteConnectionPoolPayload deleteConnectionPoolPayload = new DeleteConnectionPoolPayload(); // DeleteConnectionPoolPayload | 
        try {
            TaskSummary result = apiInstance.deleteConnectionPoolForTessellService(serviceId, deleteConnectionPoolPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#deleteConnectionPoolForTessellService");
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
 **deleteConnectionPoolPayload** | [**DeleteConnectionPoolPayload**](DeleteConnectionPoolPayload.md)|  |

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


## deleteConnectionPoolForTessellServiceCallback

> deleteConnectionPoolForTessellServiceCallback(serviceId, deleteConnectionPoolCallbackPayload)

Callback corresponding to delete connection workflow.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        DeleteConnectionPoolCallbackPayload deleteConnectionPoolCallbackPayload = new DeleteConnectionPoolCallbackPayload(); // DeleteConnectionPoolCallbackPayload | 
        try {
            apiInstance.deleteConnectionPoolForTessellServiceCallback(serviceId, deleteConnectionPoolCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#deleteConnectionPoolForTessellServiceCallback");
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
 **deleteConnectionPoolCallbackPayload** | [**DeleteConnectionPoolCallbackPayload**](DeleteConnectionPoolCallbackPayload.md)|  |

### Return type

null (empty response body)

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


## deleteConnectionPoolForTessellServiceOps

> ApiStatus deleteConnectionPoolForTessellServiceOps(serviceId, connectionPoolId, softDelete)

Delete the connection pool corresponding to given uuid.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID connectionPoolId = new UUID(); // UUID | Connection Pool Id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteConnectionPoolForTessellServiceOps(serviceId, connectionPoolId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#deleteConnectionPoolForTessellServiceOps");
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
 **connectionPoolId** | [**UUID**](.md)| Connection Pool Id |
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
| **0** | API error response |  -  |


## getConnectionPoolForTessellServiceOps

> ConnectionPoolOpsInfo getConnectionPoolForTessellServiceOps(serviceId, connectionPoolId)

Get the connection pool corresponding to given uuid.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID connectionPoolId = new UUID(); // UUID | Connection Pool Id
        try {
            ConnectionPoolOpsInfo result = apiInstance.getConnectionPoolForTessellServiceOps(serviceId, connectionPoolId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#getConnectionPoolForTessellServiceOps");
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
 **connectionPoolId** | [**UUID**](.md)| Connection Pool Id |

### Return type

[**ConnectionPoolOpsInfo**](ConnectionPoolOpsInfo.md)

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


## getConnectionPoolsForTessellService

> ConnectionPoolListResponse getConnectionPoolsForTessellService(serviceId, name)

Get list of connection pools for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        String name = "name_example"; // String | Name of connection pool whose details will be returned.
        try {
            ConnectionPoolListResponse result = apiInstance.getConnectionPoolsForTessellService(serviceId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#getConnectionPoolsForTessellService");
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
 **name** | **String**| Name of connection pool whose details will be returned. | [optional]

### Return type

[**ConnectionPoolListResponse**](ConnectionPoolListResponse.md)

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


## getConnectionPoolsForTessellServiceOps

> ConnectionPoolListOpsResponse getConnectionPoolsForTessellServiceOps(serviceId, name)

Get list of connection pools

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        String name = "name_example"; // String | Name of connection pool whose details will be returned.
        try {
            ConnectionPoolListOpsResponse result = apiInstance.getConnectionPoolsForTessellServiceOps(serviceId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#getConnectionPoolsForTessellServiceOps");
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
 **name** | **String**| Name of connection pool whose details will be returned. | [optional]

### Return type

[**ConnectionPoolListOpsResponse**](ConnectionPoolListOpsResponse.md)

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


## updateConnectionPoolForTessellService

> TaskSummary updateConnectionPoolForTessellService(serviceId, connectionPoolId, updateConnectionPoolPayload)

Update an existing connection pool for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID connectionPoolId = new UUID(); // UUID | The ID of the connection pool
        UpdateConnectionPoolPayload updateConnectionPoolPayload = new UpdateConnectionPoolPayload(); // UpdateConnectionPoolPayload | 
        try {
            TaskSummary result = apiInstance.updateConnectionPoolForTessellService(serviceId, connectionPoolId, updateConnectionPoolPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#updateConnectionPoolForTessellService");
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
 **connectionPoolId** | [**UUID**](.md)| The ID of the connection pool |
 **updateConnectionPoolPayload** | [**UpdateConnectionPoolPayload**](UpdateConnectionPoolPayload.md)|  |

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


## updateConnectionPoolForTessellServiceCallback

> updateConnectionPoolForTessellServiceCallback(serviceId, updateConnectionPoolCallbackPayload)

Callback corresponding to delete connection workflow.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UpdateConnectionPoolCallbackPayload updateConnectionPoolCallbackPayload = new UpdateConnectionPoolCallbackPayload(); // UpdateConnectionPoolCallbackPayload | 
        try {
            apiInstance.updateConnectionPoolForTessellServiceCallback(serviceId, updateConnectionPoolCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#updateConnectionPoolForTessellServiceCallback");
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
 **updateConnectionPoolCallbackPayload** | [**UpdateConnectionPoolCallbackPayload**](UpdateConnectionPoolCallbackPayload.md)|  |

### Return type

null (empty response body)

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


## updateConnectionPoolForTessellServiceOps

> ConnectionPoolOpsInfo updateConnectionPoolForTessellServiceOps(serviceId, connectionPoolId, connectionPoolOpsInfo)

Update the connection pool corresponding to given uuid.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellConnectionPoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellConnectionPoolApi apiInstance = new TessellConnectionPoolApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID connectionPoolId = new UUID(); // UUID | Connection Pool Id
        ConnectionPoolOpsInfo connectionPoolOpsInfo = new ConnectionPoolOpsInfo(); // ConnectionPoolOpsInfo | 
        try {
            ConnectionPoolOpsInfo result = apiInstance.updateConnectionPoolForTessellServiceOps(serviceId, connectionPoolId, connectionPoolOpsInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellConnectionPoolApi#updateConnectionPoolForTessellServiceOps");
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
 **connectionPoolId** | [**UUID**](.md)| Connection Pool Id |
 **connectionPoolOpsInfo** | [**ConnectionPoolOpsInfo**](ConnectionPoolOpsInfo.md)|  |

### Return type

[**ConnectionPoolOpsInfo**](ConnectionPoolOpsInfo.md)

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

