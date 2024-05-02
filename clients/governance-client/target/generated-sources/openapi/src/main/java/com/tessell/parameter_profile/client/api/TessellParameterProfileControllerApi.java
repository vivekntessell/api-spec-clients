package com.tessell.parameter_profile.client.api;

import com.tessell.parameter_profile.client.invoker.ApiClient;

import com.tessell.parameter_profile.client.model.ApiError;
import com.tessell.parameter_profile.client.model.ApiErrorOps;
import com.tessell.parameter_profile.client.model.ApiStatus;
import com.tessell.parameter_profile.client.model.CopyToProfiles;
import com.tessell.parameter_profile.client.model.DatabaseEngineType;
import com.tessell.parameter_profile.client.model.DatabaseFactoryParameterListResponse;
import com.tessell.parameter_profile.client.model.DatabaseFactoryParameterResponse;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileEvaluateRequest;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileListResponse;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfilePatchRequest;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileRequest;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileResponse;
import com.tessell.parameter_profile.client.model.DatabaseParameterProfileStatus;
import com.tessell.parameter_profile.client.model.DatabaseParameterTypeStatus;
import com.tessell.parameter_profile.client.model.DeleteValidationResponse;
import com.tessell.parameter_profile.client.model.ParameterProfileCompareResponse;
import com.tessell.parameter_profile.client.model.ParameterProfileUsageResponse;
import com.tessell.parameter_profile.client.model.ToggleIsActiveFlagResponse;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.959198+05:30[Asia/Kolkata]")
@Component("com.tessell.parameter_profile.client.api.TessellParameterProfileControllerApi")
public class TessellParameterProfileControllerApi {
    private ApiClient apiClient;

    public TessellParameterProfileControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellParameterProfileControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Compare two Parameter Profile configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Parameter Profile (required)
     * @param tenantId Id of the Tenant (required)
     * @param compareTo Id of the Parameter Profile to be compared with (required)
     * @return ParameterProfileCompareResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParameterProfileCompareResponse compareDatabaseParameterConfigs(UUID id, String tenantId, UUID compareTo) throws RestClientException {
        return compareDatabaseParameterConfigsWithHttpInfo(id, tenantId, compareTo).getBody();
    }

