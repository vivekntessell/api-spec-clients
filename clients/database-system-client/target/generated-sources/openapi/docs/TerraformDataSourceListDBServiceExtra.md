

# TerraformDataSourceListDBServiceExtra


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the DB Service |  [optional]
**statuses** | [**List&lt;StatusesEnum&gt;**](#List&lt;StatusesEnum&gt;) | statuses |  [optional]
**engineTypes** | [**List&lt;EngineTypesEnum&gt;**](#List&lt;EngineTypesEnum&gt;) | DB Service&#39;s engine-types |  [optional]
**clonedFromServiceId** | **UUID** | The ID of the DB Service from which the services are cloned |  [optional]
**clonedFromAvailabilityMachineId** | **UUID** | The id of the Availability Machine from which the services are cloned |  [optional]
**loadInstances** | **Boolean** | Load the instances that are part of the DB Service |  [optional]
**loadDatabases** | **Boolean** | Load the databases that are part of the DB Service |  [optional]
**owners** | **List&lt;String&gt;** | List of Email Addresses for entity or resource owners |  [optional]
**loadAcls** | **Boolean** | Load ACL information |  [optional]



## Enum: List&lt;StatusesEnum&gt;

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



## Enum: List&lt;EngineTypesEnum&gt;

Name | Value
---- | -----
ORACLE | &quot;ORACLE&quot;
POSTGRESQL | &quot;POSTGRESQL&quot;
SQLSERVER | &quot;SQLSERVER&quot;
MYSQL | &quot;MYSQL&quot;
APACHE_KAFKA | &quot;APACHE_KAFKA&quot;
MONGODB | &quot;MONGODB&quot;



