

# SampleDatasetOpsDTO

Details about the sample dataset

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Unique ID of dataset |  [optional]
**name** | **String** | Name of the dataset |  [optional]
**description** | **String** | Short description of dataset |  [optional]
**link** | **String** | Link to Tessell support page which describes the dataset |  [optional]
**totalSize** | **Long** | Total size of dataset in bytes |  [optional]
**engine** | **DatabaseEngineType** |  |  [optional]
**softwareImages** | **List&lt;String&gt;** |  |  [optional]
**cloudLocation** | **String** | Cloud location (AWS S3) where the sample dataset is stored. |  [optional]
**dumpPath** | **String** | Path of dataset dump with respect to AWS S3 tar. |  [optional]
**scriptPath** | **String** | Path of sanitization script with respect to AWS S3 tar. |  [optional]
**scriptId** | **UUID** | Tessell Masking Script ID which is loaded along with this sample dataset. |  [optional]
**status** | **SampleDatasetOpsStatus** |  |  [optional]
**dateCreated** | **Date** | Timestamp when this sample-dataset was created |  [optional]
**dateModified** | **Date** | Timestamp when this sample-dataset was last modified |  [optional]



