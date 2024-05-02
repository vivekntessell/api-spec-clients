

# SecretAvailabilityEntity

This is a definition for Secrets Availability in Tessell

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**secret** | [**SecretEntity**](SecretEntity.md) |  |  [optional]
**cloudLocation** | **String** | Cloud location of the secret |  [optional]
**cloudAccountId** | **UUID** | cloudAccountId |  [optional]
**externalId** | **String** | External Id of the Secret |  [optional]
**secretEncryptionKeyId** | **UUID** | Id of the Secret Encryption Key used |  [optional]
**status** | [**SecretAvailabilityStatus**](SecretAvailabilityStatus.md) | Status of the secret availability |  [optional]



