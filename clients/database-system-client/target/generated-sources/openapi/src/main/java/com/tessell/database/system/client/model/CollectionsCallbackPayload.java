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
import com.tessell.database.system.client.model.ArgoWorkflowStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload received during Argo workflow callbacks.
 */
@ApiModel(description = "Payload received during Argo workflow callbacks.")
@JsonPropertyOrder({
  CollectionsCallbackPayload.JSON_PROPERTY_PREV_WORKFLOW_NAME,
  CollectionsCallbackPayload.JSON_PROPERTY_NEW_WORKFLOW_NAME,
  CollectionsCallbackPayload.JSON_PROPERTY_STATUS,
  CollectionsCallbackPayload.JSON_PROPERTY_PAYLOAD,
  CollectionsCallbackPayload.JSON_PROPERTY_CONTEXT,
  CollectionsCallbackPayload.JSON_PROPERTY_LAST_RUN_COUNT,
  CollectionsCallbackPayload.JSON_PROPERTY_MAX_RUN_COUNT
})
@JsonTypeName("CollectionsCallbackPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionsCallbackPayload {
  public static final String JSON_PROPERTY_PREV_WORKFLOW_NAME = "prevWorkflowName";
  private String prevWorkflowName;

  public static final String JSON_PROPERTY_NEW_WORKFLOW_NAME = "newWorkflowName";
  private String newWorkflowName;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ArgoWorkflowStatus status;

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Map<String, Object> payload = null;

  public static final String JSON_PROPERTY_CONTEXT = "context";
  private Object context;

  public static final String JSON_PROPERTY_LAST_RUN_COUNT = "lastRunCount";
  private Integer lastRunCount;

  public static final String JSON_PROPERTY_MAX_RUN_COUNT = "maxRunCount";
  private Integer maxRunCount;


  public CollectionsCallbackPayload prevWorkflowName(String prevWorkflowName) {
    
    this.prevWorkflowName = prevWorkflowName;
    return this;
  }

   /**
   * Previous workflow name corresponding to which the payload in the callback is received.
   * @return prevWorkflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Previous workflow name corresponding to which the payload in the callback is received.")
  @JsonProperty(JSON_PROPERTY_PREV_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPrevWorkflowName() {
    return prevWorkflowName;
  }


  @JsonProperty(JSON_PROPERTY_PREV_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrevWorkflowName(String prevWorkflowName) {
    this.prevWorkflowName = prevWorkflowName;
  }


  public CollectionsCallbackPayload newWorkflowName(String newWorkflowName) {
    
    this.newWorkflowName = newWorkflowName;
    return this;
  }

   /**
   * New workflow name if the earlier workflow failed and there are retries left. Else null
   * @return newWorkflowName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "New workflow name if the earlier workflow failed and there are retries left. Else null")
  @JsonProperty(JSON_PROPERTY_NEW_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNewWorkflowName() {
    return newWorkflowName;
  }


  @JsonProperty(JSON_PROPERTY_NEW_WORKFLOW_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNewWorkflowName(String newWorkflowName) {
    this.newWorkflowName = newWorkflowName;
  }


  public CollectionsCallbackPayload status(ArgoWorkflowStatus status) {
    
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

  public ArgoWorkflowStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(ArgoWorkflowStatus status) {
    this.status = status;
  }


  public CollectionsCallbackPayload payload(Map<String, Object> payload) {
    
    this.payload = payload;
    return this;
  }

  public CollectionsCallbackPayload putPayloadItem(String key, Object payloadItem) {
    if (this.payload == null) {
      this.payload = new HashMap<>();
    }
    this.payload.put(key, payloadItem);
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

  public Map<String, Object> getPayload() {
    return payload;
  }


  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPayload(Map<String, Object> payload) {
    this.payload = payload;
  }


  public CollectionsCallbackPayload context(Object context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getContext() {
    return context;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContext(Object context) {
    this.context = context;
  }


  public CollectionsCallbackPayload lastRunCount(Integer lastRunCount) {
    
    this.lastRunCount = lastRunCount;
    return this;
  }

   /**
   * Get lastRunCount
   * @return lastRunCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_RUN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getLastRunCount() {
    return lastRunCount;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RUN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRunCount(Integer lastRunCount) {
    this.lastRunCount = lastRunCount;
  }


  public CollectionsCallbackPayload maxRunCount(Integer maxRunCount) {
    
    this.maxRunCount = maxRunCount;
    return this;
  }

   /**
   * Get maxRunCount
   * @return maxRunCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAX_RUN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxRunCount() {
    return maxRunCount;
  }


  @JsonProperty(JSON_PROPERTY_MAX_RUN_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaxRunCount(Integer maxRunCount) {
    this.maxRunCount = maxRunCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CollectionsCallbackPayload collectionsCallbackPayload = (CollectionsCallbackPayload) o;
    return Objects.equals(this.prevWorkflowName, collectionsCallbackPayload.prevWorkflowName) &&
        Objects.equals(this.newWorkflowName, collectionsCallbackPayload.newWorkflowName) &&
        Objects.equals(this.status, collectionsCallbackPayload.status) &&
        Objects.equals(this.payload, collectionsCallbackPayload.payload) &&
        Objects.equals(this.context, collectionsCallbackPayload.context) &&
        Objects.equals(this.lastRunCount, collectionsCallbackPayload.lastRunCount) &&
        Objects.equals(this.maxRunCount, collectionsCallbackPayload.maxRunCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prevWorkflowName, newWorkflowName, status, payload, context, lastRunCount, maxRunCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CollectionsCallbackPayload {\n");
    sb.append("    prevWorkflowName: ").append(toIndentedString(prevWorkflowName)).append("\n");
    sb.append("    newWorkflowName: ").append(toIndentedString(newWorkflowName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    lastRunCount: ").append(toIndentedString(lastRunCount)).append("\n");
    sb.append("    maxRunCount: ").append(toIndentedString(maxRunCount)).append("\n");
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

