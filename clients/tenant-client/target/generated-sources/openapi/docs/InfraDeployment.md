

# InfraDeployment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  | 
**name** | **String** |  | 
**displayName** | **String** | display name for the infra deployment which can be consumed while onboarding the tenant | 
**cloudAccountId** | **UUID** |  | 
**cloudLocationId** | **String** |  | 
**status** | **InfraDeploymentStatus** |  | 
**workflowId** | **String** |  |  [optional]
**infraResources** | [**InfraResources**](InfraResources.md) |  |  [optional]
**forTenantType** | **TenantType** |  | 
**metadata** | [**InfraDeploymentMetadata**](InfraDeploymentMetadata.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the infra deployment was created |  [optional]
**dateModified** | **Date** | Timestamp when the infra deployment entry was last modified |  [optional]
**modifiedBy** | **String** | User who modified/created the infra deployment |  [optional]



