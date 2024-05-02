

# ProvisionMonitoringInfraPayload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**tenantId** | **UUID** | Tenant Id | 
**subscriptionId** | **UUID** | Subscription Id | 
**cloudType** | **CloudType** |  | 
**region** | **String** | Region in which the infra to be provisioned | 
**vpcId** | **UUID** | Vpc Id in which the infra to be provisioned | 
**cloudAccountId** | **UUID** | Cloud account id of the data plane where infra to be provisioned | 
**encryptionKeyCloudId** | **String** | Encryption Key Id of the cloud |  [optional]
**computeId** | **UUID** | Compute Id for the compute configuration | 
**volumeSize** | **Integer** | Volume size of the infra |  [optional]
**owner** | **String** | Owner of the infra | 
**skipProvisionRollback** | **Boolean** | Internal flag to indicate if vms to be rolled back in case of provision failure |  [optional]



