# TessellInfraResourceControllerApi

All URIs are relative to *http://tessell-infra:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInfraResource**](TessellInfraResourceControllerApi.md#createInfraResource) | **POST** /tessell-ops/infra/resources | Create a new Tessell Infra Resource
[**deleteInfraResource**](TessellInfraResourceControllerApi.md#deleteInfraResource) | **DELETE** /tessell-ops/infra/resources | Delete a Tessell Infra Resource
[**getInfraResources**](TessellInfraResourceControllerApi.md#getInfraResources) | **GET** /tessell-ops/infra/resources | View a list of available Tessell Infra Resources
[**getK8sName**](TessellInfraResourceControllerApi.md#getK8sName) | **GET** /tessell-ops/infra/resources/k8s-name | View the K8s name
[**getPresignedURL**](TessellInfraResourceControllerApi.md#getPresignedURL) | **GET** /tessell-ops/libraries/presigned-url | Fetches the presigned url for the provided s3 object
[**updateInfraResource**](TessellInfraResourceControllerApi.md#updateInfraResource) | **PATCH** /tessell-ops/infra/resources | Update a Tessell Infra Resource



## createInfraResource

> List&lt;InfraResource&gt; createInfraResource(infraResource)

Create a new Tessell Infra Resource

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        List<InfraResource> infraResource = Arrays.asList(); // List<InfraResource> | 
        try {
            List<InfraResource> result = apiInstance.createInfraResource(infraResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#createInfraResource");
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
 **infraResource** | [**List&lt;InfraResource&gt;**](InfraResource.md)|  | [optional]

### Return type

[**List&lt;InfraResource&gt;**](InfraResource.md)

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


## deleteInfraResource

> ApiStatus deleteInfraResource(cloudResourceUrl, softDelete)

Delete a Tessell Infra Resource

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        String cloudResourceUrl = "cloudResourceUrl_example"; // String | Cloud Resource Url
        Boolean softDelete = true; // Boolean | Soft delete an entity
        try {
            ApiStatus result = apiInstance.deleteInfraResource(cloudResourceUrl, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#deleteInfraResource");
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
 **cloudResourceUrl** | **String**| Cloud Resource Url |
 **softDelete** | **Boolean**| Soft delete an entity | [optional] [default to true]

### Return type

[**ApiStatus**](ApiStatus.md)

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


## getInfraResources

> List&lt;InfraResource&gt; getInfraResources(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, resourceType, includeSecrets, pageSize, pageOffset, timeZone)

View a list of available Tessell Infra Resources

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        String cloudResourceUrl = ""; // String | Cloud Resource Url
        UUID cloudAccountId = new UUID(); // UUID | Cloud Account Id
        String cloudLocation = ""; // String | Cloud Location
        String purpose = ""; // String | Resource Purpose
        InfraResourceStatus status = InfraResourceStatus.fromValue("CREATED"); // InfraResourceStatus | Infra Resource Status
        InfraResourceType resourceType = InfraResourceType.fromValue("AWS_EC2_REPO"); // InfraResourceType | Infra Resource Type
        Boolean includeSecrets = true; // Boolean | Whether to include secrets in the response
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<InfraResource> result = apiInstance.getInfraResources(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, resourceType, includeSecrets, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#getInfraResources");
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
 **cloudResourceUrl** | **String**| Cloud Resource Url | [optional] [default to ]
 **cloudAccountId** | [**UUID**](.md)| Cloud Account Id | [optional]
 **cloudLocation** | **String**| Cloud Location | [optional] [default to ]
 **purpose** | **String**| Resource Purpose | [optional] [default to ]
 **status** | [**InfraResourceStatus**](.md)| Infra Resource Status | [optional] [enum: CREATED, CREATING, DELETED, DELETING, STOPPED]
 **resourceType** | [**InfraResourceType**](.md)| Infra Resource Type | [optional] [enum: AWS_EC2_REPO, AWS_EKS, AWS_LAMBDA, AWS_SQS, AWS_VPC, AWS_S3, AWS_DYNAMODB, AZURE_AKS, AZURE_AQS, AZURE_BLOB_STORAGE, AZURE_FUNCTION, AZURE_WORKSPACE, AZURE_VNET, AWS_IAM, AZURE_LOG_ANALYTICS_WORKSPACE, AZURE_RESOURCE_GROUP, RECOVERY_SERVICE_VAULT, AZURE_STORAGE_ACCOUNT, AZURE_USER_ASSIGNED_IDENTITY, AZURE_APP_GTW, AZURE_KEY_VAULT, METADATA_REPO, AZURE_B2C_TENANT, AZURE_DNS]
 **includeSecrets** | **Boolean**| Whether to include secrets in the response | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;InfraResource&gt;**](InfraResource.md)

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


## getK8sName

> K8sName getK8sName(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, pageSize, pageOffset, timeZone)

View the K8s name

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        String cloudResourceUrl = ""; // String | Cloud Resource Url
        UUID cloudAccountId = new UUID(); // UUID | Cloud Account Id
        String cloudLocation = ""; // String | Cloud Location
        String purpose = ""; // String | Resource Purpose
        InfraResourceStatus status = InfraResourceStatus.fromValue("CREATED"); // InfraResourceStatus | Infra Resource Status
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            K8sName result = apiInstance.getK8sName(cloudResourceUrl, cloudAccountId, cloudLocation, purpose, status, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#getK8sName");
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
 **cloudResourceUrl** | **String**| Cloud Resource Url | [optional] [default to ]
 **cloudAccountId** | [**UUID**](.md)| Cloud Account Id | [optional]
 **cloudLocation** | **String**| Cloud Location | [optional] [default to ]
 **purpose** | **String**| Resource Purpose | [optional] [default to ]
 **status** | [**InfraResourceStatus**](.md)| Infra Resource Status | [optional] [enum: CREATED, CREATING, DELETED, DELETING, STOPPED]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**K8sName**](K8sName.md)

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


## getPresignedURL

> PresignedUrl getPresignedURL(objectId, tenantId, expirationMinutes, region, isExternal)

Fetches the presigned url for the provided s3 object

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        String objectId = "objectId_example"; // String | object id of the aws resource for which presigned url has to be generated
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        Integer expirationMinutes = 60; // Integer | Number of minutes the presigned url is valid
        String region = "us-east-1"; // String | location of the s3 object provided
        Boolean isExternal = true; // Boolean | If the url to be generated for external or internal consumption
        try {
            PresignedUrl result = apiInstance.getPresignedURL(objectId, tenantId, expirationMinutes, region, isExternal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#getPresignedURL");
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
 **objectId** | **String**| object id of the aws resource for which presigned url has to be generated |
 **tenantId** | **String**| Tenant Id Header | [optional]
 **expirationMinutes** | **Integer**| Number of minutes the presigned url is valid | [optional] [default to 60]
 **region** | **String**| location of the s3 object provided | [optional] [default to us-east-1]
 **isExternal** | **Boolean**| If the url to be generated for external or internal consumption | [optional] [default to true]

### Return type

[**PresignedUrl**](PresignedUrl.md)

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


## updateInfraResource

> InfraResource updateInfraResource(cloudResourceUrl, updateSecrets, infraResource)

Update a Tessell Infra Resource

### Example

```java
// Import classes:
import com.tessell.infra.client.invoker.ApiClient;
import com.tessell.infra.client.invoker.ApiException;
import com.tessell.infra.client.invoker.Configuration;
import com.tessell.infra.client.invoker.models.*;
import com.tessell.infra.client.api.TessellInfraResourceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-infra:8080");

        TessellInfraResourceControllerApi apiInstance = new TessellInfraResourceControllerApi(defaultClient);
        String cloudResourceUrl = "cloudResourceUrl_example"; // String | Cloud Resource Url
        Boolean updateSecrets = false; // Boolean | Whether to update the secrets or not
        InfraResource infraResource = new InfraResource(); // InfraResource | 
        try {
            InfraResource result = apiInstance.updateInfraResource(cloudResourceUrl, updateSecrets, infraResource);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellInfraResourceControllerApi#updateInfraResource");
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
 **cloudResourceUrl** | **String**| Cloud Resource Url |
 **updateSecrets** | **Boolean**| Whether to update the secrets or not | [optional] [default to false]
 **infraResource** | [**InfraResource**](InfraResource.md)|  | [optional]

### Return type

[**InfraResource**](InfraResource.md)

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

