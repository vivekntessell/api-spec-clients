

# SubscriptionV2

This is a definition for Tessell Subscription V2

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Tessell generated ID for the subscription |  [optional]
**name** | **String** | Subscription name |  [optional]
**description** | **String** | Subscription description |  [optional]
**tenantId** | **UUID** | Associated tenant ID for the subscription |  [optional]
**isDefault** | **Boolean** | Specifies if this is the default subscription |  [optional]
**deploymentType** | **SubscriptionDeploymentType** |  |  [optional]
**status** | **SubscriptionStatus** |  |  [optional]
**metadata** | [**SubscriptionMetadata**](SubscriptionMetadata.md) |  |  [optional]
**infraInfo** | [**SubscriptionInfraInfo**](SubscriptionInfraInfo.md) |  |  [optional]
**owner** | **String** |  |  [optional]
**sharedWith** | [**EntityAclSharingInfo**](EntityAclSharingInfo.md) |  |  [optional]
**dateCreated** | **Date** | Timestamp when the subscription was created |  [optional]
**dateModified** | **Date** | Timestamp when the subscription entry was last modified |  [optional]



