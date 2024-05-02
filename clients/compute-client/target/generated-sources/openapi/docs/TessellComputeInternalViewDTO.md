

# TessellComputeInternalViewDTO

Compute Response Object (Internal View)

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Description of the Compute. |  [optional]
**name** | **String** | Name of the Compute. |  [optional]
**family** | **String** | Name of the Tessell Family |  [optional]
**cloudShape** | **String** | Actual Cloud Shape |  [optional]
**cloudType** | **TessellCloudTypeDTO** |  |  [optional]
**availability** | [**List&lt;TessellComputeInternalViewAvailabilityDTO&gt;**](TessellComputeInternalViewAvailabilityDTO.md) |  |  [optional]
**profileInfo** | [**TessellComputeProfileInfoInternalDTO**](TessellComputeProfileInfoInternalDTO.md) |  |  [optional]
**tsm** | **Boolean** | Is TSM Shape |  [optional]
**id** | **UUID** | If provided, then use the provided uuid as the compute identifier. |  [optional]
**useCases** | **List&lt;TessellComputeUseCaseDTO&gt;** |  |  [optional]
**isInternal** | **Boolean** |  |  [optional]
**metadata** | [**TessellComputeMetadataDTO**](TessellComputeMetadataDTO.md) |  |  [optional]
**status** | **TessellComputeStatusDTO** |  |  [optional]



