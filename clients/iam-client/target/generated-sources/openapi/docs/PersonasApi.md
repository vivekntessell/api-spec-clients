# PersonasApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeletePersonas**](PersonasApi.md#bulkDeletePersonas) | **DELETE** /tessell-ops/iam/personas/bulk-delete | Bulk delete Personas
[**createPersona**](PersonasApi.md#createPersona) | **POST** /iam/personas | Create a new Persona
[**deletePersona**](PersonasApi.md#deletePersona) | **DELETE** /iam/personas/{name} | Delete a Persona
[**getPersonas**](PersonasApi.md#getPersonas) | **GET** /iam/personas | Get a list of Personas
[**getStatusOfBulkDeletePersonas**](PersonasApi.md#getStatusOfBulkDeletePersonas) | **POST** /tessell-ops/iam/personas/bulk-delete | Get status of bulk deletion of Personas
[**getUpgradablePersonas**](PersonasApi.md#getUpgradablePersonas) | **GET** /iam/personas/upgradable-personas | Get upgradable list of Personas for all the Personas
[**updatePersona**](PersonasApi.md#updatePersona) | **PATCH** /iam/personas/{name} | Update a Persona



## bulkDeletePersonas

> TessellResourceBulkDeleteResponseOps bulkDeletePersonas(tessellResourceBulkDeletePayloadOps)

Bulk delete Personas

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.bulkDeletePersonas(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#bulkDeletePersonas");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## createPersona

> TessellPersonaDTO createPersona(tenantId, tessellCreatePersonaPayload)

Create a new Persona

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellCreatePersonaPayload tessellCreatePersonaPayload = new TessellCreatePersonaPayload(); // TessellCreatePersonaPayload | 
        try {
            TessellPersonaDTO result = apiInstance.createPersona(tenantId, tessellCreatePersonaPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#createPersona");
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
 **tessellCreatePersonaPayload** | [**TessellCreatePersonaPayload**](TessellCreatePersonaPayload.md)|  | [optional]

### Return type

[**TessellPersonaDTO**](TessellPersonaDTO.md)

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


## deletePersona

> TessellApiStatus deletePersona(tenantId, name)

Delete a Persona

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String name = "DBAdmins"; // String | name
        try {
            TessellApiStatus result = apiInstance.deletePersona(tenantId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#deletePersona");
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
 **name** | **String**| name |

### Return type

[**TessellApiStatus**](TessellApiStatus.md)

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


## getPersonas

> TessellIamApiResponse getPersonas(tenantId, loadApps, loadPrivileges, status, consumerType)

Get a list of Personas

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        Boolean loadApps = false; // Boolean | Flag to include/exclude Application details in response
        Boolean loadPrivileges = false; // Boolean | Flag to include/exclude Privilege details in response (only applicable when consumer-type is OPS)
        List<TessellPersonaStatus> status = Arrays.asList(); // List<TessellPersonaStatus> | Filter by status
        TessellConsumerType consumerType = TessellConsumerType.fromValue("OPS"); // TessellConsumerType | consumer-type
        try {
            TessellIamApiResponse result = apiInstance.getPersonas(tenantId, loadApps, loadPrivileges, status, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#getPersonas");
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
 **loadApps** | **Boolean**| Flag to include/exclude Application details in response | [optional] [default to false]
 **loadPrivileges** | **Boolean**| Flag to include/exclude Privilege details in response (only applicable when consumer-type is OPS) | [optional] [default to false]
 **status** | [**List&lt;TessellPersonaStatus&gt;**](TessellPersonaStatus.md)| Filter by status | [optional]
 **consumerType** | [**TessellConsumerType**](.md)| consumer-type | [optional] [enum: OPS, SERVICE]

### Return type

[**TessellIamApiResponse**](TessellIamApiResponse.md)

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


## getStatusOfBulkDeletePersonas

> TessellResourceBulkDeleteResponseOps getStatusOfBulkDeletePersonas(tessellResourceBulkDeletePayloadOps)

Get status of bulk deletion of Personas

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps = new TessellResourceBulkDeletePayloadOps(); // TessellResourceBulkDeletePayloadOps | 
        try {
            TessellResourceBulkDeleteResponseOps result = apiInstance.getStatusOfBulkDeletePersonas(tessellResourceBulkDeletePayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#getStatusOfBulkDeletePersonas");
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
 **tessellResourceBulkDeletePayloadOps** | [**TessellResourceBulkDeletePayloadOps**](TessellResourceBulkDeletePayloadOps.md)|  | [optional]

### Return type

[**TessellResourceBulkDeleteResponseOps**](TessellResourceBulkDeleteResponseOps.md)

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


## getUpgradablePersonas

> TessellUpgradablePersonaApiResponse getUpgradablePersonas(tenantId)

Get upgradable list of Personas for all the Personas

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellUpgradablePersonaApiResponse result = apiInstance.getUpgradablePersonas(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#getUpgradablePersonas");
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

### Return type

[**TessellUpgradablePersonaApiResponse**](TessellUpgradablePersonaApiResponse.md)

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


## updatePersona

> TessellPersonaDTO updatePersona(tenantId, name, tessellUpdatePersonaPayload)

Update a Persona

### Example

```java
// Import classes:
import com.tessell.iam.client.invoker.ApiClient;
import com.tessell.iam.client.invoker.ApiException;
import com.tessell.iam.client.invoker.Configuration;
import com.tessell.iam.client.invoker.models.*;
import com.tessell.iam.client.api.PersonasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        PersonasApi apiInstance = new PersonasApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String name = "DBAdmins"; // String | name
        TessellUpdatePersonaPayload tessellUpdatePersonaPayload = new TessellUpdatePersonaPayload(); // TessellUpdatePersonaPayload | 
        try {
            TessellPersonaDTO result = apiInstance.updatePersona(tenantId, name, tessellUpdatePersonaPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PersonasApi#updatePersona");
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
 **name** | **String**| name |
 **tessellUpdatePersonaPayload** | [**TessellUpdatePersonaPayload**](TessellUpdatePersonaPayload.md)|  | [optional]

### Return type

[**TessellPersonaDTO**](TessellPersonaDTO.md)

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

