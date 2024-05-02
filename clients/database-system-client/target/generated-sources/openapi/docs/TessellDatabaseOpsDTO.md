

# TessellDatabaseOpsDTO

This is a definition for Tessell Database Ops Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the database |  [optional]
**name** | **String** | Name of the database |  [optional]
**description** | **String** | Description for the database |  [optional]
**tessellServiceId** | **UUID** | Associated DB Service Id |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **DatabaseStatusOps** |  |  [optional]
**clonedFromDatabaseId** | **UUID** | Database Id from which this database has been cloned (if applicable) |  [optional]
**databaseConfiguration** | [**DatabaseConfigurationInfo**](DatabaseConfigurationInfo.md) |  |  [optional]
**metadata** | [**DatabaseMetadata**](DatabaseMetadata.md) |  |  [optional]
**driverInfo** | [**DatabaseDriverInfo**](DatabaseDriverInfo.md) |  |  [optional]
**provisioningInfo** | [**TessellDatabaseOpsDTOProvisioningInfo**](TessellDatabaseOpsDTOProvisioningInfo.md) |  |  [optional]
**startedAt** | **Date** | Timestamp when the Database was started (initial creation) |  [optional]
**internal** | **Boolean** | Whether the database is for internal use (ex. system database) |  [optional]
**tessellCreated** | **Boolean** | Whether the database is created using Tessell platform |  [optional]
**deletedForUserAt** | **Date** | Timestamp when the database was deleted by the user |  [optional]
**dateCreated** | **Date** | Timestamp when the database was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified, either by system or by user |  [optional]
**dateModifiedByUser** | **Date** | Timestamp when the entity was last modified by the user |  [optional]



