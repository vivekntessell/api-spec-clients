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
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellServiceDegradeMonitorMetadata
 */
@JsonPropertyOrder({
  TessellServiceDegradeMonitorMetadata.JSON_PROPERTY_LAST_WORKFLOW_DISPATCH_TIME,
  TessellServiceDegradeMonitorMetadata.JSON_PROPERTY_LAST_WORKFLOW_ID,
  TessellServiceDegradeMonitorMetadata.JSON_PROPERTY_ATTEMPTS
})
@JsonTypeName("TessellServiceDegradeMonitorMetadata")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceDegradeMonitorMetadata {
  public static final String JSON_PROPERTY_LAST_WORKFLOW_DISPATCH_TIME = "lastWorkflowDispatchTime";
  private Date lastWorkflowDispatchTime;

  public static final String JSON_PROPERTY_LAST_WORKFLOW_ID = "lastWorkflowId";
  private String lastWorkflowId;

  public static final String JSON_PROPERTY_ATTEMPTS = "attempts";
  private Integer attempts;


  public TessellServiceDegradeMonitorMetadata lastWorkflowDispatchTime(Date lastWorkflowDispatchTime) {
    
    this.lastWorkflowDispatchTime = lastWorkflowDispatchTime;
    return this;
  }

   /**
   * Timestamp when the last degrade (start-service) workflow was dispatched
   * @return lastWorkflowDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the last degrade (start-service) workflow was dispatched")
  @JsonProperty(JSON_PROPERTY_LAST_WORKFLOW_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastWorkflowDispatchTime() {
    return lastWorkflowDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_WORKFLOW_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastWorkflowDispatchTime(Date lastWorkflowDispatchTime) {
    this.lastWorkflowDispatchTime = lastWorkflowDispatchTime;
  }


  public TessellServiceDegradeMonitorMetadata lastWorkflowId(String lastWorkflowId) {
    
    this.lastWorkflowId = lastWorkflowId;
    return this;
  }

   /**
   * Workflow id of the last(latest) workflow
   * @return lastWorkflowId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Workflow id of the last(latest) workflow")
  @JsonProperty(JSON_PROPERTY_LAST_WORKFLOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastWorkflowId() {
    return lastWorkflowId;
  }


  @JsonProperty(JSON_PROPERTY_LAST_WORKFLOW_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastWorkflowId(String lastWorkflowId) {
    this.lastWorkflowId = lastWorkflowId;
  }


  public TessellServiceDegradeMonitorMetadata attempts(Integer attempts) {
    
    this.attempts = attempts;
    return this;
  }

   /**
   * Get attempts
   * @return attempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAttempts() {
    return attempts;
  }


  @JsonProperty(JSON_PROPERTY_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttempts(Integer attempts) {
    this.attempts = attempts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceDegradeMonitorMetadata tessellServiceDegradeMonitorMetadata = (TessellServiceDegradeMonitorMetadata) o;
    return Objects.equals(this.lastWorkflowDispatchTime, tessellServiceDegradeMonitorMetadata.lastWorkflowDispatchTime) &&
        Objects.equals(this.lastWorkflowId, tessellServiceDegradeMonitorMetadata.lastWorkflowId) &&
        Objects.equals(this.attempts, tessellServiceDegradeMonitorMetadata.attempts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastWorkflowDispatchTime, lastWorkflowId, attempts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceDegradeMonitorMetadata {\n");
    sb.append("    lastWorkflowDispatchTime: ").append(toIndentedString(lastWorkflowDispatchTime)).append("\n");
    sb.append("    lastWorkflowId: ").append(toIndentedString(lastWorkflowId)).append("\n");
    sb.append("    attempts: ").append(toIndentedString(attempts)).append("\n");
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
