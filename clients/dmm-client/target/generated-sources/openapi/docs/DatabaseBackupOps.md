

# DatabaseBackupOps

This is a definition for Tessell Database Backup Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of the entity | 
**description** | **String** | Database Backup&#39;s description |  [optional]
**dmmId** | **UUID** | ID of Availability machine |  [optional]
**isAppConsistent** | **Boolean** | If the backup is app consistent and could be used for restore/clone |  [optional]
**dapId** | **UUID** | Associated Data Access Policy Id |  [optional]
**type** | **BackupType** |  |  [optional]
**derivedFromBackupId** | **UUID** | The source backup from which this backup is derived |  [optional]
**backupIdentifier** | **UUID** | Backup identifier |  [optional]
**sanitizedFromBackupId** | **UUID** | The source backup from which this backup is sanitized |  [optional]
**dapBased** | **Boolean** | Whether the sanitizedFromBackupId is DAP based |  [optional]
**scriptId** | **UUID** | Data Processing Script that is used to create this backup |  [optional]
**sanitizationScheduleId** | **UUID** | Sanitization Schedule Id which governed generation of the sanitized backup |  [optional]
**subscriptions** | **List&lt;String&gt;** | The subscriptions in which the backup is available |  [optional]
**subscriptionInfo** | [**DatabaseBackupOpsSubscriptionInfo**](DatabaseBackupOpsSubscriptionInfo.md) |  |  [optional]
**status** | **DbBackupStatus** |  |  [optional]
**manual** | **Boolean** | Specifies if Database Backup&#39;s is manually created on a user request |  [optional]
**internal** | **Boolean** | Specifies if Database Backup&#39;s is for internal use |  [optional]
**incremental** | **Boolean** | Specifies if Database Backup&#39;s is incremental |  [optional]
**backupTime** | **Date** | Database Backup capture time |  [optional]
**expiryTime** | **Date** | Database Backup expiry time |  [optional]
**deletedForUserTime** | **Date** | Timestamp when the database backup was deleted for user |  [optional]
**retentionType** | **DbBackupRetentionType** |  |  [optional]
**cloudType** | **String** | Cloud Type |  [optional]
**cloudAccountId** | **UUID** | Database Backup&#39;s Tessell cloud account identifier |  [optional]
**cloudLocation** | **String** | Database Backup&#39;s location in the cloud |  [optional]
**userId** | **UUID** | Database Backup user id |  [optional]
**owner** | **String** | Database Backup owner email address |  [optional]
**backupType** | **DbBackupType** |  |  [optional]
**storageTier** | **DbStorageTier** |  |  [optional]
**cloudResourceId** | **String** | The cloud resource identifier for underlying backup |  [optional]
**computeResourceId** | **UUID** | Associated Service Instance id |  [optional]
**instanceRole** | **TessellServiceInstanceRole** |  |  [optional]
**triggerId** | **UUID** | For TSM multi node service, snapshots are take for all nodes. These snapshots are bound together by single trigger uniquely identified by triggerId |  [optional]
**logicalSequenceNumber** | **String** | Database Backup&#39;s logical sequence number |  [optional]
**parentSecondaryBackupId** | **UUID** | The Database Backup to which this backup is referring |  [optional]
**replicatedFromSecondaryBackupId** | **UUID** | The Database Backup from which this backup is replicated |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**databaseStats** | [**DbBackupStatInfo**](DbBackupStatInfo.md) |  |  [optional]
**metadata** | [**DbBackupMetadata**](DbBackupMetadata.md) |  |  [optional]
**driverInfo** | [**DbBackupDriverInfo**](DbBackupDriverInfo.md) |  |  [optional]
**sizeInfo** | [**DbBackupSizeInfo**](DbBackupSizeInfo.md) |  |  [optional]
**replicationInfo** | [**BackupReplicationInfo**](BackupReplicationInfo.md) |  |  [optional]
**lockingInfo** | [**DbBackupLockingInfo**](DbBackupLockingInfo.md) |  |  [optional]
**storageSnapshots** | [**List&lt;StorageSnapshotOps&gt;**](StorageSnapshotOps.md) |  |  [optional]



