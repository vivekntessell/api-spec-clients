package com.tessell.ad.client.api;

import com.tessell.ad.client.invoker.ApiClient;

import com.tessell.ad.client.model.TessellAdDomainInternalDTO;
import com.tessell.ad.client.model.TessellApiErrorOpsDTO;
import com.tessell.ad.client.model.TessellCloudTypeDTO;
import com.tessell.ad.client.model.TessellReplicateAdDomainPayloadDTO;
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
@Component("com.tessell.ad.client.api.AdDomainInternalApi")
public class AdDomainInternalApi {
    private ApiClient apiClient;

    public AdDomainInternalApi() {
        this(new ApiClient());
    }

    @Autowired
    public AdDomainInternalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Returns Active Directory Domain
     * Returns Active Directory Domain
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @return TessellAdDomainInternalDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAdDomainInternalDTO getAdDomainByIdInternal(UUID id) throws RestClientException {
        return getAdDomainByIdInternalWithHttpInfo(id).getBody();
    }

    /**
     * Returns Active Directory Domain
     * Returns Active Directory Domain
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @return ResponseEntity&lt;TessellAdDomainInternalDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAdDomainInternalDTO> getAdDomainByIdInternalWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getAdDomainByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/ad-domains/id/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellAdDomainInternalDTO> returnType = new ParameterizedTypeReference<TessellAdDomainInternalDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * List of Active Directory Domains
     * List of Active Directory Domains
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param subscriptionId SubscriptionId (optional)
     * @param cloudType CloudType (optional)
     * @return List&lt;TessellAdDomainInternalDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAdDomainInternalDTO> getAdDomainsInternal(Integer pageSize, Integer pageOffset, UUID subscriptionId, TessellCloudTypeDTO cloudType) throws RestClientException {
        return getAdDomainsInternalWithHttpInfo(pageSize, pageOffset, subscriptionId, cloudType).getBody();
    }

    /**
     * List of Active Directory Domains
     * List of Active Directory Domains
     * <p><b>200</b> - List of ad Domains
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param subscriptionId SubscriptionId (optional)
     * @param cloudType CloudType (optional)
     * @return ResponseEntity&lt;List&lt;TessellAdDomainInternalDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAdDomainInternalDTO>> getAdDomainsInternalWithHttpInfo(Integer pageSize, Integer pageOffset, UUID subscriptionId, TessellCloudTypeDTO cloudType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/ad-domains", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));

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

    ParameterizedTypeReference<List<TessellAdDomainInternalDTO>> returnType = new ParameterizedTypeReference<List<TessellAdDomainInternalDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Replicate Ad Domain Credential
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @param tessellReplicateAdDomainPayloadDTO  (optional)
     * @return TessellAdDomainInternalDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAdDomainInternalDTO replicateAdDomainCreds(UUID id, TessellReplicateAdDomainPayloadDTO tessellReplicateAdDomainPayloadDTO) throws RestClientException {
        return replicateAdDomainCredsWithHttpInfo(id, tessellReplicateAdDomainPayloadDTO).getBody();
    }

    /**
     * Replicate Ad Domain Credential
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Ad Domain Identifier (required)
     * @param tessellReplicateAdDomainPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAdDomainInternalDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAdDomainInternalDTO> replicateAdDomainCredsWithHttpInfo(UUID id, TessellReplicateAdDomainPayloadDTO tessellReplicateAdDomainPayloadDTO) throws RestClientException {
        Object postBody = tessellReplicateAdDomainPayloadDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling replicateAdDomainCreds");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/ad-domains/id/{id}/replicate", uriVariables);

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

    ParameterizedTypeReference<TessellAdDomainInternalDTO> returnType = new ParameterizedTypeReference<TessellAdDomainInternalDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
