

# TopDimensionsPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. | 
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. | 
**startTime** | **String** | Start timestamp in prometheus date-time format | 
**endTime** | **String** | End timestamp in prometheus date-time format | 
**metricType** | **PerfMetricType** |  | 
**sliceBy** | [**MonitoringSliceBy**](MonitoringSliceBy.md) |  |  [optional]
**numTopK** | **Integer** | Number of top dimension entities |  [optional]



