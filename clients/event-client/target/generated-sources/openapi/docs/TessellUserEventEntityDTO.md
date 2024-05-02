

# TessellUserEventEntityDTO

User Event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | notification identifier |  [optional]
**tenantId** | **String** | Tenant identifier |  [optional]
**userId** | **String** | User identifier |  [optional]
**event** | [**TessellEventEntityDTO**](TessellEventEntityDTO.md) |  |  [optional]
**acknowledged** | **Boolean** | is event acknowledged? |  [optional]
**acknowledgedAt** | **Date** | acknowledged timestamp |  [optional]
**notifyUser** | **Boolean** | whether to notify the user |  [optional]
**subevents** | [**List&lt;TessellEventEntityDTO&gt;**](TessellEventEntityDTO.md) | all events with same parent ID |  [optional]