    /**
     * Compare two Parameter Profile configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of the Parameter Profile (required)
     * @param tenantId Id of the Tenant (required)
     * @param compareTo Id of the Parameter Profile to be compared with (required)
     * @return ResponseEntity&lt;ParameterProfileCompareResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ParameterProfileCompareResponse> compareDatabaseParameterConfigsWithHttpInfo(UUID id, String tenantId, UUID compareTo) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling compareDatabaseParameterConfigs");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling compareDatabaseParameterConfigs");
        }
        
        // verify the required parameter 'compareTo' is set
        if (compareTo == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'compareTo' when calling compareDatabaseParameterConfigs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}/compare", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compareTo", compareTo));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<ParameterProfileCompareResponse> returnType = new ParameterizedTypeReference<ParameterProfileCompareResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Copy Parameters of one Parameter Profile to other Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of Parameter Profile (Parameters will be copied from this Parameter Profile) (required)
     * @param copyToProfiles  (optional)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus copyDatabaseParameterConfigs(UUID id, CopyToProfiles copyToProfiles) throws RestClientException {
        return copyDatabaseParameterConfigsWithHttpInfo(id, copyToProfiles).getBody();
    }

    /**
     * Copy Parameters of one Parameter Profile to other Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Id of Parameter Profile (Parameters will be copied from this Parameter Profile) (required)
     * @param copyToProfiles  (optional)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> copyDatabaseParameterConfigsWithHttpInfo(UUID id, CopyToProfiles copyToProfiles) throws RestClientException {
        Object postBody = copyToProfiles;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling copyDatabaseParameterConfigs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}/copy-configuration", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param databaseParameterProfileRequest  (optional)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse createDatabaseParameterProfile(DatabaseParameterProfileRequest databaseParameterProfileRequest) throws RestClientException {
        return createDatabaseParameterProfileWithHttpInfo(databaseParameterProfileRequest).getBody();
    }

    /**
     * Create a new Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param databaseParameterProfileRequest  (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> createDatabaseParameterProfileWithHttpInfo(DatabaseParameterProfileRequest databaseParameterProfileRequest) throws RestClientException {
        Object postBody = databaseParameterProfileRequest;
        
        String path = apiClient.expandPath("/governance/parameter-profiles", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param databaseParameterProfileRequest  (optional)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse createDatabaseParameterProfileForInternalConsumers(String tenantId, DatabaseParameterProfileRequest databaseParameterProfileRequest) throws RestClientException {
        return createDatabaseParameterProfileForInternalConsumersWithHttpInfo(tenantId, databaseParameterProfileRequest).getBody();
    }

    /**
     * Create a new Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param databaseParameterProfileRequest  (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> createDatabaseParameterProfileForInternalConsumersWithHttpInfo(String tenantId, DatabaseParameterProfileRequest databaseParameterProfileRequest) throws RestClientException {
        Object postBody = databaseParameterProfileRequest;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createDatabaseParameterProfileForInternalConsumers");
        }
        
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @param softDelete When set to false, it permanently deletes a Parameter Profile. When set to true, Parameter Profile can be recovered by contacting Tessell Support. (optional, default to true)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDatabaseParameterProfile(UUID id, Boolean softDelete) throws RestClientException {
        return deleteDatabaseParameterProfileWithHttpInfo(id, softDelete).getBody();
    }

    /**
     * Delete a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @param softDelete When set to false, it permanently deletes a Parameter Profile. When set to true, Parameter Profile can be recovered by contacting Tessell Support. (optional, default to true)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDatabaseParameterProfileWithHttpInfo(UUID id, Boolean softDelete) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteDatabaseParameterProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}", uriVariables);

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
     * Evaluate a new Tessell Database Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id name (required)
     * @param databaseParameterProfileEvaluateRequest  (optional)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse evaluateDatabaseParameterProfile(String tenantId, UUID id, DatabaseParameterProfileEvaluateRequest databaseParameterProfileEvaluateRequest) throws RestClientException {
        return evaluateDatabaseParameterProfileWithHttpInfo(tenantId, id, databaseParameterProfileEvaluateRequest).getBody();
    }

    /**
     * Evaluate a new Tessell Database Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id name (required)
     * @param databaseParameterProfileEvaluateRequest  (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> evaluateDatabaseParameterProfileWithHttpInfo(String tenantId, UUID id, DatabaseParameterProfileEvaluateRequest databaseParameterProfileEvaluateRequest) throws RestClientException {
        Object postBody = databaseParameterProfileEvaluateRequest;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling evaluateDatabaseParameterProfile");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling evaluateDatabaseParameterProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles/{id}/evaluate", uriVariables);

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

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of a Parameter Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param name Parameter Profile name (optional)
     * @return DatabaseParameterProfileListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileListResponse getDatabaseParameterProfiles(DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        return getDatabaseParameterProfilesWithHttpInfo(status, engineType, version, name).getBody();
    }

    /**
     * Get a list of Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Status of a Parameter Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param name Parameter Profile name (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileListResponse> getDatabaseParameterProfilesWithHttpInfo(DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/governance/parameter-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engineType", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    ParameterizedTypeReference<DatabaseParameterProfileListResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell Database Parameter Profiles by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id name (required)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse getDatabaseParameterProfilesById(String tenantId, UUID id) throws RestClientException {
        return getDatabaseParameterProfilesByIdWithHttpInfo(tenantId, id).getBody();
    }

    /**
     * View available Tessell Database Parameter Profiles by Id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param id name (required)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> getDatabaseParameterProfilesByIdWithHttpInfo(String tenantId, UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getDatabaseParameterProfilesById");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDatabaseParameterProfilesById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles/{id}", uriVariables);

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
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View available Tessell Database Parameter Profiles by Id and versionId
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id name (required)
     * @param versionId name (required)
     * @param tenantId Id of the Tenant (required)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse getDatabaseParameterProfilesByVersion(UUID id, UUID versionId, String tenantId) throws RestClientException {
        return getDatabaseParameterProfilesByVersionWithHttpInfo(id, versionId, tenantId).getBody();
    }

    /**
     * View available Tessell Database Parameter Profiles by Id and versionId
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id name (required)
     * @param versionId name (required)
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> getDatabaseParameterProfilesByVersionWithHttpInfo(UUID id, UUID versionId, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDatabaseParameterProfilesByVersion");
        }
        
        // verify the required parameter 'versionId' is set
        if (versionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'versionId' when calling getDatabaseParameterProfilesByVersion");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getDatabaseParameterProfilesByVersion");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        uriVariables.put("versionId", versionId);
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles/{id}/version/{versionId}", uriVariables);

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
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Parameter Profile status (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param name Parameter Profile name (optional)
     * @return DatabaseParameterProfileListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileListResponse getDatabaseParameterProfilesForConsumers(DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        return getDatabaseParameterProfilesForConsumersWithHttpInfo(status, engineType, version, name).getBody();
    }

    /**
     * Get a list of available Parameter Profiles
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status Parameter Profile status (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @param name Parameter Profile name (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileListResponse> getDatabaseParameterProfilesForConsumersWithHttpInfo(DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/databases/parameter-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engineType", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

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

    ParameterizedTypeReference<DatabaseParameterProfileListResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of available Tessell Database Parameter Profiles for consumers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param status status (optional)
     * @param engineType engineType (optional)
     * @param version version (optional)
     * @param name  (optional)
     * @return DatabaseParameterProfileListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileListResponse getDatabaseParameterProfilesForInternalConsumers(String tenantId, DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        return getDatabaseParameterProfilesForInternalConsumersWithHttpInfo(tenantId, status, engineType, version, name).getBody();
    }

    /**
     * Get a list of available Tessell Database Parameter Profiles for consumers
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param status status (optional)
     * @param engineType engineType (optional)
     * @param version version (optional)
     * @param name  (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileListResponse> getDatabaseParameterProfilesForInternalConsumersWithHttpInfo(String tenantId, DatabaseParameterProfileStatus status, DatabaseEngineType engineType, String version, String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getDatabaseParameterProfilesForInternalConsumers");
        }
        
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engineType", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<DatabaseParameterProfileListResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of supported Database Parameters for all Database Engines with default configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (optional)
     * @param status Status of Parameter Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @return DatabaseFactoryParameterListResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseFactoryParameterListResponse getFactoryParameterProfiles(String name, DatabaseParameterTypeStatus status, DatabaseEngineType engineType, String version) throws RestClientException {
        return getFactoryParameterProfilesWithHttpInfo(name, status, engineType, version).getBody();
    }

    /**
     * Get a list of supported Database Parameters for all Database Engines with default configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Parameter Profile name (optional)
     * @param status Status of Parameter Profile (optional)
     * @param engineType Database Engine type (optional)
     * @param version Database Engine version (optional)
     * @return ResponseEntity&lt;DatabaseFactoryParameterListResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseFactoryParameterListResponse> getFactoryParameterProfilesWithHttpInfo(String name, DatabaseParameterTypeStatus status, DatabaseEngineType engineType, String version) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/governance/parameter-profiles/validations", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engineType", engineType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));

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

    ParameterizedTypeReference<DatabaseFactoryParameterListResponse> returnType = new ParameterizedTypeReference<DatabaseFactoryParameterListResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of supported Tessell Database Parameter Profile By Id with factory configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return DatabaseFactoryParameterResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseFactoryParameterResponse getFactoryParameterProfilesById(UUID id) throws RestClientException {
        return getFactoryParameterProfilesByIdWithHttpInfo(id).getBody();
    }

    /**
     * Get a list of supported Tessell Database Parameter Profile By Id with factory configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;DatabaseFactoryParameterResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseFactoryParameterResponse> getFactoryParameterProfilesByIdWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getFactoryParameterProfilesById");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles/validations/{id}", uriVariables);

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

    ParameterizedTypeReference<DatabaseFactoryParameterResponse> returnType = new ParameterizedTypeReference<DatabaseFactoryParameterResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Provide Services/Instances that are using the Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @return ParameterProfileUsageResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ParameterProfileUsageResponse getParameterProfileUsages(UUID id) throws RestClientException {
        return getParameterProfileUsagesWithHttpInfo(id).getBody();
    }

    /**
     * Provide Services/Instances that are using the Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @return ResponseEntity&lt;ParameterProfileUsageResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ParameterProfileUsageResponse> getParameterProfileUsagesWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getParameterProfileUsages");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}/usages", uriVariables);

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

    ParameterizedTypeReference<ParameterProfileUsageResponse> returnType = new ParameterizedTypeReference<ParameterProfileUsageResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Check if Parameter Profile is deletable or not
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @return DeleteValidationResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DeleteValidationResponse isParameterProfileDeletable(UUID id) throws RestClientException {
        return isParameterProfileDeletableWithHttpInfo(id).getBody();
    }

    /**
     * Check if Parameter Profile is deletable or not
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id Parameter Profile Id (required)
     * @return ResponseEntity&lt;DeleteValidationResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DeleteValidationResponse> isParameterProfileDeletableWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling isParameterProfileDeletable");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}/deletable", uriVariables);

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

    ParameterizedTypeReference<DeleteValidationResponse> returnType = new ParameterizedTypeReference<DeleteValidationResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Reset Parameters of Parameter Profile to its default values
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus resetParameterProfileToDefault(UUID id) throws RestClientException {
        return resetParameterProfileToDefaultWithHttpInfo(id).getBody();
    }

    /**
     * Reset Parameters of Parameter Profile to its default values
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> resetParameterProfileToDefaultWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling resetParameterProfileToDefault");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}/reset", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Toggle the is_active value for a given parameter profile configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param isActive New is-active for the parameter profile (required)
     * @return ToggleIsActiveFlagResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ToggleIsActiveFlagResponse toggleIsActiveFlagForParameterProfile(UUID id, Boolean isActive) throws RestClientException {
        return toggleIsActiveFlagForParameterProfileWithHttpInfo(id, isActive).getBody();
    }

    /**
     * Toggle the is_active value for a given parameter profile configuration
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param isActive New is-active for the parameter profile (required)
     * @return ResponseEntity&lt;ToggleIsActiveFlagResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ToggleIsActiveFlagResponse> toggleIsActiveFlagForParameterProfileWithHttpInfo(UUID id, Boolean isActive) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling toggleIsActiveFlagForParameterProfile");
        }
        
        // verify the required parameter 'isActive' is set
        if (isActive == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'isActive' when calling toggleIsActiveFlagForParameterProfile");
        }
        
        String path = apiClient.expandPath("/tessell-internal/parameter-profiles/is-active", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "isActive", isActive));

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

    ParameterizedTypeReference<ToggleIsActiveFlagResponse> returnType = new ParameterizedTypeReference<ToggleIsActiveFlagResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param databaseParameterProfilePatchRequest  (optional)
     * @return DatabaseParameterProfileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public DatabaseParameterProfileResponse updateDatabaseParameterProfile(UUID id, DatabaseParameterProfilePatchRequest databaseParameterProfilePatchRequest) throws RestClientException {
        return updateDatabaseParameterProfileWithHttpInfo(id, databaseParameterProfilePatchRequest).getBody();
    }

    /**
     * Update a Parameter Profile
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param databaseParameterProfilePatchRequest  (optional)
     * @return ResponseEntity&lt;DatabaseParameterProfileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<DatabaseParameterProfileResponse> updateDatabaseParameterProfileWithHttpInfo(UUID id, DatabaseParameterProfilePatchRequest databaseParameterProfilePatchRequest) throws RestClientException {
        Object postBody = databaseParameterProfilePatchRequest;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateDatabaseParameterProfile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/governance/parameter-profiles/{id}", uriVariables);

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

    ParameterizedTypeReference<DatabaseParameterProfileResponse> returnType = new ParameterizedTypeReference<DatabaseParameterProfileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
