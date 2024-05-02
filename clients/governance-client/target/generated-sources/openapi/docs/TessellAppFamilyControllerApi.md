# TessellAppFamilyControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAppFamily**](TessellAppFamilyControllerApi.md#createAppFamily) | **POST** /tessell-internal/apps-families | Create an App Family
[**deleteAppFamily**](TessellAppFamilyControllerApi.md#deleteAppFamily) | **DELETE** /tessell-internal/apps-families/{name} | Delete App Family
[**getAppsFamilies**](TessellAppFamilyControllerApi.md#getAppsFamilies) | **GET** /tessell-internal/apps-families | Get a list of App Family
[**updateAppFamily**](TessellAppFamilyControllerApi.md#updateAppFamily) | **PATCH** /tessell-internal/apps-families/{name} | Update App Family



## createAppFamily

> TessellAppFamilyDTO createAppFamily(tessellAppFamilyCreatePayloadDTO)

Create an App Family

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppFamilyControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppFamilyControllerApi apiInstance = new TessellAppFamilyControllerApi(defaultClient);
        TessellAppFamilyCreatePayloadDTO tessellAppFamilyCreatePayloadDTO = new TessellAppFamilyCreatePayloadDTO(); // TessellAppFamilyCreatePayloadDTO | 
        try {
            TessellAppFamilyDTO result = apiInstance.createAppFamily(tessellAppFamilyCreatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppFamilyControllerApi#createAppFamily");
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
 **tessellAppFamilyCreatePayloadDTO** | [**TessellAppFamilyCreatePayloadDTO**](TessellAppFamilyCreatePayloadDTO.md)|  | [optional]

### Return type

[**TessellAppFamilyDTO**](TessellAppFamilyDTO.md)

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


## deleteAppFamily

> TessellGovernStatusDTO deleteAppFamily(name, softDelete)

Delete App Family

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppFamilyControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppFamilyControllerApi apiInstance = new TessellAppFamilyControllerApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellGovernStatusDTO result = apiInstance.deleteAppFamily(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppFamilyControllerApi#deleteAppFamily");
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


## getAppsFamilies

> TessellAppFamilyApiResponseDTO getAppsFamilies(loadApps, loadFeatures, pageSize, pageOffset, timeZone)

Get a list of App Family

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppFamilyControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppFamilyControllerApi apiInstance = new TessellAppFamilyControllerApi(defaultClient);
        String loadApps = "false"; // String | load-apps
        String loadFeatures = "false"; // String | load-features
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellAppFamilyApiResponseDTO result = apiInstance.getAppsFamilies(loadApps, loadFeatures, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppFamilyControllerApi#getAppsFamilies");
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
 **loadApps** | **String**| load-apps | [optional] [default to false]
 **loadFeatures** | **String**| load-features | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellAppFamilyApiResponseDTO**](TessellAppFamilyApiResponseDTO.md)

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


## updateAppFamily

> TessellAppFamilyDTO updateAppFamily(name, tessellAppFamilyUpdatePayloadDTO)

Update App Family

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellAppFamilyControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellAppFamilyControllerApi apiInstance = new TessellAppFamilyControllerApi(defaultClient);
        String name = "name_example"; // String | name
        TessellAppFamilyUpdatePayloadDTO tessellAppFamilyUpdatePayloadDTO = new TessellAppFamilyUpdatePayloadDTO(); // TessellAppFamilyUpdatePayloadDTO | 
        try {
            TessellAppFamilyDTO result = apiInstance.updateAppFamily(name, tessellAppFamilyUpdatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellAppFamilyControllerApi#updateAppFamily");
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
 **tessellAppFamilyUpdatePayloadDTO** | [**TessellAppFamilyUpdatePayloadDTO**](TessellAppFamilyUpdatePayloadDTO.md)|  | [optional]

### Return type

[**TessellAppFamilyDTO**](TessellAppFamilyDTO.md)

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

