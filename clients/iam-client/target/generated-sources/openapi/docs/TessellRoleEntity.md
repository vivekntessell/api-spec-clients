

# TessellRoleEntity

This is a definition for Tessell internal create onboarded acl payload object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**role** | **String** | role name |  [optional]
**description** | **String** | Description of role |  [optional]
**entityType** | **String** | entity type |  [optional]
**permissions** | [**List&lt;TessellPermissionEntity&gt;**](TessellPermissionEntity.md) |  |  [optional]
**internal** | **Boolean** | Internal role |  [optional]
**status** | [**TessellRoleStatus**](TessellRoleStatus.md) | Status of the role |  [optional]



