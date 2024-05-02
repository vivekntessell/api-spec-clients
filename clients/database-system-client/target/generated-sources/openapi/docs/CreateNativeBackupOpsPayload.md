

# CreateNativeBackupOpsPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**nativeBackupPayload** | [**NativeBackupOpsPayload**](NativeBackupOpsPayload.md) |  |  [optional]
**backupValidationInfo** | [**CloneBackupValidationResponse**](CloneBackupValidationResponse.md) |  |  [optional]
**snapshotId** | **UUID** | Tessell service snapshot Id, using which the clone is to be created |  [optional]
**pitr** | **String** | PITR Timestamp, using which the clone is to be created |  [optional]
**name** | **String** | DB Service name | 
**description** | **String** | DB Service&#39;s description |  [optional]
**subscription** | **String** | Tessell Subscription in which the DB Service is to be created | 
**edition** | **String** |  |  [optional]
**engineType** | **DatabaseEngineType** |  | 
**topology** | **TessellServiceTopology** |  | 
**numOfInstances** | **Integer** | Number of instance (nodes) to be created for the DB Service. This is a required input for Apache Kafka. For all other engines, this input would be ignored even if specified. |  [optional]
**softwareImage** | **String** | Software Image to be used to create the DB Service | 
**softwareImageVersion** | **String** | Software Image Version to be used to create the DB Service | 
**autoMinorVersionUpdate** | **Boolean** | Specify whether to automatically update minor version for DB Service |  [optional]
**enableDeletionProtection** | **Boolean** | Specify whether to enable deletion protection for the DB Service |  [optional]
**enableStopProtection** | **Boolean** | Specify whether to enable stop protection for the DB Service |  [optional]
**enablePerfInsights** | **Boolean** | Specify whether to enable perf insights for the DB Service |  [optional]
**infrastructure** | [**TessellServiceInfrastructurePayload1**](TessellServiceInfrastructurePayload1.md) |  | 
**serviceConnectivity** | [**TessellServiceConnectivityInfoPayload**](TessellServiceConnectivityInfoPayload.md) |  | 
**creds** | [**TessellServiceCredsPayload**](TessellServiceCredsPayload.md) |  | 
**maintenanceWindow** | [**TessellServiceMaintenanceWindow**](TessellServiceMaintenanceWindow.md) |  |  [optional]
**deletionConfig** | [**TessellServiceDeletionConfig**](TessellServiceDeletionConfig.md) |  |  [optional]
**snapshotConfiguration** | [**SnapshotConfigurationPayload**](SnapshotConfigurationPayload.md) |  |  [optional]
**engineConfiguration** | [**TessellServiceEngineConfigurationPayload1**](TessellServiceEngineConfigurationPayload1.md) |  | 
**databases** | [**List&lt;CreateDatabasePayload1&gt;**](CreateDatabasePayload1.md) | Specify the databases to be created in the DB Service |  [optional]
**integrationsConfig** | [**TessellServiceIntegrationsPayload**](TessellServiceIntegrationsPayload.md) |  |  [optional]
**tags** | [**List&lt;TessellTag&gt;**](TessellTag.md) | The tags to be associated with the DB Service |  [optional]



