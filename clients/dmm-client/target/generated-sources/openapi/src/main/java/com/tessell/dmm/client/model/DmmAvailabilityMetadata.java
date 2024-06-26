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
import com.tessell.dmm.client.model.DBServiceTopologyOps;
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
 * Metadata for backend use
 */
@ApiModel(description = "Metadata for backend use")
@JsonPropertyOrder({
  DmmAvailabilityMetadata.JSON_PROPERTY_TOPOLOGY_LAST_REFRESH_TIME,
  DmmAvailabilityMetadata.JSON_PROPERTY_TOPOLOGY,
  DmmAvailabilityMetadata.JSON_PROPERTY_LAST_AUTO_BACKUP_TASK_SUBMISSION_TIME,
  DmmAvailabilityMetadata.JSON_PROPERTY_LAST_AUTO_BACKUP_TRIGGER_TIME,
  DmmAvailabilityMetadata.JSON_PROPERTY_LAST_SLA_EXECUTION_TIME,
  DmmAvailabilityMetadata.JSON_PROPERTY_DISPATCH_AUTO_BACKUP_IMMEDIATELY,
  DmmAvailabilityMetadata.JSON_PROPERTY_DISPATCH_AUTO_BACKUP_REASON,
  DmmAvailabilityMetadata.JSON_PROPERTY_DISPATCH_AUTO_BACKUP_FOR_PITR,
  DmmAvailabilityMetadata.JSON_PROPERTY_IRRESPECTIVE_OF_SLA,
  DmmAvailabilityMetadata.JSON_PROPERTY_FULL_BACKUP,
  DmmAvailabilityMetadata.JSON_PROPERTY_USE_NAME_AS_IS,
  DmmAvailabilityMetadata.JSON_PROPERTY_MAKE_VISIBLE_TO_USER,
  DmmAvailabilityMetadata.JSON_PROPERTY_MARK_AS_MANUAL,
  DmmAvailabilityMetadata.JSON_PROPERTY_DATA,
  DmmAvailabilityMetadata.JSON_PROPERTY_CLOUD_TYPE,
  DmmAvailabilityMetadata.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  DmmAvailabilityMetadata.JSON_PROPERTY_CLOUD_LOCATIONS,
  DmmAvailabilityMetadata.JSON_PROPERTY_COMPUTE_RESOURCE_ID
})
@JsonTypeName("DmmAvailabilityMetadata")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DmmAvailabilityMetadata {
  public static final String JSON_PROPERTY_TOPOLOGY_LAST_REFRESH_TIME = "topologyLastRefreshTime";
  private Date topologyLastRefreshTime;

  public static final String JSON_PROPERTY_TOPOLOGY = "topology";
  private List<DBServiceTopologyOps> topology = null;

  public static final String JSON_PROPERTY_LAST_AUTO_BACKUP_TASK_SUBMISSION_TIME = "lastAutoBackupTaskSubmissionTime";
  private Date lastAutoBackupTaskSubmissionTime;

  public static final String JSON_PROPERTY_LAST_AUTO_BACKUP_TRIGGER_TIME = "lastAutoBackupTriggerTime";
  private Date lastAutoBackupTriggerTime;

  public static final String JSON_PROPERTY_LAST_SLA_EXECUTION_TIME = "lastSlaExecutionTime";
  private Date lastSlaExecutionTime;

  public static final String JSON_PROPERTY_DISPATCH_AUTO_BACKUP_IMMEDIATELY = "dispatchAutoBackupImmediately";
  private Boolean dispatchAutoBackupImmediately;

  public static final String JSON_PROPERTY_DISPATCH_AUTO_BACKUP_REASON = "dispatchAutoBackupReason";
  private String dispatchAutoBackupReason;

  public static final String JSON_PROPERTY_DISPATCH_AUTO_BACKUP_FOR_PITR = "dispatchAutoBackupForPitr";
  private Boolean dispatchAutoBackupForPitr;

  public static final String JSON_PROPERTY_IRRESPECTIVE_OF_SLA = "irrespectiveOfSla";
  private Boolean irrespectiveOfSla;

  public static final String JSON_PROPERTY_FULL_BACKUP = "fullBackup";
  private Boolean fullBackup;

  public static final String JSON_PROPERTY_USE_NAME_AS_IS = "useNameAsIs";
  private Boolean useNameAsIs;

  public static final String JSON_PROPERTY_MAKE_VISIBLE_TO_USER = "makeVisibleToUser";
  private Boolean makeVisibleToUser;

  public static final String JSON_PROPERTY_MARK_AS_MANUAL = "markAsManual";
  private Boolean markAsManual;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private String cloudType;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_LOCATIONS = "cloudLocations";
  private List<String> cloudLocations = null;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_ID = "computeResourceId";
  private UUID computeResourceId;


  public DmmAvailabilityMetadata topologyLastRefreshTime(Date topologyLastRefreshTime) {
    
    this.topologyLastRefreshTime = topologyLastRefreshTime;
    return this;
  }

   /**
   * Get topologyLastRefreshTime
   * @return topologyLastRefreshTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY_LAST_REFRESH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getTopologyLastRefreshTime() {
    return topologyLastRefreshTime;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY_LAST_REFRESH_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopologyLastRefreshTime(Date topologyLastRefreshTime) {
    this.topologyLastRefreshTime = topologyLastRefreshTime;
  }


  public DmmAvailabilityMetadata topology(List<DBServiceTopologyOps> topology) {
    
    this.topology = topology;
    return this;
  }

  public DmmAvailabilityMetadata addTopologyItem(DBServiceTopologyOps topologyItem) {
    if (this.topology == null) {
      this.topology = new ArrayList<>();
    }
    this.topology.add(topologyItem);
    return this;
  }

   /**
   * Get topology
   * @return topology
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DBServiceTopologyOps> getTopology() {
    return topology;
  }


  @JsonProperty(JSON_PROPERTY_TOPOLOGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTopology(List<DBServiceTopologyOps> topology) {
    this.topology = topology;
  }


  public DmmAvailabilityMetadata lastAutoBackupTaskSubmissionTime(Date lastAutoBackupTaskSubmissionTime) {
    
    this.lastAutoBackupTaskSubmissionTime = lastAutoBackupTaskSubmissionTime;
    return this;
  }

   /**
   * Get lastAutoBackupTaskSubmissionTime
   * @return lastAutoBackupTaskSubmissionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_AUTO_BACKUP_TASK_SUBMISSION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastAutoBackupTaskSubmissionTime() {
    return lastAutoBackupTaskSubmissionTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_AUTO_BACKUP_TASK_SUBMISSION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAutoBackupTaskSubmissionTime(Date lastAutoBackupTaskSubmissionTime) {
    this.lastAutoBackupTaskSubmissionTime = lastAutoBackupTaskSubmissionTime;
  }


  public DmmAvailabilityMetadata lastAutoBackupTriggerTime(Date lastAutoBackupTriggerTime) {
    
    this.lastAutoBackupTriggerTime = lastAutoBackupTriggerTime;
    return this;
  }

   /**
   * Get lastAutoBackupTriggerTime
   * @return lastAutoBackupTriggerTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_AUTO_BACKUP_TRIGGER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastAutoBackupTriggerTime() {
    return lastAutoBackupTriggerTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_AUTO_BACKUP_TRIGGER_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastAutoBackupTriggerTime(Date lastAutoBackupTriggerTime) {
    this.lastAutoBackupTriggerTime = lastAutoBackupTriggerTime;
  }


  public DmmAvailabilityMetadata lastSlaExecutionTime(Date lastSlaExecutionTime) {
    
    this.lastSlaExecutionTime = lastSlaExecutionTime;
    return this;
  }

   /**
   * Get lastSlaExecutionTime
   * @return lastSlaExecutionTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_SLA_EXECUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getLastSlaExecutionTime() {
    return lastSlaExecutionTime;
  }


  @JsonProperty(JSON_PROPERTY_LAST_SLA_EXECUTION_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastSlaExecutionTime(Date lastSlaExecutionTime) {
    this.lastSlaExecutionTime = lastSlaExecutionTime;
  }


  public DmmAvailabilityMetadata dispatchAutoBackupImmediately(Boolean dispatchAutoBackupImmediately) {
    
    this.dispatchAutoBackupImmediately = dispatchAutoBackupImmediately;
    return this;
  }

   /**
   * Get dispatchAutoBackupImmediately
   * @return dispatchAutoBackupImmediately
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDispatchAutoBackupImmediately() {
    return dispatchAutoBackupImmediately;
  }


  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_IMMEDIATELY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDispatchAutoBackupImmediately(Boolean dispatchAutoBackupImmediately) {
    this.dispatchAutoBackupImmediately = dispatchAutoBackupImmediately;
  }


  public DmmAvailabilityMetadata dispatchAutoBackupReason(String dispatchAutoBackupReason) {
    
    this.dispatchAutoBackupReason = dispatchAutoBackupReason;
    return this;
  }

   /**
   * Get dispatchAutoBackupReason
   * @return dispatchAutoBackupReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDispatchAutoBackupReason() {
    return dispatchAutoBackupReason;
  }


  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDispatchAutoBackupReason(String dispatchAutoBackupReason) {
    this.dispatchAutoBackupReason = dispatchAutoBackupReason;
  }


  public DmmAvailabilityMetadata dispatchAutoBackupForPitr(Boolean dispatchAutoBackupForPitr) {
    
    this.dispatchAutoBackupForPitr = dispatchAutoBackupForPitr;
    return this;
  }

   /**
   * Get dispatchAutoBackupForPitr
   * @return dispatchAutoBackupForPitr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_FOR_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getDispatchAutoBackupForPitr() {
    return dispatchAutoBackupForPitr;
  }


  @JsonProperty(JSON_PROPERTY_DISPATCH_AUTO_BACKUP_FOR_PITR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDispatchAutoBackupForPitr(Boolean dispatchAutoBackupForPitr) {
    this.dispatchAutoBackupForPitr = dispatchAutoBackupForPitr;
  }


  public DmmAvailabilityMetadata irrespectiveOfSla(Boolean irrespectiveOfSla) {
    
    this.irrespectiveOfSla = irrespectiveOfSla;
    return this;
  }

   /**
   * Get irrespectiveOfSla
   * @return irrespectiveOfSla
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IRRESPECTIVE_OF_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIrrespectiveOfSla() {
    return irrespectiveOfSla;
  }


  @JsonProperty(JSON_PROPERTY_IRRESPECTIVE_OF_SLA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIrrespectiveOfSla(Boolean irrespectiveOfSla) {
    this.irrespectiveOfSla = irrespectiveOfSla;
  }


  public DmmAvailabilityMetadata fullBackup(Boolean fullBackup) {
    
    this.fullBackup = fullBackup;
    return this;
  }

   /**
   * Get fullBackup
   * @return fullBackup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FULL_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFullBackup() {
    return fullBackup;
  }


  @JsonProperty(JSON_PROPERTY_FULL_BACKUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFullBackup(Boolean fullBackup) {
    this.fullBackup = fullBackup;
  }


  public DmmAvailabilityMetadata useNameAsIs(Boolean useNameAsIs) {
    
    this.useNameAsIs = useNameAsIs;
    return this;
  }

   /**
   * Get useNameAsIs
   * @return useNameAsIs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_NAME_AS_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getUseNameAsIs() {
    return useNameAsIs;
  }


  @JsonProperty(JSON_PROPERTY_USE_NAME_AS_IS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseNameAsIs(Boolean useNameAsIs) {
    this.useNameAsIs = useNameAsIs;
  }


  public DmmAvailabilityMetadata makeVisibleToUser(Boolean makeVisibleToUser) {
    
    this.makeVisibleToUser = makeVisibleToUser;
    return this;
  }

   /**
   * Get makeVisibleToUser
   * @return makeVisibleToUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAKE_VISIBLE_TO_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMakeVisibleToUser() {
    return makeVisibleToUser;
  }


  @JsonProperty(JSON_PROPERTY_MAKE_VISIBLE_TO_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMakeVisibleToUser(Boolean makeVisibleToUser) {
    this.makeVisibleToUser = makeVisibleToUser;
  }


  public DmmAvailabilityMetadata markAsManual(Boolean markAsManual) {
    
    this.markAsManual = markAsManual;
    return this;
  }

   /**
   * If the snapshot should be marked as a manual snapshot.
   * @return markAsManual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If the snapshot should be marked as a manual snapshot.")
  @JsonProperty(JSON_PROPERTY_MARK_AS_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getMarkAsManual() {
    return markAsManual;
  }


  @JsonProperty(JSON_PROPERTY_MARK_AS_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMarkAsManual(Boolean markAsManual) {
    this.markAsManual = markAsManual;
  }


  public DmmAvailabilityMetadata data(Object data) {
    
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


  public DmmAvailabilityMetadata cloudType(String cloudType) {
    
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


  public DmmAvailabilityMetadata cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * The cloud account Id, where the database backups should be made available to
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The cloud account Id, where the database backups should be made available to")
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


  public DmmAvailabilityMetadata cloudLocations(List<String> cloudLocations) {
    
    this.cloudLocations = cloudLocations;
    return this;
  }

  public DmmAvailabilityMetadata addCloudLocationsItem(String cloudLocationsItem) {
    if (this.cloudLocations == null) {
      this.cloudLocations = new ArrayList<>();
    }
    this.cloudLocations.add(cloudLocationsItem);
    return this;
  }

   /**
   * Get cloudLocations
   * @return cloudLocations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getCloudLocations() {
    return cloudLocations;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocations(List<String> cloudLocations) {
    this.cloudLocations = cloudLocations;
  }


  public DmmAvailabilityMetadata computeResourceId(UUID computeResourceId) {
    
    this.computeResourceId = computeResourceId;
    return this;
  }

   /**
   * The compute resource on which this snapshot would be or is taken
   * @return computeResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The compute resource on which this snapshot would be or is taken")
  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getComputeResourceId() {
    return computeResourceId;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeResourceId(UUID computeResourceId) {
    this.computeResourceId = computeResourceId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmmAvailabilityMetadata dmmAvailabilityMetadata = (DmmAvailabilityMetadata) o;
    return Objects.equals(this.topologyLastRefreshTime, dmmAvailabilityMetadata.topologyLastRefreshTime) &&
        Objects.equals(this.topology, dmmAvailabilityMetadata.topology) &&
        Objects.equals(this.lastAutoBackupTaskSubmissionTime, dmmAvailabilityMetadata.lastAutoBackupTaskSubmissionTime) &&
        Objects.equals(this.lastAutoBackupTriggerTime, dmmAvailabilityMetadata.lastAutoBackupTriggerTime) &&
        Objects.equals(this.lastSlaExecutionTime, dmmAvailabilityMetadata.lastSlaExecutionTime) &&
        Objects.equals(this.dispatchAutoBackupImmediately, dmmAvailabilityMetadata.dispatchAutoBackupImmediately) &&
        Objects.equals(this.dispatchAutoBackupReason, dmmAvailabilityMetadata.dispatchAutoBackupReason) &&
        Objects.equals(this.dispatchAutoBackupForPitr, dmmAvailabilityMetadata.dispatchAutoBackupForPitr) &&
        Objects.equals(this.irrespectiveOfSla, dmmAvailabilityMetadata.irrespectiveOfSla) &&
        Objects.equals(this.fullBackup, dmmAvailabilityMetadata.fullBackup) &&
        Objects.equals(this.useNameAsIs, dmmAvailabilityMetadata.useNameAsIs) &&
        Objects.equals(this.makeVisibleToUser, dmmAvailabilityMetadata.makeVisibleToUser) &&
        Objects.equals(this.markAsManual, dmmAvailabilityMetadata.markAsManual) &&
        Objects.equals(this.data, dmmAvailabilityMetadata.data) &&
        Objects.equals(this.cloudType, dmmAvailabilityMetadata.cloudType) &&
        Objects.equals(this.cloudAccountId, dmmAvailabilityMetadata.cloudAccountId) &&
        Objects.equals(this.cloudLocations, dmmAvailabilityMetadata.cloudLocations) &&
        Objects.equals(this.computeResourceId, dmmAvailabilityMetadata.computeResourceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(topologyLastRefreshTime, topology, lastAutoBackupTaskSubmissionTime, lastAutoBackupTriggerTime, lastSlaExecutionTime, dispatchAutoBackupImmediately, dispatchAutoBackupReason, dispatchAutoBackupForPitr, irrespectiveOfSla, fullBackup, useNameAsIs, makeVisibleToUser, markAsManual, data, cloudType, cloudAccountId, cloudLocations, computeResourceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmmAvailabilityMetadata {\n");
    sb.append("    topologyLastRefreshTime: ").append(toIndentedString(topologyLastRefreshTime)).append("\n");
    sb.append("    topology: ").append(toIndentedString(topology)).append("\n");
    sb.append("    lastAutoBackupTaskSubmissionTime: ").append(toIndentedString(lastAutoBackupTaskSubmissionTime)).append("\n");
    sb.append("    lastAutoBackupTriggerTime: ").append(toIndentedString(lastAutoBackupTriggerTime)).append("\n");
    sb.append("    lastSlaExecutionTime: ").append(toIndentedString(lastSlaExecutionTime)).append("\n");
    sb.append("    dispatchAutoBackupImmediately: ").append(toIndentedString(dispatchAutoBackupImmediately)).append("\n");
    sb.append("    dispatchAutoBackupReason: ").append(toIndentedString(dispatchAutoBackupReason)).append("\n");
    sb.append("    dispatchAutoBackupForPitr: ").append(toIndentedString(dispatchAutoBackupForPitr)).append("\n");
    sb.append("    irrespectiveOfSla: ").append(toIndentedString(irrespectiveOfSla)).append("\n");
    sb.append("    fullBackup: ").append(toIndentedString(fullBackup)).append("\n");
    sb.append("    useNameAsIs: ").append(toIndentedString(useNameAsIs)).append("\n");
    sb.append("    makeVisibleToUser: ").append(toIndentedString(makeVisibleToUser)).append("\n");
    sb.append("    markAsManual: ").append(toIndentedString(markAsManual)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudLocations: ").append(toIndentedString(cloudLocations)).append("\n");
    sb.append("    computeResourceId: ").append(toIndentedString(computeResourceId)).append("\n");
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

