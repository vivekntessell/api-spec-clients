package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.AclEligibleUser;
import com.tessell.dmm.client.model.AclPayload;
import com.tessell.dmm.client.model.AclRevokePayload;
import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.AvailabilityMachineCatalogHealth;
import com.tessell.dmm.client.model.BackupDownloadConfig;
import com.tessell.dmm.client.model.BulkDeleteTessellAmsPayload;
import com.tessell.dmm.client.model.BulkDeleteTessellAmsStatusPayload;
import com.tessell.dmm.client.model.DataflixDownloadUrlInfo;
import com.tessell.dmm.client.model.DbPitrChainInfo;
import com.tessell.dmm.client.model.DmmStatus;
import com.tessell.dmm.client.model.EntityAclSharingInfo;
import com.tessell.dmm.client.model.GetDataflixBackupCatalogResponse;
import com.tessell.dmm.client.model.GetDataflixCatalogResponse;
import com.tessell.dmm.client.model.GetDataflixSanitizedCatalogResponse;
import com.tessell.dmm.client.model.GetDmmsApiResponse;
import com.tessell.dmm.client.model.GetDmmsServiceView;
import com.tessell.dmm.client.model.PauseTessellDmmPayload;
import com.tessell.dmm.client.model.PreAuthUrlDTO;
import com.tessell.dmm.client.model.PreAuthUrlStatusOps;
import com.tessell.dmm.client.model.ResourceBulkDeleteResponseOps;
import com.tessell.dmm.client.model.ResumeTessellDmmPayload;
import com.tessell.dmm.client.model.TaskSummary;
import com.tessell.dmm.client.model.TessellAmDataflixDTO;
import com.tessell.dmm.client.model.TessellDataflixResponse;
import com.tessell.dmm.client.model.TessellDeleteDbCallbackPayload;
import com.tessell.dmm.client.model.TessellDmmAvailabilityCatalog;
import com.tessell.dmm.client.model.TessellDmmAvailabilityCatalogServiceView;
import com.tessell.dmm.client.model.TessellDmmDTO;
import com.tessell.dmm.client.model.TessellDmmServiceConsumerDTO;
import com.tessell.dmm.client.model.TessellDmmSizeDTO;
import com.tessell.dmm.client.model.TessellDmmSizeOpsDTO;
import java.util.UUID;
import com.tessell.dmm.client.model.UpdateBackupDownloadConfigPayload;
import com.tessell.dmm.client.model.UpdateDapReplStatusPayload;

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
@Component("com.tessell.dmm.client.api.DmmApi")
public class DmmApi {
    private ApiClient apiClient;

    public DmmApi() {
        this(new ApiClient());
    }

    @Autowired
    public DmmApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete the tessell ams for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellAmsPayload  (required)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps bulkDeleteTessellAms(BulkDeleteTessellAmsPayload bulkDeleteTessellAmsPayload) throws RestClientException {
        return bulkDeleteTessellAmsWithHttpInfo(bulkDeleteTessellAmsPayload).getBody();
    }

