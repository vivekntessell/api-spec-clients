# TessellLeakEvaluationApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLeakEvaluationForCRs**](TessellLeakEvaluationApi.md#getLeakEvaluationForCRs) | **GET** /tessell-ops/leaks/compute-resources | Detects the compute resource leaks
[**getLeakEvaluationForStorages**](TessellLeakEvaluationApi.md#getLeakEvaluationForStorages) | **GET** /tessell-ops/leaks/storages | Detects the volume leaks



## getLeakEvaluationForCRs

> List&lt;LeakEvaluationForCR&gt; getLeakEvaluationForCRs(tenantId, leakEvaluationCRPayload)

Detects the compute resource leaks

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellLeakEvaluationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLeakEvaluationApi apiInstance = new TessellLeakEvaluationApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        List<LeakEvaluationCRPayload> leakEvaluationCRPayload = Arrays.asList(); // List<LeakEvaluationCRPayload> | 
        try {
            List<LeakEvaluationForCR> result = apiInstance.getLeakEvaluationForCRs(tenantId, leakEvaluationCRPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLeakEvaluationApi#getLeakEvaluationForCRs");
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
 **leakEvaluationCRPayload** | [**List&lt;LeakEvaluationCRPayload&gt;**](LeakEvaluationCRPayload.md)|  |

### Return type

[**List&lt;LeakEvaluationForCR&gt;**](LeakEvaluationForCR.md)

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


## getLeakEvaluationForStorages

> List&lt;LeakEvaluationForStorage&gt; getLeakEvaluationForStorages(tenantId, leakEvaluationStoragePayload)

Detects the volume leaks

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellLeakEvaluationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLeakEvaluationApi apiInstance = new TessellLeakEvaluationApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Tenant ID
        List<LeakEvaluationStoragePayload> leakEvaluationStoragePayload = Arrays.asList(); // List<LeakEvaluationStoragePayload> | 
        try {
            List<LeakEvaluationForStorage> result = apiInstance.getLeakEvaluationForStorages(tenantId, leakEvaluationStoragePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLeakEvaluationApi#getLeakEvaluationForStorages");
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
 **leakEvaluationStoragePayload** | [**List&lt;LeakEvaluationStoragePayload&gt;**](LeakEvaluationStoragePayload.md)|  |

### Return type

[**List&lt;LeakEvaluationForStorage&gt;**](LeakEvaluationForStorage.md)

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

