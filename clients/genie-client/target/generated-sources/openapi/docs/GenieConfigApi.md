# GenieConfigApi

All URIs are relative to *http://genie:80*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createGenieConfig**](GenieConfigApi.md#createGenieConfig) | **POST** /tessell-ops/genie-config | create genie config
[**deleteGenieConfig**](GenieConfigApi.md#deleteGenieConfig) | **DELETE** /tessell-ops/genie-config/{tenantId} | delete genie config for a tenant
[**getGenieConfig**](GenieConfigApi.md#getGenieConfig) | **GET** /tessell-ops/genie-config/{tenantId} | get genie config for a tenant
[**getGenieConfigExternal**](GenieConfigApi.md#getGenieConfigExternal) | **GET** /genie-config/{tenantId} | get genie config for a tenant
[**updateGenieConfig**](GenieConfigApi.md#updateGenieConfig) | **PUT** /tessell-ops/genie-config/{tenantId} | Update genie config for a tenant



## createGenieConfig

> GenieTenantConfig createGenieConfig(genieTenantConfig)

create genie config

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieConfigApi apiInstance = new GenieConfigApi(defaultClient);
        GenieTenantConfig genieTenantConfig = new GenieTenantConfig(); // GenieTenantConfig | 
        try {
            GenieTenantConfig result = apiInstance.createGenieConfig(genieTenantConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieConfigApi#createGenieConfig");
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
 **genieTenantConfig** | [**GenieTenantConfig**](GenieTenantConfig.md)|  |

### Return type

[**GenieTenantConfig**](GenieTenantConfig.md)

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


## deleteGenieConfig

> GenieConfig deleteGenieConfig(tenantId)

delete genie config for a tenant

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieConfigApi apiInstance = new GenieConfigApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        try {
            GenieConfig result = apiInstance.deleteGenieConfig(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieConfigApi#deleteGenieConfig");
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

### Return type

[**GenieConfig**](GenieConfig.md)

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


## getGenieConfig

> GenieConfig getGenieConfig(tenantId)

get genie config for a tenant

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieConfigApi apiInstance = new GenieConfigApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        try {
            GenieConfig result = apiInstance.getGenieConfig(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieConfigApi#getGenieConfig");
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

### Return type

[**GenieConfig**](GenieConfig.md)

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


## getGenieConfigExternal

> GenieConfig getGenieConfigExternal(tenantId)

get genie config for a tenant

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieConfigApi apiInstance = new GenieConfigApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        try {
            GenieConfig result = apiInstance.getGenieConfigExternal(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieConfigApi#getGenieConfigExternal");
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

### Return type

[**GenieConfig**](GenieConfig.md)

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


## updateGenieConfig

> GenieConfig updateGenieConfig(tenantId, genieConfig)

Update genie config for a tenant

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieConfigApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieConfigApi apiInstance = new GenieConfigApi(defaultClient);
        String tenantId = "tenantId_example"; // String | Tenant ID
        GenieConfig genieConfig = new GenieConfig(); // GenieConfig | 
        try {
            GenieConfig result = apiInstance.updateGenieConfig(tenantId, genieConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieConfigApi#updateGenieConfig");
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
 **genieConfig** | [**GenieConfig**](GenieConfig.md)|  | [optional]

### Return type

[**GenieConfig**](GenieConfig.md)

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

