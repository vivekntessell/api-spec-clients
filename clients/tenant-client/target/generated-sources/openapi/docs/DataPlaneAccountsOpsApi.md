# DataPlaneAccountsOpsApi

All URIs are relative to *http://localhost:8088*

Method | HTTP request | Description
------------- | ------------- | -------------
[**bulkDeleteDataPlaneAccounts**](DataPlaneAccountsOpsApi.md#bulkDeleteDataPlaneAccounts) | **DELETE** /tessell-ops/data-plane-accounts/bulk-delete | Bulk delete Data Plane Accounts
[**createDataPlaneAccountOps**](DataPlaneAccountsOpsApi.md#createDataPlaneAccountOps) | **POST** /tessell-ops/data-plane-accounts | Create a new Tessell Data Plane Account.
[**deleteDataPlaneAccountOps**](DataPlaneAccountsOpsApi.md#deleteDataPlaneAccountOps) | **DELETE** /tessell-ops/data-plane-accounts/{data-plane-account-id} | Delete an existing Tessell Data Plane Account.
[**getBulkDeleteDataPlaneAccountsStatus**](DataPlaneAccountsOpsApi.md#getBulkDeleteDataPlaneAccountsStatus) | **POST** /tessell-ops/data-plane-accounts/bulk-delete | Bulk delete data plane accounts status
[**registerDataPlaneAccountOps**](DataPlaneAccountsOpsApi.md#registerDataPlaneAccountOps) | **POST** /tessell-ops/data-plane-accounts/register | Register a Tessell Data Plane Account.
[**replicateDataPlaneAccountOps**](DataPlaneAccountsOpsApi.md#replicateDataPlaneAccountOps) | **POST** /tessell-ops/data-plane-accounts/{data-plane-account-id}/replicate | Replicates an existing Tessell Data Plane Account.
[**updateDataPlaneAccountOps**](DataPlaneAccountsOpsApi.md#updateDataPlaneAccountOps) | **POST** /tessell-ops/data-plane-accounts/{data-plane-account-id} | Updates an existing Tessell Data Plane Account.
[**updateTenantDataPlaneAccountAssociation**](DataPlaneAccountsOpsApi.md#updateTenantDataPlaneAccountAssociation) | **POST** /tessell-ops/data-plane-accounts/{data-plane-account-id}/tenant-associations | Updates tenant cloud account association



## bulkDeleteDataPlaneAccounts

> ResourceBulkDeleteResponseOps bulkDeleteDataPlaneAccounts(bulkDeleteDataPlaneAccountsPayload)

Bulk delete Data Plane Accounts

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        BulkDeleteDataPlaneAccountsPayload bulkDeleteDataPlaneAccountsPayload = new BulkDeleteDataPlaneAccountsPayload(); // BulkDeleteDataPlaneAccountsPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.bulkDeleteDataPlaneAccounts(bulkDeleteDataPlaneAccountsPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#bulkDeleteDataPlaneAccounts");
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
 **bulkDeleteDataPlaneAccountsPayload** | [**BulkDeleteDataPlaneAccountsPayload**](BulkDeleteDataPlaneAccountsPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## createDataPlaneAccountOps

> DataPlaneAccount createDataPlaneAccountOps(dataPlaneAccountRequestPayload)

Create a new Tessell Data Plane Account.

Create a new Tessell Data Plane Account

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload = new DataPlaneAccountRequestPayload(); // DataPlaneAccountRequestPayload | Data Plane Account Information
        try {
            DataPlaneAccount result = apiInstance.createDataPlaneAccountOps(dataPlaneAccountRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#createDataPlaneAccountOps");
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
 **dataPlaneAccountRequestPayload** | [**DataPlaneAccountRequestPayload**](DataPlaneAccountRequestPayload.md)| Data Plane Account Information |

### Return type

[**DataPlaneAccount**](DataPlaneAccount.md)

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


## deleteDataPlaneAccountOps

> ApiStatus deleteDataPlaneAccountOps(dataPlaneAccountId)

Delete an existing Tessell Data Plane Account.

Deletes an existing Tessell Data Plane Account

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        UUID dataPlaneAccountId = new UUID(); // UUID | Tessell Data Plane Account which has to be deleted
        try {
            ApiStatus result = apiInstance.deleteDataPlaneAccountOps(dataPlaneAccountId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#deleteDataPlaneAccountOps");
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
 **dataPlaneAccountId** | [**UUID**](.md)| Tessell Data Plane Account which has to be deleted |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |


## getBulkDeleteDataPlaneAccountsStatus

> ResourceBulkDeleteResponseOps getBulkDeleteDataPlaneAccountsStatus(bulkDeleteDataPlaneAccountsStatusPayload)

Bulk delete data plane accounts status

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        BulkDeleteDataPlaneAccountsStatusPayload bulkDeleteDataPlaneAccountsStatusPayload = new BulkDeleteDataPlaneAccountsStatusPayload(); // BulkDeleteDataPlaneAccountsStatusPayload | 
        try {
            ResourceBulkDeleteResponseOps result = apiInstance.getBulkDeleteDataPlaneAccountsStatus(bulkDeleteDataPlaneAccountsStatusPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#getBulkDeleteDataPlaneAccountsStatus");
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
 **bulkDeleteDataPlaneAccountsStatusPayload** | [**BulkDeleteDataPlaneAccountsStatusPayload**](BulkDeleteDataPlaneAccountsStatusPayload.md)|  | [optional]

### Return type

[**ResourceBulkDeleteResponseOps**](ResourceBulkDeleteResponseOps.md)

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


## registerDataPlaneAccountOps

> DataPlaneAccount registerDataPlaneAccountOps(dataPlaneAccountRequestPayload)

Register a Tessell Data Plane Account.

Registers a Tessell Data Plane Account

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload = new DataPlaneAccountRequestPayload(); // DataPlaneAccountRequestPayload | Register Data Plane Account Payload
        try {
            DataPlaneAccount result = apiInstance.registerDataPlaneAccountOps(dataPlaneAccountRequestPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#registerDataPlaneAccountOps");
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
 **dataPlaneAccountRequestPayload** | [**DataPlaneAccountRequestPayload**](DataPlaneAccountRequestPayload.md)| Register Data Plane Account Payload |

### Return type

[**DataPlaneAccount**](DataPlaneAccount.md)

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


## replicateDataPlaneAccountOps

> DataPlaneAccount replicateDataPlaneAccountOps(dataPlaneAccountId, replicateDataPlaneAccountPayload)

Replicates an existing Tessell Data Plane Account.

Replicates an existing Tessell Data Plane Account

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        UUID dataPlaneAccountId = new UUID(); // UUID | Tessell Data Plane Account which has to be replicated
        ReplicateDataPlaneAccountPayload replicateDataPlaneAccountPayload = new ReplicateDataPlaneAccountPayload(); // ReplicateDataPlaneAccountPayload | Replicate Data Plane Account Payload
        try {
            DataPlaneAccount result = apiInstance.replicateDataPlaneAccountOps(dataPlaneAccountId, replicateDataPlaneAccountPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#replicateDataPlaneAccountOps");
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
 **dataPlaneAccountId** | [**UUID**](.md)| Tessell Data Plane Account which has to be replicated |
 **replicateDataPlaneAccountPayload** | [**ReplicateDataPlaneAccountPayload**](ReplicateDataPlaneAccountPayload.md)| Replicate Data Plane Account Payload |

### Return type

[**DataPlaneAccount**](DataPlaneAccount.md)

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


## updateDataPlaneAccountOps

> DataPlaneAccount updateDataPlaneAccountOps(dataPlaneAccountId, updateDataPlaneAccountPayload)

Updates an existing Tessell Data Plane Account.

Updates an existing Tessell Data Plane Account

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        UUID dataPlaneAccountId = new UUID(); // UUID | Tessell Data Plane Account which has to be updated
        UpdateDataPlaneAccountPayload updateDataPlaneAccountPayload = new UpdateDataPlaneAccountPayload(); // UpdateDataPlaneAccountPayload | Update Data Plane Account Payload
        try {
            DataPlaneAccount result = apiInstance.updateDataPlaneAccountOps(dataPlaneAccountId, updateDataPlaneAccountPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#updateDataPlaneAccountOps");
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
 **dataPlaneAccountId** | [**UUID**](.md)| Tessell Data Plane Account which has to be updated |
 **updateDataPlaneAccountPayload** | [**UpdateDataPlaneAccountPayload**](UpdateDataPlaneAccountPayload.md)| Update Data Plane Account Payload |

### Return type

[**DataPlaneAccount**](DataPlaneAccount.md)

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


## updateTenantDataPlaneAccountAssociation

> ApiStatus updateTenantDataPlaneAccountAssociation(dataPlaneAccountId, updateTenantCloudAccountAssociationPayload)

Updates tenant cloud account association

Updates tenant cloud account association

### Example

```java
// Import classes:
import com.tessell.tenant.client.invoker.ApiClient;
import com.tessell.tenant.client.invoker.ApiException;
import com.tessell.tenant.client.invoker.Configuration;
import com.tessell.tenant.client.invoker.models.*;
import com.tessell.tenant.client.api.DataPlaneAccountsOpsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8088");

        DataPlaneAccountsOpsApi apiInstance = new DataPlaneAccountsOpsApi(defaultClient);
        UUID dataPlaneAccountId = new UUID(); // UUID | Tessell Data Plane Account which has to be updated
        UpdateTenantCloudAccountAssociationPayload updateTenantCloudAccountAssociationPayload = new UpdateTenantCloudAccountAssociationPayload(); // UpdateTenantCloudAccountAssociationPayload | Update tenant cloud account association
        try {
            ApiStatus result = apiInstance.updateTenantDataPlaneAccountAssociation(dataPlaneAccountId, updateTenantCloudAccountAssociationPayload);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DataPlaneAccountsOpsApi#updateTenantDataPlaneAccountAssociation");
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
 **dataPlaneAccountId** | [**UUID**](.md)| Tessell Data Plane Account which has to be updated |
 **updateTenantCloudAccountAssociationPayload** | [**UpdateTenantCloudAccountAssociationPayload**](UpdateTenantCloudAccountAssociationPayload.md)| Update tenant cloud account association |

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
| **204** | No Content |  -  |
| **0** | API error response |  -  |

