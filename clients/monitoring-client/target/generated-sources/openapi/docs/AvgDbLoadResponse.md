

# AvgDbLoadResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | The ID of the DB Service. |  [optional]
**serviceInstanceId** | **UUID** | The ID of the DB Service Instance. |  [optional]
**startTime** | **String** | Start timestamp in prometheus date-time format |  [optional]
**endTime** | **String** | End timestamp in prometheus date-time format |  [optional]
**sliceBy** | [**MonitoringSliceBy**](MonitoringSliceBy.md) |  |  [optional]
**filterBy** | [**List&lt;MonitoringFilterBy&gt;**](MonitoringFilterBy.md) | Array of filters to filter Avg Db Load |  [optional]
**metricDistribution** | [**List&lt;SlicedMetric&gt;**](SlicedMetric.md) | Distribution of Avg DB Load across different entities as categorized by the specified slice by parameter. |  [optional]



