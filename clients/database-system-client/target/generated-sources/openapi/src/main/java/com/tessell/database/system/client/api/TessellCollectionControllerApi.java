package com.tessell.database.system.client.api;

import com.tessell.database.system.client.invoker.ApiClient;

import com.tessell.database.system.client.model.ApiError;
import com.tessell.database.system.client.model.ApiErrorOps;
import com.tessell.database.system.client.model.ApiStatus;
import com.tessell.database.system.client.model.CollectionsCallbackPayload;
import com.tessell.database.system.client.model.DbCollectionCreatePayload;
import com.tessell.database.system.client.model.DbCollectionDTO;
import com.tessell.database.system.client.model.DbCollectionIndexDTO;
import com.tessell.database.system.client.model.DbCollectionIndexOpsDTO;
import com.tessell.database.system.client.model.DbCollectionIndexOpsResponse;
import com.tessell.database.system.client.model.DbCollectionIndexPayload;
import com.tessell.database.system.client.model.DbCollectionIndexStatus;
import com.tessell.database.system.client.model.DbCollectionOpsDTO;
import com.tessell.database.system.client.model.DbCollectionStatus;
import com.tessell.database.system.client.model.DbCollectionsIndexResponse;
import com.tessell.database.system.client.model.DbCollectionsOpsResponse;
import com.tessell.database.system.client.model.DbCollectionsResponse;
import com.tessell.database.system.client.model.DeleteDbCollectionIndexPayload;
import com.tessell.database.system.client.model.DeleteDbCollectionPayload;
import com.tessell.database.system.client.model.IndexCallbackPayload;
import com.tessell.database.system.client.model.LoadCollectionCallbackPayload;
import com.tessell.database.system.client.model.LoadCollectionPayload;
import com.tessell.database.system.client.model.ReleaseCollectionCallbackPayload;
import com.tessell.database.system.client.model.TaskSummary;
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
@Component("com.tessell.database.system.client.api.TessellCollectionControllerApi")
public class TessellCollectionControllerApi {
    private ApiClient apiClient;

    public TessellCollectionControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellCollectionControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Common Callback for create delete Collection
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionsCallbackPayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus collectionCallback(UUID serviceId, UUID databaseId, CollectionsCallbackPayload collectionsCallbackPayload) throws RestClientException {
        return collectionCallbackWithHttpInfo(serviceId, databaseId, collectionsCallbackPayload).getBody();
    }

