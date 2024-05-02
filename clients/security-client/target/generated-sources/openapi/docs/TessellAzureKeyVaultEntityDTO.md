

# TessellAzureKeyVaultEntityDTO

This is a definition for Tessell azure key vault

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**name** | **String** | name of the file |  [optional]
**region** | **String** | region of  of the key vault |  [optional]
**resourceGroup** | **String** | resource group name of the key vault |  [optional]
**subscriptionId** | **UUID** | azure subscription id of the key vault |  [optional]
**status** | [**TessellAzureKeyVaultStatusDTO**](TessellAzureKeyVaultStatusDTO.md) | Availability status of encryption key |  [optional]
**tenantId** | **String** | tenant id of the key |  [optional]
**deploymentId** | **UUID** | deployment id of the encryption key |  [optional]
**externalId** | **String** | azure id of the key vault |  [optional]
**cloudAccountId** | **UUID** | Cloud Account Id of where Key Vault is stored |  [optional]



