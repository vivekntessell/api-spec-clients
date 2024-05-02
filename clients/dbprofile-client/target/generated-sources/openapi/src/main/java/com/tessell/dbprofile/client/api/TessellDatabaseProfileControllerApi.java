package com.tessell.dbprofile.client.api;

import com.tessell.dbprofile.client.invoker.ApiClient;

import com.tessell.dbprofile.client.model.ApiError;
import com.tessell.dbprofile.client.model.ApiErrorOps;
import com.tessell.dbprofile.client.model.ApiStatus;
import com.tessell.dbprofile.client.model.DatabaseEngineType;
import com.tessell.dbprofile.client.model.DatabaseOptionProfileStatus;
import com.tessell.dbprofile.client.model.DatabaseOptionTypeStatus;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionProfileConsumptionDTO;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionProfileConsumptionListResponse;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionProfileDTO;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionProfileListResponse;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionTypeDTO;
import com.tessell.dbprofile.client.model.TessellDatabaseOptionTypeListResponse;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:18.047782+05:30[Asia/Kolkata]")
@Component("com.tessell.dbprofile.client.api.TessellDatabaseProfileControllerApi")
public class TessellDatabaseProfileControllerApi {
    private ApiClient apiClient;

    public TessellDatabaseProfileControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellDatabaseProfileControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return TessellDatabaseOptionProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileDTO createDatabaseOptionProfile(TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        return createDatabaseOptionProfileWithHttpInfo(tessellDatabaseOptionProfileDTO).getBody();
    }

