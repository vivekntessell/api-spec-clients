

# TessellCloudAccountDTO

This is a definition for Cloud Accounts in Tessell

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**secret** | [**Map&lt;String, TessellParameterDTO&gt;**](TessellParameterDTO.md) | Cloud Login Secrets |  [optional]
**secretARN** | **String** | Secret identifier |  [optional]
**accountId** | **String** | Account ID |  [optional]
**cloudAccountType** | **TessellCloudAccountTypeDTO** |  |  [optional]
**cloudLocationId** | **String** | ID of the cloud location where this account belongs |  [optional]
**description** | **String** | Description |  [optional]
**name** | **String** | Name of the entity | 
**managedType** | **TessellManagedTypeDTO** |  |  [optional]
**status** | **TessellCloudAccountStatusDTO** |  |  [optional]



