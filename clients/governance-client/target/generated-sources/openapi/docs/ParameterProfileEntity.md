

# ParameterProfileEntity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** | user created profile name |  [optional]
**description** | **String** |  |  [optional]
**profileRefId** | **UUID** | ref id of profile |  [optional]
**tessellUserId** | **UUID** |  |  [optional]
**parameterTypeId** | **UUID** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**parameters** | [**List&lt;DatabaseProfileParameterType&gt;**](DatabaseProfileParameterType.md) | Database Parameter Profile&#39;s associated parameters |  [optional]
**isActive** | **Boolean** |  |  [optional]
**oob** | **Boolean** |  |  [optional]
**metadata** | [**DatabaseParameterProfileMetadata**](DatabaseParameterProfileMetadata.md) | Database Parameter Profile&#39;s metadata information |  [optional]
**dateCreated** | **Date** | create date |  [optional]
**dateModified** | **Date** |  |  [optional]
**owner** | **String** |  |  [optional]
**maturityStatus** | [**DatabaseParameterProfileMaturityStatus**](DatabaseParameterProfileMaturityStatus.md) |  |  [optional]
**driverInfo** | [**DatabaseParameterProfileDriverInfo**](DatabaseParameterProfileDriverInfo.md) | Database Parameter Profile&#39;s metadata information for driver use |  [optional]
**status** | [**DatabaseParameterProfileStatus**](DatabaseParameterProfileStatus.md) |  |  [optional]



