

# ServiceSampleDatasetLoadingInfo

Details about the sample dataset being/already loaded in a DB Service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasetId** | **UUID** | Sample Dataset ID which is loaded/being loaded in service. |  [optional]
**datasetName** | **String** | Name of sample dataset loading/loaded. |  [optional]
**datasetSize** | **Long** | Size of dataset that is loaded. |  [optional]
**dataLoadingStartAt** | **Date** | Time at which sample dataset loading started. |  [optional]
**dataLoadingCompletedAt** | **Date** | Time at which sample dataset loading completed. |  [optional]
**status** | **SampleDatasetLoadingStatus** |  |  [optional]
**databaseId** | **UUID** | DB Service database Id where the sample dataset is loading/loaded. |  [optional]



