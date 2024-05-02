

# TessellServiceInfrastructureInfo

This field contains DB Service's infrastructure related information, like, where the service is hosted - cloud, region; what compute shape, or network is is configured with.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud** | **String** | The cloud-type in which the DB Service is provisioned (ex. aws, azure) |  [optional]
**region** | **String** | The region in which the DB Service provisioned |  [optional]
**availabilityZone** | **String** | The availability-zone in which the DB Service is provisioned |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) |  |  [optional]
**vpc** | **String** | The VPC to be used for provisioning the DB Service |  [optional]
**enableEncryption** | **Boolean** |  |  [optional]
**encryptionKey** | **String** | The encryption key name which is used to encrypt the data at rest |  [optional]
**computeType** | **String** | The compute-type to be used for provisioning the DB Service |  [optional]
**awsInfraConfig** | [**AwsInfraConfig**](AwsInfraConfig.md) |  |  [optional]
**storage** | **Long** | The storage (in bytes) that has been provisioned for the DB Service |  [optional]
**additionalStorage** | **Long** | Size in GB. This is maintained for backward compatibility and would be deprecated soon. |  [optional]
**enableComputeSharing** | **Boolean** | Specify if the computes should be shared across DB Services |  [optional]
**timezone** | **String** | The timezone detail |  [optional]
**multiDisk** | **Boolean** | Specify whether the DB service uses multiple data disks |  [optional]
**iops** | **Integer** | IOPS requested for the DB Service |  [optional]
**throughput** | **Integer** | throughput requested for the DB Service |  [optional]



