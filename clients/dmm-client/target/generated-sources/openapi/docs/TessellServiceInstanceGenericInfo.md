

# TessellServiceInstanceGenericInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**partOfInitialPrimarySet** | **Boolean** |  |  [optional]
**encryptionKey** | **String** | The encryption key name which is used to encrypt the data at rest |  [optional]
**encryptionKeyId** | **UUID** | The encryption key id which is used to encrypt the data at rest |  [optional]
**serverCertId** | **UUID** | The CA certificate id which is configured for this instance |  [optional]
**vpc** | **String** | The VPC to be used for provisioning the instance |  [optional]
**vpcId** | **UUID** | The VPC Id which is used for provisioning the instance |  [optional]
**networkProfileId** | **UUID** | The network-profile-id which is used for provisioning the instance |  [optional]
**computeType** | **String** |  |  [optional]
**computeId** | **UUID** |  |  [optional]
**awsInfraConfig** | [**AwsInfraConfig**](AwsInfraConfig.md) |  |  [optional]
**baseStorage** | **Long** | The base storage (in bytes) that has been provisioned for the DB Service instance. |  [optional]
**additionalStorage** | **Long** | The additional storage (in bytes) to be provisioned for the DB Service instance. This is in addition to what is specified in the compute type. |  [optional]
**allocatedStorage** | **Long** | The actual storage (in bytes) that has been provisioned for the DB Service instance. |  [optional]
**maxMemory** | **Long** | The allocated max memory (in bytes) for this instance |  [optional]
**softwareImage** | **String** | The software-image-name which is used for provisioning this instance |  [optional]
**softwareImageVersion** | **String** | The software-image-version-name which is used for provisioning this instance |  [optional]
**softwareImageId** | **UUID** | The software-image-id which is used for provisioning this instance |  [optional]
**softwareImageVersionId** | **UUID** | The software-image-version-id which is used for provisioning this instance |  [optional]
**dataVolumeIops** | **Long** |  |  [optional]
**throughput** | **Integer** | Throughput requested for this DB Service instance |  [optional]
**parameterProfile** | [**ParameterProfile**](ParameterProfile.md) |  |  [optional]
**parameterProfileId** | **UUID** |  |  [optional]



