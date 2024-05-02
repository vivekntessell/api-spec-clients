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
import com.tessell.dmm.client.model.AssociatedWithAMForLeaks;
import com.tessell.dmm.client.model.BackupType;
import com.tessell.dmm.client.model.DbBackupStatus;
import com.tessell.dmm.client.model.DbBackupType;
import com.tessell.dmm.client.model.LeakStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * LeakEvaluationForBackup
 */
@JsonPropertyOrder({
  LeakEvaluationForBackup.JSON_PROPERTY_TENANT_ID,
  LeakEvaluationForBackup.JSON_PROPERTY_TENANT_NAME,
  LeakEvaluationForBackup.JSON_PROPERTY_BACKUP_ID,
  LeakEvaluationForBackup.JSON_PROPERTY_DB_BACKUP_TYPE,
  LeakEvaluationForBackup.JSON_PROPERTY_BACKUP_TYPE,
  LeakEvaluationForBackup.JSON_PROPERTY_IS_LEAK,
  LeakEvaluationForBackup.JSON_PROPERTY_CLOUD_RESOURCE_ID,
  LeakEvaluationForBackup.JSON_PROPERTY_NAME,
  LeakEvaluationForBackup.JSON_PROPERTY_STATUS,
  LeakEvaluationForBackup.JSON_PROPERTY_ASSOCIATED_WITH_A_M
})
@JsonTypeName("LeakEvaluationForBackup")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class LeakEvaluationForBackup {
  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_TENANT_NAME = "tenantName";
  private String tenantName;

  public static final String JSON_PROPERTY_BACKUP_ID = "backupId";
  private UUID backupId;

  public static final String JSON_PROPERTY_DB_BACKUP_TYPE = "dbBackupType";
  private DbBackupType dbBackupType;

  public static final String JSON_PROPERTY_BACKUP_TYPE = "backupType";
  private BackupType backupType;

  public static final String JSON_PROPERTY_IS_LEAK = "isLeak";
  private LeakStatus isLeak;

  public static final String JSON_PROPERTY_CLOUD_RESOURCE_ID = "cloudResourceId";
  private String cloudResourceId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private DbBackupStatus status;

  public static final String JSON_PROPERTY_ASSOCIATED_WITH_A_M = "associatedWithAM";
  private AssociatedWithAMForLeaks associatedWithAM;


  public LeakEvaluationForBackup tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public LeakEvaluationForBackup tenantName(String tenantName) {
    
    this.tenantName = tenantName;
    return this;
  }

   /**
   * Get tenantName
   * @return tenantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantName() {
    return tenantName;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantName(String tenantName) {
    this.tenantName = tenantName;
  }


  public LeakEvaluationForBackup backupId(UUID backupId) {
    
    this.backupId = backupId;
    return this;
  }

   /**
   * Get backupId
   * @return backupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getBackupId() {
    return backupId;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupId(UUID backupId) {
    this.backupId = backupId;
  }


  public LeakEvaluationForBackup dbBackupType(DbBackupType dbBackupType) {
    
    this.dbBackupType = dbBackupType;
    return this;
  }

   /**
   * Get dbBackupType
   * @return dbBackupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbBackupType getDbBackupType() {
    return dbBackupType;
  }


  @JsonProperty(JSON_PROPERTY_DB_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbBackupType(DbBackupType dbBackupType) {
    this.dbBackupType = dbBackupType;
  }


  public LeakEvaluationForBackup backupType(BackupType backupType) {
    
    this.backupType = backupType;
    return this;
  }

   /**
   * Get backupType
   * @return backupType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public BackupType getBackupType() {
    return backupType;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupType(BackupType backupType) {
    this.backupType = backupType;
  }


  public LeakEvaluationForBackup isLeak(LeakStatus isLeak) {
    
    this.isLeak = isLeak;
    return this;
  }

   /**
   * Get isLeak
   * @return isLeak
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_LEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LeakStatus getIsLeak() {
    return isLeak;
  }


  @JsonProperty(JSON_PROPERTY_IS_LEAK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsLeak(LeakStatus isLeak) {
    this.isLeak = isLeak;
  }


  public LeakEvaluationForBackup cloudResourceId(String cloudResourceId) {
    
    this.cloudResourceId = cloudResourceId;
    return this;
  }

   /**
   * Cloud Resource Id of the storage
   * @return cloudResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Resource Id of the storage")
  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudResourceId() {
    return cloudResourceId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudResourceId(String cloudResourceId) {
    this.cloudResourceId = cloudResourceId;
  }


  public LeakEvaluationForBackup name(String name) {
    
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


  public LeakEvaluationForBackup status(DbBackupStatus status) {
    
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

  public DbBackupStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(DbBackupStatus status) {
    this.status = status;
  }


  public LeakEvaluationForBackup associatedWithAM(AssociatedWithAMForLeaks associatedWithAM) {
    
    this.associatedWithAM = associatedWithAM;
    return this;
  }

   /**
   * Get associatedWithAM
   * @return associatedWithAM
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_WITH_A_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AssociatedWithAMForLeaks getAssociatedWithAM() {
    return associatedWithAM;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_WITH_A_M)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedWithAM(AssociatedWithAMForLeaks associatedWithAM) {
    this.associatedWithAM = associatedWithAM;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LeakEvaluationForBackup leakEvaluationForBackup = (LeakEvaluationForBackup) o;
    return Objects.equals(this.tenantId, leakEvaluationForBackup.tenantId) &&
        Objects.equals(this.tenantName, leakEvaluationForBackup.tenantName) &&
        Objects.equals(this.backupId, leakEvaluationForBackup.backupId) &&
        Objects.equals(this.dbBackupType, leakEvaluationForBackup.dbBackupType) &&
        Objects.equals(this.backupType, leakEvaluationForBackup.backupType) &&
        Objects.equals(this.isLeak, leakEvaluationForBackup.isLeak) &&
        Objects.equals(this.cloudResourceId, leakEvaluationForBackup.cloudResourceId) &&
        Objects.equals(this.name, leakEvaluationForBackup.name) &&
        Objects.equals(this.status, leakEvaluationForBackup.status) &&
        Objects.equals(this.associatedWithAM, leakEvaluationForBackup.associatedWithAM);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, tenantName, backupId, dbBackupType, backupType, isLeak, cloudResourceId, name, status, associatedWithAM);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LeakEvaluationForBackup {\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
    sb.append("    backupId: ").append(toIndentedString(backupId)).append("\n");
    sb.append("    dbBackupType: ").append(toIndentedString(dbBackupType)).append("\n");
    sb.append("    backupType: ").append(toIndentedString(backupType)).append("\n");
    sb.append("    isLeak: ").append(toIndentedString(isLeak)).append("\n");
    sb.append("    cloudResourceId: ").append(toIndentedString(cloudResourceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    associatedWithAM: ").append(toIndentedString(associatedWithAM)).append("\n");
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

