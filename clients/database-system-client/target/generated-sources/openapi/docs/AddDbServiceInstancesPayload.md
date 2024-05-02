

# AddDbServiceInstancesPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**instanceNamePrefix** | **String** |  |  [optional]
**cloud** | **String** | The cloud-type in which the instance is to be provisioned (ex. aws, azure) | 
**region** | **String** | The region in which the instance is to be provisioned | 
**vpc** | **String** | The VPC to be used for provisioning the instance. If not specified, it will be inherited from the current instances that are in the same region. If no instances are present in the target region, this is a required input. |  [optional]
**computeType** | **String** | The compute-type to be used for provisioning the instance. If not specified, it will be inherited from the current primary instance. |  [optional]
**enablePerfInsights** | **Boolean** | Specify whether to enable perf insights for the DB instances |  [optional]
**awsInfraConfig** | [**AwsInfraConfig**](AwsInfraConfig.md) |  |  [optional]
**instances** | [**List&lt;AddDbServiceInstancePayload&gt;**](AddDbServiceInstancePayload.md) |  | 



