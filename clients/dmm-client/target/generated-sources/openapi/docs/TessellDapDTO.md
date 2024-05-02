

# TessellDapDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** |  |  [optional]
**availabilityMachineId** | **UUID** |  |  [optional]
**availabilityMachineName** | **String** |  |  [optional]
**purpose** | **DapPurpose** |  |  [optional]
**contentType** | **DapContentType** |  |  [optional]
**contentInfo** | [**DapContentInfoOps**](DapContentInfoOps.md) |  |  [optional]
**status** | **DapStatus** |  |  [optional]
**retentionPolicyId** | **UUID** |  |  [optional]
**targetCloudLocations** | [**List&lt;TessellDapCloudLocationInfo&gt;**](TessellDapCloudLocationInfo.md) |  |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) |  |  [optional]
**driverInfo** | [**TessellDapDriverInfo**](TessellDapDriverInfo.md) |  |  [optional]
**metadata** | [**TessellDapMetadata**](TessellDapMetadata.md) |  |  [optional]
**dataAccessConfig** | [**TessellDapRetentionPolicyDTO**](TessellDapRetentionPolicyDTO.md) |  |  [optional]
**owner** | **String** |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Availability Machine |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]



