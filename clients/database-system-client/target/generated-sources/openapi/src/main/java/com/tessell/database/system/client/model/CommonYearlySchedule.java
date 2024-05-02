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
import com.tessell.database.system.client.model.CommonYearlyScheduleAllOf;
import com.tessell.database.system.client.model.DatesForEachMonth;
import com.tessell.database.system.client.model.Month;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CommonYearlySchedule
 */
@JsonPropertyOrder({
  CommonYearlySchedule.JSON_PROPERTY_DATES,
  CommonYearlySchedule.JSON_PROPERTY_LAST_DAY_OF_MONTH,
  CommonYearlySchedule.JSON_PROPERTY_MONTHS
})
@JsonTypeName("commonYearlySchedule")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CommonYearlySchedule {
  public static final String JSON_PROPERTY_DATES = "dates";
  private Set<Integer> dates = null;

  public static final String JSON_PROPERTY_LAST_DAY_OF_MONTH = "lastDayOfMonth";
  private Boolean lastDayOfMonth = false;

  public static final String JSON_PROPERTY_MONTHS = "months";
  private Set<Month> months = null;


  public CommonYearlySchedule dates(Set<Integer> dates) {
    
    this.dates = dates;
    return this;
  }

  public CommonYearlySchedule addDatesItem(Integer datesItem) {
    if (this.dates == null) {
      this.dates = new LinkedHashSet<>();
    }
    this.dates.add(datesItem);
    return this;
  }

   /**
   * Dates in a month to retain monthly backups
   * @return dates
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Dates in a month to retain monthly backups")
  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Integer> getDates() {
    return dates;
  }


  @JsonProperty(JSON_PROPERTY_DATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDates(Set<Integer> dates) {
    this.dates = dates;
  }


  public CommonYearlySchedule lastDayOfMonth(Boolean lastDayOfMonth) {
    
    this.lastDayOfMonth = lastDayOfMonth;
    return this;
  }

   /**
   * Get lastDayOfMonth
   * @return lastDayOfMonth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getLastDayOfMonth() {
    return lastDayOfMonth;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DAY_OF_MONTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastDayOfMonth(Boolean lastDayOfMonth) {
    this.lastDayOfMonth = lastDayOfMonth;
  }


  public CommonYearlySchedule months(Set<Month> months) {
    
    this.months = months;
    return this;
  }

  public CommonYearlySchedule addMonthsItem(Month monthsItem) {
    if (this.months == null) {
      this.months = new LinkedHashSet<>();
    }
    this.months.add(monthsItem);
    return this;
  }

   /**
   * Get months
   * @return months
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Set<Month> getMonths() {
    return months;
  }


  @JsonProperty(JSON_PROPERTY_MONTHS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMonths(Set<Month> months) {
    this.months = months;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonYearlySchedule commonYearlySchedule = (CommonYearlySchedule) o;
    return Objects.equals(this.dates, commonYearlySchedule.dates) &&
        Objects.equals(this.lastDayOfMonth, commonYearlySchedule.lastDayOfMonth) &&
        Objects.equals(this.months, commonYearlySchedule.months);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dates, lastDayOfMonth, months);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonYearlySchedule {\n");
    sb.append("    dates: ").append(toIndentedString(dates)).append("\n");
    sb.append("    lastDayOfMonth: ").append(toIndentedString(lastDayOfMonth)).append("\n");
    sb.append("    months: ").append(toIndentedString(months)).append("\n");
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

