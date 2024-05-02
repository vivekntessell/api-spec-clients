

# DatabaseParameterProfileRequest

This is a definition for Tessell Parameter Profile Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Parameter Profile name | 
**description** | **String** | Parameter Profile description |  [optional]
**engineType** | **DatabaseEngineType** |  | 
**status** | **DatabaseParameterProfileStatus** |  |  [optional]
**maturityStatus** | **DatabaseParameterProfileMaturityStatus** |  |  [optional]
**owner** | **String** |  |  [optional]
**parameters** | [**List&lt;DatabaseProfileParameterType&gt;**](DatabaseProfileParameterType.md) | Parameters associated with Parameter Profile | 
**metadata** | [**DatabaseParameterProfileMetadata**](DatabaseParameterProfileMetadata.md) |  |  [optional]
**dbVersion** | **String** | Database Engine version | 



