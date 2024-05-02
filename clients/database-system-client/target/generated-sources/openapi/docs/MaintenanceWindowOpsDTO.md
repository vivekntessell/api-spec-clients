

# MaintenanceWindowOpsDTO

Ops view for Maintenance Window

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**name** | **String** |  |  [optional]
**entityId** | **UUID** |  |  [optional]
**entityType** | **EntityType** |  |  [optional]
**type** | **MaintenanceWindowType** |  |  [optional]
**status** | **MaintenanceWindowStatus** |  |  [optional]
**triggerTime** | **Date** |  |  [optional]
**executionInfo** | [**MaintenanceWindowExecutionInfo**](MaintenanceWindowExecutionInfo.md) |  |  [optional]
**duration** | **Integer** | Maintenance Window duration in minutes |  [optional]
**createdBy** | **String** |  |  [optional]
**tasks** | [**List&lt;TaskOpsDTO&gt;**](TaskOpsDTO.md) |  |  [optional]
**dateCreated** | **Date** |  |  [optional]
**dateModified** | **Date** |  |  [optional]



