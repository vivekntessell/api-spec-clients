

# TessellDmmAvailabilityDTO

This is a definition for Tessell Availability Machine's cloud/region availability details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | Associated Availability Machine Id |  [optional]
**slaId** | **UUID** | Associated SLA |  [optional]
**scheduleId** | **UUID** | Associated schedule |  [optional]
**status** | **DmmAvailabilityStatus** |  |  [optional]
**slaDto** | [**TamSla**](TamSla.md) |  |  [optional]
**scheduleDto** | [**TamSchedule**](TamSchedule.md) |  |  [optional]
**metadata** | [**DmmAvailabilityMetadata**](DmmAvailabilityMetadata.md) |  |  [optional]
**driverInfo** | [**DmmAvailabilityDriverInfo**](DmmAvailabilityDriverInfo.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the entity created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]



