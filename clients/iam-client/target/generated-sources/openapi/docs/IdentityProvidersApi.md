# IdentityProvidersApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteIdps**](IdentityProvidersApi.md#bulkDeleteIdps) | **DELETE** /tessell-ops/iam/idps/bulk-delete | Bulk delete Identity Providers
[**createIdpConfiguration**](IdentityProvidersApi.md#createIdpConfiguration) | **POST** /iam/idps | Create a new integration with an Identity Provider
[**deleteIdpConfiguration**](IdentityProvidersApi.md#deleteIdpConfiguration) | **DELETE** /iam/idps/{idp-id} | Delete an Identity Provider integration
[**getConfiguredIdps**](IdentityProvidersApi.md#getConfiguredIdps) | **GET** /iam/idps/configured-idps | Get a list of integrated Identity Providers
[**getStatusOfBulkDeleteIdps**](IdentityProvidersApi.md#getStatusOfBulkDeleteIdps) | **POST** /tessell-ops/iam/idps/bulk-delete | Get status of bulk deletion of Identity Providers
[**updateIdpConfiguration**](IdentityProvidersApi.md#updateIdpConfiguration) | **PUT** /iam/idps/{idp-id} | Update an Identity Provider



## bulkDeleteIdps

> TessellResourceBulkDeleteResponseOps bulkDeleteIdps(tessellResourceBulkDeletePayloadOps)

Bulk delete Identity Providers

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteIdps(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#bulkDeleteIdps");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## createIdpConfiguration

> TessellIdentityProviderDTO createIdpConfiguration(tenantId, tessellCreateIdpPayload)

Create a new integration with an Identity Provider

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellCreateIdpPayload tessellCreateIdpPayload = new TessellCreateIdpPayload(); // TessellCreateIdpPayload | 
        try {
            TessellIdentityProviderDTO result = apiInstance.createIdpConfiguration(tenantId, tessellCreateIdpPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#createIdpConfiguration");
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
 **tenantId** | **String**| Id of the Tenant |
 **tessellCreateIdpPayload** | [**TessellCreateIdpPayload**](TessellCreateIdpPayload.md)|  | [optional]

### Return type

[**TessellIdentityProviderDTO**](TessellIdentityProviderDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteIdpConfiguration

> TessellApiStatus deleteIdpConfiguration(tenantId, idpId)

Delete an Identity Provider integration

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID idpId = new UUID(); // UUID | UUID of an Identity Provider Integration
        try {
            TessellApiStatus result = apiInstance.deleteIdpConfiguration(tenantId, idpId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#deleteIdpConfiguration");
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
 **tenantId** | **String**| Id of the Tenant |
 **idpId** | [**UUID**](.md)| UUID of an Identity Provider Integration |

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## getConfiguredIdps

> TessellConfiguredIdpsApiResponse getConfiguredIdps()

Get a list of integrated Identity Providers

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        try {
            TessellConfiguredIdpsApiResponse result = apiInstance.getConfiguredIdps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#getConfiguredIdps");
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

[**TessellConfiguredIdpsApiResponse**](TessellConfiguredIdpsApiResponse.md)

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


## getStatusOfBulkDeleteIdps

> TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteIdps(tessellResourceBulkDeletePayloadOps)

Get status of bulk deletion of Identity Providers

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.getStatusOfBulkDeleteIdps(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#getStatusOfBulkDeleteIdps");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## updateIdpConfiguration

> TessellIdentityProviderDTO updateIdpConfiguration(tenantId, idpId, tessellCreateIdpPayload)

Update an Identity Provider

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.IdentityProvidersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        IdentityProvidersApi apiInstance = new IdentityProvidersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID idpId = new UUID(); // UUID | UUID of an Identity Provider Integration
        TessellCreateIdpPayload tessellCreateIdpPayload = new TessellCreateIdpPayload(); // TessellCreateIdpPayload | 
        try {
            TessellIdentityProviderDTO result = apiInstance.updateIdpConfiguration(tenantId, idpId, tessellCreateIdpPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IdentityProvidersApi#updateIdpConfiguration");
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
 **tenantId** | **String**| Id of the Tenant |
 **idpId** | [**UUID**](.md)| UUID of an Identity Provider Integration |
 **tessellCreateIdpPayload** | [**TessellCreateIdpPayload**](TessellCreateIdpPayload.md)|  | [optional]

### Return type

[**TessellIdentityProviderDTO**](TessellIdentityProviderDTO.md)

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

