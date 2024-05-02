

# TessellServiceClonedFromInfo

If the DB Service is created as a clone from some other DB Service, this section describes the parent DB Service and cloning details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tessellServiceId** | **UUID** | The DB Service ID using which this DB Service clone is created |  [optional]
**availabilityMachineId** | **UUID** | The Availability Machine ID using which this DB Service clone is created |  [optional]
**tessellService** | **String** | The DB Service name using which this DB Service clone is created |  [optional]
**availabilityMachine** | **String** | The Availability Machine name using which this DB Service clone is created |  [optional]
**snapshotName** | **String** | The snapshot using which this DB Service clone is created |  [optional]
**snapshotId** | **UUID** | The snapshot ID using which this DB Service clone is created |  [optional]
**snapshotTime** | **Date** | DB Service snapshot capture time |  [optional]
**pitrTime** | **String** | If the database was created using a Point-In-Time mechanism, it specifies the timestamp in UTC |  [optional]
**maximumRecoverability** | **Boolean** | If the service was created using a maximum recoverability from the parent service |  [optional]



