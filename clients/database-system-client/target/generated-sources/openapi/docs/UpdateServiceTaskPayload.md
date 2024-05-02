

# UpdateServiceTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tessellServiceId** | **UUID** |  |  [optional]
**availabilityMachineId** | **UUID** |  |  [optional]
**databaseEngineType** | **DatabaseEngineType** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**ownerId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**switchOverPayload** | [**SwitchoverServiceTaskPayload**](SwitchoverServiceTaskPayload.md) |  |  [optional]
**failoverPayload** | [**FailoverServiceTaskPayload**](FailoverServiceTaskPayload.md) |  |  [optional]
**updateServicePayload** | [**UpdateTessellServicePayload**](UpdateTessellServicePayload.md) |  |  [optional]
**updateConnectivityPayload** | **UpdateTessellServiceConnectivityPayloadServiceConnectivity** |  |  [optional]
**updateGenieConnectivityPayload** | [**GenieConnectivityPayload**](GenieConnectivityPayload.md) |  |  [optional]
**resetCredsPayload** | [**ResetTessellServiceCredsPayload**](ResetTessellServiceCredsPayload.md) |  |  [optional]
**integrationsPayload** | [**List&lt;TessellUpdateDatabaseIntegrationDTO&gt;**](TessellUpdateDatabaseIntegrationDTO.md) |  |  [optional]
**rebuildInstancePayload** | [**List&lt;RebuildServiceInstanceTaskPayload&gt;**](RebuildServiceInstanceTaskPayload.md) |  |  [optional]
**restoreServicePayload** | [**RestoreServiceTaskPayload**](RestoreServiceTaskPayload.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]



