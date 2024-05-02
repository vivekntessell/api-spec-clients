

# SharedInfraCreationRequestPayload

This is the payload definition for shared tenant infra creation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**convoyDeploymentConfig** | [**ConvoyDeploymentConfig**](ConvoyDeploymentConfig.md) |  |  [optional]
**cloudLocation** | **String** |  | 
**cloudAccountId** | **UUID** |  | 
**name** | **String** |  | 
**displayName** | **String** | display name for the infra which can be consumed while onboarding the tenant | 
**forTenantType** | **TenantType** |  | 
**k8sConfig** | [**InfraCreationRequestK8sConfig**](InfraCreationRequestK8sConfig.md) |  | 
**repoConfig** | [**InfraCreationRequestRepoConfig**](InfraCreationRequestRepoConfig.md) |  |  [optional]
**enablePrivateCpDpCommunication** | **Boolean** | Flag for enabling private communication between Control Plane and Data Plane |  [optional]



