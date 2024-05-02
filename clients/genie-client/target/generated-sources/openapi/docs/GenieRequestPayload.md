

# GenieRequestPayload

Payload for genie request

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**computeResourceIds** | **List&lt;String&gt;** | Computes for which Genie is to be enabled |  [optional]
**serviceId** | **String** | Service ID for which Genie has to be enabled for all computeResourceIds |  [optional]
**user** | **String** | User that has taken the action | 
**description** | **String** | Description about why Genie has to be enabled | 
**genieType** | [**GenieType**](GenieType.md) | Genie Type, Customer or Internal |  [optional]
**expiryInMinutes** | **Integer** |  |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | cidr block of the virtual network |  [optional]
**ticketId** | **String** | Jira or freshdesk ticket filed to request Genie |  [optional]
**ticketSummary** | **String** | Jira or freshdesk ticket summary |  [optional]



