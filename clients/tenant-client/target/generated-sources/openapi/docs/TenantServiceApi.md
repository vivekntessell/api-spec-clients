# TenantServiceApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateTenant**](TenantServiceApi.md#activateTenant) | **POST** /tenants/activate | 
[**getTenantByEmail**](TenantServiceApi.md#getTenantByEmail) | **GET** /tenants | Returns the tenant details for specified email address
[**getTenantConfigServiceView**](TenantServiceApi.md#getTenantConfigServiceView) | **GET** /tenant-config | Returns the tenant service config
[**registerTenant**](TenantServiceApi.md#registerTenant) | **POST** /tenants/register | 
[**verifyAzureAuth**](TenantServiceApi.md#verifyAzureAuth) | **GET** /azureauth/callback | 
[**verifyEmail**](TenantServiceApi.md#verifyEmail) | **POST** /tenants/verify | 



## activateTenant

> TenantServiceConsumer activateTenant(activateTenantRequest)



Activate the tenant

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        ActivateTenantRequest activateTenantRequest = new ActivateTenantRequest(); // ActivateTenantRequest | 
        try {
            TenantServiceConsumer result = apiInstance.activateTenant(activateTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#activateTenant");
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
 **activateTenantRequest** | [**ActivateTenantRequest**](ActivateTenantRequest.md)|  |

### Return type

[**TenantServiceConsumer**](TenantServiceConsumer.md)

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


## getTenantByEmail

> TenantOnboardingResponse getTenantByEmail(email)

Returns the tenant details for specified email address

Returns the tenant details for specified email address

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        String email = "email_example"; // String | Email address of the tenant
        try {
            TenantOnboardingResponse result = apiInstance.getTenantByEmail(email);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#getTenantByEmail");
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
 **email** | **String**| Email address of the tenant |

### Return type

[**TenantOnboardingResponse**](TenantOnboardingResponse.md)

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


## getTenantConfigServiceView

> TenantConfigServiceView getTenantConfigServiceView(tenantId)

Returns the tenant service config

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant Id
        try {
            TenantConfigServiceView result = apiInstance.getTenantConfigServiceView(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#getTenantConfigServiceView");
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
 **tenantId** | **String**| Tenant Id |

### Return type

[**TenantConfigServiceView**](TenantConfigServiceView.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Tenant service consumer view |  -  |
| **0** | API error response |  -  |


## registerTenant

> RegisterTenantResponse registerTenant(registerTenantRequest)



Sign up a new PE tenant.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        RegisterTenantRequest registerTenantRequest = new RegisterTenantRequest(); // RegisterTenantRequest | 
        try {
            RegisterTenantResponse result = apiInstance.registerTenant(registerTenantRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#registerTenant");
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
 **registerTenantRequest** | [**RegisterTenantRequest**](RegisterTenantRequest.md)|  |

### Return type

[**RegisterTenantResponse**](RegisterTenantResponse.md)

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


## verifyAzureAuth

> verifyAzureAuth(code, state)



Verify the azure oauth code.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        String code = "code_example"; // String | Azure auth code
        String state = "state_example"; // String | Tessell Tenant ID
        try {
            apiInstance.verifyAzureAuth(code, state);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#verifyAzureAuth");
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
 **state** | **String**| Tessell Tenant ID |

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


## verifyEmail

> RegisterTenantResponse verifyEmail(verifyCodeRequest)



Verify the email verification code.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.TenantServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        TenantServiceApi apiInstance = new TenantServiceApi(defaultClient);
        VerifyCodeRequest verifyCodeRequest = new VerifyCodeRequest(); // VerifyCodeRequest | 
        try {
            RegisterTenantResponse result = apiInstance.verifyEmail(verifyCodeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TenantServiceApi#verifyEmail");
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
 **verifyCodeRequest** | [**VerifyCodeRequest**](VerifyCodeRequest.md)|  |

### Return type

[**RegisterTenantResponse**](RegisterTenantResponse.md)

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

