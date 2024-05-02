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
import com.tessell.database.system.client.model.TaskOperation;
import com.tessell.database.system.client.model.TaskStatus;
import com.tessell.database.system.client.model.TaskType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * User view for Task
 */
@ApiModel(description = "User view for Task")
@JsonPropertyOrder({
  TaskDTO.JSON_PROPERTY_ID,
  TaskDTO.JSON_PROPERTY_NAME,
  TaskDTO.JSON_PROPERTY_ENTITY_ID,
  TaskDTO.JSON_PROPERTY_ENTITY_TYPE,
  TaskDTO.JSON_PROPERTY_TYPE,
  TaskDTO.JSON_PROPERTY_STATUS,
  TaskDTO.JSON_PROPERTY_IS_MANDATORY,
  TaskDTO.JSON_PROPERTY_IMPACT,
  TaskDTO.JSON_PROPERTY_OPERATION,
  TaskDTO.JSON_PROPERTY_PAYLOAD,
  TaskDTO.JSON_PROPERTY_TRIGGER_TIME,
  TaskDTO.JSON_PROPERTY_START_TIME,
  TaskDTO.JSON_PROPERTY_END_TIME,
  TaskDTO.JSON_PROPERTY_MAINTENANCE_WINDOW_ID,
  TaskDTO.JSON_PROPERTY_CREATED_BY
})
@JsonTypeName("TaskDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TaskType type;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TaskStatus status;

  public static final String JSON_PROPERTY_IS_MANDATORY = "isMandatory";
  private Boolean isMandatory = true;

  public static final String JSON_PROPERTY_IMPACT = "impact";
  private String impact;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private TaskOperation operation;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private String payload;

  public static final String JSON_PROPERTY_TRIGGER_TIME = "triggerTime";
  private Date triggerTime;

  public static final String JSON_PROPERTY_START_TIME = "startTime";
  private Date startTime;

  public static final String JSON_PROPERTY_END_TIME = "endTime";
  private Date endTime;

  public static final String JSON_PROPERTY_MAINTENANCE_WINDOW_ID = "maintenanceWindowId";
  private UUID maintenanceWindowId;

  public static final String JSON_PROPERTY_CREATED_BY = "createdBy";
  private String createdBy;


  public TaskDTO id(UUID id) {
    
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


  public TaskDTO name(String name) {
    
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


  public TaskDTO entityId(UUID entityId) {
    
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


  public TaskDTO entityType(EntityType entityType) {
    
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


  public TaskDTO type(TaskType type) {
    
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

  public TaskType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TaskType type) {
    this.type = type;
  }


  public TaskDTO status(TaskStatus status) {
    
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

  public TaskStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TaskStatus status) {
    this.status = status;
  }


  public TaskDTO isMandatory(Boolean isMandatory) {
    
    this.isMandatory = isMandatory;
    return this;
  }

   /**
   * Get isMandatory
   * @return isMandatory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMandatory() {
    return isMandatory;
  }


  @JsonProperty(JSON_PROPERTY_IS_MANDATORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsMandatory(Boolean isMandatory) {
    this.isMandatory = isMandatory;
  }


  public TaskDTO impact(String impact) {
    
    this.impact = impact;
    return this;
  }

   /**
   * Get impact
   * @return impact
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImpact() {
    return impact;
  }


  @JsonProperty(JSON_PROPERTY_IMPACT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImpact(String impact) {
    this.impact = impact;
  }


  public TaskDTO operation(TaskOperation operation) {
    
    this.operation = operation;
    return this;
  }

   /**
   * Get operation
   * @return operation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskOperation getOperation() {
    return operation;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperation(TaskOperation operation) {
    this.operation = operation;
  }


  public TaskDTO payload(String payload) {
    
    this.payload = payload;
    return this;
  }

   /**
   * Get payload
   * @return payload
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(String payload) {
    this.payload = payload;
  }


  public TaskDTO triggerTime(Date triggerTime) {
    
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


  public TaskDTO startTime(Date startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getStartTime() {
    return startTime;
  }


  @JsonProperty(JSON_PROPERTY_START_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }


  public TaskDTO endTime(Date endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getEndTime() {
    return endTime;
  }


  @JsonProperty(JSON_PROPERTY_END_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }


  public TaskDTO maintenanceWindowId(UUID maintenanceWindowId) {
    
    this.maintenanceWindowId = maintenanceWindowId;
    return this;
  }

   /**
   * Get maintenanceWindowId
   * @return maintenanceWindowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getMaintenanceWindowId() {
    return maintenanceWindowId;
  }


  @JsonProperty(JSON_PROPERTY_MAINTENANCE_WINDOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaintenanceWindowId(UUID maintenanceWindowId) {
    this.maintenanceWindowId = maintenanceWindowId;
  }


  public TaskDTO createdBy(String createdBy) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskDTO taskDTO = (TaskDTO) o;
    return Objects.equals(this.id, taskDTO.id) &&
        Objects.equals(this.name, taskDTO.name) &&
        Objects.equals(this.entityId, taskDTO.entityId) &&
        Objects.equals(this.entityType, taskDTO.entityType) &&
        Objects.equals(this.type, taskDTO.type) &&
        Objects.equals(this.status, taskDTO.status) &&
        Objects.equals(this.isMandatory, taskDTO.isMandatory) &&
        Objects.equals(this.impact, taskDTO.impact) &&
        Objects.equals(this.operation, taskDTO.operation) &&
        Objects.equals(this.payload, taskDTO.payload) &&
        Objects.equals(this.triggerTime, taskDTO.triggerTime) &&
        Objects.equals(this.startTime, taskDTO.startTime) &&
        Objects.equals(this.endTime, taskDTO.endTime) &&
        Objects.equals(this.maintenanceWindowId, taskDTO.maintenanceWindowId) &&
        Objects.equals(this.createdBy, taskDTO.createdBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, entityId, entityType, type, status, isMandatory, impact, operation, payload, triggerTime, startTime, endTime, maintenanceWindowId, createdBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    isMandatory: ").append(toIndentedString(isMandatory)).append("\n");
    sb.append("    impact: ").append(toIndentedString(impact)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    triggerTime: ").append(toIndentedString(triggerTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    maintenanceWindowId: ").append(toIndentedString(maintenanceWindowId)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
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
