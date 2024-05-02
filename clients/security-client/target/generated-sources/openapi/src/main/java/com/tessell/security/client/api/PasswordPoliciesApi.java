package com.tessell.security.client.api;

import com.tessell.security.client.invoker.ApiClient;

import com.tessell.security.client.model.TessellApiErrorDTO;
import com.tessell.security.client.model.TessellApiErrorOpsDTO;
import com.tessell.security.client.model.TessellPasswordPolicyDTODTO;
import com.tessell.security.client.model.TessellPasswordPolicyResponseDTODTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@Component("com.tessell.security.client.api.PasswordPoliciesApi")
public class PasswordPoliciesApi {
    private ApiClient apiClient;

    public PasswordPoliciesApi() {
        this(new ApiClient());
    }

    @Autowired
    public PasswordPoliciesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellPasswordPolicyDTODTO  (optional)
     * @return TessellPasswordPolicyResponseDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPasswordPolicyResponseDTODTO createPasswordPolicy(TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO) throws RestClientException {
        return createPasswordPolicyWithHttpInfo(tessellPasswordPolicyDTODTO).getBody();
    }

    /**
     * Create Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellPasswordPolicyDTODTO  (optional)
     * @return ResponseEntity&lt;TessellPasswordPolicyResponseDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPasswordPolicyResponseDTODTO> createPasswordPolicyWithHttpInfo(TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO) throws RestClientException {
        Object postBody = tessellPasswordPolicyDTODTO;
        
        String path = apiClient.expandPath("/tessell-internal/security/password-policies", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPasswordPolicyResponseDTODTO> returnType = new ParameterizedTypeReference<TessellPasswordPolicyResponseDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tenant Password Policies for internal api calls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellPasswordPolicyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPasswordPolicyDTODTO getInternalPasswordPolicyById() throws RestClientException {
        return getInternalPasswordPolicyByIdWithHttpInfo().getBody();
    }

    /**
     * Get Tenant Password Policies for internal api calls
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellPasswordPolicyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPasswordPolicyDTODTO> getInternalPasswordPolicyByIdWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/security/password-policies", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPasswordPolicyDTODTO> returnType = new ParameterizedTypeReference<TessellPasswordPolicyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return TessellPasswordPolicyDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPasswordPolicyDTODTO getPasswordPolicyByID() throws RestClientException {
        return getPasswordPolicyByIDWithHttpInfo().getBody();
    }

    /**
     * Get Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;TessellPasswordPolicyDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPasswordPolicyDTODTO> getPasswordPolicyByIDWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/security/password-policies", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPasswordPolicyDTODTO> returnType = new ParameterizedTypeReference<TessellPasswordPolicyDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellPasswordPolicyDTODTO  (required)
     * @return TessellPasswordPolicyResponseDTODTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellPasswordPolicyResponseDTODTO updatePasswordPolicy(TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO) throws RestClientException {
        return updatePasswordPolicyWithHttpInfo(tessellPasswordPolicyDTODTO).getBody();
    }

    /**
     * Update Tenant Password Policies
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellPasswordPolicyDTODTO  (required)
     * @return ResponseEntity&lt;TessellPasswordPolicyResponseDTODTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellPasswordPolicyResponseDTODTO> updatePasswordPolicyWithHttpInfo(TessellPasswordPolicyDTODTO tessellPasswordPolicyDTODTO) throws RestClientException {
        Object postBody = tessellPasswordPolicyDTODTO;
        
        // verify the required parameter 'tessellPasswordPolicyDTODTO' is set
        if (tessellPasswordPolicyDTODTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellPasswordPolicyDTODTO' when calling updatePasswordPolicy");
        }
        
        String path = apiClient.expandPath("/security/password-policies", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellPasswordPolicyResponseDTODTO> returnType = new ParameterizedTypeReference<TessellPasswordPolicyResponseDTODTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
