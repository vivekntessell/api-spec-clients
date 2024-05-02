

# GetDatabaseSnapshotsResponse

Information about the available snapshots

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the associated DB Service |  [optional]
**serviceName** | **String** | Name of the associated DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**timeZone** | **String** | Timezone applicable for timestamps that are returned in this response |  [optional]
**owner** | **String** | Owner of the Availability Machine |  [optional]
**pitrCatalog** | [**List&lt;TessellDataflixPitrInfo&gt;**](TessellDataflixPitrInfo.md) | Catalog information for the point-in-time recoverability |  [optional]
**snapshots** | [**List&lt;DatabaseSnapshot&gt;**](DatabaseSnapshot.md) | Catalog information for the available snapshots |  [optional]



