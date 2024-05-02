

# DataflixSanitizedSnapshot

Information about a Sanitized Snapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the sanitized snapshot |  [optional]
**name** | **String** | Name of the sanitized snapshot |  [optional]
**snapshotTime** | **Date** | Capture time of the source snapshot from which this sanitized snapshot is created |  [optional]
**status** | **DatabaseBackupStatus** |  |  [optional]
**size** | **Long** | Size of this snapshot (in bytes) |  [optional]
**manual** | **Boolean** | Specifies whether this snapshot is created based on a manual user request or through an automated schedule |  [optional]
**cloudAvailability** | [**List&lt;DatabaseSnapshotCloudRegionInfo&gt;**](DatabaseSnapshotCloudRegionInfo.md) | The cloud and region information where this snapshot has been made available at |  [optional]
**databases** | [**List&lt;BackupDatabaseInfo&gt;**](BackupDatabaseInfo.md) | The databases that are captured as part of the source snapshot |  [optional]
**sharedWith** | [**EntityAclSharingSummaryInfo**](EntityAclSharingSummaryInfo.md) |  |  [optional]



