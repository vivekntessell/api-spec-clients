package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.AclEligibleUser;
import com.tessell.dmm.client.model.AclPayload;
import com.tessell.dmm.client.model.AclRevokePayload;
import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.GetSchedulesOps;
import com.tessell.dmm.client.model.GetSlaUsageView;
import com.tessell.dmm.client.model.GetSlasConsumptionView;
import com.tessell.dmm.client.model.GetSlasOps;
import com.tessell.dmm.client.model.GetSlasServiceView;
import com.tessell.dmm.client.model.TamSchedule;
import com.tessell.dmm.client.model.TamSla;
import com.tessell.dmm.client.model.TamSlaConsumptionView;
import com.tessell.dmm.client.model.TamSlaCreateUpdatePayload;
import com.tessell.dmm.client.model.TamSlaCreateUpdatePayloadOps;
import com.tessell.dmm.client.model.TamSlaServiceView;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@Component("com.tessell.dmm.client.api.SlaApi")
public class SlaApi {
    private ApiClient apiClient;

    public SlaApi() {
        this(new ApiClient());
    }

    @Autowired
    public SlaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a new Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tamSlaCreateUpdatePayload  (required)
     * @return TamSlaServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSlaServiceView createSla(TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload) throws RestClientException {
        return createSlaWithHttpInfo(tamSlaCreateUpdatePayload).getBody();
    }

