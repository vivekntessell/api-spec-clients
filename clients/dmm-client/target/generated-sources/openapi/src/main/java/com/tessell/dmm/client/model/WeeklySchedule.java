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
 * WeeklySchedule
 */
@JsonPropertyOrder({
  WeeklySchedule.JSON_PROPERTY_DAYS
})
@JsonTypeName("WeeklySchedule")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeeklySchedule {
  public static final String JSON_PROPERTY_DAYS = "days";
  private Set<WeekDay> days = null;


  public WeeklySchedule days(Set<WeekDay> days) {
    
    this.days = days;
    return this;
  }

  public WeeklySchedule addDaysItem(WeekDay daysItem) {
    if (this.days == null) {
      this.days = new LinkedHashSet<>();
    }
    this.days.add(daysItem);
    return this;
  }

   /**
   * Days in a week to retain weekly backups for
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Days in a week to retain weekly backups for")
  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<WeekDay> getDays() {
    return days;
  }


  @JsonProperty(JSON_PROPERTY_DAYS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDays(Set<WeekDay> days) {
    this.days = days;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeklySchedule weeklySchedule = (WeeklySchedule) o;
    return Objects.equals(this.days, weeklySchedule.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeklySchedule {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
