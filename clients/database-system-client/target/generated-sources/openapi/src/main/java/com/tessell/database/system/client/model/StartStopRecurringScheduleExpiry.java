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
 * Schedule expiry details for recurring start/stop schedule for the DB Service
 */
@ApiModel(description = "Schedule expiry details for recurring start/stop schedule for the DB Service")
@JsonPropertyOrder({
  StartStopRecurringScheduleExpiry.JSON_PROPERTY_ON,
  StartStopRecurringScheduleExpiry.JSON_PROPERTY_AFTER_OCCURRENCES,
  StartStopRecurringScheduleExpiry.JSON_PROPERTY_NEVER
})
@JsonTypeName("StartStopRecurringScheduleExpiry")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartStopRecurringScheduleExpiry {
  public static final String JSON_PROPERTY_ON = "on";
  private Date on;

  public static final String JSON_PROPERTY_AFTER_OCCURRENCES = "afterOccurrences";
  private Integer afterOccurrences;

  public static final String JSON_PROPERTY_NEVER = "never";
  private Boolean never;


  public StartStopRecurringScheduleExpiry on(Date on) {
    
    this.on = on;
    return this;
  }

   /**
   * Date after which the schedule would not be applicable
   * @return on
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date after which the schedule would not be applicable")
  @JsonProperty(JSON_PROPERTY_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getOn() {
    return on;
  }


  @JsonProperty(JSON_PROPERTY_ON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOn(Date on) {
    this.on = on;
  }


  public StartStopRecurringScheduleExpiry afterOccurrences(Integer afterOccurrences) {
    
    this.afterOccurrences = afterOccurrences;
    return this;
  }

   /**
   * Number of occurrences which the schedule would not be applicable
   * minimum: 0
   * @return afterOccurrences
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Number of occurrences which the schedule would not be applicable")
  @JsonProperty(JSON_PROPERTY_AFTER_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAfterOccurrences() {
    return afterOccurrences;
  }


  @JsonProperty(JSON_PROPERTY_AFTER_OCCURRENCES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAfterOccurrences(Integer afterOccurrences) {
    this.afterOccurrences = afterOccurrences;
  }


  public StartStopRecurringScheduleExpiry never(Boolean never) {
    
    this.never = never;
    return this;
  }

   /**
   * If set to True, the schedule will be applicable forever
   * @return never
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If set to True, the schedule will be applicable forever")
  @JsonProperty(JSON_PROPERTY_NEVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getNever() {
    return never;
  }


  @JsonProperty(JSON_PROPERTY_NEVER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNever(Boolean never) {
    this.never = never;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartStopRecurringScheduleExpiry startStopRecurringScheduleExpiry = (StartStopRecurringScheduleExpiry) o;
    return Objects.equals(this.on, startStopRecurringScheduleExpiry.on) &&
        Objects.equals(this.afterOccurrences, startStopRecurringScheduleExpiry.afterOccurrences) &&
        Objects.equals(this.never, startStopRecurringScheduleExpiry.never);
  }

  @Override
  public int hashCode() {
    return Objects.hash(on, afterOccurrences, never);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartStopRecurringScheduleExpiry {\n");
    sb.append("    on: ").append(toIndentedString(on)).append("\n");
    sb.append("    afterOccurrences: ").append(toIndentedString(afterOccurrences)).append("\n");
    sb.append("    never: ").append(toIndentedString(never)).append("\n");
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
