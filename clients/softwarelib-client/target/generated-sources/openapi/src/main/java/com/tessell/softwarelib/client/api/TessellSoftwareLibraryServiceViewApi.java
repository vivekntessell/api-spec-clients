package com.tessell.softwarelib.client.api;

import com.tessell.softwarelib.client.invoker.ApiClient;

import com.tessell.softwarelib.client.model.TessellApiErrorDTO;
import com.tessell.softwarelib.client.model.TessellCloudTypeDTO;
import com.tessell.softwarelib.client.model.TessellGetSoftwareImageByNameResponseDTO;
import com.tessell.softwarelib.client.model.TessellGetSoftwareImagesResponseDTO;

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
@Component("com.tessell.softwarelib.client.api.TessellSoftwareLibraryServiceViewApi")
public class TessellSoftwareLibraryServiceViewApi {
    private ApiClient apiClient;

    public TessellSoftwareLibraryServiceViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellSoftwareLibraryServiceViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Get Software Image by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Software Image name (required)
     * @param cloudType Name of the Cloud (required)
     * @param softwareImageVersion  (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellGetSoftwareImageByNameResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetSoftwareImageByNameResponseDTO getSoftwareImageByName(String name, TessellCloudTypeDTO cloudType, String softwareImageVersion, String timeZone) throws RestClientException {
        return getSoftwareImageByNameWithHttpInfo(name, cloudType, softwareImageVersion, timeZone).getBody();
    }

    /**
     * Get Software Image by name
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param name Software Image name (required)
     * @param cloudType Name of the Cloud (required)
     * @param softwareImageVersion  (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetSoftwareImageByNameResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetSoftwareImageByNameResponseDTO> getSoftwareImageByNameWithHttpInfo(String name, TessellCloudTypeDTO cloudType, String softwareImageVersion, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'name' when calling getSoftwareImageByName");
        }
        
        // verify the required parameter 'cloudType' is set
        if (cloudType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'cloudType' when calling getSoftwareImageByName");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("name", name);
        String path = apiClient.expandPath("/software-library/image/{name}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "Software Image version", softwareImageVersion));
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

    ParameterizedTypeReference<TessellGetSoftwareImageByNameResponseDTO> returnType = new ParameterizedTypeReference<TessellGetSoftwareImageByNameResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get a list of all software images. Using the name filter, a software image can be found using name.
     * Get a list of all software images.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param personas Personas list (optional)
     * @param name Name of a Software Image (optional)
     * @param allImages Returns All Software Images (optional, default to false)
     * @param timeZone Time Zone (optional)
     * @return TessellGetSoftwareImagesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetSoftwareImagesResponseDTO getSoftwareImages(TessellCloudTypeDTO cloudType, String region, String personas, String name, Boolean allImages, String timeZone) throws RestClientException {
        return getSoftwareImagesWithHttpInfo(cloudType, region, personas, name, allImages, timeZone).getBody();
    }

    /**
     * Get a list of all software images. Using the name filter, a software image can be found using name.
     * Get a list of all software images.
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param personas Personas list (optional)
     * @param name Name of a Software Image (optional)
     * @param allImages Returns All Software Images (optional, default to false)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetSoftwareImagesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetSoftwareImagesResponseDTO> getSoftwareImagesWithHttpInfo(TessellCloudTypeDTO cloudType, String region, String personas, String name, Boolean allImages, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/software-library/images", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "personas", personas));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "allImages", allImages));
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

    ParameterizedTypeReference<TessellGetSoftwareImagesResponseDTO> returnType = new ParameterizedTypeReference<TessellGetSoftwareImagesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
