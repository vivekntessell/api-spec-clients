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
import com.tessell.monitoring.client.model.TopDimensionSlicedMetricValue;
import com.tessell.monitoring.client.model.TopDimensionsAdditionalMetricValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TopDimensionsMetricValue
 */
@JsonPropertyOrder({
  TopDimensionsMetricValue.JSON_PROPERTY_ADDITIONAL_METRICS,
  TopDimensionsMetricValue.JSON_PROPERTY_VALUE,
  TopDimensionsMetricValue.JSON_PROPERTY_METRIC_DISTRIBUTION
})
@JsonTypeName("TopDimensionsMetricValue")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TopDimensionsMetricValue {
  public static final String JSON_PROPERTY_ADDITIONAL_METRICS = "additionalMetrics";
  private List<TopDimensionsAdditionalMetricValue> additionalMetrics = null;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_METRIC_DISTRIBUTION = "metricDistribution";
  private List<TopDimensionSlicedMetricValue> metricDistribution = null;


  public TopDimensionsMetricValue additionalMetrics(List<TopDimensionsAdditionalMetricValue> additionalMetrics) {
    
    this.additionalMetrics = additionalMetrics;
    return this;
  }

  public TopDimensionsMetricValue addAdditionalMetricsItem(TopDimensionsAdditionalMetricValue additionalMetricsItem) {
    if (this.additionalMetrics == null) {
      this.additionalMetrics = new ArrayList<>();
    }
    this.additionalMetrics.add(additionalMetricsItem);
    return this;
  }

   /**
   * Any additional metrics associated with the entity
   * @return additionalMetrics
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Any additional metrics associated with the entity")
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TopDimensionsAdditionalMetricValue> getAdditionalMetrics() {
    return additionalMetrics;
  }


  @JsonProperty(JSON_PROPERTY_ADDITIONAL_METRICS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAdditionalMetrics(List<TopDimensionsAdditionalMetricValue> additionalMetrics) {
    this.additionalMetrics = additionalMetrics;
  }


  public TopDimensionsMetricValue value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Value of the top dimension entity
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value of the top dimension entity")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  public TopDimensionsMetricValue metricDistribution(List<TopDimensionSlicedMetricValue> metricDistribution) {
    
    this.metricDistribution = metricDistribution;
    return this;
  }

  public TopDimensionsMetricValue addMetricDistributionItem(TopDimensionSlicedMetricValue metricDistributionItem) {
    if (this.metricDistribution == null) {
      this.metricDistribution = new ArrayList<>();
    }
    this.metricDistribution.add(metricDistributionItem);
    return this;
  }

   /**
   * Distribution of Load across different entities as categorized by the specified slice by parameter.
   * @return metricDistribution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Distribution of Load across different entities as categorized by the specified slice by parameter.")
  @JsonProperty(JSON_PROPERTY_METRIC_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TopDimensionSlicedMetricValue> getMetricDistribution() {
    return metricDistribution;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_DISTRIBUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetricDistribution(List<TopDimensionSlicedMetricValue> metricDistribution) {
    this.metricDistribution = metricDistribution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TopDimensionsMetricValue topDimensionsMetricValue = (TopDimensionsMetricValue) o;
    return Objects.equals(this.additionalMetrics, topDimensionsMetricValue.additionalMetrics) &&
        Objects.equals(this.value, topDimensionsMetricValue.value) &&
        Objects.equals(this.metricDistribution, topDimensionsMetricValue.metricDistribution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMetrics, value, metricDistribution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TopDimensionsMetricValue {\n");
    sb.append("    additionalMetrics: ").append(toIndentedString(additionalMetrics)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    metricDistribution: ").append(toIndentedString(metricDistribution)).append("\n");
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

