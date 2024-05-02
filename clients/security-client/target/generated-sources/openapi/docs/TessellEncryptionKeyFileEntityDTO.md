

# TessellEncryptionKeyFileEntityDTO

This is a definition for Tessell encryption keys files

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**name** | **String** | name of the file |  [optional]
**type** | **String** | type of the file |  [optional]
**blob** | **byte[]** | File contents in binary. |  [optional]
**password** | **String** | optional password of the file |  [optional]
**status** | [**TessellEncryptionKeyFileStatusDTO**](TessellEncryptionKeyFileStatusDTO.md) | Availability status of encryption key |  [optional]
**tenantId** | **String** | tenant id of the key |  [optional]



