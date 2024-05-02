package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellApiErrorDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellCreateVpcPeeringAwsCloudformationPayloadDTO;
import com.tessell.network.client.model.TessellCreateVpcPeeringServiceConsumerPayloadDTO;
import com.tessell.network.client.model.TessellVpcPeeringAwsCloudformationLinkDTO;
import com.tessell.network.client.model.TessellVpcPeeringServiceConsumerDTO;
import com.tessell.network.client.model.TessellVpcPeeringStatusDTO;

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
@Component("com.tessell.network.client.api.TessellVpcPeeringAdminViewApi")
public class TessellVpcPeeringAdminViewApi {
    private ApiClient apiClient;

    public TessellVpcPeeringAdminViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcPeeringAdminViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create a VPC Peering using AWS Cloudformation
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param tessellCreateVpcPeeringAwsCloudformationPayloadDTO VPC Peering Information (required)
     * @return TessellVpcPeeringServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringServiceConsumerDTO createVpcPeeringAwsCloudformation(String vpcName, TessellCreateVpcPeeringAwsCloudformationPayloadDTO tessellCreateVpcPeeringAwsCloudformationPayloadDTO) throws RestClientException {
        return createVpcPeeringAwsCloudformationWithHttpInfo(vpcName, tessellCreateVpcPeeringAwsCloudformationPayloadDTO).getBody();
    }

    /**
     * Create a VPC Peering using AWS Cloudformation
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param tessellCreateVpcPeeringAwsCloudformationPayloadDTO VPC Peering Information (required)
     * @return ResponseEntity&lt;TessellVpcPeeringServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringServiceConsumerDTO> createVpcPeeringAwsCloudformationWithHttpInfo(String vpcName, TessellCreateVpcPeeringAwsCloudformationPayloadDTO tessellCreateVpcPeeringAwsCloudformationPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateVpcPeeringAwsCloudformationPayloadDTO;
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling createVpcPeeringAwsCloudformation");
        }
        
        // verify the required parameter 'tessellCreateVpcPeeringAwsCloudformationPayloadDTO' is set
        if (tessellCreateVpcPeeringAwsCloudformationPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreateVpcPeeringAwsCloudformationPayloadDTO' when calling createVpcPeeringAwsCloudformation");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings/aws-cloudformation", uriVariables);

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

    ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a Peering between VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param tessellCreateVpcPeeringServiceConsumerPayloadDTO VPC Peering Information (required)
     * @return TessellVpcPeeringServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringServiceConsumerDTO createVpcPeeringGovernance(String vpcName, TessellCreateVpcPeeringServiceConsumerPayloadDTO tessellCreateVpcPeeringServiceConsumerPayloadDTO) throws RestClientException {
        return createVpcPeeringGovernanceWithHttpInfo(vpcName, tessellCreateVpcPeeringServiceConsumerPayloadDTO).getBody();
    }

    /**
     * Create a Peering between VPCs
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param tessellCreateVpcPeeringServiceConsumerPayloadDTO VPC Peering Information (required)
     * @return ResponseEntity&lt;TessellVpcPeeringServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringServiceConsumerDTO> createVpcPeeringGovernanceWithHttpInfo(String vpcName, TessellCreateVpcPeeringServiceConsumerPayloadDTO tessellCreateVpcPeeringServiceConsumerPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateVpcPeeringServiceConsumerPayloadDTO;
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling createVpcPeeringGovernance");
        }
        
        // verify the required parameter 'tessellCreateVpcPeeringServiceConsumerPayloadDTO' is set
        if (tessellCreateVpcPeeringServiceConsumerPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreateVpcPeeringServiceConsumerPayloadDTO' when calling createVpcPeeringGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings", uriVariables);

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

    ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete Vpc Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcPeeringGovernance(String name, String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return deleteVpcPeeringGovernanceWithHttpInfo(name, vpcName, subscriptionName, cloudType, region).getBody();
    }

    /**
     * Delete Vpc Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcPeeringGovernanceWithHttpInfo(String name, String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteVpcPeeringGovernance");
        }
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling deleteVpcPeeringGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling deleteVpcPeeringGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling deleteVpcPeeringGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling deleteVpcPeeringGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get VPC Peering by Name for a given VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return TessellVpcPeeringServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringServiceConsumerDTO getVpcPeeringByNameGovernance(String name, String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return getVpcPeeringByNameGovernanceWithHttpInfo(name, vpcName, subscriptionName, cloudType, region).getBody();
    }

    /**
     * Get VPC Peering by Name for a given VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return ResponseEntity&lt;TessellVpcPeeringServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringServiceConsumerDTO> getVpcPeeringByNameGovernanceWithHttpInfo(String name, String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getVpcPeeringByNameGovernance");
        }
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling getVpcPeeringByNameGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcPeeringByNameGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcPeeringByNameGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcPeeringByNameGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings/{name}", uriVariables);

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

    ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Cloudformation URL for VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param clientVpcRegion Region of the Client VPC to be peered (required)
     * @return TessellVpcPeeringAwsCloudformationLinkDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcPeeringAwsCloudformationLinkDTO getVpcPeeringCloudformationUrlGovernance(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, String clientVpcRegion) throws RestClientException {
        return getVpcPeeringCloudformationUrlGovernanceWithHttpInfo(vpcName, subscriptionName, cloudType, region, clientVpcRegion).getBody();
    }

    /**
     * Get Cloudformation URL for VPC Peering
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param clientVpcRegion Region of the Client VPC to be peered (required)
     * @return ResponseEntity&lt;TessellVpcPeeringAwsCloudformationLinkDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcPeeringAwsCloudformationLinkDTO> getVpcPeeringCloudformationUrlGovernanceWithHttpInfo(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, String clientVpcRegion) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling getVpcPeeringCloudformationUrlGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcPeeringCloudformationUrlGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcPeeringCloudformationUrlGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcPeeringCloudformationUrlGovernance");
        }
        
        // verify the required parameter 'clientVpcRegion' is set
        if (clientVpcRegion == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'clientVpcRegion' when calling getVpcPeeringCloudformationUrlGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings-cloudformation-url", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "clientVpcRegion", clientVpcRegion));

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

    ParameterizedTypeReference<TessellVpcPeeringAwsCloudformationLinkDTO> returnType = new ParameterizedTypeReference<TessellVpcPeeringAwsCloudformationLinkDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of VPC Peerings of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellVpcPeeringServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellVpcPeeringServiceConsumerDTO> getVpcPeeringsGovernance(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellVpcPeeringStatusDTO status, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcPeeringsGovernanceWithHttpInfo(vpcName, subscriptionName, cloudType, region, status, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of VPC Peerings of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param status status (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellVpcPeeringServiceConsumerDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellVpcPeeringServiceConsumerDTO>> getVpcPeeringsGovernanceWithHttpInfo(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellVpcPeeringStatusDTO status, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling getVpcPeeringsGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcPeeringsGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcPeeringsGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcPeeringsGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/vpc-peerings", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
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

    ParameterizedTypeReference<List<TessellVpcPeeringServiceConsumerDTO>> returnType = new ParameterizedTypeReference<List<TessellVpcPeeringServiceConsumerDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
