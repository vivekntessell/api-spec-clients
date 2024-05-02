

# DnsRecordUpdatePayload

Payload for updating the dns record

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ip** | **String** | IP address of the Virtual Machine | 
**dnsName** | **String** | DNS name of the Virtual Machine | 
**domainName** | **String** | Domain name | 
**ttl** | **Integer** | Time to live value for the DNS record | 
**region** | **String** | Cloud region | 
**dnsService** | [**DnsServiceEnum**](#DnsServiceEnum) | DNS service being used | 
**cloudAccountId** | **UUID** | Cloud account ID for the account where DNS record is present |  [optional]



## Enum: DnsServiceEnum

Name | Value
---- | -----
AZURE_DNS | &quot;AZURE_DNS&quot;
ROUTE_53 | &quot;ROUTE_53&quot;
NO_DNS | &quot;NO_DNS&quot;



