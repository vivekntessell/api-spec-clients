

# ServiceConnectivityPrivateLink

The interface endpoint or Gateway Load Balancer endpoint to connect to your DB service.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | **DbServicePrivateLinkStatus** |  |  [optional]
**servicePrincipals** | **Set&lt;String&gt;** | The list of AWS account principals that are currently enabled |  [optional]
**endpointServiceName** | **String** | The configured endpoint as a result of configuring the service-principals |  [optional]
**clientAzureSubscriptionIds** | **Set&lt;UUID&gt;** | The list of Azure subscription Ids |  [optional]
**privateLinkServiceAlias** | **String** | The Azure private link service alias |  [optional]



