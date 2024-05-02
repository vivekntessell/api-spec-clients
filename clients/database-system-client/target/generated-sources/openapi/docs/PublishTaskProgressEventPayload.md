

# PublishTaskProgressEventPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**resourceId** | **String** | ID of Tessell Entity provided in resourceType | 
**resourceType** | **String** | Resource type i.e. TESSELL_ENTITY (like TESSELL_SERVICE/DB_SNAPSHOT etc) | 
**resourceName** | **String** | Name of the resource for which task progress event will be published |  [optional]
**resourceOwnerId** | **String** | Owner id of the resource for which task progress event will be published |  [optional]
**eventType** | **String** | Type of task-progress event. Refer TaskProgressEventType in database-system-service. | 
**stepName** | **String** | Sub-step name of the task-progress event. | 
**message** | **String** |  |  [optional]
**eventStatus** | **String** | Status of the sub-step. Refer TaskProgressEventStatusType in database-system-service. | 



