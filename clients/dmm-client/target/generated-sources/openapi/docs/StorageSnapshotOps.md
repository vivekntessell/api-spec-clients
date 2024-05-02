

# StorageSnapshotOps

Snapshot of the any Tessell Storage entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Unique ID of the storage snapshot |  [optional]
**name** | **String** | Name of the storage snapshot |  [optional]
**storageId** | **UUID** | ID of the Storage entity |  [optional]
**cloudResourceId** | **String** | The cloud resource id |  [optional]
**status** | **StorageSnapshotStatusOps** |  |  [optional]
**storageType** | **StorageType** |  |  [optional]
**snapshotSize** | **Long** | Physical size of the snapshot in bytes |  [optional]
**databaseBackupId** | **UUID** | ID of the DB Service snapshot/backup this snapshot belongs to |  [optional]
**copiedFromStorageSnapshotId** | **UUID** | ID of the storage snapshot from which the current snapshot is copied. This is set for DAP replicated entries. |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]
**metadata** | [**StorageSnapshotMetadataOps**](StorageSnapshotMetadataOps.md) |  |  [optional]
**driverInfo** | [**StorageSnapshotDriverInfo**](StorageSnapshotDriverInfo.md) |  |  [optional]



