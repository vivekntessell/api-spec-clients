

# ProvisionTessellServiceTaskPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**actionType** | **ActionType** |  |  [optional]
**clone** | **Boolean** |  |  [optional]
**serviceName** | **String** |  |  [optional]
**tessellServiceId** | **UUID** |  |  [optional]
**dbserverSystemId** | **UUID** |  |  [optional]
**availabilityMachineId** | **UUID** |  |  [optional]
**databaseEngineType** | **DatabaseEngineType** |  |  [optional]
**topology** | **TessellServiceTopology** |  |  [optional]
**numOfInstances** | **Integer** |  |  [optional]
**computeResourceMachineType** | **MachineType** |  |  [optional]
**monitoringConfig** | [**MonitoringConfigTaskPayload**](MonitoringConfigTaskPayload.md) |  |  [optional]
**ownerId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**cloudAccountId** | **UUID** |  |  [optional]
**cloudLocation** | [**CloudLocationInfo**](CloudLocationInfo.md) |  |  [optional]
**creds** | [**TessellServiceCredsPayload**](TessellServiceCredsPayload.md) |  |  [optional]
**instanceGroupId** | **UUID** |  |  [optional]
**connectivityConfig** | [**TessellServiceConnectivityInfoPayload**](TessellServiceConnectivityInfoPayload.md) |  |  [optional]
**infrastructureConfig** | [**ProvisionServiceWorkInfraPayload**](ProvisionServiceWorkInfraPayload.md) |  |  [optional]
**serviceConfiguration** | [**TessellServiceConfigOps**](TessellServiceConfigOps.md) |  |  [optional]
**engineConfig** | [**TessellServiceEngineInfoOps**](TessellServiceEngineInfoOps.md) |  |  [optional]
**integrations** | [**TessellServiceIntegrationsPayload**](TessellServiceIntegrationsPayload.md) |  |  [optional]
**clonePayload** | [**CloneTaskPayload**](CloneTaskPayload.md) |  |  [optional]
**sanitizationPayload** | [**BackupSanitizationCloneOpsPayload**](BackupSanitizationCloneOpsPayload.md) |  |  [optional]
**dbLicenses** | [**List&lt;DbLicenseInfo&gt;**](DbLicenseInfo.md) |  |  [optional]
**deleteInternalServiceCallbackUrl** | **String** |  |  [optional]
**nativeBackupPayload** | [**NativeBackupOpsPayload**](NativeBackupOpsPayload.md) |  |  [optional]
**metadata** | **Map&lt;String, String&gt;** |  |  [optional]



