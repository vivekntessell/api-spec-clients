

# ServiceRestoreInfo

DB Service's data restore information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**contentType** | **DataContentType** |  |  [optional]
**backupId** | **UUID** | The backup Id using which this DB Service clone is created |  [optional]
**pitrTime** | **String** | If the database was created using a Point-In-Time mechanism, it specifies the timestamp in UTC |  [optional]
**maximumRecoverability** | **Boolean** |  |  [optional]
**restoredAt** | **Date** | Timestamp when the DB Service was restored/cloned |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
RESTORE | &quot;restore&quot;
CLONE | &quot;clone&quot;



