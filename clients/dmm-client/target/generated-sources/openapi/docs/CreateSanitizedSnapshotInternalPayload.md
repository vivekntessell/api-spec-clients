

# CreateSanitizedSnapshotInternalPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**dmmId** | **UUID** |  |  [optional]
**dapId** | **UUID** |  |  [optional]
**type** | **BackupType** |  |  [optional]
**derivedFromBackupId** | **UUID** |  |  [optional]
**backupIdentifier** | **UUID** |  |  [optional]
**sanitizedFromBackupId** | **UUID** |  |  [optional]
**dapBased** | **Boolean** |  |  [optional]
**scriptId** | **UUID** |  |  [optional]
**sanitizationScheduleId** | **UUID** |  |  [optional]
**subscriptions** | **List&lt;String&gt;** |  |  [optional]
**subscriptionInfo** | **DatabaseBackupOpsSubscriptionInfo** |  |  [optional]
**status** | **DbBackupStatus** |  |  [optional]
**manual** | **Boolean** |  |  [optional]
**internal** | **Boolean** |  |  [optional]
**incremental** | **Boolean** |  |  [optional]
**backupTime** | **Date** |  |  [optional]
**expiryTime** | **Date** |  |  [optional]
**retentionType** | **DbBackupRetentionType** |  |  [optional]
**cloudType** | **String** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**cloudLocation** | **String** |  |  [optional]
**owner** | **String** |  |  [optional]
**backupType** | **DbBackupType** |  |  [optional]
**storageTier** | **DbStorageTier** |  |  [optional]
**cloudResourceId** | **String** |  |  [optional]
**computeResourceId** | **UUID** |  |  [optional]
**logicalSequenceNumber** | **String** |  |  [optional]
**parentSecondaryBackupId** | **UUID** |  |  [optional]
**replicatedFromSecondaryBackupId** | **UUID** |  |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]
**databaseStats** | [**DbBackupStatInfo**](DbBackupStatInfo.md) |  |  [optional]
**metadata** | [**DbBackupMetadata**](DbBackupMetadata.md) |  |  [optional]
**driverInfo** | [**DbBackupDriverInfo**](DbBackupDriverInfo.md) |  |  [optional]
**sizeInfo** | [**DbBackupSizeInfo**](DbBackupSizeInfo.md) |  |  [optional]
**replicationInfo** | [**BackupReplicationInfo**](BackupReplicationInfo.md) |  |  [optional]
**lockingInfo** | [**DbBackupLockingInfo**](DbBackupLockingInfo.md) |  |  [optional]



