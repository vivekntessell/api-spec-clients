

# TessellTenantUserServiceConsumerAttributes

This is a definition for Tessell user persona DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId** | **String** | Email id of the tenant |  [optional]
**tenantFirstName** | **String** | First Name of the tenant |  [optional]
**tenantLastName** | **String** | Last Name of the tenant |  [optional]
**tenantEmail** | **String** | Tenant email using which the tenant was registered |  [optional]
**tenantType** | **String** | Type of the tenant |  [optional]
**tenantDomain** | **String** | Type of the tenant |  [optional]
**tenantServicePlan** | **String** | Service Plan of tenant |  [optional]
**tenantDateCreated** | **Date** | Date tenant is created on |  [optional]
**personas** | [**List&lt;TessellUserPersonaServiceConsumerDTO&gt;**](TessellUserPersonaServiceConsumerDTO.md) | List of personas. |  [optional]
**subscriptions** | **List&lt;String&gt;** | List of subscriptions of user |  [optional]
**accessControlFlags** | **List&lt;TessellUserAccessControlFlags&gt;** | List of Access Control Flags of user |  [optional]



