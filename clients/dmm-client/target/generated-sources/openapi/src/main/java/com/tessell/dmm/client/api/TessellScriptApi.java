package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.AclEligibleUser;
import com.tessell.dmm.client.model.AclPayload;
import com.tessell.dmm.client.model.AclRevokePayload;
import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.CreateScriptOpsPayload;
import com.tessell.dmm.client.model.CreateScriptPayload;
import com.tessell.dmm.client.model.CreateScriptVersionOpsPayload;
import com.tessell.dmm.client.model.CreateScriptVersionPayload;
import com.tessell.dmm.client.model.DatabaseEngineType;
import com.tessell.dmm.client.model.EntityAclSharingInfo;
import java.io.File;
import com.tessell.dmm.client.model.GetScriptVersionsApiResponse;
import com.tessell.dmm.client.model.GetScriptVersionsServiceApiResponse;
import com.tessell.dmm.client.model.GetScriptsApiResponse;
import com.tessell.dmm.client.model.GetScriptsServiceApiResponse;
import com.tessell.dmm.client.model.ScriptType;
import com.tessell.dmm.client.model.TessellScriptDTO;
import com.tessell.dmm.client.model.TessellScriptServiceViewDTO;
import com.tessell.dmm.client.model.TessellScriptVersionDTO;
import com.tessell.dmm.client.model.TessellScriptVersionServiceView;
import java.util.UUID;
import com.tessell.dmm.client.model.UpdateTessellScriptServicePayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@Component("com.tessell.dmm.client.api.TessellScriptApi")
public class TessellScriptApi {
    private ApiClient apiClient;

    public TessellScriptApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellScriptApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create/update the Script ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param aclPayload  (required)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload createScriptAcls(UUID id, AclPayload aclPayload) throws RestClientException {
        return createScriptAclsWithHttpInfo(id, aclPayload).getBody();
    }

