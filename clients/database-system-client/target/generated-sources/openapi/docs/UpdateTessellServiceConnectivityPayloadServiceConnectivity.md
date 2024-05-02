

# UpdateTessellServiceConnectivityPayloadServiceConnectivity


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enablePublicAccess** | **Boolean** | Specify whether to enable public access to the DB Service. If not specified, this field will be ignored and the existing setting will be assumed. |  [optional]
**dnsPrefix** | **String** | Prefix for DNS of the DB Service. If not specified, this field will be ignored and the existing setting will be assumed. |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | The list of allowed ipv4 addresses that can connect to the DB Service. If not specified, this field will be ignored and the existing setting will be assumed. |  [optional]
**privateLink** | [**ServiceConnectivityPrivateLinkPayload**](ServiceConnectivityPrivateLinkPayload.md) |  |  [optional]



