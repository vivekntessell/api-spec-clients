/*
 * Tessell Monitoring Service API
 * Monitoring API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.monitoring.client.model;

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
 * PatchMonitoringFeaturePayload
 */
@JsonPropertyOrder({
  PatchMonitoringFeaturePayload.JSON_PROPERTY_ENABLE
})
@JsonTypeName("PatchMonitoringFeaturePayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchMonitoringFeaturePayload {
  public static final String JSON_PROPERTY_ENABLE = "enable";
  private Boolean enable = false;


  public PatchMonitoringFeaturePayload enable(Boolean enable) {
    
    this.enable = enable;
    return this;
  }

   /**
   * Get enable
   * @return enable
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getEnable() {
    return enable;
  }


  @JsonProperty(JSON_PROPERTY_ENABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEnable(Boolean enable) {
    this.enable = enable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchMonitoringFeaturePayload patchMonitoringFeaturePayload = (PatchMonitoringFeaturePayload) o;
    return Objects.equals(this.enable, patchMonitoringFeaturePayload.enable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchMonitoringFeaturePayload {\n");
    sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
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

