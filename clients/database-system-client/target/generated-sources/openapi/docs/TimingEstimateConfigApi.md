# TimingEstimateConfigApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTimingEstimateConfig**](TimingEstimateConfigApi.md#getTimingEstimateConfig) | **GET** /tessell-ops/task-progress-eta-config | Returns the JSON configuration for Timing estimate calculation



## getTimingEstimateConfig

> TimingEstimateConfig getTimingEstimateConfig()

Returns the JSON configuration for Timing estimate calculation

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TimingEstimateConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TimingEstimateConfigApi apiInstance = new TimingEstimateConfigApi(defaultClient);
        try {
            TimingEstimateConfig result = apiInstance.getTimingEstimateConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TimingEstimateConfigApi#getTimingEstimateConfig");
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

[**TimingEstimateConfig**](TimingEstimateConfig.md)

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

