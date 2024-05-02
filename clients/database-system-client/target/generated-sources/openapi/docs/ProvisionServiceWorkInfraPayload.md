

# ProvisionServiceWorkInfraPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloud** | **String** |  |  [optional]
**region** | **String** |  |  [optional]
**availabilityZone** | **String** |  |  [optional]
**enableEncryption** | **Boolean** |  |  [optional]
**encryptionKey** | **String** |  |  [optional]
**vpc** | **String** |  |  [optional]
**computeType** | **String** |  |  [optional]
**softwareImage** | **String** |  |  [optional]
**softwareImageVersion** | **String** |  |  [optional]
**storage** | **Long** |  |  [optional]
**additionalStorage** | **Long** |  |  [optional]
**computeTypeId** | **UUID** |  |  [optional]
**awsInfraConfig** | [**AwsInfraConfig**](AwsInfraConfig.md) |  |  [optional]
**enableComputeSharing** | **Boolean** |  |  [optional]
**edition** | **String** |  |  [optional]
**vpcId** | **UUID** |  |  [optional]
**networkProfileId** | **UUID** |  |  [optional]
**encryptionKeyId** | **UUID** |  |  [optional]
**dbMasterSecretId** | **UUID** |  |  [optional]
**softwareImageId** | **UUID** |  |  [optional]
**softwareImageVersionId** | **UUID** |  |  [optional]
**computeNamePrefix** | **String** |  |  [optional]
**computes** | [**List&lt;ProvisionComputePayload&gt;**](ProvisionComputePayload.md) |  |  [optional]
**iops** | **Integer** |  |  [optional]
**throughput** | **Integer** |  |  [optional]



