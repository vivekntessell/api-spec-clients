package com.tessell.compute.client.api;

import com.tessell.compute.client.invoker.ApiClient;

import com.tessell.compute.client.model.TessellApiErrorOpsDTO;
import com.tessell.compute.client.model.TessellCloudTypeDTO;
import com.tessell.compute.client.model.TessellComputeInternalViewDTO;
import com.tessell.compute.client.model.TessellGetComputeUpdatedIdDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@Component("com.tessell.compute.client.api.TessellComputeInternalViewApi")
public class TessellComputeInternalViewApi {
    private ApiClient apiClient;

    public TessellComputeInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellComputeInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns a compute profile.
     * Returns a compute profile.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id Compute Profile identifier (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionId Subscription ID (optional)
     * @param includeDisabled Flag to include/exclude disabled in computes curation in response (optional, default to false)
     * @return TessellComputeInternalViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeInternalViewDTO iGetComputeProfileById(String tenantId, UUID id, Boolean includeAvailability, UUID subscriptionId, Boolean includeDisabled) throws RestClientException {
        return iGetComputeProfileByIdWithHttpInfo(tenantId, id, includeAvailability, subscriptionId, includeDisabled).getBody();
    }

    /**
     * Returns a compute profile.
     * Returns a compute profile.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id Compute Profile identifier (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionId Subscription ID (optional)
     * @param includeDisabled Flag to include/exclude disabled in computes curation in response (optional, default to false)
     * @return ResponseEntity&lt;TessellComputeInternalViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeInternalViewDTO> iGetComputeProfileByIdWithHttpInfo(String tenantId, UUID id, Boolean includeAvailability, UUID subscriptionId, Boolean includeDisabled) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling iGetComputeProfileById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling iGetComputeProfileById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/compute-service/tessell-internal/compute/id/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-availability", includeAvailability));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-disabled", includeDisabled));

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

    ParameterizedTypeReference<TessellComputeInternalViewDTO> returnType = new ParameterizedTypeReference<TessellComputeInternalViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns a compute profile.
     * Returns a compute profile.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param cloudType Cloud type of the compute (required)
     * @param name Compute Name (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionId Subscription ID (optional)
     * @param includeDisabled Flag to include/exclude disabled in computes curation in response (optional, default to false)
     * @return TessellComputeInternalViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellComputeInternalViewDTO iGetComputeProfileByName(String tenantId, TessellCloudTypeDTO cloudType, String name, Boolean includeAvailability, UUID subscriptionId, Boolean includeDisabled) throws RestClientException {
        return iGetComputeProfileByNameWithHttpInfo(tenantId, cloudType, name, includeAvailability, subscriptionId, includeDisabled).getBody();
    }

    /**
     * Returns a compute profile.
     * Returns a compute profile.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param cloudType Cloud type of the compute (required)
     * @param name Compute Name (required)
     * @param includeAvailability Whether to include availability info (optional, default to false)
     * @param subscriptionId Subscription ID (optional)
     * @param includeDisabled Flag to include/exclude disabled in computes curation in response (optional, default to false)
     * @return ResponseEntity&lt;TessellComputeInternalViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellComputeInternalViewDTO> iGetComputeProfileByNameWithHttpInfo(String tenantId, TessellCloudTypeDTO cloudType, String name, Boolean includeAvailability, UUID subscriptionId, Boolean includeDisabled) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling iGetComputeProfileByName");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling iGetComputeProfileByName");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling iGetComputeProfileByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("cloudType", cloudType);
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/compute-service/tessell-internal/compute/{cloudType}/name/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-availability", includeAvailability));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-id", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-disabled", includeDisabled));

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

    ParameterizedTypeReference<TessellComputeInternalViewDTO> returnType = new ParameterizedTypeReference<TessellComputeInternalViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns Computes Updated Id
     * Returns Computes Updated Id.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Compute profile identifier (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellGetComputeUpdatedIdDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetComputeUpdatedIdDTO iGetComputeUpdatedId(UUID id, String timeZone) throws RestClientException {
        return iGetComputeUpdatedIdWithHttpInfo(id, timeZone).getBody();
    }

    /**
     * Returns Computes Updated Id
     * Returns Computes Updated Id.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Compute profile identifier (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellGetComputeUpdatedIdDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetComputeUpdatedIdDTO> iGetComputeUpdatedIdWithHttpInfo(UUID id, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling iGetComputeUpdatedId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/compute-service/tessell-internal/compute/id/{id}/getUpdatedId", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TessellGetComputeUpdatedIdDTO> returnType = new ParameterizedTypeReference<TessellGetComputeUpdatedIdDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
