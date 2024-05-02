# EncryptionKeysAdminViewApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEncryptionKeysToRegister**](EncryptionKeysAdminViewApi.md#getEncryptionKeysToRegister) | **GET** /encryption-keys/governance/register | List Encryption Keys from a BYOA Subscription to register in Tessell
[**registerEncryptionKeyV2**](EncryptionKeysAdminViewApi.md#registerEncryptionKeyV2) | **POST** /encryption-keys/governance/register | Register Encryption Key from a BYOA Subscription



## getEncryptionKeysToRegister

> TessellEncryptionKeysToRegisterApiResponseDTO getEncryptionKeysToRegister(tenantId, subscriptionName, cloudType, region)

List Encryption Keys from a BYOA Subscription to register in Tessell

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysAdminViewApi apiInstance = new EncryptionKeysAdminViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String subscriptionName = "Sub-Experiments-2"; // String | Subscription name
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Cloud Type
        String region = "ap-south-1"; // String | Region
        try {
            TessellEncryptionKeysToRegisterApiResponseDTO result = apiInstance.getEncryptionKeysToRegister(tenantId, subscriptionName, cloudType, region);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysAdminViewApi#getEncryptionKeysToRegister");
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
 **subscriptionName** | **String**| Subscription name |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Cloud Type | [enum: AWS, AZURE, GCP]
 **region** | **String**| Region |

### Return type

[**TessellEncryptionKeysToRegisterApiResponseDTO**](TessellEncryptionKeysToRegisterApiResponseDTO.md)

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


## registerEncryptionKeyV2

> TessellEncryptionKeyDTODTO registerEncryptionKeyV2(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO)

Register Encryption Key from a BYOA Subscription

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysAdminViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysAdminViewApi apiInstance = new EncryptionKeysAdminViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO = new TessellRegisterEncryptionKeyPayloadV2DTO(); // TessellRegisterEncryptionKeyPayloadV2DTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.registerEncryptionKeyV2(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysAdminViewApi#registerEncryptionKeyV2");
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
 **tessellRegisterEncryptionKeyPayloadV2DTO** | [**TessellRegisterEncryptionKeyPayloadV2DTO**](TessellRegisterEncryptionKeyPayloadV2DTO.md)|  |

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
| **200** | OK |  -  |
| **0** | API error response |  -  |

