/*
 * API spec for Tessell Genie Service
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.genie.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * GenieDisablePayload
 */
@JsonPropertyOrder({
  GenieDisablePayload.JSON_PROPERTY_REQUEST_I_D,
  GenieDisablePayload.JSON_PROPERTY_IS_DECLINED
})
@JsonTypeName("GenieDisablePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:49.034198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenieDisablePayload {
  public static final String JSON_PROPERTY_REQUEST_I_D = "requestID";
  private String requestID;

  public static final String JSON_PROPERTY_IS_DECLINED = "isDeclined";
  private Boolean isDeclined = false;


  public GenieDisablePayload requestID(String requestID) {
    
    this.requestID = requestID;
    return this;
  }

   /**
   * Request ID for which Genie is to be disabled
   * @return requestID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request ID for which Genie is to be disabled")
  @JsonProperty(JSON_PROPERTY_REQUEST_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRequestID() {
    return requestID;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRequestID(String requestID) {
    this.requestID = requestID;
  }


  public GenieDisablePayload isDeclined(Boolean isDeclined) {
    
    this.isDeclined = isDeclined;
    return this;
  }

   /**
   * is genie request declined
   * @return isDeclined
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "is genie request declined")
  @JsonProperty(JSON_PROPERTY_IS_DECLINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDeclined() {
    return isDeclined;
  }


  @JsonProperty(JSON_PROPERTY_IS_DECLINED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDeclined(Boolean isDeclined) {
    this.isDeclined = isDeclined;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenieDisablePayload genieDisablePayload = (GenieDisablePayload) o;
    return Objects.equals(this.requestID, genieDisablePayload.requestID) &&
        Objects.equals(this.isDeclined, genieDisablePayload.isDeclined);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestID, isDeclined);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenieDisablePayload {\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    isDeclined: ").append(toIndentedString(isDeclined)).append("\n");
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
