package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiErrorOps;
import com.tessell.tenant.client.model.ApiStatus;
import com.tessell.tenant.client.model.BulkDeleteDataPlaneAccountsPayload;
import com.tessell.tenant.client.model.BulkDeleteDataPlaneAccountsStatusPayload;
import com.tessell.tenant.client.model.DataPlaneAccount;
import com.tessell.tenant.client.model.DataPlaneAccountRequestPayload;
import com.tessell.tenant.client.model.ReplicateDataPlaneAccountPayload;
import com.tessell.tenant.client.model.ResourceBulkDeleteResponseOps;
import java.util.UUID;
import com.tessell.tenant.client.model.UpdateDataPlaneAccountPayload;
import com.tessell.tenant.client.model.UpdateTenantCloudAccountAssociationPayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@Component("com.tessell.tenant.client.api.DataPlaneAccountsOpsApi")
public class DataPlaneAccountsOpsApi {
    private ApiClient apiClient;

    public DataPlaneAccountsOpsApi() {
        this(new ApiClient());
    }

    @Autowired
    public DataPlaneAccountsOpsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Bulk delete Data Plane Accounts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteDataPlaneAccountsPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps bulkDeleteDataPlaneAccounts(BulkDeleteDataPlaneAccountsPayload bulkDeleteDataPlaneAccountsPayload) throws RestClientException {
        return bulkDeleteDataPlaneAccountsWithHttpInfo(bulkDeleteDataPlaneAccountsPayload).getBody();
    }

