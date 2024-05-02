# TessellCloudLocationControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCloudLocations**](TessellCloudLocationControllerApi.md#getCloudLocations) | **GET** /cloud-locations | Get a list of all enabled cloud locations in Tessell



## getCloudLocations

> TessellApiResponseDTO getCloudLocations(id, cloudType, region, az, all, includeDisabled, pageSize, pageOffset)

Get a list of all enabled cloud locations in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudLocationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudLocationControllerApi apiInstance = new TessellCloudLocationControllerApi(defaultClient);
        String id = "aws/us-east-2/us-east-2a"; // String | Cloud location identifier of type cloudType/region/az (region, az - optional)
        String cloudType = "AWS"; // String | Cloud Type
        String region = "us-east-1"; // String | Cloud Region
        String az = "us-east-2a"; // String | Availability Zone
        Boolean all = false; // Boolean | Get all records (default = false)
        Boolean includeDisabled = false; // Boolean | Flag to decide whether to include disabled cloud locations in response.
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellApiResponseDTO result = apiInstance.getCloudLocations(id, cloudType, region, az, all, includeDisabled, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudLocationControllerApi#getCloudLocations");
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
 **id** | **String**| Cloud location identifier of type cloudType/region/az (region, az - optional) | [optional]
 **cloudType** | **String**| Cloud Type | [optional]
 **region** | **String**| Cloud Region | [optional]
 **az** | **String**| Availability Zone | [optional]
 **all** | **Boolean**| Get all records (default &#x3D; false) | [optional] [default to false]
 **includeDisabled** | **Boolean**| Flag to decide whether to include disabled cloud locations in response. | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellApiResponseDTO**](TessellApiResponseDTO.md)

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

