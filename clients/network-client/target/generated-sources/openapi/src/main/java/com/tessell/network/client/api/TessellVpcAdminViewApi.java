package com.tessell.network.client.api;

import com.tessell.network.client.invoker.ApiClient;

import com.tessell.network.client.model.TessellAclEligibleUserDTO;
import com.tessell.network.client.model.TessellAclPayloadDTO;
import com.tessell.network.client.model.TessellAclRevokePayloadDTO;
import com.tessell.network.client.model.TessellApiErrorDTO;
import com.tessell.network.client.model.TessellApiStatusDTO;
import com.tessell.network.client.model.TessellClientVpcDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellCreateVpcServiceConsumerPayloadDTO;
import com.tessell.network.client.model.TessellDiscoverVpcPayloadDTO;
import com.tessell.network.client.model.TessellEntityAclSharingInfoDTO;
import com.tessell.network.client.model.TessellNetworkActionDTO;
import com.tessell.network.client.model.TessellRegisterClientVpcServiceConsumerPayloadDTO;
import com.tessell.network.client.model.TessellRolesDTO;
import com.tessell.network.client.model.TessellVpcServiceConsumerDTO;
import com.tessell.network.client.model.TessellVpcSubnetServiceConsumerDTO;

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
@Component("com.tessell.network.client.api.TessellVpcAdminViewApi")
public class TessellVpcAdminViewApi {
    private ApiClient apiClient;

