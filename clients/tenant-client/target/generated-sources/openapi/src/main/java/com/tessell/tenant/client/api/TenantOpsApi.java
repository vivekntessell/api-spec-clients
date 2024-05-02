package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.ApiStatus;
import com.tessell.tenant.client.model.DeboardTenantRequest;
import com.tessell.tenant.client.model.GetTenantsApiResponse;
import com.tessell.tenant.client.model.ModelApiResponse;
import com.tessell.tenant.client.model.OnboardTenantRequest;
import com.tessell.tenant.client.model.SetupSharedControlPlaneBaseInfraRequest;
import com.tessell.tenant.client.model.SetupTenantRequest;
import com.tessell.tenant.client.model.Tenant;
import com.tessell.tenant.client.model.TenantStatus;
import com.tessell.tenant.client.model.TenantType;
import java.util.UUID;
import com.tessell.tenant.client.model.UpgradeTenantRequest;

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
@Component("com.tessell.tenant.client.api.TenantOpsApi")
public class TenantOpsApi {
    private ApiClient apiClient;

    public TenantOpsApi() {
        this(new ApiClient());
    }

    @Autowired
    public TenantOpsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenant Create tenant object (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant createTenant(Tenant tenant) throws RestClientException {
        return createTenantWithHttpInfo(tenant).getBody();
    }

    /**
     * Create a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenant Create tenant object (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> createTenantWithHttpInfo(Tenant tenant) throws RestClientException {
        Object postBody = tenant;
        
        // verify the required parameter 'tenant' is set
        if (tenant == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenant' when calling createTenant");
        }
        
        String path = apiClient.expandPath("/tessell-ops/tenants", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deboard a Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param deboardTenantRequest De-board tenant request (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant deboardTenant(UUID id, DeboardTenantRequest deboardTenantRequest) throws RestClientException {
        return deboardTenantWithHttpInfo(id, deboardTenantRequest).getBody();
    }

    /**
     * Deboard a Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param deboardTenantRequest De-board tenant request (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> deboardTenantWithHttpInfo(UUID id, DeboardTenantRequest deboardTenantRequest) throws RestClientException {
        Object postBody = deboardTenantRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deboardTenant");
        }
        
        // verify the required parameter 'deboardTenantRequest' is set
        if (deboardTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deboardTenantRequest' when calling deboardTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/tenants/{id}/deboard", uriVariables);

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteTenant(UUID id, Boolean softDelete) throws RestClientException {
        return deleteTenantWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete Specifies whether to retain the subscription metadata (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteTenantWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/tenants/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Return tenant entity by id.
     * Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param includeCloudAccounts id (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant getTenantById(UUID id, Boolean includeCloudAccounts, String timeZone) throws RestClientException {
        return getTenantByIdWithHttpInfo(id, includeCloudAccounts, timeZone).getBody();
    }

    /**
     * Return tenant entity by id.
     * Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param includeCloudAccounts id (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> getTenantByIdWithHttpInfo(UUID id, Boolean includeCloudAccounts, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getTenantById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/tenants/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-cloud-accounts", includeCloudAccounts));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns one or all of the registered/onboarded tenant entries.
     * Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param email Email address of the tenant (optional)
     * @param domain Domain of the tenant (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param status Tenant status (optional)
     * @return ModelApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ModelApiResponse getTenants(String email, String domain, Integer pageSize, Integer pageOffset, String timeZone, String status) throws RestClientException {
        return getTenantsWithHttpInfo(email, domain, pageSize, pageOffset, timeZone, status).getBody();
    }

    /**
     * Returns one or all of the registered/onboarded tenant entries.
     * Returns one or all of the registered/onboarded tenant entries. If &#39;consumer-type&#39; is OPS, return all entries, else return one entry for specified &#39;email&#39;.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param email Email address of the tenant (optional)
     * @param domain Domain of the tenant (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param status Tenant status (optional)
     * @return ResponseEntity&lt;ModelApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ModelApiResponse> getTenantsWithHttpInfo(String email, String domain, Integer pageSize, Integer pageOffset, String timeZone, String status) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/tenants", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email", email));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "domain", domain));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));

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

    ParameterizedTypeReference<ModelApiResponse> returnType = new ParameterizedTypeReference<ModelApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns all of the registered/onboarded tenant entries.
     * Returns all of the registered/onboarded tenant entries.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param emailId Email address of the tenant (optional)
     * @param domain Domain of the tenant (optional)
     * @param infraDeploymentId infra deployment id of tenant (optional)
     * @param tenantId Tenant id which is used as a header everywhere (optional)
     * @param status Status of the tenant (optional)
     * @param tenantTypes List of tenant type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param apiDomainUrl Domain URL for the backend endpoints (optional)
     * @return GetTenantsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTenantsApiResponse getTenantsV2(String emailId, String domain, UUID infraDeploymentId, String tenantId, List<TenantStatus> status, List<TenantType> tenantTypes, Integer pageSize, Integer pageOffset, String apiDomainUrl) throws RestClientException {
        return getTenantsV2WithHttpInfo(emailId, domain, infraDeploymentId, tenantId, status, tenantTypes, pageSize, pageOffset, apiDomainUrl).getBody();
    }

    /**
     * Returns all of the registered/onboarded tenant entries.
     * Returns all of the registered/onboarded tenant entries.
     * <p><b>200</b> - List of tenants
     * <p><b>0</b> - API error response
     * @param emailId Email address of the tenant (optional)
     * @param domain Domain of the tenant (optional)
     * @param infraDeploymentId infra deployment id of tenant (optional)
     * @param tenantId Tenant id which is used as a header everywhere (optional)
     * @param status Status of the tenant (optional)
     * @param tenantTypes List of tenant type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param apiDomainUrl Domain URL for the backend endpoints (optional)
     * @return ResponseEntity&lt;GetTenantsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTenantsApiResponse> getTenantsV2WithHttpInfo(String emailId, String domain, UUID infraDeploymentId, String tenantId, List<TenantStatus> status, List<TenantType> tenantTypes, Integer pageSize, Integer pageOffset, String apiDomainUrl) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/v2/tenants", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "email-id", emailId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "domain", domain));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "infra-deployment-id", infraDeploymentId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "tenant-types", tenantTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "api-domain-url", apiDomainUrl));

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

    ParameterizedTypeReference<GetTenantsApiResponse> returnType = new ParameterizedTypeReference<GetTenantsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Onboard a tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param onboardTenantRequest  (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant onboardTenant(OnboardTenantRequest onboardTenantRequest) throws RestClientException {
        return onboardTenantWithHttpInfo(onboardTenantRequest).getBody();
    }

    /**
     * 
     * Onboard a tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param onboardTenantRequest  (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> onboardTenantWithHttpInfo(OnboardTenantRequest onboardTenantRequest) throws RestClientException {
        Object postBody = onboardTenantRequest;
        
        // verify the required parameter 'onboardTenantRequest' is set
        if (onboardTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'onboardTenantRequest' when calling onboardTenant");
        }
        
        String path = apiClient.expandPath("/tessell-ops/tenants/onboard", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Sets up console tenant. This is a temp api and will go away in later versions
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param setupSharedControlPlaneBaseInfraRequest  (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant setupSharedControlPlaneBaseInfra(SetupSharedControlPlaneBaseInfraRequest setupSharedControlPlaneBaseInfraRequest) throws RestClientException {
        return setupSharedControlPlaneBaseInfraWithHttpInfo(setupSharedControlPlaneBaseInfraRequest).getBody();
    }

    /**
     * 
     * Sets up console tenant. This is a temp api and will go away in later versions
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param setupSharedControlPlaneBaseInfraRequest  (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> setupSharedControlPlaneBaseInfraWithHttpInfo(SetupSharedControlPlaneBaseInfraRequest setupSharedControlPlaneBaseInfraRequest) throws RestClientException {
        Object postBody = setupSharedControlPlaneBaseInfraRequest;
        
        // verify the required parameter 'setupSharedControlPlaneBaseInfraRequest' is set
        if (setupSharedControlPlaneBaseInfraRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setupSharedControlPlaneBaseInfraRequest' when calling setupSharedControlPlaneBaseInfra");
        }
        
        String path = apiClient.expandPath("/tessell-ops/tenants/base-tenant-setup", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Sets up a tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param setupTenantRequest  (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant setupTenant(SetupTenantRequest setupTenantRequest) throws RestClientException {
        return setupTenantWithHttpInfo(setupTenantRequest).getBody();
    }

    /**
     * 
     * Sets up a tenant.
     * <p><b>200</b> - Tenant response with status
     * <p><b>0</b> - API error response
     * @param setupTenantRequest  (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> setupTenantWithHttpInfo(SetupTenantRequest setupTenantRequest) throws RestClientException {
        Object postBody = setupTenantRequest;
        
        // verify the required parameter 'setupTenantRequest' is set
        if (setupTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'setupTenantRequest' when calling setupTenant");
        }
        
        String path = apiClient.expandPath("/tessell-ops/tenants/setup", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenant Update tenant object (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant updateTenant(UUID id, Tenant tenant) throws RestClientException {
        return updateTenantWithHttpInfo(id, tenant).getBody();
    }

    /**
     * Update a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenant Update tenant object (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> updateTenantWithHttpInfo(UUID id, Tenant tenant) throws RestClientException {
        Object postBody = tenant;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateTenant");
        }
        
        // verify the required parameter 'tenant' is set
        if (tenant == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenant' when calling updateTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/tenants/{id}", uriVariables);

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upgrade a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param upgradeTenantRequest Upgrade a tenant (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant upgradeTenant(UUID id, UpgradeTenantRequest upgradeTenantRequest) throws RestClientException {
        return upgradeTenantWithHttpInfo(id, upgradeTenantRequest).getBody();
    }

    /**
     * Upgrade a Tessell Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param upgradeTenantRequest Upgrade a tenant (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> upgradeTenantWithHttpInfo(UUID id, UpgradeTenantRequest upgradeTenantRequest) throws RestClientException {
        Object postBody = upgradeTenantRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling upgradeTenant");
        }
        
        // verify the required parameter 'upgradeTenantRequest' is set
        if (upgradeTenantRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'upgradeTenantRequest' when calling upgradeTenant");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/tenants/{id}/upgrade", uriVariables);

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upgrade services of a tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId tenant id (required)
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant upgradeTenantServices(String tenantId) throws RestClientException {
        return upgradeTenantServicesWithHttpInfo(tenantId).getBody();
    }

    /**
     * Upgrade services of a tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId tenant id (required)
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> upgradeTenantServicesWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling upgradeTenantServices");
        }
        
        String path = apiClient.expandPath("/tessell-ops/tenants/upgrade-services", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
