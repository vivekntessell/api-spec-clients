

# SetupSharedControlPlaneBaseInfraRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailId** | **String** | Tenant user&#39;s email address | 
**domain** | **String** | Tenant&#39;s sub domain | 
**forTenantType** | **TenantType** |  | 
**customerType** | **CustomerType** |  |  [optional]
**deploymentConfig** | [**InfraDeploymentSetupConfig**](InfraDeploymentSetupConfig.md) |  | 
**convoyDeploymentConfig** | [**ConvoyDeploymentConfig**](ConvoyDeploymentConfig.md) |  |  [optional]
**deleteProtected** | **Boolean** | Whether to make the tenant delete protected. Base scp should always be delete protected by default. |  [optional]



