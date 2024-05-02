

# BaseSetupTenantRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**emailId** | **String** | Tenant user&#39;s email address | 
**initialCredits** | **Double** | Override the initial default credits |  [optional]
**discount** | [**Discount**](Discount.md) |  |  [optional]
**supportPlan** | **String** | Override the default support plan for the tenant |  [optional]
**billingDisabled** | **Boolean** | To be deprecated |  [optional]
**billingConfig** | [**SetupTenantBillingConfig**](SetupTenantBillingConfig.md) |  |  [optional]
**genieConfig** | [**SetupTenantGenieConfig**](SetupTenantGenieConfig.md) |  |  [optional]
**firstName** | **String** | Tenant user&#39;s first name |  [optional]
**lastName** | **String** | Tenant user&#39;s last name |  [optional]
**company** | **String** | Tenant user&#39;s company name |  [optional]
**jobTitle** | **String** | Tenant user&#39;s job title |  [optional]
**country** | **String** | Tenant user&#39;s country |  [optional]
**domain** | **String** | Tenant&#39;s sub domain |  [optional]
**customerType** | **CustomerType** |  |  [optional]
**deleteProtected** | **Boolean** | Whether to make the tenant delete protected |  [optional]
**deploymentConfig** | [**InfraDeploymentSetupConfig**](InfraDeploymentSetupConfig.md) |  | 
**convoyDeploymentConfig** | [**ConvoyDeploymentConfig**](ConvoyDeploymentConfig.md) |  |  [optional]
**enabledClouds** | **List&lt;CloudType&gt;** |  | 
**dedicatedCloudAccounts** | [**List&lt;DedicatedCloudAccount&gt;**](DedicatedCloudAccount.md) |  |  [optional]
**tenantPhase** | **TenantPhase** |  |  [optional]



