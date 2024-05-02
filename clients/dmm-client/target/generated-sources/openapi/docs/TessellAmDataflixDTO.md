

# TessellAmDataflixDTO

The Dataflix summary details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the associated DB Service |  [optional]
**serviceName** | **String** | Name of the associated DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) | The cloud and region information where the data is available for access |  [optional]
**owner** | **String** | Owner of the Availability Machine |  [optional]
**tsm** | **Boolean** | Specify whether the associated DB Service is created using TSM compute type |  [optional]
**sharedWith** | [**EntityAclSharingSummaryInfo**](EntityAclSharingSummaryInfo.md) |  |  [optional]