    /**
     * Bulk delete Data Plane Accounts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteDataPlaneAccountsPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> bulkDeleteDataPlaneAccountsWithHttpInfo(BulkDeleteDataPlaneAccountsPayload bulkDeleteDataPlaneAccountsPayload) throws RestClientException {
        Object postBody = bulkDeleteDataPlaneAccountsPayload;
        
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Create a new Tessell Data Plane Account.
     * Create a new Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountRequestPayload Data Plane Account Information (required)
     * @return DataPlaneAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataPlaneAccount createDataPlaneAccountOps(DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload) throws RestClientException {
        return createDataPlaneAccountOpsWithHttpInfo(dataPlaneAccountRequestPayload).getBody();
    }

    /**
     * Create a new Tessell Data Plane Account.
     * Create a new Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountRequestPayload Data Plane Account Information (required)
     * @return ResponseEntity&lt;DataPlaneAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataPlaneAccount> createDataPlaneAccountOpsWithHttpInfo(DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload) throws RestClientException {
        Object postBody = dataPlaneAccountRequestPayload;
        
        // verify the required parameter 'dataPlaneAccountRequestPayload' is set
        if (dataPlaneAccountRequestPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountRequestPayload' when calling createDataPlaneAccountOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<DataPlaneAccount> returnType = new ParameterizedTypeReference<DataPlaneAccount>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an existing Tessell Data Plane Account.
     * Deletes an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be deleted (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDataPlaneAccountOps(UUID dataPlaneAccountId) throws RestClientException {
        return deleteDataPlaneAccountOpsWithHttpInfo(dataPlaneAccountId).getBody();
    }

    /**
     * Delete an existing Tessell Data Plane Account.
     * Deletes an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be deleted (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDataPlaneAccountOpsWithHttpInfo(UUID dataPlaneAccountId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dataPlaneAccountId' is set
        if (dataPlaneAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountId' when calling deleteDataPlaneAccountOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("data-plane-account-id", dataPlaneAccountId);
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/{data-plane-account-id}", uriVariables);

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
     * Bulk delete data plane accounts status
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteDataPlaneAccountsStatusPayload  (optional)
     * @return ResourceBulkDeleteResponseOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResourceBulkDeleteResponseOps getBulkDeleteDataPlaneAccountsStatus(BulkDeleteDataPlaneAccountsStatusPayload bulkDeleteDataPlaneAccountsStatusPayload) throws RestClientException {
        return getBulkDeleteDataPlaneAccountsStatusWithHttpInfo(bulkDeleteDataPlaneAccountsStatusPayload).getBody();
    }

    /**
     * Bulk delete data plane accounts status
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param bulkDeleteDataPlaneAccountsStatusPayload  (optional)
     * @return ResponseEntity&lt;ResourceBulkDeleteResponseOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ResourceBulkDeleteResponseOps> getBulkDeleteDataPlaneAccountsStatusWithHttpInfo(BulkDeleteDataPlaneAccountsStatusPayload bulkDeleteDataPlaneAccountsStatusPayload) throws RestClientException {
        Object postBody = bulkDeleteDataPlaneAccountsStatusPayload;
        
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/bulk-delete", Collections.<String, Object>emptyMap());

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
     * Register a Tessell Data Plane Account.
     * Registers a Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountRequestPayload Register Data Plane Account Payload (required)
     * @return DataPlaneAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataPlaneAccount registerDataPlaneAccountOps(DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload) throws RestClientException {
        return registerDataPlaneAccountOpsWithHttpInfo(dataPlaneAccountRequestPayload).getBody();
    }

    /**
     * Register a Tessell Data Plane Account.
     * Registers a Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountRequestPayload Register Data Plane Account Payload (required)
     * @return ResponseEntity&lt;DataPlaneAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataPlaneAccount> registerDataPlaneAccountOpsWithHttpInfo(DataPlaneAccountRequestPayload dataPlaneAccountRequestPayload) throws RestClientException {
        Object postBody = dataPlaneAccountRequestPayload;
        
        // verify the required parameter 'dataPlaneAccountRequestPayload' is set
        if (dataPlaneAccountRequestPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountRequestPayload' when calling registerDataPlaneAccountOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<DataPlaneAccount> returnType = new ParameterizedTypeReference<DataPlaneAccount>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Replicates an existing Tessell Data Plane Account.
     * Replicates an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be replicated (required)
     * @param replicateDataPlaneAccountPayload Replicate Data Plane Account Payload (required)
     * @return DataPlaneAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataPlaneAccount replicateDataPlaneAccountOps(UUID dataPlaneAccountId, ReplicateDataPlaneAccountPayload replicateDataPlaneAccountPayload) throws RestClientException {
        return replicateDataPlaneAccountOpsWithHttpInfo(dataPlaneAccountId, replicateDataPlaneAccountPayload).getBody();
    }

    /**
     * Replicates an existing Tessell Data Plane Account.
     * Replicates an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be replicated (required)
     * @param replicateDataPlaneAccountPayload Replicate Data Plane Account Payload (required)
     * @return ResponseEntity&lt;DataPlaneAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataPlaneAccount> replicateDataPlaneAccountOpsWithHttpInfo(UUID dataPlaneAccountId, ReplicateDataPlaneAccountPayload replicateDataPlaneAccountPayload) throws RestClientException {
        Object postBody = replicateDataPlaneAccountPayload;
        
        // verify the required parameter 'dataPlaneAccountId' is set
        if (dataPlaneAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountId' when calling replicateDataPlaneAccountOps");
        }
        
        // verify the required parameter 'replicateDataPlaneAccountPayload' is set
        if (replicateDataPlaneAccountPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'replicateDataPlaneAccountPayload' when calling replicateDataPlaneAccountOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("data-plane-account-id", dataPlaneAccountId);
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/{data-plane-account-id}/replicate", uriVariables);

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

    ParameterizedTypeReference<DataPlaneAccount> returnType = new ParameterizedTypeReference<DataPlaneAccount>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates an existing Tessell Data Plane Account.
     * Updates an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be updated (required)
     * @param updateDataPlaneAccountPayload Update Data Plane Account Payload (required)
     * @return DataPlaneAccount
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DataPlaneAccount updateDataPlaneAccountOps(UUID dataPlaneAccountId, UpdateDataPlaneAccountPayload updateDataPlaneAccountPayload) throws RestClientException {
        return updateDataPlaneAccountOpsWithHttpInfo(dataPlaneAccountId, updateDataPlaneAccountPayload).getBody();
    }

    /**
     * Updates an existing Tessell Data Plane Account.
     * Updates an existing Tessell Data Plane Account
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be updated (required)
     * @param updateDataPlaneAccountPayload Update Data Plane Account Payload (required)
     * @return ResponseEntity&lt;DataPlaneAccount&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DataPlaneAccount> updateDataPlaneAccountOpsWithHttpInfo(UUID dataPlaneAccountId, UpdateDataPlaneAccountPayload updateDataPlaneAccountPayload) throws RestClientException {
        Object postBody = updateDataPlaneAccountPayload;
        
        // verify the required parameter 'dataPlaneAccountId' is set
        if (dataPlaneAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountId' when calling updateDataPlaneAccountOps");
        }
        
        // verify the required parameter 'updateDataPlaneAccountPayload' is set
        if (updateDataPlaneAccountPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDataPlaneAccountPayload' when calling updateDataPlaneAccountOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("data-plane-account-id", dataPlaneAccountId);
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/{data-plane-account-id}", uriVariables);

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

    ParameterizedTypeReference<DataPlaneAccount> returnType = new ParameterizedTypeReference<DataPlaneAccount>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Updates tenant cloud account association
     * Updates tenant cloud account association
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be updated (required)
     * @param updateTenantCloudAccountAssociationPayload Update tenant cloud account association (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateTenantDataPlaneAccountAssociation(UUID dataPlaneAccountId, UpdateTenantCloudAccountAssociationPayload updateTenantCloudAccountAssociationPayload) throws RestClientException {
        return updateTenantDataPlaneAccountAssociationWithHttpInfo(dataPlaneAccountId, updateTenantCloudAccountAssociationPayload).getBody();
    }

    /**
     * Updates tenant cloud account association
     * Updates tenant cloud account association
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dataPlaneAccountId Tessell Data Plane Account which has to be updated (required)
     * @param updateTenantCloudAccountAssociationPayload Update tenant cloud account association (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateTenantDataPlaneAccountAssociationWithHttpInfo(UUID dataPlaneAccountId, UpdateTenantCloudAccountAssociationPayload updateTenantCloudAccountAssociationPayload) throws RestClientException {
        Object postBody = updateTenantCloudAccountAssociationPayload;
        
        // verify the required parameter 'dataPlaneAccountId' is set
        if (dataPlaneAccountId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dataPlaneAccountId' when calling updateTenantDataPlaneAccountAssociation");
        }
        
        // verify the required parameter 'updateTenantCloudAccountAssociationPayload' is set
        if (updateTenantCloudAccountAssociationPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTenantCloudAccountAssociationPayload' when calling updateTenantDataPlaneAccountAssociation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("data-plane-account-id", dataPlaneAccountId);
        String path = apiClient.expandPath("/tessell-ops/data-plane-accounts/{data-plane-account-id}/tenant-associations", uriVariables);

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
}
