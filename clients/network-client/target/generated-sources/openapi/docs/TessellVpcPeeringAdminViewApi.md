# TessellVpcPeeringAdminViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createVpcPeeringAwsCloudformation**](TessellVpcPeeringAdminViewApi.md#createVpcPeeringAwsCloudformation) | **POST** /network/governance/vpc/{vpcName}/vpc-peerings/aws-cloudformation | Create a VPC Peering using AWS Cloudformation
[**createVpcPeeringGovernance**](TessellVpcPeeringAdminViewApi.md#createVpcPeeringGovernance) | **POST** /network/governance/vpc/{vpcName}/vpc-peerings | Create a Peering between VPCs
[**deleteVpcPeeringGovernance**](TessellVpcPeeringAdminViewApi.md#deleteVpcPeeringGovernance) | **DELETE** /network/governance/vpc/{vpcName}/vpc-peerings/{name} | Delete Vpc Peering
[**getVpcPeeringByNameGovernance**](TessellVpcPeeringAdminViewApi.md#getVpcPeeringByNameGovernance) | **GET** /network/governance/vpc/{vpcName}/vpc-peerings/{name} | Get VPC Peering by Name for a given VPC
[**getVpcPeeringCloudformationUrlGovernance**](TessellVpcPeeringAdminViewApi.md#getVpcPeeringCloudformationUrlGovernance) | **GET** /network/governance/vpc/{vpcName}/vpc-peerings-cloudformation-url | Get Cloudformation URL for VPC Peering
[**getVpcPeeringsGovernance**](TessellVpcPeeringAdminViewApi.md#getVpcPeeringsGovernance) | **GET** /network/governance/vpc/{vpcName}/vpc-peerings | Get a list of VPC Peerings of a VPC



## createVpcPeeringAwsCloudformation

> TessellVpcPeeringServiceConsumerDTO createVpcPeeringAwsCloudformation(vpcName, tessellCreateVpcPeeringAwsCloudformationPayloadDTO)

Create a VPC Peering using AWS Cloudformation

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String vpcName = "vpcName_example"; // String | VPC Name
        TessellCreateVpcPeeringAwsCloudformationPayloadDTO tessellCreateVpcPeeringAwsCloudformationPayloadDTO = new TessellCreateVpcPeeringAwsCloudformationPayloadDTO(); // TessellCreateVpcPeeringAwsCloudformationPayloadDTO | VPC Peering Information
        try {
            TessellVpcPeeringServiceConsumerDTO result = apiInstance.createVpcPeeringAwsCloudformation(vpcName, tessellCreateVpcPeeringAwsCloudformationPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#createVpcPeeringAwsCloudformation");
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
 **tessellCreateVpcPeeringAwsCloudformationPayloadDTO** | [**TessellCreateVpcPeeringAwsCloudformationPayloadDTO**](TessellCreateVpcPeeringAwsCloudformationPayloadDTO.md)| VPC Peering Information |

### Return type

[**TessellVpcPeeringServiceConsumerDTO**](TessellVpcPeeringServiceConsumerDTO.md)

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


## createVpcPeeringGovernance

> TessellVpcPeeringServiceConsumerDTO createVpcPeeringGovernance(vpcName, tessellCreateVpcPeeringServiceConsumerPayloadDTO)

Create a Peering between VPCs

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String vpcName = "vpcName_example"; // String | VPC Name
        TessellCreateVpcPeeringServiceConsumerPayloadDTO tessellCreateVpcPeeringServiceConsumerPayloadDTO = new TessellCreateVpcPeeringServiceConsumerPayloadDTO(); // TessellCreateVpcPeeringServiceConsumerPayloadDTO | VPC Peering Information
        try {
            TessellVpcPeeringServiceConsumerDTO result = apiInstance.createVpcPeeringGovernance(vpcName, tessellCreateVpcPeeringServiceConsumerPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#createVpcPeeringGovernance");
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
 **tessellCreateVpcPeeringServiceConsumerPayloadDTO** | [**TessellCreateVpcPeeringServiceConsumerPayloadDTO**](TessellCreateVpcPeeringServiceConsumerPayloadDTO.md)| VPC Peering Information |

### Return type

[**TessellVpcPeeringServiceConsumerDTO**](TessellVpcPeeringServiceConsumerDTO.md)

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


## deleteVpcPeeringGovernance

> TessellApiStatusDTO deleteVpcPeeringGovernance(name, vpcName, subscriptionName, cloudType, region)

Delete Vpc Peering

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String vpcName = "vpcName_example"; // String | VPC Name
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        try {
            TessellApiStatusDTO result = apiInstance.deleteVpcPeeringGovernance(name, vpcName, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#deleteVpcPeeringGovernance");
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
 **vpcName** | **String**| VPC Name |
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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getVpcPeeringByNameGovernance

> TessellVpcPeeringServiceConsumerDTO getVpcPeeringByNameGovernance(name, vpcName, subscriptionName, cloudType, region)

Get VPC Peering by Name for a given VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String name = "entity-123"; // String | Name of the Entity
        String vpcName = "vpcName_example"; // String | VPC Name
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        try {
            TessellVpcPeeringServiceConsumerDTO result = apiInstance.getVpcPeeringByNameGovernance(name, vpcName, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#getVpcPeeringByNameGovernance");
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
 **vpcName** | **String**| VPC Name |
 **subscriptionName** | **String**| Name of the Subscription |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region |

### Return type

[**TessellVpcPeeringServiceConsumerDTO**](TessellVpcPeeringServiceConsumerDTO.md)

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


## getVpcPeeringCloudformationUrlGovernance

> TessellVpcPeeringAwsCloudformationLinkDTO getVpcPeeringCloudformationUrlGovernance(vpcName, subscriptionName, cloudType, region, clientVpcRegion)

Get Cloudformation URL for VPC Peering

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String vpcName = "vpcName_example"; // String | VPC Name
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        String clientVpcRegion = "clientVpcRegion_example"; // String | Region of the Client VPC to be peered
        try {
            TessellVpcPeeringAwsCloudformationLinkDTO result = apiInstance.getVpcPeeringCloudformationUrlGovernance(vpcName, subscriptionName, cloudType, region, clientVpcRegion);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#getVpcPeeringCloudformationUrlGovernance");
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
 **clientVpcRegion** | **String**| Region of the Client VPC to be peered |

### Return type

[**TessellVpcPeeringAwsCloudformationLinkDTO**](TessellVpcPeeringAwsCloudformationLinkDTO.md)

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


## getVpcPeeringsGovernance

> List&lt;TessellVpcPeeringServiceConsumerDTO&gt; getVpcPeeringsGovernance(vpcName, subscriptionName, cloudType, region, status, pageSize, pageOffset)

Get a list of VPC Peerings of a VPC

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellVpcPeeringAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellVpcPeeringAdminViewApi apiInstance = new TessellVpcPeeringAdminViewApi(defaultClient);
        String vpcName = "vpcName_example"; // String | VPC Name
        String subscriptionName = "default"; // String | Name of the Subscription
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        TessellVpcPeeringStatusDTO status = TessellVpcPeeringStatusDTO.fromValue("CREATING"); // TessellVpcPeeringStatusDTO | status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellVpcPeeringServiceConsumerDTO> result = apiInstance.getVpcPeeringsGovernance(vpcName, subscriptionName, cloudType, region, status, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellVpcPeeringAdminViewApi#getVpcPeeringsGovernance");
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
 **status** | [**TessellVpcPeeringStatusDTO**](.md)| status | [optional] [enum: CREATING, PENDING_PEER, ACTIVE, FAILED, DELETING, DELETION_FAILED]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellVpcPeeringServiceConsumerDTO&gt;**](TessellVpcPeeringServiceConsumerDTO.md)

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

