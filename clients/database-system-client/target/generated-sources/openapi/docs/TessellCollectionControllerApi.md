# TessellCollectionControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**collectionCallback**](TessellCollectionControllerApi.md#collectionCallback) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections/callback | Common Callback for create delete Collection
[**createDbCollection**](TessellCollectionControllerApi.md#createDbCollection) | **POST** /services/{service-id}/databases/{database-id}/collections | Create a collection for given database ID
[**createDbCollectionIndex**](TessellCollectionControllerApi.md#createDbCollectionIndex) | **POST** /services/{service-id}/databases/{database-id}/collections/{collection-id}/indices | Create a index for given collection ID
[**createDbCollectionIndexOps**](TessellCollectionControllerApi.md#createDbCollectionIndexOps) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices | Create a index for given collection-id
[**createDbCollectionOps**](TessellCollectionControllerApi.md#createDbCollectionOps) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections | Create a collection for given database-id
[**deleteDbCollection**](TessellCollectionControllerApi.md#deleteDbCollection) | **DELETE** /services/{service-id}/databases/{database-id}/collections/{collection-id} | Delete collection for given collection ID
[**deleteDbCollectionIndex**](TessellCollectionControllerApi.md#deleteDbCollectionIndex) | **DELETE** /services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id} | Delete collection for given collection name
[**deleteDbCollectionIndexOps**](TessellCollectionControllerApi.md#deleteDbCollectionIndexOps) | **DELETE** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id} | Delete Index for given collection index
[**deleteDbCollectionOps**](TessellCollectionControllerApi.md#deleteDbCollectionOps) | **DELETE** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id} | Delete collection for given collection ID
[**getDbCollectionById**](TessellCollectionControllerApi.md#getDbCollectionById) | **GET** /services/{service-id}/databases/{database-id}/collections/{collection-id} | Get all collections for given database ID
[**getDbCollectionByIdOps**](TessellCollectionControllerApi.md#getDbCollectionByIdOps) | **GET** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id} | Get collection for given collection ID
[**getDbCollectionIndexById**](TessellCollectionControllerApi.md#getDbCollectionIndexById) | **GET** /services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id} | Get index for the given index ID
[**getDbCollectionIndexByIdOps**](TessellCollectionControllerApi.md#getDbCollectionIndexByIdOps) | **GET** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id} | Get all indices for the given collection id
[**getDbCollectionIndices**](TessellCollectionControllerApi.md#getDbCollectionIndices) | **GET** /services/{service-id}/databases/{database-id}/collections/{collection-id}/indices | Get all indices for the given collection ID
[**getDbCollectionIndicesOps**](TessellCollectionControllerApi.md#getDbCollectionIndicesOps) | **GET** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices | Get all indices for the given collection ID
[**getDbCollections**](TessellCollectionControllerApi.md#getDbCollections) | **GET** /services/{service-id}/databases/{database-id}/collections | Get all collections for the given database-id
[**getDbCollectionsOps**](TessellCollectionControllerApi.md#getDbCollectionsOps) | **GET** /tessell-ops/services/{service-id}/databases/{database-id}/collections | Get all collection for given database-id
[**indicesCallback**](TessellCollectionControllerApi.md#indicesCallback) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/callback | Callback for Load Collections
[**loadDbCollection**](TessellCollectionControllerApi.md#loadDbCollection) | **POST** /services/{service-id}/databases/{database-id}/collections/{collection-id}/load | Load collection into memory for given collection ID
[**loadDbCollectionCallback**](TessellCollectionControllerApi.md#loadDbCollectionCallback) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/load/callback | Callback for Load Collections
[**releaseDbCollection**](TessellCollectionControllerApi.md#releaseDbCollection) | **POST** /services/{service-id}/databases/{database-id}/collections/{collection-id}/release | Release collection from memory for given collection name
[**releaseDbCollectionCallback**](TessellCollectionControllerApi.md#releaseDbCollectionCallback) | **POST** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/release/callback | Callback for Load Collections
[**updateDbCollection**](TessellCollectionControllerApi.md#updateDbCollection) | **PATCH** /services/{service-id}/databases/{database-id}/collections/{collection-id} | Update collection for given collection ID
[**updateDbCollectionIndexOps**](TessellCollectionControllerApi.md#updateDbCollectionIndexOps) | **PATCH** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id} | Update collection for given index id for given.
[**updateDbCollectionOps**](TessellCollectionControllerApi.md#updateDbCollectionOps) | **PATCH** /tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id} | Update collection for given collection ID



## collectionCallback

> ApiStatus collectionCallback(serviceId, databaseId, collectionsCallbackPayload)

Common Callback for create delete Collection

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        CollectionsCallbackPayload collectionsCallbackPayload = new CollectionsCallbackPayload(); // CollectionsCallbackPayload | 
        try {
            ApiStatus result = apiInstance.collectionCallback(serviceId, databaseId, collectionsCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#collectionCallback");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionsCallbackPayload** | [**CollectionsCallbackPayload**](CollectionsCallbackPayload.md)|  | [optional]

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## createDbCollection

> TaskSummary createDbCollection(serviceId, databaseId, dbCollectionCreatePayload)

Create a collection for given database ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        DbCollectionCreatePayload dbCollectionCreatePayload = new DbCollectionCreatePayload(); // DbCollectionCreatePayload | 
        try {
            TaskSummary result = apiInstance.createDbCollection(serviceId, databaseId, dbCollectionCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#createDbCollection");
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
 **databaseId** | [**UUID**](.md)|  |
 **dbCollectionCreatePayload** | [**DbCollectionCreatePayload**](DbCollectionCreatePayload.md)|  | [optional]

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


## createDbCollectionIndex

> TaskSummary createDbCollectionIndex(serviceId, databaseId, collectionId, dbCollectionIndexPayload)

Create a index for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        DbCollectionIndexPayload dbCollectionIndexPayload = new DbCollectionIndexPayload(); // DbCollectionIndexPayload | 
        try {
            TaskSummary result = apiInstance.createDbCollectionIndex(serviceId, databaseId, collectionId, dbCollectionIndexPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#createDbCollectionIndex");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **dbCollectionIndexPayload** | [**DbCollectionIndexPayload**](DbCollectionIndexPayload.md)|  | [optional]

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


## createDbCollectionIndexOps

> DbCollectionIndexOpsDTO createDbCollectionIndexOps(serviceId, databaseId, collectionId, dbCollectionIndexOpsDTO)

Create a index for given collection-id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO = new DbCollectionIndexOpsDTO(); // DbCollectionIndexOpsDTO | 
        try {
            DbCollectionIndexOpsDTO result = apiInstance.createDbCollectionIndexOps(serviceId, databaseId, collectionId, dbCollectionIndexOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#createDbCollectionIndexOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **dbCollectionIndexOpsDTO** | [**DbCollectionIndexOpsDTO**](DbCollectionIndexOpsDTO.md)|  | [optional]

### Return type

[**DbCollectionIndexOpsDTO**](DbCollectionIndexOpsDTO.md)

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


## createDbCollectionOps

> DbCollectionOpsDTO createDbCollectionOps(serviceId, databaseId, dbCollectionOpsDTO)

Create a collection for given database-id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        DbCollectionOpsDTO dbCollectionOpsDTO = new DbCollectionOpsDTO(); // DbCollectionOpsDTO | 
        try {
            DbCollectionOpsDTO result = apiInstance.createDbCollectionOps(serviceId, databaseId, dbCollectionOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#createDbCollectionOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **dbCollectionOpsDTO** | [**DbCollectionOpsDTO**](DbCollectionOpsDTO.md)|  | [optional]

### Return type

[**DbCollectionOpsDTO**](DbCollectionOpsDTO.md)

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


## deleteDbCollection

> TaskSummary deleteDbCollection(serviceId, databaseId, collectionId, deleteDbCollectionPayload)

Delete collection for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        DeleteDbCollectionPayload deleteDbCollectionPayload = new DeleteDbCollectionPayload(); // DeleteDbCollectionPayload | 
        try {
            TaskSummary result = apiInstance.deleteDbCollection(serviceId, databaseId, collectionId, deleteDbCollectionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#deleteDbCollection");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **deleteDbCollectionPayload** | [**DeleteDbCollectionPayload**](DeleteDbCollectionPayload.md)|  | [optional]

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


## deleteDbCollectionIndex

> TaskSummary deleteDbCollectionIndex(serviceId, databaseId, collectionId, indexId, deleteDbCollectionIndexPayload)

Delete collection for given collection name

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        UUID indexId = new UUID(); // UUID | 
        DeleteDbCollectionIndexPayload deleteDbCollectionIndexPayload = new DeleteDbCollectionIndexPayload(); // DeleteDbCollectionIndexPayload | 
        try {
            TaskSummary result = apiInstance.deleteDbCollectionIndex(serviceId, databaseId, collectionId, indexId, deleteDbCollectionIndexPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#deleteDbCollectionIndex");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexId** | [**UUID**](.md)|  |
 **deleteDbCollectionIndexPayload** | [**DeleteDbCollectionIndexPayload**](DeleteDbCollectionIndexPayload.md)|  | [optional]

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


## deleteDbCollectionIndexOps

> ApiStatus deleteDbCollectionIndexOps(serviceId, databaseId, collectionId, indexId, softDelete)

Delete Index for given collection index

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        UUID indexId = new UUID(); // UUID | 
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDbCollectionIndexOps(serviceId, databaseId, collectionId, indexId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#deleteDbCollectionIndexOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexId** | [**UUID**](.md)|  |
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


## deleteDbCollectionOps

> ApiStatus deleteDbCollectionOps(serviceId, databaseId, collectionId, softDelete)

Delete collection for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDbCollectionOps(serviceId, databaseId, collectionId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#deleteDbCollectionOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
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


## getDbCollectionById

> DbCollectionDTO getDbCollectionById(serviceId, databaseId, collectionId)

Get all collections for given database ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        try {
            DbCollectionDTO result = apiInstance.getDbCollectionById(serviceId, databaseId, collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionById");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |

### Return type

[**DbCollectionDTO**](DbCollectionDTO.md)

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


## getDbCollectionByIdOps

> DbCollectionOpsDTO getDbCollectionByIdOps(serviceId, databaseId, collectionId)

Get collection for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        try {
            DbCollectionOpsDTO result = apiInstance.getDbCollectionByIdOps(serviceId, databaseId, collectionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionByIdOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |

### Return type

[**DbCollectionOpsDTO**](DbCollectionOpsDTO.md)

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


## getDbCollectionIndexById

> DbCollectionIndexDTO getDbCollectionIndexById(serviceId, databaseId, collectionId, indexId)

Get index for the given index ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        UUID indexId = new UUID(); // UUID | Index ID
        try {
            DbCollectionIndexDTO result = apiInstance.getDbCollectionIndexById(serviceId, databaseId, collectionId, indexId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionIndexById");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexId** | [**UUID**](.md)| Index ID |

### Return type

[**DbCollectionIndexDTO**](DbCollectionIndexDTO.md)

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


## getDbCollectionIndexByIdOps

> DbCollectionIndexOpsDTO getDbCollectionIndexByIdOps(serviceId, databaseId, collectionId, indexId)

Get all indices for the given collection id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        UUID indexId = new UUID(); // UUID | Index Id
        try {
            DbCollectionIndexOpsDTO result = apiInstance.getDbCollectionIndexByIdOps(serviceId, databaseId, collectionId, indexId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionIndexByIdOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexId** | [**UUID**](.md)| Index Id |

### Return type

[**DbCollectionIndexOpsDTO**](DbCollectionIndexOpsDTO.md)

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


## getDbCollectionIndices

> DbCollectionsIndexResponse getDbCollectionIndices(serviceId, databaseId, collectionId, columnName, pageSize, pageOffset, timeZone)

Get all indices for the given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        String columnName = "columnName_example"; // String | Column name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbCollectionsIndexResponse result = apiInstance.getDbCollectionIndices(serviceId, databaseId, collectionId, columnName, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionIndices");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **columnName** | **String**| Column name | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbCollectionsIndexResponse**](DbCollectionsIndexResponse.md)

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


## getDbCollectionIndicesOps

> DbCollectionIndexOpsResponse getDbCollectionIndicesOps(serviceId, databaseId, collectionId, statuses, skipStatuses, columnName, pageSize, pageOffset, timeZone)

Get all indices for the given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        List<DbCollectionIndexStatus> statuses = Arrays.asList(); // List<DbCollectionIndexStatus> | statuses
        List<DbCollectionIndexStatus> skipStatuses = Arrays.asList(); // List<DbCollectionIndexStatus> | statuses
        String columnName = "columnName_example"; // String | Column name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbCollectionIndexOpsResponse result = apiInstance.getDbCollectionIndicesOps(serviceId, databaseId, collectionId, statuses, skipStatuses, columnName, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionIndicesOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **statuses** | [**List&lt;DbCollectionIndexStatus&gt;**](DbCollectionIndexStatus.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;DbCollectionIndexStatus&gt;**](DbCollectionIndexStatus.md)| statuses | [optional]
 **columnName** | **String**| Column name | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbCollectionIndexOpsResponse**](DbCollectionIndexOpsResponse.md)

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


## getDbCollections

> DbCollectionsResponse getDbCollections(serviceId, databaseId, name, pageSize, pageOffset, timeZone)

Get all collections for the given database-id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        String name = "name_example"; // String | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbCollectionsResponse result = apiInstance.getDbCollections(serviceId, databaseId, name, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollections");
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
 **databaseId** | [**UUID**](.md)|  |
 **name** | **String**|  | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbCollectionsResponse**](DbCollectionsResponse.md)

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


## getDbCollectionsOps

> DbCollectionsOpsResponse getDbCollectionsOps(serviceId, databaseId, statuses, skipStatuses, pageSize, pageOffset, timeZone)

Get all collection for given database-id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        List<DbCollectionStatus> statuses = Arrays.asList(); // List<DbCollectionStatus> | statuses
        List<DbCollectionStatus> skipStatuses = Arrays.asList(); // List<DbCollectionStatus> | statuses
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbCollectionsOpsResponse result = apiInstance.getDbCollectionsOps(serviceId, databaseId, statuses, skipStatuses, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#getDbCollectionsOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **statuses** | [**List&lt;DbCollectionStatus&gt;**](DbCollectionStatus.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;DbCollectionStatus&gt;**](DbCollectionStatus.md)| statuses | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbCollectionsOpsResponse**](DbCollectionsOpsResponse.md)

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


## indicesCallback

> ApiStatus indicesCallback(serviceId, databaseId, collectionId, indexCallbackPayload)

Callback for Load Collections

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        IndexCallbackPayload indexCallbackPayload = new IndexCallbackPayload(); // IndexCallbackPayload | 
        try {
            ApiStatus result = apiInstance.indicesCallback(serviceId, databaseId, collectionId, indexCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#indicesCallback");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexCallbackPayload** | [**IndexCallbackPayload**](IndexCallbackPayload.md)|  | [optional]

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## loadDbCollection

> TaskSummary loadDbCollection(serviceId, databaseId, collectionId, loadCollectionPayload)

Load collection into memory for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        LoadCollectionPayload loadCollectionPayload = new LoadCollectionPayload(); // LoadCollectionPayload | 
        try {
            TaskSummary result = apiInstance.loadDbCollection(serviceId, databaseId, collectionId, loadCollectionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#loadDbCollection");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **loadCollectionPayload** | [**LoadCollectionPayload**](LoadCollectionPayload.md)|  | [optional]

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


## loadDbCollectionCallback

> ApiStatus loadDbCollectionCallback(serviceId, databaseId, collectionId, loadCollectionCallbackPayload)

Callback for Load Collections

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        LoadCollectionCallbackPayload loadCollectionCallbackPayload = new LoadCollectionCallbackPayload(); // LoadCollectionCallbackPayload | 
        try {
            ApiStatus result = apiInstance.loadDbCollectionCallback(serviceId, databaseId, collectionId, loadCollectionCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#loadDbCollectionCallback");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **loadCollectionCallbackPayload** | [**LoadCollectionCallbackPayload**](LoadCollectionCallbackPayload.md)|  | [optional]

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## releaseDbCollection

> TaskSummary releaseDbCollection(serviceId, databaseId, collectionId, loadCollectionPayload)

Release collection from memory for given collection name

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        LoadCollectionPayload loadCollectionPayload = new LoadCollectionPayload(); // LoadCollectionPayload | 
        try {
            TaskSummary result = apiInstance.releaseDbCollection(serviceId, databaseId, collectionId, loadCollectionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#releaseDbCollection");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **loadCollectionPayload** | [**LoadCollectionPayload**](LoadCollectionPayload.md)|  | [optional]

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


## releaseDbCollectionCallback

> ApiStatus releaseDbCollectionCallback(serviceId, databaseId, collectionId, releaseCollectionCallbackPayload)

Callback for Load Collections

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        ReleaseCollectionCallbackPayload releaseCollectionCallbackPayload = new ReleaseCollectionCallbackPayload(); // ReleaseCollectionCallbackPayload | 
        try {
            ApiStatus result = apiInstance.releaseDbCollectionCallback(serviceId, databaseId, collectionId, releaseCollectionCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#releaseDbCollectionCallback");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **releaseCollectionCallbackPayload** | [**ReleaseCollectionCallbackPayload**](ReleaseCollectionCallbackPayload.md)|  | [optional]

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## updateDbCollection

> DbCollectionDTO updateDbCollection(serviceId, databaseId, collectionId, dbCollectionCreatePayload)

Update collection for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        DbCollectionCreatePayload dbCollectionCreatePayload = new DbCollectionCreatePayload(); // DbCollectionCreatePayload | 
        try {
            DbCollectionDTO result = apiInstance.updateDbCollection(serviceId, databaseId, collectionId, dbCollectionCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#updateDbCollection");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **dbCollectionCreatePayload** | [**DbCollectionCreatePayload**](DbCollectionCreatePayload.md)|  | [optional]

### Return type

[**DbCollectionDTO**](DbCollectionDTO.md)

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


## updateDbCollectionIndexOps

> DbCollectionIndexOpsDTO updateDbCollectionIndexOps(serviceId, databaseId, collectionId, indexId, dbCollectionIndexOpsDTO)

Update collection for given index id for given.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        UUID indexId = new UUID(); // UUID | 
        DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO = new DbCollectionIndexOpsDTO(); // DbCollectionIndexOpsDTO | 
        try {
            DbCollectionIndexOpsDTO result = apiInstance.updateDbCollectionIndexOps(serviceId, databaseId, collectionId, indexId, dbCollectionIndexOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#updateDbCollectionIndexOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **indexId** | [**UUID**](.md)|  |
 **dbCollectionIndexOpsDTO** | [**DbCollectionIndexOpsDTO**](DbCollectionIndexOpsDTO.md)|  | [optional]

### Return type

[**DbCollectionIndexOpsDTO**](DbCollectionIndexOpsDTO.md)

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


## updateDbCollectionOps

> DbCollectionOpsDTO updateDbCollectionOps(serviceId, databaseId, collectionId, dbCollectionOpsDTO)

Update collection for given collection ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellCollectionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellCollectionControllerApi apiInstance = new TessellCollectionControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UUID databaseId = new UUID(); // UUID | 
        UUID collectionId = new UUID(); // UUID | 
        DbCollectionOpsDTO dbCollectionOpsDTO = new DbCollectionOpsDTO(); // DbCollectionOpsDTO | 
        try {
            DbCollectionOpsDTO result = apiInstance.updateDbCollectionOps(serviceId, databaseId, collectionId, dbCollectionOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCollectionControllerApi#updateDbCollectionOps");
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
 **databaseId** | [**UUID**](.md)|  |
 **collectionId** | [**UUID**](.md)|  |
 **dbCollectionOpsDTO** | [**DbCollectionOpsDTO**](DbCollectionOpsDTO.md)|  | [optional]

### Return type

[**DbCollectionOpsDTO**](DbCollectionOpsDTO.md)

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

