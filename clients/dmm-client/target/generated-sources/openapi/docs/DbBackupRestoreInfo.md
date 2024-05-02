

# DbBackupRestoreInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | Id of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | Id of the Tessell Service |  [optional]
**serviceName** | **String** | Name of the Availability Machine |  [optional]
**snapshotId** | **UUID** | Id of the DB Service snapshot |  [optional]
**recoveryTime** | **Date** | Recovery time of the database backup and/or pitr logs |  [optional]
**backupName** | **String** | Name of the database backup |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**contentType** | **DapContentType** |  |  [optional]
**timeZone** | **String** |  |  [optional]
**availability** | [**List&lt;SubscriptionCloudAvailability&gt;**](SubscriptionCloudAvailability.md) | The availability details across subscription, clouds |  [optional]
**restoreSize** | **Long** | Restorable size of the backup (in MegaBytes) |  [optional]
**edition** | **String** |  |  [optional]
**softwareImage** | **String** | Software Image of parent database at the time capturing the backup |  [optional]
**softwareImageVersion** | **String** | Software Image Version of parent database at the time capturing the backup |  [optional]
**softwareImageVersionFamily** | **String** | Software Image Versiona Family of parent database |  [optional]
**infrastructure** | [**TessellServiceInfrastructureInfo**](TessellServiceInfrastructureInfo.md) |  |  [optional]
**engineConfiguration** | [**TessellServiceEngineInfo**](TessellServiceEngineInfo.md) |  |  [optional]
**databases** | [**List&lt;BackupDatabaseInfo&gt;**](BackupDatabaseInfo.md) | The databases that are captured as part of the snapshot |  [optional]
**info** | **Map&lt;String, String&gt;** |  |  [optional]



