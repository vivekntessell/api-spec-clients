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
import com.tessell.monitoring.client.model.TopProcessesMetricValueOps;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TopProcessesMetricOps
 */
@JsonPropertyOrder({
  TopProcessesMetricOps.JSON_PROPERTY_METRIC_NAME,
  TopProcessesMetricOps.JSON_PROPERTY_METRIC_VALUES
})
@JsonTypeName("TopProcessesMetricOps")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopProcessesMetricOps {
  public static final String JSON_PROPERTY_METRIC_NAME = "metricName";
  private String metricName;

  public static final String JSON_PROPERTY_METRIC_VALUES = "metricValues";
  private List<TopProcessesMetricValueOps> metricValues = null;


  public TopProcessesMetricOps metricName(String metricName) {
    
    this.metricName = metricName;
    return this;
  }

   /**
   * Get metricName
   * @return metricName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMetricName() {
    return metricName;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricName(String metricName) {
    this.metricName = metricName;
  }


  public TopProcessesMetricOps metricValues(List<TopProcessesMetricValueOps> metricValues) {
    
    this.metricValues = metricValues;
    return this;
  }

  public TopProcessesMetricOps addMetricValuesItem(TopProcessesMetricValueOps metricValuesItem) {
    if (this.metricValues == null) {
      this.metricValues = new ArrayList<>();
    }
    this.metricValues.add(metricValuesItem);
    return this;
  }

   /**
   * Get metricValues
   * @return metricValues
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TopProcessesMetricValueOps> getMetricValues() {
    return metricValues;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_VALUES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricValues(List<TopProcessesMetricValueOps> metricValues) {
    this.metricValues = metricValues;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopProcessesMetricOps topProcessesMetricOps = (TopProcessesMetricOps) o;
    return Objects.equals(this.metricName, topProcessesMetricOps.metricName) &&
        Objects.equals(this.metricValues, topProcessesMetricOps.metricValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metricName, metricValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopProcessesMetricOps {\n");
    sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
    sb.append("    metricValues: ").append(toIndentedString(metricValues)).append("\n");
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
