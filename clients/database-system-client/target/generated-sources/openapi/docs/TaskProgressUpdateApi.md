# TaskProgressUpdateApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTaskProgressUpdate**](TaskProgressUpdateApi.md#getTaskProgressUpdate) | **GET** /task-updates | Return the task progress updates for the given resource type and id
[**publishTaskProgressEvent**](TaskProgressUpdateApi.md#publishTaskProgressEvent) | **POST** /tessell-ops/task-progress-event | Publishes an ActivityLog event to update the task progress



## getTaskProgressUpdate

> TaskProgressUpdateResponse getTaskProgressUpdate(resourceId, resourceType, availabilityMachineId)

Return the task progress updates for the given resource type and id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TaskProgressUpdateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TaskProgressUpdateApi apiInstance = new TaskProgressUpdateApi(defaultClient);
        String resourceId = "resourceId_example"; // String | Tessell Entity resource Id
        String resourceType = "resourceType_example"; // String | Tessell Entity type
        String availabilityMachineId = "availabilityMachineId_example"; // String | Availability Machine id which would be looked up only when resource-type is \"DB_SNAPSHOT\"
        try {
            TaskProgressUpdateResponse result = apiInstance.getTaskProgressUpdate(resourceId, resourceType, availabilityMachineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskProgressUpdateApi#getTaskProgressUpdate");
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
 **resourceId** | **String**| Tessell Entity resource Id |
 **resourceType** | **String**| Tessell Entity type |
 **availabilityMachineId** | **String**| Availability Machine id which would be looked up only when resource-type is \&quot;DB_SNAPSHOT\&quot; | [optional]

### Return type

[**TaskProgressUpdateResponse**](TaskProgressUpdateResponse.md)

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


## publishTaskProgressEvent

> ApiStatus publishTaskProgressEvent(publishTaskProgressEventPayload)

Publishes an ActivityLog event to update the task progress

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TaskProgressUpdateApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TaskProgressUpdateApi apiInstance = new TaskProgressUpdateApi(defaultClient);
        PublishTaskProgressEventPayload publishTaskProgressEventPayload = new PublishTaskProgressEventPayload(); // PublishTaskProgressEventPayload | 
        try {
            ApiStatus result = apiInstance.publishTaskProgressEvent(publishTaskProgressEventPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskProgressUpdateApi#publishTaskProgressEvent");
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
 **publishTaskProgressEventPayload** | [**PublishTaskProgressEventPayload**](PublishTaskProgressEventPayload.md)|  |

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

