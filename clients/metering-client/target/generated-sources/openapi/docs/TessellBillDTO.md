

# TessellBillDTO

This is a definition for Tessell Bill

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**startDate** | **OffsetDateTime** | The start date from when this bill is applicable |  [optional]
**endDate** | **OffsetDateTime** | The start date from when this bill is applicable |  [optional]
**billPdf** | **String** | The link to the bill pdf |  [optional]
**totalCharges** | **Double** | The total charges incurred during this billing period |  [optional]
**discount** | **Double** | The discount applicable during this bill period |  [optional]
**credit** | **Double** | Credit amount applied during this bill period |  [optional]
**amountDue** | **Double** | The amount due in dollars for this billing period |  [optional]
**bucketPath** | **String** | The path to S3 bucket containing the bill |  [optional]
**metadata** | **Object** | Bill metadata |  [optional]
**duration** | **TessellBillDuration** |  |  [optional]