    /**
     * Create a new Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tamSlaCreateUpdatePayload  (required)
     * @return ResponseEntity&lt;TamSlaServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSlaServiceView> createSlaWithHttpInfo(TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload) throws RestClientException {
        Object postBody = tamSlaCreateUpdatePayload;
        
        // verify the required parameter 'tamSlaCreateUpdatePayload' is set
        if (tamSlaCreateUpdatePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tamSlaCreateUpdatePayload' when calling createSla");
        }
        
        String path = apiClient.expandPath("/availability-machines/governance/slas", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TamSlaServiceView> returnType = new ParameterizedTypeReference<TamSlaServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create or update ACLs for an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Availability Machine SLA (required)
     * @param aclPayload  (required)
     * @return AclPayload
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public AclPayload createSlaAcls(String name, AclPayload aclPayload) throws RestClientException {
        return createSlaAclsWithHttpInfo(name, aclPayload).getBody();
    }

    /**
     * Create or update ACLs for an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Availability Machine SLA (required)
     * @param aclPayload  (required)
     * @return ResponseEntity&lt;AclPayload&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<AclPayload> createSlaAclsWithHttpInfo(String name, AclPayload aclPayload) throws RestClientException {
        Object postBody = aclPayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling createSlaAcls");
        }
        
        // verify the required parameter 'aclPayload' is set
        if (aclPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclPayload' when calling createSlaAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}/acls", uriVariables);

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
     * Creates a new Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tamSlaCreateUpdatePayloadOps  (required)
     * @return TamSla
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSla createSlaOps(TamSlaCreateUpdatePayloadOps tamSlaCreateUpdatePayloadOps) throws RestClientException {
        return createSlaOpsWithHttpInfo(tamSlaCreateUpdatePayloadOps).getBody();
    }

    /**
     * Creates a new Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tamSlaCreateUpdatePayloadOps  (required)
     * @return ResponseEntity&lt;TamSla&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSla> createSlaOpsWithHttpInfo(TamSlaCreateUpdatePayloadOps tamSlaCreateUpdatePayloadOps) throws RestClientException {
        Object postBody = tamSlaCreateUpdatePayloadOps;
        
        // verify the required parameter 'tamSlaCreateUpdatePayloadOps' is set
        if (tamSlaCreateUpdatePayloadOps == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tamSlaCreateUpdatePayloadOps' when calling createSlaOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/slas", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TamSla> returnType = new ParameterizedTypeReference<TamSla>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deletes an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteSlaServiceView(String name) throws RestClientException {
        return deleteSlaServiceViewWithHttpInfo(name).getBody();
    }

    /**
     * Deletes an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteSlaServiceViewWithHttpInfo(String name) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteSlaServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}", uriVariables);

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
     * Get list of users which are eligible to grant access for the SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param roles Filter the result based of the specified roles (optional)
     * @return List&lt;AclEligibleUser&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<AclEligibleUser> getEligibleUsersForSla(String name, List<String> roles) throws RestClientException {
        return getEligibleUsersForSlaWithHttpInfo(name, roles).getBody();
    }

    /**
     * Get list of users which are eligible to grant access for the SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param roles Filter the result based of the specified roles (optional)
     * @return ResponseEntity&lt;List&lt;AclEligibleUser&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<AclEligibleUser>> getEligibleUsersForSlaWithHttpInfo(String name, List<String> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getEligibleUsersForSla");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}/acls/eligible-users", uriVariables);

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
     * View a list of available Tessell Availability Machine Schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSchedulesOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSchedulesOps getSchedulesOps(Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSchedulesOpsWithHttpInfo(pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Availability Machine Schedules
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSchedulesOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSchedulesOps> getSchedulesOpsWithHttpInfo(Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/dmms/schedules", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GetSchedulesOps> returnType = new ParameterizedTypeReference<GetSchedulesOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TamSlaConsumptionView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSlaConsumptionView getSlaConsumptionView(String name, String timeZone) throws RestClientException {
        return getSlaConsumptionViewWithHttpInfo(name, timeZone).getBody();
    }

    /**
     * Get details about an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TamSlaConsumptionView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSlaConsumptionView> getSlaConsumptionViewWithHttpInfo(String name, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSlaConsumptionView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/slas/{name}", uriVariables);

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

    ParameterizedTypeReference<TamSlaConsumptionView> returnType = new ParameterizedTypeReference<TamSlaConsumptionView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a Tessell Availability Machine SLA by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TamSla
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSla getSlaOps(UUID id, String tenantId, Boolean loadAcls, String timeZone) throws RestClientException {
        return getSlaOpsWithHttpInfo(id, tenantId, loadAcls, timeZone).getBody();
    }

    /**
     * View a Tessell Availability Machine SLA by id
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tenantId tenant-id (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TamSla&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSla> getSlaOpsWithHttpInfo(UUID id, String tenantId, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSlaOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/slas/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
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

    ParameterizedTypeReference<TamSla> returnType = new ParameterizedTypeReference<TamSla>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of an Availability Machine SLA, for Governance activities
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TamSlaServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSlaServiceView getSlaServiceView(String name, Boolean loadAcls, String timeZone) throws RestClientException {
        return getSlaServiceViewWithHttpInfo(name, loadAcls, timeZone).getBody();
    }

    /**
     * Get details of an Availability Machine SLA, for Governance activities
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TamSlaServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSlaServiceView> getSlaServiceViewWithHttpInfo(String name, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSlaServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<TamSlaServiceView> returnType = new ParameterizedTypeReference<TamSlaServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details of Availability Machines which are using the SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSlaUsageView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSlaUsageView getSlaUsage(String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSlaUsageWithHttpInfo(name, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get details of Availability Machines which are using the SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSlaUsageView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSlaUsageView> getSlaUsageWithHttpInfo(String name, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSlaUsage");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}/usage", uriVariables);

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

    ParameterizedTypeReference<GetSlaUsageView> returnType = new ParameterizedTypeReference<GetSlaUsageView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Availability Machine SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pitrEnabled If true, it will return all of the SLAs where PITR is non-zero. If false, it will return all SLAs where PITR is zero. If not specified, it will return all of the SLAs irrespective of PITR retention. (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSlasConsumptionView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSlasConsumptionView getSlasConsumptionView(Boolean pitrEnabled, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSlasConsumptionViewWithHttpInfo(pitrEnabled, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Availability Machine SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param pitrEnabled If true, it will return all of the SLAs where PITR is non-zero. If false, it will return all SLAs where PITR is zero. If not specified, it will return all of the SLAs irrespective of PITR retention. (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSlasConsumptionView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSlasConsumptionView> getSlasConsumptionViewWithHttpInfo(Boolean pitrEnabled, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/availability-machines/slas", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pitr-enabled", pitrEnabled));
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

    ParameterizedTypeReference<GetSlasConsumptionView> returnType = new ParameterizedTypeReference<GetSlasConsumptionView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Availability Machine SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param tenantId tenant-id (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSlasOps
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSlasOps getSlasOps(String name, String tenantId, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSlasOpsWithHttpInfo(name, tenantId, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Availability Machine SLAs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name name (optional)
     * @param tenantId tenant-id (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSlasOps&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSlasOps> getSlasOpsWithHttpInfo(String name, String tenantId, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/dmms/slas", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
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

    ParameterizedTypeReference<GetSlasOps> returnType = new ParameterizedTypeReference<GetSlasOps>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Availability Machine SLAs, for Governance activities
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetSlasServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetSlasServiceView getSlasServiceView(Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getSlasServiceViewWithHttpInfo(loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get a list of Availability Machine SLAs, for Governance activities
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetSlasServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetSlasServiceView> getSlasServiceViewWithHttpInfo(Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/availability-machines/governance/slas", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

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

    ParameterizedTypeReference<GetSlasServiceView> returnType = new ParameterizedTypeReference<GetSlasServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Revoke ACLs for an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param aclRevokePayload  (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus revokeSlaAcls(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        return revokeSlaAclsWithHttpInfo(name, aclRevokePayload).getBody();
    }

    /**
     * Revoke ACLs for an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param aclRevokePayload  (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> revokeSlaAclsWithHttpInfo(String name, AclRevokePayload aclRevokePayload) throws RestClientException {
        Object postBody = aclRevokePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling revokeSlaAcls");
        }
        
        // verify the required parameter 'aclRevokePayload' is set
        if (aclRevokePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'aclRevokePayload' when calling revokeSlaAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}/acls", uriVariables);

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
     * Update a Tessell Availability Machine Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tamSchedule  (required)
     * @return TamSchedule
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSchedule updateScheduleOps(UUID id, TamSchedule tamSchedule) throws RestClientException {
        return updateScheduleOpsWithHttpInfo(id, tamSchedule).getBody();
    }

    /**
     * Update a Tessell Availability Machine Schedule
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id id (required)
     * @param tamSchedule  (required)
     * @return ResponseEntity&lt;TamSchedule&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSchedule> updateScheduleOpsWithHttpInfo(UUID id, TamSchedule tamSchedule) throws RestClientException {
        Object postBody = tamSchedule;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateScheduleOps");
        }
        
        // verify the required parameter 'tamSchedule' is set
        if (tamSchedule == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tamSchedule' when calling updateScheduleOps");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/dmms/schedules/{id}", uriVariables);

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

    ParameterizedTypeReference<TamSchedule> returnType = new ParameterizedTypeReference<TamSchedule>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update the SLA maturity status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param action Update maturity status as per the action, allowed actions are - DRAFT, PUBLISH, or UNPUBLISH (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus updateSlaMaturityStatus(String name, String action) throws RestClientException {
        return updateSlaMaturityStatusWithHttpInfo(name, action).getBody();
    }

    /**
     * Update the SLA maturity status
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param action Update maturity status as per the action, allowed actions are - DRAFT, PUBLISH, or UNPUBLISH (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> updateSlaMaturityStatusWithHttpInfo(String name, String action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateSlaMaturityStatus");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling updateSlaMaturityStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}/{action}", uriVariables);

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
     * Updates an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param tamSlaCreateUpdatePayload  (required)
     * @return TamSlaServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TamSlaServiceView updateSlaServiceView(String name, TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload) throws RestClientException {
        return updateSlaServiceViewWithHttpInfo(name, tamSlaCreateUpdatePayload).getBody();
    }

    /**
     * Updates an Availability Machine SLA
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the SLA (required)
     * @param tamSlaCreateUpdatePayload  (required)
     * @return ResponseEntity&lt;TamSlaServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TamSlaServiceView> updateSlaServiceViewWithHttpInfo(String name, TamSlaCreateUpdatePayload tamSlaCreateUpdatePayload) throws RestClientException {
        Object postBody = tamSlaCreateUpdatePayload;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling updateSlaServiceView");
        }
        
        // verify the required parameter 'tamSlaCreateUpdatePayload' is set
        if (tamSlaCreateUpdatePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tamSlaCreateUpdatePayload' when calling updateSlaServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/availability-machines/governance/slas/{name}", uriVariables);

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

    ParameterizedTypeReference<TamSlaServiceView> returnType = new ParameterizedTypeReference<TamSlaServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
