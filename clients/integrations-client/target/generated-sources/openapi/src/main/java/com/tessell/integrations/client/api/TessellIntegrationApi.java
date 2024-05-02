package com.tessell.integrations.client.api;

import com.tessell.integrations.client.invoker.ApiClient;

import com.tessell.integrations.client.model.TessellAclEligibleUserDTO;
import com.tessell.integrations.client.model.TessellAclPayloadDTO;
import com.tessell.integrations.client.model.TessellAclRevokePayloadDTO;
import com.tessell.integrations.client.model.TessellApiErrorDTO;
import com.tessell.integrations.client.model.TessellApiErrorOpsDTO;
import com.tessell.integrations.client.model.TessellApiStatusDTO;
import com.tessell.integrations.client.model.TessellTessellIntegrationDTODTO;
import com.tessell.integrations.client.model.TessellTessellIntegrationListResponseDTO;
import com.tessell.integrations.client.model.TessellTessellIntegrationTypeDTO;
import com.tessell.integrations.client.model.TessellTessellIntegrationTypeDTODTO;
import com.tessell.integrations.client.model.TessellTessellIntegrationTypeListResponseDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:57.635527+05:30[Asia/Kolkata]")
@Component("com.tessell.integrations.client.api.TessellIntegrationApi")
public class TessellIntegrationApi {
    private ApiClient apiClient;

    public TessellIntegrationApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellIntegrationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellTessellIntegrationDTODTO  (optional)
     * @return TessellTessellIntegrationDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationDTODTO createIntegration(String tenantId, TessellTessellIntegrationDTODTO tessellTessellIntegrationDTODTO) throws RestClientException {
        return createIntegrationWithHttpInfo(tenantId, tessellTessellIntegrationDTODTO).getBody();
    }

