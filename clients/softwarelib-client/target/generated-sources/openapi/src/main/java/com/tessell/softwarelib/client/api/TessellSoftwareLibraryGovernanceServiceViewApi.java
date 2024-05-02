package com.tessell.softwarelib.client.api;

import com.tessell.softwarelib.client.invoker.ApiClient;

import com.tessell.softwarelib.client.model.TessellApiErrorDTO;
import com.tessell.softwarelib.client.model.TessellCloudTypeDTO;
import com.tessell.softwarelib.client.model.TessellDisableSoftwareImagesRequestDTO;
import com.tessell.softwarelib.client.model.TessellDisableSoftwareImagesResponseDTO;
import com.tessell.softwarelib.client.model.TessellEnableSoftwareImagesRequestDTO;
import com.tessell.softwarelib.client.model.TessellEnableSoftwareImagesResponseDTO;
import com.tessell.softwarelib.client.model.TessellGetAllSoftwareImagesResponseDTO;
import com.tessell.softwarelib.client.model.TessellGetPatchableImageVersionsResponseDTO;
import com.tessell.softwarelib.client.model.TessellRestrictAccessToSoftwareImagesRequestDTO;
import com.tessell.softwarelib.client.model.TessellRestrictAccessToSoftwareImagesResponseDTO;
import com.tessell.softwarelib.client.model.TessellRestrictSoftwareImagesInRegionsRequestDTO;
import com.tessell.softwarelib.client.model.TessellRestrictSoftwareImagesInRegionsResponseDTO;

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
@Component("com.tessell.softwarelib.client.api.TessellSoftwareLibraryGovernanceServiceViewApi")
public class TessellSoftwareLibraryGovernanceServiceViewApi {
    private ApiClient apiClient;

    public TessellSoftwareLibraryGovernanceServiceViewApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellSoftwareLibraryGovernanceServiceViewApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Disable Software Images
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellDisableSoftwareImagesRequestDTO Software Images to disable (required)
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellDisableSoftwareImagesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDisableSoftwareImagesResponseDTO disableSoftwareImages(TessellDisableSoftwareImagesRequestDTO tessellDisableSoftwareImagesRequestDTO, TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        return disableSoftwareImagesWithHttpInfo(tessellDisableSoftwareImagesRequestDTO, cloudType, timeZone).getBody();
    }

