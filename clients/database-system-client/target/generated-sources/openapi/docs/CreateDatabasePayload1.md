

# CreateDatabasePayload1


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**databaseName** | **String** | The name of the database to be created | 
**sourceDatabaseId** | **UUID** | Required while creating a clone. It specifies the Id of the source database from which the clone is being created. |  [optional]
**databaseConfiguration** | [**CreateDatabasePayloadDatabaseConfiguration**](CreateDatabasePayloadDatabaseConfiguration.md) |  |  [optional]
**collectionConfig** | [**DbCollectionCreatePayload1**](DbCollectionCreatePayload1.md) |  |  [optional]



