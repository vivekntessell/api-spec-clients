# SubscriptionServiceApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**actionOnSubscription**](SubscriptionServiceApi.md#actionOnSubscription) | **PATCH** /subscription-service/governance/subscriptions/{name}/{action} | Submits request to enable or disable a Tessell Subscription
[**actionOnSubscriptionCloudType**](SubscriptionServiceApi.md#actionOnSubscriptionCloudType) | **PATCH** /subscription-service/governance/subscriptions/{name}/cloud-type/{cloud-type}/{action} | Enables or disables a cloud type in a Tessell Subscription
[**addCloudTypeToSubscription**](SubscriptionServiceApi.md#addCloudTypeToSubscription) | **POST** /subscription-service/governance/subscriptions/{name}/cloud-type | Adds cloud type to a new Tessell subscription
[**addRegionsInSubscription**](SubscriptionServiceApi.md#addRegionsInSubscription) | **PUT** /subscription-service/governance/subscriptions/{name}/add-regions | Add regions for a cloud type in a Tessell Subscription
[**addUsersToSubscription**](SubscriptionServiceApi.md#addUsersToSubscription) | **PATCH** /subscription-service/governance/subscriptions/{name}/acls | Adds users to a Tessell subscription
[**createSubscription**](SubscriptionServiceApi.md#createSubscription) | **POST** /subscription-service/governance/subscriptions | Create a new Tessell subscription.
[**deleteSubscription**](SubscriptionServiceApi.md#deleteSubscription) | **DELETE** /subscription-service/governance/subscriptions/{name} | Submits request to delete a Tessell Subscription
[**getAdminViewSubscriptions**](SubscriptionServiceApi.md#getAdminViewSubscriptions) | **GET** /subscription-service/governance/subscriptions | Returns details about the Tessell Subscriptions
[**getEligibleUsersForSubscription**](SubscriptionServiceApi.md#getEligibleUsersForSubscription) | **GET** /subscription-service/governance/subscriptions/{name}/acls/eligible-users | Get users which can be added to the subscription
[**getSubscriptionByoaStaticMetadata**](SubscriptionServiceApi.md#getSubscriptionByoaStaticMetadata) | **GET** /subscription-service/governance/subscription-metadata/byoa | 
[**getSubscriptionName**](SubscriptionServiceApi.md#getSubscriptionName) | **GET** /subscription-service/governance/subscriptions/{name} | Submits request to get the subscription details
[**getSubscriptionUsersDetails**](SubscriptionServiceApi.md#getSubscriptionUsersDetails) | **GET** /subscription-service/governance/subscriptions/{name}/users | Get subscription&#39;s users&#39; details
[**getUserViewSubscriptions**](SubscriptionServiceApi.md#getUserViewSubscriptions) | **GET** /subscriptions | Returns details about the Tessell Subscriptions
[**removeUsersFromSubscription**](SubscriptionServiceApi.md#removeUsersFromSubscription) | **DELETE** /subscription-service/governance/subscriptions/{name}/acls | Removes users from a Tessell subscription
[**updateRegionsInSubscription**](SubscriptionServiceApi.md#updateRegionsInSubscription) | **PUT** /subscription-service/governance/subscriptions/{name}/cloud-type/{cloud-type}/regions | Update regions for a cloud type in a Tessell Subscription
[**updateSubscription**](SubscriptionServiceApi.md#updateSubscription) | **PATCH** /subscription-service/governance/subscriptions/{name} | Submits request to update a Tessell Subscription
[**verifyAzureTenantId**](SubscriptionServiceApi.md#verifyAzureTenantId) | **GET** /subscription-service/governance/subscriptions/azureauth/callback | 



## actionOnSubscription

> SubscriptionAdminView actionOnSubscription(name, action)

Submits request to enable or disable a Tessell Subscription

Submits request to enable or disable a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        Action action = Action.fromValue("enable"); // Action | Action on the subscription. Eg. enable/disable
        try {
            SubscriptionAdminView result = apiInstance.actionOnSubscription(name, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#actionOnSubscription");
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
 **name** | **String**| Subscription Name |
 **action** | [**Action**](.md)| Action on the subscription. Eg. enable/disable | [enum: enable, disable]

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## actionOnSubscriptionCloudType

> SubscriptionAdminView actionOnSubscriptionCloudType(name, cloudType, action)

Enables or disables a cloud type in a Tessell Subscription

Enables or disables a cloud type in a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        String cloudType = "cloudType_example"; // String | Cloud type
        Action action = Action.fromValue("enable"); // Action | Action on the subscription. Eg. enable/disable
        try {
            SubscriptionAdminView result = apiInstance.actionOnSubscriptionCloudType(name, cloudType, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#actionOnSubscriptionCloudType");
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
 **name** | **String**| Subscription Name |
 **cloudType** | **String**| Cloud type |
 **action** | [**Action**](.md)| Action on the subscription. Eg. enable/disable | [enum: enable, disable]

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## addCloudTypeToSubscription

> SubscriptionAdminView addCloudTypeToSubscription(name, subscriptionCloudConfigMap)

Adds cloud type to a new Tessell subscription

Adds cloud type to a new Tessell subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        SubscriptionCloudConfigMap subscriptionCloudConfigMap = new SubscriptionCloudConfigMap(); // SubscriptionCloudConfigMap | Cloud details
        try {
            SubscriptionAdminView result = apiInstance.addCloudTypeToSubscription(name, subscriptionCloudConfigMap);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#addCloudTypeToSubscription");
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
 **name** | **String**| Subscription Name |
 **subscriptionCloudConfigMap** | [**SubscriptionCloudConfigMap**](SubscriptionCloudConfigMap.md)| Cloud details |

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## addRegionsInSubscription

> SubscriptionAdminView addRegionsInSubscription(name, subscriptionCloudConfigMap)

Add regions for a cloud type in a Tessell Subscription

Add regions for a cloud type in a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        SubscriptionCloudConfigMap subscriptionCloudConfigMap = new SubscriptionCloudConfigMap(); // SubscriptionCloudConfigMap | Cloud config map
        try {
            SubscriptionAdminView result = apiInstance.addRegionsInSubscription(name, subscriptionCloudConfigMap);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#addRegionsInSubscription");
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
 **name** | **String**| Subscription Name |
 **subscriptionCloudConfigMap** | [**SubscriptionCloudConfigMap**](SubscriptionCloudConfigMap.md)| Cloud config map |

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## addUsersToSubscription

> addUsersToSubscription(name, aclPayload)

Adds users to a Tessell subscription

Adds users to a Tessell subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        AclPayload aclPayload = new AclPayload(); // AclPayload | Add Users To Subscription Request
        try {
            apiInstance.addUsersToSubscription(name, aclPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#addUsersToSubscription");
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
 **name** | **String**| Subscription Name |
 **aclPayload** | [**AclPayload**](AclPayload.md)| Add Users To Subscription Request |

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


## createSubscription

> SubscriptionAdminView createSubscription(createSubscriptionPayload)

Create a new Tessell subscription.

Creates a new Tessell subscription based on deployment type(shared/byoa) and cloud configurations.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        CreateSubscriptionPayload createSubscriptionPayload = new CreateSubscriptionPayload(); // CreateSubscriptionPayload | Subscription Information
        try {
            SubscriptionAdminView result = apiInstance.createSubscription(createSubscriptionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#createSubscription");
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

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## deleteSubscription

> ApiStatus deleteSubscription(name, softDelete)

Submits request to delete a Tessell Subscription

Submits request to delete a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        Boolean softDelete = true; // Boolean | Specifies whether to retain the subscription metadata
        try {
            ApiStatus result = apiInstance.deleteSubscription(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#deleteSubscription");
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
 **name** | **String**| Subscription Name |
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


## getAdminViewSubscriptions

> SubscriptionsAdminApiResponse getAdminViewSubscriptions(status, entityOwner, timeZone, pageSize, pageOffset)

Returns details about the Tessell Subscriptions

Returns details about the Tessell Subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        List<SubscriptionStatus> status = Arrays.asList(); // List<SubscriptionStatus> | List of subscription statuses
        List<String> entityOwner = Arrays.asList(); // List<String> | Filter based on subscription owners
        String timeZone = "UTC"; // String | Timezone for return data
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            SubscriptionsAdminApiResponse result = apiInstance.getAdminViewSubscriptions(status, entityOwner, timeZone, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getAdminViewSubscriptions");
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
 **status** | [**List&lt;SubscriptionStatus&gt;**](SubscriptionStatus.md)| List of subscription statuses | [optional]
 **entityOwner** | [**List&lt;String&gt;**](String.md)| Filter based on subscription owners | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**SubscriptionsAdminApiResponse**](SubscriptionsAdminApiResponse.md)

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


## getEligibleUsersForSubscription

> List&lt;AclEligibleUser&gt; getEligibleUsersForSubscription(name, role, timeZone, pageSize, pageOffset)

Get users which can be added to the subscription

Returns a list of users which can be added to the subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        SubscriptionUserRole role = SubscriptionUserRole.fromValue("MEMBER"); // SubscriptionUserRole | User role
        String timeZone = "UTC"; // String | Timezone for return data
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<AclEligibleUser> result = apiInstance.getEligibleUsersForSubscription(name, role, timeZone, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getEligibleUsersForSubscription");
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
 **name** | **String**| Subscription Name |
 **role** | [**SubscriptionUserRole**](.md)| User role | [optional] [enum: MEMBER, CO_OWNER]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;AclEligibleUser&gt;**](AclEligibleUser.md)

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


## getSubscriptionByoaStaticMetadata

> SubscriptionByoaStaticMetadata getSubscriptionByoaStaticMetadata()



Get subscription related metadata

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        try {
            SubscriptionByoaStaticMetadata result = apiInstance.getSubscriptionByoaStaticMetadata();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getSubscriptionByoaStaticMetadata");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionByoaStaticMetadata**](SubscriptionByoaStaticMetadata.md)

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


## getSubscriptionName

> SubscriptionAdminView getSubscriptionName(name, timeZone)

Submits request to get the subscription details

Submits request to get the subscription details

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            SubscriptionAdminView result = apiInstance.getSubscriptionName(name, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getSubscriptionName");
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
 **name** | **String**| Subscription Name |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of a subscription |  -  |
| **0** | API error response |  -  |


## getSubscriptionUsersDetails

> SubscriptionUsersAdminView getSubscriptionUsersDetails(name, timeZone, pageSize, pageOffset)

Get subscription&#39;s users&#39; details

Get the details of subscription&#39;s users

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        String timeZone = "UTC"; // String | Timezone for return data
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            SubscriptionUsersAdminView result = apiInstance.getSubscriptionUsersDetails(name, timeZone, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getSubscriptionUsersDetails");
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
 **name** | **String**| Subscription Name |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**SubscriptionUsersAdminView**](SubscriptionUsersAdminView.md)

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


## getUserViewSubscriptions

> SubscriptionsUserViewApiResponse getUserViewSubscriptions(status, timeZone, pageSize, pageOffset)

Returns details about the Tessell Subscriptions

It returns the details about the Tessell Subscriptions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        List<SubscriptionStatus> status = Arrays.asList(); // List<SubscriptionStatus> | List of subscription statuses
        String timeZone = "UTC"; // String | Timezone for return data
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            SubscriptionsUserViewApiResponse result = apiInstance.getUserViewSubscriptions(status, timeZone, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#getUserViewSubscriptions");
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
 **status** | [**List&lt;SubscriptionStatus&gt;**](SubscriptionStatus.md)| List of subscription statuses | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**SubscriptionsUserViewApiResponse**](SubscriptionsUserViewApiResponse.md)

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


## removeUsersFromSubscription

> SubscriptionAdminView removeUsersFromSubscription(name, aclRevokePayload)

Removes users from a Tessell subscription

Removes users from a Tessell subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | Remove Users To Subscription Request
        try {
            SubscriptionAdminView result = apiInstance.removeUsersFromSubscription(name, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#removeUsersFromSubscription");
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
 **name** | **String**| Subscription Name |
 **aclRevokePayload** | [**AclRevokePayload**](AclRevokePayload.md)| Remove Users To Subscription Request |

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## updateRegionsInSubscription

> SubscriptionAdminView updateRegionsInSubscription(name, cloudType, updateRegionsPayload)

Update regions for a cloud type in a Tessell Subscription

Update regions for a cloud type in a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        String cloudType = "cloudType_example"; // String | Cloud type
        UpdateRegionsPayload updateRegionsPayload = new UpdateRegionsPayload(); // UpdateRegionsPayload | Region list
        try {
            SubscriptionAdminView result = apiInstance.updateRegionsInSubscription(name, cloudType, updateRegionsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#updateRegionsInSubscription");
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
 **name** | **String**| Subscription Name |
 **cloudType** | **String**| Cloud type |
 **updateRegionsPayload** | [**UpdateRegionsPayload**](UpdateRegionsPayload.md)| Region list |

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## updateSubscription

> SubscriptionAdminView updateSubscription(name, updateSubscriptionServicePayload)

Submits request to update a Tessell Subscription

Submits request to update a Tessell Subscription

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String name = "name_example"; // String | Subscription Name
        UpdateSubscriptionServicePayload updateSubscriptionServicePayload = new UpdateSubscriptionServicePayload(); // UpdateSubscriptionServicePayload | Update Subscription Body
        try {
            SubscriptionAdminView result = apiInstance.updateSubscription(name, updateSubscriptionServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#updateSubscription");
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
 **name** | **String**| Subscription Name |
 **updateSubscriptionServicePayload** | [**UpdateSubscriptionServicePayload**](UpdateSubscriptionServicePayload.md)| Update Subscription Body |

### Return type

[**SubscriptionAdminView**](SubscriptionAdminView.md)

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


## verifyAzureTenantId

> verifyAzureTenantId(code, azureTenantId)



Verify the azure oauth code.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SubscriptionServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SubscriptionServiceApi apiInstance = new SubscriptionServiceApi(defaultClient);
        String code = "code_example"; // String | Azure auth code
        String azureTenantId = "azureTenantId_example"; // String | Azure tenant ID
        try {
            apiInstance.verifyAzureTenantId(code, azureTenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionServiceApi#verifyAzureTenantId");
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
 **code** | **String**| Azure auth code |
 **azureTenantId** | **String**| Azure tenant ID |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 200 response |  -  |
| **0** | API error response |  -  |

