# TessellCloudAccountControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCloudAccount**](TessellCloudAccountControllerApi.md#addCloudAccount) | **POST** /cloud-accounts/i | Add a cloud account in Tessell
[**deleteTenant**](TessellCloudAccountControllerApi.md#deleteTenant) | **DELETE** /cloud-accounts/i/{id} | Delete a cloud account
[**getCloudAccount**](TessellCloudAccountControllerApi.md#getCloudAccount) | **GET** /cloud-accounts/{cloudName} | Get a Tessell cloud account by name
[**getCloudAccountSecret**](TessellCloudAccountControllerApi.md#getCloudAccountSecret) | **GET** /cloud-accounts/i/{id}/secret | Get a cloud&#39;s credential
[**getCloudAccounts**](TessellCloudAccountControllerApi.md#getCloudAccounts) | **GET** /cloud-accounts | Get a list of enabled cloud accounts in Tessell
[**registerCloudAssetAccount**](TessellCloudAccountControllerApi.md#registerCloudAssetAccount) | **POST** /cloud-accounts | Register cloud asset account for tenant
[**updateTenant**](TessellCloudAccountControllerApi.md#updateTenant) | **PUT** /cloud-accounts/i/{id} | Update a cloud-account



## addCloudAccount

> TessellCloudAccountDTO addCloudAccount(tessellCloudAccountDTO)

Add a cloud account in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        TessellCloudAccountDTO tessellCloudAccountDTO = new TessellCloudAccountDTO(); // TessellCloudAccountDTO | 
        try {
            TessellCloudAccountDTO result = apiInstance.addCloudAccount(tessellCloudAccountDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#addCloudAccount");
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
 **tessellCloudAccountDTO** | [**TessellCloudAccountDTO**](TessellCloudAccountDTO.md)|  | [optional]

### Return type

[**TessellCloudAccountDTO**](TessellCloudAccountDTO.md)

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


## deleteTenant

> TessellGovernStatusDTO deleteTenant(id, softDelete)

Delete a cloud account

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            TessellGovernStatusDTO result = apiInstance.deleteTenant(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#deleteTenant");
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
 **softDelete** | **Boolean**| soft-delete | [optional]

### Return type

[**TessellGovernStatusDTO**](TessellGovernStatusDTO.md)

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


## getCloudAccount

> TessellCloudAccountDTO getCloudAccount(cloudName, byId, consumerType)

Get a Tessell cloud account by name

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        String cloudName = "cloudName_example"; // String | cloudName
        Boolean byId = true; // Boolean | by-id
        TessellConsumerTypeDTO consumerType = TessellConsumerTypeDTO.fromValue("SERVICE"); // TessellConsumerTypeDTO | consumer-type
        try {
            TessellCloudAccountDTO result = apiInstance.getCloudAccount(cloudName, byId, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#getCloudAccount");
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
 **cloudName** | **String**| cloudName |
 **byId** | **Boolean**| by-id | [optional]
 **consumerType** | [**TessellConsumerTypeDTO**](.md)| consumer-type | [optional] [enum: SERVICE, OPS, INTERNAL]

### Return type

[**TessellCloudAccountDTO**](TessellCloudAccountDTO.md)

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


## getCloudAccountSecret

> Map&lt;String, TessellParameterDTO&gt; getCloudAccountSecret(id)

Get a cloud&#39;s credential

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            Map<String, TessellParameterDTO> result = apiInstance.getCloudAccountSecret(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#getCloudAccountSecret");
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

### Return type

[**Map&lt;String, TessellParameterDTO&gt;**](TessellParameterDTO.md)

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


## getCloudAccounts

> TessellApiResponseDTO getCloudAccounts(id, cloudAccountType, name, pageSize, pageOffset, timezone, consumerType)

Get a list of enabled cloud accounts in Tessell

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellCloudAccountTypeDTO cloudAccountType = TessellCloudAccountTypeDTO.fromValue("INFRA_SERVICE"); // TessellCloudAccountTypeDTO | cloudAccountType
        String name = "name_example"; // String | name
        Integer pageSize = 10; // Integer | pageSize
        Integer pageOffset = 0; // Integer | pageOffset
        String timezone = "timezone_example"; // String | timezone
        TessellConsumerTypeDTO consumerType = TessellConsumerTypeDTO.fromValue("SERVICE"); // TessellConsumerTypeDTO | consumer-type
        try {
            TessellApiResponseDTO result = apiInstance.getCloudAccounts(id, cloudAccountType, name, pageSize, pageOffset, timezone, consumerType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#getCloudAccounts");
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
 **id** | [**UUID**](.md)| id | [optional]
 **cloudAccountType** | [**TessellCloudAccountTypeDTO**](.md)| cloudAccountType | [optional] [enum: INFRA_SERVICE, TENANT_ASSETS, INFRA_SERVICE_GLOBAL, SES, TENANT_ASSETS_GLOBAL]
 **name** | **String**| name | [optional]
 **pageSize** | **Integer**| pageSize | [optional] [default to 10]
 **pageOffset** | **Integer**| pageOffset | [optional] [default to 0]
 **timezone** | **String**| timezone | [optional]
 **consumerType** | [**TessellConsumerTypeDTO**](.md)| consumer-type | [optional] [enum: SERVICE, OPS, INTERNAL]

### Return type

[**TessellApiResponseDTO**](TessellApiResponseDTO.md)

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


## registerCloudAssetAccount

> TessellTaskSummaryDTO registerCloudAssetAccount(consumerType, tessellRegisterCloudAccountRequestPayloadDTO)

Register cloud asset account for tenant

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        TessellConsumerTypeDTO consumerType = TessellConsumerTypeDTO.fromValue("SERVICE"); // TessellConsumerTypeDTO | consumer-type
        TessellRegisterCloudAccountRequestPayloadDTO tessellRegisterCloudAccountRequestPayloadDTO = new TessellRegisterCloudAccountRequestPayloadDTO(); // TessellRegisterCloudAccountRequestPayloadDTO | 
        try {
            TessellTaskSummaryDTO result = apiInstance.registerCloudAssetAccount(consumerType, tessellRegisterCloudAccountRequestPayloadDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#registerCloudAssetAccount");
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
 **consumerType** | [**TessellConsumerTypeDTO**](.md)| consumer-type | [optional] [enum: SERVICE, OPS, INTERNAL]
 **tessellRegisterCloudAccountRequestPayloadDTO** | [**TessellRegisterCloudAccountRequestPayloadDTO**](TessellRegisterCloudAccountRequestPayloadDTO.md)|  | [optional]

### Return type

[**TessellTaskSummaryDTO**](TessellTaskSummaryDTO.md)

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


## updateTenant

> TessellCloudAccountDTO updateTenant(id, updateSecret, tessellCloudAccountDTO)

Update a cloud-account

### Example

```java
// Import classes:
import com.tessell.gov.client.invoker.ApiClient;
import com.tessell.gov.client.invoker.ApiException;
import com.tessell.gov.client.invoker.Configuration;
import com.tessell.gov.client.invoker.models.*;
import com.tessell.gov.client.api.TessellCloudAccountControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellCloudAccountControllerApi apiInstance = new TessellCloudAccountControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean updateSecret = true; // Boolean | update-secret
        TessellCloudAccountDTO tessellCloudAccountDTO = new TessellCloudAccountDTO(); // TessellCloudAccountDTO | 
        try {
            TessellCloudAccountDTO result = apiInstance.updateTenant(id, updateSecret, tessellCloudAccountDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellCloudAccountControllerApi#updateTenant");
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
 **updateSecret** | **Boolean**| update-secret | [optional]
 **tessellCloudAccountDTO** | [**TessellCloudAccountDTO**](TessellCloudAccountDTO.md)|  | [optional]

### Return type

[**TessellCloudAccountDTO**](TessellCloudAccountDTO.md)

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

