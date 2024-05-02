

# TessellTenantUserAttributes

This is a definition for Tessell user persona DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId** | **String** | Tenant id to be used in the header in all the apis post login |  [optional]
**tenantFirstName** | **String** | First Name of the tenant |  [optional]
**tenantLastName** | **String** | Last Name of the tenant |  [optional]
**tenantEmail** | **String** | Tenant email using which the tenant was registered |  [optional]
**tenantType** | **String** | Type of the tenant |  [optional]
**tenantDomain** | **String** | Type of the tenant |  [optional]
**tenantServicePlan** | **String** | Service plan of tenant |  [optional]
**tenantDateCreated** | **Date** | Date tenant is created on |  [optional]
**personas** | [**List&lt;TessellUserPersonaDTO&gt;**](TessellUserPersonaDTO.md) | List of personas. |  [optional]
**subscriptions** | [**List&lt;TessellUserSubscriptionDTO&gt;**](TessellUserSubscriptionDTO.md) | List of subscription names of user |  [optional]
**accessControlFlags** | **List&lt;TessellUserAccessControlFlags&gt;** | List of Access Control Flags of user |  [optional]



