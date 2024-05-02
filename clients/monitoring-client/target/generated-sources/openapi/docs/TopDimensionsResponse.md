

# TopDimensionsResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. |  [optional]
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. |  [optional]
**metricType** | **PerfMetricType** |  |  [optional]
**startTime** | **String** | Start timestamp in prometheus date-time format |  [optional]
**endTime** | **String** | End timestamp in prometheus date-time format |  [optional]
**numTopK** | **Integer** | Number of top dimension entities |  [optional]
**extendedPerfMetricsAvailable** | **Boolean** | Indicates if Extended Perf Metrics are available for the metric values returned in response or not |  [optional]
**sliceBy** | [**MonitoringSliceBy**](MonitoringSliceBy.md) |  |  [optional]
**metricValues** | [**List&lt;TopDimensionsMetricValue&gt;**](TopDimensionsMetricValue.md) | Top dimension metric values |  [optional]



