# TessellFeatureControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFeature**](TessellFeatureControllerApi.md#createFeature) | **POST** /tessell-internal/features | Create a feature
[**deleteFeature**](TessellFeatureControllerApi.md#deleteFeature) | **DELETE** /tessell-internal/features/{name} | Delete a feature
[**getFeature**](TessellFeatureControllerApi.md#getFeature) | **GET** /tessell-internal/features/{name} | Get details of an feature
[**getFeatures**](TessellFeatureControllerApi.md#getFeatures) | **GET** /tessell-internal/features | Get list of features
[**updateFeature**](TessellFeatureControllerApi.md#updateFeature) | **PATCH** /tessell-internal/features/{name} | Update a feature



## createFeature

> TessellFeatureDTO createFeature(tessellFeatureCreatePayloadDTO)

Create a feature

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellFeatureControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellFeatureControllerApi apiInstance = new TessellFeatureControllerApi(defaultClient);
        TessellFeatureCreatePayloadDTO tessellFeatureCreatePayloadDTO = new TessellFeatureCreatePayloadDTO(); // TessellFeatureCreatePayloadDTO | 
        try {
            TessellFeatureDTO result = apiInstance.createFeature(tessellFeatureCreatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellFeatureControllerApi#createFeature");
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
 **tessellFeatureCreatePayloadDTO** | [**TessellFeatureCreatePayloadDTO**](TessellFeatureCreatePayloadDTO.md)|  | [optional]

### Return type

[**TessellFeatureDTO**](TessellFeatureDTO.md)

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


## deleteFeature

> TessellGovernStatusDTO deleteFeature(name, softDelete)

Delete a feature

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellFeatureControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellFeatureControllerApi apiInstance = new TessellFeatureControllerApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellGovernStatusDTO result = apiInstance.deleteFeature(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellFeatureControllerApi#deleteFeature");
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
 **name** | **String**| name |
 **softDelete** | **Boolean**| softDelete | [optional] [default to true]

### Return type

[**TessellGovernStatusDTO**](TessellGovernStatusDTO.md)

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


## getFeature

> TessellFeatureDTO getFeature(name)

Get details of an feature

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellFeatureControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellFeatureControllerApi apiInstance = new TessellFeatureControllerApi(defaultClient);
        String name = "name_example"; // String | name
        try {
            TessellFeatureDTO result = apiInstance.getFeature(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellFeatureControllerApi#getFeature");
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
 **name** | **String**| name |

### Return type

[**TessellFeatureDTO**](TessellFeatureDTO.md)

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


## getFeatures

> TessellFeatureApiResponseDTO getFeatures(tenantId, app, appFamily, features, withoutTenantContext, pageSize, pageOffset, timeZone)

Get list of features

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellFeatureControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellFeatureControllerApi apiInstance = new TessellFeatureControllerApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant Id Header
        String app = "app_example"; // String | App name
        String appFamily = "appFamily_example"; // String | App family name
        List<String> features = Arrays.asList(); // List<String> | List of feature names
        Boolean withoutTenantContext = true; // Boolean | Load all features irrespective of tenantId
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellFeatureApiResponseDTO result = apiInstance.getFeatures(tenantId, app, appFamily, features, withoutTenantContext, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellFeatureControllerApi#getFeatures");
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
 **tenantId** | **String**| Tenant Id Header | [optional]
 **app** | **String**| App name | [optional]
 **appFamily** | **String**| App family name | [optional]
 **features** | [**List&lt;String&gt;**](String.md)| List of feature names | [optional]
 **withoutTenantContext** | **Boolean**| Load all features irrespective of tenantId | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellFeatureApiResponseDTO**](TessellFeatureApiResponseDTO.md)

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


## updateFeature

> TessellFeatureDTO updateFeature(name, tessellFeatureUpdatePayloadDTO)

Update a feature

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellFeatureControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellFeatureControllerApi apiInstance = new TessellFeatureControllerApi(defaultClient);
        String name = "name_example"; // String | name
        TessellFeatureUpdatePayloadDTO tessellFeatureUpdatePayloadDTO = new TessellFeatureUpdatePayloadDTO(); // TessellFeatureUpdatePayloadDTO | 
        try {
            TessellFeatureDTO result = apiInstance.updateFeature(name, tessellFeatureUpdatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellFeatureControllerApi#updateFeature");
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
 **name** | **String**| name |
 **tessellFeatureUpdatePayloadDTO** | [**TessellFeatureUpdatePayloadDTO**](TessellFeatureUpdatePayloadDTO.md)|  | [optional]

### Return type

[**TessellFeatureDTO**](TessellFeatureDTO.md)

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

