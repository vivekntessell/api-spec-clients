# TessellVpcServiceViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getVpcByName**](TessellVpcServiceViewApi.md#getVpcByName) | **GET** /network/vpcs/{name} | Get VPC by Name
[**getVpcs**](TessellVpcServiceViewApi.md#getVpcs) | **GET** /network/vpcs | Get a list of VPCs



## getVpcByName

> TessellVpcServiceConsumerDTO getVpcByName(name, subscriptionName, cloudType, region)

Get VPC by Name

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcServiceViewApi apiInstance = new TessellVpcServiceViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        try {
            TessellVpcServiceConsumerDTO result = apiInstance.getVpcByName(name, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcServiceViewApi#getVpcByName");
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
 **name** | **String**| Name of the Entity |
 **subscriptionName** | **String**| Name of the Subscription |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region |

### Return type

[**TessellVpcServiceConsumerDTO**](TessellVpcServiceConsumerDTO.md)

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


## getVpcs

> List&lt;TessellVpcServiceConsumerDTO&gt; getVpcs(subscriptionName, cloudType, region, includeSubnets, pageSize, pageOffset)

Get a list of VPCs

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcServiceViewApi apiInstance = new TessellVpcServiceViewApi(defaultClient);
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Boolean includeSubnets = false; // Boolean | Boolean flag to specify if Subnet details are required in response
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellVpcServiceConsumerDTO> result = apiInstance.getVpcs(subscriptionName, cloudType, region, includeSubnets, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcServiceViewApi#getVpcs");
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
 **subscriptionName** | **String**| Name of the Subscription | [optional]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region | [optional]
 **includeSubnets** | **Boolean**| Boolean flag to specify if Subnet details are required in response | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellVpcServiceConsumerDTO&gt;**](TessellVpcServiceConsumerDTO.md)

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

