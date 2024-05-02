# TessellAppControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createApp**](TessellAppControllerApi.md#createApp) | **POST** /tessell-internal/apps | Create an Tessell App
[**deleteApp**](TessellAppControllerApi.md#deleteApp) | **DELETE** /tessell-internal/apps/{name} | Delete a Tessell App
[**getApp**](TessellAppControllerApi.md#getApp) | **GET** /tessell-internal/apps/{name} | Get details of an Tessell App
[**getApps**](TessellAppControllerApi.md#getApps) | **GET** /apps | Get a list of Tessell App
[**updateApp**](TessellAppControllerApi.md#updateApp) | **PATCH** /tessell-internal/apps/{name} | Update a Tessell App



## createApp

> TessellAppDTO createApp(tessellAppCreatePayloadDTO)

Create an Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppControllerApi apiInstance = new TessellAppControllerApi(defaultClient);
        TessellAppCreatePayloadDTO tessellAppCreatePayloadDTO = new TessellAppCreatePayloadDTO(); // TessellAppCreatePayloadDTO | 
        try {
            TessellAppDTO result = apiInstance.createApp(tessellAppCreatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppControllerApi#createApp");
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
 **tessellAppCreatePayloadDTO** | [**TessellAppCreatePayloadDTO**](TessellAppCreatePayloadDTO.md)|  | [optional]

### Return type

[**TessellAppDTO**](TessellAppDTO.md)

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


## deleteApp

> TessellGovernStatusDTO deleteApp(name, softDelete)

Delete a Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppControllerApi apiInstance = new TessellAppControllerApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellGovernStatusDTO result = apiInstance.deleteApp(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppControllerApi#deleteApp");
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
 **softDelete** | **Boolean**| softDelete | [optional]

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


## getApp

> TessellAppDTO getApp(name)

Get details of an Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppControllerApi apiInstance = new TessellAppControllerApi(defaultClient);
        String name = "name_example"; // String | name
        try {
            TessellAppDTO result = apiInstance.getApp(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppControllerApi#getApp");
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

[**TessellAppDTO**](TessellAppDTO.md)

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


## getApps

> TessellAppApiResponseDTO getApps(tenantId, loadFeatures, pageSize, pageOffset, timeZone, consumerType)

Get a list of Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppControllerApi apiInstance = new TessellAppControllerApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String loadFeatures = "loadFeatures_example"; // String | load-features
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        String consumerType = "OPS"; // String | API consumer type
        try {
            TessellAppApiResponseDTO result = apiInstance.getApps(tenantId, loadFeatures, pageSize, pageOffset, timeZone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppControllerApi#getApps");
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
 **loadFeatures** | **String**| load-features | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **consumerType** | **String**| API consumer type | [optional] [default to OPS]

### Return type

[**TessellAppApiResponseDTO**](TessellAppApiResponseDTO.md)

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


## updateApp

> TessellAppDTO updateApp(name, tessellAppUpdatePayloadDTO)

Update a Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppControllerApi apiInstance = new TessellAppControllerApi(defaultClient);
        String name = "name_example"; // String | name
        TessellAppUpdatePayloadDTO tessellAppUpdatePayloadDTO = new TessellAppUpdatePayloadDTO(); // TessellAppUpdatePayloadDTO | 
        try {
            TessellAppDTO result = apiInstance.updateApp(name, tessellAppUpdatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppControllerApi#updateApp");
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
 **tessellAppUpdatePayloadDTO** | [**TessellAppUpdatePayloadDTO**](TessellAppUpdatePayloadDTO.md)|  | [optional]

### Return type

[**TessellAppDTO**](TessellAppDTO.md)

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

