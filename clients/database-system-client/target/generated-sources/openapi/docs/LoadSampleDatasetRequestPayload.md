

# LoadSampleDatasetRequestPayload

Details needed to load a sample dataset in a DB Service

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**datasetId** | **UUID** | Unique ID of Dataset to be loaded. | 
**datasetSize** | **Long** | Size in bytes to be loaded. |  [optional]
**databaseId** | **UUID** | DB Service database ID in which we want to load sample data. Null if data is to be loaded in a new Database. |  [optional]
**databaseName** | **String** | Name of the Database where sample dataset would be loaded. |  [optional]
**scriptId** | **UUID** | Tessell Masking Script ID corresponding to this dataset |  [optional]
**scriptName** | **String** | Masking Script name. |  [optional]



