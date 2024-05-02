# TessellLeakEvaluationApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLeakEvaluationForBackups**](TessellLeakEvaluationApi.md#getLeakEvaluationForBackups) | **GET** /tessell-ops/leaks/backups | Detects the snapshot leaks



## getLeakEvaluationForBackups

> List&lt;LeakEvaluationForBackup&gt; getLeakEvaluationForBackups(tenantId, leakEvaluationBackupPayload)

Detects the snapshot leaks

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellLeakEvaluationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellLeakEvaluationApi apiInstance = new TessellLeakEvaluationApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        List<LeakEvaluationBackupPayload> leakEvaluationBackupPayload = Arrays.asList(); // List<LeakEvaluationBackupPayload> | 
        try {
            List<LeakEvaluationForBackup> result = apiInstance.getLeakEvaluationForBackups(tenantId, leakEvaluationBackupPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLeakEvaluationApi#getLeakEvaluationForBackups");
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
 **tenantId** | [**UUID**](.md)| Tenant ID |
 **leakEvaluationBackupPayload** | [**List&lt;LeakEvaluationBackupPayload&gt;**](LeakEvaluationBackupPayload.md)|  |

### Return type

[**List&lt;LeakEvaluationForBackup&gt;**](LeakEvaluationForBackup.md)

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

