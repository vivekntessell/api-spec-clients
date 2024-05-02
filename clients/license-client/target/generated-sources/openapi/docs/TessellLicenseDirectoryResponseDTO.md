

# TessellLicenseDirectoryResponseDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenseId** | **UUID** | license identifier |  [optional]
**licenseCategory** | **TessellLicenseCategoryDTO** |  |  [optional]
**licenseType** | **TessellLicenseTypeDTO** |  |  [optional]
**vendor** | **TessellVendorDTO** |  |  [optional]
**description** | **String** |  |  [optional]
**edition** | **String** | edition for the license ie Standard/enterprise |  [optional]
**version** | **String** | license version |  [optional]
**subscriptionId** | **String** | Subscription identifier |  [optional]
**licenseKey** | **String** | license key specific |  [optional]
**availableQuantity** | **Double** | quantity of license capacity to be registered |  [optional]
**quantity** | **Double** | quantity of license capacity to be registered |  [optional]
**status** | **TessellLicenseStatusDTO** |  |  [optional]
**maturityStatus** | **TessellMaturityStatusDTO** |  |  [optional]
**quantityMetric** | **String** | capacity metric to determine quantity |  [optional]
**maxUsageAllowed** | **Double** | quantity that are permissable for provisioning |  [optional]
**startDate** | **OffsetDateTime** | start-date of the licenses. |  [optional]
**endDate** | **OffsetDateTime** | end-date of the license |  [optional]
**metadata** | **String** |  |  [optional]
**lastModifiedBy** | **String** |  |  [optional]
**lastModifiedAt** | **OffsetDateTime** |  |  [optional]
**licenseAudit** | [**List&lt;TessellLicenseAuditResponseDTO&gt;**](TessellLicenseAuditResponseDTO.md) |  |  [optional]



