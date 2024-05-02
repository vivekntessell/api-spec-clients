# AdDomainGovernanceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deregisterAdDomain**](AdDomainGovernanceApi.md#deregisterAdDomain) | **DELETE** /ad-domains/governance/id/{id}/deregister | Deregister an Active Directory Domain
[**getAdDomainsGovernance**](AdDomainGovernanceApi.md#getAdDomainsGovernance) | **GET** /ad-domains/governance | Get List of Active Directory Domain
[**reconfigureAdDomain**](AdDomainGovernanceApi.md#reconfigureAdDomain) | **PATCH** /ad-domains/governance/id/{id}/reconfigure | Reconfigure an Active Directory Domain
[**registerAdDomain**](AdDomainGovernanceApi.md#registerAdDomain) | **POST** /ad-domains/governance/register | Register an Active Directory Domain



## deregisterAdDomain

> TessellApiStatusDTO deregisterAdDomain(id)

Deregister an Active Directory Domain

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainGovernanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainGovernanceApi apiInstance = new AdDomainGovernanceApi(defaultClient);
        UUID id = new UUID(); // UUID | Ad Domain Identifier
        try {
            TessellApiStatusDTO result = apiInstance.deregisterAdDomain(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainGovernanceApi#deregisterAdDomain");
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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## getAdDomainsGovernance

> List&lt;TessellAdDomainDTO&gt; getAdDomainsGovernance(pageSize, pageOffset)

Get List of Active Directory Domain

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainGovernanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainGovernanceApi apiInstance = new AdDomainGovernanceApi(defaultClient);
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellAdDomainDTO> result = apiInstance.getAdDomainsGovernance(pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainGovernanceApi#getAdDomainsGovernance");
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

[**List&lt;TessellAdDomainDTO&gt;**](TessellAdDomainDTO.md)

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


## reconfigureAdDomain

> TessellAdDomainDTO reconfigureAdDomain(id, tessellReconfigureAdDomainPayloadDTO)

Reconfigure an Active Directory Domain

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainGovernanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainGovernanceApi apiInstance = new AdDomainGovernanceApi(defaultClient);
        UUID id = new UUID(); // UUID | Ad Domain Identifier
        TessellReconfigureAdDomainPayloadDTO tessellReconfigureAdDomainPayloadDTO = new TessellReconfigureAdDomainPayloadDTO(); // TessellReconfigureAdDomainPayloadDTO | 
        try {
            TessellAdDomainDTO result = apiInstance.reconfigureAdDomain(id, tessellReconfigureAdDomainPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainGovernanceApi#reconfigureAdDomain");
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
 **tessellReconfigureAdDomainPayloadDTO** | [**TessellReconfigureAdDomainPayloadDTO**](TessellReconfigureAdDomainPayloadDTO.md)|  | [optional]

### Return type

[**TessellAdDomainDTO**](TessellAdDomainDTO.md)

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


## registerAdDomain

> TessellAdDomainDTO registerAdDomain(tessellRegisterAdDomainPayloadDTO)

Register an Active Directory Domain

### Example

```java
// Import classes:
import com.tessell.ad.client.invoker.ApiClient;
import com.tessell.ad.client.invoker.ApiException;
import com.tessell.ad.client.invoker.Configuration;
import com.tessell.ad.client.invoker.models.*;
import com.tessell.ad.client.api.AdDomainGovernanceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AdDomainGovernanceApi apiInstance = new AdDomainGovernanceApi(defaultClient);
        TessellRegisterAdDomainPayloadDTO tessellRegisterAdDomainPayloadDTO = new TessellRegisterAdDomainPayloadDTO(); // TessellRegisterAdDomainPayloadDTO | 
        try {
            TessellAdDomainDTO result = apiInstance.registerAdDomain(tessellRegisterAdDomainPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AdDomainGovernanceApi#registerAdDomain");
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
 **tessellRegisterAdDomainPayloadDTO** | [**TessellRegisterAdDomainPayloadDTO**](TessellRegisterAdDomainPayloadDTO.md)|  | [optional]

### Return type

[**TessellAdDomainDTO**](TessellAdDomainDTO.md)

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