    /**
     * Create a new Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellTessellIntegrationDTODTO  (optional)
     * @return ResponseEntity&lt;TessellTessellIntegrationDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationDTODTO> createIntegrationWithHttpInfo(String tenantId, TessellTessellIntegrationDTODTO tessellTessellIntegrationDTODTO) throws RestClientException {
        Object postBody = tessellTessellIntegrationDTODTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createIntegration");
        }
        
        String path = apiClient.expandPath("/integrations/governance", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellTessellIntegrationDTODTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create/Update ACLs of an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return TessellAclPayloadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclPayloadDTO createIntegrationAcls(UUID id, String tenantId, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        return createIntegrationAclsWithHttpInfo(id, tenantId, tessellAclPayloadDTO).getBody();
    }

    /**
     * Create/Update ACLs of an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAclPayloadDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclPayloadDTO> createIntegrationAclsWithHttpInfo(UUID id, String tenantId, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        Object postBody = tessellAclPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createIntegrationAcls");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createIntegrationAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/governance/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellAclPayloadDTO> returnType = new ParameterizedTypeReference<TessellAclPayloadDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteIntegration(UUID id, String tenantId) throws RestClientException {
        deleteIntegrationWithHttpInfo(id, tenantId);
    }

    /**
     * Delete an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteIntegrationWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteIntegration");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteIntegration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/governance/{id}", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of all users along with role they are eligible on an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param role Name of roles (optional)
     * @return List&lt;TessellAclEligibleUserDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAclEligibleUserDTO> getEligibleUsersForIntegration(UUID id, String tenantId, List<String> role) throws RestClientException {
        return getEligibleUsersForIntegrationWithHttpInfo(id, tenantId, role).getBody();
    }

    /**
     * Get a list of all users along with role they are eligible on an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param role Name of roles (optional)
     * @return ResponseEntity&lt;List&lt;TessellAclEligibleUserDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAclEligibleUserDTO>> getEligibleUsersForIntegrationWithHttpInfo(UUID id, String tenantId, List<String> role) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEligibleUsersForIntegration");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getEligibleUsersForIntegration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/governance/{id}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "role", role));

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

    ParameterizedTypeReference<List<TessellAclEligibleUserDTO>> returnType = new ParameterizedTypeReference<List<TessellAclEligibleUserDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get active Integration Details by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellTessellIntegrationDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationDTODTO getIntegrationById(UUID id, String tenantId) throws RestClientException {
        return getIntegrationByIdWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Get active Integration Details by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellTessellIntegrationDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationDTODTO> getIntegrationByIdWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getIntegrationById");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIntegrationById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/governance/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellTessellIntegrationDTODTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get active Integration by Id (consumer view)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellTessellIntegrationDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationDTODTO getIntegrationByIdConsumerView(UUID id, String tenantId) throws RestClientException {
        return getIntegrationByIdConsumerViewWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Get active Integration by Id (consumer view)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellTessellIntegrationDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationDTODTO> getIntegrationByIdConsumerViewWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getIntegrationByIdConsumerView");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIntegrationByIdConsumerView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellTessellIntegrationDTODTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Integration by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellTessellIntegrationDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationDTODTO getIntegrationByIdOps(UUID id, String tenantId) throws RestClientException {
        return getIntegrationByIdOpsWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * Get Integration by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellTessellIntegrationDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationDTODTO> getIntegrationByIdOpsWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getIntegrationByIdOps");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIntegrationByIdOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/integrations/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellTessellIntegrationDTODTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Integration Type by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return TessellTessellIntegrationTypeDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationTypeDTODTO getIntegrationTypeById(UUID id) throws RestClientException {
        return getIntegrationTypeByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get Integration Type by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID (required)
     * @return ResponseEntity&lt;TessellTessellIntegrationTypeDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationTypeDTODTO> getIntegrationTypeByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getIntegrationTypeById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integration-types/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellTessellIntegrationTypeDTODTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationTypeDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of supported Integration Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param integrationType integration-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellTessellIntegrationTypeListResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationTypeListResponseDTO getIntegrationTypes(TessellTessellIntegrationTypeDTO integrationType, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getIntegrationTypesWithHttpInfo(integrationType, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of supported Integration Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param integrationType integration-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellTessellIntegrationTypeListResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationTypeListResponseDTO> getIntegrationTypesWithHttpInfo(TessellTessellIntegrationTypeDTO integrationType, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/integration-types", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "integration-type", integrationType));
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

    ParameterizedTypeReference<TessellTessellIntegrationTypeListResponseDTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationTypeListResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of active Integrations
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id ID of an Integration (optional)
     * @param integrationType Type of an Integration (optional)
     * @param includeSharedWithUsers Flag indicating if ACL information should be included for all entities (optional)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellTessellIntegrationListResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationListResponseDTO getIntegrations(String tenantId, UUID id, TessellTessellIntegrationTypeDTO integrationType, Boolean includeSharedWithUsers, List<String> owners, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getIntegrationsWithHttpInfo(tenantId, id, integrationType, includeSharedWithUsers, owners, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of active Integrations
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id ID of an Integration (optional)
     * @param integrationType Type of an Integration (optional)
     * @param includeSharedWithUsers Flag indicating if ACL information should be included for all entities (optional)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellTessellIntegrationListResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationListResponseDTO> getIntegrationsWithHttpInfo(String tenantId, UUID id, TessellTessellIntegrationTypeDTO integrationType, Boolean includeSharedWithUsers, List<String> owners, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIntegrations");
        }
        
        String path = apiClient.expandPath("/integrations/governance", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "integration-type", integrationType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-shared-with-users", includeSharedWithUsers));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
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

    ParameterizedTypeReference<TessellTessellIntegrationListResponseDTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationListResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of active Integrations (consumer view)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param integrationType integration-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellTessellIntegrationListResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellTessellIntegrationListResponseDTO getIntegrationsConsumerView(String tenantId, TessellTessellIntegrationTypeDTO integrationType, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getIntegrationsConsumerViewWithHttpInfo(tenantId, integrationType, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of active Integrations (consumer view)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param integrationType integration-type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellTessellIntegrationListResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellTessellIntegrationListResponseDTO> getIntegrationsConsumerViewWithHttpInfo(String tenantId, TessellTessellIntegrationTypeDTO integrationType, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getIntegrationsConsumerView");
        }
        
        String path = apiClient.expandPath("/integrations", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "integration-type", integrationType));
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

    ParameterizedTypeReference<TessellTessellIntegrationListResponseDTO> returnType = new ParameterizedTypeReference<TessellTessellIntegrationListResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revoke access of given users on an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO revokeIntegrationAcls(UUID id, String tenantId, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        return revokeIntegrationAclsWithHttpInfo(id, tenantId, tessellAclRevokePayloadDTO).getBody();
    }

    /**
     * Revoke access of given users on an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param tenantId Id of the Tenant (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> revokeIntegrationAclsWithHttpInfo(UUID id, String tenantId, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        Object postBody = tessellAclRevokePayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling revokeIntegrationAcls");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling revokeIntegrationAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/integrations/governance/{id}/acls", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param action Update the integration maturity status as \&quot;publish\&quot; and \&quot;unpublish\&quot; (required)
     * @param tenantId Id of the Tenant (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO updateIntegration(UUID id, String action, String tenantId) throws RestClientException {
        return updateIntegrationWithHttpInfo(id, action, tenantId).getBody();
    }

    /**
     * Update an Integration
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of an Integration (required)
     * @param action Update the integration maturity status as \&quot;publish\&quot; and \&quot;unpublish\&quot; (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> updateIntegrationWithHttpInfo(UUID id, String action, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateIntegration");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateIntegration");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateIntegration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/integrations/governance/{id}/{action}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
