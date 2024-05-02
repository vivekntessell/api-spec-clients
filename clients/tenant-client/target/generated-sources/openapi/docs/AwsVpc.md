

# AwsVpc

Details of AWS VPC

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vpcName** | **String** | Name of the VPC |  [optional]
**vpcId** | **String** | Id of the vpc |  [optional]
**vpcCidrBlock** | **String** | cidr block of the vpc |  [optional]
**enablePublicAccess** | **Boolean** | Whether VPC is public or not |  [optional]
**publicSubnets** | [**List&lt;AwsSubnet&gt;**](AwsSubnet.md) | Public subnets |  [optional]
**privateSubnets** | [**List&lt;AwsSubnet&gt;**](AwsSubnet.md) | Private subnets |  [optional]



