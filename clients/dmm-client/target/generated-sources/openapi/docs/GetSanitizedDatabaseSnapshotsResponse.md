

# GetSanitizedDatabaseSnapshotsResponse

Information about the available Sanitized Snapshots

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**availabilityMachineId** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the associated DB Service |  [optional]
**serviceName** | **String** | Name of the associated DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**timeZone** | **String** | Timezone applicable for timestamps that are returned in this response |  [optional]
**owner** | **String** | Owner of the Availability Machine |  [optional]
**snapshots** | [**List&lt;SanitizedDatabaseSnapshot&gt;**](SanitizedDatabaseSnapshot.md) | Catalog information for the available Sanitized Snapshots |  [optional]



