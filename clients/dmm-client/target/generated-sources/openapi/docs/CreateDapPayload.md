

# CreateDapPayload

Payload to create an Access Policy (DAP) and the associated configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Access Policy | 
**contentType** | **DapContentType** |  | 
**contentInfo** | [**CreateDapContentInfoPayload**](CreateDapContentInfoPayload.md) |  |  [optional]
**dataAccessConfig** | [**DapRetentionInfo**](DapRetentionInfo.md) |  |  [optional]
**targetCloudLocations** | **Map&lt;String, List&lt;String&gt;&gt;** | The cloud and region information where the data is being managed by this Access Policy | 
**users** | **List&lt;String&gt;** | List of users who have access to the data/content managed by this Access Policy |  [optional]



