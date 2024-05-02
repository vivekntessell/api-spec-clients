# TessellComputeInternalViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**iGetComputeProfileById**](TessellComputeInternalViewApi.md#iGetComputeProfileById) | **GET** /compute-service/tessell-internal/compute/id/{id} | Returns a compute profile.
[**iGetComputeProfileByName**](TessellComputeInternalViewApi.md#iGetComputeProfileByName) | **GET** /compute-service/tessell-internal/compute/{cloudType}/name/{name} | Returns a compute profile.
[**iGetComputeUpdatedId**](TessellComputeInternalViewApi.md#iGetComputeUpdatedId) | **GET** /compute-service/tessell-internal/compute/id/{id}/getUpdatedId | Returns Computes Updated Id



## iGetComputeProfileById

> TessellComputeInternalViewDTO iGetComputeProfileById(tenantId, id, includeAvailability, subscriptionId, includeDisabled)

Returns a compute profile.

Returns a compute profile.

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeInternalViewApi apiInstance = new TessellComputeInternalViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID id = new UUID(); // UUID | Compute Profile identifier
        Boolean includeAvailability = false; // Boolean | Whether to include availability info
        UUID subscriptionId = new UUID(); // UUID | Subscription ID
        Boolean includeDisabled = false; // Boolean | Flag to include/exclude disabled in computes curation in response
        try {
            TessellComputeInternalViewDTO result = apiInstance.iGetComputeProfileById(tenantId, id, includeAvailability, subscriptionId, includeDisabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeInternalViewApi#iGetComputeProfileById");
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
 **id** | [**UUID**](.md)| Compute Profile identifier |
 **includeAvailability** | **Boolean**| Whether to include availability info | [optional] [default to false]
 **subscriptionId** | [**UUID**](.md)| Subscription ID | [optional]
 **includeDisabled** | **Boolean**| Flag to include/exclude disabled in computes curation in response | [optional] [default to false]

### Return type

[**TessellComputeInternalViewDTO**](TessellComputeInternalViewDTO.md)

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


## iGetComputeProfileByName

> TessellComputeInternalViewDTO iGetComputeProfileByName(tenantId, cloudType, name, includeAvailability, subscriptionId, includeDisabled)

Returns a compute profile.

Returns a compute profile.

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeInternalViewApi apiInstance = new TessellComputeInternalViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Cloud type of the compute
        String name = "tesl_2_b"; // String | Compute Name
        Boolean includeAvailability = false; // Boolean | Whether to include availability info
        UUID subscriptionId = new UUID(); // UUID | Subscription ID
        Boolean includeDisabled = false; // Boolean | Flag to include/exclude disabled in computes curation in response
        try {
            TessellComputeInternalViewDTO result = apiInstance.iGetComputeProfileByName(tenantId, cloudType, name, includeAvailability, subscriptionId, includeDisabled);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeInternalViewApi#iGetComputeProfileByName");
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
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Cloud type of the compute | [enum: AWS, AZURE, GCP]
 **name** | **String**| Compute Name |
 **includeAvailability** | **Boolean**| Whether to include availability info | [optional] [default to false]
 **subscriptionId** | [**UUID**](.md)| Subscription ID | [optional]
 **includeDisabled** | **Boolean**| Flag to include/exclude disabled in computes curation in response | [optional] [default to false]

### Return type

[**TessellComputeInternalViewDTO**](TessellComputeInternalViewDTO.md)

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


## iGetComputeUpdatedId

> TessellGetComputeUpdatedIdDTO iGetComputeUpdatedId(id, timeZone)

Returns Computes Updated Id

Returns Computes Updated Id.

### Example

```java
// Import classes:
import com.tessell.compute.client.invoker.ApiClient;
import com.tessell.compute.client.invoker.ApiException;
import com.tessell.compute.client.invoker.Configuration;
import com.tessell.compute.client.invoker.models.*;
import com.tessell.compute.client.api.TessellComputeInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellComputeInternalViewApi apiInstance = new TessellComputeInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Compute profile identifier
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellGetComputeUpdatedIdDTO result = apiInstance.iGetComputeUpdatedId(id, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellComputeInternalViewApi#iGetComputeUpdatedId");
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
 **id** | [**UUID**](.md)| Compute profile identifier |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellGetComputeUpdatedIdDTO**](TessellGetComputeUpdatedIdDTO.md)

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

