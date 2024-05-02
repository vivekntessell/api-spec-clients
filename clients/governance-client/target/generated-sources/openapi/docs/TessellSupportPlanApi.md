# TessellSupportPlanApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSupportPlan**](TessellSupportPlanApi.md#getSupportPlan) | **GET** /tessell-ops/support-plans/{id} | Get support plan details
[**getSupportPlans**](TessellSupportPlanApi.md#getSupportPlans) | **GET** /tessell-ops/support-plans | Get all support plans



## getSupportPlan

> TessellSupportPlanDTO getSupportPlan(id)

Get support plan details

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellSupportPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellSupportPlanApi apiInstance = new TessellSupportPlanApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            TessellSupportPlanDTO result = apiInstance.getSupportPlan(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSupportPlanApi#getSupportPlan");
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

[**TessellSupportPlanDTO**](TessellSupportPlanDTO.md)

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


## getSupportPlans

> TessellSupportPlanApiResponseDTO getSupportPlans(name)

Get all support plans

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellSupportPlanApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellSupportPlanApi apiInstance = new TessellSupportPlanApi(defaultClient);
        String name = "name_example"; // String | name
        try {
            TessellSupportPlanApiResponseDTO result = apiInstance.getSupportPlans(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSupportPlanApi#getSupportPlans");
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

### Return type

[**TessellSupportPlanApiResponseDTO**](TessellSupportPlanApiResponseDTO.md)

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

