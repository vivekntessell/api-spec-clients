

# TessellDbLogDTO

This is a definition for Tessell Database Log Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Database Log&#39;s Id |  [optional]
**dmmId** | **UUID** | ID of Availability machine |  [optional]
**databaseId** | **UUID** | Associated Database Id |  [optional]
**status** | **DbLogStatus** |  |  [optional]
**fromTime** | **Date** | The fromTime of the logs |  [optional]
**toTime** | **Date** | The toTime of the logs |  [optional]
**deletedForUserTime** | **Date** | Timestamp when the log was deleted for user |  [optional]
**size** | **Long** | Physical size of the DB Log in underlying cloud |  [optional]
**cloudAccountId** | **UUID** | The cloud account Id where the log is available |  [optional]
**cloudLocation** | **String** | The cloud location where the log is available |  [optional]
**computeResourceId** | **UUID** | The computeResourceId from where the logs were collected |  [optional]
**tessellStorageId** | **UUID** | The tessellStorageId where the logs are stored |  [optional]
**dapId** | **UUID** | Id of Data Access policy (DAP) |  [optional]
**replicatedFromLogId** | **UUID** |  |  [optional]
**metadata** | [**DbLogMetadata**](DbLogMetadata.md) |  |  [optional]
**driverInfo** | [**DbLogDriverInfo**](DbLogDriverInfo.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]



