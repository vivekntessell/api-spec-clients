

# TamSla

This is a definition for Tessell Availability Machine SLA Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**description** | **String** | Tessell Availability Machine SLA&#39;s description |  [optional]
**internal** | **Boolean** | Flag for sla which is not user visible |  [optional]
**id** | **UUID** | UUID of the SLA |  [optional]
**name** | **String** | Name of the entity | 
**oob** | **Boolean** | Specify if Tessell Availability Machine SLA is out-of-the-box |  [optional]
**retentionInfo** | [**TamRetentionInfoOps**](TamRetentionInfoOps.md) |  |  [optional]
**scope** | **TamSlaScope** |  |  [optional]
**userId** | **UUID** | Tessell Availability Machine SLA&#39;s user id |  [optional]
**maturityStatus** | **TessellSlaMaturityStatus** |  |  [optional]
**status** | **TessellSlaStatus** |  |  [optional]
**owner** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Availability Machine |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]



