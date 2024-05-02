package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.CreateUpdateDmmAvailabilityPayload;
import com.tessell.dmm.client.model.RefreshTopologyResponseOps;
import com.tessell.dmm.client.model.TessellDmmAvailabilityDTO;
import com.tessell.dmm.client.model.TessellDmmAvailabilityServiceView;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@Component("com.tessell.dmm.client.api.DmmAvailabilityApi")
public class DmmAvailabilityApi {
    private ApiClient apiClient;

    public DmmAvailabilityApi() {
        this(new ApiClient());
    }

    @Autowired
    public DmmAvailabilityApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Associate SLA and Schedule to an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param createUpdateDmmAvailabilityPayload  (required)
     * @return TessellDmmAvailabilityServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityServiceView associateAvailabilityMachineSla(UUID id, CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload) throws RestClientException {
        return associateAvailabilityMachineSlaWithHttpInfo(id, createUpdateDmmAvailabilityPayload).getBody();
    }

    /**
     * Associate SLA and Schedule to an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param createUpdateDmmAvailabilityPayload  (required)
     * @return ResponseEntity&lt;TessellDmmAvailabilityServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityServiceView> associateAvailabilityMachineSlaWithHttpInfo(UUID id, CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload) throws RestClientException {
        Object postBody = createUpdateDmmAvailabilityPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling associateAvailabilityMachineSla");
        }
        
        // verify the required parameter 'createUpdateDmmAvailabilityPayload' is set
        if (createUpdateDmmAvailabilityPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUpdateDmmAvailabilityPayload' when calling associateAvailabilityMachineSla");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sla", uriVariables);

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

    ParameterizedTypeReference<TessellDmmAvailabilityServiceView> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deletes availability associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional, default to )
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDmmAvailabilityOps(UUID dmmId, UUID cloudAccountId, String cloudLocation) throws RestClientException {
        return deleteDmmAvailabilityOpsWithHttpInfo(dmmId, cloudAccountId, cloudLocation).getBody();
    }

    /**
     * Deletes availability associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional, default to )
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDmmAvailabilityOpsWithHttpInfo(UUID dmmId, UUID cloudAccountId, String cloudLocation) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling deleteDmmAvailabilityOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));

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
     * Get the SLA and Schedule associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return TessellDmmAvailabilityServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityServiceView getAvailabilityMachineSla(UUID id) throws RestClientException {
        return getAvailabilityMachineSlaWithHttpInfo(id).getBody();
    }

    /**
     * Get the SLA and Schedule associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return ResponseEntity&lt;TessellDmmAvailabilityServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityServiceView> getAvailabilityMachineSlaWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAvailabilityMachineSla");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sla", uriVariables);

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

    ParameterizedTypeReference<TessellDmmAvailabilityServiceView> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get availability details associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @return TessellDmmAvailabilityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityDTO getDmmAvailabilityOps(UUID dmmId) throws RestClientException {
        return getDmmAvailabilityOpsWithHttpInfo(dmmId).getBody();
    }

    /**
     * Get availability details associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @return ResponseEntity&lt;TessellDmmAvailabilityDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityDTO> getDmmAvailabilityOpsWithHttpInfo(UUID dmmId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDmmAvailabilityOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability", uriVariables);

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

    ParameterizedTypeReference<TessellDmmAvailabilityDTO> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to refresh the topology information
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @return RefreshTopologyResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RefreshTopologyResponseOps refreshDmmTopologyOps(UUID dmmId) throws RestClientException {
        return refreshDmmTopologyOpsWithHttpInfo(dmmId).getBody();
    }

    /**
     * Request to refresh the topology information
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @return ResponseEntity&lt;RefreshTopologyResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RefreshTopologyResponseOps> refreshDmmTopologyOpsWithHttpInfo(UUID dmmId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling refreshDmmTopologyOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/refresh-topology", uriVariables);

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

    ParameterizedTypeReference<RefreshTopologyResponseOps> returnType = new ParameterizedTypeReference<RefreshTopologyResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update SLA association for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param createUpdateDmmAvailabilityPayload  (required)
     * @return TessellDmmAvailabilityServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityServiceView updateAvailabilityMachineSla(UUID id, CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload) throws RestClientException {
        return updateAvailabilityMachineSlaWithHttpInfo(id, createUpdateDmmAvailabilityPayload).getBody();
    }

    /**
     * Update SLA association for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param createUpdateDmmAvailabilityPayload  (required)
     * @return ResponseEntity&lt;TessellDmmAvailabilityServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityServiceView> updateAvailabilityMachineSlaWithHttpInfo(UUID id, CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload) throws RestClientException {
        Object postBody = createUpdateDmmAvailabilityPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateAvailabilityMachineSla");
        }
        
        // verify the required parameter 'createUpdateDmmAvailabilityPayload' is set
        if (createUpdateDmmAvailabilityPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createUpdateDmmAvailabilityPayload' when calling updateAvailabilityMachineSla");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sla", uriVariables);

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

    ParameterizedTypeReference<TessellDmmAvailabilityServiceView> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates availability associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDmmAvailabilityDTO  (required)
     * @return TessellDmmAvailabilityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityDTO updateDmmAvailabilityOps(UUID dmmId, TessellDmmAvailabilityDTO tessellDmmAvailabilityDTO) throws RestClientException {
        return updateDmmAvailabilityOpsWithHttpInfo(dmmId, tessellDmmAvailabilityDTO).getBody();
    }

    /**
     * Updates availability associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDmmAvailabilityDTO  (required)
     * @return ResponseEntity&lt;TessellDmmAvailabilityDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityDTO> updateDmmAvailabilityOpsWithHttpInfo(UUID dmmId, TessellDmmAvailabilityDTO tessellDmmAvailabilityDTO) throws RestClientException {
        Object postBody = tessellDmmAvailabilityDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateDmmAvailabilityOps");
        }
        
        // verify the required parameter 'tessellDmmAvailabilityDTO' is set
        if (tessellDmmAvailabilityDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDmmAvailabilityDTO' when calling updateDmmAvailabilityOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability", uriVariables);

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

    ParameterizedTypeReference<TessellDmmAvailabilityDTO> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
