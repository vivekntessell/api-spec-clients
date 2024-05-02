package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiError;
import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.CreateDapCallbackPayload;
import com.tessell.dmm.client.model.CreateDapPayload;
import com.tessell.dmm.client.model.DapStatus;
import com.tessell.dmm.client.model.GetDapsApiResponse;
import com.tessell.dmm.client.model.GetDmmAvailabilityPoliciesServiceView;
import com.tessell.dmm.client.model.TessellDapCatalog;
import com.tessell.dmm.client.model.TessellDapCatalogServiceView;
import com.tessell.dmm.client.model.TessellDapDTO;
import com.tessell.dmm.client.model.TessellDapServiceDTO;
import java.util.UUID;
import com.tessell.dmm.client.model.UpdateDapPayload;

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
@Component("com.tessell.dmm.client.api.DapApi")
public class DapApi {
    private ApiClient apiClient;

    public DapApi() {
        this(new ApiClient());
    }

    @Autowired
    public DapApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create DAP callback
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of the availability machine (required)
     * @param dapId ID of the DAP (required)
     * @param createDapCallbackPayload  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void createDapCallback(UUID dmmId, UUID dapId, CreateDapCallbackPayload createDapCallbackPayload) throws RestClientException {
        createDapCallbackWithHttpInfo(dmmId, dapId, createDapCallbackPayload);
    }

