

# PostgresqlConnectionPoolInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **UUID** | Unique id for the connection pool |  [optional]
**connPoolName** | **String** | Name of the connection pool |  [optional]
**connPoolSize** | **Integer** | Size of the connection pool |  [optional]
**connPoolMode** | **PostgresqlConnectionPoolMode** |  |  [optional]
**dbName** | **String** | Database name on which this connection pool exist |  [optional]
**dbUsername** | **String** | Username for the connection pool |  [optional]
**serviceName** | **String** |  |  [optional]
**status** | **ConnectionPoolStatus** |  |  [optional]
**connectionDetails** | [**PostgresqlConnectionPoolInfoConnectionDetails**](PostgresqlConnectionPoolInfoConnectionDetails.md) |  |  [optional]



