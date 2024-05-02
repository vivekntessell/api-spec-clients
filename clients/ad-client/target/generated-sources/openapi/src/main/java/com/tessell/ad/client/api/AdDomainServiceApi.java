package com.tessell.ad.client.api;

import com.tessell.ad.client.invoker.ApiClient;

import com.tessell.ad.client.model.TessellAdDomainServiceViewDTO;
import com.tessell.ad.client.model.TessellApiErrorDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:10.647596+05:30[Asia/Kolkata]")
@Component("com.tessell.ad.client.api.AdDomainServiceApi")
public class AdDomainServiceApi {
    private ApiClient apiClient;

    public AdDomainServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public AdDomainServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns an ad domain.
     * Returns an ad domain.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Ad Domain Identifier (required)
     * @return TessellAdDomainServiceViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAdDomainServiceViewDTO getAdDomainById(UUID id) throws RestClientException {
        return getAdDomainByIdWithHttpInfo(id).getBody();
    }

    /**
     * Returns an ad domain.
     * Returns an ad domain.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Ad Domain Identifier (required)
     * @return ResponseEntity&lt;TessellAdDomainServiceViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAdDomainServiceViewDTO> getAdDomainByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAdDomainById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/ad-domains/id/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellAdDomainServiceViewDTO> returnType = new ParameterizedTypeReference<TessellAdDomainServiceViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns all Ad Domain available.
     * Returns all Ad Domain available.
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellAdDomainServiceViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAdDomainServiceViewDTO> getAdDomainsServiceView(Integer pageSize, Integer pageOffset) throws RestClientException {
        return getAdDomainsServiceViewWithHttpInfo(pageSize, pageOffset).getBody();
    }

    /**
     * Returns all Ad Domain available.
     * Returns all Ad Domain available.
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellAdDomainServiceViewDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAdDomainServiceViewDTO>> getAdDomainsServiceViewWithHttpInfo(Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/ad-domains", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<List<TessellAdDomainServiceViewDTO>> returnType = new ParameterizedTypeReference<List<TessellAdDomainServiceViewDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
