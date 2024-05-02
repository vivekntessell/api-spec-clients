# TessellGlobalEngineControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDbGenericProperties**](TessellGlobalEngineControllerApi.md#createDbGenericProperties) | **POST** /tessell-ops/db/generic-properties | Create a property
[**deleteDbGenericProperties**](TessellGlobalEngineControllerApi.md#deleteDbGenericProperties) | **DELETE** /tessell-ops/db/generic-properties | Delete properties
[**deleteGlobalEngineConfig**](TessellGlobalEngineControllerApi.md#deleteGlobalEngineConfig) | **DELETE** /tessell-ops/config/global-engine | Delete Tessell Global Engine configuration
[**getDbGenericProperties**](TessellGlobalEngineControllerApi.md#getDbGenericProperties) | **GET** /tessell-ops/db/generic-properties | getDbGenericProperties
[**getFeatureConfig**](TessellGlobalEngineControllerApi.md#getFeatureConfig) | **GET** /services/feature-config | Get Feature Config
[**getFeatureConfigOps**](TessellGlobalEngineControllerApi.md#getFeatureConfigOps) | **GET** /tessell-ops/services/feature-config | Get Feature Config Ops
[**getGlobalEngineConfig**](TessellGlobalEngineControllerApi.md#getGlobalEngineConfig) | **GET** /tessell-ops/config/global-engine | get Tessell Global Engine configuration
[**getStartStopServiceConfiguration**](TessellGlobalEngineControllerApi.md#getStartStopServiceConfiguration) | **GET** /tessell-ops/config/start-stop | get tessell service start stop config
[**upsertFeatureConfigOps**](TessellGlobalEngineControllerApi.md#upsertFeatureConfigOps) | **POST** /tessell-ops/services/feature-config | Upsert Feature Config Ops
[**upsertGlobalEngineConfig**](TessellGlobalEngineControllerApi.md#upsertGlobalEngineConfig) | **PUT** /tessell-ops/config/global-engine | Create or Update a new Tessell Global Engine configuration



## createDbGenericProperties

> List&lt;GenericProperty&gt; createDbGenericProperties(genericProperty)

Create a property

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        List<GenericProperty> genericProperty = Arrays.asList(); // List<GenericProperty> | 
        try {
            List<GenericProperty> result = apiInstance.createDbGenericProperties(genericProperty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#createDbGenericProperties");
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
 **genericProperty** | [**List&lt;GenericProperty&gt;**](GenericProperty.md)|  |

### Return type

[**List&lt;GenericProperty&gt;**](GenericProperty.md)

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


## deleteDbGenericProperties

> ApiStatus deleteDbGenericProperties(deleteGenericPropertyPayload)

Delete properties

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        DeleteGenericPropertyPayload deleteGenericPropertyPayload = new DeleteGenericPropertyPayload(); // DeleteGenericPropertyPayload | 
        try {
            ApiStatus result = apiInstance.deleteDbGenericProperties(deleteGenericPropertyPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#deleteDbGenericProperties");
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
 **deleteGenericPropertyPayload** | [**DeleteGenericPropertyPayload**](DeleteGenericPropertyPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

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


## deleteGlobalEngineConfig

> ApiStatus deleteGlobalEngineConfig(engine)

Delete Tessell Global Engine configuration

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        String engine = "engine_example"; // String | engine
        try {
            ApiStatus result = apiInstance.deleteGlobalEngineConfig(engine);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#deleteGlobalEngineConfig");
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
 **engine** | **String**| engine |

### Return type

[**ApiStatus**](ApiStatus.md)

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


## getDbGenericProperties

> List&lt;GenericProperty&gt; getDbGenericProperties(names, pageSize, pageOffset, timeZone)

getDbGenericProperties

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        List<String> names = Arrays.asList(); // List<String> | property names
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<GenericProperty> result = apiInstance.getDbGenericProperties(names, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#getDbGenericProperties");
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
 **names** | [**List&lt;String&gt;**](String.md)| property names | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;GenericProperty&gt;**](GenericProperty.md)

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


## getFeatureConfig

> TessellFeatureConfig getFeatureConfig()

Get Feature Config

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        try {
            TessellFeatureConfig result = apiInstance.getFeatureConfig();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#getFeatureConfig");
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

[**TessellFeatureConfig**](TessellFeatureConfig.md)

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


## getFeatureConfigOps

> TessellFeatureConfig getFeatureConfigOps()

Get Feature Config Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        try {
            TessellFeatureConfig result = apiInstance.getFeatureConfigOps();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#getFeatureConfigOps");
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

[**TessellFeatureConfig**](TessellFeatureConfig.md)

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


## getGlobalEngineConfig

> GlobalEngineConfigResponse getGlobalEngineConfig(engine, tenantId, defaultOnly, pageSize, pageOffset, timeZone)

get Tessell Global Engine configuration

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        String engine = "engine_example"; // String | Returns global engine config for specified engine
        UUID tenantId = new UUID(); // UUID | Returns global engine config for specified tenant.
        Boolean defaultOnly = true; // Boolean | Returns global engine configuration without tenant-specific computation if flag is enabled.
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GlobalEngineConfigResponse result = apiInstance.getGlobalEngineConfig(engine, tenantId, defaultOnly, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#getGlobalEngineConfig");
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
 **engine** | **String**| Returns global engine config for specified engine | [optional]
 **tenantId** | [**UUID**](.md)| Returns global engine config for specified tenant. | [optional]
 **defaultOnly** | **Boolean**| Returns global engine configuration without tenant-specific computation if flag is enabled. | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GlobalEngineConfigResponse**](GlobalEngineConfigResponse.md)

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


## getStartStopServiceConfiguration

> Object getStartStopServiceConfiguration()

get tessell service start stop config

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        try {
            Object result = apiInstance.getStartStopServiceConfiguration();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#getStartStopServiceConfiguration");
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

**Object**

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


## upsertFeatureConfigOps

> TessellFeatureConfig upsertFeatureConfigOps(tessellFeatureConfig)

Upsert Feature Config Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        TessellFeatureConfig tessellFeatureConfig = new TessellFeatureConfig(); // TessellFeatureConfig | 
        try {
            TessellFeatureConfig result = apiInstance.upsertFeatureConfigOps(tessellFeatureConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#upsertFeatureConfigOps");
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
 **tessellFeatureConfig** | [**TessellFeatureConfig**](TessellFeatureConfig.md)|  |

### Return type

[**TessellFeatureConfig**](TessellFeatureConfig.md)

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


## upsertGlobalEngineConfig

> GlobalEngineConfigDTO upsertGlobalEngineConfig(globalEngineConfigDTO)

Create or Update a new Tessell Global Engine configuration

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellGlobalEngineControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGlobalEngineControllerApi apiInstance = new TessellGlobalEngineControllerApi(defaultClient);
        GlobalEngineConfigDTO globalEngineConfigDTO = new GlobalEngineConfigDTO(); // GlobalEngineConfigDTO | 
        try {
            GlobalEngineConfigDTO result = apiInstance.upsertGlobalEngineConfig(globalEngineConfigDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGlobalEngineControllerApi#upsertGlobalEngineConfig");
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
 **globalEngineConfigDTO** | [**GlobalEngineConfigDTO**](GlobalEngineConfigDTO.md)|  |

### Return type

[**GlobalEngineConfigDTO**](GlobalEngineConfigDTO.md)

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

