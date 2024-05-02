

# SnapshotConfigurationPayload

DB Service's snapshot retention configurations. If not specified, the default recommended retention configurations would be applied.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snapshotWindow** | [**SnapshotConfigurationPayloadSnapshotWindow**](SnapshotConfigurationPayloadSnapshotWindow.md) |  |  [optional]
**sla** | **String** | The snapshot SLA for the DB Service. If not specified, a default SLA would be associated with the DB Service |  [optional]
**schedule** | [**ScheduleInfo**](ScheduleInfo.md) |  |  [optional]
**fullBackupSchedule** | [**FullBackupSchedule**](FullBackupSchedule.md) |  |  [optional]



