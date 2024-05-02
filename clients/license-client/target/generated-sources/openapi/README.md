# openapi-java-client

Tessell License Manager API Documentation

- API version: 1.0

- Build date: 2024-05-02T15:56:59.688756+05:30[Asia/Kolkata]

Tessell License Manager API Documentation

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

import com.tessell.license.client.invoker.*;
import com.tessell.license.client.invoker.auth.*;
import com.tessell.license.client.model.*;
import com.tessell.license.client.api.TessellLicenseManagerServiceApi;

public class TessellLicenseManagerServiceApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");
        
        TessellLicenseManagerServiceApi apiInstance = new TessellLicenseManagerServiceApi(defaultClient);
        String tenantId = "12345678-abcd-1234-abcd-1234abcd5678"; // String | Id of the Tenant
        String timeZone = "timeZone_example"; // String | Time Zone
        TessellAcquireLicenseRequestDTO tessellAcquireLicenseRequestDTO = new TessellAcquireLicenseRequestDTO(); // TessellAcquireLicenseRequestDTO | 
        try {
            TessellAcquireLicenseResponseDTO result = apiInstance.acquireLicense(tenantId, timeZone, tessellAcquireLicenseRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellLicenseManagerServiceApi#acquireLicense");
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
*TessellLicenseManagerServiceApi* | [**acquireLicense**](docs/TessellLicenseManagerServiceApi.md#acquireLicense) | **POST** /tessell-internal/license-manager/licenses/acquire | Acquire a license from a license directory.
*TessellLicenseManagerServiceApi* | [**checkLicenseAvailability**](docs/TessellLicenseManagerServiceApi.md#checkLicenseAvailability) | **GET** /tessell-internal/license-manager/licenses/availability | Checks if the licenses are available for Acquiring
*TessellLicenseManagerServiceApi* | [**checkLicenseRequirement**](docs/TessellLicenseManagerServiceApi.md#checkLicenseRequirement) | **GET** /tessell-internal/license-manager/licenses/requirement-checks | Checks if the licensing functionality is available for the account
*TessellLicenseManagerServiceApi* | [**deleteLicenseFromDirectory**](docs/TessellLicenseManagerServiceApi.md#deleteLicenseFromDirectory) | **DELETE** /license-manager/governance/licenses/{licenseId} | Deletes an existing license from directory.
*TessellLicenseManagerServiceApi* | [**getLicenseFromDirectoryByIdInternal**](docs/TessellLicenseManagerServiceApi.md#getLicenseFromDirectoryByIdInternal) | **GET** /tessell-internal/license-manager/licenses/{licenseId} | Returns license by Id.
*TessellLicenseManagerServiceApi* | [**getLicensesFromDirectory**](docs/TessellLicenseManagerServiceApi.md#getLicensesFromDirectory) | **GET** /license-manager/governance/licenses | Returns a list detail of licenses from directory.
*TessellLicenseManagerServiceApi* | [**getLicensesFromDirectoryInternal**](docs/TessellLicenseManagerServiceApi.md#getLicensesFromDirectoryInternal) | **GET** /tessell-internal/license-manager/licenses | Returns detail of license directory.
*TessellLicenseManagerServiceApi* | [**registerLicenseToDirectory**](docs/TessellLicenseManagerServiceApi.md#registerLicenseToDirectory) | **POST** /license-manager/governance/licenses | Register license into license pool
*TessellLicenseManagerServiceApi* | [**releaseLicense**](docs/TessellLicenseManagerServiceApi.md#releaseLicense) | **POST** /tessell-internal/license-manager/licenses/release | Release a previously acquired license from a license directory.


## Documentation for Models

 - [TessellAcquireLicenseRequestDTO](docs/TessellAcquireLicenseRequestDTO.md)
 - [TessellAcquireLicenseResponseDTO](docs/TessellAcquireLicenseResponseDTO.md)
 - [TessellAcquireLicenseSubResponseDTO](docs/TessellAcquireLicenseSubResponseDTO.md)
 - [TessellApiErrorDTO](docs/TessellApiErrorDTO.md)
 - [TessellApiErrorDetailsDTO](docs/TessellApiErrorDetailsDTO.md)
 - [TessellApiErrorOpsDTO](docs/TessellApiErrorOpsDTO.md)
 - [TessellApiMetadataDTO](docs/TessellApiMetadataDTO.md)
 - [TessellApiPaginationInfoDTO](docs/TessellApiPaginationInfoDTO.md)
 - [TessellDeleteLicenseResponseDTO](docs/TessellDeleteLicenseResponseDTO.md)
 - [TessellLicenseAuditResponseDTO](docs/TessellLicenseAuditResponseDTO.md)
 - [TessellLicenseAvailabilityResponseDTO](docs/TessellLicenseAvailabilityResponseDTO.md)
 - [TessellLicenseCategoryDTO](docs/TessellLicenseCategoryDTO.md)
 - [TessellLicenseDirectoriesResponseDTO](docs/TessellLicenseDirectoriesResponseDTO.md)
 - [TessellLicenseDirectoryEntityDTO](docs/TessellLicenseDirectoryEntityDTO.md)
 - [TessellLicenseDirectoryResponseDTO](docs/TessellLicenseDirectoryResponseDTO.md)
 - [TessellLicenseRecordOperationTypeDTO](docs/TessellLicenseRecordOperationTypeDTO.md)
 - [TessellLicenseRegisterResponseDTO](docs/TessellLicenseRegisterResponseDTO.md)
 - [TessellLicenseReleaseObjectDTO](docs/TessellLicenseReleaseObjectDTO.md)
 - [TessellLicenseRequiredResponseDTO](docs/TessellLicenseRequiredResponseDTO.md)
 - [TessellLicenseStatusDTO](docs/TessellLicenseStatusDTO.md)
 - [TessellLicenseTypeDTO](docs/TessellLicenseTypeDTO.md)
 - [TessellLicenseUtilisationEntityDTO](docs/TessellLicenseUtilisationEntityDTO.md)
 - [TessellMaturityStatusDTO](docs/TessellMaturityStatusDTO.md)
 - [TessellMetadataItemDTO](docs/TessellMetadataItemDTO.md)
 - [TessellRegisterLicenseToDirectoryRequestDTO](docs/TessellRegisterLicenseToDirectoryRequestDTO.md)
 - [TessellReleaseLicenseRequestDTO](docs/TessellReleaseLicenseRequestDTO.md)
 - [TessellReleaseLicenseResponseDTO](docs/TessellReleaseLicenseResponseDTO.md)
 - [TessellTessellErrorCodeDTO](docs/TessellTessellErrorCodeDTO.md)
 - [TessellVendorDTO](docs/TessellVendorDTO.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@tessell.com
