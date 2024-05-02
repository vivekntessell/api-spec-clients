# KeyVaultsApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**callbackForCreateKeyVaultWorkflowInternal**](KeyVaultsApi.md#callbackForCreateKeyVaultWorkflowInternal) | **POST** /tessell-internal/security/key-vaults/{id}/callback/create-key-vault | Callback API after workflow execution is complete
[**createKeyVaultInternal**](KeyVaultsApi.md#createKeyVaultInternal) | **POST** /tessell-internal/security/key-vaults | Creates a Key Vault in given region (if not already exists)
[**deleteKeyVaultMetadata**](KeyVaultsApi.md#deleteKeyVaultMetadata) | **DELETE** /tessell-internal/security/key-vaults/delete-metadata/{cloudAccountId} | Delete key-vault metadata for the particular cloudAccountId
[**getExistingKeyVault**](KeyVaultsApi.md#getExistingKeyVault) | **GET** /tessell-internal/security/key-vaults | get existing key vault
[**getExistingKeyVaultExternal**](KeyVaultsApi.md#getExistingKeyVaultExternal) | **GET** /security/key-vaults | Get existing key vault
[**getKeyVaultByIdInternal**](KeyVaultsApi.md#getKeyVaultByIdInternal) | **GET** /tessell-internal/security/key-vaults/{id} | Get Key Vault details by Id
[**patchExistingKeyVaults**](KeyVaultsApi.md#patchExistingKeyVaults) | **PATCH** /tessell-internal/security/key-vaults | Patch existing key vaults
[**registerKeyVaultInternal**](KeyVaultsApi.md#registerKeyVaultInternal) | **POST** /tessell-internal/security/key-vaults/register | Registers a Key Vault in given region



## callbackForCreateKeyVaultWorkflowInternal

> TessellApiStatusDTO callbackForCreateKeyVaultWorkflowInternal(id, tessellWorkflowCallbackPayloadDTO)

Callback API after workflow execution is complete

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Key Vault
        TessellWorkflowCallbackPayloadDTO tessellWorkflowCallbackPayloadDTO = new TessellWorkflowCallbackPayloadDTO(); // TessellWorkflowCallbackPayloadDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.callbackForCreateKeyVaultWorkflowInternal(id, tessellWorkflowCallbackPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#callbackForCreateKeyVaultWorkflowInternal");
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
 **id** | [**UUID**](.md)| Id of the Key Vault |
 **tessellWorkflowCallbackPayloadDTO** | [**TessellWorkflowCallbackPayloadDTO**](TessellWorkflowCallbackPayloadDTO.md)|  | [optional]

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


## createKeyVaultInternal

> TessellAzureKeyVaultDTODTO createKeyVaultInternal(tessellCreateAzureKeyVaultPayloadDTO)

Creates a Key Vault in given region (if not already exists)

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        TessellCreateAzureKeyVaultPayloadDTO tessellCreateAzureKeyVaultPayloadDTO = new TessellCreateAzureKeyVaultPayloadDTO(); // TessellCreateAzureKeyVaultPayloadDTO | 
        try {
            TessellAzureKeyVaultDTODTO result = apiInstance.createKeyVaultInternal(tessellCreateAzureKeyVaultPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#createKeyVaultInternal");
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
 **tessellCreateAzureKeyVaultPayloadDTO** | [**TessellCreateAzureKeyVaultPayloadDTO**](TessellCreateAzureKeyVaultPayloadDTO.md)|  | [optional]

### Return type

[**TessellAzureKeyVaultDTODTO**](TessellAzureKeyVaultDTODTO.md)

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


## deleteKeyVaultMetadata

> TessellApiStatusDTO deleteKeyVaultMetadata(cloudAccountId)

Delete key-vault metadata for the particular cloudAccountId

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        UUID cloudAccountId = new UUID(); // UUID | Cloud account Id
        try {
            TessellApiStatusDTO result = apiInstance.deleteKeyVaultMetadata(cloudAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#deleteKeyVaultMetadata");
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
 **cloudAccountId** | [**UUID**](.md)| Cloud account Id |

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


## getExistingKeyVault

> TessellAzureKeyVaultDTODTO getExistingKeyVault(subscriptionId, region)

get existing key vault

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        UUID subscriptionId = new UUID(); // UUID | Subscription Id
        String region = "region_example"; // String | Region
        try {
            TessellAzureKeyVaultDTODTO result = apiInstance.getExistingKeyVault(subscriptionId, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#getExistingKeyVault");
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
 **subscriptionId** | [**UUID**](.md)| Subscription Id |
 **region** | **String**| Region |

### Return type

[**TessellAzureKeyVaultDTODTO**](TessellAzureKeyVaultDTODTO.md)

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


## getExistingKeyVaultExternal

> TessellAzureKeyVaultDTODTO getExistingKeyVaultExternal(tenantId, subscriptionName, region)

Get existing key vault

Get existing key vault

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        String subscriptionName = "subscriptionName_example"; // String | Subscription Name
        String region = "region_example"; // String | Region
        try {
            TessellAzureKeyVaultDTODTO result = apiInstance.getExistingKeyVaultExternal(tenantId, subscriptionName, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#getExistingKeyVaultExternal");
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
 **subscriptionName** | **String**| Subscription Name |
 **region** | **String**| Region |

### Return type

[**TessellAzureKeyVaultDTODTO**](TessellAzureKeyVaultDTODTO.md)

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


## getKeyVaultByIdInternal

> TessellAzureKeyVaultDTODTO getKeyVaultByIdInternal(id)

Get Key Vault details by Id

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of Key Vault
        try {
            TessellAzureKeyVaultDTODTO result = apiInstance.getKeyVaultByIdInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#getKeyVaultByIdInternal");
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
 **id** | [**UUID**](.md)| Id of Key Vault |

### Return type

[**TessellAzureKeyVaultDTODTO**](TessellAzureKeyVaultDTODTO.md)

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


## patchExistingKeyVaults

> patchExistingKeyVaults(cloudAccountId)

Patch existing key vaults

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        UUID cloudAccountId = new UUID(); // UUID | Cloud Account Id
        try {
            apiInstance.patchExistingKeyVaults(cloudAccountId);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#patchExistingKeyVaults");
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
 **cloudAccountId** | [**UUID**](.md)| Cloud Account Id |

### Return type

null (empty response body)

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


## registerKeyVaultInternal

> TessellAzureKeyVaultDTODTO registerKeyVaultInternal(tessellRegisterKeyVaultPayloadDTO)

Registers a Key Vault in given region

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.KeyVaultsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        KeyVaultsApi apiInstance = new KeyVaultsApi(defaultClient);
        TessellRegisterKeyVaultPayloadDTO tessellRegisterKeyVaultPayloadDTO = new TessellRegisterKeyVaultPayloadDTO(); // TessellRegisterKeyVaultPayloadDTO | 
        try {
            TessellAzureKeyVaultDTODTO result = apiInstance.registerKeyVaultInternal(tessellRegisterKeyVaultPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling KeyVaultsApi#registerKeyVaultInternal");
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
 **tessellRegisterKeyVaultPayloadDTO** | [**TessellRegisterKeyVaultPayloadDTO**](TessellRegisterKeyVaultPayloadDTO.md)|  | [optional]

### Return type

[**TessellAzureKeyVaultDTODTO**](TessellAzureKeyVaultDTODTO.md)

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

