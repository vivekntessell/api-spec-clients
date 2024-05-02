package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorOpsDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellNetworkProfileDTO;
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
@Component("com.tessell.network.client.api.TessellNetworkProfileInternalViewApi")
public class TessellNetworkProfileInternalViewApi {
    private ApiClient apiClient;

    public TessellNetworkProfileInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellNetworkProfileInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Network Profile by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @return TessellNetworkProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellNetworkProfileDTO getNetworkProfileByIdInternal(UUID id, Boolean disableAclCheck) throws RestClientException {
        return getNetworkProfileByIdInternalWithHttpInfo(id, disableAclCheck).getBody();
    }

    /**
     * Get Network Profile by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Tessell Generated UUID for the Entity (required)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @return ResponseEntity&lt;TessellNetworkProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellNetworkProfileDTO> getNetworkProfileByIdInternalWithHttpInfo(UUID id, Boolean disableAclCheck) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getNetworkProfileByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/network/network-profiles/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TessellNetworkProfileDTO> returnType = new ParameterizedTypeReference<TessellNetworkProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Network Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (optional)
     * @param subscriptionId Id of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellNetworkProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellNetworkProfileDTO> getNetworkProfilesInternal(String name, UUID subscriptionId, TessellCloudTypeDTO cloudType, String region, Boolean disableAclCheck, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getNetworkProfilesInternalWithHttpInfo(name, subscriptionId, cloudType, region, disableAclCheck, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of Network Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (optional)
     * @param subscriptionId Id of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param disableAclCheck Disable Acl Check (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellNetworkProfileDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellNetworkProfileDTO>> getNetworkProfilesInternalWithHttpInfo(String name, UUID subscriptionId, TessellCloudTypeDTO cloudType, String region, Boolean disableAclCheck, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/network/network-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "disableAclCheck", disableAclCheck));
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

    ParameterizedTypeReference<List<TessellNetworkProfileDTO>> returnType = new ParameterizedTypeReference<List<TessellNetworkProfileDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
