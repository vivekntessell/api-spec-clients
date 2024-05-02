package com.tessell.metering.client.api;

import com.tessell.metering.client.invoker.ApiClient;

import com.tessell.metering.client.model.ApiError;
import com.tessell.metering.client.model.ApiErrorOps;
import java.math.BigDecimal;
import com.tessell.metering.client.model.CloudType;
import com.tessell.metering.client.model.DatabaseEngineType;
import com.tessell.metering.client.model.MeterDuration;
import com.tessell.metering.client.model.TessellBillDTO;
import com.tessell.metering.client.model.TessellBillSummaryDTO;
import com.tessell.metering.client.model.TessellBillingEntityType;
import com.tessell.metering.client.model.TessellBillingProfileDTO;
import com.tessell.metering.client.model.TessellBillingRateCardDTO;
import com.tessell.metering.client.model.TessellCheckCreditsDTO;
import com.tessell.metering.client.model.TessellCreditDTO;
import com.tessell.metering.client.model.TessellDiscountDTO;
import com.tessell.metering.client.model.TessellInvoiceConfigDTO;
import com.tessell.metering.client.model.TessellMeterDTO;
import com.tessell.metering.client.model.TessellMeteringEntityType;
import com.tessell.metering.client.model.TessellMeteringRateCardEntityName;
import com.tessell.metering.client.model.TessellMonthlyCostInfoDTO;
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

