# EncryptionKeysInternalViewApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**registerEncryptionKeyV2InternalView**](EncryptionKeysInternalViewApi.md#registerEncryptionKeyV2InternalView) | **POST** /tessell-internal/v2/encryption-keys/register | Register Encryption Key from a BYOA Subscription



## registerEncryptionKeyV2InternalView

> TessellEncryptionKeyDTODTO registerEncryptionKeyV2InternalView(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO)

Register Encryption Key from a BYOA Subscription

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.EncryptionKeysInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        EncryptionKeysInternalViewApi apiInstance = new EncryptionKeysInternalViewApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellRegisterEncryptionKeyPayloadV2DTO tessellRegisterEncryptionKeyPayloadV2DTO = new TessellRegisterEncryptionKeyPayloadV2DTO(); // TessellRegisterEncryptionKeyPayloadV2DTO | 
        try {
            TessellEncryptionKeyDTODTO result = apiInstance.registerEncryptionKeyV2InternalView(tenantId, tessellRegisterEncryptionKeyPayloadV2DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EncryptionKeysInternalViewApi#registerEncryptionKeyV2InternalView");
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

