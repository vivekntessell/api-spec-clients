package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.StorageSnapshotOps;
import com.tessell.dmm.client.model.StorageSnapshotStatusOps;
import com.tessell.dmm.client.model.StorageSnapshotsResponseOps;
import com.tessell.dmm.client.model.StorageType;
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
@Component("com.tessell.dmm.client.api.TessellStorageSnapshotApi")
public class TessellStorageSnapshotApi {
    private ApiClient apiClient;

    public TessellStorageSnapshotApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellStorageSnapshotApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Creates a metadata entry for Snapshot of a Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param storageSnapshotOps  (required)
     * @return StorageSnapshotOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageSnapshotOps createStorageSnapshotOps(UUID storageId, StorageSnapshotOps storageSnapshotOps) throws RestClientException {
        return createStorageSnapshotOpsWithHttpInfo(storageId, storageSnapshotOps).getBody();
    }

    /**
     * Creates a metadata entry for Snapshot of a Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param storageSnapshotOps  (required)
     * @return ResponseEntity&lt;StorageSnapshotOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageSnapshotOps> createStorageSnapshotOpsWithHttpInfo(UUID storageId, StorageSnapshotOps storageSnapshotOps) throws RestClientException {
        Object postBody = storageSnapshotOps;
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling createStorageSnapshotOps");
        }
        
        // verify the required parameter 'storageSnapshotOps' is set
        if (storageSnapshotOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageSnapshotOps' when calling createStorageSnapshotOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storage-id", storageId);
        String path = apiClient.expandPath("/tessell-ops/storages/{storage-id}/snapshots", uriVariables);

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

    ParameterizedTypeReference<StorageSnapshotOps> returnType = new ParameterizedTypeReference<StorageSnapshotOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Creates metadata entries for given storage snapshots
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageSnapshotOps  (required)
     * @return List&lt;StorageSnapshotOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StorageSnapshotOps> createStorageSnapshotsOps(List<StorageSnapshotOps> storageSnapshotOps) throws RestClientException {
        return createStorageSnapshotsOpsWithHttpInfo(storageSnapshotOps).getBody();
    }

    /**
     * Creates metadata entries for given storage snapshots
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageSnapshotOps  (required)
     * @return ResponseEntity&lt;List&lt;StorageSnapshotOps&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<StorageSnapshotOps>> createStorageSnapshotsOpsWithHttpInfo(List<StorageSnapshotOps> storageSnapshotOps) throws RestClientException {
        Object postBody = storageSnapshotOps;
        
        // verify the required parameter 'storageSnapshotOps' is set
        if (storageSnapshotOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageSnapshotOps' when calling createStorageSnapshotsOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/storages/snapshots", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<StorageSnapshotOps>> returnType = new ParameterizedTypeReference<List<StorageSnapshotOps>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete the snapshot of a storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @param softDelete  (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteStorageSnapshotOps(UUID storageId, UUID snapshotId, Boolean softDelete) throws RestClientException {
        return deleteStorageSnapshotOpsWithHttpInfo(storageId, snapshotId, softDelete).getBody();
    }

    /**
     * Delete the snapshot of a storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @param softDelete  (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteStorageSnapshotOpsWithHttpInfo(UUID storageId, UUID snapshotId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling deleteStorageSnapshotOps");
        }
        
        // verify the required parameter 'snapshotId' is set
        if (snapshotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'snapshotId' when calling deleteStorageSnapshotOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storage-id", storageId);
        uriVariables.put("snapshot-id", snapshotId);
        String path = apiClient.expandPath("/tessell-ops/storages/{storage-id}/snapshots/{snapshot-id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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
     * Returns the snapshot of a storage details
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @return StorageSnapshotOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageSnapshotOps getStorageSnapshotOps(UUID storageId, UUID snapshotId) throws RestClientException {
        return getStorageSnapshotOpsWithHttpInfo(storageId, snapshotId).getBody();
    }

    /**
     * Returns the snapshot of a storage details
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @return ResponseEntity&lt;StorageSnapshotOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageSnapshotOps> getStorageSnapshotOpsWithHttpInfo(UUID storageId, UUID snapshotId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling getStorageSnapshotOps");
        }
        
        // verify the required parameter 'snapshotId' is set
        if (snapshotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'snapshotId' when calling getStorageSnapshotOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storage-id", storageId);
        uriVariables.put("snapshot-id", snapshotId);
        String path = apiClient.expandPath("/tessell-ops/storages/{storage-id}/snapshots/{snapshot-id}", uriVariables);

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

    ParameterizedTypeReference<StorageSnapshotOps> returnType = new ParameterizedTypeReference<StorageSnapshotOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns all the storage-snapshot entities per the filter parameters
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (optional)
     * @param databaseBackupId  (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param storageTypes  (optional)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param pageSize Page size for get query (optional, default to 10)
     * @return StorageSnapshotsResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageSnapshotsResponseOps getStorageSnapshotsOps(UUID storageId, UUID databaseBackupId, List<StorageSnapshotStatusOps> statuses, List<StorageSnapshotStatusOps> skipStatuses, List<StorageType> storageTypes, Integer pageOffset, Integer pageSize) throws RestClientException {
        return getStorageSnapshotsOpsWithHttpInfo(storageId, databaseBackupId, statuses, skipStatuses, storageTypes, pageOffset, pageSize).getBody();
    }

    /**
     * Returns all the storage-snapshot entities per the filter parameters
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (optional)
     * @param databaseBackupId  (optional)
     * @param statuses  (optional)
     * @param skipStatuses  (optional)
     * @param storageTypes  (optional)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param pageSize Page size for get query (optional, default to 10)
     * @return ResponseEntity&lt;StorageSnapshotsResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageSnapshotsResponseOps> getStorageSnapshotsOpsWithHttpInfo(UUID storageId, UUID databaseBackupId, List<StorageSnapshotStatusOps> statuses, List<StorageSnapshotStatusOps> skipStatuses, List<StorageType> storageTypes, Integer pageOffset, Integer pageSize) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/storages/snapshots", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "storage-id", storageId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "database-backup-id", databaseBackupId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "storage-types", storageTypes));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));

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

    ParameterizedTypeReference<StorageSnapshotsResponseOps> returnType = new ParameterizedTypeReference<StorageSnapshotsResponseOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates a metadata entry for Snapshot of a Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @param storageSnapshotOps  (required)
     * @return StorageSnapshotOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public StorageSnapshotOps updateStorageSnapshotOps(UUID storageId, UUID snapshotId, StorageSnapshotOps storageSnapshotOps) throws RestClientException {
        return updateStorageSnapshotOpsWithHttpInfo(storageId, snapshotId, storageSnapshotOps).getBody();
    }

    /**
     * Updates a metadata entry for Snapshot of a Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageId  (required)
     * @param snapshotId  (required)
     * @param storageSnapshotOps  (required)
     * @return ResponseEntity&lt;StorageSnapshotOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<StorageSnapshotOps> updateStorageSnapshotOpsWithHttpInfo(UUID storageId, UUID snapshotId, StorageSnapshotOps storageSnapshotOps) throws RestClientException {
        Object postBody = storageSnapshotOps;
        
        // verify the required parameter 'storageId' is set
        if (storageId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageId' when calling updateStorageSnapshotOps");
        }
        
        // verify the required parameter 'snapshotId' is set
        if (snapshotId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'snapshotId' when calling updateStorageSnapshotOps");
        }
        
        // verify the required parameter 'storageSnapshotOps' is set
        if (storageSnapshotOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageSnapshotOps' when calling updateStorageSnapshotOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("storage-id", storageId);
        uriVariables.put("snapshot-id", snapshotId);
        String path = apiClient.expandPath("/tessell-ops/storages/{storage-id}/snapshots/{snapshot-id}", uriVariables);

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

    ParameterizedTypeReference<StorageSnapshotOps> returnType = new ParameterizedTypeReference<StorageSnapshotOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates multiple metadata storage-snapshot entries.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageSnapshotOps  (required)
     * @return List&lt;StorageSnapshotOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<StorageSnapshotOps> updateStorageSnapshotsOps(List<StorageSnapshotOps> storageSnapshotOps) throws RestClientException {
        return updateStorageSnapshotsOpsWithHttpInfo(storageSnapshotOps).getBody();
    }

    /**
     * Updates multiple metadata storage-snapshot entries.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param storageSnapshotOps  (required)
     * @return ResponseEntity&lt;List&lt;StorageSnapshotOps&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<StorageSnapshotOps>> updateStorageSnapshotsOpsWithHttpInfo(List<StorageSnapshotOps> storageSnapshotOps) throws RestClientException {
        Object postBody = storageSnapshotOps;
        
        // verify the required parameter 'storageSnapshotOps' is set
        if (storageSnapshotOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'storageSnapshotOps' when calling updateStorageSnapshotsOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/storages/snapshots", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<StorageSnapshotOps>> returnType = new ParameterizedTypeReference<List<StorageSnapshotOps>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
