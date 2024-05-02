# DbCloneApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cloneDatabaseCallback**](DbCloneApi.md#cloneDatabaseCallback) | **POST** /tessell-ops/dmms/{id}/callback/data-management/clone | Callback for clone database service
[**refreshDatabaseCallback**](DbCloneApi.md#refreshDatabaseCallback) | **POST** /tessell-ops/dmms/{availabilityMachineId}/callback/data-management/{cloneId}/refresh | Callback for refresh database service



## cloneDatabaseCallback

> cloneDatabaseCallback(id, provisionDatabaseCallbackResponse)

Callback for clone database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbCloneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbCloneApi apiInstance = new DbCloneApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        ProvisionDatabaseCallbackResponse provisionDatabaseCallbackResponse = new ProvisionDatabaseCallbackResponse(); // ProvisionDatabaseCallbackResponse | 
        try {
            apiInstance.cloneDatabaseCallback(id, provisionDatabaseCallbackResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbCloneApi#cloneDatabaseCallback");
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
 **id** | [**UUID**](.md)| Id of the Availability Machine |
 **provisionDatabaseCallbackResponse** | [**ProvisionDatabaseCallbackResponse**](ProvisionDatabaseCallbackResponse.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## refreshDatabaseCallback

> refreshDatabaseCallback(availabilityMachineId, cloneId, refreshDatabaseCallbackResponse)

Callback for refresh database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbCloneApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbCloneApi apiInstance = new DbCloneApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        UUID cloneId = new UUID(); // UUID | Id of the Clone
        RefreshDatabaseCallbackResponse refreshDatabaseCallbackResponse = new RefreshDatabaseCallbackResponse(); // RefreshDatabaseCallbackResponse | 
        try {
            apiInstance.refreshDatabaseCallback(availabilityMachineId, cloneId, refreshDatabaseCallbackResponse);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbCloneApi#refreshDatabaseCallback");
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
 **cloneId** | [**UUID**](.md)| Id of the Clone |
 **refreshDatabaseCallbackResponse** | [**RefreshDatabaseCallbackResponse**](RefreshDatabaseCallbackResponse.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |

