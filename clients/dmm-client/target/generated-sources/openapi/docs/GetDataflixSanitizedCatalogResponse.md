

# GetDataflixSanitizedCatalogResponse

The Dataflix catalog details for sanitized contents

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the associated DB Service |  [optional]
**serviceName** | **String** | Name of the associated DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**timeZone** | **String** | Timezone applicable for timestamps that are returned in this response |  [optional]
**owner** | **String** | Owner of the Availability Machine |  [optional]
**snapshotCatalog** | [**List&lt;DataflixSanitizedSnapshot&gt;**](DataflixSanitizedSnapshot.md) | Catalog information for the available Sanitized Snapshots |  [optional]



