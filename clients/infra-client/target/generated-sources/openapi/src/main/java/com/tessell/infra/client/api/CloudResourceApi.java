package com.tessell.infra.client.api;

import com.tessell.infra.client.invoker.ApiClient;

import com.tessell.infra.client.model.ApiErrorOps;
import com.tessell.infra.client.model.DnsRecordUpdatePayload;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:55.674992+05:30[Asia/Kolkata]")
@Component("com.tessell.infra.client.api.CloudResourceApi")
public class CloudResourceApi {
    private ApiClient apiClient;

    public CloudResourceApi() {
        this(new ApiClient());
    }

    @Autowired
    public CloudResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Updates DNS record for AWS/Azure DNS solutions
     * 
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param dnsRecordUpdatePayload Task Workflow variable request (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void updateDnsRecord(DnsRecordUpdatePayload dnsRecordUpdatePayload) throws RestClientException {
        updateDnsRecordWithHttpInfo(dnsRecordUpdatePayload);
    }

    /**
     * Updates DNS record for AWS/Azure DNS solutions
     * 
     * <p><b>200</b> - 200 response
     * <p><b>0</b> - API error response
     * @param dnsRecordUpdatePayload Task Workflow variable request (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> updateDnsRecordWithHttpInfo(DnsRecordUpdatePayload dnsRecordUpdatePayload) throws RestClientException {
        Object postBody = dnsRecordUpdatePayload;
        
        // verify the required parameter 'dnsRecordUpdatePayload' is set
        if (dnsRecordUpdatePayload == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'dnsRecordUpdatePayload' when calling updateDnsRecord");
        }
        
        String path = apiClient.expandPath("/tessell-ops/infra/dns-update", Collections.<String, Object>emptyMap());

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
}
