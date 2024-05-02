

# DatabaseBackup

Information about the native backup

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the backup |  [optional]
**name** | **String** | Name of the backup |  [optional]
**backupTime** | **Date** | Backup capture time |  [optional]
**status** | **DatabaseBackupStatus** |  |  [optional]
**size** | **Long** | Size of this backup (in bytes) |  [optional]
**manual** | **Boolean** | Specifies whether the backup is captured as per manual user request or per automated schedule |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) | The cloud and region information where this backup has been made available at |  [optional]
**availabilityConfig** | [**List&lt;SnapshotAvailabilityConfig&gt;**](SnapshotAvailabilityConfig.md) | The config information for cloud and region availability for this backup |  [optional]
**databases** | [**List&lt;BackupDatabaseInfo&gt;**](BackupDatabaseInfo.md) | The databases that are captured as part of this backup |  [optional]
**backupInfo** | [**BackupSourceInfo**](BackupSourceInfo.md) |  |  [optional]
**sharedWith** | [**DatabaseBackupSharedWith**](DatabaseBackupSharedWith.md) |  |  [optional]
**downloadUrlStatus** | **PreAuthUrlStatus** |  |  [optional]



