package com.tessell.license.client.api;

import com.tessell.license.client.invoker.ApiClient;

import java.time.OffsetDateTime;
import com.tessell.license.client.model.TessellAcquireLicenseRequestDTO;
import com.tessell.license.client.model.TessellAcquireLicenseResponseDTO;
import com.tessell.license.client.model.TessellApiErrorDTO;
import com.tessell.license.client.model.TessellApiErrorOpsDTO;
import com.tessell.license.client.model.TessellDeleteLicenseResponseDTO;
import com.tessell.license.client.model.TessellLicenseAvailabilityResponseDTO;
import com.tessell.license.client.model.TessellLicenseCategoryDTO;
import com.tessell.license.client.model.TessellLicenseDirectoriesResponseDTO;
import com.tessell.license.client.model.TessellLicenseDirectoryResponseDTO;
import com.tessell.license.client.model.TessellLicenseRegisterResponseDTO;
import com.tessell.license.client.model.TessellLicenseRequiredResponseDTO;
import com.tessell.license.client.model.TessellMaturityStatusDTO;
import com.tessell.license.client.model.TessellRegisterLicenseToDirectoryRequestDTO;
import com.tessell.license.client.model.TessellReleaseLicenseRequestDTO;
import com.tessell.license.client.model.TessellReleaseLicenseResponseDTO;
import com.tessell.license.client.model.TessellVendorDTO;

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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:59.688756+05:30[Asia/Kolkata]")
@Component("com.tessell.license.client.api.TessellLicenseManagerServiceApi")
public class TessellLicenseManagerServiceApi {
    private ApiClient apiClient;

    public TessellLicenseManagerServiceApi() {
        this(new ApiClient());
    }

    @Autowired
    public TessellLicenseManagerServiceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Acquire a license from a license directory.
     * Acquire a license from a license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param timeZone Time Zone (optional)
     * @param tessellAcquireLicenseRequestDTO  (optional)
     * @return TessellAcquireLicenseResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellAcquireLicenseResponseDTO acquireLicense(String tenantId, String timeZone, TessellAcquireLicenseRequestDTO tessellAcquireLicenseRequestDTO) throws RestClientException {
        return acquireLicenseWithHttpInfo(tenantId, timeZone, tessellAcquireLicenseRequestDTO).getBody();
    }

