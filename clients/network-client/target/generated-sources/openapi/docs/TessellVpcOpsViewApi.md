# TessellVpcOpsViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteSubnetMetadataInternal**](TessellVpcOpsViewApi.md#deleteSubnetMetadataInternal) | **DELETE** /tessell-ops/network/subnets/{id} | Delete subnet metadata
[**getSubnetByIdInternal**](TessellVpcOpsViewApi.md#getSubnetByIdInternal) | **GET** /tessell-ops/network/subnets/{id} | Get Subnet by Id
[**setVpcEndpointsMetadataInternal**](TessellVpcOpsViewApi.md#setVpcEndpointsMetadataInternal) | **PUT** /tessell-ops/network/vpcs/{id}/vpc-endpoints | Set VPC Endpoints metadata
[**updateSubnetMetadataInternal**](TessellVpcOpsViewApi.md#updateSubnetMetadataInternal) | **PATCH** /tessell-ops/network/subnets/{id} | Update Subnet metadata by Id
[**updateVpcMetadataInternal**](TessellVpcOpsViewApi.md#updateVpcMetadataInternal) | **PATCH** /tessell-ops/network/vpcs/{id} | Update VPC metadata



## deleteSubnetMetadataInternal

> TessellApiStatusDTO deleteSubnetMetadataInternal(id)

Delete subnet metadata

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcOpsViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcOpsViewApi apiInstance = new TessellVpcOpsViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellApiStatusDTO result = apiInstance.deleteSubnetMetadataInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcOpsViewApi#deleteSubnetMetadataInternal");
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

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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


## getSubnetByIdInternal

> TessellSubnetDTO getSubnetByIdInternal(id)

Get Subnet by Id

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcOpsViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcOpsViewApi apiInstance = new TessellVpcOpsViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellSubnetDTO result = apiInstance.getSubnetByIdInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcOpsViewApi#getSubnetByIdInternal");
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

### Return type

[**TessellSubnetDTO**](TessellSubnetDTO.md)

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


## setVpcEndpointsMetadataInternal

> setVpcEndpointsMetadataInternal(id, requestBody)

Set VPC Endpoints metadata

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcOpsViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcOpsViewApi apiInstance = new TessellVpcOpsViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        Map<String, TessellVpcEndpointDTO> requestBody = new HashMap(); // Map<String, TessellVpcEndpointDTO> | 
        try {
            apiInstance.setVpcEndpointsMetadataInternal(id, requestBody);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcOpsViewApi#setVpcEndpointsMetadataInternal");
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
 **requestBody** | [**Map&lt;String, TessellVpcEndpointDTO&gt;**](TessellVpcEndpointDTO.md)|  |

### Return type

null (empty response body)

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


## updateSubnetMetadataInternal

> TessellSubnetDTO updateSubnetMetadataInternal(id, tessellUpdateSubnetPayloadDTO)

Update Subnet metadata by Id

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcOpsViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcOpsViewApi apiInstance = new TessellVpcOpsViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellUpdateSubnetPayloadDTO tessellUpdateSubnetPayloadDTO = new TessellUpdateSubnetPayloadDTO(); // TessellUpdateSubnetPayloadDTO | 
        try {
            TessellSubnetDTO result = apiInstance.updateSubnetMetadataInternal(id, tessellUpdateSubnetPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcOpsViewApi#updateSubnetMetadataInternal");
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
 **tessellUpdateSubnetPayloadDTO** | [**TessellUpdateSubnetPayloadDTO**](TessellUpdateSubnetPayloadDTO.md)|  | [optional]

### Return type

[**TessellSubnetDTO**](TessellSubnetDTO.md)

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


## updateVpcMetadataInternal

> TessellVpcDTO updateVpcMetadataInternal(id, tessellUpdateVpcPayloadDTO)

Update VPC metadata

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcOpsViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcOpsViewApi apiInstance = new TessellVpcOpsViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO = new TessellUpdateVpcPayloadDTO(); // TessellUpdateVpcPayloadDTO | 
        try {
            TessellVpcDTO result = apiInstance.updateVpcMetadataInternal(id, tessellUpdateVpcPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcOpsViewApi#updateVpcMetadataInternal");
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
 **tessellUpdateVpcPayloadDTO** | [**TessellUpdateVpcPayloadDTO**](TessellUpdateVpcPayloadDTO.md)|  | [optional]

### Return type

[**TessellVpcDTO**](TessellVpcDTO.md)

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

