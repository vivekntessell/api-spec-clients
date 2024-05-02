

# ExtendedPerfMetricsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. |  [optional]
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. |  [optional]
**startTime** | **String** | Start timestamp in prometheus date-time format |  [optional]
**endTime** | **String** | End timestamp in prometheus date-time format |  [optional]
**limit** | **Integer** |  |  [optional]
**metricType** | **PerfMetricType** |  |  [optional]
**metricValue** | **String** | Value of the metric of which the extended metrics to be fetched |  [optional]
**extendedMetricValues** | [**List&lt;TopDimensionsMetricValue&gt;**](TopDimensionsMetricValue.md) | Array of extended metric values |  [optional]



