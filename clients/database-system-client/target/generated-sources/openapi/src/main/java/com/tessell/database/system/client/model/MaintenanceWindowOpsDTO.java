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
import com.tessell.database.system.client.model.MaintenanceWindowType;
import com.tessell.database.system.client.model.TaskOpsDTO;
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
 * Ops view for Maintenance Window
 */
@ApiModel(description = "Ops view for Maintenance Window")
@JsonPropertyOrder({
  MaintenanceWindowOpsDTO.JSON_PROPERTY_ID,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_NAME,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_ENTITY_ID,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_ENTITY_TYPE,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_TYPE,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_STATUS,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_TRIGGER_TIME,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_EXECUTION_INFO,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_DURATION,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_CREATED_BY,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_TASKS,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_DATE_CREATED,
  MaintenanceWindowOpsDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("MaintenanceWindowOpsDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowOpsDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

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
  private List<TaskOpsDTO> tasks = null;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;


  public MaintenanceWindowOpsDTO id(UUID id) {
    
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


  public MaintenanceWindowOpsDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public MaintenanceWindowOpsDTO entityId(UUID entityId) {
    
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


  public MaintenanceWindowOpsDTO entityType(EntityType entityType) {
    
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


  public MaintenanceWindowOpsDTO type(MaintenanceWindowType type) {
    
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


  public MaintenanceWindowOpsDTO status(MaintenanceWindowStatus status) {
    
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


  public MaintenanceWindowOpsDTO triggerTime(Date triggerTime) {
    
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


  public MaintenanceWindowOpsDTO executionInfo(MaintenanceWindowExecutionInfo executionInfo) {
    
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


  public MaintenanceWindowOpsDTO duration(Integer duration) {
    
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


  public MaintenanceWindowOpsDTO createdBy(String createdBy) {
    
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


  public MaintenanceWindowOpsDTO tasks(List<TaskOpsDTO> tasks) {
    
    this.tasks = tasks;
    return this;
  }

  public MaintenanceWindowOpsDTO addTasksItem(TaskOpsDTO tasksItem) {
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

  public List<TaskOpsDTO> getTasks() {
    return tasks;
  }


  @JsonProperty(JSON_PROPERTY_TASKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTasks(List<TaskOpsDTO> tasks) {
    this.tasks = tasks;
  }


  public MaintenanceWindowOpsDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public MaintenanceWindowOpsDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Get dateModified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowOpsDTO maintenanceWindowOpsDTO = (MaintenanceWindowOpsDTO) o;
    return Objects.equals(this.id, maintenanceWindowOpsDTO.id) &&
        Objects.equals(this.name, maintenanceWindowOpsDTO.name) &&
        Objects.equals(this.entityId, maintenanceWindowOpsDTO.entityId) &&
        Objects.equals(this.entityType, maintenanceWindowOpsDTO.entityType) &&
        Objects.equals(this.type, maintenanceWindowOpsDTO.type) &&
        Objects.equals(this.status, maintenanceWindowOpsDTO.status) &&
        Objects.equals(this.triggerTime, maintenanceWindowOpsDTO.triggerTime) &&
        Objects.equals(this.executionInfo, maintenanceWindowOpsDTO.executionInfo) &&
        Objects.equals(this.duration, maintenanceWindowOpsDTO.duration) &&
        Objects.equals(this.createdBy, maintenanceWindowOpsDTO.createdBy) &&
        Objects.equals(this.tasks, maintenanceWindowOpsDTO.tasks) &&
        Objects.equals(this.dateCreated, maintenanceWindowOpsDTO.dateCreated) &&
        Objects.equals(this.dateModified, maintenanceWindowOpsDTO.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, entityId, entityType, type, status, triggerTime, executionInfo, duration, createdBy, tasks, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowOpsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
    sb.append("    executionInfo: ").append(toIndentedString(executionInfo)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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
