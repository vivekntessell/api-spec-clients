# TessellServiceControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInstancesCallback**](TessellServiceControllerApi.md#addInstancesCallback) | **POST** /tessell-ops/services/{service-id}/instances/add/{instance-group-id}/callback | Callback for add DB service instances
[**addTessellServiceInstances**](TessellServiceControllerApi.md#addTessellServiceInstances) | **POST** /services/{id}/service-instances | Add DB service Instances
[**bulkDeleteTessellServices**](TessellServiceControllerApi.md#bulkDeleteTessellServices) | **DELETE** /tessell-ops/services/bulk-delete | Delete the tessell services for subscription.
[**cleanupFailedTessellServiceEntry**](TessellServiceControllerApi.md#cleanupFailedTessellServiceEntry) | **DELETE** /services/{id}/cleanup-entry | Cleanup a failed DB service entry
[**cloneForBackupSanitization**](TessellServiceControllerApi.md#cloneForBackupSanitization) | **POST** /tessell-ops/dmms/{availability-machine-id}/sanitization-clones | Create a clone for backup sanitization
[**cloneForNativeBackup**](TessellServiceControllerApi.md#cloneForNativeBackup) | **POST** /tessell-ops/dmms/{availability-machine-id}/native-backups | Create a native backup
[**cloneTessellService**](TessellServiceControllerApi.md#cloneTessellService) | **POST** /availability-machines/{availability-machine-id}/clones | Clone a DB service
[**createTessellServiceOps**](TessellServiceControllerApi.md#createTessellServiceOps) | **POST** /tessell-ops/services | Create a DB Service Object (ops)
[**dbServiceAddIntegrationCallback**](TessellServiceControllerApi.md#dbServiceAddIntegrationCallback) | **POST** /tessell-ops/services/callback/add-integrations | Callback for DB service add integrations
[**dbServiceConnectivityUpdateCallback**](TessellServiceControllerApi.md#dbServiceConnectivityUpdateCallback) | **POST** /tessell-ops/services/callback/connectivity-updates | Callback for DB Service connectivity updates
[**dbServiceCredUpdateCallback**](TessellServiceControllerApi.md#dbServiceCredUpdateCallback) | **POST** /tessell-ops/services/callback/cred-updates | Callback for DB Service cred updates
[**deleteInstancesCallback**](TessellServiceControllerApi.md#deleteInstancesCallback) | **POST** /tessell-ops/services/{service-id}/instances/delete/callback | Callback for add DB service instances
[**deleteTessellService**](TessellServiceControllerApi.md#deleteTessellService) | **DELETE** /services/{id} | Delete a DB service
[**deleteTessellServiceInstances**](TessellServiceControllerApi.md#deleteTessellServiceInstances) | **DELETE** /services/{id}/service-instances | Delete DB service Instances
[**deleteTessellServiceOps**](TessellServiceControllerApi.md#deleteTessellServiceOps) | **DELETE** /tessell-ops/services/{id} | Delete a DB Service Metadata
[**deleteTessellServiceOpsRequest**](TessellServiceControllerApi.md#deleteTessellServiceOpsRequest) | **DELETE** /tessell-ops/services/{id}/delete | Delete a DB Service Internal Request
[**deleteTessellServiceTags**](TessellServiceControllerApi.md#deleteTessellServiceTags) | **DELETE** /services/{id}/tags | Delete tags for a DB Service
[**failoverTessellServiceOps**](TessellServiceControllerApi.md#failoverTessellServiceOps) | **PATCH** /tessell-ops/services/{id}/failover | Failover a DB Service (for now, hidden from service consumers)
[**getBulkDeleteTessellServicesStatus**](TessellServiceControllerApi.md#getBulkDeleteTessellServicesStatus) | **POST** /tessell-ops/services/bulk-delete | get status of bulk delete api
[**getDBServiceParameterProfileUpdateImpact**](TessellServiceControllerApi.md#getDBServiceParameterProfileUpdateImpact) | **POST** /services/{service-id}/parameter-profiles/impact | Impact assessment for update parameter profile request
[**getTessellService**](TessellServiceControllerApi.md#getTessellService) | **GET** /services/{id} | Get a DB Service by Id
[**getTessellServiceCredentials**](TessellServiceControllerApi.md#getTessellServiceCredentials) | **GET** /services/{id}/creds | Get credentials for a DB Service
[**getTessellServiceOps**](TessellServiceControllerApi.md#getTessellServiceOps) | **GET** /tessell-ops/services/{id} | Get a DB Service By Id
[**getTessellServiceTags**](TessellServiceControllerApi.md#getTessellServiceTags) | **GET** /services/{id}/tags | View tags for the DB Service
[**getTessellServiceTimeline**](TessellServiceControllerApi.md#getTessellServiceTimeline) | **GET** /services/{id}/timeline | Get a DB timeline by service ID
[**getTessellServices**](TessellServiceControllerApi.md#getTessellServices) | **GET** /services | View list of available DB Services
[**getTessellServicesOps**](TessellServiceControllerApi.md#getTessellServicesOps) | **GET** /tessell-ops/services | View a list of available DB Services Ops
[**patchSoftwareForTessellService**](TessellServiceControllerApi.md#patchSoftwareForTessellService) | **PATCH** /services/{id}/patch-software | Patches the DB Service Software
[**patchTessellServiceCallback**](TessellServiceControllerApi.md#patchTessellServiceCallback) | **POST** /tessell-ops/services/callback/patch-software | Callback for patch Tessell service
[**provisionTessellService**](TessellServiceControllerApi.md#provisionTessellService) | **POST** /services | Provision a DB service
[**provisionTessellServiceCallback**](TessellServiceControllerApi.md#provisionTessellServiceCallback) | **POST** /tessell-ops/services/callback/provision | Callback for provision Tessell service
[**rebootDBService**](TessellServiceControllerApi.md#rebootDBService) | **POST** /tessell-ops/services/{service-id}/reboot | Reboot a DB service
[**rebootDBServiceCallback**](TessellServiceControllerApi.md#rebootDBServiceCallback) | **POST** /tessell-ops/services/{service-id}/callback/reboot | Process response for DB reboot plugins workflow
[**resizeDBService**](TessellServiceControllerApi.md#resizeDBService) | **PATCH** /services/{id}/resize | Resize DB service storage/compute
[**resizeDBServiceCallback**](TessellServiceControllerApi.md#resizeDBServiceCallback) | **POST** /tessell-ops/services/{id}/callback/resize | Update the service status as per resize operation status
[**restoreTessellService**](TessellServiceControllerApi.md#restoreTessellService) | **POST** /services/{id}/restore | Restore a DB Service
[**restoreTessellServiceCallback**](TessellServiceControllerApi.md#restoreTessellServiceCallback) | **POST** /tessell-ops/services/callback/restore | Callback for restore Tessell service
[**startTessellService**](TessellServiceControllerApi.md#startTessellService) | **PATCH** /services/{id}/start | Starts the DB Service
[**startTessellServiceCallback**](TessellServiceControllerApi.md#startTessellServiceCallback) | **POST** /tessell-ops/services/callback/start | Callback for start Tessell service
[**startTessellServiceOpsRequest**](TessellServiceControllerApi.md#startTessellServiceOpsRequest) | **PATCH** /tessell-ops/services/{id}/start | Start a DB Service Internal Request
[**stopTessellService**](TessellServiceControllerApi.md#stopTessellService) | **PATCH** /services/{id}/stop | Stops the DB Service
[**stopTessellServiceCallback**](TessellServiceControllerApi.md#stopTessellServiceCallback) | **POST** /tessell-ops/services/callback/stop | Callback for stop Tessell service
[**stopTessellServiceOps**](TessellServiceControllerApi.md#stopTessellServiceOps) | **PATCH** /tessell-ops/services/{id}/stop | Stop a DB Service Ops
[**switchoverTessellService**](TessellServiceControllerApi.md#switchoverTessellService) | **PATCH** /services/{id}/switchover | Switchover a DB Service
[**switchoverTessellServiceCallback**](TessellServiceControllerApi.md#switchoverTessellServiceCallback) | **POST** /tessell-ops/services/callback/switchover | Callback for switchover Tessell service
[**updateDBServiceParameterProfiles**](TessellServiceControllerApi.md#updateDBServiceParameterProfiles) | **PATCH** /services/{service-id}/parameter-profiles | Update parameter profile/s for instances in service
[**updateDBServiceParameterProfilesCallback**](TessellServiceControllerApi.md#updateDBServiceParameterProfilesCallback) | **POST** /tessell-ops/services/{service-id}/parameter-profiles/callback/update | Process response for DB parameter profile update workflow
[**updateDBServiceParameterProfilesOps**](TessellServiceControllerApi.md#updateDBServiceParameterProfilesOps) | **PATCH** /tessell-ops/services/{service-id}/parameter-profiles | Update parameter profile/s for instances in service
[**updateTessellService**](TessellServiceControllerApi.md#updateTessellService) | **PATCH** /services/{id} | Update a DB service
[**updateTessellServiceAgentLcmInfoOps**](TessellServiceControllerApi.md#updateTessellServiceAgentLcmInfoOps) | **PATCH** /tessell-ops/services/{id}/agent-lcm | Update a DB Service Agent LCM Info
[**updateTessellServiceConnectivity**](TessellServiceControllerApi.md#updateTessellServiceConnectivity) | **PATCH** /services/{id}/connectivity | Update DB Service Connectivity
[**updateTessellServiceConnectivityOps**](TessellServiceControllerApi.md#updateTessellServiceConnectivityOps) | **PATCH** /tessell-ops/services/{service-id}/connectivity | Update Tessell service Connectivity internal API
[**updateTessellServiceCredentials**](TessellServiceControllerApi.md#updateTessellServiceCredentials) | **PATCH** /services/{id}/creds | Update DB service credentials
[**updateTessellServiceGenieConfigOps**](TessellServiceControllerApi.md#updateTessellServiceGenieConfigOps) | **PATCH** /tessell-ops/services/{id}/genie | Update a DB Service&#39;s Genie Config Information Ops
[**updateTessellServiceIntegration**](TessellServiceControllerApi.md#updateTessellServiceIntegration) | **PATCH** /services/{id}/integrations | Add/update an integration for the DB Service
[**updateTessellServiceOps**](TessellServiceControllerApi.md#updateTessellServiceOps) | **PATCH** /tessell-ops/services/{id} | Update a DB Service
[**upgradeEligibilityForTessellServiceOps**](TessellServiceControllerApi.md#upgradeEligibilityForTessellServiceOps) | **GET** /tessell-ops/services/{id}/library-upgrade-eligibility | Check if Tessell libraries on computes related to a DB Service can be upgraded
[**upsertTessellServiceTags**](TessellServiceControllerApi.md#upsertTessellServiceTags) | **PATCH** /services/{id}/tags | Create/update (override) tags for the DB Service



## addInstancesCallback

> ApiStatus addInstancesCallback(serviceId, instanceGroupId, addInstancesCallbackPayload)

Callback for add DB service instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        UUID instanceGroupId = new UUID(); // UUID | instance-group-id
        AddInstancesCallbackPayload addInstancesCallbackPayload = new AddInstancesCallbackPayload(); // AddInstancesCallbackPayload | 
        try {
            ApiStatus result = apiInstance.addInstancesCallback(serviceId, instanceGroupId, addInstancesCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#addInstancesCallback");
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
 **serviceId** | [**UUID**](.md)| service-id |
 **instanceGroupId** | [**UUID**](.md)| instance-group-id |
 **addInstancesCallbackPayload** | [**AddInstancesCallbackPayload**](AddInstancesCallbackPayload.md)|  |

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


## addTessellServiceInstances

> TaskSummary addTessellServiceInstances(id, addDbServiceInstancesPayload)

Add DB service Instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        AddDbServiceInstancesPayload addDbServiceInstancesPayload = new AddDbServiceInstancesPayload(); // AddDbServiceInstancesPayload | 
        try {
            TaskSummary result = apiInstance.addTessellServiceInstances(id, addDbServiceInstancesPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#addTessellServiceInstances");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **addDbServiceInstancesPayload** | [**AddDbServiceInstancesPayload**](AddDbServiceInstancesPayload.md)|  |

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


## bulkDeleteTessellServices

> ResourceBulkDeleteResponseOps bulkDeleteTessellServices(bulkDeleteTessellServicesPayload)

Delete the tessell services for subscription.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        BulkDeleteTessellServicesPayload bulkDeleteTessellServicesPayload = new BulkDeleteTessellServicesPayload(); // BulkDeleteTessellServicesPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteTessellServices(bulkDeleteTessellServicesPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#bulkDeleteTessellServices");
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
 **bulkDeleteTessellServicesPayload** | [**BulkDeleteTessellServicesPayload**](BulkDeleteTessellServicesPayload.md)|  |

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


## cleanupFailedTessellServiceEntry

> ApiStatus cleanupFailedTessellServiceEntry(id)

Cleanup a failed DB service entry

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        try {
            ApiStatus result = apiInstance.cleanupFailedTessellServiceEntry(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#cleanupFailedTessellServiceEntry");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |

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


## cloneForBackupSanitization

> TaskSummary cloneForBackupSanitization(availabilityMachineId, sanitizeBackupClonePayload)

Create a clone for backup sanitization

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | The Id of the Availability Machine
        SanitizeBackupClonePayload sanitizeBackupClonePayload = new SanitizeBackupClonePayload(); // SanitizeBackupClonePayload | 
        try {
            TaskSummary result = apiInstance.cloneForBackupSanitization(availabilityMachineId, sanitizeBackupClonePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#cloneForBackupSanitization");
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
 **availabilityMachineId** | [**UUID**](.md)| The Id of the Availability Machine |
 **sanitizeBackupClonePayload** | [**SanitizeBackupClonePayload**](SanitizeBackupClonePayload.md)|  |

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


## cloneForNativeBackup

> TaskSummary cloneForNativeBackup(availabilityMachineId, createNativeBackupOpsPayload)

Create a native backup

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | The Id of the Availability Machine
        CreateNativeBackupOpsPayload createNativeBackupOpsPayload = new CreateNativeBackupOpsPayload(); // CreateNativeBackupOpsPayload | 
        try {
            TaskSummary result = apiInstance.cloneForNativeBackup(availabilityMachineId, createNativeBackupOpsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#cloneForNativeBackup");
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
 **availabilityMachineId** | [**UUID**](.md)| The Id of the Availability Machine |
 **createNativeBackupOpsPayload** | [**CreateNativeBackupOpsPayload**](CreateNativeBackupOpsPayload.md)|  |

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


## cloneTessellService

> TaskSummary cloneTessellService(availabilityMachineId, cloneTessellServicePayload)

Clone a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID availabilityMachineId = new UUID(); // UUID | The Id of the Availability Machine
        CloneTessellServicePayload cloneTessellServicePayload = new CloneTessellServicePayload(); // CloneTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.cloneTessellService(availabilityMachineId, cloneTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#cloneTessellService");
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
 **availabilityMachineId** | [**UUID**](.md)| The Id of the Availability Machine |
 **cloneTessellServicePayload** | [**CloneTessellServicePayload**](CloneTessellServicePayload.md)|  |

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


## createTessellServiceOps

> TessellServiceOpsDTO createTessellServiceOps(tessellServiceOpsDTO, haUpgradeOldServiceId)

Create a DB Service Object (ops)

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        TessellServiceOpsDTO tessellServiceOpsDTO = new TessellServiceOpsDTO(); // TessellServiceOpsDTO | 
        UUID haUpgradeOldServiceId = new UUID(); // UUID | If this entry is being created as part of HA upgrade flow, specify the old service (dbsystem) id
        try {
            TessellServiceOpsDTO result = apiInstance.createTessellServiceOps(tessellServiceOpsDTO, haUpgradeOldServiceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#createTessellServiceOps");
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
 **tessellServiceOpsDTO** | [**TessellServiceOpsDTO**](TessellServiceOpsDTO.md)|  |
 **haUpgradeOldServiceId** | [**UUID**](.md)| If this entry is being created as part of HA upgrade flow, specify the old service (dbsystem) id | [optional]

### Return type

[**TessellServiceOpsDTO**](TessellServiceOpsDTO.md)

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


## dbServiceAddIntegrationCallback

> ApiStatus dbServiceAddIntegrationCallback(dbServiceAddIntegrationCallbackPayload)

Callback for DB service add integrations

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        DbServiceAddIntegrationCallbackPayload dbServiceAddIntegrationCallbackPayload = new DbServiceAddIntegrationCallbackPayload(); // DbServiceAddIntegrationCallbackPayload | 
        try {
            ApiStatus result = apiInstance.dbServiceAddIntegrationCallback(dbServiceAddIntegrationCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#dbServiceAddIntegrationCallback");
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
 **dbServiceAddIntegrationCallbackPayload** | [**DbServiceAddIntegrationCallbackPayload**](DbServiceAddIntegrationCallbackPayload.md)|  |

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


## dbServiceConnectivityUpdateCallback

> ApiStatus dbServiceConnectivityUpdateCallback(dbServiceUpdateConnectivityCallbackPayload)

Callback for DB Service connectivity updates

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        DbServiceUpdateConnectivityCallbackPayload dbServiceUpdateConnectivityCallbackPayload = new DbServiceUpdateConnectivityCallbackPayload(); // DbServiceUpdateConnectivityCallbackPayload | 
        try {
            ApiStatus result = apiInstance.dbServiceConnectivityUpdateCallback(dbServiceUpdateConnectivityCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#dbServiceConnectivityUpdateCallback");
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
 **dbServiceUpdateConnectivityCallbackPayload** | [**DbServiceUpdateConnectivityCallbackPayload**](DbServiceUpdateConnectivityCallbackPayload.md)|  |

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


## dbServiceCredUpdateCallback

> ApiStatus dbServiceCredUpdateCallback(dbServiceUpdateCredsCallbackPayload)

Callback for DB Service cred updates

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        DbServiceUpdateCredsCallbackPayload dbServiceUpdateCredsCallbackPayload = new DbServiceUpdateCredsCallbackPayload(); // DbServiceUpdateCredsCallbackPayload | 
        try {
            ApiStatus result = apiInstance.dbServiceCredUpdateCallback(dbServiceUpdateCredsCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#dbServiceCredUpdateCallback");
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
 **dbServiceUpdateCredsCallbackPayload** | [**DbServiceUpdateCredsCallbackPayload**](DbServiceUpdateCredsCallbackPayload.md)|  |

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


## deleteInstancesCallback

> ApiStatus deleteInstancesCallback(serviceId, deleteInstancesCallbackPayload)

Callback for add DB service instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | service-id
        DeleteInstancesCallbackPayload deleteInstancesCallbackPayload = new DeleteInstancesCallbackPayload(); // DeleteInstancesCallbackPayload | 
        try {
            ApiStatus result = apiInstance.deleteInstancesCallback(serviceId, deleteInstancesCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteInstancesCallback");
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
 **serviceId** | [**UUID**](.md)| service-id |
 **deleteInstancesCallbackPayload** | [**DeleteInstancesCallbackPayload**](DeleteInstancesCallbackPayload.md)|  |

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


## deleteTessellService

> TaskSummary deleteTessellService(id, deleteTessellServicePayload)

Delete a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        DeleteTessellServicePayload deleteTessellServicePayload = new DeleteTessellServicePayload(); // DeleteTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.deleteTessellService(id, deleteTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **deleteTessellServicePayload** | [**DeleteTessellServicePayload**](DeleteTessellServicePayload.md)|  |

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


## deleteTessellServiceInstances

> TaskSummary deleteTessellServiceInstances(id, deleteTessellServiceInstancePayload)

Delete DB service Instances

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the DB Service
        DeleteTessellServiceInstancePayload deleteTessellServiceInstancePayload = new DeleteTessellServiceInstancePayload(); // DeleteTessellServiceInstancePayload | 
        try {
            TaskSummary result = apiInstance.deleteTessellServiceInstances(id, deleteTessellServiceInstancePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteTessellServiceInstances");
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
 **id** | [**UUID**](.md)| The id of the DB Service |
 **deleteTessellServiceInstancePayload** | [**DeleteTessellServiceInstancePayload**](DeleteTessellServiceInstancePayload.md)|  |

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


## deleteTessellServiceOps

> ApiStatus deleteTessellServiceOps(id, softDelete)

Delete a DB Service Metadata

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the DB Service
        Boolean softDelete = true; // Boolean | soft-delete
        try {
            ApiStatus result = apiInstance.deleteTessellServiceOps(id, softDelete);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteTessellServiceOps");
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
 **id** | [**UUID**](.md)| Id of the DB Service |
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


## deleteTessellServiceOpsRequest

> TaskSummary deleteTessellServiceOpsRequest(id, deleteTessellServicePayload)

Delete a DB Service Internal Request

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the DB Service
        DeleteTessellServicePayload deleteTessellServicePayload = new DeleteTessellServicePayload(); // DeleteTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.deleteTessellServiceOpsRequest(id, deleteTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteTessellServiceOpsRequest");
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
 **id** | [**UUID**](.md)| Id of the DB Service |
 **deleteTessellServicePayload** | [**DeleteTessellServicePayload**](DeleteTessellServicePayload.md)|  | [optional]

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


## deleteTessellServiceTags

> ApiStatus deleteTessellServiceTags(id, deleteTagPayload)

Delete tags for a DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        DeleteTagPayload deleteTagPayload = new DeleteTagPayload(); // DeleteTagPayload | 
        try {
            ApiStatus result = apiInstance.deleteTessellServiceTags(id, deleteTagPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#deleteTessellServiceTags");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **deleteTagPayload** | [**DeleteTagPayload**](DeleteTagPayload.md)|  |

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


## failoverTessellServiceOps

> TaskSummary failoverTessellServiceOps(id, body)

Failover a DB Service (for now, hidden from service consumers)

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        Object body = null; // Object | 
        try {
            TaskSummary result = apiInstance.failoverTessellServiceOps(id, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#failoverTessellServiceOps");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **body** | **Object**|  |

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


## getBulkDeleteTessellServicesStatus

> ResourceBulkDeleteResponseOps getBulkDeleteTessellServicesStatus(bulkDeleteTessellServicesStatusPayload)

get status of bulk delete api

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        BulkDeleteTessellServicesStatusPayload bulkDeleteTessellServicesStatusPayload = new BulkDeleteTessellServicesStatusPayload(); // BulkDeleteTessellServicesStatusPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.getBulkDeleteTessellServicesStatus(bulkDeleteTessellServicesStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getBulkDeleteTessellServicesStatus");
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
 **bulkDeleteTessellServicesStatusPayload** | [**BulkDeleteTessellServicesStatusPayload**](BulkDeleteTessellServicesStatusPayload.md)|  |

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


## getDBServiceParameterProfileUpdateImpact

> DBServiceParameterProfileUpdateImpactResponse getDBServiceParameterProfileUpdateImpact(serviceId, dbServiceParameterProfileUpdateRequest)

Impact assessment for update parameter profile request

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service ID
        DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest = new DBServiceParameterProfileUpdateRequest(); // DBServiceParameterProfileUpdateRequest | 
        try {
            DBServiceParameterProfileUpdateImpactResponse result = apiInstance.getDBServiceParameterProfileUpdateImpact(serviceId, dbServiceParameterProfileUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getDBServiceParameterProfileUpdateImpact");
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
 **serviceId** | [**UUID**](.md)| DB Service ID |
 **dbServiceParameterProfileUpdateRequest** | [**DBServiceParameterProfileUpdateRequest**](DBServiceParameterProfileUpdateRequest.md)|  |

### Return type

[**DBServiceParameterProfileUpdateImpactResponse**](DBServiceParameterProfileUpdateImpactResponse.md)

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


## getTessellService

> TessellServiceDTO getTessellService(id, loadInstances, loadDatabases, loadAcls, timeZone)

Get a DB Service by Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        Boolean loadInstances = true; // Boolean | Load the instances that are part of the DB Service
        Boolean loadDatabases = true; // Boolean | Load the databases that are part of the DB Service
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceDTO result = apiInstance.getTessellService(id, loadInstances, loadDatabases, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **loadInstances** | **Boolean**| Load the instances that are part of the DB Service | [optional] [default to true]
 **loadDatabases** | **Boolean**| Load the databases that are part of the DB Service | [optional] [default to true]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceDTO**](TessellServiceDTO.md)

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


## getTessellServiceCredentials

> TessellServiceCredsDTO getTessellServiceCredentials(id)

Get credentials for a DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        try {
            TessellServiceCredsDTO result = apiInstance.getTessellServiceCredentials(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServiceCredentials");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**TessellServiceCredsDTO**](TessellServiceCredsDTO.md)

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


## getTessellServiceOps

> TessellServiceOpsDTO getTessellServiceOps(id, loadInstances, loadDatabases, loadSubscriptionInfo, loadAcls, timeZone)

Get a DB Service By Id

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | ID of the DB Service
        Boolean loadInstances = false; // Boolean | load-instances
        Boolean loadDatabases = false; // Boolean | load-databases
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServiceOpsDTO result = apiInstance.getTessellServiceOps(id, loadInstances, loadDatabases, loadSubscriptionInfo, loadAcls, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServiceOps");
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
 **id** | [**UUID**](.md)| ID of the DB Service |
 **loadInstances** | **Boolean**| load-instances | [optional] [default to false]
 **loadDatabases** | **Boolean**| load-databases | [optional] [default to false]
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServiceOpsDTO**](TessellServiceOpsDTO.md)

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


## getTessellServiceTags

> List&lt;TessellTag&gt; getTessellServiceTags(id)

View tags for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        try {
            List<TessellTag> result = apiInstance.getTessellServiceTags(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServiceTags");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**List&lt;TessellTag&gt;**](TessellTag.md)

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


## getTessellServiceTimeline

> TessellServiceTimelineResponse getTessellServiceTimeline(id)

Get a DB timeline by service ID

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        try {
            TessellServiceTimelineResponse result = apiInstance.getTessellServiceTimeline(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServiceTimeline");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**TessellServiceTimelineResponse**](TessellServiceTimelineResponse.md)

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


## getTessellServices

> TessellServicesResponse getTessellServices(name, statuses, engineTypes, clonedFromServiceId, clonedFromAvailabilityMachineId, loadInstances, loadDatabases, owners, loadAcls, pageSize, pageOffset, timeZone)

View list of available DB Services

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        String name = "name_example"; // String | Filter DB Service based on name
        List<TessellServiceStatus> statuses = Arrays.asList(); // List<TessellServiceStatus> | Filter DB Service based on status/es
        List<DatabaseEngineType> engineTypes = Arrays.asList(); // List<DatabaseEngineType> | Filter DB Service based on engine type
        UUID clonedFromServiceId = new UUID(); // UUID | Filter DB Service based on ID of the DB Service from which the services are cloned
        UUID clonedFromAvailabilityMachineId = new UUID(); // UUID | Filter DB Service based on ID of the Availability Machine from which the services are cloned
        Boolean loadInstances = true; // Boolean | Load the instances that are part of the DB Service
        Boolean loadDatabases = true; // Boolean | Load the databases that are part of the DB Service
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Boolean loadAcls = false; // Boolean | Load ACL information
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServicesResponse result = apiInstance.getTessellServices(name, statuses, engineTypes, clonedFromServiceId, clonedFromAvailabilityMachineId, loadInstances, loadDatabases, owners, loadAcls, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServices");
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
 **name** | **String**| Filter DB Service based on name | [optional]
 **statuses** | [**List&lt;TessellServiceStatus&gt;**](TessellServiceStatus.md)| Filter DB Service based on status/es | [optional]
 **engineTypes** | [**List&lt;DatabaseEngineType&gt;**](DatabaseEngineType.md)| Filter DB Service based on engine type | [optional]
 **clonedFromServiceId** | [**UUID**](.md)| Filter DB Service based on ID of the DB Service from which the services are cloned | [optional]
 **clonedFromAvailabilityMachineId** | [**UUID**](.md)| Filter DB Service based on ID of the Availability Machine from which the services are cloned | [optional]
 **loadInstances** | **Boolean**| Load the instances that are part of the DB Service | [optional] [default to true]
 **loadDatabases** | **Boolean**| Load the databases that are part of the DB Service | [optional] [default to true]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServicesResponse**](TessellServicesResponse.md)

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


## getTessellServicesOps

> TessellServicesOpsResponse getTessellServicesOps(name, statuses, skipStatuses, engineTypes, loadInstances, loadDatabases, includeExternal, includeInternal, clonedFromServiceId, clonedFromAvailabilityMachineId, networkProfileId, subscriptionIds, filterOnLastStartedTime, filterOnLastStoppedTime, loadSubscriptionInfo, consumableServicesOnly, nonConsumableServicesOnly, owners, loadAcls, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone)

View a list of available DB Services Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        String name = "name_example"; // String | name
        List<TessellServiceStatusOps> statuses = Arrays.asList(); // List<TessellServiceStatusOps> | statuses
        List<TessellServiceStatusOps> skipStatuses = Arrays.asList(); // List<TessellServiceStatusOps> | skip-statuses
        List<DatabaseEngineType> engineTypes = Arrays.asList(); // List<DatabaseEngineType> | engine-types
        Boolean loadInstances = false; // Boolean | load-instances
        Boolean loadDatabases = false; // Boolean | load-databases
        Boolean includeExternal = true; // Boolean | include-external
        Boolean includeInternal = true; // Boolean | include-internal
        UUID clonedFromServiceId = new UUID(); // UUID | The id of the DB Service from which the services are cloned
        UUID clonedFromAvailabilityMachineId = new UUID(); // UUID | The id of the Availability Machine from which the services are cloned
        UUID networkProfileId = new UUID(); // UUID | network-profile-id
        List<UUID> subscriptionIds = Arrays.asList(); // List<UUID> | List of subscription ids
        Boolean filterOnLastStartedTime = false; // Boolean | filter-on-last-started-time
        Boolean filterOnLastStoppedTime = false; // Boolean | filter-on-last-stopped-time
        Boolean loadSubscriptionInfo = false; // Boolean | load-subscription-info
        Boolean consumableServicesOnly = false; // Boolean | consumable-services-only
        Boolean nonConsumableServicesOnly = false; // Boolean | non-consumable-services-only
        List<String> owners = Arrays.asList(); // List<String> | List of Email Addresses for entity or resource owners
        Boolean loadAcls = false; // Boolean | Load ACL information
        String timeRangeBeginAt = "2022-04-10T04:20:30.000+0000"; // String | Start timestamp
        String timeRangeEndAt = "2022-04-10T04:20:30.000+0000"; // String | End timestamp
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        String timeZone = "UTC"; // String | Timezone for return data
        try {
            TessellServicesOpsResponse result = apiInstance.getTessellServicesOps(name, statuses, skipStatuses, engineTypes, loadInstances, loadDatabases, includeExternal, includeInternal, clonedFromServiceId, clonedFromAvailabilityMachineId, networkProfileId, subscriptionIds, filterOnLastStartedTime, filterOnLastStoppedTime, loadSubscriptionInfo, consumableServicesOnly, nonConsumableServicesOnly, owners, loadAcls, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#getTessellServicesOps");
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
 **statuses** | [**List&lt;TessellServiceStatusOps&gt;**](TessellServiceStatusOps.md)| statuses | [optional]
 **skipStatuses** | [**List&lt;TessellServiceStatusOps&gt;**](TessellServiceStatusOps.md)| skip-statuses | [optional]
 **engineTypes** | [**List&lt;DatabaseEngineType&gt;**](DatabaseEngineType.md)| engine-types | [optional]
 **loadInstances** | **Boolean**| load-instances | [optional] [default to false]
 **loadDatabases** | **Boolean**| load-databases | [optional] [default to false]
 **includeExternal** | **Boolean**| include-external | [optional] [default to true]
 **includeInternal** | **Boolean**| include-internal | [optional] [default to true]
 **clonedFromServiceId** | [**UUID**](.md)| The id of the DB Service from which the services are cloned | [optional]
 **clonedFromAvailabilityMachineId** | [**UUID**](.md)| The id of the Availability Machine from which the services are cloned | [optional]
 **networkProfileId** | [**UUID**](.md)| network-profile-id | [optional]
 **subscriptionIds** | [**List&lt;UUID&gt;**](UUID.md)| List of subscription ids | [optional]
 **filterOnLastStartedTime** | **Boolean**| filter-on-last-started-time | [optional] [default to false]
 **filterOnLastStoppedTime** | **Boolean**| filter-on-last-stopped-time | [optional] [default to false]
 **loadSubscriptionInfo** | **Boolean**| load-subscription-info | [optional] [default to false]
 **consumableServicesOnly** | **Boolean**| consumable-services-only | [optional] [default to false]
 **nonConsumableServicesOnly** | **Boolean**| non-consumable-services-only | [optional] [default to false]
 **owners** | [**List&lt;String&gt;**](String.md)| List of Email Addresses for entity or resource owners | [optional]
 **loadAcls** | **Boolean**| Load ACL information | [optional] [default to false]
 **timeRangeBeginAt** | **String**| Start timestamp | [optional]
 **timeRangeEndAt** | **String**| End timestamp | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]
 **timeZone** | **String**| Timezone for return data | [optional] [default to UTC]

### Return type

[**TessellServicesOpsResponse**](TessellServicesOpsResponse.md)

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


## patchSoftwareForTessellService

> TaskSummary patchSoftwareForTessellService(id, patchDbServicePayload)

Patches the DB Service Software

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        PatchDbServicePayload patchDbServicePayload = new PatchDbServicePayload(); // PatchDbServicePayload | 
        try {
            TaskSummary result = apiInstance.patchSoftwareForTessellService(id, patchDbServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#patchSoftwareForTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **patchDbServicePayload** | [**PatchDbServicePayload**](PatchDbServicePayload.md)|  |

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


## patchTessellServiceCallback

> ApiStatus patchTessellServiceCallback(patchTessellServiceCallbackPayload)

Callback for patch Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        PatchTessellServiceCallbackPayload patchTessellServiceCallbackPayload = new PatchTessellServiceCallbackPayload(); // PatchTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.patchTessellServiceCallback(patchTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#patchTessellServiceCallback");
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
 **patchTessellServiceCallbackPayload** | [**PatchTessellServiceCallbackPayload**](PatchTessellServiceCallbackPayload.md)|  |

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


## provisionTessellService

> TaskSummary provisionTessellService(provisionTessellServicePayload)

Provision a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        ProvisionTessellServicePayload provisionTessellServicePayload = new ProvisionTessellServicePayload(); // ProvisionTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.provisionTessellService(provisionTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#provisionTessellService");
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
 **provisionTessellServicePayload** | [**ProvisionTessellServicePayload**](ProvisionTessellServicePayload.md)|  |

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


## provisionTessellServiceCallback

> ApiStatus provisionTessellServiceCallback(provisionTessellServiceCallbackPayload)

Callback for provision Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload = new ProvisionTessellServiceCallbackPayload(); // ProvisionTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.provisionTessellServiceCallback(provisionTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#provisionTessellServiceCallback");
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
 **provisionTessellServiceCallbackPayload** | [**ProvisionTessellServiceCallbackPayload**](ProvisionTessellServiceCallbackPayload.md)|  |

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


## rebootDBService

> TaskSummary rebootDBService(serviceId, body)

Reboot a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        Object body = null; // Object | 
        try {
            TaskSummary result = apiInstance.rebootDBService(serviceId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#rebootDBService");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **body** | **Object**|  |

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


## rebootDBServiceCallback

> ApiStatus rebootDBServiceCallback(serviceId, rebootDBServiceRequestCallbackPayload)

Process response for DB reboot plugins workflow

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        RebootDBServiceRequestCallbackPayload rebootDBServiceRequestCallbackPayload = new RebootDBServiceRequestCallbackPayload(); // RebootDBServiceRequestCallbackPayload | 
        try {
            ApiStatus result = apiInstance.rebootDBServiceCallback(serviceId, rebootDBServiceRequestCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#rebootDBServiceCallback");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **rebootDBServiceRequestCallbackPayload** | [**RebootDBServiceRequestCallbackPayload**](RebootDBServiceRequestCallbackPayload.md)|  |

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


## resizeDBService

> TaskSummary resizeDBService(id, resizeDBServiceRequest)

Resize DB service storage/compute

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        ResizeDBServiceRequest resizeDBServiceRequest = new ResizeDBServiceRequest(); // ResizeDBServiceRequest | 
        try {
            TaskSummary result = apiInstance.resizeDBService(id, resizeDBServiceRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#resizeDBService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **resizeDBServiceRequest** | [**ResizeDBServiceRequest**](ResizeDBServiceRequest.md)|  |

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


## resizeDBServiceCallback

> ApiStatus resizeDBServiceCallback(id, resizeDBServiceRequestCallbackPayload)

Update the service status as per resize operation status

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The id of the DB Service
        ResizeDBServiceRequestCallbackPayload resizeDBServiceRequestCallbackPayload = new ResizeDBServiceRequestCallbackPayload(); // ResizeDBServiceRequestCallbackPayload | 
        try {
            ApiStatus result = apiInstance.resizeDBServiceCallback(id, resizeDBServiceRequestCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#resizeDBServiceCallback");
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
 **id** | [**UUID**](.md)| The id of the DB Service |
 **resizeDBServiceRequestCallbackPayload** | [**ResizeDBServiceRequestCallbackPayload**](ResizeDBServiceRequestCallbackPayload.md)|  |

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


## restoreTessellService

> TaskSummary restoreTessellService(id, restoreTessellServicePayload)

Restore a DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        RestoreTessellServicePayload restoreTessellServicePayload = new RestoreTessellServicePayload(); // RestoreTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.restoreTessellService(id, restoreTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#restoreTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **restoreTessellServicePayload** | [**RestoreTessellServicePayload**](RestoreTessellServicePayload.md)|  |

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


## restoreTessellServiceCallback

> ApiStatus restoreTessellServiceCallback(provisionTessellServiceCallbackPayload)

Callback for restore Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        ProvisionTessellServiceCallbackPayload provisionTessellServiceCallbackPayload = new ProvisionTessellServiceCallbackPayload(); // ProvisionTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.restoreTessellServiceCallback(provisionTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#restoreTessellServiceCallback");
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
 **provisionTessellServiceCallbackPayload** | [**ProvisionTessellServiceCallbackPayload**](ProvisionTessellServiceCallbackPayload.md)|  |

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


## startTessellService

> TaskSummary startTessellService(id, startTessellServicePayload)

Starts the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        StartTessellServicePayload startTessellServicePayload = new StartTessellServicePayload(); // StartTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.startTessellService(id, startTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#startTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **startTessellServicePayload** | [**StartTessellServicePayload**](StartTessellServicePayload.md)|  |

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


## startTessellServiceCallback

> ApiStatus startTessellServiceCallback(startTessellServiceCallbackPayload)

Callback for start Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        StartTessellServiceCallbackPayload startTessellServiceCallbackPayload = new StartTessellServiceCallbackPayload(); // StartTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.startTessellServiceCallback(startTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#startTessellServiceCallback");
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
 **startTessellServiceCallbackPayload** | [**StartTessellServiceCallbackPayload**](StartTessellServiceCallbackPayload.md)|  |

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


## startTessellServiceOpsRequest

> TaskSummary startTessellServiceOpsRequest(id, startTessellServiceOpsPayload)

Start a DB Service Internal Request

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the DB Service
        StartTessellServiceOpsPayload startTessellServiceOpsPayload = new StartTessellServiceOpsPayload(); // StartTessellServiceOpsPayload | 
        try {
            TaskSummary result = apiInstance.startTessellServiceOpsRequest(id, startTessellServiceOpsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#startTessellServiceOpsRequest");
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
 **id** | [**UUID**](.md)| Id of the DB Service |
 **startTessellServiceOpsPayload** | [**StartTessellServiceOpsPayload**](StartTessellServiceOpsPayload.md)|  |

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


## stopTessellService

> TaskSummary stopTessellService(id, stopTessellServicePayload)

Stops the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        StopTessellServicePayload stopTessellServicePayload = new StopTessellServicePayload(); // StopTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.stopTessellService(id, stopTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#stopTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **stopTessellServicePayload** | [**StopTessellServicePayload**](StopTessellServicePayload.md)|  |

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


## stopTessellServiceCallback

> ApiStatus stopTessellServiceCallback(stopTessellServiceCallbackPayload)

Callback for stop Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        StopTessellServiceCallbackPayload stopTessellServiceCallbackPayload = new StopTessellServiceCallbackPayload(); // StopTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.stopTessellServiceCallback(stopTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#stopTessellServiceCallback");
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
 **stopTessellServiceCallbackPayload** | [**StopTessellServiceCallbackPayload**](StopTessellServiceCallbackPayload.md)|  |

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


## stopTessellServiceOps

> TaskSummary stopTessellServiceOps(id, stopDatabaseInternalPayload)

Stop a DB Service Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        StopDatabaseInternalPayload stopDatabaseInternalPayload = new StopDatabaseInternalPayload(); // StopDatabaseInternalPayload | 
        try {
            TaskSummary result = apiInstance.stopTessellServiceOps(id, stopDatabaseInternalPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#stopTessellServiceOps");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **stopDatabaseInternalPayload** | [**StopDatabaseInternalPayload**](StopDatabaseInternalPayload.md)|  |

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


## switchoverTessellService

> TaskSummary switchoverTessellService(id, switchOverTessellServicePayload)

Switchover a DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        SwitchOverTessellServicePayload switchOverTessellServicePayload = new SwitchOverTessellServicePayload(); // SwitchOverTessellServicePayload | 
        try {
            TaskSummary result = apiInstance.switchoverTessellService(id, switchOverTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#switchoverTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **switchOverTessellServicePayload** | [**SwitchOverTessellServicePayload**](SwitchOverTessellServicePayload.md)|  |

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


## switchoverTessellServiceCallback

> ApiStatus switchoverTessellServiceCallback(switchoverTessellServiceCallbackPayload)

Callback for switchover Tessell service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        SwitchoverTessellServiceCallbackPayload switchoverTessellServiceCallbackPayload = new SwitchoverTessellServiceCallbackPayload(); // SwitchoverTessellServiceCallbackPayload | 
        try {
            ApiStatus result = apiInstance.switchoverTessellServiceCallback(switchoverTessellServiceCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#switchoverTessellServiceCallback");
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
 **switchoverTessellServiceCallbackPayload** | [**SwitchoverTessellServiceCallbackPayload**](SwitchoverTessellServiceCallbackPayload.md)|  |

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


## updateDBServiceParameterProfiles

> TaskResponse updateDBServiceParameterProfiles(serviceId, dbServiceParameterProfileUpdateRequest)

Update parameter profile/s for instances in service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service ID
        DBServiceParameterProfileUpdateRequest dbServiceParameterProfileUpdateRequest = new DBServiceParameterProfileUpdateRequest(); // DBServiceParameterProfileUpdateRequest | 
        try {
            TaskResponse result = apiInstance.updateDBServiceParameterProfiles(serviceId, dbServiceParameterProfileUpdateRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateDBServiceParameterProfiles");
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
 **serviceId** | [**UUID**](.md)| DB Service ID |
 **dbServiceParameterProfileUpdateRequest** | [**DBServiceParameterProfileUpdateRequest**](DBServiceParameterProfileUpdateRequest.md)|  |

### Return type

[**TaskResponse**](TaskResponse.md)

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


## updateDBServiceParameterProfilesCallback

> ApiStatus updateDBServiceParameterProfilesCallback(serviceId, updateDBServiceParameterProfileCallbackPayload)

Process response for DB parameter profile update workflow

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        UpdateDBServiceParameterProfileCallbackPayload updateDBServiceParameterProfileCallbackPayload = new UpdateDBServiceParameterProfileCallbackPayload(); // UpdateDBServiceParameterProfileCallbackPayload | 
        try {
            ApiStatus result = apiInstance.updateDBServiceParameterProfilesCallback(serviceId, updateDBServiceParameterProfileCallbackPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateDBServiceParameterProfilesCallback");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **updateDBServiceParameterProfileCallbackPayload** | [**UpdateDBServiceParameterProfileCallbackPayload**](UpdateDBServiceParameterProfileCallbackPayload.md)|  |

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


## updateDBServiceParameterProfilesOps

> TaskResponse updateDBServiceParameterProfilesOps(serviceId, dbServiceParameterProfileUpdateOpsRequest)

Update parameter profile/s for instances in service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | DB Service Id
        DBServiceParameterProfileUpdateOpsRequest dbServiceParameterProfileUpdateOpsRequest = new DBServiceParameterProfileUpdateOpsRequest(); // DBServiceParameterProfileUpdateOpsRequest | 
        try {
            TaskResponse result = apiInstance.updateDBServiceParameterProfilesOps(serviceId, dbServiceParameterProfileUpdateOpsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateDBServiceParameterProfilesOps");
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
 **serviceId** | [**UUID**](.md)| DB Service Id |
 **dbServiceParameterProfileUpdateOpsRequest** | [**DBServiceParameterProfileUpdateOpsRequest**](DBServiceParameterProfileUpdateOpsRequest.md)|  |

### Return type

[**TaskResponse**](TaskResponse.md)

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


## updateTessellService

> TessellServiceDTO updateTessellService(id, updateTessellServicePayload)

Update a DB service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        UpdateTessellServicePayload updateTessellServicePayload = new UpdateTessellServicePayload(); // UpdateTessellServicePayload | 
        try {
            TessellServiceDTO result = apiInstance.updateTessellService(id, updateTessellServicePayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellService");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **updateTessellServicePayload** | [**UpdateTessellServicePayload**](UpdateTessellServicePayload.md)|  |

### Return type

[**TessellServiceDTO**](TessellServiceDTO.md)

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


## updateTessellServiceAgentLcmInfoOps

> TessellAgentLcmInfo updateTessellServiceAgentLcmInfoOps(id, tessellAgentLcmInfo)

Update a DB Service Agent LCM Info

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellAgentLcmInfo tessellAgentLcmInfo = new TessellAgentLcmInfo(); // TessellAgentLcmInfo | 
        try {
            TessellAgentLcmInfo result = apiInstance.updateTessellServiceAgentLcmInfoOps(id, tessellAgentLcmInfo);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceAgentLcmInfoOps");
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
 **tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)|  |

### Return type

[**TessellAgentLcmInfo**](TessellAgentLcmInfo.md)

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


## updateTessellServiceConnectivity

> TaskSummary updateTessellServiceConnectivity(id, updateTessellServiceConnectivityPayload)

Update DB Service Connectivity

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        UpdateTessellServiceConnectivityPayload updateTessellServiceConnectivityPayload = new UpdateTessellServiceConnectivityPayload(); // UpdateTessellServiceConnectivityPayload | 
        try {
            TaskSummary result = apiInstance.updateTessellServiceConnectivity(id, updateTessellServiceConnectivityPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceConnectivity");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **updateTessellServiceConnectivityPayload** | [**UpdateTessellServiceConnectivityPayload**](UpdateTessellServiceConnectivityPayload.md)|  |

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


## updateTessellServiceConnectivityOps

> TaskSummary updateTessellServiceConnectivityOps(serviceId, updateServiceConnectivityPayloadOps)

Update Tessell service Connectivity internal API

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | 
        UpdateServiceConnectivityPayloadOps updateServiceConnectivityPayloadOps = new UpdateServiceConnectivityPayloadOps(); // UpdateServiceConnectivityPayloadOps | 
        try {
            TaskSummary result = apiInstance.updateTessellServiceConnectivityOps(serviceId, updateServiceConnectivityPayloadOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceConnectivityOps");
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
 **serviceId** | [**UUID**](.md)|  |
 **updateServiceConnectivityPayloadOps** | [**UpdateServiceConnectivityPayloadOps**](UpdateServiceConnectivityPayloadOps.md)|  |

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


## updateTessellServiceCredentials

> TaskSummary updateTessellServiceCredentials(id, resetTessellServiceCredsPayload)

Update DB service credentials

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        ResetTessellServiceCredsPayload resetTessellServiceCredsPayload = new ResetTessellServiceCredsPayload(); // ResetTessellServiceCredsPayload | 
        try {
            TaskSummary result = apiInstance.updateTessellServiceCredentials(id, resetTessellServiceCredsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceCredentials");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **resetTessellServiceCredsPayload** | [**ResetTessellServiceCredsPayload**](ResetTessellServiceCredsPayload.md)|  |

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


## updateTessellServiceGenieConfigOps

> TessellServiceGenieInfoOps updateTessellServiceGenieConfigOps(id, tessellServiceGenieInfoOps)

Update a DB Service&#39;s Genie Config Information Ops

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | Id of the DB Service
        TessellServiceGenieInfoOps tessellServiceGenieInfoOps = new TessellServiceGenieInfoOps(); // TessellServiceGenieInfoOps | 
        try {
            TessellServiceGenieInfoOps result = apiInstance.updateTessellServiceGenieConfigOps(id, tessellServiceGenieInfoOps);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceGenieConfigOps");
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
 **id** | [**UUID**](.md)| Id of the DB Service |
 **tessellServiceGenieInfoOps** | [**TessellServiceGenieInfoOps**](TessellServiceGenieInfoOps.md)|  |

### Return type

[**TessellServiceGenieInfoOps**](TessellServiceGenieInfoOps.md)

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


## updateTessellServiceIntegration

> TaskSummary updateTessellServiceIntegration(id, tessellUpdateDatabaseIntegrationDTO)

Add/update an integration for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        List<TessellUpdateDatabaseIntegrationDTO> tessellUpdateDatabaseIntegrationDTO = Arrays.asList(); // List<TessellUpdateDatabaseIntegrationDTO> | 
        try {
            TaskSummary result = apiInstance.updateTessellServiceIntegration(id, tessellUpdateDatabaseIntegrationDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceIntegration");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **tessellUpdateDatabaseIntegrationDTO** | [**List&lt;TessellUpdateDatabaseIntegrationDTO&gt;**](TessellUpdateDatabaseIntegrationDTO.md)|  |

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


## updateTessellServiceOps

> TessellServiceOpsDTO updateTessellServiceOps(id, tessellServiceOpsDTO, resetDegradeMonitorData)

Update a DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | id
        TessellServiceOpsDTO tessellServiceOpsDTO = new TessellServiceOpsDTO(); // TessellServiceOpsDTO | 
        Boolean resetDegradeMonitorData = false; // Boolean | Specify if the service's degrade monitor is to be reset
        try {
            TessellServiceOpsDTO result = apiInstance.updateTessellServiceOps(id, tessellServiceOpsDTO, resetDegradeMonitorData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#updateTessellServiceOps");
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
 **tessellServiceOpsDTO** | [**TessellServiceOpsDTO**](TessellServiceOpsDTO.md)|  |
 **resetDegradeMonitorData** | **Boolean**| Specify if the service&#39;s degrade monitor is to be reset | [optional] [default to false]

### Return type

[**TessellServiceOpsDTO**](TessellServiceOpsDTO.md)

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


## upgradeEligibilityForTessellServiceOps

> DBServiceUpgradeEligibilityOpsResponse upgradeEligibilityForTessellServiceOps(id)

Check if Tessell libraries on computes related to a DB Service can be upgraded

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        try {
            DBServiceUpgradeEligibilityOpsResponse result = apiInstance.upgradeEligibilityForTessellServiceOps(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#upgradeEligibilityForTessellServiceOps");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**DBServiceUpgradeEligibilityOpsResponse**](DBServiceUpgradeEligibilityOpsResponse.md)

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


## upsertTessellServiceTags

> List&lt;TessellTag&gt; upsertTessellServiceTags(id, createUpdateTessellTagPayload)

Create/update (override) tags for the DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.TessellServiceControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellServiceControllerApi apiInstance = new TessellServiceControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | The ID of the DB Service
        CreateUpdateTessellTagPayload createUpdateTessellTagPayload = new CreateUpdateTessellTagPayload(); // CreateUpdateTessellTagPayload | 
        try {
            List<TessellTag> result = apiInstance.upsertTessellServiceTags(id, createUpdateTessellTagPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellServiceControllerApi#upsertTessellServiceTags");
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
 **id** | [**UUID**](.md)| The ID of the DB Service |
 **createUpdateTessellTagPayload** | [**CreateUpdateTessellTagPayload**](CreateUpdateTessellTagPayload.md)|  |

### Return type

[**List&lt;TessellTag&gt;**](TessellTag.md)

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

