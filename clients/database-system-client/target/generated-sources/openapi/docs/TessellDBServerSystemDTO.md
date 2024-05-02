

# TessellDBServerSystemDTO

This is a definition for Tessell DBServer System Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of the entity | 
**description** | **String** | DBServer System description |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **DBServerSystemStatus** |  |  [optional]
**computeSharingEnabled** | **Boolean** | Whether the Compute Resource is shared across multiple DB Services |  [optional]
**switchOverPolicy** | **Object** | DBServer System&#39;s switchover policy details |  [optional]
**switchOverStatus** | **SwitchOverStatus** |  |  [optional]
**type** | **String** | DBServer System type |  [optional]
**userId** | **UUID** | DBServer System&#39;s user id |  [optional]
**computeResources** | [**List&lt;TessellComputeResourceOpsDTO&gt;**](TessellComputeResourceOpsDTO.md) | Compute Resources associated with this DBServer System |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**dbserverSystemAndComputeResources** | [**List&lt;TessellDbssCrMappingDTO&gt;**](TessellDbssCrMappingDTO.md) | DBServers associated with this DBServer System |  [optional]
**ipAddressInfo** | [**DBServerSystemIpAddressInfo**](DBServerSystemIpAddressInfo.md) |  |  [optional]
**metadata** | [**DBServerSystemMetadata**](DBServerSystemMetadata.md) |  |  [optional]
**driverInfo** | [**DBServerSystemDriverInfo**](DBServerSystemDriverInfo.md) |  |  [optional]



