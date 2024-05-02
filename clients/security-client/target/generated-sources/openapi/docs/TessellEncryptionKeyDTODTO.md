

# TessellEncryptionKeyDTODTO

This is a definition for Tessell encryption key DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**name** | **String** | Name of the key |  [optional]
**description** | **String** | Description of the key |  [optional]
**owner** | **String** | email id of the owner of the encryption key |  [optional]
**status** | **TessellEncryptionKeyStatusDTO** |  |  [optional]
**cloud** | **TessellCloudTypeDTO** |  |  [optional]
**sharedWith** | [**TessellEntityAclSharingInfoDTO**](TessellEntityAclSharingInfoDTO.md) |  |  [optional]
**maturityStatus** | **TessellMaturityStatusDTO** |  |  [optional]
**isKeyMaterialProvidedByCustomer** | **Boolean** | Is the key material provided by customer |  [optional]
**isDefault** | **Boolean** | Is the key default key |  [optional]
**oob** | **Boolean** | if the key is oob |  [optional]
**firstKey** | **Boolean** | is the key first key created |  [optional]
**dateLastUsed** | **OffsetDateTime** | Date when the encryption key was last used |  [optional]
**registeredKey** | **Boolean** | Represents if it is customer managed key registered in Tessell |  [optional]



