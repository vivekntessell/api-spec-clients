# DapApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDapCallback**](DapApi.md#createDapCallback) | **POST** /tessell-ops/dmms/{dmmId}/access-policies/{dapId}/callback/create | Create DAP callback
[**createDmmAvailabilityPolicy**](DapApi.md#createDmmAvailabilityPolicy) | **POST** /availability-machines/{id}/access-policies | Create a new Access Policy for an Availability Machine
[**deleteDmmAvailabilityPolicy**](DapApi.md#deleteDmmAvailabilityPolicy) | **DELETE** /availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId} | Delete an Access Policy
[**getDapCatalog**](DapApi.md#getDapCatalog) | **GET** /tessell-ops/dmms/{dmmId}/availability-policies/{dapId}/catalog | View details about a Tessell DAP Catalog
[**getDapCatalogServiceView**](DapApi.md#getDapCatalogServiceView) | **GET** /availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId}/catalog | View details about a Tessell Dap Catalog
[**getDmmAvailabilityPolicies**](DapApi.md#getDmmAvailabilityPolicies) | **GET** /tessell-ops/dmms/{dmmId}/availability-policies | Request to get availability policies for Data Management Machines
[**getDmmAvailabilityPoliciesServiceView**](DapApi.md#getDmmAvailabilityPoliciesServiceView) | **GET** /availability-machines/{id}/access-policies | Get list of Access Policies (DAP) that are associated with an Availability Machine
[**getDmmAvailabilityPolicy**](DapApi.md#getDmmAvailabilityPolicy) | **GET** /tessell-ops/dmms/{dmmId}/availability-policies/{dapId} | Request to get an availability policy for Data Management Machines
[**getDmmAvailabilityPolicyServiceView**](DapApi.md#getDmmAvailabilityPolicyServiceView) | **GET** /availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId} | Get details about an Access Policy
[**updateDmmAvailabilityPolicy**](DapApi.md#updateDmmAvailabilityPolicy) | **PATCH** /tessell-ops/dmms/{dmmId}/availability-policies/{dapId} | Request to update an availability policy for Availability machine
[**updateDmmAvailabilityPolicyServiceView**](DapApi.md#updateDmmAvailabilityPolicyServiceView) | **PATCH** /availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId} | Update an Access Policy



## createDapCallback

> createDapCallback(dmmId, dapId, createDapCallbackPayload)

Create DAP callback

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of the availability machine
        UUID dapId = new UUID(); // UUID | ID of the DAP
        CreateDapCallbackPayload createDapCallbackPayload = new CreateDapCallbackPayload(); // CreateDapCallbackPayload | 
        try {
            apiInstance.createDapCallback(dmmId, dapId, createDapCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#createDapCallback");
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
 **dmmId** | [**UUID**](.md)| ID of the availability machine |
 **dapId** | [**UUID**](.md)| ID of the DAP |
 **createDapCallbackPayload** | [**CreateDapCallbackPayload**](CreateDapCallbackPayload.md)|  |

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


## createDmmAvailabilityPolicy

> TessellDapServiceDTO createDmmAvailabilityPolicy(id, createDapPayload)

Create a new Access Policy for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        CreateDapPayload createDapPayload = new CreateDapPayload(); // CreateDapPayload | 
        try {
            TessellDapServiceDTO result = apiInstance.createDmmAvailabilityPolicy(id, createDapPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#createDmmAvailabilityPolicy");
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
 **id** | [**UUID**](.md)| ID of the Availability Machine |
 **createDapPayload** | [**CreateDapPayload**](CreateDapPayload.md)|  |

### Return type

[**TessellDapServiceDTO**](TessellDapServiceDTO.md)

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


## deleteDmmAvailabilityPolicy

> ApiStatus deleteDmmAvailabilityPolicy(availabilityMachineId, accessPolicyId)

Delete an Access Policy

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID accessPolicyId = new UUID(); // UUID | ID of the Data Access Policy
        try {
            ApiStatus result = apiInstance.deleteDmmAvailabilityPolicy(availabilityMachineId, accessPolicyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#deleteDmmAvailabilityPolicy");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **accessPolicyId** | [**UUID**](.md)| ID of the Data Access Policy |

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


## getDapCatalog

> TessellDapCatalog getDapCatalog(dmmId, dapId, continuous, discrete, manual, automated, timeZone)

View details about a Tessell DAP Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dapId = new UUID(); // UUID | dapId
        Boolean continuous = true; // Boolean | continuous
        Boolean discrete = true; // Boolean | discrete
        Boolean manual = true; // Boolean | manual
        Boolean automated = true; // Boolean | automated
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDapCatalog result = apiInstance.getDapCatalog(dmmId, dapId, continuous, discrete, manual, automated, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDapCatalog");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dapId** | [**UUID**](.md)| dapId |
 **continuous** | **Boolean**| continuous | [optional] [default to true]
 **discrete** | **Boolean**| discrete | [optional] [default to true]
 **manual** | **Boolean**| manual | [optional] [default to true]
 **automated** | **Boolean**| automated | [optional] [default to true]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDapCatalog**](TessellDapCatalog.md)

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


## getDapCatalogServiceView

> TessellDapCatalogServiceView getDapCatalogServiceView(availabilityMachineId, accessPolicyId, continuous, discrete, manual, automated, timeZone)

View details about a Tessell Dap Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        UUID accessPolicyId = new UUID(); // UUID | Id of the Data Access Policy
        Boolean continuous = true; // Boolean | continuous
        Boolean discrete = true; // Boolean | discrete
        Boolean manual = true; // Boolean | manual
        Boolean automated = true; // Boolean | automated
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDapCatalogServiceView result = apiInstance.getDapCatalogServiceView(availabilityMachineId, accessPolicyId, continuous, discrete, manual, automated, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDapCatalogServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| Id of the Availability Machine |
 **accessPolicyId** | [**UUID**](.md)| Id of the Data Access Policy |
 **continuous** | **Boolean**| continuous | [optional] [default to true]
 **discrete** | **Boolean**| discrete | [optional] [default to true]
 **manual** | **Boolean**| manual | [optional] [default to true]
 **automated** | **Boolean**| automated | [optional] [default to true]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDapCatalogServiceView**](TessellDapCatalogServiceView.md)

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


## getDmmAvailabilityPolicies

> GetDapsApiResponse getDmmAvailabilityPolicies(dmmId, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone)

Request to get availability policies for Data Management Machines

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        String name = "name_example"; // String | DAP name
        List<String> types = Arrays.asList(); // List<String> | Dap Content Types
        List<DapStatus> statuses = Arrays.asList(); // List<DapStatus> | DAP status to filter upon
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDapsApiResponse result = apiInstance.getDmmAvailabilityPolicies(dmmId, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDmmAvailabilityPolicies");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **name** | **String**| DAP name | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Dap Content Types | [optional]
 **statuses** | [**List&lt;DapStatus&gt;**](DapStatus.md)| DAP status to filter upon | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDapsApiResponse**](GetDapsApiResponse.md)

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


## getDmmAvailabilityPoliciesServiceView

> GetDmmAvailabilityPoliciesServiceView getDmmAvailabilityPoliciesServiceView(id, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone)

Get list of Access Policies (DAP) that are associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        String name = "name_example"; // String | Filter the result based on Access Policy name
        List<String> types = Arrays.asList(); // List<String> | Filter the result based on Access Policy type
        List<DapStatus> statuses = Arrays.asList(); // List<DapStatus> | DAP status to filter upon
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDmmAvailabilityPoliciesServiceView result = apiInstance.getDmmAvailabilityPoliciesServiceView(id, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDmmAvailabilityPoliciesServiceView");
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
 **id** | [**UUID**](.md)| ID of the Availability Machine |
 **name** | **String**| Filter the result based on Access Policy name | [optional]
 **types** | [**List&lt;String&gt;**](String.md)| Filter the result based on Access Policy type | [optional]
 **statuses** | [**List&lt;DapStatus&gt;**](DapStatus.md)| DAP status to filter upon | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDmmAvailabilityPoliciesServiceView**](GetDmmAvailabilityPoliciesServiceView.md)

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


## getDmmAvailabilityPolicy

> TessellDapDTO getDmmAvailabilityPolicy(dmmId, dapId, loadAcls, timeZone)

Request to get an availability policy for Data Management Machines

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dapId = new UUID(); // UUID | dapId
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDapDTO result = apiInstance.getDmmAvailabilityPolicy(dmmId, dapId, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDmmAvailabilityPolicy");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dapId** | [**UUID**](.md)| dapId |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDapDTO**](TessellDapDTO.md)

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


## getDmmAvailabilityPolicyServiceView

> TessellDapServiceDTO getDmmAvailabilityPolicyServiceView(availabilityMachineId, accessPolicyId, loadAcls, timeZone)

Get details about an Access Policy

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID accessPolicyId = new UUID(); // UUID | ID of the Access Policy
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDapServiceDTO result = apiInstance.getDmmAvailabilityPolicyServiceView(availabilityMachineId, accessPolicyId, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#getDmmAvailabilityPolicyServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **accessPolicyId** | [**UUID**](.md)| ID of the Access Policy |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDapServiceDTO**](TessellDapServiceDTO.md)

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


## updateDmmAvailabilityPolicy

> TessellDapDTO updateDmmAvailabilityPolicy(dmmId, dapId, tessellDapDTO)

Request to update an availability policy for Availability machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dapId = new UUID(); // UUID | dapId
        TessellDapDTO tessellDapDTO = new TessellDapDTO(); // TessellDapDTO | 
        try {
            TessellDapDTO result = apiInstance.updateDmmAvailabilityPolicy(dmmId, dapId, tessellDapDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#updateDmmAvailabilityPolicy");
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
 **dmmId** | [**UUID**](.md)| ID of Availability machine |
 **dapId** | [**UUID**](.md)| dapId |
 **tessellDapDTO** | [**TessellDapDTO**](TessellDapDTO.md)|  |

### Return type

[**TessellDapDTO**](TessellDapDTO.md)

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


## updateDmmAvailabilityPolicyServiceView

> TessellDapServiceDTO updateDmmAvailabilityPolicyServiceView(availabilityMachineId, accessPolicyId, updateDapPayload)

Update an Access Policy

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DapApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DapApi apiInstance = new DapApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID accessPolicyId = new UUID(); // UUID | ID of the Access Policy
        UpdateDapPayload updateDapPayload = new UpdateDapPayload(); // UpdateDapPayload | 
        try {
            TessellDapServiceDTO result = apiInstance.updateDmmAvailabilityPolicyServiceView(availabilityMachineId, accessPolicyId, updateDapPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DapApi#updateDmmAvailabilityPolicyServiceView");
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
 **availabilityMachineId** | [**UUID**](.md)| ID of the Availability Machine |
 **accessPolicyId** | [**UUID**](.md)| ID of the Access Policy |
 **updateDapPayload** | [**UpdateDapPayload**](UpdateDapPayload.md)|  |

### Return type

[**TessellDapServiceDTO**](TessellDapServiceDTO.md)

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

