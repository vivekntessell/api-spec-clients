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
import com.tessell.genie.client.model.ArgoWorkflowStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * UpdateConnectivityCallbackPayload
 */
@JsonPropertyOrder({
  UpdateConnectivityCallbackPayload.JSON_PROPERTY_STATUS,
  UpdateConnectivityCallbackPayload.JSON_PROPERTY_PAYLOAD
})
@JsonTypeName("UpdateConnectivityCallbackPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:49.034198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateConnectivityCallbackPayload {
  public static final String JSON_PROPERTY_STATUS = "status";
  private ArgoWorkflowStatus status;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Object payload;


  public UpdateConnectivityCallbackPayload status(ArgoWorkflowStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ArgoWorkflowStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ArgoWorkflowStatus status) {
    this.status = status;
  }


  public UpdateConnectivityCallbackPayload payload(Object payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(Object payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateConnectivityCallbackPayload updateConnectivityCallbackPayload = (UpdateConnectivityCallbackPayload) o;
    return Objects.equals(this.status, updateConnectivityCallbackPayload.status) &&
        Objects.equals(this.payload, updateConnectivityCallbackPayload.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateConnectivityCallbackPayload {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

