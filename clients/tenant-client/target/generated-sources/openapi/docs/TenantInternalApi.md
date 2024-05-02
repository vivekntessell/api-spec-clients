# TenantInternalApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCleanupEntities**](TenantInternalApi.md#getCleanupEntities) | **GET** /tessell-internal/tenants/deboard/cleanup/entities | Return tenant entities to be cleaned up
[**getCurrentTenant**](TenantInternalApi.md#getCurrentTenant) | **GET** /tessell-internal/tenant | Return tenant entity by the request header tenant-id.



## getCleanupEntities

> DeboardingCleanupEntitiesResponse getCleanupEntities(subscriptionEntities)

Return tenant entities to be cleaned up

Return tenant entities to be cleaned up

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantInternalApi apiInstance = new TenantInternalApi(defaultClient);
        Boolean subscriptionEntities = true; // Boolean | whether to return the subscription level entity types
        try {
            DeboardingCleanupEntitiesResponse result = apiInstance.getCleanupEntities(subscriptionEntities);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantInternalApi#getCleanupEntities");
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
 **subscriptionEntities** | **Boolean**| whether to return the subscription level entity types | [optional]

### Return type

[**DeboardingCleanupEntitiesResponse**](DeboardingCleanupEntitiesResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of entity type configs to be cleaned up |  -  |
| **0** | API error response |  -  |


## getCurrentTenant

> Tenant getCurrentTenant()

Return tenant entity by the request header tenant-id.

Return tenant entity by the request header tenant-id.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantInternalApi apiInstance = new TenantInternalApi(defaultClient);
        try {
            Tenant result = apiInstance.getCurrentTenant();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantInternalApi#getCurrentTenant");
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

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Current tenant |  -  |
| **0** | API error response |  -  |

