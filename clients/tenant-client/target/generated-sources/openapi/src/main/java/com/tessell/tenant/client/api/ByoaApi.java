package com.tessell.tenant.client.api;

import com.tessell.tenant.client.invoker.ApiClient;

import com.tessell.tenant.client.model.ApiError;
import com.tessell.tenant.client.model.ByoaTemplateMetadata;
import java.io.File;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@Component("com.tessell.tenant.client.api.ByoaApi")
public class ByoaApi {
    private ApiClient apiClient;

    public ByoaApi() {
        this(new ApiClient());
    }

    @Autowired
    public ByoaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create BYOA template related metadata.
     * Create BYOA template related metadata
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id (required)
     * @param byoaTemplateMetadata BYOA template metadata (required)
     * @return ByoaTemplateMetadata
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ByoaTemplateMetadata createBYOAMetadata(String tenantId, ByoaTemplateMetadata byoaTemplateMetadata) throws RestClientException {
        return createBYOAMetadataWithHttpInfo(tenantId, byoaTemplateMetadata).getBody();
    }

    /**
     * Create BYOA template related metadata.
     * Create BYOA template related metadata
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Tenant Id (required)
     * @param byoaTemplateMetadata BYOA template metadata (required)
     * @return ResponseEntity&lt;ByoaTemplateMetadata&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ByoaTemplateMetadata> createBYOAMetadataWithHttpInfo(String tenantId, ByoaTemplateMetadata byoaTemplateMetadata) throws RestClientException {
        Object postBody = byoaTemplateMetadata;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createBYOAMetadata");
        }
        
        // verify the required parameter 'byoaTemplateMetadata' is set
        if (byoaTemplateMetadata == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'byoaTemplateMetadata' when calling createBYOAMetadata");
        }
        
        String path = apiClient.expandPath("/byoa/template-metadata", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<ByoaTemplateMetadata> returnType = new ParameterizedTypeReference<ByoaTemplateMetadata>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get BYOA template from template ID
     * Get BYOA template from template ID
     * <p><b>200</b> - Generated BYOA Template
     * <p><b>0</b> - API error response
     * @param id Template ID (required)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File getBYOATemplate(UUID id) throws RestClientException {
        return getBYOATemplateWithHttpInfo(id).getBody();
    }

    /**
     * Get BYOA template from template ID
     * Get BYOA template from template ID
     * <p><b>200</b> - Generated BYOA Template
     * <p><b>0</b> - API error response
     * @param id Template ID (required)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> getBYOATemplateWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getBYOATemplate");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/byoa/template/{id}", uriVariables);

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

    ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
