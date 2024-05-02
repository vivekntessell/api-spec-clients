

# TessellServiceOpsDTO

This is a definition of the DB Service ops object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service |  [optional]
**name** | **String** | Name of the DB Service |  [optional]
**description** | **String** | DB Service description |  [optional]
**internal** | **Boolean** | Specifies if the DB Service is for internal use |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**topology** | **TessellServiceTopology** |  |  [optional]
**numOfInstances** | **Integer** |  |  [optional]
**status** | **TessellServiceStatusOps** |  |  [optional]
**contextInfo** | [**TessellServiceContextInfo**](TessellServiceContextInfo.md) |  |  [optional]
**availabilityMachineId** | **UUID** | Associated Availability Machine Id |  [optional]
**dbserverSystemId** | **UUID** | DB Service&#39;s associated DBServer System Id |  [optional]
**computeSharingEnabled** | **Boolean** | Whether the Compute Resource is shared across multiple DB Services |  [optional]
**clone** | **Boolean** | Whether this DB Service is cloned of some another service |  [optional]
**clonedFromTessellServiceId** | **UUID** | The id of DB Service from which this service is cloned |  [optional]
**clonedFromAvailabilityMachineId** | **UUID** | The id of Availability Machine from which this service is cloned |  [optional]
**lastStartedAt** | **Date** | Timestamp when the DB Service was last started at |  [optional]
**lastStoppedAt** | **Date** | Timestamp when the DB Service was last stopped at |  [optional]
**tenantId** | **String** | The tenant-id for the DB Service |  [optional]
**subscriptionId** | **UUID** | The subscription-id in which this DB Service is created |  [optional]
**subscription** | **String** | The subscription-name in which this DB Service is created |  [optional]
**ownerId** | **String** | DB Service owner-id |  [optional]
**loggedInUserRole** | **String** | Access role for the currently logged in user |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateCreationCompleted** | **Date** | Timestamp when the service&#39;s creation has been completed |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified, either by system or by user |  [optional]
**dateModifiedByUser** | **Date** | Timestamp when the entity was last modified by the user |  [optional]
**deletedForUserAt** | **Date** | Timestamp when the entity was marked &#39;deleted for user&#39; |  [optional]
**startInitiatedAt** | **Date** | Timestamp at which start DB Service operation is initiated. |  [optional]
**lastDegradedAt** | **Date** | Timestamp at which DB Service was degraded. |  [optional]
**lastHealedAt** | **Date** | Timestamp at which DB Service was healed(i.e. READY back from DEGRADED). |  [optional]
**metadata** | [**TessellServiceMetadata**](TessellServiceMetadata.md) |  |  [optional]
**driverInfo** | [**TessellServiceDriverInfo**](TessellServiceDriverInfo.md) |  |  [optional]
**restoreInfo** | [**TessellServiceRestoreInfoOps**](TessellServiceRestoreInfoOps.md) |  |  [optional]
**connectivityInfo** | [**TessellServiceConnectivityInfoOps**](TessellServiceConnectivityInfoOps.md) |  |  [optional]
**tessellGenieInfo** | [**TessellServiceGenieInfoOps**](TessellServiceGenieInfoOps.md) |  |  [optional]
**infrastructureInfo** | [**TessellServiceInfrastructureInfoOps**](TessellServiceInfrastructureInfoOps.md) |  |  [optional]
**serviceConfiguration** | [**TessellServiceConfigOps**](TessellServiceConfigOps.md) |  |  [optional]
**engineConfiguration** | [**TessellServiceEngineInfoOps**](TessellServiceEngineInfoOps.md) |  |  [optional]
**integrationsInfo** | [**TessellServiceIntegrationsInfoOps**](TessellServiceIntegrationsInfoOps.md) |  |  [optional]
**provisionInfo** | [**TessellServiceProvisionInfo**](TessellServiceProvisionInfo.md) |  |  [optional]
**tags** | [**TessellServiceTagInfoOps**](TessellServiceTagInfoOps.md) |  |  [optional]
**updatesInProgressInfo** | [**TessellServiceInProgressUpdateInfoOps**](TessellServiceInProgressUpdateInfoOps.md) |  |  [optional]
**instances** | [**List&lt;TessellServiceInstanceOpsDTO&gt;**](TessellServiceInstanceOpsDTO.md) | Instances associated with this DB Service |  [optional]
**databases** | [**List&lt;TessellDatabaseOpsDTO&gt;**](TessellDatabaseOpsDTO.md) | Databases that are part of this DB Service |  [optional]
**deletionSchedule** | [**DeletionScheduleDTO**](DeletionScheduleDTO.md) |  |  [optional]
**patchSchedule** | [**PatchScheduleInfoOps**](PatchScheduleInfoOps.md) |  |  [optional]
**upcomingScheduledActions** | [**ServiceUpcomingScheduledActions**](ServiceUpcomingScheduledActions.md) |  |  [optional]
**sampleDatasetInfo** | [**ServiceSampleDatasetOpsInfo**](ServiceSampleDatasetOpsInfo.md) |  |  [optional]
**tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md) |  |  [optional]



