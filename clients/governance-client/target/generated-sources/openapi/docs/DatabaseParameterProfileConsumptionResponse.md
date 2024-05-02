

# DatabaseParameterProfileConsumptionResponse

This is a definition for Tessell Database Parameter Profile Object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Database Parameter Profile description |  [optional]
**driverInfo** | [**DatabaseParameterProfileDriverInfo**](DatabaseParameterProfileDriverInfo.md) |  |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**id** | **UUID** | Tessell generated UUID for the entity |  [optional]
**parameterTypeId** | **UUID** | Tessell parameter type UUID for the entity |  [optional]
**metadata** | [**DatabaseParameterProfileMetadata**](DatabaseParameterProfileMetadata.md) |  |  [optional]
**name** | **String** | Name of the entity | 
**maturityStatus** | **DatabaseParameterProfileMaturityStatus** |  |  [optional]
**parameters** | [**List&lt;DatabaseProfileParameterType&gt;**](DatabaseProfileParameterType.md) | Database Parameter Profile&#39;s associated parameters |  [optional]
**topology** | **String** | Database Parameter Profile&#39;s topology |  [optional]
**owner** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**version** | **String** | Database Parameter Profile&#39;s version |  [optional]



