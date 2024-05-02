

# TessellAppDTO

This is a definition for Tessell app DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**appFamily** | **String** | App family this app belongs to |  [optional]
**description** | **String** | Description of the app |  [optional]
**name** | **String** | Name of the app |  [optional]
**privileges** | [**List&lt;TessellPrivilegeDTO&gt;**](TessellPrivilegeDTO.md) | List of privileges associated with the app |  [optional]
**features** | [**List&lt;TessellAppFeatureDTO&gt;**](TessellAppFeatureDTO.md) | List of features associated with the app |  [optional]
**status** | **TessellAppStatusDTO** |  |  [optional]