    public TessellVpcAdminViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellVpcAdminViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Apply action on a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param action Action to be performed (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO applyActionOnVpc(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellNetworkActionDTO action) throws RestClientException {
        return applyActionOnVpcWithHttpInfo(name, subscriptionName, cloudType, region, action).getBody();
    }

    /**
     * Apply action on a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param action Action to be performed (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> applyActionOnVpcWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellNetworkActionDTO action) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling applyActionOnVpc");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling applyActionOnVpc");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling applyActionOnVpc");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling applyActionOnVpc");
        }
        
        // verify the required parameter 'action' is set
        if (action == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'action' when calling applyActionOnVpc");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        uriVariables.put("action", action);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}/{action}", uriVariables);

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
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Create a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return TessellVpcServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcServiceConsumerDTO createVpcGovernance(TessellCreateVpcServiceConsumerPayloadDTO tessellCreateVpcServiceConsumerPayloadDTO) throws RestClientException {
        return createVpcGovernanceWithHttpInfo(tessellCreateVpcServiceConsumerPayloadDTO).getBody();
    }

    /**
     * Create a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellCreateVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return ResponseEntity&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcServiceConsumerDTO> createVpcGovernanceWithHttpInfo(TessellCreateVpcServiceConsumerPayloadDTO tessellCreateVpcServiceConsumerPayloadDTO) throws RestClientException {
        Object postBody = tessellCreateVpcServiceConsumerPayloadDTO;
        
        // verify the required parameter 'tessellCreateVpcServiceConsumerPayloadDTO' is set
        if (tessellCreateVpcServiceConsumerPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreateVpcServiceConsumerPayloadDTO' when calling createVpcGovernance");
        }
        
        String path = apiClient.expandPath("/network/governance/vpcs", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellVpcServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcAcls(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        return deleteVpcAclsWithHttpInfo(name, subscriptionName, cloudType, region, tessellAclRevokePayloadDTO).getBody();
    }

    /**
     * Delete ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param tessellAclRevokePayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcAclsWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellAclRevokePayloadDTO tessellAclRevokePayloadDTO) throws RestClientException {
        Object postBody = tessellAclRevokePayloadDTO;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteVpcAcls");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling deleteVpcAcls");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling deleteVpcAcls");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling deleteVpcAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}/acls", uriVariables);

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellApiStatusDTO> returnType = new ParameterizedTypeReference<TessellApiStatusDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Delete a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return TessellApiStatusDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellApiStatusDTO deleteVpcGovernance(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return deleteVpcGovernanceWithHttpInfo(name, subscriptionName, cloudType, region).getBody();
    }

    /**
     * Delete a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return ResponseEntity&lt;TessellApiStatusDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellApiStatusDTO> deleteVpcGovernanceWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling deleteVpcGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling deleteVpcGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling deleteVpcGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling deleteVpcGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}", uriVariables);

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
     * Get ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return TessellEntityAclSharingInfoDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEntityAclSharingInfoDTO getVpcAcls(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        return getVpcAclsWithHttpInfo(name, subscriptionName, cloudType, region).getBody();
    }

    /**
     * Get ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @return ResponseEntity&lt;TessellEntityAclSharingInfoDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEntityAclSharingInfoDTO> getVpcAclsWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getVpcAcls");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcAcls");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcAcls");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}/acls", uriVariables);

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

    ParameterizedTypeReference<TessellEntityAclSharingInfoDTO> returnType = new ParameterizedTypeReference<TessellEntityAclSharingInfoDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get VPC as an administrator by Name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @return TessellVpcServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcServiceConsumerDTO getVpcByNameGovernance(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSharedWith) throws RestClientException {
        return getVpcByNameGovernanceWithHttpInfo(name, subscriptionName, cloudType, region, includeSharedWith).getBody();
    }

    /**
     * Get VPC as an administrator by Name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @return ResponseEntity&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcServiceConsumerDTO> getVpcByNameGovernanceWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSharedWith) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getVpcByNameGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcByNameGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcByNameGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcByNameGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeSharedWith", includeSharedWith));

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
     * Get a list of Users with allowed accesses for a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param roles Roles for the entity (optional)
     * @return List&lt;TessellAclEligibleUserDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellAclEligibleUserDTO> getVpcEligibleUserList(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, List<TessellRolesDTO> roles) throws RestClientException {
        return getVpcEligibleUserListWithHttpInfo(name, subscriptionName, cloudType, region, roles).getBody();
    }

    /**
     * Get a list of Users with allowed accesses for a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param roles Roles for the entity (optional)
     * @return ResponseEntity&lt;List&lt;TessellAclEligibleUserDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellAclEligibleUserDTO>> getVpcEligibleUserListWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, List<TessellRolesDTO> roles) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getVpcEligibleUserList");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcEligibleUserList");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcEligibleUserList");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcEligibleUserList");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}/acls/eligible-users", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
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

    ParameterizedTypeReference<List<TessellAclEligibleUserDTO>> returnType = new ParameterizedTypeReference<List<TessellAclEligibleUserDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of Subnets of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return TessellVpcSubnetServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcSubnetServiceConsumerDTO getVpcSubnetsGovernance(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcSubnetsGovernanceWithHttpInfo(vpcName, subscriptionName, cloudType, region, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of Subnets of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param vpcName VPC Name (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;TessellVpcSubnetServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcSubnetServiceConsumerDTO> getVpcSubnetsGovernanceWithHttpInfo(String vpcName, String subscriptionName, TessellCloudTypeDTO cloudType, String region, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'vpcName' is set
        if (vpcName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vpcName' when calling getVpcSubnetsGovernance");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling getVpcSubnetsGovernance");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getVpcSubnetsGovernance");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling getVpcSubnetsGovernance");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("vpcName", vpcName);
        String path = apiClient.expandPath("/network/governance/vpc/{vpcName}/subnets", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
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

    ParameterizedTypeReference<TessellVpcSubnetServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcSubnetServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of VPCs as an administrator
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionName Name of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param includeSubnets Boolean flag to specify if Subnet details are required in response (optional, default to false)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellVpcServiceConsumerDTO> getVpcsGovernance(String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSubnets, Boolean includeSharedWith, List<String> owners, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getVpcsGovernanceWithHttpInfo(subscriptionName, cloudType, region, includeSubnets, includeSharedWith, owners, pageSize, pageOffset).getBody();
    }

    /**
     * Get a list of VPCs as an administrator
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param subscriptionName Name of the Subscription (optional)
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param includeSubnets Boolean flag to specify if Subnet details are required in response (optional, default to false)
     * @param includeSharedWith Include Shared with Info (optional, default to false)
     * @param owners List of Email Addresses for entity or resource owners (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellVpcServiceConsumerDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellVpcServiceConsumerDTO>> getVpcsGovernanceWithHttpInfo(String subscriptionName, TessellCloudTypeDTO cloudType, String region, Boolean includeSubnets, Boolean includeSharedWith, List<String> owners, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/network/governance/vpcs", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionName", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "include-subnets", includeSubnets));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeSharedWith", includeSharedWith));
        queryParams.putAll(apiClient.parameterToMultiValueMap(ApiClient.CollectionFormat.valueOf("csv".toUpperCase(Locale.ROOT)), "owners", owners));
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
    /**
     * List VPCs from a BYOA Subscription to register in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellDiscoverVpcPayloadDTO  (required)
     * @return List&lt;TessellClientVpcDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellClientVpcDTO> getVpcsToRegisterGovernance(TessellDiscoverVpcPayloadDTO tessellDiscoverVpcPayloadDTO) throws RestClientException {
        return getVpcsToRegisterGovernanceWithHttpInfo(tessellDiscoverVpcPayloadDTO).getBody();
    }

    /**
     * List VPCs from a BYOA Subscription to register in Tessell
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellDiscoverVpcPayloadDTO  (required)
     * @return ResponseEntity&lt;List&lt;TessellClientVpcDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellClientVpcDTO>> getVpcsToRegisterGovernanceWithHttpInfo(TessellDiscoverVpcPayloadDTO tessellDiscoverVpcPayloadDTO) throws RestClientException {
        Object postBody = tessellDiscoverVpcPayloadDTO;
        
        // verify the required parameter 'tessellDiscoverVpcPayloadDTO' is set
        if (tessellDiscoverVpcPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDiscoverVpcPayloadDTO' when calling getVpcsToRegisterGovernance");
        }
        
        String path = apiClient.expandPath("/network/governance/vpcs/discovery", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<TessellClientVpcDTO>> returnType = new ParameterizedTypeReference<List<TessellClientVpcDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Modify ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return TessellAclPayloadDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAclPayloadDTO modifyVpcAcls(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        return modifyVpcAclsWithHttpInfo(name, subscriptionName, cloudType, region, tessellAclPayloadDTO).getBody();
    }

    /**
     * Modify ACL (Access Control List) of a VPC
     * 
     * <p><b>200</b> - OK
     * <p><b>204</b> - No Content
     * <p><b>0</b> - API error response
     * @param name Name of the Entity (required)
     * @param subscriptionName Name of the Subscription (required)
     * @param cloudType Name of the Cloud (required)
     * @param region Cloud Region (required)
     * @param tessellAclPayloadDTO  (optional)
     * @return ResponseEntity&lt;TessellAclPayloadDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAclPayloadDTO> modifyVpcAclsWithHttpInfo(String name, String subscriptionName, TessellCloudTypeDTO cloudType, String region, TessellAclPayloadDTO tessellAclPayloadDTO) throws RestClientException {
        Object postBody = tessellAclPayloadDTO;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling modifyVpcAcls");
        }
        
        // verify the required parameter 'subscriptionName' is set
        if (subscriptionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionName' when calling modifyVpcAcls");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling modifyVpcAcls");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'region' when calling modifyVpcAcls");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/network/governance/vpcs/{name}/acls", uriVariables);

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellAclPayloadDTO> returnType = new ParameterizedTypeReference<TessellAclPayloadDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register VPC from a BYOA subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterClientVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return TessellVpcServiceConsumerDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellVpcServiceConsumerDTO registerVpcGovernance(TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO) throws RestClientException {
        return registerVpcGovernanceWithHttpInfo(tessellRegisterClientVpcServiceConsumerPayloadDTO).getBody();
    }

    /**
     * Register VPC from a BYOA subscription
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tessellRegisterClientVpcServiceConsumerPayloadDTO VPC Information (required)
     * @return ResponseEntity&lt;TessellVpcServiceConsumerDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellVpcServiceConsumerDTO> registerVpcGovernanceWithHttpInfo(TessellRegisterClientVpcServiceConsumerPayloadDTO tessellRegisterClientVpcServiceConsumerPayloadDTO) throws RestClientException {
        Object postBody = tessellRegisterClientVpcServiceConsumerPayloadDTO;
        
        // verify the required parameter 'tessellRegisterClientVpcServiceConsumerPayloadDTO' is set
        if (tessellRegisterClientVpcServiceConsumerPayloadDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRegisterClientVpcServiceConsumerPayloadDTO' when calling registerVpcGovernance");
        }
        
        String path = apiClient.expandPath("/network/governance/vpcs/register", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellVpcServiceConsumerDTO> returnType = new ParameterizedTypeReference<TessellVpcServiceConsumerDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
