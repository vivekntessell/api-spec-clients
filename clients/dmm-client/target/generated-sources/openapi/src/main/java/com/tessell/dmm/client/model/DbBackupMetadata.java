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
import com.tessell.dmm.client.model.BackupSanitizationInfo;
import com.tessell.dmm.client.model.DbBackupRetentionType;
import com.tessell.dmm.client.model.TaskProgressEstimate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Database Backup&#39;s metadata information
 */
@ApiModel(description = "Database Backup's metadata information")
@JsonPropertyOrder({
  DbBackupMetadata.JSON_PROPERTY_TASK_PROGRESS_ESTIMATE,
  DbBackupMetadata.JSON_PROPERTY_MARKED_FOR_DELETION_AT,
  DbBackupMetadata.JSON_PROPERTY_FOR_PITR,
  DbBackupMetadata.JSON_PROPERTY_EXTRA,
  DbBackupMetadata.JSON_PROPERTY_IS_RETRYING,
  DbBackupMetadata.JSON_PROPERTY_APPLICABLE_RETENTION_TYPES,
  DbBackupMetadata.JSON_PROPERTY_LAST_RETENTION_TYPE,
  DbBackupMetadata.JSON_PROPERTY_DATA,
  DbBackupMetadata.JSON_PROPERTY_DATABASE_IDS,
  DbBackupMetadata.JSON_PROPERTY_COPY_OF_BACKUP_ID,
  DbBackupMetadata.JSON_PROPERTY_SANITIZATION_INFO,
  DbBackupMetadata.JSON_PROPERTY_BACKUP_BASED_SNAPSHOT
})
@JsonTypeName("DbBackupMetadata")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbBackupMetadata {
  public static final String JSON_PROPERTY_TASK_PROGRESS_ESTIMATE = "taskProgressEstimate";
  private TaskProgressEstimate taskProgressEstimate;

  public static final String JSON_PROPERTY_MARKED_FOR_DELETION_AT = "markedForDeletionAt";
  private Date markedForDeletionAt;

  public static final String JSON_PROPERTY_FOR_PITR = "forPitr";
  private Boolean forPitr = false;

  public static final String JSON_PROPERTY_EXTRA = "extra";
  private Boolean extra = false;

  public static final String JSON_PROPERTY_IS_RETRYING = "isRetrying";
  private Boolean isRetrying;

  public static final String JSON_PROPERTY_APPLICABLE_RETENTION_TYPES = "applicableRetentionTypes";
  private List<DbBackupRetentionType> applicableRetentionTypes = null;

  public static final String JSON_PROPERTY_LAST_RETENTION_TYPE = "lastRetentionType";
  private DbBackupRetentionType lastRetentionType;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_DATABASE_IDS = "databaseIds";
  private List<UUID> databaseIds = null;

  public static final String JSON_PROPERTY_COPY_OF_BACKUP_ID = "copyOfBackupId";
  private UUID copyOfBackupId;

  public static final String JSON_PROPERTY_SANITIZATION_INFO = "sanitizationInfo";
  private BackupSanitizationInfo sanitizationInfo;

  public static final String JSON_PROPERTY_BACKUP_BASED_SNAPSHOT = "backupBasedSnapshot";
  private Boolean backupBasedSnapshot = false;


  public DbBackupMetadata taskProgressEstimate(TaskProgressEstimate taskProgressEstimate) {
    
    this.taskProgressEstimate = taskProgressEstimate;
    return this;
  }

   /**
   * Get taskProgressEstimate
   * @return taskProgressEstimate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TASK_PROGRESS_ESTIMATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaskProgressEstimate getTaskProgressEstimate() {
    return taskProgressEstimate;
  }


  @JsonProperty(JSON_PROPERTY_TASK_PROGRESS_ESTIMATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaskProgressEstimate(TaskProgressEstimate taskProgressEstimate) {
    this.taskProgressEstimate = taskProgressEstimate;
  }


  public DbBackupMetadata markedForDeletionAt(Date markedForDeletionAt) {
    
    this.markedForDeletionAt = markedForDeletionAt;
    return this;
  }

   /**
   * Get markedForDeletionAt
   * @return markedForDeletionAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MARKED_FOR_DELETION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getMarkedForDeletionAt() {
    return markedForDeletionAt;
  }


  @JsonProperty(JSON_PROPERTY_MARKED_FOR_DELETION_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkedForDeletionAt(Date markedForDeletionAt) {
    this.markedForDeletionAt = markedForDeletionAt;
  }


  public DbBackupMetadata forPitr(Boolean forPitr) {
    
    this.forPitr = forPitr;
    return this;
  }

   /**
   * Get forPitr
   * @return forPitr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FOR_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getForPitr() {
    return forPitr;
  }


  @JsonProperty(JSON_PROPERTY_FOR_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setForPitr(Boolean forPitr) {
    this.forPitr = forPitr;
  }


  public DbBackupMetadata extra(Boolean extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * Get extra
   * @return extra
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getExtra() {
    return extra;
  }


  @JsonProperty(JSON_PROPERTY_EXTRA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExtra(Boolean extra) {
    this.extra = extra;
  }


  public DbBackupMetadata isRetrying(Boolean isRetrying) {
    
    this.isRetrying = isRetrying;
    return this;
  }

   /**
   * Get isRetrying
   * @return isRetrying
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_RETRYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsRetrying() {
    return isRetrying;
  }


  @JsonProperty(JSON_PROPERTY_IS_RETRYING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsRetrying(Boolean isRetrying) {
    this.isRetrying = isRetrying;
  }


  public DbBackupMetadata applicableRetentionTypes(List<DbBackupRetentionType> applicableRetentionTypes) {
    
    this.applicableRetentionTypes = applicableRetentionTypes;
    return this;
  }

  public DbBackupMetadata addApplicableRetentionTypesItem(DbBackupRetentionType applicableRetentionTypesItem) {
    if (this.applicableRetentionTypes == null) {
      this.applicableRetentionTypes = new ArrayList<>();
    }
    this.applicableRetentionTypes.add(applicableRetentionTypesItem);
    return this;
  }

   /**
   * Get applicableRetentionTypes
   * @return applicableRetentionTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_APPLICABLE_RETENTION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DbBackupRetentionType> getApplicableRetentionTypes() {
    return applicableRetentionTypes;
  }


  @JsonProperty(JSON_PROPERTY_APPLICABLE_RETENTION_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApplicableRetentionTypes(List<DbBackupRetentionType> applicableRetentionTypes) {
    this.applicableRetentionTypes = applicableRetentionTypes;
  }


  public DbBackupMetadata lastRetentionType(DbBackupRetentionType lastRetentionType) {
    
    this.lastRetentionType = lastRetentionType;
    return this;
  }

   /**
   * Get lastRetentionType
   * @return lastRetentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbBackupRetentionType getLastRetentionType() {
    return lastRetentionType;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastRetentionType(DbBackupRetentionType lastRetentionType) {
    this.lastRetentionType = lastRetentionType;
  }


  public DbBackupMetadata data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  public DbBackupMetadata databaseIds(List<UUID> databaseIds) {
    
    this.databaseIds = databaseIds;
    return this;
  }

  public DbBackupMetadata addDatabaseIdsItem(UUID databaseIdsItem) {
    if (this.databaseIds == null) {
      this.databaseIds = new ArrayList<>();
    }
    this.databaseIds.add(databaseIdsItem);
    return this;
  }

   /**
   * Get databaseIds
   * @return databaseIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getDatabaseIds() {
    return databaseIds;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseIds(List<UUID> databaseIds) {
    this.databaseIds = databaseIds;
  }


  public DbBackupMetadata copyOfBackupId(UUID copyOfBackupId) {
    
    this.copyOfBackupId = copyOfBackupId;
    return this;
  }

   /**
   * Get copyOfBackupId
   * @return copyOfBackupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COPY_OF_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCopyOfBackupId() {
    return copyOfBackupId;
  }


  @JsonProperty(JSON_PROPERTY_COPY_OF_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCopyOfBackupId(UUID copyOfBackupId) {
    this.copyOfBackupId = copyOfBackupId;
  }


  public DbBackupMetadata sanitizationInfo(BackupSanitizationInfo sanitizationInfo) {
    
    this.sanitizationInfo = sanitizationInfo;
    return this;
  }

   /**
   * Get sanitizationInfo
   * @return sanitizationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SANITIZATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupSanitizationInfo getSanitizationInfo() {
    return sanitizationInfo;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizationInfo(BackupSanitizationInfo sanitizationInfo) {
    this.sanitizationInfo = sanitizationInfo;
  }


  public DbBackupMetadata backupBasedSnapshot(Boolean backupBasedSnapshot) {
    
    this.backupBasedSnapshot = backupBasedSnapshot;
    return this;
  }

   /**
   * Specify whether the snapshot is created on top of native backup
   * @return backupBasedSnapshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the snapshot is created on top of native backup")
  @JsonProperty(JSON_PROPERTY_BACKUP_BASED_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getBackupBasedSnapshot() {
    return backupBasedSnapshot;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_BASED_SNAPSHOT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupBasedSnapshot(Boolean backupBasedSnapshot) {
    this.backupBasedSnapshot = backupBasedSnapshot;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbBackupMetadata dbBackupMetadata = (DbBackupMetadata) o;
    return Objects.equals(this.taskProgressEstimate, dbBackupMetadata.taskProgressEstimate) &&
        Objects.equals(this.markedForDeletionAt, dbBackupMetadata.markedForDeletionAt) &&
        Objects.equals(this.forPitr, dbBackupMetadata.forPitr) &&
        Objects.equals(this.extra, dbBackupMetadata.extra) &&
        Objects.equals(this.isRetrying, dbBackupMetadata.isRetrying) &&
        Objects.equals(this.applicableRetentionTypes, dbBackupMetadata.applicableRetentionTypes) &&
        Objects.equals(this.lastRetentionType, dbBackupMetadata.lastRetentionType) &&
        Objects.equals(this.data, dbBackupMetadata.data) &&
        Objects.equals(this.databaseIds, dbBackupMetadata.databaseIds) &&
        Objects.equals(this.copyOfBackupId, dbBackupMetadata.copyOfBackupId) &&
        Objects.equals(this.sanitizationInfo, dbBackupMetadata.sanitizationInfo) &&
        Objects.equals(this.backupBasedSnapshot, dbBackupMetadata.backupBasedSnapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskProgressEstimate, markedForDeletionAt, forPitr, extra, isRetrying, applicableRetentionTypes, lastRetentionType, data, databaseIds, copyOfBackupId, sanitizationInfo, backupBasedSnapshot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbBackupMetadata {\n");
    sb.append("    taskProgressEstimate: ").append(toIndentedString(taskProgressEstimate)).append("\n");
    sb.append("    markedForDeletionAt: ").append(toIndentedString(markedForDeletionAt)).append("\n");
    sb.append("    forPitr: ").append(toIndentedString(forPitr)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    isRetrying: ").append(toIndentedString(isRetrying)).append("\n");
    sb.append("    applicableRetentionTypes: ").append(toIndentedString(applicableRetentionTypes)).append("\n");
    sb.append("    lastRetentionType: ").append(toIndentedString(lastRetentionType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    databaseIds: ").append(toIndentedString(databaseIds)).append("\n");
    sb.append("    copyOfBackupId: ").append(toIndentedString(copyOfBackupId)).append("\n");
    sb.append("    sanitizationInfo: ").append(toIndentedString(sanitizationInfo)).append("\n");
    sb.append("    backupBasedSnapshot: ").append(toIndentedString(backupBasedSnapshot)).append("\n");
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
