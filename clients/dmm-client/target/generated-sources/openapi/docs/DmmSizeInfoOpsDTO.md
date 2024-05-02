

# DmmSizeInfoOpsDTO


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**policyName** | **String** | Associated policy/sla name |  [optional]
**contentType** | **DapContentType** |  |  [optional]
**totalPhysicalSize** | **Long** | Total physical size |  [optional]
**totalLogicalSize** | **Long** | Total logical size |  [optional]
**backupPhysicalSize** | **Long** | Backup physical size |  [optional]
**backupLogicalSize** | **Long** | Backup logical size |  [optional]
**logSize** | **Long** | Log size |  [optional]
**temporarySize** | **Long** | Temporary size |  [optional]
**info** | **Map&lt;String, List&lt;String&gt;&gt;** | Miscellaneous information |  [optional]
**cloudSizeInfo** | [**Map&lt;String, CloudAccountSizeOpsDTO&gt;**](CloudAccountSizeOpsDTO.md) | The size information per cloud account |  [optional]



