

# TessellCreateAzurePrivateLinkPayloadDTO

Create Azure Private Link Payload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | Tessell Service UUID |  [optional]
**subscriptionId** | **UUID** | Id of the subscription |  [optional]
**serviceName** | **String** | Name of the Tessell Service |  [optional]
**serviceNicName** | **String** | Name of NIC of the Tessell Service |  [optional]
**subnetId** | **String** | Subnet ID to be used for Private Link Creation |  [optional]
**serviceConnectionPort** | **String** | Port for the Tessell Service Connection |  [optional]
**serviceConnectionProtocol** | **String** | Protocol for the Tessell Service Connection. Example - TCP |  [optional]
**serviceVpcId** | **UUID** | VPC ID for the Tessell Service |  [optional]
**clientAzureSubscriptionIdList** | **List&lt;String&gt;** | List of Azure Subscriptions allowed to connect to Azure Private Link |  [optional]



