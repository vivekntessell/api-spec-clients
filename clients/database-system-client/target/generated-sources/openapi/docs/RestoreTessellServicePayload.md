

# RestoreTessellServicePayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the new DB Service created after restoring. Applicable only when restoring to a new service. | 
**description** | **String** | Description of the new DB Service created after restoring. Applicable only when restoring to a new service. |  [optional]
**inPlaceRestore** | **Boolean** | Specify whether to restore a DB Service in-place. |  [optional]
**backupId** | **UUID** | Tessell service backup ID, using which the DB Service is to be restored |  [optional]
**pitr** | **String** | PITR Timestamp, using which the DB Service is to be restored |  [optional]
**maximumRecoverability** | **Boolean** | Specify if the DB Service is to be restored to the latest recoverability point |  [optional]
**creds** | [**TessellServiceCredsPayload**](TessellServiceCredsPayload.md) |  | 
**serviceConnectivity** | [**RestoreServiceConnectivityInfoPayload**](RestoreServiceConnectivityInfoPayload.md) |  |  [optional]
**computeInfo** | [**ComputeInfo**](ComputeInfo.md) |  |  [optional]



