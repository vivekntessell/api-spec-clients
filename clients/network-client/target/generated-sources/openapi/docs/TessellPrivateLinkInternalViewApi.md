# TessellPrivateLinkInternalViewApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrivateLinkInternal**](TessellPrivateLinkInternalViewApi.md#createPrivateLinkInternal) | **POST** /tessell-internal/network/private-link | Create a Private Link
[**deletePrivateLinkInternal**](TessellPrivateLinkInternalViewApi.md#deletePrivateLinkInternal) | **DELETE** /tessell-internal/network/private-link/{id} | Delete Private Link
[**getPrivateLinkByIdInternal**](TessellPrivateLinkInternalViewApi.md#getPrivateLinkByIdInternal) | **GET** /tessell-internal/network/private-link/{id} | Get Private Link by ID
[**isPrivateLinkDeletableInternal**](TessellPrivateLinkInternalViewApi.md#isPrivateLinkDeletableInternal) | **GET** /tessell-internal/network/private-link/{id}/deletable | Is Private Link Service Deletable
[**updatePrivateLinkInternal**](TessellPrivateLinkInternalViewApi.md#updatePrivateLinkInternal) | **PATCH** /tessell-internal/network/private-link/{id} | Update Private Link



## createPrivateLinkInternal

> TessellPrivateLinkDTO createPrivateLinkInternal(tessellCreatePrivateLinkPayloadDTO)

Create a Private Link

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellPrivateLinkInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellPrivateLinkInternalViewApi apiInstance = new TessellPrivateLinkInternalViewApi(defaultClient);
        TessellCreatePrivateLinkPayloadDTO tessellCreatePrivateLinkPayloadDTO = new TessellCreatePrivateLinkPayloadDTO(); // TessellCreatePrivateLinkPayloadDTO | Private Link Information
        try {
            TessellPrivateLinkDTO result = apiInstance.createPrivateLinkInternal(tessellCreatePrivateLinkPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPrivateLinkInternalViewApi#createPrivateLinkInternal");
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
 **tessellCreatePrivateLinkPayloadDTO** | [**TessellCreatePrivateLinkPayloadDTO**](TessellCreatePrivateLinkPayloadDTO.md)| Private Link Information |

### Return type

[**TessellPrivateLinkDTO**](TessellPrivateLinkDTO.md)

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


## deletePrivateLinkInternal

> TessellApiStatusDTO deletePrivateLinkInternal(id)

Delete Private Link

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellPrivateLinkInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellPrivateLinkInternalViewApi apiInstance = new TessellPrivateLinkInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellApiStatusDTO result = apiInstance.deletePrivateLinkInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPrivateLinkInternalViewApi#deletePrivateLinkInternal");
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
 **id** | [**UUID**](.md)| Tessell Generated UUID for the Entity |

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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


## getPrivateLinkByIdInternal

> TessellPrivateLinkDTO getPrivateLinkByIdInternal(id)

Get Private Link by ID

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellPrivateLinkInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellPrivateLinkInternalViewApi apiInstance = new TessellPrivateLinkInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellPrivateLinkDTO result = apiInstance.getPrivateLinkByIdInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPrivateLinkInternalViewApi#getPrivateLinkByIdInternal");
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
 **id** | [**UUID**](.md)| Tessell Generated UUID for the Entity |

### Return type

[**TessellPrivateLinkDTO**](TessellPrivateLinkDTO.md)

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


## isPrivateLinkDeletableInternal

> TessellApiStatusDTO isPrivateLinkDeletableInternal(id)

Is Private Link Service Deletable

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellPrivateLinkInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellPrivateLinkInternalViewApi apiInstance = new TessellPrivateLinkInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        try {
            TessellApiStatusDTO result = apiInstance.isPrivateLinkDeletableInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPrivateLinkInternalViewApi#isPrivateLinkDeletableInternal");
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
 **id** | [**UUID**](.md)| Tessell Generated UUID for the Entity |

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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


## updatePrivateLinkInternal

> TessellPrivateLinkDTO updatePrivateLinkInternal(id, tessellUpdatePrivateLinkPayloadDTO)

Update Private Link

### Example

```java
// Import classes:
import com.tessell.network.client.invoker.ApiClient;
import com.tessell.network.client.invoker.ApiException;
import com.tessell.network.client.invoker.Configuration;
import com.tessell.network.client.invoker.models.*;
import com.tessell.network.client.api.TessellPrivateLinkInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellPrivateLinkInternalViewApi apiInstance = new TessellPrivateLinkInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Generated UUID for the Entity
        TessellUpdatePrivateLinkPayloadDTO tessellUpdatePrivateLinkPayloadDTO = new TessellUpdatePrivateLinkPayloadDTO(); // TessellUpdatePrivateLinkPayloadDTO | Private Link Update Information
        try {
            TessellPrivateLinkDTO result = apiInstance.updatePrivateLinkInternal(id, tessellUpdatePrivateLinkPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPrivateLinkInternalViewApi#updatePrivateLinkInternal");
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
 **id** | [**UUID**](.md)| Tessell Generated UUID for the Entity |
 **tessellUpdatePrivateLinkPayloadDTO** | [**TessellUpdatePrivateLinkPayloadDTO**](TessellUpdatePrivateLinkPayloadDTO.md)| Private Link Update Information |

### Return type

[**TessellPrivateLinkDTO**](TessellPrivateLinkDTO.md)

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

