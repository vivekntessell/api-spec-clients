# SecretStoreKeyMapApi

All URIs are relative to *http://tessell-security:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecretEncryptionKeyMapping**](SecretStoreKeyMapApi.md#createSecretEncryptionKeyMapping) | **POST** /tessell-ops/secret-store/secret-encryption-key-mappings | create a mapping for key to be used to encrypt secret in a cloud location
[**deleteSecretEncryptionKeyMapping**](SecretStoreKeyMapApi.md#deleteSecretEncryptionKeyMapping) | **DELETE** /tessell-ops/secret-store/secret-encryption-key-mappings/{id} | delete a mapping for key to be used to encrypt secret in a cloud location
[**getSecretEncryptionKeyMapping**](SecretStoreKeyMapApi.md#getSecretEncryptionKeyMapping) | **GET** /tessell-ops/secret-store/secret-encryption-key-mappings | get current mappings for key to be used to encrypt secret in a cloud location
[**updateSecretEncryptionKeyMapping**](SecretStoreKeyMapApi.md#updateSecretEncryptionKeyMapping) | **PATCH** /tessell-ops/secret-store/secret-encryption-key-mappings/{id} | update a mapping for key to be used to encrypt secret in a cloud location



## createSecretEncryptionKeyMapping

> List&lt;SecretEncryptionEntity&gt; createSecretEncryptionKeyMapping(tenantId, secretKeyMapCreatePayload)

create a mapping for key to be used to encrypt secret in a cloud location

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreKeyMapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreKeyMapApi apiInstance = new SecretStoreKeyMapApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        List<SecretKeyMapCreatePayload> secretKeyMapCreatePayload = Arrays.asList(); // List<SecretKeyMapCreatePayload> | 
        try {
            List<SecretEncryptionEntity> result = apiInstance.createSecretEncryptionKeyMapping(tenantId, secretKeyMapCreatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreKeyMapApi#createSecretEncryptionKeyMapping");
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
 **secretKeyMapCreatePayload** | [**List&lt;SecretKeyMapCreatePayload&gt;**](SecretKeyMapCreatePayload.md)|  | [optional]

### Return type

[**List&lt;SecretEncryptionEntity&gt;**](SecretEncryptionEntity.md)

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


## deleteSecretEncryptionKeyMapping

> SecretEncryptionEntity deleteSecretEncryptionKeyMapping(tenantId, id)

delete a mapping for key to be used to encrypt secret in a cloud location

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreKeyMapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreKeyMapApi apiInstance = new SecretStoreKeyMapApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | id of the key mapping
        try {
            SecretEncryptionEntity result = apiInstance.deleteSecretEncryptionKeyMapping(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreKeyMapApi#deleteSecretEncryptionKeyMapping");
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
 **id** | **UUID**| id of the key mapping |

### Return type

[**SecretEncryptionEntity**](SecretEncryptionEntity.md)

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


## getSecretEncryptionKeyMapping

> SecretKeyMapApiResponse getSecretEncryptionKeyMapping(tenantId, subscriptionId, cloud, cloudAccountId, region)

get current mappings for key to be used to encrypt secret in a cloud location

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreKeyMapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreKeyMapApi apiInstance = new SecretStoreKeyMapApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID subscriptionId = new UUID(); // UUID | Subscription Id
        CloudType cloud = CloudType.fromValue("AWS"); // CloudType | cloud
        UUID cloudAccountId = new UUID(); // UUID | Cloud Account Id of the key
        String region = "region_example"; // String | Region of the key
        try {
            SecretKeyMapApiResponse result = apiInstance.getSecretEncryptionKeyMapping(tenantId, subscriptionId, cloud, cloudAccountId, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreKeyMapApi#getSecretEncryptionKeyMapping");
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
 **subscriptionId** | **UUID**| Subscription Id | [optional]
 **cloud** | [**CloudType**](.md)| cloud | [optional] [enum: AWS, AZURE, GCP]
 **cloudAccountId** | **UUID**| Cloud Account Id of the key | [optional]
 **region** | **String**| Region of the key | [optional]

### Return type

[**SecretKeyMapApiResponse**](SecretKeyMapApiResponse.md)

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


## updateSecretEncryptionKeyMapping

> SecretEncryptionEntity updateSecretEncryptionKeyMapping(tenantId, id, secretKeyMapUpdatePayload)

update a mapping for key to be used to encrypt secret in a cloud location

### Example

```java
// Import classes:
import com.tessell.secretstore.client.invoker.ApiClient;
import com.tessell.secretstore.client.invoker.ApiException;
import com.tessell.secretstore.client.invoker.Configuration;
import com.tessell.secretstore.client.invoker.models.*;
import com.tessell.secretstore.client.api.SecretStoreKeyMapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-security:8080");

        SecretStoreKeyMapApi apiInstance = new SecretStoreKeyMapApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | id of the key mapping
        SecretKeyMapUpdatePayload secretKeyMapUpdatePayload = new SecretKeyMapUpdatePayload(); // SecretKeyMapUpdatePayload | 
        try {
            SecretEncryptionEntity result = apiInstance.updateSecretEncryptionKeyMapping(tenantId, id, secretKeyMapUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretStoreKeyMapApi#updateSecretEncryptionKeyMapping");
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
 **id** | **UUID**| id of the key mapping |
 **secretKeyMapUpdatePayload** | [**SecretKeyMapUpdatePayload**](SecretKeyMapUpdatePayload.md)|  | [optional]

### Return type

[**SecretEncryptionEntity**](SecretEncryptionEntity.md)

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

