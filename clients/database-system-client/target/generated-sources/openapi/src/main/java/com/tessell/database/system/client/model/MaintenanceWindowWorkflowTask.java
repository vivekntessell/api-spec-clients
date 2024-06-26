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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * MaintenanceWindowWorkflowTask
 */
@JsonPropertyOrder({
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_ID,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_ENTITY_ID,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_ENTITY_TYPE,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_OPERATION,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_OPERATION_TEMPLATE,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_PAYLOAD,
  MaintenanceWindowWorkflowTask.JSON_PROPERTY_STATUS
})
@JsonTypeName("MaintenanceWindowWorkflowTask")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowWorkflowTask {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private EntityType entityType;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private TaskOperation operation;

  public static final String JSON_PROPERTY_OPERATION_TEMPLATE = "operationTemplate";
  private String operationTemplate;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Object payload;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TaskStatus status;


  public MaintenanceWindowWorkflowTask id(UUID id) {
    
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


  public MaintenanceWindowWorkflowTask entityId(UUID entityId) {
    
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


  public MaintenanceWindowWorkflowTask entityType(EntityType entityType) {
    
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


  public MaintenanceWindowWorkflowTask operation(TaskOperation operation) {
    
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


  public MaintenanceWindowWorkflowTask operationTemplate(String operationTemplate) {
    
    this.operationTemplate = operationTemplate;
    return this;
  }

   /**
   * Get operationTemplate
   * @return operationTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATION_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOperationTemplate() {
    return operationTemplate;
  }


  @JsonProperty(JSON_PROPERTY_OPERATION_TEMPLATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOperationTemplate(String operationTemplate) {
    this.operationTemplate = operationTemplate;
  }


  public MaintenanceWindowWorkflowTask payload(Object payload) {
    
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

  public Object getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(Object payload) {
    this.payload = payload;
  }


  public MaintenanceWindowWorkflowTask status(TaskStatus status) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowWorkflowTask maintenanceWindowWorkflowTask = (MaintenanceWindowWorkflowTask) o;
    return Objects.equals(this.id, maintenanceWindowWorkflowTask.id) &&
        Objects.equals(this.entityId, maintenanceWindowWorkflowTask.entityId) &&
        Objects.equals(this.entityType, maintenanceWindowWorkflowTask.entityType) &&
        Objects.equals(this.operation, maintenanceWindowWorkflowTask.operation) &&
        Objects.equals(this.operationTemplate, maintenanceWindowWorkflowTask.operationTemplate) &&
        Objects.equals(this.payload, maintenanceWindowWorkflowTask.payload) &&
        Objects.equals(this.status, maintenanceWindowWorkflowTask.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, entityId, entityType, operation, operationTemplate, payload, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowWorkflowTask {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    operationTemplate: ").append(toIndentedString(operationTemplate)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

