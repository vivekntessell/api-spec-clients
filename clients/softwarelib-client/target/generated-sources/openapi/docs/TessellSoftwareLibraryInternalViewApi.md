# TessellSoftwareLibraryInternalViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllSoftwareImagesInternalView**](TessellSoftwareLibraryInternalViewApi.md#getAllSoftwareImagesInternalView) | **GET** /tessell-internal/software-library/images | Get all Software Images including image ids.
[**getSoftwareImageByIdInternalView**](TessellSoftwareLibraryInternalViewApi.md#getSoftwareImageByIdInternalView) | **GET** /tessell-internal/software-library/image/id/{id} | Get Details of Software Image identified by identifier.
[**getSoftwareImageByNameInternalView**](TessellSoftwareLibraryInternalViewApi.md#getSoftwareImageByNameInternalView) | **GET** /tessell-internal/software-library/image/{name} | Returns a software images.
[**getSoftwareImageVersionByIdInternalView**](TessellSoftwareLibraryInternalViewApi.md#getSoftwareImageVersionByIdInternalView) | **GET** /tessell-internal/software-library/version/{id} | Get Details of Software Image Version identified by identifier.



## getAllSoftwareImagesInternalView

> TessellGetAllSoftwareImagesInternalViewDTO getAllSoftwareImagesInternalView(cloudType, timeZone)

Get all Software Images including image ids.

Get all Software Images including image ids.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryInternalViewApi apiInstance = new TessellSoftwareLibraryInternalViewApi(defaultClient);
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetAllSoftwareImagesInternalViewDTO result = apiInstance.getAllSoftwareImagesInternalView(cloudType, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryInternalViewApi#getAllSoftwareImagesInternalView");
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
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetAllSoftwareImagesInternalViewDTO**](TessellGetAllSoftwareImagesInternalViewDTO.md)

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


## getSoftwareImageByIdInternalView

> TessellGetSoftwareImageByIdInternalViewResponseDTO getSoftwareImageByIdInternalView(id, versionName, version, cloudAndAvailability, timeZone)

Get Details of Software Image identified by identifier.

Get Details of Software Image identified by identifier.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryInternalViewApi apiInstance = new TessellSoftwareLibraryInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | 
        String versionName = "versionName_example"; // String | 
        String version = "version_example"; // String | 
        String cloudAndAvailability = "cloudAndAvailability_example"; // String | 
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetSoftwareImageByIdInternalViewResponseDTO result = apiInstance.getSoftwareImageByIdInternalView(id, versionName, version, cloudAndAvailability, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryInternalViewApi#getSoftwareImageByIdInternalView");
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
 **id** | [**UUID**](.md)|  |
 **versionName** | **String**|  | [optional]
 **version** | **String**|  | [optional]
 **cloudAndAvailability** | **String**|  | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetSoftwareImageByIdInternalViewResponseDTO**](TessellGetSoftwareImageByIdInternalViewResponseDTO.md)

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


## getSoftwareImageByNameInternalView

> TessellGetSoftwareImageByNameInternalViewResponseDTO getSoftwareImageByNameInternalView(name, cloudType, dbVersionName, region, availabilityZone, timeZone)

Returns a software images.

Returns a software images.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryInternalViewApi apiInstance = new TessellSoftwareLibraryInternalViewApi(defaultClient);
        String name = "{\"name\":\"postgresql-12\"}"; // String | Name of the software image
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String dbVersionName = "{\"name\":\"PostgreSQL 13.3 (AWS)\"}"; // String | DB version name
        String region = "us-east-1"; // String | Cloud Region
        String availabilityZone = "{\"availabilityZone\":\"us-east-1c\"}"; // String | Availability Zone
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetSoftwareImageByNameInternalViewResponseDTO result = apiInstance.getSoftwareImageByNameInternalView(name, cloudType, dbVersionName, region, availabilityZone, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryInternalViewApi#getSoftwareImageByNameInternalView");
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
 **name** | **String**| Name of the software image |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [enum: AWS, AZURE, GCP]
 **dbVersionName** | **String**| DB version name | [optional]
 **region** | **String**| Cloud Region | [optional]
 **availabilityZone** | **String**| Availability Zone | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetSoftwareImageByNameInternalViewResponseDTO**](TessellGetSoftwareImageByNameInternalViewResponseDTO.md)

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


## getSoftwareImageVersionByIdInternalView

> TessellSoftwareImageVersionEntityDTO getSoftwareImageVersionByIdInternalView(id)

Get Details of Software Image Version identified by identifier.

Get Details of Software Image Version identified by identifier.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryInternalViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryInternalViewApi apiInstance = new TessellSoftwareLibraryInternalViewApi(defaultClient);
        UUID id = new UUID(); // UUID | 
        try {
            TessellSoftwareImageVersionEntityDTO result = apiInstance.getSoftwareImageVersionByIdInternalView(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryInternalViewApi#getSoftwareImageVersionByIdInternalView");
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
 **id** | [**UUID**](.md)|  |

### Return type

[**TessellSoftwareImageVersionEntityDTO**](TessellSoftwareImageVersionEntityDTO.md)

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

