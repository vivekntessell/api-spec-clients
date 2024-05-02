

# TessellNetworkProfileDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of Network Profile |  [optional]
**id** | **UUID** | Id of Network Profile |  [optional]
**subscriptionId** | **UUID** | Id of the subscription |  [optional]
**cloudType** | **TessellCloudTypeDTO** |  |  [optional]
**region** | **String** | Region of the Network Profile |  [optional]
**databaseEngineType** | **TessellDatabaseEngineTypeDTO** |  |  [optional]
**vpcId** | **UUID** | Id of the VPC |  [optional]
**vpcCloudId** | **String** | ID of the vpc cloud component of network profile |  [optional]
**vpcCidrBlock** | **String** | cidr block of the vpc |  [optional]
**vpcName** | **String** | Name of the vpc |  [optional]
**subnetGroups** | [**List&lt;TessellSubnetGroupMappingDTO&gt;**](TessellSubnetGroupMappingDTO.md) |  |  [optional]
**subnets** | [**List&lt;TessellSubnetDTO&gt;**](TessellSubnetDTO.md) |  |  [optional]
**publicAccessEnabled** | **Boolean** |  |  [optional]
**accessPort** | **Integer** |  |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** |  |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**description** | **String** |  |  [optional]
**isTessellManaged** | **Boolean** |  |  [optional]
**vpcInternalStatus** | **TessellVpcInternalStatusDTO** |  |  [optional]
**vpcStatus** | **TessellVpcStatusDTO** |  |  [optional]
**vpcEndpoints** | [**Map&lt;String, TessellVpcEndpointDTO&gt;**](TessellVpcEndpointDTO.md) |  |  [optional]



