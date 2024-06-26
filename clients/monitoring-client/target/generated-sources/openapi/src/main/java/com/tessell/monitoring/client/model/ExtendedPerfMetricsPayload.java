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
import com.tessell.monitoring.client.model.PerfMetricType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * ExtendedPerfMetricsPayload
 */
@JsonPropertyOrder({
  ExtendedPerfMetricsPayload.JSON_PROPERTY_SERVICE_ID,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_SERVICE_INSTANCE_ID,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_START_TIME,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_END_TIME,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_METRIC_TYPE,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_METRIC_VALUE,
  ExtendedPerfMetricsPayload.JSON_PROPERTY_LIMIT
})
@JsonTypeName("ExtendedPerfMetricsPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ExtendedPerfMetricsPayload {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_SERVICE_INSTANCE_ID = "serviceInstanceId";
  private UUID serviceInstanceId;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_METRIC_TYPE = "metricType";
  private PerfMetricType metricType;

  public static final String JSON_PROPERTY_METRIC_VALUE = "metricValue";
  private String metricValue;

  public static final String JSON_PROPERTY_LIMIT = "limit";
  private Integer limit = 10;


  public ExtendedPerfMetricsPayload serviceId(UUID serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * The ID of the DB Service.
   * @return serviceId
  **/
  @ApiModelProperty(required = true, value = "The ID of the DB Service.")
  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getServiceId() {
    return serviceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceId(UUID serviceId) {
    this.serviceId = serviceId;
  }


  public ExtendedPerfMetricsPayload serviceInstanceId(UUID serviceInstanceId) {
    
    this.serviceInstanceId = serviceInstanceId;
    return this;
  }

   /**
   * The ID of the DB Service Instance.
   * @return serviceInstanceId
  **/
  @ApiModelProperty(required = true, value = "The ID of the DB Service Instance.")
  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public UUID getServiceInstanceId() {
    return serviceInstanceId;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setServiceInstanceId(UUID serviceInstanceId) {
    this.serviceInstanceId = serviceInstanceId;
  }


  public ExtendedPerfMetricsPayload startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Start timestamp in prometheus date-time format
   * @return startTime
  **/
  @ApiModelProperty(required = true, value = "Start timestamp in prometheus date-time format")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ExtendedPerfMetricsPayload endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * End timestamp in prometheus date-time format
   * @return endTime
  **/
  @ApiModelProperty(required = true, value = "End timestamp in prometheus date-time format")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ExtendedPerfMetricsPayload metricType(PerfMetricType metricType) {
    
    this.metricType = metricType;
    return this;
  }

   /**
   * Get metricType
   * @return metricType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PerfMetricType getMetricType() {
    return metricType;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricType(PerfMetricType metricType) {
    this.metricType = metricType;
  }


  public ExtendedPerfMetricsPayload metricValue(String metricValue) {
    
    this.metricValue = metricValue;
    return this;
  }

   /**
   * Value of the metric of which the extended metrics to be fetched
   * @return metricValue
  **/
  @ApiModelProperty(required = true, value = "Value of the metric of which the extended metrics to be fetched")
  @JsonProperty(JSON_PROPERTY_METRIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMetricValue() {
    return metricValue;
  }


  @JsonProperty(JSON_PROPERTY_METRIC_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMetricValue(String metricValue) {
    this.metricValue = metricValue;
  }


  public ExtendedPerfMetricsPayload limit(Integer limit) {
    
    this.limit = limit;
    return this;
  }

   /**
   * Number of metrics to be fetched
   * minimum: 1
   * maximum: 100
   * @return limit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of metrics to be fetched")
  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLimit() {
    return limit;
  }


  @JsonProperty(JSON_PROPERTY_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLimit(Integer limit) {
    this.limit = limit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedPerfMetricsPayload extendedPerfMetricsPayload = (ExtendedPerfMetricsPayload) o;
    return Objects.equals(this.serviceId, extendedPerfMetricsPayload.serviceId) &&
        Objects.equals(this.serviceInstanceId, extendedPerfMetricsPayload.serviceInstanceId) &&
        Objects.equals(this.startTime, extendedPerfMetricsPayload.startTime) &&
        Objects.equals(this.endTime, extendedPerfMetricsPayload.endTime) &&
        Objects.equals(this.metricType, extendedPerfMetricsPayload.metricType) &&
        Objects.equals(this.metricValue, extendedPerfMetricsPayload.metricValue) &&
        Objects.equals(this.limit, extendedPerfMetricsPayload.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, serviceInstanceId, startTime, endTime, metricType, metricValue, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedPerfMetricsPayload {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
    sb.append("    metricValue: ").append(toIndentedString(metricValue)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

