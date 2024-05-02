

# EntityDeleteConfig

Represents the object of each entity that needs to be cleaned up during tenant deletion

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entityType** | **EntityType** |  |  [optional]
**dependentEntities** | **List&lt;EntityType&gt;** | List of entity types which needs to be deleted after the entities of current type |  [optional]
**global** | **Boolean** | False, if the entity type gets created within a subscription |  [optional]
**entityDeleteUrl** | **String** | Url for submitting a bulk delete api |  [optional]
**entityDeleteStatusUrl** | **String** | Url for getting the status of entity bulk delete api |  [optional]
**timeout** | **Integer** | Timeout in secs for bulk delete operation |  [optional]
**sleepTime** | **Integer** | Sleep time in secs between bulk status calls |  [optional]



