# CloudResourceApi

All URIs are relative to *http://tessell-infra:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**updateDnsRecord**](CloudResourceApi.md#updateDnsRecord) | **POST** /tessell-ops/infra/dns-update | Updates DNS record for AWS/Azure DNS solutions



## updateDnsRecord

> updateDnsRecord(dnsRecordUpdatePayload)

Updates DNS record for AWS/Azure DNS solutions

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.CloudResourceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        CloudResourceApi apiInstance = new CloudResourceApi(defaultClient);
        DnsRecordUpdatePayload dnsRecordUpdatePayload = new DnsRecordUpdatePayload(); // DnsRecordUpdatePayload | Task Workflow variable request
        try {
            apiInstance.updateDnsRecord(dnsRecordUpdatePayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudResourceApi#updateDnsRecord");
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
 **dnsRecordUpdatePayload** | [**DnsRecordUpdatePayload**](DnsRecordUpdatePayload.md)| Task Workflow variable request |

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
| **200** | 200 response |  -  |
| **0** | API error response |  -  |

