# TessellVpcAdminViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**applyActionOnVpc**](TessellVpcAdminViewApi.md#applyActionOnVpc) | **PATCH** /network/governance/vpcs/{name}/{action} | Apply action on a VPC
[**createVpcGovernance**](TessellVpcAdminViewApi.md#createVpcGovernance) | **POST** /network/governance/vpcs | Create a VPC
[**deleteVpcAcls**](TessellVpcAdminViewApi.md#deleteVpcAcls) | **DELETE** /network/governance/vpcs/{name}/acls | Delete ACL (Access Control List) of a VPC
[**deleteVpcGovernance**](TessellVpcAdminViewApi.md#deleteVpcGovernance) | **DELETE** /network/governance/vpcs/{name} | Delete a VPC
[**getVpcAcls**](TessellVpcAdminViewApi.md#getVpcAcls) | **GET** /network/governance/vpcs/{name}/acls | Get ACL (Access Control List) of a VPC
[**getVpcByNameGovernance**](TessellVpcAdminViewApi.md#getVpcByNameGovernance) | **GET** /network/governance/vpcs/{name} | Get VPC as an administrator by Name
[**getVpcEligibleUserList**](TessellVpcAdminViewApi.md#getVpcEligibleUserList) | **GET** /network/governance/vpcs/{name}/acls/eligible-users | Get a list of Users with allowed accesses for a VPC
[**getVpcSubnetsGovernance**](TessellVpcAdminViewApi.md#getVpcSubnetsGovernance) | **GET** /network/governance/vpc/{vpcName}/subnets | Get a list of Subnets of a VPC
[**getVpcsGovernance**](TessellVpcAdminViewApi.md#getVpcsGovernance) | **GET** /network/governance/vpcs | Get a list of VPCs as an administrator
[**getVpcsToRegisterGovernance**](TessellVpcAdminViewApi.md#getVpcsToRegisterGovernance) | **POST** /network/governance/vpcs/discovery | List VPCs from a BYOA Subscription to register in Tessell
[**modifyVpcAcls**](TessellVpcAdminViewApi.md#modifyVpcAcls) | **PATCH** /network/governance/vpcs/{name}/acls | Modify ACL (Access Control List) of a VPC
[**registerVpcGovernance**](TessellVpcAdminViewApi.md#registerVpcGovernance) | **POST** /network/governance/vpcs/register | Register VPC from a BYOA subscription



## applyActionOnVpc

> TessellApiStatusDTO applyActionOnVpc(name, subscriptionName, cloudType, region, action)

Apply action on a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        TessellNetworkActionDTO action = TessellNetworkActionDTO.fromValue("publish"); // TessellNetworkActionDTO | Action to be performed
        try {
            TessellApiStatusDTO result = apiInstance.applyActionOnVpc(name, subscriptionName, cloudType, region, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#applyActionOnVpc");
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


## createVpcGovernance

> TessellVpcServiceConsumerDTO createVpcGovernance(tessellCreateVpcServiceConsumerPayloadDTO)

Create a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        TessellCreateVpcServiceConsumerPayloadDTO tessellCreateVpcServiceConsumerPayloadDTO = new TessellCreateVpcServiceConsumerPayloadDTO(); // TessellCreateVpcServiceConsumerPayloadDTO | VPC Information
        try {
            TessellVpcServiceConsumerDTO result = apiInstance.createVpcGovernance(tessellCreateVpcServiceConsumerPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#createVpcGovernance");
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
 **tessellCreateVpcServiceConsumerPayloadDTO** | [**TessellCreateVpcServiceConsumerPayloadDTO**](TessellCreateVpcServiceConsumerPayloadDTO.md)| VPC Information |

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


## deleteVpcAcls

> TessellApiStatusDTO deleteVpcAcls(name, subscriptionName, cloudType, region, tessellAclRevokePayloadDTO)

Delete ACL (Access Control List) of a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO = new TessellAclRevokePayloadDTO(); // TessellAclRevokePayloadDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcAcls(name, subscriptionName, cloudType, region, tessellAclRevokePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#deleteVpcAcls");
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


## deleteVpcGovernance

> TessellApiStatusDTO deleteVpcGovernance(name, subscriptionName, cloudType, region)

Delete a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcGovernance(name, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#deleteVpcGovernance");
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


## getVpcAcls

> TessellEntityAclSharingInfoDTO getVpcAcls(name, subscriptionName, cloudType, region)

Get ACL (Access Control List) of a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        try {
            TessellEntityAclSharingInfoDTO result = apiInstance.getVpcAcls(name, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcAcls");
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


## getVpcByNameGovernance

> TessellVpcServiceConsumerDTO getVpcByNameGovernance(name, subscriptionName, cloudType, region, includeSharedWith)

Get VPC as an administrator by Name

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Boolean includeSharedWith = false; // Boolean | Include Shared with Info
        try {
            TessellVpcServiceConsumerDTO result = apiInstance.getVpcByNameGovernance(name, subscriptionName, cloudType, region, includeSharedWith);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcByNameGovernance");
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
 **includeSharedWith** | **Boolean**| Include Shared with Info | [optional] [default to false]

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


## getVpcEligibleUserList

> List&lt;TessellAclEligibleUserDTO&gt; getVpcEligibleUserList(name, subscriptionName, cloudType, region, roles)

Get a list of Users with allowed accesses for a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        List<TessellRolesDTO> roles = Arrays.asList(); // List<TessellRolesDTO> | Roles for the entity
        try {
            List<TessellAclEligibleUserDTO> result = apiInstance.getVpcEligibleUserList(name, subscriptionName, cloudType, region, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcEligibleUserList");
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


## getVpcSubnetsGovernance

> TessellVpcSubnetServiceConsumerDTO getVpcSubnetsGovernance(vpcName, subscriptionName, cloudType, region, pageSize, pageOffset)

Get a list of Subnets of a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String vpcName = "vpcName_example"; // String | VPC Name
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellVpcSubnetServiceConsumerDTO result = apiInstance.getVpcSubnetsGovernance(vpcName, subscriptionName, cloudType, region, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcSubnetsGovernance");
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
 **vpcName** | **String**| VPC Name |
 **subscriptionName** | **String**| Name of the Subscription |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellVpcSubnetServiceConsumerDTO**](TessellVpcSubnetServiceConsumerDTO.md)

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


## getVpcsGovernance

> List&lt;TessellVpcServiceConsumerDTO&gt; getVpcsGovernance(subscriptionName, cloudType, region, includeSubnets, includeSharedWith, owners, pageSize, pageOffset)

Get a list of VPCs as an administrator

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        Boolean includeSubnets = false; // Boolean | Boolean flag to specify if Subnet details are required in response
        Boolean includeSharedWith = false; // Boolean | Include Shared with Info
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellVpcServiceConsumerDTO> result = apiInstance.getVpcsGovernance(subscriptionName, cloudType, region, includeSubnets, includeSharedWith, owners, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcsGovernance");
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
 **includeSharedWith** | **Boolean**| Include Shared with Info | [optional] [default to false]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
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


## getVpcsToRegisterGovernance

> List&lt;TessellClientVpcDTO&gt; getVpcsToRegisterGovernance(tessellDiscoverVpcPayloadDTO)

List VPCs from a BYOA Subscription to register in Tessell

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        TessellDiscoverVpcPayloadDTO tessellDiscoverVpcPayloadDTO = new TessellDiscoverVpcPayloadDTO(); // TessellDiscoverVpcPayloadDTO | 
        try {
            List<TessellClientVpcDTO> result = apiInstance.getVpcsToRegisterGovernance(tessellDiscoverVpcPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#getVpcsToRegisterGovernance");
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
 **tessellDiscoverVpcPayloadDTO** | [**TessellDiscoverVpcPayloadDTO**](TessellDiscoverVpcPayloadDTO.md)|  |

### Return type

[**List&lt;TessellClientVpcDTO&gt;**](TessellClientVpcDTO.md)

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


## modifyVpcAcls

> TessellAclPayloadDTO modifyVpcAcls(name, subscriptionName, cloudType, region, tessellAclPayloadDTO)

Modify ACL (Access Control List) of a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        TessellAclPayloadDTO tessellAclPayloadDTO = new TessellAclPayloadDTO(); // TessellAclPayloadDTO | 
        try {
            TessellAclPayloadDTO result = apiInstance.modifyVpcAcls(name, subscriptionName, cloudType, region, tessellAclPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#modifyVpcAcls");
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


## registerVpcGovernance

> TessellVpcServiceConsumerDTO registerVpcGovernance(tessellRegisterClientVpcServiceConsumerPayloadDTO)

Register VPC from a BYOA subscription

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcAdminViewApi apiInstance = new TessellVpcAdminViewApi(defaultClient);
        TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO = new TessellRegisterClientVpcServiceConsumerPayloadDTO(); // TessellRegisterClientVpcServiceConsumerPayloadDTO | VPC Information
        try {
            TessellVpcServiceConsumerDTO result = apiInstance.registerVpcGovernance(tessellRegisterClientVpcServiceConsumerPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcAdminViewApi#registerVpcGovernance");
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

