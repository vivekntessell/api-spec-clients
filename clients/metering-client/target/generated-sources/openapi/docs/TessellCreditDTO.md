

# TessellCreditDTO

This is a definition for Tessell credits object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Id of credit entity |  [optional]
**name** | **String** | Credit Name |  [optional]
**dateCreated** | **OffsetDateTime** | Credit creation timestamp |  [optional]
**dateModified** | **OffsetDateTime** | Credit modification timestamp |  [optional]
**expiryDate** | **OffsetDateTime** | Credit expiry date |  [optional]
**amount** | **Double** | Total credit amount |  [optional]
**hideBillingCreditsUnit** | **Boolean** | if want to hide the credit unit |  [optional]
**balance** | **Double** | Credit balance |  [optional]
**tenantId** | **String** | Tenant this credit belongs to |  [optional]
**status** | **TessellCreditStatus** |  |  [optional]
**type** | **TessellCreditType** |  |  [optional]
**metadata** | **Object** | Credit metadata |  [optional]



