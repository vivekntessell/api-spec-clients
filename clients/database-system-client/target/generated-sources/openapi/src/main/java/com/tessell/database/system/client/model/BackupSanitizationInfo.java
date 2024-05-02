/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * BackupSanitizationInfo
 */
@JsonPropertyOrder({
  BackupSanitizationInfo.JSON_PROPERTY_SANITIZATION_SCHEDULE_ID,
  BackupSanitizationInfo.JSON_PROPERTY_SANITIZED_FROM_BACKUP_DAP_BASED,
  BackupSanitizationInfo.JSON_PROPERTY_SCRIPT_VERSION,
  BackupSanitizationInfo.JSON_PROPERTY_SCRIPT_INTERNAL_VERSION
})
@JsonTypeName("BackupSanitizationInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class BackupSanitizationInfo {
  public static final String JSON_PROPERTY_SANITIZATION_SCHEDULE_ID = "sanitizationScheduleId";
  private UUID sanitizationScheduleId;

  public static final String JSON_PROPERTY_SANITIZED_FROM_BACKUP_DAP_BASED = "sanitizedFromBackupDapBased";
  private Boolean sanitizedFromBackupDapBased = false;

  public static final String JSON_PROPERTY_SCRIPT_VERSION = "scriptVersion";
  private String scriptVersion;

  public static final String JSON_PROPERTY_SCRIPT_INTERNAL_VERSION = "scriptInternalVersion";
  private Integer scriptInternalVersion;


  public BackupSanitizationInfo sanitizationScheduleId(UUID sanitizationScheduleId) {
    
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


  public BackupSanitizationInfo sanitizedFromBackupDapBased(Boolean sanitizedFromBackupDapBased) {
    
    this.sanitizedFromBackupDapBased = sanitizedFromBackupDapBased;
    return this;
  }

   /**
   * Get sanitizedFromBackupDapBased
   * @return sanitizedFromBackupDapBased
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SANITIZED_FROM_BACKUP_DAP_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSanitizedFromBackupDapBased() {
    return sanitizedFromBackupDapBased;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZED_FROM_BACKUP_DAP_BASED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizedFromBackupDapBased(Boolean sanitizedFromBackupDapBased) {
    this.sanitizedFromBackupDapBased = sanitizedFromBackupDapBased;
  }


  public BackupSanitizationInfo scriptVersion(String scriptVersion) {
    
    this.scriptVersion = scriptVersion;
    return this;
  }

   /**
   * Get scriptVersion
   * @return scriptVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCRIPT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getScriptVersion() {
    return scriptVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScriptVersion(String scriptVersion) {
    this.scriptVersion = scriptVersion;
  }


  public BackupSanitizationInfo scriptInternalVersion(Integer scriptInternalVersion) {
    
    this.scriptInternalVersion = scriptInternalVersion;
    return this;
  }

   /**
   * Get scriptInternalVersion
   * @return scriptInternalVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SCRIPT_INTERNAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getScriptInternalVersion() {
    return scriptInternalVersion;
  }


  @JsonProperty(JSON_PROPERTY_SCRIPT_INTERNAL_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setScriptInternalVersion(Integer scriptInternalVersion) {
    this.scriptInternalVersion = scriptInternalVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackupSanitizationInfo backupSanitizationInfo = (BackupSanitizationInfo) o;
    return Objects.equals(this.sanitizationScheduleId, backupSanitizationInfo.sanitizationScheduleId) &&
        Objects.equals(this.sanitizedFromBackupDapBased, backupSanitizationInfo.sanitizedFromBackupDapBased) &&
        Objects.equals(this.scriptVersion, backupSanitizationInfo.scriptVersion) &&
        Objects.equals(this.scriptInternalVersion, backupSanitizationInfo.scriptInternalVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sanitizationScheduleId, sanitizedFromBackupDapBased, scriptVersion, scriptInternalVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackupSanitizationInfo {\n");
    sb.append("    sanitizationScheduleId: ").append(toIndentedString(sanitizationScheduleId)).append("\n");
    sb.append("    sanitizedFromBackupDapBased: ").append(toIndentedString(sanitizedFromBackupDapBased)).append("\n");
    sb.append("    scriptVersion: ").append(toIndentedString(scriptVersion)).append("\n");
    sb.append("    scriptInternalVersion: ").append(toIndentedString(scriptInternalVersion)).append("\n");
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

