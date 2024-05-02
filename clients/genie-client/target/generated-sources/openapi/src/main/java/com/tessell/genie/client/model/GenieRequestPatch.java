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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Patch for genie request
 */
@ApiModel(description = "Patch for genie request")
@JsonPropertyOrder({
  GenieRequestPatch.JSON_PROPERTY_REQUEST_I_D,
  GenieRequestPatch.JSON_PROPERTY_EXPIRY_IN_MINUTES,
  GenieRequestPatch.JSON_PROPERTY_COMPUTE_RESOURCE_IDS
})
@JsonTypeName("GenieRequestPatch")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:49.034198+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class GenieRequestPatch {
  public static final String JSON_PROPERTY_REQUEST_I_D = "requestID";
  private String requestID;

  public static final String JSON_PROPERTY_EXPIRY_IN_MINUTES = "expiryInMinutes";
  private Integer expiryInMinutes = 60;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_IDS = "computeResourceIds";
  private List<String> computeResourceIds = null;


  public GenieRequestPatch requestID(String requestID) {
    
    this.requestID = requestID;
    return this;
  }

   /**
   * Request ID for which Genie has to be extended
   * @return requestID
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Request ID for which Genie has to be extended")
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


  public GenieRequestPatch expiryInMinutes(Integer expiryInMinutes) {
    
    this.expiryInMinutes = expiryInMinutes;
    return this;
  }

   /**
   * Get expiryInMinutes
   * minimum: 60
   * @return expiryInMinutes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXPIRY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getExpiryInMinutes() {
    return expiryInMinutes;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRY_IN_MINUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpiryInMinutes(Integer expiryInMinutes) {
    this.expiryInMinutes = expiryInMinutes;
  }


  public GenieRequestPatch computeResourceIds(List<String> computeResourceIds) {
    
    this.computeResourceIds = computeResourceIds;
    return this;
  }

  public GenieRequestPatch addComputeResourceIdsItem(String computeResourceIdsItem) {
    if (this.computeResourceIds == null) {
      this.computeResourceIds = new ArrayList<>();
    }
    this.computeResourceIds.add(computeResourceIdsItem);
    return this;
  }

   /**
   * Computes for which Genie is to be enabled
   * @return computeResourceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Computes for which Genie is to be enabled")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getComputeResourceIds() {
    return computeResourceIds;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResourceIds(List<String> computeResourceIds) {
    this.computeResourceIds = computeResourceIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenieRequestPatch genieRequestPatch = (GenieRequestPatch) o;
    return Objects.equals(this.requestID, genieRequestPatch.requestID) &&
        Objects.equals(this.expiryInMinutes, genieRequestPatch.expiryInMinutes) &&
        Objects.equals(this.computeResourceIds, genieRequestPatch.computeResourceIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestID, expiryInMinutes, computeResourceIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenieRequestPatch {\n");
    sb.append("    requestID: ").append(toIndentedString(requestID)).append("\n");
    sb.append("    expiryInMinutes: ").append(toIndentedString(expiryInMinutes)).append("\n");
    sb.append("    computeResourceIds: ").append(toIndentedString(computeResourceIds)).append("\n");
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
