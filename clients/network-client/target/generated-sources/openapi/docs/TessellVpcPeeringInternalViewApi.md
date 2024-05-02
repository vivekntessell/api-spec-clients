# TessellVpcPeeringInternalViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteVpcPeering**](TessellVpcPeeringInternalViewApi.md#bulkDeleteVpcPeering) | **DELETE** /tessell-internal/network/bulk-delete/vpc-peerings | Delete all vpc peering between vpcs for a subscription.
[**createVpcPeeringInternal**](TessellVpcPeeringInternalViewApi.md#createVpcPeeringInternal) | **POST** /tessell-internal/network/vpc/{vpcId}/vpc-peerings | Create a VPC Peering
[**deleteVpcPeeringInternal**](TessellVpcPeeringInternalViewApi.md#deleteVpcPeeringInternal) | **DELETE** /tessell-internal/network/vpc-peerings/{id} | Delete a VPC Peering
[**getBulkDeleteVpcPeeringStatus**](TessellVpcPeeringInternalViewApi.md#getBulkDeleteVpcPeeringStatus) | **POST** /tessell-internal/network/bulk-delete/vpc-peerings | get status of bulk delete api
[**getVpcPeeringByIdInternal**](TessellVpcPeeringInternalViewApi.md#getVpcPeeringByIdInternal) | **GET** /tessell-internal/network/vpc-peerings/{id} | Get VPC Peering by Id for the VPC
[**getVpcPeeringsInternal**](TessellVpcPeeringInternalViewApi.md#getVpcPeeringsInternal) | **GET** /tessell-internal/network/vpc/{vpcId}/vpc-peerings | Get a list of VPC Peerings of the VPC



## bulkDeleteVpcPeering

> TessellResourceBulkDeleteResponseOpsDTO bulkDeleteVpcPeering(tessellBulkDeleteVpcPeeringPayloadDTO)

Delete all vpc peering between vpcs for a subscription.

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        TessellBulkDeleteVpcPeeringPayloadDTO tessellBulkDeleteVpcPeeringPayloadDTO = new TessellBulkDeleteVpcPeeringPayloadDTO(); // TessellBulkDeleteVpcPeeringPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.bulkDeleteVpcPeering(tessellBulkDeleteVpcPeeringPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#bulkDeleteVpcPeering");
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
 **tessellBulkDeleteVpcPeeringPayloadDTO** | [**TessellBulkDeleteVpcPeeringPayloadDTO**](TessellBulkDeleteVpcPeeringPayloadDTO.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOpsDTO**](TessellResourceBulkDeleteResponseOpsDTO.md)

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


## createVpcPeeringInternal

> TessellVpcPeeringDTO createVpcPeeringInternal(vpcId, tessellCreateVpcPeeringPayloadDTO)

Create a VPC Peering

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        UUID vpcId = new UUID(); // UUID | VPC Id
        TessellCreateVpcPeeringPayloadDTO tessellCreateVpcPeeringPayloadDTO = new TessellCreateVpcPeeringPayloadDTO(); // TessellCreateVpcPeeringPayloadDTO | VPC Peering Information
        try {
            TessellVpcPeeringDTO result = apiInstance.createVpcPeeringInternal(vpcId, tessellCreateVpcPeeringPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#createVpcPeeringInternal");
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
 **vpcId** | **UUID**| VPC Id |
 **tessellCreateVpcPeeringPayloadDTO** | [**TessellCreateVpcPeeringPayloadDTO**](TessellCreateVpcPeeringPayloadDTO.md)| VPC Peering Information |

### Return type

[**TessellVpcPeeringDTO**](TessellVpcPeeringDTO.md)

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


## deleteVpcPeeringInternal

> TessellApiStatusDTO deleteVpcPeeringInternal(id)

Delete a VPC Peering

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcPeeringInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#deleteVpcPeeringInternal");
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


## getBulkDeleteVpcPeeringStatus

> TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteVpcPeeringStatus(tessellBulkDeleteVpcPeeringStatusPayloadDTO)

get status of bulk delete api

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        TessellBulkDeleteVpcPeeringStatusPayloadDTO tessellBulkDeleteVpcPeeringStatusPayloadDTO = new TessellBulkDeleteVpcPeeringStatusPayloadDTO(); // TessellBulkDeleteVpcPeeringStatusPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.getBulkDeleteVpcPeeringStatus(tessellBulkDeleteVpcPeeringStatusPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#getBulkDeleteVpcPeeringStatus");
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
 **tessellBulkDeleteVpcPeeringStatusPayloadDTO** | [**TessellBulkDeleteVpcPeeringStatusPayloadDTO**](TessellBulkDeleteVpcPeeringStatusPayloadDTO.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOpsDTO**](TessellResourceBulkDeleteResponseOpsDTO.md)

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


## getVpcPeeringByIdInternal

> TessellVpcPeeringDTO getVpcPeeringByIdInternal(id)

Get VPC Peering by Id for the VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellVpcPeeringDTO result = apiInstance.getVpcPeeringByIdInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#getVpcPeeringByIdInternal");
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

[**TessellVpcPeeringDTO**](TessellVpcPeeringDTO.md)

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


## getVpcPeeringsInternal

> List&lt;TessellVpcPeeringDTO&gt; getVpcPeeringsInternal(vpcId, status, pageSize, pageOffset)

Get a list of VPC Peerings of the VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringInternalViewApi apiInstance = new TessellVpcPeeringInternalViewApi(defaultClient);
        UUID vpcId = new UUID(); // UUID | VPC Id
        TessellVpcPeeringStatusDTO status = TessellVpcPeeringStatusDTO.fromValue("CREATING"); // TessellVpcPeeringStatusDTO | status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellVpcPeeringDTO> result = apiInstance.getVpcPeeringsInternal(vpcId, status, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringInternalViewApi#getVpcPeeringsInternal");
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
 **vpcId** | **UUID**| VPC Id |
 **status** | [**TessellVpcPeeringStatusDTO**](.md)| status | [optional] [enum: CREATING, PENDING_PEER, ACTIVE, FAILED, DELETING, DELETION_FAILED]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellVpcPeeringDTO&gt;**](TessellVpcPeeringDTO.md)

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

