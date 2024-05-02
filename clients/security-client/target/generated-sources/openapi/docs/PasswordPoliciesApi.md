# PasswordPoliciesApi

All URIs are relative to *http://localhost:8081*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPasswordPolicy**](PasswordPoliciesApi.md#createPasswordPolicy) | **POST** /tessell-internal/security/password-policies | Create Tenant Password Policies
[**getInternalPasswordPolicyById**](PasswordPoliciesApi.md#getInternalPasswordPolicyById) | **GET** /tessell-internal/security/password-policies | Get Tenant Password Policies for internal api calls
[**getPasswordPolicyByID**](PasswordPoliciesApi.md#getPasswordPolicyByID) | **GET** /security/password-policies | Get Tenant Password Policies
[**updatePasswordPolicy**](PasswordPoliciesApi.md#updatePasswordPolicy) | **PATCH** /security/password-policies | Update Tenant Password Policies



## createPasswordPolicy

> TessellPasswordPolicyResponseDTODTO createPasswordPolicy(tessellPasswordPolicyDTODTO)

Create Tenant Password Policies

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.PasswordPoliciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        PasswordPoliciesApi apiInstance = new PasswordPoliciesApi(defaultClient);
        TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO = new TessellPasswordPolicyDTODTO(); // TessellPasswordPolicyDTODTO | 
        try {
            TessellPasswordPolicyResponseDTODTO result = apiInstance.createPasswordPolicy(tessellPasswordPolicyDTODTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordPoliciesApi#createPasswordPolicy");
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
 **tessellPasswordPolicyDTODTO** | [**TessellPasswordPolicyDTODTO**](TessellPasswordPolicyDTODTO.md)|  | [optional]

### Return type

[**TessellPasswordPolicyResponseDTODTO**](TessellPasswordPolicyResponseDTODTO.md)

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


## getInternalPasswordPolicyById

> TessellPasswordPolicyDTODTO getInternalPasswordPolicyById()

Get Tenant Password Policies for internal api calls

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.PasswordPoliciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        PasswordPoliciesApi apiInstance = new PasswordPoliciesApi(defaultClient);
        try {
            TessellPasswordPolicyDTODTO result = apiInstance.getInternalPasswordPolicyById();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordPoliciesApi#getInternalPasswordPolicyById");
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

[**TessellPasswordPolicyDTODTO**](TessellPasswordPolicyDTODTO.md)

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


## getPasswordPolicyByID

> TessellPasswordPolicyDTODTO getPasswordPolicyByID()

Get Tenant Password Policies

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.PasswordPoliciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        PasswordPoliciesApi apiInstance = new PasswordPoliciesApi(defaultClient);
        try {
            TessellPasswordPolicyDTODTO result = apiInstance.getPasswordPolicyByID();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordPoliciesApi#getPasswordPolicyByID");
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

[**TessellPasswordPolicyDTODTO**](TessellPasswordPolicyDTODTO.md)

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


## updatePasswordPolicy

> TessellPasswordPolicyResponseDTODTO updatePasswordPolicy(tessellPasswordPolicyDTODTO)

Update Tenant Password Policies

### Example

```java
// Import classes:
import com.tessell.security.client.invoker.ApiClient;
import com.tessell.security.client.invoker.ApiException;
import com.tessell.security.client.invoker.Configuration;
import com.tessell.security.client.invoker.models.*;
import com.tessell.security.client.api.PasswordPoliciesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8081");

        PasswordPoliciesApi apiInstance = new PasswordPoliciesApi(defaultClient);
        TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO = new TessellPasswordPolicyDTODTO(); // TessellPasswordPolicyDTODTO | 
        try {
            TessellPasswordPolicyResponseDTODTO result = apiInstance.updatePasswordPolicy(tessellPasswordPolicyDTODTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordPoliciesApi#updatePasswordPolicy");
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
 **tessellPasswordPolicyDTODTO** | [**TessellPasswordPolicyDTODTO**](TessellPasswordPolicyDTODTO.md)|  |

### Return type

[**TessellPasswordPolicyResponseDTODTO**](TessellPasswordPolicyResponseDTODTO.md)

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

