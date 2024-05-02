

# AvgDbLoadPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. | 
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. | 
**startTime** | **String** | Start timestamp in prometheus date-time format | 
**endTime** | **String** | End timestamp in prometheus date-time format | 
**sliceBy** | [**MonitoringSliceBy**](MonitoringSliceBy.md) |  |  [optional]
**filterBy** | [**List&lt;MonitoringFilterBy&gt;**](MonitoringFilterBy.md) | Array of filters to filter Avg Db Load |  [optional]
**step** | **Integer** | Specifies the frequency at which data points are sampled or aggregated within the specified time range |  [optional]



