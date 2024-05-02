# TessellDatabaseProfileControllerApi

All URIs are relative to *http://localhost:8084*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDatabaseOptionProfile**](TessellDatabaseProfileControllerApi.md#createDatabaseOptionProfile) | **POST** /databases/profiles/governance/options-profiles | Create a new Options Profile
[**deleteDatabaseOptionProfile**](TessellDatabaseProfileControllerApi.md#deleteDatabaseOptionProfile) | **DELETE** /databases/profiles/options-profiles/{id} | Delete an Options Profile
[**deleteDatabaseOptionProfileOps**](TessellDatabaseProfileControllerApi.md#deleteDatabaseOptionProfileOps) | **DELETE** /tessell-ops/databases/profiles/options-profiles/{id} | Delete a Tessell Database Options Profile
[**getDatabaseOptionProfileTypes**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfileTypes) | **GET** /databases/profiles/options-profile-types | Get a list of available Tessell Database Options Profile Types
[**getDatabaseOptionProfileTypesByName**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfileTypesByName) | **GET** /databases/profiles/options-profile-types/{name} | Get Options Profile Types by name
[**getDatabaseOptionProfileTypesOps**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfileTypesOps) | **GET** /tessell-ops/databases/profiles/options-profile-types | Get a list of available Tessell Database Options Profile Types
[**getDatabaseOptionProfileTypesOpsById**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfileTypesOpsById) | **GET** /tessell-ops/databases/profiles/options-profile-types/{id} | View available Tessell Database Options Profile Types by Id
[**getDatabaseOptionProfiles**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfiles) | **GET** /databases/profiles/governance/options-profiles | Get a list of available Database Options Profiles
[**getDatabaseOptionProfilesByName**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfilesByName) | **GET** /databases/profiles/governance/options-profiles/{name} | Get an Options Profile by name
[**getDatabaseOptionProfilesConsumptionByName**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfilesConsumptionByName) | **GET** /databases/profiles/options-profiles/{name} | Get an Options Profile by name
[**getDatabaseOptionProfilesForConsumption**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfilesForConsumption) | **GET** /databases/profiles/options-profiles | Get a list of available Tessell Database Options Profiles
[**getDatabaseOptionProfilesOps**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfilesOps) | **GET** /tessell-ops/databases/profiles/options-profiles | Get a list of available Database Options Profiles
[**getDatabaseOptionProfilesOpsById**](TessellDatabaseProfileControllerApi.md#getDatabaseOptionProfilesOpsById) | **GET** /tessell-ops/databases/profiles/options-profiles/{id} | View available Tessell Database Options Profiles by Id
[**updateDatabaseOptionProfile**](TessellDatabaseProfileControllerApi.md#updateDatabaseOptionProfile) | **PATCH** /databases/profiles/options-profiles/{id} | Update an Options Profile
[**updateDatabaseOptionProfileOps**](TessellDatabaseProfileControllerApi.md#updateDatabaseOptionProfileOps) | **PATCH** /tessell-ops/databases/profiles/options-profiles/{id} | Update a Tessell Database Options Profile



## createDatabaseOptionProfile

> TessellDatabaseOptionProfileDTO createDatabaseOptionProfile(tessellDatabaseOptionProfileDTO)

Create a new Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO = new TessellDatabaseOptionProfileDTO(); // TessellDatabaseOptionProfileDTO | 
        try {
            TessellDatabaseOptionProfileDTO result = apiInstance.createDatabaseOptionProfile(tessellDatabaseOptionProfileDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#createDatabaseOptionProfile");
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
 **tessellDatabaseOptionProfileDTO** | [**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)|  | [optional]

### Return type

[**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)

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


## deleteDatabaseOptionProfile

> ApiStatus deleteDatabaseOptionProfile(id, softDelete)

Delete an Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Options Profile identifier
        Boolean softDelete = true; // Boolean | When set to false, it permanently deletes a Parameter Profile. When set to true, Option Profile can be recovered by contacting Tessell Support.
        try {
            ApiStatus result = apiInstance.deleteDatabaseOptionProfile(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#deleteDatabaseOptionProfile");
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
 **id** | [**UUID**](.md)| Options Profile identifier |
 **softDelete** | **Boolean**| When set to false, it permanently deletes a Parameter Profile. When set to true, Option Profile can be recovered by contacting Tessell Support. | [optional] [default to true]

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


## deleteDatabaseOptionProfileOps

> ApiStatus deleteDatabaseOptionProfileOps(id, softDelete)

Delete a Tessell Database Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Options Profile identifier
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteDatabaseOptionProfileOps(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#deleteDatabaseOptionProfileOps");
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
 **id** | [**UUID**](.md)| Options Profile identifier |
 **softDelete** | **Boolean**| soft-delete | [optional] [default to true]

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


## getDatabaseOptionProfileTypes

> TessellDatabaseOptionTypeListResponse getDatabaseOptionProfileTypes(status, engineType, version, multiple, pageSize, pageOffset, timeZone)

Get a list of available Tessell Database Options Profile Types

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        DatabaseOptionTypeStatus status = DatabaseOptionTypeStatus.fromValue("DISABLED"); // DatabaseOptionTypeStatus | Status of an Options Profile Type
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine version
        Boolean multiple = true; // Boolean | multiple (Deprecated)
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseOptionTypeListResponse result = apiInstance.getDatabaseOptionProfileTypes(status, engineType, version, multiple, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfileTypes");
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
 **status** | [**DatabaseOptionTypeStatus**](.md)| Status of an Options Profile Type | [optional] [enum: DISABLED, ENABLED]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine version | [optional]
 **multiple** | **Boolean**| multiple (Deprecated) | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseOptionTypeListResponse**](TessellDatabaseOptionTypeListResponse.md)

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


## getDatabaseOptionProfileTypesByName

> TessellDatabaseOptionTypeDTO getDatabaseOptionProfileTypesByName(name, loadAcls)

Get Options Profile Types by name

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        String name = "Postgres Default Options Profile"; // String | Options Profile name
        Boolean loadAcls = false; // Boolean | Flag to include / exclude ACL information
        try {
            TessellDatabaseOptionTypeDTO result = apiInstance.getDatabaseOptionProfileTypesByName(name, loadAcls);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfileTypesByName");
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
 **name** | **String**| Options Profile name |
 **loadAcls** | **Boolean**| Flag to include / exclude ACL information | [optional] [default to false]

### Return type

[**TessellDatabaseOptionTypeDTO**](TessellDatabaseOptionTypeDTO.md)

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


## getDatabaseOptionProfileTypesOps

> TessellDatabaseOptionTypeListResponse getDatabaseOptionProfileTypesOps(name, status, engineType, version, multiple, pageSize, pageOffset, timeZone)

Get a list of available Tessell Database Options Profile Types

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        String name = "name_example"; // String | name
        DatabaseOptionTypeStatus status = DatabaseOptionTypeStatus.fromValue("DISABLED"); // DatabaseOptionTypeStatus | status
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | engine-type
        String version = "15.5"; // String | version
        Boolean multiple = true; // Boolean | multiple (Deprecated)
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseOptionTypeListResponse result = apiInstance.getDatabaseOptionProfileTypesOps(name, status, engineType, version, multiple, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfileTypesOps");
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
 **status** | [**DatabaseOptionTypeStatus**](.md)| status | [optional] [enum: DISABLED, ENABLED]
 **engineType** | [**DatabaseEngineType**](.md)| engine-type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| version | [optional]
 **multiple** | **Boolean**| multiple (Deprecated) | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseOptionTypeListResponse**](TessellDatabaseOptionTypeListResponse.md)

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


## getDatabaseOptionProfileTypesOpsById

> TessellDatabaseOptionTypeDTO getDatabaseOptionProfileTypesOpsById(id)

View available Tessell Database Options Profile Types by Id

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        try {
            TessellDatabaseOptionTypeDTO result = apiInstance.getDatabaseOptionProfileTypesOpsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfileTypesOpsById");
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

[**TessellDatabaseOptionTypeDTO**](TessellDatabaseOptionTypeDTO.md)

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


## getDatabaseOptionProfiles

> TessellDatabaseOptionProfileListResponse getDatabaseOptionProfiles(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone)

Get a list of available Database Options Profiles

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        DatabaseOptionProfileStatus status = DatabaseOptionProfileStatus.fromValue("DELETED"); // DatabaseOptionProfileStatus | Status of an Options Profile
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine version
        Boolean loadAcls = false; // Boolean | Flag to include / exclude ACL information
        Boolean multiple = true; // Boolean | multiple (Deprecated)
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseOptionProfileListResponse result = apiInstance.getDatabaseOptionProfiles(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfiles");
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
 **status** | [**DatabaseOptionProfileStatus**](.md)| Status of an Options Profile | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine version | [optional]
 **loadAcls** | **Boolean**| Flag to include / exclude ACL information | [optional] [default to false]
 **multiple** | **Boolean**| multiple (Deprecated) | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseOptionProfileListResponse**](TessellDatabaseOptionProfileListResponse.md)

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


## getDatabaseOptionProfilesByName

> TessellDatabaseOptionProfileDTO getDatabaseOptionProfilesByName(name)

Get an Options Profile by name

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        try {
            TessellDatabaseOptionProfileDTO result = apiInstance.getDatabaseOptionProfilesByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfilesByName");
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
 **name** | **String**| Options Profile name |

### Return type

[**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)

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


## getDatabaseOptionProfilesConsumptionByName

> TessellDatabaseOptionProfileConsumptionDTO getDatabaseOptionProfilesConsumptionByName(name)

Get an Options Profile by name

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        String name = "Postgres Custom Option Profile"; // String | Options Profile name
        try {
            TessellDatabaseOptionProfileConsumptionDTO result = apiInstance.getDatabaseOptionProfilesConsumptionByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfilesConsumptionByName");
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
 **name** | **String**| Options Profile name |

### Return type

[**TessellDatabaseOptionProfileConsumptionDTO**](TessellDatabaseOptionProfileConsumptionDTO.md)

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


## getDatabaseOptionProfilesForConsumption

> TessellDatabaseOptionProfileConsumptionListResponse getDatabaseOptionProfilesForConsumption(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone)

Get a list of available Tessell Database Options Profiles

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        DatabaseOptionProfileStatus status = DatabaseOptionProfileStatus.fromValue("DELETED"); // DatabaseOptionProfileStatus | Status of an Options Profile
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | Database Engine type
        String version = "15.5"; // String | Database Engine type
        Boolean loadAcls = false; // Boolean | Flag to include / exclude ACL information
        Boolean multiple = true; // Boolean | multiple (Deprecated)
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseOptionProfileConsumptionListResponse result = apiInstance.getDatabaseOptionProfilesForConsumption(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfilesForConsumption");
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
 **status** | [**DatabaseOptionProfileStatus**](.md)| Status of an Options Profile | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH]
 **engineType** | [**DatabaseEngineType**](.md)| Database Engine type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| Database Engine type | [optional]
 **loadAcls** | **Boolean**| Flag to include / exclude ACL information | [optional] [default to false]
 **multiple** | **Boolean**| multiple (Deprecated) | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseOptionProfileConsumptionListResponse**](TessellDatabaseOptionProfileConsumptionListResponse.md)

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


## getDatabaseOptionProfilesOps

> TessellDatabaseOptionProfileListResponse getDatabaseOptionProfilesOps(tenantId, name, status, engineType, version, multiple, pageSize, pageOffset, timeZone)

Get a list of available Database Options Profiles

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant id
        String name = "name_example"; // String | name
        DatabaseOptionProfileStatus status = DatabaseOptionProfileStatus.fromValue("DELETED"); // DatabaseOptionProfileStatus | status
        DatabaseEngineType engineType = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | engine-type
        String version = "version_example"; // String | version
        Boolean multiple = true; // Boolean | multiple (Deprecated)
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDatabaseOptionProfileListResponse result = apiInstance.getDatabaseOptionProfilesOps(tenantId, name, status, engineType, version, multiple, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfilesOps");
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
 **tenantId** | **String**| tenant id | [optional]
 **name** | **String**| name | [optional]
 **status** | [**DatabaseOptionProfileStatus**](.md)| status | [optional] [enum: DELETED, DELETING, DRAFT, PUBLISH, UNPUBLISH]
 **engineType** | [**DatabaseEngineType**](.md)| engine-type | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **version** | **String**| version | [optional]
 **multiple** | **Boolean**| multiple (Deprecated) | [optional] [default to true]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDatabaseOptionProfileListResponse**](TessellDatabaseOptionProfileListResponse.md)

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


## getDatabaseOptionProfilesOpsById

> TessellDatabaseOptionProfileDTO getDatabaseOptionProfilesOpsById(id, tenantId)

View available Tessell Database Options Profiles by Id

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        String tenantId = "tenantId_example"; // String | tenant id
        try {
            TessellDatabaseOptionProfileDTO result = apiInstance.getDatabaseOptionProfilesOpsById(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#getDatabaseOptionProfilesOpsById");
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
 **tenantId** | **String**| tenant id | [optional]

### Return type

[**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)

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


## updateDatabaseOptionProfile

> TessellDatabaseOptionProfileDTO updateDatabaseOptionProfile(id, tessellDatabaseOptionProfileDTO)

Update an Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Option Profile identifier
        TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO = new TessellDatabaseOptionProfileDTO(); // TessellDatabaseOptionProfileDTO | 
        try {
            TessellDatabaseOptionProfileDTO result = apiInstance.updateDatabaseOptionProfile(id, tessellDatabaseOptionProfileDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#updateDatabaseOptionProfile");
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
 **id** | [**UUID**](.md)| Option Profile identifier |
 **tessellDatabaseOptionProfileDTO** | [**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)|  | [optional]

### Return type

[**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)

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


## updateDatabaseOptionProfileOps

> TessellDatabaseOptionProfileDTO updateDatabaseOptionProfileOps(id, tessellDatabaseOptionProfileDTO)

Update a Tessell Database Options Profile

### Example

```java
// Import classes:
import com.tessell.dbprofile.client.invoker.ApiClient;
import com.tessell.dbprofile.client.invoker.ApiException;
import com.tessell.dbprofile.client.invoker.Configuration;
import com.tessell.dbprofile.client.invoker.models.*;
import com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");

        TessellDatabaseProfileControllerApi apiInstance = new TessellDatabaseProfileControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Options Profile identifier
        TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO = new TessellDatabaseOptionProfileDTO(); // TessellDatabaseOptionProfileDTO | 
        try {
            TessellDatabaseOptionProfileDTO result = apiInstance.updateDatabaseOptionProfileOps(id, tessellDatabaseOptionProfileDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellDatabaseProfileControllerApi#updateDatabaseOptionProfileOps");
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
 **id** | [**UUID**](.md)| Options Profile identifier |
 **tessellDatabaseOptionProfileDTO** | [**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)|  | [optional]

### Return type

[**TessellDatabaseOptionProfileDTO**](TessellDatabaseOptionProfileDTO.md)

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

