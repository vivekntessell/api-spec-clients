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
import com.tessell.dmm.client.model.BackupSourceInfo;
import com.tessell.dmm.client.model.CloudRegionInfo;
import com.tessell.dmm.client.model.DatabaseBackupSharedWith;
import com.tessell.dmm.client.model.DatabaseBackupStatus;
import com.tessell.dmm.client.model.PreAuthUrlStatus;
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
 * Information about the native backup
 */
@ApiModel(description = "Information about the native backup")
@JsonPropertyOrder({
  DatabaseBackup.JSON_PROPERTY_ID,
  DatabaseBackup.JSON_PROPERTY_NAME,
  DatabaseBackup.JSON_PROPERTY_BACKUP_TIME,
  DatabaseBackup.JSON_PROPERTY_STATUS,
  DatabaseBackup.JSON_PROPERTY_SIZE,
  DatabaseBackup.JSON_PROPERTY_MANUAL,
  DatabaseBackup.JSON_PROPERTY_CLOUD_AVAILABILITY,
  DatabaseBackup.JSON_PROPERTY_AVAILABILITY_CONFIG,
  DatabaseBackup.JSON_PROPERTY_DATABASES,
  DatabaseBackup.JSON_PROPERTY_BACKUP_INFO,
  DatabaseBackup.JSON_PROPERTY_SHARED_WITH,
  DatabaseBackup.JSON_PROPERTY_DOWNLOAD_URL_STATUS
})
@JsonTypeName("DatabaseBackup")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseBackup {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BACKUP_TIME = "backupTime";
  private Date backupTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DatabaseBackupStatus status;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Long size;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private Boolean manual;

  public static final String JSON_PROPERTY_CLOUD_AVAILABILITY = "cloudAvailability";
  private List<CloudRegionInfo> cloudAvailability = null;

  public static final String JSON_PROPERTY_AVAILABILITY_CONFIG = "availabilityConfig";
  private List<SnapshotAvailabilityConfig> availabilityConfig = null;

  public static final String JSON_PROPERTY_DATABASES = "databases";
  private List<BackupDatabaseInfo> databases = null;

  public static final String JSON_PROPERTY_BACKUP_INFO = "backupInfo";
  private BackupSourceInfo backupInfo;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  private DatabaseBackupSharedWith sharedWith;

  public static final String JSON_PROPERTY_DOWNLOAD_URL_STATUS = "downloadUrlStatus";
  private PreAuthUrlStatus downloadUrlStatus;


  public DatabaseBackup id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * ID of the backup
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ID of the backup")
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


  public DatabaseBackup name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the backup
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the backup")
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


  public DatabaseBackup backupTime(Date backupTime) {
    
    this.backupTime = backupTime;
    return this;
  }

   /**
   * Backup capture time
   * @return backupTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Backup capture time")
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


  public DatabaseBackup status(DatabaseBackupStatus status) {
    
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


  public DatabaseBackup size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * Size of this backup (in bytes)
   * @return size
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Size of this backup (in bytes)")
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


  public DatabaseBackup manual(Boolean manual) {
    
    this.manual = manual;
    return this;
  }

   /**
   * Specifies whether the backup is captured as per manual user request or per automated schedule
   * @return manual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies whether the backup is captured as per manual user request or per automated schedule")
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


  public DatabaseBackup cloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public DatabaseBackup addCloudAvailabilityItem(CloudRegionInfo cloudAvailabilityItem) {
    if (this.cloudAvailability == null) {
      this.cloudAvailability = new ArrayList<>();
    }
    this.cloudAvailability.add(cloudAvailabilityItem);
    return this;
  }

   /**
   * The cloud and region information where this backup has been made available at
   * @return cloudAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud and region information where this backup has been made available at")
  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CloudRegionInfo> getCloudAvailability() {
    return cloudAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    this.cloudAvailability = cloudAvailability;
  }


  public DatabaseBackup availabilityConfig(List<SnapshotAvailabilityConfig> availabilityConfig) {
    
    this.availabilityConfig = availabilityConfig;
    return this;
  }

  public DatabaseBackup addAvailabilityConfigItem(SnapshotAvailabilityConfig availabilityConfigItem) {
    if (this.availabilityConfig == null) {
      this.availabilityConfig = new ArrayList<>();
    }
    this.availabilityConfig.add(availabilityConfigItem);
    return this;
  }

   /**
   * The config information for cloud and region availability for this backup
   * @return availabilityConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The config information for cloud and region availability for this backup")
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


  public DatabaseBackup databases(List<BackupDatabaseInfo> databases) {
    
    this.databases = databases;
    return this;
  }

  public DatabaseBackup addDatabasesItem(BackupDatabaseInfo databasesItem) {
    if (this.databases == null) {
      this.databases = new ArrayList<>();
    }
    this.databases.add(databasesItem);
    return this;
  }

   /**
   * The databases that are captured as part of this backup
   * @return databases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The databases that are captured as part of this backup")
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


  public DatabaseBackup backupInfo(BackupSourceInfo backupInfo) {
    
    this.backupInfo = backupInfo;
    return this;
  }

   /**
   * Get backupInfo
   * @return backupInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupSourceInfo getBackupInfo() {
    return backupInfo;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupInfo(BackupSourceInfo backupInfo) {
    this.backupInfo = backupInfo;
  }


  public DatabaseBackup sharedWith(DatabaseBackupSharedWith sharedWith) {
    
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

  public DatabaseBackupSharedWith getSharedWith() {
    return sharedWith;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWith(DatabaseBackupSharedWith sharedWith) {
    this.sharedWith = sharedWith;
  }


  public DatabaseBackup downloadUrlStatus(PreAuthUrlStatus downloadUrlStatus) {
    
    this.downloadUrlStatus = downloadUrlStatus;
    return this;
  }

   /**
   * Get downloadUrlStatus
   * @return downloadUrlStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PreAuthUrlStatus getDownloadUrlStatus() {
    return downloadUrlStatus;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrlStatus(PreAuthUrlStatus downloadUrlStatus) {
    this.downloadUrlStatus = downloadUrlStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseBackup databaseBackup = (DatabaseBackup) o;
    return Objects.equals(this.id, databaseBackup.id) &&
        Objects.equals(this.name, databaseBackup.name) &&
        Objects.equals(this.backupTime, databaseBackup.backupTime) &&
        Objects.equals(this.status, databaseBackup.status) &&
        Objects.equals(this.size, databaseBackup.size) &&
        Objects.equals(this.manual, databaseBackup.manual) &&
        Objects.equals(this.cloudAvailability, databaseBackup.cloudAvailability) &&
        Objects.equals(this.availabilityConfig, databaseBackup.availabilityConfig) &&
        Objects.equals(this.databases, databaseBackup.databases) &&
        Objects.equals(this.backupInfo, databaseBackup.backupInfo) &&
        Objects.equals(this.sharedWith, databaseBackup.sharedWith) &&
        Objects.equals(this.downloadUrlStatus, databaseBackup.downloadUrlStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, backupTime, status, size, manual, cloudAvailability, availabilityConfig, databases, backupInfo, sharedWith, downloadUrlStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseBackup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
    sb.append("    availabilityConfig: ").append(toIndentedString(availabilityConfig)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    backupInfo: ").append(toIndentedString(backupInfo)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    downloadUrlStatus: ").append(toIndentedString(downloadUrlStatus)).append("\n");
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

