# TessellSoftwareLibraryServiceViewApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSoftwareImageByName**](TessellSoftwareLibraryServiceViewApi.md#getSoftwareImageByName) | **GET** /software-library/image/{name} | Get Software Image by name
[**getSoftwareImages**](TessellSoftwareLibraryServiceViewApi.md#getSoftwareImages) | **GET** /software-library/images | Get a list of all software images. Using the name filter, a software image can be found using name.



## getSoftwareImageByName

> TessellGetSoftwareImageByNameResponseDTO getSoftwareImageByName(name, cloudType, softwareImageVersion, timeZone)

Get Software Image by name

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryServiceViewApi apiInstance = new TessellSoftwareLibraryServiceViewApi(defaultClient);
        String name = "PostgreSQL 12"; // String | Software Image name
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String softwareImageVersion = "12"; // String | 
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetSoftwareImageByNameResponseDTO result = apiInstance.getSoftwareImageByName(name, cloudType, softwareImageVersion, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryServiceViewApi#getSoftwareImageByName");
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
 **name** | **String**| Software Image name |
 **cloudType** | [**TessellCloudTypeDTO**](.md)| Name of the Cloud | [enum: AWS, AZURE, GCP]
 **softwareImageVersion** | **String**|  | [optional]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetSoftwareImageByNameResponseDTO**](TessellGetSoftwareImageByNameResponseDTO.md)

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


## getSoftwareImages

> TessellGetSoftwareImagesResponseDTO getSoftwareImages(cloudType, region, personas, name, allImages, timeZone)

Get a list of all software images. Using the name filter, a software image can be found using name.

Get a list of all software images.

### Example

```java
// Import classes:
import com.tessell.softwarelib.client.invoker.ApiClient;
import com.tessell.softwarelib.client.invoker.ApiException;
import com.tessell.softwarelib.client.invoker.Configuration;
import com.tessell.softwarelib.client.invoker.models.*;
import com.tessell.softwarelib.client.api.TessellSoftwareLibraryServiceViewApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        TessellSoftwareLibraryServiceViewApi apiInstance = new TessellSoftwareLibraryServiceViewApi(defaultClient);
        TessellCloudTypeDTO cloudType = TessellCloudTypeDTO.fromValue("AWS"); // TessellCloudTypeDTO | Name of the Cloud
        String region = "us-east-1"; // String | Cloud Region
        String personas = "{\"personas\":[\"CloudAdmin\",\"TessellAdmin\"]}"; // String | Personas list
        String name = "{\"name\":\"postgresql-rhel6\"}"; // String | Name of a Software Image
        Boolean allImages = false; // Boolean | Returns All Software Images
        String timeZone = "timeZone_example"; // String | Time Zone
        try {
            TessellGetSoftwareImagesResponseDTO result = apiInstance.getSoftwareImages(cloudType, region, personas, name, allImages, timeZone);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TessellSoftwareLibraryServiceViewApi#getSoftwareImages");
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
 **personas** | **String**| Personas list | [optional]
 **name** | **String**| Name of a Software Image | [optional]
 **allImages** | **Boolean**| Returns All Software Images | [optional] [default to false]
 **timeZone** | **String**| Time Zone | [optional]

### Return type

[**TessellGetSoftwareImagesResponseDTO**](TessellGetSoftwareImagesResponseDTO.md)

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

