# GovernanceConfigApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearCache**](GovernanceConfigApi.md#clearCache) | **DELETE** /tessell-ops/governance/cache | Clear cache of current instance



## clearCache

> TessellApiStatusDTO clearCache(namespaces)

Clear cache of current instance

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.GovernanceConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        GovernanceConfigApi apiInstance = new GovernanceConfigApi(defaultClient);
        List<String> namespaces = Arrays.asList(); // List<String> | Cache namespaces to clear
        try {
            TessellApiStatusDTO result = apiInstance.clearCache(namespaces);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GovernanceConfigApi#clearCache");
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
 **namespaces** | [**List&lt;String&gt;**](String.md)| Cache namespaces to clear |

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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

