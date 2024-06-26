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
import com.tessell.dmm.client.model.BackupDatabaseInfo;
import com.tessell.dmm.client.model.DatabaseBackupStatus;
import com.tessell.dmm.client.model.DatabaseSnapshotCloudRegionInfo;
import com.tessell.dmm.client.model.EntityAclSharingSummaryInfo;
import com.tessell.dmm.client.model.PreAuthUrlStatus;
import com.tessell.dmm.client.model.SanitizedDatabaseSnapshotSanitizationInfo;
import com.tessell.dmm.client.model.SnapshotAvailabilityConfig;
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
 * Information about a Sanitized Snapshot
 */
@ApiModel(description = "Information about a Sanitized Snapshot")
@JsonPropertyOrder({
  SanitizedDatabaseSnapshot.JSON_PROPERTY_ID,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_NAME,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_SNAPSHOT_TIME,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_STATUS,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_SIZE,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_MANUAL,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_CLOUD_AVAILABILITY,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_AVAILABILITY_CONFIG,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_SANITIZATION_INFO,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_DATABASES,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_SHARED_WITH,
  SanitizedDatabaseSnapshot.JSON_PROPERTY_BACKUP_STATUS
})
@JsonTypeName("SanitizedDatabaseSnapshot")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SanitizedDatabaseSnapshot {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SNAPSHOT_TIME = "snapshotTime";
  private Date snapshotTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DatabaseBackupStatus status;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private Boolean manual;

  public static final String JSON_PROPERTY_CLOUD_AVAILABILITY = "cloudAvailability";
  private List<DatabaseSnapshotCloudRegionInfo> cloudAvailability = null;

  public static final String JSON_PROPERTY_AVAILABILITY_CONFIG = "availabilityConfig";
  private List<SnapshotAvailabilityConfig> availabilityConfig = null;

  public static final String JSON_PROPERTY_SANITIZATION_INFO = "sanitizationInfo";
  private SanitizedDatabaseSnapshotSanitizationInfo sanitizationInfo;

  public static final String JSON_PROPERTY_DATABASES = "databases";
  private List<BackupDatabaseInfo> databases = null;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  private EntityAclSharingSummaryInfo sharedWith;

  public static final String JSON_PROPERTY_BACKUP_STATUS = "backupStatus";
  private PreAuthUrlStatus backupStatus;


  public SanitizedDatabaseSnapshot id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the sanitized snapshot
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the sanitized snapshot")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public SanitizedDatabaseSnapshot name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the sanitized snapshot
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the sanitized snapshot")
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


  public SanitizedDatabaseSnapshot snapshotTime(Date snapshotTime) {
    
    this.snapshotTime = snapshotTime;
    return this;
  }

   /**
   * Capture time of the source snapshot from which this sanitized snapshot is created
   * @return snapshotTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Capture time of the source snapshot from which this sanitized snapshot is created")
  @JsonProperty(JSON_PROPERTY_SNAPSHOT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getSnapshotTime() {
    return snapshotTime;
  }


  @JsonProperty(JSON_PROPERTY_SNAPSHOT_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSnapshotTime(Date snapshotTime) {
    this.snapshotTime = snapshotTime;
  }


  public SanitizedDatabaseSnapshot status(DatabaseBackupStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DatabaseBackupStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DatabaseBackupStatus status) {
    this.status = status;
  }


  public SanitizedDatabaseSnapshot size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of this snapshot (in bytes)
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of this snapshot (in bytes)")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public SanitizedDatabaseSnapshot manual(Boolean manual) {
    
    this.manual = manual;
    return this;
  }

   /**
   * Specifies whether this snapshot is created based on a manual user request or through an automated schedule
   * @return manual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether this snapshot is created based on a manual user request or through an automated schedule")
  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getManual() {
    return manual;
  }


  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setManual(Boolean manual) {
    this.manual = manual;
  }


  public SanitizedDatabaseSnapshot cloudAvailability(List<DatabaseSnapshotCloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public SanitizedDatabaseSnapshot addCloudAvailabilityItem(DatabaseSnapshotCloudRegionInfo cloudAvailabilityItem) {
    if (this.cloudAvailability == null) {
      this.cloudAvailability = new ArrayList<>();
    }
    this.cloudAvailability.add(cloudAvailabilityItem);
    return this;
  }

   /**
   * The cloud and region information where this snapshot has been made available at
   * @return cloudAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud and region information where this snapshot has been made available at")
  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DatabaseSnapshotCloudRegionInfo> getCloudAvailability() {
    return cloudAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAvailability(List<DatabaseSnapshotCloudRegionInfo> cloudAvailability) {
    this.cloudAvailability = cloudAvailability;
  }


  public SanitizedDatabaseSnapshot availabilityConfig(List<SnapshotAvailabilityConfig> availabilityConfig) {
    
    this.availabilityConfig = availabilityConfig;
    return this;
  }

  public SanitizedDatabaseSnapshot addAvailabilityConfigItem(SnapshotAvailabilityConfig availabilityConfigItem) {
    if (this.availabilityConfig == null) {
      this.availabilityConfig = new ArrayList<>();
    }
    this.availabilityConfig.add(availabilityConfigItem);
    return this;
  }

   /**
   * The config information for cloud and region availability for this snapshot
   * @return availabilityConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The config information for cloud and region availability for this snapshot")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SnapshotAvailabilityConfig> getAvailabilityConfig() {
    return availabilityConfig;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityConfig(List<SnapshotAvailabilityConfig> availabilityConfig) {
    this.availabilityConfig = availabilityConfig;
  }


  public SanitizedDatabaseSnapshot sanitizationInfo(SanitizedDatabaseSnapshotSanitizationInfo sanitizationInfo) {
    
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

  public SanitizedDatabaseSnapshotSanitizationInfo getSanitizationInfo() {
    return sanitizationInfo;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizationInfo(SanitizedDatabaseSnapshotSanitizationInfo sanitizationInfo) {
    this.sanitizationInfo = sanitizationInfo;
  }


  public SanitizedDatabaseSnapshot databases(List<BackupDatabaseInfo> databases) {
    
    this.databases = databases;
    return this;
  }

  public SanitizedDatabaseSnapshot addDatabasesItem(BackupDatabaseInfo databasesItem) {
    if (this.databases == null) {
      this.databases = new ArrayList<>();
    }
    this.databases.add(databasesItem);
    return this;
  }

   /**
   * The databases that are captured as part of the snapshot
   * @return databases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The databases that are captured as part of the snapshot")
  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<BackupDatabaseInfo> getDatabases() {
    return databases;
  }


  @JsonProperty(JSON_PROPERTY_DATABASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabases(List<BackupDatabaseInfo> databases) {
    this.databases = databases;
  }


  public SanitizedDatabaseSnapshot sharedWith(EntityAclSharingSummaryInfo sharedWith) {
    
    this.sharedWith = sharedWith;
    return this;
  }

   /**
   * Get sharedWith
   * @return sharedWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EntityAclSharingSummaryInfo getSharedWith() {
    return sharedWith;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWith(EntityAclSharingSummaryInfo sharedWith) {
    this.sharedWith = sharedWith;
  }


  public SanitizedDatabaseSnapshot backupStatus(PreAuthUrlStatus backupStatus) {
    
    this.backupStatus = backupStatus;
    return this;
  }

   /**
   * Get backupStatus
   * @return backupStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreAuthUrlStatus getBackupStatus() {
    return backupStatus;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupStatus(PreAuthUrlStatus backupStatus) {
    this.backupStatus = backupStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizedDatabaseSnapshot sanitizedDatabaseSnapshot = (SanitizedDatabaseSnapshot) o;
    return Objects.equals(this.id, sanitizedDatabaseSnapshot.id) &&
        Objects.equals(this.name, sanitizedDatabaseSnapshot.name) &&
        Objects.equals(this.snapshotTime, sanitizedDatabaseSnapshot.snapshotTime) &&
        Objects.equals(this.status, sanitizedDatabaseSnapshot.status) &&
        Objects.equals(this.size, sanitizedDatabaseSnapshot.size) &&
        Objects.equals(this.manual, sanitizedDatabaseSnapshot.manual) &&
        Objects.equals(this.cloudAvailability, sanitizedDatabaseSnapshot.cloudAvailability) &&
        Objects.equals(this.availabilityConfig, sanitizedDatabaseSnapshot.availabilityConfig) &&
        Objects.equals(this.sanitizationInfo, sanitizedDatabaseSnapshot.sanitizationInfo) &&
        Objects.equals(this.databases, sanitizedDatabaseSnapshot.databases) &&
        Objects.equals(this.sharedWith, sanitizedDatabaseSnapshot.sharedWith) &&
        Objects.equals(this.backupStatus, sanitizedDatabaseSnapshot.backupStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, snapshotTime, status, size, manual, cloudAvailability, availabilityConfig, sanitizationInfo, databases, sharedWith, backupStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanitizedDatabaseSnapshot {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    snapshotTime: ").append(toIndentedString(snapshotTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
    sb.append("    availabilityConfig: ").append(toIndentedString(availabilityConfig)).append("\n");
    sb.append("    sanitizationInfo: ").append(toIndentedString(sanitizationInfo)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    backupStatus: ").append(toIndentedString(backupStatus)).append("\n");
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

