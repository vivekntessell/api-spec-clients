

# TessellServiceInstanceDTO

This is a definition of the DB Service Instance object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service Instance |  [optional]
**name** | **String** | Name of the DB Service Instance |  [optional]
**type** | **TessellServiceInstanceType** |  |  [optional]
**role** | **TessellServiceInstanceRole** |  |  [optional]
**status** | **TessellServiceInstanceStatus** |  |  [optional]
**tessellServiceId** | **UUID** | DB Service Instance&#39;s associated DB Service id |  [optional]
**cloud** | **String** | DB Service Instance&#39;s cloud type |  [optional]
**region** | **String** | DB Service Instance&#39;s cloud region |  [optional]
**availabilityZone** | **String** | DB Service Instance&#39;s cloud availability zone |  [optional]
**instanceGroupId** | **UUID** | The instance groupd Id |  [optional]
**computeType** | **String** | The compute used for creation of the Tessell Service Instance |  [optional]
**awsInfraConfig** | [**AwsInfraConfig**](AwsInfraConfig.md) |  |  [optional]
**computeId** | **UUID** | The associated compute identifier |  [optional]
**computeName** | **String** | The associated compute name |  [optional]
**storage** | **Long** | The storage (in bytes) that has been provisioned for the DB Service instance. |  [optional]
**dataVolumeIops** | **Long** |  |  [optional]
**throughput** | **Integer** | Throughput requested for this DB Service instance |  [optional]
**enablePerfInsights** | **Boolean** |  |  [optional]
**parameterProfile** | [**ParameterProfile**](ParameterProfile.md) |  |  [optional]
**monitoringConfig** | [**MonitoringConfig**](MonitoringConfig.md) |  |  [optional]
**vpc** | **String** | The VPC used for creation of the DB Service Instance |  [optional]
**encryptionKey** | **String** | The encryption key name which is used to encrypt the data at rest |  [optional]
**softwareImage** | **String** | Software Image to be used to create the instance |  [optional]
**softwareImageVersion** | **String** | Software Image Version to be used to create the instance |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**connectString** | [**TessellServiceInstanceConnectString**](TessellServiceInstanceConnectString.md) |  |  [optional]
**updatesInProgress** | [**List&lt;TessellResourceUpdateInfo&gt;**](TessellResourceUpdateInfo.md) | The updates that are in progress for this resource |  [optional]
**lastStartedAt** | **Date** | Timestamp when the service instance was last started at |  [optional]
**lastStoppedAt** | **Date** | Timestamp when the Service Instance was last stopped at |  [optional]



