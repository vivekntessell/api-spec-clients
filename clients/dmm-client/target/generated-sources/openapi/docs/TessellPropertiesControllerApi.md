# TessellPropertiesControllerApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAmGenericProperties**](TessellPropertiesControllerApi.md#createAmGenericProperties) | **POST** /tessell-ops/am/generic-properties | Create a property
[**deleteAmGenericProperties**](TessellPropertiesControllerApi.md#deleteAmGenericProperties) | **DELETE** /tessell-ops/am/generic-properties | Delete properties
[**getAmGenericProperties**](TessellPropertiesControllerApi.md#getAmGenericProperties) | **GET** /tessell-ops/am/generic-properties | getAmGenericProperties



## createAmGenericProperties

> List&lt;GenericProperty&gt; createAmGenericProperties(genericProperty)

Create a property

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellPropertiesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPropertiesControllerApi apiInstance = new TessellPropertiesControllerApi(defaultClient);
        List<GenericProperty> genericProperty = Arrays.asList(); // List<GenericProperty> | 
        try {
            List<GenericProperty> result = apiInstance.createAmGenericProperties(genericProperty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPropertiesControllerApi#createAmGenericProperties");
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
 **genericProperty** | [**List&lt;GenericProperty&gt;**](GenericProperty.md)|  |

### Return type

[**List&lt;GenericProperty&gt;**](GenericProperty.md)

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


## deleteAmGenericProperties

> ApiStatus deleteAmGenericProperties(deleteGenericPropertyPayload)

Delete properties

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellPropertiesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPropertiesControllerApi apiInstance = new TessellPropertiesControllerApi(defaultClient);
        DeleteGenericPropertyPayload deleteGenericPropertyPayload = new DeleteGenericPropertyPayload(); // DeleteGenericPropertyPayload | 
        try {
            ApiStatus result = apiInstance.deleteAmGenericProperties(deleteGenericPropertyPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPropertiesControllerApi#deleteAmGenericProperties");
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
 **deleteGenericPropertyPayload** | [**DeleteGenericPropertyPayload**](DeleteGenericPropertyPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

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


## getAmGenericProperties

> List&lt;GenericProperty&gt; getAmGenericProperties(names, pageSize, pageOffset, timeZone)

getAmGenericProperties

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellPropertiesControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPropertiesControllerApi apiInstance = new TessellPropertiesControllerApi(defaultClient);
        List<String> names = Arrays.asList(); // List<String> | property names
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<GenericProperty> result = apiInstance.getAmGenericProperties(names, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPropertiesControllerApi#getAmGenericProperties");
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
 **names** | [**List&lt;String&gt;**](String.md)| property names | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;GenericProperty&gt;**](GenericProperty.md)

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

