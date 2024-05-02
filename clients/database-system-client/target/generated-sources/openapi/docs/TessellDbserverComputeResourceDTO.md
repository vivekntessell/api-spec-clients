

# TessellDbserverComputeResourceDTO

This is the definition for Compute Resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of the Compute Resource |  [optional]
**name** | **String** | The name of the Compute Resource | 
**subscription** | **String** | The subscription under which this resource is created |  [optional]
**servicePort** | **Integer** |  |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **ComputeResourceStatus** |  |  [optional]
**machineType** | **MachineType** |  |  [optional]
**cloud** | **CloudType** |  |  [optional]
**region** | **String** | The region where the Compute Resource is hosted |  [optional]
**availabilityZone** | **String** | The availability zone where the Compute Resource is hosted |  [optional]
**computeType** | **String** | The compute type to be used for provisioning the DB Service |  [optional]
**computeSharingEnabled** | **Boolean** | Whether the Compute Resource is shared across multiple DB Services |  [optional]
**vpc** | **String** | The VPC which is used for provisioning the Compute Resource |  [optional]
**encryptionKey** | **String** | The encryption key which is used to encrypt the data at rest |  [optional]
**reservedMemory** | **Long** | The memory (in bytes) that has been collectively reserved for all hosted DB Services |  [optional]
**enablePublicAccess** | **Boolean** | Whether public access is enabled on the Compute Resource |  [optional]
**enableSSL** | **Boolean** | Whether SSL is enabled on the Compute Resource |  [optional]
**owner** | **String** | The email address of the owner of the Compute Resource |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**timezone** | **String** | The timezone detail |  [optional]
**dbServices** | [**List&lt;DBServiceOnComputeResource&gt;**](DBServiceOnComputeResource.md) |  |  [optional]
**optimizedVcpus** | **Integer** | vcpus usable by the db service(s) |  [optional]
**softwareImageInfo** | [**TessellDbserverComputeResourceDTOSoftwareImageInfo**](TessellDbserverComputeResourceDTOSoftwareImageInfo.md) |  |  [optional]



