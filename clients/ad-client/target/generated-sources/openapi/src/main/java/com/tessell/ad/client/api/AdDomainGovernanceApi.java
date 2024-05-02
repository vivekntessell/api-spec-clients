package com.tessell.ad.client.api;

import com.tessell.ad.client.invoker.ApiClient;

import com.tessell.ad.client.model.TessellAdDomainDTO;
import com.tessell.ad.client.model.TessellApiErrorDTO;
import com.tessell.ad.client.model.TessellApiStatusDTO;
import com.tessell.ad.client.model.TessellReconfigureAdDomainPayloadDTO;
import com.tessell.ad.client.model.TessellRegisterAdDomainPayloadDTO;
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
@Component("com.tessell.ad.client.api.AdDomainGovernanceApi")
public class AdDomainGovernanceApi {
    private ApiClient apiClient;

    public AdDomainGovernanceApi() {
        this(new ApiClient());
    }

    @Autowired
    public AdDomainGovernanceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Deregister an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deregisterAdDomain(UUID id) throws RestClientException {
        return deregisterAdDomainWithHttpInfo(id).getBody();
    }

    /**
     * Deregister an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deregisterAdDomainWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deregisterAdDomain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/ad-domains/governance/id/{id}/deregister", uriVariables);

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
     * Get List of Active Directory Domain
     * 
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellAdDomainDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAdDomainDTO> getAdDomainsGovernance(Integer pageSize, Integer pageOffset) throws RestClientException {
        return getAdDomainsGovernanceWithHttpInfo(pageSize, pageOffset).getBody();
    }

    /**
     * Get List of Active Directory Domain
     * 
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellAdDomainDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAdDomainDTO>> getAdDomainsGovernanceWithHttpInfo(Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/ad-domains/governance", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<TessellAdDomainDTO>> returnType = new ParameterizedTypeReference<List<TessellAdDomainDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Reconfigure an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @param tessellReconfigureAdDomainPayloadDTO  (optional)
     * @return TessellAdDomainDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAdDomainDTO reconfigureAdDomain(UUID id, TessellReconfigureAdDomainPayloadDTO tessellReconfigureAdDomainPayloadDTO) throws RestClientException {
        return reconfigureAdDomainWithHttpInfo(id, tessellReconfigureAdDomainPayloadDTO).getBody();
    }

    /**
     * Reconfigure an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @param tessellReconfigureAdDomainPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAdDomainDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAdDomainDTO> reconfigureAdDomainWithHttpInfo(UUID id, TessellReconfigureAdDomainPayloadDTO tessellReconfigureAdDomainPayloadDTO) throws RestClientException {
        Object postBody = tessellReconfigureAdDomainPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling reconfigureAdDomain");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/ad-domains/governance/id/{id}/reconfigure", uriVariables);

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

    ParameterizedTypeReference<TessellAdDomainDTO> returnType = new ParameterizedTypeReference<TessellAdDomainDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellRegisterAdDomainPayloadDTO  (optional)
     * @return TessellAdDomainDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAdDomainDTO registerAdDomain(TessellRegisterAdDomainPayloadDTO tessellRegisterAdDomainPayloadDTO) throws RestClientException {
        return registerAdDomainWithHttpInfo(tessellRegisterAdDomainPayloadDTO).getBody();
    }

    /**
     * Register an Active Directory Domain
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellRegisterAdDomainPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAdDomainDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAdDomainDTO> registerAdDomainWithHttpInfo(TessellRegisterAdDomainPayloadDTO tessellRegisterAdDomainPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterAdDomainPayloadDTO;
        
        String path = apiClient.expandPath("/ad-domains/governance/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellAdDomainDTO> returnType = new ParameterizedTypeReference<TessellAdDomainDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
