

# ComputeResourceUpgradeEligibilityOpsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of the Compute Resource |  [optional]
**name** | **String** | The name of the Compute Resource |  [optional]
**status** | **ComputeResourceStatusOps** |  |  [optional]
**type** | **ComputeResourceType** |  |  [optional]
**eligibleForLibraryUpgrade** | **Boolean** | Whether Compute Resource is eligible for upgrade |  [optional]
**message** | **String** | Details on why the compute resource is not eligible for upgrade |  [optional]
**dbServices** | [**List&lt;DbserviceForCrUpgrade&gt;**](DbserviceForCrUpgrade.md) |  |  [optional]
**computeResource** | [**TessellComputeResourceOpsDTO**](TessellComputeResourceOpsDTO.md) |  |  [optional]



