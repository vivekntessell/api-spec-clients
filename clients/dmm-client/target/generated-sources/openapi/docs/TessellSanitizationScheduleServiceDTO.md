

# TessellSanitizationScheduleServiceDTO

Tessell Sanitization Schedule Service View DTO definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** | Name of the sanitization schedule |  [optional]
**description** | **String** | Description for the sanitization schedule |  [optional]
**availabilityMachineId** | **UUID** | Associated Availability Machine |  [optional]
**scriptId** | **UUID** | Associated data processing script |  [optional]
**scriptVersionInfo** | [**TessellSanitizationScheduleServiceDTOScriptVersionInfo**](TessellSanitizationScheduleServiceDTOScriptVersionInfo.md) |  |  [optional]
**status** | **SanitizationScheduleStatus** |  |  [optional]
**sanitizedBackupNamePrefix** | **String** | Prefix to be prepended with sanitized backup names that are created as part of this schedule |  [optional]
**ownerId** | **String** |  |  [optional]
**scheduleInfo** | [**SanitizationScheduleInfo**](SanitizationScheduleInfo.md) |  |  [optional]
**dateCreated** | **Date** |  |  [optional]



