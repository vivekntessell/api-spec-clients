# NotificationControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batchAcknowledgeNotification**](NotificationControllerApi.md#batchAcknowledgeNotification) | **POST** /event-service/notifications/batch-acknowledge | Acknowledge notifications
[**getNotificationSummary**](NotificationControllerApi.md#getNotificationSummary) | **GET** /event-service/notifications/summary | Get notifications summary
[**getNotifications**](NotificationControllerApi.md#getNotifications) | **GET** /event-service/notifications | Returns the events for the user
[**getNotificationsCount**](NotificationControllerApi.md#getNotificationsCount) | **GET** /event-service/notifications/count | Get notification count
[**getNotificationsOps**](NotificationControllerApi.md#getNotificationsOps) | **GET** /tessell-ops/event-service/notifications | Returns the events for the user



## batchAcknowledgeNotification

> List&lt;String&gt; batchAcknowledgeNotification(tessellBatchAcknowledgeRequestDTO)

Acknowledge notifications

Acknowledges notifications

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.NotificationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
        TessellBatchAcknowledgeRequestDTO tessellBatchAcknowledgeRequestDTO = new TessellBatchAcknowledgeRequestDTO(); // TessellBatchAcknowledgeRequestDTO | Batch Acknowledge Body
        try {
            List<String> result = apiInstance.batchAcknowledgeNotification(tessellBatchAcknowledgeRequestDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationControllerApi#batchAcknowledgeNotification");
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
 **tessellBatchAcknowledgeRequestDTO** | [**TessellBatchAcknowledgeRequestDTO**](TessellBatchAcknowledgeRequestDTO.md)| Batch Acknowledge Body |

### Return type

**List&lt;String&gt;**

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


## getNotificationSummary

> TessellNotificationSummaryApiResponseDTO getNotificationSummary(startTime, endTime, pageOffset, pageSize)

Get notifications summary

Get latest notifications summary for the current user.

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.NotificationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
        String startTime = "startTime_example"; // String | Start timestamp, when searching events in a range
        String endTime = "endTime_example"; // String | End timestamp, when searching events in a range
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            TessellNotificationSummaryApiResponseDTO result = apiInstance.getNotificationSummary(startTime, endTime, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationControllerApi#getNotificationSummary");
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
 **startTime** | **String**| Start timestamp, when searching events in a range | [optional]
 **endTime** | **String**| End timestamp, when searching events in a range | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**TessellNotificationSummaryApiResponseDTO**](TessellNotificationSummaryApiResponseDTO.md)

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


## getNotifications

> List&lt;TessellNotificationApiResponseDTO&gt; getNotifications(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize)

Returns the events for the user

Reads notification for the current user.

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.NotificationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
        String startTime = "startTime_example"; // String | Start timestamp, when searching events in a range
        String endTime = "endTime_example"; // String | End timestamp, when searching events in a range
        String entityType = "entityType_example"; // String | Entity Name
        String entityName = "entityName_example"; // String | Entity Name
        String severity = "severity_example"; // String | Severity of the event
        String eventType = "eventType_example"; // String | Event type
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            List<TessellNotificationApiResponseDTO> result = apiInstance.getNotifications(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationControllerApi#getNotifications");
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
 **startTime** | **String**| Start timestamp, when searching events in a range | [optional]
 **endTime** | **String**| End timestamp, when searching events in a range | [optional]
 **entityType** | **String**| Entity Name | [optional]
 **entityName** | **String**| Entity Name | [optional]
 **severity** | **String**| Severity of the event | [optional]
 **eventType** | **String**| Event type | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**List&lt;TessellNotificationApiResponseDTO&gt;**](TessellNotificationApiResponseDTO.md)

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


## getNotificationsCount

> TessellNotificationCountDTO getNotificationsCount(startTime, endTime)

Get notification count

Get the current count of active notifications in the specified time

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.NotificationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
        String startTime = "startTime_example"; // String | Start timestamp, when searching events in a range
        String endTime = "endTime_example"; // String | End timestamp, when searching events in a range
        try {
            TessellNotificationCountDTO result = apiInstance.getNotificationsCount(startTime, endTime);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationControllerApi#getNotificationsCount");
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
 **startTime** | **String**| Start timestamp, when searching events in a range | [optional]
 **endTime** | **String**| End timestamp, when searching events in a range | [optional]

### Return type

[**TessellNotificationCountDTO**](TessellNotificationCountDTO.md)

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


## getNotificationsOps

> List&lt;TessellNotificationApiResponseDTO&gt; getNotificationsOps(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize)

Returns the events for the user

Reads notification for the current user.

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.NotificationControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        NotificationControllerApi apiInstance = new NotificationControllerApi(defaultClient);
        String startTime = "startTime_example"; // String | Start timestamp, when searching events in a range
        String endTime = "endTime_example"; // String | End timestamp, when searching events in a range
        String entityType = "entityType_example"; // String | Entity Name
        String entityName = "entityName_example"; // String | Entity Name
        String severity = "severity_example"; // String | Severity of the event
        String eventType = "eventType_example"; // String | Event type
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            List<TessellNotificationApiResponseDTO> result = apiInstance.getNotificationsOps(startTime, endTime, entityType, entityName, severity, eventType, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NotificationControllerApi#getNotificationsOps");
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
 **startTime** | **String**| Start timestamp, when searching events in a range | [optional]
 **endTime** | **String**| End timestamp, when searching events in a range | [optional]
 **entityType** | **String**| Entity Name | [optional]
 **entityName** | **String**| Entity Name | [optional]
 **severity** | **String**| Severity of the event | [optional]
 **eventType** | **String**| Event type | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**List&lt;TessellNotificationApiResponseDTO&gt;**](TessellNotificationApiResponseDTO.md)

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

