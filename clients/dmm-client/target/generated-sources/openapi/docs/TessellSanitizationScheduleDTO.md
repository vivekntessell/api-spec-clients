

# TessellSanitizationScheduleDTO

Tessell Sanitization Schedule DTO definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** | Name of the sanitization schedule |  [optional]
**description** | **String** | Description for the sanitization schedule |  [optional]
**availabilityMachineId** | **UUID** | Associated Availability Machine |  [optional]
**scriptId** | **UUID** | Associated data processing script |  [optional]
**scriptInternalVersion** | **Integer** | Associated Script Version |  [optional]
**useActiveScriptVersion** | **Boolean** | If yes, use the current active version of the script |  [optional]
**status** | **SanitizationScheduleStatusOps** |  |  [optional]
**sanitizedBackupNamePrefix** | **String** | Prefix to be prepended with sanitized backup names that are created as part of this schedule |  [optional]
**ownerId** | **String** |  |  [optional]
**scheduleInfo** | [**SanitizationScheduleInfo**](SanitizationScheduleInfo.md) |  |  [optional]
**metadata** | [**SanitizationScheduleMetadata**](SanitizationScheduleMetadata.md) |  |  [optional]
**driverInfo** | [**SanitizationScheduleDriverInfo**](SanitizationScheduleDriverInfo.md) |  |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]



