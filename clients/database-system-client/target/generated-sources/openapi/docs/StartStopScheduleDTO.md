

# StartStopScheduleDTO

Details of the start/stop schedule on a DB Service

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The ID of the schedule |  [optional]
**name** | **String** | Name of the schedule |  [optional]
**description** | **String** |  |  [optional]
**serviceId** | **UUID** | The ID of the DB Service | 
**status** | **StartStopScheduleStatus** |  |  [optional]
**scheduleInfo** | [**StartStopScheduleInfo**](StartStopScheduleInfo.md) |  | 
**metadata** | [**StartStopScheduleMetadata**](StartStopScheduleMetadata.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the schedule was created |  [optional]
**dateModified** | **Date** | Timestamp when the schedule was last modified |  [optional]
**lastRun** | **Date** | The date-time at which this schedule was last executed |  [optional]



