# TessellServiceAclControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPrivilegedUsersForTessellService**](TessellServiceAclControllerApi.md#getPrivilegedUsersForTessellService) | **GET** /services/{id}/acls/eligible-users | Get list of all the users by privileges for the given DB Service
[**revokeTessellServiceAcls**](TessellServiceAclControllerApi.md#revokeTessellServiceAcls) | **DELETE** /services/{id}/acls | Revoke DB Service ACLs
[**updateTessellServiceAcls**](TessellServiceAclControllerApi.md#updateTessellServiceAcls) | **PATCH** /services/{id}/acls | Create or update the DB Service ACLs



## getPrivilegedUsersForTessellService

> List&lt;AclEligibleUser&gt; getPrivilegedUsersForTessellService(id, roles)

Get list of all the users by privileges for the given DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceAclControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceAclControllerApi apiInstance = new TessellServiceAclControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        List<String> roles = Arrays.asList(); // List<String> | Filter based on the privilege roles
        try {
            List<AclEligibleUser> result = apiInstance.getPrivilegedUsersForTessellService(id, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceAclControllerApi#getPrivilegedUsersForTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **roles** | [**List&lt;String&gt;**](String.md)| Filter based on the privilege roles | [optional]

### Return type

[**List&lt;AclEligibleUser&gt;**](AclEligibleUser.md)

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


## revokeTessellServiceAcls

> ApiStatus revokeTessellServiceAcls(id, aclRevokePayload)

Revoke DB Service ACLs

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceAclControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceAclControllerApi apiInstance = new TessellServiceAclControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeTessellServiceAcls(id, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceAclControllerApi#revokeTessellServiceAcls");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **aclRevokePayload** | [**AclRevokePayload**](AclRevokePayload.md)|  |

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
| **0** | API error response |  -  |


## updateTessellServiceAcls

> AclPayload updateTessellServiceAcls(id, aclPayload)

Create or update the DB Service ACLs

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceAclControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceAclControllerApi apiInstance = new TessellServiceAclControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.updateTessellServiceAcls(id, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceAclControllerApi#updateTessellServiceAcls");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **aclPayload** | [**AclPayload**](AclPayload.md)|  |

### Return type

[**AclPayload**](AclPayload.md)

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

