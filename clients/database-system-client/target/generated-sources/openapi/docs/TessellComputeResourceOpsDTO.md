

# TessellComputeResourceOpsDTO

This is a definition for Tessell Compute Resource Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of the entity | 
**description** | **String** | Compute Resource description |  [optional]
**tenantId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **ComputeResourceStatusOps** |  |  [optional]
**tsm** | **Boolean** |  |  [optional]
**cloudStatus** | **String** | Compute Resource&#39;s status in the cloud |  [optional]
**computeSharingEnabled** | **Boolean** | Whether the Compute Resource is shared across multiple DB Services |  [optional]
**cloudAccountId** | **UUID** | Compute Resource&#39;s Tessell cloud account identifier |  [optional]
**cloudLocation** | **String** | Compute Resource&#39;s location in the cloud |  [optional]
**cloudResourceId** | **String** | Compute Resource&#39;s cloud identifier |  [optional]
**type** | **ComputeResourceType** |  |  [optional]
**machineType** | **MachineType** |  |  [optional]
**osInfo** | [**OsInfo**](OsInfo.md) |  |  [optional]
**softwareImageId** | **UUID** | Compute Resource&#39;s Software Image Id |  [optional]
**softwareImageVersionId** | **UUID** | Compute Resource&#39;s Software Image Version Id |  [optional]
**networkProfileId** | **UUID** | Compute Resource&#39;s Network Profile Id |  [optional]
**computeTypeId** | **UUID** | Compute Resource&#39;s compute type Id |  [optional]
**userId** | **UUID** | Compute Resource&#39;s user id |  [optional]
**owner** | **String** | Compute resource&#39;s owner email address |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**timezone** | **String** | The timezone detail |  [optional]
**machineFqdnInfo** | [**ComputeResourceMachineFqdnInfo**](ComputeResourceMachineFqdnInfo.md) |  |  [optional]
**ipAddressInfo** | [**ComputeResourceIpAddressInfo**](ComputeResourceIpAddressInfo.md) |  |  [optional]
**metadata** | [**ComputeResourceMetadata**](ComputeResourceMetadata.md) |  |  [optional]
**driverInfo** | [**ComputeResourceDriverInfo**](ComputeResourceDriverInfo.md) |  |  [optional]
**tessellStackInfo** | [**ComputeResourceTessellStackInfo**](ComputeResourceTessellStackInfo.md) |  |  [optional]
**tessellAgentLcmInfo** | [**TessellAgentLcmInfo**](TessellAgentLcmInfo.md) |  |  [optional]



