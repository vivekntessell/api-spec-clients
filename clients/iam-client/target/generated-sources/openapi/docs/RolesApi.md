# RolesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createRole**](RolesApi.md#createRole) | **POST** /tessell-internal/iam/roles | Create a Role
[**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /tessell-internal/iam/roles/{entity-type}/{role-name} | Delete an Role
[**getRole**](RolesApi.md#getRole) | **GET** /tessell-internal/iam/roles/{entity-type}/{role-name} | Get details of an Role
[**getRoles**](RolesApi.md#getRoles) | **GET** /iam/roles | Get a list of Roles



## createRole

> TessellRoleResponse createRole(tessellCreateRolePayload)

Create a Role

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        RolesApi apiInstance = new RolesApi(defaultClient);
        TessellCreateRolePayload tessellCreateRolePayload = new TessellCreateRolePayload(); // TessellCreateRolePayload | 
        try {
            TessellRoleResponse result = apiInstance.createRole(tessellCreateRolePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#createRole");
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
 **tessellCreateRolePayload** | [**TessellCreateRolePayload**](TessellCreateRolePayload.md)|  | [optional]

### Return type

[**TessellRoleResponse**](TessellRoleResponse.md)

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


## deleteRole

> TessellApiStatus deleteRole(entityType, roleName, softDelete)

Delete an Role

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String roleName = "roleName_example"; // String | role-name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellApiStatus result = apiInstance.deleteRole(entityType, roleName, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#deleteRole");
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
 **roleName** | **String**| role-name |
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


## getRole

> TessellRoleResponse getRole(entityType, roleName)

Get details of an Role

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        String roleName = "roleName_example"; // String | role-name
        try {
            TessellRoleResponse result = apiInstance.getRole(entityType, roleName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRole");
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
 **roleName** | **String**| role-name |

### Return type

[**TessellRoleResponse**](TessellRoleResponse.md)

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


## getRoles

> TessellRoleApiResponse getRoles(entityType, pageSize, pageOffset, timeZone)

Get a list of Roles

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.RolesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        RolesApi apiInstance = new RolesApi(defaultClient);
        String entityType = "entityType_example"; // String | entity-type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellRoleApiResponse result = apiInstance.getRoles(entityType, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RolesApi#getRoles");
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
 **entityType** | **String**| entity-type | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellRoleApiResponse**](TessellRoleApiResponse.md)

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

