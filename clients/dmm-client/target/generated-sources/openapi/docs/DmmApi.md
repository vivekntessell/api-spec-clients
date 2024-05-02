# DmmApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteTessellAms**](DmmApi.md#bulkDeleteTessellAms) | **DELETE** /tessell-ops/availability-machines/bulk-delete | Delete the tessell ams for subscription.
[**checkLiveness**](DmmApi.md#checkLiveness) | **GET** /tessell-ops/liveness | Check if the AM service is up (liveness probe)
[**createAvailabilityMachineAcls**](DmmApi.md#createAvailabilityMachineAcls) | **PATCH** /availability-machines/{id}/acls | Create or update ACLs for an Availability Machine
[**createDmm**](DmmApi.md#createDmm) | **POST** /tessell-ops/dmms | Create a new Tessell Data Management Machine
[**deleteAvailabilityMachine**](DmmApi.md#deleteAvailabilityMachine) | **DELETE** /availability-machines/{id} | Delete the Availability Machine and the associated data (if any) including snapshots, sanitized-snapshots, and backups.
[**deleteDatabaseCallbackForDmm**](DmmApi.md#deleteDatabaseCallbackForDmm) | **POST** /tessell-ops/dmms/{id}/delete-db-callback | Callback for DB Service deletion for DMM
[**deleteDmm**](DmmApi.md#deleteDmm) | **DELETE** /tessell-ops/dmms/{id} | Delete a Tessell Data Management Machine
[**deletePreAuthUrl**](DmmApi.md#deletePreAuthUrl) | **DELETE** /tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id} | mark pre auth url delete
[**getAllPreAuthUrlForBackupId**](DmmApi.md#getAllPreAuthUrlForBackupId) | **GET** /tessell-ops/dmms/{dmmId}/backups/{backupId}/pre-auth-urls | get pre auth urls for native backup
[**getAvailabilityCatalog**](DmmApi.md#getAvailabilityCatalog) | **GET** /tessell-ops/dmms/{dmmId}/catalog | View details about a Tessell Availability Catalog
[**getAvailabilityCatalogHealth**](DmmApi.md#getAvailabilityCatalogHealth) | **GET** /tessell-ops/dmms/{dmmId}/catalog/health | View details about health of a Tessell Availability Catalog
[**getAvailabilityCatalogWithPitr**](DmmApi.md#getAvailabilityCatalogWithPitr) | **GET** /tessell-ops/dmms/{dmmId}/catalog/pitr-chain | View details about a Tessell Availability Catalog
[**getAvailabilityMachine**](DmmApi.md#getAvailabilityMachine) | **GET** /availability-machines/{id} | Get details about an Availability Machine
[**getAvailabilityMachineAcls**](DmmApi.md#getAvailabilityMachineAcls) | **GET** /availability-machines/{id}/acls | Get list of ACLs for an Availability Machine
[**getAvailabilityMachineSize**](DmmApi.md#getAvailabilityMachineSize) | **GET** /availability-machines/{id}/size | Get size consumption details for Tessell Data Management Machine
[**getAvailabilityMachineSlaCatalog**](DmmApi.md#getAvailabilityMachineSlaCatalog) | **GET** /availability-machines/{id}/sla/catalog | This API is deprecated and no longer supported.
[**getAvailabilityMachines**](DmmApi.md#getAvailabilityMachines) | **GET** /availability-machines | Get a list of Availability Machines
[**getBulkDeleteTessellAmsStatus**](DmmApi.md#getBulkDeleteTessellAmsStatus) | **POST** /tessell-ops/availability-machines/bulk-delete | get status of  the tessell ams for subscription.
[**getDataflixBackupsCatalog**](DmmApi.md#getDataflixBackupsCatalog) | **GET** /dataflix/{id}/catalog/backups | Get details of a Tessell Availability Machine Dataflix Backup Catalog
[**getDataflixByName**](DmmApi.md#getDataflixByName) | **GET** /dataflix/{id} | Get a Dataflix by ID
[**getDataflixCatalog**](DmmApi.md#getDataflixCatalog) | **GET** /dataflix/{id}/catalog | Get a Dataflix catalog
[**getDataflixSanitizedCatalog**](DmmApi.md#getDataflixSanitizedCatalog) | **GET** /dataflix/{id}/catalog/sanitized | Get a Dataflix catalog for sanitized contents
[**getDataflixes**](DmmApi.md#getDataflixes) | **GET** /dataflix | Get a list of accessible Dataflix
[**getDmm**](DmmApi.md#getDmm) | **GET** /tessell-ops/dmms/{id} | Get Tessell Data Management Machine By Id
[**getDmmSizeOpsView**](DmmApi.md#getDmmSizeOpsView) | **GET** /tessell-ops/dmms/{id}/size | Get size consumption details for Tessell Data Management Machine
[**getDmms**](DmmApi.md#getDmms) | **GET** /tessell-ops/dmms | View a list of available Tessell Data Management Machines
[**getDmmsForUtilization**](DmmApi.md#getDmmsForUtilization) | **GET** /tessell-ops/dmms/utilization | View a list of available Tessell Data Management Machines for utilization purpose
[**getDownloadUrlInfo**](DmmApi.md#getDownloadUrlInfo) | **GET** /dataflix/{id}/catalog/backups/{backup-id}/download-url | Get download url info for the backup
[**getEligibleUsersForAvailabilityMachine**](DmmApi.md#getEligibleUsersForAvailabilityMachine) | **GET** /availability-machines/{id}/acls/eligible-users | Get list of users which are eligible to grant access for an Availability Machine
[**getEligibleUsersForDataflix**](DmmApi.md#getEligibleUsersForDataflix) | **GET** /dataflix/{id}/acls/eligible-users | Get list of all the users by privileges
[**getPreAuthUrl**](DmmApi.md#getPreAuthUrl) | **GET** /tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id} | get pre auth urls by id
[**getPreAuthUrls**](DmmApi.md#getPreAuthUrls) | **GET** /tessell-ops/dmms/{dmmId}/backups/pre-auth-urls | get pre auth urls based on query params
[**pauseAvailabilityMachine**](DmmApi.md#pauseAvailabilityMachine) | **PATCH** /availability-machines/{id}/pause | Pause the automated backups for a Availability Machine
[**resumeAvailabilityMachine**](DmmApi.md#resumeAvailabilityMachine) | **PATCH** /availability-machines/{id}/resume | Resume the automated backups for a Availability Machine
[**revokeAvailabilityMachineAcls**](DmmApi.md#revokeAvailabilityMachineAcls) | **DELETE** /availability-machines/{id}/acls | Revoke ACLs for an Availability Machine
[**updateBackupDownloadConfig**](DmmApi.md#updateBackupDownloadConfig) | **PATCH** /availability-machines/{id}/backup-download-config | Allow backup download for a Availability Machine
[**updateDapReplicationStatus**](DmmApi.md#updateDapReplicationStatus) | **POST** /tessell-ops/dmms/update-dap-replication-status | Triggers a worklow to update the DbLogs status for all the PITR DAPs for given DMMs.
[**updateDmm**](DmmApi.md#updateDmm) | **PATCH** /tessell-ops/dmms/{id} | Update a Tessell Data Management Machine
[**updatePreAuthUrl**](DmmApi.md#updatePreAuthUrl) | **PATCH** /tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id} | patch pre auth url by id



## bulkDeleteTessellAms

> ResourceBulkDeleteResponseOps bulkDeleteTessellAms(bulkDeleteTessellAmsPayload)

Delete the tessell ams for subscription.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        BulkDeleteTessellAmsPayload bulkDeleteTessellAmsPayload = new BulkDeleteTessellAmsPayload(); // BulkDeleteTessellAmsPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteTessellAms(bulkDeleteTessellAmsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#bulkDeleteTessellAms");
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
 **bulkDeleteTessellAmsPayload** | [**BulkDeleteTessellAmsPayload**](BulkDeleteTessellAmsPayload.md)|  |

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## checkLiveness

> GetDmmsApiResponse checkLiveness()

Check if the AM service is up (liveness probe)

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        try {
            GetDmmsApiResponse result = apiInstance.checkLiveness();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#checkLiveness");
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

[**GetDmmsApiResponse**](GetDmmsApiResponse.md)

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


## createAvailabilityMachineAcls

> AclPayload createAvailabilityMachineAcls(id, aclPayload)

Create or update ACLs for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        AclPayload aclPayload = new AclPayload(); // AclPayload | 
        try {
            AclPayload result = apiInstance.createAvailabilityMachineAcls(id, aclPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#createAvailabilityMachineAcls");
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


## createDmm

> TessellDmmDTO createDmm(tessellDmmDTO)

Create a new Tessell Data Management Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        TessellDmmDTO tessellDmmDTO = new TessellDmmDTO(); // TessellDmmDTO | 
        try {
            TessellDmmDTO result = apiInstance.createDmm(tessellDmmDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#createDmm");
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
 **tessellDmmDTO** | [**TessellDmmDTO**](TessellDmmDTO.md)|  |

### Return type

[**TessellDmmDTO**](TessellDmmDTO.md)

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


## deleteAvailabilityMachine

> ApiStatus deleteAvailabilityMachine(id)

Delete the Availability Machine and the associated data (if any) including snapshots, sanitized-snapshots, and backups.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        try {
            ApiStatus result = apiInstance.deleteAvailabilityMachine(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#deleteAvailabilityMachine");
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


## deleteDatabaseCallbackForDmm

> ApiStatus deleteDatabaseCallbackForDmm(id, tessellDeleteDbCallbackPayload)

Callback for DB Service deletion for DMM

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellDeleteDbCallbackPayload tessellDeleteDbCallbackPayload = new TessellDeleteDbCallbackPayload(); // TessellDeleteDbCallbackPayload | 
        try {
            ApiStatus result = apiInstance.deleteDatabaseCallbackForDmm(id, tessellDeleteDbCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#deleteDatabaseCallbackForDmm");
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
 **tessellDeleteDbCallbackPayload** | [**TessellDeleteDbCallbackPayload**](TessellDeleteDbCallbackPayload.md)|  |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## deleteDmm

> ApiStatus deleteDmm(id, softDelete)

Delete a Tessell Data Management Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        String id = "id_example"; // String | id
        Boolean softDelete = true; // Boolean | softDelete
        try {
            ApiStatus result = apiInstance.deleteDmm(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#deleteDmm");
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
 **id** | **String**| id |
 **softDelete** | **Boolean**| softDelete | [optional] [default to true]

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


## deletePreAuthUrl

> ApiStatus deletePreAuthUrl(dmmId, backupId, id)

mark pre auth url delete

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | Id of the availability machine
        UUID backupId = new UUID(); // UUID | ID of Backup
        UUID id = new UUID(); // UUID | id of pre auth url
        try {
            ApiStatus result = apiInstance.deletePreAuthUrl(dmmId, backupId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#deletePreAuthUrl");
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
 **dmmId** | [**UUID**](.md)| Id of the availability machine |
 **backupId** | [**UUID**](.md)| ID of Backup |
 **id** | [**UUID**](.md)| id of pre auth url |

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


## getAllPreAuthUrlForBackupId

> List&lt;PreAuthUrlDTO&gt; getAllPreAuthUrlForBackupId(dmmId, backupId)

get pre auth urls for native backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | Id of the availability machine
        UUID backupId = new UUID(); // UUID | ID of backup
        try {
            List<PreAuthUrlDTO> result = apiInstance.getAllPreAuthUrlForBackupId(dmmId, backupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAllPreAuthUrlForBackupId");
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
 **dmmId** | [**UUID**](.md)| Id of the availability machine |
 **backupId** | [**UUID**](.md)| ID of backup |

### Return type

[**List&lt;PreAuthUrlDTO&gt;**](PreAuthUrlDTO.md)

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


## getAvailabilityCatalog

> TessellDmmAvailabilityCatalog getAvailabilityCatalog(dmmId, continuous, discrete, manual, automated, timeZone)

View details about a Tessell Availability Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        Boolean continuous = true; // Boolean | continuous
        Boolean discrete = true; // Boolean | discrete
        Boolean manual = true; // Boolean | manual
        Boolean automated = true; // Boolean | automated
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDmmAvailabilityCatalog result = apiInstance.getAvailabilityCatalog(dmmId, continuous, discrete, manual, automated, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityCatalog");
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
 **continuous** | **Boolean**| continuous | [optional] [default to true]
 **discrete** | **Boolean**| discrete | [optional] [default to true]
 **manual** | **Boolean**| manual | [optional] [default to true]
 **automated** | **Boolean**| automated | [optional] [default to true]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDmmAvailabilityCatalog**](TessellDmmAvailabilityCatalog.md)

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


## getAvailabilityCatalogHealth

> AvailabilityMachineCatalogHealth getAvailabilityCatalogHealth(dmmId, timeZone)

View details about health of a Tessell Availability Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            AvailabilityMachineCatalogHealth result = apiInstance.getAvailabilityCatalogHealth(dmmId, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityCatalogHealth");
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
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**AvailabilityMachineCatalogHealth**](AvailabilityMachineCatalogHealth.md)

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


## getAvailabilityCatalogWithPitr

> DbPitrChainInfo getAvailabilityCatalogWithPitr(dmmId, timestamp, cloudAccountId, cloudLocation, timeZone)

View details about a Tessell Availability Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        String timestamp = "true"; // String | timestamp
        UUID cloudAccountId = new UUID(); // UUID | cloud-account-id
        String cloudLocation = "true"; // String | cloud-location
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbPitrChainInfo result = apiInstance.getAvailabilityCatalogWithPitr(dmmId, timestamp, cloudAccountId, cloudLocation, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityCatalogWithPitr");
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
 **timestamp** | **String**| timestamp | [optional] [default to true]
 **cloudAccountId** | [**UUID**](.md)| cloud-account-id | [optional]
 **cloudLocation** | **String**| cloud-location | [optional] [default to true]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbPitrChainInfo**](DbPitrChainInfo.md)

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


## getAvailabilityMachine

> TessellDmmServiceConsumerDTO getAvailabilityMachine(id, loadAcls, timeZone)

Get details about an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDmmServiceConsumerDTO result = apiInstance.getAvailabilityMachine(id, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityMachine");
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
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDmmServiceConsumerDTO**](TessellDmmServiceConsumerDTO.md)

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


## getAvailabilityMachineAcls

> EntityAclSharingInfo getAvailabilityMachineAcls(id)

Get list of ACLs for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        try {
            EntityAclSharingInfo result = apiInstance.getAvailabilityMachineAcls(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityMachineAcls");
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

[**EntityAclSharingInfo**](EntityAclSharingInfo.md)

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


## getAvailabilityMachineSize

> TessellDmmSizeDTO getAvailabilityMachineSize(id, timeZone)

Get size consumption details for Tessell Data Management Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDmmSizeDTO result = apiInstance.getAvailabilityMachineSize(id, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityMachineSize");
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
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDmmSizeDTO**](TessellDmmSizeDTO.md)

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


## getAvailabilityMachineSlaCatalog

> TessellDmmAvailabilityCatalogServiceView getAvailabilityMachineSlaCatalog(id, continuous, discrete, manual, automated, timeZone)

This API is deprecated and no longer supported.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        Boolean continuous = true; // Boolean | continuous
        Boolean discrete = true; // Boolean | discrete
        Boolean manual = true; // Boolean | manual
        Boolean automated = true; // Boolean | automated
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDmmAvailabilityCatalogServiceView result = apiInstance.getAvailabilityMachineSlaCatalog(id, continuous, discrete, manual, automated, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityMachineSlaCatalog");
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
 **continuous** | **Boolean**| continuous | [optional] [default to true]
 **discrete** | **Boolean**| discrete | [optional] [default to true]
 **manual** | **Boolean**| manual | [optional] [default to true]
 **automated** | **Boolean**| automated | [optional] [default to true]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDmmAvailabilityCatalogServiceView**](TessellDmmAvailabilityCatalogServiceView.md)

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


## getAvailabilityMachines

> GetDmmsServiceView getAvailabilityMachines(name, status, engineType, loadAcls, owners, pageSize, pageOffset, timeZone)

Get a list of Availability Machines

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        String name = "name_example"; // String | Filter the result based on Availability Machine name
        String status = "status_example"; // String | Filter the result based on Availability Machine status
        String engineType = ""; // String | Filter the result based on Availability Machine's database engine-type
        Boolean loadAcls = false; // Boolean | Load ACL information
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDmmsServiceView result = apiInstance.getAvailabilityMachines(name, status, engineType, loadAcls, owners, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getAvailabilityMachines");
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
 **name** | **String**| Filter the result based on Availability Machine name | [optional]
 **status** | **String**| Filter the result based on Availability Machine status | [optional]
 **engineType** | **String**| Filter the result based on Availability Machine&#39;s database engine-type | [optional] [default to ]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDmmsServiceView**](GetDmmsServiceView.md)

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


## getBulkDeleteTessellAmsStatus

> ResourceBulkDeleteResponseOps getBulkDeleteTessellAmsStatus(bulkDeleteTessellAmsStatusPayload)

get status of  the tessell ams for subscription.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        BulkDeleteTessellAmsStatusPayload bulkDeleteTessellAmsStatusPayload = new BulkDeleteTessellAmsStatusPayload(); // BulkDeleteTessellAmsStatusPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.getBulkDeleteTessellAmsStatus(bulkDeleteTessellAmsStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getBulkDeleteTessellAmsStatus");
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
 **bulkDeleteTessellAmsStatusPayload** | [**BulkDeleteTessellAmsStatusPayload**](BulkDeleteTessellAmsStatusPayload.md)|  |

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## getDataflixBackupsCatalog

> GetDataflixBackupCatalogResponse getDataflixBackupsCatalog(id, automated, manual, loadAcls, timeZone)

Get details of a Tessell Availability Machine Dataflix Backup Catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Dataflix
        Boolean automated = true; // Boolean | Specify if automated backups info is to be fetched
        Boolean manual = true; // Boolean | Specify if manual backup info is to be fetched
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDataflixBackupCatalogResponse result = apiInstance.getDataflixBackupsCatalog(id, automated, manual, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDataflixBackupsCatalog");
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
 **id** | [**UUID**](.md)| ID of the Dataflix |
 **automated** | **Boolean**| Specify if automated backups info is to be fetched | [optional] [default to true]
 **manual** | **Boolean**| Specify if manual backup info is to be fetched | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDataflixBackupCatalogResponse**](GetDataflixBackupCatalogResponse.md)

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


## getDataflixByName

> TessellAmDataflixDTO getDataflixByName(id, loadAcls, timeZone)

Get a Dataflix by ID

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Dataflix
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellAmDataflixDTO result = apiInstance.getDataflixByName(id, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDataflixByName");
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
 **id** | [**UUID**](.md)| ID of the Dataflix |
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellAmDataflixDTO**](TessellAmDataflixDTO.md)

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


## getDataflixCatalog

> GetDataflixCatalogResponse getDataflixCatalog(id, pitr, automated, manual, loadAcls, timeZone)

Get a Dataflix catalog

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Dataflix
        Boolean pitr = true; // Boolean | Specify if PITR related dataflix info is to be fetched
        Boolean automated = true; // Boolean | Specify if automated backups info is to be fetched
        Boolean manual = true; // Boolean | Specify if manual backup info is to be fetched
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDataflixCatalogResponse result = apiInstance.getDataflixCatalog(id, pitr, automated, manual, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDataflixCatalog");
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
 **id** | [**UUID**](.md)| ID of the Dataflix |
 **pitr** | **Boolean**| Specify if PITR related dataflix info is to be fetched | [optional] [default to true]
 **automated** | **Boolean**| Specify if automated backups info is to be fetched | [optional] [default to true]
 **manual** | **Boolean**| Specify if manual backup info is to be fetched | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDataflixCatalogResponse**](GetDataflixCatalogResponse.md)

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


## getDataflixSanitizedCatalog

> GetDataflixSanitizedCatalogResponse getDataflixSanitizedCatalog(id, automated, manual, loadAcls, timeZone)

Get a Dataflix catalog for sanitized contents

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Dataflix
        Boolean automated = true; // Boolean | Specify if automated backups info is to be fetched
        Boolean manual = true; // Boolean | Specify if manual backup info is to be fetched
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDataflixSanitizedCatalogResponse result = apiInstance.getDataflixSanitizedCatalog(id, automated, manual, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDataflixSanitizedCatalog");
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
 **id** | [**UUID**](.md)| ID of the Dataflix |
 **automated** | **Boolean**| Specify if automated backups info is to be fetched | [optional] [default to true]
 **manual** | **Boolean**| Specify if manual backup info is to be fetched | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDataflixSanitizedCatalogResponse**](GetDataflixSanitizedCatalogResponse.md)

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


## getDataflixes

> TessellDataflixResponse getDataflixes(name, loadAcls, owners, pageSize, pageOffset, timeZone)

Get a list of accessible Dataflix

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        String name = "name_example"; // String | Filter the result based on Dataflix name
        Boolean loadAcls = false; // Boolean | Load ACL information
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDataflixResponse result = apiInstance.getDataflixes(name, loadAcls, owners, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDataflixes");
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
 **name** | **String**| Filter the result based on Dataflix name | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDataflixResponse**](TessellDataflixResponse.md)

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


## getDmm

> TessellDmmDTO getDmm(id, loadRpoSla, loadDaps, loadClones, loadSubscriptionInfo, loadAcls)

Get Tessell Data Management Machine By Id

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        Boolean loadRpoSla = false; // Boolean | load-rpo-sla
        Boolean loadDaps = false; // Boolean | load-daps
        Boolean loadClones = false; // Boolean | load-clones
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        Boolean loadAcls = false; // Boolean | Load ACL information
        try {
            TessellDmmDTO result = apiInstance.getDmm(id, loadRpoSla, loadDaps, loadClones, loadSubscriptionInfo, loadAcls);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDmm");
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
 **loadRpoSla** | **Boolean**| load-rpo-sla | [optional] [default to false]
 **loadDaps** | **Boolean**| load-daps | [optional] [default to false]
 **loadClones** | **Boolean**| load-clones | [optional] [default to false]
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]

### Return type

[**TessellDmmDTO**](TessellDmmDTO.md)

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


## getDmmSizeOpsView

> TessellDmmSizeOpsDTO getDmmSizeOpsView(id, filterOnLastStartedTime, filterOnLastStoppedTime, timeRangeBeginAt, timeRangeEndAt, timeZone)

Get size consumption details for Tessell Data Management Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Tessell Data Management Machine
        Boolean filterOnLastStartedTime = false; // Boolean | filter-on-last-started-time
        Boolean filterOnLastStoppedTime = false; // Boolean | filter-on-last-stopped-time
        String timeRangeBeginAt = "2022-04-10T04:20:30.000+0000"; // String | Start timestamp
        String timeRangeEndAt = "2022-04-10T04:20:30.000+0000"; // String | End timestamp
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellDmmSizeOpsDTO result = apiInstance.getDmmSizeOpsView(id, filterOnLastStartedTime, filterOnLastStoppedTime, timeRangeBeginAt, timeRangeEndAt, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDmmSizeOpsView");
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
 **id** | [**UUID**](.md)| Id of the Tessell Data Management Machine |
 **filterOnLastStartedTime** | **Boolean**| filter-on-last-started-time | [optional] [default to false]
 **filterOnLastStoppedTime** | **Boolean**| filter-on-last-stopped-time | [optional] [default to false]
 **timeRangeBeginAt** | **String**| Start timestamp | [optional]
 **timeRangeEndAt** | **String**| End timestamp | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellDmmSizeOpsDTO**](TessellDmmSizeOpsDTO.md)

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


## getDmms

> GetDmmsApiResponse getDmms(name, statuses, skipStatuses, engineType, databaseSystemId, loadRpoSla, loadDaps, loadClones, includeInternal, loadSubscriptionInfo, loadAcls, filterByTenant, pageSize, pageOffset, timeZone)

View a list of available Tessell Data Management Machines

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        String name = ""; // String | name
        List<DmmStatus> statuses = Arrays.asList(); // List<DmmStatus> | statuses
        List<DmmStatus> skipStatuses = Arrays.asList(); // List<DmmStatus> | skip-statuses
        String engineType = ""; // String | engine-type
        UUID databaseSystemId = new UUID(); // UUID | database-system-id
        Boolean loadRpoSla = false; // Boolean | load-rpo-sla
        Boolean loadDaps = false; // Boolean | load-daps
        Boolean loadClones = false; // Boolean | load-clones
        Boolean includeInternal = true; // Boolean | include-internal
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        Boolean loadAcls = false; // Boolean | Load ACL information
        Boolean filterByTenant = false; // Boolean | filter the entity based on tenant-id
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDmmsApiResponse result = apiInstance.getDmms(name, statuses, skipStatuses, engineType, databaseSystemId, loadRpoSla, loadDaps, loadClones, includeInternal, loadSubscriptionInfo, loadAcls, filterByTenant, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDmms");
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
 **name** | **String**| name | [optional] [default to ]
 **statuses** | [**List&lt;DmmStatus&gt;**](DmmStatus.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;DmmStatus&gt;**](DmmStatus.md)| skip-statuses | [optional]
 **engineType** | **String**| engine-type | [optional] [default to ]
 **databaseSystemId** | [**UUID**](.md)| database-system-id | [optional]
 **loadRpoSla** | **Boolean**| load-rpo-sla | [optional] [default to false]
 **loadDaps** | **Boolean**| load-daps | [optional] [default to false]
 **loadClones** | **Boolean**| load-clones | [optional] [default to false]
 **includeInternal** | **Boolean**| include-internal | [optional] [default to true]
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **filterByTenant** | **Boolean**| filter the entity based on tenant-id | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDmmsApiResponse**](GetDmmsApiResponse.md)

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


## getDmmsForUtilization

> GetDmmsApiResponse getDmmsForUtilization(loadSubscriptionInfo, filterOnLastStartedTime, filterOnLastStoppedTime, statuses, skipStatuses, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone)

View a list of available Tessell Data Management Machines for utilization purpose

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        Boolean filterOnLastStartedTime = false; // Boolean | filter-on-last-started-time
        Boolean filterOnLastStoppedTime = false; // Boolean | filter-on-last-stopped-time
        List<DmmStatus> statuses = Arrays.asList(); // List<DmmStatus> | Status list
        List<DmmStatus> skipStatuses = Arrays.asList(); // List<DmmStatus> | Status list
        String timeRangeBeginAt = "2022-04-10T04:20:30.000+0000"; // String | Start timestamp
        String timeRangeEndAt = "2022-04-10T04:20:30.000+0000"; // String | End timestamp
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDmmsApiResponse result = apiInstance.getDmmsForUtilization(loadSubscriptionInfo, filterOnLastStartedTime, filterOnLastStoppedTime, statuses, skipStatuses, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDmmsForUtilization");
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
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **filterOnLastStartedTime** | **Boolean**| filter-on-last-started-time | [optional] [default to false]
 **filterOnLastStoppedTime** | **Boolean**| filter-on-last-stopped-time | [optional] [default to false]
 **statuses** | [**List&lt;DmmStatus&gt;**](DmmStatus.md)| Status list | [optional]
 **skipStatuses** | [**List&lt;DmmStatus&gt;**](DmmStatus.md)| Status list | [optional]
 **timeRangeBeginAt** | **String**| Start timestamp | [optional]
 **timeRangeEndAt** | **String**| End timestamp | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDmmsApiResponse**](GetDmmsApiResponse.md)

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


## getDownloadUrlInfo

> DataflixDownloadUrlInfo getDownloadUrlInfo(id, backupId)

Get download url info for the backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        UUID backupId = new UUID(); // UUID | ID of the backup
        try {
            DataflixDownloadUrlInfo result = apiInstance.getDownloadUrlInfo(id, backupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getDownloadUrlInfo");
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
 **backupId** | [**UUID**](.md)| ID of the backup |

### Return type

[**DataflixDownloadUrlInfo**](DataflixDownloadUrlInfo.md)

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


## getEligibleUsersForAvailabilityMachine

> List&lt;AclEligibleUser&gt; getEligibleUsersForAvailabilityMachine(id, roles)

Get list of users which are eligible to grant access for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        List<String> roles = Arrays.asList(); // List<String> | Filter the result based on specified roles
        try {
            List<AclEligibleUser> result = apiInstance.getEligibleUsersForAvailabilityMachine(id, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getEligibleUsersForAvailabilityMachine");
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
 **roles** | [**List&lt;String&gt;**](String.md)| Filter the result based on specified roles | [optional]

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


## getEligibleUsersForDataflix

> List&lt;AclEligibleUser&gt; getEligibleUsersForDataflix(id, roles)

Get list of all the users by privileges

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        List<String> roles = Arrays.asList(); // List<String> | roles
        try {
            List<AclEligibleUser> result = apiInstance.getEligibleUsersForDataflix(id, roles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getEligibleUsersForDataflix");
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
 **roles** | [**List&lt;String&gt;**](String.md)| roles | [optional]

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


## getPreAuthUrl

> PreAuthUrlDTO getPreAuthUrl(dmmId, backupId, id)

get pre auth urls by id

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | Id of the availability machine
        UUID backupId = new UUID(); // UUID | ID of Backup
        UUID id = new UUID(); // UUID | id of pre auth url
        try {
            PreAuthUrlDTO result = apiInstance.getPreAuthUrl(dmmId, backupId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getPreAuthUrl");
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
 **dmmId** | [**UUID**](.md)| Id of the availability machine |
 **backupId** | [**UUID**](.md)| ID of Backup |
 **id** | [**UUID**](.md)| id of pre auth url |

### Return type

[**PreAuthUrlDTO**](PreAuthUrlDTO.md)

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


## getPreAuthUrls

> List&lt;PreAuthUrlDTO&gt; getPreAuthUrls(dmmId, backupId, sourceBackupIdentifier, user, statuses, skipStatuses)

get pre auth urls based on query params

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | Id of the availability machine
        UUID backupId = new UUID(); // UUID | ID of backup
        UUID sourceBackupIdentifier = new UUID(); // UUID | source backup id
        String user = "user_example"; // String | user email id
        List<PreAuthUrlStatusOps> statuses = Arrays.asList(); // List<PreAuthUrlStatusOps> | statuses of pre auth urls
        List<PreAuthUrlStatusOps> skipStatuses = Arrays.asList(); // List<PreAuthUrlStatusOps> | skip-statuses
        try {
            List<PreAuthUrlDTO> result = apiInstance.getPreAuthUrls(dmmId, backupId, sourceBackupIdentifier, user, statuses, skipStatuses);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#getPreAuthUrls");
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
 **dmmId** | [**UUID**](.md)| Id of the availability machine |
 **backupId** | [**UUID**](.md)| ID of backup | [optional]
 **sourceBackupIdentifier** | [**UUID**](.md)| source backup id | [optional]
 **user** | **String**| user email id | [optional]
 **statuses** | [**List&lt;PreAuthUrlStatusOps&gt;**](PreAuthUrlStatusOps.md)| statuses of pre auth urls | [optional]
 **skipStatuses** | [**List&lt;PreAuthUrlStatusOps&gt;**](PreAuthUrlStatusOps.md)| skip-statuses | [optional]

### Return type

[**List&lt;PreAuthUrlDTO&gt;**](PreAuthUrlDTO.md)

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


## pauseAvailabilityMachine

> ApiStatus pauseAvailabilityMachine(id, pauseTessellDmmPayload)

Pause the automated backups for a Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        PauseTessellDmmPayload pauseTessellDmmPayload = new PauseTessellDmmPayload(); // PauseTessellDmmPayload | 
        try {
            ApiStatus result = apiInstance.pauseAvailabilityMachine(id, pauseTessellDmmPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#pauseAvailabilityMachine");
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
 **pauseTessellDmmPayload** | [**PauseTessellDmmPayload**](PauseTessellDmmPayload.md)|  |

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


## resumeAvailabilityMachine

> ApiStatus resumeAvailabilityMachine(id, resumeTessellDmmPayload)

Resume the automated backups for a Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        ResumeTessellDmmPayload resumeTessellDmmPayload = new ResumeTessellDmmPayload(); // ResumeTessellDmmPayload | 
        try {
            ApiStatus result = apiInstance.resumeAvailabilityMachine(id, resumeTessellDmmPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#resumeAvailabilityMachine");
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
 **resumeTessellDmmPayload** | [**ResumeTessellDmmPayload**](ResumeTessellDmmPayload.md)|  |

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


## revokeAvailabilityMachineAcls

> ApiStatus revokeAvailabilityMachineAcls(id, aclRevokePayload)

Revoke ACLs for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        AclRevokePayload aclRevokePayload = new AclRevokePayload(); // AclRevokePayload | 
        try {
            ApiStatus result = apiInstance.revokeAvailabilityMachineAcls(id, aclRevokePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#revokeAvailabilityMachineAcls");
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


## updateBackupDownloadConfig

> BackupDownloadConfig updateBackupDownloadConfig(id, updateBackupDownloadConfigPayload)

Allow backup download for a Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        UpdateBackupDownloadConfigPayload updateBackupDownloadConfigPayload = new UpdateBackupDownloadConfigPayload(); // UpdateBackupDownloadConfigPayload | 
        try {
            BackupDownloadConfig result = apiInstance.updateBackupDownloadConfig(id, updateBackupDownloadConfigPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#updateBackupDownloadConfig");
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
 **updateBackupDownloadConfigPayload** | [**UpdateBackupDownloadConfigPayload**](UpdateBackupDownloadConfigPayload.md)|  |

### Return type

[**BackupDownloadConfig**](BackupDownloadConfig.md)

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


## updateDapReplicationStatus

> TaskSummary updateDapReplicationStatus(updateDapReplStatusPayload)

Triggers a worklow to update the DbLogs status for all the PITR DAPs for given DMMs.

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UpdateDapReplStatusPayload updateDapReplStatusPayload = new UpdateDapReplStatusPayload(); // UpdateDapReplStatusPayload | 
        try {
            TaskSummary result = apiInstance.updateDapReplicationStatus(updateDapReplStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#updateDapReplicationStatus");
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
 **updateDapReplStatusPayload** | [**UpdateDapReplStatusPayload**](UpdateDapReplStatusPayload.md)|  |

### Return type

[**TaskSummary**](TaskSummary.md)

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


## updateDmm

> TessellDmmDTO updateDmm(id, tessellDmmDTO)

Update a Tessell Data Management Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        String id = "id_example"; // String | id
        TessellDmmDTO tessellDmmDTO = new TessellDmmDTO(); // TessellDmmDTO | 
        try {
            TessellDmmDTO result = apiInstance.updateDmm(id, tessellDmmDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#updateDmm");
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
 **id** | **String**| id |
 **tessellDmmDTO** | [**TessellDmmDTO**](TessellDmmDTO.md)|  |

### Return type

[**TessellDmmDTO**](TessellDmmDTO.md)

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


## updatePreAuthUrl

> ApiStatus updatePreAuthUrl(dmmId, backupId, id, preAuthUrlDTO)

patch pre auth url by id

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DmmApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DmmApi apiInstance = new DmmApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | Id of the availability machine
        UUID backupId = new UUID(); // UUID | ID of Backup
        UUID id = new UUID(); // UUID | id of pre auth url
        PreAuthUrlDTO preAuthUrlDTO = new PreAuthUrlDTO(); // PreAuthUrlDTO | 
        try {
            ApiStatus result = apiInstance.updatePreAuthUrl(dmmId, backupId, id, preAuthUrlDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DmmApi#updatePreAuthUrl");
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
 **dmmId** | [**UUID**](.md)| Id of the availability machine |
 **backupId** | [**UUID**](.md)| ID of Backup |
 **id** | [**UUID**](.md)| id of pre auth url |
 **preAuthUrlDTO** | [**PreAuthUrlDTO**](PreAuthUrlDTO.md)|  |

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

