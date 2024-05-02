

# TessellLicenseUtilisationEntityDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** |  |  [optional]
**createdAt** | **OffsetDateTime** | Timestamp when the entity was created |  [optional]
**createdBy** | **String** |  |  [optional]
**description** | **String** | Description about this transaction. |  [optional]
**tenantId** | **String** | Description about this transaction. |  [optional]
**status** | [**TessellLicenseStatusDTO**](TessellLicenseStatusDTO.md) |  |  [optional]
**targetQuantity** | **Double** | Request number of licenses. |  [optional]
**subscriptionId** | **String** | Subscription identifier. |  [optional]
**acquirerId** | **String** | Acquirer service identifier. |  [optional]
**lockHash** | **String** |  |  [optional]
**metadata** | **String** |  |  [optional]
**operation** | [**TessellLicenseRecordOperationTypeDTO**](TessellLicenseRecordOperationTypeDTO.md) |  |  [optional]
**licenseId** | **UUID** | foreign key reference of License Directory Table |  [optional]



