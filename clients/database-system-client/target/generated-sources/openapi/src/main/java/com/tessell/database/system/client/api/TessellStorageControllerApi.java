package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.StorageTier;
import com.tessell.database.system.client.model.StorageType;
import com.tessell.database.system.client.model.TessellStorageDTO;
import com.tessell.database.system.client.model.TessellStorageListResponse;
import com.tessell.database.system.client.model.TessellStorageStatus;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@Component("com.tessell.database.system.client.api.TessellStorageControllerApi")
public class TessellStorageControllerApi {
    private ApiClient apiClient;

    public TessellStorageControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellStorageControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellStorageDTO  (required)
     * @return TessellStorageDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellStorageDTO createStorage(TessellStorageDTO tessellStorageDTO) throws RestClientException {
        return createStorageWithHttpInfo(tessellStorageDTO).getBody();
    }

    /**
     * Create a new Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellStorageDTO  (required)
     * @return ResponseEntity&lt;TessellStorageDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellStorageDTO> createStorageWithHttpInfo(TessellStorageDTO tessellStorageDTO) throws RestClientException {
        Object postBody = tessellStorageDTO;
        
        // verify the required parameter 'tessellStorageDTO' is set
        if (tessellStorageDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellStorageDTO' when calling createStorage");
        }
        
        String path = apiClient.expandPath("/tessell-ops/storages", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellStorageDTO> returnType = new ParameterizedTypeReference<TessellStorageDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteStorage(UUID id, Boolean softDelete) throws RestClientException {
        return deleteStorageWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteStorageWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteStorage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/storages/{id}", uriVariables);

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
     * View details about a Tessell Managed Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param timeZone time-zone (optional)
     * @return TessellStorageDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellStorageDTO getStorage(UUID id, String timeZone) throws RestClientException {
        return getStorageWithHttpInfo(id, timeZone).getBody();
    }

    /**
     * View details about a Tessell Managed Storage
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param timeZone time-zone (optional)
     * @return ResponseEntity&lt;TessellStorageDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellStorageDTO> getStorageWithHttpInfo(UUID id, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getStorage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/storages/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellStorageDTO> returnType = new ParameterizedTypeReference<TessellStorageDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Managed Storages
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses Statuses of Tessell Storage to be included. (optional)
     * @param skipStatuses Statuses of Tessell Storage not to be included. (optional)
     * @param type type (optional)
     * @param cloudResourceId Cloud resource id like AWS storage id: vol-0a8b520b873aae582 (optional)
     * @param cloudLocationId Cloud location id like aws/ap-south-1/ap-south-1a (optional)
     * @param storageTiers Storage tier of Tessell Storage (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellStorageListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellStorageListResponse getStorages(String name, List<TessellStorageStatus> statuses, List<TessellStorageStatus> skipStatuses, StorageType type, String cloudResourceId, String cloudLocationId, List<StorageTier> storageTiers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getStoragesWithHttpInfo(name, statuses, skipStatuses, type, cloudResourceId, cloudLocationId, storageTiers, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Managed Storages
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param statuses Statuses of Tessell Storage to be included. (optional)
     * @param skipStatuses Statuses of Tessell Storage not to be included. (optional)
     * @param type type (optional)
     * @param cloudResourceId Cloud resource id like AWS storage id: vol-0a8b520b873aae582 (optional)
     * @param cloudLocationId Cloud location id like aws/ap-south-1/ap-south-1a (optional)
     * @param storageTiers Storage tier of Tessell Storage (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellStorageListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellStorageListResponse> getStoragesWithHttpInfo(String name, List<TessellStorageStatus> statuses, List<TessellStorageStatus> skipStatuses, StorageType type, String cloudResourceId, String cloudLocationId, List<StorageTier> storageTiers, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/storages", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-resource-id", cloudResourceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location-id", cloudLocationId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "storage-tiers", storageTiers));
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

    ParameterizedTypeReference<TessellStorageListResponse> returnType = new ParameterizedTypeReference<TessellStorageListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellStorageDTO  (required)
     * @return TessellStorageDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellStorageDTO updateStorage(UUID id, TessellStorageDTO tessellStorageDTO) throws RestClientException {
        return updateStorageWithHttpInfo(id, tessellStorageDTO).getBody();
    }

    /**
     * Update a Tessell Managed Storage metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tessellStorageDTO  (required)
     * @return ResponseEntity&lt;TessellStorageDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellStorageDTO> updateStorageWithHttpInfo(UUID id, TessellStorageDTO tessellStorageDTO) throws RestClientException {
        Object postBody = tessellStorageDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateStorage");
        }
        
        // verify the required parameter 'tessellStorageDTO' is set
        if (tessellStorageDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellStorageDTO' when calling updateStorage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/storages/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellStorageDTO> returnType = new ParameterizedTypeReference<TessellStorageDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
