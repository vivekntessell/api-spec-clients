

# GenieConfigurationInstance

Genie Configuration instance object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**computeID** | **String** | Compute Resource Id of the DB Service Instance. |  [optional]
**computeName** | **String** | Compute Resource name of the DB Service instance. |  [optional]
**frpcConfig** | **String** | FRPC configuration |  [optional]
**clientID** | **String** | FRPC client ID to authenticate with frps |  [optional]
**pemFile** | **String** | File that contains private key |  [optional]
**winRMFile** | **String** | Python file to establish winRM session with the host |  [optional]
**instanceDetails** | **String** | Instance details, success and errors |  [optional]
**generalInfo** | **String** | General Info about the connection |  [optional]
**os** | [**OsType**](OsType.md) |  |  [optional]
**logs** | **String** | Logs generated during enabling Genie - success and error |  [optional]
**user** | **String** | Linux user |  [optional]
**rdpUserName** | **String** | User name created on the VM for Genie |  [optional]
**rdpPassword** | **String** | Admin password for the user |  [optional]



