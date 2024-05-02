# openapi-java-client

REST API Documentation

- API version: 1.0

- Build date: 2024-05-02T15:56:57.635527+05:30[Asia/Kolkata]

REST API Documentation

  For more information, please visit [https://www.tessell.com](https://www.tessell.com)

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

import com.tessell.integrations.client.invoker.*;
import com.tessell.integrations.client.invoker.auth.*;
import com.tessell.integrations.client.model.*;
import com.tessell.integrations.client.api.TessellIntegrationApi;

public class TessellIntegrationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8084");
        
        TessellIntegrationApi apiInstance = new TessellIntegrationApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        TessellTessellIntegrationDTODTO tessellTessellIntegrationDTODTO = new TessellTessellIntegrationDTODTO(); // TessellTessellIntegrationDTODTO | 
        try {
            TessellTessellIntegrationDTODTO result = apiInstance.createIntegration(tenantId, tessellTessellIntegrationDTODTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellIntegrationApi#createIntegration");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8084*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*TessellIntegrationApi* | [**createIntegration**](docs/TessellIntegrationApi.md#createIntegration) | **POST** /integrations/governance | Create a new Integration
*TessellIntegrationApi* | [**createIntegrationAcls**](docs/TessellIntegrationApi.md#createIntegrationAcls) | **PATCH** /integrations/governance/{id}/acls | Create/Update ACLs of an Integration
*TessellIntegrationApi* | [**deleteIntegration**](docs/TessellIntegrationApi.md#deleteIntegration) | **DELETE** /integrations/governance/{id} | Delete an Integration
*TessellIntegrationApi* | [**getEligibleUsersForIntegration**](docs/TessellIntegrationApi.md#getEligibleUsersForIntegration) | **GET** /integrations/governance/{id}/acls/eligible-users | Get a list of all users along with role they are eligible on an Integration
*TessellIntegrationApi* | [**getIntegrationById**](docs/TessellIntegrationApi.md#getIntegrationById) | **GET** /integrations/governance/{id} | Get active Integration Details by Id
*TessellIntegrationApi* | [**getIntegrationByIdConsumerView**](docs/TessellIntegrationApi.md#getIntegrationByIdConsumerView) | **GET** /integrations/{id} | Get active Integration by Id (consumer view)
*TessellIntegrationApi* | [**getIntegrationByIdOps**](docs/TessellIntegrationApi.md#getIntegrationByIdOps) | **GET** /tessell-ops/integrations/{id} | Get Integration by ID
*TessellIntegrationApi* | [**getIntegrationTypeById**](docs/TessellIntegrationApi.md#getIntegrationTypeById) | **GET** /integration-types/{id} | Get Integration Type by Id
*TessellIntegrationApi* | [**getIntegrationTypes**](docs/TessellIntegrationApi.md#getIntegrationTypes) | **GET** /integration-types | Get a list of supported Integration Types
*TessellIntegrationApi* | [**getIntegrations**](docs/TessellIntegrationApi.md#getIntegrations) | **GET** /integrations/governance | Get a list of active Integrations
*TessellIntegrationApi* | [**getIntegrationsConsumerView**](docs/TessellIntegrationApi.md#getIntegrationsConsumerView) | **GET** /integrations | Get a list of active Integrations (consumer view)
*TessellIntegrationApi* | [**revokeIntegrationAcls**](docs/TessellIntegrationApi.md#revokeIntegrationAcls) | **DELETE** /integrations/governance/{id}/acls | Revoke access of given users on an Integration
*TessellIntegrationApi* | [**updateIntegration**](docs/TessellIntegrationApi.md#updateIntegration) | **PATCH** /integrations/governance/{id}/{action} | Update an Integration


## Documentation for Models

 - [TessellAclEligibleUserDTO](docs/TessellAclEligibleUserDTO.md)
 - [TessellAclPayloadDTO](docs/TessellAclPayloadDTO.md)
 - [TessellAclRevokePayloadDTO](docs/TessellAclRevokePayloadDTO.md)
 - [TessellAclUserPayloadDTO](docs/TessellAclUserPayloadDTO.md)
 - [TessellApiErrorDTO](docs/TessellApiErrorDTO.md)
 - [TessellApiErrorDetailsDTO](docs/TessellApiErrorDetailsDTO.md)
 - [TessellApiErrorOpsDTO](docs/TessellApiErrorOpsDTO.md)
 - [TessellApiMetadataDTO](docs/TessellApiMetadataDTO.md)
 - [TessellApiPaginationInfoDTO](docs/TessellApiPaginationInfoDTO.md)
 - [TessellApiResponseDTO](docs/TessellApiResponseDTO.md)
 - [TessellApiStatusDTO](docs/TessellApiStatusDTO.md)
 - [TessellDatabaseEngineTypeDTO](docs/TessellDatabaseEngineTypeDTO.md)
 - [TessellEntityAclSharingInfoDTO](docs/TessellEntityAclSharingInfoDTO.md)
 - [TessellEntityUserAclSharingInfoDTO](docs/TessellEntityUserAclSharingInfoDTO.md)
 - [TessellIntegrationTypeMetadataDTO](docs/TessellIntegrationTypeMetadataDTO.md)
 - [TessellIntegrationTypeMetadataSupportedEngineTypesDTO](docs/TessellIntegrationTypeMetadataSupportedEngineTypesDTO.md)
 - [TessellTessellErrorCodeDTO](docs/TessellTessellErrorCodeDTO.md)
 - [TessellTessellIntegrationCloudwatchMetricsDTO](docs/TessellTessellIntegrationCloudwatchMetricsDTO.md)
 - [TessellTessellIntegrationDTODTO](docs/TessellTessellIntegrationDTODTO.md)
 - [TessellTessellIntegrationDatadogDTO](docs/TessellTessellIntegrationDatadogDTO.md)
 - [TessellTessellIntegrationListResponseDTO](docs/TessellTessellIntegrationListResponseDTO.md)
 - [TessellTessellIntegrationMaturityStatusDTO](docs/TessellTessellIntegrationMaturityStatusDTO.md)
 - [TessellTessellIntegrationMetadataDTO](docs/TessellTessellIntegrationMetadataDTO.md)
 - [TessellTessellIntegrationNewRelicDTO](docs/TessellTessellIntegrationNewRelicDTO.md)
 - [TessellTessellIntegrationOEMDTO](docs/TessellTessellIntegrationOEMDTO.md)
 - [TessellTessellIntegrationQualysDTO](docs/TessellTessellIntegrationQualysDTO.md)
 - [TessellTessellIntegrationSplunkDTO](docs/TessellTessellIntegrationSplunkDTO.md)
 - [TessellTessellIntegrationSplunkServerTypeDTO](docs/TessellTessellIntegrationSplunkServerTypeDTO.md)
 - [TessellTessellIntegrationStatusDTO](docs/TessellTessellIntegrationStatusDTO.md)
 - [TessellTessellIntegrationSumologicDTO](docs/TessellTessellIntegrationSumologicDTO.md)
 - [TessellTessellIntegrationTypeDTO](docs/TessellTessellIntegrationTypeDTO.md)
 - [TessellTessellIntegrationTypeDTODTO](docs/TessellTessellIntegrationTypeDTODTO.md)
 - [TessellTessellIntegrationTypeListResponseDTO](docs/TessellTessellIntegrationTypeListResponseDTO.md)
 - [TessellTessellIntegrationTypeMaturityStatusDTO](docs/TessellTessellIntegrationTypeMaturityStatusDTO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@tessell.com
