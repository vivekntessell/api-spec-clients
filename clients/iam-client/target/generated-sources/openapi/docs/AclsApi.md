# AclsApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteAcls**](AclsApi.md#bulkDeleteAcls) | **DELETE** /tessell-ops/iam/acls/bulk-delete | Bulk delete ACLs
[**checkAclForRecipient**](AclsApi.md#checkAclForRecipient) | **GET** /iam/tessell-internal/acls/check-acl/{entity-type}/{entity-id}/{acl-name}/recipients/{recipient-type}/{recipient-id} | Check if an ACL exists or not
[**checkAclPermission**](AclsApi.md#checkAclPermission) | **GET** /iam/tessell-internal/acls/{entity-type}/{entity-id}/check-permission/{permission} | Check if an ACL permission exists or not
[**deleteAcls**](AclsApi.md#deleteAcls) | **DELETE** /iam/tessell-internal/acls/{entity-type} | Delete an Acl for an entity type
[**getAclsWithAclName**](AclsApi.md#getAclsWithAclName) | **GET** /iam/tessell-internal/acls/{entity-type}/acl/{acl-name} | Get list of acls with entity type and acl name
[**getAclsWithEntityId**](AclsApi.md#getAclsWithEntityId) | **GET** /iam/tessell-internal/acls/{entity-type}/{entity-id} | Get list of acls with entity type and entity id
[**getAclsWithEntityType**](AclsApi.md#getAclsWithEntityType) | **GET** /iam/tessell-internal/acls/{entity-type} | Get list of acls for an entity type
[**getAclsWithRecipientId**](AclsApi.md#getAclsWithRecipientId) | **GET** /iam/tessell-internal/acls/{entity-type}/{entity-id}/recipients/{recipient-type}/{recipient-id} | Get list of acls with entity type, entity id, recipient type and recipient id
[**getAclsWithRecipientType**](AclsApi.md#getAclsWithRecipientType) | **GET** /iam/tessell-internal/acls/{entity-type}/{entity-id}/recipients/{recipient-type} | Get list of acls with entity type, entity id and recipient type
[**getBatchAcls**](AclsApi.md#getBatchAcls) | **POST** /iam/tessell-internal/batch-acls | Batch acl api
[**getStatusOfBulkDeleteAcls**](AclsApi.md#getStatusOfBulkDeleteAcls) | **POST** /tessell-ops/iam/acls/bulk-delete | Get status of bulk deletion of ACLs
[**updateAcls**](AclsApi.md#updateAcls) | **PATCH** /iam/tessell-internal/acls/{entity-type} | Share an entity



## bulkDeleteAcls

> TessellResourceBulkDeleteResponseOps bulkDeleteAcls(tessellResourceBulkDeletePayloadOps)

Bulk delete ACLs

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteAcls(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#bulkDeleteAcls");
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


## checkAclForRecipient

> Boolean checkAclForRecipient(tenantId, entityType, entityId, aclName, recipientType, recipientId)

Check if an ACL exists or not

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        UUID entityId = new UUID(); // UUID | entity-id
        String aclName = "aclName_example"; // String | name of acl
        String recipientType = "recipientType_example"; // String | recipient-type
        String recipientId = "recipientId_example"; // String | recipient-id
        try {
            Boolean result = apiInstance.checkAclForRecipient(tenantId, entityType, entityId, aclName, recipientType, recipientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#checkAclForRecipient");
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
 **entityType** | **String**| entity-type |
 **entityId** | [**UUID**](.md)| entity-id |
 **aclName** | **String**| name of acl |
 **recipientType** | **String**| recipient-type |
 **recipientId** | **String**| recipient-id |

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


## checkAclPermission

> Boolean checkAclPermission(tenantId, entityType, entityId, permission)

Check if an ACL permission exists or not

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        UUID entityId = new UUID(); // UUID | entity-id
        String permission = "permission_example"; // String | name of acl permission
        try {
            Boolean result = apiInstance.checkAclPermission(tenantId, entityType, entityId, permission);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#checkAclPermission");
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
 **entityType** | **String**| entity-type |
 **entityId** | [**UUID**](.md)| entity-id |
 **permission** | **String**| name of acl permission |

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


## deleteAcls

> TessellApiStatus deleteAcls(tenantId, entityType, softDelete, tessellDeleteAclPayload)

Delete an Acl for an entity type

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        Boolean softDelete = true; // Boolean | softDelete
        TessellDeleteAclPayload tessellDeleteAclPayload = new TessellDeleteAclPayload(); // TessellDeleteAclPayload | 
        try {
            TessellApiStatus result = apiInstance.deleteAcls(tenantId, entityType, softDelete, tessellDeleteAclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#deleteAcls");
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
 **entityType** | **String**| entity-type |
 **softDelete** | **Boolean**| softDelete | [optional] [default to true]
 **tessellDeleteAclPayload** | [**TessellDeleteAclPayload**](TessellDeleteAclPayload.md)|  | [optional]

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getAclsWithAclName

> TessellAclApiResponse getAclsWithAclName(tenantId, entityType, aclName, pageSize, pageOffset, timeZone)

Get list of acls with entity type and acl name

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        String aclName = "aclName_example"; // String | acl-name
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellAclApiResponse result = apiInstance.getAclsWithAclName(tenantId, entityType, aclName, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclsWithAclName");
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
 **entityType** | **String**| entity-type |
 **aclName** | **String**| acl-name |
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellAclApiResponse**](TessellAclApiResponse.md)

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


## getAclsWithEntityId

> TessellAclApiResponse getAclsWithEntityId(tenantId, entityType, entityId, pageSize, pageOffset, timeZone)

Get list of acls with entity type and entity id

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        UUID entityId = new UUID(); // UUID | entity-id
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellAclApiResponse result = apiInstance.getAclsWithEntityId(tenantId, entityType, entityId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclsWithEntityId");
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
 **entityType** | **String**| entity-type |
 **entityId** | [**UUID**](.md)| entity-id |
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellAclApiResponse**](TessellAclApiResponse.md)

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


## getAclsWithEntityType

> TessellAclApiResponse getAclsWithEntityType(tenantId, entityType, pageSize, pageOffset, timeZone)

Get list of acls for an entity type

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellAclApiResponse result = apiInstance.getAclsWithEntityType(tenantId, entityType, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclsWithEntityType");
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
 **entityType** | **String**| entity-type |
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellAclApiResponse**](TessellAclApiResponse.md)

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


## getAclsWithRecipientId

> TessellAclApiResponse getAclsWithRecipientId(tenantId, entityType, entityId, recipientType, recipientId, pageSize, pageOffset, timeZone)

Get list of acls with entity type, entity id, recipient type and recipient id

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        UUID entityId = new UUID(); // UUID | entity-id
        String recipientType = "recipientType_example"; // String | recipient-type
        String recipientId = "recipientId_example"; // String | recipient-id
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellAclApiResponse result = apiInstance.getAclsWithRecipientId(tenantId, entityType, entityId, recipientType, recipientId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclsWithRecipientId");
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
 **entityType** | **String**| entity-type |
 **entityId** | [**UUID**](.md)| entity-id |
 **recipientType** | **String**| recipient-type |
 **recipientId** | **String**| recipient-id |
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellAclApiResponse**](TessellAclApiResponse.md)

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


## getAclsWithRecipientType

> TessellAclEntityApiResponse getAclsWithRecipientType(tenantId, entityType, entityId, recipientType, pageSize, pageOffset, timeZone)

Get list of acls with entity type, entity id and recipient type

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        UUID entityId = new UUID(); // UUID | entity-id
        String recipientType = "recipientType_example"; // String | recipient-type
        Integer pageSize = 0; // Integer | page-size
        Integer pageOffset = 10; // Integer | page-offset
        String timeZone = "timeZone_example"; // String | time-zone
        try {
            TessellAclEntityApiResponse result = apiInstance.getAclsWithRecipientType(tenantId, entityType, entityId, recipientType, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getAclsWithRecipientType");
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
 **entityType** | **String**| entity-type |
 **entityId** | [**UUID**](.md)| entity-id |
 **recipientType** | **String**| recipient-type |
 **pageSize** | **Integer**| page-size | [optional] [default to 0]
 **pageOffset** | **Integer**| page-offset | [optional] [default to 10]
 **timeZone** | **String**| time-zone | [optional]

### Return type

[**TessellAclEntityApiResponse**](TessellAclEntityApiResponse.md)

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


## getBatchAcls

> TessellBatchAclResponse getBatchAcls(tenantId, tessellBatchAclPayload)

Batch acl api

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellBatchAclPayload tessellBatchAclPayload = new TessellBatchAclPayload(); // TessellBatchAclPayload | 
        try {
            TessellBatchAclResponse result = apiInstance.getBatchAcls(tenantId, tessellBatchAclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getBatchAcls");
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
 **tessellBatchAclPayload** | [**TessellBatchAclPayload**](TessellBatchAclPayload.md)|  | [optional]

### Return type

[**TessellBatchAclResponse**](TessellBatchAclResponse.md)

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


## getStatusOfBulkDeleteAcls

> TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteAcls(tessellResourceBulkDeletePayloadOps)

Get status of bulk deletion of ACLs

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.getStatusOfBulkDeleteAcls(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#getStatusOfBulkDeleteAcls");
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


## updateAcls

> TessellAclApiResponse updateAcls(tenantId, entityType, tessellUpdateAclPayload)

Share an entity

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.AclsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        AclsApi apiInstance = new AclsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String entityType = "entityType_example"; // String | entity-type
        TessellUpdateAclPayload tessellUpdateAclPayload = new TessellUpdateAclPayload(); // TessellUpdateAclPayload | 
        try {
            TessellAclApiResponse result = apiInstance.updateAcls(tenantId, entityType, tessellUpdateAclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AclsApi#updateAcls");
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
 **entityType** | **String**| entity-type |
 **tessellUpdateAclPayload** | [**TessellUpdateAclPayload**](TessellUpdateAclPayload.md)|  | [optional]

### Return type

[**TessellAclApiResponse**](TessellAclApiResponse.md)

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

