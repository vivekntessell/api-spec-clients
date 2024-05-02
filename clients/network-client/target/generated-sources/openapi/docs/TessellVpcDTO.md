

# TessellVpcDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID of the VPC |  [optional]
**subscriptionId** | **UUID** | Id of the subscription |  [optional]
**cloudId** | **String** | Id of the vpc cloud entity |  [optional]
**cloudType** | **TessellCloudTypeDTO** |  |  [optional]
**region** | **String** | Region of the VPC |  [optional]
**cidrBlock** | **String** | cidr block of the VPC |  [optional]
**name** | **String** | Name of the VPC |  [optional]
**subnets** | [**List&lt;TessellSubnetDTO&gt;**](TessellSubnetDTO.md) |  |  [optional]
**subnetGroups** | [**List&lt;TessellSubnetGroupMappingDTO&gt;**](TessellSubnetGroupMappingDTO.md) |  |  [optional]
**status** | **TessellVpcStatusDTO** |  |  [optional]
**internalStatus** | **TessellVpcInternalStatusDTO** |  |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**isDefault** | **Boolean** |  |  [optional]
**isTessellCreated** | **Boolean** |  |  [optional]
**metadata** | [**TessellVpcMetadataDTO**](TessellVpcMetadataDTO.md) |  |  [optional]
**tenantId** | **UUID** |  |  [optional]
**owner** | **String** |  |  [optional]
**loggedInUserRole** | **TessellLoggedInUserRolesDTO** |  |  [optional]
**sharedWith** | [**TessellEntityAclSharingInfoDTO**](TessellEntityAclSharingInfoDTO.md) |  |  [optional]
**maturityStatus** | **TessellMaturityStatusDTO** |  |  [optional]
**isPrivate** | **Boolean** |  |  [optional]
**onlyForPrivateAccess** | **Boolean** |  |  [optional]



