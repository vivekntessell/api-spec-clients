

# CreateBackupInternalTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupId** | **UUID** | To be provided if backup entry is already present in the db |  [optional]
**backupName** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**computeResourceId** | **UUID** | The compute resource on which this snapshot would be taken |  [optional]
**forPitr** | **Boolean** |  |  [optional]
**fullBackup** | **Boolean** |  |  [optional]
**extra** | **Boolean** |  |  [optional]
**internal** | **Boolean** |  |  [optional]
**retentionType** | **DbBackupRetentionType** |  |  [optional]
**applicableRetentionTypes** | **List&lt;DbBackupRetentionType&gt;** |  |  [optional]
**expiryTime** | **Date** |  |  [optional]
**dapBackupReplicationInfo** | [**List&lt;ReplicateDapBackupInfo&gt;**](ReplicateDapBackupInfo.md) |  |  [optional]
**sanitizationInfo** | [**List&lt;SanitizationTriggerInfo&gt;**](SanitizationTriggerInfo.md) |  |  [optional]



