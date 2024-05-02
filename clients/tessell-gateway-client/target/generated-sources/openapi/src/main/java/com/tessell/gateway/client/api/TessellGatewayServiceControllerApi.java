package com.tessell.gateway.client.api;

import com.tessell.gateway.client.invoker.ApiClient;

import com.tessell.gateway.client.model.AgentType;
import com.tessell.gateway.client.model.ApiError;
import com.tessell.gateway.client.model.ApiErrorOps;
import com.tessell.gateway.client.model.Command;
import com.tessell.gateway.client.model.CommandStatusResponse;
import com.tessell.gateway.client.model.CurlRequest;
import com.tessell.gateway.client.model.CurlResponse;
import com.tessell.gateway.client.model.GetTessellAgentTokenResponse;
import com.tessell.gateway.client.model.PublishTenantServicesUpgradeRequest;
import com.tessell.gateway.client.model.ReadFileResponse;
import com.tessell.gateway.client.model.RegisterTenantAccountResponse;
import java.util.UUID;
import com.tessell.gateway.client.model.UpgradeLibraryPayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:22.183784+05:30[Asia/Kolkata]")
@Component("com.tessell.gateway.client.api.TessellGatewayServiceControllerApi")
public class TessellGatewayServiceControllerApi {
    private ApiClient apiClient;

    public TessellGatewayServiceControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellGatewayServiceControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Delete stream for Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteTenantStream(UUID tenantId) throws RestClientException {
        deleteTenantStreamWithHttpInfo(tenantId);
    }

