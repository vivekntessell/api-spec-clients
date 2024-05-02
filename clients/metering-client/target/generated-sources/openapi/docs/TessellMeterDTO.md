

# TessellMeterDTO

This is a definition for Tessell Meter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionName** | **String** | The subscription Name of the tenant |  [optional]
**entityId** | **UUID** | The entity Id |  [optional]
**entityType** | **TessellMeteringEntityType** |  |  [optional]
**availabilityMachineId** | **UUID** | The Availability machine Id |  [optional]
**computeShape** | **String** | The compute shape of the entity |  [optional]
**objectStorePath** | **String** | The storage path of the resource |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**cloudType** | **CloudType** |  |  [optional]
**region** | **String** | The region of the resource |  [optional]
**userName** | **String** | The User Name |  [optional]
**usage** | **Double** | The usage for the duration of the meter |  [optional]
**usageUnit** | **String** | The units of the usage |  [optional]
**cost** | **Double** | The cost incurred for the duration of the meter |  [optional]
**discount** | **Double** | The discount applied to this entity for the duration of the meter |  [optional]
**meterHours** | **Integer** | The number of hours that were involved in the meter |  [optional]
**metadata** | **Object** | Meter metadata |  [optional]
**internal** | **Boolean** | Whether the entity is for Tessell&#39;s internal purpose |  [optional]
**amDetails** | [**List&lt;AMResourceInfo&gt;**](AMResourceInfo.md) | The details of backups and logs in the AM |  [optional]



