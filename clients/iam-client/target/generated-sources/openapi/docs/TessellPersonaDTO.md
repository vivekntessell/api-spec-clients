

# TessellPersonaDTO

This is a definition for Tessell internal persona DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId** | **String** | Tessell tenant id |  [optional]
**systemCreated** | **Boolean** | system created persona |  [optional]
**dateCreated** | **Date** | Date when the persona is created  metadata |  [optional]
**dateModified** | **Date** | Date when persona is last modified  metadata |  [optional]
**description** | **String** | Description of the persona |  [optional]
**id** | **UUID** | Tessell generated UUID for the persona object |  [optional]
**name** | **String** | Name of the persona |  [optional]
**privileges** | [**List&lt;TessellPrivilegeDTO&gt;**](TessellPrivilegeDTO.md) | List of privileges. |  [optional]
**apps** | [**List&lt;TessellAppDTO&gt;**](TessellAppDTO.md) | List of apps |  [optional]
**status** | **TessellPersonaStatus** |  |  [optional]



