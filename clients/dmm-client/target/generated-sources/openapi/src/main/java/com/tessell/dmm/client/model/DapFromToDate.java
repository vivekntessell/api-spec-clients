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
import com.tessell.dmm.client.model.OldDatabaseBackup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DapFromToDate
 */
@JsonPropertyOrder({
  DapFromToDate.JSON_PROPERTY_BACKUP_COUNT,
  DapFromToDate.JSON_PROPERTY_BACKUPS,
  DapFromToDate.JSON_PROPERTY_FROM_TIME,
  DapFromToDate.JSON_PROPERTY_TO_TIME
})
@JsonTypeName("DapFromToDate")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DapFromToDate {
  public static final String JSON_PROPERTY_BACKUP_COUNT = "backupCount";
  private Integer backupCount;

  public static final String JSON_PROPERTY_BACKUPS = "backups";
  private List<OldDatabaseBackup> backups = null;

  public static final String JSON_PROPERTY_FROM_TIME = "fromTime";
  private Date fromTime;

  public static final String JSON_PROPERTY_TO_TIME = "toTime";
  private Date toTime;


  public DapFromToDate backupCount(Integer backupCount) {
    
    this.backupCount = backupCount;
    return this;
  }

   /**
   * Get backupCount
   * @return backupCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getBackupCount() {
    return backupCount;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupCount(Integer backupCount) {
    this.backupCount = backupCount;
  }


  public DapFromToDate backups(List<OldDatabaseBackup> backups) {
    
    this.backups = backups;
    return this;
  }

  public DapFromToDate addBackupsItem(OldDatabaseBackup backupsItem) {
    if (this.backups == null) {
      this.backups = new ArrayList<>();
    }
    this.backups.add(backupsItem);
    return this;
  }

   /**
   * Get backups
   * @return backups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<OldDatabaseBackup> getBackups() {
    return backups;
  }


  @JsonProperty(JSON_PROPERTY_BACKUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackups(List<OldDatabaseBackup> backups) {
    this.backups = backups;
  }


  public DapFromToDate fromTime(Date fromTime) {
    
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


  public DapFromToDate toTime(Date toTime) {
    
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
    DapFromToDate dapFromToDate = (DapFromToDate) o;
    return Objects.equals(this.backupCount, dapFromToDate.backupCount) &&
        Objects.equals(this.backups, dapFromToDate.backups) &&
        Objects.equals(this.fromTime, dapFromToDate.fromTime) &&
        Objects.equals(this.toTime, dapFromToDate.toTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupCount, backups, fromTime, toTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DapFromToDate {\n");
    sb.append("    backupCount: ").append(toIndentedString(backupCount)).append("\n");
    sb.append("    backups: ").append(toIndentedString(backups)).append("\n");
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

