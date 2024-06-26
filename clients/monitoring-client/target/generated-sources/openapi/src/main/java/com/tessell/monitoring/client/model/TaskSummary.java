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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TaskSummary
 */
@JsonPropertyOrder({
  TaskSummary.JSON_PROPERTY_TASK_ID,
  TaskSummary.JSON_PROPERTY_TASK_TYPE,
  TaskSummary.JSON_PROPERTY_RESOURCE_ID,
  TaskSummary.JSON_PROPERTY_ASSOCIATED_RESOURCE_IDS,
  TaskSummary.JSON_PROPERTY_DETAILS
})
@JsonTypeName("taskSummary")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:03.958037+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskSummary {
  public static final String JSON_PROPERTY_TASK_ID = "taskId";
  private UUID taskId;

  public static final String JSON_PROPERTY_TASK_TYPE = "taskType";
  private String taskType;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private UUID resourceId;

  public static final String JSON_PROPERTY_ASSOCIATED_RESOURCE_IDS = "associatedResourceIds";
  private List<UUID> associatedResourceIds = null;

  public static final String JSON_PROPERTY_DETAILS = "details";
  private Map<String, String> details = null;


  public TaskSummary taskId(UUID taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * Get taskId
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTaskId() {
    return taskId;
  }


  @JsonProperty(JSON_PROPERTY_TASK_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskId(UUID taskId) {
    this.taskId = taskId;
  }


  public TaskSummary taskType(String taskType) {
    
    this.taskType = taskType;
    return this;
  }

   /**
   * Get taskType
   * @return taskType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaskType() {
    return taskType;
  }


  @JsonProperty(JSON_PROPERTY_TASK_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }


  public TaskSummary resourceId(UUID resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Get resourceId
   * @return resourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getResourceId() {
    return resourceId;
  }


  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResourceId(UUID resourceId) {
    this.resourceId = resourceId;
  }


  public TaskSummary associatedResourceIds(List<UUID> associatedResourceIds) {
    
    this.associatedResourceIds = associatedResourceIds;
    return this;
  }

  public TaskSummary addAssociatedResourceIdsItem(UUID associatedResourceIdsItem) {
    if (this.associatedResourceIds == null) {
      this.associatedResourceIds = new ArrayList<>();
    }
    this.associatedResourceIds.add(associatedResourceIdsItem);
    return this;
  }

   /**
   * Get associatedResourceIds
   * @return associatedResourceIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_RESOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAssociatedResourceIds() {
    return associatedResourceIds;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_RESOURCE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedResourceIds(List<UUID> associatedResourceIds) {
    this.associatedResourceIds = associatedResourceIds;
  }


  public TaskSummary details(Map<String, String> details) {
    
    this.details = details;
    return this;
  }

  public TaskSummary putDetailsItem(String key, String detailsItem) {
    if (this.details == null) {
      this.details = new HashMap<>();
    }
    this.details.put(key, detailsItem);
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getDetails() {
    return details;
  }


  @JsonProperty(JSON_PROPERTY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDetails(Map<String, String> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSummary taskSummary = (TaskSummary) o;
    return Objects.equals(this.taskId, taskSummary.taskId) &&
        Objects.equals(this.taskType, taskSummary.taskType) &&
        Objects.equals(this.resourceId, taskSummary.resourceId) &&
        Objects.equals(this.associatedResourceIds, taskSummary.associatedResourceIds) &&
        Objects.equals(this.details, taskSummary.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskId, taskType, resourceId, associatedResourceIds, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSummary {\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    associatedResourceIds: ").append(toIndentedString(associatedResourceIds)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

