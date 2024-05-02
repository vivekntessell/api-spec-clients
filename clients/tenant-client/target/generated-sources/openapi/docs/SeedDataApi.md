# SeedDataApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSeedData**](SeedDataApi.md#createSeedData) | **POST** /tessell-ops/seed-data | Create a new version of the seed info.
[**getSeedData**](SeedDataApi.md#getSeedData) | **GET** /tessell-ops/seed-data | Return the seed info.
[**replicateSeedData**](SeedDataApi.md#replicateSeedData) | **POST** /tessell-internal/seed-data/replicate | Replicate seed data.
[**updateSeedData**](SeedDataApi.md#updateSeedData) | **PATCH** /tessell-ops/seed-data/{version} | Create a new version of the seed info.



## createSeedData

> SeedDataWrapper createSeedData(seedData)

Create a new version of the seed info.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SeedDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SeedDataApi apiInstance = new SeedDataApi(defaultClient);
        SeedData seedData = new SeedData(); // SeedData | Seed data request
        try {
            SeedDataWrapper result = apiInstance.createSeedData(seedData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeedDataApi#createSeedData");
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
 **seedData** | [**SeedData**](SeedData.md)| Seed data request |

### Return type

[**SeedDataWrapper**](SeedDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seed data |  -  |
| **0** | API error response |  -  |


## getSeedData

> SeedDataWrapper getSeedData(tenantId, version)

Return the seed info.

Return the seed info.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SeedDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SeedDataApi apiInstance = new SeedDataApi(defaultClient);
        UUID tenantId = new UUID(); // UUID | Filter for a specific tenant
        Integer version = 56; // Integer | Filter for a specific version
        try {
            SeedDataWrapper result = apiInstance.getSeedData(tenantId, version);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeedDataApi#getSeedData");
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
 **tenantId** | [**UUID**](.md)| Filter for a specific tenant | [optional]
 **version** | **Integer**| Filter for a specific version | [optional]

### Return type

[**SeedDataWrapper**](SeedDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seed data |  -  |
| **0** | API error response |  -  |


## replicateSeedData

> SeedDataWrapper replicateSeedData(seedDataWrapper)

Replicate seed data.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SeedDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SeedDataApi apiInstance = new SeedDataApi(defaultClient);
        SeedDataWrapper seedDataWrapper = new SeedDataWrapper(); // SeedDataWrapper | Seed data wrapper request
        try {
            SeedDataWrapper result = apiInstance.replicateSeedData(seedDataWrapper);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeedDataApi#replicateSeedData");
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
 **seedDataWrapper** | [**SeedDataWrapper**](SeedDataWrapper.md)| Seed data wrapper request |

### Return type

[**SeedDataWrapper**](SeedDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seed data |  -  |
| **0** | API error response |  -  |


## updateSeedData

> SeedDataWrapper updateSeedData(version, seedData)

Create a new version of the seed info.

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.SeedDataApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        SeedDataApi apiInstance = new SeedDataApi(defaultClient);
        Integer version = 56; // Integer | Seed data version
        SeedData seedData = new SeedData(); // SeedData | Seed data request
        try {
            SeedDataWrapper result = apiInstance.updateSeedData(version, seedData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeedDataApi#updateSeedData");
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
 **version** | **Integer**| Seed data version |
 **seedData** | [**SeedData**](SeedData.md)| Seed data request |

### Return type

[**SeedDataWrapper**](SeedDataWrapper.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Seed data |  -  |
| **0** | API error response |  -  |

