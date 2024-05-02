# EncryptionKeysApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteEncryptionKeys**](EncryptionKeysApi.md#bulkDeleteEncryptionKeys) | **DELETE** /tessell-ops/encryption-key/bulk-delete | Delete the encryption keys for subscription.
[**checkEncryptionKeyEligibility**](EncryptionKeysApi.md#checkEncryptionKeyEligibility) | **POST** /tessell-internal/encryption-keys/validate | Check if encryption key is available or can be made available in the given subscription, region
[**createEncryptionKey**](EncryptionKeysApi.md#createEncryptionKey) | **POST** /encryption-keys/governance | Creates new encryption key
[**createEncryptionKeyAcls**](EncryptionKeysApi.md#createEncryptionKeyAcls) | **PATCH** /encryption-keys/governance/{id}/acls | Creates/updates encryption key acls
[**createInternalEncryptionKey**](EncryptionKeysApi.md#createInternalEncryptionKey) | **POST** /tessell-internal/encryption-keys | 
[**deleteAllEncryptionKeysInternal**](EncryptionKeysApi.md#deleteAllEncryptionKeysInternal) | **DELETE** /tessell-internal/encryption-keys | Delete All Encryption Key in a Tenant
[**deleteEncryptionKeyByIdInternal**](EncryptionKeysApi.md#deleteEncryptionKeyByIdInternal) | **DELETE** /tessell-internal/encryption-keys/{id} | Delete Encryption Key by Id
[**disableEncryptionKeyById**](EncryptionKeysApi.md#disableEncryptionKeyById) | **PATCH** /encryption-keys/governance/{id}/disable | Disable Encryption Key
[**downloadEncryptionKeyFile**](EncryptionKeysApi.md#downloadEncryptionKeyFile) | **GET** /tessell-internal/encryption-keys/download-file/{id} | Download Tessell encryption file
[**enableEncryptionKeyById**](EncryptionKeysApi.md#enableEncryptionKeyById) | **PATCH** /encryption-keys/governance/{id}/enable | Enables Encryption Key
[**getBulkDeleteEncryptionKeyStatus**](EncryptionKeysApi.md#getBulkDeleteEncryptionKeyStatus) | **POST** /tessell-ops/encryption-key/bulk-delete | get status of bulk delete api
[**getEligibleEncryptionKeys**](EncryptionKeysApi.md#getEligibleEncryptionKeys) | **GET** /encryption-keys/governance/eligible | Get a list of eligible Tessell Encryption keys
[**getEligibleEncryptionKeysConsumerView**](EncryptionKeysApi.md#getEligibleEncryptionKeysConsumerView) | **GET** /encryption-keys/eligible | Get a list of eligible Tessell Encryption keys
[**getEligibleUsersForEncryptionKeys**](EncryptionKeysApi.md#getEligibleUsersForEncryptionKeys) | **GET** /encryption-keys/governance/{id}/acls/eligible-users | Get list of all the users by privileges
[**getEncryptionKeyByIdInternalView**](EncryptionKeysApi.md#getEncryptionKeyByIdInternalView) | **GET** /tessell-internal/encryption-keys/{id} | Get details of a encryption key
[**getEncryptionKeyFile**](EncryptionKeysApi.md#getEncryptionKeyFile) | **GET** /tessell-internal/encryption-keys/file/{id} | Download Tessell encryption file
[**getEncryptionKeys**](EncryptionKeysApi.md#getEncryptionKeys) | **GET** /encryption-keys/governance | Get a list of Tessell Encryption keys
[**getEncryptionKeysConsumerView**](EncryptionKeysApi.md#getEncryptionKeysConsumerView) | **GET** /encryption-keys | Get a list of Tessell Encryption keys
[**getEncryptionKeysInternalView**](EncryptionKeysApi.md#getEncryptionKeysInternalView) | **GET** /tessell-internal/encryption-keys | Get a list of Tessell Encryption keys
[**makeEncryptionKeyAvailableInRegions**](EncryptionKeysApi.md#makeEncryptionKeyAvailableInRegions) | **POST** /tessell-internal/encryption-keys/{id}/availability | 
[**registerEncryptionKey**](EncryptionKeysApi.md#registerEncryptionKey) | **POST** /tessell-internal/encryption-keys/register | 
[**registerEncryptionKeyExternal**](EncryptionKeysApi.md#registerEncryptionKeyExternal) | **POST** /encryption-keys/register | 
[**revokeEncryptionKeyAcls**](EncryptionKeysApi.md#revokeEncryptionKeyAcls) | **DELETE** /encryption-keys/governance/{id}/acls | Revokes encryption key acls
[**uploadEncryptionKeyFile**](EncryptionKeysApi.md#uploadEncryptionKeyFile) | **POST** /encryption-keys/upload-file | Upload encryption key file blob



## bulkDeleteEncryptionKeys

> TessellResourceBulkDeleteResponseOpsDTO bulkDeleteEncryptionKeys(tessellBulkDeleteEncryptionKeysPayloadDTO)

Delete the encryption keys for subscription.

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        TessellBulkDeleteEncryptionKeysPayloadDTO tessellBulkDeleteEncryptionKeysPayloadDTO = new TessellBulkDeleteEncryptionKeysPayloadDTO(); // TessellBulkDeleteEncryptionKeysPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.bulkDeleteEncryptionKeys(tessellBulkDeleteEncryptionKeysPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#bulkDeleteEncryptionKeys");
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
 **tessellBulkDeleteEncryptionKeysPayloadDTO** | [**TessellBulkDeleteEncryptionKeysPayloadDTO**](TessellBulkDeleteEncryptionKeysPayloadDTO.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOpsDTO**](TessellResourceBulkDeleteResponseOpsDTO.md)

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


## checkEncryptionKeyEligibility

> TessellEncryptionKeyEligibilityResponseDTO checkEncryptionKeyEligibility(tenantId, tessellCheckEncryptionKeyPayloadDTO)

Check if encryption key is available or can be made available in the given subscription, region

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellCheckEncryptionKeyPayloadDTO tessellCheckEncryptionKeyPayloadDTO = new TessellCheckEncryptionKeyPayloadDTO(); // TessellCheckEncryptionKeyPayloadDTO | 
        try {
            TessellEncryptionKeyEligibilityResponseDTO result = apiInstance.checkEncryptionKeyEligibility(tenantId, tessellCheckEncryptionKeyPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#checkEncryptionKeyEligibility");
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
 **tessellCheckEncryptionKeyPayloadDTO** | [**TessellCheckEncryptionKeyPayloadDTO**](TessellCheckEncryptionKeyPayloadDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyEligibilityResponseDTO**](TessellEncryptionKeyEligibilityResponseDTO.md)

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


## createEncryptionKey

> TessellEncryptionKeyDTODTO createEncryptionKey(tenantId, tessellCreateEncryptionKeyPayloadDTO)

Creates new encryption key

Creates new encryption key

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        TessellCreateEncryptionKeyPayloadDTO tessellCreateEncryptionKeyPayloadDTO = new TessellCreateEncryptionKeyPayloadDTO(); // TessellCreateEncryptionKeyPayloadDTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.createEncryptionKey(tenantId, tessellCreateEncryptionKeyPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#createEncryptionKey");
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
 **tenantId** | **String**| Tenant ID |
 **tessellCreateEncryptionKeyPayloadDTO** | [**TessellCreateEncryptionKeyPayloadDTO**](TessellCreateEncryptionKeyPayloadDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyDTODTO**](TessellEncryptionKeyDTODTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## createEncryptionKeyAcls

> TessellAclPayloadDTO createEncryptionKeyAcls(id, tenantId, tessellAclPayloadDTO)

Creates/updates encryption key acls

Creates/updates encryption key acls

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | encryption key uuid
        String tenantId = "tenantId_example"; // String | Tenant ID
        TessellAclPayloadDTO tessellAclPayloadDTO = new TessellAclPayloadDTO(); // TessellAclPayloadDTO | 
        try {
            TessellAclPayloadDTO result = apiInstance.createEncryptionKeyAcls(id, tenantId, tessellAclPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#createEncryptionKeyAcls");
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
 **id** | [**UUID**](.md)| encryption key uuid |
 **tenantId** | **String**| Tenant ID |
 **tessellAclPayloadDTO** | [**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)|  | [optional]

### Return type

[**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)

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


## createInternalEncryptionKey

> TessellEncryptionKeyDTODTO createInternalEncryptionKey(tenantId, tessellCreateInternalEncryptionKeyPayloadDTO)



### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellCreateInternalEncryptionKeyPayloadDTO tessellCreateInternalEncryptionKeyPayloadDTO = new TessellCreateInternalEncryptionKeyPayloadDTO(); // TessellCreateInternalEncryptionKeyPayloadDTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.createInternalEncryptionKey(tenantId, tessellCreateInternalEncryptionKeyPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#createInternalEncryptionKey");
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
 **tessellCreateInternalEncryptionKeyPayloadDTO** | [**TessellCreateInternalEncryptionKeyPayloadDTO**](TessellCreateInternalEncryptionKeyPayloadDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyDTODTO**](TessellEncryptionKeyDTODTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## deleteAllEncryptionKeysInternal

> TessellSecurityStatusDTO deleteAllEncryptionKeysInternal(tenantId, scheduleDeletionAfterDays)

Delete All Encryption Key in a Tenant

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Integer scheduleDeletionAfterDays = 56; // Integer | days after which deletion should be scheduled (Applicable to AWS KMS keys only & must be in between 7 & 30 both inclusive, defaults to 30 if not provided)
        try {
            TessellSecurityStatusDTO result = apiInstance.deleteAllEncryptionKeysInternal(tenantId, scheduleDeletionAfterDays);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#deleteAllEncryptionKeysInternal");
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
 **scheduleDeletionAfterDays** | **Integer**| days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) | [optional]

### Return type

[**TessellSecurityStatusDTO**](TessellSecurityStatusDTO.md)

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


## deleteEncryptionKeyByIdInternal

> TessellSecurityStatusDTO deleteEncryptionKeyByIdInternal(tenantId, id, scheduleDeletionAfterDays)

Delete Encryption Key by Id

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | id
        Integer scheduleDeletionAfterDays = 56; // Integer | days after which deletion should be scheduled (Applicable to AWS KMS keys only & must be in between 7 & 30 both inclusive, defaults to 30 if not provided)
        try {
            TessellSecurityStatusDTO result = apiInstance.deleteEncryptionKeyByIdInternal(tenantId, id, scheduleDeletionAfterDays);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#deleteEncryptionKeyByIdInternal");
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
 **id** | [**UUID**](.md)| id |
 **scheduleDeletionAfterDays** | **Integer**| days after which deletion should be scheduled (Applicable to AWS KMS keys only &amp; must be in between 7 &amp; 30 both inclusive, defaults to 30 if not provided) | [optional]

### Return type

[**TessellSecurityStatusDTO**](TessellSecurityStatusDTO.md)

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


## disableEncryptionKeyById

> TessellSecurityStatusDTO disableEncryptionKeyById(id, tenantId)

Disable Encryption Key

Disables Encryption Key by ID

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | encryption key uuid
        String tenantId = "tenantId_example"; // String | Tenant ID
        try {
            TessellSecurityStatusDTO result = apiInstance.disableEncryptionKeyById(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#disableEncryptionKeyById");
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
 **id** | [**UUID**](.md)| encryption key uuid |
 **tenantId** | **String**| Tenant ID |

### Return type

[**TessellSecurityStatusDTO**](TessellSecurityStatusDTO.md)

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


## downloadEncryptionKeyFile

> byte[] downloadEncryptionKeyFile(tenantId, id)

Download Tessell encryption file

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | Id of the Tessell file
        try {
            byte[] result = apiInstance.downloadEncryptionKeyFile(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#downloadEncryptionKeyFile");
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
 **id** | [**UUID**](.md)| Id of the Tessell file |

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


## enableEncryptionKeyById

> TessellSecurityStatusDTO enableEncryptionKeyById(id, tenantId)

Enables Encryption Key

Enables Encryption Key by ID

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | encryption key uuid
        String tenantId = "tenantId_example"; // String | Tenant ID
        try {
            TessellSecurityStatusDTO result = apiInstance.enableEncryptionKeyById(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#enableEncryptionKeyById");
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
 **id** | [**UUID**](.md)| encryption key uuid |
 **tenantId** | **String**| Tenant ID |

### Return type

[**TessellSecurityStatusDTO**](TessellSecurityStatusDTO.md)

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


## getBulkDeleteEncryptionKeyStatus

> TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteEncryptionKeyStatus(tessellBulkDeleteEncryptionKeysStatusPayloadDTO)

get status of bulk delete api

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        TessellBulkDeleteEncryptionKeysStatusPayloadDTO tessellBulkDeleteEncryptionKeysStatusPayloadDTO = new TessellBulkDeleteEncryptionKeysStatusPayloadDTO(); // TessellBulkDeleteEncryptionKeysStatusPayloadDTO | 
        try {
            TessellResourceBulkDeleteResponseOpsDTO result = apiInstance.getBulkDeleteEncryptionKeyStatus(tessellBulkDeleteEncryptionKeysStatusPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getBulkDeleteEncryptionKeyStatus");
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
 **tessellBulkDeleteEncryptionKeysStatusPayloadDTO** | [**TessellBulkDeleteEncryptionKeysStatusPayloadDTO**](TessellBulkDeleteEncryptionKeysStatusPayloadDTO.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOpsDTO**](TessellResourceBulkDeleteResponseOpsDTO.md)

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


## getEligibleEncryptionKeys

> TessellEligibleEncryptionKeyConsumerViewApiResponseDTO getEligibleEncryptionKeys(tenantId, pageSize, pageOffset, timeZone)

Get a list of eligible Tessell Encryption keys

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellEligibleEncryptionKeyConsumerViewApiResponseDTO result = apiInstance.getEligibleEncryptionKeys(tenantId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEligibleEncryptionKeys");
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
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellEligibleEncryptionKeyConsumerViewApiResponseDTO**](TessellEligibleEncryptionKeyConsumerViewApiResponseDTO.md)

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


## getEligibleEncryptionKeysConsumerView

> TessellEligibleEncryptionKeyConsumerViewApiResponseDTO getEligibleEncryptionKeysConsumerView(tenantId, pageSize, pageOffset, timeZone)

Get a list of eligible Tessell Encryption keys

Get a list of eligible Tessell Encryption keys

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellEligibleEncryptionKeyConsumerViewApiResponseDTO result = apiInstance.getEligibleEncryptionKeysConsumerView(tenantId, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEligibleEncryptionKeysConsumerView");
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
 **tenantId** | **String**| Tenant ID |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellEligibleEncryptionKeyConsumerViewApiResponseDTO**](TessellEligibleEncryptionKeyConsumerViewApiResponseDTO.md)

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


## getEligibleUsersForEncryptionKeys

> List&lt;TessellAclEligibleUserDTO&gt; getEligibleUsersForEncryptionKeys(id, tenantId, role)

Get list of all the users by privileges

Gets list of all the users by privileges

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | encryption key uuid
        String tenantId = "tenantId_example"; // String | Tenant ID
        List<String> role = Arrays.asList(); // List<String> | role
        try {
            List<TessellAclEligibleUserDTO> result = apiInstance.getEligibleUsersForEncryptionKeys(id, tenantId, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEligibleUsersForEncryptionKeys");
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
 **id** | [**UUID**](.md)| encryption key uuid |
 **tenantId** | **String**| Tenant ID |
 **role** | [**List&lt;String&gt;**](String.md)| role | [optional]

### Return type

[**List&lt;TessellAclEligibleUserDTO&gt;**](TessellAclEligibleUserDTO.md)

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


## getEncryptionKeyByIdInternalView

> TessellEncryptionKeyDetailsDTODTO getEncryptionKeyByIdInternalView(id, tenantId)

Get details of a encryption key

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellEncryptionKeyDetailsDTODTO result = apiInstance.getEncryptionKeyByIdInternalView(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEncryptionKeyByIdInternalView");
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
 **tenantId** | **String**| tenant-id |

### Return type

[**TessellEncryptionKeyDetailsDTODTO**](TessellEncryptionKeyDetailsDTODTO.md)

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


## getEncryptionKeyFile

> TessellEncryptionFileDTODTO getEncryptionKeyFile(tenantId, id)

Download Tessell encryption file

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | Id of the Tessell file
        try {
            TessellEncryptionFileDTODTO result = apiInstance.getEncryptionKeyFile(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEncryptionKeyFile");
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
 **id** | [**UUID**](.md)| Id of the Tessell file |

### Return type

[**TessellEncryptionFileDTODTO**](TessellEncryptionFileDTODTO.md)

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


## getEncryptionKeys

> TessellEncryptionKeyApiResponseDTO getEncryptionKeys(tenantId, name, cloud, includeSharedWithUsers, pageSize, pageOffset, timeZone)

Get a list of Tessell Encryption keys

Get a list of Tessell Encryption keys

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        String name = "name_example"; // String | name of the encryption key
        TessellCloudTypeDTO cloud = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | cloud type
        Boolean includeSharedWithUsers = true; // Boolean | Flag indicating whether to load users with whom entity is shared
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellEncryptionKeyApiResponseDTO result = apiInstance.getEncryptionKeys(tenantId, name, cloud, includeSharedWithUsers, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEncryptionKeys");
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
 **tenantId** | **String**| Tenant ID |
 **name** | **String**| name of the encryption key | [optional]
 **cloud** | [**TessellCloudTypeDTO**](.md)| cloud type | [optional] [enum: AWS, AZURE, GCP]
 **includeSharedWithUsers** | **Boolean**| Flag indicating whether to load users with whom entity is shared | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellEncryptionKeyApiResponseDTO**](TessellEncryptionKeyApiResponseDTO.md)

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


## getEncryptionKeysConsumerView

> TessellEncryptionKeyConsumerViewApiResponseDTO getEncryptionKeysConsumerView(tenantId, cloud, name, pageSize, pageOffset, timeZone)

Get a list of Tessell Encryption keys

Get a list of Tessell Encryption keys

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        TessellCloudTypeDTO cloud = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | cloud type
        String name = "name_example"; // String | name of the encryption key
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellEncryptionKeyConsumerViewApiResponseDTO result = apiInstance.getEncryptionKeysConsumerView(tenantId, cloud, name, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEncryptionKeysConsumerView");
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
 **tenantId** | **String**| Tenant ID |
 **cloud** | [**TessellCloudTypeDTO**](.md)| cloud type | [optional] [enum: AWS, AZURE, GCP]
 **name** | **String**| name of the encryption key | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellEncryptionKeyConsumerViewApiResponseDTO**](TessellEncryptionKeyConsumerViewApiResponseDTO.md)

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


## getEncryptionKeysInternalView

> TessellEncryptionKeyInternalViewApiResponseDTO getEncryptionKeysInternalView(tenantId, cloud, name, status, includeSharedWithUsers, pageSize, pageOffset, timeZone)

Get a list of Tessell Encryption keys

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellCloudTypeDTO cloud = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | cloud
        String name = "name_example"; // String | name of the encryption key
        TessellEncryptionKeyStatusDTO status = TessellEncryptionKeyStatusDTO.fromValue("CREATING"); // TessellEncryptionKeyStatusDTO | status of the encryption key
        Boolean includeSharedWithUsers = true; // Boolean | Flag indicating whether to load users with whom entity is shared
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellEncryptionKeyInternalViewApiResponseDTO result = apiInstance.getEncryptionKeysInternalView(tenantId, cloud, name, status, includeSharedWithUsers, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#getEncryptionKeysInternalView");
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
 **cloud** | [**TessellCloudTypeDTO**](.md)| cloud | [optional] [enum: AWS, AZURE, GCP]
 **name** | **String**| name of the encryption key | [optional]
 **status** | [**TessellEncryptionKeyStatusDTO**](.md)| status of the encryption key | [optional] [enum: CREATING, REPLICATING, WAITING, PROCESSING, AVAILABLE, DISABLED, DISABLING, ENABLING, DELETED, DELETING, DELETION_FAILED, FAILED]
 **includeSharedWithUsers** | **Boolean**| Flag indicating whether to load users with whom entity is shared | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellEncryptionKeyInternalViewApiResponseDTO**](TessellEncryptionKeyInternalViewApiResponseDTO.md)

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


## makeEncryptionKeyAvailableInRegions

> TessellEncryptionKeyInternalViewApiResponseDTO makeEncryptionKeyAvailableInRegions(tenantId, id, tessellCloudAvailabilityDTO)



### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | uuid of the encryption key
        List<TessellCloudAvailabilityDTO> tessellCloudAvailabilityDTO = Arrays.asList(); // List<TessellCloudAvailabilityDTO> | 
        try {
            TessellEncryptionKeyInternalViewApiResponseDTO result = apiInstance.makeEncryptionKeyAvailableInRegions(tenantId, id, tessellCloudAvailabilityDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#makeEncryptionKeyAvailableInRegions");
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
 **id** | **UUID**| uuid of the encryption key |
 **tessellCloudAvailabilityDTO** | [**List&lt;TessellCloudAvailabilityDTO&gt;**](TessellCloudAvailabilityDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyInternalViewApiResponseDTO**](TessellEncryptionKeyInternalViewApiResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## registerEncryptionKey

> TessellEncryptionKeyDTODTO registerEncryptionKey(tenantId, validateMetadata, tessellRegisterEncryptionKeyPayloadDTO)



### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        Boolean validateMetadata = false; // Boolean | validate-metadata
        TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO = new TessellRegisterEncryptionKeyPayloadDTO(); // TessellRegisterEncryptionKeyPayloadDTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.registerEncryptionKey(tenantId, validateMetadata, tessellRegisterEncryptionKeyPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#registerEncryptionKey");
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
 **validateMetadata** | **Boolean**| validate-metadata | [optional] [default to false]
 **tessellRegisterEncryptionKeyPayloadDTO** | [**TessellRegisterEncryptionKeyPayloadDTO**](TessellRegisterEncryptionKeyPayloadDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyDTODTO**](TessellEncryptionKeyDTODTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## registerEncryptionKeyExternal

> TessellEncryptionKeyDTODTO registerEncryptionKeyExternal(tenantId, tessellRegisterEncryptionKeyPayloadDTO)



Registers encryption key

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        TessellRegisterEncryptionKeyPayloadDTO tessellRegisterEncryptionKeyPayloadDTO = new TessellRegisterEncryptionKeyPayloadDTO(); // TessellRegisterEncryptionKeyPayloadDTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.registerEncryptionKeyExternal(tenantId, tessellRegisterEncryptionKeyPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#registerEncryptionKeyExternal");
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
 **tenantId** | **String**| Tenant ID |
 **tessellRegisterEncryptionKeyPayloadDTO** | [**TessellRegisterEncryptionKeyPayloadDTO**](TessellRegisterEncryptionKeyPayloadDTO.md)|  | [optional]

### Return type

[**TessellEncryptionKeyDTODTO**](TessellEncryptionKeyDTODTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Created |  -  |
| **0** | API error response |  -  |


## revokeEncryptionKeyAcls

> TessellApiStatusDTO revokeEncryptionKeyAcls(id, tenantId, tessellAclRevokePayloadDTO)

Revokes encryption key acls

Revokes encryption key acls

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        UUID id = new UUID(); // UUID | encryption key uuid
        String tenantId = "tenantId_example"; // String | Tenant ID
        TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO = new TessellAclRevokePayloadDTO(); // TessellAclRevokePayloadDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.revokeEncryptionKeyAcls(id, tenantId, tessellAclRevokePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#revokeEncryptionKeyAcls");
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
 **id** | [**UUID**](.md)| encryption key uuid |
 **tenantId** | **String**| Tenant ID |
 **tessellAclRevokePayloadDTO** | [**TessellAclRevokePayloadDTO**](TessellAclRevokePayloadDTO.md)|  | [optional]

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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


## uploadEncryptionKeyFile

> TessellEncryptionFileDTODTO uploadEncryptionKeyFile(tenantId, blob)

Upload encryption key file blob

Upload encryption key file blob

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysApi apiInstance = new EncryptionKeysApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        File blob = new File("/path/to/file"); // File | File content
        try {
            TessellEncryptionFileDTODTO result = apiInstance.uploadEncryptionKeyFile(tenantId, blob);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysApi#uploadEncryptionKeyFile");
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
 **tenantId** | **String**| Tenant ID |
 **blob** | **File**| File content | [optional]

### Return type

[**TessellEncryptionFileDTODTO**](TessellEncryptionFileDTODTO.md)

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

