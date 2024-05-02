

# TessellDatabaseParameterProfileDTO

This is a definition for Tessell Database Parameter Profile Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of the entity | 
**description** | **String** | Database Parameter Profile description |  [optional]
**oob** | **Boolean** |  |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**parameterTypeId** | **UUID** | Tessell parameter type UUID for the entity |  [optional]
**status** | **DatabaseParameterProfileStatusOld** |  |  [optional]
**maturityStatus** | **DatabaseParameterProfileMaturityStatusOld** |  |  [optional]
**owner** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the db profile |  [optional]
**parameters** | [**List&lt;DatabaseProfileParameterTypeOld&gt;**](DatabaseProfileParameterTypeOld.md) | Database Parameter Profile&#39;s associated parameters |  [optional]
**metadata** | [**DatabaseParameterProfileMetadataOld**](DatabaseParameterProfileMetadataOld.md) |  |  [optional]
**driverInfo** | [**DatabaseParameterProfileDriverInfoOld**](DatabaseParameterProfileDriverInfoOld.md) |  |  [optional]
**topology** | **String** | Database Parameter Profile&#39;s topology |  [optional]
**userId** | **UUID** | Database Parameter Profile&#39;s user id |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**version** | **String** | Database Parameter Profile&#39;s version |  [optional]
**dateCreated** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**dateModified** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]



