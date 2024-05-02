

# TessellServiceStorageMappingDTO

This is a definition for Tessell Database to storage mapping

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloudAccountId** | **UUID** | Storage&#39;s Tessell cloud account identifier |  [optional]
**cloudLocation** | **String** | Storage&#39;s location in the cloud |  [optional]
**tessellServiceId** | **UUID** | Associated DB Service Id |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**driverInfo** | [**DatabaseStorageMappingDriverInfo**](DatabaseStorageMappingDriverInfo.md) |  |  [optional]
**metadata** | [**DatabaseStorageMappingMetadata**](DatabaseStorageMappingMetadata.md) |  |  [optional]
**status** | **DatabaseStorageMappingStatus** |  |  [optional]
**storagePurpose** | **String** | Storage purpose |  [optional]
**tessellStorageId** | **UUID** | Associated Tessell Storage Id |  [optional]



