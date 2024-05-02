# UserpoolApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUserpool**](UserpoolApi.md#createUserpool) | **POST** /iam/i/userpools | Create for a new userpool
[**deleteUserpool**](UserpoolApi.md#deleteUserpool) | **DELETE** /iam/i/userpools/{userpoolId} | Delete a userpool
[**getUserpools**](UserpoolApi.md#getUserpools) | **GET** /iam/i/userpools | Get list of all the userpools
[**updateUserpool**](UserpoolApi.md#updateUserpool) | **PATCH** /iam/i/userpools/{userpoolId} | Update a userpool



## createUserpool

> TessellUserpoolDTO createUserpool(tessellUserpoolPayload)

Create for a new userpool

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UserpoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UserpoolApi apiInstance = new UserpoolApi(defaultClient);
        TessellUserpoolPayload tessellUserpoolPayload = new TessellUserpoolPayload(); // TessellUserpoolPayload | 
        try {
            TessellUserpoolDTO result = apiInstance.createUserpool(tessellUserpoolPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserpoolApi#createUserpool");
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
 **tessellUserpoolPayload** | [**TessellUserpoolPayload**](TessellUserpoolPayload.md)|  | [optional]

### Return type

[**TessellUserpoolDTO**](TessellUserpoolDTO.md)

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


## deleteUserpool

> TessellApiStatus deleteUserpool(userpoolId, softDelete)

Delete a userpool

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UserpoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UserpoolApi apiInstance = new UserpoolApi(defaultClient);
        String userpoolId = "userpoolId_example"; // String | userpoolId
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellApiStatus result = apiInstance.deleteUserpool(userpoolId, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserpoolApi#deleteUserpool");
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
 **userpoolId** | **String**| userpoolId |
 **softDelete** | **Boolean**| softDelete | [optional] [default to true]

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


## getUserpools

> TessellIamApiResponse getUserpools(id, pageSize, pageOffset, timeZone)

Get list of all the userpools

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UserpoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UserpoolApi apiInstance = new UserpoolApi(defaultClient);
        String id = "id_example"; // String | id
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellIamApiResponse result = apiInstance.getUserpools(id, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserpoolApi#getUserpools");
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
 **id** | **String**| id | [optional]
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellIamApiResponse**](TessellIamApiResponse.md)

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


## updateUserpool

> TessellUserpoolDTO updateUserpool(userpoolId, tessellUserpoolPayload)

Update a userpool

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UserpoolApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UserpoolApi apiInstance = new UserpoolApi(defaultClient);
        String userpoolId = "userpoolId_example"; // String | userpoolId
        TessellUserpoolPayload tessellUserpoolPayload = new TessellUserpoolPayload(); // TessellUserpoolPayload | 
        try {
            TessellUserpoolDTO result = apiInstance.updateUserpool(userpoolId, tessellUserpoolPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UserpoolApi#updateUserpool");
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
 **userpoolId** | **String**| userpoolId |
 **tessellUserpoolPayload** | [**TessellUserpoolPayload**](TessellUserpoolPayload.md)|  | [optional]

### Return type

[**TessellUserpoolDTO**](TessellUserpoolDTO.md)

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