    /**
     * Delete the tessell ams for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellAmsPayload  (required)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> bulkDeleteTessellAmsWithHttpInfo(BulkDeleteTessellAmsPayload bulkDeleteTessellAmsPayload) throws RestClientException {
        Object postBody = bulkDeleteTessellAmsPayload;
        
        // verify the required parameter 'bulkDeleteTessellAmsPayload' is set
        if (bulkDeleteTessellAmsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bulkDeleteTessellAmsPayload' when calling bulkDeleteTessellAms");
        }
        
        String path = apiClient.expandPath("/tessell-ops/availability-machines/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if the AM service is up (liveness probe)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return GetDmmsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDmmsApiResponse checkLiveness() throws RestClientException {
        return checkLivenessWithHttpInfo().getBody();
    }

    /**
     * Check if the AM service is up (liveness probe)
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;GetDmmsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDmmsApiResponse> checkLivenessWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/liveness", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GetDmmsApiResponse> returnType = new ParameterizedTypeReference<GetDmmsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create or update ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param aclPayload  (required)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload createAvailabilityMachineAcls(UUID id, AclPayload aclPayload) throws RestClientException {
        return createAvailabilityMachineAclsWithHttpInfo(id, aclPayload).getBody();
    }

    /**
     * Create or update ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param aclPayload  (required)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> createAvailabilityMachineAclsWithHttpInfo(UUID id, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createAvailabilityMachineAcls");
        }
        
        // verify the required parameter 'aclPayload' is set
        if (aclPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclPayload' when calling createAvailabilityMachineAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<AclPayload> returnType = new ParameterizedTypeReference<AclPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDmmDTO  (required)
     * @return TessellDmmDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmDTO createDmm(TessellDmmDTO tessellDmmDTO) throws RestClientException {
        return createDmmWithHttpInfo(tessellDmmDTO).getBody();
    }

    /**
     * Create a new Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDmmDTO  (required)
     * @return ResponseEntity&lt;TessellDmmDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmDTO> createDmmWithHttpInfo(TessellDmmDTO tessellDmmDTO) throws RestClientException {
        Object postBody = tessellDmmDTO;
        
        // verify the required parameter 'tessellDmmDTO' is set
        if (tessellDmmDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDmmDTO' when calling createDmm");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellDmmDTO> returnType = new ParameterizedTypeReference<TessellDmmDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete the Availability Machine and the associated data (if any) including snapshots, sanitized-snapshots, and backups.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteAvailabilityMachine(UUID id) throws RestClientException {
        return deleteAvailabilityMachineWithHttpInfo(id).getBody();
    }

    /**
     * Delete the Availability Machine and the associated data (if any) including snapshots, sanitized-snapshots, and backups.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteAvailabilityMachineWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteAvailabilityMachine");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for DB Service deletion for DMM
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDeleteDbCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseCallbackForDmm(UUID id, TessellDeleteDbCallbackPayload tessellDeleteDbCallbackPayload) throws RestClientException {
        return deleteDatabaseCallbackForDmmWithHttpInfo(id, tessellDeleteDbCallbackPayload).getBody();
    }

    /**
     * Callback for DB Service deletion for DMM
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDeleteDbCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseCallbackForDmmWithHttpInfo(UUID id, TessellDeleteDbCallbackPayload tessellDeleteDbCallbackPayload) throws RestClientException {
        Object postBody = tessellDeleteDbCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDatabaseCallbackForDmm");
        }
        
        // verify the required parameter 'tessellDeleteDbCallbackPayload' is set
        if (tessellDeleteDbCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDeleteDbCallbackPayload' when calling deleteDatabaseCallbackForDmm");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/delete-db-callback", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDmm(String id, Boolean softDelete) throws RestClientException {
        return deleteDmmWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDmmWithHttpInfo(String id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDmm");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "softDelete", softDelete));

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
     * mark pre auth url delete
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deletePreAuthUrl(UUID dmmId, UUID backupId, UUID id) throws RestClientException {
        return deletePreAuthUrlWithHttpInfo(dmmId, backupId, id).getBody();
    }

    /**
     * mark pre auth url delete
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deletePreAuthUrlWithHttpInfo(UUID dmmId, UUID backupId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling deletePreAuthUrl");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling deletePreAuthUrl");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deletePreAuthUrl");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmm-id", dmmId);
        uriVariables.put("backup-id", backupId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get pre auth urls for native backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of backup (required)
     * @return List&lt;PreAuthUrlDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PreAuthUrlDTO> getAllPreAuthUrlForBackupId(UUID dmmId, UUID backupId) throws RestClientException {
        return getAllPreAuthUrlForBackupIdWithHttpInfo(dmmId, backupId).getBody();
    }

    /**
     * get pre auth urls for native backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of backup (required)
     * @return ResponseEntity&lt;List&lt;PreAuthUrlDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PreAuthUrlDTO>> getAllPreAuthUrlForBackupIdWithHttpInfo(UUID dmmId, UUID backupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getAllPreAuthUrlForBackupId");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling getAllPreAuthUrlForBackupId");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("backupId", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{backupId}/pre-auth-urls", uriVariables);

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

    ParameterizedTypeReference<List<PreAuthUrlDTO>> returnType = new ParameterizedTypeReference<List<PreAuthUrlDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View details about a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDmmAvailabilityCatalog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityCatalog getAvailabilityCatalog(UUID dmmId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        return getAvailabilityCatalogWithHttpInfo(dmmId, continuous, discrete, manual, automated, timeZone).getBody();
    }

    /**
     * View details about a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDmmAvailabilityCatalog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityCatalog> getAvailabilityCatalogWithHttpInfo(UUID dmmId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getAvailabilityCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/catalog", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "continuous", continuous));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discrete", discrete));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
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

    ParameterizedTypeReference<TessellDmmAvailabilityCatalog> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityCatalog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View details about health of a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return AvailabilityMachineCatalogHealth
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AvailabilityMachineCatalogHealth getAvailabilityCatalogHealth(UUID dmmId, String timeZone) throws RestClientException {
        return getAvailabilityCatalogHealthWithHttpInfo(dmmId, timeZone).getBody();
    }

    /**
     * View details about health of a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;AvailabilityMachineCatalogHealth&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AvailabilityMachineCatalogHealth> getAvailabilityCatalogHealthWithHttpInfo(UUID dmmId, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getAvailabilityCatalogHealth");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/catalog/health", uriVariables);

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

    ParameterizedTypeReference<AvailabilityMachineCatalogHealth> returnType = new ParameterizedTypeReference<AvailabilityMachineCatalogHealth>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View details about a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param timestamp timestamp (optional, default to true)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbPitrChainInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbPitrChainInfo getAvailabilityCatalogWithPitr(UUID dmmId, String timestamp, UUID cloudAccountId, String cloudLocation, String timeZone) throws RestClientException {
        return getAvailabilityCatalogWithPitrWithHttpInfo(dmmId, timestamp, cloudAccountId, cloudLocation, timeZone).getBody();
    }

    /**
     * View details about a Tessell Availability Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param timestamp timestamp (optional, default to true)
     * @param cloudAccountId cloud-account-id (optional)
     * @param cloudLocation cloud-location (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbPitrChainInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbPitrChainInfo> getAvailabilityCatalogWithPitrWithHttpInfo(UUID dmmId, String timestamp, UUID cloudAccountId, String cloudLocation, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getAvailabilityCatalogWithPitr");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/catalog/pitr-chain", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timestamp", timestamp));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-account-id", cloudAccountId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
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

    ParameterizedTypeReference<DbPitrChainInfo> returnType = new ParameterizedTypeReference<DbPitrChainInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDmmServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmServiceConsumerDTO getAvailabilityMachine(UUID id, Boolean loadAcls, String timeZone) throws RestClientException {
        return getAvailabilityMachineWithHttpInfo(id, loadAcls, timeZone).getBody();
    }

    /**
     * Get details about an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDmmServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmServiceConsumerDTO> getAvailabilityMachineWithHttpInfo(UUID id, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAvailabilityMachine");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<TessellDmmServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellDmmServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return EntityAclSharingInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityAclSharingInfo getAvailabilityMachineAcls(UUID id) throws RestClientException {
        return getAvailabilityMachineAclsWithHttpInfo(id).getBody();
    }

    /**
     * Get list of ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @return ResponseEntity&lt;EntityAclSharingInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntityAclSharingInfo> getAvailabilityMachineAclsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAvailabilityMachineAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<EntityAclSharingInfo> returnType = new ParameterizedTypeReference<EntityAclSharingInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get size consumption details for Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDmmSizeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmSizeDTO getAvailabilityMachineSize(UUID id, String timeZone) throws RestClientException {
        return getAvailabilityMachineSizeWithHttpInfo(id, timeZone).getBody();
    }

    /**
     * Get size consumption details for Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDmmSizeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmSizeDTO> getAvailabilityMachineSizeWithHttpInfo(UUID id, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAvailabilityMachineSize");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/size", uriVariables);

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

    ParameterizedTypeReference<TessellDmmSizeDTO> returnType = new ParameterizedTypeReference<TessellDmmSizeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * This API is deprecated and no longer supported.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDmmAvailabilityCatalogServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmAvailabilityCatalogServiceView getAvailabilityMachineSlaCatalog(UUID id, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        return getAvailabilityMachineSlaCatalogWithHttpInfo(id, continuous, discrete, manual, automated, timeZone).getBody();
    }

    /**
     * This API is deprecated and no longer supported.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDmmAvailabilityCatalogServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmAvailabilityCatalogServiceView> getAvailabilityMachineSlaCatalogWithHttpInfo(UUID id, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAvailabilityMachineSlaCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/sla/catalog", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "continuous", continuous));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discrete", discrete));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
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

    ParameterizedTypeReference<TessellDmmAvailabilityCatalogServiceView> returnType = new ParameterizedTypeReference<TessellDmmAvailabilityCatalogServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Availability Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter the result based on Availability Machine name (optional)
     * @param status Filter the result based on Availability Machine status (optional)
     * @param engineType Filter the result based on Availability Machine&#39;s database engine-type (optional, default to )
     * @param loadAcls Load ACL information (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDmmsServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDmmsServiceView getAvailabilityMachines(String name, String status, String engineType, Boolean loadAcls, List<String> owners, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getAvailabilityMachinesWithHttpInfo(name, status, engineType, loadAcls, owners, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Availability Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter the result based on Availability Machine name (optional)
     * @param status Filter the result based on Availability Machine status (optional)
     * @param engineType Filter the result based on Availability Machine&#39;s database engine-type (optional, default to )
     * @param loadAcls Load ACL information (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDmmsServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDmmsServiceView> getAvailabilityMachinesWithHttpInfo(String name, String status, String engineType, Boolean loadAcls, List<String> owners, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/availability-machines", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
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

    ParameterizedTypeReference<GetDmmsServiceView> returnType = new ParameterizedTypeReference<GetDmmsServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get status of  the tessell ams for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellAmsStatusPayload  (required)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps getBulkDeleteTessellAmsStatus(BulkDeleteTessellAmsStatusPayload bulkDeleteTessellAmsStatusPayload) throws RestClientException {
        return getBulkDeleteTessellAmsStatusWithHttpInfo(bulkDeleteTessellAmsStatusPayload).getBody();
    }

    /**
     * get status of  the tessell ams for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteTessellAmsStatusPayload  (required)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> getBulkDeleteTessellAmsStatusWithHttpInfo(BulkDeleteTessellAmsStatusPayload bulkDeleteTessellAmsStatusPayload) throws RestClientException {
        Object postBody = bulkDeleteTessellAmsStatusPayload;
        
        // verify the required parameter 'bulkDeleteTessellAmsStatusPayload' is set
        if (bulkDeleteTessellAmsStatusPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'bulkDeleteTessellAmsStatusPayload' when calling getBulkDeleteTessellAmsStatus");
        }
        
        String path = apiClient.expandPath("/tessell-ops/availability-machines/bulk-delete", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ResourceBulkDeleteResponseOps> returnType = new ParameterizedTypeReference<ResourceBulkDeleteResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of a Tessell Availability Machine Dataflix Backup Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDataflixBackupCatalogResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataflixBackupCatalogResponse getDataflixBackupsCatalog(UUID id, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDataflixBackupsCatalogWithHttpInfo(id, automated, manual, loadAcls, timeZone).getBody();
    }

    /**
     * Get details of a Tessell Availability Machine Dataflix Backup Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDataflixBackupCatalogResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataflixBackupCatalogResponse> getDataflixBackupsCatalogWithHttpInfo(UUID id, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataflixBackupsCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/dataflix/{id}/catalog/backups", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetDataflixBackupCatalogResponse> returnType = new ParameterizedTypeReference<GetDataflixBackupCatalogResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a Dataflix by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellAmDataflixDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAmDataflixDTO getDataflixByName(UUID id, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDataflixByNameWithHttpInfo(id, loadAcls, timeZone).getBody();
    }

    /**
     * Get a Dataflix by ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellAmDataflixDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAmDataflixDTO> getDataflixByNameWithHttpInfo(UUID id, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataflixByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/dataflix/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<TessellAmDataflixDTO> returnType = new ParameterizedTypeReference<TessellAmDataflixDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a Dataflix catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param pitr Specify if PITR related dataflix info is to be fetched (optional, default to true)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDataflixCatalogResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataflixCatalogResponse getDataflixCatalog(UUID id, Boolean pitr, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDataflixCatalogWithHttpInfo(id, pitr, automated, manual, loadAcls, timeZone).getBody();
    }

    /**
     * Get a Dataflix catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param pitr Specify if PITR related dataflix info is to be fetched (optional, default to true)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDataflixCatalogResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataflixCatalogResponse> getDataflixCatalogWithHttpInfo(UUID id, Boolean pitr, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataflixCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/dataflix/{id}/catalog", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pitr", pitr));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetDataflixCatalogResponse> returnType = new ParameterizedTypeReference<GetDataflixCatalogResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a Dataflix catalog for sanitized contents
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDataflixSanitizedCatalogResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDataflixSanitizedCatalogResponse getDataflixSanitizedCatalog(UUID id, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDataflixSanitizedCatalogWithHttpInfo(id, automated, manual, loadAcls, timeZone).getBody();
    }

    /**
     * Get a Dataflix catalog for sanitized contents
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Dataflix (required)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backup info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDataflixSanitizedCatalogResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDataflixSanitizedCatalogResponse> getDataflixSanitizedCatalogWithHttpInfo(UUID id, Boolean automated, Boolean manual, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDataflixSanitizedCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/dataflix/{id}/catalog/sanitized", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetDataflixSanitizedCatalogResponse> returnType = new ParameterizedTypeReference<GetDataflixSanitizedCatalogResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of accessible Dataflix
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter the result based on Dataflix name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDataflixResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDataflixResponse getDataflixes(String name, Boolean loadAcls, List<String> owners, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDataflixesWithHttpInfo(name, loadAcls, owners, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of accessible Dataflix
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter the result based on Dataflix name (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDataflixResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDataflixResponse> getDataflixesWithHttpInfo(String name, Boolean loadAcls, List<String> owners, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/dataflix", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
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

    ParameterizedTypeReference<TessellDataflixResponse> returnType = new ParameterizedTypeReference<TessellDataflixResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tessell Data Management Machine By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param loadRpoSla load-rpo-sla (optional, default to false)
     * @param loadDaps load-daps (optional, default to false)
     * @param loadClones load-clones (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @return TessellDmmDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmDTO getDmm(UUID id, Boolean loadRpoSla, Boolean loadDaps, Boolean loadClones, Boolean loadSubscriptionInfo, Boolean loadAcls) throws RestClientException {
        return getDmmWithHttpInfo(id, loadRpoSla, loadDaps, loadClones, loadSubscriptionInfo, loadAcls).getBody();
    }

    /**
     * Get Tessell Data Management Machine By Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param loadRpoSla load-rpo-sla (optional, default to false)
     * @param loadDaps load-daps (optional, default to false)
     * @param loadClones load-clones (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @return ResponseEntity&lt;TessellDmmDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmDTO> getDmmWithHttpInfo(UUID id, Boolean loadRpoSla, Boolean loadDaps, Boolean loadClones, Boolean loadSubscriptionInfo, Boolean loadAcls) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDmm");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-rpo-sla", loadRpoSla));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-daps", loadDaps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-clones", loadClones));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));

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

    ParameterizedTypeReference<TessellDmmDTO> returnType = new ParameterizedTypeReference<TessellDmmDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get size consumption details for Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Data Management Machine (required)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDmmSizeOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmSizeOpsDTO getDmmSizeOpsView(UUID id, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, String timeRangeBeginAt, String timeRangeEndAt, String timeZone) throws RestClientException {
        return getDmmSizeOpsViewWithHttpInfo(id, filterOnLastStartedTime, filterOnLastStoppedTime, timeRangeBeginAt, timeRangeEndAt, timeZone).getBody();
    }

    /**
     * Get size consumption details for Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Data Management Machine (required)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDmmSizeOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmSizeOpsDTO> getDmmSizeOpsViewWithHttpInfo(UUID id, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, String timeRangeBeginAt, String timeRangeEndAt, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDmmSizeOpsView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/size", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-started-time", filterOnLastStartedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-stopped-time", filterOnLastStoppedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-begin-at", timeRangeBeginAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-end-at", timeRangeEndAt));
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

    ParameterizedTypeReference<TessellDmmSizeOpsDTO> returnType = new ParameterizedTypeReference<TessellDmmSizeOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional, default to )
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param engineType engine-type (optional, default to )
     * @param databaseSystemId database-system-id (optional)
     * @param loadRpoSla load-rpo-sla (optional, default to false)
     * @param loadDaps load-daps (optional, default to false)
     * @param loadClones load-clones (optional, default to false)
     * @param includeInternal include-internal (optional, default to true)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param filterByTenant filter the entity based on tenant-id (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDmmsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDmmsApiResponse getDmms(String name, List<DmmStatus> statuses, List<DmmStatus> skipStatuses, String engineType, UUID databaseSystemId, Boolean loadRpoSla, Boolean loadDaps, Boolean loadClones, Boolean includeInternal, Boolean loadSubscriptionInfo, Boolean loadAcls, Boolean filterByTenant, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDmmsWithHttpInfo(name, statuses, skipStatuses, engineType, databaseSystemId, loadRpoSla, loadDaps, loadClones, includeInternal, loadSubscriptionInfo, loadAcls, filterByTenant, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional, default to )
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param engineType engine-type (optional, default to )
     * @param databaseSystemId database-system-id (optional)
     * @param loadRpoSla load-rpo-sla (optional, default to false)
     * @param loadDaps load-daps (optional, default to false)
     * @param loadClones load-clones (optional, default to false)
     * @param includeInternal include-internal (optional, default to true)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param filterByTenant filter the entity based on tenant-id (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDmmsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDmmsApiResponse> getDmmsWithHttpInfo(String name, List<DmmStatus> statuses, List<DmmStatus> skipStatuses, String engineType, UUID databaseSystemId, Boolean loadRpoSla, Boolean loadDaps, Boolean loadClones, Boolean includeInternal, Boolean loadSubscriptionInfo, Boolean loadAcls, Boolean filterByTenant, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/dmms", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "database-system-id", databaseSystemId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-rpo-sla", loadRpoSla));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-daps", loadDaps));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-clones", loadClones));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-internal", includeInternal));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-by-tenant", filterByTenant));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
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

    ParameterizedTypeReference<GetDmmsApiResponse> returnType = new ParameterizedTypeReference<GetDmmsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Data Management Machines for utilization purpose
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param statuses Status list (optional)
     * @param skipStatuses Status list (optional)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDmmsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDmmsApiResponse getDmmsForUtilization(Boolean loadSubscriptionInfo, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, List<DmmStatus> statuses, List<DmmStatus> skipStatuses, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDmmsForUtilizationWithHttpInfo(loadSubscriptionInfo, filterOnLastStartedTime, filterOnLastStoppedTime, statuses, skipStatuses, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Data Management Machines for utilization purpose
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param filterOnLastStartedTime filter-on-last-started-time (optional, default to false)
     * @param filterOnLastStoppedTime filter-on-last-stopped-time (optional, default to false)
     * @param statuses Status list (optional)
     * @param skipStatuses Status list (optional)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDmmsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDmmsApiResponse> getDmmsForUtilizationWithHttpInfo(Boolean loadSubscriptionInfo, Boolean filterOnLastStartedTime, Boolean filterOnLastStoppedTime, List<DmmStatus> statuses, List<DmmStatus> skipStatuses, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/dmms/utilization", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-started-time", filterOnLastStartedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-last-stopped-time", filterOnLastStoppedTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-begin-at", timeRangeBeginAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-range-end-at", timeRangeEndAt));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
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

    ParameterizedTypeReference<GetDmmsApiResponse> returnType = new ParameterizedTypeReference<GetDmmsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get download url info for the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId ID of the backup (required)
     * @return DataflixDownloadUrlInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataflixDownloadUrlInfo getDownloadUrlInfo(UUID id, UUID backupId) throws RestClientException {
        return getDownloadUrlInfoWithHttpInfo(id, backupId).getBody();
    }

    /**
     * Get download url info for the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId ID of the backup (required)
     * @return ResponseEntity&lt;DataflixDownloadUrlInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataflixDownloadUrlInfo> getDownloadUrlInfoWithHttpInfo(UUID id, UUID backupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDownloadUrlInfo");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling getDownloadUrlInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("backup-id", backupId);
        String path = apiClient.expandPath("/dataflix/{id}/catalog/backups/{backup-id}/download-url", uriVariables);

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

    ParameterizedTypeReference<DataflixDownloadUrlInfo> returnType = new ParameterizedTypeReference<DataflixDownloadUrlInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of users which are eligible to grant access for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param roles Filter the result based on specified roles (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getEligibleUsersForAvailabilityMachine(UUID id, List<String> roles) throws RestClientException {
        return getEligibleUsersForAvailabilityMachineWithHttpInfo(id, roles).getBody();
    }

    /**
     * Get list of users which are eligible to grant access for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param roles Filter the result based on specified roles (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getEligibleUsersForAvailabilityMachineWithHttpInfo(UUID id, List<String> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEligibleUsersForAvailabilityMachine");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "roles", roles));

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

    ParameterizedTypeReference<List<AclEligibleUser>> returnType = new ParameterizedTypeReference<List<AclEligibleUser>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param roles roles (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getEligibleUsersForDataflix(UUID id, List<String> roles) throws RestClientException {
        return getEligibleUsersForDataflixWithHttpInfo(id, roles).getBody();
    }

    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param roles roles (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getEligibleUsersForDataflixWithHttpInfo(UUID id, List<String> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEligibleUsersForDataflix");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/dataflix/{id}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "roles", roles));

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

    ParameterizedTypeReference<List<AclEligibleUser>> returnType = new ParameterizedTypeReference<List<AclEligibleUser>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get pre auth urls by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @return PreAuthUrlDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public PreAuthUrlDTO getPreAuthUrl(UUID dmmId, UUID backupId, UUID id) throws RestClientException {
        return getPreAuthUrlWithHttpInfo(dmmId, backupId, id).getBody();
    }

    /**
     * get pre auth urls by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @return ResponseEntity&lt;PreAuthUrlDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<PreAuthUrlDTO> getPreAuthUrlWithHttpInfo(UUID dmmId, UUID backupId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getPreAuthUrl");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling getPreAuthUrl");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getPreAuthUrl");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmm-id", dmmId);
        uriVariables.put("backup-id", backupId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id}", uriVariables);

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

    ParameterizedTypeReference<PreAuthUrlDTO> returnType = new ParameterizedTypeReference<PreAuthUrlDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get pre auth urls based on query params
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of backup (optional)
     * @param sourceBackupIdentifier source backup id (optional)
     * @param user user email id (optional)
     * @param statuses statuses of pre auth urls (optional)
     * @param skipStatuses skip-statuses (optional)
     * @return List&lt;PreAuthUrlDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<PreAuthUrlDTO> getPreAuthUrls(UUID dmmId, UUID backupId, UUID sourceBackupIdentifier, String user, List<PreAuthUrlStatusOps> statuses, List<PreAuthUrlStatusOps> skipStatuses) throws RestClientException {
        return getPreAuthUrlsWithHttpInfo(dmmId, backupId, sourceBackupIdentifier, user, statuses, skipStatuses).getBody();
    }

    /**
     * get pre auth urls based on query params
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of backup (optional)
     * @param sourceBackupIdentifier source backup id (optional)
     * @param user user email id (optional)
     * @param statuses statuses of pre auth urls (optional)
     * @param skipStatuses skip-statuses (optional)
     * @return ResponseEntity&lt;List&lt;PreAuthUrlDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<PreAuthUrlDTO>> getPreAuthUrlsWithHttpInfo(UUID dmmId, UUID backupId, UUID sourceBackupIdentifier, String user, List<PreAuthUrlStatusOps> statuses, List<PreAuthUrlStatusOps> skipStatuses) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getPreAuthUrls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/pre-auth-urls", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "backupId", backupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "source-backup-identifier", sourceBackupIdentifier));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "user", user));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));

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

    ParameterizedTypeReference<List<PreAuthUrlDTO>> returnType = new ParameterizedTypeReference<List<PreAuthUrlDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Pause the automated backups for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param pauseTessellDmmPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus pauseAvailabilityMachine(UUID id, PauseTessellDmmPayload pauseTessellDmmPayload) throws RestClientException {
        return pauseAvailabilityMachineWithHttpInfo(id, pauseTessellDmmPayload).getBody();
    }

    /**
     * Pause the automated backups for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param pauseTessellDmmPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> pauseAvailabilityMachineWithHttpInfo(UUID id, PauseTessellDmmPayload pauseTessellDmmPayload) throws RestClientException {
        Object postBody = pauseTessellDmmPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling pauseAvailabilityMachine");
        }
        
        // verify the required parameter 'pauseTessellDmmPayload' is set
        if (pauseTessellDmmPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'pauseTessellDmmPayload' when calling pauseAvailabilityMachine");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/pause", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Resume the automated backups for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param resumeTessellDmmPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus resumeAvailabilityMachine(UUID id, ResumeTessellDmmPayload resumeTessellDmmPayload) throws RestClientException {
        return resumeAvailabilityMachineWithHttpInfo(id, resumeTessellDmmPayload).getBody();
    }

    /**
     * Resume the automated backups for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param resumeTessellDmmPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> resumeAvailabilityMachineWithHttpInfo(UUID id, ResumeTessellDmmPayload resumeTessellDmmPayload) throws RestClientException {
        Object postBody = resumeTessellDmmPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resumeAvailabilityMachine");
        }
        
        // verify the required parameter 'resumeTessellDmmPayload' is set
        if (resumeTessellDmmPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'resumeTessellDmmPayload' when calling resumeAvailabilityMachine");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/resume", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revoke ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param aclRevokePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeAvailabilityMachineAcls(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeAvailabilityMachineAclsWithHttpInfo(id, aclRevokePayload).getBody();
    }

    /**
     * Revoke ACLs for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param aclRevokePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeAvailabilityMachineAclsWithHttpInfo(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling revokeAvailabilityMachineAcls");
        }
        
        // verify the required parameter 'aclRevokePayload' is set
        if (aclRevokePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclRevokePayload' when calling revokeAvailabilityMachineAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Allow backup download for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param updateBackupDownloadConfigPayload  (required)
     * @return BackupDownloadConfig
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public BackupDownloadConfig updateBackupDownloadConfig(UUID id, UpdateBackupDownloadConfigPayload updateBackupDownloadConfigPayload) throws RestClientException {
        return updateBackupDownloadConfigWithHttpInfo(id, updateBackupDownloadConfigPayload).getBody();
    }

    /**
     * Allow backup download for a Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param updateBackupDownloadConfigPayload  (required)
     * @return ResponseEntity&lt;BackupDownloadConfig&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<BackupDownloadConfig> updateBackupDownloadConfigWithHttpInfo(UUID id, UpdateBackupDownloadConfigPayload updateBackupDownloadConfigPayload) throws RestClientException {
        Object postBody = updateBackupDownloadConfigPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateBackupDownloadConfig");
        }
        
        // verify the required parameter 'updateBackupDownloadConfigPayload' is set
        if (updateBackupDownloadConfigPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateBackupDownloadConfigPayload' when calling updateBackupDownloadConfig");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/backup-download-config", uriVariables);

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

    ParameterizedTypeReference<BackupDownloadConfig> returnType = new ParameterizedTypeReference<BackupDownloadConfig>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Triggers a worklow to update the DbLogs status for all the PITR DAPs for given DMMs.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param updateDapReplStatusPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary updateDapReplicationStatus(UpdateDapReplStatusPayload updateDapReplStatusPayload) throws RestClientException {
        return updateDapReplicationStatusWithHttpInfo(updateDapReplStatusPayload).getBody();
    }

    /**
     * Triggers a worklow to update the DbLogs status for all the PITR DAPs for given DMMs.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param updateDapReplStatusPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> updateDapReplicationStatusWithHttpInfo(UpdateDapReplStatusPayload updateDapReplStatusPayload) throws RestClientException {
        Object postBody = updateDapReplStatusPayload;
        
        // verify the required parameter 'updateDapReplStatusPayload' is set
        if (updateDapReplStatusPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDapReplStatusPayload' when calling updateDapReplicationStatus");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/update-dap-replication-status", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TaskSummary> returnType = new ParameterizedTypeReference<TaskSummary>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDmmDTO  (required)
     * @return TessellDmmDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDmmDTO updateDmm(String id, TessellDmmDTO tessellDmmDTO) throws RestClientException {
        return updateDmmWithHttpInfo(id, tessellDmmDTO).getBody();
    }

    /**
     * Update a Tessell Data Management Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellDmmDTO  (required)
     * @return ResponseEntity&lt;TessellDmmDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDmmDTO> updateDmmWithHttpInfo(String id, TessellDmmDTO tessellDmmDTO) throws RestClientException {
        Object postBody = tessellDmmDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDmm");
        }
        
        // verify the required parameter 'tessellDmmDTO' is set
        if (tessellDmmDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDmmDTO' when calling updateDmm");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDmmDTO> returnType = new ParameterizedTypeReference<TessellDmmDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * patch pre auth url by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @param preAuthUrlDTO  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updatePreAuthUrl(UUID dmmId, UUID backupId, UUID id, PreAuthUrlDTO preAuthUrlDTO) throws RestClientException {
        return updatePreAuthUrlWithHttpInfo(dmmId, backupId, id, preAuthUrlDTO).getBody();
    }

    /**
     * patch pre auth url by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId Id of the availability machine (required)
     * @param backupId ID of Backup (required)
     * @param id id of pre auth url (required)
     * @param preAuthUrlDTO  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updatePreAuthUrlWithHttpInfo(UUID dmmId, UUID backupId, UUID id, PreAuthUrlDTO preAuthUrlDTO) throws RestClientException {
        Object postBody = preAuthUrlDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updatePreAuthUrl");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling updatePreAuthUrl");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updatePreAuthUrl");
        }
        
        // verify the required parameter 'preAuthUrlDTO' is set
        if (preAuthUrlDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preAuthUrlDTO' when calling updatePreAuthUrl");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmm-id", dmmId);
        uriVariables.put("backup-id", backupId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmm-id}/backups/{backup-id}/pre-auth-urls/{id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
