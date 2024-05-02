# TessellDatabaseControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatabaseOps**](TessellDatabaseControllerApi.md#createDatabaseOps) | **POST** /tessell-ops/services/{service-id}/databases | Create a Database
[**createDatabaseOpsRequest**](TessellDatabaseControllerApi.md#createDatabaseOpsRequest) | **POST** /tessell-ops/services/{service-id}/databases/create | Create a new database in a Tessell service. Note that this is an \&quot;tessell-ops\&quot; version of post &#39;/services/{service-id}/databases&#39;
[**createTessellServiceDatabase**](TessellDatabaseControllerApi.md#createTessellServiceDatabase) | **POST** /services/{service-id}/databases | Create a new database in a DB service
[**createUpdateDatabaseStorageMapping**](TessellDatabaseControllerApi.md#createUpdateDatabaseStorageMapping) | **POST** /tessell-ops/services/{service-id}/storages | Create a new Tessell Database Storage Mapping
[**createUpdateTessellServiceInstanceMetadata**](TessellDatabaseControllerApi.md#createUpdateTessellServiceInstanceMetadata) | **POST** /tessell-ops/services/{serviceId}/service-instances/{id}/metadata | Create a new Tessell Database Node Metadata
[**crudDatabaseCallback**](TessellDatabaseControllerApi.md#crudDatabaseCallback) | **POST** /tessell-ops/services/{service-id}/databases/callback | Callback corresponding to delete connection workflow.
[**deleteDBStorageMapping**](TessellDatabaseControllerApi.md#deleteDBStorageMapping) | **DELETE** /tessell-ops/services/{service-id}/storages/{storageId} | Delete a Tessell Database Storage Mapping
[**deleteDatabaseStorageMapping**](TessellDatabaseControllerApi.md#deleteDatabaseStorageMapping) | **DELETE** /tessell-ops/services/{service-id}/storages | Delete a Tessell Database Storage Mapping
[**deleteTessellServiceDatabase**](TessellDatabaseControllerApi.md#deleteTessellServiceDatabase) | **DELETE** /services/{service-id}/databases/{database-id} | Delete a database
[**deleteTessellServiceDatabaseOps**](TessellDatabaseControllerApi.md#deleteTessellServiceDatabaseOps) | **DELETE** /tessell-ops/services/{service-id}/databases/{id} | Delete a Tessell Database
[**deleteTessellServiceDatabaseOpsRequest**](TessellDatabaseControllerApi.md#deleteTessellServiceDatabaseOpsRequest) | **DELETE** /tessell-ops/services/{service-id}/databases/{id}/delete | Delete a Tessell Database
[**deleteTessellServiceInstanceMetadata**](TessellDatabaseControllerApi.md#deleteTessellServiceInstanceMetadata) | **DELETE** /tessell-ops/services/{serviceId}/service-instances/{id}/metadata | Delete a Tessell Database Node
[**getDBStorageMapping**](TessellDatabaseControllerApi.md#getDBStorageMapping) | **GET** /tessell-ops/services/{service-id}/storages/{storageId} | View a list of available Tessell Database Storage Mapping
[**getDatabaseStorageMappings**](TessellDatabaseControllerApi.md#getDatabaseStorageMappings) | **GET** /tessell-ops/services/{service-id}/storages | View a list of available Tessell Database Storage Mapping
[**getTessellServiceDatabaseOps**](TessellDatabaseControllerApi.md#getTessellServiceDatabaseOps) | **GET** /tessell-ops/services/{service-id}/databases/{id} | View a Tessell Databases by Id
[**getTessellServiceDatabasesOps**](TessellDatabaseControllerApi.md#getTessellServiceDatabasesOps) | **GET** /tessell-ops/services/{service-id}/databases | Get databases
[**getTessellServiceInstanceMetadata**](TessellDatabaseControllerApi.md#getTessellServiceInstanceMetadata) | **GET** /tessell-ops/services/{serviceId}/service-instances/{id}/metadata | View a list of available Tessell Database Node Metadata
[**getTessellServiceInstanceMetadataLatestVersion**](TessellDatabaseControllerApi.md#getTessellServiceInstanceMetadataLatestVersion) | **GET** /tessell-ops/services/{serviceId}/service-instances/{id}/metadata/version/{version} | View a list of available DB Service Instance Metadata
[**updateTessellServiceDatabase**](TessellDatabaseControllerApi.md#updateTessellServiceDatabase) | **PATCH** /services/{service-id}/databases/{database-id} | Update a database
[**updateTessellServiceDatabaseOps**](TessellDatabaseControllerApi.md#updateTessellServiceDatabaseOps) | **PATCH** /tessell-ops/services/{service-id}/databases/{id} | Update a Tessell Database



## createDatabaseOps

> TessellDatabaseOpsDTO createDatabaseOps(serviceId, tessellDatabaseOpsDTO)

Create a Database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        TessellDatabaseOpsDTO tessellDatabaseOpsDTO = new TessellDatabaseOpsDTO(); // TessellDatabaseOpsDTO | 
        try {
            TessellDatabaseOpsDTO result = apiInstance.createDatabaseOps(serviceId, tessellDatabaseOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#createDatabaseOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **tessellDatabaseOpsDTO** | [**TessellDatabaseOpsDTO**](TessellDatabaseOpsDTO.md)|  |

### Return type

[**TessellDatabaseOpsDTO**](TessellDatabaseOpsDTO.md)

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


## createDatabaseOpsRequest

> TaskSummary createDatabaseOpsRequest(serviceId, createDatabasePayload)

Create a new database in a Tessell service. Note that this is an \&quot;tessell-ops\&quot; version of post &#39;/services/{service-id}/databases&#39;

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        List<CreateDatabasePayload> createDatabasePayload = Arrays.asList(); // List<CreateDatabasePayload> | 
        try {
            TaskSummary result = apiInstance.createDatabaseOpsRequest(serviceId, createDatabasePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#createDatabaseOpsRequest");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **createDatabasePayload** | [**List&lt;CreateDatabasePayload&gt;**](CreateDatabasePayload.md)|  |

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


## createTessellServiceDatabase

> TaskSummary createTessellServiceDatabase(serviceId, createDatabasePayload)

Create a new database in a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service to which database will be added
        List<CreateDatabasePayload> createDatabasePayload = Arrays.asList(); // List<CreateDatabasePayload> | 
        try {
            TaskSummary result = apiInstance.createTessellServiceDatabase(serviceId, createDatabasePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#createTessellServiceDatabase");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service to which database will be added |
 **createDatabasePayload** | [**List&lt;CreateDatabasePayload&gt;**](CreateDatabasePayload.md)|  |

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


## createUpdateDatabaseStorageMapping

> TessellServiceStorageMappingDTO createUpdateDatabaseStorageMapping(serviceId, tessellServiceStorageMappingDTO)

Create a new Tessell Database Storage Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        TessellServiceStorageMappingDTO tessellServiceStorageMappingDTO = new TessellServiceStorageMappingDTO(); // TessellServiceStorageMappingDTO | 
        try {
            TessellServiceStorageMappingDTO result = apiInstance.createUpdateDatabaseStorageMapping(serviceId, tessellServiceStorageMappingDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#createUpdateDatabaseStorageMapping");
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
 **tessellServiceStorageMappingDTO** | [**TessellServiceStorageMappingDTO**](TessellServiceStorageMappingDTO.md)|  |

### Return type

[**TessellServiceStorageMappingDTO**](TessellServiceStorageMappingDTO.md)

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


## createUpdateTessellServiceInstanceMetadata

> TessellServiceMetadataDTO createUpdateTessellServiceInstanceMetadata(serviceId, id, tessellServiceMetadataDTO)

Create a new Tessell Database Node Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | serviceId
        UUID id = new UUID(); // UUID | id
        TessellServiceMetadataDTO tessellServiceMetadataDTO = new TessellServiceMetadataDTO(); // TessellServiceMetadataDTO | 
        try {
            TessellServiceMetadataDTO result = apiInstance.createUpdateTessellServiceInstanceMetadata(serviceId, id, tessellServiceMetadataDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#createUpdateTessellServiceInstanceMetadata");
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
 **serviceId** | [**UUID**](.md)| serviceId |
 **id** | [**UUID**](.md)| id |
 **tessellServiceMetadataDTO** | [**TessellServiceMetadataDTO**](TessellServiceMetadataDTO.md)|  |

### Return type

[**TessellServiceMetadataDTO**](TessellServiceMetadataDTO.md)

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


## crudDatabaseCallback

> ApiStatus crudDatabaseCallback(serviceId, crudDatabaseCallbackPayload)

Callback corresponding to delete connection workflow.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        CrudDatabaseCallbackPayload crudDatabaseCallbackPayload = new CrudDatabaseCallbackPayload(); // CrudDatabaseCallbackPayload | 
        try {
            ApiStatus result = apiInstance.crudDatabaseCallback(serviceId, crudDatabaseCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#crudDatabaseCallback");
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
 **crudDatabaseCallbackPayload** | [**CrudDatabaseCallbackPayload**](CrudDatabaseCallbackPayload.md)|  |

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


## deleteDBStorageMapping

> ApiStatus deleteDBStorageMapping(serviceId, storageId, softDelete)

Delete a Tessell Database Storage Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID storageId = new UUID(); // UUID | storageId
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDBStorageMapping(serviceId, storageId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteDBStorageMapping");
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
 **storageId** | [**UUID**](.md)| storageId |
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


## deleteDatabaseStorageMapping

> ApiStatus deleteDatabaseStorageMapping(serviceId, cloudAccountId, cloudLocation, softDelete)

Delete a Tessell Database Storage Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID cloudAccountId = new UUID(); // UUID | cloud-account-id
        String cloudLocation = "cloudLocation_example"; // String | cloud-location
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDatabaseStorageMapping(serviceId, cloudAccountId, cloudLocation, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteDatabaseStorageMapping");
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
 **cloudAccountId** | [**UUID**](.md)| cloud-account-id | [optional]
 **cloudLocation** | **String**| cloud-location | [optional]
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


## deleteTessellServiceDatabase

> TaskSummary deleteTessellServiceDatabase(serviceId, databaseId)

Delete a database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID databaseId = new UUID(); // UUID | The ID of the database in the DB Service
        try {
            TaskSummary result = apiInstance.deleteTessellServiceDatabase(serviceId, databaseId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteTessellServiceDatabase");
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
 **databaseId** | [**UUID**](.md)| The ID of the database in the DB Service |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteTessellServiceDatabaseOps

> ApiStatus deleteTessellServiceDatabaseOps(serviceId, id, softDelete)

Delete a Tessell Database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        UUID id = new UUID(); // UUID | Database Id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteTessellServiceDatabaseOps(serviceId, id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteTessellServiceDatabaseOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **id** | [**UUID**](.md)| Database Id |
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


## deleteTessellServiceDatabaseOpsRequest

> TaskSummary deleteTessellServiceDatabaseOpsRequest(serviceId, id, tessellDatabaseDeleteOpsRequestPayload)

Delete a Tessell Database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        UUID id = new UUID(); // UUID | Database Id
        TessellDatabaseDeleteOpsRequestPayload tessellDatabaseDeleteOpsRequestPayload = new TessellDatabaseDeleteOpsRequestPayload(); // TessellDatabaseDeleteOpsRequestPayload | 
        try {
            TaskSummary result = apiInstance.deleteTessellServiceDatabaseOpsRequest(serviceId, id, tessellDatabaseDeleteOpsRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteTessellServiceDatabaseOpsRequest");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **id** | [**UUID**](.md)| Database Id |
 **tessellDatabaseDeleteOpsRequestPayload** | [**TessellDatabaseDeleteOpsRequestPayload**](TessellDatabaseDeleteOpsRequestPayload.md)|  |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## deleteTessellServiceInstanceMetadata

> ApiStatus deleteTessellServiceInstanceMetadata(serviceId, id, version)

Delete a Tessell Database Node

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | serviceId
        UUID id = new UUID(); // UUID | id
        Integer version = 56; // Integer | version
        try {
            ApiStatus result = apiInstance.deleteTessellServiceInstanceMetadata(serviceId, id, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#deleteTessellServiceInstanceMetadata");
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
 **serviceId** | [**UUID**](.md)| serviceId |
 **id** | [**UUID**](.md)| id |
 **version** | **Integer**| version |

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


## getDBStorageMapping

> TessellServiceStorageMappingDTO getDBStorageMapping(serviceId, storageId, timeZone)

View a list of available Tessell Database Storage Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID storageId = new UUID(); // UUID | storageId
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceStorageMappingDTO result = apiInstance.getDBStorageMapping(serviceId, storageId, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getDBStorageMapping");
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
 **storageId** | [**UUID**](.md)| storageId |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceStorageMappingDTO**](TessellServiceStorageMappingDTO.md)

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


## getDatabaseStorageMappings

> TessellDatabaseStorageMappingListResponse getDatabaseStorageMappings(serviceId, cloudAccountId, cloudLocation, statuses, skipStatuses, storagePurpose, pageSize, pageOffset, timeZone)

View a list of available Tessell Database Storage Mapping

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID cloudAccountId = new UUID(); // UUID | cloud-account-id
        String cloudLocation = "cloudLocation_example"; // String | cloud-location
        List<DatabaseStorageMappingStatus> statuses = Arrays.asList(); // List<DatabaseStorageMappingStatus> | 
        List<DatabaseStorageMappingStatus> skipStatuses = Arrays.asList(); // List<DatabaseStorageMappingStatus> | 
        String storagePurpose = "storagePurpose_example"; // String | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseStorageMappingListResponse result = apiInstance.getDatabaseStorageMappings(serviceId, cloudAccountId, cloudLocation, statuses, skipStatuses, storagePurpose, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getDatabaseStorageMappings");
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
 **cloudAccountId** | [**UUID**](.md)| cloud-account-id | [optional]
 **cloudLocation** | **String**| cloud-location | [optional]
 **statuses** | [**List&lt;DatabaseStorageMappingStatus&gt;**](DatabaseStorageMappingStatus.md)|  | [optional]
 **skipStatuses** | [**List&lt;DatabaseStorageMappingStatus&gt;**](DatabaseStorageMappingStatus.md)|  | [optional]
 **storagePurpose** | **String**|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseStorageMappingListResponse**](TessellDatabaseStorageMappingListResponse.md)

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


## getTessellServiceDatabaseOps

> TessellDatabaseOpsDTO getTessellServiceDatabaseOps(serviceId, id)

View a Tessell Databases by Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        UUID id = new UUID(); // UUID | Database Id
        try {
            TessellDatabaseOpsDTO result = apiInstance.getTessellServiceDatabaseOps(serviceId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getTessellServiceDatabaseOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **id** | [**UUID**](.md)| Database Id |

### Return type

[**TessellDatabaseOpsDTO**](TessellDatabaseOpsDTO.md)

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


## getTessellServiceDatabasesOps

> TessellDatabasesOpsResponse getTessellServiceDatabasesOps(serviceId, name, status, pageSize, pageOffset, timeZone)

Get databases

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        String name = "name_example"; // String | name
        List<DatabaseStatusOps> status = Arrays.asList(); // List<DatabaseStatusOps> | list of status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabasesOpsResponse result = apiInstance.getTessellServiceDatabasesOps(serviceId, name, status, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getTessellServiceDatabasesOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **name** | **String**| name | [optional]
 **status** | [**List&lt;DatabaseStatusOps&gt;**](DatabaseStatusOps.md)| list of status | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabasesOpsResponse**](TessellDatabasesOpsResponse.md)

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


## getTessellServiceInstanceMetadata

> TessellServiceMetadataListResponse getTessellServiceInstanceMetadata(serviceId, id, all, pageSize, pageOffset, timeZone)

View a list of available Tessell Database Node Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | serviceId
        UUID id = new UUID(); // UUID | id
        Boolean all = true; // Boolean | all
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceMetadataListResponse result = apiInstance.getTessellServiceInstanceMetadata(serviceId, id, all, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getTessellServiceInstanceMetadata");
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
 **serviceId** | [**UUID**](.md)| serviceId |
 **id** | [**UUID**](.md)| id |
 **all** | **Boolean**| all | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceMetadataListResponse**](TessellServiceMetadataListResponse.md)

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


## getTessellServiceInstanceMetadataLatestVersion

> TessellServiceMetadataDTO getTessellServiceInstanceMetadataLatestVersion(serviceId, id, version)

View a list of available DB Service Instance Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | serviceId
        UUID id = new UUID(); // UUID | id
        String version = "version_example"; // String | version
        try {
            TessellServiceMetadataDTO result = apiInstance.getTessellServiceInstanceMetadataLatestVersion(serviceId, id, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#getTessellServiceInstanceMetadataLatestVersion");
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
 **serviceId** | [**UUID**](.md)| serviceId |
 **id** | [**UUID**](.md)| id |
 **version** | **String**| version |

### Return type

[**TessellServiceMetadataDTO**](TessellServiceMetadataDTO.md)

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


## updateTessellServiceDatabase

> ApiStatus updateTessellServiceDatabase(serviceId, databaseId, updateDatabasePayload)

Update a database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UUID databaseId = new UUID(); // UUID | The ID of the database in the DB Service
        UpdateDatabasePayload updateDatabasePayload = new UpdateDatabasePayload(); // UpdateDatabasePayload | 
        try {
            ApiStatus result = apiInstance.updateTessellServiceDatabase(serviceId, databaseId, updateDatabasePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#updateTessellServiceDatabase");
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
 **databaseId** | [**UUID**](.md)| The ID of the database in the DB Service |
 **updateDatabasePayload** | [**UpdateDatabasePayload**](UpdateDatabasePayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## updateTessellServiceDatabaseOps

> TessellDatabaseOpsDTO updateTessellServiceDatabaseOps(serviceId, id, tessellDatabaseOpsDTO)

Update a Tessell Database

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellDatabaseControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellDatabaseControllerApi apiInstance = new TessellDatabaseControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        UUID id = new UUID(); // UUID | Database Id
        TessellDatabaseOpsDTO tessellDatabaseOpsDTO = new TessellDatabaseOpsDTO(); // TessellDatabaseOpsDTO | 
        try {
            TessellDatabaseOpsDTO result = apiInstance.updateTessellServiceDatabaseOps(serviceId, id, tessellDatabaseOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseControllerApi#updateTessellServiceDatabaseOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **id** | [**UUID**](.md)| Database Id |
 **tessellDatabaseOpsDTO** | [**TessellDatabaseOpsDTO**](TessellDatabaseOpsDTO.md)|  |

### Return type

[**TessellDatabaseOpsDTO**](TessellDatabaseOpsDTO.md)

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

