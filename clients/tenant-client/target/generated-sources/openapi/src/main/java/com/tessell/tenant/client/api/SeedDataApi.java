package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.SeedData;
import com.tessell.tenant.client.model.SeedDataWrapper;
import java.util.UUID;

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
@Component("com.tessell.tenant.client.api.SeedDataApi")
public class SeedDataApi {
    private ApiClient apiClient;

    public SeedDataApi() {
        this(new ApiClient());
    }

    @Autowired
    public SeedDataApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new version of the seed info.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param seedData Seed data request (required)
     * @return SeedDataWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SeedDataWrapper createSeedData(SeedData seedData) throws RestClientException {
        return createSeedDataWithHttpInfo(seedData).getBody();
    }

    /**
     * Create a new version of the seed info.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param seedData Seed data request (required)
     * @return ResponseEntity&lt;SeedDataWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SeedDataWrapper> createSeedDataWithHttpInfo(SeedData seedData) throws RestClientException {
        Object postBody = seedData;
        
        // verify the required parameter 'seedData' is set
        if (seedData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seedData' when calling createSeedData");
        }
        
        String path = apiClient.expandPath("/tessell-ops/seed-data", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SeedDataWrapper> returnType = new ParameterizedTypeReference<SeedDataWrapper>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Return the seed info.
     * Return the seed info.
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param tenantId Filter for a specific tenant (optional)
     * @param version Filter for a specific version (optional)
     * @return SeedDataWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SeedDataWrapper getSeedData(UUID tenantId, Integer version) throws RestClientException {
        return getSeedDataWithHttpInfo(tenantId, version).getBody();
    }

    /**
     * Return the seed info.
     * Return the seed info.
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param tenantId Filter for a specific tenant (optional)
     * @param version Filter for a specific version (optional)
     * @return ResponseEntity&lt;SeedDataWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SeedDataWrapper> getSeedDataWithHttpInfo(UUID tenantId, Integer version) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/seed-data", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant_id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

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

    ParameterizedTypeReference<SeedDataWrapper> returnType = new ParameterizedTypeReference<SeedDataWrapper>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Replicate seed data.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param seedDataWrapper Seed data wrapper request (required)
     * @return SeedDataWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SeedDataWrapper replicateSeedData(SeedDataWrapper seedDataWrapper) throws RestClientException {
        return replicateSeedDataWithHttpInfo(seedDataWrapper).getBody();
    }

    /**
     * Replicate seed data.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param seedDataWrapper Seed data wrapper request (required)
     * @return ResponseEntity&lt;SeedDataWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SeedDataWrapper> replicateSeedDataWithHttpInfo(SeedDataWrapper seedDataWrapper) throws RestClientException {
        Object postBody = seedDataWrapper;
        
        // verify the required parameter 'seedDataWrapper' is set
        if (seedDataWrapper == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seedDataWrapper' when calling replicateSeedData");
        }
        
        String path = apiClient.expandPath("/tessell-internal/seed-data/replicate", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<SeedDataWrapper> returnType = new ParameterizedTypeReference<SeedDataWrapper>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new version of the seed info.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param version Seed data version (required)
     * @param seedData Seed data request (required)
     * @return SeedDataWrapper
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SeedDataWrapper updateSeedData(Integer version, SeedData seedData) throws RestClientException {
        return updateSeedDataWithHttpInfo(version, seedData).getBody();
    }

    /**
     * Create a new version of the seed info.
     * 
     * <p><b>200</b> - Seed data
     * <p><b>0</b> - API error response
     * @param version Seed data version (required)
     * @param seedData Seed data request (required)
     * @return ResponseEntity&lt;SeedDataWrapper&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SeedDataWrapper> updateSeedDataWithHttpInfo(Integer version, SeedData seedData) throws RestClientException {
        Object postBody = seedData;
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling updateSeedData");
        }
        
        // verify the required parameter 'seedData' is set
        if (seedData == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seedData' when calling updateSeedData");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/seed-data/{version}", uriVariables);

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

    ParameterizedTypeReference<SeedDataWrapper> returnType = new ParameterizedTypeReference<SeedDataWrapper>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
