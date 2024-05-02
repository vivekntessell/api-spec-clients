# TessellCloudControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCloud**](TessellCloudControllerApi.md#addCloud) | **POST** /clouds | Add a cloud in Tessell
[**getClouds**](TessellCloudControllerApi.md#getClouds) | **GET** /clouds | Get a list of enabled clouds in Tessell



## addCloud

> TessellCloudDTO addCloud(tessellCloudDTO)

Add a cloud in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudControllerApi apiInstance = new TessellCloudControllerApi(defaultClient);
        TessellCloudDTO tessellCloudDTO = new TessellCloudDTO(); // TessellCloudDTO | 
        try {
            TessellCloudDTO result = apiInstance.addCloud(tessellCloudDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudControllerApi#addCloud");
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
 **tessellCloudDTO** | [**TessellCloudDTO**](TessellCloudDTO.md)|  | [optional]

### Return type

[**TessellCloudDTO**](TessellCloudDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **0** | API error response |  -  |


## getClouds

> TessellApiResponseDTO getClouds(id, type, pageSize, pageOffset, timeZone, consumerType)

Get a list of enabled clouds in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudControllerApi apiInstance = new TessellCloudControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String type = "type_example"; // String | type
        Integer pageSize = 10; // Integer | pageSize
        Integer pageOffset = 0; // Integer | pageOffset
        String timeZone = "timeZone_example"; // String | timeZone
        TessellConsumerTypeDTO consumerType = TessellConsumerTypeDTO.fromValue("SERVICE"); // TessellConsumerTypeDTO | consumer-type
        try {
            TessellApiResponseDTO result = apiInstance.getClouds(id, type, pageSize, pageOffset, timeZone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudControllerApi#getClouds");
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
 **id** | [**UUID**](.md)| id | [optional]
 **type** | **String**| type | [optional]
 **pageSize** | **Integer**| pageSize | [optional] [default to 10]
 **pageOffset** | **Integer**| pageOffset | [optional] [default to 0]
 **timeZone** | **String**| timeZone | [optional]
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

