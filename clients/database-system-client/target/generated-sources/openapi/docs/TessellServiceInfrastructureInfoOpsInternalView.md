

# TessellServiceInfrastructureInfoOpsInternalView


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tsm** | **Boolean** | Specify whether the service is created using TSM compute type |  [optional]
**multiDisk** | **Boolean** | Specify whether the DB service uses multiple data disks |  [optional]
**encryptionKeyId** | **UUID** | The encryption key id which is used to encrypt the data at rest |  [optional]
**dbMasterSecretId** | **UUID** | The secret-key-id which is used to store the database master creds |  [optional]
**baseStorage** | **Long** | The default storage (in bytes) that has become effective as part of computeType (provision) or restore-size (for clones). |  [optional]
**additionalStorage** | **Long** | The additional storage (in bytes) that has been provisioned for the DB Service. This is in addition to what is specified in the compute type. |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) |  |  [optional]
**vpcId** | **UUID** | The VPC Id which is used for provisioning the DB Service |  [optional]
**networkProfileId** | **UUID** | The network-profile-id which is used for provisioning the DB Service. |  [optional]
**computeTypeId** | **UUID** | The compute-type-id which is used for provisioning the DB Service. |  [optional]
**softwareImage** | **String** | The software-image-name which is used for provisioning the DB Service |  [optional]
**softwareImageVersion** | **String** | The software-image-version-name which is used for provisioning the DB Service |  [optional]
**softwareImageId** | **UUID** | The software-image-id which is used for provisioning the DB Service |  [optional]
**softwareImageVersionId** | **UUID** | The software-image-version-id which is used for provisioning the DB Service |  [optional]
**osImageId** | **String** |  |  [optional]
**dbEngineSnapshotId** | **String** |  |  [optional]
**tessellLibraySnapshotId** | **String** |  |  [optional]
**edition** | **String** |  |  [optional]



