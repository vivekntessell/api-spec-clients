# DbBackupApi

All URIs are relative to *http://localhost:8082*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backupCallback**](DbBackupApi.md#backupCallback) | **POST** /tessell-ops/dmms/{id}/callback/backups/{backup-id} | Callback for backup database service
[**createBackupEntry**](DbBackupApi.md#createBackupEntry) | **POST** /tessell-ops/dmms/{dmmId}/backups/create-backup | Create a backup entry
[**createBackupRequest**](DbBackupApi.md#createBackupRequest) | **POST** /availability-machines/{availabilityMachineId}/backups | Create backup for the snapshot
[**createBackupRequestInitializationInternal**](DbBackupApi.md#createBackupRequestInitializationInternal) | **POST** /tessell-ops/dmms/{dmmId}/backups/init | Request to create a initialization of new Backup
[**createBackupRequestInternal**](DbBackupApi.md#createBackupRequestInternal) | **POST** /tessell-ops/dmms/{dmmId}/backups | Request to create a new Backup
[**createDatabaseSnapshotRequest**](DbBackupApi.md#createDatabaseSnapshotRequest) | **POST** /availability-machines/{availabilityMachineId}/snapshots | Submit a request to capture the associated DB Service&#39;s snapshot
[**createDirectBackupEntry**](DbBackupApi.md#createDirectBackupEntry) | **POST** /tessell-ops/dmms/{dmmId}/backups/{backupId}/create-direct-entry | Create a direct backup entry
[**createDownloadUrlRequest**](DbBackupApi.md#createDownloadUrlRequest) | **POST** /availability-machines/{id}/backups/{backup-id}/download-url | Create download url for the backup
[**createNativeBackupCallback**](DbBackupApi.md#createNativeBackupCallback) | **POST** /tessell-ops/dmms/native-backup/{native-backup-id}/callback | Callback for native backup database service
[**createOnDemandBackupRequestInternal**](DbBackupApi.md#createOnDemandBackupRequestInternal) | **POST** /tessell-ops/dmms/{dmmId}/on-demand-backups | Request to create a new On Demand Backup
[**createSanitizedDatabaseSnapshotRequest**](DbBackupApi.md#createSanitizedDatabaseSnapshotRequest) | **POST** /availability-machines/{availabilityMachineId}/sanitized-snapshots | Submit a request to sanitize the specified snapshot
[**deleteBackupRequest**](DbBackupApi.md#deleteBackupRequest) | **DELETE** /availability-machines/{availabilityMachineId}/backups/{id} | Submit a request to delete the backup
[**deleteBackupRequestOps**](DbBackupApi.md#deleteBackupRequestOps) | **DELETE** /tessell-ops/dmms/backups | Internal request to delete a Tessell Database Backups and logs
[**deleteBackupsLogsCallback**](DbBackupApi.md#deleteBackupsLogsCallback) | **POST** /tessell-ops/dmms/callback/delete-backups-logs | Callback for snapshot database service
[**deleteDBBackup**](DbBackupApi.md#deleteDBBackup) | **DELETE** /tessell-ops/dmms/{dmmId}/backups/{id} | Delete a Tessell Database Backup
[**deleteDatabaseSnapshotRequest**](DbBackupApi.md#deleteDatabaseSnapshotRequest) | **DELETE** /availability-machines/{availabilityMachineId}/snapshots/{id} | Submit a request to delete the snapshot
[**deleteSanitizedDatabaseSnapshotRequest**](DbBackupApi.md#deleteSanitizedDatabaseSnapshotRequest) | **DELETE** /availability-machines/{availabilityMachineId}/sanitized-snapshots/{id} | Submit a request to delete the Sanitized Snapshot
[**getBackupOps**](DbBackupApi.md#getBackupOps) | **GET** /tessell-ops/dmms/{dmmId}/backups/{id} | View details about a Tessell Database Backup
[**getBackupRequest**](DbBackupApi.md#getBackupRequest) | **GET** /availability-machines/{availabilityMachineId}/backups/{id} | get backup
[**getBackupRestoreInfo**](DbBackupApi.md#getBackupRestoreInfo) | **GET** /availability-machines/{id}/restore-info | Get the restore or clone information for the specified snapshot or the recovery-timestamp
[**getBackups**](DbBackupApi.md#getBackups) | **GET** /tessell-ops/dmms/{dmmId}/backups | Get list of backups for a Availability machine
[**getBackupsForDap**](DbBackupApi.md#getBackupsForDap) | **GET** /tessell-ops/dmms/{dmmId}/availability-policies/{dapId}/backups | Get Backups for a DAP
[**getBackupsForUtilization**](DbBackupApi.md#getBackupsForUtilization) | **GET** /tessell-ops/dmms/{dmmId}/backups/utilization | View a list of available Backups for utilization
[**getBackupsInternal**](DbBackupApi.md#getBackupsInternal) | **GET** /tessell-ops/dmms/backups | Get a list of available Backups for internal use
[**getDatabaseBackups**](DbBackupApi.md#getDatabaseBackups) | **GET** /availability-machines/{availabilityMachineId}/backups | View a list of available Tessell Backups
[**getDatabaseSnapshot**](DbBackupApi.md#getDatabaseSnapshot) | **GET** /availability-machines/{availabilityMachineId}/snapshots/{id} | Get details about the specified snapshot
[**getDatabaseSnapshots**](DbBackupApi.md#getDatabaseSnapshots) | **GET** /availability-machines/{availabilityMachineId}/snapshots | Get list of snapshots for an Availability Machine
[**getDbBackupChainInfo**](DbBackupApi.md#getDbBackupChainInfo) | **GET** /tessell-ops/dmms/{dmmId}/backups/{backupId}/backup-chain | Get backup chain for a given Backup
[**getDbBackupCloudResourceSharingInfo**](DbBackupApi.md#getDbBackupCloudResourceSharingInfo) | **GET** /tessell-ops/dmms/{dmmId}/backups/cloud-resource-sharing-info | Get list of backups info which share the same underlying cloud snapshot
[**getDbBackupLineageInfo**](DbBackupApi.md#getDbBackupLineageInfo) | **GET** /tessell-ops/dmms/{dmmId}/backups/{backupId}/lineage-info | Get backup lineage info for a given Backup
[**getSanitizedDatabaseSnapshot**](DbBackupApi.md#getSanitizedDatabaseSnapshot) | **GET** /availability-machines/{availabilityMachineId}/sanitized-snapshots/{id} | Get details about the specified Sanitized Snapshot
[**getSanitizedDatabaseSnapshots**](DbBackupApi.md#getSanitizedDatabaseSnapshots) | **GET** /availability-machines/{availabilityMachineId}/sanitized-snapshots | Get list of sanitized snapshots for an Availability Machine
[**lockBackup**](DbBackupApi.md#lockBackup) | **PATCH** /tessell-ops/dmms/{dmmId}/backups/{backupId}/lock | Lock a backup entry
[**preAuthUrlsCallback**](DbBackupApi.md#preAuthUrlsCallback) | **POST** /tessell-ops/dmms/{id}/pre-auth-urls/callback | Callback for bulk pre auth urls creation
[**refreshBackupSizeRequestOps**](DbBackupApi.md#refreshBackupSizeRequestOps) | **PATCH** /tessell-ops/dmms/backups/refresh-size | Internal request to refresh snapshot size from respective cloud
[**replicateBackupsCallback**](DbBackupApi.md#replicateBackupsCallback) | **POST** /tessell-ops/dmms/{id}/callback/replicate-backups | Callback for snapshot database service
[**updateBackup**](DbBackupApi.md#updateBackup) | **PATCH** /tessell-ops/dmms/{dmmId}/backups/{id} | Update a Tessell Database Backup
[**updateBackupSizeOps**](DbBackupApi.md#updateBackupSizeOps) | **PATCH** /tessell-ops/dmms/{dmmId}/backups/size | Update Backup Size information
[**updateBackupWithPut**](DbBackupApi.md#updateBackupWithPut) | **PUT** /tessell-ops/dmms/{dmmId}/backups/{id} | Update a Tessell Database Backup using PUT
[**validateBackupForCloneCreation**](DbBackupApi.md#validateBackupForCloneCreation) | **POST** /tessell-ops/dmms/{dmmId}/backups/clone-validation | Validate a backup for clone creation



## backupCallback

> backupCallback(id, backupId, backupCallbackPayload)

Callback for backup database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        UUID backupId = new UUID(); // UUID | Id of the backup
        BackupCallbackPayload backupCallbackPayload = new BackupCallbackPayload(); // BackupCallbackPayload | 
        try {
            apiInstance.backupCallback(id, backupId, backupCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#backupCallback");
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
 **backupId** | [**UUID**](.md)| Id of the backup |
 **backupCallbackPayload** | [**BackupCallbackPayload**](BackupCallbackPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## createBackupEntry

> DatabaseBackupOps createBackupEntry(dmmId, databaseBackupOps)

Create a backup entry

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        DatabaseBackupOps databaseBackupOps = new DatabaseBackupOps(); // DatabaseBackupOps | 
        try {
            DatabaseBackupOps result = apiInstance.createBackupEntry(dmmId, databaseBackupOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createBackupEntry");
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
 **databaseBackupOps** | [**DatabaseBackupOps**](DatabaseBackupOps.md)|  |

### Return type

[**DatabaseBackupOps**](DatabaseBackupOps.md)

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


## createBackupRequest

> TaskSummary createBackupRequest(availabilityMachineId, createBackupTaskPayload)

Create backup for the snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        CreateBackupTaskPayload createBackupTaskPayload = new CreateBackupTaskPayload(); // CreateBackupTaskPayload | 
        try {
            TaskSummary result = apiInstance.createBackupRequest(availabilityMachineId, createBackupTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createBackupRequest");
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
 **createBackupTaskPayload** | [**CreateBackupTaskPayload**](CreateBackupTaskPayload.md)|  |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## createBackupRequestInitializationInternal

> DatabaseSnapshotTaskPayload createBackupRequestInitializationInternal(dmmId, createBackupInternalTaskPayload)

Request to create a initialization of new Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        CreateBackupInternalTaskPayload createBackupInternalTaskPayload = new CreateBackupInternalTaskPayload(); // CreateBackupInternalTaskPayload | 
        try {
            DatabaseSnapshotTaskPayload result = apiInstance.createBackupRequestInitializationInternal(dmmId, createBackupInternalTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createBackupRequestInitializationInternal");
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
 **createBackupInternalTaskPayload** | [**CreateBackupInternalTaskPayload**](CreateBackupInternalTaskPayload.md)|  |

### Return type

[**DatabaseSnapshotTaskPayload**](DatabaseSnapshotTaskPayload.md)

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


## createBackupRequestInternal

> TaskSummary createBackupRequestInternal(dmmId, createBackupInternalTaskPayload)

Request to create a new Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        CreateBackupInternalTaskPayload createBackupInternalTaskPayload = new CreateBackupInternalTaskPayload(); // CreateBackupInternalTaskPayload | 
        try {
            TaskSummary result = apiInstance.createBackupRequestInternal(dmmId, createBackupInternalTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createBackupRequestInternal");
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
 **createBackupInternalTaskPayload** | [**CreateBackupInternalTaskPayload**](CreateBackupInternalTaskPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## createDatabaseSnapshotRequest

> TaskSummary createDatabaseSnapshotRequest(availabilityMachineId, createDatabaseSnapshotTaskPayload)

Submit a request to capture the associated DB Service&#39;s snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        CreateDatabaseSnapshotTaskPayload createDatabaseSnapshotTaskPayload = new CreateDatabaseSnapshotTaskPayload(); // CreateDatabaseSnapshotTaskPayload | 
        try {
            TaskSummary result = apiInstance.createDatabaseSnapshotRequest(availabilityMachineId, createDatabaseSnapshotTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createDatabaseSnapshotRequest");
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
 **createDatabaseSnapshotTaskPayload** | [**CreateDatabaseSnapshotTaskPayload**](CreateDatabaseSnapshotTaskPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## createDirectBackupEntry

> DatabaseBackupOps createDirectBackupEntry(dmmId, backupId, forStartDb)

Create a direct backup entry

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID backupId = new UUID(); // UUID | ID of the backup
        Boolean forStartDb = false; // Boolean | for-start-db
        try {
            DatabaseBackupOps result = apiInstance.createDirectBackupEntry(dmmId, backupId, forStartDb);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createDirectBackupEntry");
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
 **backupId** | [**UUID**](.md)| ID of the backup |
 **forStartDb** | **Boolean**| for-start-db | [optional] [default to false]

### Return type

[**DatabaseBackupOps**](DatabaseBackupOps.md)

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


## createDownloadUrlRequest

> TaskSummary createDownloadUrlRequest(id, backupId, expiryConfig)

Create download url for the backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        UUID backupId = new UUID(); // UUID | ID of the backup
        ExpiryConfig expiryConfig = new ExpiryConfig(); // ExpiryConfig | 
        try {
            TaskSummary result = apiInstance.createDownloadUrlRequest(id, backupId, expiryConfig);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createDownloadUrlRequest");
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
 **expiryConfig** | [**ExpiryConfig**](ExpiryConfig.md)|  |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## createNativeBackupCallback

> createNativeBackupCallback(nativeBackupId, nativeBackupCallbackPayload)

Callback for native backup database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID nativeBackupId = new UUID(); // UUID | ID of backup
        NativeBackupCallbackPayload nativeBackupCallbackPayload = new NativeBackupCallbackPayload(); // NativeBackupCallbackPayload | 
        try {
            apiInstance.createNativeBackupCallback(nativeBackupId, nativeBackupCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createNativeBackupCallback");
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
 **nativeBackupId** | [**UUID**](.md)| ID of backup |
 **nativeBackupCallbackPayload** | [**NativeBackupCallbackPayload**](NativeBackupCallbackPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## createOnDemandBackupRequestInternal

> ApiStatus createOnDemandBackupRequestInternal(dmmId, dmmDispatchOnDemandAutoBackupTaskPayload)

Request to create a new On Demand Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        DmmDispatchOnDemandAutoBackupTaskPayload dmmDispatchOnDemandAutoBackupTaskPayload = new DmmDispatchOnDemandAutoBackupTaskPayload(); // DmmDispatchOnDemandAutoBackupTaskPayload | 
        try {
            ApiStatus result = apiInstance.createOnDemandBackupRequestInternal(dmmId, dmmDispatchOnDemandAutoBackupTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createOnDemandBackupRequestInternal");
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
 **dmmDispatchOnDemandAutoBackupTaskPayload** | [**DmmDispatchOnDemandAutoBackupTaskPayload**](DmmDispatchOnDemandAutoBackupTaskPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## createSanitizedDatabaseSnapshotRequest

> TaskSummary createSanitizedDatabaseSnapshotRequest(availabilityMachineId, createSanitizedDatabaseSnapshotTaskPayload)

Submit a request to sanitize the specified snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        CreateSanitizedDatabaseSnapshotTaskPayload createSanitizedDatabaseSnapshotTaskPayload = new CreateSanitizedDatabaseSnapshotTaskPayload(); // CreateSanitizedDatabaseSnapshotTaskPayload | 
        try {
            TaskSummary result = apiInstance.createSanitizedDatabaseSnapshotRequest(availabilityMachineId, createSanitizedDatabaseSnapshotTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#createSanitizedDatabaseSnapshotRequest");
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
 **createSanitizedDatabaseSnapshotTaskPayload** | [**CreateSanitizedDatabaseSnapshotTaskPayload**](CreateSanitizedDatabaseSnapshotTaskPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteBackupRequest

> ApiStatus deleteBackupRequest(availabilityMachineId, id)

Submit a request to delete the backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID id = new UUID(); // UUID | ID of the database backup
        try {
            ApiStatus result = apiInstance.deleteBackupRequest(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteBackupRequest");
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
 **id** | [**UUID**](.md)| ID of the database backup |

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


## deleteBackupRequestOps

> TaskSummary deleteBackupRequestOps(deleteBackupDbLogTaskPayload, timeZone)

Internal request to delete a Tessell Database Backups and logs

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        DeleteBackupDbLogTaskPayload deleteBackupDbLogTaskPayload = new DeleteBackupDbLogTaskPayload(); // DeleteBackupDbLogTaskPayload | 
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TaskSummary result = apiInstance.deleteBackupRequestOps(deleteBackupDbLogTaskPayload, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteBackupRequestOps");
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
 **deleteBackupDbLogTaskPayload** | [**DeleteBackupDbLogTaskPayload**](DeleteBackupDbLogTaskPayload.md)|  |
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteBackupsLogsCallback

> ApiStatus deleteBackupsLogsCallback(deleteBackupsLogsCallbackPayload)

Callback for snapshot database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        DeleteBackupsLogsCallbackPayload deleteBackupsLogsCallbackPayload = new DeleteBackupsLogsCallbackPayload(); // DeleteBackupsLogsCallbackPayload | 
        try {
            ApiStatus result = apiInstance.deleteBackupsLogsCallback(deleteBackupsLogsCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteBackupsLogsCallback");
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
 **deleteBackupsLogsCallbackPayload** | [**DeleteBackupsLogsCallbackPayload**](DeleteBackupsLogsCallbackPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteDBBackup

> ApiStatus deleteDBBackup(dmmId, id, softDelete)

Delete a Tessell Database Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID id = new UUID(); // UUID | ID of the backup
        Boolean softDelete = true; // Boolean | softDelete
        try {
            ApiStatus result = apiInstance.deleteDBBackup(dmmId, id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteDBBackup");
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
 **id** | [**UUID**](.md)| ID of the backup |
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


## deleteDatabaseSnapshotRequest

> ApiStatus deleteDatabaseSnapshotRequest(availabilityMachineId, id)

Submit a request to delete the snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID id = new UUID(); // UUID | ID of the snapshot
        try {
            ApiStatus result = apiInstance.deleteDatabaseSnapshotRequest(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteDatabaseSnapshotRequest");
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
 **id** | [**UUID**](.md)| ID of the snapshot |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## deleteSanitizedDatabaseSnapshotRequest

> ApiStatus deleteSanitizedDatabaseSnapshotRequest(availabilityMachineId, id)

Submit a request to delete the Sanitized Snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID id = new UUID(); // UUID | ID of the Sanitized Snapshot
        try {
            ApiStatus result = apiInstance.deleteSanitizedDatabaseSnapshotRequest(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#deleteSanitizedDatabaseSnapshotRequest");
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
 **id** | [**UUID**](.md)| ID of the Sanitized Snapshot |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## getBackupOps

> DatabaseBackupOps getBackupOps(dmmId, id, loadStorageSnapshots)

View details about a Tessell Database Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID id = new UUID(); // UUID | ID of the backup
        Boolean loadStorageSnapshots = false; // Boolean | 
        try {
            DatabaseBackupOps result = apiInstance.getBackupOps(dmmId, id, loadStorageSnapshots);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupOps");
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
 **id** | [**UUID**](.md)| ID of the backup |
 **loadStorageSnapshots** | **Boolean**|  | [optional] [default to false]

### Return type

[**DatabaseBackupOps**](DatabaseBackupOps.md)

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


## getBackupRequest

> DatabaseBackup getBackupRequest(availabilityMachineId, id)

get backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        UUID id = new UUID(); // UUID | Id of the database backup
        try {
            DatabaseBackup result = apiInstance.getBackupRequest(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupRequest");
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
 **id** | [**UUID**](.md)| Id of the database backup |

### Return type

[**DatabaseBackup**](DatabaseBackup.md)

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


## getBackupRestoreInfo

> DbBackupRestoreInfo getBackupRestoreInfo(id, backupId, recoveryTimestamp, timeZone)

Get the restore or clone information for the specified snapshot or the recovery-timestamp

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the Availability Machine
        UUID backupId = new UUID(); // UUID | ID of the snapshot
        String recoveryTimestamp = "recoveryTimestamp_example"; // String | The recovery timestamp
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            DbBackupRestoreInfo result = apiInstance.getBackupRestoreInfo(id, backupId, recoveryTimestamp, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupRestoreInfo");
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
 **backupId** | [**UUID**](.md)| ID of the snapshot | [optional]
 **recoveryTimestamp** | **String**| The recovery timestamp | [optional]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**DbBackupRestoreInfo**](DbBackupRestoreInfo.md)

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


## getBackups

> List&lt;DatabaseBackupOps&gt; getBackups(dmmId, statuses, skipStatuses, name, primaryBackupsOnly, sanitizationScheduleId, types, skipTypes, dapBased, loadSubscriptions, backupIdentifier, dbBackupType, retentionTypes, loadStorageSnapshots, pageSize, pageOffset, timeZone)

Get list of backups for a Availability machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        List<DbBackupStatus> statuses = Arrays.asList(); // List<DbBackupStatus> | statuses
        List<DbBackupStatus> skipStatuses = Arrays.asList(); // List<DbBackupStatus> | skip-statuses
        String name = "name_example"; // String | Name of the backup
        Boolean primaryBackupsOnly = false; // Boolean | Setting this would only return the primary backups (i.e. the RPO based/manual backups taken directly on the service)
        UUID sanitizationScheduleId = new UUID(); // UUID | sanitization-schedule-id
        List<BackupType> types = Arrays.asList(); // List<BackupType> | types
        List<BackupType> skipTypes = Arrays.asList(); // List<BackupType> | skip-types
        Boolean dapBased = true; // Boolean | Whether to return Dap based backups or not
        Boolean loadSubscriptions = false; // Boolean | load-subscriptions
        UUID backupIdentifier = new UUID(); // UUID | backupIdentifier
        DbBackupType dbBackupType = DbBackupType.fromValue("dbNativeBackup"); // DbBackupType | 
        List<DbBackupRetentionType> retentionTypes = Arrays.asList(); // List<DbBackupRetentionType> | Filter backups based on retention type/s
        Boolean loadStorageSnapshots = false; // Boolean | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<DatabaseBackupOps> result = apiInstance.getBackups(dmmId, statuses, skipStatuses, name, primaryBackupsOnly, sanitizationScheduleId, types, skipTypes, dapBased, loadSubscriptions, backupIdentifier, dbBackupType, retentionTypes, loadStorageSnapshots, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackups");
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
 **statuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| skip-statuses | [optional]
 **name** | **String**| Name of the backup | [optional]
 **primaryBackupsOnly** | **Boolean**| Setting this would only return the primary backups (i.e. the RPO based/manual backups taken directly on the service) | [optional] [default to false]
 **sanitizationScheduleId** | [**UUID**](.md)| sanitization-schedule-id | [optional]
 **types** | [**List&lt;BackupType&gt;**](BackupType.md)| types | [optional]
 **skipTypes** | [**List&lt;BackupType&gt;**](BackupType.md)| skip-types | [optional]
 **dapBased** | **Boolean**| Whether to return Dap based backups or not | [optional]
 **loadSubscriptions** | **Boolean**| load-subscriptions | [optional] [default to false]
 **backupIdentifier** | [**UUID**](.md)| backupIdentifier | [optional]
 **dbBackupType** | [**DbBackupType**](.md)|  | [optional] [enum: dbNativeBackup, snapshotBackup]
 **retentionTypes** | [**List&lt;DbBackupRetentionType&gt;**](DbBackupRetentionType.md)| Filter backups based on retention type/s | [optional]
 **loadStorageSnapshots** | **Boolean**|  | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;DatabaseBackupOps&gt;**](DatabaseBackupOps.md)

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


## getBackupsForDap

> GetBackupsApiResponse getBackupsForDap(dmmId, dapId, name, statuses, skipStatuses, loadSubscriptions, types, skipTypes, dbBackupType, pageSize, pageOffset, timeZone)

Get Backups for a DAP

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID dapId = new UUID(); // UUID | ID of the Access Policy
        String name = "name_example"; // String | Name of the backup
        List<DbBackupStatus> statuses = Arrays.asList(); // List<DbBackupStatus> | statuses
        List<DbBackupStatus> skipStatuses = Arrays.asList(); // List<DbBackupStatus> | skip-statuses
        Boolean loadSubscriptions = false; // Boolean | load-subscriptions
        List<BackupType> types = Arrays.asList(); // List<BackupType> | types
        List<BackupType> skipTypes = Arrays.asList(); // List<BackupType> | skip-types
        DbBackupType dbBackupType = DbBackupType.fromValue("dbNativeBackup"); // DbBackupType | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetBackupsApiResponse result = apiInstance.getBackupsForDap(dmmId, dapId, name, statuses, skipStatuses, loadSubscriptions, types, skipTypes, dbBackupType, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupsForDap");
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
 **dapId** | [**UUID**](.md)| ID of the Access Policy |
 **name** | **String**| Name of the backup | [optional]
 **statuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| skip-statuses | [optional]
 **loadSubscriptions** | **Boolean**| load-subscriptions | [optional] [default to false]
 **types** | [**List&lt;BackupType&gt;**](BackupType.md)| types | [optional]
 **skipTypes** | [**List&lt;BackupType&gt;**](BackupType.md)| skip-types | [optional]
 **dbBackupType** | [**DbBackupType**](.md)|  | [optional] [enum: dbNativeBackup, snapshotBackup]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetBackupsApiResponse**](GetBackupsApiResponse.md)

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


## getBackupsForUtilization

> List&lt;DatabaseBackupOps&gt; getBackupsForUtilization(dmmId, primaryBackupsOnly, dapId, filterOnBackupTime, filterOnDeletedForUserTime, loadSubscriptionInfo, statuses, skipStatuses, loadStorageSnapshots, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone)

View a list of available Backups for utilization

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        Boolean primaryBackupsOnly = false; // Boolean | Whether to return primary backups only
        UUID dapId = new UUID(); // UUID | dapId
        Boolean filterOnBackupTime = false; // Boolean | filter-on-backup-time
        Boolean filterOnDeletedForUserTime = false; // Boolean | filter-on-deleted-for-user-time
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        List<DbBackupStatus> statuses = Arrays.asList(); // List<DbBackupStatus> | status list
        List<DbBackupStatus> skipStatuses = Arrays.asList(); // List<DbBackupStatus> | status list
        Boolean loadStorageSnapshots = false; // Boolean | 
        String timeRangeBeginAt = "2022-04-10T04:20:30.000+0000"; // String | Start timestamp
        String timeRangeEndAt = "2022-04-10T04:20:30.000+0000"; // String | End timestamp
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            List<DatabaseBackupOps> result = apiInstance.getBackupsForUtilization(dmmId, primaryBackupsOnly, dapId, filterOnBackupTime, filterOnDeletedForUserTime, loadSubscriptionInfo, statuses, skipStatuses, loadStorageSnapshots, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupsForUtilization");
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
 **primaryBackupsOnly** | **Boolean**| Whether to return primary backups only | [optional] [default to false]
 **dapId** | [**UUID**](.md)| dapId | [optional]
 **filterOnBackupTime** | **Boolean**| filter-on-backup-time | [optional] [default to false]
 **filterOnDeletedForUserTime** | **Boolean**| filter-on-deleted-for-user-time | [optional] [default to false]
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **statuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| status list | [optional]
 **skipStatuses** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| status list | [optional]
 **loadStorageSnapshots** | **Boolean**|  | [optional] [default to false]
 **timeRangeBeginAt** | **String**| Start timestamp | [optional]
 **timeRangeEndAt** | **String**| End timestamp | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**List&lt;DatabaseBackupOps&gt;**](DatabaseBackupOps.md)

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


## getBackupsInternal

> TessellDatabaseBackupsInternalResponse getBackupsInternal(status, name, dbBackupType, pageSize, pageOffset)

Get a list of available Backups for internal use

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        List<DbBackupStatus> status = Arrays.asList(); // List<DbBackupStatus> | status
        String name = "name_example"; // String | Name of the backup
        DbBackupType dbBackupType = DbBackupType.fromValue("dbNativeBackup"); // DbBackupType | 
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            TessellDatabaseBackupsInternalResponse result = apiInstance.getBackupsInternal(status, name, dbBackupType, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getBackupsInternal");
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
 **status** | [**List&lt;DbBackupStatus&gt;**](DbBackupStatus.md)| status |
 **name** | **String**| Name of the backup | [optional]
 **dbBackupType** | [**DbBackupType**](.md)|  | [optional] [enum: dbNativeBackup, snapshotBackup]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**TessellDatabaseBackupsInternalResponse**](TessellDatabaseBackupsInternalResponse.md)

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


## getDatabaseBackups

> GetDatabaseBackupsResponse getDatabaseBackups(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone)

View a list of available Tessell Backups

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | Id of the Availability Machine
        String name = "name_example"; // String | Name of the backup
        List<DatabaseBackupStatus> status = Arrays.asList(); // List<DatabaseBackupStatus> | status
        Boolean automated = true; // Boolean | Specify if automated backups info is to be fetched
        Boolean manual = true; // Boolean | Specify if manual backups info is to be fetched
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDatabaseBackupsResponse result = apiInstance.getDatabaseBackups(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDatabaseBackups");
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
 **name** | **String**| Name of the backup | [optional]
 **status** | [**List&lt;DatabaseBackupStatus&gt;**](DatabaseBackupStatus.md)| status | [optional]
 **automated** | **Boolean**| Specify if automated backups info is to be fetched | [optional] [default to true]
 **manual** | **Boolean**| Specify if manual backups info is to be fetched | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDatabaseBackupsResponse**](GetDatabaseBackupsResponse.md)

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


## getDatabaseSnapshot

> DatabaseSnapshot getDatabaseSnapshot(availabilityMachineId, id)

Get details about the specified snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID id = new UUID(); // UUID | ID of the snapshot
        try {
            DatabaseSnapshot result = apiInstance.getDatabaseSnapshot(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDatabaseSnapshot");
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
 **id** | [**UUID**](.md)| ID of the snapshot |

### Return type

[**DatabaseSnapshot**](DatabaseSnapshot.md)

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


## getDatabaseSnapshots

> GetDatabaseSnapshotsResponse getDatabaseSnapshots(availabilityMachineId, name, status, automated, manual, sanitizable, loadAcls, pageSize, pageOffset, timeZone)

Get list of snapshots for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        String name = "name_example"; // String | Filter the result based on snapshot name
        List<DatabaseBackupStatus> status = Arrays.asList(); // List<DatabaseBackupStatus> | Filter the result based on snapshot status
        Boolean automated = true; // Boolean | Filter the result based on if the snapshot is automated
        Boolean manual = true; // Boolean | Filter the result based on if the snapshot is manual
        Boolean sanitizable = false; // Boolean | Filter the result based on if the snapshot is sanitizable
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetDatabaseSnapshotsResponse result = apiInstance.getDatabaseSnapshots(availabilityMachineId, name, status, automated, manual, sanitizable, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDatabaseSnapshots");
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
 **name** | **String**| Filter the result based on snapshot name | [optional]
 **status** | [**List&lt;DatabaseBackupStatus&gt;**](DatabaseBackupStatus.md)| Filter the result based on snapshot status | [optional]
 **automated** | **Boolean**| Filter the result based on if the snapshot is automated | [optional] [default to true]
 **manual** | **Boolean**| Filter the result based on if the snapshot is manual | [optional] [default to true]
 **sanitizable** | **Boolean**| Filter the result based on if the snapshot is sanitizable | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetDatabaseSnapshotsResponse**](GetDatabaseSnapshotsResponse.md)

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


## getDbBackupChainInfo

> DbBackupChainInfo getDbBackupChainInfo(dmmId, backupId, forward)

Get backup chain for a given Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID backupId = new UUID(); // UUID | ID of backup
        Boolean forward = false; // Boolean | For a specified backup, get forward chain of backups until next full backup (excluding next full backup)
        try {
            DbBackupChainInfo result = apiInstance.getDbBackupChainInfo(dmmId, backupId, forward);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDbBackupChainInfo");
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
 **backupId** | [**UUID**](.md)| ID of backup |
 **forward** | **Boolean**| For a specified backup, get forward chain of backups until next full backup (excluding next full backup) | [optional] [default to false]

### Return type

[**DbBackupChainInfo**](DbBackupChainInfo.md)

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


## getDbBackupCloudResourceSharingInfo

> DbBackupCloudResourceSharingInfo getDbBackupCloudResourceSharingInfo(dmmId, cloudResourceId, evaluateLeakage)

Get list of backups info which share the same underlying cloud snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        String cloudResourceId = "cloudResourceId_example"; // String | The cloud resource id for the backup
        Boolean evaluateLeakage = false; // Boolean | Specify whether to evaluate leakage for the specified cloud-resource-id
        try {
            DbBackupCloudResourceSharingInfo result = apiInstance.getDbBackupCloudResourceSharingInfo(dmmId, cloudResourceId, evaluateLeakage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDbBackupCloudResourceSharingInfo");
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
 **cloudResourceId** | **String**| The cloud resource id for the backup |
 **evaluateLeakage** | **Boolean**| Specify whether to evaluate leakage for the specified cloud-resource-id | [optional] [default to false]

### Return type

[**DbBackupCloudResourceSharingInfo**](DbBackupCloudResourceSharingInfo.md)

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


## getDbBackupLineageInfo

> DbBackupLineageInfo getDbBackupLineageInfo(dmmId, backupId)

Get backup lineage info for a given Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID backupId = new UUID(); // UUID | ID of backup
        try {
            DbBackupLineageInfo result = apiInstance.getDbBackupLineageInfo(dmmId, backupId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getDbBackupLineageInfo");
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
 **backupId** | [**UUID**](.md)| ID of backup |

### Return type

[**DbBackupLineageInfo**](DbBackupLineageInfo.md)

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


## getSanitizedDatabaseSnapshot

> SanitizedDatabaseSnapshot getSanitizedDatabaseSnapshot(availabilityMachineId, id)

Get details about the specified Sanitized Snapshot

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        UUID id = new UUID(); // UUID | ID of the Sanitized Snapshot
        try {
            SanitizedDatabaseSnapshot result = apiInstance.getSanitizedDatabaseSnapshot(availabilityMachineId, id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getSanitizedDatabaseSnapshot");
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
 **id** | [**UUID**](.md)| ID of the Sanitized Snapshot |

### Return type

[**SanitizedDatabaseSnapshot**](SanitizedDatabaseSnapshot.md)

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


## getSanitizedDatabaseSnapshots

> GetSanitizedDatabaseSnapshotsResponse getSanitizedDatabaseSnapshots(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone)

Get list of sanitized snapshots for an Availability Machine

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | ID of the Availability Machine
        String name = "name_example"; // String | Filter the result based on Sanitized Snapshot name
        List<DatabaseBackupStatus> status = Arrays.asList(); // List<DatabaseBackupStatus> | Filter the result based on Sanitized Snapshot status
        Boolean automated = true; // Boolean | Filter the result based on if the Sanitized Snapshot is automated
        Boolean manual = true; // Boolean | Filter the result based on if the Sanitized Snapshot is manual
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            GetSanitizedDatabaseSnapshotsResponse result = apiInstance.getSanitizedDatabaseSnapshots(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#getSanitizedDatabaseSnapshots");
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
 **name** | **String**| Filter the result based on Sanitized Snapshot name | [optional]
 **status** | [**List&lt;DatabaseBackupStatus&gt;**](DatabaseBackupStatus.md)| Filter the result based on Sanitized Snapshot status | [optional]
 **automated** | **Boolean**| Filter the result based on if the Sanitized Snapshot is automated | [optional] [default to true]
 **manual** | **Boolean**| Filter the result based on if the Sanitized Snapshot is manual | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**GetSanitizedDatabaseSnapshotsResponse**](GetSanitizedDatabaseSnapshotsResponse.md)

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


## lockBackup

> ApiStatus lockBackup(dmmId, backupId, tessellLockBackupPayload)

Lock a backup entry

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID backupId = new UUID(); // UUID | ID of the backup
        TessellLockBackupPayload tessellLockBackupPayload = new TessellLockBackupPayload(); // TessellLockBackupPayload | 
        try {
            ApiStatus result = apiInstance.lockBackup(dmmId, backupId, tessellLockBackupPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#lockBackup");
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
 **backupId** | [**UUID**](.md)| ID of the backup |
 **tessellLockBackupPayload** | [**TessellLockBackupPayload**](TessellLockBackupPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## preAuthUrlsCallback

> preAuthUrlsCallback(id, preAuthUrlsCallbackPayload)

Callback for bulk pre auth urls creation

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        PreAuthUrlsCallbackPayload preAuthUrlsCallbackPayload = new PreAuthUrlsCallbackPayload(); // PreAuthUrlsCallbackPayload | 
        try {
            apiInstance.preAuthUrlsCallback(id, preAuthUrlsCallbackPayload);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#preAuthUrlsCallback");
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
 **preAuthUrlsCallbackPayload** | [**PreAuthUrlsCallbackPayload**](PreAuthUrlsCallbackPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## refreshBackupSizeRequestOps

> TaskSummary refreshBackupSizeRequestOps(forAllAms, forRecordedAms, refreshSnapshotSizeTaskPayload)

Internal request to refresh snapshot size from respective cloud

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        Boolean forAllAms = false; // Boolean | Refresh snapshot size for all Availability machines
        Boolean forRecordedAms = false; // Boolean | Refresh snapshot size for recorded Availability machines
        RefreshSnapshotSizeTaskPayload refreshSnapshotSizeTaskPayload = new RefreshSnapshotSizeTaskPayload(); // RefreshSnapshotSizeTaskPayload | 
        try {
            TaskSummary result = apiInstance.refreshBackupSizeRequestOps(forAllAms, forRecordedAms, refreshSnapshotSizeTaskPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#refreshBackupSizeRequestOps");
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
 **forAllAms** | **Boolean**| Refresh snapshot size for all Availability machines | [optional] [default to false]
 **forRecordedAms** | **Boolean**| Refresh snapshot size for recorded Availability machines | [optional] [default to false]
 **refreshSnapshotSizeTaskPayload** | [**RefreshSnapshotSizeTaskPayload**](RefreshSnapshotSizeTaskPayload.md)|  | [optional]

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## replicateBackupsCallback

> ApiStatus replicateBackupsCallback(id, replicateBackupsCallbackPayload)

Callback for snapshot database service

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the Availability Machine
        ReplicateBackupsCallbackPayload replicateBackupsCallbackPayload = new ReplicateBackupsCallbackPayload(); // ReplicateBackupsCallbackPayload | 
        try {
            ApiStatus result = apiInstance.replicateBackupsCallback(id, replicateBackupsCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#replicateBackupsCallback");
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
 **replicateBackupsCallbackPayload** | [**ReplicateBackupsCallbackPayload**](ReplicateBackupsCallbackPayload.md)|  |

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
| **201** | Created |  -  |
| **0** | API error response |  -  |


## updateBackup

> DatabaseBackupOps updateBackup(dmmId, id, databaseBackupOps, forStopDb)

Update a Tessell Database Backup

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID id = new UUID(); // UUID | ID of the backup
        DatabaseBackupOps databaseBackupOps = new DatabaseBackupOps(); // DatabaseBackupOps | 
        Boolean forStopDb = false; // Boolean | for stop of database, this backup would be used while starting the database
        try {
            DatabaseBackupOps result = apiInstance.updateBackup(dmmId, id, databaseBackupOps, forStopDb);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#updateBackup");
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
 **id** | [**UUID**](.md)| ID of the backup |
 **databaseBackupOps** | [**DatabaseBackupOps**](DatabaseBackupOps.md)|  |
 **forStopDb** | **Boolean**| for stop of database, this backup would be used while starting the database | [optional] [default to false]

### Return type

[**DatabaseBackupOps**](DatabaseBackupOps.md)

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


## updateBackupSizeOps

> ApiStatus updateBackupSizeOps(dmmId, updateSnapshotSizePayload)

Update Backup Size information

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UpdateSnapshotSizePayload updateSnapshotSizePayload = new UpdateSnapshotSizePayload(); // UpdateSnapshotSizePayload | 
        try {
            ApiStatus result = apiInstance.updateBackupSizeOps(dmmId, updateSnapshotSizePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#updateBackupSizeOps");
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
 **updateSnapshotSizePayload** | [**UpdateSnapshotSizePayload**](UpdateSnapshotSizePayload.md)|  |

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


## updateBackupWithPut

> DatabaseBackupOps updateBackupWithPut(dmmId, id, databaseBackupOps)

Update a Tessell Database Backup using PUT

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        UUID id = new UUID(); // UUID | ID of the backup
        DatabaseBackupOps databaseBackupOps = new DatabaseBackupOps(); // DatabaseBackupOps | 
        try {
            DatabaseBackupOps result = apiInstance.updateBackupWithPut(dmmId, id, databaseBackupOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#updateBackupWithPut");
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
 **id** | [**UUID**](.md)| ID of the backup |
 **databaseBackupOps** | [**DatabaseBackupOps**](DatabaseBackupOps.md)|  |

### Return type

[**DatabaseBackupOps**](DatabaseBackupOps.md)

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


## validateBackupForCloneCreation

> CloneBackupValidationResponse validateBackupForCloneCreation(dmmId, cloneBackupValidationPayload)

Validate a backup for clone creation

### Example

```java
// Import classes:
import com.tessell.dmm.client.invoker.ApiClient;
import com.tessell.dmm.client.invoker.ApiException;
import com.tessell.dmm.client.invoker.Configuration;
import com.tessell.dmm.client.invoker.models.*;
import com.tessell.dmm.client.api.DbBackupApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8082");

        DbBackupApi apiInstance = new DbBackupApi(defaultClient);
        UUID dmmId = new UUID(); // UUID | ID of Availability machine
        CloneBackupValidationPayload cloneBackupValidationPayload = new CloneBackupValidationPayload(); // CloneBackupValidationPayload | 
        try {
            CloneBackupValidationResponse result = apiInstance.validateBackupForCloneCreation(dmmId, cloneBackupValidationPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DbBackupApi#validateBackupForCloneCreation");
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
 **cloneBackupValidationPayload** | [**CloneBackupValidationPayload**](CloneBackupValidationPayload.md)|  |

### Return type

[**CloneBackupValidationResponse**](CloneBackupValidationResponse.md)

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

