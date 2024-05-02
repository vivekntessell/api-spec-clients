# SampleDatasetLoadingApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSampleDatasetLoadingInfo**](SampleDatasetLoadingApi.md#getSampleDatasetLoadingInfo) | **GET** /services/{serviceId}/sample-datasets | Get details about existing sample datasets being/already loaded in the given DB Service
[**getSampleDatasetSuggestions**](SampleDatasetLoadingApi.md#getSampleDatasetSuggestions) | **GET** /services/{serviceId}/sample-datasets/suggestions | Returns details about sample datasets that can be loaded in the given DB Service
[**loadSampleDatasetRequest**](SampleDatasetLoadingApi.md#loadSampleDatasetRequest) | **POST** /services/{serviceId}/sample-datasets | Submits a request to load sample-dataset in given DB Service.
[**updateSampleDatasetSuggestion**](SampleDatasetLoadingApi.md#updateSampleDatasetSuggestion) | **PATCH** /services/{serviceId}/sample-datasets/manage-suggestions | Controls if the sample data loading suggestions should be shown for the given DB Service
[**updateServiceSampleDatasetInfoOps**](SampleDatasetLoadingApi.md#updateServiceSampleDatasetInfoOps) | **PATCH** /tessell-ops/services/{serviceId}/sample-datasets | Update sample-dataset metadata for given service.



## getSampleDatasetLoadingInfo

> ServiceSampleDatasetInfoResponse getSampleDatasetLoadingInfo(serviceId)

Get details about existing sample datasets being/already loaded in the given DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetLoadingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetLoadingApi apiInstance = new SampleDatasetLoadingApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        try {
            ServiceSampleDatasetInfoResponse result = apiInstance.getSampleDatasetLoadingInfo(serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetLoadingApi#getSampleDatasetLoadingInfo");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**ServiceSampleDatasetInfoResponse**](ServiceSampleDatasetInfoResponse.md)

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


## getSampleDatasetSuggestions

> SampleDatasetSuggestionsResponse getSampleDatasetSuggestions(serviceId)

Returns details about sample datasets that can be loaded in the given DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetLoadingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetLoadingApi apiInstance = new SampleDatasetLoadingApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        try {
            SampleDatasetSuggestionsResponse result = apiInstance.getSampleDatasetSuggestions(serviceId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetLoadingApi#getSampleDatasetSuggestions");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |

### Return type

[**SampleDatasetSuggestionsResponse**](SampleDatasetSuggestionsResponse.md)

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


## loadSampleDatasetRequest

> ApiStatus loadSampleDatasetRequest(serviceId, loadSampleDatasetRequestPayload)

Submits a request to load sample-dataset in given DB Service.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetLoadingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetLoadingApi apiInstance = new SampleDatasetLoadingApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        LoadSampleDatasetRequestPayload loadSampleDatasetRequestPayload = new LoadSampleDatasetRequestPayload(); // LoadSampleDatasetRequestPayload | 
        try {
            ApiStatus result = apiInstance.loadSampleDatasetRequest(serviceId, loadSampleDatasetRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetLoadingApi#loadSampleDatasetRequest");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **loadSampleDatasetRequestPayload** | [**LoadSampleDatasetRequestPayload**](LoadSampleDatasetRequestPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## updateSampleDatasetSuggestion

> ApiStatus updateSampleDatasetSuggestion(serviceId, manageLoadSampleDatasetSuggestionPayload)

Controls if the sample data loading suggestions should be shown for the given DB Service

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetLoadingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetLoadingApi apiInstance = new SampleDatasetLoadingApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        ManageLoadSampleDatasetSuggestionPayload manageLoadSampleDatasetSuggestionPayload = new ManageLoadSampleDatasetSuggestionPayload(); // ManageLoadSampleDatasetSuggestionPayload | 
        try {
            ApiStatus result = apiInstance.updateSampleDatasetSuggestion(serviceId, manageLoadSampleDatasetSuggestionPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetLoadingApi#updateSampleDatasetSuggestion");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **manageLoadSampleDatasetSuggestionPayload** | [**ManageLoadSampleDatasetSuggestionPayload**](ManageLoadSampleDatasetSuggestionPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |


## updateServiceSampleDatasetInfoOps

> ApiStatus updateServiceSampleDatasetInfoOps(serviceId, updateServiceSampleDatasetInfoPayload)

Update sample-dataset metadata for given service.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetLoadingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetLoadingApi apiInstance = new SampleDatasetLoadingApi(defaultClient);
        UUID serviceId = new UUID(); // UUID | The ID of the DB Service
        UpdateServiceSampleDatasetInfoPayload updateServiceSampleDatasetInfoPayload = new UpdateServiceSampleDatasetInfoPayload(); // UpdateServiceSampleDatasetInfoPayload | 
        try {
            ApiStatus result = apiInstance.updateServiceSampleDatasetInfoOps(serviceId, updateServiceSampleDatasetInfoPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetLoadingApi#updateServiceSampleDatasetInfoOps");
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
 **serviceId** | [**UUID**](.md)| The ID of the DB Service |
 **updateServiceSampleDatasetInfoPayload** | [**UpdateServiceSampleDatasetInfoPayload**](UpdateServiceSampleDatasetInfoPayload.md)|  |

### Return type

[**ApiStatus**](ApiStatus.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | API error response |  -  |

