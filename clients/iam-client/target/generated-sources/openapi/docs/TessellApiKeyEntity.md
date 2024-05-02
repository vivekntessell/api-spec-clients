

# TessellApiKeyEntity

This is a definition for Tessell API key DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | generated UUID for the entity |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateLastUsed** | **Date** | Timestamp when the API key was last used |  [optional]
**dateExpiry** | **Date** | Timestamp when the API key expires |  [optional]
**apiKey** | **String** | Hashed value of API key |  [optional]
**description** | **String** | Description of the API key |  [optional]
**label** | **String** | label of the api key |  [optional]
**emailId** | **String** | Emil id the key belongs to |  [optional]
**tenantId** | **String** | tenant id the key belongs to |  [optional]
**neverExpire** | **Boolean** | never expire the key flag |  [optional]
**status** | [**TessellApiKeyStatus**](TessellApiKeyStatus.md) | Status of the role |  [optional]



