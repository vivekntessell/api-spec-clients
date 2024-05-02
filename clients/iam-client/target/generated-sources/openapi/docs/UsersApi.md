# UsersApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acceptInvite**](UsersApi.md#acceptInvite) | **POST** /iam/users/accept-invite | Accept invite
[**activateUserInternal**](UsersApi.md#activateUserInternal) | **POST** /tessell-internal/iam/users/activate | First time activate user
[**adminUpdateUser**](UsersApi.md#adminUpdateUser) | **PATCH** /iam/users/{email-id} | Update a user
[**bulkDeleteUsersOfTenant**](UsersApi.md#bulkDeleteUsersOfTenant) | **DELETE** /tessell-ops/iam/users/bulk-delete | Bulk delete all users of tenant
[**changePassword**](UsersApi.md#changePassword) | **POST** /iam/users/change-password | Change current user&#39;s password
[**changeStatus**](UsersApi.md#changeStatus) | **POST** /iam/users/{email-id}/change-status | Change status of a user
[**checkFeatureEnabled**](UsersApi.md#checkFeatureEnabled) | **GET** /iam/tessell-internal/users/{app-family}/{app}/check-feature-enabled/{feature-name} | Check if a feature is enabled and is active
[**checkPrivileges**](UsersApi.md#checkPrivileges) | **POST** /iam/tessell-internal/users/check-privileges | Validate if user has a given privilege or not
[**createUserInternal**](UsersApi.md#createUserInternal) | **POST** /tessell-internal/iam/users/create | Create User in non Active state
[**delete**](UsersApi.md#delete) | **DELETE** /iam/users/{email-id} | Delete a user
[**deleteAllUsersInTenantInternal**](UsersApi.md#deleteAllUsersInTenantInternal) | **DELETE** /tessell-internal/iam/users | Delete all the users of a tenant (Internal API)
[**deleteUser**](UsersApi.md#deleteUser) | **DELETE** /tessell-internal/iam/users/{email-id} | Delete a user (Internal API)
[**forceResetPassword**](UsersApi.md#forceResetPassword) | **POST** /iam/users/force-reset-password | Forcefully reset password for a user
[**forgotPassword**](UsersApi.md#forgotPassword) | **POST** /iam/users/forgot-password/{email-id} | Forgot Password
[**getDetails**](UsersApi.md#getDetails) | **POST** /iam/tessell-internal/users/details | Given a set of user ids, return the corresponding user details
[**getIds**](UsersApi.md#getIds) | **POST** /iam/tessell-internal/users/ids | Given a set of email ids, return the corresponding user ids
[**getStatusOfBulkDeleteUsersOfTenant**](UsersApi.md#getStatusOfBulkDeleteUsersOfTenant) | **POST** /tessell-ops/iam/users/bulk-delete | Get status of bulk deletion of users
[**getUsers**](UsersApi.md#getUsers) | **GET** /iam/users | Get list of all the users
[**getUsersByPrivileges**](UsersApi.md#getUsersByPrivileges) | **POST** /tessell-internal/iam/users | Get list of all the users by privileges
[**getUsersInternal**](UsersApi.md#getUsersInternal) | **GET** /tessell-internal/iam/users | Get list of all the users internal API
[**internalWhoami**](UsersApi.md#internalWhoami) | **GET** /tessell-internal/iam/users/whoami | Get details of a user for internal consumption
[**inviteUser**](UsersApi.md#inviteUser) | **POST** /iam/users/invite-user | Create for a new user
[**login**](UsersApi.md#login) | **POST** /iam/users/login | Login a user
[**logout**](UsersApi.md#logout) | **POST** /iam/users/logout | Logout a user
[**refreshToken**](UsersApi.md#refreshToken) | **POST** /iam/users/refresh-token | Acquire new access-token using refresh-token
[**resetPassword**](UsersApi.md#resetPassword) | **POST** /iam/users/reset-password | Reset password for a user
[**resetPasswordOnExpiry**](UsersApi.md#resetPasswordOnExpiry) | **POST** /iam/users/reset-password-on-expiry | Reset password for a user when password has been expired
[**updateUserProfile**](UsersApi.md#updateUserProfile) | **PATCH** /iam/users/profile | Update self profile
[**validateToken**](UsersApi.md#validateToken) | **GET** /iam/tessell-internal/users/validate-token/{token-id} | Validate if a token is valid or not
[**whoami**](UsersApi.md#whoami) | **GET** /iam/users/whoami | Get details of a user



## acceptInvite

> TessellApiStatus acceptInvite(tessellAcceptInviteUserPayload)

Accept invite

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellAcceptInviteUserPayload tessellAcceptInviteUserPayload = new TessellAcceptInviteUserPayload(); // TessellAcceptInviteUserPayload | 
        try {
            TessellApiStatus result = apiInstance.acceptInvite(tessellAcceptInviteUserPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#acceptInvite");
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
 **tessellAcceptInviteUserPayload** | [**TessellAcceptInviteUserPayload**](TessellAcceptInviteUserPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## activateUserInternal

> TessellApiStatus activateUserInternal(tenantId, tessellActivateUserInternalPayload)

First time activate user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellActivateUserInternalPayload tessellActivateUserInternalPayload = new TessellActivateUserInternalPayload(); // TessellActivateUserInternalPayload | 
        try {
            TessellApiStatus result = apiInstance.activateUserInternal(tenantId, tessellActivateUserInternalPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#activateUserInternal");
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
 **tenantId** | **String**| Id of the Tenant |
 **tessellActivateUserInternalPayload** | [**TessellActivateUserInternalPayload**](TessellActivateUserInternalPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## adminUpdateUser

> TessellApiStatus adminUpdateUser(tenantId, emailId, tessellUpdateUserPayload)

Update a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String emailId = "emailId_example"; // String | emailId
        TessellUpdateUserPayload tessellUpdateUserPayload = new TessellUpdateUserPayload(); // TessellUpdateUserPayload | 
        try {
            TessellApiStatus result = apiInstance.adminUpdateUser(tenantId, emailId, tessellUpdateUserPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#adminUpdateUser");
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
 **tenantId** | **String**| Id of the Tenant |
 **emailId** | **String**| emailId |
 **tessellUpdateUserPayload** | [**TessellUpdateUserPayload**](TessellUpdateUserPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## bulkDeleteUsersOfTenant

> TessellResourceBulkDeleteResponseOps bulkDeleteUsersOfTenant(tessellResourceBulkDeletePayloadOps)

Bulk delete all users of tenant

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteUsersOfTenant(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#bulkDeleteUsersOfTenant");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## changePassword

> TessellApiStatus changePassword(tessellChangePasswordPayload)

Change current user&#39;s password

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellChangePasswordPayload tessellChangePasswordPayload = new TessellChangePasswordPayload(); // TessellChangePasswordPayload | 
        try {
            TessellApiStatus result = apiInstance.changePassword(tessellChangePasswordPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#changePassword");
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
 **tessellChangePasswordPayload** | [**TessellChangePasswordPayload**](TessellChangePasswordPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## changeStatus

> TessellApiStatus changeStatus(emailId, tessellChangeStatusPayload)

Change status of a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String emailId = "emailId_example"; // String | email-id
        TessellChangeStatusPayload tessellChangeStatusPayload = new TessellChangeStatusPayload(); // TessellChangeStatusPayload | 
        try {
            TessellApiStatus result = apiInstance.changeStatus(emailId, tessellChangeStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#changeStatus");
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
 **emailId** | **String**| email-id |
 **tessellChangeStatusPayload** | [**TessellChangeStatusPayload**](TessellChangeStatusPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## checkFeatureEnabled

> TessellFeatureStatusResponse checkFeatureEnabled(tenantId, appFamily, app, featureName)

Check if a feature is enabled and is active

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String appFamily = "appFamily_example"; // String | app family name
        String app = "app_example"; // String | app name
        String featureName = "featureName_example"; // String | feature name
        try {
            TessellFeatureStatusResponse result = apiInstance.checkFeatureEnabled(tenantId, appFamily, app, featureName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#checkFeatureEnabled");
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
 **appFamily** | **String**| app family name |
 **app** | **String**| app name |
 **featureName** | **String**| feature name |

### Return type

[**TessellFeatureStatusResponse**](TessellFeatureStatusResponse.md)

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


## checkPrivileges

> Map&lt;String, Boolean&gt; checkPrivileges(tenantId, requestBody)

Validate if user has a given privilege or not

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            Map<String, Boolean> result = apiInstance.checkPrivileges(tenantId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#checkPrivileges");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

**Map&lt;String, Boolean&gt;**

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


## createUserInternal

> TessellApiStatus createUserInternal(tenantId, tessellCreateUserInternalPayload)

Create User in non Active state

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellCreateUserInternalPayload tessellCreateUserInternalPayload = new TessellCreateUserInternalPayload(); // TessellCreateUserInternalPayload | 
        try {
            TessellApiStatus result = apiInstance.createUserInternal(tenantId, tessellCreateUserInternalPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#createUserInternal");
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
 **tenantId** | **String**| Id of the Tenant |
 **tessellCreateUserInternalPayload** | [**TessellCreateUserInternalPayload**](TessellCreateUserInternalPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## delete

> TessellApiStatus delete(emailId, tenantId)

Delete a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String emailId = "emailId_example"; // String | email-id
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellApiStatus result = apiInstance.delete(emailId, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#delete");
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
 **emailId** | **String**| email-id |
 **tenantId** | **String**| Id of the Tenant |

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


## deleteAllUsersInTenantInternal

> TessellApiStatus deleteAllUsersInTenantInternal(tenantId)

Delete all the users of a tenant (Internal API)

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | TenantId for which all the users to be deleted
        try {
            TessellApiStatus result = apiInstance.deleteAllUsersInTenantInternal(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteAllUsersInTenantInternal");
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
 **tenantId** | **String**| TenantId for which all the users to be deleted |

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
| **0** | API error response |  -  |


## deleteUser

> TessellApiStatus deleteUser(emailId, tenantId)

Delete a user (Internal API)

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String emailId = "emailId_example"; // String | EmailId of the user to be deleted
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellApiStatus result = apiInstance.deleteUser(emailId, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#deleteUser");
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
 **emailId** | **String**| EmailId of the user to be deleted |
 **tenantId** | **String**| Id of the Tenant |

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
| **0** | API error response |  -  |


## forceResetPassword

> TessellApiStatus forceResetPassword(tessellForceResetPasswordPayload)

Forcefully reset password for a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellForceResetPasswordPayload tessellForceResetPasswordPayload = new TessellForceResetPasswordPayload(); // TessellForceResetPasswordPayload | 
        try {
            TessellApiStatus result = apiInstance.forceResetPassword(tessellForceResetPasswordPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#forceResetPassword");
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
 **tessellForceResetPasswordPayload** | [**TessellForceResetPasswordPayload**](TessellForceResetPasswordPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## forgotPassword

> TessellApiStatus forgotPassword(emailId)

Forgot Password

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String emailId = "emailId_example"; // String | email-id
        try {
            TessellApiStatus result = apiInstance.forgotPassword(emailId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#forgotPassword");
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
 **emailId** | **String**| email-id |

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
| **0** | API error response |  -  |


## getDetails

> List&lt;TessellUserDetails&gt; getDetails(tenantId, UUID)

Given a set of user ids, return the corresponding user details

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Set<UUID> UUID = Arrays.asList(); // Set<UUID> | 
        try {
            List<TessellUserDetails> result = apiInstance.getDetails(tenantId, UUID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getDetails");
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
 **UUID** | [**Set&lt;UUID&gt;**](UUID.md)|  | [optional]

### Return type

[**List&lt;TessellUserDetails&gt;**](TessellUserDetails.md)

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


## getIds

> List&lt;TessellEmailToUserIdMapping&gt; getIds(tenantId, requestBody)

Given a set of email ids, return the corresponding user ids

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Set<String> requestBody = Arrays.asList(); // Set<String> | 
        try {
            List<TessellEmailToUserIdMapping> result = apiInstance.getIds(tenantId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getIds");
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
 **requestBody** | [**Set&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**List&lt;TessellEmailToUserIdMapping&gt;**](TessellEmailToUserIdMapping.md)

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


## getStatusOfBulkDeleteUsersOfTenant

> TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteUsersOfTenant(tessellResourceBulkDeletePayloadOps)

Get status of bulk deletion of users

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.getStatusOfBulkDeleteUsersOfTenant(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getStatusOfBulkDeleteUsersOfTenant");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## getUsers

> TessellIamApiResponse getUsers(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType)

Get list of all the users

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        List<String> personas = Arrays.asList(); // List<String> | Personas that users are belonging to
        Boolean loadApps = false; // Boolean | Flag to include/exclude Application details in response
        Boolean loadPersonas = false; // Boolean | Flag to include/exclude Persona details in response
        Boolean loadSubscriptions = false; // Boolean | Flag to include/exclude Subscriptions details in response.
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        TessellConsumerType consumerType = TessellConsumerType.fromValue("OPS"); // TessellConsumerType | consumer-type ( Deprecated )
        try {
            TessellIamApiResponse result = apiInstance.getUsers(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
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
 **tenantId** | **String**| Id of the Tenant |
 **personas** | [**List&lt;String&gt;**](String.md)| Personas that users are belonging to | [optional]
 **loadApps** | **Boolean**| Flag to include/exclude Application details in response | [optional] [default to false]
 **loadPersonas** | **Boolean**| Flag to include/exclude Persona details in response | [optional] [default to false]
 **loadSubscriptions** | **Boolean**| Flag to include/exclude Subscriptions details in response. | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **consumerType** | [**TessellConsumerType**](.md)| consumer-type ( Deprecated ) | [optional] [enum: OPS, SERVICE]

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


## getUsersByPrivileges

> TessellIamApiResponse getUsersByPrivileges(tenantId, requestBody)

Get list of all the users by privileges

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        List<String> requestBody = Arrays.asList(); // List<String> | 
        try {
            TessellIamApiResponse result = apiInstance.getUsersByPrivileges(tenantId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersByPrivileges");
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
 **requestBody** | [**List&lt;String&gt;**](String.md)|  | [optional]

### Return type

[**TessellIamApiResponse**](TessellIamApiResponse.md)

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


## getUsersInternal

> TessellIamApiResponse getUsersInternal(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType)

Get list of all the users internal API

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        List<String> personas = Arrays.asList(); // List<String> | Personas that users are belonging to
        Boolean loadApps = false; // Boolean | Flag to include/exclude Application details in response.
        Boolean loadPersonas = false; // Boolean | Flag to include/exclude Persona details in response.
        Boolean loadSubscriptions = false; // Boolean | Flag to include/exclude Subscriptions details in response.
        Integer pageSize = 10; // Integer | page-size (paging is not implemented yet)
        Integer pageOffset = 0; // Integer | page-offset (paging is not implemented yet)
        String timeZone = "timeZone_example"; // String | time-zone
        TessellConsumerType consumerType = TessellConsumerType.fromValue("OPS"); // TessellConsumerType | consumer-type
        try {
            TessellIamApiResponse result = apiInstance.getUsersInternal(tenantId, personas, loadApps, loadPersonas, loadSubscriptions, pageSize, pageOffset, timeZone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersInternal");
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
 **personas** | [**List&lt;String&gt;**](String.md)| Personas that users are belonging to | [optional]
 **loadApps** | **Boolean**| Flag to include/exclude Application details in response. | [optional] [default to false]
 **loadPersonas** | **Boolean**| Flag to include/exclude Persona details in response. | [optional] [default to false]
 **loadSubscriptions** | **Boolean**| Flag to include/exclude Subscriptions details in response. | [optional] [default to false]
 **pageSize** | **Integer**| page-size (paging is not implemented yet) | [optional] [default to 10]
 **pageOffset** | **Integer**| page-offset (paging is not implemented yet) | [optional] [default to 0]
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


## internalWhoami

> TessellUserDetails internalWhoami(tenantId)

Get details of a user for internal consumption

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellUserDetails result = apiInstance.internalWhoami(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#internalWhoami");
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
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**TessellUserDetails**](TessellUserDetails.md)

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


## inviteUser

> TessellApiStatus inviteUser(tenantId, tessellInviteUserPayload)

Create for a new user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellInviteUserPayload tessellInviteUserPayload = new TessellInviteUserPayload(); // TessellInviteUserPayload | 
        try {
            TessellApiStatus result = apiInstance.inviteUser(tenantId, tessellInviteUserPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#inviteUser");
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
 **tenantId** | **String**| Id of the Tenant |
 **tessellInviteUserPayload** | [**TessellInviteUserPayload**](TessellInviteUserPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## login

> TessellLoginUserResponse login(tessellLoginUserPayload)

Login a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellLoginUserPayload tessellLoginUserPayload = new TessellLoginUserPayload(); // TessellLoginUserPayload | 
        try {
            TessellLoginUserResponse result = apiInstance.login(tessellLoginUserPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#login");
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
 **tessellLoginUserPayload** | [**TessellLoginUserPayload**](TessellLoginUserPayload.md)|  | [optional]

### Return type

[**TessellLoginUserResponse**](TessellLoginUserResponse.md)

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


## logout

> TessellApiStatus logout()

Logout a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        try {
            TessellApiStatus result = apiInstance.logout();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#logout");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## refreshToken

> TessellRefreshTokenResponse refreshToken(tenantId)

Acquire new access-token using refresh-token

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellRefreshTokenResponse result = apiInstance.refreshToken(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#refreshToken");
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
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**TessellRefreshTokenResponse**](TessellRefreshTokenResponse.md)

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


## resetPassword

> TessellApiStatus resetPassword(tessellResetPasswordPayload)

Reset password for a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellResetPasswordPayload tessellResetPasswordPayload = new TessellResetPasswordPayload(); // TessellResetPasswordPayload | 
        try {
            TessellApiStatus result = apiInstance.resetPassword(tessellResetPasswordPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#resetPassword");
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
 **tessellResetPasswordPayload** | [**TessellResetPasswordPayload**](TessellResetPasswordPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## resetPasswordOnExpiry

> TessellApiStatus resetPasswordOnExpiry(tessellResetPasswordOnExpiryPayload)

Reset password for a user when password has been expired

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellResetPasswordOnExpiryPayload tessellResetPasswordOnExpiryPayload = new TessellResetPasswordOnExpiryPayload(); // TessellResetPasswordOnExpiryPayload | 
        try {
            TessellApiStatus result = apiInstance.resetPasswordOnExpiry(tessellResetPasswordOnExpiryPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#resetPasswordOnExpiry");
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
 **tessellResetPasswordOnExpiryPayload** | [**TessellResetPasswordOnExpiryPayload**](TessellResetPasswordOnExpiryPayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## updateUserProfile

> TessellApiStatus updateUserProfile(tessellUpdateUserProfilePayload)

Update self profile

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        TessellUpdateUserProfilePayload tessellUpdateUserProfilePayload = new TessellUpdateUserProfilePayload(); // TessellUpdateUserProfilePayload | 
        try {
            TessellApiStatus result = apiInstance.updateUserProfile(tessellUpdateUserProfilePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUserProfile");
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
 **tessellUpdateUserProfilePayload** | [**TessellUpdateUserProfilePayload**](TessellUpdateUserProfilePayload.md)|  | [optional]

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## validateToken

> Boolean validateToken(tokenId)

Validate if a token is valid or not

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String tokenId = "tokenId_example"; // String | token-id
        try {
            Boolean result = apiInstance.validateToken(tokenId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#validateToken");
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
 **tokenId** | **String**| token-id |

### Return type

**Boolean**

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


## whoami

> TessellUserServiceConsumerDTO whoami()

Get details of a user

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        UsersApi apiInstance = new UsersApi(defaultClient);
        try {
            TessellUserServiceConsumerDTO result = apiInstance.whoami();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#whoami");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**TessellUserServiceConsumerDTO**](TessellUserServiceConsumerDTO.md)

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

