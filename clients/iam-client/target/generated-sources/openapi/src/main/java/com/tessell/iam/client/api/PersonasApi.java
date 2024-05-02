package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellApiError;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellConsumerType;
import com.tessell.iam.client.model.TessellCreatePersonaPayload;
import com.tessell.iam.client.model.TessellIamApiResponse;
import com.tessell.iam.client.model.TessellPersonaDTO;
import com.tessell.iam.client.model.TessellPersonaStatus;
import com.tessell.iam.client.model.TessellResourceBulkDeletePayloadOps;
import com.tessell.iam.client.model.TessellResourceBulkDeleteResponseOps;
import com.tessell.iam.client.model.TessellUpdatePersonaPayload;
import com.tessell.iam.client.model.TessellUpgradablePersonaApiResponse;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@Component("com.tessell.iam.client.api.PersonasApi")
public class PersonasApi {
    private ApiClient apiClient;

    public PersonasApi() {
        this(new ApiClient());
    }

    @Autowired
    public PersonasApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bulk delete Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps bulkDeletePersonas(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return bulkDeletePersonasWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Bulk delete Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> bulkDeletePersonasWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/personas/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreatePersonaPayload  (optional)
     * @return TessellPersonaDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPersonaDTO createPersona(String tenantId, TessellCreatePersonaPayload tessellCreatePersonaPayload) throws RestClientException {
        return createPersonaWithHttpInfo(tenantId, tessellCreatePersonaPayload).getBody();
    }

    /**
     * Create a new Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param tessellCreatePersonaPayload  (optional)
     * @return ResponseEntity&lt;TessellPersonaDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPersonaDTO> createPersonaWithHttpInfo(String tenantId, TessellCreatePersonaPayload tessellCreatePersonaPayload) throws RestClientException {
        Object postBody = tessellCreatePersonaPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createPersona");
        }
        
        String path = apiClient.expandPath("/iam/personas", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPersonaDTO> returnType = new ParameterizedTypeReference<TessellPersonaDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name name (required)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deletePersona(String tenantId, String name) throws RestClientException {
        return deletePersonaWithHttpInfo(tenantId, name).getBody();
    }

    /**
     * Delete a Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name name (required)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deletePersonaWithHttpInfo(String tenantId, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deletePersona");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deletePersona");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/iam/personas/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param loadApps Flag to include/exclude Application details in response (optional, default to false)
     * @param loadPrivileges Flag to include/exclude Privilege details in response (only applicable when consumer-type is OPS) (optional, default to false)
     * @param status Filter by status (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellIamApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellIamApiResponse getPersonas(String tenantId, Boolean loadApps, Boolean loadPrivileges, List<TessellPersonaStatus> status, TessellConsumerType consumerType) throws RestClientException {
        return getPersonasWithHttpInfo(tenantId, loadApps, loadPrivileges, status, consumerType).getBody();
    }

    /**
     * Get a list of Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param loadApps Flag to include/exclude Application details in response (optional, default to false)
     * @param loadPrivileges Flag to include/exclude Privilege details in response (only applicable when consumer-type is OPS) (optional, default to false)
     * @param status Filter by status (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellIamApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellIamApiResponse> getPersonasWithHttpInfo(String tenantId, Boolean loadApps, Boolean loadPrivileges, List<TessellPersonaStatus> status, TessellConsumerType consumerType) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getPersonas");
        }
        
        String path = apiClient.expandPath("/iam/personas", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-apps", loadApps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-privileges", loadPrivileges));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellIamApiResponse> returnType = new ParameterizedTypeReference<TessellIamApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status of bulk deletion of Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps getStatusOfBulkDeletePersonas(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return getStatusOfBulkDeletePersonasWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Get status of bulk deletion of Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> getStatusOfBulkDeletePersonasWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/personas/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get upgradable list of Personas for all the Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return TessellUpgradablePersonaApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellUpgradablePersonaApiResponse getUpgradablePersonas(String tenantId) throws RestClientException {
        return getUpgradablePersonasWithHttpInfo(tenantId).getBody();
    }

    /**
     * Get upgradable list of Personas for all the Personas
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellUpgradablePersonaApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellUpgradablePersonaApiResponse> getUpgradablePersonasWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getUpgradablePersonas");
        }
        
        String path = apiClient.expandPath("/iam/personas/upgradable-personas", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellUpgradablePersonaApiResponse> returnType = new ParameterizedTypeReference<TessellUpgradablePersonaApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name name (required)
     * @param tessellUpdatePersonaPayload  (optional)
     * @return TessellPersonaDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPersonaDTO updatePersona(String tenantId, String name, TessellUpdatePersonaPayload tessellUpdatePersonaPayload) throws RestClientException {
        return updatePersonaWithHttpInfo(tenantId, name, tessellUpdatePersonaPayload).getBody();
    }

    /**
     * Update a Persona
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param name name (required)
     * @param tessellUpdatePersonaPayload  (optional)
     * @return ResponseEntity&lt;TessellPersonaDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPersonaDTO> updatePersonaWithHttpInfo(String tenantId, String name, TessellUpdatePersonaPayload tessellUpdatePersonaPayload) throws RestClientException {
        Object postBody = tessellUpdatePersonaPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updatePersona");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updatePersona");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/iam/personas/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellPersonaDTO> returnType = new ParameterizedTypeReference<TessellPersonaDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
