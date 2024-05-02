# SubscriptionOpsApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteSubscription**](SubscriptionOpsApi.md#bulkDeleteSubscription) | **DELETE** /tessell-ops/subscriptions/bulk-delete | Bulk delete Tessell subscriptions
[**createSubscriptionOps**](SubscriptionOpsApi.md#createSubscriptionOps) | **POST** /tessell-ops/subscriptions | Create a new Tessell subscription.
[**deleteSubscriptionMetadataOps**](SubscriptionOpsApi.md#deleteSubscriptionMetadataOps) | **PUT** /tessell-ops/subscriptions/{id}/delete-metadata | Delete Subscription metadata entry
[**deleteSubscriptionOps**](SubscriptionOpsApi.md#deleteSubscriptionOps) | **DELETE** /tessell-ops/subscriptions/{id} | Submits a delete subscription workflow
[**enableECRAccess**](SubscriptionOpsApi.md#enableECRAccess) | **POST** /tessell-internal/subscriptions/{subscription-id}/enable-ecr-access | Enable ECR access for provisioning different services for the subscription
[**getBulkDeleteSubscriptionStatus**](SubscriptionOpsApi.md#getBulkDeleteSubscriptionStatus) | **POST** /tessell-ops/subscriptions/bulk-delete | Bulk delete subscriptions status
[**getSubscriptionId**](SubscriptionOpsApi.md#getSubscriptionId) | **GET** /tessell-ops/subscriptions/{id} | Get subscription by Id
[**getSubscriptionV2**](SubscriptionOpsApi.md#getSubscriptionV2) | **GET** /tessell-ops/v2/subscriptions/{id} | Get subscription by Id light weight api
[**getSubscriptionsOps**](SubscriptionOpsApi.md#getSubscriptionsOps) | **GET** /tessell-ops/subscriptions | Returns details about the Tessell Subscriptions
[**getSubscriptionsOpsV2**](SubscriptionOpsApi.md#getSubscriptionsOpsV2) | **GET** /tessell-ops/v2/subscriptions | Returns details about the Tessell Subscriptions
[**updateSubscriptionOps**](SubscriptionOpsApi.md#updateSubscriptionOps) | **PATCH** /tessell-ops/subscriptions/{id} | Update a Tessell Subscription



## bulkDeleteSubscription

> ResourceBulkDeleteResponseOps bulkDeleteSubscription(bulkDeleteSubscriptionsPayload)

Bulk delete Tessell subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        BulkDeleteSubscriptionsPayload bulkDeleteSubscriptionsPayload = new BulkDeleteSubscriptionsPayload(); // BulkDeleteSubscriptionsPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteSubscription(bulkDeleteSubscriptionsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#bulkDeleteSubscription");
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
 **bulkDeleteSubscriptionsPayload** | [**BulkDeleteSubscriptionsPayload**](BulkDeleteSubscriptionsPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## createSubscriptionOps

> Subscription createSubscriptionOps(createSubscriptionPayload, _default)

Create a new Tessell subscription.

Create a new Tessell subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        CreateSubscriptionPayload createSubscriptionPayload = new CreateSubscriptionPayload(); // CreateSubscriptionPayload | Subscription Information
        Boolean _default = false; // Boolean | Specify if this is the default subscription
        try {
            Subscription result = apiInstance.createSubscriptionOps(createSubscriptionPayload, _default);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#createSubscriptionOps");
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
 **createSubscriptionPayload** | [**CreateSubscriptionPayload**](CreateSubscriptionPayload.md)| Subscription Information |
 **_default** | **Boolean**| Specify if this is the default subscription | [optional] [default to false]

### Return type

[**Subscription**](Subscription.md)

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


## deleteSubscriptionMetadataOps

> ApiStatus deleteSubscriptionMetadataOps(id, softDelete)

Delete Subscription metadata entry

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | Subscription Id
        Boolean softDelete = true; // Boolean | Specifies whether to retain the subscription metadata
        try {
            ApiStatus result = apiInstance.deleteSubscriptionMetadataOps(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#deleteSubscriptionMetadataOps");
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
 **id** | [**UUID**](.md)| Subscription Id |
 **softDelete** | **Boolean**| Specifies whether to retain the subscription metadata | [optional] [default to true]

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


## deleteSubscriptionOps

> Subscription deleteSubscriptionOps(id, softDelete)

Submits a delete subscription workflow

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | Subscription Id
        Boolean softDelete = true; // Boolean | Specifies whether to retain the subscription metadata
        try {
            Subscription result = apiInstance.deleteSubscriptionOps(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#deleteSubscriptionOps");
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
 **id** | [**UUID**](.md)| Subscription Id |
 **softDelete** | **Boolean**| Specifies whether to retain the subscription metadata | [optional] [default to true]

### Return type

[**Subscription**](Subscription.md)

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


## enableECRAccess

> enableECRAccess(subscriptionId, enableECRAccessPayload)

Enable ECR access for provisioning different services for the subscription

Enable ECR access for provisioning different services for the subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID subscriptionId = new UUID(); // UUID | Tessell subscription that is to be enabled for the different service provisioning
        EnableECRAccessPayload enableECRAccessPayload = new EnableECRAccessPayload(); // EnableECRAccessPayload | 
        try {
            apiInstance.enableECRAccess(subscriptionId, enableECRAccessPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#enableECRAccess");
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
 **subscriptionId** | [**UUID**](.md)| Tessell subscription that is to be enabled for the different service provisioning |
 **enableECRAccessPayload** | [**EnableECRAccessPayload**](EnableECRAccessPayload.md)|  |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getBulkDeleteSubscriptionStatus

> ResourceBulkDeleteResponseOps getBulkDeleteSubscriptionStatus(bulkDeleteSubscriptionsStatusPayload)

Bulk delete subscriptions status

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        BulkDeleteSubscriptionsStatusPayload bulkDeleteSubscriptionsStatusPayload = new BulkDeleteSubscriptionsStatusPayload(); // BulkDeleteSubscriptionsStatusPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.getBulkDeleteSubscriptionStatus(bulkDeleteSubscriptionsStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#getBulkDeleteSubscriptionStatus");
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
 **bulkDeleteSubscriptionsStatusPayload** | [**BulkDeleteSubscriptionsStatusPayload**](BulkDeleteSubscriptionsStatusPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## getSubscriptionId

> Subscription getSubscriptionId(id, includeSharedWith, timeZone, tenantId)

Get subscription by Id

Get subscription by Id

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | Subscription Id
        Boolean includeSharedWith = false; // Boolean | Whether to include shared with users details
        String timeZone = "UTC"; // String | Timezone for return data
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        try {
            Subscription result = apiInstance.getSubscriptionId(id, includeSharedWith, timeZone, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#getSubscriptionId");
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
 **id** | [**UUID**](.md)| Subscription Id |
 **includeSharedWith** | **Boolean**| Whether to include shared with users details | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **tenantId** | **String**| Tenant Id Header | [optional]

### Return type

[**Subscription**](Subscription.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of a subscriptions |  -  |
| **0** | API error response |  -  |


## getSubscriptionV2

> SubscriptionV2 getSubscriptionV2(id, includeSharedWith, tenantId)

Get subscription by Id light weight api

Get subscription by Id light weight api

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | Subscription Id
        Boolean includeSharedWith = false; // Boolean | Whether to include shared with users details
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        try {
            SubscriptionV2 result = apiInstance.getSubscriptionV2(id, includeSharedWith, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#getSubscriptionV2");
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
 **id** | [**UUID**](.md)| Subscription Id |
 **includeSharedWith** | **Boolean**| Whether to include shared with users details | [optional] [default to false]
 **tenantId** | **String**| Tenant Id Header | [optional]

### Return type

[**SubscriptionV2**](SubscriptionV2.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of a subscriptions |  -  |
| **0** | API error response |  -  |


## getSubscriptionsOps

> SubscriptionApiResponseOps getSubscriptionsOps(name, statuses, _default, timeZone, pageSize, pageOffset, tenantId)

Returns details about the Tessell Subscriptions

Returns details about the Tessell Subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        String name = "name_example"; // String | Subscription name
        List<SubscriptionStatus> statuses = Arrays.asList(); // List<SubscriptionStatus> | List of subscription statuses
        Boolean _default = true; // Boolean | Specify if this is the default subscription
        String timeZone = "UTC"; // String | Timezone for return data
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        try {
            SubscriptionApiResponseOps result = apiInstance.getSubscriptionsOps(name, statuses, _default, timeZone, pageSize, pageOffset, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#getSubscriptionsOps");
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
 **name** | **String**| Subscription name | [optional]
 **statuses** | [**List&lt;SubscriptionStatus&gt;**](SubscriptionStatus.md)| List of subscription statuses | [optional]
 **_default** | **Boolean**| Specify if this is the default subscription | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **tenantId** | **String**| Tenant Id Header | [optional]

### Return type

[**SubscriptionApiResponseOps**](SubscriptionApiResponseOps.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of subscriptions |  -  |
| **0** | API error response |  -  |


## getSubscriptionsOpsV2

> SubscriptionApiResponseOpsV2 getSubscriptionsOpsV2(name, statuses, _default, pageSize, pageOffset, tenantId)

Returns details about the Tessell Subscriptions

Returns details about the Tessell Subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        String name = "name_example"; // String | Subscription name
        List<SubscriptionStatus> statuses = Arrays.asList(); // List<SubscriptionStatus> | List of subscription statuses
        Boolean _default = true; // Boolean | Specify if this is the default subscription
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        try {
            SubscriptionApiResponseOpsV2 result = apiInstance.getSubscriptionsOpsV2(name, statuses, _default, pageSize, pageOffset, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#getSubscriptionsOpsV2");
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
 **name** | **String**| Subscription name | [optional]
 **statuses** | [**List&lt;SubscriptionStatus&gt;**](SubscriptionStatus.md)| List of subscription statuses | [optional]
 **_default** | **Boolean**| Specify if this is the default subscription | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **tenantId** | **String**| Tenant Id Header | [optional]

### Return type

[**SubscriptionApiResponseOpsV2**](SubscriptionApiResponseOpsV2.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of subscriptions |  -  |
| **0** | API error response |  -  |


## updateSubscriptionOps

> Subscription updateSubscriptionOps(id, subscription)

Update a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionOpsApi apiInstance = new SubscriptionOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | Subscription Id
        Subscription subscription = new Subscription(); // Subscription | Update Subscription Body
        try {
            Subscription result = apiInstance.updateSubscriptionOps(id, subscription);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionOpsApi#updateSubscriptionOps");
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
 **id** | [**UUID**](.md)| Subscription Id |
 **subscription** | [**Subscription**](Subscription.md)| Update Subscription Body |

### Return type

[**Subscription**](Subscription.md)

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

