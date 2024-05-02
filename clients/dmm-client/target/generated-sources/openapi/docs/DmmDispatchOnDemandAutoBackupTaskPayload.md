

# DmmDispatchOnDemandAutoBackupTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** |  |  [optional]
**useNameAsIs** | **Boolean** |  |  [optional]
**irrespectiveOfSla** | **Boolean** |  |  [optional]
**makeVisibleToUser** | **Boolean** |  |  [optional]
**fullBackup** | **Boolean** |  |  [optional]
**computeResourceId** | **UUID** | The compute resource on which this snapshot would be taken |  [optional]
**markAsManual** | **Boolean** | Whether the snapshot should be marked as manual or not. This will only take impact if irrespectiveOfSla is set to true. |  [optional]