    /**
     * Acquire a license from a license directory.
     * Acquire a license from a license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param timeZone Time Zone (optional)
     * @param tessellAcquireLicenseRequestDTO  (optional)
     * @return ResponseEntity&lt;TessellAcquireLicenseResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellAcquireLicenseResponseDTO> acquireLicenseWithHttpInfo(String tenantId, String timeZone, TessellAcquireLicenseRequestDTO tessellAcquireLicenseRequestDTO) throws RestClientException {
        Object postBody = tessellAcquireLicenseRequestDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling acquireLicense");
        }
        
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses/acquire", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellAcquireLicenseResponseDTO> returnType = new ParameterizedTypeReference<TessellAcquireLicenseResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Checks if the licenses are available for Acquiring
     * Checks if the licenses are available in the system for Acquiring
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseCategory  (required)
     * @param vendor License vendor (required)
     * @param subscriptionId Id of subscription (required)
     * @param version license version (required)
     * @param edition license edition (required)
     * @param quantity license version (required)
     * @return TessellLicenseAvailabilityResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseAvailabilityResponseDTO checkLicenseAvailability(String tenantId, TessellLicenseCategoryDTO licenseCategory, TessellVendorDTO vendor, String subscriptionId, String version, String edition, Double quantity) throws RestClientException {
        return checkLicenseAvailabilityWithHttpInfo(tenantId, licenseCategory, vendor, subscriptionId, version, edition, quantity).getBody();
    }

    /**
     * Checks if the licenses are available for Acquiring
     * Checks if the licenses are available in the system for Acquiring
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseCategory  (required)
     * @param vendor License vendor (required)
     * @param subscriptionId Id of subscription (required)
     * @param version license version (required)
     * @param edition license edition (required)
     * @param quantity license version (required)
     * @return ResponseEntity&lt;TessellLicenseAvailabilityResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseAvailabilityResponseDTO> checkLicenseAvailabilityWithHttpInfo(String tenantId, TessellLicenseCategoryDTO licenseCategory, TessellVendorDTO vendor, String subscriptionId, String version, String edition, Double quantity) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'licenseCategory' is set
        if (licenseCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'licenseCategory' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'vendor' is set
        if (vendor == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'vendor' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'subscriptionId' is set
        if (subscriptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'subscriptionId' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'version' is set
        if (version == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'version' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'edition' is set
        if (edition == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'edition' when calling checkLicenseAvailability");
        }
        
        // verify the required parameter 'quantity' is set
        if (quantity == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'quantity' when calling checkLicenseAvailability");
        }
        
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses/availability", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseCategory", licenseCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vendor", vendor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "version", version));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "edition", edition));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "quantity", quantity));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<TessellLicenseAvailabilityResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseAvailabilityResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Checks if the licensing functionality is available for the account
     * Checks if the licensing functionality is available for the account
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return TessellLicenseRequiredResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseRequiredResponseDTO checkLicenseRequirement(String tenantId) throws RestClientException {
        return checkLicenseRequirementWithHttpInfo(tenantId).getBody();
    }

    /**
     * Checks if the licensing functionality is available for the account
     * Checks if the licensing functionality is available for the account
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @return ResponseEntity&lt;TessellLicenseRequiredResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseRequiredResponseDTO> checkLicenseRequirementWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkLicenseRequirement");
        }
        
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses/requirement-checks", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = {  };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellLicenseRequiredResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseRequiredResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Deletes an existing license from directory.
     * Deletes an existing license from directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param licenseId License Id (required)
     * @param timeZone Time Zone (optional)
     * @param secure  (optional)
     * @return TessellDeleteLicenseResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDeleteLicenseResponseDTO deleteLicenseFromDirectory(String licenseId, String timeZone, Boolean secure) throws RestClientException {
        return deleteLicenseFromDirectoryWithHttpInfo(licenseId, timeZone, secure).getBody();
    }

    /**
     * Deletes an existing license from directory.
     * Deletes an existing license from directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param licenseId License Id (required)
     * @param timeZone Time Zone (optional)
     * @param secure  (optional)
     * @return ResponseEntity&lt;TessellDeleteLicenseResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDeleteLicenseResponseDTO> deleteLicenseFromDirectoryWithHttpInfo(String licenseId, String timeZone, Boolean secure) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'licenseId' when calling deleteLicenseFromDirectory");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("licenseId", licenseId);
        String path = apiClient.expandPath("/license-manager/governance/licenses/{licenseId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "secure", secure));

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

    ParameterizedTypeReference<TessellDeleteLicenseResponseDTO> returnType = new ParameterizedTypeReference<TessellDeleteLicenseResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns license by Id.
     * Returns license by Id
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseId  (required)
     * @param timeZone Time Zone (optional)
     * @param includeAudit  (optional)
     * @return TessellLicenseDirectoryResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseDirectoryResponseDTO getLicenseFromDirectoryByIdInternal(String tenantId, String licenseId, String timeZone, Boolean includeAudit) throws RestClientException {
        return getLicenseFromDirectoryByIdInternalWithHttpInfo(tenantId, licenseId, timeZone, includeAudit).getBody();
    }

    /**
     * Returns license by Id.
     * Returns license by Id
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseId  (required)
     * @param timeZone Time Zone (optional)
     * @param includeAudit  (optional)
     * @return ResponseEntity&lt;TessellLicenseDirectoryResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseDirectoryResponseDTO> getLicenseFromDirectoryByIdInternalWithHttpInfo(String tenantId, String licenseId, String timeZone, Boolean includeAudit) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getLicenseFromDirectoryByIdInternal");
        }
        
        // verify the required parameter 'licenseId' is set
        if (licenseId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'licenseId' when calling getLicenseFromDirectoryByIdInternal");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("licenseId", licenseId);
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses/{licenseId}", uriVariables);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeAudit", includeAudit));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<TessellLicenseDirectoryResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseDirectoryResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns a list detail of licenses from directory.
     * Returns a list detail of licenses from directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param licenseCategory License Category (required)
     * @param licenseType License Type (optional)
     * @param vendor License Vendor (optional)
     * @param includeAudit Flag to include/exclude to Audit (optional)
     * @param status Maturity Status (optional)
     * @param licenseIds Comma separated license Ids (optional)
     * @param subscriptionId Id of subscription (optional)
     * @param createdBy Owner name (optional)
     * @param startDate Date on which license was added. (optional)
     * @param endDate Date on which license would expire. (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellLicenseDirectoriesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseDirectoriesResponseDTO getLicensesFromDirectory(TessellLicenseCategoryDTO licenseCategory, String licenseType, TessellVendorDTO vendor, Boolean includeAudit, TessellMaturityStatusDTO status, String licenseIds, String subscriptionId, String createdBy, OffsetDateTime startDate, OffsetDateTime endDate, String timeZone) throws RestClientException {
        return getLicensesFromDirectoryWithHttpInfo(licenseCategory, licenseType, vendor, includeAudit, status, licenseIds, subscriptionId, createdBy, startDate, endDate, timeZone).getBody();
    }

    /**
     * Returns a list detail of licenses from directory.
     * Returns a list detail of licenses from directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param licenseCategory License Category (required)
     * @param licenseType License Type (optional)
     * @param vendor License Vendor (optional)
     * @param includeAudit Flag to include/exclude to Audit (optional)
     * @param status Maturity Status (optional)
     * @param licenseIds Comma separated license Ids (optional)
     * @param subscriptionId Id of subscription (optional)
     * @param createdBy Owner name (optional)
     * @param startDate Date on which license was added. (optional)
     * @param endDate Date on which license would expire. (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellLicenseDirectoriesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseDirectoriesResponseDTO> getLicensesFromDirectoryWithHttpInfo(TessellLicenseCategoryDTO licenseCategory, String licenseType, TessellVendorDTO vendor, Boolean includeAudit, TessellMaturityStatusDTO status, String licenseIds, String subscriptionId, String createdBy, OffsetDateTime startDate, OffsetDateTime endDate, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'licenseCategory' is set
        if (licenseCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'licenseCategory' when calling getLicensesFromDirectory");
        }
        
        String path = apiClient.expandPath("/license-manager/governance/licenses", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseCategory", licenseCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseType", licenseType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vendor", vendor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeAudit", includeAudit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseIds", licenseIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdBy", createdBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
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

    ParameterizedTypeReference<TessellLicenseDirectoriesResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseDirectoriesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Returns detail of license directory.
     * Returns detail of license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseCategory  (required)
     * @param licenseType License Type (optional)
     * @param vendor License Type (optional)
     * @param includeAudit  (optional)
     * @param subscriptionId Id of subscription (optional)
     * @param status maturity status (optional)
     * @param licenseIds Comma separated licenseids (optional)
     * @param createdBy owner (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param timeZone Time Zone (optional)
     * @return TessellLicenseDirectoriesResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseDirectoriesResponseDTO getLicensesFromDirectoryInternal(String tenantId, TessellLicenseCategoryDTO licenseCategory, String licenseType, TessellVendorDTO vendor, Boolean includeAudit, String subscriptionId, TessellMaturityStatusDTO status, String licenseIds, String createdBy, OffsetDateTime startDate, OffsetDateTime endDate, String timeZone) throws RestClientException {
        return getLicensesFromDirectoryInternalWithHttpInfo(tenantId, licenseCategory, licenseType, vendor, includeAudit, subscriptionId, status, licenseIds, createdBy, startDate, endDate, timeZone).getBody();
    }

    /**
     * Returns detail of license directory.
     * Returns detail of license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param licenseCategory  (required)
     * @param licenseType License Type (optional)
     * @param vendor License Type (optional)
     * @param includeAudit  (optional)
     * @param subscriptionId Id of subscription (optional)
     * @param status maturity status (optional)
     * @param licenseIds Comma separated licenseids (optional)
     * @param createdBy owner (optional)
     * @param startDate  (optional)
     * @param endDate  (optional)
     * @param timeZone Time Zone (optional)
     * @return ResponseEntity&lt;TessellLicenseDirectoriesResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseDirectoriesResponseDTO> getLicensesFromDirectoryInternalWithHttpInfo(String tenantId, TessellLicenseCategoryDTO licenseCategory, String licenseType, TessellVendorDTO vendor, Boolean includeAudit, String subscriptionId, TessellMaturityStatusDTO status, String licenseIds, String createdBy, OffsetDateTime startDate, OffsetDateTime endDate, String timeZone) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getLicensesFromDirectoryInternal");
        }
        
        // verify the required parameter 'licenseCategory' is set
        if (licenseCategory == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'licenseCategory' when calling getLicensesFromDirectoryInternal");
        }
        
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseCategory", licenseCategory));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseType", licenseType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "vendor", vendor));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "includeAudit", includeAudit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscriptionId", subscriptionId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "licenseIds", licenseIds));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "createdBy", createdBy));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "startDate", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "endDate", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

        if (tenantId != null)
        headerParams.add("tenant-id", apiClient.parameterToString(tenantId));

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

    ParameterizedTypeReference<TessellLicenseDirectoriesResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseDirectoriesResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Register license into license pool
     * Register license into license pool
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param timeZone Time Zone (optional)
     * @param tessellRegisterLicenseToDirectoryRequestDTO  (optional)
     * @return TessellLicenseRegisterResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellLicenseRegisterResponseDTO registerLicenseToDirectory(String timeZone, TessellRegisterLicenseToDirectoryRequestDTO tessellRegisterLicenseToDirectoryRequestDTO) throws RestClientException {
        return registerLicenseToDirectoryWithHttpInfo(timeZone, tessellRegisterLicenseToDirectoryRequestDTO).getBody();
    }

    /**
     * Register license into license pool
     * Register license into license pool
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param timeZone Time Zone (optional)
     * @param tessellRegisterLicenseToDirectoryRequestDTO  (optional)
     * @return ResponseEntity&lt;TessellLicenseRegisterResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellLicenseRegisterResponseDTO> registerLicenseToDirectoryWithHttpInfo(String timeZone, TessellRegisterLicenseToDirectoryRequestDTO tessellRegisterLicenseToDirectoryRequestDTO) throws RestClientException {
        Object postBody = tessellRegisterLicenseToDirectoryRequestDTO;
        
        String path = apiClient.expandPath("/license-manager/governance/licenses", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellLicenseRegisterResponseDTO> returnType = new ParameterizedTypeReference<TessellLicenseRegisterResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * Release a previously acquired license from a license directory.
     * Release a previously acquired license from a license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param timeZone Time Zone (optional)
     * @param tessellReleaseLicenseRequestDTO  (optional)
     * @return TessellReleaseLicenseResponseDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellReleaseLicenseResponseDTO releaseLicense(String tenantId, String timeZone, TessellReleaseLicenseRequestDTO tessellReleaseLicenseRequestDTO) throws RestClientException {
        return releaseLicenseWithHttpInfo(tenantId, timeZone, tessellReleaseLicenseRequestDTO).getBody();
    }

    /**
     * Release a previously acquired license from a license directory.
     * Release a previously acquired license from a license directory.
     * <p><b>200</b> - Ok
     * <p><b>0</b> - API error response
     * @param tenantId Id of the Tenant (required)
     * @param timeZone Time Zone (optional)
     * @param tessellReleaseLicenseRequestDTO  (optional)
     * @return ResponseEntity&lt;TessellReleaseLicenseResponseDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellReleaseLicenseResponseDTO> releaseLicenseWithHttpInfo(String tenantId, String timeZone, TessellReleaseLicenseRequestDTO tessellReleaseLicenseRequestDTO) throws RestClientException {
        Object postBody = tessellReleaseLicenseRequestDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling releaseLicense");
        }
        
        String path = apiClient.expandPath("/tessell-internal/license-manager/licenses/release", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "timeZone", timeZone));

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

    ParameterizedTypeReference<TessellReleaseLicenseResponseDTO> returnType = new ParameterizedTypeReference<TessellReleaseLicenseResponseDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
