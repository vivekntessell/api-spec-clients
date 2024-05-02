# TessellGatewayServiceControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteTenantStream**](TessellGatewayServiceControllerApi.md#deleteTenantStream) | **DELETE** /tessell-ops/tenants/{tenantId}/stream | Delete stream for Tenant
[**deregisterTenantAccount**](TessellGatewayServiceControllerApi.md#deregisterTenantAccount) | **DELETE** /tessell-ops/tenants/{tenantId}/register | Deregister Account for Tenant
[**getCommandStatus**](TessellGatewayServiceControllerApi.md#getCommandStatus) | **GET** /status/{taId}/{executionId} | Get the status of a command
[**getTessellAgentStatus**](TessellGatewayServiceControllerApi.md#getTessellAgentStatus) | **GET** /ta-status/{taId} | Get the status of a command
[**getTessellAgentToken**](TessellGatewayServiceControllerApi.md#getTessellAgentToken) | **GET** /tessell-ops/agent/{deploymentId}/token | Get Tessell Agent Token
[**initializeTenantStream**](TessellGatewayServiceControllerApi.md#initializeTenantStream) | **POST** /tessell-ops/tenants/{tenantId}/stream | Initialize stream for Tenant
[**publishTenantServicesUpgrade**](TessellGatewayServiceControllerApi.md#publishTenantServicesUpgrade) | **POST** /tessell-ops/tenants/{tenantId}/upgrade | Publish Upgrade message for Tenant Services
[**readRemoteFile**](TessellGatewayServiceControllerApi.md#readRemoteFile) | **GET** /read-file/{taId} | Read a file from DB VM.
[**registerTenantAccount**](TessellGatewayServiceControllerApi.md#registerTenantAccount) | **POST** /tessell-ops/tenants/{tenantId}/register | Register Account for Tenant
[**scrape**](TessellGatewayServiceControllerApi.md#scrape) | **GET** /scrape | Scrape TA for DB metrics.
[**sendCommand**](TessellGatewayServiceControllerApi.md#sendCommand) | **POST** /command | Send a new command to a DB VM.
[**sendCurlRequest**](TessellGatewayServiceControllerApi.md#sendCurlRequest) | **POST** /curl | Send a curl command request to a monitoring VM.
[**upgradeLibrary**](TessellGatewayServiceControllerApi.md#upgradeLibrary) | **PUT** /upgrade-library/{taId} | Upgrade a library in the vm



## deleteTenantStream

> deleteTenantStream(tenantId)

Delete stream for Tenant

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        try {
            apiInstance.deleteTenantStream(tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#deleteTenantStream");
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
 **tenantId** | [**UUID**](.md)|  |

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


## deregisterTenantAccount

> deregisterTenantAccount(tenantId)

Deregister Account for Tenant

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        try {
            apiInstance.deregisterTenantAccount(tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#deregisterTenantAccount");
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
 **tenantId** | [**UUID**](.md)|  |

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


## getCommandStatus

> CommandStatusResponse getCommandStatus(taId, executionId)

Get the status of a command

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        String taId = "taId_example"; // String | 
        String executionId = "executionId_example"; // String | 
        try {
            CommandStatusResponse result = apiInstance.getCommandStatus(taId, executionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#getCommandStatus");
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
 **taId** | **String**|  |
 **executionId** | **String**|  |

### Return type

[**CommandStatusResponse**](CommandStatusResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **0** | API error response |  -  |


## getTessellAgentStatus

> getTessellAgentStatus(taId)

Get the status of a command

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        String taId = "taId_example"; // String | 
        try {
            apiInstance.getTessellAgentStatus(taId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#getTessellAgentStatus");
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
 **taId** | **String**|  |

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


## getTessellAgentToken

> GetTessellAgentTokenResponse getTessellAgentToken(deploymentId, agentType, tenantId)

Get Tessell Agent Token

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID deploymentId = new UUID(); // UUID | 
        AgentType agentType = AgentType.fromValue("DB_SERVICE"); // AgentType | 
        String tenantId = "tenantId_example"; // String | 
        try {
            GetTessellAgentTokenResponse result = apiInstance.getTessellAgentToken(deploymentId, agentType, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#getTessellAgentToken");
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
 **deploymentId** | [**UUID**](.md)|  |
 **agentType** | [**AgentType**](.md)|  | [enum: DB_SERVICE, MONITORING]
 **tenantId** | **String**|  |

### Return type

[**GetTessellAgentTokenResponse**](GetTessellAgentTokenResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | API error response |  -  |


## initializeTenantStream

> initializeTenantStream(tenantId)

Initialize stream for Tenant

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        try {
            apiInstance.initializeTenantStream(tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#initializeTenantStream");
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
 **tenantId** | [**UUID**](.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## publishTenantServicesUpgrade

> publishTenantServicesUpgrade(tenantId, publishTenantServicesUpgradeRequest)

Publish Upgrade message for Tenant Services

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        PublishTenantServicesUpgradeRequest publishTenantServicesUpgradeRequest = new PublishTenantServicesUpgradeRequest(); // PublishTenantServicesUpgradeRequest | 
        try {
            apiInstance.publishTenantServicesUpgrade(tenantId, publishTenantServicesUpgradeRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#publishTenantServicesUpgrade");
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
 **tenantId** | [**UUID**](.md)|  |
 **publishTenantServicesUpgradeRequest** | [**PublishTenantServicesUpgradeRequest**](PublishTenantServicesUpgradeRequest.md)|  | [optional]

### Return type

null (empty response body)

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


## readRemoteFile

> ReadFileResponse readRemoteFile(taId, filePath, lineLimit, offset)

Read a file from DB VM.

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        String taId = "taId_example"; // String | 
        String filePath = "filePath_example"; // String | 
        Integer lineLimit = 200; // Integer | 
        Integer offset = 0; // Integer | 
        try {
            ReadFileResponse result = apiInstance.readRemoteFile(taId, filePath, lineLimit, offset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#readRemoteFile");
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
 **taId** | **String**|  |
 **filePath** | **String**|  |
 **lineLimit** | **Integer**|  | [optional] [default to 200]
 **offset** | **Integer**|  | [optional] [default to 0]

### Return type

[**ReadFileResponse**](ReadFileResponse.md)

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


## registerTenantAccount

> RegisterTenantAccountResponse registerTenantAccount(tenantId)

Register Account for Tenant

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        try {
            RegisterTenantAccountResponse result = apiInstance.registerTenantAccount(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#registerTenantAccount");
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
 **tenantId** | [**UUID**](.md)|  |

### Return type

[**RegisterTenantAccountResponse**](RegisterTenantAccountResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **0** | API error response |  -  |


## scrape

> List&lt;String&gt; scrape()

Scrape TA for DB metrics.

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        try {
            List<String> result = apiInstance.scrape();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#scrape");
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

**List&lt;String&gt;**

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


## sendCommand

> sendCommand(command)

Send a new command to a DB VM.

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        Command command = new Command(); // Command | 
        try {
            apiInstance.sendCommand(command);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#sendCommand");
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
 **command** | [**Command**](Command.md)|  | [optional]

### Return type

null (empty response body)

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


## sendCurlRequest

> CurlResponse sendCurlRequest(curlRequest)

Send a curl command request to a monitoring VM.

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        CurlRequest curlRequest = new CurlRequest(); // CurlRequest | 
        try {
            CurlResponse result = apiInstance.sendCurlRequest(curlRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#sendCurlRequest");
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
 **curlRequest** | [**CurlRequest**](CurlRequest.md)|  | [optional]

### Return type

[**CurlResponse**](CurlResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | SUCCESS |  -  |
| **0** | API error response |  -  |


## upgradeLibrary

> upgradeLibrary(taId, upgradeLibraryPayload)

Upgrade a library in the vm

### Example

```java
// Import classes:
import com.tessell.gateway.client.invoker.ApiClient;
import com.tessell.gateway.client.invoker.ApiException;
import com.tessell.gateway.client.invoker.Configuration;
import com.tessell.gateway.client.invoker.models.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        String taId = "taId_example"; // String | 
        UpgradeLibraryPayload upgradeLibraryPayload = new UpgradeLibraryPayload(); // UpgradeLibraryPayload | 
        try {
            apiInstance.upgradeLibrary(taId, upgradeLibraryPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#upgradeLibrary");
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
 **taId** | **String**|  |
 **upgradeLibraryPayload** | [**UpgradeLibraryPayload**](UpgradeLibraryPayload.md)|  | [optional]

### Return type

null (empty response body)

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

