

# SecretDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**secret** | [**Secret**](Secret.md) |  |  [optional]
**secretType** | **SecretType** |  |  [optional]
**groupId** | **String** |  |  [optional]
**tags** | [**List&lt;TessellTag&gt;**](TessellTag.md) | The tags associated with the secret |  [optional]
**regionAvailability** | [**List&lt;SecretAvailabilityEntity&gt;**](SecretAvailabilityEntity.md) | Cloud and Location detail |  [optional]
**primaryAvailabilityExternalId** | **String** | primaryAvailabilityExternalId |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the secret was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the secret was last modified, either by system or by user |  [optional]



