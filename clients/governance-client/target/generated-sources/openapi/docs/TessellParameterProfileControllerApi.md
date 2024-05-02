# TessellParameterProfileControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**compareDatabaseParameterConfigs**](TessellParameterProfileControllerApi.md#compareDatabaseParameterConfigs) | **GET** /governance/parameter-profiles/{id}/compare | Compare two Parameter Profile configuration
[**copyDatabaseParameterConfigs**](TessellParameterProfileControllerApi.md#copyDatabaseParameterConfigs) | **PATCH** /governance/parameter-profiles/{id}/copy-configuration | Copy Parameters of one Parameter Profile to other Parameter Profiles
[**createDatabaseParameterProfile**](TessellParameterProfileControllerApi.md#createDatabaseParameterProfile) | **POST** /governance/parameter-profiles | Create a new Parameter Profile
[**createDatabaseParameterProfileForInternalConsumers**](TessellParameterProfileControllerApi.md#createDatabaseParameterProfileForInternalConsumers) | **POST** /tessell-internal/parameter-profiles | Create a new Parameter Profile
[**deleteDatabaseParameterProfile**](TessellParameterProfileControllerApi.md#deleteDatabaseParameterProfile) | **DELETE** /governance/parameter-profiles/{id} | Delete a Parameter Profile
[**evaluateDatabaseParameterProfile**](TessellParameterProfileControllerApi.md#evaluateDatabaseParameterProfile) | **POST** /tessell-internal/parameter-profiles/{id}/evaluate | Evaluate a new Tessell Database Parameter Profile
[**getDatabaseParameterProfiles**](TessellParameterProfileControllerApi.md#getDatabaseParameterProfiles) | **GET** /governance/parameter-profiles | Get a list of Parameter Profiles
[**getDatabaseParameterProfilesById**](TessellParameterProfileControllerApi.md#getDatabaseParameterProfilesById) | **GET** /tessell-internal/parameter-profiles/{id} | View available Tessell Database Parameter Profiles by Id
[**getDatabaseParameterProfilesByVersion**](TessellParameterProfileControllerApi.md#getDatabaseParameterProfilesByVersion) | **GET** /tessell-internal/parameter-profiles/{id}/version/{versionId} | View available Tessell Database Parameter Profiles by Id and versionId
[**getDatabaseParameterProfilesForConsumers**](TessellParameterProfileControllerApi.md#getDatabaseParameterProfilesForConsumers) | **GET** /databases/parameter-profiles | Get a list of available Parameter Profiles
[**getDatabaseParameterProfilesForInternalConsumers**](TessellParameterProfileControllerApi.md#getDatabaseParameterProfilesForInternalConsumers) | **GET** /tessell-internal/parameter-profiles | Get a list of available Tessell Database Parameter Profiles for consumers
[**getFactoryParameterProfiles**](TessellParameterProfileControllerApi.md#getFactoryParameterProfiles) | **GET** /governance/parameter-profiles/validations | Get a list of supported Database Parameters for all Database Engines with default configuration
[**getFactoryParameterProfilesById**](TessellParameterProfileControllerApi.md#getFactoryParameterProfilesById) | **GET** /tessell-internal/parameter-profiles/validations/{id} | Get a list of supported Tessell Database Parameter Profile By Id with factory configuration
[**getParameterProfileUsages**](TessellParameterProfileControllerApi.md#getParameterProfileUsages) | **GET** /governance/parameter-profiles/{id}/usages | Provide Services/Instances that are using the Parameter Profile
[**isParameterProfileDeletable**](TessellParameterProfileControllerApi.md#isParameterProfileDeletable) | **GET** /governance/parameter-profiles/{id}/deletable | Check if Parameter Profile is deletable or not
[**resetParameterProfileToDefault**](TessellParameterProfileControllerApi.md#resetParameterProfileToDefault) | **POST** /governance/parameter-profiles/{id}/reset | Reset Parameters of Parameter Profile to its default values
[**toggleIsActiveFlagForParameterProfile**](TessellParameterProfileControllerApi.md#toggleIsActiveFlagForParameterProfile) | **PATCH** /tessell-internal/parameter-profiles/is-active | Toggle the is_active value for a given parameter profile configuration
[**updateDatabaseParameterProfile**](TessellParameterProfileControllerApi.md#updateDatabaseParameterProfile) | **PATCH** /governance/parameter-profiles/{id} | Update a Parameter Profile



## compareDatabaseParameterConfigs

> ParameterProfileCompareResponse compareDatabaseParameterConfigs(id, tenantId, compareTo)

Compare two Parameter Profile configuration

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Parameter Profile
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID compareTo = new UUID(); // UUID | Id of the Parameter Profile to be compared with
        try {
            ParameterProfileCompareResponse result = apiInstance.compareDatabaseParameterConfigs(id, tenantId, compareTo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#compareDatabaseParameterConfigs");
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
 **id** | [**UUID**](.md)| Id of the Parameter Profile |
 **tenantId** | **String**| Id of the Tenant |
 **compareTo** | [**UUID**](.md)| Id of the Parameter Profile to be compared with |

### Return type

[**ParameterProfileCompareResponse**](ParameterProfileCompareResponse.md)

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


## copyDatabaseParameterConfigs

> ApiStatus copyDatabaseParameterConfigs(id, copyToProfiles)

Copy Parameters of one Parameter Profile to other Parameter Profiles

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of Parameter Profile (Parameters will be copied from this Parameter Profile)
        CopyToProfiles copyToProfiles = new CopyToProfiles(); // CopyToProfiles | 
        try {
            ApiStatus result = apiInstance.copyDatabaseParameterConfigs(id, copyToProfiles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#copyDatabaseParameterConfigs");
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
 **id** | [**UUID**](.md)| Id of Parameter Profile (Parameters will be copied from this Parameter Profile) |
 **copyToProfiles** | [**CopyToProfiles**](CopyToProfiles.md)|  | [optional]

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


## createDatabaseParameterProfile

> DatabaseParameterProfileResponse createDatabaseParameterProfile(databaseParameterProfileRequest)

Create a new Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        DatabaseParameterProfileRequest databaseParameterProfileRequest = new DatabaseParameterProfileRequest(); // DatabaseParameterProfileRequest | 
        try {
            DatabaseParameterProfileResponse result = apiInstance.createDatabaseParameterProfile(databaseParameterProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#createDatabaseParameterProfile");
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
 **databaseParameterProfileRequest** | [**DatabaseParameterProfileRequest**](DatabaseParameterProfileRequest.md)|  | [optional]

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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


## createDatabaseParameterProfileForInternalConsumers

> DatabaseParameterProfileResponse createDatabaseParameterProfileForInternalConsumers(tenantId, databaseParameterProfileRequest)

Create a new Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        DatabaseParameterProfileRequest databaseParameterProfileRequest = new DatabaseParameterProfileRequest(); // DatabaseParameterProfileRequest | 
        try {
            DatabaseParameterProfileResponse result = apiInstance.createDatabaseParameterProfileForInternalConsumers(tenantId, databaseParameterProfileRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#createDatabaseParameterProfileForInternalConsumers");
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
 **databaseParameterProfileRequest** | [**DatabaseParameterProfileRequest**](DatabaseParameterProfileRequest.md)|  | [optional]

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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


## deleteDatabaseParameterProfile

> ApiStatus deleteDatabaseParameterProfile(id, softDelete)

Delete a Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Parameter Profile Id
        Boolean softDelete = true; // Boolean | When set to false, it permanently deletes a Parameter Profile. When set to true, Parameter Profile can be recovered by contacting Tessell Support.
        try {
            ApiStatus result = apiInstance.deleteDatabaseParameterProfile(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#deleteDatabaseParameterProfile");
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
 **id** | [**UUID**](.md)| Parameter Profile Id |
 **softDelete** | **Boolean**| When set to false, it permanently deletes a Parameter Profile. When set to true, Parameter Profile can be recovered by contacting Tessell Support. | [optional] [default to true]

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


## evaluateDatabaseParameterProfile

> DatabaseParameterProfileResponse evaluateDatabaseParameterProfile(tenantId, id, databaseParameterProfileEvaluateRequest)

Evaluate a new Tessell Database Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID id = new UUID(); // UUID | name
        DatabaseParameterProfileEvaluateRequest databaseParameterProfileEvaluateRequest = new DatabaseParameterProfileEvaluateRequest(); // DatabaseParameterProfileEvaluateRequest | 
        try {
            DatabaseParameterProfileResponse result = apiInstance.evaluateDatabaseParameterProfile(tenantId, id, databaseParameterProfileEvaluateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#evaluateDatabaseParameterProfile");
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
 **id** | [**UUID**](.md)| name |
 **databaseParameterProfileEvaluateRequest** | [**DatabaseParameterProfileEvaluateRequest**](DatabaseParameterProfileEvaluateRequest.md)|  | [optional]

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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


## getDatabaseParameterProfiles

> DatabaseParameterProfileListResponse getDatabaseParameterProfiles(status, engineType, version, name)

Get a list of Parameter Profiles

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        DatabaseParameterProfileStatus status = DatabaseParameterProfileStatus.fromValue("DELETED"); // DatabaseParameterProfileStatus | Status of a Parameter Profile
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine version
        String name = "Postgres Custom Parameter Profile"; // String | Parameter Profile name
        try {
            DatabaseParameterProfileListResponse result = apiInstance.getDatabaseParameterProfiles(status, engineType, version, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getDatabaseParameterProfiles");
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
 **status** | [**DatabaseParameterProfileStatus**](.md)| Status of a Parameter Profile | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH, DEPRECATED]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine version | [optional]
 **name** | **String**| Parameter Profile name | [optional]

### Return type

[**DatabaseParameterProfileListResponse**](DatabaseParameterProfileListResponse.md)

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


## getDatabaseParameterProfilesById

> DatabaseParameterProfileResponse getDatabaseParameterProfilesById(tenantId, id)

View available Tessell Database Parameter Profiles by Id

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        UUID id = new UUID(); // UUID | name
        try {
            DatabaseParameterProfileResponse result = apiInstance.getDatabaseParameterProfilesById(tenantId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getDatabaseParameterProfilesById");
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
 **id** | [**UUID**](.md)| name |

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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


## getDatabaseParameterProfilesByVersion

> DatabaseParameterProfileResponse getDatabaseParameterProfilesByVersion(id, versionId, tenantId)

View available Tessell Database Parameter Profiles by Id and versionId

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | name
        UUID versionId = new UUID(); // UUID | name
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            DatabaseParameterProfileResponse result = apiInstance.getDatabaseParameterProfilesByVersion(id, versionId, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getDatabaseParameterProfilesByVersion");
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
 **id** | [**UUID**](.md)| name |
 **versionId** | [**UUID**](.md)| name |
 **tenantId** | **String**| Id of the Tenant |

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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


## getDatabaseParameterProfilesForConsumers

> DatabaseParameterProfileListResponse getDatabaseParameterProfilesForConsumers(status, engineType, version, name)

Get a list of available Parameter Profiles

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        DatabaseParameterProfileStatus status = DatabaseParameterProfileStatus.fromValue("DELETED"); // DatabaseParameterProfileStatus | Parameter Profile status
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine version
        String name = "Postgres Custom Parameter Profile"; // String | Parameter Profile name
        try {
            DatabaseParameterProfileListResponse result = apiInstance.getDatabaseParameterProfilesForConsumers(status, engineType, version, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getDatabaseParameterProfilesForConsumers");
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
 **status** | [**DatabaseParameterProfileStatus**](.md)| Parameter Profile status | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH, DEPRECATED]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine version | [optional]
 **name** | **String**| Parameter Profile name | [optional]

### Return type

[**DatabaseParameterProfileListResponse**](DatabaseParameterProfileListResponse.md)

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


## getDatabaseParameterProfilesForInternalConsumers

> DatabaseParameterProfileListResponse getDatabaseParameterProfilesForInternalConsumers(tenantId, status, engineType, version, name)

Get a list of available Tessell Database Parameter Profiles for consumers

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        DatabaseParameterProfileStatus status = DatabaseParameterProfileStatus.fromValue("DELETED"); // DatabaseParameterProfileStatus | status
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | engineType
        String version = "version_example"; // String | version
        String name = "name_example"; // String | 
        try {
            DatabaseParameterProfileListResponse result = apiInstance.getDatabaseParameterProfilesForInternalConsumers(tenantId, status, engineType, version, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getDatabaseParameterProfilesForInternalConsumers");
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
 **status** | [**DatabaseParameterProfileStatus**](.md)| status | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH, DEPRECATED]
 **engineType** | [**DatabaseEngineType**](.md)| engineType | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| version | [optional]
 **name** | **String**|  | [optional]

### Return type

[**DatabaseParameterProfileListResponse**](DatabaseParameterProfileListResponse.md)

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


## getFactoryParameterProfiles

> DatabaseFactoryParameterListResponse getFactoryParameterProfiles(name, status, engineType, version)

Get a list of supported Database Parameters for all Database Engines with default configuration

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        String name = "Postgres Custom Parameter Profile"; // String | Parameter Profile name
        DatabaseParameterTypeStatus status = DatabaseParameterTypeStatus.fromValue("DISABLED"); // DatabaseParameterTypeStatus | Status of Parameter Profile
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine version
        try {
            DatabaseFactoryParameterListResponse result = apiInstance.getFactoryParameterProfiles(name, status, engineType, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getFactoryParameterProfiles");
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
 **name** | **String**| Parameter Profile name | [optional]
 **status** | [**DatabaseParameterTypeStatus**](.md)| Status of Parameter Profile | [optional] [enum: DISABLED, ENABLED]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine version | [optional]

### Return type

[**DatabaseFactoryParameterListResponse**](DatabaseFactoryParameterListResponse.md)

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


## getFactoryParameterProfilesById

> DatabaseFactoryParameterResponse getFactoryParameterProfilesById(id)

Get a list of supported Tessell Database Parameter Profile By Id with factory configuration

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            DatabaseFactoryParameterResponse result = apiInstance.getFactoryParameterProfilesById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getFactoryParameterProfilesById");
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

[**DatabaseFactoryParameterResponse**](DatabaseFactoryParameterResponse.md)

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


## getParameterProfileUsages

> ParameterProfileUsageResponse getParameterProfileUsages(id)

Provide Services/Instances that are using the Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Parameter Profile Id
        try {
            ParameterProfileUsageResponse result = apiInstance.getParameterProfileUsages(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#getParameterProfileUsages");
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
 **id** | [**UUID**](.md)| Parameter Profile Id |

### Return type

[**ParameterProfileUsageResponse**](ParameterProfileUsageResponse.md)

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


## isParameterProfileDeletable

> DeleteValidationResponse isParameterProfileDeletable(id)

Check if Parameter Profile is deletable or not

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Parameter Profile Id
        try {
            DeleteValidationResponse result = apiInstance.isParameterProfileDeletable(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#isParameterProfileDeletable");
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
 **id** | [**UUID**](.md)| Parameter Profile Id |

### Return type

[**DeleteValidationResponse**](DeleteValidationResponse.md)

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


## resetParameterProfileToDefault

> ApiStatus resetParameterProfileToDefault(id)

Reset Parameters of Parameter Profile to its default values

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            ApiStatus result = apiInstance.resetParameterProfileToDefault(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#resetParameterProfileToDefault");
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


## toggleIsActiveFlagForParameterProfile

> ToggleIsActiveFlagResponse toggleIsActiveFlagForParameterProfile(id, isActive)

Toggle the is_active value for a given parameter profile configuration

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean isActive = true; // Boolean | New is-active for the parameter profile
        try {
            ToggleIsActiveFlagResponse result = apiInstance.toggleIsActiveFlagForParameterProfile(id, isActive);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#toggleIsActiveFlagForParameterProfile");
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
 **isActive** | **Boolean**| New is-active for the parameter profile |

### Return type

[**ToggleIsActiveFlagResponse**](ToggleIsActiveFlagResponse.md)

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


## updateDatabaseParameterProfile

> DatabaseParameterProfileResponse updateDatabaseParameterProfile(id, databaseParameterProfilePatchRequest)

Update a Parameter Profile

### Example

```java
// Import classes:
import com.tessell.parameter_profile.client.invoker.ApiClient;
import com.tessell.parameter_profile.client.invoker.ApiException;
import com.tessell.parameter_profile.client.invoker.Configuration;
import com.tessell.parameter_profile.client.invoker.models.*;
import com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellParameterProfileControllerApi apiInstance = new TessellParameterProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        DatabaseParameterProfilePatchRequest databaseParameterProfilePatchRequest = new DatabaseParameterProfilePatchRequest(); // DatabaseParameterProfilePatchRequest | 
        try {
            DatabaseParameterProfileResponse result = apiInstance.updateDatabaseParameterProfile(id, databaseParameterProfilePatchRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellParameterProfileControllerApi#updateDatabaseParameterProfile");
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
 **databaseParameterProfilePatchRequest** | [**DatabaseParameterProfilePatchRequest**](DatabaseParameterProfilePatchRequest.md)|  | [optional]

### Return type

[**DatabaseParameterProfileResponse**](DatabaseParameterProfileResponse.md)

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

