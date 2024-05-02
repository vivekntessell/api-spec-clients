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
import com.tessell.dmm.client.model.DeleteBackupDbLogForDapPayload;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DeleteBackupDbLogForAmPayload
 */
@JsonPropertyOrder({
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_AM_NAME,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_DATABASE_ID,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_DATABASE_NAME,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_BACKUP_IDS,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_DB_LOG_IDS,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_DAP_DELETE_INFO,
  DeleteBackupDbLogForAmPayload.JSON_PROPERTY_NON_DAP_SECONDARY_BACKUP_IDS
})
@JsonTypeName("DeleteBackupDbLogForAmPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteBackupDbLogForAmPayload {
  public static final String JSON_PROPERTY_AM_NAME = "amName";
  private String amName;

  public static final String JSON_PROPERTY_DATABASE_ID = "databaseId";
  private UUID databaseId;

  public static final String JSON_PROPERTY_DATABASE_NAME = "databaseName";
  private String databaseName;

  public static final String JSON_PROPERTY_BACKUP_IDS = "backupIds";
  private List<UUID> backupIds = null;

  public static final String JSON_PROPERTY_DB_LOG_IDS = "dbLogIds";
  private List<UUID> dbLogIds = null;

  public static final String JSON_PROPERTY_DAP_DELETE_INFO = "dapDeleteInfo";
  private Map<String, DeleteBackupDbLogForDapPayload> dapDeleteInfo = null;

  public static final String JSON_PROPERTY_NON_DAP_SECONDARY_BACKUP_IDS = "nonDapSecondaryBackupIds";
  private List<UUID> nonDapSecondaryBackupIds = null;


  public DeleteBackupDbLogForAmPayload amName(String amName) {
    
    this.amName = amName;
    return this;
  }

   /**
   * Get amName
   * @return amName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAmName() {
    return amName;
  }


  @JsonProperty(JSON_PROPERTY_AM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmName(String amName) {
    this.amName = amName;
  }


  public DeleteBackupDbLogForAmPayload databaseId(UUID databaseId) {
    
    this.databaseId = databaseId;
    return this;
  }

   /**
   * Get databaseId
   * @return databaseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDatabaseId() {
    return databaseId;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseId(UUID databaseId) {
    this.databaseId = databaseId;
  }


  public DeleteBackupDbLogForAmPayload databaseName(String databaseName) {
    
    this.databaseName = databaseName;
    return this;
  }

   /**
   * Get databaseName
   * @return databaseName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDatabaseName() {
    return databaseName;
  }


  @JsonProperty(JSON_PROPERTY_DATABASE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatabaseName(String databaseName) {
    this.databaseName = databaseName;
  }


  public DeleteBackupDbLogForAmPayload backupIds(List<UUID> backupIds) {
    
    this.backupIds = backupIds;
    return this;
  }

  public DeleteBackupDbLogForAmPayload addBackupIdsItem(UUID backupIdsItem) {
    if (this.backupIds == null) {
      this.backupIds = new ArrayList<>();
    }
    this.backupIds.add(backupIdsItem);
    return this;
  }

   /**
   * Get backupIds
   * @return backupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getBackupIds() {
    return backupIds;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupIds(List<UUID> backupIds) {
    this.backupIds = backupIds;
  }


  public DeleteBackupDbLogForAmPayload dbLogIds(List<UUID> dbLogIds) {
    
    this.dbLogIds = dbLogIds;
    return this;
  }

  public DeleteBackupDbLogForAmPayload addDbLogIdsItem(UUID dbLogIdsItem) {
    if (this.dbLogIds == null) {
      this.dbLogIds = new ArrayList<>();
    }
    this.dbLogIds.add(dbLogIdsItem);
    return this;
  }

   /**
   * Get dbLogIds
   * @return dbLogIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_LOG_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getDbLogIds() {
    return dbLogIds;
  }


  @JsonProperty(JSON_PROPERTY_DB_LOG_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbLogIds(List<UUID> dbLogIds) {
    this.dbLogIds = dbLogIds;
  }


  public DeleteBackupDbLogForAmPayload dapDeleteInfo(Map<String, DeleteBackupDbLogForDapPayload> dapDeleteInfo) {
    
    this.dapDeleteInfo = dapDeleteInfo;
    return this;
  }

  public DeleteBackupDbLogForAmPayload putDapDeleteInfoItem(String key, DeleteBackupDbLogForDapPayload dapDeleteInfoItem) {
    if (this.dapDeleteInfo == null) {
      this.dapDeleteInfo = new HashMap<>();
    }
    this.dapDeleteInfo.put(key, dapDeleteInfoItem);
    return this;
  }

   /**
   * Get dapDeleteInfo
   * @return dapDeleteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAP_DELETE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, DeleteBackupDbLogForDapPayload> getDapDeleteInfo() {
    return dapDeleteInfo;
  }


  @JsonProperty(JSON_PROPERTY_DAP_DELETE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDapDeleteInfo(Map<String, DeleteBackupDbLogForDapPayload> dapDeleteInfo) {
    this.dapDeleteInfo = dapDeleteInfo;
  }


  public DeleteBackupDbLogForAmPayload nonDapSecondaryBackupIds(List<UUID> nonDapSecondaryBackupIds) {
    
    this.nonDapSecondaryBackupIds = nonDapSecondaryBackupIds;
    return this;
  }

  public DeleteBackupDbLogForAmPayload addNonDapSecondaryBackupIdsItem(UUID nonDapSecondaryBackupIdsItem) {
    if (this.nonDapSecondaryBackupIds == null) {
      this.nonDapSecondaryBackupIds = new ArrayList<>();
    }
    this.nonDapSecondaryBackupIds.add(nonDapSecondaryBackupIdsItem);
    return this;
  }

   /**
   * Get nonDapSecondaryBackupIds
   * @return nonDapSecondaryBackupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NON_DAP_SECONDARY_BACKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getNonDapSecondaryBackupIds() {
    return nonDapSecondaryBackupIds;
  }


  @JsonProperty(JSON_PROPERTY_NON_DAP_SECONDARY_BACKUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonDapSecondaryBackupIds(List<UUID> nonDapSecondaryBackupIds) {
    this.nonDapSecondaryBackupIds = nonDapSecondaryBackupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteBackupDbLogForAmPayload deleteBackupDbLogForAmPayload = (DeleteBackupDbLogForAmPayload) o;
    return Objects.equals(this.amName, deleteBackupDbLogForAmPayload.amName) &&
        Objects.equals(this.databaseId, deleteBackupDbLogForAmPayload.databaseId) &&
        Objects.equals(this.databaseName, deleteBackupDbLogForAmPayload.databaseName) &&
        Objects.equals(this.backupIds, deleteBackupDbLogForAmPayload.backupIds) &&
        Objects.equals(this.dbLogIds, deleteBackupDbLogForAmPayload.dbLogIds) &&
        Objects.equals(this.dapDeleteInfo, deleteBackupDbLogForAmPayload.dapDeleteInfo) &&
        Objects.equals(this.nonDapSecondaryBackupIds, deleteBackupDbLogForAmPayload.nonDapSecondaryBackupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amName, databaseId, databaseName, backupIds, dbLogIds, dapDeleteInfo, nonDapSecondaryBackupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBackupDbLogForAmPayload {\n");
    sb.append("    amName: ").append(toIndentedString(amName)).append("\n");
    sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
    sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
    sb.append("    backupIds: ").append(toIndentedString(backupIds)).append("\n");
    sb.append("    dbLogIds: ").append(toIndentedString(dbLogIds)).append("\n");
    sb.append("    dapDeleteInfo: ").append(toIndentedString(dapDeleteInfo)).append("\n");
    sb.append("    nonDapSecondaryBackupIds: ").append(toIndentedString(nonDapSecondaryBackupIds)).append("\n");
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

