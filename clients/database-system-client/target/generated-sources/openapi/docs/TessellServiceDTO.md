

# TessellServiceDTO

This is a definition of the DB Service object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service. This is the unique identifier for the DB Service. |  [optional]
**availabilityMachineId** | **UUID** | Unique ID of the associated Availability Machine |  [optional]
**name** | **String** | Name of the DB Service |  [optional]
**description** | **String** | User specified description for the DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**topology** | **TessellServiceTopology** |  |  [optional]
**numOfInstances** | **Integer** | This specifies the number of instances (nodes) that are created for the DB Service |  [optional]
**status** | **TessellServiceStatus** |  |  [optional]
**contextInfo** | [**TessellServiceContextInfo**](TessellServiceContextInfo.md) |  |  [optional]
**licenseType** | **TessellServiceLicenseType** |  |  [optional]
**autoMinorVersionUpdate** | **Boolean** | This field specifies whether to automatically update minor version for the DB Service |  [optional]
**enableDeletionProtection** | **Boolean** | This field specifies whether to enable deletion protection for the DB Service. If this is enabled, the deletion for the DB Service would be disallowed until this setting is disabled. |  [optional]
**enableStopProtection** | **Boolean** | This field specifies whether to enable stop protection for the DB Service. If this is enabled, the stop for the DB Service would be disallowed until this setting is disabled. |  [optional]
**edition** | **String** | Edition of the software image that has been used to create the DB Service (e.g. COMMUNITY/ENTERPRISE etc) |  [optional]
**softwareImage** | **String** | The software image that has been used to create the DB Service |  [optional]
**softwareImageVersion** | **String** | The software image version that is used to create the DB Service |  [optional]
**softwareImageVersionFamily** | **String** | The software image version family that is used to create the DB Service |  [optional]
**tenantId** | **String** | The tenant identifier under which the DB Service is created |  [optional]
**subscription** | **String** | The Tessell Subscription under which this DB Service is created |  [optional]
**owner** | **String** | This field specifies who is the owner for the DB Service |  [optional]
**loggedInUserRole** | **String** | This field specifies access role on the DB Service for the currently logged in user |  [optional]
**dateCreated** | **Date** | This field specifies the timestamp when the DB Service was created at |  [optional]
**startedAt** | **Date** | This field specifies the timestamp when the DB Service was last started at |  [optional]
**stoppedAt** | **Date** | This field specifies the timestamp when the DB Service was last stopped at |  [optional]
**clonedFromInfo** | [**TessellServiceClonedFromInfo**](TessellServiceClonedFromInfo.md) |  |  [optional]
**serviceConnectivity** | [**TessellServiceConnectivityInfo**](TessellServiceConnectivityInfo.md) |  |  [optional]
**tessellGenieStatus** | **TessellServiceGenieStatus** |  |  [optional]
**infrastructure** | [**TessellServiceInfrastructureInfo**](TessellServiceInfrastructureInfo.md) |  |  [optional]
**maintenanceWindow** | [**TessellServiceMaintenanceWindow**](TessellServiceMaintenanceWindow.md) |  |  [optional]
**engineConfiguration** | [**TessellServiceEngineInfo**](TessellServiceEngineInfo.md) |  |  [optional]
**integrationsConfig** | [**TessellServiceIntegrationsInfo**](TessellServiceIntegrationsInfo.md) |  |  [optional]
**deletionConfig** | [**TessellServiceDeletionConfig**](TessellServiceDeletionConfig.md) |  |  [optional]
**tags** | [**List&lt;TessellTag&gt;**](TessellTag.md) | The tags associated with the DB Service |  [optional]
**updatesInProgress** | [**List&lt;TessellResourceUpdateInfo&gt;**](TessellResourceUpdateInfo.md) | The updates that are in progress for this resource |  [optional]
**instances** | [**List&lt;TessellServiceInstanceDTO&gt;**](TessellServiceInstanceDTO.md) | The instances (nodes) associated with this DB Service |  [optional]
**databases** | [**List&lt;TessellDatabaseDTO&gt;**](TessellDatabaseDTO.md) | This field details about the databases that are created under this DB Service |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**deletionSchedule** | [**DeletionScheduleDTO**](DeletionScheduleDTO.md) |  |  [optional]
**upcomingScheduledActions** | [**ServiceUpcomingScheduledActions**](ServiceUpcomingScheduledActions.md) |  |  [optional]



