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
 * This is a definition for Tessell Database Snapshot Service Consumer Object
 */
@ApiModel(description = "This is a definition for Tessell Database Snapshot Service Consumer Object")
@JsonPropertyOrder({
  OldDatabaseBackup.JSON_PROPERTY_BACKUP_TIME,
  OldDatabaseBackup.JSON_PROPERTY_BACKUP_TYPE,
  OldDatabaseBackup.JSON_PROPERTY_NAME,
  OldDatabaseBackup.JSON_PROPERTY_RETENTION_TYPE,
  OldDatabaseBackup.JSON_PROPERTY_STATUS
})
@JsonTypeName("OldDatabaseBackup")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class OldDatabaseBackup {
  public static final String JSON_PROPERTY_BACKUP_TIME = "backupTime";
  private Date backupTime;

  public static final String JSON_PROPERTY_BACKUP_TYPE = "backupType";
  private String backupType;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RETENTION_TYPE = "retentionType";
  private String retentionType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;


  public OldDatabaseBackup backupTime(Date backupTime) {
    
    this.backupTime = backupTime;
    return this;
  }

   /**
   * Database Backup capture time
   * @return backupTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Backup capture time")
  @JsonProperty(JSON_PROPERTY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getBackupTime() {
    return backupTime;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupTime(Date backupTime) {
    this.backupTime = backupTime;
  }


  public OldDatabaseBackup backupType(String backupType) {
    
    this.backupType = backupType;
    return this;
  }

   /**
   * Database Backup&#39;s type
   * @return backupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Backup's type")
  @JsonProperty(JSON_PROPERTY_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBackupType() {
    return backupType;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupType(String backupType) {
    this.backupType = backupType;
  }


  public OldDatabaseBackup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Database Snapshot name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Snapshot name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public OldDatabaseBackup retentionType(String retentionType) {
    
    this.retentionType = retentionType;
    return this;
  }

   /**
   * Database Backup&#39;s retention type
   * @return retentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Backup's retention type")
  @JsonProperty(JSON_PROPERTY_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRetentionType() {
    return retentionType;
  }


  @JsonProperty(JSON_PROPERTY_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetentionType(String retentionType) {
    this.retentionType = retentionType;
  }


  public OldDatabaseBackup status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Database Backup status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Database Backup status")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OldDatabaseBackup oldDatabaseBackup = (OldDatabaseBackup) o;
    return Objects.equals(this.backupTime, oldDatabaseBackup.backupTime) &&
        Objects.equals(this.backupType, oldDatabaseBackup.backupType) &&
        Objects.equals(this.name, oldDatabaseBackup.name) &&
        Objects.equals(this.retentionType, oldDatabaseBackup.retentionType) &&
        Objects.equals(this.status, oldDatabaseBackup.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupTime, backupType, name, retentionType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OldDatabaseBackup {\n");
    sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
