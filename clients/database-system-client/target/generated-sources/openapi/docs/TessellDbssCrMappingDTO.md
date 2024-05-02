

# TessellDbssCrMappingDTO

This is a definition for Tessell DBServer System and Compute Resource mapping object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**active** | **Boolean** | Specifies if this is a active switchover node |  [optional]
**backupPriority** | **Integer** | Specifies the backup priority for this node |  [optional]
**computeResourceId** | **UUID** | Compute Resource Id for DBServer System and Compute Resource Mapping |  [optional]
**dateCreated** | **Date** | Timestamp when the mapping was created |  [optional]
**dateModified** | **Date** | Timestamp when the mapping was last modified |  [optional]
**dbserverSystemId** | **UUID** | DBServer System Id for DBServer System and Compute Resource Mapping |  [optional]
**driverInfo** | [**DbssCrMappingDriverInfo**](DbssCrMappingDriverInfo.md) |  |  [optional]
**metadata** | [**DbssCrMappingMetadata**](DbssCrMappingMetadata.md) |  |  [optional]
**primary** | **Boolean** | Specifies if this is a primary node |  [optional]
**status** | **DbssCrStatus** |  |  [optional]



