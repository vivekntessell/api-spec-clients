

# TerraformTessellServiceDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service. This is the unique identifier for the DB Service. |  [optional]
**availabilityMachineId** | **UUID** | Associated Availability Machine Id |  [optional]
**snapshotId** | **UUID** | Tessell service snapshot Id, using which the clone is to be created |  [optional]
**pitr** | **String** | PITR Timestamp, using which the clone is to be created |  [optional]
**name** | **String** | Name of the DB Service | 
**description** | **String** | DB Service&#39;s description |  [optional]
**tenantId** | **String** | The tenant-id for the DB Service |  [optional]
**subscription** | **String** | Tessell Subscription in which the DB Service is to be created | 
**engineType** | **DatabaseEngineType** |  | 
**topology** | **TessellServiceTopology** |  | 
**numOfInstances** | **Integer** | Number of instance (nodes) to be created for the DB Service. This is a required input for Apache Kafka. For all other engines, this input would be ignored even if specified. |  [optional]
**status** | **TessellServiceStatus** |  |  [optional]
**contextInfo** | [**TessellServiceContextInfo**](TessellServiceContextInfo.md) |  |  [optional]
**licenseType** | **TessellServiceLicenseType** |  |  [optional]
**edition** | **String** |  |  [optional]
**softwareImage** | **String** | Software Image to be used to create the DB Service | 
**softwareImageVersion** | **String** | Software Image Version to be used to create the DB Service | 
**softwareImageVersionFamily** | **String** | Software Image Family DB Service belongs to |  [optional]
**autoMinorVersionUpdate** | **Boolean** | Specify whether to automatically update minor version for DB Service |  [optional]
**enableDeletionProtection** | **Boolean** | Specify whether to enable deletion protection for the DB Service |  [optional]
**enableStopProtection** | **Boolean** | This field specifies whether to enable stop protection for the DB Service. If this is enabled, the stop for the DB Service would be disallowed until this setting is disabled. |  [optional]
**owner** | **String** | DB Service owner email address |  [optional]
**loggedInUserRole** | **String** | Access role for the currently logged in user |  [optional]
**dateCreated** | **Date** | Timestamp when the DB Service was created at |  [optional]
**startedAt** | **Date** | Timestamp when the DB Service was last started at |  [optional]
**stoppedAt** | **Date** | Timestamp when the DB Service was last stopped at |  [optional]
**clonedFromInfo** | [**TessellServiceClonedFromInfo**](TessellServiceClonedFromInfo.md) |  |  [optional]
**infrastructure** | [**TFTessellServiceInfrastructureInfo**](TFTessellServiceInfrastructureInfo.md) |  | 
**serviceConnectivity** | [**TessellServiceConnectivityInfo**](TessellServiceConnectivityInfo.md) |  | 
**tessellGenieStatus** | **TessellServiceGenieStatus** |  |  [optional]
**creds** | [**TessellServiceCredsPayload**](TessellServiceCredsPayload.md) |  | 
**maintenanceWindow** | [**TessellServiceMaintenanceWindow**](TessellServiceMaintenanceWindow.md) |  |  [optional]
**snapshotConfiguration** | [**SnapshotConfigurationPayload**](SnapshotConfigurationPayload.md) |  |  [optional]
**engineConfiguration** | [**TessellServiceEngineInfo**](TessellServiceEngineInfo.md) |  | 
**databases** | [**List&lt;TerraformTessellDatabaseDTO&gt;**](TerraformTessellDatabaseDTO.md) | Databases that are part of this DB Service |  [optional]
**integrationsConfig** | [**TessellServiceIntegrationsPayload**](TessellServiceIntegrationsPayload.md) |  |  [optional]
**tags** | [**List&lt;TessellTag&gt;**](TessellTag.md) | The tags to be associated with the DB Service |  [optional]
**instances** | [**List&lt;TessellServiceInstanceDTO&gt;**](TessellServiceInstanceDTO.md) | Instances associated with this DB Service |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**upcomingScheduledActions** | [**ServiceUpcomingScheduledActions**](ServiceUpcomingScheduledActions.md) |  |  [optional]
**deletionConfig** | [**TessellServiceDeletionConfig**](TessellServiceDeletionConfig.md) |  |  [optional]
**deletionSchedule** | [**DeletionScheduleDTO**](DeletionScheduleDTO.md) |  |  [optional]
**updatesInProgress** | [**List&lt;TessellResourceUpdateInfo&gt;**](TessellResourceUpdateInfo.md) | The updates that are in progress for this resource |  [optional]



