

# MaintenanceWindowDTO

User view for Maintenance Window

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**entityId** | **UUID** |  |  [optional]
**entityType** | **EntityType** |  |  [optional]
**type** | **MaintenanceWindowType** |  |  [optional]
**status** | **MaintenanceWindowStatus** |  |  [optional]
**triggerTime** | **Date** |  |  [optional]
**executionInfo** | [**MaintenanceWindowExecutionInfo**](MaintenanceWindowExecutionInfo.md) |  |  [optional]
**duration** | **Integer** | Maintenance Window duration in minutes |  [optional]
**createdBy** | **String** |  |  [optional]
**tasks** | [**List&lt;TaskDTO&gt;**](TaskDTO.md) |  |  [optional]
**summary** | [**MaintenanceWindowSummary**](MaintenanceWindowSummary.md) |  |  [optional]



