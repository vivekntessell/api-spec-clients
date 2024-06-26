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
import com.tessell.database.system.client.model.StartStopScheduleInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload to update start/stop schedule on the DB Service
 */
@ApiModel(description = "Payload to update start/stop schedule on the DB Service")
@JsonPropertyOrder({
  UpdateStartStopSchedulePayload.JSON_PROPERTY_NAME,
  UpdateStartStopSchedulePayload.JSON_PROPERTY_DESCRIPTION,
  UpdateStartStopSchedulePayload.JSON_PROPERTY_SCHEDULE_INFO
})
@JsonTypeName("UpdateStartStopSchedulePayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateStartStopSchedulePayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_SCHEDULE_INFO = "scheduleInfo";
  private StartStopScheduleInfo scheduleInfo;


  public UpdateStartStopSchedulePayload name(String name) {
    
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


  public UpdateStartStopSchedulePayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public UpdateStartStopSchedulePayload scheduleInfo(StartStopScheduleInfo scheduleInfo) {
    
    this.scheduleInfo = scheduleInfo;
    return this;
  }

   /**
   * Get scheduleInfo
   * @return scheduleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StartStopScheduleInfo getScheduleInfo() {
    return scheduleInfo;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScheduleInfo(StartStopScheduleInfo scheduleInfo) {
    this.scheduleInfo = scheduleInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateStartStopSchedulePayload updateStartStopSchedulePayload = (UpdateStartStopSchedulePayload) o;
    return Objects.equals(this.name, updateStartStopSchedulePayload.name) &&
        Objects.equals(this.description, updateStartStopSchedulePayload.description) &&
        Objects.equals(this.scheduleInfo, updateStartStopSchedulePayload.scheduleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, scheduleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateStartStopSchedulePayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    scheduleInfo: ").append(toIndentedString(scheduleInfo)).append("\n");
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

