

# AzureByoaExecutionOutput

Output from the execution done at customer's account either via arm deployment or via script

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**subscriptionId** | **String** | Subscription Id of the customer&#39;s account | 
**tenantId** | **String** | Tenant Id of the customer&#39;s account | 
**objectIdOfTessellApp** | **String** | Object id of the tessell app in customer&#39;s env |  [optional]
**allowTessellCreation** | **Boolean** | Whether Tessell is given create permissions or not |  [optional]
**location** | **String** | Azure Region | 
**resourceGroup** | **String** | Resource Group Name | 
**resources** | [**AzureByoaExecutionOutputResources**](AzureByoaExecutionOutputResources.md) |  | 



