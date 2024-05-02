# BenchmarkControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBenchmark**](BenchmarkControllerApi.md#createBenchmark) | **POST** /benchmarks | Create new benchmark request
[**getBenchmarkById**](BenchmarkControllerApi.md#getBenchmarkById) | **GET** /benchmarks/{id} | Fetch benchmark by id
[**getBenchmarkCatalog**](BenchmarkControllerApi.md#getBenchmarkCatalog) | **GET** /benchmark-catalog | Fetch list of supported benchmarks (catalog)
[**getBenchmarkCatalogEntryById**](BenchmarkControllerApi.md#getBenchmarkCatalogEntryById) | **GET** /benchmarks-catalog/{id} | Fetch benchmark catalog entry by id
[**getBenchmarks**](BenchmarkControllerApi.md#getBenchmarks) | **GET** /benchmarks | Fetch list of current benchmarks
[**updateBenchmarkById**](BenchmarkControllerApi.md#updateBenchmarkById) | **PATCH** /tessell-ops/benchmarks/{id} | Update benchmark by id



## createBenchmark

> TessellBenchmarkDTO createBenchmark(tessellBenchmarkDTO)

Create new benchmark request

Create new benchmark request

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        TessellBenchmarkDTO tessellBenchmarkDTO = new TessellBenchmarkDTO(); // TessellBenchmarkDTO | Create benchmark
        try {
            TessellBenchmarkDTO result = apiInstance.createBenchmark(tessellBenchmarkDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#createBenchmark");
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
 **tessellBenchmarkDTO** | [**TessellBenchmarkDTO**](TessellBenchmarkDTO.md)| Create benchmark |

### Return type

[**TessellBenchmarkDTO**](TessellBenchmarkDTO.md)

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


## getBenchmarkById

> TessellBenchmarkDTO getBenchmarkById(id)

Fetch benchmark by id

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | ID
        try {
            TessellBenchmarkDTO result = apiInstance.getBenchmarkById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#getBenchmarkById");
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
 **id** | [**UUID**](.md)| ID |

### Return type

[**TessellBenchmarkDTO**](TessellBenchmarkDTO.md)

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


## getBenchmarkCatalog

> List&lt;TessellBenchmarkCatalogDTO&gt; getBenchmarkCatalog(tenantId, engineType, pageOffset, pageSize)

Fetch list of supported benchmarks (catalog)

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String engineType = "engineType_example"; // String | Engine type for the benchmark
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            List<TessellBenchmarkCatalogDTO> result = apiInstance.getBenchmarkCatalog(tenantId, engineType, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#getBenchmarkCatalog");
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
 **tenantId** | **String**| tenant-id |
 **engineType** | **String**| Engine type for the benchmark | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**List&lt;TessellBenchmarkCatalogDTO&gt;**](TessellBenchmarkCatalogDTO.md)

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


## getBenchmarkCatalogEntryById

> TessellBenchmarkCatalogDTO getBenchmarkCatalogEntryById(id)

Fetch benchmark catalog entry by id

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | ID
        try {
            TessellBenchmarkCatalogDTO result = apiInstance.getBenchmarkCatalogEntryById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#getBenchmarkCatalogEntryById");
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
 **id** | [**UUID**](.md)| ID |

### Return type

[**TessellBenchmarkCatalogDTO**](TessellBenchmarkCatalogDTO.md)

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


## getBenchmarks

> List&lt;TessellBenchmarkDTO&gt; getBenchmarks(tenantId, id, service, username, status, timeRangeStart, timeRangeEnd, pageOffset, pageSize)

Fetch list of current benchmarks

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | Benchmark id
        UUID service = new UUID(); // UUID | Service id
        String username = "username_example"; // String | Username of the benchmark submitter
        String status = "status_example"; // String | status
        String timeRangeStart = "timeRangeStart_example"; // String | Start time of time range to compare against benchmark update timestamp
        String timeRangeEnd = "timeRangeEnd_example"; // String | End time of time range to compare against benchmark update timestamp
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            List<TessellBenchmarkDTO> result = apiInstance.getBenchmarks(tenantId, id, service, username, status, timeRangeStart, timeRangeEnd, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#getBenchmarks");
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
 **tenantId** | **String**| tenant-id |
 **id** | [**UUID**](.md)| Benchmark id | [optional]
 **service** | [**UUID**](.md)| Service id | [optional]
 **username** | **String**| Username of the benchmark submitter | [optional]
 **status** | **String**| status | [optional]
 **timeRangeStart** | **String**| Start time of time range to compare against benchmark update timestamp | [optional]
 **timeRangeEnd** | **String**| End time of time range to compare against benchmark update timestamp | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**List&lt;TessellBenchmarkDTO&gt;**](TessellBenchmarkDTO.md)

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


## updateBenchmarkById

> TessellBenchmarkDTO updateBenchmarkById(id, tessellBenchmarkDTO)

Update benchmark by id

### Example

```java
// Import classes:
import com.tessell.benchmark.client.invoker.ApiClient;
import com.tessell.benchmark.client.invoker.ApiException;
import com.tessell.benchmark.client.invoker.Configuration;
import com.tessell.benchmark.client.invoker.models.*;
import com.tessell.benchmark.client.api.BenchmarkControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        BenchmarkControllerApi apiInstance = new BenchmarkControllerApi(defaultClient);
        UUID id = new UUID(); // UUID | ID
        TessellBenchmarkDTO tessellBenchmarkDTO = new TessellBenchmarkDTO(); // TessellBenchmarkDTO | Update benchmark
        try {
            TessellBenchmarkDTO result = apiInstance.updateBenchmarkById(id, tessellBenchmarkDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BenchmarkControllerApi#updateBenchmarkById");
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
 **id** | [**UUID**](.md)| ID |
 **tessellBenchmarkDTO** | [**TessellBenchmarkDTO**](TessellBenchmarkDTO.md)| Update benchmark |

### Return type

[**TessellBenchmarkDTO**](TessellBenchmarkDTO.md)

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

