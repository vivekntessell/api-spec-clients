package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.BackupCallbackPayload;
import com.tessell.dmm.client.model.BackupType;
import com.tessell.dmm.client.model.CloneBackupValidationPayload;
import com.tessell.dmm.client.model.CloneBackupValidationResponse;
import com.tessell.dmm.client.model.CreateBackupInternalTaskPayload;
import com.tessell.dmm.client.model.CreateBackupTaskPayload;
import com.tessell.dmm.client.model.CreateDatabaseSnapshotTaskPayload;
import com.tessell.dmm.client.model.CreateSanitizedDatabaseSnapshotTaskPayload;
import com.tessell.dmm.client.model.DatabaseBackup;
import com.tessell.dmm.client.model.DatabaseBackupOps;
import com.tessell.dmm.client.model.DatabaseBackupStatus;
import com.tessell.dmm.client.model.DatabaseSnapshot;
import com.tessell.dmm.client.model.DatabaseSnapshotTaskPayload;
import com.tessell.dmm.client.model.DbBackupChainInfo;
import com.tessell.dmm.client.model.DbBackupCloudResourceSharingInfo;
import com.tessell.dmm.client.model.DbBackupLineageInfo;
import com.tessell.dmm.client.model.DbBackupRestoreInfo;
import com.tessell.dmm.client.model.DbBackupRetentionType;
import com.tessell.dmm.client.model.DbBackupStatus;
import com.tessell.dmm.client.model.DbBackupType;
import com.tessell.dmm.client.model.DeleteBackupDbLogTaskPayload;
import com.tessell.dmm.client.model.DeleteBackupsLogsCallbackPayload;
import com.tessell.dmm.client.model.DmmDispatchOnDemandAutoBackupTaskPayload;
import com.tessell.dmm.client.model.ExpiryConfig;
import com.tessell.dmm.client.model.GetBackupsApiResponse;
import com.tessell.dmm.client.model.GetDatabaseBackupsResponse;
import com.tessell.dmm.client.model.GetDatabaseSnapshotsResponse;
import com.tessell.dmm.client.model.GetSanitizedDatabaseSnapshotsResponse;
import com.tessell.dmm.client.model.NativeBackupCallbackPayload;
import com.tessell.dmm.client.model.PreAuthUrlsCallbackPayload;
import com.tessell.dmm.client.model.RefreshSnapshotSizeTaskPayload;
import com.tessell.dmm.client.model.ReplicateBackupsCallbackPayload;
import com.tessell.dmm.client.model.SanitizedDatabaseSnapshot;
import com.tessell.dmm.client.model.TaskSummary;
import com.tessell.dmm.client.model.TessellDatabaseBackupsInternalResponse;
import com.tessell.dmm.client.model.TessellLockBackupPayload;
import java.util.UUID;
import com.tessell.dmm.client.model.UpdateSnapshotSizePayload;

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
@Component("com.tessell.dmm.client.api.DbBackupApi")
public class DbBackupApi {
    private ApiClient apiClient;

    public DbBackupApi() {
        this(new ApiClient());
    }

    @Autowired
    public DbBackupApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Callback for backup database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId Id of the backup (required)
     * @param backupCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void backupCallback(UUID id, UUID backupId, BackupCallbackPayload backupCallbackPayload) throws RestClientException {
        backupCallbackWithHttpInfo(id, backupId, backupCallbackPayload);
    }

