# DefaultApi

All URIs are relative to *http://tessell-metering:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**changeSkipBillGeneration**](DefaultApi.md#changeSkipBillGeneration) | **PATCH** /tessell-ops/billing/disable/{disable} | 
[**checkCredits**](DefaultApi.md#checkCredits) | **POST** /tessell-ops/billing/credit-check | 
[**createCredit**](DefaultApi.md#createCredit) | **POST** /tessell-ops/billing/credits | 
[**dailyAggregator**](DefaultApi.md#dailyAggregator) | **POST** /tessell-ops/meters/daily | 
[**deleteCredit**](DefaultApi.md#deleteCredit) | **DELETE** /tessell-ops/billing/credits/{id} | 
[**generateBill**](DefaultApi.md#generateBill) | **POST** /billing/bills | 
[**getBillingProfile**](DefaultApi.md#getBillingProfile) | **GET** /billing/profile | 
[**getBillingSummary**](DefaultApi.md#getBillingSummary) | **GET** /billing/summary | 
[**getBills**](DefaultApi.md#getBills) | **GET** /billing/bills | 
[**getCostTillDate**](DefaultApi.md#getCostTillDate) | **GET** /billing/cost-till-date | 
[**getCredit**](DefaultApi.md#getCredit) | **GET** /billing/credits/{id} | 
[**getCredits**](DefaultApi.md#getCredits) | **GET** /billing/credits | 
[**getCreditsInternal**](DefaultApi.md#getCreditsInternal) | **GET** /tessell-ops/billing/credits | 
[**getMeteringData**](DefaultApi.md#getMeteringData) | **GET** /billing/meters | 
[**getRates**](DefaultApi.md#getRates) | **GET** /billing/rates | 
[**getTenantDiscount**](DefaultApi.md#getTenantDiscount) | **GET** /tessell-ops/billing/discounts | 
[**hourlyMeter**](DefaultApi.md#hourlyMeter) | **POST** /tessell-ops/meters/hourly | 
[**monthlyAggregator**](DefaultApi.md#monthlyAggregator) | **POST** /tessell-ops/meters/monthly | 
[**monthlyBilling**](DefaultApi.md#monthlyBilling) | **POST** /tessell-ops/billing/monthly | 
[**sendInvoiceNotification**](DefaultApi.md#sendInvoiceNotification) | **POST** /tessell-ops/billing/notification | 
[**updateBillingProfile**](DefaultApi.md#updateBillingProfile) | **PATCH** /billing/profile | 
[**updateCreditEntity**](DefaultApi.md#updateCreditEntity) | **PATCH** /tessell-ops/billing/credits/{id} | 
[**updateProfileInternal**](DefaultApi.md#updateProfileInternal) | **PATCH** /tessell-ops/billing/profile | 
[**updateRates**](DefaultApi.md#updateRates) | **PATCH** /tessell-ops/billing/rates | 
[**updateTenantDiscount**](DefaultApi.md#updateTenantDiscount) | **PATCH** /tessell-ops/billing/discounts | 
[**updateTenantInvoiceConfig**](DefaultApi.md#updateTenantInvoiceConfig) | **PATCH** /tessell-ops/billing/invoices | 



## changeSkipBillGeneration

> changeSkipBillGeneration(tenantId, disable)



update the skip bill generation i.e toggle skip bill generation

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String disable = "disable_example"; // String | boolean value of enable/disable
        try {
            apiInstance.changeSkipBillGeneration(tenantId, disable);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#changeSkipBillGeneration");
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
 **disable** | **String**| boolean value of enable/disable |

### Return type

null (empty response body)

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


## checkCredits

> TessellCheckCreditsDTO checkCredits(tenantId)



check if we allow provision .

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellCheckCreditsDTO result = apiInstance.checkCredits(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#checkCredits");
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

### Return type

[**TessellCheckCreditsDTO**](TessellCheckCreditsDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of all billing Profiles |  -  |
| **0** | API error response |  -  |


## createCredit

> TessellCreditDTO createCredit(tenantId, tessellCreditDTO)



Add a new credit entry

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellCreditDTO tessellCreditDTO = new TessellCreditDTO(); // TessellCreditDTO | Add new credit entry
        try {
            TessellCreditDTO result = apiInstance.createCredit(tenantId, tessellCreditDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createCredit");
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
 **tessellCreditDTO** | [**TessellCreditDTO**](TessellCreditDTO.md)| Add new credit entry |

### Return type

[**TessellCreditDTO**](TessellCreditDTO.md)

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


## dailyAggregator

> dailyAggregator()



Start daily meter aggregator job

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.dailyAggregator();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#dailyAggregator");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

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


## deleteCredit

> deleteCredit(id, tenantId)



Mark a credit as deleted

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Credit id
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            apiInstance.deleteCredit(id, tenantId);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteCredit");
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
 **id** | **String**| Credit id |
 **tenantId** | **String**| tenant-id |

### Return type

null (empty response body)

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


## generateBill

> TessellBillDTO generateBill(startDate, endDate, tenantId, systemGenerated)



Generate a bill based on the meters present for a provided start-date and end-date,

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        BigDecimal startDate = new BigDecimal(78); // BigDecimal | The timestamp of the start date of the meter
        BigDecimal endDate = new BigDecimal(78); // BigDecimal | The timestamp of the end date of the meter
        String tenantId = "tenantId_example"; // String | tenant-id
        Boolean systemGenerated = true; // Boolean | system-generated
        try {
            TessellBillDTO result = apiInstance.generateBill(startDate, endDate, tenantId, systemGenerated);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#generateBill");
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
 **startDate** | **BigDecimal**| The timestamp of the start date of the meter |
 **endDate** | **BigDecimal**| The timestamp of the end date of the meter |
 **tenantId** | **String**| tenant-id | [optional]
 **systemGenerated** | **Boolean**| system-generated | [optional]

### Return type

[**TessellBillDTO**](TessellBillDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Bill Object |  -  |
| **0** | API error response |  -  |


## getBillingProfile

> List&lt;TessellBillingProfileDTO&gt; getBillingProfile(tenantId)



Returns the details of the Billing profile that include billing address and payment details

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            List<TessellBillingProfileDTO> result = apiInstance.getBillingProfile(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getBillingProfile");
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

### Return type

[**List&lt;TessellBillingProfileDTO&gt;**](TessellBillingProfileDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of all billing Profiles |  -  |
| **0** | API error response |  -  |


## getBillingSummary

> TessellBillSummaryDTO getBillingSummary(tenantId)



Get billing summary for a tenant

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellBillSummaryDTO result = apiInstance.getBillingSummary(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getBillingSummary");
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

### Return type

[**TessellBillSummaryDTO**](TessellBillSummaryDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Billing configuration details of this tenant |  -  |
| **0** | API error response |  -  |


## getBills

> List&lt;TessellBillDTO&gt; getBills(tenantId, name, startDate, endDate, systemGenerated)



Get all the Bills

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String name = "name_example"; // String | The Name of the Bill
        BigDecimal startDate = new BigDecimal(78); // BigDecimal | The timestamp of the start date of the meter
        BigDecimal endDate = new BigDecimal(78); // BigDecimal | The timestamp of the end date of the meter
        Boolean systemGenerated = true; // Boolean | Whether the bill is system generated.
        try {
            List<TessellBillDTO> result = apiInstance.getBills(tenantId, name, startDate, endDate, systemGenerated);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getBills");
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
 **name** | **String**| The Name of the Bill | [optional]
 **startDate** | **BigDecimal**| The timestamp of the start date of the meter | [optional]
 **endDate** | **BigDecimal**| The timestamp of the end date of the meter | [optional]
 **systemGenerated** | **Boolean**| Whether the bill is system generated. | [optional]

### Return type

[**List&lt;TessellBillDTO&gt;**](TessellBillDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Bills |  -  |
| **0** | API error response |  -  |


## getCostTillDate

> TessellMonthlyCostInfoDTO getCostTillDate(tenantId)



Returns the meter cost for this month.

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellMonthlyCostInfoDTO result = apiInstance.getCostTillDate(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCostTillDate");
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

### Return type

[**TessellMonthlyCostInfoDTO**](TessellMonthlyCostInfoDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | meter cost for this month |  -  |
| **0** | API error response |  -  |


## getCredit

> TessellCreditDTO getCredit(id, tenantId)



Get credit by credit&#39;s Id that you want to fetch

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        UUID id = new UUID(); // UUID | Credit Id
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellCreditDTO result = apiInstance.getCredit(id, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCredit");
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
 **id** | [**UUID**](.md)| Credit Id |
 **tenantId** | **String**| tenant-id |

### Return type

[**TessellCreditDTO**](TessellCreditDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of a credit |  -  |
| **0** | API error response |  -  |


## getCredits

> List&lt;TessellCreditDTO&gt; getCredits(tenantId, name, status, type, pageSize, pageOffset)



Get all the tenant&#39;s credits provided by the tessell

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String name = "name_example"; // String | Credit name
        String status = "status_example"; // String | Credit status
        String type = "type_example"; // String | Credit type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellCreditDTO> result = apiInstance.getCredits(tenantId, name, status, type, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCredits");
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
 **name** | **String**| Credit name | [optional]
 **status** | **String**| Credit status | [optional]
 **type** | **String**| Credit type | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellCreditDTO&gt;**](TessellCreditDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Credits |  -  |
| **0** | API error response |  -  |


## getCreditsInternal

> List&lt;TessellCreditDTO&gt; getCreditsInternal(tenantId, name, status, type, pageSize, pageOffset)



Get a tenant&#39;s credits

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String name = "name_example"; // String | Credit name
        String status = "status_example"; // String | Credit status
        String type = "type_example"; // String | Credit type
        Integer pageSize = 10; // Integer | Page size for get query
        Integer pageOffset = 0; // Integer | Page offset for get query
        try {
            List<TessellCreditDTO> result = apiInstance.getCreditsInternal(tenantId, name, status, type, pageSize, pageOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCreditsInternal");
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
 **name** | **String**| Credit name | [optional]
 **status** | **String**| Credit status | [optional]
 **type** | **String**| Credit type | [optional]
 **pageSize** | **Integer**| Page size for get query | [optional] [default to 10]
 **pageOffset** | **Integer**| Page offset for get query | [optional] [default to 0]

### Return type

[**List&lt;TessellCreditDTO&gt;**](TessellCreditDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Credits |  -  |
| **0** | API error response |  -  |


## getMeteringData

> List&lt;TessellMeterDTO&gt; getMeteringData(tenantId, subscriptionName, cloudType, engine, userName, startDate, endDate, entityType, entityName, computeShape, serviceName, availabilityMachineName, duration, amDetails, serviceId, availabilityMachineId)



Get all hourly/daily/weekly/monthly Meters that include all usage and cost related details till date.

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        String subscriptionName = "subscriptionName_example"; // String | The subscription name in the tenant
        CloudType cloudType = CloudType.fromValue("AWS"); // CloudType | 
        DatabaseEngineType engine = DatabaseEngineType.fromValue("ORACLE"); // DatabaseEngineType | 
        String userName = "userName_example"; // String | The User Name
        BigDecimal startDate = new BigDecimal(78); // BigDecimal | The timestamp of the start date of the meter
        BigDecimal endDate = new BigDecimal(78); // BigDecimal | The timestamp of the end date of the meter
        TessellMeteringEntityType entityType = TessellMeteringEntityType.fromValue("SERVICE"); // TessellMeteringEntityType | The Entity Type
        String entityName = "entityName_example"; // String | The name of the entity. Entity name will be compute resource name when entity type is COMPUTE_RESOURCE, backup name in case of BACKUP and am name in case of LOGS.
        String computeShape = "computeShape_example"; // String | The compute shape of a database
        String serviceName = "serviceName_example"; // String | The name of the service
        String availabilityMachineName = "availabilityMachineName_example"; // String | The name of the availability machine
        MeterDuration duration = MeterDuration.fromValue("HOURLY"); // MeterDuration | 
        Boolean amDetails = true; // Boolean | Whether or not to include backup and logs information along with AM.
        UUID serviceId = new UUID(); // UUID | The id of the service
        UUID availabilityMachineId = new UUID(); // UUID | The id of the availability machine
        try {
            List<TessellMeterDTO> result = apiInstance.getMeteringData(tenantId, subscriptionName, cloudType, engine, userName, startDate, endDate, entityType, entityName, computeShape, serviceName, availabilityMachineName, duration, amDetails, serviceId, availabilityMachineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getMeteringData");
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
 **subscriptionName** | **String**| The subscription name in the tenant | [optional]
 **cloudType** | [**CloudType**](.md)|  | [optional] [enum: AWS, AZURE]
 **engine** | [**DatabaseEngineType**](.md)|  | [optional] [enum: ORACLE, POSTGRESQL, SQLSERVER, MYSQL, APACHE_KAFKA, MONGODB, MILVUS]
 **userName** | **String**| The User Name | [optional]
 **startDate** | **BigDecimal**| The timestamp of the start date of the meter | [optional]
 **endDate** | **BigDecimal**| The timestamp of the end date of the meter | [optional]
 **entityType** | [**TessellMeteringEntityType**](.md)| The Entity Type | [optional] [enum: SERVICE, AVAILABILITY_MACHINE, BACKUP, LOGS, BENCHMARK]
 **entityName** | **String**| The name of the entity. Entity name will be compute resource name when entity type is COMPUTE_RESOURCE, backup name in case of BACKUP and am name in case of LOGS. | [optional]
 **computeShape** | **String**| The compute shape of a database | [optional]
 **serviceName** | **String**| The name of the service | [optional]
 **availabilityMachineName** | **String**| The name of the availability machine | [optional]
 **duration** | [**MeterDuration**](.md)|  | [optional] [enum: HOURLY, DAILY, MONTHLY]
 **amDetails** | **Boolean**| Whether or not to include backup and logs information along with AM. | [optional]
 **serviceId** | [**UUID**](.md)| The id of the service | [optional]
 **availabilityMachineId** | [**UUID**](.md)| The id of the availability machine | [optional]

### Return type

[**List&lt;TessellMeterDTO&gt;**](TessellMeterDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of Meter objects |  -  |
| **0** | API error response |  -  |


## getRates

> List&lt;TessellBillingRateCardDTO&gt; getRates(tenantId, cloudType, entityType, entityName)



Get Tessell&#39;s billing rates for all computes and storage

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        CloudType cloudType = CloudType.fromValue("AWS"); // CloudType | 
        TessellBillingEntityType entityType = TessellBillingEntityType.fromValue("COMPUTE"); // TessellBillingEntityType | 
        TessellMeteringRateCardEntityName entityName = TessellMeteringRateCardEntityName.fromValue("i3.large"); // TessellMeteringRateCardEntityName | 
        try {
            List<TessellBillingRateCardDTO> result = apiInstance.getRates(tenantId, cloudType, entityType, entityName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getRates");
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
 **cloudType** | [**CloudType**](.md)|  | [optional] [enum: AWS, AZURE]
 **entityType** | [**TessellBillingEntityType**](.md)|  | [optional] [enum: COMPUTE, STORAGE, NETWORK]
 **entityName** | [**TessellMeteringRateCardEntityName**](.md)|  | [optional] [enum: i3.large, i3en.large, i3.xlarge, i3en.xlarge, i3.2xlarge, i3en.2xlarge, i3en.3xlarge, i3en.4xlarge, i3en.6xlarge, i3en.8xlarge, i3en.16xlarge, i3en.24xlarge, Standard_L8s_v2, Standard_L16s_v2, Standard_L32s_v2, Standard_L48s_v2, Standard_L64s_v2, Standard_L80s_v2, Availability Machine (AWS), Availability Machine (Azure)]

### Return type

[**List&lt;TessellBillingRateCardDTO&gt;**](TessellBillingRateCardDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of Tessell billing rates |  -  |
| **0** | API error response |  -  |


## getTenantDiscount

> TessellDiscountDTO getTenantDiscount(tenantId)



Get tenant discount percentage

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        try {
            TessellDiscountDTO result = apiInstance.getTenantDiscount(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTenantDiscount");
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

### Return type

[**TessellDiscountDTO**](TessellDiscountDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The list of Tessell billing rates |  -  |
| **0** | API error response |  -  |


## hourlyMeter

> hourlyMeter()



Start hourly metering job

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.hourlyMeter();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#hourlyMeter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

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


## monthlyAggregator

> monthlyAggregator()



Start monthly meter aggregator job

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.monthlyAggregator();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#monthlyAggregator");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

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


## monthlyBilling

> monthlyBilling()



Start monthly billing job

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.monthlyBilling();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#monthlyBilling");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

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


## sendInvoiceNotification

> sendInvoiceNotification()



send notification to recipients

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.sendInvoiceNotification();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#sendInvoiceNotification");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successfully sent the notification |  -  |
| **0** | API error response |  -  |


## updateBillingProfile

> TessellBillingProfileDTO updateBillingProfile(tenantId, tessellBillingProfileDTO)



Update Billing profile that include billing address and payment details

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellBillingProfileDTO tessellBillingProfileDTO = new TessellBillingProfileDTO(); // TessellBillingProfileDTO | Update billing profile entry
        try {
            TessellBillingProfileDTO result = apiInstance.updateBillingProfile(tenantId, tessellBillingProfileDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateBillingProfile");
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
 **tessellBillingProfileDTO** | [**TessellBillingProfileDTO**](TessellBillingProfileDTO.md)| Update billing profile entry |

### Return type

[**TessellBillingProfileDTO**](TessellBillingProfileDTO.md)

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


## updateCreditEntity

> TessellCreditDTO updateCreditEntity(tenantId, id, tessellCreditDTO)



Update credit entry

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        UUID id = new UUID(); // UUID | Credit Id
        TessellCreditDTO tessellCreditDTO = new TessellCreditDTO(); // TessellCreditDTO | Update credit entry
        try {
            TessellCreditDTO result = apiInstance.updateCreditEntity(tenantId, id, tessellCreditDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateCreditEntity");
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
 **id** | [**UUID**](.md)| Credit Id |
 **tessellCreditDTO** | [**TessellCreditDTO**](TessellCreditDTO.md)| Update credit entry |

### Return type

[**TessellCreditDTO**](TessellCreditDTO.md)

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


## updateProfileInternal

> TessellBillingProfileDTO updateProfileInternal(tenantId, tessellBillingProfileDTO)



Update billing profile internal

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellBillingProfileDTO tessellBillingProfileDTO = new TessellBillingProfileDTO(); // TessellBillingProfileDTO | Update billing profile entry
        try {
            TessellBillingProfileDTO result = apiInstance.updateProfileInternal(tenantId, tessellBillingProfileDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateProfileInternal");
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
 **tessellBillingProfileDTO** | [**TessellBillingProfileDTO**](TessellBillingProfileDTO.md)| Update billing profile entry |

### Return type

[**TessellBillingProfileDTO**](TessellBillingProfileDTO.md)

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


## updateRates

> List&lt;TessellBillingRateCardDTO&gt; updateRates(tenantId, tessellBillingRateCardDTO)



Update rate card

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        List<TessellBillingRateCardDTO> tessellBillingRateCardDTO = Arrays.asList(); // List<TessellBillingRateCardDTO> | Update rates
        try {
            List<TessellBillingRateCardDTO> result = apiInstance.updateRates(tenantId, tessellBillingRateCardDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateRates");
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
 **tessellBillingRateCardDTO** | [**List&lt;TessellBillingRateCardDTO&gt;**](TessellBillingRateCardDTO.md)| Update rates |

### Return type

[**List&lt;TessellBillingRateCardDTO&gt;**](TessellBillingRateCardDTO.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Updated rates |  -  |
| **0** | API error response |  -  |


## updateTenantDiscount

> TessellDiscountDTO updateTenantDiscount(tenantId, tessellDiscountDTO)



Update tenant discount percentage

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellDiscountDTO tessellDiscountDTO = new TessellDiscountDTO(); // TessellDiscountDTO | Update tenant discount percentage
        try {
            TessellDiscountDTO result = apiInstance.updateTenantDiscount(tenantId, tessellDiscountDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateTenantDiscount");
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
 **tessellDiscountDTO** | [**TessellDiscountDTO**](TessellDiscountDTO.md)| Update tenant discount percentage |

### Return type

[**TessellDiscountDTO**](TessellDiscountDTO.md)

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


## updateTenantInvoiceConfig

> TessellInvoiceConfigDTO updateTenantInvoiceConfig(tenantId, tessellInvoiceConfigDTO)



Update tenant invoice config

### Example

```java
// Import classes:
import com.tessell.metering.client.invoker.ApiClient;
import com.tessell.metering.client.invoker.ApiException;
import com.tessell.metering.client.invoker.Configuration;
import com.tessell.metering.client.invoker.models.*;
import com.tessell.metering.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://tessell-metering:8080");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String tenantId = "tenantId_example"; // String | tenant-id
        TessellInvoiceConfigDTO tessellInvoiceConfigDTO = new TessellInvoiceConfigDTO(); // TessellInvoiceConfigDTO | Update tenant invoice config
        try {
            TessellInvoiceConfigDTO result = apiInstance.updateTenantInvoiceConfig(tenantId, tessellInvoiceConfigDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateTenantInvoiceConfig");
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
 **tessellInvoiceConfigDTO** | [**TessellInvoiceConfigDTO**](TessellInvoiceConfigDTO.md)| Update tenant invoice config |

### Return type

[**TessellInvoiceConfigDTO**](TessellInvoiceConfigDTO.md)

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

