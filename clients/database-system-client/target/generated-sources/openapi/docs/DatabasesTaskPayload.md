

# DatabasesTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **DatabaseCrudActionType** |  |  [optional]
**tessellServiceId** | **UUID** |  |  [optional]
**availabilityMachineId** | **UUID** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**serviceStatus** | **TessellServiceStatusOps** |  |  [optional]
**databaseEngineType** | **DatabaseEngineType** |  |  [optional]
**ownerId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**databasesToCreate** | [**List&lt;CreateDatabaseWorkPayload&gt;**](CreateDatabaseWorkPayload.md) |  |  [optional]
**databasesToDelete** | [**List&lt;DeleteDatabaseWorkPayload&gt;**](DeleteDatabaseWorkPayload.md) |  |  [optional]
**rollback** | **Boolean** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]



