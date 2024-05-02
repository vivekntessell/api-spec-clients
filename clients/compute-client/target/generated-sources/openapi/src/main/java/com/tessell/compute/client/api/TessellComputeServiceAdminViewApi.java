package com.tessell.compute.client.api;

import com.tessell.compute.client.invoker.ApiClient;

import com.tessell.compute.client.model.TessellApiErrorDTO;
import com.tessell.compute.client.model.TessellApiStatusDTO;
import com.tessell.compute.client.model.TessellCloudTypeDTO;
import com.tessell.compute.client.model.TessellComputeAdminViewDTO;
import com.tessell.compute.client.model.TessellComputeUseCaseDTO;
import com.tessell.compute.client.model.TessellUpdateComputeRegionRequestDTO;
import com.tessell.compute.client.model.TessellUpdateComputeRegionResponseDTO;
import com.tessell.compute.client.model.TessellUpdateComputeStatusRequestDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@Component("com.tessell.compute.client.api.TessellComputeServiceAdminViewApi")
public class TessellComputeServiceAdminViewApi {
    private ApiClient apiClient;

    public TessellComputeServiceAdminViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellComputeServiceAdminViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all compute profiles.
     * Get all compute profiles.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionName Subscription Name (optional)
     * @param cloudType Cloud type of the compute (optional)
     * @param useCases Use Case of the compute (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellComputeAdminViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellComputeAdminViewDTO> getAllComputeProfiles(String tenantId, Boolean includeAvailability, String subscriptionName, TessellCloudTypeDTO cloudType, List<TessellComputeUseCaseDTO> useCases, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getAllComputeProfilesWithHttpInfo(tenantId, includeAvailability, subscriptionName, cloudType, useCases, pageSize, pageOffset).getBody();
    }

    /**
     * Get all compute profiles.
     * Get all compute profiles.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionName Subscription Name (optional)
     * @param cloudType Cloud type of the compute (optional)
     * @param useCases Use Case of the compute (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellComputeAdminViewDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellComputeAdminViewDTO>> getAllComputeProfilesWithHttpInfo(String tenantId, Boolean includeAvailability, String subscriptionName, TessellCloudTypeDTO cloudType, List<TessellComputeUseCaseDTO> useCases, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAllComputeProfiles");
        }
        
        String path = apiClient.expandPath("/compute-service/governance/computes", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-availability", includeAvailability));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-name", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "use-cases", useCases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<List<TessellComputeAdminViewDTO>> returnType = new ParameterizedTypeReference<List<TessellComputeAdminViewDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update compute regions
     * Update compute regions
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name Compute Name (required)
     * @param subscriptionName Subscription Name (required)
     * @param tessellUpdateComputeRegionRequestDTO  (required)
     * @return TessellUpdateComputeRegionResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUpdateComputeRegionResponseDTO updateComputeRegions(String tenantId, String name, String subscriptionName, TessellUpdateComputeRegionRequestDTO tessellUpdateComputeRegionRequestDTO) throws RestClientException {
        return updateComputeRegionsWithHttpInfo(tenantId, name, subscriptionName, tessellUpdateComputeRegionRequestDTO).getBody();
    }

    /**
     * Update compute regions
     * Update compute regions
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name Compute Name (required)
     * @param subscriptionName Subscription Name (required)
     * @param tessellUpdateComputeRegionRequestDTO  (required)
     * @return ResponseEntity&lt;TessellUpdateComputeRegionResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUpdateComputeRegionResponseDTO> updateComputeRegionsWithHttpInfo(String tenantId, String name, String subscriptionName, TessellUpdateComputeRegionRequestDTO tessellUpdateComputeRegionRequestDTO) throws RestClientException {
        Object postBody = tessellUpdateComputeRegionRequestDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateComputeRegions");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateComputeRegions");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling updateComputeRegions");
        }
        
        // verify the required parameter 'tessellUpdateComputeRegionRequestDTO' is set
        if (tessellUpdateComputeRegionRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellUpdateComputeRegionRequestDTO' when calling updateComputeRegions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("subscription-name", subscriptionName);
        String path = apiClient.expandPath("/compute-service/governance/computes/{name}/subscription/{subscription-name}/regions", uriVariables);

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellUpdateComputeRegionResponseDTO> returnType = new ParameterizedTypeReference<TessellUpdateComputeRegionResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enable/Disable compute profile
     * Enable/Disable compute profile
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name Compute Name (required)
     * @param subscriptionName Subscription Name (required)
     * @param tessellUpdateComputeStatusRequestDTO  (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO updateComputeStatus(String tenantId, String name, String subscriptionName, TessellUpdateComputeStatusRequestDTO tessellUpdateComputeStatusRequestDTO) throws RestClientException {
        return updateComputeStatusWithHttpInfo(tenantId, name, subscriptionName, tessellUpdateComputeStatusRequestDTO).getBody();
    }

    /**
     * Enable/Disable compute profile
     * Enable/Disable compute profile
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name Compute Name (required)
     * @param subscriptionName Subscription Name (required)
     * @param tessellUpdateComputeStatusRequestDTO  (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> updateComputeStatusWithHttpInfo(String tenantId, String name, String subscriptionName, TessellUpdateComputeStatusRequestDTO tessellUpdateComputeStatusRequestDTO) throws RestClientException {
        Object postBody = tessellUpdateComputeStatusRequestDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateComputeStatus");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateComputeStatus");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling updateComputeStatus");
        }
        
        // verify the required parameter 'tessellUpdateComputeStatusRequestDTO' is set
        if (tessellUpdateComputeStatusRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellUpdateComputeStatusRequestDTO' when calling updateComputeStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("subscription-name", subscriptionName);
        String path = apiClient.expandPath("/compute-service/governance/computes/{name}/subscription/{subscription-name}", uriVariables);

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
