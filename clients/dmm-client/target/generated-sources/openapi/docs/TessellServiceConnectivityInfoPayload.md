

# TessellServiceConnectivityInfoPayload

DB Service connectivity details

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enableSSL** | **Boolean** |  |  [optional]
**dnsPrefix** | **String** | If not specified, Tessell will use a randomly generated prefix |  [optional]
**servicePort** | **Integer** | The connection port for the DB Service | 
**enablePublicAccess** | **Boolean** | Specify whether to enable public access to the DB Service, default false |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | The list of allowed ipv4 addresses that can connect to the DB Service |  [optional]



