/*
 * Tessell Infra Management Service API
 * Tessell Infra APIs
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.infra.client.model;

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
 * TaskWorkflowVariablesPayload
 */
@JsonPropertyOrder({
  TaskWorkflowVariablesPayload.JSON_PROPERTY_WORKFLOW_NAME,
  TaskWorkflowVariablesPayload.JSON_PROPERTY_VARIABLES
})
@JsonTypeName("TaskWorkflowVariablesPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:55.674992+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TaskWorkflowVariablesPayload {
  public static final String JSON_PROPERTY_WORKFLOW_NAME = "workflowName";
  private String workflowName;

  public static final String JSON_PROPERTY_VARIABLES = "variables";
  private String variables;


  public TaskWorkflowVariablesPayload workflowName(String workflowName) {
    
    this.workflowName = workflowName;
    return this;
  }

   /**
   * Get workflowName
   * @return workflowName
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWorkflowName() {
    return workflowName;
  }


  @JsonProperty(JSON_PROPERTY_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setWorkflowName(String workflowName) {
    this.workflowName = workflowName;
  }


  public TaskWorkflowVariablesPayload variables(String variables) {
    
    this.variables = variables;
    return this;
  }

   /**
   * Get variables
   * @return variables
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVariables() {
    return variables;
  }


  @JsonProperty(JSON_PROPERTY_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVariables(String variables) {
    this.variables = variables;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskWorkflowVariablesPayload taskWorkflowVariablesPayload = (TaskWorkflowVariablesPayload) o;
    return Objects.equals(this.workflowName, taskWorkflowVariablesPayload.workflowName) &&
        Objects.equals(this.variables, taskWorkflowVariablesPayload.variables);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workflowName, variables);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskWorkflowVariablesPayload {\n");
    sb.append("    workflowName: ").append(toIndentedString(workflowName)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
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