    /**
     * Create a new Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileDTO> createDatabaseOptionProfileWithHttpInfo(TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        Object postBody = tessellDatabaseOptionProfileDTO;
        
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param softDelete When set to false, it permanently deletes a Parameter Profile. When set to true, Option Profile can be recovered by contacting Tessell Support. (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseOptionProfile(UUID id, Boolean softDelete) throws RestClientException {
        return deleteDatabaseOptionProfileWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param softDelete When set to false, it permanently deletes a Parameter Profile. When set to true, Option Profile can be recovered by contacting Tessell Support. (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseOptionProfileWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDatabaseOptionProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/databases/profiles/options-profiles/{id}", uriVariables);

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
     * Delete a Tessell Database Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseOptionProfileOps(UUID id, Boolean softDelete) throws RestClientException {
        return deleteDatabaseOptionProfileOpsWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Tessell Database Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param softDelete soft-delete (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseOptionProfileOpsWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDatabaseOptionProfileOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profiles/{id}", uriVariables);

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
     * Get a list of available Tessell Database Options Profile Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile Type (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseOptionTypeListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionTypeListResponse getDatabaseOptionProfileTypes(DatabaseOptionTypeStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseOptionProfileTypesWithHttpInfo(status, engineType, version, multiple, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available Tessell Database Options Profile Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile Type (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseOptionTypeListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionTypeListResponse> getDatabaseOptionProfileTypesWithHttpInfo(DatabaseOptionTypeStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/databases/profiles/options-profile-types", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "multiple", multiple));
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

    ParameterizedTypeReference<TessellDatabaseOptionTypeListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseOptionTypeListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Options Profile Types by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @return TessellDatabaseOptionTypeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionTypeDTO getDatabaseOptionProfileTypesByName(String name, Boolean loadAcls) throws RestClientException {
        return getDatabaseOptionProfileTypesByNameWithHttpInfo(name, loadAcls).getBody();
    }

    /**
     * Get Options Profile Types by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @return ResponseEntity&lt;TessellDatabaseOptionTypeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionTypeDTO> getDatabaseOptionProfileTypesByNameWithHttpInfo(String name, Boolean loadAcls) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDatabaseOptionProfileTypesByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/options-profile-types/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));

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

    ParameterizedTypeReference<TessellDatabaseOptionTypeDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionTypeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Tessell Database Options Profile Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param version version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseOptionTypeListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionTypeListResponse getDatabaseOptionProfileTypesOps(String name, DatabaseOptionTypeStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseOptionProfileTypesOpsWithHttpInfo(name, status, engineType, version, multiple, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available Tessell Database Options Profile Types
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param version version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseOptionTypeListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionTypeListResponse> getDatabaseOptionProfileTypesOpsWithHttpInfo(String name, DatabaseOptionTypeStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profile-types", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "multiple", multiple));
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

    ParameterizedTypeReference<TessellDatabaseOptionTypeListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseOptionTypeListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell Database Options Profile Types by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return TessellDatabaseOptionTypeDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionTypeDTO getDatabaseOptionProfileTypesOpsById(UUID id) throws RestClientException {
        return getDatabaseOptionProfileTypesOpsByIdWithHttpInfo(id).getBody();
    }

    /**
     * View available Tessell Database Options Profile Types by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;TessellDatabaseOptionTypeDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionTypeDTO> getDatabaseOptionProfileTypesOpsByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDatabaseOptionProfileTypesOpsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profile-types/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOptionTypeDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionTypeDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseOptionProfileListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileListResponse getDatabaseOptionProfiles(DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean loadAcls, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseOptionProfilesWithHttpInfo(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileListResponse> getDatabaseOptionProfilesWithHttpInfo(DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean loadAcls, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "multiple", multiple));
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

    ParameterizedTypeReference<TessellDatabaseOptionProfileListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get an Options Profile by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @return TessellDatabaseOptionProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileDTO getDatabaseOptionProfilesByName(String name) throws RestClientException {
        return getDatabaseOptionProfilesByNameWithHttpInfo(name).getBody();
    }

    /**
     * Get an Options Profile by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileDTO> getDatabaseOptionProfilesByNameWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDatabaseOptionProfilesByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/governance/options-profiles/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get an Options Profile by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @return TessellDatabaseOptionProfileConsumptionDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileConsumptionDTO getDatabaseOptionProfilesConsumptionByName(String name) throws RestClientException {
        return getDatabaseOptionProfilesConsumptionByNameWithHttpInfo(name).getBody();
    }

    /**
     * Get an Options Profile by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Options Profile name (required)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileConsumptionDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileConsumptionDTO> getDatabaseOptionProfilesConsumptionByNameWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getDatabaseOptionProfilesConsumptionByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/databases/profiles/options-profiles/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileConsumptionDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileConsumptionDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Tessell Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine type (optional)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseOptionProfileConsumptionListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileConsumptionListResponse getDatabaseOptionProfilesForConsumption(DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean loadAcls, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseOptionProfilesForConsumptionWithHttpInfo(status, engineType, version, loadAcls, multiple, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available Tessell Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of an Options Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine type (optional)
     * @param loadAcls Flag to include / exclude ACL information (optional, default to false)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileConsumptionListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileConsumptionListResponse> getDatabaseOptionProfilesForConsumptionWithHttpInfo(DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean loadAcls, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/databases/profiles/options-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "load-acls", loadAcls));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "multiple", multiple));
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

    ParameterizedTypeReference<TessellDatabaseOptionProfileConsumptionListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileConsumptionListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant id (optional)
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param version version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDatabaseOptionProfileListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileListResponse getDatabaseOptionProfilesOps(String tenantId, String name, DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDatabaseOptionProfilesOpsWithHttpInfo(tenantId, name, status, engineType, version, multiple, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of available Database Options Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant id (optional)
     * @param name name (optional)
     * @param status status (optional)
     * @param engineType engine-type (optional)
     * @param version version (optional)
     * @param multiple multiple (Deprecated) (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileListResponse> getDatabaseOptionProfilesOpsWithHttpInfo(String tenantId, String name, DatabaseOptionProfileStatus status, DatabaseEngineType engineType, String version, Boolean multiple, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine-type", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "multiple", multiple));
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

    ParameterizedTypeReference<TessellDatabaseOptionProfileListResponse> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell Database Options Profiles by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant id (optional)
     * @return TessellDatabaseOptionProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileDTO getDatabaseOptionProfilesOpsById(UUID id, String tenantId) throws RestClientException {
        return getDatabaseOptionProfilesOpsByIdWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * View available Tessell Database Options Profiles by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant id (optional)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileDTO> getDatabaseOptionProfilesOpsByIdWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDatabaseOptionProfilesOpsById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profiles/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Option Profile identifier (required)
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return TessellDatabaseOptionProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileDTO updateDatabaseOptionProfile(UUID id, TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        return updateDatabaseOptionProfileWithHttpInfo(id, tessellDatabaseOptionProfileDTO).getBody();
    }

    /**
     * Update an Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Option Profile identifier (required)
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileDTO> updateDatabaseOptionProfileWithHttpInfo(UUID id, TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        Object postBody = tessellDatabaseOptionProfileDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDatabaseOptionProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/databases/profiles/options-profiles/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Database Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return TessellDatabaseOptionProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDatabaseOptionProfileDTO updateDatabaseOptionProfileOps(UUID id, TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        return updateDatabaseOptionProfileOpsWithHttpInfo(id, tessellDatabaseOptionProfileDTO).getBody();
    }

    /**
     * Update a Tessell Database Options Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Options Profile identifier (required)
     * @param tessellDatabaseOptionProfileDTO  (optional)
     * @return ResponseEntity&lt;TessellDatabaseOptionProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDatabaseOptionProfileDTO> updateDatabaseOptionProfileOpsWithHttpInfo(UUID id, TessellDatabaseOptionProfileDTO tessellDatabaseOptionProfileDTO) throws RestClientException {
        Object postBody = tessellDatabaseOptionProfileDTO;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDatabaseOptionProfileOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/databases/profiles/options-profiles/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellDatabaseOptionProfileDTO> returnType = new ParameterizedTypeReference<TessellDatabaseOptionProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
