

# DBServiceOnComputeResource

DB Service details hosted on a compute resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | ID of the DB Service |  [optional]
**name** | **String** | Name of the DB Service |  [optional]
**engineType** | **DatabaseEngineType** |  |  [optional]
**topology** | **TessellServiceTopology** |  |  [optional]
**dbServiceStatus** | **TessellServiceStatus** |  |  [optional]
**instanceId** | **UUID** |  |  [optional]
**instanceName** | **String** |  |  [optional]
**role** | **TessellServiceInstanceRole** |  |  [optional]
**instanceStatus** | **TessellServiceInstanceStatus** |  |  [optional]
**maxMemory** | **Long** | The allocated max memory (in bytes) for this instance |  [optional]
**storage** | **Long** | The storage (in bytes) that has been provisioned for the DB Service instance |  [optional]
**servicePort** | **Integer** |  |  [optional]
**allowedIpAddresses** | **List&lt;String&gt;** | The list of allowed ipv4 addresses that can connect to the DB Service. If not specified, this field will be ignored and the existing setting will be assumed. |  [optional]
**databases** | **Set&lt;String&gt;** |  |  [optional]
**owner** | **String** | This field specifies who is the owner for the DB Service |  [optional]



