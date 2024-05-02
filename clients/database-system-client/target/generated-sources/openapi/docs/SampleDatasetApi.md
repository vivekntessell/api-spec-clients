# SampleDatasetApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSampleDatasetOps**](SampleDatasetApi.md#createSampleDatasetOps) | **POST** /tessell-ops/services/sample-datasets | Create supported sample datasets.
[**deleteSampleDatasetOps**](SampleDatasetApi.md#deleteSampleDatasetOps) | **DELETE** /tessell-ops/services/sample-datasets/{sample-dataset-id} | Delete sample dataset for given sample dataset id.
[**getSampleDatasetOps**](SampleDatasetApi.md#getSampleDatasetOps) | **GET** /tessell-ops/services/sample-datasets/{sample-dataset-id} | Get sample dataset for given id.
[**getSampleDatasetsOps**](SampleDatasetApi.md#getSampleDatasetsOps) | **GET** /tessell-ops/services/sample-datasets | Get list of all sample datasets supported.
[**updateSampleDatasetOps**](SampleDatasetApi.md#updateSampleDatasetOps) | **PATCH** /tessell-ops/services/sample-datasets/{sample-dataset-id} | Update sample dataset for given sample dataset id.



## createSampleDatasetOps

> SampleDatasetOpsDTO createSampleDatasetOps(createSampleDatasetPayload)

Create supported sample datasets.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetApi apiInstance = new SampleDatasetApi(defaultClient);
        CreateSampleDatasetPayload createSampleDatasetPayload = new CreateSampleDatasetPayload(); // CreateSampleDatasetPayload | 
        try {
            SampleDatasetOpsDTO result = apiInstance.createSampleDatasetOps(createSampleDatasetPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetApi#createSampleDatasetOps");
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
 **createSampleDatasetPayload** | [**CreateSampleDatasetPayload**](CreateSampleDatasetPayload.md)|  |

### Return type

[**SampleDatasetOpsDTO**](SampleDatasetOpsDTO.md)

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


## deleteSampleDatasetOps

> ApiStatus deleteSampleDatasetOps(sampleDatasetId)

Delete sample dataset for given sample dataset id.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetApi apiInstance = new SampleDatasetApi(defaultClient);
        UUID sampleDatasetId = new UUID(); // UUID | Id of the dataset
        try {
            ApiStatus result = apiInstance.deleteSampleDatasetOps(sampleDatasetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetApi#deleteSampleDatasetOps");
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
 **sampleDatasetId** | [**UUID**](.md)| Id of the dataset |

### Return type

[**ApiStatus**](ApiStatus.md)

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


## getSampleDatasetOps

> SampleDatasetsOpsResponse getSampleDatasetOps(sampleDatasetId)

Get sample dataset for given id.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetApi apiInstance = new SampleDatasetApi(defaultClient);
        UUID sampleDatasetId = new UUID(); // UUID | Id of the dataset
        try {
            SampleDatasetsOpsResponse result = apiInstance.getSampleDatasetOps(sampleDatasetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetApi#getSampleDatasetOps");
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
 **sampleDatasetId** | [**UUID**](.md)| Id of the dataset |

### Return type

[**SampleDatasetsOpsResponse**](SampleDatasetsOpsResponse.md)

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


## getSampleDatasetsOps

> SampleDatasetsOpsResponse getSampleDatasetsOps(statusList, name)

Get list of all sample datasets supported.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetApi apiInstance = new SampleDatasetApi(defaultClient);
        List<SampleDatasetOpsStatus> statusList = Arrays.asList(); // List<SampleDatasetOpsStatus> | Status of the dataset to be returned.
        String name = "name_example"; // String | Name of the dataset
        try {
            SampleDatasetsOpsResponse result = apiInstance.getSampleDatasetsOps(statusList, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetApi#getSampleDatasetsOps");
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
 **statusList** | [**List&lt;SampleDatasetOpsStatus&gt;**](SampleDatasetOpsStatus.md)| Status of the dataset to be returned. | [optional]
 **name** | **String**| Name of the dataset | [optional]

### Return type

[**SampleDatasetsOpsResponse**](SampleDatasetsOpsResponse.md)

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


## updateSampleDatasetOps

> SampleDatasetOpsDTO updateSampleDatasetOps(sampleDatasetId, sampleDatasetOpsDTO)

Update sample dataset for given sample dataset id.

### Example

```java
// Import classes:
import com.tessell.database.system.client.invoker.ApiClient;
import com.tessell.database.system.client.invoker.ApiException;
import com.tessell.database.system.client.invoker.Configuration;
import com.tessell.database.system.client.invoker.models.*;
import com.tessell.database.system.client.api.SampleDatasetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SampleDatasetApi apiInstance = new SampleDatasetApi(defaultClient);
        UUID sampleDatasetId = new UUID(); // UUID | Id of the dataset
        SampleDatasetOpsDTO sampleDatasetOpsDTO = new SampleDatasetOpsDTO(); // SampleDatasetOpsDTO | 
        try {
            SampleDatasetOpsDTO result = apiInstance.updateSampleDatasetOps(sampleDatasetId, sampleDatasetOpsDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SampleDatasetApi#updateSampleDatasetOps");
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
 **sampleDatasetId** | [**UUID**](.md)| Id of the dataset |
 **sampleDatasetOpsDTO** | [**SampleDatasetOpsDTO**](SampleDatasetOpsDTO.md)|  |

### Return type

[**SampleDatasetOpsDTO**](SampleDatasetOpsDTO.md)

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

