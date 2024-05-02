# SlaApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSla**](SlaApi.md#createSla) | **POST** /availability-machines/governance/slas | Create a new Availability Machine SLA
[**createSlaAcls**](SlaApi.md#createSlaAcls) | **PATCH** /availability-machines/governance/slas/{name}/acls | Create or update ACLs for an Availability Machine SLA
[**createSlaOps**](SlaApi.md#createSlaOps) | **POST** /tessell-ops/dmms/slas | Creates a new Availability Machine SLA
[**deleteSlaServiceView**](SlaApi.md#deleteSlaServiceView) | **DELETE** /availability-machines/governance/slas/{name} | Deletes an Availability Machine SLA
[**getEligibleUsersForSla**](SlaApi.md#getEligibleUsersForSla) | **GET** /availability-machines/governance/slas/{name}/acls/eligible-users | Get list of users which are eligible to grant access for the SLAs
[**getSchedulesOps**](SlaApi.md#getSchedulesOps) | **GET** /tessell-ops/dmms/schedules | View a list of available Tessell Availability Machine Schedules
[**getSlaConsumptionView**](SlaApi.md#getSlaConsumptionView) | **GET** /availability-machines/slas/{name} | Get details about an Availability Machine SLA
[**getSlaOps**](SlaApi.md#getSlaOps) | **GET** /tessell-ops/dmms/slas/{id} | View a Tessell Availability Machine SLA by id
[**getSlaServiceView**](SlaApi.md#getSlaServiceView) | **GET** /availability-machines/governance/slas/{name} | Get details of an Availability Machine SLA, for Governance activities
[**getSlaUsage**](SlaApi.md#getSlaUsage) | **GET** /availability-machines/governance/slas/{name}/usage | Get details of Availability Machines which are using the SLA
[**getSlasConsumptionView**](SlaApi.md#getSlasConsumptionView) | **GET** /availability-machines/slas | Get a list of Availability Machine SLAs
[**getSlasOps**](SlaApi.md#getSlasOps) | **GET** /tessell-ops/dmms/slas | View a list of available Tessell Availability Machine SLAs
[**getSlasServiceView**](SlaApi.md#getSlasServiceView) | **GET** /availability-machines/governance/slas | Get a list of Availability Machine SLAs, for Governance activities
[**revokeSlaAcls**](SlaApi.md#revokeSlaAcls) | **DELETE** /availability-machines/governance/slas/{name}/acls | Revoke ACLs for an Availability Machine SLA
[**updateScheduleOps**](SlaApi.md#updateScheduleOps) | **PUT** /tessell-ops/dmms/schedules/{id} | Update a Tessell Availability Machine Schedule
[**updateSlaMaturityStatus**](SlaApi.md#updateSlaMaturityStatus) | **PATCH** /availability-machines/governance/slas/{name}/{action} | Update the SLA maturity status
[**updateSlaServiceView**](SlaApi.md#updateSlaServiceView) | **PUT** /availability-machines/governance/slas/{name} | Updates an Availability Machine SLA



## createSla

> TamSlaServiceView createSla(tamSlaCreateUpdatePayload)

Create a new Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload = new TamSlaCreateUpdatePayload(); // TamSlaCreateUpdatePayload | 
        try {
            TamSlaServiceView result = apiInstance.createSla(tamSlaCreateUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#createSla");
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
 **tamSlaCreateUpdatePayload** | [**TamSlaCreateUpdatePayload**](TamSlaCreateUpdatePayload.md)|  |

### Return type

[**TamSlaServiceView**](TamSlaServiceView.md)

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


## createSlaAcls

> AclPayload createSlaAcls(name, aclPayload)

Create or update ACLs for an Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the Availability Machine SLA
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.createSlaAcls(name, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#createSlaAcls");
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
 **name** | **String**| Name of the Availability Machine SLA |
 **aclPayload** | [**AclPayload**](AclPayload.md)|  |

### Return type

[**AclPayload**](AclPayload.md)

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


## createSlaOps

> TamSla createSlaOps(tamSlaCreateUpdatePayloadOps)

Creates a new Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        TamSlaCreateUpdatePayloadOps tamSlaCreateUpdatePayloadOps = new TamSlaCreateUpdatePayloadOps(); // TamSlaCreateUpdatePayloadOps | 
        try {
            TamSla result = apiInstance.createSlaOps(tamSlaCreateUpdatePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#createSlaOps");
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
 **tamSlaCreateUpdatePayloadOps** | [**TamSlaCreateUpdatePayloadOps**](TamSlaCreateUpdatePayloadOps.md)|  |

### Return type

[**TamSla**](TamSla.md)

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


## deleteSlaServiceView

> ApiStatus deleteSlaServiceView(name)

Deletes an Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        try {
            ApiStatus result = apiInstance.deleteSlaServiceView(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#deleteSlaServiceView");
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
 **name** | **String**| Name of the SLA |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getEligibleUsersForSla

> List&lt;AclEligibleUser&gt; getEligibleUsersForSla(name, roles)

Get list of users which are eligible to grant access for the SLAs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        List<String> roles = Arrays.asList(); // List<String> | Filter the result based of the specified roles
        try {
            List<AclEligibleUser> result = apiInstance.getEligibleUsersForSla(name, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getEligibleUsersForSla");
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
 **name** | **String**| Name of the SLA |
 **roles** | [**List&lt;String&gt;**](String.md)| Filter the result based of the specified roles | [optional]

### Return type

[**List&lt;AclEligibleUser&gt;**](AclEligibleUser.md)

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


## getSchedulesOps

> GetSchedulesOps getSchedulesOps(pageSize, pageOffset, timeZone)

View a list of available Tessell Availability Machine Schedules

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSchedulesOps result = apiInstance.getSchedulesOps(pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSchedulesOps");
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
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSchedulesOps**](GetSchedulesOps.md)

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


## getSlaConsumptionView

> TamSlaConsumptionView getSlaConsumptionView(name, timeZone)

Get details about an Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TamSlaConsumptionView result = apiInstance.getSlaConsumptionView(name, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlaConsumptionView");
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
 **name** | **String**| Name of the SLA |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TamSlaConsumptionView**](TamSlaConsumptionView.md)

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


## getSlaOps

> TamSla getSlaOps(id, tenantId, loadAcls, timeZone)

View a Tessell Availability Machine SLA by id

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant-id
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TamSla result = apiInstance.getSlaOps(id, tenantId, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlaOps");
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
 **id** | [**UUID**](.md)| id |
 **tenantId** | **String**| tenant-id | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TamSla**](TamSla.md)

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


## getSlaServiceView

> TamSlaServiceView getSlaServiceView(name, loadAcls, timeZone)

Get details of an Availability Machine SLA, for Governance activities

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | name
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TamSlaServiceView result = apiInstance.getSlaServiceView(name, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlaServiceView");
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
 **name** | **String**| name |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TamSlaServiceView**](TamSlaServiceView.md)

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


## getSlaUsage

> GetSlaUsageView getSlaUsage(name, pageSize, pageOffset, timeZone)

Get details of Availability Machines which are using the SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | name
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSlaUsageView result = apiInstance.getSlaUsage(name, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlaUsage");
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
 **name** | **String**| name |
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSlaUsageView**](GetSlaUsageView.md)

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


## getSlasConsumptionView

> GetSlasConsumptionView getSlasConsumptionView(pitrEnabled, pageSize, pageOffset, timeZone)

Get a list of Availability Machine SLAs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        Boolean pitrEnabled = true; // Boolean | If true, it will return all of the SLAs where PITR is non-zero. If false, it will return all SLAs where PITR is zero. If not specified, it will return all of the SLAs irrespective of PITR retention.
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSlasConsumptionView result = apiInstance.getSlasConsumptionView(pitrEnabled, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlasConsumptionView");
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
 **pitrEnabled** | **Boolean**| If true, it will return all of the SLAs where PITR is non-zero. If false, it will return all SLAs where PITR is zero. If not specified, it will return all of the SLAs irrespective of PITR retention. | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSlasConsumptionView**](GetSlasConsumptionView.md)

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


## getSlasOps

> GetSlasOps getSlasOps(name, tenantId, loadAcls, pageSize, pageOffset, timeZone)

View a list of available Tessell Availability Machine SLAs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | name
        String tenantId = "tenantId_example"; // String | tenant-id
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSlasOps result = apiInstance.getSlasOps(name, tenantId, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlasOps");
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
 **name** | **String**| name | [optional]
 **tenantId** | **String**| tenant-id | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSlasOps**](GetSlasOps.md)

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


## getSlasServiceView

> GetSlasServiceView getSlasServiceView(loadAcls, pageSize, pageOffset, timeZone)

Get a list of Availability Machine SLAs, for Governance activities

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSlasServiceView result = apiInstance.getSlasServiceView(loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#getSlasServiceView");
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
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSlasServiceView**](GetSlasServiceView.md)

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


## revokeSlaAcls

> ApiStatus revokeSlaAcls(name, aclRevokePayload)

Revoke ACLs for an Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeSlaAcls(name, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#revokeSlaAcls");
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
 **name** | **String**| Name of the SLA |
 **aclRevokePayload** | [**AclRevokePayload**](AclRevokePayload.md)|  |

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
| **0** | API error response |  -  |


## updateScheduleOps

> TamSchedule updateScheduleOps(id, tamSchedule)

Update a Tessell Availability Machine Schedule

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TamSchedule tamSchedule = new TamSchedule(); // TamSchedule | 
        try {
            TamSchedule result = apiInstance.updateScheduleOps(id, tamSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#updateScheduleOps");
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
 **id** | [**UUID**](.md)| id |
 **tamSchedule** | [**TamSchedule**](TamSchedule.md)|  |

### Return type

[**TamSchedule**](TamSchedule.md)

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


## updateSlaMaturityStatus

> ApiStatus updateSlaMaturityStatus(name, action)

Update the SLA maturity status

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        String action = "action_example"; // String | Update maturity status as per the action, allowed actions are - DRAFT, PUBLISH, or UNPUBLISH
        try {
            ApiStatus result = apiInstance.updateSlaMaturityStatus(name, action);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#updateSlaMaturityStatus");
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
 **name** | **String**| Name of the SLA |
 **action** | **String**| Update maturity status as per the action, allowed actions are - DRAFT, PUBLISH, or UNPUBLISH |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## updateSlaServiceView

> TamSlaServiceView updateSlaServiceView(name, tamSlaCreateUpdatePayload)

Updates an Availability Machine SLA

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.SlaApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        SlaApi apiInstance = new SlaApi(defaultClient);
        String name = "name_example"; // String | Name of the SLA
        TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload = new TamSlaCreateUpdatePayload(); // TamSlaCreateUpdatePayload | 
        try {
            TamSlaServiceView result = apiInstance.updateSlaServiceView(name, tamSlaCreateUpdatePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlaApi#updateSlaServiceView");
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
 **name** | **String**| Name of the SLA |
 **tamSlaCreateUpdatePayload** | [**TamSlaCreateUpdatePayload**](TamSlaCreateUpdatePayload.md)|  |

### Return type

[**TamSlaServiceView**](TamSlaServiceView.md)

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

