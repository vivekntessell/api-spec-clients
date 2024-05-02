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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * CloudAccountSizeOpsDTO
 */
@JsonPropertyOrder({
  CloudAccountSizeOpsDTO.JSON_PROPERTY_CLOUD_TYPE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_PHYSICAL_SIZE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_LOGICAL_SIZE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_BACKUP_PHYSICAL_SIZE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_BACKUP_LOGICAL_SIZE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_LOG_SIZE,
  CloudAccountSizeOpsDTO.JSON_PROPERTY_TEMPORARY_SIZE
})
@JsonTypeName("CloudAccountSizeOpsDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudAccountSizeOpsDTO {
  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private String cloudType;

  public static final String JSON_PROPERTY_PHYSICAL_SIZE = "physicalSize";
  private Long physicalSize;

  public static final String JSON_PROPERTY_LOGICAL_SIZE = "logicalSize";
  private Long logicalSize;

  public static final String JSON_PROPERTY_BACKUP_PHYSICAL_SIZE = "backupPhysicalSize";
  private Long backupPhysicalSize;

  public static final String JSON_PROPERTY_BACKUP_LOGICAL_SIZE = "backupLogicalSize";
  private Long backupLogicalSize;

  public static final String JSON_PROPERTY_LOG_SIZE = "logSize";
  private Long logSize;

  public static final String JSON_PROPERTY_TEMPORARY_SIZE = "temporarySize";
  private Long temporarySize;


  public CloudAccountSizeOpsDTO cloudType(String cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }


  public CloudAccountSizeOpsDTO physicalSize(Long physicalSize) {
    
    this.physicalSize = physicalSize;
    return this;
  }

   /**
   * Physical size
   * @return physicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical size")
  @JsonProperty(JSON_PROPERTY_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getPhysicalSize() {
    return physicalSize;
  }


  @JsonProperty(JSON_PROPERTY_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhysicalSize(Long physicalSize) {
    this.physicalSize = physicalSize;
  }


  public CloudAccountSizeOpsDTO logicalSize(Long logicalSize) {
    
    this.logicalSize = logicalSize;
    return this;
  }

   /**
   * Logical size
   * @return logicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Logical size")
  @JsonProperty(JSON_PROPERTY_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogicalSize() {
    return logicalSize;
  }


  @JsonProperty(JSON_PROPERTY_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogicalSize(Long logicalSize) {
    this.logicalSize = logicalSize;
  }


  public CloudAccountSizeOpsDTO backupPhysicalSize(Long backupPhysicalSize) {
    
    this.backupPhysicalSize = backupPhysicalSize;
    return this;
  }

   /**
   * Backup physical size
   * @return backupPhysicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Backup physical size")
  @JsonProperty(JSON_PROPERTY_BACKUP_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBackupPhysicalSize() {
    return backupPhysicalSize;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupPhysicalSize(Long backupPhysicalSize) {
    this.backupPhysicalSize = backupPhysicalSize;
  }


  public CloudAccountSizeOpsDTO backupLogicalSize(Long backupLogicalSize) {
    
    this.backupLogicalSize = backupLogicalSize;
    return this;
  }

   /**
   * Backup logical size
   * @return backupLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Backup logical size")
  @JsonProperty(JSON_PROPERTY_BACKUP_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getBackupLogicalSize() {
    return backupLogicalSize;
  }


  @JsonProperty(JSON_PROPERTY_BACKUP_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBackupLogicalSize(Long backupLogicalSize) {
    this.backupLogicalSize = backupLogicalSize;
  }


  public CloudAccountSizeOpsDTO logSize(Long logSize) {
    
    this.logSize = logSize;
    return this;
  }

   /**
   * Log size
   * @return logSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Log size")
  @JsonProperty(JSON_PROPERTY_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getLogSize() {
    return logSize;
  }


  @JsonProperty(JSON_PROPERTY_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLogSize(Long logSize) {
    this.logSize = logSize;
  }


  public CloudAccountSizeOpsDTO temporarySize(Long temporarySize) {
    
    this.temporarySize = temporarySize;
    return this;
  }

   /**
   * Temporary size
   * @return temporarySize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Temporary size")
  @JsonProperty(JSON_PROPERTY_TEMPORARY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTemporarySize() {
    return temporarySize;
  }


  @JsonProperty(JSON_PROPERTY_TEMPORARY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTemporarySize(Long temporarySize) {
    this.temporarySize = temporarySize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountSizeOpsDTO cloudAccountSizeOpsDTO = (CloudAccountSizeOpsDTO) o;
    return Objects.equals(this.cloudType, cloudAccountSizeOpsDTO.cloudType) &&
        Objects.equals(this.physicalSize, cloudAccountSizeOpsDTO.physicalSize) &&
        Objects.equals(this.logicalSize, cloudAccountSizeOpsDTO.logicalSize) &&
        Objects.equals(this.backupPhysicalSize, cloudAccountSizeOpsDTO.backupPhysicalSize) &&
        Objects.equals(this.backupLogicalSize, cloudAccountSizeOpsDTO.backupLogicalSize) &&
        Objects.equals(this.logSize, cloudAccountSizeOpsDTO.logSize) &&
        Objects.equals(this.temporarySize, cloudAccountSizeOpsDTO.temporarySize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, physicalSize, logicalSize, backupPhysicalSize, backupLogicalSize, logSize, temporarySize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountSizeOpsDTO {\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    physicalSize: ").append(toIndentedString(physicalSize)).append("\n");
    sb.append("    logicalSize: ").append(toIndentedString(logicalSize)).append("\n");
    sb.append("    backupPhysicalSize: ").append(toIndentedString(backupPhysicalSize)).append("\n");
    sb.append("    backupLogicalSize: ").append(toIndentedString(backupLogicalSize)).append("\n");
    sb.append("    logSize: ").append(toIndentedString(logSize)).append("\n");
    sb.append("    temporarySize: ").append(toIndentedString(temporarySize)).append("\n");
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

