

# InfraCreationRequestK8sConfig

This is the k8s cluster config for shared infra creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**metadataRepoCloudResourceUrl** | **String** | EC2 Repo to be used while creating infra deployment |  [optional]
**eksConfig** | [**InfraCreationRequestEksConfig**](InfraCreationRequestEksConfig.md) |  |  [optional]
**aksConfig** | [**InfraCreationRequestAksConfig**](InfraCreationRequestAksConfig.md) |  |  [optional]
**nodeGroups** | [**List&lt;InfraK8sNodeGroupConfigPayload&gt;**](InfraK8sNodeGroupConfigPayload.md) |  |  [optional]



