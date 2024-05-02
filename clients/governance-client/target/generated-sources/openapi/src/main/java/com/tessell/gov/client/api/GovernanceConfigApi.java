package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorOpsDTO;
import com.tessell.gov.client.model.TessellApiStatusDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@Component("com.tessell.gov.client.api.GovernanceConfigApi")
public class GovernanceConfigApi {
    private ApiClient apiClient;

    public GovernanceConfigApi() {
        this(new ApiClient());
    }

    @Autowired
    public GovernanceConfigApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Clear cache of current instance
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param namespaces Cache namespaces to clear (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO clearCache(List<String> namespaces) throws RestClientException {
        return clearCacheWithHttpInfo(namespaces).getBody();
    }

    /**
     * Clear cache of current instance
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param namespaces Cache namespaces to clear (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> clearCacheWithHttpInfo(List<String> namespaces) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'namespaces' is set
        if (namespaces == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'namespaces' when calling clearCache");
        }
        
        String path = apiClient.expandPath("/tessell-ops/governance/cache", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "namespaces", namespaces));

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
}
