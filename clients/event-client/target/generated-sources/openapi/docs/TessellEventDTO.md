

# TessellEventDTO

Event object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | event identifier | 
**tenantId** | **String** | Tenant identifier | 
**subscriptionName** | **String** | Subscription name | 
**userId** | **String** | User identifier | 
**userGroup** | **String** | User group |  [optional]
**ownerName** | **String** | Owner of the entity | 
**eventType** | **String** |  | 
**appName** | **String** | App that generated the event | 
**severity** | [**TessellSeverityDTO**](TessellSeverityDTO.md) |  | 
**entityId** | **String** | Entity identifier | 
**entityName** | **String** | Entity name | 
**message** | **String** | message | 
**occurredAt** | **Date** | occurred at timestamp | 
**entityType** | **String** | entity type | 
**parentEventId** | **String** | Parent event identifier | 
**order** | **Integer** | Event order under the parent event | 
**entityMetadata** | **String** | Entity metadata |  [optional]
**eventMetadata** | **String** | Event metadata |  [optional]
**systemGenerated** | **Boolean** | Is system generated event | 
**visibility** | **TessellVisibilityDTO** |  |  [optional]



