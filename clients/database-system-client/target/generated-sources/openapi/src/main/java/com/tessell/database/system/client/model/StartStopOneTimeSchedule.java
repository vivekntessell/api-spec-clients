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
 * One time start/stop schedule details for the DB Service
 */
@ApiModel(description = "One time start/stop schedule details for the DB Service")
@JsonPropertyOrder({
  StartStopOneTimeSchedule.JSON_PROPERTY_DB_SERVICE_START_AT,
  StartStopOneTimeSchedule.JSON_PROPERTY_DB_SERVICE_STOP_AT
})
@JsonTypeName("StartStopOneTimeSchedule")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StartStopOneTimeSchedule {
  public static final String JSON_PROPERTY_DB_SERVICE_START_AT = "dbServiceStartAt";
  private Date dbServiceStartAt;

  public static final String JSON_PROPERTY_DB_SERVICE_STOP_AT = "dbServiceStopAt";
  private Date dbServiceStopAt;


  public StartStopOneTimeSchedule dbServiceStartAt(Date dbServiceStartAt) {
    
    this.dbServiceStartAt = dbServiceStartAt;
    return this;
  }

   /**
   * Time at which the DB Service should be started at
   * @return dbServiceStartAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the DB Service should be started at")
  @JsonProperty(JSON_PROPERTY_DB_SERVICE_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDbServiceStartAt() {
    return dbServiceStartAt;
  }


  @JsonProperty(JSON_PROPERTY_DB_SERVICE_START_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbServiceStartAt(Date dbServiceStartAt) {
    this.dbServiceStartAt = dbServiceStartAt;
  }


  public StartStopOneTimeSchedule dbServiceStopAt(Date dbServiceStopAt) {
    
    this.dbServiceStopAt = dbServiceStopAt;
    return this;
  }

   /**
   * Time at which the DB Service should be stopped at
   * @return dbServiceStopAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Time at which the DB Service should be stopped at")
  @JsonProperty(JSON_PROPERTY_DB_SERVICE_STOP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDbServiceStopAt() {
    return dbServiceStopAt;
  }


  @JsonProperty(JSON_PROPERTY_DB_SERVICE_STOP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbServiceStopAt(Date dbServiceStopAt) {
    this.dbServiceStopAt = dbServiceStopAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StartStopOneTimeSchedule startStopOneTimeSchedule = (StartStopOneTimeSchedule) o;
    return Objects.equals(this.dbServiceStartAt, startStopOneTimeSchedule.dbServiceStartAt) &&
        Objects.equals(this.dbServiceStopAt, startStopOneTimeSchedule.dbServiceStopAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dbServiceStartAt, dbServiceStopAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StartStopOneTimeSchedule {\n");
    sb.append("    dbServiceStartAt: ").append(toIndentedString(dbServiceStartAt)).append("\n");
    sb.append("    dbServiceStopAt: ").append(toIndentedString(dbServiceStopAt)).append("\n");
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
