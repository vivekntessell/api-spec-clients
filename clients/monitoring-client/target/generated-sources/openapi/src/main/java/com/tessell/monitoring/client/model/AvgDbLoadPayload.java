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
import com.tessell.monitoring.client.model.MonitoringFilterBy;
import com.tessell.monitoring.client.model.MonitoringSliceBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AvgDbLoadPayload
 */
@JsonPropertyOrder({
  AvgDbLoadPayload.JSON_PROPERTY_SERVICE_ID,
  AvgDbLoadPayload.JSON_PROPERTY_SERVICE_INSTANCE_ID,
  AvgDbLoadPayload.JSON_PROPERTY_START_TIME,
  AvgDbLoadPayload.JSON_PROPERTY_END_TIME,
  AvgDbLoadPayload.JSON_PROPERTY_SLICE_BY,
  AvgDbLoadPayload.JSON_PROPERTY_FILTER_BY,
  AvgDbLoadPayload.JSON_PROPERTY_STEP
})
@JsonTypeName("AvgDbLoadPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AvgDbLoadPayload {
  public static final String JSON_PROPERTY_SERVICE_ID = "serviceId";
  private UUID serviceId;

  public static final String JSON_PROPERTY_SERVICE_INSTANCE_ID = "serviceInstanceId";
  private UUID serviceInstanceId;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private String startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private String endTime;

  public static final String JSON_PROPERTY_SLICE_BY = "sliceBy";
  private MonitoringSliceBy sliceBy;

  public static final String JSON_PROPERTY_FILTER_BY = "filterBy";
  private List<MonitoringFilterBy> filterBy = null;

  public static final String JSON_PROPERTY_STEP = "step";
  private Integer step = 1;


  public AvgDbLoadPayload serviceId(UUID serviceId) {
    
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


  public AvgDbLoadPayload serviceInstanceId(UUID serviceInstanceId) {
    
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


  public AvgDbLoadPayload startTime(String startTime) {
    
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


  public AvgDbLoadPayload endTime(String endTime) {
    
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


  public AvgDbLoadPayload sliceBy(MonitoringSliceBy sliceBy) {
    
    this.sliceBy = sliceBy;
    return this;
  }

   /**
   * Get sliceBy
   * @return sliceBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SLICE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MonitoringSliceBy getSliceBy() {
    return sliceBy;
  }


  @JsonProperty(JSON_PROPERTY_SLICE_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSliceBy(MonitoringSliceBy sliceBy) {
    this.sliceBy = sliceBy;
  }


  public AvgDbLoadPayload filterBy(List<MonitoringFilterBy> filterBy) {
    
    this.filterBy = filterBy;
    return this;
  }

  public AvgDbLoadPayload addFilterByItem(MonitoringFilterBy filterByItem) {
    if (this.filterBy == null) {
      this.filterBy = new ArrayList<>();
    }
    this.filterBy.add(filterByItem);
    return this;
  }

   /**
   * Array of filters to filter Avg Db Load
   * @return filterBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of filters to filter Avg Db Load")
  @JsonProperty(JSON_PROPERTY_FILTER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MonitoringFilterBy> getFilterBy() {
    return filterBy;
  }


  @JsonProperty(JSON_PROPERTY_FILTER_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFilterBy(List<MonitoringFilterBy> filterBy) {
    this.filterBy = filterBy;
  }


  public AvgDbLoadPayload step(Integer step) {
    
    this.step = step;
    return this;
  }

   /**
   * Specifies the frequency at which data points are sampled or aggregated within the specified time range
   * minimum: 1
   * maximum: 86400
   * @return step
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies the frequency at which data points are sampled or aggregated within the specified time range")
  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStep() {
    return step;
  }


  @JsonProperty(JSON_PROPERTY_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStep(Integer step) {
    this.step = step;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvgDbLoadPayload avgDbLoadPayload = (AvgDbLoadPayload) o;
    return Objects.equals(this.serviceId, avgDbLoadPayload.serviceId) &&
        Objects.equals(this.serviceInstanceId, avgDbLoadPayload.serviceInstanceId) &&
        Objects.equals(this.startTime, avgDbLoadPayload.startTime) &&
        Objects.equals(this.endTime, avgDbLoadPayload.endTime) &&
        Objects.equals(this.sliceBy, avgDbLoadPayload.sliceBy) &&
        Objects.equals(this.filterBy, avgDbLoadPayload.filterBy) &&
        Objects.equals(this.step, avgDbLoadPayload.step);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceId, serviceInstanceId, startTime, endTime, sliceBy, filterBy, step);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvgDbLoadPayload {\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    serviceInstanceId: ").append(toIndentedString(serviceInstanceId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    sliceBy: ").append(toIndentedString(sliceBy)).append("\n");
    sb.append("    filterBy: ").append(toIndentedString(filterBy)).append("\n");
    sb.append("    step: ").append(toIndentedString(step)).append("\n");
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

