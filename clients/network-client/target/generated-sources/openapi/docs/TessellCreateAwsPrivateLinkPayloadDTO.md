

# TessellCreateAwsPrivateLinkPayloadDTO

Create AWS Private Link Payload

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**serviceId** | **UUID** | Tessell Service UUID |  [optional]
**subscriptionId** | **UUID** | Id of the subscription |  [optional]
**serviceName** | **String** | Name of the Tessell Service |  [optional]
**servicePrivateIp** | **String** | Private Ip of the Tessell Service |  [optional]
**serviceConnectionPort** | **String** | Port for the Tessell Service Connection |  [optional]
**serviceConnectionProtocol** | **String** | Protocol for the Tessell Service Connection. Example - TCP |  [optional]
**serviceVpcId** | **UUID** | VPC ID for the Tessell Service |  [optional]
**serviceAvailabilityZone** | **String** | Tessell Service Availability Zone |  [optional]
**clientServicePrincipalList** | **List&lt;String&gt;** | List of service Principals allowed to connect to AWS Private Link |  [optional]



