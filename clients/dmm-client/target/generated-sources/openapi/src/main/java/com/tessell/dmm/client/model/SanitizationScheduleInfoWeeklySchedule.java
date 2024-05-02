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
import com.tessell.dmm.client.model.WeekDay;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SanitizationScheduleInfoWeeklySchedule
 */
@JsonPropertyOrder({
  SanitizationScheduleInfoWeeklySchedule.JSON_PROPERTY_WEEK_DAYS,
  SanitizationScheduleInfoWeeklySchedule.JSON_PROPERTY_RETAIN_FOR_WEEKS
})
@JsonTypeName("SanitizationScheduleInfo_weeklySchedule")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SanitizationScheduleInfoWeeklySchedule {
  public static final String JSON_PROPERTY_WEEK_DAYS = "weekDays";
  private Set<WeekDay> weekDays = null;

  public static final String JSON_PROPERTY_RETAIN_FOR_WEEKS = "retainForWeeks";
  private Integer retainForWeeks;


  public SanitizationScheduleInfoWeeklySchedule weekDays(Set<WeekDay> weekDays) {
    
    this.weekDays = weekDays;
    return this;
  }

  public SanitizationScheduleInfoWeeklySchedule addWeekDaysItem(WeekDay weekDaysItem) {
    if (this.weekDays == null) {
      this.weekDays = new LinkedHashSet<>();
    }
    this.weekDays.add(weekDaysItem);
    return this;
  }

   /**
   * Days in a week to retain weekly backups for
   * @return weekDays
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Days in a week to retain weekly backups for")
  @JsonProperty(JSON_PROPERTY_WEEK_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<WeekDay> getWeekDays() {
    return weekDays;
  }


  @JsonProperty(JSON_PROPERTY_WEEK_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeekDays(Set<WeekDay> weekDays) {
    this.weekDays = weekDays;
  }


  public SanitizationScheduleInfoWeeklySchedule retainForWeeks(Integer retainForWeeks) {
    
    this.retainForWeeks = retainForWeeks;
    return this;
  }

   /**
   * Retention period for sanitized backups (in weeks)
   * @return retainForWeeks
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Retention period for sanitized backups (in weeks)")
  @JsonProperty(JSON_PROPERTY_RETAIN_FOR_WEEKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRetainForWeeks() {
    return retainForWeeks;
  }


  @JsonProperty(JSON_PROPERTY_RETAIN_FOR_WEEKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetainForWeeks(Integer retainForWeeks) {
    this.retainForWeeks = retainForWeeks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizationScheduleInfoWeeklySchedule sanitizationScheduleInfoWeeklySchedule = (SanitizationScheduleInfoWeeklySchedule) o;
    return Objects.equals(this.weekDays, sanitizationScheduleInfoWeeklySchedule.weekDays) &&
        Objects.equals(this.retainForWeeks, sanitizationScheduleInfoWeeklySchedule.retainForWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(weekDays, retainForWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanitizationScheduleInfoWeeklySchedule {\n");
    sb.append("    weekDays: ").append(toIndentedString(weekDays)).append("\n");
    sb.append("    retainForWeeks: ").append(toIndentedString(retainForWeeks)).append("\n");
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
