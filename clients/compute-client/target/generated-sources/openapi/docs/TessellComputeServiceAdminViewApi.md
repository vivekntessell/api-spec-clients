# TessellComputeServiceAdminViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllComputeProfiles**](TessellComputeServiceAdminViewApi.md#getAllComputeProfiles) | **GET** /compute-service/governance/computes | Get all compute profiles.
[**updateComputeRegions**](TessellComputeServiceAdminViewApi.md#updateComputeRegions) | **PATCH** /compute-service/governance/computes/{name}/subscription/{subscription-name}/regions | Update compute regions
[**updateComputeStatus**](TessellComputeServiceAdminViewApi.md#updateComputeStatus) | **PATCH** /compute-service/governance/computes/{name}/subscription/{subscription-name} | Enable/Disable compute profile



## getAllComputeProfiles

> List&lt;TessellComputeAdminViewDTO&gt; getAllComputeProfiles(tenantId, includeAvailability, subscriptionName, cloudType, useCases, pageSize, pageOffset)

Get all compute profiles.

Get all compute profiles.

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeServiceAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeServiceAdminViewApi apiInstance = new TessellComputeServiceAdminViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        Boolean includeAvailability = false; // Boolean | Whether to include availability info
        String subscriptionName = "default"; // String | Subscription Name
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Cloud type of the compute
        List<TessellComputeUseCaseDTO> useCases = Arrays.asList(); // List<TessellComputeUseCaseDTO> | Use Case of the compute
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellComputeAdminViewDTO> result = apiInstance.getAllComputeProfiles(tenantId, includeAvailability, subscriptionName, cloudType, useCases, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeServiceAdminViewApi#getAllComputeProfiles");
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
 **tenantId** | **String**| Id of the Tenant |
 **includeAvailability** | **Boolean**| Whether to include availability info | [optional] [default to false]
 **subscriptionName** | **String**| Subscription Name | [optional]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Cloud type of the compute | [optional] [enum: AWS, AZURE, GCP]
 **useCases** | [**List&lt;TessellComputeUseCaseDTO&gt;**](TessellComputeUseCaseDTO.md)| Use Case of the compute | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellComputeAdminViewDTO&gt;**](TessellComputeAdminViewDTO.md)

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


## updateComputeRegions

> TessellUpdateComputeRegionResponseDTO updateComputeRegions(tenantId, name, subscriptionName, tessellUpdateComputeRegionRequestDTO)

Update compute regions

Update compute regions

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeServiceAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeServiceAdminViewApi apiInstance = new TessellComputeServiceAdminViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String name = "tesl_2_b"; // String | Compute Name
        String subscriptionName = "default"; // String | Subscription Name
        TessellUpdateComputeRegionRequestDTO tessellUpdateComputeRegionRequestDTO = new TessellUpdateComputeRegionRequestDTO(); // TessellUpdateComputeRegionRequestDTO | 
        try {
            TessellUpdateComputeRegionResponseDTO result = apiInstance.updateComputeRegions(tenantId, name, subscriptionName, tessellUpdateComputeRegionRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeServiceAdminViewApi#updateComputeRegions");
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
 **tenantId** | **String**| Id of the Tenant |
 **name** | **String**| Compute Name |
 **subscriptionName** | **String**| Subscription Name |
 **tessellUpdateComputeRegionRequestDTO** | [**TessellUpdateComputeRegionRequestDTO**](TessellUpdateComputeRegionRequestDTO.md)|  |

### Return type

[**TessellUpdateComputeRegionResponseDTO**](TessellUpdateComputeRegionResponseDTO.md)

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


## updateComputeStatus

> TessellApiStatusDTO updateComputeStatus(tenantId, name, subscriptionName, tessellUpdateComputeStatusRequestDTO)

Enable/Disable compute profile

Enable/Disable compute profile

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeServiceAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeServiceAdminViewApi apiInstance = new TessellComputeServiceAdminViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String name = "tesl_2_b"; // String | Compute Name
        String subscriptionName = "default"; // String | Subscription Name
        TessellUpdateComputeStatusRequestDTO tessellUpdateComputeStatusRequestDTO = new TessellUpdateComputeStatusRequestDTO(); // TessellUpdateComputeStatusRequestDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.updateComputeStatus(tenantId, name, subscriptionName, tessellUpdateComputeStatusRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeServiceAdminViewApi#updateComputeStatus");
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
 **tenantId** | **String**| Id of the Tenant |
 **name** | **String**| Compute Name |
 **subscriptionName** | **String**| Subscription Name |
 **tessellUpdateComputeStatusRequestDTO** | [**TessellUpdateComputeStatusRequestDTO**](TessellUpdateComputeStatusRequestDTO.md)|  |

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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

