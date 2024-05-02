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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * User view summary for Maintenance Window
 */
@ApiModel(description = "User view summary for Maintenance Window")
@JsonPropertyOrder({
  MaintenanceWindowSummary.JSON_PROPERTY_QUEUED_TASK_COUNT,
  MaintenanceWindowSummary.JSON_PROPERTY_IN_PROGRESS_TASK_COUNT,
  MaintenanceWindowSummary.JSON_PROPERTY_SUCCESS_TASK_COUNT,
  MaintenanceWindowSummary.JSON_PROPERTY_FAILED_TASK_COUNT,
  MaintenanceWindowSummary.JSON_PROPERTY_MANDATORY_TASK_COUNT
})
@JsonTypeName("MaintenanceWindowSummary")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowSummary {
  public static final String JSON_PROPERTY_QUEUED_TASK_COUNT = "queuedTaskCount";
  private Integer queuedTaskCount;

  public static final String JSON_PROPERTY_IN_PROGRESS_TASK_COUNT = "inProgressTaskCount";
  private Integer inProgressTaskCount;

  public static final String JSON_PROPERTY_SUCCESS_TASK_COUNT = "successTaskCount";
  private Integer successTaskCount;

  public static final String JSON_PROPERTY_FAILED_TASK_COUNT = "failedTaskCount";
  private Integer failedTaskCount;

  public static final String JSON_PROPERTY_MANDATORY_TASK_COUNT = "mandatoryTaskCount";
  private Integer mandatoryTaskCount;


  public MaintenanceWindowSummary queuedTaskCount(Integer queuedTaskCount) {
    
    this.queuedTaskCount = queuedTaskCount;
    return this;
  }

   /**
   * Get queuedTaskCount
   * @return queuedTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getQueuedTaskCount() {
    return queuedTaskCount;
  }


  @JsonProperty(JSON_PROPERTY_QUEUED_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueuedTaskCount(Integer queuedTaskCount) {
    this.queuedTaskCount = queuedTaskCount;
  }


  public MaintenanceWindowSummary inProgressTaskCount(Integer inProgressTaskCount) {
    
    this.inProgressTaskCount = inProgressTaskCount;
    return this;
  }

   /**
   * Get inProgressTaskCount
   * @return inProgressTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getInProgressTaskCount() {
    return inProgressTaskCount;
  }


  @JsonProperty(JSON_PROPERTY_IN_PROGRESS_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInProgressTaskCount(Integer inProgressTaskCount) {
    this.inProgressTaskCount = inProgressTaskCount;
  }


  public MaintenanceWindowSummary successTaskCount(Integer successTaskCount) {
    
    this.successTaskCount = successTaskCount;
    return this;
  }

   /**
   * Get successTaskCount
   * @return successTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUCCESS_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSuccessTaskCount() {
    return successTaskCount;
  }


  @JsonProperty(JSON_PROPERTY_SUCCESS_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSuccessTaskCount(Integer successTaskCount) {
    this.successTaskCount = successTaskCount;
  }


  public MaintenanceWindowSummary failedTaskCount(Integer failedTaskCount) {
    
    this.failedTaskCount = failedTaskCount;
    return this;
  }

   /**
   * Get failedTaskCount
   * @return failedTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAILED_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFailedTaskCount() {
    return failedTaskCount;
  }


  @JsonProperty(JSON_PROPERTY_FAILED_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFailedTaskCount(Integer failedTaskCount) {
    this.failedTaskCount = failedTaskCount;
  }


  public MaintenanceWindowSummary mandatoryTaskCount(Integer mandatoryTaskCount) {
    
    this.mandatoryTaskCount = mandatoryTaskCount;
    return this;
  }

   /**
   * Get mandatoryTaskCount
   * @return mandatoryTaskCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MANDATORY_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMandatoryTaskCount() {
    return mandatoryTaskCount;
  }


  @JsonProperty(JSON_PROPERTY_MANDATORY_TASK_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMandatoryTaskCount(Integer mandatoryTaskCount) {
    this.mandatoryTaskCount = mandatoryTaskCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowSummary maintenanceWindowSummary = (MaintenanceWindowSummary) o;
    return Objects.equals(this.queuedTaskCount, maintenanceWindowSummary.queuedTaskCount) &&
        Objects.equals(this.inProgressTaskCount, maintenanceWindowSummary.inProgressTaskCount) &&
        Objects.equals(this.successTaskCount, maintenanceWindowSummary.successTaskCount) &&
        Objects.equals(this.failedTaskCount, maintenanceWindowSummary.failedTaskCount) &&
        Objects.equals(this.mandatoryTaskCount, maintenanceWindowSummary.mandatoryTaskCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queuedTaskCount, inProgressTaskCount, successTaskCount, failedTaskCount, mandatoryTaskCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowSummary {\n");
    sb.append("    queuedTaskCount: ").append(toIndentedString(queuedTaskCount)).append("\n");
    sb.append("    inProgressTaskCount: ").append(toIndentedString(inProgressTaskCount)).append("\n");
    sb.append("    successTaskCount: ").append(toIndentedString(successTaskCount)).append("\n");
    sb.append("    failedTaskCount: ").append(toIndentedString(failedTaskCount)).append("\n");
    sb.append("    mandatoryTaskCount: ").append(toIndentedString(mandatoryTaskCount)).append("\n");
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

