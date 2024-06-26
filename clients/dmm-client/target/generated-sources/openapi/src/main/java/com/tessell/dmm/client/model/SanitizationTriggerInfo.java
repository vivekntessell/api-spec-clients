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
import com.tessell.dmm.client.model.DbBackupRetentionType;
import com.tessell.dmm.client.model.ReplicateDapBackupInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SanitizationTriggerInfo
 */
@JsonPropertyOrder({
  SanitizationTriggerInfo.JSON_PROPERTY_SANITIZATION_SCHEDULE_ID,
  SanitizationTriggerInfo.JSON_PROPERTY_RETENTION_TYPE,
  SanitizationTriggerInfo.JSON_PROPERTY_APPLICABLE_RETENTION_TYPES,
  SanitizationTriggerInfo.JSON_PROPERTY_DAP_BACKUP_REPLICATION_INFO
})
@JsonTypeName("SanitizationTriggerInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SanitizationTriggerInfo {
  public static final String JSON_PROPERTY_SANITIZATION_SCHEDULE_ID = "sanitizationScheduleId";
  private UUID sanitizationScheduleId;

  public static final String JSON_PROPERTY_RETENTION_TYPE = "retentionType";
  private DbBackupRetentionType retentionType;

  public static final String JSON_PROPERTY_APPLICABLE_RETENTION_TYPES = "applicableRetentionTypes";
  private List<DbBackupRetentionType> applicableRetentionTypes = null;

  public static final String JSON_PROPERTY_DAP_BACKUP_REPLICATION_INFO = "dapBackupReplicationInfo";
  private List<ReplicateDapBackupInfo> dapBackupReplicationInfo = null;


  public SanitizationTriggerInfo sanitizationScheduleId(UUID sanitizationScheduleId) {
    
    this.sanitizationScheduleId = sanitizationScheduleId;
    return this;
  }

   /**
   * Get sanitizationScheduleId
   * @return sanitizationScheduleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SANITIZATION_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSanitizationScheduleId() {
    return sanitizationScheduleId;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZATION_SCHEDULE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizationScheduleId(UUID sanitizationScheduleId) {
    this.sanitizationScheduleId = sanitizationScheduleId;
  }


  public SanitizationTriggerInfo retentionType(DbBackupRetentionType retentionType) {
    
    this.retentionType = retentionType;
    return this;
  }

   /**
   * Get retentionType
   * @return retentionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DbBackupRetentionType getRetentionType() {
    return retentionType;
  }


  @JsonProperty(JSON_PROPERTY_RETENTION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRetentionType(DbBackupRetentionType retentionType) {
    this.retentionType = retentionType;
  }


  public SanitizationTriggerInfo applicableRetentionTypes(List<DbBackupRetentionType> applicableRetentionTypes) {
    
    this.applicableRetentionTypes = applicableRetentionTypes;
    return this;
  }

  public SanitizationTriggerInfo addApplicableRetentionTypesItem(DbBackupRetentionType applicableRetentionTypesItem) {
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


  public SanitizationTriggerInfo dapBackupReplicationInfo(List<ReplicateDapBackupInfo> dapBackupReplicationInfo) {
    
    this.dapBackupReplicationInfo = dapBackupReplicationInfo;
    return this;
  }

  public SanitizationTriggerInfo addDapBackupReplicationInfoItem(ReplicateDapBackupInfo dapBackupReplicationInfoItem) {
    if (this.dapBackupReplicationInfo == null) {
      this.dapBackupReplicationInfo = new ArrayList<>();
    }
    this.dapBackupReplicationInfo.add(dapBackupReplicationInfoItem);
    return this;
  }

   /**
   * Get dapBackupReplicationInfo
   * @return dapBackupReplicationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAP_BACKUP_REPLICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ReplicateDapBackupInfo> getDapBackupReplicationInfo() {
    return dapBackupReplicationInfo;
  }


  @JsonProperty(JSON_PROPERTY_DAP_BACKUP_REPLICATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDapBackupReplicationInfo(List<ReplicateDapBackupInfo> dapBackupReplicationInfo) {
    this.dapBackupReplicationInfo = dapBackupReplicationInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SanitizationTriggerInfo sanitizationTriggerInfo = (SanitizationTriggerInfo) o;
    return Objects.equals(this.sanitizationScheduleId, sanitizationTriggerInfo.sanitizationScheduleId) &&
        Objects.equals(this.retentionType, sanitizationTriggerInfo.retentionType) &&
        Objects.equals(this.applicableRetentionTypes, sanitizationTriggerInfo.applicableRetentionTypes) &&
        Objects.equals(this.dapBackupReplicationInfo, sanitizationTriggerInfo.dapBackupReplicationInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanitizationScheduleId, retentionType, applicableRetentionTypes, dapBackupReplicationInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SanitizationTriggerInfo {\n");
    sb.append("    sanitizationScheduleId: ").append(toIndentedString(sanitizationScheduleId)).append("\n");
    sb.append("    retentionType: ").append(toIndentedString(retentionType)).append("\n");
    sb.append("    applicableRetentionTypes: ").append(toIndentedString(applicableRetentionTypes)).append("\n");
    sb.append("    dapBackupReplicationInfo: ").append(toIndentedString(dapBackupReplicationInfo)).append("\n");
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

