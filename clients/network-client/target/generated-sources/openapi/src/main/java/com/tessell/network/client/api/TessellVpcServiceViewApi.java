package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellVpcServiceConsumerDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@Component("com.tessell.network.client.api.TessellVpcServiceViewApi")
public class TessellVpcServiceViewApi {
    private ApiClient apiClient;

    public TessellVpcServiceViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcServiceViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get VPC by Name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return TessellVpcServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcServiceConsumerDTO getVpcByName(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return getVpcByNameWithHttpInfo(name, subscriptionName, cloudType, region).getBody();
    }

    /**
     * Get VPC by Name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return ResponseEntity&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcServiceConsumerDTO> getVpcByNameWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getVpcByName");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcByName");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcByName");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/vpcs/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));

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

    ParameterizedTypeReference<TessellVpcServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionName Name of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param includeSubnets Boolean flag to specify if Subnet details are required in response (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellVpcServiceConsumerDTO> getVpcs(String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSubnets, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcsWithHttpInfo(subscriptionName, cloudType, region, includeSubnets, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionName Name of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param includeSubnets Boolean flag to specify if Subnet details are required in response (optional, default to false)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellVpcServiceConsumerDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellVpcServiceConsumerDTO>> getVpcsWithHttpInfo(String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSubnets, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/network/vpcs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-subnets", includeSubnets));
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

    ParameterizedTypeReference<List<TessellVpcServiceConsumerDTO>> returnType = new ParameterizedTypeReference<List<TessellVpcServiceConsumerDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
