

# ExtendedPerfMetricsPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. | 
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. | 
**startTime** | **String** | Start timestamp in prometheus date-time format | 
**endTime** | **String** | End timestamp in prometheus date-time format | 
**metricType** | **PerfMetricType** |  | 
**metricValue** | **String** | Value of the metric of which the extended metrics to be fetched | 
**limit** | **Integer** | Number of metrics to be fetched |  [optional]



