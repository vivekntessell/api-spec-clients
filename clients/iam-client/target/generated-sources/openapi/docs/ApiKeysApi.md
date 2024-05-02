# ApiKeysApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**authorizeApiKey**](ApiKeysApi.md#authorizeApiKey) | **POST** /iam/authorize | 
[**bulkDeleteApiKeys**](ApiKeysApi.md#bulkDeleteApiKeys) | **DELETE** /tessell-ops/iam/api-keys/bulk-delete | Bulk delete API Keys
[**createApiKey**](ApiKeysApi.md#createApiKey) | **POST** /iam/api-keys | 
[**getApiKeys**](ApiKeysApi.md#getApiKeys) | **GET** /iam/api-keys | Get a list of Tessell Permission
[**getStatusOfBulkDeleteApiKeys**](ApiKeysApi.md#getStatusOfBulkDeleteApiKeys) | **POST** /tessell-ops/iam/api-keys/bulk-delete | Get status of bulk deletion of API Keys
[**revokeApiKey**](ApiKeysApi.md#revokeApiKey) | **DELETE** /iam/api-keys/{label} | Delete a Tessell api key



## authorizeApiKey

> TessellAuthorizeApiKeyResponse authorizeApiKey(tenantId, tessellAuthorizeApiKeyPayload)



### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellAuthorizeApiKeyPayload tessellAuthorizeApiKeyPayload = new TessellAuthorizeApiKeyPayload(); // TessellAuthorizeApiKeyPayload | 
        try {
            TessellAuthorizeApiKeyResponse result = apiInstance.authorizeApiKey(tenantId, tessellAuthorizeApiKeyPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#authorizeApiKey");
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
 **tenantId** | **String**| tenant-id |
 **tessellAuthorizeApiKeyPayload** | [**TessellAuthorizeApiKeyPayload**](TessellAuthorizeApiKeyPayload.md)|  | [optional]

### Return type

[**TessellAuthorizeApiKeyResponse**](TessellAuthorizeApiKeyResponse.md)

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


## bulkDeleteApiKeys

> TessellResourceBulkDeleteResponseOps bulkDeleteApiKeys(tessellResourceBulkDeletePayloadOps)

Bulk delete API Keys

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteApiKeys(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#bulkDeleteApiKeys");
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


## createApiKey

> TessellCreateApiKeyDTO createApiKey(tenantId, tessellCreateApiKeyPayload)



### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellCreateApiKeyPayload tessellCreateApiKeyPayload = new TessellCreateApiKeyPayload(); // TessellCreateApiKeyPayload | 
        try {
            TessellCreateApiKeyDTO result = apiInstance.createApiKey(tenantId, tessellCreateApiKeyPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#createApiKey");
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
 **tenantId** | **String**| tenant-id |
 **tessellCreateApiKeyPayload** | [**TessellCreateApiKeyPayload**](TessellCreateApiKeyPayload.md)|  | [optional]

### Return type

[**TessellCreateApiKeyDTO**](TessellCreateApiKeyDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## getApiKeys

> TessellApiKeyApiResponse getApiKeys(tenantId, pageSize, pageOffset, timeZone)

Get a list of Tessell Permission

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellApiKeyApiResponse result = apiInstance.getApiKeys(tenantId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#getApiKeys");
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
 **tenantId** | **String**| tenant-id |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellApiKeyApiResponse**](TessellApiKeyApiResponse.md)

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


## getStatusOfBulkDeleteApiKeys

> TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteApiKeys(tessellResourceBulkDeletePayloadOps)

Get status of bulk deletion of API Keys

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.getStatusOfBulkDeleteApiKeys(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#getStatusOfBulkDeleteApiKeys");
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


## revokeApiKey

> TessellApiStatus revokeApiKey(tenantId, label)

Delete a Tessell api key

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.ApiKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        ApiKeysApi apiInstance = new ApiKeysApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String label = "label_example"; // String | label
        try {
            TessellApiStatus result = apiInstance.revokeApiKey(tenantId, label);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiKeysApi#revokeApiKey");
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
 **label** | **String**| label |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |

