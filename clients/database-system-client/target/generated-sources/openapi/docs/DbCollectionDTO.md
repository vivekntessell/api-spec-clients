

# DbCollectionDTO

Db collection

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the collection |  [optional]
**name** | **String** | The name of the collection |  [optional]
**databaseId** | **UUID** | The ID of the database which the collection falls under |  [optional]
**serviceId** | **UUID** | The ID of the service which the database falls under |  [optional]
**createdByUser** | **String** | The user who created the collection |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **DbCollectionStatus** |  |  [optional]
**collectionConfig** | [**DbCollectionConfig**](DbCollectionConfig.md) |  |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified by user |  [optional]



