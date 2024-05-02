

# TenantMetadata


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**upgradeStatus** | **UpgradeStatus** |  |  [optional]
**infraInfo** | [**TenantOnboardInfraMetadata**](TenantOnboardInfraMetadata.md) |  |  [optional]
**authType** | **AuthenticationType** |  |  [optional]
**customerType** | **CustomerType** |  |  [optional]
**deleteProtected** | **Boolean** | If the tenant is delete protected |  [optional]
**jobTitle** | **String** |  |  [optional]
**emailVerificationCode** | **String** |  |  [optional]
**verificationCodeExpireAt** | **BigDecimal** |  |  [optional]
**billingInfo** | [**BillingInfo**](BillingInfo.md) |  |  [optional]
**enablePrivateCpDpCommunication** | **Boolean** | Flag for enabling private communication between Control Plane and Data Plane |  [optional]
**isMinIoEnabled** | **Boolean** | Whether to use minio for db lib artifacts. To be deprecated in future. |  [optional]
**enabledClouds** | **List&lt;CloudType&gt;** |  |  [optional]



