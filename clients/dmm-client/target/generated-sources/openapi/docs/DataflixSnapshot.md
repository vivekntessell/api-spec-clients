

# DataflixSnapshot

Information about a snapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the snapshot |  [optional]
**name** | **String** | Name of the snapshot |  [optional]
**description** | **String** | Description for the snapshot |  [optional]
**snapshotTime** | **Date** | Capture time of the snapshot |  [optional]
**status** | **DatabaseBackupStatus** |  |  [optional]
**size** | **Long** | Size of this snapshot (in bytes) |  [optional]
**manual** | **Boolean** | Specifies whether the backup is captured as per manual user request or as per the automated schedule |  [optional]
**cloudAvailability** | [**List&lt;DatabaseSnapshotCloudRegionInfo&gt;**](DatabaseSnapshotCloudRegionInfo.md) | The cloud and region information where this snapshot has been made available at |  [optional]
**databases** | [**List&lt;BackupDatabaseInfo&gt;**](BackupDatabaseInfo.md) | The databases that are captured as part of this snapshot |  [optional]
**sharedWith** | [**EntityAclSharingSummaryInfo**](EntityAclSharingSummaryInfo.md) |  |  [optional]
**backupStatus** | **PreAuthUrlStatus** |  |  [optional]



