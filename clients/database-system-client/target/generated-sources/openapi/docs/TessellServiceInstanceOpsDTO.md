

# TessellServiceInstanceOpsDTO

This is a definition of the DB Service Instance Ops object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service Instance |  [optional]
**name** | **String** | Name of the DB Service Instance |  [optional]
**description** | **String** | DB Service Instance description |  [optional]
**tessellServiceId** | **UUID** | DB Service Instance&#39;s associated DB Service ID |  [optional]
**computeResourceId** | **UUID** | Associated compute resource ID |  [optional]
**cloudLocationId** | **String** | DB Service Instance&#39;s cloud location |  [optional]
**parameterProfileId** | **UUID** | Parameter Profile linked with the DB service instance |  [optional]
**cloudAccountId** | **UUID** | The cloud account on which the instance is hosted |  [optional]
**instanceGroupId** | **UUID** | The instance groupd Id |  [optional]
**type** | **TessellServiceInstanceType** |  |  [optional]
**role** | **TessellServiceInstanceRole** |  |  [optional]
**userVisibleRole** | **TessellServiceInstanceRole** |  |  [optional]
**status** | **TessellServiceInstanceStatusOps** |  |  [optional]
**pluginStatus** | **TessellServiceInstancePluginStatus** |  |  [optional]
**connectionInfo** | [**TessellServiceInstanceConnectionInfo**](TessellServiceInstanceConnectionInfo.md) |  |  [optional]
**genericInfo** | [**TessellServiceInstanceGenericInfo**](TessellServiceInstanceGenericInfo.md) |  |  [optional]
**licenseInfo** | [**DbLicenseInfo**](DbLicenseInfo.md) |  |  [optional]
**monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified, either by system or by user |  [optional]
**dateModifiedByUser** | **Date** | Timestamp when the entity was last modified by the user |  [optional]
**metadata** | [**TessellServiceInstanceMetadata**](TessellServiceInstanceMetadata.md) |  |  [optional]
**driverInfo** | [**TessellServiceInstanceDriverInfo**](TessellServiceInstanceDriverInfo.md) |  |  [optional]
**updatesInProgressInfo** | [**TessellServiceInstanceInProgressUpdateInfoOps**](TessellServiceInstanceInProgressUpdateInfoOps.md) |  |  [optional]
**lastStartedAt** | **Date** | Timestamp when the service instance was last started at |  [optional]
**lastStoppedAt** | **Date** | Timestamp when the Service Instance was last stopped at |  [optional]
**lastDegradedAt** | **Date** | Timestamp when the Service Instance was DEGRADED |  [optional]
**deletedForUserAt** | **Date** | Timestamp when the service instance was marked &#39;delete for user&#39;. |  [optional]
**isConsumable** | **Boolean** | Whether the service instance is consumable for purposes like billing |  [optional]
**tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md) |  |  [optional]



