

# ByoaTemplateAwsMetadata

Template for Aws BYOA metadata

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**s3Path** | **String** | S3 path of the Cloud Formation template |  [optional]
**tenantId** | **String** | Tenant Id |  [optional]
**crossAccountAccessRoleName** | **String** | Name of the cross account role |  [optional]
**crossAccountAccessRoleArn** | **String** | Arn of the cross account role |  [optional]
**dbVmMgmtRoleName** | **String** | Name of the role for DB VM Management |  [optional]
**dbVmMgmtRoleArn** | **String** | Arn of the role for DB VM Management |  [optional]
**vpc** | [**AwsVpc**](AwsVpc.md) |  |  [optional]
**securityResources** | [**AwsSecurityResources**](AwsSecurityResources.md) |  |  [optional]



