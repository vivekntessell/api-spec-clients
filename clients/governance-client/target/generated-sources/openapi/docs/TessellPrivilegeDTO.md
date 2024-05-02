

# TessellPrivilegeDTO

This is a definition for Tessell internal privilege DTO object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Date when the privilege is created in Tessell metadata |  [optional]
**dateModified** | **Date** | Date when privilege is last modified in Tessell metadata |  [optional]
**description** | **String** | Description of the privilege |  [optional]
**id** | **UUID** | generated UUID for the privilege object |  [optional]
**name** | **String** | Name of the privilege |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
DELETED | &quot;DELETED&quot;
ENABLED | &quot;ENABLED&quot;



