/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.dmm.client.model.ScheduleInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell Data Management Machine&#39;s Availability details
 */
@ApiModel(description = "This is a definition for Tessell Data Management Machine's Availability details")
@JsonPropertyOrder({
  CreateUpdateDmmAvailabilityPayload.JSON_PROPERTY_SLA,
  CreateUpdateDmmAvailabilityPayload.JSON_PROPERTY_SCHEDULE
})
@JsonTypeName("CreateUpdateDmmAvailabilityPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreateUpdateDmmAvailabilityPayload {
  public static final String JSON_PROPERTY_SLA = "sla";
  private String sla;

  public static final String JSON_PROPERTY_SCHEDULE = "schedule";
  private ScheduleInfo schedule;


  public CreateUpdateDmmAvailabilityPayload sla(String sla) {
    
    this.sla = sla;
    return this;
  }

   /**
   * Associated SLA
   * @return sla
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated SLA")
  @JsonProperty(JSON_PROPERTY_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSla() {
    return sla;
  }


  @JsonProperty(JSON_PROPERTY_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSla(String sla) {
    this.sla = sla;
  }


  public CreateUpdateDmmAvailabilityPayload schedule(ScheduleInfo schedule) {
    
    this.schedule = schedule;
    return this;
  }

   /**
   * Get schedule
   * @return schedule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ScheduleInfo getSchedule() {
    return schedule;
  }


  @JsonProperty(JSON_PROPERTY_SCHEDULE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSchedule(ScheduleInfo schedule) {
    this.schedule = schedule;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateUpdateDmmAvailabilityPayload createUpdateDmmAvailabilityPayload = (CreateUpdateDmmAvailabilityPayload) o;
    return Objects.equals(this.sla, createUpdateDmmAvailabilityPayload.sla) &&
        Objects.equals(this.schedule, createUpdateDmmAvailabilityPayload.schedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sla, schedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateUpdateDmmAvailabilityPayload {\n");
    sb.append("    sla: ").append(toIndentedString(sla)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
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
