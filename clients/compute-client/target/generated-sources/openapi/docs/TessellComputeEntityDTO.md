

# TessellComputeEntityDTO

Compute Entity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the Compute. |  [optional]
**name** | **String** | Name of the Tessell Compute. |  [optional]
**family** | **String** | Name of the Tessell Compute Family. |  [optional]
**cloudShape** | **String** | Cloud Shape. |  [optional]
**cloudType** | [**TessellCloudTypeDTO**](TessellCloudTypeDTO.md) | Cloud Type. |  [optional]
**cloudAndRegionAvailability** | **String** | Cloud location and region details.. |  [optional]
**cloudAndRegionAvailabilityList** | **List&lt;String&gt;** | Cloud location and region details.. |  [optional]
**profileInfo** | [**TessellComputeProfileEntityDTO**](TessellComputeProfileEntityDTO.md) |  |  [optional]
**id** | **UUID** | If provided, then use the provided uuid as the compute identifier. |  [optional]
**tsm** | **Boolean** | Is TSM Shape |  [optional]
**useCasesInfo** | [**TessellComputeUseCasesInfoDTO**](TessellComputeUseCasesInfoDTO.md) | List of Use Cases |  [optional]
**isInternal** | **Boolean** | Is Internal |  [optional]
**metadata** | [**TessellComputeMetadataDTO**](TessellComputeMetadataDTO.md) |  |  [optional]
**status** | [**TessellComputeStatusDTO**](TessellComputeStatusDTO.md) |  |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]



