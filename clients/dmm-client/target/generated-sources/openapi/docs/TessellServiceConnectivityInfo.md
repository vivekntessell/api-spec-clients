

# TessellServiceConnectivityInfo

DB Service's connectivity information

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enableSSL** | **Boolean** | Specify whether to enable SSL to the DB Service, default false |  [optional]
**caCertId** | **String** | The CA certificate ID associated with the DB Service |  [optional]
**dnsPrefix** | **String** | DNS Prefix associated with the DB Service |  [optional]
**servicePort** | **Integer** | The connection port for the DB Service |  [optional]
**enablePublicAccess** | **Boolean** | Specify whether to enable public access to the DB Service, default false |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | The list of allowed ipv4 addresses that can connect to the DB Service |  [optional]
**connectStrings** | [**List&lt;TessellServiceConnectString&gt;**](TessellServiceConnectString.md) | The list of connect strings for the DB Service |  [optional]
**privateLink** | [**ServiceConnectivityPrivateLink**](ServiceConnectivityPrivateLink.md) |  |  [optional]
**computesConnectivity** | [**List&lt;ComputeConnectivityConfig&gt;**](ComputeConnectivityConfig.md) | The Genie endpoint to connect to your DB service. |  [optional]
**updateInProgressInfo** | [**TessellServiceConnectivityUpdateInProgressInfo**](TessellServiceConnectivityUpdateInProgressInfo.md) |  |  [optional]



