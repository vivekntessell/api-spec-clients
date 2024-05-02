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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Request to cancel QUEUED Maintenance Window Task
 */
@ApiModel(description = "Request to cancel QUEUED Maintenance Window Task")
@JsonPropertyOrder({
  MaintenanceWindowTaskCancelRequest.JSON_PROPERTY_TASK_IDS
})
@JsonTypeName("MaintenanceWindowTaskCancelRequest")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class MaintenanceWindowTaskCancelRequest {
  public static final String JSON_PROPERTY_TASK_IDS = "taskIds";
  private List<UUID> taskIds = null;


  public MaintenanceWindowTaskCancelRequest taskIds(List<UUID> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public MaintenanceWindowTaskCancelRequest addTaskIdsItem(UUID taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * Get taskIds
   * @return taskIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getTaskIds() {
    return taskIds;
  }


  @JsonProperty(JSON_PROPERTY_TASK_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskIds(List<UUID> taskIds) {
    this.taskIds = taskIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaintenanceWindowTaskCancelRequest maintenanceWindowTaskCancelRequest = (MaintenanceWindowTaskCancelRequest) o;
    return Objects.equals(this.taskIds, maintenanceWindowTaskCancelRequest.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaintenanceWindowTaskCancelRequest {\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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

