

# CreateInstanceTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceName** | **String** |  |  [optional]
**tessellServiceId** | **UUID** |  |  [optional]
**availabilityMachineId** | **UUID** |  |  [optional]
**databaseEngineType** | **DatabaseEngineType** |  |  [optional]
**ownerId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**cloud** | **CloudType** |  |  [optional]
**region** | **String** |  |  [optional]
**instanceGroupId** | **UUID** |  |  [optional]
**instanceIds** | **Set&lt;UUID&gt;** |  |  [optional]
**instanceInfo** | [**Set&lt;InstanceInfo&gt;**](InstanceInfo.md) |  |  [optional]
**monitoringConfig** | [**MonitoringConfigTaskPayload**](MonitoringConfigTaskPayload.md) |  |  [optional]
**enableComputeSharing** | **Boolean** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**cloudLocation** | **String** |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]



