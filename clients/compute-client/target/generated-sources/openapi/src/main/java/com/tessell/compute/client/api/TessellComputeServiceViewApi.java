package com.tessell.compute.client.api;

import com.tessell.compute.client.invoker.ApiClient;

import com.tessell.compute.client.model.TessellApiErrorDTO;
import com.tessell.compute.client.model.TessellCloudTypeDTO;
import com.tessell.compute.client.model.TessellComputeDTO;
import com.tessell.compute.client.model.TessellComputeUseCaseDTO;
import com.tessell.compute.client.model.TessellGetAllAvailableVcpusResponseDTO;

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
@Component("com.tessell.compute.client.api.TessellComputeServiceViewApi")
public class TessellComputeServiceViewApi {
    private ApiClient apiClient;

    public TessellComputeServiceViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellComputeServiceViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all available vcpus, even if some are disabled for an user
     * Get all available vcpus, even if some are disabled for an user
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param cloudType Cloud type of the compute (optional)
     * @return TessellGetAllAvailableVcpusResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetAllAvailableVcpusResponseDTO getAllAvailableVcpus(Integer pageSize, Integer pageOffset, String timeZone, TessellCloudTypeDTO cloudType) throws RestClientException {
        return getAllAvailableVcpusWithHttpInfo(pageSize, pageOffset, timeZone, cloudType).getBody();
    }

    /**
     * Get all available vcpus, even if some are disabled for an user
     * Get all available vcpus, even if some are disabled for an user
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param cloudType Cloud type of the compute (optional)
     * @return ResponseEntity&lt;TessellGetAllAvailableVcpusResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetAllAvailableVcpusResponseDTO> getAllAvailableVcpusWithHttpInfo(Integer pageSize, Integer pageOffset, String timeZone, TessellCloudTypeDTO cloudType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/compute-service/all-available-vcpus", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));

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

    ParameterizedTypeReference<TessellGetAllAvailableVcpusResponseDTO> returnType = new ParameterizedTypeReference<TessellGetAllAvailableVcpusResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Compute Profiles.
     * Get a list of Compute Profiles
     * <p><b>200</b> - List of compute profiles
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionName Subscription Name (optional)
     * @param region Cloud Region (optional)
     * @param cloudType Cloud type of the compute (optional)
     * @param useCases Use Case of the compute (optional)
     * @param includeInternal Includes Internal Computes (optional, default to false)
     * @param allComputes Returns All Computes (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellComputeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellComputeDTO> getComputeProfiles(String tenantId, Boolean includeAvailability, String subscriptionName, String region, TessellCloudTypeDTO cloudType, List<TessellComputeUseCaseDTO> useCases, Boolean includeInternal, Boolean allComputes, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getComputeProfilesWithHttpInfo(tenantId, includeAvailability, subscriptionName, region, cloudType, useCases, includeInternal, allComputes, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of Compute Profiles.
     * Get a list of Compute Profiles
     * <p><b>200</b> - List of compute profiles
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionName Subscription Name (optional)
     * @param region Cloud Region (optional)
     * @param cloudType Cloud type of the compute (optional)
     * @param useCases Use Case of the compute (optional)
     * @param includeInternal Includes Internal Computes (optional, default to false)
     * @param allComputes Returns All Computes (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellComputeDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellComputeDTO>> getComputeProfilesWithHttpInfo(String tenantId, Boolean includeAvailability, String subscriptionName, String region, TessellCloudTypeDTO cloudType, List<TessellComputeUseCaseDTO> useCases, Boolean includeInternal, Boolean allComputes, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getComputeProfiles");
        }
        
        String path = apiClient.expandPath("/compute-service/computes", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-availability", includeAvailability));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-name", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "use-cases", useCases));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-internal", includeInternal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "all-computes", allComputes));
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

    ParameterizedTypeReference<List<TessellComputeDTO>> returnType = new ParameterizedTypeReference<List<TessellComputeDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
