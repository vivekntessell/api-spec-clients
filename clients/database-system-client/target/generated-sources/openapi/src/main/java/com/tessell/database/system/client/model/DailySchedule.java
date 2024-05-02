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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DailySchedule
 */
@JsonPropertyOrder({
  DailySchedule.JSON_PROPERTY_BACKUPS_PER_DAY
})
@JsonTypeName("DailySchedule")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DailySchedule {
  public static final String JSON_PROPERTY_BACKUPS_PER_DAY = "backupsPerDay";
  private Integer backupsPerDay;


  public DailySchedule backupsPerDay(Integer backupsPerDay) {
    
    this.backupsPerDay = backupsPerDay;
    return this;
  }

   /**
   * The number of backups to be captured per day.
   * minimum: 0
   * @return backupsPerDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of backups to be captured per day.")
  @JsonProperty(JSON_PROPERTY_BACKUPS_PER_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBackupsPerDay() {
    return backupsPerDay;
  }


  @JsonProperty(JSON_PROPERTY_BACKUPS_PER_DAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupsPerDay(Integer backupsPerDay) {
    this.backupsPerDay = backupsPerDay;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DailySchedule dailySchedule = (DailySchedule) o;
    return Objects.equals(this.backupsPerDay, dailySchedule.backupsPerDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupsPerDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DailySchedule {\n");
    sb.append("    backupsPerDay: ").append(toIndentedString(backupsPerDay)).append("\n");
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
