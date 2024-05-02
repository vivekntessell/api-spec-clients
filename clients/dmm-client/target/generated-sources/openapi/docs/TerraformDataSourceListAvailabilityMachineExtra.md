

# TerraformDataSourceListAvailabilityMachineExtra


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the Availability Machine |  [optional]
**status** | [**StatusEnum**](#StatusEnum) | status |  [optional]
**engineType** | [**EngineTypeEnum**](#EngineTypeEnum) | Availaility Machine&#39;s engine-types |  [optional]
**owners** | **List&lt;String&gt;** | List of Email Addresses for entity or resource owners |  [optional]
**loadAcls** | **Boolean** | Load ACL information |  [optional]



## Enum: StatusEnum

Name | Value
---- | -----
CREATING | &quot;CREATING&quot;
FAILED | &quot;FAILED&quot;
READY | &quot;READY&quot;
STOPPING | &quot;STOPPING&quot;
STOPPED | &quot;STOPPED&quot;
DEGRADED | &quot;DEGRADED&quot;
STARTING | &quot;STARTING&quot;
DELETING | &quot;DELETING&quot;
SWITCHOVER | &quot;SWITCHOVER&quot;
REBUILDING | &quot;REBUILDING&quot;



## Enum: EngineTypeEnum

Name | Value
---- | -----
ORACLE | &quot;ORACLE&quot;
POSTGRESQL | &quot;POSTGRESQL&quot;
SQLSERVER | &quot;SQLSERVER&quot;
MYSQL | &quot;MYSQL&quot;
APACHE_KAFKA | &quot;APACHE_KAFKA&quot;
MONGODB | &quot;MONGODB&quot;
MILVUS | &quot;MILVUS&quot;



