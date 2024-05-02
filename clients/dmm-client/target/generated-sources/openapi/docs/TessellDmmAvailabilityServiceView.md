

# TessellDmmAvailabilityServiceView

This is a definition for Tessell Availability Machine's sla and schedule details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** |  |  [optional]
**availabilityMachine** | **String** | Associated Availability Machine Name |  [optional]
**topology** | [**List&lt;DBServiceTopology&gt;**](DBServiceTopology.md) | The availability location details: cloudAccount to region |  [optional]
**rpoSlaStatus** | **String** | The availability status |  [optional]
**sla** | **String** | Associated SLA |  [optional]
**slaRetentionInfo** | [**TamRetentionInfo**](TamRetentionInfo.md) |  |  [optional]
**schedule** | [**ScheduleInfo**](ScheduleInfo.md) |  |  [optional]



