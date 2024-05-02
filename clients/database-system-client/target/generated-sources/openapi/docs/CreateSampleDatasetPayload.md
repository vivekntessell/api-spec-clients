

# CreateSampleDatasetPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the dataset | 
**description** | **String** | Short description of dataset |  [optional]
**link** | **String** | Link to Tessell support page which describes the dataset |  [optional]
**totalSize** | **Long** | Total size of dataset in bytes |  [optional]
**engine** | **DatabaseEngineType** |  | 
**softwareImages** | **List&lt;String&gt;** |  | 
**cloudLocation** | **String** | The AWS S3 URL where the sample dataset is stored. | 
**dumpPath** | **String** | Path of dataset dump with respect to AWS S3 tar. | 
**scriptPath** | **String** | Path of sanitization script with respect to AWS S3 tar. | 



