/*
 * Software Library Governance Service API Documentation
 * Software Library Governance Service API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.softwarelib.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.softwarelib.client.model.TessellApiErrorDTO;
import com.tessell.softwarelib.client.model.TessellApiErrorDetailsDTO;
import com.tessell.softwarelib.client.model.TessellTessellErrorCodeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Common error response object for non 2xx responses of internal or ops APIs
 */
@ApiModel(description = "Common error response object for non 2xx responses of internal or ops APIs")
@JsonPropertyOrder({
  TessellApiErrorOpsDTO.JSON_PROPERTY_ERROR_CODE,
  TessellApiErrorOpsDTO.JSON_PROPERTY_MESSAGE,
  TessellApiErrorOpsDTO.JSON_PROPERTY_DETAILS,
  TessellApiErrorOpsDTO.JSON_PROPERTY_SERVICE_EXCEPTION,
  TessellApiErrorOpsDTO.JSON_PROPERTY_CONTEXT_ID,
  TessellApiErrorOpsDTO.JSON_PROPERTY_SESSION_ID
})
@JsonTypeName("ApiErrorOps")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellApiErrorOpsDTO {
  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private TessellTessellErrorCodeDTO errorCode;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private TessellApiErrorDetailsDTO details;

  public static final String JSON_PROPERTY_SERVICE_EXCEPTION = "serviceException";
  private TessellApiErrorDTO serviceException;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private String sessionId;


  public TessellApiErrorOpsDTO errorCode(TessellTessellErrorCodeDTO errorCode) {
    
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellTessellErrorCodeDTO getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setErrorCode(TessellTessellErrorCodeDTO errorCode) {
    this.errorCode = errorCode;
  }


  public TessellApiErrorOpsDTO message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Error message for API response
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Error message for API response")
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMessage() {
    return message;
  }


  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMessage(String message) {
    this.message = message;
  }


  public TessellApiErrorOpsDTO details(TessellApiErrorDetailsDTO details) {
    
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellApiErrorDetailsDTO getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(TessellApiErrorDetailsDTO details) {
    this.details = details;
  }


  public TessellApiErrorOpsDTO serviceException(TessellApiErrorDTO serviceException) {
    
    this.serviceException = serviceException;
    return this;
  }

   /**
   * Get serviceException
   * @return serviceException
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellApiErrorDTO getServiceException() {
    return serviceException;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_EXCEPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setServiceException(TessellApiErrorDTO serviceException) {
    this.serviceException = serviceException;
  }


  public TessellApiErrorOpsDTO contextId(String contextId) {
    
    this.contextId = contextId;
    return this;
  }

   /**
   * ContextId of API request
   * @return contextId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ContextId of API request")
  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextId() {
    return contextId;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  public TessellApiErrorOpsDTO sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * SessionId of API request
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "SessionId of API request")
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellApiErrorOpsDTO apiErrorOps = (TessellApiErrorOpsDTO) o;
    return Objects.equals(this.errorCode, apiErrorOps.errorCode) &&
        Objects.equals(this.message, apiErrorOps.message) &&
        Objects.equals(this.details, apiErrorOps.details) &&
        Objects.equals(this.serviceException, apiErrorOps.serviceException) &&
        Objects.equals(this.contextId, apiErrorOps.contextId) &&
        Objects.equals(this.sessionId, apiErrorOps.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, message, details, serviceException, contextId, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellApiErrorOpsDTO {\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    serviceException: ").append(toIndentedString(serviceException)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

