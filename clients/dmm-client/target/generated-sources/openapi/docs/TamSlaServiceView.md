

# TamSlaServiceView

Information about the Availability Machine's Data Protection SLA

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the SLA |  [optional]
**description** | **String** | Description of the SLA |  [optional]
**oob** | **Boolean** | Specify if the SLA is out-of-the-box |  [optional]
**maturityStatus** | **TessellSlaMaturityStatus** |  |  [optional]
**retentionInfo** | [**TamRetentionInfo**](TamRetentionInfo.md) |  |  [optional]
**scope** | **String** | Scope of this SLA |  [optional]
**user** | **UUID** | Owner of this SLA |  [optional]
**owner** | **String** | Email id of SLA owner |  [optional]
**tenantId** | **String** | ID of this tenant under which this SLA is effective |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing this SLA |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]



