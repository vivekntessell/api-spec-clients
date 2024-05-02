# openapi-java-client

Tessell Gateway Service API

- API version: 1.0

- Build date: 2024-05-02T15:57:22.183784+05:30[Asia/Kolkata]

Tessell Gateway Service API Specification


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-1.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.tessell.gateway.client.invoker.*;
import com.tessell.gateway.client.invoker.auth.*;
import com.tessell.gateway.client.model.*;
import com.tessell.gateway.client.api.TessellGatewayServiceControllerApi;

public class TessellGatewayServiceControllerApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        TessellGatewayServiceControllerApi apiInstance = new TessellGatewayServiceControllerApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | 
        try {
            apiInstance.deleteTenantStream(tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellGatewayServiceControllerApi#deleteTenantStream");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8080*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TessellGatewayServiceControllerApi* | [**deleteTenantStream**](docs/TessellGatewayServiceControllerApi.md#deleteTenantStream) | **DELETE** /tessell-ops/tenants/{tenantId}/stream | Delete stream for Tenant
*TessellGatewayServiceControllerApi* | [**deregisterTenantAccount**](docs/TessellGatewayServiceControllerApi.md#deregisterTenantAccount) | **DELETE** /tessell-ops/tenants/{tenantId}/register | Deregister Account for Tenant
*TessellGatewayServiceControllerApi* | [**getCommandStatus**](docs/TessellGatewayServiceControllerApi.md#getCommandStatus) | **GET** /status/{taId}/{executionId} | Get the status of a command
*TessellGatewayServiceControllerApi* | [**getTessellAgentStatus**](docs/TessellGatewayServiceControllerApi.md#getTessellAgentStatus) | **GET** /ta-status/{taId} | Get the status of a command
*TessellGatewayServiceControllerApi* | [**getTessellAgentToken**](docs/TessellGatewayServiceControllerApi.md#getTessellAgentToken) | **GET** /tessell-ops/agent/{deploymentId}/token | Get Tessell Agent Token
*TessellGatewayServiceControllerApi* | [**initializeTenantStream**](docs/TessellGatewayServiceControllerApi.md#initializeTenantStream) | **POST** /tessell-ops/tenants/{tenantId}/stream | Initialize stream for Tenant
*TessellGatewayServiceControllerApi* | [**publishTenantServicesUpgrade**](docs/TessellGatewayServiceControllerApi.md#publishTenantServicesUpgrade) | **POST** /tessell-ops/tenants/{tenantId}/upgrade | Publish Upgrade message for Tenant Services
*TessellGatewayServiceControllerApi* | [**readRemoteFile**](docs/TessellGatewayServiceControllerApi.md#readRemoteFile) | **GET** /read-file/{taId} | Read a file from DB VM.
*TessellGatewayServiceControllerApi* | [**registerTenantAccount**](docs/TessellGatewayServiceControllerApi.md#registerTenantAccount) | **POST** /tessell-ops/tenants/{tenantId}/register | Register Account for Tenant
*TessellGatewayServiceControllerApi* | [**scrape**](docs/TessellGatewayServiceControllerApi.md#scrape) | **GET** /scrape | Scrape TA for DB metrics.
*TessellGatewayServiceControllerApi* | [**sendCommand**](docs/TessellGatewayServiceControllerApi.md#sendCommand) | **POST** /command | Send a new command to a DB VM.
*TessellGatewayServiceControllerApi* | [**sendCurlRequest**](docs/TessellGatewayServiceControllerApi.md#sendCurlRequest) | **POST** /curl | Send a curl command request to a monitoring VM.
*TessellGatewayServiceControllerApi* | [**upgradeLibrary**](docs/TessellGatewayServiceControllerApi.md#upgradeLibrary) | **PUT** /upgrade-library/{taId} | Upgrade a library in the vm


## Documentation for Models

 - [AgentType](docs/AgentType.md)
 - [ApiError](docs/ApiError.md)
 - [ApiErrorDetails](docs/ApiErrorDetails.md)
 - [ApiErrorOps](docs/ApiErrorOps.md)
 - [CheckConnectivityRequest](docs/CheckConnectivityRequest.md)
 - [CheckConnectivityResponse](docs/CheckConnectivityResponse.md)
 - [Command](docs/Command.md)
 - [CommandStatus](docs/CommandStatus.md)
 - [CommandStatusResponse](docs/CommandStatusResponse.md)
 - [ConnectivityStatus](docs/ConnectivityStatus.md)
 - [CurlRequest](docs/CurlRequest.md)
 - [CurlResponse](docs/CurlResponse.md)
 - [DbService](docs/DbService.md)
 - [GetTessellAgentTokenResponse](docs/GetTessellAgentTokenResponse.md)
 - [InfraConfig](docs/InfraConfig.md)
 - [JWTCredentials](docs/JWTCredentials.md)
 - [LibraryUpgradeInfo](docs/LibraryUpgradeInfo.md)
 - [PublishTenantServicesUpgradeRequest](docs/PublishTenantServicesUpgradeRequest.md)
 - [RPCRequest](docs/RPCRequest.md)
 - [RPCResponse](docs/RPCResponse.md)
 - [ReadFileResponse](docs/ReadFileResponse.md)
 - [RegisterTenantAccountResponse](docs/RegisterTenantAccountResponse.md)
 - [RequestMethod](docs/RequestMethod.md)
 - [TessellErrorCode](docs/TessellErrorCode.md)
 - [UpgradeLibraryPayload](docs/UpgradeLibraryPayload.md)
 - [UpgradeParametersRequest](docs/UpgradeParametersRequest.md)
 - [UpgradeParametersResponse](docs/UpgradeParametersResponse.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

samir.das@tessell.com