    /**
     * Disable Software Images
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellDisableSoftwareImagesRequestDTO Software Images to disable (required)
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellDisableSoftwareImagesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDisableSoftwareImagesResponseDTO> disableSoftwareImagesWithHttpInfo(TessellDisableSoftwareImagesRequestDTO tessellDisableSoftwareImagesRequestDTO, TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        Object postBody = tessellDisableSoftwareImagesRequestDTO;
        
        // verify the required parameter 'tessellDisableSoftwareImagesRequestDTO' is set
        if (tessellDisableSoftwareImagesRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDisableSoftwareImagesRequestDTO' when calling disableSoftwareImages");
        }
        
        String path = apiClient.expandPath("/software-library/governance/images/disable", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellDisableSoftwareImagesResponseDTO> returnType = new ParameterizedTypeReference<TessellDisableSoftwareImagesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Enable Software Images
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellEnableSoftwareImagesRequestDTO Software Images to enable (required)
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellEnableSoftwareImagesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellEnableSoftwareImagesResponseDTO enableSoftwareImages(TessellEnableSoftwareImagesRequestDTO tessellEnableSoftwareImagesRequestDTO, TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        return enableSoftwareImagesWithHttpInfo(tessellEnableSoftwareImagesRequestDTO, cloudType, timeZone).getBody();
    }

    /**
     * Enable Software Images
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellEnableSoftwareImagesRequestDTO Software Images to enable (required)
     * @param cloudType Name of the Cloud (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellEnableSoftwareImagesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellEnableSoftwareImagesResponseDTO> enableSoftwareImagesWithHttpInfo(TessellEnableSoftwareImagesRequestDTO tessellEnableSoftwareImagesRequestDTO, TessellCloudTypeDTO cloudType, String timeZone) throws RestClientException {
        Object postBody = tessellEnableSoftwareImagesRequestDTO;
        
        // verify the required parameter 'tessellEnableSoftwareImagesRequestDTO' is set
        if (tessellEnableSoftwareImagesRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellEnableSoftwareImagesRequestDTO' when calling enableSoftwareImages");
        }
        
        String path = apiClient.expandPath("/software-library/governance/images/enable", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellEnableSoftwareImagesResponseDTO> returnType = new ParameterizedTypeReference<TessellEnableSoftwareImagesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * List Software Images (including disabled ones)
     * 
     * <p><b>200</b> - List of Software Images
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellGetAllSoftwareImagesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetAllSoftwareImagesResponseDTO getAllSoftwareImages(TessellCloudTypeDTO cloudType, String region, String timeZone) throws RestClientException {
        return getAllSoftwareImagesWithHttpInfo(cloudType, region, timeZone).getBody();
    }

    /**
     * List Software Images (including disabled ones)
     * 
     * <p><b>200</b> - List of Software Images
     * <p><b>0</b> - API error response
     * @param cloudType Name of the Cloud (optional)
     * @param region Cloud Region (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellGetAllSoftwareImagesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetAllSoftwareImagesResponseDTO> getAllSoftwareImagesWithHttpInfo(TessellCloudTypeDTO cloudType, String region, String timeZone) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/software-library/governance/images", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloudType", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "region", region));
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

    ParameterizedTypeReference<TessellGetAllSoftwareImagesResponseDTO> returnType = new ParameterizedTypeReference<TessellGetAllSoftwareImagesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Get Details of Patchable Software Image Version identified by ImageId and VersionId.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param imageName Software Image name (required)
     * @param versionName Software Image version (required)
     * @return TessellGetPatchableImageVersionsResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellGetPatchableImageVersionsResponseDTO getPatchableImageVersions(String imageName, String versionName) throws RestClientException {
        return getPatchableImageVersionsWithHttpInfo(imageName, versionName).getBody();
    }

    /**
     * Get Details of Patchable Software Image Version identified by ImageId and VersionId.
     * 
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param imageName Software Image name (required)
     * @param versionName Software Image version (required)
     * @return ResponseEntity&lt;TessellGetPatchableImageVersionsResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellGetPatchableImageVersionsResponseDTO> getPatchableImageVersionsWithHttpInfo(String imageName, String versionName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageName' is set
        if (imageName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageName' when calling getPatchableImageVersions");
        }
        
        // verify the required parameter 'versionName' is set
        if (versionName == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'versionName' when calling getPatchableImageVersions");
        }
        
        String path = apiClient.expandPath("/software-library/governance/images/patchable", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "image-name", imageName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version-name", versionName));

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

    ParameterizedTypeReference<TessellGetPatchableImageVersionsResponseDTO> returnType = new ParameterizedTypeReference<TessellGetPatchableImageVersionsResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Restrict Software Images access to set of Personas
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellRestrictAccessToSoftwareImagesRequestDTO  (required)
     * @param timeZone Time Zone (optional)
     * @return TessellRestrictAccessToSoftwareImagesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRestrictAccessToSoftwareImagesResponseDTO restrictAccessToSoftwareImages(TessellRestrictAccessToSoftwareImagesRequestDTO tessellRestrictAccessToSoftwareImagesRequestDTO, String timeZone) throws RestClientException {
        return restrictAccessToSoftwareImagesWithHttpInfo(tessellRestrictAccessToSoftwareImagesRequestDTO, timeZone).getBody();
    }

    /**
     * Restrict Software Images access to set of Personas
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellRestrictAccessToSoftwareImagesRequestDTO  (required)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellRestrictAccessToSoftwareImagesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRestrictAccessToSoftwareImagesResponseDTO> restrictAccessToSoftwareImagesWithHttpInfo(TessellRestrictAccessToSoftwareImagesRequestDTO tessellRestrictAccessToSoftwareImagesRequestDTO, String timeZone) throws RestClientException {
        Object postBody = tessellRestrictAccessToSoftwareImagesRequestDTO;
        
        // verify the required parameter 'tessellRestrictAccessToSoftwareImagesRequestDTO' is set
        if (tessellRestrictAccessToSoftwareImagesRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRestrictAccessToSoftwareImagesRequestDTO' when calling restrictAccessToSoftwareImages");
        }
        
        String path = apiClient.expandPath("/software-library/governance/images/restrict-access", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellRestrictAccessToSoftwareImagesResponseDTO> returnType = new ParameterizedTypeReference<TessellRestrictAccessToSoftwareImagesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Restrict Software Images to certain regions
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellRestrictSoftwareImagesInRegionsRequestDTO  (required)
     * @param timeZone Time Zone (optional)
     * @return TessellRestrictSoftwareImagesInRegionsResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellRestrictSoftwareImagesInRegionsResponseDTO restrictSoftwareImagesInRegions(TessellRestrictSoftwareImagesInRegionsRequestDTO tessellRestrictSoftwareImagesInRegionsRequestDTO, String timeZone) throws RestClientException {
        return restrictSoftwareImagesInRegionsWithHttpInfo(tessellRestrictSoftwareImagesInRegionsRequestDTO, timeZone).getBody();
    }

    /**
     * Restrict Software Images to certain regions
     * 
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tessellRestrictSoftwareImagesInRegionsRequestDTO  (required)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellRestrictSoftwareImagesInRegionsResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellRestrictSoftwareImagesInRegionsResponseDTO> restrictSoftwareImagesInRegionsWithHttpInfo(TessellRestrictSoftwareImagesInRegionsRequestDTO tessellRestrictSoftwareImagesInRegionsRequestDTO, String timeZone) throws RestClientException {
        Object postBody = tessellRestrictSoftwareImagesInRegionsRequestDTO;
        
        // verify the required parameter 'tessellRestrictSoftwareImagesInRegionsRequestDTO' is set
        if (tessellRestrictSoftwareImagesInRegionsRequestDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellRestrictSoftwareImagesInRegionsRequestDTO' when calling restrictSoftwareImagesInRegions");
        }
        
        String path = apiClient.expandPath("/software-library/governance/images/restrict-regions", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellRestrictSoftwareImagesInRegionsResponseDTO> returnType = new ParameterizedTypeReference<TessellRestrictSoftwareImagesInRegionsResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
