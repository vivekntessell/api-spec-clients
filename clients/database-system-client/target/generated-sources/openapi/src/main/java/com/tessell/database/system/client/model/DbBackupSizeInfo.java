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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Backup size information
 */
@ApiModel(description = "Backup size information")
@JsonPropertyOrder({
  DbBackupSizeInfo.JSON_PROPERTY_BACKUP_PHYSICAL_SIZE,
  DbBackupSizeInfo.JSON_PROPERTY_BACKUP_LOGICAL_SIZE
})
@JsonTypeName("DbBackupSizeInfo")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DbBackupSizeInfo {
  public static final String JSON_PROPERTY_BACKUP_PHYSICAL_SIZE = "backupPhysicalSize";
  private Long backupPhysicalSize;

  public static final String JSON_PROPERTY_BACKUP_LOGICAL_SIZE = "backupLogicalSize";
  private Long backupLogicalSize;


  public DbBackupSizeInfo backupPhysicalSize(Long backupPhysicalSize) {
    
    this.backupPhysicalSize = backupPhysicalSize;
    return this;
  }

   /**
   * Physical size (in bytes) of the backup in underlying cloud
   * @return backupPhysicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Physical size (in bytes) of the backup in underlying cloud")
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


  public DbBackupSizeInfo backupLogicalSize(Long backupLogicalSize) {
    
    this.backupLogicalSize = backupLogicalSize;
    return this;
  }

   /**
   * Restorable size of the backup
   * @return backupLogicalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Restorable size of the backup")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DbBackupSizeInfo dbBackupSizeInfo = (DbBackupSizeInfo) o;
    return Objects.equals(this.backupPhysicalSize, dbBackupSizeInfo.backupPhysicalSize) &&
        Objects.equals(this.backupLogicalSize, dbBackupSizeInfo.backupLogicalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(backupPhysicalSize, backupLogicalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DbBackupSizeInfo {\n");
    sb.append("    backupPhysicalSize: ").append(toIndentedString(backupPhysicalSize)).append("\n");
    sb.append("    backupLogicalSize: ").append(toIndentedString(backupLogicalSize)).append("\n");
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

