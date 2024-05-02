# TessellServicePlanControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createServicePlan**](TessellServicePlanControllerApi.md#createServicePlan) | **POST** /tessell-internal/service-plans | Create an Tessell App
[**deleteServicePlan**](TessellServicePlanControllerApi.md#deleteServicePlan) | **DELETE** /tessell-internal/service-plans/{name} | Delete a Tessell App
[**getServicePlan**](TessellServicePlanControllerApi.md#getServicePlan) | **GET** /tessell-internal/service-plans/{name} | Get details of an Tessell App
[**getServicePlans**](TessellServicePlanControllerApi.md#getServicePlans) | **GET** /service-plans | Get a list of Tessell Service Plans



## createServicePlan

> TessellServicePlanDTO createServicePlan(tessellServicePlanCreatePayloadDTO)

Create an Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellServicePlanControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellServicePlanControllerApi apiInstance = new TessellServicePlanControllerApi(defaultClient);
        TessellServicePlanCreatePayloadDTO tessellServicePlanCreatePayloadDTO = new TessellServicePlanCreatePayloadDTO(); // TessellServicePlanCreatePayloadDTO | 
        try {
            TessellServicePlanDTO result = apiInstance.createServicePlan(tessellServicePlanCreatePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServicePlanControllerApi#createServicePlan");
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
 **tessellServicePlanCreatePayloadDTO** | [**TessellServicePlanCreatePayloadDTO**](TessellServicePlanCreatePayloadDTO.md)|  | [optional]

### Return type

[**TessellServicePlanDTO**](TessellServicePlanDTO.md)

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


## deleteServicePlan

> TessellGovernStatusDTO deleteServicePlan(name, softDelete)

Delete a Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellServicePlanControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellServicePlanControllerApi apiInstance = new TessellServicePlanControllerApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellGovernStatusDTO result = apiInstance.deleteServicePlan(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServicePlanControllerApi#deleteServicePlan");
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


## getServicePlan

> TessellServicePlanDTO getServicePlan(name)

Get details of an Tessell App

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellServicePlanControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellServicePlanControllerApi apiInstance = new TessellServicePlanControllerApi(defaultClient);
        String name = "name_example"; // String | name
        try {
            TessellServicePlanDTO result = apiInstance.getServicePlan(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServicePlanControllerApi#getServicePlan");
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

[**TessellServicePlanDTO**](TessellServicePlanDTO.md)

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


## getServicePlans

> TessellServicePlanApiResponseDTO getServicePlans(loadApps, loadFeatures, pageSize, pageOffset, timeZone)

Get a list of Tessell Service Plans

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellServicePlanControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellServicePlanControllerApi apiInstance = new TessellServicePlanControllerApi(defaultClient);
        String loadApps = "loadApps_example"; // String | load-apps
        String loadFeatures = "loadFeatures_example"; // String | load-features
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServicePlanApiResponseDTO result = apiInstance.getServicePlans(loadApps, loadFeatures, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServicePlanControllerApi#getServicePlans");
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
 **loadApps** | **String**| load-apps | [optional]
 **loadFeatures** | **String**| load-features | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServicePlanApiResponseDTO**](TessellServicePlanApiResponseDTO.md)

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

