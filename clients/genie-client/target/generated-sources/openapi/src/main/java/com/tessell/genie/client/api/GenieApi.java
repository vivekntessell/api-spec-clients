package com.tessell.genie.client.api;

import com.tessell.genie.client.invoker.ApiClient;

import com.tessell.genie.client.model.ApiError;
import com.tessell.genie.client.model.ApiErrorOps;
import java.io.File;
import com.tessell.genie.client.model.GenieDisablePayload;
import com.tessell.genie.client.model.GenieEnablePayload;
import com.tessell.genie.client.model.GenieRequestPatch;
import com.tessell.genie.client.model.GenieRequestPayload;
import com.tessell.genie.client.model.GenieResendOTP;
import com.tessell.genie.client.model.GenieResponse;
import com.tessell.genie.client.model.UpdateConnectivityCallbackPayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:49.034198+05:30[Asia/Kolkata]")
@Component("com.tessell.genie.client.api.GenieApi")
public class GenieApi {
    private ApiClient apiClient;

    public GenieApi() {
        this(new ApiClient());
    }

    @Autowired
    public GenieApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get status for a specific Genie request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse checkRequestStatus(String requestId) throws RestClientException {
        return checkRequestStatusWithHttpInfo(requestId).getBody();
    }

    /**
     * Get status for a specific Genie request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> checkRequestStatusWithHttpInfo(String requestId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/status", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestId", requestId));

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get status for a specific Genie request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse checkRequestStatusOps(String requestId) throws RestClientException {
        return checkRequestStatusOpsWithHttpInfo(requestId).getBody();
    }

    /**
     * Get status for a specific Genie request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> checkRequestStatusOpsWithHttpInfo(String requestId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/status", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestId", requestId));

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Disable Genie for a specific database system
     * Disable Genie for a specific database system
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param genieDisablePayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse disableGenie(GenieDisablePayload genieDisablePayload) throws RestClientException {
        return disableGenieWithHttpInfo(genieDisablePayload).getBody();
    }

    /**
     * Disable Genie for a specific database system
     * Disable Genie for a specific database system
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param genieDisablePayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> disableGenieWithHttpInfo(GenieDisablePayload genieDisablePayload) throws RestClientException {
        Object postBody = genieDisablePayload;
        
        String path = apiClient.expandPath("/disable", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Disable Genie for a specific database system
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param genieDisablePayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse disableGenieOps(GenieDisablePayload genieDisablePayload) throws RestClientException {
        return disableGenieOpsWithHttpInfo(genieDisablePayload).getBody();
    }

    /**
     * Disable Genie for a specific database system
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param genieDisablePayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> disableGenieOpsWithHttpInfo(GenieDisablePayload genieDisablePayload) throws RestClientException {
        Object postBody = genieDisablePayload;
        
        String path = apiClient.expandPath("/tessell-ops/disable", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Downloads connection details
     * Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File downloadGenieConnectionDetails(String requestId, String computeResourceId) throws RestClientException {
        return downloadGenieConnectionDetailsWithHttpInfo(requestId, computeResourceId).getBody();
    }

    /**
     * Downloads connection details
     * Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> downloadGenieConnectionDetailsWithHttpInfo(String requestId, String computeResourceId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/download/connection-details", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestId", requestId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "computeResourceId", computeResourceId));

        final String[] localVarAccepts = { 
            "application/zip", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File downloadGenieConnectionDetailsOps(String requestId, String computeResourceId) throws RestClientException {
        return downloadGenieConnectionDetailsOpsWithHttpInfo(requestId, computeResourceId).getBody();
    }

    /**
     * Download all the relevant details required for establishing the Genie connection to the VMs of a specific DB Service.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param requestId Request ID of the Genie request (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return ResponseEntity&lt;File&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<File> downloadGenieConnectionDetailsOpsWithHttpInfo(String requestId, String computeResourceId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/download/connection-details", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestId", requestId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "computeResourceId", computeResourceId));

        final String[] localVarAccepts = { 
            "application/zip", "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enable Genie for a specific database system
     * Enables Genie for a specific database system
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieEnablePayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse enableGenie(String tenantId, GenieEnablePayload genieEnablePayload) throws RestClientException {
        return enableGenieWithHttpInfo(tenantId, genieEnablePayload).getBody();
    }

    /**
     * Enable Genie for a specific database system
     * Enables Genie for a specific database system
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieEnablePayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> enableGenieWithHttpInfo(String tenantId, GenieEnablePayload genieEnablePayload) throws RestClientException {
        Object postBody = genieEnablePayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling enableGenie");
        }
        
        String path = apiClient.expandPath("/enable", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enable Genie for a specific database system Ops API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieEnablePayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse enableGenieOps(String tenantId, GenieEnablePayload genieEnablePayload) throws RestClientException {
        return enableGenieOpsWithHttpInfo(tenantId, genieEnablePayload).getBody();
    }

    /**
     * Enable Genie for a specific database system Ops API
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieEnablePayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> enableGenieOpsWithHttpInfo(String tenantId, GenieEnablePayload genieEnablePayload) throws RestClientException {
        Object postBody = genieEnablePayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling enableGenieOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/enable", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Extend Genie expiry time
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPatch  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse extendCurrentGenieRequest(String tenantId, GenieRequestPatch genieRequestPatch) throws RestClientException {
        return extendCurrentGenieRequestWithHttpInfo(tenantId, genieRequestPatch).getBody();
    }

    /**
     * Extend Genie expiry time
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPatch  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> extendCurrentGenieRequestWithHttpInfo(String tenantId, GenieRequestPatch genieRequestPatch) throws RestClientException {
        Object postBody = genieRequestPatch;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling extendCurrentGenieRequest");
        }
        
        String path = apiClient.expandPath("/extend", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Extend Genie expiry time Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPatch  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse extendCurrentGenieRequestOps(String tenantId, GenieRequestPatch genieRequestPatch) throws RestClientException {
        return extendCurrentGenieRequestOpsWithHttpInfo(tenantId, genieRequestPatch).getBody();
    }

    /**
     * Extend Genie expiry time Ops
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPatch  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> extendCurrentGenieRequestOpsWithHttpInfo(String tenantId, GenieRequestPatch genieRequestPatch) throws RestClientException {
        Object postBody = genieRequestPatch;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling extendCurrentGenieRequestOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/extend", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id for which the Genie Access request is in context (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return List&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenieResponse> getAllRequests(String serviceId, String computeResourceId) throws RestClientException {
        return getAllRequestsWithHttpInfo(serviceId, computeResourceId).getBody();
    }

    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id for which the Genie Access request is in context (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return ResponseEntity&lt;List&lt;GenieResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenieResponse>> getAllRequestsWithHttpInfo(String serviceId, String computeResourceId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/request-access", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceId", serviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "computeResourceId", computeResourceId));

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

    ParameterizedTypeReference<List<GenieResponse>> returnType = new ParameterizedTypeReference<List<GenieResponse>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id for which the Genie Access request is in context (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return List&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenieResponse> getAllRequestsOps(String serviceId, String computeResourceId) throws RestClientException {
        return getAllRequestsOpsWithHttpInfo(serviceId, computeResourceId).getBody();
    }

    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param serviceId DB Service Id for which the Genie Access request is in context (optional)
     * @param computeResourceId Compute Resource Id for which the Genie Access request is in context (optional)
     * @return ResponseEntity&lt;List&lt;GenieResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenieResponse>> getAllRequestsOpsWithHttpInfo(String serviceId, String computeResourceId) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/request-access", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "serviceId", serviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "computeResourceId", computeResourceId));

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

    ParameterizedTypeReference<List<GenieResponse>> returnType = new ParameterizedTypeReference<List<GenieResponse>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse requestAccess(String tenantId, GenieRequestPayload genieRequestPayload) throws RestClientException {
        return requestAccessWithHttpInfo(tenantId, genieRequestPayload).getBody();
    }

    /**
     * Request access to VMs of a specific ÐB_SERVICE
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> requestAccessWithHttpInfo(String tenantId, GenieRequestPayload genieRequestPayload) throws RestClientException {
        Object postBody = genieRequestPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling requestAccess");
        }
        
        String path = apiClient.expandPath("/request-access", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Request access to VMs of a specific ÐB_SERVICE Ops API
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPayload  (optional)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse requestAccessOps(String tenantId, GenieRequestPayload genieRequestPayload) throws RestClientException {
        return requestAccessOpsWithHttpInfo(tenantId, genieRequestPayload).getBody();
    }

    /**
     * Request access to VMs of a specific ÐB_SERVICE Ops API
     * Request access to VMs of a specific ÐB_SERVICE
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param genieRequestPayload  (optional)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> requestAccessOpsWithHttpInfo(String tenantId, GenieRequestPayload genieRequestPayload) throws RestClientException {
        Object postBody = genieRequestPayload;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling requestAccessOps");
        }
        
        String path = apiClient.expandPath("/tessell-ops/request-access", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * resend OTP
     * 
     * <p><b>200</b>
     * <p><b>0</b> - API error response
     * @param genieResendOTP  (optional)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void resendOTP(GenieResendOTP genieResendOTP) throws RestClientException {
        resendOTPWithHttpInfo(genieResendOTP);
    }

    /**
     * resend OTP
     * 
     * <p><b>200</b>
     * <p><b>0</b> - API error response
     * @param genieResendOTP  (optional)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> resendOTPWithHttpInfo(GenieResendOTP genieResendOTP) throws RestClientException {
        Object postBody = genieResendOTP;
        
        String path = apiClient.expandPath("/tessell-ops/resendOTP", Collections.<String, Object>emptyMap());

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
     * RevokeActiveGenieRequests
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return List&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<GenieResponse> revokeActiveGenieRequests() throws RestClientException {
        return revokeActiveGenieRequestsWithHttpInfo().getBody();
    }

    /**
     * RevokeActiveGenieRequests
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;List&lt;GenieResponse&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<GenieResponse>> revokeActiveGenieRequestsWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/bulk-revoke", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<GenieResponse>> returnType = new ParameterizedTypeReference<List<GenieResponse>>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Update Genie status for ongoing request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param updateConnectivityCallbackPayload  (required)
     * @return GenieResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenieResponse updateConnectivityCallback(UpdateConnectivityCallbackPayload updateConnectivityCallbackPayload) throws RestClientException {
        return updateConnectivityCallbackWithHttpInfo(updateConnectivityCallbackPayload).getBody();
    }

    /**
     * Update Genie status for ongoing request
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param updateConnectivityCallbackPayload  (required)
     * @return ResponseEntity&lt;GenieResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenieResponse> updateConnectivityCallbackWithHttpInfo(UpdateConnectivityCallbackPayload updateConnectivityCallbackPayload) throws RestClientException {
        Object postBody = updateConnectivityCallbackPayload;
        
        // verify the required parameter 'updateConnectivityCallbackPayload' is set
        if (updateConnectivityCallbackPayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'updateConnectivityCallbackPayload' when calling updateConnectivityCallback");
        }
        
        String path = apiClient.expandPath("/tessell-ops/update-connectivity/callback", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<GenieResponse> returnType = new ParameterizedTypeReference<GenieResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
