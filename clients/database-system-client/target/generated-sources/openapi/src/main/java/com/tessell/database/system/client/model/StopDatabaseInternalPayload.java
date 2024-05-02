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
 * StopDatabaseInternalPayload
 */
@JsonPropertyOrder({
  StopDatabaseInternalPayload.JSON_PROPERTY_STOP_AFTER_HOURS,
  StopDatabaseInternalPayload.JSON_PROPERTY_HARD_STOP
})
@JsonTypeName("StopDatabaseInternalPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StopDatabaseInternalPayload {
  public static final String JSON_PROPERTY_STOP_AFTER_HOURS = "stopAfterHours";
  private Integer stopAfterHours;

  public static final String JSON_PROPERTY_HARD_STOP = "hardStop";
  private Boolean hardStop = false;


  public StopDatabaseInternalPayload stopAfterHours(Integer stopAfterHours) {
    
    this.stopAfterHours = stopAfterHours;
    return this;
  }

   /**
   * After how many hours, do you plan to stop the database.
   * @return stopAfterHours
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "After how many hours, do you plan to stop the database.")
  @JsonProperty(JSON_PROPERTY_STOP_AFTER_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getStopAfterHours() {
    return stopAfterHours;
  }


  @JsonProperty(JSON_PROPERTY_STOP_AFTER_HOURS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStopAfterHours(Integer stopAfterHours) {
    this.stopAfterHours = stopAfterHours;
  }


  public StopDatabaseInternalPayload hardStop(Boolean hardStop) {
    
    this.hardStop = hardStop;
    return this;
  }

   /**
   * Get hardStop
   * @return hardStop
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_HARD_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHardStop() {
    return hardStop;
  }


  @JsonProperty(JSON_PROPERTY_HARD_STOP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHardStop(Boolean hardStop) {
    this.hardStop = hardStop;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StopDatabaseInternalPayload stopDatabaseInternalPayload = (StopDatabaseInternalPayload) o;
    return Objects.equals(this.stopAfterHours, stopDatabaseInternalPayload.stopAfterHours) &&
        Objects.equals(this.hardStop, stopDatabaseInternalPayload.hardStop);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stopAfterHours, hardStop);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StopDatabaseInternalPayload {\n");
    sb.append("    stopAfterHours: ").append(toIndentedString(stopAfterHours)).append("\n");
    sb.append("    hardStop: ").append(toIndentedString(hardStop)).append("\n");
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

