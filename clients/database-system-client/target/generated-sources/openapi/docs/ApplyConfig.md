

# ApplyConfig

Application Details for any operation

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**overriddenTaskIds** | **List&lt;UUID&gt;** | Task ids that this request will override |  [optional]
**strategy** | **ApplyStrategy** |  |  [optional]
**maintenanceWindowId** | **UUID** | Needed when strategy is MAINTENANCE_WINDOW |  [optional]
**time** | **Date** | Needed when strategy is CUSTOM_DATE_TIME |  [optional]



