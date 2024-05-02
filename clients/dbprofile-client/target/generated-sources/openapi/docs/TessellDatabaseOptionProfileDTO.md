

# TessellDatabaseOptionProfileDTO

This is a definition for Tessell Database Option Profile Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of an Options Profile | 
**description** | **String** | Description of an Options Profile |  [optional]
**oob** | **Boolean** | Database Option Profile description |  [optional]
**engineType** | **DatabaseEngineType** |  | 
**status** | **DatabaseOptionProfileStatus** |  |  [optional]
**maturityStatus** | **DatabaseOptionProfileMaturityStatus** |  |  [optional]
**optionTypeId** | **UUID** | Tessell option type UUID for the entity |  [optional]
**owner** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the db profile |  [optional]
**options** | [**List&lt;DatabaseProfileOptionType&gt;**](DatabaseProfileOptionType.md) | Database Option Profile&#39;s associated options | 
**metadata** | [**DatabaseOptionProfileMetadata**](DatabaseOptionProfileMetadata.md) |  |  [optional]
**driverInfo** | [**DatabaseOptionProfileDriverInfo**](DatabaseOptionProfileDriverInfo.md) |  |  [optional]
**userId** | **UUID** | Database Option Profile&#39;s user id |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**version** | **String** | Database Engine version | 
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]



