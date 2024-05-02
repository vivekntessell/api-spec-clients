

# DatabaseParameterProfileResponse

This is a definition for Tessell Database Parameter Profile Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**versionId** | **UUID** | Tessell generated UUID for the entity |  [optional]
**name** | **String** | Name of the entity | 
**description** | **String** | Database Parameter Profile description |  [optional]
**oob** | **Boolean** |  |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**factoryParameterId** | **UUID** | Tessell parameter type UUID for the entity |  [optional]
**status** | **DatabaseParameterProfileStatus** |  |  [optional]
**maturityStatus** | **DatabaseParameterProfileMaturityStatus** |  |  [optional]
**owner** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the db profile |  [optional]
**parameters** | [**List&lt;DatabaseProfileParameterType&gt;**](DatabaseProfileParameterType.md) | Parameter Profile&#39;s associated parameters |  [optional]
**metadata** | [**DatabaseParameterProfileMetadata**](DatabaseParameterProfileMetadata.md) |  |  [optional]
**driverInfo** | [**DatabaseParameterProfileDriverInfo**](DatabaseParameterProfileDriverInfo.md) |  |  [optional]
**userId** | **UUID** | Database Parameter Profile&#39;s user id |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dbVersion** | **String** | Database Parameter Profile&#39;s version |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]



