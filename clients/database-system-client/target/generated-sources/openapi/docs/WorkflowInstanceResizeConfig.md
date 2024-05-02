

# WorkflowInstanceResizeConfig


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**computeType** | **String** | The new compute type for the service/instance |  [optional]
**parameterProfileId** | **UUID** |  |  [optional]
**iops** | **Long** | The new IOPS for the service/instance |  [optional]
**throughput** | **Integer** | The new Throughput for the service/instance |  [optional]
**instanceId** | **UUID** | UUID for the instance that needs to be resized. | 
**storage** | **Long** | The new storage (in bytes) for the service |  [optional]
**currentLicenseInfo** | [**DbLicenseInfo**](DbLicenseInfo.md) |  |  [optional]
**newLicenseInfo** | [**DbLicenseInfo**](DbLicenseInfo.md) |  |  [optional]



