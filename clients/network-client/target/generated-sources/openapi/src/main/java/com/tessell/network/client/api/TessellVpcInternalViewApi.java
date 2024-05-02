package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellAclEligibleUserDTO;
import com.tessell.network.client.model.TessellAclPayloadDTO;
import com.tessell.network.client.model.TessellAclRevokePayloadDTO;
import com.tessell.network.client.model.TessellApiErrorOpsDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellBulkDeleteVpcsPayloadDTO;
import com.tessell.network.client.model.TessellBulkDeleteVpcsStatusPayloadDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellCreateVpcCloudResourcesConfigDTO;
import com.tessell.network.client.model.TessellCreateVpcPayloadDTO;
import com.tessell.network.client.model.TessellEntityAclSharingInfoDTO;
import com.tessell.network.client.model.TessellNetworkActionDTO;
import com.tessell.network.client.model.TessellRegisterClientVpcServiceConsumerPayloadDTO;
import com.tessell.network.client.model.TessellResourceBulkDeleteResponseOpsDTO;
import com.tessell.network.client.model.TessellRolesDTO;
import com.tessell.network.client.model.TessellUpdateVpcPayloadDTO;
import com.tessell.network.client.model.TessellVpcDTO;
import com.tessell.network.client.model.TessellVpcServiceConsumerDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@Component("com.tessell.network.client.api.TessellVpcInternalViewApi")
public class TessellVpcInternalViewApi {
    private ApiClient apiClient;

