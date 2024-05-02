package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorDTO;
import com.tessell.gov.client.model.TessellApiResponseDTO;
import com.tessell.gov.client.model.TessellConsumerTypeDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@Component("com.tessell.gov.client.api.TessellAvailabilityZoneControllerApi")
public class TessellAvailabilityZoneControllerApi {
    private ApiClient apiClient;

    public TessellAvailabilityZoneControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellAvailabilityZoneControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of enabled availability zones in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param name name (optional)
     * @param cloudId cloudId (optional)
     * @param regionId regionId (optional)
     * @param pageSize pageSize (optional, default to 10)
     * @param pageOffset pageOffset (optional, default to 0)
     * @param timezone timezone (optional)
     * @param consumerType consumer-type (optional)
     * @return TessellApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiResponseDTO getAvailabilityZones(String id, String name, UUID cloudId, UUID regionId, Integer pageSize, Integer pageOffset, String timezone, TessellConsumerTypeDTO consumerType) throws RestClientException {
        return getAvailabilityZonesWithHttpInfo(id, name, cloudId, regionId, pageSize, pageOffset, timezone, consumerType).getBody();
    }

    /**
     * Get a list of enabled availability zones in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id id (optional)
     * @param name name (optional)
     * @param cloudId cloudId (optional)
     * @param regionId regionId (optional)
     * @param pageSize pageSize (optional, default to 10)
     * @param pageOffset pageOffset (optional, default to 0)
     * @param timezone timezone (optional)
     * @param consumerType consumer-type (optional)
     * @return ResponseEntity&lt;TessellApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiResponseDTO> getAvailabilityZonesWithHttpInfo(String id, String name, UUID cloudId, UUID regionId, Integer pageSize, Integer pageOffset, String timezone, TessellConsumerTypeDTO consumerType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/availability-zones", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudId", cloudId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "regionId", regionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageSize", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "pageOffset", pageOffset));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timezone", timezone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "consumer-type", consumerType));

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

    ParameterizedTypeReference<TessellApiResponseDTO> returnType = new ParameterizedTypeReference<TessellApiResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
