

# TessellSoftwareImageInternalViewDTO

Software Image Response Object (Internal View)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**terraformId** | **UUID** | Software Image Identifier |  [optional]
**description** | **String** | Description of the SoftwareImage. |  [optional]
**name** | **String** | Name of the Software Image. |  [optional]
**dbVersion** | **String** | DB Image Version |  [optional]
**dbVersionName** | **String** | DB Version name string. |  [optional]
**dbVersionId** | **UUID** |  |  [optional]
**osVersion** | **String** | OS Image Version |  [optional]
**osImageId** | **String** | OS Image Identifier. |  [optional]
**dbEngineSnapshotId** | **String** | DB Engine disk Identifier. |  [optional]
**tessellLibrarySnapshotId** | **String** | Tessell Library Disk Snapshot Id. This will be deprecated once os image is self sufficient. |  [optional]
**cloudAndRegionAvailabilty** | **String** | Cloud region availability. |  [optional]
**id** | **UUID** | If provided, then use the provided uuid as the software image identifier. |  [optional]
**status** | **TessellSoftwareImageStatusDTO** |  |  [optional]
**metadata** | [**TessellSoftwareImageMetadataDTO**](TessellSoftwareImageMetadataDTO.md) |  |  [optional]



