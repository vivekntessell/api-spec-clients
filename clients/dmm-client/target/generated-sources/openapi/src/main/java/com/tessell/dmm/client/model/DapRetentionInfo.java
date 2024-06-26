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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DapRetentionInfo
 */
@JsonPropertyOrder({
  DapRetentionInfo.JSON_PROPERTY_PITR,
  DapRetentionInfo.JSON_PROPERTY_DAILY_BACKUPS
})
@JsonTypeName("DapRetentionInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DapRetentionInfo {
  public static final String JSON_PROPERTY_PITR = "pitr";
  private Integer pitr = 0;

  public static final String JSON_PROPERTY_DAILY_BACKUPS = "dailyBackups";
  private Integer dailyBackups = 0;


  public DapRetentionInfo pitr(Integer pitr) {
    
    this.pitr = pitr;
    return this;
  }

   /**
   * Retention time (in days) for Point-In-Time recoverability
   * minimum: 0
   * maximum: 35
   * @return pitr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Retention time (in days) for Point-In-Time recoverability")
  @JsonProperty(JSON_PROPERTY_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPitr() {
    return pitr;
  }


  @JsonProperty(JSON_PROPERTY_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPitr(Integer pitr) {
    this.pitr = pitr;
  }


  public DapRetentionInfo dailyBackups(Integer dailyBackups) {
    
    this.dailyBackups = dailyBackups;
    return this;
  }

   /**
   * Retention time (in days) to retain daily snapshots
   * minimum: 0
   * maximum: 730
   * @return dailyBackups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Retention time (in days) to retain daily snapshots")
  @JsonProperty(JSON_PROPERTY_DAILY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDailyBackups() {
    return dailyBackups;
  }


  @JsonProperty(JSON_PROPERTY_DAILY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDailyBackups(Integer dailyBackups) {
    this.dailyBackups = dailyBackups;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DapRetentionInfo dapRetentionInfo = (DapRetentionInfo) o;
    return Objects.equals(this.pitr, dapRetentionInfo.pitr) &&
        Objects.equals(this.dailyBackups, dapRetentionInfo.dailyBackups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pitr, dailyBackups);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DapRetentionInfo {\n");
    sb.append("    pitr: ").append(toIndentedString(pitr)).append("\n");
    sb.append("    dailyBackups: ").append(toIndentedString(dailyBackups)).append("\n");
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

