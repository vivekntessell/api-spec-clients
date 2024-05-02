# TessellComputeServiceViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAvailableVcpus**](TessellComputeServiceViewApi.md#getAllAvailableVcpus) | **GET** /compute-service/all-available-vcpus | Get all available vcpus, even if some are disabled for an user
[**getComputeProfiles**](TessellComputeServiceViewApi.md#getComputeProfiles) | **GET** /compute-service/computes | Get a list of Compute Profiles.



## getAllAvailableVcpus

> TessellGetAllAvailableVcpusResponseDTO getAllAvailableVcpus(pageSize, pageOffset, timeZone, cloudType)

Get all available vcpus, even if some are disabled for an user

Get all available vcpus, even if some are disabled for an user

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeServiceViewApi apiInstance = new TessellComputeServiceViewApi(defaultClient);
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Cloud type of the compute
        try {
            TessellGetAllAvailableVcpusResponseDTO result = apiInstance.getAllAvailableVcpus(pageSize, pageOffset, timeZone, cloudType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeServiceViewApi#getAllAvailableVcpus");
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
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Cloud type of the compute | [optional] [enum: AWS, AZURE, GCP]

### Return type

[**TessellGetAllAvailableVcpusResponseDTO**](TessellGetAllAvailableVcpusResponseDTO.md)

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


## getComputeProfiles

> List&lt;TessellComputeDTO&gt; getComputeProfiles(tenantId, includeAvailability, subscriptionName, region, cloudType, useCases, includeInternal, allComputes, pageSize, pageOffset)

Get a list of Compute Profiles.

Get a list of Compute Profiles

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeServiceViewApi apiInstance = new TessellComputeServiceViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        Boolean includeAvailability = false; // Boolean | Whether to include availability info
        String subscriptionName = "default"; // String | Subscription Name
        String region = "us-east-1"; // String | Cloud Region
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Cloud type of the compute
        List<TessellComputeUseCaseDTO> useCases = Arrays.asList(); // List<TessellComputeUseCaseDTO> | Use Case of the compute
        Boolean includeInternal = false; // Boolean | Includes Internal Computes
        Boolean allComputes = false; // Boolean | Returns All Computes
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellComputeDTO> result = apiInstance.getComputeProfiles(tenantId, includeAvailability, subscriptionName, region, cloudType, useCases, includeInternal, allComputes, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeServiceViewApi#getComputeProfiles");
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
 **region** | **String**| Cloud Region | [optional]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Cloud type of the compute | [optional] [enum: AWS, AZURE, GCP]
 **useCases** | [**List&lt;TessellComputeUseCaseDTO&gt;**](TessellComputeUseCaseDTO.md)| Use Case of the compute | [optional]
 **includeInternal** | **Boolean**| Includes Internal Computes | [optional] [default to false]
 **allComputes** | **Boolean**| Returns All Computes | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellComputeDTO&gt;**](TessellComputeDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of compute profiles |  -  |
| **0** | API error response |  -  |