    /**
     * Callback for backup database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId Id of the backup (required)
     * @param backupCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> backupCallbackWithHttpInfo(UUID id, UUID backupId, BackupCallbackPayload backupCallbackPayload) throws RestClientException {
        Object postBody = backupCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling backupCallback");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling backupCallback");
        }
        
        // verify the required parameter 'backupCallbackPayload' is set
        if (backupCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupCallbackPayload' when calling backupCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("backup-id", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/callback/backups/{backup-id}", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param databaseBackupOps  (required)
     * @return DatabaseBackupOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackupOps createBackupEntry(UUID dmmId, DatabaseBackupOps databaseBackupOps) throws RestClientException {
        return createBackupEntryWithHttpInfo(dmmId, databaseBackupOps).getBody();
    }

    /**
     * Create a backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param databaseBackupOps  (required)
     * @return ResponseEntity&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackupOps> createBackupEntryWithHttpInfo(UUID dmmId, DatabaseBackupOps databaseBackupOps) throws RestClientException {
        Object postBody = databaseBackupOps;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createBackupEntry");
        }
        
        // verify the required parameter 'databaseBackupOps' is set
        if (databaseBackupOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseBackupOps' when calling createBackupEntry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/create-backup", uriVariables);

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

    ParameterizedTypeReference<DatabaseBackupOps> returnType = new ParameterizedTypeReference<DatabaseBackupOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create backup for the snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param createBackupTaskPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createBackupRequest(UUID availabilityMachineId, CreateBackupTaskPayload createBackupTaskPayload) throws RestClientException {
        return createBackupRequestWithHttpInfo(availabilityMachineId, createBackupTaskPayload).getBody();
    }

    /**
     * Create backup for the snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param createBackupTaskPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createBackupRequestWithHttpInfo(UUID availabilityMachineId, CreateBackupTaskPayload createBackupTaskPayload) throws RestClientException {
        Object postBody = createBackupTaskPayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling createBackupRequest");
        }
        
        // verify the required parameter 'createBackupTaskPayload' is set
        if (createBackupTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBackupTaskPayload' when calling createBackupRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/backups", uriVariables);

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
     * Request to create a initialization of new Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param createBackupInternalTaskPayload  (required)
     * @return DatabaseSnapshotTaskPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseSnapshotTaskPayload createBackupRequestInitializationInternal(UUID dmmId, CreateBackupInternalTaskPayload createBackupInternalTaskPayload) throws RestClientException {
        return createBackupRequestInitializationInternalWithHttpInfo(dmmId, createBackupInternalTaskPayload).getBody();
    }

    /**
     * Request to create a initialization of new Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param createBackupInternalTaskPayload  (required)
     * @return ResponseEntity&lt;DatabaseSnapshotTaskPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseSnapshotTaskPayload> createBackupRequestInitializationInternalWithHttpInfo(UUID dmmId, CreateBackupInternalTaskPayload createBackupInternalTaskPayload) throws RestClientException {
        Object postBody = createBackupInternalTaskPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createBackupRequestInitializationInternal");
        }
        
        // verify the required parameter 'createBackupInternalTaskPayload' is set
        if (createBackupInternalTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBackupInternalTaskPayload' when calling createBackupRequestInitializationInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/init", uriVariables);

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

    ParameterizedTypeReference<DatabaseSnapshotTaskPayload> returnType = new ParameterizedTypeReference<DatabaseSnapshotTaskPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to create a new Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param createBackupInternalTaskPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createBackupRequestInternal(UUID dmmId, CreateBackupInternalTaskPayload createBackupInternalTaskPayload) throws RestClientException {
        return createBackupRequestInternalWithHttpInfo(dmmId, createBackupInternalTaskPayload).getBody();
    }

    /**
     * Request to create a new Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param createBackupInternalTaskPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createBackupRequestInternalWithHttpInfo(UUID dmmId, CreateBackupInternalTaskPayload createBackupInternalTaskPayload) throws RestClientException {
        Object postBody = createBackupInternalTaskPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createBackupRequestInternal");
        }
        
        // verify the required parameter 'createBackupInternalTaskPayload' is set
        if (createBackupInternalTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createBackupInternalTaskPayload' when calling createBackupRequestInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups", uriVariables);

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
     * Submit a request to capture the associated DB Service&#39;s snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param createDatabaseSnapshotTaskPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createDatabaseSnapshotRequest(UUID availabilityMachineId, CreateDatabaseSnapshotTaskPayload createDatabaseSnapshotTaskPayload) throws RestClientException {
        return createDatabaseSnapshotRequestWithHttpInfo(availabilityMachineId, createDatabaseSnapshotTaskPayload).getBody();
    }

    /**
     * Submit a request to capture the associated DB Service&#39;s snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param createDatabaseSnapshotTaskPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createDatabaseSnapshotRequestWithHttpInfo(UUID availabilityMachineId, CreateDatabaseSnapshotTaskPayload createDatabaseSnapshotTaskPayload) throws RestClientException {
        Object postBody = createDatabaseSnapshotTaskPayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling createDatabaseSnapshotRequest");
        }
        
        // verify the required parameter 'createDatabaseSnapshotTaskPayload' is set
        if (createDatabaseSnapshotTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDatabaseSnapshotTaskPayload' when calling createDatabaseSnapshotRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/snapshots", uriVariables);

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
     * Create a direct backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of the backup (required)
     * @param forStartDb for-start-db (optional, default to false)
     * @return DatabaseBackupOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackupOps createDirectBackupEntry(UUID dmmId, UUID backupId, Boolean forStartDb) throws RestClientException {
        return createDirectBackupEntryWithHttpInfo(dmmId, backupId, forStartDb).getBody();
    }

    /**
     * Create a direct backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of the backup (required)
     * @param forStartDb for-start-db (optional, default to false)
     * @return ResponseEntity&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackupOps> createDirectBackupEntryWithHttpInfo(UUID dmmId, UUID backupId, Boolean forStartDb) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createDirectBackupEntry");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling createDirectBackupEntry");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("backupId", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{backupId}/create-direct-entry", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "for-start-db", forStartDb));

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

    ParameterizedTypeReference<DatabaseBackupOps> returnType = new ParameterizedTypeReference<DatabaseBackupOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create download url for the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId ID of the backup (required)
     * @param expiryConfig  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createDownloadUrlRequest(UUID id, UUID backupId, ExpiryConfig expiryConfig) throws RestClientException {
        return createDownloadUrlRequestWithHttpInfo(id, backupId, expiryConfig).getBody();
    }

    /**
     * Create download url for the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param backupId ID of the backup (required)
     * @param expiryConfig  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createDownloadUrlRequestWithHttpInfo(UUID id, UUID backupId, ExpiryConfig expiryConfig) throws RestClientException {
        Object postBody = expiryConfig;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createDownloadUrlRequest");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling createDownloadUrlRequest");
        }
        
        // verify the required parameter 'expiryConfig' is set
        if (expiryConfig == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'expiryConfig' when calling createDownloadUrlRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("backup-id", backupId);
        String path = apiClient.expandPath("/availability-machines/{id}/backups/{backup-id}/download-url", uriVariables);

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
     * Callback for native backup database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param nativeBackupId ID of backup (required)
     * @param nativeBackupCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createNativeBackupCallback(UUID nativeBackupId, NativeBackupCallbackPayload nativeBackupCallbackPayload) throws RestClientException {
        createNativeBackupCallbackWithHttpInfo(nativeBackupId, nativeBackupCallbackPayload);
    }

    /**
     * Callback for native backup database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param nativeBackupId ID of backup (required)
     * @param nativeBackupCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createNativeBackupCallbackWithHttpInfo(UUID nativeBackupId, NativeBackupCallbackPayload nativeBackupCallbackPayload) throws RestClientException {
        Object postBody = nativeBackupCallbackPayload;
        
        // verify the required parameter 'nativeBackupId' is set
        if (nativeBackupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nativeBackupId' when calling createNativeBackupCallback");
        }
        
        // verify the required parameter 'nativeBackupCallbackPayload' is set
        if (nativeBackupCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'nativeBackupCallbackPayload' when calling createNativeBackupCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("native-backup-id", nativeBackupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/native-backup/{native-backup-id}/callback", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to create a new On Demand Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dmmDispatchOnDemandAutoBackupTaskPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus createOnDemandBackupRequestInternal(UUID dmmId, DmmDispatchOnDemandAutoBackupTaskPayload dmmDispatchOnDemandAutoBackupTaskPayload) throws RestClientException {
        return createOnDemandBackupRequestInternalWithHttpInfo(dmmId, dmmDispatchOnDemandAutoBackupTaskPayload).getBody();
    }

    /**
     * Request to create a new On Demand Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dmmDispatchOnDemandAutoBackupTaskPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> createOnDemandBackupRequestInternalWithHttpInfo(UUID dmmId, DmmDispatchOnDemandAutoBackupTaskPayload dmmDispatchOnDemandAutoBackupTaskPayload) throws RestClientException {
        Object postBody = dmmDispatchOnDemandAutoBackupTaskPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createOnDemandBackupRequestInternal");
        }
        
        // verify the required parameter 'dmmDispatchOnDemandAutoBackupTaskPayload' is set
        if (dmmDispatchOnDemandAutoBackupTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmDispatchOnDemandAutoBackupTaskPayload' when calling createOnDemandBackupRequestInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/on-demand-backups", uriVariables);

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
     * Submit a request to sanitize the specified snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param createSanitizedDatabaseSnapshotTaskPayload  (required)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createSanitizedDatabaseSnapshotRequest(UUID availabilityMachineId, CreateSanitizedDatabaseSnapshotTaskPayload createSanitizedDatabaseSnapshotTaskPayload) throws RestClientException {
        return createSanitizedDatabaseSnapshotRequestWithHttpInfo(availabilityMachineId, createSanitizedDatabaseSnapshotTaskPayload).getBody();
    }

    /**
     * Submit a request to sanitize the specified snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param createSanitizedDatabaseSnapshotTaskPayload  (required)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createSanitizedDatabaseSnapshotRequestWithHttpInfo(UUID availabilityMachineId, CreateSanitizedDatabaseSnapshotTaskPayload createSanitizedDatabaseSnapshotTaskPayload) throws RestClientException {
        Object postBody = createSanitizedDatabaseSnapshotTaskPayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling createSanitizedDatabaseSnapshotRequest");
        }
        
        // verify the required parameter 'createSanitizedDatabaseSnapshotTaskPayload' is set
        if (createSanitizedDatabaseSnapshotTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createSanitizedDatabaseSnapshotTaskPayload' when calling createSanitizedDatabaseSnapshotRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitized-snapshots", uriVariables);

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
     * Submit a request to delete the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the database backup (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteBackupRequest(UUID availabilityMachineId, UUID id) throws RestClientException {
        return deleteBackupRequestWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * Submit a request to delete the backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the database backup (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteBackupRequestWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteBackupRequest");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteBackupRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/backups/{id}", uriVariables);

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
     * Internal request to delete a Tessell Database Backups and logs
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deleteBackupDbLogTaskPayload  (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteBackupRequestOps(DeleteBackupDbLogTaskPayload deleteBackupDbLogTaskPayload, String timeZone) throws RestClientException {
        return deleteBackupRequestOpsWithHttpInfo(deleteBackupDbLogTaskPayload, timeZone).getBody();
    }

    /**
     * Internal request to delete a Tessell Database Backups and logs
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deleteBackupDbLogTaskPayload  (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteBackupRequestOpsWithHttpInfo(DeleteBackupDbLogTaskPayload deleteBackupDbLogTaskPayload, String timeZone) throws RestClientException {
        Object postBody = deleteBackupDbLogTaskPayload;
        
        // verify the required parameter 'deleteBackupDbLogTaskPayload' is set
        if (deleteBackupDbLogTaskPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteBackupDbLogTaskPayload' when calling deleteBackupRequestOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/backups", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for snapshot database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deleteBackupsLogsCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteBackupsLogsCallback(DeleteBackupsLogsCallbackPayload deleteBackupsLogsCallbackPayload) throws RestClientException {
        return deleteBackupsLogsCallbackWithHttpInfo(deleteBackupsLogsCallbackPayload).getBody();
    }

    /**
     * Callback for snapshot database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deleteBackupsLogsCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteBackupsLogsCallbackWithHttpInfo(DeleteBackupsLogsCallbackPayload deleteBackupsLogsCallbackPayload) throws RestClientException {
        Object postBody = deleteBackupsLogsCallbackPayload;
        
        // verify the required parameter 'deleteBackupsLogsCallbackPayload' is set
        if (deleteBackupsLogsCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deleteBackupsLogsCallbackPayload' when calling deleteBackupsLogsCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/callback/delete-backups-logs", Collections.<String, Object>emptyMap());

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
     * Delete a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDBBackup(UUID dmmId, UUID id, Boolean softDelete) throws RestClientException {
        return deleteDBBackupWithHttpInfo(dmmId, id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDBBackupWithHttpInfo(UUID dmmId, UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling deleteDBBackup");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDBBackup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{id}", uriVariables);

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
     * Submit a request to delete the snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the snapshot (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseSnapshotRequest(UUID availabilityMachineId, UUID id) throws RestClientException {
        return deleteDatabaseSnapshotRequestWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * Submit a request to delete the snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the snapshot (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseSnapshotRequestWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteDatabaseSnapshotRequest");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDatabaseSnapshotRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/snapshots/{id}", uriVariables);

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
     * Submit a request to delete the Sanitized Snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the Sanitized Snapshot (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteSanitizedDatabaseSnapshotRequest(UUID availabilityMachineId, UUID id) throws RestClientException {
        return deleteSanitizedDatabaseSnapshotRequestWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * Submit a request to delete the Sanitized Snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the Sanitized Snapshot (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteSanitizedDatabaseSnapshotRequestWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteSanitizedDatabaseSnapshotRequest");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSanitizedDatabaseSnapshotRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitized-snapshots/{id}", uriVariables);

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
     * View details about a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param loadStorageSnapshots  (optional, default to false)
     * @return DatabaseBackupOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackupOps getBackupOps(UUID dmmId, UUID id, Boolean loadStorageSnapshots) throws RestClientException {
        return getBackupOpsWithHttpInfo(dmmId, id, loadStorageSnapshots).getBody();
    }

    /**
     * View details about a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param loadStorageSnapshots  (optional, default to false)
     * @return ResponseEntity&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackupOps> getBackupOpsWithHttpInfo(UUID dmmId, UUID id, Boolean loadStorageSnapshots) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getBackupOps");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBackupOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-storage-snapshots", loadStorageSnapshots));

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

    ParameterizedTypeReference<DatabaseBackupOps> returnType = new ParameterizedTypeReference<DatabaseBackupOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param id Id of the database backup (required)
     * @return DatabaseBackup
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackup getBackupRequest(UUID availabilityMachineId, UUID id) throws RestClientException {
        return getBackupRequestWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * get backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param id Id of the database backup (required)
     * @return ResponseEntity&lt;DatabaseBackup&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackup> getBackupRequestWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getBackupRequest");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBackupRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/backups/{id}", uriVariables);

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

    ParameterizedTypeReference<DatabaseBackup> returnType = new ParameterizedTypeReference<DatabaseBackup>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get the restore or clone information for the specified snapshot or the recovery-timestamp
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param backupId ID of the snapshot (optional)
     * @param recoveryTimestamp The recovery timestamp (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbBackupRestoreInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbBackupRestoreInfo getBackupRestoreInfo(UUID id, UUID backupId, String recoveryTimestamp, String timeZone) throws RestClientException {
        return getBackupRestoreInfoWithHttpInfo(id, backupId, recoveryTimestamp, timeZone).getBody();
    }

    /**
     * Get the restore or clone information for the specified snapshot or the recovery-timestamp
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param backupId ID of the snapshot (optional)
     * @param recoveryTimestamp The recovery timestamp (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbBackupRestoreInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbBackupRestoreInfo> getBackupRestoreInfoWithHttpInfo(UUID id, UUID backupId, String recoveryTimestamp, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBackupRestoreInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/restore-info", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "backup-id", backupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "recovery-timestamp", recoveryTimestamp));
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

    ParameterizedTypeReference<DbBackupRestoreInfo> returnType = new ParameterizedTypeReference<DbBackupRestoreInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of backups for a Availability machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param name Name of the backup (optional)
     * @param primaryBackupsOnly Setting this would only return the primary backups (i.e. the RPO based/manual backups taken directly on the service) (optional, default to false)
     * @param sanitizationScheduleId sanitization-schedule-id (optional)
     * @param types types (optional)
     * @param skipTypes skip-types (optional)
     * @param dapBased Whether to return Dap based backups or not (optional)
     * @param loadSubscriptions load-subscriptions (optional, default to false)
     * @param backupIdentifier backupIdentifier (optional)
     * @param dbBackupType  (optional)
     * @param retentionTypes Filter backups based on retention type/s (optional)
     * @param loadStorageSnapshots  (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return List&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DatabaseBackupOps> getBackups(UUID dmmId, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, String name, Boolean primaryBackupsOnly, UUID sanitizationScheduleId, List<BackupType> types, List<BackupType> skipTypes, Boolean dapBased, Boolean loadSubscriptions, UUID backupIdentifier, DbBackupType dbBackupType, List<DbBackupRetentionType> retentionTypes, Boolean loadStorageSnapshots, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getBackupsWithHttpInfo(dmmId, statuses, skipStatuses, name, primaryBackupsOnly, sanitizationScheduleId, types, skipTypes, dapBased, loadSubscriptions, backupIdentifier, dbBackupType, retentionTypes, loadStorageSnapshots, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of backups for a Availability machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param name Name of the backup (optional)
     * @param primaryBackupsOnly Setting this would only return the primary backups (i.e. the RPO based/manual backups taken directly on the service) (optional, default to false)
     * @param sanitizationScheduleId sanitization-schedule-id (optional)
     * @param types types (optional)
     * @param skipTypes skip-types (optional)
     * @param dapBased Whether to return Dap based backups or not (optional)
     * @param loadSubscriptions load-subscriptions (optional, default to false)
     * @param backupIdentifier backupIdentifier (optional)
     * @param dbBackupType  (optional)
     * @param retentionTypes Filter backups based on retention type/s (optional)
     * @param loadStorageSnapshots  (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;List&lt;DatabaseBackupOps&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DatabaseBackupOps>> getBackupsWithHttpInfo(UUID dmmId, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, String name, Boolean primaryBackupsOnly, UUID sanitizationScheduleId, List<BackupType> types, List<BackupType> skipTypes, Boolean dapBased, Boolean loadSubscriptions, UUID backupIdentifier, DbBackupType dbBackupType, List<DbBackupRetentionType> retentionTypes, Boolean loadStorageSnapshots, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getBackups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary-backups-only", primaryBackupsOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sanitization-schedule-id", sanitizationScheduleId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-types", skipTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dap-based", dapBased));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscriptions", loadSubscriptions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "backup-identifier", backupIdentifier));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "db-backup-type", dbBackupType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "retention-types", retentionTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-storage-snapshots", loadStorageSnapshots));
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

    ParameterizedTypeReference<List<DatabaseBackupOps>> returnType = new ParameterizedTypeReference<List<DatabaseBackupOps>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Backups for a DAP
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId ID of the Access Policy (required)
     * @param name Name of the backup (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param loadSubscriptions load-subscriptions (optional, default to false)
     * @param types types (optional)
     * @param skipTypes skip-types (optional)
     * @param dbBackupType  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetBackupsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetBackupsApiResponse getBackupsForDap(UUID dmmId, UUID dapId, String name, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, Boolean loadSubscriptions, List<BackupType> types, List<BackupType> skipTypes, DbBackupType dbBackupType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getBackupsForDapWithHttpInfo(dmmId, dapId, name, statuses, skipStatuses, loadSubscriptions, types, skipTypes, dbBackupType, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get Backups for a DAP
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId ID of the Access Policy (required)
     * @param name Name of the backup (optional)
     * @param statuses statuses (optional)
     * @param skipStatuses skip-statuses (optional)
     * @param loadSubscriptions load-subscriptions (optional, default to false)
     * @param types types (optional)
     * @param skipTypes skip-types (optional)
     * @param dbBackupType  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetBackupsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetBackupsApiResponse> getBackupsForDapWithHttpInfo(UUID dmmId, UUID dapId, String name, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, Boolean loadSubscriptions, List<BackupType> types, List<BackupType> skipTypes, DbBackupType dbBackupType, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getBackupsForDap");
        }
        
        // verify the required parameter 'dapId' is set
        if (dapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dapId' when calling getBackupsForDap");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dapId", dapId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-policies/{dapId}/backups", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscriptions", loadSubscriptions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-types", skipTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "db-backup-type", dbBackupType));
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

    ParameterizedTypeReference<GetBackupsApiResponse> returnType = new ParameterizedTypeReference<GetBackupsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Backups for utilization
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param primaryBackupsOnly Whether to return primary backups only (optional, default to false)
     * @param dapId dapId (optional)
     * @param filterOnBackupTime filter-on-backup-time (optional, default to false)
     * @param filterOnDeletedForUserTime filter-on-deleted-for-user-time (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param statuses status list (optional)
     * @param skipStatuses status list (optional)
     * @param loadStorageSnapshots  (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return List&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<DatabaseBackupOps> getBackupsForUtilization(UUID dmmId, Boolean primaryBackupsOnly, UUID dapId, Boolean filterOnBackupTime, Boolean filterOnDeletedForUserTime, Boolean loadSubscriptionInfo, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, Boolean loadStorageSnapshots, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getBackupsForUtilizationWithHttpInfo(dmmId, primaryBackupsOnly, dapId, filterOnBackupTime, filterOnDeletedForUserTime, loadSubscriptionInfo, statuses, skipStatuses, loadStorageSnapshots, timeRangeBeginAt, timeRangeEndAt, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Backups for utilization
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param primaryBackupsOnly Whether to return primary backups only (optional, default to false)
     * @param dapId dapId (optional)
     * @param filterOnBackupTime filter-on-backup-time (optional, default to false)
     * @param filterOnDeletedForUserTime filter-on-deleted-for-user-time (optional, default to false)
     * @param loadSubscriptionInfo load-subscription-info (optional, default to false)
     * @param statuses status list (optional)
     * @param skipStatuses status list (optional)
     * @param loadStorageSnapshots  (optional, default to false)
     * @param timeRangeBeginAt Start timestamp (optional)
     * @param timeRangeEndAt End timestamp (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;List&lt;DatabaseBackupOps&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<DatabaseBackupOps>> getBackupsForUtilizationWithHttpInfo(UUID dmmId, Boolean primaryBackupsOnly, UUID dapId, Boolean filterOnBackupTime, Boolean filterOnDeletedForUserTime, Boolean loadSubscriptionInfo, List<DbBackupStatus> statuses, List<DbBackupStatus> skipStatuses, Boolean loadStorageSnapshots, String timeRangeBeginAt, String timeRangeEndAt, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getBackupsForUtilization");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/utilization", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "primary-backups-only", primaryBackupsOnly));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dapId", dapId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-backup-time", filterOnBackupTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filter-on-deleted-for-user-time", filterOnDeletedForUserTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-subscription-info", loadSubscriptionInfo));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-storage-snapshots", loadStorageSnapshots));
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

    ParameterizedTypeReference<List<DatabaseBackupOps>> returnType = new ParameterizedTypeReference<List<DatabaseBackupOps>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Backups for internal use
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status status (required)
     * @param name Name of the backup (optional)
     * @param dbBackupType  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellDatabaseBackupsInternalResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseBackupsInternalResponse getBackupsInternal(List<DbBackupStatus> status, String name, DbBackupType dbBackupType, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getBackupsInternalWithHttpInfo(status, name, dbBackupType, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of available Backups for internal use
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status status (required)
     * @param name Name of the backup (optional)
     * @param dbBackupType  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellDatabaseBackupsInternalResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseBackupsInternalResponse> getBackupsInternalWithHttpInfo(List<DbBackupStatus> status, String name, DbBackupType dbBackupType, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling getBackupsInternal");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/backups", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "db-backup-type", dbBackupType));
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

    ParameterizedTypeReference<TessellDatabaseBackupsInternalResponse> returnType = new ParameterizedTypeReference<TessellDatabaseBackupsInternalResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Backups
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param name Name of the backup (optional)
     * @param status status (optional)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backups info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDatabaseBackupsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDatabaseBackupsResponse getDatabaseBackups(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseBackupsWithHttpInfo(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Backups
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param name Name of the backup (optional)
     * @param status status (optional)
     * @param automated Specify if automated backups info is to be fetched (optional, default to true)
     * @param manual Specify if manual backups info is to be fetched (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDatabaseBackupsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDatabaseBackupsResponse> getDatabaseBackupsWithHttpInfo(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getDatabaseBackups");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/backups", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetDatabaseBackupsResponse> returnType = new ParameterizedTypeReference<GetDatabaseBackupsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about the specified snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the snapshot (required)
     * @return DatabaseSnapshot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseSnapshot getDatabaseSnapshot(UUID availabilityMachineId, UUID id) throws RestClientException {
        return getDatabaseSnapshotWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * Get details about the specified snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the snapshot (required)
     * @return ResponseEntity&lt;DatabaseSnapshot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseSnapshot> getDatabaseSnapshotWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getDatabaseSnapshot");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDatabaseSnapshot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/snapshots/{id}", uriVariables);

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

    ParameterizedTypeReference<DatabaseSnapshot> returnType = new ParameterizedTypeReference<DatabaseSnapshot>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of snapshots for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param name Filter the result based on snapshot name (optional)
     * @param status Filter the result based on snapshot status (optional)
     * @param automated Filter the result based on if the snapshot is automated (optional, default to true)
     * @param manual Filter the result based on if the snapshot is manual (optional, default to true)
     * @param sanitizable Filter the result based on if the snapshot is sanitizable (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDatabaseSnapshotsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDatabaseSnapshotsResponse getDatabaseSnapshots(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean sanitizable, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseSnapshotsWithHttpInfo(availabilityMachineId, name, status, automated, manual, sanitizable, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of snapshots for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param name Filter the result based on snapshot name (optional)
     * @param status Filter the result based on snapshot status (optional)
     * @param automated Filter the result based on if the snapshot is automated (optional, default to true)
     * @param manual Filter the result based on if the snapshot is manual (optional, default to true)
     * @param sanitizable Filter the result based on if the snapshot is sanitizable (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDatabaseSnapshotsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDatabaseSnapshotsResponse> getDatabaseSnapshotsWithHttpInfo(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean sanitizable, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getDatabaseSnapshots");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/snapshots", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "sanitizable", sanitizable));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetDatabaseSnapshotsResponse> returnType = new ParameterizedTypeReference<GetDatabaseSnapshotsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get backup chain for a given Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of backup (required)
     * @param forward For a specified backup, get forward chain of backups until next full backup (excluding next full backup) (optional, default to false)
     * @return DbBackupChainInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbBackupChainInfo getDbBackupChainInfo(UUID dmmId, UUID backupId, Boolean forward) throws RestClientException {
        return getDbBackupChainInfoWithHttpInfo(dmmId, backupId, forward).getBody();
    }

    /**
     * Get backup chain for a given Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of backup (required)
     * @param forward For a specified backup, get forward chain of backups until next full backup (excluding next full backup) (optional, default to false)
     * @return ResponseEntity&lt;DbBackupChainInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbBackupChainInfo> getDbBackupChainInfoWithHttpInfo(UUID dmmId, UUID backupId, Boolean forward) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbBackupChainInfo");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling getDbBackupChainInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("backupId", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{backupId}/backup-chain", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "forward", forward));

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

    ParameterizedTypeReference<DbBackupChainInfo> returnType = new ParameterizedTypeReference<DbBackupChainInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of backups info which share the same underlying cloud snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloudResourceId The cloud resource id for the backup (required)
     * @param evaluateLeakage Specify whether to evaluate leakage for the specified cloud-resource-id (optional, default to false)
     * @return DbBackupCloudResourceSharingInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbBackupCloudResourceSharingInfo getDbBackupCloudResourceSharingInfo(UUID dmmId, String cloudResourceId, Boolean evaluateLeakage) throws RestClientException {
        return getDbBackupCloudResourceSharingInfoWithHttpInfo(dmmId, cloudResourceId, evaluateLeakage).getBody();
    }

    /**
     * Get list of backups info which share the same underlying cloud snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloudResourceId The cloud resource id for the backup (required)
     * @param evaluateLeakage Specify whether to evaluate leakage for the specified cloud-resource-id (optional, default to false)
     * @return ResponseEntity&lt;DbBackupCloudResourceSharingInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbBackupCloudResourceSharingInfo> getDbBackupCloudResourceSharingInfoWithHttpInfo(UUID dmmId, String cloudResourceId, Boolean evaluateLeakage) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbBackupCloudResourceSharingInfo");
        }
        
        // verify the required parameter 'cloudResourceId' is set
        if (cloudResourceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudResourceId' when calling getDbBackupCloudResourceSharingInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/cloud-resource-sharing-info", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-id", cloudResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "evaluate-leakage", evaluateLeakage));

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

    ParameterizedTypeReference<DbBackupCloudResourceSharingInfo> returnType = new ParameterizedTypeReference<DbBackupCloudResourceSharingInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get backup lineage info for a given Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of backup (required)
     * @return DbBackupLineageInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbBackupLineageInfo getDbBackupLineageInfo(UUID dmmId, UUID backupId) throws RestClientException {
        return getDbBackupLineageInfoWithHttpInfo(dmmId, backupId).getBody();
    }

    /**
     * Get backup lineage info for a given Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of backup (required)
     * @return ResponseEntity&lt;DbBackupLineageInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbBackupLineageInfo> getDbBackupLineageInfoWithHttpInfo(UUID dmmId, UUID backupId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbBackupLineageInfo");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling getDbBackupLineageInfo");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("backupId", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{backupId}/lineage-info", uriVariables);

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

    ParameterizedTypeReference<DbBackupLineageInfo> returnType = new ParameterizedTypeReference<DbBackupLineageInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about the specified Sanitized Snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the Sanitized Snapshot (required)
     * @return SanitizedDatabaseSnapshot
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public SanitizedDatabaseSnapshot getSanitizedDatabaseSnapshot(UUID availabilityMachineId, UUID id) throws RestClientException {
        return getSanitizedDatabaseSnapshotWithHttpInfo(availabilityMachineId, id).getBody();
    }

    /**
     * Get details about the specified Sanitized Snapshot
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param id ID of the Sanitized Snapshot (required)
     * @return ResponseEntity&lt;SanitizedDatabaseSnapshot&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<SanitizedDatabaseSnapshot> getSanitizedDatabaseSnapshotWithHttpInfo(UUID availabilityMachineId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getSanitizedDatabaseSnapshot");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSanitizedDatabaseSnapshot");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitized-snapshots/{id}", uriVariables);

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

    ParameterizedTypeReference<SanitizedDatabaseSnapshot> returnType = new ParameterizedTypeReference<SanitizedDatabaseSnapshot>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of sanitized snapshots for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param name Filter the result based on Sanitized Snapshot name (optional)
     * @param status Filter the result based on Sanitized Snapshot status (optional)
     * @param automated Filter the result based on if the Sanitized Snapshot is automated (optional, default to true)
     * @param manual Filter the result based on if the Sanitized Snapshot is manual (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSanitizedDatabaseSnapshotsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSanitizedDatabaseSnapshotsResponse getSanitizedDatabaseSnapshots(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSanitizedDatabaseSnapshotsWithHttpInfo(availabilityMachineId, name, status, automated, manual, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of sanitized snapshots for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param name Filter the result based on Sanitized Snapshot name (optional)
     * @param status Filter the result based on Sanitized Snapshot status (optional)
     * @param automated Filter the result based on if the Sanitized Snapshot is automated (optional, default to true)
     * @param manual Filter the result based on if the Sanitized Snapshot is manual (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSanitizedDatabaseSnapshotsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSanitizedDatabaseSnapshotsResponse> getSanitizedDatabaseSnapshotsWithHttpInfo(UUID availabilityMachineId, String name, List<DatabaseBackupStatus> status, Boolean automated, Boolean manual, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getSanitizedDatabaseSnapshots");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/sanitized-snapshots", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
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

    ParameterizedTypeReference<GetSanitizedDatabaseSnapshotsResponse> returnType = new ParameterizedTypeReference<GetSanitizedDatabaseSnapshotsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Lock a backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of the backup (required)
     * @param tessellLockBackupPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus lockBackup(UUID dmmId, UUID backupId, TessellLockBackupPayload tessellLockBackupPayload) throws RestClientException {
        return lockBackupWithHttpInfo(dmmId, backupId, tessellLockBackupPayload).getBody();
    }

    /**
     * Lock a backup entry
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param backupId ID of the backup (required)
     * @param tessellLockBackupPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> lockBackupWithHttpInfo(UUID dmmId, UUID backupId, TessellLockBackupPayload tessellLockBackupPayload) throws RestClientException {
        Object postBody = tessellLockBackupPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling lockBackup");
        }
        
        // verify the required parameter 'backupId' is set
        if (backupId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'backupId' when calling lockBackup");
        }
        
        // verify the required parameter 'tessellLockBackupPayload' is set
        if (tessellLockBackupPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellLockBackupPayload' when calling lockBackup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("backupId", backupId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{backupId}/lock", uriVariables);

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
     * Callback for bulk pre auth urls creation
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param preAuthUrlsCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void preAuthUrlsCallback(UUID id, PreAuthUrlsCallbackPayload preAuthUrlsCallbackPayload) throws RestClientException {
        preAuthUrlsCallbackWithHttpInfo(id, preAuthUrlsCallbackPayload);
    }

    /**
     * Callback for bulk pre auth urls creation
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param preAuthUrlsCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> preAuthUrlsCallbackWithHttpInfo(UUID id, PreAuthUrlsCallbackPayload preAuthUrlsCallbackPayload) throws RestClientException {
        Object postBody = preAuthUrlsCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling preAuthUrlsCallback");
        }
        
        // verify the required parameter 'preAuthUrlsCallbackPayload' is set
        if (preAuthUrlsCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'preAuthUrlsCallbackPayload' when calling preAuthUrlsCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/pre-auth-urls/callback", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Internal request to refresh snapshot size from respective cloud
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param forAllAms Refresh snapshot size for all Availability machines (optional, default to false)
     * @param forRecordedAms Refresh snapshot size for recorded Availability machines (optional, default to false)
     * @param refreshSnapshotSizeTaskPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary refreshBackupSizeRequestOps(Boolean forAllAms, Boolean forRecordedAms, RefreshSnapshotSizeTaskPayload refreshSnapshotSizeTaskPayload) throws RestClientException {
        return refreshBackupSizeRequestOpsWithHttpInfo(forAllAms, forRecordedAms, refreshSnapshotSizeTaskPayload).getBody();
    }

    /**
     * Internal request to refresh snapshot size from respective cloud
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param forAllAms Refresh snapshot size for all Availability machines (optional, default to false)
     * @param forRecordedAms Refresh snapshot size for recorded Availability machines (optional, default to false)
     * @param refreshSnapshotSizeTaskPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> refreshBackupSizeRequestOpsWithHttpInfo(Boolean forAllAms, Boolean forRecordedAms, RefreshSnapshotSizeTaskPayload refreshSnapshotSizeTaskPayload) throws RestClientException {
        Object postBody = refreshSnapshotSizeTaskPayload;
        
        String path = apiClient.expandPath("/tessell-ops/dmms/backups/refresh-size", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "for-all-ams", forAllAms));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "for-recorded-ams", forRecordedAms));

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for snapshot database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param replicateBackupsCallbackPayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus replicateBackupsCallback(UUID id, ReplicateBackupsCallbackPayload replicateBackupsCallbackPayload) throws RestClientException {
        return replicateBackupsCallbackWithHttpInfo(id, replicateBackupsCallbackPayload).getBody();
    }

    /**
     * Callback for snapshot database service
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Availability Machine (required)
     * @param replicateBackupsCallbackPayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> replicateBackupsCallbackWithHttpInfo(UUID id, ReplicateBackupsCallbackPayload replicateBackupsCallbackPayload) throws RestClientException {
        Object postBody = replicateBackupsCallbackPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling replicateBackupsCallback");
        }
        
        // verify the required parameter 'replicateBackupsCallbackPayload' is set
        if (replicateBackupsCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replicateBackupsCallbackPayload' when calling replicateBackupsCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{id}/callback/replicate-backups", uriVariables);

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
     * Update a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param databaseBackupOps  (required)
     * @param forStopDb for stop of database, this backup would be used while starting the database (optional, default to false)
     * @return DatabaseBackupOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackupOps updateBackup(UUID dmmId, UUID id, DatabaseBackupOps databaseBackupOps, Boolean forStopDb) throws RestClientException {
        return updateBackupWithHttpInfo(dmmId, id, databaseBackupOps, forStopDb).getBody();
    }

    /**
     * Update a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param databaseBackupOps  (required)
     * @param forStopDb for stop of database, this backup would be used while starting the database (optional, default to false)
     * @return ResponseEntity&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackupOps> updateBackupWithHttpInfo(UUID dmmId, UUID id, DatabaseBackupOps databaseBackupOps, Boolean forStopDb) throws RestClientException {
        Object postBody = databaseBackupOps;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateBackup");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateBackup");
        }
        
        // verify the required parameter 'databaseBackupOps' is set
        if (databaseBackupOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseBackupOps' when calling updateBackup");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "for-stop-db", forStopDb));

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

    ParameterizedTypeReference<DatabaseBackupOps> returnType = new ParameterizedTypeReference<DatabaseBackupOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Backup Size information
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param updateSnapshotSizePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateBackupSizeOps(UUID dmmId, UpdateSnapshotSizePayload updateSnapshotSizePayload) throws RestClientException {
        return updateBackupSizeOpsWithHttpInfo(dmmId, updateSnapshotSizePayload).getBody();
    }

    /**
     * Update Backup Size information
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param updateSnapshotSizePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateBackupSizeOpsWithHttpInfo(UUID dmmId, UpdateSnapshotSizePayload updateSnapshotSizePayload) throws RestClientException {
        Object postBody = updateSnapshotSizePayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateBackupSizeOps");
        }
        
        // verify the required parameter 'updateSnapshotSizePayload' is set
        if (updateSnapshotSizePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateSnapshotSizePayload' when calling updateBackupSizeOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/size", uriVariables);

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
     * Update a Tessell Database Backup using PUT
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param databaseBackupOps  (required)
     * @return DatabaseBackupOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseBackupOps updateBackupWithPut(UUID dmmId, UUID id, DatabaseBackupOps databaseBackupOps) throws RestClientException {
        return updateBackupWithPutWithHttpInfo(dmmId, id, databaseBackupOps).getBody();
    }

    /**
     * Update a Tessell Database Backup using PUT
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param id ID of the backup (required)
     * @param databaseBackupOps  (required)
     * @return ResponseEntity&lt;DatabaseBackupOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseBackupOps> updateBackupWithPutWithHttpInfo(UUID dmmId, UUID id, DatabaseBackupOps databaseBackupOps) throws RestClientException {
        Object postBody = databaseBackupOps;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateBackupWithPut");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateBackupWithPut");
        }
        
        // verify the required parameter 'databaseBackupOps' is set
        if (databaseBackupOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseBackupOps' when calling updateBackupWithPut");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/{id}", uriVariables);

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

    ParameterizedTypeReference<DatabaseBackupOps> returnType = new ParameterizedTypeReference<DatabaseBackupOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Validate a backup for clone creation
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloneBackupValidationPayload  (required)
     * @return CloneBackupValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CloneBackupValidationResponse validateBackupForCloneCreation(UUID dmmId, CloneBackupValidationPayload cloneBackupValidationPayload) throws RestClientException {
        return validateBackupForCloneCreationWithHttpInfo(dmmId, cloneBackupValidationPayload).getBody();
    }

    /**
     * Validate a backup for clone creation
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param cloneBackupValidationPayload  (required)
     * @return ResponseEntity&lt;CloneBackupValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CloneBackupValidationResponse> validateBackupForCloneCreationWithHttpInfo(UUID dmmId, CloneBackupValidationPayload cloneBackupValidationPayload) throws RestClientException {
        Object postBody = cloneBackupValidationPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling validateBackupForCloneCreation");
        }
        
        // verify the required parameter 'cloneBackupValidationPayload' is set
        if (cloneBackupValidationPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloneBackupValidationPayload' when calling validateBackupForCloneCreation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/backups/clone-validation", uriVariables);

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

    ParameterizedTypeReference<CloneBackupValidationResponse> returnType = new ParameterizedTypeReference<CloneBackupValidationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
