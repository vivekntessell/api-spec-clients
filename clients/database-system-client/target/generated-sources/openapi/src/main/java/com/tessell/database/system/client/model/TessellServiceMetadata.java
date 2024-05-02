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
import com.tessell.database.system.client.model.TessellServiceCloneSanitizationInfoOps;
import com.tessell.database.system.client.model.TessellServiceClonedFromInfoOps;
import com.tessell.database.system.client.model.TessellServiceDegradeMonitorMetadata;
import com.tessell.database.system.client.model.TessellServiceLastActionMetadata;
import com.tessell.database.system.client.model.TessellServiceNativeBackupInfoOps;
import com.tessell.database.system.client.model.TessellServiceQueuedActionMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DB Service&#39;s metadata information
 */
@ApiModel(description = "DB Service's metadata information")
@JsonPropertyOrder({
  TessellServiceMetadata.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  TessellServiceMetadata.JSON_PROPERTY_CLOUD_TYPE,
  TessellServiceMetadata.JSON_PROPERTY_DEGRADE_MONITOR_METADATA,
  TessellServiceMetadata.JSON_PROPERTY_CLONED_FROM_METADATA_INFO,
  TessellServiceMetadata.JSON_PROPERTY_NATIVE_BACKUP_INFO,
  TessellServiceMetadata.JSON_PROPERTY_CLONE_SANITIZATION_INFO,
  TessellServiceMetadata.JSON_PROPERTY_LAST_ACTION,
  TessellServiceMetadata.JSON_PROPERTY_QUEUED_ACTION,
  TessellServiceMetadata.JSON_PROPERTY_DELETION_ATTEMPTS,
  TessellServiceMetadata.JSON_PROPERTY_LAST_START_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_STOP_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_SWITCHOVER_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_DELETION_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_PATCH_SOFTWARE_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_RESIZE_DISPATCH_TIME,
  TessellServiceMetadata.JSON_PROPERTY_LAST_PARAMETER_PROFILE_UPDATE_TIME,
  TessellServiceMetadata.JSON_PROPERTY_DATA
})
@JsonTypeName("TessellServiceMetadata")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceMetadata {
  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private String cloudType;

  public static final String JSON_PROPERTY_DEGRADE_MONITOR_METADATA = "degradeMonitorMetadata";
  private TessellServiceDegradeMonitorMetadata degradeMonitorMetadata;

  public static final String JSON_PROPERTY_CLONED_FROM_METADATA_INFO = "clonedFromMetadataInfo";
  private TessellServiceClonedFromInfoOps clonedFromMetadataInfo;

  public static final String JSON_PROPERTY_NATIVE_BACKUP_INFO = "nativeBackupInfo";
  private TessellServiceNativeBackupInfoOps nativeBackupInfo;

  public static final String JSON_PROPERTY_CLONE_SANITIZATION_INFO = "cloneSanitizationInfo";
  private TessellServiceCloneSanitizationInfoOps cloneSanitizationInfo;

  public static final String JSON_PROPERTY_LAST_ACTION = "lastAction";
  private TessellServiceLastActionMetadata lastAction;

  public static final String JSON_PROPERTY_QUEUED_ACTION = "queuedAction";
  private TessellServiceQueuedActionMetadata queuedAction;

  public static final String JSON_PROPERTY_DELETION_ATTEMPTS = "deletionAttempts";
  private Integer deletionAttempts;

  public static final String JSON_PROPERTY_LAST_START_DISPATCH_TIME = "lastStartDispatchTime";
  private Date lastStartDispatchTime;

  public static final String JSON_PROPERTY_LAST_STOP_DISPATCH_TIME = "lastStopDispatchTime";
  private Date lastStopDispatchTime;

  public static final String JSON_PROPERTY_LAST_SWITCHOVER_DISPATCH_TIME = "lastSwitchoverDispatchTime";
  private Date lastSwitchoverDispatchTime;

  public static final String JSON_PROPERTY_LAST_DELETION_DISPATCH_TIME = "lastDeletionDispatchTime";
  private Date lastDeletionDispatchTime;

  public static final String JSON_PROPERTY_LAST_PATCH_SOFTWARE_DISPATCH_TIME = "lastPatchSoftwareDispatchTime";
  private Date lastPatchSoftwareDispatchTime;

  public static final String JSON_PROPERTY_LAST_RESIZE_DISPATCH_TIME = "lastResizeDispatchTime";
  private Date lastResizeDispatchTime;

  public static final String JSON_PROPERTY_LAST_PARAMETER_PROFILE_UPDATE_TIME = "lastParameterProfileUpdateTime";
  private Date lastParameterProfileUpdateTime;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public TessellServiceMetadata cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * The cloud account Id in which the service is provisioned initially
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud account Id in which the service is provisioned initially")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public TessellServiceMetadata cloudType(String cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * The cloud type in which the service is provisioned initially
   * @return cloudType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud type in which the service is provisioned initially")
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


  public TessellServiceMetadata degradeMonitorMetadata(TessellServiceDegradeMonitorMetadata degradeMonitorMetadata) {
    
    this.degradeMonitorMetadata = degradeMonitorMetadata;
    return this;
  }

   /**
   * Get degradeMonitorMetadata
   * @return degradeMonitorMetadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEGRADE_MONITOR_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceDegradeMonitorMetadata getDegradeMonitorMetadata() {
    return degradeMonitorMetadata;
  }


  @JsonProperty(JSON_PROPERTY_DEGRADE_MONITOR_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDegradeMonitorMetadata(TessellServiceDegradeMonitorMetadata degradeMonitorMetadata) {
    this.degradeMonitorMetadata = degradeMonitorMetadata;
  }


  public TessellServiceMetadata clonedFromMetadataInfo(TessellServiceClonedFromInfoOps clonedFromMetadataInfo) {
    
    this.clonedFromMetadataInfo = clonedFromMetadataInfo;
    return this;
  }

   /**
   * Get clonedFromMetadataInfo
   * @return clonedFromMetadataInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLONED_FROM_METADATA_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceClonedFromInfoOps getClonedFromMetadataInfo() {
    return clonedFromMetadataInfo;
  }


  @JsonProperty(JSON_PROPERTY_CLONED_FROM_METADATA_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClonedFromMetadataInfo(TessellServiceClonedFromInfoOps clonedFromMetadataInfo) {
    this.clonedFromMetadataInfo = clonedFromMetadataInfo;
  }


  public TessellServiceMetadata nativeBackupInfo(TessellServiceNativeBackupInfoOps nativeBackupInfo) {
    
    this.nativeBackupInfo = nativeBackupInfo;
    return this;
  }

   /**
   * Get nativeBackupInfo
   * @return nativeBackupInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceNativeBackupInfoOps getNativeBackupInfo() {
    return nativeBackupInfo;
  }


  @JsonProperty(JSON_PROPERTY_NATIVE_BACKUP_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNativeBackupInfo(TessellServiceNativeBackupInfoOps nativeBackupInfo) {
    this.nativeBackupInfo = nativeBackupInfo;
  }


  public TessellServiceMetadata cloneSanitizationInfo(TessellServiceCloneSanitizationInfoOps cloneSanitizationInfo) {
    
    this.cloneSanitizationInfo = cloneSanitizationInfo;
    return this;
  }

   /**
   * Get cloneSanitizationInfo
   * @return cloneSanitizationInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLONE_SANITIZATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceCloneSanitizationInfoOps getCloneSanitizationInfo() {
    return cloneSanitizationInfo;
  }


  @JsonProperty(JSON_PROPERTY_CLONE_SANITIZATION_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloneSanitizationInfo(TessellServiceCloneSanitizationInfoOps cloneSanitizationInfo) {
    this.cloneSanitizationInfo = cloneSanitizationInfo;
  }


  public TessellServiceMetadata lastAction(TessellServiceLastActionMetadata lastAction) {
    
    this.lastAction = lastAction;
    return this;
  }

   /**
   * Get lastAction
   * @return lastAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceLastActionMetadata getLastAction() {
    return lastAction;
  }


  @JsonProperty(JSON_PROPERTY_LAST_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAction(TessellServiceLastActionMetadata lastAction) {
    this.lastAction = lastAction;
  }


  public TessellServiceMetadata queuedAction(TessellServiceQueuedActionMetadata queuedAction) {
    
    this.queuedAction = queuedAction;
    return this;
  }

   /**
   * Get queuedAction
   * @return queuedAction
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_QUEUED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceQueuedActionMetadata getQueuedAction() {
    return queuedAction;
  }


  @JsonProperty(JSON_PROPERTY_QUEUED_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setQueuedAction(TessellServiceQueuedActionMetadata queuedAction) {
    this.queuedAction = queuedAction;
  }


  public TessellServiceMetadata deletionAttempts(Integer deletionAttempts) {
    
    this.deletionAttempts = deletionAttempts;
    return this;
  }

   /**
   * Get deletionAttempts
   * @return deletionAttempts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELETION_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDeletionAttempts() {
    return deletionAttempts;
  }


  @JsonProperty(JSON_PROPERTY_DELETION_ATTEMPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeletionAttempts(Integer deletionAttempts) {
    this.deletionAttempts = deletionAttempts;
  }


  public TessellServiceMetadata lastStartDispatchTime(Date lastStartDispatchTime) {
    
    this.lastStartDispatchTime = lastStartDispatchTime;
    return this;
  }

   /**
   * Get lastStartDispatchTime
   * @return lastStartDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_START_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastStartDispatchTime() {
    return lastStartDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_START_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastStartDispatchTime(Date lastStartDispatchTime) {
    this.lastStartDispatchTime = lastStartDispatchTime;
  }


  public TessellServiceMetadata lastStopDispatchTime(Date lastStopDispatchTime) {
    
    this.lastStopDispatchTime = lastStopDispatchTime;
    return this;
  }

   /**
   * Get lastStopDispatchTime
   * @return lastStopDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_STOP_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastStopDispatchTime() {
    return lastStopDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_STOP_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastStopDispatchTime(Date lastStopDispatchTime) {
    this.lastStopDispatchTime = lastStopDispatchTime;
  }


  public TessellServiceMetadata lastSwitchoverDispatchTime(Date lastSwitchoverDispatchTime) {
    
    this.lastSwitchoverDispatchTime = lastSwitchoverDispatchTime;
    return this;
  }

   /**
   * Get lastSwitchoverDispatchTime
   * @return lastSwitchoverDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_SWITCHOVER_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastSwitchoverDispatchTime() {
    return lastSwitchoverDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SWITCHOVER_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSwitchoverDispatchTime(Date lastSwitchoverDispatchTime) {
    this.lastSwitchoverDispatchTime = lastSwitchoverDispatchTime;
  }


  public TessellServiceMetadata lastDeletionDispatchTime(Date lastDeletionDispatchTime) {
    
    this.lastDeletionDispatchTime = lastDeletionDispatchTime;
    return this;
  }

   /**
   * Get lastDeletionDispatchTime
   * @return lastDeletionDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_DELETION_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastDeletionDispatchTime() {
    return lastDeletionDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_DELETION_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastDeletionDispatchTime(Date lastDeletionDispatchTime) {
    this.lastDeletionDispatchTime = lastDeletionDispatchTime;
  }


  public TessellServiceMetadata lastPatchSoftwareDispatchTime(Date lastPatchSoftwareDispatchTime) {
    
    this.lastPatchSoftwareDispatchTime = lastPatchSoftwareDispatchTime;
    return this;
  }

   /**
   * Get lastPatchSoftwareDispatchTime
   * @return lastPatchSoftwareDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_PATCH_SOFTWARE_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastPatchSoftwareDispatchTime() {
    return lastPatchSoftwareDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_PATCH_SOFTWARE_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastPatchSoftwareDispatchTime(Date lastPatchSoftwareDispatchTime) {
    this.lastPatchSoftwareDispatchTime = lastPatchSoftwareDispatchTime;
  }


  public TessellServiceMetadata lastResizeDispatchTime(Date lastResizeDispatchTime) {
    
    this.lastResizeDispatchTime = lastResizeDispatchTime;
    return this;
  }

   /**
   * Get lastResizeDispatchTime
   * @return lastResizeDispatchTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_RESIZE_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastResizeDispatchTime() {
    return lastResizeDispatchTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_RESIZE_DISPATCH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastResizeDispatchTime(Date lastResizeDispatchTime) {
    this.lastResizeDispatchTime = lastResizeDispatchTime;
  }


  public TessellServiceMetadata lastParameterProfileUpdateTime(Date lastParameterProfileUpdateTime) {
    
    this.lastParameterProfileUpdateTime = lastParameterProfileUpdateTime;
    return this;
  }

   /**
   * Get lastParameterProfileUpdateTime
   * @return lastParameterProfileUpdateTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_PARAMETER_PROFILE_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastParameterProfileUpdateTime() {
    return lastParameterProfileUpdateTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_PARAMETER_PROFILE_UPDATE_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastParameterProfileUpdateTime(Date lastParameterProfileUpdateTime) {
    this.lastParameterProfileUpdateTime = lastParameterProfileUpdateTime;
  }


  public TessellServiceMetadata data(Object data) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceMetadata tessellServiceMetadata = (TessellServiceMetadata) o;
    return Objects.equals(this.cloudAccountId, tessellServiceMetadata.cloudAccountId) &&
        Objects.equals(this.cloudType, tessellServiceMetadata.cloudType) &&
        Objects.equals(this.degradeMonitorMetadata, tessellServiceMetadata.degradeMonitorMetadata) &&
        Objects.equals(this.clonedFromMetadataInfo, tessellServiceMetadata.clonedFromMetadataInfo) &&
        Objects.equals(this.nativeBackupInfo, tessellServiceMetadata.nativeBackupInfo) &&
        Objects.equals(this.cloneSanitizationInfo, tessellServiceMetadata.cloneSanitizationInfo) &&
        Objects.equals(this.lastAction, tessellServiceMetadata.lastAction) &&
        Objects.equals(this.queuedAction, tessellServiceMetadata.queuedAction) &&
        Objects.equals(this.deletionAttempts, tessellServiceMetadata.deletionAttempts) &&
        Objects.equals(this.lastStartDispatchTime, tessellServiceMetadata.lastStartDispatchTime) &&
        Objects.equals(this.lastStopDispatchTime, tessellServiceMetadata.lastStopDispatchTime) &&
        Objects.equals(this.lastSwitchoverDispatchTime, tessellServiceMetadata.lastSwitchoverDispatchTime) &&
        Objects.equals(this.lastDeletionDispatchTime, tessellServiceMetadata.lastDeletionDispatchTime) &&
        Objects.equals(this.lastPatchSoftwareDispatchTime, tessellServiceMetadata.lastPatchSoftwareDispatchTime) &&
        Objects.equals(this.lastResizeDispatchTime, tessellServiceMetadata.lastResizeDispatchTime) &&
        Objects.equals(this.lastParameterProfileUpdateTime, tessellServiceMetadata.lastParameterProfileUpdateTime) &&
        Objects.equals(this.data, tessellServiceMetadata.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudAccountId, cloudType, degradeMonitorMetadata, clonedFromMetadataInfo, nativeBackupInfo, cloneSanitizationInfo, lastAction, queuedAction, deletionAttempts, lastStartDispatchTime, lastStopDispatchTime, lastSwitchoverDispatchTime, lastDeletionDispatchTime, lastPatchSoftwareDispatchTime, lastResizeDispatchTime, lastParameterProfileUpdateTime, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceMetadata {\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    degradeMonitorMetadata: ").append(toIndentedString(degradeMonitorMetadata)).append("\n");
    sb.append("    clonedFromMetadataInfo: ").append(toIndentedString(clonedFromMetadataInfo)).append("\n");
    sb.append("    nativeBackupInfo: ").append(toIndentedString(nativeBackupInfo)).append("\n");
    sb.append("    cloneSanitizationInfo: ").append(toIndentedString(cloneSanitizationInfo)).append("\n");
    sb.append("    lastAction: ").append(toIndentedString(lastAction)).append("\n");
    sb.append("    queuedAction: ").append(toIndentedString(queuedAction)).append("\n");
    sb.append("    deletionAttempts: ").append(toIndentedString(deletionAttempts)).append("\n");
    sb.append("    lastStartDispatchTime: ").append(toIndentedString(lastStartDispatchTime)).append("\n");
    sb.append("    lastStopDispatchTime: ").append(toIndentedString(lastStopDispatchTime)).append("\n");
    sb.append("    lastSwitchoverDispatchTime: ").append(toIndentedString(lastSwitchoverDispatchTime)).append("\n");
    sb.append("    lastDeletionDispatchTime: ").append(toIndentedString(lastDeletionDispatchTime)).append("\n");
    sb.append("    lastPatchSoftwareDispatchTime: ").append(toIndentedString(lastPatchSoftwareDispatchTime)).append("\n");
    sb.append("    lastResizeDispatchTime: ").append(toIndentedString(lastResizeDispatchTime)).append("\n");
    sb.append("    lastParameterProfileUpdateTime: ").append(toIndentedString(lastParameterProfileUpdateTime)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

