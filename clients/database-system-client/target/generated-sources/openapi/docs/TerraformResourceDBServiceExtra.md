

# TerraformResourceDBServiceExtra


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**parentAvailabilityMachineId** | **UUID** | Id of the parent AvailabilityMachine, required when creating a clone |  [optional]
**blockUntilComplete** | **Boolean** | For any operation on this resource, block the flow until the action has completed successfully |  [optional]
**timeout** | **Integer** | If block_until_complete is true, how long it should block for. (In seconds) |  [optional]
**expectedStatus** | [**ExpectedStatusEnum**](#ExpectedStatusEnum) | If provided, invoke the DB Service start/stop API |  [optional]



## Enum: ExpectedStatusEnum

Name | Value
---- | -----
READY | &quot;READY&quot;
STOPPED | &quot;STOPPED&quot;



