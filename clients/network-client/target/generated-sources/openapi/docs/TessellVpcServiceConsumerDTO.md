

# TessellVpcServiceConsumerDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the VPC |  [optional]
**cidrBlock** | **String** | Cidr block of the VPC |  [optional]
**cloudType** | **TessellCloudTypeDTO** |  |  [optional]
**region** | **String** | Region of the VPC |  [optional]
**status** | **TessellVpcStatusDTO** |  |  [optional]
**subscriptionName** | **String** | Subscription of the VPC |  [optional]
**metadata** | [**TessellVpcMetadataDTO**](TessellVpcMetadataDTO.md) |  |  [optional]
**isDefault** | **Boolean** |  |  [optional]
**isTessellCreated** | **Boolean** |  |  [optional]
**owner** | **String** |  |  [optional]
**loggedInUserRole** | **TessellLoggedInUserRolesDTO** |  |  [optional]
**sharedWith** | [**TessellEntityAclSharingInfoDTO**](TessellEntityAclSharingInfoDTO.md) |  |  [optional]
**maturityStatus** | **TessellMaturityStatusDTO** |  |  [optional]
**onlyForPrivateAccess** | **Boolean** |  |  [optional]
**subnets** | [**TessellSubnetServiceConsumerDTO**](TessellSubnetServiceConsumerDTO.md) |  |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]



