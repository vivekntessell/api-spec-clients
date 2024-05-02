

# DbBackupMetadata

Database Backup's metadata information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**taskProgressEstimate** | [**TaskProgressEstimate**](TaskProgressEstimate.md) |  |  [optional]
**markedForDeletionAt** | **Date** |  |  [optional]
**forPitr** | **Boolean** |  |  [optional]
**extra** | **Boolean** |  |  [optional]
**isRetrying** | **Boolean** |  |  [optional]
**applicableRetentionTypes** | **List&lt;DbBackupRetentionType&gt;** |  |  [optional]
**lastRetentionType** | **DbBackupRetentionType** |  |  [optional]
**data** | **Object** |  |  [optional]
**databaseIds** | **List&lt;UUID&gt;** |  |  [optional]
**copyOfBackupId** | **UUID** |  |  [optional]
**sanitizationInfo** | [**BackupSanitizationInfo**](BackupSanitizationInfo.md) |  |  [optional]
**backupBasedSnapshot** | **Boolean** | Specify whether the snapshot is created on top of native backup |  [optional]



