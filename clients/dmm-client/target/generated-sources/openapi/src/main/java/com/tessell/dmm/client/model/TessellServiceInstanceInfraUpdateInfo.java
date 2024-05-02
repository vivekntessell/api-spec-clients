/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

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
 * TessellServiceInstanceInfraUpdateInfo
 */
@JsonPropertyOrder({
  TessellServiceInstanceInfraUpdateInfo.JSON_PROPERTY_COMPUTE_TYPE
})
@JsonTypeName("TessellServiceInstanceInfraUpdateInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceInstanceInfraUpdateInfo {
  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;


  public TessellServiceInstanceInfraUpdateInfo computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * Get computeType
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputeType() {
    return computeType;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceInstanceInfraUpdateInfo tessellServiceInstanceInfraUpdateInfo = (TessellServiceInstanceInfraUpdateInfo) o;
    return Objects.equals(this.computeType, tessellServiceInstanceInfraUpdateInfo.computeType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(computeType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceInstanceInfraUpdateInfo {\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
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

