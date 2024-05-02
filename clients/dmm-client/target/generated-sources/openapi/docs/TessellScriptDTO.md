

# TessellScriptDTO

Tessell Script DTO definition

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** | Name of the script. |  [optional]
**description** | **String** | Description for the script. |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**scriptType** | **ScriptType** |  |  [optional]
**status** | **ScriptStatus** |  |  [optional]
**maturityStatus** | **ScriptMaturityStatus** |  |  [optional]
**activeVersion** | **String** | Current active version of the script |  [optional]
**tenantId** | **String** |  |  [optional]
**ownerId** | **String** | Script&#39;s owner Id |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Script |  [optional]
**metadata** | [**TessellScriptMetadata**](TessellScriptMetadata.md) |  |  [optional]
**driverInfo** | [**TessellScriptDriverInfo**](TessellScriptDriverInfo.md) |  |  [optional]
**oob** | **Boolean** | Whether the script is a out-of-the-box script or not. |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]
**versions** | [**List&lt;TessellScriptVersionDTO&gt;**](TessellScriptVersionDTO.md) |  |  [optional]



