# TessellScriptApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createScriptAcls**](TessellScriptApi.md#createScriptAcls) | **PATCH** /scripts/{id}/acls | Create/update the Script ACLs
[**createScriptOpsRequest**](TessellScriptApi.md#createScriptOpsRequest) | **POST** /tessell-ops/scripts | Create a new Tessell Script
[**createScriptServiceView**](TessellScriptApi.md#createScriptServiceView) | **POST** /scripts | Request to create a new Script
[**createScriptVersionServiceView**](TessellScriptApi.md#createScriptVersionServiceView) | **POST** /scripts/{id}/versions | Create a new Tessell Script Version
[**deleteScript**](TessellScriptApi.md#deleteScript) | **DELETE** /tessell-ops/scripts/{id} | Delete a Tessell Script
[**deleteScriptServiceView**](TessellScriptApi.md#deleteScriptServiceView) | **DELETE** /scripts/{id} | Delete the specified Script
[**deleteScriptVersion**](TessellScriptApi.md#deleteScriptVersion) | **DELETE** /tessell-ops/scripts/{id}/versions/{version} | Delete a new Tessell Script Version
[**deleteScriptVersionServiceView**](TessellScriptApi.md#deleteScriptVersionServiceView) | **DELETE** /scripts/{id}/versions/{version} | Delete a new Tessell Script Version
[**downloadScriptContent**](TessellScriptApi.md#downloadScriptContent) | **GET** /tessell-ops/scripts/{id}/versions/{version}/content | Download Tessell Script Content
[**downloadScriptContentServiceView**](TessellScriptApi.md#downloadScriptContentServiceView) | **GET** /scripts/{id}/versions/{version}/content | Download Tessell Script Content
[**getEligibleUsersForScript**](TessellScriptApi.md#getEligibleUsersForScript) | **GET** /scripts/{id}/acls/eligible-users | Get list of all the users by privileges
[**getScript**](TessellScriptApi.md#getScript) | **GET** /tessell-ops/scripts/{id} | View Tessell Scripts by id
[**getScriptAcls**](TessellScriptApi.md#getScriptAcls) | **GET** /scripts/{id}/acls | Get list of ACLs for the Script
[**getScriptServiceView**](TessellScriptApi.md#getScriptServiceView) | **GET** /scripts/{id} | Get information about a Script
[**getScriptVersion**](TessellScriptApi.md#getScriptVersion) | **GET** /tessell-ops/scripts/{id}/versions/{version} | Get Tessell Script version Ops
[**getScriptVersionServiceView**](TessellScriptApi.md#getScriptVersionServiceView) | **GET** /scripts/{id}/versions/{version} | Get Tessell Script versions
[**getScriptVersions**](TessellScriptApi.md#getScriptVersions) | **GET** /tessell-ops/scripts/{id}/versions | Get a list of available versions for the Script Ops
[**getScriptVersionsServiceView**](TessellScriptApi.md#getScriptVersionsServiceView) | **GET** /scripts/{id}/versions | Get Tessell Script versions
[**getScripts**](TessellScriptApi.md#getScripts) | **GET** /tessell-ops/scripts | View a list of available Tessell Scripts
[**getScriptsServiceView**](TessellScriptApi.md#getScriptsServiceView) | **GET** /scripts | Get a list of Scripts
[**revokeScriptAcls**](TessellScriptApi.md#revokeScriptAcls) | **DELETE** /scripts/{id}/acls | Revoke Script ACLs
[**updateScript**](TessellScriptApi.md#updateScript) | **PATCH** /tessell-ops/scripts/{id} | Update a new Tessell Script
[**updateScriptMaturity**](TessellScriptApi.md#updateScriptMaturity) | **PATCH** /scripts/{id}/{action} | Update the Script&#39;s maturity status
[**updateScriptServiceView**](TessellScriptApi.md#updateScriptServiceView) | **PATCH** /scripts/{id} | Update the specified Script
[**updateScriptVersion**](TessellScriptApi.md#updateScriptVersion) | **PATCH** /tessell-ops/scripts/{id}/versions/{version} | Update a Tessell Script Version
[**uploadScriptContentOpsRequest**](TessellScriptApi.md#uploadScriptContentOpsRequest) | **POST** /tessell-ops/scripts/{id}/versions/{version}/content | Upload Tessell Script Version blob
[**uploadScriptContentServiceView**](TessellScriptApi.md#uploadScriptContentServiceView) | **POST** /scripts/{id}/versions/{version}/content | Upload Tessell Script Version blob



## createScriptAcls

> AclPayload createScriptAcls(id, aclPayload)

Create/update the Script ACLs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Script
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.createScriptAcls(id, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#createScriptAcls");
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
 **id** | [**UUID**](.md)| Id of the Script |
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


## createScriptOpsRequest

> TessellScriptDTO createScriptOpsRequest(createScriptOpsPayload)

Create a new Tessell Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        CreateScriptOpsPayload createScriptOpsPayload = new CreateScriptOpsPayload(); // CreateScriptOpsPayload | 
        try {
            TessellScriptDTO result = apiInstance.createScriptOpsRequest(createScriptOpsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#createScriptOpsRequest");
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
 **createScriptOpsPayload** | [**CreateScriptOpsPayload**](CreateScriptOpsPayload.md)|  |

### Return type

[**TessellScriptDTO**](TessellScriptDTO.md)

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


## createScriptServiceView

> TessellScriptServiceViewDTO createScriptServiceView(createScriptPayload)

Request to create a new Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        CreateScriptPayload createScriptPayload = new CreateScriptPayload(); // CreateScriptPayload | 
        try {
            TessellScriptServiceViewDTO result = apiInstance.createScriptServiceView(createScriptPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#createScriptServiceView");
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
 **createScriptPayload** | [**CreateScriptPayload**](CreateScriptPayload.md)|  |

### Return type

[**TessellScriptServiceViewDTO**](TessellScriptServiceViewDTO.md)

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


## createScriptVersionServiceView

> TessellScriptVersionServiceView createScriptVersionServiceView(id, createScriptVersionPayload)

Create a new Tessell Script Version

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        CreateScriptVersionPayload createScriptVersionPayload = new CreateScriptVersionPayload(); // CreateScriptVersionPayload | 
        try {
            TessellScriptVersionServiceView result = apiInstance.createScriptVersionServiceView(id, createScriptVersionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#createScriptVersionServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **createScriptVersionPayload** | [**CreateScriptVersionPayload**](CreateScriptVersionPayload.md)|  |

### Return type

[**TessellScriptVersionServiceView**](TessellScriptVersionServiceView.md)

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


## deleteScript

> ApiStatus deleteScript(id, softDelete)

Delete a Tessell Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | softDelete
        try {
            ApiStatus result = apiInstance.deleteScript(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#deleteScript");
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
 **id** | [**UUID**](.md)| id |
 **softDelete** | **Boolean**| softDelete | [optional] [default to true]

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


## deleteScriptServiceView

> ApiStatus deleteScriptServiceView(id)

Delete the specified Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Script
        try {
            ApiStatus result = apiInstance.deleteScriptServiceView(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#deleteScriptServiceView");
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
 **id** | [**UUID**](.md)| ID of the Script |

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
| **0** | API error response |  -  |


## deleteScriptVersion

> ApiStatus deleteScriptVersion(id, version, softDelete)

Delete a new Tessell Script Version

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        Boolean softDelete = true; // Boolean | Soft delete
        try {
            ApiStatus result = apiInstance.deleteScriptVersion(id, version, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#deleteScriptVersion");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **softDelete** | **Boolean**| Soft delete | [optional] [default to true]

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteScriptVersionServiceView

> ApiStatus deleteScriptVersionServiceView(id, version)

Delete a new Tessell Script Version

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        try {
            ApiStatus result = apiInstance.deleteScriptVersionServiceView(id, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#deleteScriptVersionServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## downloadScriptContent

> byte[] downloadScriptContent(id, version)

Download Tessell Script Content

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        try {
            byte[] result = apiInstance.downloadScriptContent(id, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#downloadScriptContent");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## downloadScriptContentServiceView

> byte[] downloadScriptContentServiceView(id, version)

Download Tessell Script Content

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        try {
            byte[] result = apiInstance.downloadScriptContentServiceView(id, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#downloadScriptContentServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## getEligibleUsersForScript

> List&lt;AclEligibleUser&gt; getEligibleUsersForScript(id, roles)

Get list of all the users by privileges

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Script
        List<String> roles = Arrays.asList(); // List<String> | roles
        try {
            List<AclEligibleUser> result = apiInstance.getEligibleUsersForScript(id, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getEligibleUsersForScript");
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
 **id** | [**UUID**](.md)| Id of the Script |
 **roles** | [**List&lt;String&gt;**](String.md)| roles | [optional]

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


## getScript

> TessellScriptDTO getScript(id, loadVersions, loadAcls, timeZone)

View Tessell Scripts by id

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Script id
        Boolean loadVersions = false; // Boolean | load versions
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellScriptDTO result = apiInstance.getScript(id, loadVersions, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScript");
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
 **id** | [**UUID**](.md)| Script id |
 **loadVersions** | **Boolean**| load versions | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellScriptDTO**](TessellScriptDTO.md)

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


## getScriptAcls

> EntityAclSharingInfo getScriptAcls(id)

Get list of ACLs for the Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Script
        try {
            EntityAclSharingInfo result = apiInstance.getScriptAcls(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptAcls");
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
 **id** | [**UUID**](.md)| Id of the Script |

### Return type

[**EntityAclSharingInfo**](EntityAclSharingInfo.md)

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


## getScriptServiceView

> TessellScriptServiceViewDTO getScriptServiceView(id, loadVersions, loadAcls, timeZone)

Get information about a Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Script
        Boolean loadVersions = true; // Boolean | Specify if the versions are to be fetched for the script
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellScriptServiceViewDTO result = apiInstance.getScriptServiceView(id, loadVersions, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptServiceView");
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
 **id** | [**UUID**](.md)| ID of the Script |
 **loadVersions** | **Boolean**| Specify if the versions are to be fetched for the script | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellScriptServiceViewDTO**](TessellScriptServiceViewDTO.md)

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


## getScriptVersion

> TessellScriptVersionDTO getScriptVersion(id, version, pageSize, pageOffset, timeZone)

Get Tessell Script version Ops

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellScriptVersionDTO result = apiInstance.getScriptVersion(id, version, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptVersion");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellScriptVersionDTO**](TessellScriptVersionDTO.md)

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


## getScriptVersionServiceView

> TessellScriptVersionServiceView getScriptVersionServiceView(id, version, timeZone)

Get Tessell Script versions

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellScriptVersionServiceView result = apiInstance.getScriptVersionServiceView(id, version, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptVersionServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellScriptVersionServiceView**](TessellScriptVersionServiceView.md)

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


## getScriptVersions

> GetScriptVersionsApiResponse getScriptVersions(id, version, pageSize, pageOffset, timeZone)

Get a list of available versions for the Script Ops

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Script version
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetScriptVersionsApiResponse result = apiInstance.getScriptVersions(id, version, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptVersions");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Script version | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetScriptVersionsApiResponse**](GetScriptVersionsApiResponse.md)

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


## getScriptVersionsServiceView

> GetScriptVersionsServiceApiResponse getScriptVersionsServiceView(id, version, pageSize, pageOffset, timeZone)

Get Tessell Script versions

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Script version
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetScriptVersionsServiceApiResponse result = apiInstance.getScriptVersionsServiceView(id, version, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptVersionsServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Script version | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetScriptVersionsServiceApiResponse**](GetScriptVersionsServiceApiResponse.md)

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


## getScripts

> GetScriptsApiResponse getScripts(name, status, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone)

View a list of available Tessell Scripts

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        String name = ""; // String | name
        String status = "status_example"; // String | status
        List<DatabaseEngineType> engineType = Arrays.asList(); // List<DatabaseEngineType> | engine-type
        List<ScriptType> scriptType = Arrays.asList(); // List<ScriptType> | script type
        Boolean loadVersions = false; // Boolean | load script versions
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetScriptsApiResponse result = apiInstance.getScripts(name, status, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScripts");
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
 **name** | **String**| name | [optional] [default to ]
 **status** | **String**| status | [optional]
 **engineType** | [**List&lt;DatabaseEngineType&gt;**](DatabaseEngineType.md)| engine-type | [optional]
 **scriptType** | [**List&lt;ScriptType&gt;**](ScriptType.md)| script type | [optional]
 **loadVersions** | **Boolean**| load script versions | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetScriptsApiResponse**](GetScriptsApiResponse.md)

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


## getScriptsServiceView

> GetScriptsServiceApiResponse getScriptsServiceView(name, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone, owners)

Get a list of Scripts

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        String name = "name_example"; // String | Filter result based on the specified name
        List<DatabaseEngineType> engineType = Arrays.asList(); // List<DatabaseEngineType> | Filter result based on the specified database engine type
        List<ScriptType> scriptType = Arrays.asList(); // List<ScriptType> | Filter result based on the specified script types
        Boolean loadVersions = true; // Boolean | Specify if the versions are to be fetched for the script
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        try {
            GetScriptsServiceApiResponse result = apiInstance.getScriptsServiceView(name, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone, owners);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#getScriptsServiceView");
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
 **name** | **String**| Filter result based on the specified name | [optional]
 **engineType** | [**List&lt;DatabaseEngineType&gt;**](DatabaseEngineType.md)| Filter result based on the specified database engine type | [optional]
 **scriptType** | [**List&lt;ScriptType&gt;**](ScriptType.md)| Filter result based on the specified script types | [optional]
 **loadVersions** | **Boolean**| Specify if the versions are to be fetched for the script | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]

### Return type

[**GetScriptsServiceApiResponse**](GetScriptsServiceApiResponse.md)

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


## revokeScriptAcls

> ApiStatus revokeScriptAcls(id, aclRevokePayload)

Revoke Script ACLs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Script
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeScriptAcls(id, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#revokeScriptAcls");
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
 **id** | [**UUID**](.md)| Id of the Script |
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


## updateScript

> TessellScriptDTO updateScript(id, tessellScriptDTO)

Update a new Tessell Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Script id
        TessellScriptDTO tessellScriptDTO = new TessellScriptDTO(); // TessellScriptDTO | 
        try {
            TessellScriptDTO result = apiInstance.updateScript(id, tessellScriptDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#updateScript");
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
 **id** | [**UUID**](.md)| Script id |
 **tessellScriptDTO** | [**TessellScriptDTO**](TessellScriptDTO.md)|  |

### Return type

[**TessellScriptDTO**](TessellScriptDTO.md)

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


## updateScriptMaturity

> ApiStatus updateScriptMaturity(id, action)

Update the Script&#39;s maturity status

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Script
        String action = "action_example"; // String | Maturity status for the Script, which could be any of - DRAFT, PUBLISH, or UNPUBLISH
        try {
            ApiStatus result = apiInstance.updateScriptMaturity(id, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#updateScriptMaturity");
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
 **id** | [**UUID**](.md)| ID of the Script |
 **action** | **String**| Maturity status for the Script, which could be any of - DRAFT, PUBLISH, or UNPUBLISH |

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


## updateScriptServiceView

> TessellScriptServiceViewDTO updateScriptServiceView(id, updateTessellScriptServicePayload)

Update the specified Script

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Script
        UpdateTessellScriptServicePayload updateTessellScriptServicePayload = new UpdateTessellScriptServicePayload(); // UpdateTessellScriptServicePayload | 
        try {
            TessellScriptServiceViewDTO result = apiInstance.updateScriptServiceView(id, updateTessellScriptServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#updateScriptServiceView");
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
 **id** | [**UUID**](.md)| ID of the Script |
 **updateTessellScriptServicePayload** | [**UpdateTessellScriptServicePayload**](UpdateTessellScriptServicePayload.md)|  |

### Return type

[**TessellScriptServiceViewDTO**](TessellScriptServiceViewDTO.md)

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


## updateScriptVersion

> TessellScriptVersionDTO updateScriptVersion(id, version, tessellScriptVersionDTO)

Update a Tessell Script Version

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        TessellScriptVersionDTO tessellScriptVersionDTO = new TessellScriptVersionDTO(); // TessellScriptVersionDTO | 
        try {
            TessellScriptVersionDTO result = apiInstance.updateScriptVersion(id, version, tessellScriptVersionDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#updateScriptVersion");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **tessellScriptVersionDTO** | [**TessellScriptVersionDTO**](TessellScriptVersionDTO.md)|  |

### Return type

[**TessellScriptVersionDTO**](TessellScriptVersionDTO.md)

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


## uploadScriptContentOpsRequest

> TessellScriptVersionDTO uploadScriptContentOpsRequest(id, version, createScriptVersionOpsPayload)

Upload Tessell Script Version blob

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        CreateScriptVersionOpsPayload createScriptVersionOpsPayload = new CreateScriptVersionOpsPayload(); // CreateScriptVersionOpsPayload | 
        try {
            TessellScriptVersionDTO result = apiInstance.uploadScriptContentOpsRequest(id, version, createScriptVersionOpsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#uploadScriptContentOpsRequest");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **createScriptVersionOpsPayload** | [**CreateScriptVersionOpsPayload**](CreateScriptVersionOpsPayload.md)|  |

### Return type

[**TessellScriptVersionDTO**](TessellScriptVersionDTO.md)

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


## uploadScriptContentServiceView

> TessellScriptVersionServiceView uploadScriptContentServiceView(id, version, blob)

Upload Tessell Script Version blob

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.TessellScriptApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        TessellScriptApi apiInstance = new TessellScriptApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Script
        String version = "version_example"; // String | Version of the Tessell Script
        File blob = new File("/path/to/file"); // File | File content
        try {
            TessellScriptVersionServiceView result = apiInstance.uploadScriptContentServiceView(id, version, blob);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellScriptApi#uploadScriptContentServiceView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Script |
 **version** | **String**| Version of the Tessell Script |
 **blob** | **File**| File content | [optional]

### Return type

[**TessellScriptVersionServiceView**](TessellScriptVersionServiceView.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **201** | Created |  -  |
| **0** | API error response |  -  |

