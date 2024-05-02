# EventControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEvents**](EventControllerApi.md#getEvents) | **GET** /event-service/events | Reads event for the current user.
[**suppressEvent**](EventControllerApi.md#suppressEvent) | **PATCH** /event-service/event/{eventType}/suppress | Suppress an event type
[**unsuppressEvent**](EventControllerApi.md#unsuppressEvent) | **PATCH** /event-service/event/{eventType}/unsuppress | Unsuppress a previous suppressed event.



## getEvents

> TessellEventApiResponseDTO getEvents(startTime, endTime, entityType, entityID, severity, parentEventId, eventType, pageOffset, pageSize)

Reads event for the current user.

Reads event for the current user.

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.EventControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EventControllerApi apiInstance = new EventControllerApi(defaultClient);
        String startTime = "startTime_example"; // String | Start timestamp, when searching events in a range
        String endTime = "endTime_example"; // String | End timestamp, when searching events in a range
        String entityType = "entityType_example"; // String | Entity Type
        String entityID = "entityID_example"; // String | Entity/Resource ID
        String severity = "severity_example"; // String | Severity of the event
        String parentEventId = "parentEventId_example"; // String | Parent event identifier
        String eventType = "eventType_example"; // String | Event Type
        Integer pageOffset = 0; // Integer | Page offset
        Integer pageSize = 10; // Integer | Page Size
        try {
            TessellEventApiResponseDTO result = apiInstance.getEvents(startTime, endTime, entityType, entityID, severity, parentEventId, eventType, pageOffset, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventControllerApi#getEvents");
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
 **entityType** | **String**| Entity Type | [optional]
 **entityID** | **String**| Entity/Resource ID | [optional]
 **severity** | **String**| Severity of the event | [optional]
 **parentEventId** | **String**| Parent event identifier | [optional]
 **eventType** | **String**| Event Type | [optional]
 **pageOffset** | **Integer**| Page offset | [optional] [default to 0]
 **pageSize** | **Integer**| Page Size | [optional] [default to 10]

### Return type

[**TessellEventApiResponseDTO**](TessellEventApiResponseDTO.md)

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


## suppressEvent

> TessellEventDTO suppressEvent(eventType, tessellInlineObjectDTO)

Suppress an event type

Suppress an event type

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.EventControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EventControllerApi apiInstance = new EventControllerApi(defaultClient);
        String eventType = "eventType_example"; // String | 
        TessellInlineObjectDTO tessellInlineObjectDTO = new TessellInlineObjectDTO(); // TessellInlineObjectDTO | 
        try {
            TessellEventDTO result = apiInstance.suppressEvent(eventType, tessellInlineObjectDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventControllerApi#suppressEvent");
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
 **eventType** | **String**|  |
 **tessellInlineObjectDTO** | [**TessellInlineObjectDTO**](TessellInlineObjectDTO.md)|  | [optional]

### Return type

[**TessellEventDTO**](TessellEventDTO.md)

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


## unsuppressEvent

> TessellEventDTO unsuppressEvent(eventType, tessellInlineObject1DTO)

Unsuppress a previous suppressed event.

Unsuppress a previously suppressed event.

### Example

```java
// Import classes:
import com.tessell.event.client.invoker.ApiClient;
import com.tessell.event.client.invoker.ApiException;
import com.tessell.event.client.invoker.Configuration;
import com.tessell.event.client.invoker.models.*;
import com.tessell.event.client.api.EventControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        EventControllerApi apiInstance = new EventControllerApi(defaultClient);
        String eventType = "eventType_example"; // String | 
        TessellInlineObject1DTO tessellInlineObject1DTO = new TessellInlineObject1DTO(); // TessellInlineObject1DTO | 
        try {
            TessellEventDTO result = apiInstance.unsuppressEvent(eventType, tessellInlineObject1DTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventControllerApi#unsuppressEvent");
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
 **eventType** | **String**|  |
 **tessellInlineObject1DTO** | [**TessellInlineObject1DTO**](TessellInlineObject1DTO.md)|  | [optional]

### Return type

[**TessellEventDTO**](TessellEventDTO.md)

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

