# TessellSoftwareLibraryGovernanceServiceViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**disableSoftwareImages**](TessellSoftwareLibraryGovernanceServiceViewApi.md#disableSoftwareImages) | **PATCH** /software-library/governance/images/disable | Disable Software Images
[**enableSoftwareImages**](TessellSoftwareLibraryGovernanceServiceViewApi.md#enableSoftwareImages) | **PATCH** /software-library/governance/images/enable | Enable Software Images
[**getAllSoftwareImages**](TessellSoftwareLibraryGovernanceServiceViewApi.md#getAllSoftwareImages) | **GET** /software-library/governance/images | List Software Images (including disabled ones)
[**getPatchableImageVersions**](TessellSoftwareLibraryGovernanceServiceViewApi.md#getPatchableImageVersions) | **GET** /software-library/governance/images/patchable | Get Details of Patchable Software Image Version identified by ImageId and VersionId.
[**restrictAccessToSoftwareImages**](TessellSoftwareLibraryGovernanceServiceViewApi.md#restrictAccessToSoftwareImages) | **PATCH** /software-library/governance/images/restrict-access | Restrict Software Images access to set of Personas
[**restrictSoftwareImagesInRegions**](TessellSoftwareLibraryGovernanceServiceViewApi.md#restrictSoftwareImagesInRegions) | **PATCH** /software-library/governance/images/restrict-regions | Restrict Software Images to certain regions



## disableSoftwareImages

> TessellDisableSoftwareImagesResponseDTO disableSoftwareImages(tessellDisableSoftwareImagesRequestDTO, cloudType, timeZone)

Disable Software Images

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        TessellDisableSoftwareImagesRequestDTO tessellDisableSoftwareImagesRequestDTO = new TessellDisableSoftwareImagesRequestDTO(); // TessellDisableSoftwareImagesRequestDTO | Software Images to disable
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellDisableSoftwareImagesResponseDTO result = apiInstance.disableSoftwareImages(tessellDisableSoftwareImagesRequestDTO, cloudType, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#disableSoftwareImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tessellDisableSoftwareImagesRequestDTO** | [**TessellDisableSoftwareImagesRequestDTO**](TessellDisableSoftwareImagesRequestDTO.md)| Software Images to disable |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [optional] [enum: AWS, AZURE, GCP]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellDisableSoftwareImagesResponseDTO**](TessellDisableSoftwareImagesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## enableSoftwareImages

> TessellEnableSoftwareImagesResponseDTO enableSoftwareImages(tessellEnableSoftwareImagesRequestDTO, cloudType, timeZone)

Enable Software Images

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        TessellEnableSoftwareImagesRequestDTO tessellEnableSoftwareImagesRequestDTO = new TessellEnableSoftwareImagesRequestDTO(); // TessellEnableSoftwareImagesRequestDTO | Software Images to enable
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellEnableSoftwareImagesResponseDTO result = apiInstance.enableSoftwareImages(tessellEnableSoftwareImagesRequestDTO, cloudType, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#enableSoftwareImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tessellEnableSoftwareImagesRequestDTO** | [**TessellEnableSoftwareImagesRequestDTO**](TessellEnableSoftwareImagesRequestDTO.md)| Software Images to enable |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [optional] [enum: AWS, AZURE, GCP]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellEnableSoftwareImagesResponseDTO**](TessellEnableSoftwareImagesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## getAllSoftwareImages

> TessellGetAllSoftwareImagesResponseDTO getAllSoftwareImages(cloudType, region, timeZone)

List Software Images (including disabled ones)

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetAllSoftwareImagesResponseDTO result = apiInstance.getAllSoftwareImages(cloudType, region, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#getAllSoftwareImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [optional] [enum: AWS, AZURE, GCP]
 **region** | **String**| Cloud Region | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetAllSoftwareImagesResponseDTO**](TessellGetAllSoftwareImagesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Software Images |  -  |
| **0** | API error response |  -  |


## getPatchableImageVersions

> TessellGetPatchableImageVersionsResponseDTO getPatchableImageVersions(imageName, versionName)

Get Details of Patchable Software Image Version identified by ImageId and VersionId.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        String imageName = "PostgreSQL 12"; // String | Software Image name
        String versionName = "12"; // String | Software Image version
        try {
            TessellGetPatchableImageVersionsResponseDTO result = apiInstance.getPatchableImageVersions(imageName, versionName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#getPatchableImageVersions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **imageName** | **String**| Software Image name |
 **versionName** | **String**| Software Image version |

### Return type

[**TessellGetPatchableImageVersionsResponseDTO**](TessellGetPatchableImageVersionsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## restrictAccessToSoftwareImages

> TessellRestrictAccessToSoftwareImagesResponseDTO restrictAccessToSoftwareImages(tessellRestrictAccessToSoftwareImagesRequestDTO, timeZone)

Restrict Software Images access to set of Personas

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        TessellRestrictAccessToSoftwareImagesRequestDTO tessellRestrictAccessToSoftwareImagesRequestDTO = new TessellRestrictAccessToSoftwareImagesRequestDTO(); // TessellRestrictAccessToSoftwareImagesRequestDTO | 
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellRestrictAccessToSoftwareImagesResponseDTO result = apiInstance.restrictAccessToSoftwareImages(tessellRestrictAccessToSoftwareImagesRequestDTO, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#restrictAccessToSoftwareImages");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tessellRestrictAccessToSoftwareImagesRequestDTO** | [**TessellRestrictAccessToSoftwareImagesRequestDTO**](TessellRestrictAccessToSoftwareImagesRequestDTO.md)|  |
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellRestrictAccessToSoftwareImagesResponseDTO**](TessellRestrictAccessToSoftwareImagesResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |


## restrictSoftwareImagesInRegions

> TessellRestrictSoftwareImagesInRegionsResponseDTO restrictSoftwareImagesInRegions(tessellRestrictSoftwareImagesInRegionsRequestDTO, timeZone)

Restrict Software Images to certain regions

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryGovernanceServiceViewApi apiInstance = new TessellSoftwareLibraryGovernanceServiceViewApi(defaultClient);
        TessellRestrictSoftwareImagesInRegionsRequestDTO tessellRestrictSoftwareImagesInRegionsRequestDTO = new TessellRestrictSoftwareImagesInRegionsRequestDTO(); // TessellRestrictSoftwareImagesInRegionsRequestDTO | 
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellRestrictSoftwareImagesInRegionsResponseDTO result = apiInstance.restrictSoftwareImagesInRegions(tessellRestrictSoftwareImagesInRegionsRequestDTO, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryGovernanceServiceViewApi#restrictSoftwareImagesInRegions");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tessellRestrictSoftwareImagesInRegionsRequestDTO** | [**TessellRestrictSoftwareImagesInRegionsRequestDTO**](TessellRestrictSoftwareImagesInRegionsRequestDTO.md)|  |
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellRestrictSoftwareImagesInRegionsResponseDTO**](TessellRestrictSoftwareImagesInRegionsResponseDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **0** | API error response |  -  |

