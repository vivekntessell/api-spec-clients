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
 * Clock time format value in hour and minute.
 */
@ApiModel(description = "Clock time format value in hour and minute.")
@JsonPropertyOrder({
  TimeFormat.JSON_PROPERTY_HOUR,
  TimeFormat.JSON_PROPERTY_MINUTE
})
@JsonTypeName("TimeFormat")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeFormat {
  public static final String JSON_PROPERTY_HOUR = "hour";
  private Integer hour = 1;

  public static final String JSON_PROPERTY_MINUTE = "minute";
  private Integer minute = 0;


  public TimeFormat hour(Integer hour) {
    
    this.hour = hour;
    return this;
  }

   /**
   * Get hour
   * minimum: 0
   * maximum: 23
   * @return hour
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getHour() {
    return hour;
  }


  @JsonProperty(JSON_PROPERTY_HOUR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHour(Integer hour) {
    this.hour = hour;
  }


  public TimeFormat minute(Integer minute) {
    
    this.minute = minute;
    return this;
  }

   /**
   * Get minute
   * minimum: 0
   * maximum: 59
   * @return minute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMinute() {
    return minute;
  }


  @JsonProperty(JSON_PROPERTY_MINUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMinute(Integer minute) {
    this.minute = minute;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeFormat timeFormat = (TimeFormat) o;
    return Objects.equals(this.hour, timeFormat.hour) &&
        Objects.equals(this.minute, timeFormat.minute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hour, minute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeFormat {\n");
    sb.append("    hour: ").append(toIndentedString(hour)).append("\n");
    sb.append("    minute: ").append(toIndentedString(minute)).append("\n");
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

