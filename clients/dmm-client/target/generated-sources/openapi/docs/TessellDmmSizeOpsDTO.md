

# TessellDmmSizeOpsDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dmmId** | **UUID** | ID of Availability machine |  [optional]
**dmmName** | **String** | Data Management Machine name |  [optional]
**aggregatedTotalPhysicalSize** | **Long** | Aggregated total physical size |  [optional]
**aggregatedTotalLogicalSize** | **Long** | Aggregated total logical size |  [optional]
**aggregatedBackupPhysicalSize** | **Long** | Aggregated backup physical size |  [optional]
**aggregatedBackupLogicalSize** | **Long** | Aggregated backup logical size |  [optional]
**aggregatedLogSize** | **Long** | Aggregated log size |  [optional]
**aggregatedTemporarySize** | **Long** | Aggregated temporary size |  [optional]
**rpoSlaSize** | [**DmmSizeInfoOpsDTO**](DmmSizeInfoOpsDTO.md) |  |  [optional]
**sanitizatizedBackups** | [**DmmSizeInfoOpsDTO**](DmmSizeInfoOpsDTO.md) |  |  [optional]
**dapSize** | [**Map&lt;String, DmmSizeInfoOpsDTO&gt;**](DmmSizeInfoOpsDTO.md) | Size associated as per RPO SLA |  [optional]



