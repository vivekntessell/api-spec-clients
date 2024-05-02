

# SecretEntity

This is a definition for Secrets in Tessell

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | generated UUID for the entity |  [optional]
**tenantId** | **String** | Tenant ID |  [optional]
**groupId** | **String** | Group ID, grouping the secrets |  [optional]
**keyName** | **String** | Key Name |  [optional]
**cloudType** | [**CloudType**](CloudType.md) | Cloud |  [optional]
**subscriptionId** | **UUID** | subscriptionId |  [optional]
**cloudAccountId** | **UUID** | cloudAccountId |  [optional]
**primaryAvailabilityExternalId** | **String** | primaryAvailabilityExternalId |  [optional]
**secretType** | [**SecretType**](SecretType.md) | Type of the secret |  [optional]
**regionAvailability** | [**List&lt;SecretAvailabilityEntity&gt;**](SecretAvailabilityEntity.md) | Cloud and Location detail |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]



