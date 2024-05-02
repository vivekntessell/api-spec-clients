

# DmmAvailabilityMetadata

Metadata for backend use

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**topologyLastRefreshTime** | **Date** |  |  [optional]
**topology** | [**List&lt;DBServiceTopologyOps&gt;**](DBServiceTopologyOps.md) |  |  [optional]
**lastAutoBackupTaskSubmissionTime** | **Date** |  |  [optional]
**lastAutoBackupTriggerTime** | **Date** |  |  [optional]
**lastSlaExecutionTime** | **Date** |  |  [optional]
**dispatchAutoBackupImmediately** | **Boolean** |  |  [optional]
**dispatchAutoBackupReason** | **String** |  |  [optional]
**dispatchAutoBackupForPitr** | **Boolean** |  |  [optional]
**irrespectiveOfSla** | **Boolean** |  |  [optional]
**fullBackup** | **Boolean** |  |  [optional]
**useNameAsIs** | **Boolean** |  |  [optional]
**makeVisibleToUser** | **Boolean** |  |  [optional]
**markAsManual** | **Boolean** | If the snapshot should be marked as a manual snapshot. |  [optional]
**data** | **Object** |  |  [optional]
**cloudType** | **String** |  |  [optional]
**cloudAccountId** | **UUID** | The cloud account Id, where the database backups should be made available to |  [optional]
**cloudLocations** | **List&lt;String&gt;** |  |  [optional]
**computeResourceId** | **UUID** | The compute resource on which this snapshot would be or is taken |  [optional]



