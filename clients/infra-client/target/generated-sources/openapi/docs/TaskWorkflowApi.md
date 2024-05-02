# TaskWorkflowApi

All URIs are relative to *http://tessell-infra:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTaskWorkflowVariables**](TaskWorkflowApi.md#deleteTaskWorkflowVariables) | **DELETE** /tessell-ops/task-workflows/{deployment-id}/variables | Deletes task workflow variables
[**getTaskWorkflowVariables**](TaskWorkflowApi.md#getTaskWorkflowVariables) | **GET** /tessell-ops/task-workflows/{deployment-id}/variables | Get task workflow variables.
[**storeTaskWorkflowVariables**](TaskWorkflowApi.md#storeTaskWorkflowVariables) | **POST** /tessell-ops/task-workflows/{deployment-id}/variables | Store task workflow variables



## deleteTaskWorkflowVariables

> ApiStatus deleteTaskWorkflowVariables(deploymentId, deploymentType)

Deletes task workflow variables

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TaskWorkflowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TaskWorkflowApi apiInstance = new TaskWorkflowApi(defaultClient);
        String deploymentId = "deploymentId_example"; // String | Workflow deployment ID
        String deploymentType = "deploymentType_example"; // String | Filter for a specific deployment type
        try {
            ApiStatus result = apiInstance.deleteTaskWorkflowVariables(deploymentId, deploymentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskWorkflowApi#deleteTaskWorkflowVariables");
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
 **deploymentId** | **String**| Workflow deployment ID |
 **deploymentType** | **String**| Filter for a specific deployment type |

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


## getTaskWorkflowVariables

> TaskWorkflowVariablesPayload getTaskWorkflowVariables(deploymentId, deploymentType)

Get task workflow variables.

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TaskWorkflowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TaskWorkflowApi apiInstance = new TaskWorkflowApi(defaultClient);
        String deploymentId = "deploymentId_example"; // String | Workflow deployment ID
        String deploymentType = "deploymentType_example"; // String | Filter for a specific deployment type
        try {
            TaskWorkflowVariablesPayload result = apiInstance.getTaskWorkflowVariables(deploymentId, deploymentType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskWorkflowApi#getTaskWorkflowVariables");
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
 **deploymentId** | **String**| Workflow deployment ID |
 **deploymentType** | **String**| Filter for a specific deployment type |

### Return type

[**TaskWorkflowVariablesPayload**](TaskWorkflowVariablesPayload.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Task Workflow variables response |  -  |
| **0** | API error response |  -  |


## storeTaskWorkflowVariables

> TaskWorkflowVariablesPayload storeTaskWorkflowVariables(deploymentId, deploymentType, taskWorkflowVariablesPayload)

Store task workflow variables

Store task workflow variables

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TaskWorkflowApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TaskWorkflowApi apiInstance = new TaskWorkflowApi(defaultClient);
        String deploymentId = "deploymentId_example"; // String | Workflow deployment ID
        String deploymentType = "deploymentType_example"; // String | Filter for a specific deployment type
        TaskWorkflowVariablesPayload taskWorkflowVariablesPayload = new TaskWorkflowVariablesPayload(); // TaskWorkflowVariablesPayload | Task Workflow variable request
        try {
            TaskWorkflowVariablesPayload result = apiInstance.storeTaskWorkflowVariables(deploymentId, deploymentType, taskWorkflowVariablesPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskWorkflowApi#storeTaskWorkflowVariables");
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
 **deploymentId** | **String**| Workflow deployment ID |
 **deploymentType** | **String**| Filter for a specific deployment type |
 **taskWorkflowVariablesPayload** | [**TaskWorkflowVariablesPayload**](TaskWorkflowVariablesPayload.md)| Task Workflow variable request |

### Return type

[**TaskWorkflowVariablesPayload**](TaskWorkflowVariablesPayload.md)

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

