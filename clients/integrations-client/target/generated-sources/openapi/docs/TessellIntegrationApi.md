# TessellIntegrationApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIntegration**](TessellIntegrationApi.md#createIntegration) | **POST** /integrations/governance | Create a new Integration
[**createIntegrationAcls**](TessellIntegrationApi.md#createIntegrationAcls) | **PATCH** /integrations/governance/{id}/acls | Create/Update ACLs of an Integration
[**deleteIntegration**](TessellIntegrationApi.md#deleteIntegration) | **DELETE** /integrations/governance/{id} | Delete an Integration
[**getEligibleUsersForIntegration**](TessellIntegrationApi.md#getEligibleUsersForIntegration) | **GET** /integrations/governance/{id}/acls/eligible-users | Get a list of all users along with role they are eligible on an Integration
[**getIntegrationById**](TessellIntegrationApi.md#getIntegrationById) | **GET** /integrations/governance/{id} | Get active Integration Details by Id
[**getIntegrationByIdConsumerView**](TessellIntegrationApi.md#getIntegrationByIdConsumerView) | **GET** /integrations/{id} | Get active Integration by Id (consumer view)
[**getIntegrationByIdOps**](TessellIntegrationApi.md#getIntegrationByIdOps) | **GET** /tessell-ops/integrations/{id} | Get Integration by ID
[**getIntegrationTypeById**](TessellIntegrationApi.md#getIntegrationTypeById) | **GET** /integration-types/{id} | Get Integration Type by Id
[**getIntegrationTypes**](TessellIntegrationApi.md#getIntegrationTypes) | **GET** /integration-types | Get a list of supported Integration Types
[**getIntegrations**](TessellIntegrationApi.md#getIntegrations) | **GET** /integrations/governance | Get a list of active Integrations
[**getIntegrationsConsumerView**](TessellIntegrationApi.md#getIntegrationsConsumerView) | **GET** /integrations | Get a list of active Integrations (consumer view)
[**revokeIntegrationAcls**](TessellIntegrationApi.md#revokeIntegrationAcls) | **DELETE** /integrations/governance/{id}/acls | Revoke access of given users on an Integration
[**updateIntegration**](TessellIntegrationApi.md#updateIntegration) | **PATCH** /integrations/governance/{id}/{action} | Update an Integration



## createIntegration

> TessellTessellIntegrationDTODTO createIntegration(tenantId, tessellTessellIntegrationDTODTO)

Create a new Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellTessellIntegrationDTODTO tessellTessellIntegrationDTODTO = new TessellTessellIntegrationDTODTO(); // TessellTessellIntegrationDTODTO | 
        try {
            TessellTessellIntegrationDTODTO result = apiInstance.createIntegration(tenantId, tessellTessellIntegrationDTODTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#createIntegration");
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
 **tessellTessellIntegrationDTODTO** | [**TessellTessellIntegrationDTODTO**](TessellTessellIntegrationDTODTO.md)|  | [optional]

### Return type

[**TessellTessellIntegrationDTODTO**](TessellTessellIntegrationDTODTO.md)

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


## createIntegrationAcls

> TessellAclPayloadDTO createIntegrationAcls(id, tenantId, tessellAclPayloadDTO)

Create/Update ACLs of an Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellAclPayloadDTO tessellAclPayloadDTO = new TessellAclPayloadDTO(); // TessellAclPayloadDTO | 
        try {
            TessellAclPayloadDTO result = apiInstance.createIntegrationAcls(id, tenantId, tessellAclPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#createIntegrationAcls");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **tenantId** | **String**| Id of the Tenant |
 **tessellAclPayloadDTO** | [**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)|  | [optional]

### Return type

[**TessellAclPayloadDTO**](TessellAclPayloadDTO.md)

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


## deleteIntegration

> deleteIntegration(id, tenantId)

Delete an Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            apiInstance.deleteIntegration(id, tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#deleteIntegration");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **tenantId** | **String**| Id of the Tenant |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getEligibleUsersForIntegration

> List&lt;TessellAclEligibleUserDTO&gt; getEligibleUsersForIntegration(id, tenantId, role)

Get a list of all users along with role they are eligible on an Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        List<String> role = Arrays.asList(); // List<String> | Name of roles
        try {
            List<TessellAclEligibleUserDTO> result = apiInstance.getEligibleUsersForIntegration(id, tenantId, role);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getEligibleUsersForIntegration");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **tenantId** | **String**| Id of the Tenant |
 **role** | [**List&lt;String&gt;**](String.md)| Name of roles | [optional]

### Return type

[**List&lt;TessellAclEligibleUserDTO&gt;**](TessellAclEligibleUserDTO.md)

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


## getIntegrationById

> TessellTessellIntegrationDTODTO getIntegrationById(id, tenantId)

Get active Integration Details by Id

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellTessellIntegrationDTODTO result = apiInstance.getIntegrationById(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationById");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**TessellTessellIntegrationDTODTO**](TessellTessellIntegrationDTODTO.md)

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


## getIntegrationByIdConsumerView

> TessellTessellIntegrationDTODTO getIntegrationByIdConsumerView(id, tenantId)

Get active Integration by Id (consumer view)

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellTessellIntegrationDTODTO result = apiInstance.getIntegrationByIdConsumerView(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationByIdConsumerView");
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
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**TessellTessellIntegrationDTODTO**](TessellTessellIntegrationDTODTO.md)

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


## getIntegrationByIdOps

> TessellTessellIntegrationDTODTO getIntegrationByIdOps(id, tenantId)

Get Integration by ID

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellTessellIntegrationDTODTO result = apiInstance.getIntegrationByIdOps(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationByIdOps");
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
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**TessellTessellIntegrationDTODTO**](TessellTessellIntegrationDTODTO.md)

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


## getIntegrationTypeById

> TessellTessellIntegrationTypeDTODTO getIntegrationTypeById(id)

Get Integration Type by Id

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID
        try {
            TessellTessellIntegrationTypeDTODTO result = apiInstance.getIntegrationTypeById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationTypeById");
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
 **id** | [**UUID**](.md)| ID |

### Return type

[**TessellTessellIntegrationTypeDTODTO**](TessellTessellIntegrationTypeDTODTO.md)

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


## getIntegrationTypes

> TessellTessellIntegrationTypeListResponseDTO getIntegrationTypes(integrationType, pageSize, pageOffset)

Get a list of supported Integration Types

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        TessellTessellIntegrationTypeDTO integrationType = TessellTessellIntegrationTypeDTO.fromValue("DATADOG"); // TessellTessellIntegrationTypeDTO | integration-type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellTessellIntegrationTypeListResponseDTO result = apiInstance.getIntegrationTypes(integrationType, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationTypes");
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
 **integrationType** | [**TessellTessellIntegrationTypeDTO**](.md)| integration-type | [optional] [enum: DATADOG, SUMOLOGIC, NEWRELIC, QUALYS, OEM, SPLUNK]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellTessellIntegrationTypeListResponseDTO**](TessellTessellIntegrationTypeListResponseDTO.md)

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


## getIntegrations

> TessellTessellIntegrationListResponseDTO getIntegrations(tenantId, id, integrationType, includeSharedWithUsers, owners, pageSize, pageOffset)

Get a list of active Integrations

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID id = new UUID(); // UUID | ID of an Integration
        TessellTessellIntegrationTypeDTO integrationType = TessellTessellIntegrationTypeDTO.fromValue("DATADOG"); // TessellTessellIntegrationTypeDTO | Type of an Integration
        Boolean includeSharedWithUsers = true; // Boolean | Flag indicating if ACL information should be included for all entities
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellTessellIntegrationListResponseDTO result = apiInstance.getIntegrations(tenantId, id, integrationType, includeSharedWithUsers, owners, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrations");
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
 **id** | [**UUID**](.md)| ID of an Integration | [optional]
 **integrationType** | [**TessellTessellIntegrationTypeDTO**](.md)| Type of an Integration | [optional] [enum: DATADOG, SUMOLOGIC, NEWRELIC, QUALYS, OEM, SPLUNK]
 **includeSharedWithUsers** | **Boolean**| Flag indicating if ACL information should be included for all entities | [optional]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellTessellIntegrationListResponseDTO**](TessellTessellIntegrationListResponseDTO.md)

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


## getIntegrationsConsumerView

> TessellTessellIntegrationListResponseDTO getIntegrationsConsumerView(tenantId, integrationType, pageSize, pageOffset)

Get a list of active Integrations (consumer view)

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellTessellIntegrationTypeDTO integrationType = TessellTessellIntegrationTypeDTO.fromValue("DATADOG"); // TessellTessellIntegrationTypeDTO | integration-type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellTessellIntegrationListResponseDTO result = apiInstance.getIntegrationsConsumerView(tenantId, integrationType, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#getIntegrationsConsumerView");
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
 **integrationType** | [**TessellTessellIntegrationTypeDTO**](.md)| integration-type | [optional] [enum: DATADOG, SUMOLOGIC, NEWRELIC, QUALYS, OEM, SPLUNK]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellTessellIntegrationListResponseDTO**](TessellTessellIntegrationListResponseDTO.md)

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


## revokeIntegrationAcls

> TessellApiStatusDTO revokeIntegrationAcls(id, tenantId, tessellAclRevokePayloadDTO)

Revoke access of given users on an Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO = new TessellAclRevokePayloadDTO(); // TessellAclRevokePayloadDTO | 
        try {
            TessellApiStatusDTO result = apiInstance.revokeIntegrationAcls(id, tenantId, tessellAclRevokePayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#revokeIntegrationAcls");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **tenantId** | **String**| Id of the Tenant |
 **tessellAclRevokePayloadDTO** | [**TessellAclRevokePayloadDTO**](TessellAclRevokePayloadDTO.md)|  | [optional]

### Return type

[**TessellApiStatusDTO**](TessellApiStatusDTO.md)

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


## updateIntegration

> TessellApiStatusDTO updateIntegration(id, action, tenantId)

Update an Integration

### Example

```java
// Import classes:
import com.tessell.integrations.client.invoker.ApiClient;
import com.tessell.integrations.client.invoker.ApiException;
import com.tessell.integrations.client.invoker.Configuration;
import com.tessell.integrations.client.invoker.models.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of an Integration
        String action = "action_example"; // String | Update the integration maturity status as \"publish\" and \"unpublish\"
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellApiStatusDTO result = apiInstance.updateIntegration(id, action, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#updateIntegration");
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
 **id** | [**UUID**](.md)| ID of an Integration |
 **action** | **String**| Update the integration maturity status as \&quot;publish\&quot; and \&quot;unpublish\&quot; |
 **tenantId** | **String**| Id of the Tenant |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |

