

# TessellDmmDTO

The Availability Machine is an abstraction provided by Tessell that takes care of all of the data-management and data-protection aspects for a DB Service, like capturing snapshots, backups, providing PITR recoverability, and processing the data for sanitization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the Availability Machine |  [optional]
**name** | **String** | Name of the Availability Machine | 
**description** | **String** | Description of the Availability Machine |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**status** | **DmmStatus** |  |  [optional]
**clone** | **Boolean** | Specifies if this Availability Machine is for a cloned database |  [optional]
**internal** | **Boolean** | If this DMM is for internal use |  [optional]
**tenantId** | **String** |  |  [optional]
**subscriptionId** | **UUID** |  |  [optional]
**subscription** | **String** | Dmm&#39;s subscription name |  [optional]
**databaseSystemId** | **UUID** | Data Management Machine&#39;s associated Database System Id |  [optional]
**owner** | **String** | Data Management Machine&#39;s user |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Availability Machine |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**sharedWithUserGroups** | **List&lt;String&gt;** |  |  [optional]
**lastStartedAt** | **Date** | Timestamp when the Availability Machine was last started at |  [optional]
**lastStoppedAt** | **Date** | Timestamp when the Availability Machine was last paused/stopped at |  [optional]
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**driverInfo** | [**DmmDriverInfo**](DmmDriverInfo.md) |  |  [optional]
**metadata** | [**DmmMetadata**](DmmMetadata.md) |  |  [optional]
**rpoSla** | [**TessellDmmAvailabilityDTO**](TessellDmmAvailabilityDTO.md) |  |  [optional]
**daps** | [**List&lt;TessellDapDTO&gt;**](TessellDapDTO.md) |  |  [optional]
**clones** | [**List&lt;TessellServiceOpsDTO&gt;**](TessellServiceOpsDTO.md) | Clone databases that are created from this Availability Machine |  [optional]
**backupDownloadConfig** | [**BackupDownloadConfig**](BackupDownloadConfig.md) |  |  [optional]



