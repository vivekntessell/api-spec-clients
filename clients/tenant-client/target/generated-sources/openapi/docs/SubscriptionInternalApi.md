# SubscriptionInternalApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addUsersToSubscriptions**](SubscriptionInternalApi.md#addUsersToSubscriptions) | **POST** /tessell-internal/subscriptions/bulk/add-users | Adds users to multiple Tessell subscriptions
[**getSubscriptions**](SubscriptionInternalApi.md#getSubscriptions) | **GET** /tessell-internal/subscriptions | Get subscriptions
[**getSubscriptionsV2**](SubscriptionInternalApi.md#getSubscriptionsV2) | **GET** /tessell-internal/v2/subscriptions | 
[**getUserSubscriptionMappings**](SubscriptionInternalApi.md#getUserSubscriptionMappings) | **POST** /tessell-internal/get-user-subscription-mappings | Get user subscriptions mappings



## addUsersToSubscriptions

> addUsersToSubscriptions(addUsersToSubscriptionsInternalRequest)

Adds users to multiple Tessell subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionInternalApi apiInstance = new SubscriptionInternalApi(defaultClient);
        AddUsersToSubscriptionsInternalRequest addUsersToSubscriptionsInternalRequest = new AddUsersToSubscriptionsInternalRequest(); // AddUsersToSubscriptionsInternalRequest | Add Users To Subscriptions Request
        try {
            apiInstance.addUsersToSubscriptions(addUsersToSubscriptionsInternalRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInternalApi#addUsersToSubscriptions");
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
 **addUsersToSubscriptionsInternalRequest** | [**AddUsersToSubscriptionsInternalRequest**](AddUsersToSubscriptionsInternalRequest.md)| Add Users To Subscriptions Request |

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


## getSubscriptions

> SubscriptionApiResponseOps getSubscriptions(name, pageSize, pageOffset)

Get subscriptions

Get subscriptions for a user

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionInternalApi apiInstance = new SubscriptionInternalApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            SubscriptionApiResponseOps result = apiInstance.getSubscriptions(name, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInternalApi#getSubscriptions");
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
 **name** | **String**| Subscription Name | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

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
| **200** | Details of a subscriptions |  -  |
| **0** | API error response |  -  |


## getSubscriptionsV2

> SubscriptionApiResponseOpsV2 getSubscriptionsV2(name, pageSize, pageOffset)



Get subscriptions for a user light weight api

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionInternalApi apiInstance = new SubscriptionInternalApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            SubscriptionApiResponseOpsV2 result = apiInstance.getSubscriptionsV2(name, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInternalApi#getSubscriptionsV2");
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
 **name** | **String**| Subscription Name | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

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
| **200** | Details of a subscriptions |  -  |
| **0** | API error response |  -  |


## getUserSubscriptionMappings

> UserSubscriptionsMappings getUserSubscriptionMappings(getUserSubscriptionsMappingsRequest)

Get user subscriptions mappings

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionInternalApi apiInstance = new SubscriptionInternalApi(defaultClient);
        GetUserSubscriptionsMappingsRequest getUserSubscriptionsMappingsRequest = new GetUserSubscriptionsMappingsRequest(); // GetUserSubscriptionsMappingsRequest | User list for which the mapping is required
        try {
            UserSubscriptionsMappings result = apiInstance.getUserSubscriptionMappings(getUserSubscriptionsMappingsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionInternalApi#getUserSubscriptionMappings");
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
 **getUserSubscriptionsMappingsRequest** | [**GetUserSubscriptionsMappingsRequest**](GetUserSubscriptionsMappingsRequest.md)| User list for which the mapping is required |

### Return type

[**UserSubscriptionsMappings**](UserSubscriptionsMappings.md)

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

