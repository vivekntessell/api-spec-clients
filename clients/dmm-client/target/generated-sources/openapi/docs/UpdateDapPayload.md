

# UpdateDapPayload

Payload to update an Access Policy (DAP) and the associated configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Access Policy | 
**contentInfo** | [**UpdateDapContentInfoPayload**](UpdateDapContentInfoPayload.md) |  |  [optional]
**dataAccessConfig** | [**DapRetentionInfo**](DapRetentionInfo.md) |  |  [optional]
**users** | **List&lt;String&gt;** | List of users who have access to the data/content managed by this Access Policy |  [optional]



