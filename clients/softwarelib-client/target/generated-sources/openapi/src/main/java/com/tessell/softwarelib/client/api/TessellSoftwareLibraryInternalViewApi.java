package com.tessell.softwarelib.client.api;

import com.tessell.softwarelib.client.invoker.ApiClient;

import com.tessell.softwarelib.client.model.TessellApiErrorOpsDTO;
import com.tessell.softwarelib.client.model.TessellCloudTypeDTO;
import com.tessell.softwarelib.client.model.TessellGetAllSoftwareImagesInternalViewDTO;
import com.tessell.softwarelib.client.model.TessellGetSoftwareImageByIdInternalViewResponseDTO;
import com.tessell.softwarelib.client.model.TessellGetSoftwareImageByNameInternalViewResponseDTO;
import com.tessell.softwarelib.client.model.TessellSoftwareImageVersionEntityDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@Component("com.tessell.softwarelib.client.api.TessellSoftwareLibraryInternalViewApi")
public class TessellSoftwareLibraryInternalViewApi {
    private ApiClient apiClient;

    public TessellSoftwareLibraryInternalViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellSoftwareLibraryInternalViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get all Software Images including image ids.
     * Get all Software Images including image ids.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellGetAllSoftwareImagesInternalViewDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetAllSoftwareImagesInternalViewDTO getAllSoftwareImagesInternalView(TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        return getAllSoftwareImagesInternalViewWithHttpInfo(cloudType, timeZone).getBody();
    }

    /**
     * Get all Software Images including image ids.
     * Get all Software Images including image ids.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetAllSoftwareImagesInternalViewDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetAllSoftwareImagesInternalViewDTO> getAllSoftwareImagesInternalViewWithHttpInfo(TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-internal/software-library/images", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellGetAllSoftwareImagesInternalViewDTO> returnType = new ParameterizedTypeReference<TessellGetAllSoftwareImagesInternalViewDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Details of Software Image identified by identifier.
     * Get Details of Software Image identified by identifier.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id  (required)
     * @param versionName  (optional)
     * @param version  (optional)
     * @param cloudAndAvailability  (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellGetSoftwareImageByIdInternalViewResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetSoftwareImageByIdInternalViewResponseDTO getSoftwareImageByIdInternalView(UUID id, String versionName, String version, String cloudAndAvailability, String timeZone) throws RestClientException {
        return getSoftwareImageByIdInternalViewWithHttpInfo(id, versionName, version, cloudAndAvailability, timeZone).getBody();
    }

    /**
     * Get Details of Software Image identified by identifier.
     * Get Details of Software Image identified by identifier.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id  (required)
     * @param versionName  (optional)
     * @param version  (optional)
     * @param cloudAndAvailability  (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetSoftwareImageByIdInternalViewResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetSoftwareImageByIdInternalViewResponseDTO> getSoftwareImageByIdInternalViewWithHttpInfo(UUID id, String versionName, String version, String cloudAndAvailability, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSoftwareImageByIdInternalView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/software-library/image/id/{id}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "versionName", versionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudAndAvailability", cloudAndAvailability));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellGetSoftwareImageByIdInternalViewResponseDTO> returnType = new ParameterizedTypeReference<TessellGetSoftwareImageByIdInternalViewResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns a software images.
     * Returns a software images.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the software image (required)
     * @param cloudType Name of the Cloud (required)
     * @param dbVersionName DB version name (optional)
     * @param region Cloud Region (optional)
     * @param availabilityZone Availability Zone (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellGetSoftwareImageByNameInternalViewResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetSoftwareImageByNameInternalViewResponseDTO getSoftwareImageByNameInternalView(String name, TessellCloudTypeDTO cloudType, String dbVersionName, String region, String availabilityZone, String timeZone) throws RestClientException {
        return getSoftwareImageByNameInternalViewWithHttpInfo(name, cloudType, dbVersionName, region, availabilityZone, timeZone).getBody();
    }

    /**
     * Returns a software images.
     * Returns a software images.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Name of the software image (required)
     * @param cloudType Name of the Cloud (required)
     * @param dbVersionName DB version name (optional)
     * @param region Cloud Region (optional)
     * @param availabilityZone Availability Zone (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetSoftwareImageByNameInternalViewResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetSoftwareImageByNameInternalViewResponseDTO> getSoftwareImageByNameInternalViewWithHttpInfo(String name, TessellCloudTypeDTO cloudType, String dbVersionName, String region, String availabilityZone, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSoftwareImageByNameInternalView");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getSoftwareImageByNameInternalView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/tessell-internal/software-library/image/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "dbVersionName", dbVersionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availabilityZone", availabilityZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellGetSoftwareImageByNameInternalViewResponseDTO> returnType = new ParameterizedTypeReference<TessellGetSoftwareImageByNameInternalViewResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Details of Software Image Version identified by identifier.
     * Get Details of Software Image Version identified by identifier.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id  (required)
     * @return TessellSoftwareImageVersionEntityDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellSoftwareImageVersionEntityDTO getSoftwareImageVersionByIdInternalView(UUID id) throws RestClientException {
        return getSoftwareImageVersionByIdInternalViewWithHttpInfo(id).getBody();
    }

    /**
     * Get Details of Software Image Version identified by identifier.
     * Get Details of Software Image Version identified by identifier.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id  (required)
     * @return ResponseEntity&lt;TessellSoftwareImageVersionEntityDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellSoftwareImageVersionEntityDTO> getSoftwareImageVersionByIdInternalViewWithHttpInfo(UUID id) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getSoftwareImageVersionByIdInternalView");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-internal/software-library/version/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellSoftwareImageVersionEntityDTO> returnType = new ParameterizedTypeReference<TessellSoftwareImageVersionEntityDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
