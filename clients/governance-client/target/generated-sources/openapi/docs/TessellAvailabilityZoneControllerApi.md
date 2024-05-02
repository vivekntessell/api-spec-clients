# TessellAvailabilityZoneControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAvailabilityZones**](TessellAvailabilityZoneControllerApi.md#getAvailabilityZones) | **GET** /availability-zones | Get a list of enabled availability zones in Tessell



## getAvailabilityZones

> TessellApiResponseDTO getAvailabilityZones(id, name, cloudId, regionId, pageSize, pageOffset, timezone, consumerType)

Get a list of enabled availability zones in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAvailabilityZoneControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAvailabilityZoneControllerApi apiInstance = new TessellAvailabilityZoneControllerApi(defaultClient);
        String id = "id_example"; // String | id
        String name = "name_example"; // String | name
        UUID cloudId = new UUID(); // UUID | cloudId
        UUID regionId = new UUID(); // UUID | regionId
        Integer pageSize = 10; // Integer | pageSize
        Integer pageOffset = 0; // Integer | pageOffset
        String timezone = "timezone_example"; // String | timezone
        TessellConsumerTypeDTO consumerType = TessellConsumerTypeDTO.fromValue("SERVICE"); // TessellConsumerTypeDTO | consumer-type
        try {
            TessellApiResponseDTO result = apiInstance.getAvailabilityZones(id, name, cloudId, regionId, pageSize, pageOffset, timezone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAvailabilityZoneControllerApi#getAvailabilityZones");
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
 **id** | **String**| id | [optional]
 **name** | **String**| name | [optional]
 **cloudId** | [**UUID**](.md)| cloudId | [optional]
 **regionId** | [**UUID**](.md)| regionId | [optional]
 **pageSize** | **Integer**| pageSize | [optional] [default to 10]
 **pageOffset** | **Integer**| pageOffset | [optional] [default to 0]
 **timezone** | **String**| timezone | [optional]
 **consumerType** | [**TessellConsumerTypeDTO**](.md)| consumer-type | [optional] [enum: SERVICE, OPS, INTERNAL]

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

