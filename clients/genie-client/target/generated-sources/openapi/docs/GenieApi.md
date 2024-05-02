# GenieApi

All URIs are relative to *http://genie:80*

Method | HTTP request | Description
------------- | ------------- | -------------
[**checkRequestStatus**](GenieApi.md#checkRequestStatus) | **GET** /status | Get status for a specific Genie request
[**checkRequestStatusOps**](GenieApi.md#checkRequestStatusOps) | **GET** /tessell-ops/status | Get status for a specific Genie request
[**disableGenie**](GenieApi.md#disableGenie) | **POST** /disable | Disable Genie for a specific database system
[**disableGenieOps**](GenieApi.md#disableGenieOps) | **POST** /tessell-ops/disable | Disable Genie for a specific database system
[**downloadGenieConnectionDetails**](GenieApi.md#downloadGenieConnectionDetails) | **GET** /download/connection-details | Downloads connection details
[**downloadGenieConnectionDetailsOps**](GenieApi.md#downloadGenieConnectionDetailsOps) | **GET** /tessell-ops/download/connection-details | Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.
[**enableGenie**](GenieApi.md#enableGenie) | **POST** /enable | Enable Genie for a specific database system
[**enableGenieOps**](GenieApi.md#enableGenieOps) | **POST** /tessell-ops/enable | Enable Genie for a specific database system Ops API
[**extendCurrentGenieRequest**](GenieApi.md#extendCurrentGenieRequest) | **PATCH** /extend | Extend Genie expiry time
[**extendCurrentGenieRequestOps**](GenieApi.md#extendCurrentGenieRequestOps) | **PATCH** /tessell-ops/extend | Extend Genie expiry time Ops
[**getAllRequests**](GenieApi.md#getAllRequests) | **GET** /request-access | Request access to VMs of a specific ÐB_SERVICE
[**getAllRequestsOps**](GenieApi.md#getAllRequestsOps) | **GET** /tessell-ops/request-access | Request access to VMs of a specific ÐB_SERVICE
[**requestAccess**](GenieApi.md#requestAccess) | **POST** /request-access | Request access to VMs of a specific ÐB_SERVICE
[**requestAccessOps**](GenieApi.md#requestAccessOps) | **POST** /tessell-ops/request-access | Request access to VMs of a specific ÐB_SERVICE Ops API
[**resendOTP**](GenieApi.md#resendOTP) | **POST** /tessell-ops/resendOTP | resend OTP
[**revokeActiveGenieRequests**](GenieApi.md#revokeActiveGenieRequests) | **DELETE** /tessell-ops/bulk-revoke | RevokeActiveGenieRequests
[**updateConnectivityCallback**](GenieApi.md#updateConnectivityCallback) | **PATCH** /tessell-ops/update-connectivity/callback | Update Genie status for ongoing request



## checkRequestStatus

> GenieResponse checkRequestStatus(requestId)

Get status for a specific Genie request

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String requestId = "requestId_example"; // String | Request ID of the Genie request
        try {
            GenieResponse result = apiInstance.checkRequestStatus(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#checkRequestStatus");
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
 **requestId** | **String**| Request ID of the Genie request | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## checkRequestStatusOps

> GenieResponse checkRequestStatusOps(requestId)

Get status for a specific Genie request

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String requestId = "requestId_example"; // String | Request ID of the Genie request
        try {
            GenieResponse result = apiInstance.checkRequestStatusOps(requestId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#checkRequestStatusOps");
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
 **requestId** | **String**| Request ID of the Genie request | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## disableGenie

> GenieResponse disableGenie(genieDisablePayload)

Disable Genie for a specific database system

Disable Genie for a specific database system

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        GenieDisablePayload genieDisablePayload = new GenieDisablePayload(); // GenieDisablePayload | 
        try {
            GenieResponse result = apiInstance.disableGenie(genieDisablePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#disableGenie");
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
 **genieDisablePayload** | [**GenieDisablePayload**](GenieDisablePayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## disableGenieOps

> GenieResponse disableGenieOps(genieDisablePayload)

Disable Genie for a specific database system

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        GenieDisablePayload genieDisablePayload = new GenieDisablePayload(); // GenieDisablePayload | 
        try {
            GenieResponse result = apiInstance.disableGenieOps(genieDisablePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#disableGenieOps");
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
 **genieDisablePayload** | [**GenieDisablePayload**](GenieDisablePayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## downloadGenieConnectionDetails

> File downloadGenieConnectionDetails(requestId, computeResourceId)

Downloads connection details

Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String requestId = "requestId_example"; // String | Request ID of the Genie request
        String computeResourceId = "computeResourceId_example"; // String | Compute Resource Id for which the Genie Access request is in context
        try {
            File result = apiInstance.downloadGenieConnectionDetails(requestId, computeResourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#downloadGenieConnectionDetails");
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
 **requestId** | **String**| Request ID of the Genie request | [optional]
 **computeResourceId** | **String**| Compute Resource Id for which the Genie Access request is in context | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## downloadGenieConnectionDetailsOps

> File downloadGenieConnectionDetailsOps(requestId, computeResourceId)

Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String requestId = "requestId_example"; // String | Request ID of the Genie request
        String computeResourceId = "computeResourceId_example"; // String | Compute Resource Id for which the Genie Access request is in context
        try {
            File result = apiInstance.downloadGenieConnectionDetailsOps(requestId, computeResourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#downloadGenieConnectionDetailsOps");
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
 **requestId** | **String**| Request ID of the Genie request | [optional]
 **computeResourceId** | **String**| Compute Resource Id for which the Genie Access request is in context | [optional]

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/zip, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## enableGenie

> GenieResponse enableGenie(tenantId, genieEnablePayload)

Enable Genie for a specific database system

Enables Genie for a specific database system

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieEnablePayload genieEnablePayload = new GenieEnablePayload(); // GenieEnablePayload | 
        try {
            GenieResponse result = apiInstance.enableGenie(tenantId, genieEnablePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#enableGenie");
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
 **genieEnablePayload** | [**GenieEnablePayload**](GenieEnablePayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## enableGenieOps

> GenieResponse enableGenieOps(tenantId, genieEnablePayload)

Enable Genie for a specific database system Ops API

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieEnablePayload genieEnablePayload = new GenieEnablePayload(); // GenieEnablePayload | 
        try {
            GenieResponse result = apiInstance.enableGenieOps(tenantId, genieEnablePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#enableGenieOps");
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
 **genieEnablePayload** | [**GenieEnablePayload**](GenieEnablePayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## extendCurrentGenieRequest

> GenieResponse extendCurrentGenieRequest(tenantId, genieRequestPatch)

Extend Genie expiry time

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieRequestPatch genieRequestPatch = new GenieRequestPatch(); // GenieRequestPatch | 
        try {
            GenieResponse result = apiInstance.extendCurrentGenieRequest(tenantId, genieRequestPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#extendCurrentGenieRequest");
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
 **genieRequestPatch** | [**GenieRequestPatch**](GenieRequestPatch.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## extendCurrentGenieRequestOps

> GenieResponse extendCurrentGenieRequestOps(tenantId, genieRequestPatch)

Extend Genie expiry time Ops

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieRequestPatch genieRequestPatch = new GenieRequestPatch(); // GenieRequestPatch | 
        try {
            GenieResponse result = apiInstance.extendCurrentGenieRequestOps(tenantId, genieRequestPatch);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#extendCurrentGenieRequestOps");
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
 **genieRequestPatch** | [**GenieRequestPatch**](GenieRequestPatch.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## getAllRequests

> List&lt;GenieResponse&gt; getAllRequests(serviceId, computeResourceId)

Request access to VMs of a specific ÐB_SERVICE

Request access to VMs of a specific ÐB_SERVICE

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String serviceId = "serviceId_example"; // String | DB Service Id for which the Genie Access request is in context
        String computeResourceId = "computeResourceId_example"; // String | Compute Resource Id for which the Genie Access request is in context
        try {
            List<GenieResponse> result = apiInstance.getAllRequests(serviceId, computeResourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#getAllRequests");
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
 **serviceId** | **String**| DB Service Id for which the Genie Access request is in context | [optional]
 **computeResourceId** | **String**| Compute Resource Id for which the Genie Access request is in context | [optional]

### Return type

[**List&lt;GenieResponse&gt;**](GenieResponse.md)

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


## getAllRequestsOps

> List&lt;GenieResponse&gt; getAllRequestsOps(serviceId, computeResourceId)

Request access to VMs of a specific ÐB_SERVICE

Request access to VMs of a specific ÐB_SERVICE

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String serviceId = "serviceId_example"; // String | DB Service Id for which the Genie Access request is in context
        String computeResourceId = "computeResourceId_example"; // String | Compute Resource Id for which the Genie Access request is in context
        try {
            List<GenieResponse> result = apiInstance.getAllRequestsOps(serviceId, computeResourceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#getAllRequestsOps");
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
 **serviceId** | **String**| DB Service Id for which the Genie Access request is in context | [optional]
 **computeResourceId** | **String**| Compute Resource Id for which the Genie Access request is in context | [optional]

### Return type

[**List&lt;GenieResponse&gt;**](GenieResponse.md)

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


## requestAccess

> GenieResponse requestAccess(tenantId, genieRequestPayload)

Request access to VMs of a specific ÐB_SERVICE

Request access to VMs of a specific ÐB_SERVICE

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieRequestPayload genieRequestPayload = new GenieRequestPayload(); // GenieRequestPayload | 
        try {
            GenieResponse result = apiInstance.requestAccess(tenantId, genieRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#requestAccess");
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
 **genieRequestPayload** | [**GenieRequestPayload**](GenieRequestPayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## requestAccessOps

> GenieResponse requestAccessOps(tenantId, genieRequestPayload)

Request access to VMs of a specific ÐB_SERVICE Ops API

Request access to VMs of a specific ÐB_SERVICE

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        GenieRequestPayload genieRequestPayload = new GenieRequestPayload(); // GenieRequestPayload | 
        try {
            GenieResponse result = apiInstance.requestAccessOps(tenantId, genieRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#requestAccessOps");
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
 **genieRequestPayload** | [**GenieRequestPayload**](GenieRequestPayload.md)|  | [optional]

### Return type

[**GenieResponse**](GenieResponse.md)

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


## resendOTP

> resendOTP(genieResendOTP)

resend OTP

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        GenieResendOTP genieResendOTP = new GenieResendOTP(); // GenieResendOTP | 
        try {
            apiInstance.resendOTP(genieResendOTP);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#resendOTP");
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
 **genieResendOTP** | [**GenieResendOTP**](GenieResendOTP.md)|  | [optional]

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
| **200** |  |  -  |
| **0** | API error response |  -  |


## revokeActiveGenieRequests

> List&lt;GenieResponse&gt; revokeActiveGenieRequests()

RevokeActiveGenieRequests

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        try {
            List<GenieResponse> result = apiInstance.revokeActiveGenieRequests();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#revokeActiveGenieRequests");
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

[**List&lt;GenieResponse&gt;**](GenieResponse.md)

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


## updateConnectivityCallback

> GenieResponse updateConnectivityCallback(updateConnectivityCallbackPayload)

Update Genie status for ongoing request

### Example

```java
// Import classes:
import com.tessell.genie.client.invoker.ApiClient;
import com.tessell.genie.client.invoker.ApiException;
import com.tessell.genie.client.invoker.Configuration;
import com.tessell.genie.client.invoker.models.*;
import com.tessell.genie.client.api.GenieApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://genie:80");

        GenieApi apiInstance = new GenieApi(defaultClient);
        UpdateConnectivityCallbackPayload updateConnectivityCallbackPayload = new UpdateConnectivityCallbackPayload(); // UpdateConnectivityCallbackPayload | 
        try {
            GenieResponse result = apiInstance.updateConnectivityCallback(updateConnectivityCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GenieApi#updateConnectivityCallback");
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
 **updateConnectivityCallbackPayload** | [**UpdateConnectivityCallbackPayload**](UpdateConnectivityCallbackPayload.md)|  |

### Return type

[**GenieResponse**](GenieResponse.md)

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

