

# TessellScriptServiceViewDTO

Information about a Script

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the script |  [optional]
**name** | **String** | Name of the script |  [optional]
**description** | **String** | Description for the script |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**scriptType** | **ScriptType** |  |  [optional]
**status** | **ScriptStatus** |  |  [optional]
**activeVersion** | **String** | Current active version for the script |  [optional]
**tenantId** | **String** | ID of the tenant under which the script is effective |  [optional]
**ownerId** | **String** | Owner of this script |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Script |  [optional]
**oob** | **Boolean** | Whether the script is a out-of-the-box script or created by user explicitly |  [optional]
**dateCreated** | **Date** | Timestamp when this script was created at |  [optional]
**versions** | [**List&lt;TessellScriptVersionServiceView&gt;**](TessellScriptVersionServiceView.md) | The associated versions for this script |  [optional]



