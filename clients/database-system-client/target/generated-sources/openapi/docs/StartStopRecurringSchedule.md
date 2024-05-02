

# StartStopRecurringSchedule

Recurring start/stop schedule details for the DB Service tessell service

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**scheduleStartDate** | **Date** | Date from which the given recurring schedule would be applicable from |  [optional]
**dbServiceStartAt** | **String** | Time at which the DB Service should be started at |  [optional]
**dbServiceStopAt** | **String** | Time at which the DB Service should be stopped at |  [optional]
**scheduleExpiry** | [**StartStopRecurringScheduleExpiry**](StartStopRecurringScheduleExpiry.md) |  |  [optional]
**dailySchedule** | **Boolean** | Whether the given schedule is a daily schedule i.e. a schedule which is executed daily |  [optional]
**weeklySchedule** | [**StartStopWeeklySchedule**](StartStopWeeklySchedule.md) |  |  [optional]



