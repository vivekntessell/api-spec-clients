# AdDomainServiceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAdDomainById**](AdDomainServiceApi.md#getAdDomainById) | **GET** /ad-domains/id/{id} | Returns an ad domain.
[**getAdDomainsServiceView**](AdDomainServiceApi.md#getAdDomainsServiceView) | **GET** /ad-domains | Returns all Ad Domain available.



## getAdDomainById

> TessellAdDomainServiceViewDTO getAdDomainById(id)

Returns an ad domain.

Returns an ad domain.

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainServiceApi apiInstance = new AdDomainServiceApi(defaultClient);
        UUID id = new UUID(); // UUID | Tessell Ad Domain Identifier
        try {
            TessellAdDomainServiceViewDTO result = apiInstance.getAdDomainById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainServiceApi#getAdDomainById");
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
 **id** | [**UUID**](.md)| Tessell Ad Domain Identifier |

### Return type

[**TessellAdDomainServiceViewDTO**](TessellAdDomainServiceViewDTO.md)

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


## getAdDomainsServiceView

> List&lt;TessellAdDomainServiceViewDTO&gt; getAdDomainsServiceView(pageSize, pageOffset)

Returns all Ad Domain available.

Returns all Ad Domain available.

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainServiceApi apiInstance = new AdDomainServiceApi(defaultClient);
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellAdDomainServiceViewDTO> result = apiInstance.getAdDomainsServiceView(pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainServiceApi#getAdDomainsServiceView");
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

### Return type

[**List&lt;TessellAdDomainServiceViewDTO&gt;**](TessellAdDomainServiceViewDTO.md)

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

