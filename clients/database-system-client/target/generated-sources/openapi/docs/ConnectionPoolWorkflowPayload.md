

# ConnectionPoolWorkflowPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tessellServiceId** | **UUID** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**databaseEngineType** | **DatabaseEngineType** |  |  [optional]
**ownerId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**crudActionType** | **ConnectionPoolCrudActionType** |  |  [optional]
**metadata** | [**ConnectionPoolMetadata**](ConnectionPoolMetadata.md) |  |  [optional]
**connPoolsToCreate** | [**List&lt;CreateConnectionPoolWorkflowPayload&gt;**](CreateConnectionPoolWorkflowPayload.md) |  |  [optional]
**connPoolsToUpdate** | [**List&lt;UpdateConnectionPoolWorkflowPayload&gt;**](UpdateConnectionPoolWorkflowPayload.md) |  |  [optional]
**connPoolsToDelete** | [**List&lt;DeleteConnectionPoolWorkflowPayload&gt;**](DeleteConnectionPoolWorkflowPayload.md) |  |  [optional]



