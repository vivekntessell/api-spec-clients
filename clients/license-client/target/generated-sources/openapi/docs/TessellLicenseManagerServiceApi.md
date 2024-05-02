# TessellLicenseManagerServiceApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**acquireLicense**](TessellLicenseManagerServiceApi.md#acquireLicense) | **POST** /tessell-internal/license-manager/licenses/acquire | Acquire a license from a license directory.
[**checkLicenseAvailability**](TessellLicenseManagerServiceApi.md#checkLicenseAvailability) | **GET** /tessell-internal/license-manager/licenses/availability | Checks if the licenses are available for Acquiring
[**checkLicenseRequirement**](TessellLicenseManagerServiceApi.md#checkLicenseRequirement) | **GET** /tessell-internal/license-manager/licenses/requirement-checks | Checks if the licensing functionality is available for the account
[**deleteLicenseFromDirectory**](TessellLicenseManagerServiceApi.md#deleteLicenseFromDirectory) | **DELETE** /license-manager/governance/licenses/{licenseId} | Deletes an existing license from directory.
[**getLicenseFromDirectoryByIdInternal**](TessellLicenseManagerServiceApi.md#getLicenseFromDirectoryByIdInternal) | **GET** /tessell-internal/license-manager/licenses/{licenseId} | Returns license by Id.
[**getLicensesFromDirectory**](TessellLicenseManagerServiceApi.md#getLicensesFromDirectory) | **GET** /license-manager/governance/licenses | Returns a list detail of licenses from directory.
[**getLicensesFromDirectoryInternal**](TessellLicenseManagerServiceApi.md#getLicensesFromDirectoryInternal) | **GET** /tessell-internal/license-manager/licenses | Returns detail of license directory.
[**registerLicenseToDirectory**](TessellLicenseManagerServiceApi.md#registerLicenseToDirectory) | **POST** /license-manager/governance/licenses | Register license into license pool
[**releaseLicense**](TessellLicenseManagerServiceApi.md#releaseLicense) | **POST** /tessell-internal/license-manager/licenses/release | Release a previously acquired license from a license directory.



## acquireLicense

> TessellAcquireLicenseResponseDTO acquireLicense(tenantId, timeZone, tessellAcquireLicenseRequestDTO)

Acquire a license from a license directory.

Acquire a license from a license directory.

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String timeZone = "timeZone_example"; // String | Time Zone
        TessellAcquireLicenseRequestDTO tessellAcquireLicenseRequestDTO = new TessellAcquireLicenseRequestDTO(); // TessellAcquireLicenseRequestDTO | 
        try {
            TessellAcquireLicenseResponseDTO result = apiInstance.acquireLicense(tenantId, timeZone, tessellAcquireLicenseRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#acquireLicense");
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
 **timeZone** | **String**| Time Zone | [optional]
 **tessellAcquireLicenseRequestDTO** | [**TessellAcquireLicenseRequestDTO**](TessellAcquireLicenseRequestDTO.md)|  | [optional]

### Return type

[**TessellAcquireLicenseResponseDTO**](TessellAcquireLicenseResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## checkLicenseAvailability

> TessellLicenseAvailabilityResponseDTO checkLicenseAvailability(tenantId, licenseCategory, vendor, subscriptionId, version, edition, quantity)

Checks if the licenses are available for Acquiring

Checks if the licenses are available in the system for Acquiring

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellLicenseCategoryDTO licenseCategory = TessellLicenseCategoryDTO.fromValue("DB"); // TessellLicenseCategoryDTO | 
        TessellVendorDTO vendor = TessellVendorDTO.fromValue("ORACLE"); // TessellVendorDTO | License vendor
        String subscriptionId = "subscriptionId_example"; // String | Id of subscription
        String version = "version_example"; // String | license version
        String edition = "edition_example"; // String | license edition
        Double quantity = 3.4D; // Double | license version
        try {
            TessellLicenseAvailabilityResponseDTO result = apiInstance.checkLicenseAvailability(tenantId, licenseCategory, vendor, subscriptionId, version, edition, quantity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#checkLicenseAvailability");
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
 **licenseCategory** | [**TessellLicenseCategoryDTO**](.md)|  | [enum: DB, INTEGRATION, OS, OTHERS]
 **vendor** | [**TessellVendorDTO**](.md)| License vendor | [enum: ORACLE, MICROSOFT, APACHE]
 **subscriptionId** | **String**| Id of subscription |
 **version** | **String**| license version |
 **edition** | **String**| license edition |
 **quantity** | **Double**| license version |

### Return type

[**TessellLicenseAvailabilityResponseDTO**](TessellLicenseAvailabilityResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## checkLicenseRequirement

> TessellLicenseRequiredResponseDTO checkLicenseRequirement(tenantId)

Checks if the licensing functionality is available for the account

Checks if the licensing functionality is available for the account

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        try {
            TessellLicenseRequiredResponseDTO result = apiInstance.checkLicenseRequirement(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#checkLicenseRequirement");
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

[**TessellLicenseRequiredResponseDTO**](TessellLicenseRequiredResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## deleteLicenseFromDirectory

> TessellDeleteLicenseResponseDTO deleteLicenseFromDirectory(licenseId, timeZone, secure)

Deletes an existing license from directory.

Deletes an existing license from directory.

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String licenseId = "bdb2aabd-c374-423f-9315-de7e6dd141cb"; // String | License Id
        String timeZone = "timeZone_example"; // String | Time Zone
        Boolean secure = true; // Boolean | 
        try {
            TessellDeleteLicenseResponseDTO result = apiInstance.deleteLicenseFromDirectory(licenseId, timeZone, secure);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#deleteLicenseFromDirectory");
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
 **licenseId** | **String**| License Id |
 **timeZone** | **String**| Time Zone | [optional]
 **secure** | **Boolean**|  | [optional]

### Return type

[**TessellDeleteLicenseResponseDTO**](TessellDeleteLicenseResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## getLicenseFromDirectoryByIdInternal

> TessellLicenseDirectoryResponseDTO getLicenseFromDirectoryByIdInternal(tenantId, licenseId, timeZone, includeAudit)

Returns license by Id.

Returns license by Id

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String licenseId = "bdb2aabd-c374-423f-9315-de7e6dd141cb"; // String | 
        String timeZone = "timeZone_example"; // String | Time Zone
        Boolean includeAudit = true; // Boolean | 
        try {
            TessellLicenseDirectoryResponseDTO result = apiInstance.getLicenseFromDirectoryByIdInternal(tenantId, licenseId, timeZone, includeAudit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#getLicenseFromDirectoryByIdInternal");
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
 **licenseId** | **String**|  |
 **timeZone** | **String**| Time Zone | [optional]
 **includeAudit** | **Boolean**|  | [optional]

### Return type

[**TessellLicenseDirectoryResponseDTO**](TessellLicenseDirectoryResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## getLicensesFromDirectory

> TessellLicenseDirectoriesResponseDTO getLicensesFromDirectory(licenseCategory, licenseType, vendor, includeAudit, status, licenseIds, subscriptionId, createdBy, startDate, endDate, timeZone)

Returns a list detail of licenses from directory.

Returns a list detail of licenses from directory.

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        TessellLicenseCategoryDTO licenseCategory = TessellLicenseCategoryDTO.fromValue("DB"); // TessellLicenseCategoryDTO | License Category
        String licenseType = "Subscription, EULA"; // String | License Type
        TessellVendorDTO vendor = TessellVendorDTO.fromValue("ORACLE"); // TessellVendorDTO | License Vendor
        Boolean includeAudit = true; // Boolean | Flag to include/exclude to Audit
        TessellMaturityStatusDTO status = TessellMaturityStatusDTO.fromValue("DRAFT"); // TessellMaturityStatusDTO | Maturity Status
        String licenseIds = "bb89b700-698f-4597-8f54-d4055474e87c"; // String | Comma separated license Ids
        String subscriptionId = "all"; // String | Id of subscription
        String createdBy = "createdBy_example"; // String | Owner name
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Date on which license was added.
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | Date on which license would expire.
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellLicenseDirectoriesResponseDTO result = apiInstance.getLicensesFromDirectory(licenseCategory, licenseType, vendor, includeAudit, status, licenseIds, subscriptionId, createdBy, startDate, endDate, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#getLicensesFromDirectory");
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
 **licenseCategory** | [**TessellLicenseCategoryDTO**](.md)| License Category | [enum: DB, INTEGRATION, OS, OTHERS]
 **licenseType** | **String**| License Type | [optional]
 **vendor** | [**TessellVendorDTO**](.md)| License Vendor | [optional] [enum: ORACLE, MICROSOFT, APACHE]
 **includeAudit** | **Boolean**| Flag to include/exclude to Audit | [optional]
 **status** | [**TessellMaturityStatusDTO**](.md)| Maturity Status | [optional] [enum: DRAFT, PUBLISHED, DELETED, ALL]
 **licenseIds** | **String**| Comma separated license Ids | [optional]
 **subscriptionId** | **String**| Id of subscription | [optional]
 **createdBy** | **String**| Owner name | [optional]
 **startDate** | **OffsetDateTime**| Date on which license was added. | [optional]
 **endDate** | **OffsetDateTime**| Date on which license would expire. | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellLicenseDirectoriesResponseDTO**](TessellLicenseDirectoriesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## getLicensesFromDirectoryInternal

> TessellLicenseDirectoriesResponseDTO getLicensesFromDirectoryInternal(tenantId, licenseCategory, licenseType, vendor, includeAudit, subscriptionId, status, licenseIds, createdBy, startDate, endDate, timeZone)

Returns detail of license directory.

Returns detail of license directory.

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellLicenseCategoryDTO licenseCategory = TessellLicenseCategoryDTO.fromValue("DB"); // TessellLicenseCategoryDTO | 
        String licenseType = "Subscription, EULA"; // String | License Type
        TessellVendorDTO vendor = TessellVendorDTO.fromValue("ORACLE"); // TessellVendorDTO | License Type
        Boolean includeAudit = true; // Boolean | 
        String subscriptionId = "subscriptionId_example"; // String | Id of subscription
        TessellMaturityStatusDTO status = TessellMaturityStatusDTO.fromValue("DRAFT"); // TessellMaturityStatusDTO | maturity status
        String licenseIds = "DB"; // String | Comma separated licenseids
        String createdBy = "createdBy_example"; // String | owner
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | 
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | 
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellLicenseDirectoriesResponseDTO result = apiInstance.getLicensesFromDirectoryInternal(tenantId, licenseCategory, licenseType, vendor, includeAudit, subscriptionId, status, licenseIds, createdBy, startDate, endDate, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#getLicensesFromDirectoryInternal");
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
 **licenseCategory** | [**TessellLicenseCategoryDTO**](.md)|  | [enum: DB, INTEGRATION, OS, OTHERS]
 **licenseType** | **String**| License Type | [optional]
 **vendor** | [**TessellVendorDTO**](.md)| License Type | [optional] [enum: ORACLE, MICROSOFT, APACHE]
 **includeAudit** | **Boolean**|  | [optional]
 **subscriptionId** | **String**| Id of subscription | [optional]
 **status** | [**TessellMaturityStatusDTO**](.md)| maturity status | [optional] [enum: DRAFT, PUBLISHED, DELETED, ALL]
 **licenseIds** | **String**| Comma separated licenseids | [optional]
 **createdBy** | **String**| owner | [optional]
 **startDate** | **OffsetDateTime**|  | [optional]
 **endDate** | **OffsetDateTime**|  | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellLicenseDirectoriesResponseDTO**](TessellLicenseDirectoriesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## registerLicenseToDirectory

> TessellLicenseRegisterResponseDTO registerLicenseToDirectory(timeZone, tessellRegisterLicenseToDirectoryRequestDTO)

Register license into license pool

Register license into license pool

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String timeZone = "timeZone_example"; // String | Time Zone
        TessellRegisterLicenseToDirectoryRequestDTO tessellRegisterLicenseToDirectoryRequestDTO = new TessellRegisterLicenseToDirectoryRequestDTO(); // TessellRegisterLicenseToDirectoryRequestDTO | 
        try {
            TessellLicenseRegisterResponseDTO result = apiInstance.registerLicenseToDirectory(timeZone, tessellRegisterLicenseToDirectoryRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#registerLicenseToDirectory");
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
 **timeZone** | **String**| Time Zone | [optional]
 **tessellRegisterLicenseToDirectoryRequestDTO** | [**TessellRegisterLicenseToDirectoryRequestDTO**](TessellRegisterLicenseToDirectoryRequestDTO.md)|  | [optional]

### Return type

[**TessellLicenseRegisterResponseDTO**](TessellLicenseRegisterResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## releaseLicense

> TessellReleaseLicenseResponseDTO releaseLicense(tenantId, timeZone, tessellReleaseLicenseRequestDTO)

Release a previously acquired license from a license directory.

Release a previously acquired license from a license directory.

### Example

```java
// Import classes:
import com.tessell.license.client.invoker.ApiClient;
import com.tessell.license.client.invoker.ApiException;
import com.tessell.license.client.invoker.Configuration;
import com.tessell.license.client.invoker.models.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String timeZone = "timeZone_example"; // String | Time Zone
        TessellReleaseLicenseRequestDTO tessellReleaseLicenseRequestDTO = new TessellReleaseLicenseRequestDTO(); // TessellReleaseLicenseRequestDTO | 
        try {
            TessellReleaseLicenseResponseDTO result = apiInstance.releaseLicense(tenantId, timeZone, tessellReleaseLicenseRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#releaseLicense");
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
 **timeZone** | **String**| Time Zone | [optional]
 **tessellReleaseLicenseRequestDTO** | [**TessellReleaseLicenseRequestDTO**](TessellReleaseLicenseRequestDTO.md)|  | [optional]

### Return type

[**TessellReleaseLicenseResponseDTO**](TessellReleaseLicenseResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |

