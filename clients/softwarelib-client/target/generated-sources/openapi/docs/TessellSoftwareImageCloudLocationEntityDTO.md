

# TessellSoftwareImageCloudLocationEntityDTO

SoftwareImage Cloud Location Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Software Image Cloud Location identifier |  [optional]
**osImageId** | **String** | OS Image Identifier. |  [optional]
**dbEngineSnapshotId** | **String** | DB Engine disk Identifier. |  [optional]
**tessellLibrarySnapshotId** | **String** | Tessell Library Disk Snapshot Id. This will be deprecated once os image is self sufficient. |  [optional]
**version** | [**TessellSoftwareImageVersionEntityDTO**](TessellSoftwareImageVersionEntityDTO.md) |  |  [optional]
**cloudAndAvailability** | **String** | Cloud Location |  [optional]
**status** | **TessellSoftwareImageStatusDTO** |  |  [optional]



