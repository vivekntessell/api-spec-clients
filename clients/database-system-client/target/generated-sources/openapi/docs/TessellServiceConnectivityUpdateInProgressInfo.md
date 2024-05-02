

# TessellServiceConnectivityUpdateInProgressInfo

DB Service connectivity update-in-progress details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dnsPrefix** | **String** | The DNS prefix associated with the DB Service |  [optional]
**enablePublicAccess** | **Boolean** | Specify whether to enable public access to the DB Service, default false |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | The list of allowed ipv4 addresses that can connect to the DB Service |  [optional]
**privateLink** | [**ServiceConnectivityUpdateInProgressInfo**](ServiceConnectivityUpdateInProgressInfo.md) |  |  [optional]
**computesConnectivity** | [**List&lt;ComputeConnectivityConfig&gt;**](ComputeConnectivityConfig.md) | The Genie endpoint to connect to your DB service. |  [optional]



