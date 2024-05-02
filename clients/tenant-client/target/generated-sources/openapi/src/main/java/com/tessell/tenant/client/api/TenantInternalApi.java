package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.DeboardingCleanupEntitiesResponse;
import com.tessell.tenant.client.model.Tenant;

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
@Component("com.tessell.tenant.client.api.TenantInternalApi")
public class TenantInternalApi {
    private ApiClient apiClient;

    public TenantInternalApi() {
        this(new ApiClient());
    }

    @Autowired
    public TenantInternalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Return tenant entities to be cleaned up
     * Return tenant entities to be cleaned up
     * <p><b>200</b> - List of entity type configs to be cleaned up
     * <p><b>0</b> - API error response
     * @param subscriptionEntities whether to return the subscription level entity types (optional)
     * @return DeboardingCleanupEntitiesResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeboardingCleanupEntitiesResponse getCleanupEntities(Boolean subscriptionEntities) throws RestClientException {
        return getCleanupEntitiesWithHttpInfo(subscriptionEntities).getBody();
    }

    /**
     * Return tenant entities to be cleaned up
     * Return tenant entities to be cleaned up
     * <p><b>200</b> - List of entity type configs to be cleaned up
     * <p><b>0</b> - API error response
     * @param subscriptionEntities whether to return the subscription level entity types (optional)
     * @return ResponseEntity&lt;DeboardingCleanupEntitiesResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeboardingCleanupEntitiesResponse> getCleanupEntitiesWithHttpInfo(Boolean subscriptionEntities) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/tenants/deboard/cleanup/entities", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionEntities", subscriptionEntities));

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

    ParameterizedTypeReference<DeboardingCleanupEntitiesResponse> returnType = new ParameterizedTypeReference<DeboardingCleanupEntitiesResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Return tenant entity by the request header tenant-id.
     * Return tenant entity by the request header tenant-id.
     * <p><b>200</b> - Current tenant
     * <p><b>0</b> - API error response
     * @return Tenant
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Tenant getCurrentTenant() throws RestClientException {
        return getCurrentTenantWithHttpInfo().getBody();
    }

    /**
     * Return tenant entity by the request header tenant-id.
     * Return tenant entity by the request header tenant-id.
     * <p><b>200</b> - Current tenant
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Tenant&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Tenant> getCurrentTenantWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/tenant", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Tenant> returnType = new ParameterizedTypeReference<Tenant>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
