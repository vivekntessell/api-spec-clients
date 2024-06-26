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
import com.tessell.dmm.client.model.DeleteBackupDbLogForAmPayload;
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
 * DeleteBackupDbLogTaskPayload
 */
@JsonPropertyOrder({
  DeleteBackupDbLogTaskPayload.JSON_PROPERTY_AM_DELETE_INFO,
  DeleteBackupDbLogTaskPayload.JSON_PROPERTY_AM_IDS_TO_BE_DELETED,
  DeleteBackupDbLogTaskPayload.JSON_PROPERTY_DAP_IDS_TO_BE_DELETED,
  DeleteBackupDbLogTaskPayload.JSON_PROPERTY_SANITIZATION_SCHEDULE_IDS_TO_BE_DELETED
})
@JsonTypeName("DeleteBackupDbLogTaskPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteBackupDbLogTaskPayload {
  public static final String JSON_PROPERTY_AM_DELETE_INFO = "amDeleteInfo";
  private Map<String, DeleteBackupDbLogForAmPayload> amDeleteInfo = null;

  public static final String JSON_PROPERTY_AM_IDS_TO_BE_DELETED = "amIdsToBeDeleted";
  private List<UUID> amIdsToBeDeleted = null;

  public static final String JSON_PROPERTY_DAP_IDS_TO_BE_DELETED = "dapIdsToBeDeleted";
  private List<UUID> dapIdsToBeDeleted = null;

  public static final String JSON_PROPERTY_SANITIZATION_SCHEDULE_IDS_TO_BE_DELETED = "sanitizationScheduleIdsToBeDeleted";
  private List<UUID> sanitizationScheduleIdsToBeDeleted = null;


  public DeleteBackupDbLogTaskPayload amDeleteInfo(Map<String, DeleteBackupDbLogForAmPayload> amDeleteInfo) {
    
    this.amDeleteInfo = amDeleteInfo;
    return this;
  }

  public DeleteBackupDbLogTaskPayload putAmDeleteInfoItem(String key, DeleteBackupDbLogForAmPayload amDeleteInfoItem) {
    if (this.amDeleteInfo == null) {
      this.amDeleteInfo = new HashMap<>();
    }
    this.amDeleteInfo.put(key, amDeleteInfoItem);
    return this;
  }

   /**
   * Get amDeleteInfo
   * @return amDeleteInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_DELETE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, DeleteBackupDbLogForAmPayload> getAmDeleteInfo() {
    return amDeleteInfo;
  }


  @JsonProperty(JSON_PROPERTY_AM_DELETE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmDeleteInfo(Map<String, DeleteBackupDbLogForAmPayload> amDeleteInfo) {
    this.amDeleteInfo = amDeleteInfo;
  }


  public DeleteBackupDbLogTaskPayload amIdsToBeDeleted(List<UUID> amIdsToBeDeleted) {
    
    this.amIdsToBeDeleted = amIdsToBeDeleted;
    return this;
  }

  public DeleteBackupDbLogTaskPayload addAmIdsToBeDeletedItem(UUID amIdsToBeDeletedItem) {
    if (this.amIdsToBeDeleted == null) {
      this.amIdsToBeDeleted = new ArrayList<>();
    }
    this.amIdsToBeDeleted.add(amIdsToBeDeletedItem);
    return this;
  }

   /**
   * Get amIdsToBeDeleted
   * @return amIdsToBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AM_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getAmIdsToBeDeleted() {
    return amIdsToBeDeleted;
  }


  @JsonProperty(JSON_PROPERTY_AM_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmIdsToBeDeleted(List<UUID> amIdsToBeDeleted) {
    this.amIdsToBeDeleted = amIdsToBeDeleted;
  }


  public DeleteBackupDbLogTaskPayload dapIdsToBeDeleted(List<UUID> dapIdsToBeDeleted) {
    
    this.dapIdsToBeDeleted = dapIdsToBeDeleted;
    return this;
  }

  public DeleteBackupDbLogTaskPayload addDapIdsToBeDeletedItem(UUID dapIdsToBeDeletedItem) {
    if (this.dapIdsToBeDeleted == null) {
      this.dapIdsToBeDeleted = new ArrayList<>();
    }
    this.dapIdsToBeDeleted.add(dapIdsToBeDeletedItem);
    return this;
  }

   /**
   * Get dapIdsToBeDeleted
   * @return dapIdsToBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAP_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getDapIdsToBeDeleted() {
    return dapIdsToBeDeleted;
  }


  @JsonProperty(JSON_PROPERTY_DAP_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDapIdsToBeDeleted(List<UUID> dapIdsToBeDeleted) {
    this.dapIdsToBeDeleted = dapIdsToBeDeleted;
  }


  public DeleteBackupDbLogTaskPayload sanitizationScheduleIdsToBeDeleted(List<UUID> sanitizationScheduleIdsToBeDeleted) {
    
    this.sanitizationScheduleIdsToBeDeleted = sanitizationScheduleIdsToBeDeleted;
    return this;
  }

  public DeleteBackupDbLogTaskPayload addSanitizationScheduleIdsToBeDeletedItem(UUID sanitizationScheduleIdsToBeDeletedItem) {
    if (this.sanitizationScheduleIdsToBeDeleted == null) {
      this.sanitizationScheduleIdsToBeDeleted = new ArrayList<>();
    }
    this.sanitizationScheduleIdsToBeDeleted.add(sanitizationScheduleIdsToBeDeletedItem);
    return this;
  }

   /**
   * Get sanitizationScheduleIdsToBeDeleted
   * @return sanitizationScheduleIdsToBeDeleted
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SANITIZATION_SCHEDULE_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getSanitizationScheduleIdsToBeDeleted() {
    return sanitizationScheduleIdsToBeDeleted;
  }


  @JsonProperty(JSON_PROPERTY_SANITIZATION_SCHEDULE_IDS_TO_BE_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSanitizationScheduleIdsToBeDeleted(List<UUID> sanitizationScheduleIdsToBeDeleted) {
    this.sanitizationScheduleIdsToBeDeleted = sanitizationScheduleIdsToBeDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteBackupDbLogTaskPayload deleteBackupDbLogTaskPayload = (DeleteBackupDbLogTaskPayload) o;
    return Objects.equals(this.amDeleteInfo, deleteBackupDbLogTaskPayload.amDeleteInfo) &&
        Objects.equals(this.amIdsToBeDeleted, deleteBackupDbLogTaskPayload.amIdsToBeDeleted) &&
        Objects.equals(this.dapIdsToBeDeleted, deleteBackupDbLogTaskPayload.dapIdsToBeDeleted) &&
        Objects.equals(this.sanitizationScheduleIdsToBeDeleted, deleteBackupDbLogTaskPayload.sanitizationScheduleIdsToBeDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amDeleteInfo, amIdsToBeDeleted, dapIdsToBeDeleted, sanitizationScheduleIdsToBeDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteBackupDbLogTaskPayload {\n");
    sb.append("    amDeleteInfo: ").append(toIndentedString(amDeleteInfo)).append("\n");
    sb.append("    amIdsToBeDeleted: ").append(toIndentedString(amIdsToBeDeleted)).append("\n");
    sb.append("    dapIdsToBeDeleted: ").append(toIndentedString(dapIdsToBeDeleted)).append("\n");
    sb.append("    sanitizationScheduleIdsToBeDeleted: ").append(toIndentedString(sanitizationScheduleIdsToBeDeleted)).append("\n");
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

