

# TessellSoftwareImageEntityDTO

SoftwareImage Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | If provided, then use the provided uuid as the software image identifier. |  [optional]
**terraformId** | **UUID** | Software Image Identifier |  [optional]
**description** | **String** | Description of the SoftwareImage. |  [optional]
**name** | **String** | Name of the Software Image. |  [optional]
**dbEngineType** | [**TessellDatabaseEngineTypeDTO**](TessellDatabaseEngineTypeDTO.md) |  |  [optional]
**versions** | [**List&lt;TessellSoftwareImageVersionEntityDTO&gt;**](TessellSoftwareImageVersionEntityDTO.md) |  |  [optional]
**status** | **TessellSoftwareImageStatusDTO** |  |  [optional]
**metadata** | [**TessellSoftwareImageMetadataDTO**](TessellSoftwareImageMetadataDTO.md) | Extra metadata |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]



