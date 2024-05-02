

# SecretEncryptionEntity

This is the mapping of kms keys to be used for a given cloud location to encrypt the secrets in that cloud location

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | generated UUID for the entity |  [optional]
**tenantId** | **String** | Tenant ID |  [optional]
**cloudAccountId** | **UUID** | cloudAccountId |  [optional]
**region** | **String** | region |  [optional]
**keyExternalID** | **String** | keyExternalID |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**status** | [**SecretEncryptionKeyStatus**](SecretEncryptionKeyStatus.md) | Status of the secret encryption key ID |  [optional]



