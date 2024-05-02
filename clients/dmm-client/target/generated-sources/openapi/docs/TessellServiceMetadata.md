

# TessellServiceMetadata

DB Service's metadata information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudAccountId** | **UUID** | The cloud account Id in which the service is provisioned initially |  [optional]
**cloudType** | **String** | The cloud type in which the service is provisioned initially |  [optional]
**degradeMonitorMetadata** | [**TessellServiceDegradeMonitorMetadata**](TessellServiceDegradeMonitorMetadata.md) |  |  [optional]
**clonedFromMetadataInfo** | [**TessellServiceClonedFromInfoOps**](TessellServiceClonedFromInfoOps.md) |  |  [optional]
**nativeBackupInfo** | [**TessellServiceNativeBackupInfoOps**](TessellServiceNativeBackupInfoOps.md) |  |  [optional]
**cloneSanitizationInfo** | [**TessellServiceCloneSanitizationInfoOps**](TessellServiceCloneSanitizationInfoOps.md) |  |  [optional]
**lastAction** | [**TessellServiceLastActionMetadata**](TessellServiceLastActionMetadata.md) |  |  [optional]
**queuedAction** | [**TessellServiceQueuedActionMetadata**](TessellServiceQueuedActionMetadata.md) |  |  [optional]
**deletionAttempts** | **Integer** |  |  [optional]
**lastStartDispatchTime** | **Date** |  |  [optional]
**lastStopDispatchTime** | **Date** |  |  [optional]
**lastSwitchoverDispatchTime** | **Date** |  |  [optional]
**lastDeletionDispatchTime** | **Date** |  |  [optional]
**lastPatchSoftwareDispatchTime** | **Date** |  |  [optional]
**lastResizeDispatchTime** | **Date** |  |  [optional]
**lastParameterProfileUpdateTime** | **Date** |  |  [optional]
**data** | **Object** |  |  [optional]



