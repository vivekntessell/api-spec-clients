

# TessellLicenseDirectoryEntityDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**vendor** | **String** | vendor of license |  [optional]
**edition** | **String** | edition of license |  [optional]
**version** | **String** | version of license |  [optional]
**licenseCategory** | [**TessellLicenseCategoryDTO**](TessellLicenseCategoryDTO.md) |  |  [optional]
**licenseType** | [**TessellLicenseTypeDTO**](TessellLicenseTypeDTO.md) | License type |  [optional]
**licenseKey** | **String** | key of license |  [optional]
**subscriptionId** | **String** |  |  [optional]
**tenantId** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**deleted** | **Boolean** |  |  [optional]
**totalQuantity** | **Double** | Total number of licenses. |  [optional]
**availableQuantity** | **Double** | available licenses. |  [optional]
**maxUsageAllowed** | **Double** | max usage allowed for the licenses. |  [optional]
**quantityMetric** | **String** | metric for license quantity |  [optional]
**startDate** | **OffsetDateTime** | startDate for license term |  [optional]
**endDate** | **OffsetDateTime** | endDate for license term |  [optional]
**lastModifiedAt** | **OffsetDateTime** | Timestamp when the entity was last modified |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**metadata** | **String** |  |  [optional]



