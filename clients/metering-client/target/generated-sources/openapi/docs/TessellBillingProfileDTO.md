

# TessellBillingProfileDTO

This is a definition for Tessell Billing Profile

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | The id for which the Billing profile should be created |  [optional]
**name** | **String** | The name of the billing profile |  [optional]
**companyName** | **String** | The company name of customer in billing profile |  [optional]
**emailLists** | **List&lt;String&gt;** | The list of all emails where invoice need to send |  [optional]
**description** | **String** | The description of the billing profile |  [optional]
**tenantId** | **String** | Tenant this billing profile belongs to |  [optional]
**address** | [**TessellCustomerBillingProfileAddress**](TessellCustomerBillingProfileAddress.md) |  |  [optional]



