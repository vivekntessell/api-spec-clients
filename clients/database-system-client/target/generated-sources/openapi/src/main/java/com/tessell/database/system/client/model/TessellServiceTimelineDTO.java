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
import java.util.Date;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition of the DB Service Timeline object
 */
@ApiModel(description = "This is a definition of the DB Service Timeline object")
@JsonPropertyOrder({
  TessellServiceTimelineDTO.JSON_PROPERTY_ID,
  TessellServiceTimelineDTO.JSON_PROPERTY_INITIATED_BY,
  TessellServiceTimelineDTO.JSON_PROPERTY_INITIATED_TIME,
  TessellServiceTimelineDTO.JSON_PROPERTY_COMPLETED_TIME,
  TessellServiceTimelineDTO.JSON_PROPERTY_COMMENT,
  TessellServiceTimelineDTO.JSON_PROPERTY_INITIATION_MESSAGE,
  TessellServiceTimelineDTO.JSON_PROPERTY_COMPLETION_MESSAGE,
  TessellServiceTimelineDTO.JSON_PROPERTY_EVENT_TYPE,
  TessellServiceTimelineDTO.JSON_PROPERTY_CONTEXT_INFO
})
@JsonTypeName("TessellServiceTimelineDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceTimelineDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_INITIATED_BY = "initiatedBy";
  private String initiatedBy;

  public static final String JSON_PROPERTY_INITIATED_TIME = "initiatedTime";
  private Date initiatedTime;

  public static final String JSON_PROPERTY_COMPLETED_TIME = "completedTime";
  private Date completedTime;

  public static final String JSON_PROPERTY_COMMENT = "comment";
  private String comment;

  public static final String JSON_PROPERTY_INITIATION_MESSAGE = "initiationMessage";
  private String initiationMessage;

  public static final String JSON_PROPERTY_COMPLETION_MESSAGE = "completionMessage";
  private String completionMessage;

  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private String eventType;

  public static final String JSON_PROPERTY_CONTEXT_INFO = "contextInfo";
  private List<String> contextInfo = null;


  public TessellServiceTimelineDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID for the DB Service. This is the unique identifier for the DB Service.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID for the DB Service. This is the unique identifier for the DB Service.")
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


  public TessellServiceTimelineDTO initiatedBy(String initiatedBy) {
    
    this.initiatedBy = initiatedBy;
    return this;
  }

   /**
   * User id of person who initiated the action
   * @return initiatedBy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User id of person who initiated the action")
  @JsonProperty(JSON_PROPERTY_INITIATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitiatedBy() {
    return initiatedBy;
  }


  @JsonProperty(JSON_PROPERTY_INITIATED_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitiatedBy(String initiatedBy) {
    this.initiatedBy = initiatedBy;
  }


  public TessellServiceTimelineDTO initiatedTime(Date initiatedTime) {
    
    this.initiatedTime = initiatedTime;
    return this;
  }

   /**
   * Time at which action was initiated
   * @return initiatedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which action was initiated")
  @JsonProperty(JSON_PROPERTY_INITIATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getInitiatedTime() {
    return initiatedTime;
  }


  @JsonProperty(JSON_PROPERTY_INITIATED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitiatedTime(Date initiatedTime) {
    this.initiatedTime = initiatedTime;
  }


  public TessellServiceTimelineDTO completedTime(Date completedTime) {
    
    this.completedTime = completedTime;
    return this;
  }

   /**
   * Time at which action was completed
   * @return completedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which action was completed")
  @JsonProperty(JSON_PROPERTY_COMPLETED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getCompletedTime() {
    return completedTime;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletedTime(Date completedTime) {
    this.completedTime = completedTime;
  }


  public TessellServiceTimelineDTO comment(String comment) {
    
    this.comment = comment;
    return this;
  }

   /**
   * User specified comment for the action
   * @return comment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User specified comment for the action")
  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComment() {
    return comment;
  }


  @JsonProperty(JSON_PROPERTY_COMMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComment(String comment) {
    this.comment = comment;
  }


  public TessellServiceTimelineDTO initiationMessage(String initiationMessage) {
    
    this.initiationMessage = initiationMessage;
    return this;
  }

   /**
   * System generated description at the start of action
   * @return initiationMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System generated description at the start of action")
  @JsonProperty(JSON_PROPERTY_INITIATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getInitiationMessage() {
    return initiationMessage;
  }


  @JsonProperty(JSON_PROPERTY_INITIATION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInitiationMessage(String initiationMessage) {
    this.initiationMessage = initiationMessage;
  }


  public TessellServiceTimelineDTO completionMessage(String completionMessage) {
    
    this.completionMessage = completionMessage;
    return this;
  }

   /**
   * System generated description after action is successfully completed
   * @return completionMessage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System generated description after action is successfully completed")
  @JsonProperty(JSON_PROPERTY_COMPLETION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCompletionMessage() {
    return completionMessage;
  }


  @JsonProperty(JSON_PROPERTY_COMPLETION_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCompletionMessage(String completionMessage) {
    this.completionMessage = completionMessage;
  }


  public TessellServiceTimelineDTO eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * System generated description of action
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "System generated description of action")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public TessellServiceTimelineDTO contextInfo(List<String> contextInfo) {
    
    this.contextInfo = contextInfo;
    return this;
  }

  public TessellServiceTimelineDTO addContextInfoItem(String contextInfoItem) {
    if (this.contextInfo == null) {
      this.contextInfo = new ArrayList<>();
    }
    this.contextInfo.add(contextInfoItem);
    return this;
  }

   /**
   * Contextual information for the action, if any.
   * @return contextInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Contextual information for the action, if any.")
  @JsonProperty(JSON_PROPERTY_CONTEXT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getContextInfo() {
    return contextInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONTEXT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContextInfo(List<String> contextInfo) {
    this.contextInfo = contextInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceTimelineDTO tessellServiceTimelineDTO = (TessellServiceTimelineDTO) o;
    return Objects.equals(this.id, tessellServiceTimelineDTO.id) &&
        Objects.equals(this.initiatedBy, tessellServiceTimelineDTO.initiatedBy) &&
        Objects.equals(this.initiatedTime, tessellServiceTimelineDTO.initiatedTime) &&
        Objects.equals(this.completedTime, tessellServiceTimelineDTO.completedTime) &&
        Objects.equals(this.comment, tessellServiceTimelineDTO.comment) &&
        Objects.equals(this.initiationMessage, tessellServiceTimelineDTO.initiationMessage) &&
        Objects.equals(this.completionMessage, tessellServiceTimelineDTO.completionMessage) &&
        Objects.equals(this.eventType, tessellServiceTimelineDTO.eventType) &&
        Objects.equals(this.contextInfo, tessellServiceTimelineDTO.contextInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiatedBy, initiatedTime, completedTime, comment, initiationMessage, completionMessage, eventType, contextInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceTimelineDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiatedBy: ").append(toIndentedString(initiatedBy)).append("\n");
    sb.append("    initiatedTime: ").append(toIndentedString(initiatedTime)).append("\n");
    sb.append("    completedTime: ").append(toIndentedString(completedTime)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    initiationMessage: ").append(toIndentedString(initiationMessage)).append("\n");
    sb.append("    completionMessage: ").append(toIndentedString(completionMessage)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    contextInfo: ").append(toIndentedString(contextInfo)).append("\n");
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
