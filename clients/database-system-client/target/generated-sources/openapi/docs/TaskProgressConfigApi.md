# TaskProgressConfigApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTaskProgressConfig**](TaskProgressConfigApi.md#getTaskProgressConfig) | **GET** /tessell-ops/task-progress-config | Returns the JSON configuration for task progress



## getTaskProgressConfig

> TaskProgressConfigResponse getTaskProgressConfig()

Returns the JSON configuration for task progress

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TaskProgressConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TaskProgressConfigApi apiInstance = new TaskProgressConfigApi(defaultClient);
        try {
            TaskProgressConfigResponse result = apiInstance.getTaskProgressConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TaskProgressConfigApi#getTaskProgressConfig");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TaskProgressConfigResponse**](TaskProgressConfigResponse.md)

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

