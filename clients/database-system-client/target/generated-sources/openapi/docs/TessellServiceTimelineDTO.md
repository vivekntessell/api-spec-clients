

# TessellServiceTimelineDTO

This is a definition of the DB Service Timeline object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated UUID for the DB Service. This is the unique identifier for the DB Service. |  [optional]
**initiatedBy** | **String** | User id of person who initiated the action |  [optional]
**initiatedTime** | **Date** | Time at which action was initiated |  [optional]
**completedTime** | **Date** | Time at which action was completed |  [optional]
**comment** | **String** | User specified comment for the action |  [optional]
**initiationMessage** | **String** | System generated description at the start of action |  [optional]
**completionMessage** | **String** | System generated description after action is successfully completed |  [optional]
**eventType** | **String** | System generated description of action |  [optional]
**contextInfo** | **List&lt;String&gt;** | Contextual information for the action, if any. |  [optional]



