

# Tenant

This is a definition for Tessell Tenant

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**company** | **String** | Tenant user&#39;s company name |  [optional]
**country** | **String** | Tenant user&#39;s country |  [optional]
**dateCreated** | **Date** | Timestamp when the tenant was registered |  [optional]
**dateModified** | **Date** | Timestamp when the Tenant entry was last modified |  [optional]
**domain** | **String** | Tessell API Gateway sub-domain code |  [optional]
**emailAddress** | **String** | Tenant user&#39;s email address |  [optional]
**firstName** | **String** | Tenant user&#39;s first name |  [optional]
**id** | **UUID** | Tessell generated ID for the Tenant user |  [optional]
**tenantId** | **String** | Value to be used for tenant-id header |  [optional]
**lastName** | **String** | Tenant user&#39;s last name |  [optional]
**metadata** | [**TenantMetadata**](TenantMetadata.md) |  |  [optional]
**onboardingInfo** | [**TenantOnboardingInfo**](TenantOnboardingInfo.md) |  |  [optional]
**status** | **TenantStatus** |  |  [optional]
**type** | **TenantType** |  |  [optional]
**servicePlan** | **String** |  |  [optional]
**infraDeploymentId** | **UUID** |  |  [optional]
**seedDataVersion** | **Integer** |  |  [optional]
**supportPlanId** | **UUID** |  |  [optional]
**associatedCloudAccountIds** | **List&lt;UUID&gt;** |  |  [optional]
**tenantPhase** | **TenantPhase** |  |  [optional]



