package com.tessell.gov.client.api;

import com.tessell.gov.client.invoker.ApiClient;

import com.tessell.gov.client.model.TessellApiErrorDTO;
import com.tessell.gov.client.model.TessellApiResponseDTO;

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
@Component("com.tessell.gov.client.api.TessellCloudLocationControllerApi")
public class TessellCloudLocationControllerApi {
    private ApiClient apiClient;

    public TessellCloudLocationControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellCloudLocationControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get a list of all enabled cloud locations in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Cloud location identifier of type cloudType/region/az (region, az - optional) (optional)
     * @param cloudType Cloud Type (optional)
     * @param region Cloud Region (optional)
     * @param az Availability Zone (optional)
     * @param all Get all records (default &#x3D; false) (optional, default to false)
     * @param includeDisabled Flag to decide whether to include disabled cloud locations in response. (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellApiResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiResponseDTO getCloudLocations(String id, String cloudType, String region, String az, Boolean all, Boolean includeDisabled, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getCloudLocationsWithHttpInfo(id, cloudType, region, az, all, includeDisabled, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of all enabled cloud locations in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Cloud location identifier of type cloudType/region/az (region, az - optional) (optional)
     * @param cloudType Cloud Type (optional)
     * @param region Cloud Region (optional)
     * @param az Availability Zone (optional)
     * @param all Get all records (default &#x3D; false) (optional, default to false)
     * @param includeDisabled Flag to decide whether to include disabled cloud locations in response. (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellApiResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiResponseDTO> getCloudLocationsWithHttpInfo(String id, String cloudType, String region, String az, Boolean all, Boolean includeDisabled, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/cloud-locations", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "id", id));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "az", az));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "all", all));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-disabled", includeDisabled));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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
