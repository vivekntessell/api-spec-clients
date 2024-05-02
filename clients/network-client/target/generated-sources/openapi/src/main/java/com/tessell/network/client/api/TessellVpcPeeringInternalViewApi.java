package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorOpsDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellBulkDeleteVpcPeeringPayloadDTO;
import com.tessell.network.client.model.TessellBulkDeleteVpcPeeringStatusPayloadDTO;
import com.tessell.network.client.model.TessellCreateVpcPeeringPayloadDTO;
import com.tessell.network.client.model.TessellResourceBulkDeleteResponseOpsDTO;
import com.tessell.network.client.model.TessellVpcPeeringDTO;
import com.tessell.network.client.model.TessellVpcPeeringStatusDTO;
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
@Component("com.tessell.network.client.api.TessellVpcPeeringInternalViewApi")
public class TessellVpcPeeringInternalViewApi {
    private ApiClient apiClient;

    public TessellVpcPeeringInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcPeeringInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete all vpc peering between vpcs for a subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcPeeringPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO bulkDeleteVpcPeering(TessellBulkDeleteVpcPeeringPayloadDTO tessellBulkDeleteVpcPeeringPayloadDTO) throws RestClientException {
        return bulkDeleteVpcPeeringWithHttpInfo(tessellBulkDeleteVpcPeeringPayloadDTO).getBody();
    }

    /**
     * Delete all vpc peering between vpcs for a subscription.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcPeeringPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> bulkDeleteVpcPeeringWithHttpInfo(TessellBulkDeleteVpcPeeringPayloadDTO tessellBulkDeleteVpcPeeringPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteVpcPeeringPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/network/bulk-delete/vpc-peerings", Collections.<String, Object>emptyMap());

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
     * Create a VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcId VPC Id (required)
     * @param tessellCreateVpcPeeringPayloadDTO VPC Peering Information (required)
     * @return TessellVpcPeeringDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringDTO createVpcPeeringInternal(UUID vpcId, TessellCreateVpcPeeringPayloadDTO tessellCreateVpcPeeringPayloadDTO) throws RestClientException {
        return createVpcPeeringInternalWithHttpInfo(vpcId, tessellCreateVpcPeeringPayloadDTO).getBody();
    }

    /**
     * Create a VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcId VPC Id (required)
     * @param tessellCreateVpcPeeringPayloadDTO VPC Peering Information (required)
     * @return ResponseEntity&lt;TessellVpcPeeringDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringDTO> createVpcPeeringInternalWithHttpInfo(UUID vpcId, TessellCreateVpcPeeringPayloadDTO tessellCreateVpcPeeringPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateVpcPeeringPayloadDTO;
        
        // verify the required parameter 'vpcId' is set
        if (vpcId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcId' when calling createVpcPeeringInternal");
        }
        
        // verify the required parameter 'tessellCreateVpcPeeringPayloadDTO' is set
        if (tessellCreateVpcPeeringPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreateVpcPeeringPayloadDTO' when calling createVpcPeeringInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcId", vpcId);
        String path = apiClient.expandPath("/tessell-internal/network/vpc/{vpcId}/vpc-peerings", uriVariables);

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

    ParameterizedTypeReference<TessellVpcPeeringDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcPeeringInternal(UUID id) throws RestClientException {
        return deleteVpcPeeringInternalWithHttpInfo(id).getBody();
    }

    /**
     * Delete a VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcPeeringInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteVpcPeeringInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpc-peerings/{id}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcPeeringStatusPayloadDTO  (optional)
     * @return TessellResourceBulkDeleteResponseOpsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellResourceBulkDeleteResponseOpsDTO getBulkDeleteVpcPeeringStatus(TessellBulkDeleteVpcPeeringStatusPayloadDTO tessellBulkDeleteVpcPeeringStatusPayloadDTO) throws RestClientException {
        return getBulkDeleteVpcPeeringStatusWithHttpInfo(tessellBulkDeleteVpcPeeringStatusPayloadDTO).getBody();
    }

    /**
     * get status of bulk delete api
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellBulkDeleteVpcPeeringStatusPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellResourceBulkDeleteResponseOpsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellResourceBulkDeleteResponseOpsDTO> getBulkDeleteVpcPeeringStatusWithHttpInfo(TessellBulkDeleteVpcPeeringStatusPayloadDTO tessellBulkDeleteVpcPeeringStatusPayloadDTO) throws RestClientException {
        Object postBody = tessellBulkDeleteVpcPeeringStatusPayloadDTO;
        
        String path = apiClient.expandPath("/tessell-internal/network/bulk-delete/vpc-peerings", Collections.<String, Object>emptyMap());

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
     * Get VPC Peering by Id for the VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellVpcPeeringDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringDTO getVpcPeeringByIdInternal(UUID id) throws RestClientException {
        return getVpcPeeringByIdInternalWithHttpInfo(id).getBody();
    }

    /**
     * Get VPC Peering by Id for the VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellVpcPeeringDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringDTO> getVpcPeeringByIdInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getVpcPeeringByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/vpc-peerings/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellVpcPeeringDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of VPC Peerings of the VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcId VPC Id (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellVpcPeeringDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellVpcPeeringDTO> getVpcPeeringsInternal(UUID vpcId, TessellVpcPeeringStatusDTO status, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcPeeringsInternalWithHttpInfo(vpcId, status, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of VPC Peerings of the VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcId VPC Id (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellVpcPeeringDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellVpcPeeringDTO>> getVpcPeeringsInternalWithHttpInfo(UUID vpcId, TessellVpcPeeringStatusDTO status, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'vpcId' is set
        if (vpcId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcId' when calling getVpcPeeringsInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcId", vpcId);
        String path = apiClient.expandPath("/tessell-internal/network/vpc/{vpcId}/vpc-peerings", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
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

    ParameterizedTypeReference<List<TessellVpcPeeringDTO>> returnType = new ParameterizedTypeReference<List<TessellVpcPeeringDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
