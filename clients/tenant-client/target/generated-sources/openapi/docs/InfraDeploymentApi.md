# InfraDeploymentApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSharedInfra**](InfraDeploymentApi.md#createSharedInfra) | **POST** /tessell-ops/infra-deployments | Submit a request for setting up shared tenant infra.
[**deleteProxyRegionsInfraDeployment**](InfraDeploymentApi.md#deleteProxyRegionsInfraDeployment) | **DELETE** /tessell-ops/infra-deployments/{name}/proxy-regions | Deletes proxy regions
[**getInfraDeployment**](InfraDeploymentApi.md#getInfraDeployment) | **GET** /tessell-ops/infra-deployments/{name} | Get infra deployment.
[**getInfraDeployments**](InfraDeploymentApi.md#getInfraDeployments) | **GET** /tessell-ops/infra-deployments | Get the infra deployments
[**registerMetadataInfraDeployment**](InfraDeploymentApi.md#registerMetadataInfraDeployment) | **POST** /tessell-ops/infra-deployments/register-metadata | Submit a request for registering metadata for infra deployment
[**registerProxyRegionsInfraDeployment**](InfraDeploymentApi.md#registerProxyRegionsInfraDeployment) | **POST** /tessell-ops/infra-deployments/{name}/proxy-regions | Register proxy regions
[**updateInfraDeployment**](InfraDeploymentApi.md#updateInfraDeployment) | **PATCH** /tessell-ops/infra-deployments/{name} | Update infra deployment.
[**updateProxyRegionsStatus**](InfraDeploymentApi.md#updateProxyRegionsStatus) | **PATCH** /tessell-ops/infra-deployments/{name}/proxy-regions/update-status | Updates proxy regions&#39; status
[**upgradeInfraDeployment**](InfraDeploymentApi.md#upgradeInfraDeployment) | **PUT** /tessell-ops/infra-deployments/{name}/upgrade | Upgrade infra deployment.



## createSharedInfra

> InfraDeployment createSharedInfra(sharedInfraCreationRequestPayload)

Submit a request for setting up shared tenant infra.

Submit a request for setting up shared tenant infra.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        SharedInfraCreationRequestPayload sharedInfraCreationRequestPayload = new SharedInfraCreationRequestPayload(); // SharedInfraCreationRequestPayload | Shared Infra specification
        try {
            InfraDeployment result = apiInstance.createSharedInfra(sharedInfraCreationRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#createSharedInfra");
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
 **sharedInfraCreationRequestPayload** | [**SharedInfraCreationRequestPayload**](SharedInfraCreationRequestPayload.md)| Shared Infra specification |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tracking information for infra creation request |  -  |
| **0** | API error response |  -  |


## deleteProxyRegionsInfraDeployment

> InfraDeployment deleteProxyRegionsInfraDeployment(name, infraDeploymentProxyRegionsPayload)

Deletes proxy regions

Submits a request to delete proxy regions in Infra Deployment

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload = new InfraDeploymentProxyRegionsPayload(); // InfraDeploymentProxyRegionsPayload | List of proxy regions for Infra Deployment
        try {
            InfraDeployment result = apiInstance.deleteProxyRegionsInfraDeployment(name, infraDeploymentProxyRegionsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#deleteProxyRegionsInfraDeployment");
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
 **name** | **String**| Infra name |
 **infraDeploymentProxyRegionsPayload** | [**InfraDeploymentProxyRegionsPayload**](InfraDeploymentProxyRegionsPayload.md)| List of proxy regions for Infra Deployment |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Infra Deployment |  -  |
| **0** | API error response |  -  |


## getInfraDeployment

> InfraDeployment getInfraDeployment(name)

Get infra deployment.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        try {
            InfraDeployment result = apiInstance.getInfraDeployment(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#getInfraDeployment");
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
 **name** | **String**| Infra name |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Infra infra deployment response |  -  |
| **0** | API error response |  -  |


## getInfraDeployments

> InfraDeploymentsResponse getInfraDeployments(tenantId, status, forTenantType, pageSize, pageOffset)

Get the infra deployments

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Filter for a specific tenant
        InfraDeploymentStatus status = InfraDeploymentStatus.fromValue("CREATING"); // InfraDeploymentStatus | Filter for infra deployment
        TenantType forTenantType = TenantType.fromValue("PERSONAL"); // TenantType | Filter for which tenant type the deployment type is for
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            InfraDeploymentsResponse result = apiInstance.getInfraDeployments(tenantId, status, forTenantType, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#getInfraDeployments");
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
 **tenantId** | [**UUID**](.md)| Filter for a specific tenant | [optional]
 **status** | [**InfraDeploymentStatus**](.md)| Filter for infra deployment | [optional] [enum: CREATING, CREATED, DISABLED, DELETING, DELETED, FAILED, UPDATING, UPDATE_FAILED]
 **forTenantType** | [**TenantType**](.md)| Filter for which tenant type the deployment type is for | [optional] [enum: PERSONAL, BUSINESS, CONSOLE]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**InfraDeploymentsResponse**](InfraDeploymentsResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Infra deployment |  -  |
| **0** | API error response |  -  |


## registerMetadataInfraDeployment

> InfraDeployment registerMetadataInfraDeployment(infraDeployment)

Submit a request for registering metadata for infra deployment

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        InfraDeployment infraDeployment = new InfraDeployment(); // InfraDeployment | Register metadata for infra deployment
        try {
            InfraDeployment result = apiInstance.registerMetadataInfraDeployment(infraDeployment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#registerMetadataInfraDeployment");
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
 **infraDeployment** | [**InfraDeployment**](InfraDeployment.md)| Register metadata for infra deployment |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Register metadata for infra deployment |  -  |
| **0** | API error response |  -  |


## registerProxyRegionsInfraDeployment

> InfraDeployment registerProxyRegionsInfraDeployment(name, infraDeploymentProxyRegionsPayload)

Register proxy regions

Submits a request for registering proxy regions in Infra Deployment

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload = new InfraDeploymentProxyRegionsPayload(); // InfraDeploymentProxyRegionsPayload | Proxy regions for Infra Deployment
        try {
            InfraDeployment result = apiInstance.registerProxyRegionsInfraDeployment(name, infraDeploymentProxyRegionsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#registerProxyRegionsInfraDeployment");
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
 **name** | **String**| Infra name |
 **infraDeploymentProxyRegionsPayload** | [**InfraDeploymentProxyRegionsPayload**](InfraDeploymentProxyRegionsPayload.md)| Proxy regions for Infra Deployment |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Infra Deployment |  -  |
| **0** | API error response |  -  |


## updateInfraDeployment

> InfraDeployment updateInfraDeployment(name, infraDeployment)

Update infra deployment.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        InfraDeployment infraDeployment = new InfraDeployment(); // InfraDeployment | Update infra deployment request
        try {
            InfraDeployment result = apiInstance.updateInfraDeployment(name, infraDeployment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#updateInfraDeployment");
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
 **name** | **String**| Infra name |
 **infraDeployment** | [**InfraDeployment**](InfraDeployment.md)| Update infra deployment request |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update infra deployment response |  -  |
| **0** | API error response |  -  |


## updateProxyRegionsStatus

> InfraDeployment updateProxyRegionsStatus(name, requestBody)

Updates proxy regions&#39; status

Submits a request for updating the proxy regions&#39; status

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        Map<String, ProxyRegionStatus> requestBody = new HashMap(); // Map<String, ProxyRegionStatus> | List of regions for status update
        try {
            InfraDeployment result = apiInstance.updateProxyRegionsStatus(name, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#updateProxyRegionsStatus");
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
 **name** | **String**| Infra name |
 **requestBody** | [**Map&lt;String, ProxyRegionStatus&gt;**](ProxyRegionStatus.md)| List of regions for status update |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of current proxy regions for Infra Deployment |  -  |
| **0** | API error response |  -  |


## upgradeInfraDeployment

> InfraDeployment upgradeInfraDeployment(name, upgradeInfraDeploymentRequest)

Upgrade infra deployment.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.InfraDeploymentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        InfraDeploymentApi apiInstance = new InfraDeploymentApi(defaultClient);
        String name = "name_example"; // String | Infra name
        UpgradeInfraDeploymentRequest upgradeInfraDeploymentRequest = new UpgradeInfraDeploymentRequest(); // UpgradeInfraDeploymentRequest | Upgrade infra deployment request
        try {
            InfraDeployment result = apiInstance.upgradeInfraDeployment(name, upgradeInfraDeploymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InfraDeploymentApi#upgradeInfraDeployment");
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
 **name** | **String**| Infra name |
 **upgradeInfraDeploymentRequest** | [**UpgradeInfraDeploymentRequest**](UpgradeInfraDeploymentRequest.md)| Upgrade infra deployment request |

### Return type

[**InfraDeployment**](InfraDeployment.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Upgrade infra deployment response |  -  |
| **0** | API error response |  -  |

