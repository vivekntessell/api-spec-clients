

# BackupSanitizationCloneOpsPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sanitizationScheduleId** | **UUID** | Sanitization schedule Id |  [optional]
**scriptId** | **UUID** | Tessell Script Id |  [optional]
**scriptVersion** | **String** | Tessell Script version |  [optional]
**scriptInternalVersion** | **Integer** | Tessell Script internal version |  [optional]
**manual** | **Boolean** | Specifies if the backup-sanitization request is submitted by user |  [optional]
**sanitizedBackupId** | **UUID** | The Id of the sanitized backup (metadata entry) |  [optional]
**sanitizedBackupName** | **String** | The name of the sanitized backup (metadata entry) |  [optional]
**sourceBackupId** | **UUID** | The Id of the source backup which is to be sanitized |  [optional]
**sourceBackupIdentifier** | **UUID** | The identifier of the source backup which is to be sanitized |  [optional]
**sourceBackupDapBased** | **Boolean** | Specifies whether the source backup is DAP based |  [optional]



