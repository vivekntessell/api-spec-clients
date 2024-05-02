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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SetupPitrDapOneTimeRepl
 */
@JsonPropertyOrder({
  SetupPitrDapOneTimeRepl.JSON_PROPERTY_FROM_TIME,
  SetupPitrDapOneTimeRepl.JSON_PROPERTY_TO_TIME
})
@JsonTypeName("SetupPitrDapOneTimeRepl")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SetupPitrDapOneTimeRepl {
  public static final String JSON_PROPERTY_FROM_TIME = "fromTime";
  private Date fromTime;

  public static final String JSON_PROPERTY_TO_TIME = "toTime";
  private Date toTime;


  public SetupPitrDapOneTimeRepl fromTime(Date fromTime) {
    
    this.fromTime = fromTime;
    return this;
  }

   /**
   * Get fromTime
   * @return fromTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getFromTime() {
    return fromTime;
  }


  @JsonProperty(JSON_PROPERTY_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFromTime(Date fromTime) {
    this.fromTime = fromTime;
  }


  public SetupPitrDapOneTimeRepl toTime(Date toTime) {
    
    this.toTime = toTime;
    return this;
  }

   /**
   * Get toTime
   * @return toTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TO_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getToTime() {
    return toTime;
  }


  @JsonProperty(JSON_PROPERTY_TO_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setToTime(Date toTime) {
    this.toTime = toTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetupPitrDapOneTimeRepl setupPitrDapOneTimeRepl = (SetupPitrDapOneTimeRepl) o;
    return Objects.equals(this.fromTime, setupPitrDapOneTimeRepl.fromTime) &&
        Objects.equals(this.toTime, setupPitrDapOneTimeRepl.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromTime, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetupPitrDapOneTimeRepl {\n");
    sb.append("    fromTime: ").append(toIndentedString(fromTime)).append("\n");
    sb.append("    toTime: ").append(toIndentedString(toTime)).append("\n");
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