    public TessellVpcInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply given action on a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param action Action to be performed (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO applyActionOnVpcInternal(UUID id, TessellNetworkActionDTO action) throws RestClientException {
        return applyActionOnVpcInternalWithHttpInfo(id, action).getBody();
    }

    /**
     * Apply given action on a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param action Action to be performed (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> applyActionOnVpcInternalWithHttpInfo(UUID id, TessellNetworkActionDTO action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling applyActionOnVpcInternal");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling applyActionOnVpcInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/{action}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete the vpcs for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcsPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO bulkDeleteVpcs(TessellBulkDeleteVpcsPayloadDTO tessellBulkDeleteVpcsPayloadDTO) throws RestClientException {
        return bulkDeleteVpcsWithHttpInfo(tessellBulkDeleteVpcsPayloadDTO).getBody();
    }

    /**
     * Delete the vpcs for subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcsPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> bulkDeleteVpcsWithHttpInfo(TessellBulkDeleteVpcsPayloadDTO tessellBulkDeleteVpcsPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteVpcsPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/network/bulk-delete/vpcs", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Trigger VPC Creation if not Created
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellCreateVpcCloudResourcesConfigDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO createVpcCloudResourcesConfig(UUID id, TessellCreateVpcCloudResourcesConfigDTO tessellCreateVpcCloudResourcesConfigDTO) throws RestClientException {
        return createVpcCloudResourcesConfigWithHttpInfo(id, tessellCreateVpcCloudResourcesConfigDTO).getBody();
    }

    /**
     * Trigger VPC Creation if not Created
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellCreateVpcCloudResourcesConfigDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> createVpcCloudResourcesConfigWithHttpInfo(UUID id, TessellCreateVpcCloudResourcesConfigDTO tessellCreateVpcCloudResourcesConfigDTO) throws RestClientException {
        Object postBody = tessellCreateVpcCloudResourcesConfigDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createVpcCloudResourcesConfig");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/create-vpc-cloud-resources", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateVpcPayloadDTO VPC Information (required)
     * @return TessellVpcDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcDTO createVpcInternal(TessellCreateVpcPayloadDTO tessellCreateVpcPayloadDTO) throws RestClientException {
        return createVpcInternalWithHttpInfo(tessellCreateVpcPayloadDTO).getBody();
    }

    /**
     * Create a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateVpcPayloadDTO VPC Information (required)
     * @return ResponseEntity&lt;TessellVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcDTO> createVpcInternalWithHttpInfo(TessellCreateVpcPayloadDTO tessellCreateVpcPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateVpcPayloadDTO;
        
        // verify the required parameter 'tessellCreateVpcPayloadDTO' is set
        if (tessellCreateVpcPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreateVpcPayloadDTO' when calling createVpcInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/network/vpcs", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellVpcDTO> returnType = new ParameterizedTypeReference<TessellVpcDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Vpc Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcAclsInternal(UUID id, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        return deleteVpcAclsInternalWithHttpInfo(id, tessellAclRevokePayloadDTO).getBody();
    }

    /**
     * Delete Vpc Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcAclsInternalWithHttpInfo(UUID id, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        Object postBody = tessellAclRevokePayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVpcAclsInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param softDelete Soft delete an entity (optional, default to true)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcInternal(UUID id, Boolean disableAclCheck, Boolean softDelete) throws RestClientException {
        return deleteVpcInternalWithHttpInfo(id, disableAclCheck, softDelete).getBody();
    }

    /**
     * Delete a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param softDelete Soft delete an entity (optional, default to true)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcInternalWithHttpInfo(UUID id, Boolean disableAclCheck, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVpcInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "disableAclCheck", disableAclCheck));
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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcsStatusPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteVpcStatus(TessellBulkDeleteVpcsStatusPayloadDTO tessellBulkDeleteVpcsStatusPayloadDTO) throws RestClientException {
        return getBulkDeleteVpcStatusWithHttpInfo(tessellBulkDeleteVpcsStatusPayloadDTO).getBody();
    }

    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcsStatusPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> getBulkDeleteVpcStatusWithHttpInfo(TessellBulkDeleteVpcsStatusPayloadDTO tessellBulkDeleteVpcsStatusPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteVpcsStatusPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/network/bulk-delete/vpcs", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO> returnType = new ParameterizedTypeReference<TessellResourceBulkDeleteResponseOpsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Vpc Acls
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellEntityAclSharingInfoDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEntityAclSharingInfoDTO getVpcAclsInternal(UUID id) throws RestClientException {
        return getVpcAclsInternalWithHttpInfo(id).getBody();
    }

    /**
     * Get Vpc Acls
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellEntityAclSharingInfoDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEntityAclSharingInfoDTO> getVpcAclsInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getVpcAclsInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellEntityAclSharingInfoDTO> returnType = new ParameterizedTypeReference<TessellEntityAclSharingInfoDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get VPC by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param includeSubnetGroups Include Subnet Groups Information (optional, default to false)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @return TessellVpcDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcDTO getVpcByIdInternal(UUID id, Boolean includeSubnetGroups, Boolean disableAclCheck) throws RestClientException {
        return getVpcByIdInternalWithHttpInfo(id, includeSubnetGroups, disableAclCheck).getBody();
    }

    /**
     * Get VPC by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param includeSubnetGroups Include Subnet Groups Information (optional, default to false)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @return ResponseEntity&lt;TessellVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcDTO> getVpcByIdInternalWithHttpInfo(UUID id, Boolean includeSubnetGroups, Boolean disableAclCheck) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getVpcByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-subnet-groups", includeSubnetGroups));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "disableAclCheck", disableAclCheck));

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

    ParameterizedTypeReference<TessellVpcDTO> returnType = new ParameterizedTypeReference<TessellVpcDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get List of Users With Allowed Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param roles Roles for the entity (optional)
     * @return List&lt;TessellAclEligibleUserDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAclEligibleUserDTO> getVpcEligibleUserListInternal(UUID id, List<TessellRolesDTO> roles) throws RestClientException {
        return getVpcEligibleUserListInternalWithHttpInfo(id, roles).getBody();
    }

    /**
     * Get List of Users With Allowed Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param roles Roles for the entity (optional)
     * @return ResponseEntity&lt;List&lt;TessellAclEligibleUserDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAclEligibleUserDTO>> getVpcEligibleUserListInternalWithHttpInfo(UUID id, List<TessellRolesDTO> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getVpcEligibleUserListInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/acls/eligible-users", uriVariables);

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

    ParameterizedTypeReference<List<TessellAclEligibleUserDTO>> returnType = new ParameterizedTypeReference<List<TessellAclEligibleUserDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (optional)
     * @param subscriptionId Id of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @param includeSubnetGroups Include Subnet Groups Information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellVpcDTO> getVpcInternal(String name, UUID subscriptionId, TessellCloudTypeDTO cloudType, String region, Boolean disableAclCheck, Boolean includeSharedWith, Boolean includeSubnetGroups, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcInternalWithHttpInfo(name, subscriptionId, cloudType, region, disableAclCheck, includeSharedWith, includeSubnetGroups, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (optional)
     * @param subscriptionId Id of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @param includeSubnetGroups Include Subnet Groups Information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellVpcDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellVpcDTO>> getVpcInternalWithHttpInfo(String name, UUID subscriptionId, TessellCloudTypeDTO cloudType, String region, Boolean disableAclCheck, Boolean includeSharedWith, Boolean includeSubnetGroups, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/network/vpcs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "disableAclCheck", disableAclCheck));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeSharedWith", includeSharedWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-subnet-groups", includeSubnetGroups));
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

    ParameterizedTypeReference<List<TessellVpcDTO>> returnType = new ParameterizedTypeReference<List<TessellVpcDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Modify Vpc Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return TessellAclPayloadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclPayloadDTO modifyVpcAclsInternal(UUID id, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        return modifyVpcAclsInternalWithHttpInfo(id, tessellAclPayloadDTO).getBody();
    }

    /**
     * Modify Vpc Acls
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAclPayloadDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclPayloadDTO> modifyVpcAclsInternalWithHttpInfo(UUID id, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        Object postBody = tessellAclPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling modifyVpcAclsInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellAclPayloadDTO> returnType = new ParameterizedTypeReference<TessellAclPayloadDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterClientVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return TessellVpcServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcServiceConsumerDTO registerVpcInternal(TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO) throws RestClientException {
        return registerVpcInternalWithHttpInfo(tessellRegisterClientVpcServiceConsumerPayloadDTO).getBody();
    }

    /**
     * Register a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterClientVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return ResponseEntity&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcServiceConsumerDTO> registerVpcInternalWithHttpInfo(TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterClientVpcServiceConsumerPayloadDTO;
        
        // verify the required parameter 'tessellRegisterClientVpcServiceConsumerPayloadDTO' is set
        if (tessellRegisterClientVpcServiceConsumerPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRegisterClientVpcServiceConsumerPayloadDTO' when calling registerVpcInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellVpcServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Trigger VPC Creation if not Created
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO triggerVpcCreationInternal(UUID id) throws RestClientException {
        return triggerVpcCreationInternalWithHttpInfo(id).getBody();
    }

    /**
     * Trigger VPC Creation if not Created
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> triggerVpcCreationInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling triggerVpcCreationInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}/trigger-vpc-creation", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateVpcPayloadDTO  (optional)
     * @return TessellVpcDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcDTO updateVpcInternal(UUID id, TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO) throws RestClientException {
        return updateVpcInternalWithHttpInfo(id, tessellUpdateVpcPayloadDTO).getBody();
    }

    /**
     * Update a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateVpcPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcDTO> updateVpcInternalWithHttpInfo(UUID id, TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO) throws RestClientException {
        Object postBody = tessellUpdateVpcPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateVpcInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpcs/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellVpcDTO> returnType = new ParameterizedTypeReference<TessellVpcDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
