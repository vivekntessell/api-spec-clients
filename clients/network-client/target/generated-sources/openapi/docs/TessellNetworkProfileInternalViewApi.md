# TessellNetworkProfileInternalViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNetworkProfileByIdInternal**](TessellNetworkProfileInternalViewApi.md#getNetworkProfileByIdInternal) | **GET** /tessell-internal/network/network-profiles/{id} | Get Network Profile by Id
[**getNetworkProfilesInternal**](TessellNetworkProfileInternalViewApi.md#getNetworkProfilesInternal) | **GET** /tessell-internal/network/network-profiles | Get a list of Network Profiles



## getNetworkProfileByIdInternal

> TessellNetworkProfileDTO getNetworkProfileByIdInternal(id, disableAclCheck)

Get Network Profile by Id

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellNetworkProfileInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellNetworkProfileInternalViewApi apiInstance = new TessellNetworkProfileInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        Boolean disableAclCheck = false; // Boolean | Disable Acl Check
        try {
            TessellNetworkProfileDTO result = apiInstance.getNetworkProfileByIdInternal(id, disableAclCheck);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellNetworkProfileInternalViewApi#getNetworkProfileByIdInternal");
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
 **id** | [**UUID**](.md)| Tessell Generated UUID for the Entity |
 **disableAclCheck** | **Boolean**| Disable Acl Check | [optional] [default to false]

### Return type

[**TessellNetworkProfileDTO**](TessellNetworkProfileDTO.md)

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


## getNetworkProfilesInternal

> List&lt;TessellNetworkProfileDTO&gt; getNetworkProfilesInternal(name, subscriptionId, cloudType, region, disableAclCheck, pageSize, pageOffset)

Get a list of Network Profiles

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellNetworkProfileInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellNetworkProfileInternalViewApi apiInstance = new TessellNetworkProfileInternalViewApi(defaultClient);
        String name = "example-123"; // String | Name of the Entity
        UUID subscriptionId = new UUID(); // UUID | Id of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Boolean disableAclCheck = false; // Boolean | Disable Acl Check
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellNetworkProfileDTO> result = apiInstance.getNetworkProfilesInternal(name, subscriptionId, cloudType, region, disableAclCheck, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellNetworkProfileInternalViewApi#getNetworkProfilesInternal");
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
 **name** | **String**| Name of the Entity | [optional]
 **subscriptionId** | [**UUID**](.md)| Id of the Subscription | [optional]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region | [optional]
 **disableAclCheck** | **Boolean**| Disable Acl Check | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellNetworkProfileDTO&gt;**](TessellNetworkProfileDTO.md)

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

