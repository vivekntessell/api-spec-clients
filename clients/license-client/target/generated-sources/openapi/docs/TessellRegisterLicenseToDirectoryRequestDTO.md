

# TessellRegisterLicenseToDirectoryRequestDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licenseCategory** | **TessellLicenseCategoryDTO** |  | 
**licenseType** | **TessellLicenseTypeDTO** |  | 
**vendor** | **TessellVendorDTO** |  | 
**description** | **String** |  |  [optional]
**edition** | **String** | Edition for the license ie Standard/enterprise | 
**version** | **String** | License version | 
**subscriptionId** | **String** | Subscription identifier | 
**licenseKey** | **String** | license key specific |  [optional]
**quantity** | **Double** | quantity of license capacity to be registered | 
**status** | **TessellLicenseStatusDTO** |  |  [optional]
**maturityStatus** | **TessellMaturityStatusDTO** |  |  [optional]
**quantityMetric** | **String** | Capacity metric to determine quantity | 
**maxUsageAllowed** | **Double** | Quantity that is permissible for provisioning |  [optional]
**startDate** | **OffsetDateTime** | start-date of the license | 
**endDate** | **OffsetDateTime** | endDate of the license |  [optional]
**metadata** | **String** |  |  [optional]



