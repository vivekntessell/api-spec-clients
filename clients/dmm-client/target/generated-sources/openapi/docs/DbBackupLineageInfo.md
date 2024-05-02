

# DbBackupLineageInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupId** | **UUID** |  |  [optional]
**dmmId** | **UUID** |  |  [optional]
**status** | **String** |  |  [optional]
**message** | **String** |  |  [optional]
**initPrimaryBackupId** | **UUID** | The initial primary backup which was captured by plugin. This backup would get replicated to other source or DAP regions. |  [optional]
**primaryBackups** | **Map&lt;String, List&lt;DatabaseBackupOps&gt;&gt;** |  |  [optional]
**secondaryBackups** | **Map&lt;String, List&lt;DatabaseBackupOps&gt;&gt;** |  |  [optional]



