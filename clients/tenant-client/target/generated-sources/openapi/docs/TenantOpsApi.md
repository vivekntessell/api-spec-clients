# TenantOpsApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTenant**](TenantOpsApi.md#createTenant) | **POST** /tessell-ops/tenants | Create a Tessell Tenant
[**deboardTenant**](TenantOpsApi.md#deboardTenant) | **PUT** /tessell-ops/tenants/{id}/deboard | Deboard a Tenant
[**deleteTenant**](TenantOpsApi.md#deleteTenant) | **DELETE** /tessell-ops/tenants/{id} | Delete a Tessell Tenant
[**getTenantById**](TenantOpsApi.md#getTenantById) | **GET** /tessell-ops/tenants/{id} | Return tenant entity by id.
[**getTenants**](TenantOpsApi.md#getTenants) | **GET** /tessell-ops/tenants | Returns one or all of the registered/onboarded tenant entries.
[**getTenantsV2**](TenantOpsApi.md#getTenantsV2) | **GET** /tessell-ops/v2/tenants | Returns all of the registered/onboarded tenant entries.
[**onboardTenant**](TenantOpsApi.md#onboardTenant) | **POST** /tessell-ops/tenants/onboard | 
[**setupSharedControlPlaneBaseInfra**](TenantOpsApi.md#setupSharedControlPlaneBaseInfra) | **POST** /tessell-ops/tenants/base-tenant-setup | 
[**setupTenant**](TenantOpsApi.md#setupTenant) | **POST** /tessell-ops/tenants/setup | 
[**updateTenant**](TenantOpsApi.md#updateTenant) | **PATCH** /tessell-ops/tenants/{id} | Update a Tessell Tenant
[**upgradeTenant**](TenantOpsApi.md#upgradeTenant) | **PUT** /tessell-ops/tenants/{id}/upgrade | Upgrade a Tessell Tenant
[**upgradeTenantServices**](TenantOpsApi.md#upgradeTenantServices) | **PUT** /tessell-ops/tenants/upgrade-services | Upgrade services of a tenant



## createTenant

> Tenant createTenant(tenant)

Create a Tessell Tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        Tenant tenant = new Tenant(); // Tenant | Create tenant object
        try {
            Tenant result = apiInstance.createTenant(tenant);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#createTenant");
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
 **tenant** | [**Tenant**](Tenant.md)| Create tenant object |

### Return type

[**Tenant**](Tenant.md)

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


## deboardTenant

> Tenant deboardTenant(id, deboardTenantRequest)

Deboard a Tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        DeboardTenantRequest deboardTenantRequest = new DeboardTenantRequest(); // DeboardTenantRequest | De-board tenant request
        try {
            Tenant result = apiInstance.deboardTenant(id, deboardTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#deboardTenant");
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
 **id** | [**UUID**](.md)| id |
 **deboardTenantRequest** | [**DeboardTenantRequest**](DeboardTenantRequest.md)| De-board tenant request |

### Return type

[**Tenant**](Tenant.md)

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


## deleteTenant

> ApiStatus deleteTenant(id, softDelete)

Delete a Tessell Tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | Specifies whether to retain the subscription metadata
        try {
            ApiStatus result = apiInstance.deleteTenant(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#deleteTenant");
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
 **id** | [**UUID**](.md)| id |
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


## getTenantById

> Tenant getTenantById(id, includeCloudAccounts, timeZone)

Return tenant entity by id.

Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean includeCloudAccounts = false; // Boolean | id
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            Tenant result = apiInstance.getTenantById(id, includeCloudAccounts, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#getTenantById");
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
 **id** | [**UUID**](.md)| id |
 **includeCloudAccounts** | **Boolean**| id | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of tenants |  -  |
| **0** | API error response |  -  |


## getTenants

> ModelApiResponse getTenants(email, domain, pageSize, pageOffset, timeZone, status)

Returns one or all of the registered/onboarded tenant entries.

Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        String email = "email_example"; // String | Email address of the tenant
        String domain = "domain_example"; // String | Domain of the tenant
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        String status = "status_example"; // String | Tenant status
        try {
            ModelApiResponse result = apiInstance.getTenants(email, domain, pageSize, pageOffset, timeZone, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#getTenants");
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
 **email** | **String**| Email address of the tenant | [optional]
 **domain** | **String**| Domain of the tenant | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **status** | **String**| Tenant status | [optional]

### Return type

[**ModelApiResponse**](ModelApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of tenants |  -  |
| **0** | API error response |  -  |


## getTenantsV2

> GetTenantsApiResponse getTenantsV2(emailId, domain, infraDeploymentId, tenantId, status, tenantTypes, pageSize, pageOffset, apiDomainUrl)

Returns all of the registered/onboarded tenant entries.

Returns all of the registered/onboarded tenant entries.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        String emailId = "emailId_example"; // String | Email address of the tenant
        String domain = "domain_example"; // String | Domain of the tenant
        UUID infraDeploymentId = new UUID(); // UUID | infra deployment id of tenant
        String tenantId = "tenantId_example"; // String | Tenant id which is used as a header everywhere
        List<TenantStatus> status = Arrays.asList(); // List<TenantStatus> | Status of the tenant
        List<TenantType> tenantTypes = Arrays.asList(); // List<TenantType> | List of tenant type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String apiDomainUrl = "apiDomainUrl_example"; // String | Domain URL for the backend endpoints
        try {
            GetTenantsApiResponse result = apiInstance.getTenantsV2(emailId, domain, infraDeploymentId, tenantId, status, tenantTypes, pageSize, pageOffset, apiDomainUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#getTenantsV2");
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
 **emailId** | **String**| Email address of the tenant | [optional]
 **domain** | **String**| Domain of the tenant | [optional]
 **infraDeploymentId** | [**UUID**](.md)| infra deployment id of tenant | [optional]
 **tenantId** | **String**| Tenant id which is used as a header everywhere | [optional]
 **status** | [**List&lt;TenantStatus&gt;**](TenantStatus.md)| Status of the tenant | [optional]
 **tenantTypes** | [**List&lt;TenantType&gt;**](TenantType.md)| List of tenant type | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **apiDomainUrl** | **String**| Domain URL for the backend endpoints | [optional]

### Return type

[**GetTenantsApiResponse**](GetTenantsApiResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of tenants |  -  |
| **0** | API error response |  -  |


## onboardTenant

> Tenant onboardTenant(onboardTenantRequest)



Onboard a tenant.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        OnboardTenantRequest onboardTenantRequest = new OnboardTenantRequest(); // OnboardTenantRequest | 
        try {
            Tenant result = apiInstance.onboardTenant(onboardTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#onboardTenant");
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
 **onboardTenantRequest** | [**OnboardTenantRequest**](OnboardTenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tenant response with status |  -  |
| **0** | API error response |  -  |


## setupSharedControlPlaneBaseInfra

> Tenant setupSharedControlPlaneBaseInfra(setupSharedControlPlaneBaseInfraRequest)



Sets up console tenant. This is a temp api and will go away in later versions

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        SetupSharedControlPlaneBaseInfraRequest setupSharedControlPlaneBaseInfraRequest = new SetupSharedControlPlaneBaseInfraRequest(); // SetupSharedControlPlaneBaseInfraRequest | 
        try {
            Tenant result = apiInstance.setupSharedControlPlaneBaseInfra(setupSharedControlPlaneBaseInfraRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#setupSharedControlPlaneBaseInfra");
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
 **setupSharedControlPlaneBaseInfraRequest** | [**SetupSharedControlPlaneBaseInfraRequest**](SetupSharedControlPlaneBaseInfraRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tenant response with status |  -  |
| **0** | API error response |  -  |


## setupTenant

> Tenant setupTenant(setupTenantRequest)



Sets up a tenant.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        SetupTenantRequest setupTenantRequest = new SetupTenantRequest(); // SetupTenantRequest | 
        try {
            Tenant result = apiInstance.setupTenant(setupTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#setupTenant");
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
 **setupTenantRequest** | [**SetupTenantRequest**](SetupTenantRequest.md)|  |

### Return type

[**Tenant**](Tenant.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tenant response with status |  -  |
| **0** | API error response |  -  |


## updateTenant

> Tenant updateTenant(id, tenant)

Update a Tessell Tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Tenant tenant = new Tenant(); // Tenant | Update tenant object
        try {
            Tenant result = apiInstance.updateTenant(id, tenant);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#updateTenant");
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
 **id** | [**UUID**](.md)| id |
 **tenant** | [**Tenant**](Tenant.md)| Update tenant object |

### Return type

[**Tenant**](Tenant.md)

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


## upgradeTenant

> Tenant upgradeTenant(id, upgradeTenantRequest)

Upgrade a Tessell Tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        UpgradeTenantRequest upgradeTenantRequest = new UpgradeTenantRequest(); // UpgradeTenantRequest | Upgrade a tenant
        try {
            Tenant result = apiInstance.upgradeTenant(id, upgradeTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#upgradeTenant");
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
 **id** | [**UUID**](.md)| id |
 **upgradeTenantRequest** | [**UpgradeTenantRequest**](UpgradeTenantRequest.md)| Upgrade a tenant |

### Return type

[**Tenant**](Tenant.md)

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


## upgradeTenantServices

> Tenant upgradeTenantServices(tenantId)

Upgrade services of a tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantOpsApi apiInstance = new TenantOpsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant id
        try {
            Tenant result = apiInstance.upgradeTenantServices(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantOpsApi#upgradeTenantServices");
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
 **tenantId** | **String**| tenant id |

### Return type

[**Tenant**](Tenant.md)

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

