

# TessellPermissionEntity

This is a definition for Tessell permission DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**entityType** | **String** | Entity type of the permission |  [optional]
**permission** | **String** | Name of the permission |  [optional]
**description** | **String** | Description of the permission |  [optional]
**internal** | **Boolean** | Internal permission |  [optional]
**roles** | [**List&lt;TessellRoleEntity&gt;**](TessellRoleEntity.md) |  |  [optional]
**status** | [**TessellPermissionStatus**](TessellPermissionStatus.md) | Status of the permission |  [optional]



