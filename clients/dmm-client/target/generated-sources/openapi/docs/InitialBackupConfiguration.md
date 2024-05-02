

# InitialBackupConfiguration

This stores the initial snapshot/backup configuration at the provision

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupSla** | **String** |  |  [optional]
**backupSlaId** | **UUID** |  |  [optional]
**retentionInfo** | [**TamRetentionInfo**](TamRetentionInfo.md) |  |  [optional]
**schedule** | [**ScheduleInfo**](ScheduleInfo.md) |  |  [optional]
**fullBackupSchedule** | [**FullBackupSchedule**](FullBackupSchedule.md) |  |  [optional]
**backupWindow** | [**InitialBackupConfigurationBackupWindow**](InitialBackupConfigurationBackupWindow.md) |  |  [optional]
**autoBackup** | **Boolean** | deprecated, keeping it for backward compatibility. |  [optional]



