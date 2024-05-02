# TessellDbProfileAclsControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDBOptionsProfileAcls**](TessellDbProfileAclsControllerApi.md#createDBOptionsProfileAcls) | **PATCH** /databases/profiles/governance/options-profiles/{name}/acls | Create/Update ACLs of an Options Profile
[**createDBParameterProfileAcls**](TessellDbProfileAclsControllerApi.md#createDBParameterProfileAcls) | **PATCH** /databases/profiles/governance/parameter-profiles/{name}/acls | Create/Update ACLs of a Parameter Profile
[**getPrivilegedUserForDBOptionsProfile**](TessellDbProfileAclsControllerApi.md#getPrivilegedUserForDBOptionsProfile) | **GET** /databases/profiles/governance/options-profiles/{name}/acls/eligible-users | Get a list of all users along with role they are eligible on an Options Profile
[**getPrivilegedUserForDBParameterProfile**](TessellDbProfileAclsControllerApi.md#getPrivilegedUserForDBParameterProfile) | **GET** /databases/profiles/governance/parameter-profiles/{name}/acls/eligible-users | Get a list of all users along with role they are eligible on a Parameter Profile
[**revokeDBOptionsProfileAcls**](TessellDbProfileAclsControllerApi.md#revokeDBOptionsProfileAcls) | **DELETE** /databases/profiles/governance/options-profiles/{name}/acls | Revoke access of given users from an Options Profile
[**revokeDBParameterProfileAcls**](TessellDbProfileAclsControllerApi.md#revokeDBParameterProfileAcls) | **DELETE** /databases/profiles/governance/parameter-profiles/{name}/acls | Revoke access of given users from a Parameter Profile
[**updateOptionProfileStatus**](TessellDbProfileAclsControllerApi.md#updateOptionProfileStatus) | **PATCH** /databases/profiles/governance/options-profiles/{name}/{action} | Update Options Profile&#39;s Maturity Status
[**updateParameterProfileStatus**](TessellDbProfileAclsControllerApi.md#updateParameterProfileStatus) | **PATCH** /databases/profiles/governance/parameter-profiles/{name}/{action} | Update Parameter Profile&#39;s Maturity Status



## createDBOptionsProfileAcls

> AclPayload createDBOptionsProfileAcls(name, aclPayload)

Create/Update ACLs of an Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.createDBOptionsProfileAcls(name, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#createDBOptionsProfileAcls");
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
 **name** | **String**| Options Profile name |
 **aclPayload** | [**AclPayload**](AclPayload.md)|  | [optional]

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


## createDBParameterProfileAcls

> AclPayload createDBParameterProfileAcls(name, aclPayload)

Create/Update ACLs of a Parameter Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.createDBParameterProfileAcls(name, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#createDBParameterProfileAcls");
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
 **name** | **String**| Options Profile name |
 **aclPayload** | [**AclPayload**](AclPayload.md)|  | [optional]

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


## getPrivilegedUserForDBOptionsProfile

> List&lt;AclEligibleUser&gt; getPrivilegedUserForDBOptionsProfile(name, role)

Get a list of all users along with role they are eligible on an Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        String role = "Member"; // String | Name of role
        try {
            List<AclEligibleUser> result = apiInstance.getPrivilegedUserForDBOptionsProfile(name, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#getPrivilegedUserForDBOptionsProfile");
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
 **name** | **String**| Options Profile name |
 **role** | **String**| Name of role | [optional]

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


## getPrivilegedUserForDBParameterProfile

> List&lt;AclEligibleUser&gt; getPrivilegedUserForDBParameterProfile(name, role)

Get a list of all users along with role they are eligible on a Parameter Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Parameter Profile"; // String | Parameter Profile name
        String role = "Member"; // String | role
        try {
            List<AclEligibleUser> result = apiInstance.getPrivilegedUserForDBParameterProfile(name, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#getPrivilegedUserForDBParameterProfile");
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
 **name** | **String**| Parameter Profile name |
 **role** | **String**| role | [optional]

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


## revokeDBOptionsProfileAcls

> ApiStatus revokeDBOptionsProfileAcls(name, aclRevokePayload)

Revoke access of given users from an Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeDBOptionsProfileAcls(name, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#revokeDBOptionsProfileAcls");
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
 **name** | **String**| Options Profile name |
 **aclRevokePayload** | [**AclRevokePayload**](AclRevokePayload.md)|  | [optional]

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


## revokeDBParameterProfileAcls

> ApiStatus revokeDBParameterProfileAcls(name, aclRevokePayload)

Revoke access of given users from a Parameter Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeDBParameterProfileAcls(name, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#revokeDBParameterProfileAcls");
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
 **name** | **String**| Options Profile name |
 **aclRevokePayload** | [**AclRevokePayload**](AclRevokePayload.md)|  | [optional]

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


## updateOptionProfileStatus

> ApiStatus updateOptionProfileStatus(name, action)

Update Options Profile&#39;s Maturity Status

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        String action = "PUBLISH"; // String | Actions like DRAFT/PUBLISH/UNPUBLISH
        try {
            ApiStatus result = apiInstance.updateOptionProfileStatus(name, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#updateOptionProfileStatus");
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
 **name** | **String**| Options Profile name |
 **action** | **String**| Actions like DRAFT/PUBLISH/UNPUBLISH |

### Return type

[**ApiStatus**](ApiStatus.md)

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


## updateParameterProfileStatus

> ApiStatus updateParameterProfileStatus(name, action)

Update Parameter Profile&#39;s Maturity Status

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDbProfileAclsControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDbProfileAclsControllerApi apiInstance = new TessellDbProfileAclsControllerApi(defaultClient);
        String name = "Postgres Custom Parameter Profile"; // String | Parameter Profile name
        String action = "action_example"; // String | Actions like DRAFT/PUBLISH/UNPUBLISH
        try {
            ApiStatus result = apiInstance.updateParameterProfileStatus(name, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDbProfileAclsControllerApi#updateParameterProfileStatus");
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
 **name** | **String**| Parameter Profile name |
 **action** | **String**| Actions like DRAFT/PUBLISH/UNPUBLISH |

### Return type

[**ApiStatus**](ApiStatus.md)

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

