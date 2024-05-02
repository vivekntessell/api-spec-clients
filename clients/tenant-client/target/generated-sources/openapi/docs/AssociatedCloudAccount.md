

# AssociatedCloudAccount


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dateCreated** | **Date** | Timestamp when the entity was created |  [optional]
**dateModified** | **Date** | Timestamp when the entity was last modified |  [optional]
**id** | **UUID** | generated UUID for the entity |  [optional]
**secret** | [**Map&lt;String, Parameter&gt;**](Parameter.md) | Cloud Login Secrets |  [optional]
**secretARN** | **String** | Secret identifier |  [optional]
**accountId** | **String** | Account ID |  [optional]
**cloudAccountType** | **CloudAccountType** |  |  [optional]
**cloudLocationId** | **String** | ID of the cloud location where this account belongs |  [optional]
**description** | **String** | Description |  [optional]
**name** | **String** | Name of the entity | 
**managedType** | **CloudAccountManagedType** |  |  [optional]
**status** | **CloudAccountStatus** |  |  [optional]
**associationStatus** | **AssociationStatus** |  |  [optional]
**associatedCloudResources** | **Map&lt;String, Object&gt;** |  |  [optional]
**regions** | [**List&lt;TenantRegion&gt;**](TenantRegion.md) |  |  [optional]
**associatingRegions** | [**List&lt;TenantRegion&gt;**](TenantRegion.md) |  |  [optional]



