/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.database.system.client.model.ApiErrorDetails;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Common error response object for non 2xx responses
 */
@ApiModel(description = "Common error response object for non 2xx responses")
@JsonPropertyOrder({
  ApiError.JSON_PROPERTY_CODE,
  ApiError.JSON_PROPERTY_MESSAGE,
  ApiError.JSON_PROPERTY_DETAILS,
  ApiError.JSON_PROPERTY_DEFAULT_CODE_SET,
  ApiError.JSON_PROPERTY_CONTEXT_ID,
  ApiError.JSON_PROPERTY_SESSION_ID
})
@JsonTypeName("ApiError")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApiError {
  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private ApiErrorDetails details;

  public static final String JSON_PROPERTY_DEFAULT_CODE_SET = "defaultCodeSet";
  private Boolean defaultCodeSet;

  public static final String JSON_PROPERTY_CONTEXT_ID = "contextId";
  private String contextId;

  public static final String JSON_PROPERTY_SESSION_ID = "sessionId";
  private String sessionId;


  public ApiError code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Status code for the error response
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status code for the error response")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public ApiError message(String message) {
    
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


  public ApiError details(ApiErrorDetails details) {
    
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

  public ApiErrorDetails getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(ApiErrorDetails details) {
    this.details = details;
  }


  public ApiError defaultCodeSet(Boolean defaultCodeSet) {
    
    this.defaultCodeSet = defaultCodeSet;
    return this;
  }

   /**
   * Get defaultCodeSet
   * @return defaultCodeSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEFAULT_CODE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDefaultCodeSet() {
    return defaultCodeSet;
  }


  @JsonProperty(JSON_PROPERTY_DEFAULT_CODE_SET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDefaultCodeSet(Boolean defaultCodeSet) {
    this.defaultCodeSet = defaultCodeSet;
  }


  public ApiError contextId(String contextId) {
    
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


  public ApiError sessionId(String sessionId) {
    
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
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.code, apiError.code) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.details, apiError.details) &&
        Objects.equals(this.defaultCodeSet, apiError.defaultCodeSet) &&
        Objects.equals(this.contextId, apiError.contextId) &&
        Objects.equals(this.sessionId, apiError.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, details, defaultCodeSet, contextId, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    defaultCodeSet: ").append(toIndentedString(defaultCodeSet)).append("\n");
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

