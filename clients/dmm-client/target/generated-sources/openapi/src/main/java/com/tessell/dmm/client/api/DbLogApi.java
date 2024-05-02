package com.tessell.dmm.client.api;

import com.tessell.dmm.client.invoker.ApiClient;

import com.tessell.dmm.client.model.ApiErrorOps;
import com.tessell.dmm.client.model.ApiStatus;
import com.tessell.dmm.client.model.DbLogStatus;
import com.tessell.dmm.client.model.GetDbLogsApiResponse;
import com.tessell.dmm.client.model.TessellDbLogDTO;
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
@Component("com.tessell.dmm.client.api.DbLogApi")
public class DbLogApi {
    private ApiClient apiClient;

    public DbLogApi() {
        this(new ApiClient());
    }

    @Autowired
    public DbLogApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Request to create a new Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDbLogDTO  (required)
     * @return TessellDbLogDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbLogDTO createDbLog(UUID dmmId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        return createDbLogWithHttpInfo(dmmId, tessellDbLogDTO).getBody();
    }

    /**
     * Request to create a new Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDbLogDTO  (required)
     * @return ResponseEntity&lt;TessellDbLogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbLogDTO> createDbLogWithHttpInfo(UUID dmmId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        Object postBody = tessellDbLogDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createDbLog");
        }
        
        // verify the required parameter 'tessellDbLogDTO' is set
        if (tessellDbLogDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDbLogDTO' when calling createDbLog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/db-logs", uriVariables);

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

    ParameterizedTypeReference<TessellDbLogDTO> returnType = new ParameterizedTypeReference<TessellDbLogDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request to create a new Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDbLogDTO  (required)
     * @return TessellDbLogDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbLogDTO createDbLog_0(UUID dmmId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        return createDbLog_0WithHttpInfo(dmmId, tessellDbLogDTO).getBody();
    }

    /**
     * Request to create a new Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param tessellDbLogDTO  (required)
     * @return ResponseEntity&lt;TessellDbLogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbLogDTO> createDbLog_0WithHttpInfo(UUID dmmId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        Object postBody = tessellDbLogDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling createDbLog_0");
        }
        
        // verify the required parameter 'tessellDbLogDTO' is set
        if (tessellDbLogDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDbLogDTO' when calling createDbLog_0");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-machine/db-logs", uriVariables);

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

    ParameterizedTypeReference<TessellDbLogDTO> returnType = new ParameterizedTypeReference<TessellDbLogDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @return ApiStatus
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ApiStatus deleteDbLog(UUID dmmId, UUID dbLogId) throws RestClientException {
        return deleteDbLogWithHttpInfo(dmmId, dbLogId).getBody();
    }

    /**
     * Delete a Tessell Database Backup
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @return ResponseEntity&lt;ApiStatus&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ApiStatus> deleteDbLogWithHttpInfo(UUID dmmId, UUID dbLogId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling deleteDbLog");
        }
        
        // verify the required parameter 'dbLogId' is set
        if (dbLogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbLogId' when calling deleteDbLog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dbLogId", dbLogId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/db-logs/{dbLogId}", uriVariables);

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
     * View details about a Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return TessellDbLogDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbLogDTO getDbLog(UUID dmmId, UUID dbLogId, Boolean lightWeight, String timeZone) throws RestClientException {
        return getDbLogWithHttpInfo(dmmId, dbLogId, lightWeight, timeZone).getBody();
    }

    /**
     * View details about a Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;TessellDbLogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbLogDTO> getDbLogWithHttpInfo(UUID dmmId, UUID dbLogId, Boolean lightWeight, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbLog");
        }
        
        // verify the required parameter 'dbLogId' is set
        if (dbLogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbLogId' when calling getDbLog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dbLogId", dbLogId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/db-logs/{dbLogId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "light-weight", lightWeight));
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

    ParameterizedTypeReference<TessellDbLogDTO> returnType = new ParameterizedTypeReference<TessellDbLogDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Database Logs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param status status (optional)
     * @param rangeFromTime range-from-time (optional)
     * @param rangeToTime range-to-time (optional)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param dapBased Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  (optional)
     * @param dapId Data access policy id to filter the results upon. (optional)
     * @param cloudLocation Cloud-location of the resource (optional)
     * @param storageId  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDbLogsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDbLogsApiResponse getDbLogs(UUID dmmId, List<DbLogStatus> status, String rangeFromTime, String rangeToTime, Boolean lightWeight, Boolean dapBased, UUID dapId, String cloudLocation, UUID storageId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbLogsWithHttpInfo(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Database Logs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param status status (optional)
     * @param rangeFromTime range-from-time (optional)
     * @param rangeToTime range-to-time (optional)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param dapBased Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  (optional)
     * @param dapId Data access policy id to filter the results upon. (optional)
     * @param cloudLocation Cloud-location of the resource (optional)
     * @param storageId  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDbLogsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDbLogsApiResponse> getDbLogsWithHttpInfo(UUID dmmId, List<DbLogStatus> status, String rangeFromTime, String rangeToTime, Boolean lightWeight, Boolean dapBased, UUID dapId, String cloudLocation, UUID storageId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbLogs");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/db-logs", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "range-from-time", rangeFromTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "range-to-time", rangeToTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "light-weight", lightWeight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dap-based", dapBased));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dap-id", dapId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "storage-id", storageId));
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

    ParameterizedTypeReference<GetDbLogsApiResponse> returnType = new ParameterizedTypeReference<GetDbLogsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of Tessell Database Logs for given filter
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status status (required)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDbLogsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDbLogsApiResponse getDbLogsByFilter(List<DbLogStatus> status, Boolean lightWeight, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbLogsByFilterWithHttpInfo(status, lightWeight, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of Tessell Database Logs for given filter
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param status status (required)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional, default to true)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDbLogsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDbLogsApiResponse> getDbLogsByFilterWithHttpInfo(List<DbLogStatus> status, Boolean lightWeight, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'status' is set
        if (status == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'status' when calling getDbLogsByFilter");
        }
        
        String path = apiClient.expandPath("/tessell-ops/dmms/db-logs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "light-weight", lightWeight));
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

    ParameterizedTypeReference<GetDbLogsApiResponse> returnType = new ParameterizedTypeReference<GetDbLogsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * View a list of available Tessell Database Logs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param status status (optional)
     * @param rangeFromTime range-from-time (optional)
     * @param rangeToTime range-to-time (optional)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param dapBased Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  (optional)
     * @param dapId Data access policy id to filter the results upon. (optional)
     * @param cloudLocation Cloud-location of the resource (optional)
     * @param storageId  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return GetDbLogsApiResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetDbLogsApiResponse getDbLogs_0(UUID dmmId, List<DbLogStatus> status, String rangeFromTime, String rangeToTime, Boolean lightWeight, Boolean dapBased, UUID dapId, String cloudLocation, UUID storageId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        return getDbLogs_0WithHttpInfo(dmmId, status, rangeFromTime, rangeToTime, lightWeight, dapBased, dapId, cloudLocation, storageId, pageSize, pageOffset, timeZone).getBody();
    }

    /**
     * View a list of available Tessell Database Logs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param status status (optional)
     * @param rangeFromTime range-from-time (optional)
     * @param rangeToTime range-to-time (optional)
     * @param lightWeight If set to true, plugin related fields like driverInfo/metadata won&#39;t be returned. (optional)
     * @param dapBased Whether to fetch resources associated with a data access policy (DAP). If null, both dap-based/not-dap-based resources would be null, if true/false, only  dap-based/non-dap-based would be returned.  (optional)
     * @param dapId Data access policy id to filter the results upon. (optional)
     * @param cloudLocation Cloud-location of the resource (optional)
     * @param storageId  (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @param timeZone Timezone for return data (optional, default to UTC)
     * @return ResponseEntity&lt;GetDbLogsApiResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetDbLogsApiResponse> getDbLogs_0WithHttpInfo(UUID dmmId, List<DbLogStatus> status, String rangeFromTime, String rangeToTime, Boolean lightWeight, Boolean dapBased, UUID dapId, String cloudLocation, UUID storageId, Integer pageSize, Integer pageOffset, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling getDbLogs_0");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/availability-machine/db-logs", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("multi".toUpperCase(Locale.ROOT)), "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "range-from-time", rangeFromTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "range-to-time", rangeToTime));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "light-weight", lightWeight));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dap-based", dapBased));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dap-id", dapId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-location", cloudLocation));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "storage-id", storageId));
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

    ParameterizedTypeReference<GetDbLogsApiResponse> returnType = new ParameterizedTypeReference<GetDbLogsApiResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update a Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @param tessellDbLogDTO  (required)
     * @return TessellDbLogDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDbLogDTO updateDbLog(UUID dmmId, UUID dbLogId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        return updateDbLogWithHttpInfo(dmmId, dbLogId, tessellDbLogDTO).getBody();
    }

    /**
     * Update a Tessell Database Log
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param dmmId ID of Availability machine (required)
     * @param dbLogId dbLogId (required)
     * @param tessellDbLogDTO  (required)
     * @return ResponseEntity&lt;TessellDbLogDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDbLogDTO> updateDbLogWithHttpInfo(UUID dmmId, UUID dbLogId, TessellDbLogDTO tessellDbLogDTO) throws RestClientException {
        Object postBody = tessellDbLogDTO;
        
        // verify the required parameter 'dmmId' is set
        if (dmmId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dmmId' when calling updateDbLog");
        }
        
        // verify the required parameter 'dbLogId' is set
        if (dbLogId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dbLogId' when calling updateDbLog");
        }
        
        // verify the required parameter 'tessellDbLogDTO' is set
        if (tessellDbLogDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDbLogDTO' when calling updateDbLog");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("dmmId", dmmId);
        uriVariables.put("dbLogId", dbLogId);
        String path = apiClient.expandPath("/tessell-ops/dmms/{dmmId}/db-logs/{dbLogId}", uriVariables);

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

    ParameterizedTypeReference<TessellDbLogDTO> returnType = new ParameterizedTypeReference<TessellDbLogDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
