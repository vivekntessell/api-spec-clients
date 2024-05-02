

# SharableDbserverComputeResourceDTO

This is a definition for compute resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of the Compute Resource |  [optional]
**name** | **String** | The name of the Compute Resource | 
**subscription** | **String** | The subscription under which this resource is created |  [optional]
**owner** | **String** | The email address of the owner of the Compute Resource |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**cloud** | **CloudType** |  |  [optional]
**region** | **String** | The region where the Compute Resource is hosted |  [optional]
**availabilityZone** | **String** | The availability zone where the Compute Resource is hosted |  [optional]
**computeType** | **String** | The compute type to be used for provisioning the DB Service |  [optional]
**vpc** | **String** | The VPC which is used for provisioning the compute resource |  [optional]
**encryptionKey** | **String** | The encryption key which is used to encrypt the data at rest |  [optional]
**servicePort** | **Integer** |  |  [optional]
**optimizedVcpus** | **Integer** | vcpus usable by the db service(s) |  [optional]
**hostedDbServices** | [**List&lt;HostedDbServiceOnCr&gt;**](HostedDbServiceOnCr.md) |  |  [optional]
**reservedMemory** | **Long** | The memory (in bytes) that has been reserved for other DB Services |  [optional]
**enablePublicAccess** | **Boolean** | Whether public access is enabled for the Compute Resource |  [optional]
**enableSSL** | **Boolean** | Whether SSL is enabled for the Compute Resource |  [optional]
**softwareImageInfo** | [**SharableDbserverComputeResourceDTOSoftwareImageInfo**](SharableDbserverComputeResourceDTOSoftwareImageInfo.md) |  |  [optional]



