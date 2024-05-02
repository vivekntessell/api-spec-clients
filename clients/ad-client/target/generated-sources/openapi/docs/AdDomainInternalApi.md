# AdDomainInternalApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdDomainByIdInternal**](AdDomainInternalApi.md#getAdDomainByIdInternal) | **GET** /tessell-internal/ad-domains/id/{id} | Returns Active Directory Domain
[**getAdDomainsInternal**](AdDomainInternalApi.md#getAdDomainsInternal) | **GET** /tessell-internal/ad-domains | List of Active Directory Domains
[**replicateAdDomainCreds**](AdDomainInternalApi.md#replicateAdDomainCreds) | **PATCH** /tessell-internal/ad-domains/id/{id}/replicate | Replicate Ad Domain Credential



## getAdDomainByIdInternal

> TessellAdDomainInternalDTO getAdDomainByIdInternal(id)

Returns Active Directory Domain

Returns Active Directory Domain

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainInternalApi apiInstance = new AdDomainInternalApi(defaultClient);
        UUID id = new UUID(); // UUID | Ad Domain Identifier
        try {
            TessellAdDomainInternalDTO result = apiInstance.getAdDomainByIdInternal(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainInternalApi#getAdDomainByIdInternal");
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
 **id** | [**UUID**](.md)| Ad Domain Identifier |

### Return type

[**TessellAdDomainInternalDTO**](TessellAdDomainInternalDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of ad Domains |  -  |
| **0** | API error response |  -  |


## getAdDomainsInternal

> List&lt;TessellAdDomainInternalDTO&gt; getAdDomainsInternal(pageSize, pageOffset, subscriptionId, cloudType)

List of Active Directory Domains

List of Active Directory Domains

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainInternalApi apiInstance = new AdDomainInternalApi(defaultClient);
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        UUID subscriptionId = new UUID(); // UUID | SubscriptionId
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | CloudType
        try {
            List<TessellAdDomainInternalDTO> result = apiInstance.getAdDomainsInternal(pageSize, pageOffset, subscriptionId, cloudType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainInternalApi#getAdDomainsInternal");
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
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **subscriptionId** | [**UUID**](.md)| SubscriptionId | [optional]
 **cloudType** | [**TessellCloudTypeDTO**](.md)| CloudType | [optional] [enum: AWS, AZURE, GCP]

### Return type

[**List&lt;TessellAdDomainInternalDTO&gt;**](TessellAdDomainInternalDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of ad Domains |  -  |
| **0** | API error response |  -  |


## replicateAdDomainCreds

> TessellAdDomainInternalDTO replicateAdDomainCreds(id, tessellReplicateAdDomainPayloadDTO)

Replicate Ad Domain Credential

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainInternalApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainInternalApi apiInstance = new AdDomainInternalApi(defaultClient);
        UUID id = new UUID(); // UUID | Ad Domain Identifier
        TessellReplicateAdDomainPayloadDTO tessellReplicateAdDomainPayloadDTO = new TessellReplicateAdDomainPayloadDTO(); // TessellReplicateAdDomainPayloadDTO | 
        try {
            TessellAdDomainInternalDTO result = apiInstance.replicateAdDomainCreds(id, tessellReplicateAdDomainPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainInternalApi#replicateAdDomainCreds");
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
 **id** | [**UUID**](.md)| Ad Domain Identifier |
 **tessellReplicateAdDomainPayloadDTO** | [**TessellReplicateAdDomainPayloadDTO**](TessellReplicateAdDomainPayloadDTO.md)|  | [optional]

### Return type

[**TessellAdDomainInternalDTO**](TessellAdDomainInternalDTO.md)

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

