

# PreAuthUrlDTO

This is a definition for Tessell Pre auth url Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the url |  [optional]
**nativeBackupId** | **UUID** | Native backup uuid |  [optional]
**dmmId** | **UUID** | ID of the Availability Machine of the url |  [optional]
**sourceBackupIdentifier** | **UUID** | source backup id |  [optional]
**user** | **String** | email of the user |  [optional]
**preAuthUrl** | **String** | pre auth url |  [optional]
**status** | **PreAuthUrlStatusOps** |  |  [optional]
**createdAt** | **Date** | time of request of preauth url |  [optional]
**expiryConfig** | [**ExpiryConfig**](ExpiryConfig.md) |  |  [optional]
**dateCreated** | **Date** | time of creation |  [optional]
**dateModified** | **Date** | time of modification |  [optional]
**metadata** | [**PreAuthUrlMetadata**](PreAuthUrlMetadata.md) |  |  [optional]



