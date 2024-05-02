package com.tessell.iam.client.api;

import com.tessell.iam.client.invoker.ApiClient;

import com.tessell.iam.client.model.TessellAclApiResponse;
import com.tessell.iam.client.model.TessellAclEntityApiResponse;
import com.tessell.iam.client.model.TessellApiErrorOps;
import com.tessell.iam.client.model.TessellApiStatus;
import com.tessell.iam.client.model.TessellBatchAclPayload;
import com.tessell.iam.client.model.TessellBatchAclResponse;
import com.tessell.iam.client.model.TessellDeleteAclPayload;
import com.tessell.iam.client.model.TessellResourceBulkDeletePayloadOps;
import com.tessell.iam.client.model.TessellResourceBulkDeleteResponseOps;
import com.tessell.iam.client.model.TessellUpdateAclPayload;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@Component("com.tessell.iam.client.api.AclsApi")
public class AclsApi {
    private ApiClient apiClient;

    public AclsApi() {
        this(new ApiClient());
    }

    @Autowired
    public AclsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bulk delete ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps bulkDeleteAcls(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return bulkDeleteAclsWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Bulk delete ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> bulkDeleteAclsWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/acls/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Check if an ACL exists or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param aclName name of acl (required)
     * @param recipientType recipient-type (required)
     * @param recipientId recipient-id (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean checkAclForRecipient(String tenantId, String entityType, UUID entityId, String aclName, String recipientType, String recipientId) throws RestClientException {
        return checkAclForRecipientWithHttpInfo(tenantId, entityType, entityId, aclName, recipientType, recipientId).getBody();
    }

    /**
     * Check if an ACL exists or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param aclName name of acl (required)
     * @param recipientType recipient-type (required)
     * @param recipientId recipient-id (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> checkAclForRecipientWithHttpInfo(String tenantId, String entityType, UUID entityId, String aclName, String recipientType, String recipientId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkAclForRecipient");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling checkAclForRecipient");
        }
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling checkAclForRecipient");
        }
        
        // verify the required parameter 'aclName' is set
        if (aclName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclName' when calling checkAclForRecipient");
        }
        
        // verify the required parameter 'recipientType' is set
        if (recipientType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientType' when calling checkAclForRecipient");
        }
        
        // verify the required parameter 'recipientId' is set
        if (recipientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientId' when calling checkAclForRecipient");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("entity-id", entityId);
        uriVariables.put("acl-name", aclName);
        uriVariables.put("recipient-type", recipientType);
        uriVariables.put("recipient-id", recipientId);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/check-acl/{entity-type}/{entity-id}/{acl-name}/recipients/{recipient-type}/{recipient-id}", uriVariables);

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

    ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if an ACL permission exists or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param permission name of acl permission (required)
     * @return Boolean
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Boolean checkAclPermission(String tenantId, String entityType, UUID entityId, String permission) throws RestClientException {
        return checkAclPermissionWithHttpInfo(tenantId, entityType, entityId, permission).getBody();
    }

    /**
     * Check if an ACL permission exists or not
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param permission name of acl permission (required)
     * @return ResponseEntity&lt;Boolean&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Boolean> checkAclPermissionWithHttpInfo(String tenantId, String entityType, UUID entityId, String permission) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkAclPermission");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling checkAclPermission");
        }
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling checkAclPermission");
        }
        
        // verify the required parameter 'permission' is set
        if (permission == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'permission' when calling checkAclPermission");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("entity-id", entityId);
        uriVariables.put("permission", permission);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}/{entity-id}/check-permission/{permission}", uriVariables);

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

    ParameterizedTypeReference<Boolean> returnType = new ParameterizedTypeReference<Boolean>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Acl for an entity type
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param softDelete softDelete (optional, default to true)
     * @param tessellDeleteAclPayload  (optional)
     * @return TessellApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatus deleteAcls(String tenantId, String entityType, Boolean softDelete, TessellDeleteAclPayload tessellDeleteAclPayload) throws RestClientException {
        return deleteAclsWithHttpInfo(tenantId, entityType, softDelete, tessellDeleteAclPayload).getBody();
    }

    /**
     * Delete an Acl for an entity type
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param softDelete softDelete (optional, default to true)
     * @param tessellDeleteAclPayload  (optional)
     * @return ResponseEntity&lt;TessellApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatus> deleteAclsWithHttpInfo(String tenantId, String entityType, Boolean softDelete, TessellDeleteAclPayload tessellDeleteAclPayload) throws RestClientException {
        Object postBody = tessellDeleteAclPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteAcls");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling deleteAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "softDelete", softDelete));

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

    ParameterizedTypeReference<TessellApiStatus> returnType = new ParameterizedTypeReference<TessellApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of acls with entity type and acl name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param aclName acl-name (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellAclApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclApiResponse getAclsWithAclName(String tenantId, String entityType, String aclName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAclsWithAclNameWithHttpInfo(tenantId, entityType, aclName, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of acls with entity type and acl name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param aclName acl-name (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellAclApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclApiResponse> getAclsWithAclNameWithHttpInfo(String tenantId, String entityType, String aclName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAclsWithAclName");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getAclsWithAclName");
        }
        
        // verify the required parameter 'aclName' is set
        if (aclName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclName' when calling getAclsWithAclName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("acl-name", aclName);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}/acl/{acl-name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellAclApiResponse> returnType = new ParameterizedTypeReference<TessellAclApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of acls with entity type and entity id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellAclApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclApiResponse getAclsWithEntityId(String tenantId, String entityType, UUID entityId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAclsWithEntityIdWithHttpInfo(tenantId, entityType, entityId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of acls with entity type and entity id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellAclApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclApiResponse> getAclsWithEntityIdWithHttpInfo(String tenantId, String entityType, UUID entityId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAclsWithEntityId");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getAclsWithEntityId");
        }
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling getAclsWithEntityId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("entity-id", entityId);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}/{entity-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellAclApiResponse> returnType = new ParameterizedTypeReference<TessellAclApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of acls for an entity type
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellAclApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclApiResponse getAclsWithEntityType(String tenantId, String entityType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAclsWithEntityTypeWithHttpInfo(tenantId, entityType, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of acls for an entity type
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellAclApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclApiResponse> getAclsWithEntityTypeWithHttpInfo(String tenantId, String entityType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAclsWithEntityType");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getAclsWithEntityType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellAclApiResponse> returnType = new ParameterizedTypeReference<TessellAclApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of acls with entity type, entity id, recipient type and recipient id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param recipientType recipient-type (required)
     * @param recipientId recipient-id (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellAclApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclApiResponse getAclsWithRecipientId(String tenantId, String entityType, UUID entityId, String recipientType, String recipientId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAclsWithRecipientIdWithHttpInfo(tenantId, entityType, entityId, recipientType, recipientId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of acls with entity type, entity id, recipient type and recipient id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param recipientType recipient-type (required)
     * @param recipientId recipient-id (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellAclApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclApiResponse> getAclsWithRecipientIdWithHttpInfo(String tenantId, String entityType, UUID entityId, String recipientType, String recipientId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAclsWithRecipientId");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getAclsWithRecipientId");
        }
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling getAclsWithRecipientId");
        }
        
        // verify the required parameter 'recipientType' is set
        if (recipientType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientType' when calling getAclsWithRecipientId");
        }
        
        // verify the required parameter 'recipientId' is set
        if (recipientId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientId' when calling getAclsWithRecipientId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("entity-id", entityId);
        uriVariables.put("recipient-type", recipientType);
        uriVariables.put("recipient-id", recipientId);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}/{entity-id}/recipients/{recipient-type}/{recipient-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellAclApiResponse> returnType = new ParameterizedTypeReference<TessellAclApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of acls with entity type, entity id and recipient type
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param recipientType recipient-type (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return TessellAclEntityApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclEntityApiResponse getAclsWithRecipientType(String tenantId, String entityType, UUID entityId, String recipientType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAclsWithRecipientTypeWithHttpInfo(tenantId, entityType, entityId, recipientType, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of acls with entity type, entity id and recipient type
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param entityId entity-id (required)
     * @param recipientType recipient-type (required)
     * @param pageSize page-size (optional, default to 0)
     * @param pageOffset page-offset (optional, default to 10)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellAclEntityApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclEntityApiResponse> getAclsWithRecipientTypeWithHttpInfo(String tenantId, String entityType, UUID entityId, String recipientType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getAclsWithRecipientType");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling getAclsWithRecipientType");
        }
        
        // verify the required parameter 'entityId' is set
        if (entityId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityId' when calling getAclsWithRecipientType");
        }
        
        // verify the required parameter 'recipientType' is set
        if (recipientType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'recipientType' when calling getAclsWithRecipientType");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        uriVariables.put("entity-id", entityId);
        uriVariables.put("recipient-type", recipientType);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}/{entity-id}/recipients/{recipient-type}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellAclEntityApiResponse> returnType = new ParameterizedTypeReference<TessellAclEntityApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Batch acl api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBatchAclPayload  (optional)
     * @return TessellBatchAclResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBatchAclResponse getBatchAcls(String tenantId, TessellBatchAclPayload tessellBatchAclPayload) throws RestClientException {
        return getBatchAclsWithHttpInfo(tenantId, tessellBatchAclPayload).getBody();
    }

    /**
     * Batch acl api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBatchAclPayload  (optional)
     * @return ResponseEntity&lt;TessellBatchAclResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBatchAclResponse> getBatchAclsWithHttpInfo(String tenantId, TessellBatchAclPayload tessellBatchAclPayload) throws RestClientException {
        Object postBody = tessellBatchAclPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBatchAcls");
        }
        
        String path = apiClient.expandPath("/iam/tessell-internal/batch-acls", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellBatchAclResponse> returnType = new ParameterizedTypeReference<TessellBatchAclResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status of bulk deletion of ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return TessellResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOps getStatusOfBulkDeleteAcls(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        return getStatusOfBulkDeleteAclsWithHttpInfo(tessellResourceBulkDeletePayloadOps).getBody();
    }

    /**
     * Get status of bulk deletion of ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellResourceBulkDeletePayloadOps  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOps> getStatusOfBulkDeleteAclsWithHttpInfo(TessellResourceBulkDeletePayloadOps tessellResourceBulkDeletePayloadOps) throws RestClientException {
        Object postBody = tessellResourceBulkDeletePayloadOps;
        
        String path = apiClient.expandPath("/tessell-ops/iam/acls/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Share an entity
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param tessellUpdateAclPayload  (optional)
     * @return TessellAclApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclApiResponse updateAcls(String tenantId, String entityType, TessellUpdateAclPayload tessellUpdateAclPayload) throws RestClientException {
        return updateAclsWithHttpInfo(tenantId, entityType, tessellUpdateAclPayload).getBody();
    }

    /**
     * Share an entity
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param entityType entity-type (required)
     * @param tessellUpdateAclPayload  (optional)
     * @return ResponseEntity&lt;TessellAclApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclApiResponse> updateAclsWithHttpInfo(String tenantId, String entityType, TessellUpdateAclPayload tessellUpdateAclPayload) throws RestClientException {
        Object postBody = tessellUpdateAclPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateAcls");
        }
        
        // verify the required parameter 'entityType' is set
        if (entityType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'entityType' when calling updateAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("entity-type", entityType);
        String path = apiClient.expandPath("/iam/tessell-internal/acls/{entity-type}", uriVariables);

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

    ParameterizedTypeReference<TessellAclApiResponse> returnType = new ParameterizedTypeReference<TessellAclApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
