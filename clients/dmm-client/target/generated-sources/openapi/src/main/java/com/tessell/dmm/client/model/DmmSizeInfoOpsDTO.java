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
import com.tessell.dmm.client.model.CloudAccountSizeOpsDTO;
import com.tessell.dmm.client.model.DapContentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DmmSizeInfoOpsDTO
 */
@JsonPropertyOrder({
  DmmSizeInfoOpsDTO.JSON_PROPERTY_POLICY_NAME,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_CONTENT_TYPE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_TOTAL_PHYSICAL_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_TOTAL_LOGICAL_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_BACKUP_PHYSICAL_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_BACKUP_LOGICAL_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_LOG_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_TEMPORARY_SIZE,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_INFO,
  DmmSizeInfoOpsDTO.JSON_PROPERTY_CLOUD_SIZE_INFO
})
@JsonTypeName("DmmSizeInfoOpsDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DmmSizeInfoOpsDTO {
  public static final String JSON_PROPERTY_POLICY_NAME = "policyName";
  private String policyName;

  public static final String JSON_PROPERTY_CONTENT_TYPE = "contentType";
  private DapContentType contentType;

  public static final String JSON_PROPERTY_TOTAL_PHYSICAL_SIZE = "totalPhysicalSize";
  private Long totalPhysicalSize;

  public static final String JSON_PROPERTY_TOTAL_LOGICAL_SIZE = "totalLogicalSize";
  private Long totalLogicalSize;

  public static final String JSON_PROPERTY_BACKUP_PHYSICAL_SIZE = "backupPhysicalSize";
  private Long backupPhysicalSize;

  public static final String JSON_PROPERTY_BACKUP_LOGICAL_SIZE = "backupLogicalSize";
  private Long backupLogicalSize;

  public static final String JSON_PROPERTY_LOG_SIZE = "logSize";
  private Long logSize;

  public static final String JSON_PROPERTY_TEMPORARY_SIZE = "temporarySize";
  private Long temporarySize;

  public static final String JSON_PROPERTY_INFO = "info";
  private Map<String, List<String>> info = null;

  public static final String JSON_PROPERTY_CLOUD_SIZE_INFO = "cloudSizeInfo";
  private Map<String, CloudAccountSizeOpsDTO> cloudSizeInfo = null;


  public DmmSizeInfoOpsDTO policyName(String policyName) {
    
    this.policyName = policyName;
    return this;
  }

   /**
   * Associated policy/sla name
   * @return policyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated policy/sla name")
  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPolicyName() {
    return policyName;
  }


  @JsonProperty(JSON_PROPERTY_POLICY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPolicyName(String policyName) {
    this.policyName = policyName;
  }


  public DmmSizeInfoOpsDTO contentType(DapContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DapContentType getContentType() {
    return contentType;
  }


  @JsonProperty(JSON_PROPERTY_CONTENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContentType(DapContentType contentType) {
    this.contentType = contentType;
  }


  public DmmSizeInfoOpsDTO totalPhysicalSize(Long totalPhysicalSize) {
    
    this.totalPhysicalSize = totalPhysicalSize;
    return this;
  }

   /**
   * Total physical size
   * @return totalPhysicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total physical size")
  @JsonProperty(JSON_PROPERTY_TOTAL_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalPhysicalSize() {
    return totalPhysicalSize;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_PHYSICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalPhysicalSize(Long totalPhysicalSize) {
    this.totalPhysicalSize = totalPhysicalSize;
  }


  public DmmSizeInfoOpsDTO totalLogicalSize(Long totalLogicalSize) {
    
    this.totalLogicalSize = totalLogicalSize;
    return this;
  }

   /**
   * Total logical size
   * @return totalLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total logical size")
  @JsonProperty(JSON_PROPERTY_TOTAL_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTotalLogicalSize() {
    return totalLogicalSize;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_LOGICAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTotalLogicalSize(Long totalLogicalSize) {
    this.totalLogicalSize = totalLogicalSize;
  }


  public DmmSizeInfoOpsDTO backupPhysicalSize(Long backupPhysicalSize) {
    
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


  public DmmSizeInfoOpsDTO backupLogicalSize(Long backupLogicalSize) {
    
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


  public DmmSizeInfoOpsDTO logSize(Long logSize) {
    
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


  public DmmSizeInfoOpsDTO temporarySize(Long temporarySize) {
    
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


  public DmmSizeInfoOpsDTO info(Map<String, List<String>> info) {
    
    this.info = info;
    return this;
  }

  public DmmSizeInfoOpsDTO putInfoItem(String key, List<String> infoItem) {
    if (this.info == null) {
      this.info = new HashMap<>();
    }
    this.info.put(key, infoItem);
    return this;
  }

   /**
   * Miscellaneous information
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Miscellaneous information")
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<String>> getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(Map<String, List<String>> info) {
    this.info = info;
  }


  public DmmSizeInfoOpsDTO cloudSizeInfo(Map<String, CloudAccountSizeOpsDTO> cloudSizeInfo) {
    
    this.cloudSizeInfo = cloudSizeInfo;
    return this;
  }

  public DmmSizeInfoOpsDTO putCloudSizeInfoItem(String key, CloudAccountSizeOpsDTO cloudSizeInfoItem) {
    if (this.cloudSizeInfo == null) {
      this.cloudSizeInfo = new HashMap<>();
    }
    this.cloudSizeInfo.put(key, cloudSizeInfoItem);
    return this;
  }

   /**
   * The size information per cloud account
   * @return cloudSizeInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size information per cloud account")
  @JsonProperty(JSON_PROPERTY_CLOUD_SIZE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, CloudAccountSizeOpsDTO> getCloudSizeInfo() {
    return cloudSizeInfo;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_SIZE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudSizeInfo(Map<String, CloudAccountSizeOpsDTO> cloudSizeInfo) {
    this.cloudSizeInfo = cloudSizeInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmmSizeInfoOpsDTO dmmSizeInfoOpsDTO = (DmmSizeInfoOpsDTO) o;
    return Objects.equals(this.policyName, dmmSizeInfoOpsDTO.policyName) &&
        Objects.equals(this.contentType, dmmSizeInfoOpsDTO.contentType) &&
        Objects.equals(this.totalPhysicalSize, dmmSizeInfoOpsDTO.totalPhysicalSize) &&
        Objects.equals(this.totalLogicalSize, dmmSizeInfoOpsDTO.totalLogicalSize) &&
        Objects.equals(this.backupPhysicalSize, dmmSizeInfoOpsDTO.backupPhysicalSize) &&
        Objects.equals(this.backupLogicalSize, dmmSizeInfoOpsDTO.backupLogicalSize) &&
        Objects.equals(this.logSize, dmmSizeInfoOpsDTO.logSize) &&
        Objects.equals(this.temporarySize, dmmSizeInfoOpsDTO.temporarySize) &&
        Objects.equals(this.info, dmmSizeInfoOpsDTO.info) &&
        Objects.equals(this.cloudSizeInfo, dmmSizeInfoOpsDTO.cloudSizeInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policyName, contentType, totalPhysicalSize, totalLogicalSize, backupPhysicalSize, backupLogicalSize, logSize, temporarySize, info, cloudSizeInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmmSizeInfoOpsDTO {\n");
    sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    totalPhysicalSize: ").append(toIndentedString(totalPhysicalSize)).append("\n");
    sb.append("    totalLogicalSize: ").append(toIndentedString(totalLogicalSize)).append("\n");
    sb.append("    backupPhysicalSize: ").append(toIndentedString(backupPhysicalSize)).append("\n");
    sb.append("    backupLogicalSize: ").append(toIndentedString(backupLogicalSize)).append("\n");
    sb.append("    logSize: ").append(toIndentedString(logSize)).append("\n");
    sb.append("    temporarySize: ").append(toIndentedString(temporarySize)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    cloudSizeInfo: ").append(toIndentedString(cloudSizeInfo)).append("\n");
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
