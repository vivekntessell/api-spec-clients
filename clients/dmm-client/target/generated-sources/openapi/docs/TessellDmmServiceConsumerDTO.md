

# TessellDmmServiceConsumerDTO

The Availability Machine is an abstraction provided by Tessell that takes care of all of the data-management and data-protection aspects for a DB Service, like capturing snapshots, backups, providing PITR recoverability, and processing the data for sanitization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the DB Service that is associated with the Availability Machine |  [optional]
**serviceName** | **String** | Name of the DB Service that is associated with the Availability Machine |  [optional]
**tenant** | **String** | ID of the tenant under which this Availability Machine is effective |  [optional]
**subscription** | **String** | Name of the subscription under which the associated DB Service is hosted |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**dataIngestionStatus** | **AmDataIngestionStatus** |  |  [optional]
**userId** | **String** | User details representing the owner for the Availability Machine |  [optional]
**owner** | **String** | User details representing the owner for the Availability Machine |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing this Availability Machine |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) | Availability Machine manages data across multiple regions within a cloud. This sections provides information about the cloud and regions where this Availability Machine is managing the data. |  [optional]
**rpoSla** | [**TessellDmmAvailabilityServiceView**](TessellDmmAvailabilityServiceView.md) |  |  [optional]
**daps** | [**List&lt;TessellDapServiceDTO&gt;**](TessellDapServiceDTO.md) | The Access Policies (DAP) that have configured for this Availability Machine |  [optional]
**clones** | [**List&lt;TessellCloneSummaryInfo&gt;**](TessellCloneSummaryInfo.md) | The clone DB Services that have been created using contents (snapshots, Sanitized Snapshots, PITR, backups) from this Availability Machine |  [optional]
**dateCreated** | **Date** | The timestamp when the Availability Machine was incarnated |  [optional]
**dateModified** | **Date** | The timestamp when the Availability Machine was last updated |  [optional]
**tsm** | **Boolean** | Specify whether the associated DB Service is created using TSM compute type |  [optional]
**backupDownloadConfig** | [**BackupDownloadConfig**](BackupDownloadConfig.md) |  |  [optional]



