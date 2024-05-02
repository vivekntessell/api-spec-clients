package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorOpsDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellSubnetDTO;
import com.tessell.network.client.model.TessellUpdateSubnetPayloadDTO;
import com.tessell.network.client.model.TessellUpdateVpcPayloadDTO;
import com.tessell.network.client.model.TessellVpcDTO;
import com.tessell.network.client.model.TessellVpcEndpointDTO;
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
@Component("com.tessell.network.client.api.TessellVpcOpsViewApi")
public class TessellVpcOpsViewApi {
    private ApiClient apiClient;

    public TessellVpcOpsViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcOpsViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete subnet metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteSubnetMetadataInternal(UUID id) throws RestClientException {
        return deleteSubnetMetadataInternalWithHttpInfo(id).getBody();
    }

    /**
     * Delete subnet metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteSubnetMetadataInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteSubnetMetadataInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/network/subnets/{id}", uriVariables);

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
     * Get Subnet by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return TessellSubnetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSubnetDTO getSubnetByIdInternal(UUID id) throws RestClientException {
        return getSubnetByIdInternalWithHttpInfo(id).getBody();
    }

    /**
     * Get Subnet by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @return ResponseEntity&lt;TessellSubnetDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSubnetDTO> getSubnetByIdInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSubnetByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/network/subnets/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellSubnetDTO> returnType = new ParameterizedTypeReference<TessellSubnetDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Set VPC Endpoints metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param requestBody  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void setVpcEndpointsMetadataInternal(UUID id, Map<String, TessellVpcEndpointDTO> requestBody) throws RestClientException {
        setVpcEndpointsMetadataInternalWithHttpInfo(id, requestBody);
    }

    /**
     * Set VPC Endpoints metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param requestBody  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> setVpcEndpointsMetadataInternalWithHttpInfo(UUID id, Map<String, TessellVpcEndpointDTO> requestBody) throws RestClientException {
        Object postBody = requestBody;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling setVpcEndpointsMetadataInternal");
        }
        
        // verify the required parameter 'requestBody' is set
        if (requestBody == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'requestBody' when calling setVpcEndpointsMetadataInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/network/vpcs/{id}/vpc-endpoints", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Subnet metadata by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateSubnetPayloadDTO  (optional)
     * @return TessellSubnetDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSubnetDTO updateSubnetMetadataInternal(UUID id, TessellUpdateSubnetPayloadDTO tessellUpdateSubnetPayloadDTO) throws RestClientException {
        return updateSubnetMetadataInternalWithHttpInfo(id, tessellUpdateSubnetPayloadDTO).getBody();
    }

    /**
     * Update Subnet metadata by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateSubnetPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellSubnetDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSubnetDTO> updateSubnetMetadataInternalWithHttpInfo(UUID id, TessellUpdateSubnetPayloadDTO tessellUpdateSubnetPayloadDTO) throws RestClientException {
        Object postBody = tessellUpdateSubnetPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateSubnetMetadataInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/network/subnets/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellSubnetDTO> returnType = new ParameterizedTypeReference<TessellSubnetDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update VPC metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateVpcPayloadDTO  (optional)
     * @return TessellVpcDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcDTO updateVpcMetadataInternal(UUID id, TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO) throws RestClientException {
        return updateVpcMetadataInternalWithHttpInfo(id, tessellUpdateVpcPayloadDTO).getBody();
    }

    /**
     * Update VPC metadata
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param tessellUpdateVpcPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcDTO> updateVpcMetadataInternalWithHttpInfo(UUID id, TessellUpdateVpcPayloadDTO tessellUpdateVpcPayloadDTO) throws RestClientException {
        Object postBody = tessellUpdateVpcPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateVpcMetadataInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/network/vpcs/{id}", uriVariables);

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
