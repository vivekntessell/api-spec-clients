

# TerraformTessellDatabaseDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sourceDatabaseId** | **UUID** | Required while creating a clone. It specifies the Id of the source database from which the clone is being created. |  [optional]
**id** | **UUID** | Tessell generated UUID for the database |  [optional]
**databaseName** | **String** | Database name |  [optional]
**description** | **String** | Database description |  [optional]
**tessellServiceId** | **UUID** | Associated DB Service ID |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **DatabaseStatus** |  |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**tessellCreated** | **Boolean** | Database created from Tessell platform |  [optional]
**clonedFromInfo** | [**TessellDatabaseClonedFromInfo**](TessellDatabaseClonedFromInfo.md) |  |  [optional]
**databaseConfiguration** | [**DatabaseConfiguration**](DatabaseConfiguration.md) |  |  [optional]
**connectString** | [**TessellServiceDatabaseConnectString**](TessellServiceDatabaseConnectString.md) |  |  [optional]



