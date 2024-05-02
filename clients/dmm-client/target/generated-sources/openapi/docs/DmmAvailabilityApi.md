# DmmAvailabilityApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**associateAvailabilityMachineSla**](DmmAvailabilityApi.md#associateAvailabilityMachineSla) | **POST** /availability-machines/{id}/sla | Associate SLA and Schedule to an Availability Machine
[**deleteDmmAvailabilityOps**](DmmAvailabilityApi.md#deleteDmmAvailabilityOps) | **DELETE** /tessell-ops/dmms/{dmmId}/availability | Deletes availability associated with an Availability Machine
[**getAvailabilityMachineSla**](DmmAvailabilityApi.md#getAvailabilityMachineSla) | **GET** /availability-machines/{id}/sla | Get the SLA and Schedule associated with an Availability Machine
[**getDmmAvailabilityOps**](DmmAvailabilityApi.md#getDmmAvailabilityOps) | **GET** /tessell-ops/dmms/{dmmId}/availability | Get availability details associated with an Availability Machine
[**refreshDmmTopologyOps**](DmmAvailabilityApi.md#refreshDmmTopologyOps) | **POST** /tessell-ops/dmms/{dmmId}/refresh-topology | Request to refresh the topology information
[**updateAvailabilityMachineSla**](DmmAvailabilityApi.md#updateAvailabilityMachineSla) | **PATCH** /availability-machines/{id}/sla | Update SLA association for an Availability Machine
[**updateDmmAvailabilityOps**](DmmAvailabilityApi.md#updateDmmAvailabilityOps) | **PATCH** /tessell-ops/dmms/{dmmId}/availability | Updates availability associated with an Availability Machine



## associateAvailabilityMachineSla

> TessellDmmAvailabilityServiceView associateAvailabilityMachineSla(id, createUpdateDmmAvailabilityPayload)

Associate SLA and Schedule to an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload = new CreateUpdateDmmAvailabilityPayload(); // CreateUpdateDmmAvailabilityPayload | 
        try {
            TessellDmmAvailabilityServiceView result = apiInstance.associateAvailabilityMachineSla(id, createUpdateDmmAvailabilityPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#associateAvailabilityMachineSla");
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
 **createUpdateDmmAvailabilityPayload** | [**CreateUpdateDmmAvailabilityPayload**](CreateUpdateDmmAvailabilityPayload.md)|  |

### Return type

[**TessellDmmAvailabilityServiceView**](TessellDmmAvailabilityServiceView.md)

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


## deleteDmmAvailabilityOps

> ApiStatus deleteDmmAvailabilityOps(dmmId, cloudAccountId, cloudLocation)

Deletes availability associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID cloudAccountId = new UUID(); // UUID | cloud-account-id
        String cloudLocation = ""; // String | cloud-location
        try {
            ApiStatus result = apiInstance.deleteDmmAvailabilityOps(dmmId, cloudAccountId, cloudLocation);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#deleteDmmAvailabilityOps");
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
 **cloudAccountId** | [**UUID**](.md)| cloud-account-id | [optional]
 **cloudLocation** | **String**| cloud-location | [optional] [default to ]

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


## getAvailabilityMachineSla

> TessellDmmAvailabilityServiceView getAvailabilityMachineSla(id)

Get the SLA and Schedule associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        try {
            TessellDmmAvailabilityServiceView result = apiInstance.getAvailabilityMachineSla(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#getAvailabilityMachineSla");
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

### Return type

[**TessellDmmAvailabilityServiceView**](TessellDmmAvailabilityServiceView.md)

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


## getDmmAvailabilityOps

> TessellDmmAvailabilityDTO getDmmAvailabilityOps(dmmId)

Get availability details associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        try {
            TessellDmmAvailabilityDTO result = apiInstance.getDmmAvailabilityOps(dmmId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#getDmmAvailabilityOps");
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

### Return type

[**TessellDmmAvailabilityDTO**](TessellDmmAvailabilityDTO.md)

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


## refreshDmmTopologyOps

> RefreshTopologyResponseOps refreshDmmTopologyOps(dmmId)

Request to refresh the topology information

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        try {
            RefreshTopologyResponseOps result = apiInstance.refreshDmmTopologyOps(dmmId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#refreshDmmTopologyOps");
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

### Return type

[**RefreshTopologyResponseOps**](RefreshTopologyResponseOps.md)

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


## updateAvailabilityMachineSla

> TessellDmmAvailabilityServiceView updateAvailabilityMachineSla(id, createUpdateDmmAvailabilityPayload)

Update SLA association for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload = new CreateUpdateDmmAvailabilityPayload(); // CreateUpdateDmmAvailabilityPayload | 
        try {
            TessellDmmAvailabilityServiceView result = apiInstance.updateAvailabilityMachineSla(id, createUpdateDmmAvailabilityPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#updateAvailabilityMachineSla");
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
 **id** | [**UUID**](.md)| Id of the Availability Machine |
 **createUpdateDmmAvailabilityPayload** | [**CreateUpdateDmmAvailabilityPayload**](CreateUpdateDmmAvailabilityPayload.md)|  |

### Return type

[**TessellDmmAvailabilityServiceView**](TessellDmmAvailabilityServiceView.md)

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


## updateDmmAvailabilityOps

> TessellDmmAvailabilityDTO updateDmmAvailabilityOps(dmmId, tessellDmmAvailabilityDTO)

Updates availability associated with an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmAvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmAvailabilityApi apiInstance = new DmmAvailabilityApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        TessellDmmAvailabilityDTO tessellDmmAvailabilityDTO = new TessellDmmAvailabilityDTO(); // TessellDmmAvailabilityDTO | 
        try {
            TessellDmmAvailabilityDTO result = apiInstance.updateDmmAvailabilityOps(dmmId, tessellDmmAvailabilityDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmAvailabilityApi#updateDmmAvailabilityOps");
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
 **tessellDmmAvailabilityDTO** | [**TessellDmmAvailabilityDTO**](TessellDmmAvailabilityDTO.md)|  |

### Return type

[**TessellDmmAvailabilityDTO**](TessellDmmAvailabilityDTO.md)

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

