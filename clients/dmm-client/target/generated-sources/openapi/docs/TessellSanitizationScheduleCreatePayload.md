

# TessellSanitizationScheduleCreatePayload

Tessell Sanitization Schedule create payload definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the sanitization schedule | 
**description** | **String** | Description for the sanitization schedule |  [optional]
**sanitizedBackupNamePrefix** | **String** | Prefix to be prepended with sanitized backup names that are created as part of this schedule |  [optional]
**scriptId** | **UUID** | Associated data processing script | 
**scriptVersionInfo** | [**TessellSanitizationScheduleCreatePayloadScriptVersionInfo**](TessellSanitizationScheduleCreatePayloadScriptVersionInfo.md) |  |  [optional]
**scheduleInfo** | [**SanitizationScheduleInfo**](SanitizationScheduleInfo.md) |  | 



