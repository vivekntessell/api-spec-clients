

# RebootDBServiceRequestCallbackPayload

Payload received during Argo workflow callbacks.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**prevWorkflowName** | **String** | Previous workflow name corresponding to which the payload in the callback is received. |  [optional]
**newWorkflowName** | **String** | New workflow name if the earlier workflow failed and there are retries left. Else null |  [optional]
**status** | **ArgoWorkflowStatus** |  |  [optional]
**payload** | **Map&lt;String, Object&gt;** |  |  [optional]
**context** | **Object** |  |  [optional]
**lastRunCount** | **Integer** |  |  [optional]
**maxRunCount** | **Integer** |  |  [optional]