    /**
     * Create DAP callback
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of the availability machine (required)
     * @param dapId ID of the DAP (required)
     * @param createDapCallbackPayload  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> createDapCallbackWithHttpInfo(UUID dmmId, UUID dapId, CreateDapCallbackPayload createDapCallbackPayload) throws RestClientException {
        Object postBody = createDapCallbackPayload;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createDapCallback");
        }
        
        // verify the required parameter 'dapId' is set
        if (dapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dapId' when calling createDapCallback");
        }
        
        // verify the required parameter 'createDapCallbackPayload' is set
        if (createDapCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDapCallbackPayload' when calling createDapCallback");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dapId", dapId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/access-policies/{dapId}/callback/create", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a new Access Policy for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param createDapPayload  (required)
     * @return TessellDapServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapServiceDTO createDmmAvailabilityPolicy(UUID id, CreateDapPayload createDapPayload) throws RestClientException {
        return createDmmAvailabilityPolicyWithHttpInfo(id, createDapPayload).getBody();
    }

    /**
     * Create a new Access Policy for an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param createDapPayload  (required)
     * @return ResponseEntity&lt;TessellDapServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapServiceDTO> createDmmAvailabilityPolicyWithHttpInfo(UUID id, CreateDapPayload createDapPayload) throws RestClientException {
        Object postBody = createDapPayload;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling createDmmAvailabilityPolicy");
        }
        
        // verify the required parameter 'createDapPayload' is set
        if (createDapPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'createDapPayload' when calling createDmmAvailabilityPolicy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/access-policies", uriVariables);

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

    ParameterizedTypeReference<TessellDapServiceDTO> returnType = new ParameterizedTypeReference<TessellDapServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Data Access Policy (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDmmAvailabilityPolicy(UUID availabilityMachineId, UUID accessPolicyId) throws RestClientException {
        return deleteDmmAvailabilityPolicyWithHttpInfo(availabilityMachineId, accessPolicyId).getBody();
    }

    /**
     * Delete an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Data Access Policy (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDmmAvailabilityPolicyWithHttpInfo(UUID availabilityMachineId, UUID accessPolicyId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling deleteDmmAvailabilityPolicy");
        }
        
        // verify the required parameter 'accessPolicyId' is set
        if (accessPolicyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessPolicyId' when calling deleteDmmAvailabilityPolicy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("accessPolicyId", accessPolicyId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId}", uriVariables);

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
     * View details about a Tessell DAP Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDapCatalog
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapCatalog getDapCatalog(UUID dmmId, UUID dapId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        return getDapCatalogWithHttpInfo(dmmId, dapId, continuous, discrete, manual, automated, timeZone).getBody();
    }

    /**
     * View details about a Tessell DAP Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDapCatalog&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapCatalog> getDapCatalogWithHttpInfo(UUID dmmId, UUID dapId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDapCatalog");
        }
        
        // verify the required parameter 'dapId' is set
        if (dapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dapId' when calling getDapCatalog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dapId", dapId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-policies/{dapId}/catalog", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "continuous", continuous));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discrete", discrete));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
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

    ParameterizedTypeReference<TessellDapCatalog> returnType = new ParameterizedTypeReference<TessellDapCatalog>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View details about a Tessell Dap Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param accessPolicyId Id of the Data Access Policy (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDapCatalogServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapCatalogServiceView getDapCatalogServiceView(UUID availabilityMachineId, UUID accessPolicyId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        return getDapCatalogServiceViewWithHttpInfo(availabilityMachineId, accessPolicyId, continuous, discrete, manual, automated, timeZone).getBody();
    }

    /**
     * View details about a Tessell Dap Catalog
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId Id of the Availability Machine (required)
     * @param accessPolicyId Id of the Data Access Policy (required)
     * @param continuous continuous (optional, default to true)
     * @param discrete discrete (optional, default to true)
     * @param manual manual (optional, default to true)
     * @param automated automated (optional, default to true)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDapCatalogServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapCatalogServiceView> getDapCatalogServiceViewWithHttpInfo(UUID availabilityMachineId, UUID accessPolicyId, Boolean continuous, Boolean discrete, Boolean manual, Boolean automated, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getDapCatalogServiceView");
        }
        
        // verify the required parameter 'accessPolicyId' is set
        if (accessPolicyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessPolicyId' when calling getDapCatalogServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("accessPolicyId", accessPolicyId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId}/catalog", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "continuous", continuous));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "discrete", discrete));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "manual", manual));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "automated", automated));
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

    ParameterizedTypeReference<TessellDapCatalogServiceView> returnType = new ParameterizedTypeReference<TessellDapCatalogServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to get availability policies for Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param name DAP name (optional)
     * @param types Dap Content Types (optional)
     * @param statuses DAP status to filter upon (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDapsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDapsApiResponse getDmmAvailabilityPolicies(UUID dmmId, String name, List<String> types, List<DapStatus> statuses, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDmmAvailabilityPoliciesWithHttpInfo(dmmId, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Request to get availability policies for Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param name DAP name (optional)
     * @param types Dap Content Types (optional)
     * @param statuses DAP status to filter upon (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDapsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDapsApiResponse> getDmmAvailabilityPoliciesWithHttpInfo(UUID dmmId, String name, List<String> types, List<DapStatus> statuses, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDmmAvailabilityPolicies");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-policies", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
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

    ParameterizedTypeReference<GetDapsApiResponse> returnType = new ParameterizedTypeReference<GetDapsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get list of Access Policies (DAP) that are associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param name Filter the result based on Access Policy name (optional)
     * @param types Filter the result based on Access Policy type (optional)
     * @param statuses DAP status to filter upon (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDmmAvailabilityPoliciesServiceView
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDmmAvailabilityPoliciesServiceView getDmmAvailabilityPoliciesServiceView(UUID id, String name, List<String> types, List<DapStatus> statuses, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDmmAvailabilityPoliciesServiceViewWithHttpInfo(id, name, types, statuses, loadAcls, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * Get list of Access Policies (DAP) that are associated with an Availability Machine
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id ID of the Availability Machine (required)
     * @param name Filter the result based on Access Policy name (optional)
     * @param types Filter the result based on Access Policy type (optional)
     * @param statuses DAP status to filter upon (optional)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDmmAvailabilityPoliciesServiceView&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDmmAvailabilityPoliciesServiceView> getDmmAvailabilityPoliciesServiceViewWithHttpInfo(UUID id, String name, List<String> types, List<DapStatus> statuses, Boolean loadAcls, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getDmmAvailabilityPoliciesServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/availability-machines/{id}/access-policies", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "types", types));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "statuses", statuses));
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

    ParameterizedTypeReference<GetDmmAvailabilityPoliciesServiceView> returnType = new ParameterizedTypeReference<GetDmmAvailabilityPoliciesServiceView>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to get an availability policy for Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDapDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapDTO getDmmAvailabilityPolicy(UUID dmmId, UUID dapId, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDmmAvailabilityPolicyWithHttpInfo(dmmId, dapId, loadAcls, timeZone).getBody();
    }

    /**
     * Request to get an availability policy for Data Management Machines
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDapDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapDTO> getDmmAvailabilityPolicyWithHttpInfo(UUID dmmId, UUID dapId, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDmmAvailabilityPolicy");
        }
        
        // verify the required parameter 'dapId' is set
        if (dapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dapId' when calling getDmmAvailabilityPolicy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dapId", dapId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-policies/{dapId}", uriVariables);

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

    ParameterizedTypeReference<TessellDapDTO> returnType = new ParameterizedTypeReference<TessellDapDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get details about an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Access Policy (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDapServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapServiceDTO getDmmAvailabilityPolicyServiceView(UUID availabilityMachineId, UUID accessPolicyId, Boolean loadAcls, String timeZone) throws RestClientException {
        return getDmmAvailabilityPolicyServiceViewWithHttpInfo(availabilityMachineId, accessPolicyId, loadAcls, timeZone).getBody();
    }

    /**
     * Get details about an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Access Policy (required)
     * @param loadAcls Load ACL information (optional, default to false)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDapServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapServiceDTO> getDmmAvailabilityPolicyServiceViewWithHttpInfo(UUID availabilityMachineId, UUID accessPolicyId, Boolean loadAcls, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling getDmmAvailabilityPolicyServiceView");
        }
        
        // verify the required parameter 'accessPolicyId' is set
        if (accessPolicyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessPolicyId' when calling getDmmAvailabilityPolicyServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("accessPolicyId", accessPolicyId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId}", uriVariables);

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

    ParameterizedTypeReference<TessellDapServiceDTO> returnType = new ParameterizedTypeReference<TessellDapServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to update an availability policy for Availability machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param tessellDapDTO  (required)
     * @return TessellDapDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapDTO updateDmmAvailabilityPolicy(UUID dmmId, UUID dapId, TessellDapDTO tessellDapDTO) throws RestClientException {
        return updateDmmAvailabilityPolicyWithHttpInfo(dmmId, dapId, tessellDapDTO).getBody();
    }

    /**
     * Request to update an availability policy for Availability machine
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dapId dapId (required)
     * @param tessellDapDTO  (required)
     * @return ResponseEntity&lt;TessellDapDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapDTO> updateDmmAvailabilityPolicyWithHttpInfo(UUID dmmId, UUID dapId, TessellDapDTO tessellDapDTO) throws RestClientException {
        Object postBody = tessellDapDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateDmmAvailabilityPolicy");
        }
        
        // verify the required parameter 'dapId' is set
        if (dapId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dapId' when calling updateDmmAvailabilityPolicy");
        }
        
        // verify the required parameter 'tessellDapDTO' is set
        if (tessellDapDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDapDTO' when calling updateDmmAvailabilityPolicy");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dapId", dapId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-policies/{dapId}", uriVariables);

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

    ParameterizedTypeReference<TessellDapDTO> returnType = new ParameterizedTypeReference<TessellDapDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Access Policy (required)
     * @param updateDapPayload  (required)
     * @return TessellDapServiceDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDapServiceDTO updateDmmAvailabilityPolicyServiceView(UUID availabilityMachineId, UUID accessPolicyId, UpdateDapPayload updateDapPayload) throws RestClientException {
        return updateDmmAvailabilityPolicyServiceViewWithHttpInfo(availabilityMachineId, accessPolicyId, updateDapPayload).getBody();
    }

    /**
     * Update an Access Policy
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param availabilityMachineId ID of the Availability Machine (required)
     * @param accessPolicyId ID of the Access Policy (required)
     * @param updateDapPayload  (required)
     * @return ResponseEntity&lt;TessellDapServiceDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDapServiceDTO> updateDmmAvailabilityPolicyServiceViewWithHttpInfo(UUID availabilityMachineId, UUID accessPolicyId, UpdateDapPayload updateDapPayload) throws RestClientException {
        Object postBody = updateDapPayload;
        
        // verify the required parameter 'availabilityMachineId' is set
        if (availabilityMachineId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'availabilityMachineId' when calling updateDmmAvailabilityPolicyServiceView");
        }
        
        // verify the required parameter 'accessPolicyId' is set
        if (accessPolicyId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'accessPolicyId' when calling updateDmmAvailabilityPolicyServiceView");
        }
        
        // verify the required parameter 'updateDapPayload' is set
        if (updateDapPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateDapPayload' when calling updateDmmAvailabilityPolicyServiceView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("availabilityMachineId", availabilityMachineId);
        uriVariables.put("accessPolicyId", accessPolicyId);
        String path = apiClient.expandPath("/availability-machines/{availabilityMachineId}/access-policies/{accessPolicyId}", uriVariables);

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

    ParameterizedTypeReference<TessellDapServiceDTO> returnType = new ParameterizedTypeReference<TessellDapServiceDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
