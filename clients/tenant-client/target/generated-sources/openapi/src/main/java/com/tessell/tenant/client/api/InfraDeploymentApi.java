package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.InfraDeployment;
import com.tessell.tenant.client.model.InfraDeploymentProxyRegionsPayload;
import com.tessell.tenant.client.model.InfraDeploymentStatus;
import com.tessell.tenant.client.model.InfraDeploymentsResponse;
import com.tessell.tenant.client.model.ProxyRegionStatus;
import com.tessell.tenant.client.model.SharedInfraCreationRequestPayload;
import com.tessell.tenant.client.model.TenantType;
import java.util.UUID;
import com.tessell.tenant.client.model.UpgradeInfraDeploymentRequest;

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
@Component("com.tessell.tenant.client.api.InfraDeploymentApi")
public class InfraDeploymentApi {
    private ApiClient apiClient;

    public InfraDeploymentApi() {
        this(new ApiClient());
    }

    @Autowired
    public InfraDeploymentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Submit a request for setting up shared tenant infra.
     * Submit a request for setting up shared tenant infra.
     * <p><b>200</b> - Tracking information for infra creation request
     * <p><b>0</b> - API error response
     * @param sharedInfraCreationRequestPayload Shared Infra specification (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment createSharedInfra(SharedInfraCreationRequestPayload sharedInfraCreationRequestPayload) throws RestClientException {
        return createSharedInfraWithHttpInfo(sharedInfraCreationRequestPayload).getBody();
    }

    /**
     * Submit a request for setting up shared tenant infra.
     * Submit a request for setting up shared tenant infra.
     * <p><b>200</b> - Tracking information for infra creation request
     * <p><b>0</b> - API error response
     * @param sharedInfraCreationRequestPayload Shared Infra specification (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> createSharedInfraWithHttpInfo(SharedInfraCreationRequestPayload sharedInfraCreationRequestPayload) throws RestClientException {
        Object postBody = sharedInfraCreationRequestPayload;
        
        // verify the required parameter 'sharedInfraCreationRequestPayload' is set
        if (sharedInfraCreationRequestPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sharedInfraCreationRequestPayload' when calling createSharedInfra");
        }
        
        String path = apiClient.expandPath("/tessell-ops/infra-deployments", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deletes proxy regions
     * Submits a request to delete proxy regions in Infra Deployment
     * <p><b>200</b> - Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeploymentProxyRegionsPayload List of proxy regions for Infra Deployment (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment deleteProxyRegionsInfraDeployment(String name, InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload) throws RestClientException {
        return deleteProxyRegionsInfraDeploymentWithHttpInfo(name, infraDeploymentProxyRegionsPayload).getBody();
    }

    /**
     * Deletes proxy regions
     * Submits a request to delete proxy regions in Infra Deployment
     * <p><b>200</b> - Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeploymentProxyRegionsPayload List of proxy regions for Infra Deployment (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> deleteProxyRegionsInfraDeploymentWithHttpInfo(String name, InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload) throws RestClientException {
        Object postBody = infraDeploymentProxyRegionsPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteProxyRegionsInfraDeployment");
        }
        
        // verify the required parameter 'infraDeploymentProxyRegionsPayload' is set
        if (infraDeploymentProxyRegionsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'infraDeploymentProxyRegionsPayload' when calling deleteProxyRegionsInfraDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}/proxy-regions", uriVariables);

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get infra deployment.
     * 
     * <p><b>200</b> - Infra infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment getInfraDeployment(String name) throws RestClientException {
        return getInfraDeploymentWithHttpInfo(name).getBody();
    }

    /**
     * Get infra deployment.
     * 
     * <p><b>200</b> - Infra infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> getInfraDeploymentWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getInfraDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get the infra deployments
     * 
     * <p><b>200</b> - Infra deployment
     * <p><b>0</b> - API error response
     * @param tenantId Filter for a specific tenant (optional)
     * @param status Filter for infra deployment (optional)
     * @param forTenantType Filter for which tenant type the deployment type is for (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return InfraDeploymentsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeploymentsResponse getInfraDeployments(UUID tenantId, InfraDeploymentStatus status, TenantType forTenantType, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getInfraDeploymentsWithHttpInfo(tenantId, status, forTenantType, pageSize, pageOffset).getBody();
    }

    /**
     * Get the infra deployments
     * 
     * <p><b>200</b> - Infra deployment
     * <p><b>0</b> - API error response
     * @param tenantId Filter for a specific tenant (optional)
     * @param status Filter for infra deployment (optional)
     * @param forTenantType Filter for which tenant type the deployment type is for (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;InfraDeploymentsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeploymentsResponse> getInfraDeploymentsWithHttpInfo(UUID tenantId, InfraDeploymentStatus status, TenantType forTenantType, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/infra-deployments", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "for-tenant-type", forTenantType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<InfraDeploymentsResponse> returnType = new ParameterizedTypeReference<InfraDeploymentsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Submit a request for registering metadata for infra deployment
     * 
     * <p><b>200</b> - Register metadata for infra deployment
     * <p><b>0</b> - API error response
     * @param infraDeployment Register metadata for infra deployment (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment registerMetadataInfraDeployment(InfraDeployment infraDeployment) throws RestClientException {
        return registerMetadataInfraDeploymentWithHttpInfo(infraDeployment).getBody();
    }

    /**
     * Submit a request for registering metadata for infra deployment
     * 
     * <p><b>200</b> - Register metadata for infra deployment
     * <p><b>0</b> - API error response
     * @param infraDeployment Register metadata for infra deployment (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> registerMetadataInfraDeploymentWithHttpInfo(InfraDeployment infraDeployment) throws RestClientException {
        Object postBody = infraDeployment;
        
        // verify the required parameter 'infraDeployment' is set
        if (infraDeployment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'infraDeployment' when calling registerMetadataInfraDeployment");
        }
        
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/register-metadata", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register proxy regions
     * Submits a request for registering proxy regions in Infra Deployment
     * <p><b>200</b> - Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeploymentProxyRegionsPayload Proxy regions for Infra Deployment (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment registerProxyRegionsInfraDeployment(String name, InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload) throws RestClientException {
        return registerProxyRegionsInfraDeploymentWithHttpInfo(name, infraDeploymentProxyRegionsPayload).getBody();
    }

    /**
     * Register proxy regions
     * Submits a request for registering proxy regions in Infra Deployment
     * <p><b>200</b> - Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeploymentProxyRegionsPayload Proxy regions for Infra Deployment (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> registerProxyRegionsInfraDeploymentWithHttpInfo(String name, InfraDeploymentProxyRegionsPayload infraDeploymentProxyRegionsPayload) throws RestClientException {
        Object postBody = infraDeploymentProxyRegionsPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling registerProxyRegionsInfraDeployment");
        }
        
        // verify the required parameter 'infraDeploymentProxyRegionsPayload' is set
        if (infraDeploymentProxyRegionsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'infraDeploymentProxyRegionsPayload' when calling registerProxyRegionsInfraDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}/proxy-regions", uriVariables);

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update infra deployment.
     * 
     * <p><b>200</b> - Update infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeployment Update infra deployment request (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment updateInfraDeployment(String name, InfraDeployment infraDeployment) throws RestClientException {
        return updateInfraDeploymentWithHttpInfo(name, infraDeployment).getBody();
    }

    /**
     * Update infra deployment.
     * 
     * <p><b>200</b> - Update infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param infraDeployment Update infra deployment request (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> updateInfraDeploymentWithHttpInfo(String name, InfraDeployment infraDeployment) throws RestClientException {
        Object postBody = infraDeployment;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateInfraDeployment");
        }
        
        // verify the required parameter 'infraDeployment' is set
        if (infraDeployment == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'infraDeployment' when calling updateInfraDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}", uriVariables);

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates proxy regions&#39; status
     * Submits a request for updating the proxy regions&#39; status
     * <p><b>200</b> - List of current proxy regions for Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param requestBody List of regions for status update (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment updateProxyRegionsStatus(String name, Map<String, ProxyRegionStatus> requestBody) throws RestClientException {
        return updateProxyRegionsStatusWithHttpInfo(name, requestBody).getBody();
    }

    /**
     * Updates proxy regions&#39; status
     * Submits a request for updating the proxy regions&#39; status
     * <p><b>200</b> - List of current proxy regions for Infra Deployment
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param requestBody List of regions for status update (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> updateProxyRegionsStatusWithHttpInfo(String name, Map<String, ProxyRegionStatus> requestBody) throws RestClientException {
        Object postBody = requestBody;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateProxyRegionsStatus");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling updateProxyRegionsStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}/proxy-regions/update-status", uriVariables);

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upgrade infra deployment.
     * 
     * <p><b>200</b> - Upgrade infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param upgradeInfraDeploymentRequest Upgrade infra deployment request (required)
     * @return InfraDeployment
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public InfraDeployment upgradeInfraDeployment(String name, UpgradeInfraDeploymentRequest upgradeInfraDeploymentRequest) throws RestClientException {
        return upgradeInfraDeploymentWithHttpInfo(name, upgradeInfraDeploymentRequest).getBody();
    }

    /**
     * Upgrade infra deployment.
     * 
     * <p><b>200</b> - Upgrade infra deployment response
     * <p><b>0</b> - API error response
     * @param name Infra name (required)
     * @param upgradeInfraDeploymentRequest Upgrade infra deployment request (required)
     * @return ResponseEntity&lt;InfraDeployment&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<InfraDeployment> upgradeInfraDeploymentWithHttpInfo(String name, UpgradeInfraDeploymentRequest upgradeInfraDeploymentRequest) throws RestClientException {
        Object postBody = upgradeInfraDeploymentRequest;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling upgradeInfraDeployment");
        }
        
        // verify the required parameter 'upgradeInfraDeploymentRequest' is set
        if (upgradeInfraDeploymentRequest == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'upgradeInfraDeploymentRequest' when calling upgradeInfraDeployment");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-ops/infra-deployments/{name}/upgrade", uriVariables);

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

    ParameterizedTypeReference<InfraDeployment> returnType = new ParameterizedTypeReference<InfraDeployment>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
