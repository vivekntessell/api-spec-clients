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
import com.tessell.dmm.client.model.DatabaseBackupStatus;
import com.tessell.dmm.client.model.EntityAclSharingSummaryInfo;
import com.tessell.dmm.client.model.PreAuthUrlStatus;
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
  DataflixBackup.JSON_PROPERTY_ID,
  DataflixBackup.JSON_PROPERTY_NAME,
  DataflixBackup.JSON_PROPERTY_BACKUP_TIME,
  DataflixBackup.JSON_PROPERTY_STATUS,
  DataflixBackup.JSON_PROPERTY_SIZE,
  DataflixBackup.JSON_PROPERTY_MANUAL,
  DataflixBackup.JSON_PROPERTY_CLOUD_AVAILABILITY,
  DataflixBackup.JSON_PROPERTY_DATABASES,
  DataflixBackup.JSON_PROPERTY_SHARED_WITH,
  DataflixBackup.JSON_PROPERTY_DOWNLOAD_URL_STATUS,
  DataflixBackup.JSON_PROPERTY_BACKUP_SOURCE_INFO
})
@JsonTypeName("DataflixBackup")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DataflixBackup {
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

  public static final String JSON_PROPERTY_DATABASES = "databases";
  private List<BackupDatabaseInfo> databases = null;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  private EntityAclSharingSummaryInfo sharedWith;

  public static final String JSON_PROPERTY_DOWNLOAD_URL_STATUS = "downloadUrlStatus";
  private PreAuthUrlStatus downloadUrlStatus;

  public static final String JSON_PROPERTY_BACKUP_SOURCE_INFO = "backupSourceInfo";
  private BackupSourceInfo backupSourceInfo;


  public DataflixBackup id(UUID id) {
    
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


  public DataflixBackup name(String name) {
    
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


  public DataflixBackup backupTime(Date backupTime) {
    
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


  public DataflixBackup status(DatabaseBackupStatus status) {
    
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


  public DataflixBackup size(Long size) {
    
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


  public DataflixBackup manual(Boolean manual) {
    
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


  public DataflixBackup cloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public DataflixBackup addCloudAvailabilityItem(CloudRegionInfo cloudAvailabilityItem) {
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


  public DataflixBackup databases(List<BackupDatabaseInfo> databases) {
    
    this.databases = databases;
    return this;
  }

  public DataflixBackup addDatabasesItem(BackupDatabaseInfo databasesItem) {
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


  public DataflixBackup sharedWith(EntityAclSharingSummaryInfo sharedWith) {
    
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


  public DataflixBackup downloadUrlStatus(PreAuthUrlStatus downloadUrlStatus) {
    
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


  public DataflixBackup backupSourceInfo(BackupSourceInfo backupSourceInfo) {
    
    this.backupSourceInfo = backupSourceInfo;
    return this;
  }

   /**
   * Get backupSourceInfo
   * @return backupSourceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_SOURCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupSourceInfo getBackupSourceInfo() {
    return backupSourceInfo;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_SOURCE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupSourceInfo(BackupSourceInfo backupSourceInfo) {
    this.backupSourceInfo = backupSourceInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataflixBackup dataflixBackup = (DataflixBackup) o;
    return Objects.equals(this.id, dataflixBackup.id) &&
        Objects.equals(this.name, dataflixBackup.name) &&
        Objects.equals(this.backupTime, dataflixBackup.backupTime) &&
        Objects.equals(this.status, dataflixBackup.status) &&
        Objects.equals(this.size, dataflixBackup.size) &&
        Objects.equals(this.manual, dataflixBackup.manual) &&
        Objects.equals(this.cloudAvailability, dataflixBackup.cloudAvailability) &&
        Objects.equals(this.databases, dataflixBackup.databases) &&
        Objects.equals(this.sharedWith, dataflixBackup.sharedWith) &&
        Objects.equals(this.downloadUrlStatus, dataflixBackup.downloadUrlStatus) &&
        Objects.equals(this.backupSourceInfo, dataflixBackup.backupSourceInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, backupTime, status, size, manual, cloudAvailability, databases, sharedWith, downloadUrlStatus, backupSourceInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataflixBackup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    backupTime: ").append(toIndentedString(backupTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
    sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    downloadUrlStatus: ").append(toIndentedString(downloadUrlStatus)).append("\n");
    sb.append("    backupSourceInfo: ").append(toIndentedString(backupSourceInfo)).append("\n");
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
