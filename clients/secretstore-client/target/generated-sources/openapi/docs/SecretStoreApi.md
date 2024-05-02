# SecretStoreApi

All URIs are relative to *http://tessell-security:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addAdditionalTagsToSecrets**](SecretStoreApi.md#addAdditionalTagsToSecrets) | **POST** /tessell-ops/secret-store/add-tags | Add tags required to clean up the existing secrets
[**bulkDeleteSecrets**](SecretStoreApi.md#bulkDeleteSecrets) | **DELETE** /tessell-ops/secret-store/bulk-delete | delete the secrets for subscription or tenant-id.
[**createSecret**](SecretStoreApi.md#createSecret) | **POST** /tessell-ops/secret-store/secret | Create a secret
[**deleteSecretValue**](SecretStoreApi.md#deleteSecretValue) | **DELETE** /tessell-ops/secret-store/secret/{id} | Delete secret&#39;s value
[**deleteSecrets**](SecretStoreApi.md#deleteSecrets) | **DELETE** /tessell-ops/secret-store/secret | Delete secrets on given condition
[**encryptAllSecrets**](SecretStoreApi.md#encryptAllSecrets) | **POST** /tessell-ops/secret-store/encrypt-secrets | encrypt all existing secrets that are not already encrypted
[**getAllSecrets**](SecretStoreApi.md#getAllSecrets) | **GET** /tessell-ops/secret-store/secrets | Get all secrets metadata
[**getBulkDeleteSecretsStatus**](SecretStoreApi.md#getBulkDeleteSecretsStatus) | **POST** /tessell-ops/secret-store/bulk-delete | get status of bulk delete api
[**getSecret**](SecretStoreApi.md#getSecret) | **GET** /tessell-ops/secret-store/secret | Get a secret
[**getSecretById**](SecretStoreApi.md#getSecretById) | **GET** /tessell-ops/secret-store/secret/{id} | Get secret
[**replicateSecretByKeyName**](SecretStoreApi.md#replicateSecretByKeyName) | **PATCH** /tessell-ops/secret-store/secret/replicate | Replicate secret
[**replicateSecretToDifferentCloudAccount**](SecretStoreApi.md#replicateSecretToDifferentCloudAccount) | **PATCH** /tessell-ops/secret-store/secret/{id}/replicate | Replicate secret
[**updateSecretAvailability**](SecretStoreApi.md#updateSecretAvailability) | **PATCH** /tessell-ops/secret-store/secret/{id}/availability | Update secret&#39;s availability
[**updateSecretValue**](SecretStoreApi.md#updateSecretValue) | **PATCH** /tessell-ops/secret-store/secret/{id} | Update secret&#39;s value



## addAdditionalTagsToSecrets

> TagsAdditionApiResponse addAdditionalTagsToSecrets()

Add tags required to clean up the existing secrets

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        try {
            TagsAdditionApiResponse result = apiInstance.addAdditionalTagsToSecrets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#addAdditionalTagsToSecrets");
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

[**TagsAdditionApiResponse**](TagsAdditionApiResponse.md)

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


## bulkDeleteSecrets

> ResourceBulkDeleteResponseOps bulkDeleteSecrets(bulkDeleteSecretsPayload)

delete the secrets for subscription or tenant-id.

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        BulkDeleteSecretsPayload bulkDeleteSecretsPayload = new BulkDeleteSecretsPayload(); // BulkDeleteSecretsPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteSecrets(bulkDeleteSecretsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#bulkDeleteSecrets");
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
 **bulkDeleteSecretsPayload** | [**BulkDeleteSecretsPayload**](BulkDeleteSecretsPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## createSecret

> SecretDTO createSecret(tenantId, createSecretPayload)

Create a secret

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        CreateSecretPayload createSecretPayload = new CreateSecretPayload(); // CreateSecretPayload | 
        try {
            SecretDTO result = apiInstance.createSecret(tenantId, createSecretPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#createSecret");
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
 **tenantId** | **String**| tenant-id | [optional]
 **createSecretPayload** | [**CreateSecretPayload**](CreateSecretPayload.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## deleteSecretValue

> SecretDTO deleteSecretValue(id, tenantId, deleteInAllRegions, deleteSecretPayload)

Delete secret&#39;s value

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant-id
        Boolean deleteInAllRegions = true; // Boolean | Secrets in all regions will be deleted
        DeleteSecretPayload deleteSecretPayload = new DeleteSecretPayload(); // DeleteSecretPayload | 
        try {
            SecretDTO result = apiInstance.deleteSecretValue(id, tenantId, deleteInAllRegions, deleteSecretPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#deleteSecretValue");
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
 **id** | **UUID**| id |
 **tenantId** | **String**| tenant-id | [optional]
 **deleteInAllRegions** | **Boolean**| Secrets in all regions will be deleted | [optional] [default to true]
 **deleteSecretPayload** | [**DeleteSecretPayload**](DeleteSecretPayload.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## deleteSecrets

> SecretsApiResponse deleteSecrets(keyName, deleteByGroupId, deleteInAllRegions, deleteSecretPayload)

Delete secrets on given condition

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        String keyName = "keyName_example"; // String | Secrets in given regions will be deleted for the keyName
        String deleteByGroupId = "deleteByGroupId_example"; // String | Secrets in all regions will be deleted for the given group
        Boolean deleteInAllRegions = true; // Boolean | Secrets in all regions will be deleted
        DeleteSecretPayload deleteSecretPayload = new DeleteSecretPayload(); // DeleteSecretPayload | 
        try {
            SecretsApiResponse result = apiInstance.deleteSecrets(keyName, deleteByGroupId, deleteInAllRegions, deleteSecretPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#deleteSecrets");
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
 **keyName** | **String**| Secrets in given regions will be deleted for the keyName | [optional]
 **deleteByGroupId** | **String**| Secrets in all regions will be deleted for the given group | [optional]
 **deleteInAllRegions** | **Boolean**| Secrets in all regions will be deleted | [optional] [default to true]
 **deleteSecretPayload** | [**DeleteSecretPayload**](DeleteSecretPayload.md)|  | [optional]

### Return type

[**SecretsApiResponse**](SecretsApiResponse.md)

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


## encryptAllSecrets

> SecretsMigrationApiResponse encryptAllSecrets(tenantId)

encrypt all existing secrets that are not already encrypted

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            SecretsMigrationApiResponse result = apiInstance.encryptAllSecrets(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#encryptAllSecrets");
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

### Return type

[**SecretsMigrationApiResponse**](SecretsMigrationApiResponse.md)

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


## getAllSecrets

> SecretsApiResponse getAllSecrets(tenantId, secretType, groupId)

Get all secrets metadata

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        SecretType secretType = SecretType.fromValue("TENANT_ASSET"); // SecretType | Type of the Secret
        String groupId = "groupId_example"; // String | Group ID for the secret, eg serviceID
        try {
            SecretsApiResponse result = apiInstance.getAllSecrets(tenantId, secretType, groupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#getAllSecrets");
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
 **tenantId** | **String**| tenant-id | [optional]
 **secretType** | [**SecretType**](.md)| Type of the Secret | [optional] [enum: TENANT_ASSET, INFRA_ASSET, CLOUD_ACCOUNT_CREDENTIAL, SHARED_SECRET]
 **groupId** | **String**| Group ID for the secret, eg serviceID | [optional]

### Return type

[**SecretsApiResponse**](SecretsApiResponse.md)

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


## getBulkDeleteSecretsStatus

> ResourceBulkDeleteResponseOps getBulkDeleteSecretsStatus(bulkDeleteSecretsStatusPayload)

get status of bulk delete api

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        BulkDeleteSecretsStatusPayload bulkDeleteSecretsStatusPayload = new BulkDeleteSecretsStatusPayload(); // BulkDeleteSecretsStatusPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.getBulkDeleteSecretsStatus(bulkDeleteSecretsStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#getBulkDeleteSecretsStatus");
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
 **bulkDeleteSecretsStatusPayload** | [**BulkDeleteSecretsStatusPayload**](BulkDeleteSecretsStatusPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## getSecret

> SecretDTO getSecret(secretType, tenantId, id, keyName, externalId, groupId, subscriptionId, cloud, cloudAccountId)

Get a secret

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        SecretType secretType = SecretType.fromValue("TENANT_ASSET"); // SecretType | Type of the Secret
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | UUID of the secret
        String keyName = "keyName_example"; // String | Key name of the secret
        String externalId = "externalId_example"; // String | External Id of the secret
        String groupId = "groupId_example"; // String | Group ID for the secret, eg serviceID
        UUID subscriptionId = new UUID(); // UUID | Subscription Id
        CloudType cloud = CloudType.fromValue("AWS"); // CloudType | cloud
        UUID cloudAccountId = new UUID(); // UUID | Cloud Account Id of the secret
        try {
            SecretDTO result = apiInstance.getSecret(secretType, tenantId, id, keyName, externalId, groupId, subscriptionId, cloud, cloudAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#getSecret");
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
 **secretType** | [**SecretType**](.md)| Type of the Secret | [enum: TENANT_ASSET, INFRA_ASSET, CLOUD_ACCOUNT_CREDENTIAL, SHARED_SECRET]
 **tenantId** | **String**| tenant-id | [optional]
 **id** | **UUID**| UUID of the secret | [optional]
 **keyName** | **String**| Key name of the secret | [optional]
 **externalId** | **String**| External Id of the secret | [optional]
 **groupId** | **String**| Group ID for the secret, eg serviceID | [optional]
 **subscriptionId** | **UUID**| Subscription Id | [optional]
 **cloud** | [**CloudType**](.md)| cloud | [optional] [enum: AWS, AZURE, GCP]
 **cloudAccountId** | **UUID**| Cloud Account Id of the secret | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## getSecretById

> SecretDTO getSecretById(tenantId, id)

Get secret

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | id
        try {
            SecretDTO result = apiInstance.getSecretById(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#getSecretById");
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
 **id** | **UUID**| id |

### Return type

[**SecretDTO**](SecretDTO.md)

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


## replicateSecretByKeyName

> SecretDTO replicateSecretByKeyName(replicateSecret)

Replicate secret

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        ReplicateSecret replicateSecret = new ReplicateSecret(); // ReplicateSecret | 
        try {
            SecretDTO result = apiInstance.replicateSecretByKeyName(replicateSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#replicateSecretByKeyName");
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
 **replicateSecret** | [**ReplicateSecret**](ReplicateSecret.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## replicateSecretToDifferentCloudAccount

> SecretDTO replicateSecretToDifferentCloudAccount(id, replicateSecret)

Replicate secret

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        ReplicateSecret replicateSecret = new ReplicateSecret(); // ReplicateSecret | 
        try {
            SecretDTO result = apiInstance.replicateSecretToDifferentCloudAccount(id, replicateSecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#replicateSecretToDifferentCloudAccount");
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
 **id** | **UUID**| id |
 **replicateSecret** | [**ReplicateSecret**](ReplicateSecret.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## updateSecretAvailability

> SecretDTO updateSecretAvailability(id, tenantId, updateSecretAvailability)

Update secret&#39;s availability

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant-id
        UpdateSecretAvailability updateSecretAvailability = new UpdateSecretAvailability(); // UpdateSecretAvailability | 
        try {
            SecretDTO result = apiInstance.updateSecretAvailability(id, tenantId, updateSecretAvailability);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#updateSecretAvailability");
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
 **id** | **UUID**| id |
 **tenantId** | **String**| tenant-id | [optional]
 **updateSecretAvailability** | [**UpdateSecretAvailability**](UpdateSecretAvailability.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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


## updateSecretValue

> SecretDTO updateSecretValue(id, tenantId, updateSecretPayload)

Update secret&#39;s value

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreApi apiInstance = new SecretStoreApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant-id
        UpdateSecretPayload updateSecretPayload = new UpdateSecretPayload(); // UpdateSecretPayload | 
        try {
            SecretDTO result = apiInstance.updateSecretValue(id, tenantId, updateSecretPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreApi#updateSecretValue");
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
 **id** | **UUID**| id |
 **tenantId** | **String**| tenant-id | [optional]
 **updateSecretPayload** | [**UpdateSecretPayload**](UpdateSecretPayload.md)|  | [optional]

### Return type

[**SecretDTO**](SecretDTO.md)

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

