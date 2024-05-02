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
import com.tessell.database.system.client.model.EntityType;
import com.tessell.database.system.client.model.MaintenanceWindowExecutionInfo;
import com.tessell.database.system.client.model.MaintenanceWindowStatus;
import com.tessell.database.system.client.model.MaintenanceWindowSummary;
import com.tessell.database.system.client.model.MaintenanceWindowType;
import com.tessell.database.system.client.model.TaskDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * User view for Maintenance Window
 */
@ApiModel(description = "User view for Maintenance Window")
@JsonPropertyOrder({
  MaintenanceWindowDTO.JSON_PROPERTY_ID,
  MaintenanceWindowDTO.JSON_PROPERTY_ENTITY_ID,
  MaintenanceWindowDTO.JSON_PROPERTY_ENTITY_TYPE,
  MaintenanceWindowDTO.JSON_PROPERTY_TYPE,
  MaintenanceWindowDTO.JSON_PROPERTY_STATUS,
  MaintenanceWindowDTO.JSON_PROPERTY_TRIGGER_TIME,
  MaintenanceWindowDTO.JSON_PROPERTY_EXECUTION_INFO,
  MaintenanceWindowDTO.JSON_PROPERTY_DURATION,
  MaintenanceWindowDTO.JSON_PROPERTY_CREATED_BY,
  MaintenanceWindowDTO.JSON_PROPERTY_TASKS,
  MaintenanceWindowDTO.JSON_PROPERTY_SUMMARY
})
@JsonTypeName("MaintenanceWindowDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MaintenanceWindowType type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private MaintenanceWindowStatus status;

  public static final String JSON_PROPERTY_TRIGGER_TIME = "triggerTime";
  private Date triggerTime;

  public static final String JSON_PROPERTY_EXECUTION_INFO = "executionInfo";
  private MaintenanceWindowExecutionInfo executionInfo;

  public static final String JSON_PROPERTY_DURATION = "duration";
  private Integer duration;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;

  public static final String JSON_PROPERTY_TASKS = "tasks";
  private List<TaskDTO> tasks = null;

  public static final String JSON_PROPERTY_SUMMARY = "summary";
  private MaintenanceWindowSummary summary;


  public MaintenanceWindowDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public MaintenanceWindowDTO entityId(UUID entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * Get entityId
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }


  public MaintenanceWindowDTO entityType(EntityType entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityType getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }


  public MaintenanceWindowDTO type(MaintenanceWindowType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenanceWindowType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(MaintenanceWindowType type) {
    this.type = type;
  }


  public MaintenanceWindowDTO status(MaintenanceWindowStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenanceWindowStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(MaintenanceWindowStatus status) {
    this.status = status;
  }


  public MaintenanceWindowDTO triggerTime(Date triggerTime) {
    
    this.triggerTime = triggerTime;
    return this;
  }

   /**
   * Get triggerTime
   * @return triggerTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRIGGER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getTriggerTime() {
    return triggerTime;
  }


  @JsonProperty(JSON_PROPERTY_TRIGGER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTriggerTime(Date triggerTime) {
    this.triggerTime = triggerTime;
  }


  public MaintenanceWindowDTO executionInfo(MaintenanceWindowExecutionInfo executionInfo) {
    
    this.executionInfo = executionInfo;
    return this;
  }

   /**
   * Get executionInfo
   * @return executionInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenanceWindowExecutionInfo getExecutionInfo() {
    return executionInfo;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutionInfo(MaintenanceWindowExecutionInfo executionInfo) {
    this.executionInfo = executionInfo;
  }


  public MaintenanceWindowDTO duration(Integer duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * Maintenance Window duration in minutes
   * @return duration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Maintenance Window duration in minutes")
  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDuration() {
    return duration;
  }


  @JsonProperty(JSON_PROPERTY_DURATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDuration(Integer duration) {
    this.duration = duration;
  }


  public MaintenanceWindowDTO createdBy(String createdBy) {
    
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedBy() {
    return createdBy;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }


  public MaintenanceWindowDTO tasks(List<TaskDTO> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public MaintenanceWindowDTO addTasksItem(TaskDTO tasksItem) {
    if (this.tasks == null) {
      this.tasks = new ArrayList<>();
    }
    this.tasks.add(tasksItem);
    return this;
  }

   /**
   * Get tasks
   * @return tasks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TaskDTO> getTasks() {
    return tasks;
  }


  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTasks(List<TaskDTO> tasks) {
    this.tasks = tasks;
  }


  public MaintenanceWindowDTO summary(MaintenanceWindowSummary summary) {
    
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MaintenanceWindowSummary getSummary() {
    return summary;
  }


  @JsonProperty(JSON_PROPERTY_SUMMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSummary(MaintenanceWindowSummary summary) {
    this.summary = summary;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowDTO maintenanceWindowDTO = (MaintenanceWindowDTO) o;
    return Objects.equals(this.id, maintenanceWindowDTO.id) &&
        Objects.equals(this.entityId, maintenanceWindowDTO.entityId) &&
        Objects.equals(this.entityType, maintenanceWindowDTO.entityType) &&
        Objects.equals(this.type, maintenanceWindowDTO.type) &&
        Objects.equals(this.status, maintenanceWindowDTO.status) &&
        Objects.equals(this.triggerTime, maintenanceWindowDTO.triggerTime) &&
        Objects.equals(this.executionInfo, maintenanceWindowDTO.executionInfo) &&
        Objects.equals(this.duration, maintenanceWindowDTO.duration) &&
        Objects.equals(this.createdBy, maintenanceWindowDTO.createdBy) &&
        Objects.equals(this.tasks, maintenanceWindowDTO.tasks) &&
        Objects.equals(this.summary, maintenanceWindowDTO.summary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityId, entityType, type, status, triggerTime, executionInfo, duration, createdBy, tasks, summary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
    sb.append("    executionInfo: ").append(toIndentedString(executionInfo)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
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

