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
import com.tessell.database.system.client.model.TimingEstimatePerformanceShapeConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TimingEstimatePerformanceConfig
 */
@JsonPropertyOrder({
  TimingEstimatePerformanceConfig.JSON_PROPERTY_STANDARD,
  TimingEstimatePerformanceConfig.JSON_PROPERTY_T_S_M
})
@JsonTypeName("TimingEstimatePerformanceConfig")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimingEstimatePerformanceConfig {
  public static final String JSON_PROPERTY_STANDARD = "standard";
  private TimingEstimatePerformanceShapeConfig standard;

  public static final String JSON_PROPERTY_T_S_M = "TSM";
  private TimingEstimatePerformanceShapeConfig TSM;


  public TimingEstimatePerformanceConfig standard(TimingEstimatePerformanceShapeConfig standard) {
    
    this.standard = standard;
    return this;
  }

   /**
   * Get standard
   * @return standard
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimingEstimatePerformanceShapeConfig getStandard() {
    return standard;
  }


  @JsonProperty(JSON_PROPERTY_STANDARD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStandard(TimingEstimatePerformanceShapeConfig standard) {
    this.standard = standard;
  }


  public TimingEstimatePerformanceConfig TSM(TimingEstimatePerformanceShapeConfig TSM) {
    
    this.TSM = TSM;
    return this;
  }

   /**
   * Get TSM
   * @return TSM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TimingEstimatePerformanceShapeConfig getTSM() {
    return TSM;
  }


  @JsonProperty(JSON_PROPERTY_T_S_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTSM(TimingEstimatePerformanceShapeConfig TSM) {
    this.TSM = TSM;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimingEstimatePerformanceConfig timingEstimatePerformanceConfig = (TimingEstimatePerformanceConfig) o;
    return Objects.equals(this.standard, timingEstimatePerformanceConfig.standard) &&
        Objects.equals(this.TSM, timingEstimatePerformanceConfig.TSM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(standard, TSM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimingEstimatePerformanceConfig {\n");
    sb.append("    standard: ").append(toIndentedString(standard)).append("\n");
    sb.append("    TSM: ").append(toIndentedString(TSM)).append("\n");
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

