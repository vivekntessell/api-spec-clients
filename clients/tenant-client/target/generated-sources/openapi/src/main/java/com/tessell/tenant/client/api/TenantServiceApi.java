package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ActivateTenantRequest;
import com.tessell.tenant.client.model.ApiError;
import com.tessell.tenant.client.model.RegisterTenantRequest;
import com.tessell.tenant.client.model.RegisterTenantResponse;
import com.tessell.tenant.client.model.TenantConfigServiceView;
import com.tessell.tenant.client.model.TenantOnboardingResponse;
import com.tessell.tenant.client.model.TenantServiceConsumer;
import com.tessell.tenant.client.model.VerifyCodeRequest;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import com.tessell.common.context.APIContextPropagation;

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@Component("com.tessell.tenant.client.api.TenantServiceApi")
public class TenantServiceApi {
    private ApiClient apiClient;

    public TenantServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public TenantServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Activate the tenant
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param activateTenantRequest  (required)
     * @return TenantServiceConsumer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantServiceConsumer activateTenant(ActivateTenantRequest activateTenantRequest) throws RestClientException {
        return activateTenantWithHttpInfo(activateTenantRequest).getBody();
    }

    /**
     * 
     * Activate the tenant
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param activateTenantRequest  (required)
     * @return ResponseEntity&lt;TenantServiceConsumer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantServiceConsumer> activateTenantWithHttpInfo(ActivateTenantRequest activateTenantRequest) throws RestClientException {
        Object postBody = activateTenantRequest;
        
        // verify the required parameter 'activateTenantRequest' is set
        if (activateTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'activateTenantRequest' when calling activateTenant");
        }
        
        String path = apiClient.expandPath("/tenants/activate", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TenantServiceConsumer> returnType = new ParameterizedTypeReference<TenantServiceConsumer>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the tenant details for specified email address
     * Returns the tenant details for specified email address
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param email Email address of the tenant (required)
     * @return TenantOnboardingResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantOnboardingResponse getTenantByEmail(String email) throws RestClientException {
        return getTenantByEmailWithHttpInfo(email).getBody();
    }

    /**
     * Returns the tenant details for specified email address
     * Returns the tenant details for specified email address
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param email Email address of the tenant (required)
     * @return ResponseEntity&lt;TenantOnboardingResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantOnboardingResponse> getTenantByEmailWithHttpInfo(String email) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'email' is set
        if (email == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'email' when calling getTenantByEmail");
        }
        
        String path = apiClient.expandPath("/tenants", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TenantOnboardingResponse> returnType = new ParameterizedTypeReference<TenantOnboardingResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns the tenant service config
     * 
     * <p><b>200</b> - Tenant service consumer view
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id (required)
     * @return TenantConfigServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TenantConfigServiceView getTenantConfigServiceView(String tenantId) throws RestClientException {
        return getTenantConfigServiceViewWithHttpInfo(tenantId).getBody();
    }

    /**
     * Returns the tenant service config
     * 
     * <p><b>200</b> - Tenant service consumer view
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id (required)
     * @return ResponseEntity&lt;TenantConfigServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TenantConfigServiceView> getTenantConfigServiceViewWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTenantConfigServiceView");
        }
        
        String path = apiClient.expandPath("/tenant-config", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TenantConfigServiceView> returnType = new ParameterizedTypeReference<TenantConfigServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Sign up a new PE tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param registerTenantRequest  (required)
     * @return RegisterTenantResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegisterTenantResponse registerTenant(RegisterTenantRequest registerTenantRequest) throws RestClientException {
        return registerTenantWithHttpInfo(registerTenantRequest).getBody();
    }

    /**
     * 
     * Sign up a new PE tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param registerTenantRequest  (required)
     * @return ResponseEntity&lt;RegisterTenantResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegisterTenantResponse> registerTenantWithHttpInfo(RegisterTenantRequest registerTenantRequest) throws RestClientException {
        Object postBody = registerTenantRequest;
        
        // verify the required parameter 'registerTenantRequest' is set
        if (registerTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'registerTenantRequest' when calling registerTenant");
        }
        
        String path = apiClient.expandPath("/tenants/register", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<RegisterTenantResponse> returnType = new ParameterizedTypeReference<RegisterTenantResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Verify the azure oauth code.
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param code Azure auth code (required)
     * @param state Tessell Tenant ID (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void verifyAzureAuth(String code, String state) throws RestClientException {
        verifyAzureAuthWithHttpInfo(code, state);
    }

    /**
     * 
     * Verify the azure oauth code.
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param code Azure auth code (required)
     * @param state Tessell Tenant ID (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> verifyAzureAuthWithHttpInfo(String code, String state) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'code' is set
        if (code == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'code' when calling verifyAzureAuth");
        }
        
        // verify the required parameter 'state' is set
        if (state == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'state' when calling verifyAzureAuth");
        }
        
        String path = apiClient.expandPath("/azureauth/callback", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "code", code));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "state", state));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Verify the email verification code.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param verifyCodeRequest  (required)
     * @return RegisterTenantResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegisterTenantResponse verifyEmail(VerifyCodeRequest verifyCodeRequest) throws RestClientException {
        return verifyEmailWithHttpInfo(verifyCodeRequest).getBody();
    }

    /**
     * 
     * Verify the email verification code.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param verifyCodeRequest  (required)
     * @return ResponseEntity&lt;RegisterTenantResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegisterTenantResponse> verifyEmailWithHttpInfo(VerifyCodeRequest verifyCodeRequest) throws RestClientException {
        Object postBody = verifyCodeRequest;
        
        // verify the required parameter 'verifyCodeRequest' is set
        if (verifyCodeRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'verifyCodeRequest' when calling verifyEmail");
        }
        
        String path = apiClient.expandPath("/tenants/verify", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<RegisterTenantResponse> returnType = new ParameterizedTypeReference<RegisterTenantResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
