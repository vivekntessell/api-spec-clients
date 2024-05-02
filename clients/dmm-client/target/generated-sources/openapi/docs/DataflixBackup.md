

# DataflixBackup

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
**databases** | [**List&lt;BackupDatabaseInfo&gt;**](BackupDatabaseInfo.md) | The databases that are captured as part of this backup |  [optional]
**sharedWith** | [**EntityAclSharingSummaryInfo**](EntityAclSharingSummaryInfo.md) |  |  [optional]
**downloadUrlStatus** | **PreAuthUrlStatus** |  |  [optional]
**backupSourceInfo** | [**BackupSourceInfo**](BackupSourceInfo.md) |  |  [optional]



