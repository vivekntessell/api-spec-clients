

# TessellDapServiceDTO

Access Policy (DAP) and the associated configuration

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the Access Policy |  [optional]
**name** | **String** | Name of the Access Policy |  [optional]
**availabilityMachineId** | **UUID** | ID of the Availability Machine |  [optional]
**tessellServiceId** | **UUID** | ID of the associated DB Service |  [optional]
**serviceName** | **String** | Name of the associated DB Service |  [optional]
**engineType** | **String** | Database engine type of the associated DB Service |  [optional]
**contentType** | **DapContentType** |  |  [optional]
**status** | **DapStatus** |  |  [optional]
**contentInfo** | [**DapContentInfo**](DapContentInfo.md) |  |  [optional]
**cloudAvailability** | [**List&lt;CloudRegionInfo&gt;**](CloudRegionInfo.md) | The cloud and region information where the data is being managed by this Access Policy |  [optional]
**dataAccessConfig** | [**DapRetentionInfo**](DapRetentionInfo.md) |  |  [optional]
**owner** | **String** | Owner of the Access Policy |  [optional]
**loggedInUserRole** | **String** | The role of the logged in user for accessing the Availability Machine |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when this Access Policy was created at |  [optional]
**dateModified** | **Date** | Timestamp when this Access Policy was last updated at |  [optional]