    /**
     * Common Callback for create delete Collection
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionsCallbackPayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> collectionCallbackWithHttpInfo(UUID serviceId, UUID databaseId, CollectionsCallbackPayload collectionsCallbackPayload) throws RestClientException {
        Object postBody = collectionsCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling collectionCallback");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling collectionCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/callback", uriVariables);

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
     * Create a collection for given database ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param dbCollectionCreatePayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createDbCollection(UUID serviceId, UUID databaseId, DbCollectionCreatePayload dbCollectionCreatePayload) throws RestClientException {
        return createDbCollectionWithHttpInfo(serviceId, databaseId, dbCollectionCreatePayload).getBody();
    }

    /**
     * Create a collection for given database ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param dbCollectionCreatePayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createDbCollectionWithHttpInfo(UUID serviceId, UUID databaseId, DbCollectionCreatePayload dbCollectionCreatePayload) throws RestClientException {
        Object postBody = dbCollectionCreatePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDbCollection");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling createDbCollection");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections", uriVariables);

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
     * Create a index for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionIndexPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary createDbCollectionIndex(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionIndexPayload dbCollectionIndexPayload) throws RestClientException {
        return createDbCollectionIndexWithHttpInfo(serviceId, databaseId, collectionId, dbCollectionIndexPayload).getBody();
    }

    /**
     * Create a index for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionIndexPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> createDbCollectionIndexWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionIndexPayload dbCollectionIndexPayload) throws RestClientException {
        Object postBody = dbCollectionIndexPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDbCollectionIndex");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling createDbCollectionIndex");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling createDbCollectionIndex");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices", uriVariables);

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
     * Create a index for given collection-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionIndexOpsDTO  (optional)
     * @return DbCollectionIndexOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionIndexOpsDTO createDbCollectionIndexOps(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO) throws RestClientException {
        return createDbCollectionIndexOpsWithHttpInfo(serviceId, databaseId, collectionId, dbCollectionIndexOpsDTO).getBody();
    }

    /**
     * Create a index for given collection-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionIndexOpsDTO  (optional)
     * @return ResponseEntity&lt;DbCollectionIndexOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionIndexOpsDTO> createDbCollectionIndexOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO) throws RestClientException {
        Object postBody = dbCollectionIndexOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDbCollectionIndexOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling createDbCollectionIndexOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling createDbCollectionIndexOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices", uriVariables);

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

    ParameterizedTypeReference<DbCollectionIndexOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionIndexOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a collection for given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param dbCollectionOpsDTO  (optional)
     * @return DbCollectionOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionOpsDTO createDbCollectionOps(UUID serviceId, UUID databaseId, DbCollectionOpsDTO dbCollectionOpsDTO) throws RestClientException {
        return createDbCollectionOpsWithHttpInfo(serviceId, databaseId, dbCollectionOpsDTO).getBody();
    }

    /**
     * Create a collection for given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param dbCollectionOpsDTO  (optional)
     * @return ResponseEntity&lt;DbCollectionOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionOpsDTO> createDbCollectionOpsWithHttpInfo(UUID serviceId, UUID databaseId, DbCollectionOpsDTO dbCollectionOpsDTO) throws RestClientException {
        Object postBody = dbCollectionOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling createDbCollectionOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling createDbCollectionOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections", uriVariables);

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

    ParameterizedTypeReference<DbCollectionOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param deleteDbCollectionPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteDbCollection(UUID serviceId, UUID databaseId, UUID collectionId, DeleteDbCollectionPayload deleteDbCollectionPayload) throws RestClientException {
        return deleteDbCollectionWithHttpInfo(serviceId, databaseId, collectionId, deleteDbCollectionPayload).getBody();
    }

    /**
     * Delete collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param deleteDbCollectionPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteDbCollectionWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, DeleteDbCollectionPayload deleteDbCollectionPayload) throws RestClientException {
        Object postBody = deleteDbCollectionPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDbCollection");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling deleteDbCollection");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling deleteDbCollection");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete collection for given collection name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param deleteDbCollectionIndexPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary deleteDbCollectionIndex(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, DeleteDbCollectionIndexPayload deleteDbCollectionIndexPayload) throws RestClientException {
        return deleteDbCollectionIndexWithHttpInfo(serviceId, databaseId, collectionId, indexId, deleteDbCollectionIndexPayload).getBody();
    }

    /**
     * Delete collection for given collection name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param deleteDbCollectionIndexPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> deleteDbCollectionIndexWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, DeleteDbCollectionIndexPayload deleteDbCollectionIndexPayload) throws RestClientException {
        Object postBody = deleteDbCollectionIndexPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDbCollectionIndex");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling deleteDbCollectionIndex");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling deleteDbCollectionIndex");
        }
        
        // verify the required parameter 'indexId' is set
        if (indexId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indexId' when calling deleteDbCollectionIndex");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        uriVariables.put("index-id", indexId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Index for given collection index
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDbCollectionIndexOps(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, Boolean softDelete) throws RestClientException {
        return deleteDbCollectionIndexOpsWithHttpInfo(serviceId, databaseId, collectionId, indexId, softDelete).getBody();
    }

    /**
     * Delete Index for given collection index
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDbCollectionIndexOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDbCollectionIndexOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling deleteDbCollectionIndexOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling deleteDbCollectionIndexOps");
        }
        
        // verify the required parameter 'indexId' is set
        if (indexId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indexId' when calling deleteDbCollectionIndexOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        uriVariables.put("index-id", indexId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id}", uriVariables);

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
     * Delete collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDbCollectionOps(UUID serviceId, UUID databaseId, UUID collectionId, Boolean softDelete) throws RestClientException {
        return deleteDbCollectionOpsWithHttpInfo(serviceId, databaseId, collectionId, softDelete).getBody();
    }

    /**
     * Delete collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDbCollectionOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling deleteDbCollectionOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling deleteDbCollectionOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling deleteDbCollectionOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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
     * Get all collections for given database ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @return DbCollectionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionDTO getDbCollectionById(UUID serviceId, UUID databaseId, UUID collectionId) throws RestClientException {
        return getDbCollectionByIdWithHttpInfo(serviceId, databaseId, collectionId).getBody();
    }

    /**
     * Get all collections for given database ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @return ResponseEntity&lt;DbCollectionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionDTO> getDbCollectionByIdWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionById");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionById");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionDTO> returnType = new ParameterizedTypeReference<DbCollectionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @return DbCollectionOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionOpsDTO getDbCollectionByIdOps(UUID serviceId, UUID databaseId, UUID collectionId) throws RestClientException {
        return getDbCollectionByIdOpsWithHttpInfo(serviceId, databaseId, collectionId).getBody();
    }

    /**
     * Get collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @return ResponseEntity&lt;DbCollectionOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionOpsDTO> getDbCollectionByIdOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionByIdOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionByIdOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionByIdOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get index for the given index ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId Index ID (required)
     * @return DbCollectionIndexDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionIndexDTO getDbCollectionIndexById(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId) throws RestClientException {
        return getDbCollectionIndexByIdWithHttpInfo(serviceId, databaseId, collectionId, indexId).getBody();
    }

    /**
     * Get index for the given index ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId Index ID (required)
     * @return ResponseEntity&lt;DbCollectionIndexDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionIndexDTO> getDbCollectionIndexByIdWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionIndexById");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionIndexById");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionIndexById");
        }
        
        // verify the required parameter 'indexId' is set
        if (indexId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indexId' when calling getDbCollectionIndexById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        uriVariables.put("index-id", indexId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionIndexDTO> returnType = new ParameterizedTypeReference<DbCollectionIndexDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all indices for the given collection id
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId Index Id (required)
     * @return DbCollectionIndexOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionIndexOpsDTO getDbCollectionIndexByIdOps(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId) throws RestClientException {
        return getDbCollectionIndexByIdOpsWithHttpInfo(serviceId, databaseId, collectionId, indexId).getBody();
    }

    /**
     * Get all indices for the given collection id
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId Index Id (required)
     * @return ResponseEntity&lt;DbCollectionIndexOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionIndexOpsDTO> getDbCollectionIndexByIdOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionIndexByIdOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionIndexByIdOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionIndexByIdOps");
        }
        
        // verify the required parameter 'indexId' is set
        if (indexId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indexId' when calling getDbCollectionIndexByIdOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        uriVariables.put("index-id", indexId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionIndexOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionIndexOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all indices for the given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param columnName Column name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbCollectionsIndexResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionsIndexResponse getDbCollectionIndices(UUID serviceId, UUID databaseId, UUID collectionId, String columnName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbCollectionIndicesWithHttpInfo(serviceId, databaseId, collectionId, columnName, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get all indices for the given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param columnName Column name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbCollectionsIndexResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionsIndexResponse> getDbCollectionIndicesWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, String columnName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionIndices");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionIndices");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionIndices");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "column-name", columnName));
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

    ParameterizedTypeReference<DbCollectionsIndexResponse> returnType = new ParameterizedTypeReference<DbCollectionsIndexResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all indices for the given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param statuses statuses (optional)
     * @param skipStatuses statuses (optional)
     * @param columnName Column name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbCollectionIndexOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionIndexOpsResponse getDbCollectionIndicesOps(UUID serviceId, UUID databaseId, UUID collectionId, List<DbCollectionIndexStatus> statuses, List<DbCollectionIndexStatus> skipStatuses, String columnName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbCollectionIndicesOpsWithHttpInfo(serviceId, databaseId, collectionId, statuses, skipStatuses, columnName, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get all indices for the given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param statuses statuses (optional)
     * @param skipStatuses statuses (optional)
     * @param columnName Column name (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbCollectionIndexOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionIndexOpsResponse> getDbCollectionIndicesOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, List<DbCollectionIndexStatus> statuses, List<DbCollectionIndexStatus> skipStatuses, String columnName, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionIndicesOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionIndicesOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling getDbCollectionIndicesOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "column-name", columnName));
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

    ParameterizedTypeReference<DbCollectionIndexOpsResponse> returnType = new ParameterizedTypeReference<DbCollectionIndexOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all collections for the given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param name  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbCollectionsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionsResponse getDbCollections(UUID serviceId, UUID databaseId, String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbCollectionsWithHttpInfo(serviceId, databaseId, name, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get all collections for the given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param name  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbCollectionsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionsResponse> getDbCollectionsWithHttpInfo(UUID serviceId, UUID databaseId, String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollections");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollections");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
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

    ParameterizedTypeReference<DbCollectionsResponse> returnType = new ParameterizedTypeReference<DbCollectionsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get all collection for given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param statuses statuses (optional)
     * @param skipStatuses statuses (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return DbCollectionsOpsResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionsOpsResponse getDbCollectionsOps(UUID serviceId, UUID databaseId, List<DbCollectionStatus> statuses, List<DbCollectionStatus> skipStatuses, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbCollectionsOpsWithHttpInfo(serviceId, databaseId, statuses, skipStatuses, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get all collection for given database-id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param statuses statuses (optional)
     * @param skipStatuses statuses (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;DbCollectionsOpsResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionsOpsResponse> getDbCollectionsOpsWithHttpInfo(UUID serviceId, UUID databaseId, List<DbCollectionStatus> statuses, List<DbCollectionStatus> skipStatuses, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling getDbCollectionsOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling getDbCollectionsOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "skip-statuses", skipStatuses));
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

    ParameterizedTypeReference<DbCollectionsOpsResponse> returnType = new ParameterizedTypeReference<DbCollectionsOpsResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexCallbackPayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus indicesCallback(UUID serviceId, UUID databaseId, UUID collectionId, IndexCallbackPayload indexCallbackPayload) throws RestClientException {
        return indicesCallbackWithHttpInfo(serviceId, databaseId, collectionId, indexCallbackPayload).getBody();
    }

    /**
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexCallbackPayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> indicesCallbackWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, IndexCallbackPayload indexCallbackPayload) throws RestClientException {
        Object postBody = indexCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling indicesCallback");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling indicesCallback");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling indicesCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/callback", uriVariables);

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
     * Load collection into memory for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary loadDbCollection(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionPayload loadCollectionPayload) throws RestClientException {
        return loadDbCollectionWithHttpInfo(serviceId, databaseId, collectionId, loadCollectionPayload).getBody();
    }

    /**
     * Load collection into memory for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> loadDbCollectionWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionPayload loadCollectionPayload) throws RestClientException {
        Object postBody = loadCollectionPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling loadDbCollection");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling loadDbCollection");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling loadDbCollection");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/load", uriVariables);

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
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionCallbackPayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus loadDbCollectionCallback(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionCallbackPayload loadCollectionCallbackPayload) throws RestClientException {
        return loadDbCollectionCallbackWithHttpInfo(serviceId, databaseId, collectionId, loadCollectionCallbackPayload).getBody();
    }

    /**
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionCallbackPayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> loadDbCollectionCallbackWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionCallbackPayload loadCollectionCallbackPayload) throws RestClientException {
        Object postBody = loadCollectionCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling loadDbCollectionCallback");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling loadDbCollectionCallback");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling loadDbCollectionCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/load/callback", uriVariables);

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
     * Release collection from memory for given collection name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionPayload  (optional)
     * @return TaskSummary
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TaskSummary releaseDbCollection(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionPayload loadCollectionPayload) throws RestClientException {
        return releaseDbCollectionWithHttpInfo(serviceId, databaseId, collectionId, loadCollectionPayload).getBody();
    }

    /**
     * Release collection from memory for given collection name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param loadCollectionPayload  (optional)
     * @return ResponseEntity&lt;TaskSummary&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TaskSummary> releaseDbCollectionWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, LoadCollectionPayload loadCollectionPayload) throws RestClientException {
        Object postBody = loadCollectionPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling releaseDbCollection");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling releaseDbCollection");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling releaseDbCollection");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}/release", uriVariables);

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
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param releaseCollectionCallbackPayload  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus releaseDbCollectionCallback(UUID serviceId, UUID databaseId, UUID collectionId, ReleaseCollectionCallbackPayload releaseCollectionCallbackPayload) throws RestClientException {
        return releaseDbCollectionCallbackWithHttpInfo(serviceId, databaseId, collectionId, releaseCollectionCallbackPayload).getBody();
    }

    /**
     * Callback for Load Collections
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param releaseCollectionCallbackPayload  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> releaseDbCollectionCallbackWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, ReleaseCollectionCallbackPayload releaseCollectionCallbackPayload) throws RestClientException {
        Object postBody = releaseCollectionCallbackPayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling releaseDbCollectionCallback");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling releaseDbCollectionCallback");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling releaseDbCollectionCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/release/callback", uriVariables);

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
     * Update collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionCreatePayload  (optional)
     * @return DbCollectionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionDTO updateDbCollection(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionCreatePayload dbCollectionCreatePayload) throws RestClientException {
        return updateDbCollectionWithHttpInfo(serviceId, databaseId, collectionId, dbCollectionCreatePayload).getBody();
    }

    /**
     * Update collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionCreatePayload  (optional)
     * @return ResponseEntity&lt;DbCollectionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionDTO> updateDbCollectionWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionCreatePayload dbCollectionCreatePayload) throws RestClientException {
        Object postBody = dbCollectionCreatePayload;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDbCollection");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling updateDbCollection");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling updateDbCollection");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionDTO> returnType = new ParameterizedTypeReference<DbCollectionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update collection for given index id for given.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param dbCollectionIndexOpsDTO  (optional)
     * @return DbCollectionIndexOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionIndexOpsDTO updateDbCollectionIndexOps(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO) throws RestClientException {
        return updateDbCollectionIndexOpsWithHttpInfo(serviceId, databaseId, collectionId, indexId, dbCollectionIndexOpsDTO).getBody();
    }

    /**
     * Update collection for given index id for given.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param indexId  (required)
     * @param dbCollectionIndexOpsDTO  (optional)
     * @return ResponseEntity&lt;DbCollectionIndexOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionIndexOpsDTO> updateDbCollectionIndexOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, UUID indexId, DbCollectionIndexOpsDTO dbCollectionIndexOpsDTO) throws RestClientException {
        Object postBody = dbCollectionIndexOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDbCollectionIndexOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling updateDbCollectionIndexOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling updateDbCollectionIndexOps");
        }
        
        // verify the required parameter 'indexId' is set
        if (indexId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'indexId' when calling updateDbCollectionIndexOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        uriVariables.put("index-id", indexId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}/indices/{index-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionIndexOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionIndexOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionOpsDTO  (optional)
     * @return DbCollectionOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DbCollectionOpsDTO updateDbCollectionOps(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionOpsDTO dbCollectionOpsDTO) throws RestClientException {
        return updateDbCollectionOpsWithHttpInfo(serviceId, databaseId, collectionId, dbCollectionOpsDTO).getBody();
    }

    /**
     * Update collection for given collection ID
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId  (required)
     * @param databaseId  (required)
     * @param collectionId  (required)
     * @param dbCollectionOpsDTO  (optional)
     * @return ResponseEntity&lt;DbCollectionOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DbCollectionOpsDTO> updateDbCollectionOpsWithHttpInfo(UUID serviceId, UUID databaseId, UUID collectionId, DbCollectionOpsDTO dbCollectionOpsDTO) throws RestClientException {
        Object postBody = dbCollectionOpsDTO;
        
        // verify the required parameter 'serviceId' is set
        if (serviceId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'serviceId' when calling updateDbCollectionOps");
        }
        
        // verify the required parameter 'databaseId' is set
        if (databaseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'databaseId' when calling updateDbCollectionOps");
        }
        
        // verify the required parameter 'collectionId' is set
        if (collectionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'collectionId' when calling updateDbCollectionOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("service-id", serviceId);
        uriVariables.put("database-id", databaseId);
        uriVariables.put("collection-id", collectionId);
        String path = apiClient.expandPath("/tessell-ops/services/{service-id}/databases/{database-id}/collections/{collection-id}", uriVariables);

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

    ParameterizedTypeReference<DbCollectionOpsDTO> returnType = new ParameterizedTypeReference<DbCollectionOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
