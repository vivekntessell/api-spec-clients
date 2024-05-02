

# DataflixDownloadUrlInfo

Tessell Backup's Dataflix view

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**backupId** | **UUID** | ID of the snapshot from which backup is derived |  [optional]
**backupName** | **String** | Name of the backup |  [optional]
**backupStatus** | **DbBackupStatus** |  |  [optional]
**size** | **Long** | Backup size in bytes |  [optional]
**status** | **PreAuthUrlStatus** |  |  [optional]
**manual** | **Boolean** | Specifies whether the backup is captured manually |  [optional]
**userid** | **String** | User having access to the backup |  [optional]
**downloadUrlExpiryTime** | [**ExpiryConfig**](ExpiryConfig.md) |  |  [optional]
**downloadUrl** | **String** | Pre auth url from which backup can be downloaded |  [optional]
**dateCreated** | **Date** | Pre auth url creation time |  [optional]