@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:01.620011+05:30[Asia/Kolkata]")
@Component("com.tessell.metering.client.api.DefaultApi")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * update the skip bill generation i.e toggle skip bill generation
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param disable boolean value of enable/disable (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void changeSkipBillGeneration(String tenantId, String disable) throws RestClientException {
        changeSkipBillGenerationWithHttpInfo(tenantId, disable);
    }

    /**
     * 
     * update the skip bill generation i.e toggle skip bill generation
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param disable boolean value of enable/disable (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> changeSkipBillGenerationWithHttpInfo(String tenantId, String disable) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling changeSkipBillGeneration");
        }
        
        // verify the required parameter 'disable' is set
        if (disable == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'disable' when calling changeSkipBillGeneration");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("disable", disable);
        String path = apiClient.expandPath("/tessell-ops/billing/disable/{disable}", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * check if we allow provision .
     * <p><b>200</b> - The list of all billing Profiles
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return TessellCheckCreditsDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCheckCreditsDTO checkCredits(String tenantId) throws RestClientException {
        return checkCreditsWithHttpInfo(tenantId).getBody();
    }

    /**
     * 
     * check if we allow provision .
     * <p><b>200</b> - The list of all billing Profiles
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellCheckCreditsDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCheckCreditsDTO> checkCreditsWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling checkCredits");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/credit-check", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellCheckCreditsDTO> returnType = new ParameterizedTypeReference<TessellCheckCreditsDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Add a new credit entry
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreditDTO Add new credit entry (required)
     * @return TessellCreditDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCreditDTO createCredit(String tenantId, TessellCreditDTO tessellCreditDTO) throws RestClientException {
        return createCreditWithHttpInfo(tenantId, tessellCreditDTO).getBody();
    }

    /**
     * 
     * Add a new credit entry
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellCreditDTO Add new credit entry (required)
     * @return ResponseEntity&lt;TessellCreditDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCreditDTO> createCreditWithHttpInfo(String tenantId, TessellCreditDTO tessellCreditDTO) throws RestClientException {
        Object postBody = tessellCreditDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling createCredit");
        }
        
        // verify the required parameter 'tessellCreditDTO' is set
        if (tessellCreditDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreditDTO' when calling createCredit");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/credits", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellCreditDTO> returnType = new ParameterizedTypeReference<TessellCreditDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Start daily meter aggregator job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void dailyAggregator() throws RestClientException {
        dailyAggregatorWithHttpInfo();
    }

    /**
     * 
     * Start daily meter aggregator job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> dailyAggregatorWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/meters/daily", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Mark a credit as deleted
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Credit id (required)
     * @param tenantId tenant-id (required)
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCredit(String id, String tenantId) throws RestClientException {
        deleteCreditWithHttpInfo(id, tenantId);
    }

    /**
     * 
     * Mark a credit as deleted
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param id Credit id (required)
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> deleteCreditWithHttpInfo(String id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling deleteCredit");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling deleteCredit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/billing/credits/{id}", uriVariables);

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Generate a bill based on the meters present for a provided start-date and end-date,
     * <p><b>200</b> - The Bill Object
     * <p><b>0</b> - API error response
     * @param startDate The timestamp of the start date of the meter (required)
     * @param endDate The timestamp of the end date of the meter (required)
     * @param tenantId tenant-id (optional)
     * @param systemGenerated system-generated (optional)
     * @return TessellBillDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBillDTO generateBill(BigDecimal startDate, BigDecimal endDate, String tenantId, Boolean systemGenerated) throws RestClientException {
        return generateBillWithHttpInfo(startDate, endDate, tenantId, systemGenerated).getBody();
    }

    /**
     * 
     * Generate a bill based on the meters present for a provided start-date and end-date,
     * <p><b>200</b> - The Bill Object
     * <p><b>0</b> - API error response
     * @param startDate The timestamp of the start date of the meter (required)
     * @param endDate The timestamp of the end date of the meter (required)
     * @param tenantId tenant-id (optional)
     * @param systemGenerated system-generated (optional)
     * @return ResponseEntity&lt;TessellBillDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBillDTO> generateBillWithHttpInfo(BigDecimal startDate, BigDecimal endDate, String tenantId, Boolean systemGenerated) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'startDate' when calling generateBill");
        }
        
        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'endDate' when calling generateBill");
        }
        
        String path = apiClient.expandPath("/billing/bills", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "system-generated", systemGenerated));

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

    ParameterizedTypeReference<TessellBillDTO> returnType = new ParameterizedTypeReference<TessellBillDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the details of the Billing profile that include billing address and payment details
     * <p><b>200</b> - The list of all billing Profiles
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return List&lt;TessellBillingProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBillingProfileDTO> getBillingProfile(String tenantId) throws RestClientException {
        return getBillingProfileWithHttpInfo(tenantId).getBody();
    }

    /**
     * 
     * Returns the details of the Billing profile that include billing address and payment details
     * <p><b>200</b> - The list of all billing Profiles
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;List&lt;TessellBillingProfileDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBillingProfileDTO>> getBillingProfileWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBillingProfile");
        }
        
        String path = apiClient.expandPath("/billing/profile", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<List<TessellBillingProfileDTO>> returnType = new ParameterizedTypeReference<List<TessellBillingProfileDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get billing summary for a tenant
     * <p><b>200</b> - Billing configuration details of this tenant
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return TessellBillSummaryDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBillSummaryDTO getBillingSummary(String tenantId) throws RestClientException {
        return getBillingSummaryWithHttpInfo(tenantId).getBody();
    }

    /**
     * 
     * Get billing summary for a tenant
     * <p><b>200</b> - Billing configuration details of this tenant
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellBillSummaryDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBillSummaryDTO> getBillingSummaryWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBillingSummary");
        }
        
        String path = apiClient.expandPath("/billing/summary", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellBillSummaryDTO> returnType = new ParameterizedTypeReference<TessellBillSummaryDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get all the Bills
     * <p><b>200</b> - List of Bills
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name The Name of the Bill (optional)
     * @param startDate The timestamp of the start date of the meter (optional)
     * @param endDate The timestamp of the end date of the meter (optional)
     * @param systemGenerated Whether the bill is system generated. (optional)
     * @return List&lt;TessellBillDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBillDTO> getBills(String tenantId, String name, BigDecimal startDate, BigDecimal endDate, Boolean systemGenerated) throws RestClientException {
        return getBillsWithHttpInfo(tenantId, name, startDate, endDate, systemGenerated).getBody();
    }

    /**
     * 
     * Get all the Bills
     * <p><b>200</b> - List of Bills
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name The Name of the Bill (optional)
     * @param startDate The timestamp of the start date of the meter (optional)
     * @param endDate The timestamp of the end date of the meter (optional)
     * @param systemGenerated Whether the bill is system generated. (optional)
     * @return ResponseEntity&lt;List&lt;TessellBillDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBillDTO>> getBillsWithHttpInfo(String tenantId, String name, BigDecimal startDate, BigDecimal endDate, Boolean systemGenerated) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getBills");
        }
        
        String path = apiClient.expandPath("/billing/bills", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "system-generated", systemGenerated));

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

    ParameterizedTypeReference<List<TessellBillDTO>> returnType = new ParameterizedTypeReference<List<TessellBillDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Returns the meter cost for this month.
     * <p><b>200</b> - meter cost for this month
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return TessellMonthlyCostInfoDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellMonthlyCostInfoDTO getCostTillDate(String tenantId) throws RestClientException {
        return getCostTillDateWithHttpInfo(tenantId).getBody();
    }

    /**
     * 
     * Returns the meter cost for this month.
     * <p><b>200</b> - meter cost for this month
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellMonthlyCostInfoDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellMonthlyCostInfoDTO> getCostTillDateWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getCostTillDate");
        }
        
        String path = apiClient.expandPath("/billing/cost-till-date", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellMonthlyCostInfoDTO> returnType = new ParameterizedTypeReference<TessellMonthlyCostInfoDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get credit by credit&#39;s Id that you want to fetch
     * <p><b>200</b> - Details of a credit
     * <p><b>0</b> - API error response
     * @param id Credit Id (required)
     * @param tenantId tenant-id (required)
     * @return TessellCreditDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCreditDTO getCredit(UUID id, String tenantId) throws RestClientException {
        return getCreditWithHttpInfo(id, tenantId).getBody();
    }

    /**
     * 
     * Get credit by credit&#39;s Id that you want to fetch
     * <p><b>200</b> - Details of a credit
     * <p><b>0</b> - API error response
     * @param id Credit Id (required)
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellCreditDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCreditDTO> getCreditWithHttpInfo(UUID id, String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling getCredit");
        }
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getCredit");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/billing/credits/{id}", uriVariables);

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

    ParameterizedTypeReference<TessellCreditDTO> returnType = new ParameterizedTypeReference<TessellCreditDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get all the tenant&#39;s credits provided by the tessell
     * <p><b>200</b> - List of Credits
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name Credit name (optional)
     * @param status Credit status (optional)
     * @param type Credit type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellCreditDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellCreditDTO> getCredits(String tenantId, String name, String status, String type, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getCreditsWithHttpInfo(tenantId, name, status, type, pageSize, pageOffset).getBody();
    }

    /**
     * 
     * Get all the tenant&#39;s credits provided by the tessell
     * <p><b>200</b> - List of Credits
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name Credit name (optional)
     * @param status Credit status (optional)
     * @param type Credit type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellCreditDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellCreditDTO>> getCreditsWithHttpInfo(String tenantId, String name, String status, String type, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getCredits");
        }
        
        String path = apiClient.expandPath("/billing/credits", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-size", pageSize));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page-offset", pageOffset));

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

    ParameterizedTypeReference<List<TessellCreditDTO>> returnType = new ParameterizedTypeReference<List<TessellCreditDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get a tenant&#39;s credits
     * <p><b>200</b> - List of Credits
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name Credit name (optional)
     * @param status Credit status (optional)
     * @param type Credit type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return List&lt;TessellCreditDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellCreditDTO> getCreditsInternal(String tenantId, String name, String status, String type, Integer pageSize, Integer pageOffset) throws RestClientException {
        return getCreditsInternalWithHttpInfo(tenantId, name, status, type, pageSize, pageOffset).getBody();
    }

    /**
     * 
     * Get a tenant&#39;s credits
     * <p><b>200</b> - List of Credits
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param name Credit name (optional)
     * @param status Credit status (optional)
     * @param type Credit type (optional)
     * @param pageSize Page size for get query (optional, default to 10)
     * @param pageOffset Page offset for get query (optional, default to 0)
     * @return ResponseEntity&lt;List&lt;TessellCreditDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellCreditDTO>> getCreditsInternalWithHttpInfo(String tenantId, String name, String status, String type, Integer pageSize, Integer pageOffset) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getCreditsInternal");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/credits", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "name", name));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "status", status));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "type", type));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "tenant-id", tenantId));
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

    ParameterizedTypeReference<List<TessellCreditDTO>> returnType = new ParameterizedTypeReference<List<TessellCreditDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get all hourly/daily/weekly/monthly Meters that include all usage and cost related details till date.
     * <p><b>200</b> - The list of Meter objects
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param subscriptionName The subscription name in the tenant (optional)
     * @param cloudType  (optional)
     * @param engine  (optional)
     * @param userName The User Name (optional)
     * @param startDate The timestamp of the start date of the meter (optional)
     * @param endDate The timestamp of the end date of the meter (optional)
     * @param entityType The Entity Type (optional)
     * @param entityName The name of the entity. Entity name will be compute resource name when entity type is COMPUTE_RESOURCE, backup name in case of BACKUP and am name in case of LOGS. (optional)
     * @param computeShape The compute shape of a database (optional)
     * @param serviceName The name of the service (optional)
     * @param availabilityMachineName The name of the availability machine (optional)
     * @param duration  (optional)
     * @param amDetails Whether or not to include backup and logs information along with AM. (optional)
     * @param serviceId The id of the service (optional)
     * @param availabilityMachineId The id of the availability machine (optional)
     * @return List&lt;TessellMeterDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellMeterDTO> getMeteringData(String tenantId, String subscriptionName, CloudType cloudType, DatabaseEngineType engine, String userName, BigDecimal startDate, BigDecimal endDate, TessellMeteringEntityType entityType, String entityName, String computeShape, String serviceName, String availabilityMachineName, MeterDuration duration, Boolean amDetails, UUID serviceId, UUID availabilityMachineId) throws RestClientException {
        return getMeteringDataWithHttpInfo(tenantId, subscriptionName, cloudType, engine, userName, startDate, endDate, entityType, entityName, computeShape, serviceName, availabilityMachineName, duration, amDetails, serviceId, availabilityMachineId).getBody();
    }

    /**
     * 
     * Get all hourly/daily/weekly/monthly Meters that include all usage and cost related details till date.
     * <p><b>200</b> - The list of Meter objects
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param subscriptionName The subscription name in the tenant (optional)
     * @param cloudType  (optional)
     * @param engine  (optional)
     * @param userName The User Name (optional)
     * @param startDate The timestamp of the start date of the meter (optional)
     * @param endDate The timestamp of the end date of the meter (optional)
     * @param entityType The Entity Type (optional)
     * @param entityName The name of the entity. Entity name will be compute resource name when entity type is COMPUTE_RESOURCE, backup name in case of BACKUP and am name in case of LOGS. (optional)
     * @param computeShape The compute shape of a database (optional)
     * @param serviceName The name of the service (optional)
     * @param availabilityMachineName The name of the availability machine (optional)
     * @param duration  (optional)
     * @param amDetails Whether or not to include backup and logs information along with AM. (optional)
     * @param serviceId The id of the service (optional)
     * @param availabilityMachineId The id of the availability machine (optional)
     * @return ResponseEntity&lt;List&lt;TessellMeterDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellMeterDTO>> getMeteringDataWithHttpInfo(String tenantId, String subscriptionName, CloudType cloudType, DatabaseEngineType engine, String userName, BigDecimal startDate, BigDecimal endDate, TessellMeteringEntityType entityType, String entityName, String computeShape, String serviceName, String availabilityMachineName, MeterDuration duration, Boolean amDetails, UUID serviceId, UUID availabilityMachineId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getMeteringData");
        }
        
        String path = apiClient.expandPath("/billing/meters", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "subscription-name", subscriptionName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "engine", engine));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "user-name", userName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "start-date", startDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "end-date", endDate));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-type", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-name", entityName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "compute-shape", computeShape));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-name", serviceName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availability-machine-name", availabilityMachineName));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "duration", duration));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "am-details", amDetails));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "service-id", serviceId));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "availability-machine-id", availabilityMachineId));

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

    ParameterizedTypeReference<List<TessellMeterDTO>> returnType = new ParameterizedTypeReference<List<TessellMeterDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get Tessell&#39;s billing rates for all computes and storage
     * <p><b>200</b> - The list of Tessell billing rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param cloudType  (optional)
     * @param entityType  (optional)
     * @param entityName  (optional)
     * @return List&lt;TessellBillingRateCardDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBillingRateCardDTO> getRates(String tenantId, CloudType cloudType, TessellBillingEntityType entityType, TessellMeteringRateCardEntityName entityName) throws RestClientException {
        return getRatesWithHttpInfo(tenantId, cloudType, entityType, entityName).getBody();
    }

    /**
     * 
     * Get Tessell&#39;s billing rates for all computes and storage
     * <p><b>200</b> - The list of Tessell billing rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param cloudType  (optional)
     * @param entityType  (optional)
     * @param entityName  (optional)
     * @return ResponseEntity&lt;List&lt;TessellBillingRateCardDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBillingRateCardDTO>> getRatesWithHttpInfo(String tenantId, CloudType cloudType, TessellBillingEntityType entityType, TessellMeteringRateCardEntityName entityName) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getRates");
        }
        
        String path = apiClient.expandPath("/billing/rates", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "cloud-type", cloudType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-type", entityType));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "entity-name", entityName));

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

    ParameterizedTypeReference<List<TessellBillingRateCardDTO>> returnType = new ParameterizedTypeReference<List<TessellBillingRateCardDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Get tenant discount percentage
     * <p><b>200</b> - The list of Tessell billing rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return TessellDiscountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDiscountDTO getTenantDiscount(String tenantId) throws RestClientException {
        return getTenantDiscountWithHttpInfo(tenantId).getBody();
    }

    /**
     * 
     * Get tenant discount percentage
     * <p><b>200</b> - The list of Tessell billing rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @return ResponseEntity&lt;TessellDiscountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDiscountDTO> getTenantDiscountWithHttpInfo(String tenantId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling getTenantDiscount");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/discounts", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<TessellDiscountDTO> returnType = new ParameterizedTypeReference<TessellDiscountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Start hourly metering job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void hourlyMeter() throws RestClientException {
        hourlyMeterWithHttpInfo();
    }

    /**
     * 
     * Start hourly metering job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> hourlyMeterWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/meters/hourly", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Start monthly meter aggregator job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void monthlyAggregator() throws RestClientException {
        monthlyAggregatorWithHttpInfo();
    }

    /**
     * 
     * Start monthly meter aggregator job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> monthlyAggregatorWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/meters/monthly", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Start monthly billing job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void monthlyBilling() throws RestClientException {
        monthlyBillingWithHttpInfo();
    }

    /**
     * 
     * Start monthly billing job
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> monthlyBillingWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/billing/monthly", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * send notification to recipients
     * <p><b>200</b> - successfully sent the notification
     * <p><b>0</b> - API error response
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void sendInvoiceNotification() throws RestClientException {
        sendInvoiceNotificationWithHttpInfo();
    }

    /**
     * 
     * send notification to recipients
     * <p><b>200</b> - successfully sent the notification
     * <p><b>0</b> - API error response
     * @return ResponseEntity&lt;Void&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<Void> sendInvoiceNotificationWithHttpInfo() throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/tessell-ops/billing/notification", Collections.<String, Object>emptyMap());

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

    ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update Billing profile that include billing address and payment details
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingProfileDTO Update billing profile entry (required)
     * @return TessellBillingProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBillingProfileDTO updateBillingProfile(String tenantId, TessellBillingProfileDTO tessellBillingProfileDTO) throws RestClientException {
        return updateBillingProfileWithHttpInfo(tenantId, tessellBillingProfileDTO).getBody();
    }

    /**
     * 
     * Update Billing profile that include billing address and payment details
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingProfileDTO Update billing profile entry (required)
     * @return ResponseEntity&lt;TessellBillingProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBillingProfileDTO> updateBillingProfileWithHttpInfo(String tenantId, TessellBillingProfileDTO tessellBillingProfileDTO) throws RestClientException {
        Object postBody = tessellBillingProfileDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateBillingProfile");
        }
        
        // verify the required parameter 'tessellBillingProfileDTO' is set
        if (tessellBillingProfileDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBillingProfileDTO' when calling updateBillingProfile");
        }
        
        String path = apiClient.expandPath("/billing/profile", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBillingProfileDTO> returnType = new ParameterizedTypeReference<TessellBillingProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update credit entry
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Credit Id (required)
     * @param tessellCreditDTO Update credit entry (required)
     * @return TessellCreditDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellCreditDTO updateCreditEntity(String tenantId, UUID id, TessellCreditDTO tessellCreditDTO) throws RestClientException {
        return updateCreditEntityWithHttpInfo(tenantId, id, tessellCreditDTO).getBody();
    }

    /**
     * 
     * Update credit entry
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param id Credit Id (required)
     * @param tessellCreditDTO Update credit entry (required)
     * @return ResponseEntity&lt;TessellCreditDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellCreditDTO> updateCreditEntityWithHttpInfo(String tenantId, UUID id, TessellCreditDTO tessellCreditDTO) throws RestClientException {
        Object postBody = tessellCreditDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateCreditEntity");
        }
        
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'id' when calling updateCreditEntity");
        }
        
        // verify the required parameter 'tessellCreditDTO' is set
        if (tessellCreditDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellCreditDTO' when calling updateCreditEntity");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("id", id);
        String path = apiClient.expandPath("/tessell-ops/billing/credits/{id}", uriVariables);

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellCreditDTO> returnType = new ParameterizedTypeReference<TessellCreditDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update billing profile internal
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingProfileDTO Update billing profile entry (required)
     * @return TessellBillingProfileDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellBillingProfileDTO updateProfileInternal(String tenantId, TessellBillingProfileDTO tessellBillingProfileDTO) throws RestClientException {
        return updateProfileInternalWithHttpInfo(tenantId, tessellBillingProfileDTO).getBody();
    }

    /**
     * 
     * Update billing profile internal
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingProfileDTO Update billing profile entry (required)
     * @return ResponseEntity&lt;TessellBillingProfileDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellBillingProfileDTO> updateProfileInternalWithHttpInfo(String tenantId, TessellBillingProfileDTO tessellBillingProfileDTO) throws RestClientException {
        Object postBody = tessellBillingProfileDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateProfileInternal");
        }
        
        // verify the required parameter 'tessellBillingProfileDTO' is set
        if (tessellBillingProfileDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBillingProfileDTO' when calling updateProfileInternal");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/profile", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellBillingProfileDTO> returnType = new ParameterizedTypeReference<TessellBillingProfileDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update rate card
     * <p><b>200</b> - Updated rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingRateCardDTO Update rates (required)
     * @return List&lt;TessellBillingRateCardDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<TessellBillingRateCardDTO> updateRates(String tenantId, List<TessellBillingRateCardDTO> tessellBillingRateCardDTO) throws RestClientException {
        return updateRatesWithHttpInfo(tenantId, tessellBillingRateCardDTO).getBody();
    }

    /**
     * 
     * Update rate card
     * <p><b>200</b> - Updated rates
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellBillingRateCardDTO Update rates (required)
     * @return ResponseEntity&lt;List&lt;TessellBillingRateCardDTO&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<TessellBillingRateCardDTO>> updateRatesWithHttpInfo(String tenantId, List<TessellBillingRateCardDTO> tessellBillingRateCardDTO) throws RestClientException {
        Object postBody = tessellBillingRateCardDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateRates");
        }
        
        // verify the required parameter 'tessellBillingRateCardDTO' is set
        if (tessellBillingRateCardDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellBillingRateCardDTO' when calling updateRates");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/rates", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<List<TessellBillingRateCardDTO>> returnType = new ParameterizedTypeReference<List<TessellBillingRateCardDTO>>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update tenant discount percentage
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellDiscountDTO Update tenant discount percentage (required)
     * @return TessellDiscountDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellDiscountDTO updateTenantDiscount(String tenantId, TessellDiscountDTO tessellDiscountDTO) throws RestClientException {
        return updateTenantDiscountWithHttpInfo(tenantId, tessellDiscountDTO).getBody();
    }

    /**
     * 
     * Update tenant discount percentage
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellDiscountDTO Update tenant discount percentage (required)
     * @return ResponseEntity&lt;TessellDiscountDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellDiscountDTO> updateTenantDiscountWithHttpInfo(String tenantId, TessellDiscountDTO tessellDiscountDTO) throws RestClientException {
        Object postBody = tessellDiscountDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateTenantDiscount");
        }
        
        // verify the required parameter 'tessellDiscountDTO' is set
        if (tessellDiscountDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellDiscountDTO' when calling updateTenantDiscount");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/discounts", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellDiscountDTO> returnType = new ParameterizedTypeReference<TessellDiscountDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
    /**
     * 
     * Update tenant invoice config
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellInvoiceConfigDTO Update tenant invoice config (required)
     * @return TessellInvoiceConfigDTO
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public TessellInvoiceConfigDTO updateTenantInvoiceConfig(String tenantId, TessellInvoiceConfigDTO tessellInvoiceConfigDTO) throws RestClientException {
        return updateTenantInvoiceConfigWithHttpInfo(tenantId, tessellInvoiceConfigDTO).getBody();
    }

    /**
     * 
     * Update tenant invoice config
     * <p><b>200</b> - OK
     * <p><b>0</b> - API error response
     * @param tenantId tenant-id (required)
     * @param tessellInvoiceConfigDTO Update tenant invoice config (required)
     * @return ResponseEntity&lt;TessellInvoiceConfigDTO&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<TessellInvoiceConfigDTO> updateTenantInvoiceConfigWithHttpInfo(String tenantId, TessellInvoiceConfigDTO tessellInvoiceConfigDTO) throws RestClientException {
        Object postBody = tessellInvoiceConfigDTO;
        
        // verify the required parameter 'tenantId' is set
        if (tenantId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tenantId' when calling updateTenantInvoiceConfig");
        }
        
        // verify the required parameter 'tessellInvoiceConfigDTO' is set
        if (tessellInvoiceConfigDTO == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'tessellInvoiceConfigDTO' when calling updateTenantInvoiceConfig");
        }
        
        String path = apiClient.expandPath("/tessell-ops/billing/invoices", Collections.<String, Object>emptyMap());

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
        final String[] contentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

    // Read context from thread context and copy it to request headers
    headerParams.setAll(APIContextPropagation.getTraceHeaders());
    headerParams.setAll(APIContextPropagation.getContextHeaders());

    ParameterizedTypeReference<TessellInvoiceConfigDTO> returnType = new ParameterizedTypeReference<TessellInvoiceConfigDTO>() {};
        return apiClient.invokeAPI(path, HttpMethod.PATCH, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, authNames, returnType);
    }
}
