# TessellVpcInternalViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyActionOnVpcInternal**](TessellVpcInternalViewApi.md#applyActionOnVpcInternal) | **GET** /tessell-internal/network/vpcs/{id}/{action} | Apply given action on a VPC
[**bulkDeleteVpcs**](TessellVpcInternalViewApi.md#bulkDeleteVpcs) | **DELETE** /tessell-internal/network/bulk-delete/vpcs | Delete the vpcs for subscription.
[**createVpcCloudResourcesConfig**](TessellVpcInternalViewApi.md#createVpcCloudResourcesConfig) | **POST** /tessell-internal/network/vpcs/{id}/create-vpc-cloud-resources | Trigger VPC Creation if not Created
[**createVpcInternal**](TessellVpcInternalViewApi.md#createVpcInternal) | **POST** /tessell-internal/network/vpcs | Create a VPC
[**deleteVpcAclsInternal**](TessellVpcInternalViewApi.md#deleteVpcAclsInternal) | **DELETE** /tessell-internal/network/vpcs/{id}/acls | Delete Vpc Acls
[**deleteVpcInternal**](TessellVpcInternalViewApi.md#deleteVpcInternal) | **DELETE** /tessell-internal/network/vpcs/{id} | Delete a VPC
[**getBulkDeleteVpcStatus**](TessellVpcInternalViewApi.md#getBulkDeleteVpcStatus) | **POST** /tessell-internal/network/bulk-delete/vpcs | get status of bulk delete api
[**getVpcAclsInternal**](TessellVpcInternalViewApi.md#getVpcAclsInternal) | **GET** /tessell-internal/network/vpcs/{id}/acls | Get Vpc Acls
[**getVpcByIdInternal**](TessellVpcInternalViewApi.md#getVpcByIdInternal) | **GET** /tessell-internal/network/vpcs/{id} | Get VPC by Id
[**getVpcEligibleUserListInternal**](TessellVpcInternalViewApi.md#getVpcEligibleUserListInternal) | **GET** /tessell-internal/network/vpcs/{id}/acls/eligible-users | Get List of Users With Allowed Acls
[**getVpcInternal**](TessellVpcInternalViewApi.md#getVpcInternal) | **GET** /tessell-internal/network/vpcs | Get a list of VPCs
[**modifyVpcAclsInternal**](TessellVpcInternalViewApi.md#modifyVpcAclsInternal) | **PATCH** /tessell-internal/network/vpcs/{id}/acls | Modify Vpc Acls
[**registerVpcInternal**](TessellVpcInternalViewApi.md#registerVpcInternal) | **POST** /tessell-internal/network/vpcs/register | Register a VPC
[**triggerVpcCreationInternal**](TessellVpcInternalViewApi.md#triggerVpcCreationInternal) | **GET** /tessell-internal/network/vpcs/{id}/trigger-vpc-creation | Trigger VPC Creation if not Created
[**updateVpcInternal**](TessellVpcInternalViewApi.md#updateVpcInternal) | **PATCH** /tessell-internal/network/vpcs/{id} | Update a VPC



## applyActionOnVpcInternal

> TessellApiStatusDTO applyActionOnVpcInternal(id, action)

Apply given action on a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellNetworkActionDTO action = TessellNetworkActionDTO.fromValue("publish"); // TessellNetworkActionDTO | Action to be performed
        try {
            TessellApiStatusDTO result = apiInstance.applyActionOnVpcInternal(id, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#applyActionOnVpcInternal");
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
 **action** | [**TessellNetworkActionDTO**](.md)| Action to be performed | [enum: publish, unpublish, draft]

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


## bulkDeleteVpcs

> TessellResourceBulkDeleteResponseOpsDTO bulkDeleteVpcs(tessellBulkDeleteVpcsPayloadDTO)

Delete the vpcs for subscription.

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        TessellBulkDeleteVpcsPayloadDTO tessellBulkDeleteVpcsPayloadDTO = new TessellBulkDeleteVpcsPayloadDTO(); // TessellBulkDeleteVpcsPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.bulkDeleteVpcs(tessellBulkDeleteVpcsPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#bulkDeleteVpcs");
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
 **tessellBulkDeleteVpcsPayloadDTO** | [**TessellBulkDeleteVpcsPayloadDTO**](TessellBulkDeleteVpcsPayloadDTO.md)|  | [optional]

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


## createVpcCloudResourcesConfig

> TessellApiStatusDTO createVpcCloudResourcesConfig(id, tessellCreateVpcCloudResourcesConfigDTO)

Trigger VPC Creation if not Created

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellCreateVpcCloudResourcesConfigDTO tessellCreateVpcCloudResourcesConfigDTO = new TessellCreateVpcCloudResourcesConfigDTO(); // TessellCreateVpcCloudResourcesConfigDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.createVpcCloudResourcesConfig(id, tessellCreateVpcCloudResourcesConfigDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#createVpcCloudResourcesConfig");
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
 **tessellCreateVpcCloudResourcesConfigDTO** | [**TessellCreateVpcCloudResourcesConfigDTO**](TessellCreateVpcCloudResourcesConfigDTO.md)|  | [optional]

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


## createVpcInternal

> TessellVpcDTO createVpcInternal(tessellCreateVpcPayloadDTO)

Create a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        TessellCreateVpcPayloadDTO tessellCreateVpcPayloadDTO = new TessellCreateVpcPayloadDTO(); // TessellCreateVpcPayloadDTO | VPC Information
        try {
            TessellVpcDTO result = apiInstance.createVpcInternal(tessellCreateVpcPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#createVpcInternal");
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
 **tessellCreateVpcPayloadDTO** | [**TessellCreateVpcPayloadDTO**](TessellCreateVpcPayloadDTO.md)| VPC Information |

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


## deleteVpcAclsInternal

> TessellApiStatusDTO deleteVpcAclsInternal(id, tessellAclRevokePayloadDTO)

Delete Vpc Acls

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO = new TessellAclRevokePayloadDTO(); // TessellAclRevokePayloadDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcAclsInternal(id, tessellAclRevokePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#deleteVpcAclsInternal");
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
 **tessellAclRevokePayloadDTO** | [**TessellAclRevokePayloadDTO**](TessellAclRevokePayloadDTO.md)|  | [optional]

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


## deleteVpcInternal

> TessellApiStatusDTO deleteVpcInternal(id, disableAclCheck, softDelete)

Delete a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        Boolean disableAclCheck = false; // Boolean | Disable Acl Check
        Boolean softDelete = true; // Boolean | Soft delete an entity
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcInternal(id, disableAclCheck, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#deleteVpcInternal");
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
 **softDelete** | **Boolean**| Soft delete an entity | [optional] [default to true]

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


## getBulkDeleteVpcStatus

> TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteVpcStatus(tessellBulkDeleteVpcsStatusPayloadDTO)

get status of bulk delete api

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        TessellBulkDeleteVpcsStatusPayloadDTO tessellBulkDeleteVpcsStatusPayloadDTO = new TessellBulkDeleteVpcsStatusPayloadDTO(); // TessellBulkDeleteVpcsStatusPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.getBulkDeleteVpcStatus(tessellBulkDeleteVpcsStatusPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#getBulkDeleteVpcStatus");
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
 **tessellBulkDeleteVpcsStatusPayloadDTO** | [**TessellBulkDeleteVpcsStatusPayloadDTO**](TessellBulkDeleteVpcsStatusPayloadDTO.md)|  | [optional]

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


## getVpcAclsInternal

> TessellEntityAclSharingInfoDTO getVpcAclsInternal(id)

Get Vpc Acls

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellEntityAclSharingInfoDTO result = apiInstance.getVpcAclsInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#getVpcAclsInternal");
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

[**TessellEntityAclSharingInfoDTO**](TessellEntityAclSharingInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## getVpcByIdInternal

> TessellVpcDTO getVpcByIdInternal(id, includeSubnetGroups, disableAclCheck)

Get VPC by Id

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        Boolean includeSubnetGroups = false; // Boolean | Include Subnet Groups Information
        Boolean disableAclCheck = false; // Boolean | Disable Acl Check
        try {
            TessellVpcDTO result = apiInstance.getVpcByIdInternal(id, includeSubnetGroups, disableAclCheck);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#getVpcByIdInternal");
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
 **includeSubnetGroups** | **Boolean**| Include Subnet Groups Information | [optional] [default to false]
 **disableAclCheck** | **Boolean**| Disable Acl Check | [optional] [default to false]

### Return type

[**TessellVpcDTO**](TessellVpcDTO.md)

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


## getVpcEligibleUserListInternal

> List&lt;TessellAclEligibleUserDTO&gt; getVpcEligibleUserListInternal(id, roles)

Get List of Users With Allowed Acls

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        List<TessellRolesDTO> roles = Arrays.asList(); // List<TessellRolesDTO> | Roles for the entity
        try {
            List<TessellAclEligibleUserDTO> result = apiInstance.getVpcEligibleUserListInternal(id, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#getVpcEligibleUserListInternal");
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
 **roles** | [**List&lt;TessellRolesDTO&gt;**](TessellRolesDTO.md)| Roles for the entity | [optional]

### Return type

[**List&lt;TessellAclEligibleUserDTO&gt;**](TessellAclEligibleUserDTO.md)

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


## getVpcInternal

> List&lt;TessellVpcDTO&gt; getVpcInternal(name, subscriptionId, cloudType, region, disableAclCheck, includeSharedWith, includeSubnetGroups, pageSize, pageOffset)

Get a list of VPCs

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        String name = "example-123"; // String | Name of the Entity
        UUID subscriptionId = new UUID(); // UUID | Id of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Boolean disableAclCheck = false; // Boolean | Disable Acl Check
        Boolean includeSharedWith = false; // Boolean | Include Shared with Info
        Boolean includeSubnetGroups = false; // Boolean | Include Subnet Groups Information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellVpcDTO> result = apiInstance.getVpcInternal(name, subscriptionId, cloudType, region, disableAclCheck, includeSharedWith, includeSubnetGroups, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#getVpcInternal");
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
 **includeSharedWith** | **Boolean**| Include Shared with Info | [optional] [default to false]
 **includeSubnetGroups** | **Boolean**| Include Subnet Groups Information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellVpcDTO&gt;**](TessellVpcDTO.md)

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


## modifyVpcAclsInternal

> TessellAclPayloadDTO modifyVpcAclsInternal(id, tessellAclPayloadDTO)

Modify Vpc Acls

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellAclPayloadDTO tessellAclPayloadDTO = new TessellAclPayloadDTO(); // TessellAclPayloadDTO | 
        try {
            TessellAclPayloadDTO result = apiInstance.modifyVpcAclsInternal(id, tessellAclPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#modifyVpcAclsInternal");
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
 **tessellAclPayloadDTO** | [**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)|  | [optional]

### Return type

[**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## registerVpcInternal

> TessellVpcServiceConsumerDTO registerVpcInternal(tessellRegisterClientVpcServiceConsumerPayloadDTO)

Register a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO = new TessellRegisterClientVpcServiceConsumerPayloadDTO(); // TessellRegisterClientVpcServiceConsumerPayloadDTO | VPC Information
        try {
            TessellVpcServiceConsumerDTO result = apiInstance.registerVpcInternal(tessellRegisterClientVpcServiceConsumerPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#registerVpcInternal");
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
 **tessellRegisterClientVpcServiceConsumerPayloadDTO** | [**TessellRegisterClientVpcServiceConsumerPayloadDTO**](TessellRegisterClientVpcServiceConsumerPayloadDTO.md)| VPC Information |

### Return type

[**TessellVpcServiceConsumerDTO**](TessellVpcServiceConsumerDTO.md)

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


## triggerVpcCreationInternal

> TessellApiStatusDTO triggerVpcCreationInternal(id)

Trigger VPC Creation if not Created

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellApiStatusDTO result = apiInstance.triggerVpcCreationInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#triggerVpcCreationInternal");
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


## updateVpcInternal

> TessellVpcDTO updateVpcInternal(id, tessellUpdateVpcPayloadDTO)

Update a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcInternalViewApi apiInstance = new TessellVpcInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO = new TessellUpdateVpcPayloadDTO(); // TessellUpdateVpcPayloadDTO | 
        try {
            TessellVpcDTO result = apiInstance.updateVpcInternal(id, tessellUpdateVpcPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcInternalViewApi#updateVpcInternal");
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

