# TessellComputeResourceControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createComputeResourceMetadata**](TessellComputeResourceControllerApi.md#createComputeResourceMetadata) | **POST** /tessell-ops/compute-resources/{computeResourceId}/metadata | Create a new Tessell Compute Resource Metadata
[**createComputeResourceOps**](TessellComputeResourceControllerApi.md#createComputeResourceOps) | **POST** /tessell-ops/compute-resources | Create a new Tessell Compute Resource
[**deleteComputeResource**](TessellComputeResourceControllerApi.md#deleteComputeResource) | **DELETE** /tessell-ops/compute-resources/{id} | Delete a Tessell Compute Resource
[**deleteDbserverComputeResource**](TessellComputeResourceControllerApi.md#deleteDbserverComputeResource) | **DELETE** /compute-resources/dbservers/{id} | Delete a Database Server
[**deleteTessellServerCallback**](TessellComputeResourceControllerApi.md#deleteTessellServerCallback) | **POST** /tessell-ops/compute-resources/callback/delete-server | Callback for delete server
[**getComputeResourceHostingInfoOps**](TessellComputeResourceControllerApi.md#getComputeResourceHostingInfoOps) | **GET** /tessell-ops/compute-resources/{id}/hosting-info | Get a compute resource&#39;s hosting info by id
[**getComputeResourceLogs**](TessellComputeResourceControllerApi.md#getComputeResourceLogs) | **GET** /tessell-ops/compute-resources/{id}/logs | View logs for given file name
[**getComputeResourceMetadata**](TessellComputeResourceControllerApi.md#getComputeResourceMetadata) | **GET** /tessell-ops/compute-resources/{computeResourceId}/metadata | View a list of available Tessell Compute Resource Metadata
[**getComputeResourceMetadataUsingVersion**](TessellComputeResourceControllerApi.md#getComputeResourceMetadataUsingVersion) | **GET** /tessell-ops/compute-resources/{computeResourceId}/metadata/version/{version} | View a list of available Tessell Compute Resource Metadata
[**getComputeResourceOpsById**](TessellComputeResourceControllerApi.md#getComputeResourceOpsById) | **GET** /tessell-ops/compute-resources/{id} | View available Tessell Compute Resources By Id
[**getComputeResourcesOps**](TessellComputeResourceControllerApi.md#getComputeResourcesOps) | **GET** /tessell-ops/compute-resources | View a list of available Tessell Compute Resources
[**getDbserverComputeResource**](TessellComputeResourceControllerApi.md#getDbserverComputeResource) | **GET** /compute-resources/dbservers/{id} | Get a Compute Resource by ID
[**getDbserverComputeResources**](TessellComputeResourceControllerApi.md#getDbserverComputeResources) | **GET** /compute-resources/dbservers | View a list of available Compute Resources
[**getSharingEnabledDbserverComputeResources**](TessellComputeResourceControllerApi.md#getSharingEnabledDbserverComputeResources) | **GET** /compute-resources/dbservers/sharing-enabled | View a list of available Compute Resources that can be used for newer provisioning
[**updateComputeResource**](TessellComputeResourceControllerApi.md#updateComputeResource) | **PATCH** /tessell-ops/compute-resources/{id} | Update a Tessell Compute Resource
[**updateComputeResourceAgentLcmInfoOps**](TessellComputeResourceControllerApi.md#updateComputeResourceAgentLcmInfoOps) | **PATCH** /tessell-ops/compute-resources/{id}/agent-lcm | Update a DB Service Agent LCM Info
[**upgradeEligibilityForComputeResourceOps**](TessellComputeResourceControllerApi.md#upgradeEligibilityForComputeResourceOps) | **GET** /tessell-ops/compute-resources/{id}/library-upgrade-eligibility | Check if Tessell libraries on a compute-resource related can be upgraded



## createComputeResourceMetadata

> TessellComputeResourceMetadata createComputeResourceMetadata(computeResourceId, tessellComputeResourceMetadata)

Create a new Tessell Compute Resource Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID computeResourceId = new UUID(); // UUID | computeResourceId
        TessellComputeResourceMetadata tessellComputeResourceMetadata = new TessellComputeResourceMetadata(); // TessellComputeResourceMetadata | 
        try {
            TessellComputeResourceMetadata result = apiInstance.createComputeResourceMetadata(computeResourceId, tessellComputeResourceMetadata);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#createComputeResourceMetadata");
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
 **computeResourceId** | [**UUID**](.md)| computeResourceId |
 **tessellComputeResourceMetadata** | [**TessellComputeResourceMetadata**](TessellComputeResourceMetadata.md)|  |

### Return type

[**TessellComputeResourceMetadata**](TessellComputeResourceMetadata.md)

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


## createComputeResourceOps

> TessellComputeResourceOpsDTO createComputeResourceOps(tessellComputeResourceOpsDTO)

Create a new Tessell Compute Resource

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO = new TessellComputeResourceOpsDTO(); // TessellComputeResourceOpsDTO | 
        try {
            TessellComputeResourceOpsDTO result = apiInstance.createComputeResourceOps(tessellComputeResourceOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#createComputeResourceOps");
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
 **tessellComputeResourceOpsDTO** | [**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md)|  |

### Return type

[**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md)

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


## deleteComputeResource

> ApiStatus deleteComputeResource(id, softDelete)

Delete a Tessell Compute Resource

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteComputeResource(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#deleteComputeResource");
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


## deleteDbserverComputeResource

> TaskSummary deleteDbserverComputeResource(id)

Delete a Database Server

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            TaskSummary result = apiInstance.deleteDbserverComputeResource(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#deleteDbserverComputeResource");
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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## deleteTessellServerCallback

> ApiStatus deleteTessellServerCallback(deleteTessellServerCallbackPayload)

Callback for delete server

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        DeleteTessellServerCallbackPayload deleteTessellServerCallbackPayload = new DeleteTessellServerCallbackPayload(); // DeleteTessellServerCallbackPayload | 
        try {
            ApiStatus result = apiInstance.deleteTessellServerCallback(deleteTessellServerCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#deleteTessellServerCallback");
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
 **deleteTessellServerCallbackPayload** | [**DeleteTessellServerCallbackPayload**](DeleteTessellServerCallbackPayload.md)|  |

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


## getComputeResourceHostingInfoOps

> ComputeResourceHostingInfo getComputeResourceHostingInfoOps(id, loadTenantInfo, loadInfraConfig, loadGenieConfig, loadNetworkProfile, timeZone)

Get a compute resource&#39;s hosting info by id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the compute resource
        Boolean loadTenantInfo = false; // Boolean | load-tenant-info
        Boolean loadInfraConfig = false; // Boolean | load-infra-config
        Boolean loadGenieConfig = false; // Boolean | load-genie-config
        Boolean loadNetworkProfile = false; // Boolean | load-network-profile
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            ComputeResourceHostingInfo result = apiInstance.getComputeResourceHostingInfoOps(id, loadTenantInfo, loadInfraConfig, loadGenieConfig, loadNetworkProfile, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourceHostingInfoOps");
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
 **id** | [**UUID**](.md)| Id of the compute resource |
 **loadTenantInfo** | **Boolean**| load-tenant-info | [optional] [default to false]
 **loadInfraConfig** | **Boolean**| load-infra-config | [optional] [default to false]
 **loadGenieConfig** | **Boolean**| load-genie-config | [optional] [default to false]
 **loadNetworkProfile** | **Boolean**| load-network-profile | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**ComputeResourceHostingInfo**](ComputeResourceHostingInfo.md)

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


## getComputeResourceLogs

> TessellComputeResourceLogs getComputeResourceLogs(id, filePath, lineLimit, offset)

View logs for given file name

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Compute resource id
        String filePath = "filePath_example"; // String | 
        Integer lineLimit = 200; // Integer | 
        Integer offset = 0; // Integer | 
        try {
            TessellComputeResourceLogs result = apiInstance.getComputeResourceLogs(id, filePath, lineLimit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourceLogs");
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
 **id** | [**UUID**](.md)| Compute resource id |
 **filePath** | **String**|  |
 **lineLimit** | **Integer**|  | [optional] [default to 200]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**TessellComputeResourceLogs**](TessellComputeResourceLogs.md)

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


## getComputeResourceMetadata

> List&lt;TessellComputeResourceMetadata&gt; getComputeResourceMetadata(computeResourceId, pageSize, pageOffset, timeZone)

View a list of available Tessell Compute Resource Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID computeResourceId = new UUID(); // UUID | computeResourceId
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<TessellComputeResourceMetadata> result = apiInstance.getComputeResourceMetadata(computeResourceId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourceMetadata");
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
 **computeResourceId** | [**UUID**](.md)| computeResourceId |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;TessellComputeResourceMetadata&gt;**](TessellComputeResourceMetadata.md)

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


## getComputeResourceMetadataUsingVersion

> TessellComputeResourceMetadata getComputeResourceMetadataUsingVersion(computeResourceId, version)

View a list of available Tessell Compute Resource Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID computeResourceId = new UUID(); // UUID | computeResourceId
        String version = "version_example"; // String | version
        try {
            TessellComputeResourceMetadata result = apiInstance.getComputeResourceMetadataUsingVersion(computeResourceId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourceMetadataUsingVersion");
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
 **computeResourceId** | [**UUID**](.md)| computeResourceId |
 **version** | **String**| version |

### Return type

[**TessellComputeResourceMetadata**](TessellComputeResourceMetadata.md)

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


## getComputeResourceOpsById

> TessellComputeResourceOpsDTO getComputeResourceOpsById(id)

View available Tessell Compute Resources By Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            TessellComputeResourceOpsDTO result = apiInstance.getComputeResourceOpsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourceOpsById");
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

### Return type

[**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md)

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


## getComputeResourcesOps

> TessellComputeResourceListOpsResponse getComputeResourcesOps(name, statuses, skipStatuses, machineType, engineType, cloudAccountId, cloudResourceId, cloudLocation, tenantId, types, subscriptionId, computeSharingEnabled, pageSize, pageOffset, timeZone)

View a list of available Tessell Compute Resources

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        String name = "name_example"; // String | name
        List<ComputeResourceStatusOps> statuses = Arrays.asList(); // List<ComputeResourceStatusOps> | List of status to filter on
        List<ComputeResourceStatusOps> skipStatuses = Arrays.asList(); // List<ComputeResourceStatusOps> | List of status to skip
        MachineType machineType = MachineType.fromValue("BARE_METAL"); // MachineType | machine-type
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | engine-type
        UUID cloudAccountId = new UUID(); // UUID | cloud-account-id
        String cloudResourceId = "cloudResourceId_example"; // String | cloud-resource-id
        String cloudLocation = "cloudLocation_example"; // String | cloud-location
        String tenantId = "tenantId_example"; // String | tenant-id
        List<ComputeResourceType> types = Arrays.asList(); // List<ComputeResourceType> | compute-resource-type
        UUID subscriptionId = new UUID(); // UUID | Filter compute-resources based on subscription-id
        Boolean computeSharingEnabled = true; // Boolean | Filter compute-resources based on compute-sharing-enabled
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellComputeResourceListOpsResponse result = apiInstance.getComputeResourcesOps(name, statuses, skipStatuses, machineType, engineType, cloudAccountId, cloudResourceId, cloudLocation, tenantId, types, subscriptionId, computeSharingEnabled, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getComputeResourcesOps");
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
 **statuses** | [**List&lt;ComputeResourceStatusOps&gt;**](ComputeResourceStatusOps.md)| List of status to filter on | [optional]
 **skipStatuses** | [**List&lt;ComputeResourceStatusOps&gt;**](ComputeResourceStatusOps.md)| List of status to skip | [optional]
 **machineType** | [**MachineType**](.md)| machine-type | [optional] [enum: BARE_METAL, VM, CONTAINER]
 **engineType** | [**DatabaseEngineType**](.md)| engine-type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **cloudAccountId** | [**UUID**](.md)| cloud-account-id | [optional]
 **cloudResourceId** | **String**| cloud-resource-id | [optional]
 **cloudLocation** | **String**| cloud-location | [optional]
 **tenantId** | **String**| tenant-id | [optional]
 **types** | [**List&lt;ComputeResourceType&gt;**](ComputeResourceType.md)| compute-resource-type | [optional]
 **subscriptionId** | [**UUID**](.md)| Filter compute-resources based on subscription-id | [optional]
 **computeSharingEnabled** | **Boolean**| Filter compute-resources based on compute-sharing-enabled | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellComputeResourceListOpsResponse**](TessellComputeResourceListOpsResponse.md)

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


## getDbserverComputeResource

> TessellDbserverComputeResourceDTO getDbserverComputeResource(id, timeZone)

Get a Compute Resource by ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the Compute Resource
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDbserverComputeResourceDTO result = apiInstance.getDbserverComputeResource(id, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getDbserverComputeResource");
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
 **id** | [**UUID**](.md)| The ID of the Compute Resource |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDbserverComputeResourceDTO**](TessellDbserverComputeResourceDTO.md)

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


## getDbserverComputeResources

> TessellDbserverComputeResourceListResponse getDbserverComputeResources(name, pageSize, pageOffset, timeZone)

View a list of available Compute Resources

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        String name = "name_example"; // String | Filter Compute Resource based on name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDbserverComputeResourceListResponse result = apiInstance.getDbserverComputeResources(name, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getDbserverComputeResources");
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
 **name** | **String**| Filter Compute Resource based on name | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDbserverComputeResourceListResponse**](TessellDbserverComputeResourceListResponse.md)

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


## getSharingEnabledDbserverComputeResources

> SharableDbserverComputeResourceListResponse getSharingEnabledDbserverComputeResources(subscriptionId, engineType, cloud, region, pageSize, pageOffset, timeZone)

View a list of available Compute Resources that can be used for newer provisioning

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID subscriptionId = new UUID(); // UUID | Filter Compute Resources based on subscription ID
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Filter Compute Resources based on engine type
        CloudType cloud = CloudType.fromValue("AWS"); // CloudType | Filter Compute Resources based on cloud type
        String region = "region_example"; // String | Filter Compute Resources based on cloud region
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            SharableDbserverComputeResourceListResponse result = apiInstance.getSharingEnabledDbserverComputeResources(subscriptionId, engineType, cloud, region, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#getSharingEnabledDbserverComputeResources");
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
 **subscriptionId** | [**UUID**](.md)| Filter Compute Resources based on subscription ID | [optional]
 **engineType** | [**DatabaseEngineType**](.md)| Filter Compute Resources based on engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **cloud** | [**CloudType**](.md)| Filter Compute Resources based on cloud type | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Filter Compute Resources based on cloud region | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**SharableDbserverComputeResourceListResponse**](SharableDbserverComputeResourceListResponse.md)

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


## updateComputeResource

> TessellComputeResourceOpsDTO updateComputeResource(id, tessellComputeResourceOpsDTO)

Update a Tessell Compute Resource

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellComputeResourceOpsDTO tessellComputeResourceOpsDTO = new TessellComputeResourceOpsDTO(); // TessellComputeResourceOpsDTO | 
        try {
            TessellComputeResourceOpsDTO result = apiInstance.updateComputeResource(id, tessellComputeResourceOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#updateComputeResource");
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
 **tessellComputeResourceOpsDTO** | [**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md)|  |

### Return type

[**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md)

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


## updateComputeResourceAgentLcmInfoOps

> TessellAgentLcmInfo updateComputeResourceAgentLcmInfoOps(id, tessellAgentLcmInfo)

Update a DB Service Agent LCM Info

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellAgentLcmInfo tessellAgentLcmInfo = new TessellAgentLcmInfo(); // TessellAgentLcmInfo | 
        try {
            TessellAgentLcmInfo result = apiInstance.updateComputeResourceAgentLcmInfoOps(id, tessellAgentLcmInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#updateComputeResourceAgentLcmInfoOps");
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
 **tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)|  | [optional]

### Return type

[**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)

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


## upgradeEligibilityForComputeResourceOps

> ComputeResourceUpgradeEligibilityOpsResponse upgradeEligibilityForComputeResourceOps(id)

Check if Tessell libraries on a compute-resource related can be upgraded

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellComputeResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeResourceControllerApi apiInstance = new TessellComputeResourceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Compute resource id
        try {
            ComputeResourceUpgradeEligibilityOpsResponse result = apiInstance.upgradeEligibilityForComputeResourceOps(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeResourceControllerApi#upgradeEligibilityForComputeResourceOps");
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
 **id** | [**UUID**](.md)| Compute resource id |

### Return type

[**ComputeResourceUpgradeEligibilityOpsResponse**](ComputeResourceUpgradeEligibilityOpsResponse.md)

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