    /**
     * Delete stream for Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteTenantStreamWithHttpInfo(UUID tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteTenantStream");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantId", tenantId);
        String path = apiClient.expandPath("/tessell-ops/tenants/{tenantId}/stream", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deregister Account for Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deregisterTenantAccount(UUID tenantId) throws RestClientException {
        deregisterTenantAccountWithHttpInfo(tenantId);
    }

    /**
     * Deregister Account for Tenant
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deregisterTenantAccountWithHttpInfo(UUID tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deregisterTenantAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantId", tenantId);
        String path = apiClient.expandPath("/tessell-ops/tenants/{tenantId}/register", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get the status of a command
     * 
     * <p><b>200</b> - SUCCESS
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param executionId  (required)
     * @return CommandStatusResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CommandStatusResponse getCommandStatus(String taId, String executionId) throws RestClientException {
        return getCommandStatusWithHttpInfo(taId, executionId).getBody();
    }

    /**
     * Get the status of a command
     * 
     * <p><b>200</b> - SUCCESS
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param executionId  (required)
     * @return ResponseEntity&lt;CommandStatusResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CommandStatusResponse> getCommandStatusWithHttpInfo(String taId, String executionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'taId' is set
        if (taId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taId' when calling getCommandStatus");
        }
        
        // verify the required parameter 'executionId' is set
        if (executionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'executionId' when calling getCommandStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taId", taId);
        uriVariables.put("executionId", executionId);
        String path = apiClient.expandPath("/status/{taId}/{executionId}", uriVariables);

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

    ParameterizedTypeReference<CommandStatusResponse> returnType = new ParameterizedTypeReference<CommandStatusResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get the status of a command
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void getTessellAgentStatus(String taId) throws RestClientException {
        getTessellAgentStatusWithHttpInfo(taId);
    }

    /**
     * Get the status of a command
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> getTessellAgentStatusWithHttpInfo(String taId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'taId' is set
        if (taId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taId' when calling getTessellAgentStatus");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taId", taId);
        String path = apiClient.expandPath("/ta-status/{taId}", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Tessell Agent Token
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param agentType  (required)
     * @param tenantId  (required)
     * @return GetTessellAgentTokenResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GetTessellAgentTokenResponse getTessellAgentToken(UUID deploymentId, AgentType agentType, String tenantId) throws RestClientException {
        return getTessellAgentTokenWithHttpInfo(deploymentId, agentType, tenantId).getBody();
    }

    /**
     * Get Tessell Agent Token
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param deploymentId  (required)
     * @param agentType  (required)
     * @param tenantId  (required)
     * @return ResponseEntity&lt;GetTessellAgentTokenResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GetTessellAgentTokenResponse> getTessellAgentTokenWithHttpInfo(UUID deploymentId, AgentType agentType, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'deploymentId' is set
        if (deploymentId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'deploymentId' when calling getTessellAgentToken");
        }
        
        // verify the required parameter 'agentType' is set
        if (agentType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'agentType' when calling getTessellAgentToken");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTessellAgentToken");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("deploymentId", deploymentId);
        String path = apiClient.expandPath("/tessell-ops/agent/{deploymentId}/token", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "agent-type", agentType));

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

    ParameterizedTypeReference<GetTessellAgentTokenResponse> returnType = new ParameterizedTypeReference<GetTessellAgentTokenResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Initialize stream for Tenant
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void initializeTenantStream(UUID tenantId) throws RestClientException {
        initializeTenantStreamWithHttpInfo(tenantId);
    }

    /**
     * Initialize stream for Tenant
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> initializeTenantStreamWithHttpInfo(UUID tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling initializeTenantStream");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantId", tenantId);
        String path = apiClient.expandPath("/tessell-ops/tenants/{tenantId}/stream", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Publish Upgrade message for Tenant Services
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @param publishTenantServicesUpgradeRequest  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void publishTenantServicesUpgrade(UUID tenantId, PublishTenantServicesUpgradeRequest publishTenantServicesUpgradeRequest) throws RestClientException {
        publishTenantServicesUpgradeWithHttpInfo(tenantId, publishTenantServicesUpgradeRequest);
    }

    /**
     * Publish Upgrade message for Tenant Services
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @param publishTenantServicesUpgradeRequest  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> publishTenantServicesUpgradeWithHttpInfo(UUID tenantId, PublishTenantServicesUpgradeRequest publishTenantServicesUpgradeRequest) throws RestClientException {
        Object postBody = publishTenantServicesUpgradeRequest;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling publishTenantServicesUpgrade");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantId", tenantId);
        String path = apiClient.expandPath("/tessell-ops/tenants/{tenantId}/upgrade", uriVariables);

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
     * Read a file from DB VM.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param filePath  (required)
     * @param lineLimit  (optional, default to 200)
     * @param offset  (optional, default to 0)
     * @return ReadFileResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ReadFileResponse readRemoteFile(String taId, String filePath, Integer lineLimit, Integer offset) throws RestClientException {
        return readRemoteFileWithHttpInfo(taId, filePath, lineLimit, offset).getBody();
    }

    /**
     * Read a file from DB VM.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param filePath  (required)
     * @param lineLimit  (optional, default to 200)
     * @param offset  (optional, default to 0)
     * @return ResponseEntity&lt;ReadFileResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<ReadFileResponse> readRemoteFileWithHttpInfo(String taId, String filePath, Integer lineLimit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'taId' is set
        if (taId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taId' when calling readRemoteFile");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'filePath' when calling readRemoteFile");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taId", taId);
        String path = apiClient.expandPath("/read-file/{taId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "filePath", filePath));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "line-limit", lineLimit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

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

    ParameterizedTypeReference<ReadFileResponse> returnType = new ParameterizedTypeReference<ReadFileResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register Account for Tenant
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @return RegisterTenantAccountResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public RegisterTenantAccountResponse registerTenantAccount(UUID tenantId) throws RestClientException {
        return registerTenantAccountWithHttpInfo(tenantId).getBody();
    }

    /**
     * Register Account for Tenant
     * 
     * <p><b>201</b> - Created
     * <p><b>0</b> - API error response
     * @param tenantId  (required)
     * @return ResponseEntity&lt;RegisterTenantAccountResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<RegisterTenantAccountResponse> registerTenantAccountWithHttpInfo(UUID tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling registerTenantAccount");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("tenantId", tenantId);
        String path = apiClient.expandPath("/tessell-ops/tenants/{tenantId}/register", uriVariables);

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

    ParameterizedTypeReference<RegisterTenantAccountResponse> returnType = new ParameterizedTypeReference<RegisterTenantAccountResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Scrape TA for DB metrics.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return List&lt;String&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<String> scrape() throws RestClientException {
        return scrapeWithHttpInfo().getBody();
    }

    /**
     * Scrape TA for DB metrics.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;List&lt;String&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<String>> scrapeWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/scrape", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<String>> returnType = new ParameterizedTypeReference<List<String>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Send a new command to a DB VM.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param command  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sendCommand(Command command) throws RestClientException {
        sendCommandWithHttpInfo(command);
    }

    /**
     * Send a new command to a DB VM.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param command  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sendCommandWithHttpInfo(Command command) throws RestClientException {
        Object postBody = command;
        
        String path = apiClient.expandPath("/command", Collections.<String, Object>emptyMap());

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
     * Send a curl command request to a monitoring VM.
     * 
     * <p><b>200</b> - SUCCESS
     * <p><b>0</b> - API error response
     * @param curlRequest  (optional)
     * @return CurlResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public CurlResponse sendCurlRequest(CurlRequest curlRequest) throws RestClientException {
        return sendCurlRequestWithHttpInfo(curlRequest).getBody();
    }

    /**
     * Send a curl command request to a monitoring VM.
     * 
     * <p><b>200</b> - SUCCESS
     * <p><b>0</b> - API error response
     * @param curlRequest  (optional)
     * @return ResponseEntity&lt;CurlResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<CurlResponse> sendCurlRequestWithHttpInfo(CurlRequest curlRequest) throws RestClientException {
        Object postBody = curlRequest;
        
        String path = apiClient.expandPath("/curl", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<CurlResponse> returnType = new ParameterizedTypeReference<CurlResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Upgrade a library in the vm
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param upgradeLibraryPayload  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void upgradeLibrary(String taId, UpgradeLibraryPayload upgradeLibraryPayload) throws RestClientException {
        upgradeLibraryWithHttpInfo(taId, upgradeLibraryPayload);
    }

    /**
     * Upgrade a library in the vm
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param taId  (required)
     * @param upgradeLibraryPayload  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> upgradeLibraryWithHttpInfo(String taId, UpgradeLibraryPayload upgradeLibraryPayload) throws RestClientException {
        Object postBody = upgradeLibraryPayload;
        
        // verify the required parameter 'taId' is set
        if (taId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'taId' when calling upgradeLibrary");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("taId", taId);
        String path = apiClient.expandPath("/upgrade-library/{taId}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
