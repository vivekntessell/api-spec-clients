# TessellPermissionControllerApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPermission**](TessellPermissionControllerApi.md#createPermission) | **POST** /tessell-internal/permissions | Create an Tessell Permission
[**deletePermission**](TessellPermissionControllerApi.md#deletePermission) | **DELETE** /tessell-internal/iam/{entity-type}/permissions/{permission} | Delete a Tessell Permission
[**getPermission**](TessellPermissionControllerApi.md#getPermission) | **GET** /tessell-internal/iam/{entity-type}/permissions/{permission} | Get details of an Tessell Permission
[**getPermissions**](TessellPermissionControllerApi.md#getPermissions) | **GET** /tessell-internal/iam/{entity-type}/permissions | Get a list of Tessell Permissions
[**updatePermission**](TessellPermissionControllerApi.md#updatePermission) | **PATCH** /tessell-internal/iam/{entity-type}/permissions/{permission} | Update a Tessell Permission



## createPermission

> TessellPermissionDTO createPermission(tessellPermissionCreatePayload)

Create an Tessell Permission

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.TessellPermissionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPermissionControllerApi apiInstance = new TessellPermissionControllerApi(defaultClient);
        TessellPermissionCreatePayload tessellPermissionCreatePayload = new TessellPermissionCreatePayload(); // TessellPermissionCreatePayload | 
        try {
            TessellPermissionDTO result = apiInstance.createPermission(tessellPermissionCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPermissionControllerApi#createPermission");
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
 **tessellPermissionCreatePayload** | [**TessellPermissionCreatePayload**](TessellPermissionCreatePayload.md)|  | [optional]

### Return type

[**TessellPermissionDTO**](TessellPermissionDTO.md)

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


## deletePermission

> TessellApiStatus deletePermission(entityType, permission)

Delete a Tessell Permission

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.TessellPermissionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPermissionControllerApi apiInstance = new TessellPermissionControllerApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String permission = "permission_example"; // String | permission
        try {
            TessellApiStatus result = apiInstance.deletePermission(entityType, permission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPermissionControllerApi#deletePermission");
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
 **entityType** | **String**| entity-type |
 **permission** | **String**| permission |

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


## getPermission

> TessellPermissionDTO getPermission(entityType, permission)

Get details of an Tessell Permission

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.TessellPermissionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPermissionControllerApi apiInstance = new TessellPermissionControllerApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String permission = "permission_example"; // String | permission
        try {
            TessellPermissionDTO result = apiInstance.getPermission(entityType, permission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPermissionControllerApi#getPermission");
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
 **entityType** | **String**| entity-type |
 **permission** | **String**| permission |

### Return type

[**TessellPermissionDTO**](TessellPermissionDTO.md)

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


## getPermissions

> TessellPermissionApiResponse getPermissions(entityType, loadInternalPermissions, pageSize, pageOffset, timeZone)

Get a list of Tessell Permissions

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.TessellPermissionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPermissionControllerApi apiInstance = new TessellPermissionControllerApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String loadInternalPermissions = "false"; // String | load-internal-permissions
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellPermissionApiResponse result = apiInstance.getPermissions(entityType, loadInternalPermissions, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPermissionControllerApi#getPermissions");
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
 **entityType** | **String**| entity-type |
 **loadInternalPermissions** | **String**| load-internal-permissions | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellPermissionApiResponse**](TessellPermissionApiResponse.md)

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


## updatePermission

> TessellPermissionDTO updatePermission(entityType, permission, tessellPermissionUpdatePayload)

Update a Tessell Permission

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.TessellPermissionControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellPermissionControllerApi apiInstance = new TessellPermissionControllerApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String permission = "permission_example"; // String | permission
        TessellPermissionUpdatePayload tessellPermissionUpdatePayload = new TessellPermissionUpdatePayload(); // TessellPermissionUpdatePayload | 
        try {
            TessellPermissionDTO result = apiInstance.updatePermission(entityType, permission, tessellPermissionUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellPermissionControllerApi#updatePermission");
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
 **entityType** | **String**| entity-type |
 **permission** | **String**| permission |
 **tessellPermissionUpdatePayload** | [**TessellPermissionUpdatePayload**](TessellPermissionUpdatePayload.md)|  | [optional]

### Return type

[**TessellPermissionDTO**](TessellPermissionDTO.md)

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

