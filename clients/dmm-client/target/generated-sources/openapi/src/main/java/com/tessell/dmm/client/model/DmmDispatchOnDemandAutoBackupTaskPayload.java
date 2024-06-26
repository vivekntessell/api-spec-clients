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
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DmmDispatchOnDemandAutoBackupTaskPayload
 */
@JsonPropertyOrder({
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_REASON,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_USE_NAME_AS_IS,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_IRRESPECTIVE_OF_SLA,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_MAKE_VISIBLE_TO_USER,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_FULL_BACKUP,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_COMPUTE_RESOURCE_ID,
  DmmDispatchOnDemandAutoBackupTaskPayload.JSON_PROPERTY_MARK_AS_MANUAL
})
@JsonTypeName("DmmDispatchOnDemandAutoBackupTaskPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DmmDispatchOnDemandAutoBackupTaskPayload {
  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_USE_NAME_AS_IS = "useNameAsIs";
  private Boolean useNameAsIs = true;

  public static final String JSON_PROPERTY_IRRESPECTIVE_OF_SLA = "irrespectiveOfSla";
  private Boolean irrespectiveOfSla = true;

  public static final String JSON_PROPERTY_MAKE_VISIBLE_TO_USER = "makeVisibleToUser";
  private Boolean makeVisibleToUser;

  public static final String JSON_PROPERTY_FULL_BACKUP = "fullBackup";
  private Boolean fullBackup = false;

  public static final String JSON_PROPERTY_COMPUTE_RESOURCE_ID = "computeResourceId";
  private UUID computeResourceId;

  public static final String JSON_PROPERTY_MARK_AS_MANUAL = "markAsManual";
  private Boolean markAsManual = false;


  public DmmDispatchOnDemandAutoBackupTaskPayload reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public DmmDispatchOnDemandAutoBackupTaskPayload useNameAsIs(Boolean useNameAsIs) {
    
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


  public DmmDispatchOnDemandAutoBackupTaskPayload irrespectiveOfSla(Boolean irrespectiveOfSla) {
    
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


  public DmmDispatchOnDemandAutoBackupTaskPayload makeVisibleToUser(Boolean makeVisibleToUser) {
    
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


  public DmmDispatchOnDemandAutoBackupTaskPayload fullBackup(Boolean fullBackup) {
    
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


  public DmmDispatchOnDemandAutoBackupTaskPayload computeResourceId(UUID computeResourceId) {
    
    this.computeResourceId = computeResourceId;
    return this;
  }

   /**
   * The compute resource on which this snapshot would be taken
   * @return computeResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The compute resource on which this snapshot would be taken")
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


  public DmmDispatchOnDemandAutoBackupTaskPayload markAsManual(Boolean markAsManual) {
    
    this.markAsManual = markAsManual;
    return this;
  }

   /**
   * Whether the snapshot should be marked as manual or not. This will only take impact if irrespectiveOfSla is set to true.
   * @return markAsManual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the snapshot should be marked as manual or not. This will only take impact if irrespectiveOfSla is set to true.")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmmDispatchOnDemandAutoBackupTaskPayload dmmDispatchOnDemandAutoBackupTaskPayload = (DmmDispatchOnDemandAutoBackupTaskPayload) o;
    return Objects.equals(this.reason, dmmDispatchOnDemandAutoBackupTaskPayload.reason) &&
        Objects.equals(this.useNameAsIs, dmmDispatchOnDemandAutoBackupTaskPayload.useNameAsIs) &&
        Objects.equals(this.irrespectiveOfSla, dmmDispatchOnDemandAutoBackupTaskPayload.irrespectiveOfSla) &&
        Objects.equals(this.makeVisibleToUser, dmmDispatchOnDemandAutoBackupTaskPayload.makeVisibleToUser) &&
        Objects.equals(this.fullBackup, dmmDispatchOnDemandAutoBackupTaskPayload.fullBackup) &&
        Objects.equals(this.computeResourceId, dmmDispatchOnDemandAutoBackupTaskPayload.computeResourceId) &&
        Objects.equals(this.markAsManual, dmmDispatchOnDemandAutoBackupTaskPayload.markAsManual);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, useNameAsIs, irrespectiveOfSla, makeVisibleToUser, fullBackup, computeResourceId, markAsManual);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmmDispatchOnDemandAutoBackupTaskPayload {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    useNameAsIs: ").append(toIndentedString(useNameAsIs)).append("\n");
    sb.append("    irrespectiveOfSla: ").append(toIndentedString(irrespectiveOfSla)).append("\n");
    sb.append("    makeVisibleToUser: ").append(toIndentedString(makeVisibleToUser)).append("\n");
    sb.append("    fullBackup: ").append(toIndentedString(fullBackup)).append("\n");
    sb.append("    computeResourceId: ").append(toIndentedString(computeResourceId)).append("\n");
    sb.append("    markAsManual: ").append(toIndentedString(markAsManual)).append("\n");
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