    /**
     * Create/update the Script ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param aclPayload  (required)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> createScriptAclsWithHttpInfo(UUID id, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createScriptAcls");
        }
        
        // verify the required parameter 'aclPayload' is set
        if (aclPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclPayload' when calling createScriptAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<AclPayload> returnType = new ParameterizedTypeReference<AclPayload>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param createScriptOpsPayload  (required)
     * @return TessellScriptDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptDTO createScriptOpsRequest(CreateScriptOpsPayload createScriptOpsPayload) throws RestClientException {
        return createScriptOpsRequestWithHttpInfo(createScriptOpsPayload).getBody();
    }

    /**
     * Create a new Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param createScriptOpsPayload  (required)
     * @return ResponseEntity&lt;TessellScriptDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptDTO> createScriptOpsRequestWithHttpInfo(CreateScriptOpsPayload createScriptOpsPayload) throws RestClientException {
        Object postBody = createScriptOpsPayload;
        
        // verify the required parameter 'createScriptOpsPayload' is set
        if (createScriptOpsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createScriptOpsPayload' when calling createScriptOpsRequest");
        }
        
        String path = apiClient.expandPath("/tessell-ops/scripts", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellScriptDTO> returnType = new ParameterizedTypeReference<TessellScriptDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to create a new Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param createScriptPayload  (required)
     * @return TessellScriptServiceViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptServiceViewDTO createScriptServiceView(CreateScriptPayload createScriptPayload) throws RestClientException {
        return createScriptServiceViewWithHttpInfo(createScriptPayload).getBody();
    }

    /**
     * Request to create a new Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param createScriptPayload  (required)
     * @return ResponseEntity&lt;TessellScriptServiceViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptServiceViewDTO> createScriptServiceViewWithHttpInfo(CreateScriptPayload createScriptPayload) throws RestClientException {
        Object postBody = createScriptPayload;
        
        // verify the required parameter 'createScriptPayload' is set
        if (createScriptPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createScriptPayload' when calling createScriptServiceView");
        }
        
        String path = apiClient.expandPath("/scripts", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellScriptServiceViewDTO> returnType = new ParameterizedTypeReference<TessellScriptServiceViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param createScriptVersionPayload  (required)
     * @return TessellScriptVersionServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionServiceView createScriptVersionServiceView(UUID id, CreateScriptVersionPayload createScriptVersionPayload) throws RestClientException {
        return createScriptVersionServiceViewWithHttpInfo(id, createScriptVersionPayload).getBody();
    }

    /**
     * Create a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param createScriptVersionPayload  (required)
     * @return ResponseEntity&lt;TessellScriptVersionServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionServiceView> createScriptVersionServiceViewWithHttpInfo(UUID id, CreateScriptVersionPayload createScriptVersionPayload) throws RestClientException {
        Object postBody = createScriptVersionPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createScriptVersionServiceView");
        }
        
        // verify the required parameter 'createScriptVersionPayload' is set
        if (createScriptVersionPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createScriptVersionPayload' when calling createScriptVersionServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/versions", uriVariables);

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

    ParameterizedTypeReference<TessellScriptVersionServiceView> returnType = new ParameterizedTypeReference<TessellScriptVersionServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteScript(UUID id, Boolean softDelete) throws RestClientException {
        return deleteScriptWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param softDelete softDelete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteScriptWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteScript");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete the specified Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteScriptServiceView(UUID id) throws RestClientException {
        return deleteScriptServiceViewWithHttpInfo(id).getBody();
    }

    /**
     * Delete the specified Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteScriptServiceViewWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteScriptServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param softDelete Soft delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteScriptVersion(UUID id, String version, Boolean softDelete) throws RestClientException {
        return deleteScriptVersionWithHttpInfo(id, version, softDelete).getBody();
    }

    /**
     * Delete a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param softDelete Soft delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteScriptVersionWithHttpInfo(UUID id, String version, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteScriptVersion");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling deleteScriptVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions/{version}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "soft-delete", softDelete));

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteScriptVersionServiceView(UUID id, String version) throws RestClientException {
        return deleteScriptVersionServiceViewWithHttpInfo(id, version).getBody();
    }

    /**
     * Delete a new Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteScriptVersionServiceViewWithHttpInfo(UUID id, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteScriptVersionServiceView");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling deleteScriptVersionServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/scripts/{id}/versions/{version}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Download Tessell Script Content
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] downloadScriptContent(UUID id, String version) throws RestClientException {
        return downloadScriptContentWithHttpInfo(id, version).getBody();
    }

    /**
     * Download Tessell Script Content
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> downloadScriptContentWithHttpInfo(UUID id, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling downloadScriptContent");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling downloadScriptContent");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions/{version}/content", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Download Tessell Script Content
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return byte[]
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public byte[] downloadScriptContentServiceView(UUID id, String version) throws RestClientException {
        return downloadScriptContentServiceViewWithHttpInfo(id, version).getBody();
    }

    /**
     * Download Tessell Script Content
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @return ResponseEntity&lt;byte[]&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<byte[]> downloadScriptContentServiceViewWithHttpInfo(UUID id, String version) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling downloadScriptContentServiceView");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling downloadScriptContentServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/scripts/{id}/versions/{version}/content", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/octet-stream", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<byte[]> returnType = new ParameterizedTypeReference<byte[]>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param roles roles (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getEligibleUsersForScript(UUID id, List<String> roles) throws RestClientException {
        return getEligibleUsersForScriptWithHttpInfo(id, roles).getBody();
    }

    /**
     * Get list of all the users by privileges
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param roles roles (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getEligibleUsersForScriptWithHttpInfo(UUID id, List<String> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getEligibleUsersForScript");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/acls/eligible-users", uriVariables);

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

    ParameterizedTypeReference<List<AclEligibleUser>> returnType = new ParameterizedTypeReference<List<AclEligibleUser>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View Tessell Scripts by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Script id (required)
     * @param loadVersions load versions (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellScriptDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptDTO getScript(UUID id, Boolean loadVersions, Boolean loadAcls, String timeZone) throws RestClientException {
        return getScriptWithHttpInfo(id, loadVersions, loadAcls, timeZone).getBody();
    }

    /**
     * View Tessell Scripts by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Script id (required)
     * @param loadVersions load versions (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellScriptDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptDTO> getScriptWithHttpInfo(UUID id, Boolean loadVersions, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScript");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-versions", loadVersions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellScriptDTO> returnType = new ParameterizedTypeReference<TessellScriptDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of ACLs for the Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @return EntityAclSharingInfo
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public EntityAclSharingInfo getScriptAcls(UUID id) throws RestClientException {
        return getScriptAclsWithHttpInfo(id).getBody();
    }

    /**
     * Get list of ACLs for the Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @return ResponseEntity&lt;EntityAclSharingInfo&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<EntityAclSharingInfo> getScriptAclsWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<EntityAclSharingInfo> returnType = new ParameterizedTypeReference<EntityAclSharingInfo>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get information about a Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param loadVersions Specify if the versions are to be fetched for the script (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellScriptServiceViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptServiceViewDTO getScriptServiceView(UUID id, Boolean loadVersions, Boolean loadAcls, String timeZone) throws RestClientException {
        return getScriptServiceViewWithHttpInfo(id, loadVersions, loadAcls, timeZone).getBody();
    }

    /**
     * Get information about a Script
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param loadVersions Specify if the versions are to be fetched for the script (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellScriptServiceViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptServiceViewDTO> getScriptServiceViewWithHttpInfo(UUID id, Boolean loadVersions, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-versions", loadVersions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellScriptServiceViewDTO> returnType = new ParameterizedTypeReference<TessellScriptServiceViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tessell Script version Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellScriptVersionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionDTO getScriptVersion(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getScriptVersionWithHttpInfo(id, version, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get Tessell Script version Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellScriptVersionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionDTO> getScriptVersionWithHttpInfo(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptVersion");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getScriptVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions/{version}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellScriptVersionDTO> returnType = new ParameterizedTypeReference<TessellScriptVersionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tessell Script versions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellScriptVersionServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionServiceView getScriptVersionServiceView(UUID id, String version, String timeZone) throws RestClientException {
        return getScriptVersionServiceViewWithHttpInfo(id, version, timeZone).getBody();
    }

    /**
     * Get Tessell Script versions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellScriptVersionServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionServiceView> getScriptVersionServiceViewWithHttpInfo(UUID id, String version, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptVersionServiceView");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling getScriptVersionServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/scripts/{id}/versions/{version}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<TessellScriptVersionServiceView> returnType = new ParameterizedTypeReference<TessellScriptVersionServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available versions for the Script Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Script version (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetScriptVersionsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetScriptVersionsApiResponse getScriptVersions(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getScriptVersionsWithHttpInfo(id, version, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available versions for the Script Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Script version (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetScriptVersionsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetScriptVersionsApiResponse> getScriptVersionsWithHttpInfo(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptVersions");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<GetScriptVersionsApiResponse> returnType = new ParameterizedTypeReference<GetScriptVersionsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tessell Script versions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Script version (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetScriptVersionsServiceApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetScriptVersionsServiceApiResponse getScriptVersionsServiceView(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getScriptVersionsServiceViewWithHttpInfo(id, version, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get Tessell Script versions
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Script version (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetScriptVersionsServiceApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetScriptVersionsServiceApiResponse> getScriptVersionsServiceViewWithHttpInfo(UUID id, String version, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getScriptVersionsServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/versions", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<GetScriptVersionsServiceApiResponse> returnType = new ParameterizedTypeReference<GetScriptVersionsServiceApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Scripts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional, default to )
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param scriptType script type (optional)
     * @param loadVersions load script versions (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetScriptsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetScriptsApiResponse getScripts(String name, String status, List<DatabaseEngineType> engineType, List<ScriptType> scriptType, Boolean loadVersions, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getScriptsWithHttpInfo(name, status, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Scripts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional, default to )
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param scriptType script type (optional)
     * @param loadVersions load script versions (optional, default to false)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetScriptsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetScriptsApiResponse> getScriptsWithHttpInfo(String name, String status, List<DatabaseEngineType> engineType, List<ScriptType> scriptType, Boolean loadVersions, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/scripts", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "script-type", scriptType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-versions", loadVersions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));

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

    ParameterizedTypeReference<GetScriptsApiResponse> returnType = new ParameterizedTypeReference<GetScriptsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Scripts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter result based on the specified name (optional)
     * @param engineType Filter result based on the specified database engine type (optional)
     * @param scriptType Filter result based on the specified script types (optional)
     * @param loadVersions Specify if the versions are to be fetched for the script (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @return GetScriptsServiceApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetScriptsServiceApiResponse getScriptsServiceView(String name, List<DatabaseEngineType> engineType, List<ScriptType> scriptType, Boolean loadVersions, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone, List<String> owners) throws RestClientException {
        return getScriptsServiceViewWithHttpInfo(name, engineType, scriptType, loadVersions, loadAcls, pageSize, pageOffset, timeZone, owners).getBody();
    }

    /**
     * Get a list of Scripts
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Filter result based on the specified name (optional)
     * @param engineType Filter result based on the specified database engine type (optional)
     * @param scriptType Filter result based on the specified script types (optional)
     * @param loadVersions Specify if the versions are to be fetched for the script (optional, default to true)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @return ResponseEntity&lt;GetScriptsServiceApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetScriptsServiceApiResponse> getScriptsServiceViewWithHttpInfo(String name, List<DatabaseEngineType> engineType, List<ScriptType> scriptType, Boolean loadVersions, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone, List<String> owners) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/scripts", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "script-type", scriptType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-versions", loadVersions));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "time-zone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));

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

    ParameterizedTypeReference<GetScriptsServiceApiResponse> returnType = new ParameterizedTypeReference<GetScriptsServiceApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revoke Script ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param aclRevokePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeScriptAcls(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeScriptAclsWithHttpInfo(id, aclRevokePayload).getBody();
    }

    /**
     * Revoke Script ACLs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Script (required)
     * @param aclRevokePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeScriptAclsWithHttpInfo(UUID id, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling revokeScriptAcls");
        }
        
        // verify the required parameter 'aclRevokePayload' is set
        if (aclRevokePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclRevokePayload' when calling revokeScriptAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}/acls", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a new Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Script id (required)
     * @param tessellScriptDTO  (required)
     * @return TessellScriptDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptDTO updateScript(UUID id, TessellScriptDTO tessellScriptDTO) throws RestClientException {
        return updateScriptWithHttpInfo(id, tessellScriptDTO).getBody();
    }

    /**
     * Update a new Tessell Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Script id (required)
     * @param tessellScriptDTO  (required)
     * @return ResponseEntity&lt;TessellScriptDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptDTO> updateScriptWithHttpInfo(UUID id, TessellScriptDTO tessellScriptDTO) throws RestClientException {
        Object postBody = tessellScriptDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateScript");
        }
        
        // verify the required parameter 'tessellScriptDTO' is set
        if (tessellScriptDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellScriptDTO' when calling updateScript");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellScriptDTO> returnType = new ParameterizedTypeReference<TessellScriptDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update the Script&#39;s maturity status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param action Maturity status for the Script, which could be any of - DRAFT, PUBLISH, or UNPUBLISH (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateScriptMaturity(UUID id, String action) throws RestClientException {
        return updateScriptMaturityWithHttpInfo(id, action).getBody();
    }

    /**
     * Update the Script&#39;s maturity status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param action Maturity status for the Script, which could be any of - DRAFT, PUBLISH, or UNPUBLISH (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateScriptMaturityWithHttpInfo(UUID id, String action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateScriptMaturity");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateScriptMaturity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/scripts/{id}/{action}", uriVariables);

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

    ParameterizedTypeReference<ApiStatus> returnType = new ParameterizedTypeReference<ApiStatus>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update the specified Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param updateTessellScriptServicePayload  (required)
     * @return TessellScriptServiceViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptServiceViewDTO updateScriptServiceView(UUID id, UpdateTessellScriptServicePayload updateTessellScriptServicePayload) throws RestClientException {
        return updateScriptServiceViewWithHttpInfo(id, updateTessellScriptServicePayload).getBody();
    }

    /**
     * Update the specified Script
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Script (required)
     * @param updateTessellScriptServicePayload  (required)
     * @return ResponseEntity&lt;TessellScriptServiceViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptServiceViewDTO> updateScriptServiceViewWithHttpInfo(UUID id, UpdateTessellScriptServicePayload updateTessellScriptServicePayload) throws RestClientException {
        Object postBody = updateTessellScriptServicePayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateScriptServiceView");
        }
        
        // verify the required parameter 'updateTessellScriptServicePayload' is set
        if (updateTessellScriptServicePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateTessellScriptServicePayload' when calling updateScriptServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/scripts/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellScriptServiceViewDTO> returnType = new ParameterizedTypeReference<TessellScriptServiceViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param tessellScriptVersionDTO  (required)
     * @return TessellScriptVersionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionDTO updateScriptVersion(UUID id, String version, TessellScriptVersionDTO tessellScriptVersionDTO) throws RestClientException {
        return updateScriptVersionWithHttpInfo(id, version, tessellScriptVersionDTO).getBody();
    }

    /**
     * Update a Tessell Script Version
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param tessellScriptVersionDTO  (required)
     * @return ResponseEntity&lt;TessellScriptVersionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionDTO> updateScriptVersionWithHttpInfo(UUID id, String version, TessellScriptVersionDTO tessellScriptVersionDTO) throws RestClientException {
        Object postBody = tessellScriptVersionDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateScriptVersion");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling updateScriptVersion");
        }
        
        // verify the required parameter 'tessellScriptVersionDTO' is set
        if (tessellScriptVersionDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellScriptVersionDTO' when calling updateScriptVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions/{version}", uriVariables);

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

    ParameterizedTypeReference<TessellScriptVersionDTO> returnType = new ParameterizedTypeReference<TessellScriptVersionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upload Tessell Script Version blob
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param createScriptVersionOpsPayload  (required)
     * @return TessellScriptVersionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionDTO uploadScriptContentOpsRequest(UUID id, String version, CreateScriptVersionOpsPayload createScriptVersionOpsPayload) throws RestClientException {
        return uploadScriptContentOpsRequestWithHttpInfo(id, version, createScriptVersionOpsPayload).getBody();
    }

    /**
     * Upload Tessell Script Version blob
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param createScriptVersionOpsPayload  (required)
     * @return ResponseEntity&lt;TessellScriptVersionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionDTO> uploadScriptContentOpsRequestWithHttpInfo(UUID id, String version, CreateScriptVersionOpsPayload createScriptVersionOpsPayload) throws RestClientException {
        Object postBody = createScriptVersionOpsPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling uploadScriptContentOpsRequest");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling uploadScriptContentOpsRequest");
        }
        
        // verify the required parameter 'createScriptVersionOpsPayload' is set
        if (createScriptVersionOpsPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createScriptVersionOpsPayload' when calling uploadScriptContentOpsRequest");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/tessell-ops/scripts/{id}/versions/{version}/content", uriVariables);

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

    ParameterizedTypeReference<TessellScriptVersionDTO> returnType = new ParameterizedTypeReference<TessellScriptVersionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upload Tessell Script Version blob
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param blob File content (optional)
     * @return TessellScriptVersionServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellScriptVersionServiceView uploadScriptContentServiceView(UUID id, String version, File blob) throws RestClientException {
        return uploadScriptContentServiceViewWithHttpInfo(id, version, blob).getBody();
    }

    /**
     * Upload Tessell Script Version blob
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id Id of the Tessell Script (required)
     * @param version Version of the Tessell Script (required)
     * @param blob File content (optional)
     * @return ResponseEntity&lt;TessellScriptVersionServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellScriptVersionServiceView> uploadScriptContentServiceViewWithHttpInfo(UUID id, String version, File blob) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling uploadScriptContentServiceView");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling uploadScriptContentServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("version", version);
        String path = apiClient.expandPath("/scripts/{id}/versions/{version}/content", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        if (blob != null)
            formParams.add("blob", new FileSystemResource(blob));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = { 
            "multipart/form-data"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellScriptVersionServiceView> returnType = new ParameterizedTypeReference<TessellScriptVersionServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
