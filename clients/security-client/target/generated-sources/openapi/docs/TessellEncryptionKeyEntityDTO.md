

# TessellEncryptionKeyEntityDTO

This is a definition for Tessell encryption keys object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | name of key |  [optional]
**description** | **String** | Description of the key |  [optional]
**internalName** | **String** | Internal name of the cloud key |  [optional]
**status** | [**TessellEncryptionKeyStatusDTO**](TessellEncryptionKeyStatusDTO.md) | Status of the key |  [optional]
**maturityStatus** | [**TessellMaturityStatusDTO**](TessellMaturityStatusDTO.md) | Maturity status of the key |  [optional]
**cloudType** | [**TessellCloudTypeDTO**](TessellCloudTypeDTO.md) | Cloud type of the key |  [optional]
**owner** | **String** | owner of the key |  [optional]
**cloudAvailability** | [**List&lt;TessellEncryptionKeyAvailabilityEntityDTO&gt;**](TessellEncryptionKeyAvailabilityEntityDTO.md) | Encryption key availability details |  [optional]
**tenantId** | **String** | tenant id of the key |  [optional]
**keyMaterialBase64** | **String** | key_material_base64 |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**isKeyMaterialProvidedByCustomer** | **Boolean** | is the key material provided by customer |  [optional]
**isDefault** | **Boolean** | is the key default |  [optional]
**oob** | **Boolean** | is the key OOB |  [optional]
**fileId** | **UUID** | Script content |  [optional]
**firstKey** | **Boolean** | is the key first key created |  [optional]
**registeredKey** | **Boolean** | is the key registered with Tessell |  [optional]



