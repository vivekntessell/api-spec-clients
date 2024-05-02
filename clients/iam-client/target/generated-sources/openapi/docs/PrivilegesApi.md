# PrivilegesApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPrivilege**](PrivilegesApi.md#createPrivilege) | **POST** /iam/i/privileges | Create a privilege
[**deletePrivilege**](PrivilegesApi.md#deletePrivilege) | **DELETE** /iam/i/privileges/{name} | Delete a privilege
[**getPrivilege**](PrivilegesApi.md#getPrivilege) | **GET** /tessell-internal/iam/privileges/{name} | Get details of an privilege
[**getPrivileges**](PrivilegesApi.md#getPrivileges) | **GET** /tessell-internal/iam/privileges | Get list of privileges
[**updatePrivilege**](PrivilegesApi.md#updatePrivilege) | **PATCH** /iam/i/privileges/{name} | Update a privilege



## createPrivilege

> TessellPrivilegeDTO createPrivilege(tessellPrivilegeCreatePayload)

Create a privilege

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PrivilegesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PrivilegesApi apiInstance = new PrivilegesApi(defaultClient);
        TessellPrivilegeCreatePayload tessellPrivilegeCreatePayload = new TessellPrivilegeCreatePayload(); // TessellPrivilegeCreatePayload | 
        try {
            TessellPrivilegeDTO result = apiInstance.createPrivilege(tessellPrivilegeCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivilegesApi#createPrivilege");
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
 **tessellPrivilegeCreatePayload** | [**TessellPrivilegeCreatePayload**](TessellPrivilegeCreatePayload.md)|  | [optional]

### Return type

[**TessellPrivilegeDTO**](TessellPrivilegeDTO.md)

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


## deletePrivilege

> TessellApiStatus deletePrivilege(name, softDelete)

Delete a privilege

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PrivilegesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PrivilegesApi apiInstance = new PrivilegesApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean softDelete = true; // Boolean | softDelete
        try {
            TessellApiStatus result = apiInstance.deletePrivilege(name, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivilegesApi#deletePrivilege");
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


## getPrivilege

> TessellPrivilegeDTO getPrivilege(name)

Get details of an privilege

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PrivilegesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PrivilegesApi apiInstance = new PrivilegesApi(defaultClient);
        String name = "name_example"; // String | name
        try {
            TessellPrivilegeDTO result = apiInstance.getPrivilege(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivilegesApi#getPrivilege");
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

[**TessellPrivilegeDTO**](TessellPrivilegeDTO.md)

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


## getPrivileges

> TessellIamApiResponse getPrivileges(pageSize, pageOffset, timeZone, consumerType)

Get list of privileges

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PrivilegesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PrivilegesApi apiInstance = new PrivilegesApi(defaultClient);
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        TessellConsumerType consumerType = TessellConsumerType.fromValue("OPS"); // TessellConsumerType | consumer-type
        try {
            TessellIamApiResponse result = apiInstance.getPrivileges(pageSize, pageOffset, timeZone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivilegesApi#getPrivileges");
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
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]
 **consumerType** | [**TessellConsumerType**](.md)| consumer-type | [optional] [enum: OPS, SERVICE]

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


## updatePrivilege

> TessellPrivilegeDTO updatePrivilege(name, tessellPrivilegeUpdatePayload)

Update a privilege

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PrivilegesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PrivilegesApi apiInstance = new PrivilegesApi(defaultClient);
        String name = "name_example"; // String | name
        TessellPrivilegeUpdatePayload tessellPrivilegeUpdatePayload = new TessellPrivilegeUpdatePayload(); // TessellPrivilegeUpdatePayload | 
        try {
            TessellPrivilegeDTO result = apiInstance.updatePrivilege(name, tessellPrivilegeUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PrivilegesApi#updatePrivilege");
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
 **tessellPrivilegeUpdatePayload** | [**TessellPrivilegeUpdatePayload**](TessellPrivilegeUpdatePayload.md)|  | [optional]

### Return type

[**TessellPrivilegeDTO**](TessellPrivilegeDTO.md)

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

