/*
 * Software Library Governance Service API Documentation
 * Software Library Governance Service API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.softwarelib.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.softwarelib.client.model.TessellSoftwareImageStatusDTO;
import com.tessell.softwarelib.client.model.TessellSoftwareImageVersionEntityDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SoftwareImage Cloud Location Entity
 */
@ApiModel(description = "SoftwareImage Cloud Location Entity")
@JsonPropertyOrder({
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_ID,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_OS_IMAGE_ID,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_VERSION,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_CLOUD_AND_AVAILABILITY,
  TessellSoftwareImageCloudLocationEntityDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("SoftwareImageCloudLocationEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSoftwareImageCloudLocationEntityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_OS_IMAGE_ID = "osImageId";
  private String osImageId;

  public static final String JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID = "dbEngineSnapshotId";
  private String dbEngineSnapshotId;

  public static final String JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID = "tessellLibrarySnapshotId";
  private String tessellLibrarySnapshotId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private TessellSoftwareImageVersionEntityDTO version;

  public static final String JSON_PROPERTY_CLOUD_AND_AVAILABILITY = "cloudAndAvailability";
  private String cloudAndAvailability;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellSoftwareImageStatusDTO status;


  public TessellSoftwareImageCloudLocationEntityDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Software Image Cloud Location identifier
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Software Image Cloud Location identifier")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TessellSoftwareImageCloudLocationEntityDTO osImageId(String osImageId) {
    
    this.osImageId = osImageId;
    return this;
  }

   /**
   * OS Image Identifier.
   * @return osImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OS Image Identifier.")
  @JsonProperty(JSON_PROPERTY_OS_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsImageId() {
    return osImageId;
  }


  @JsonProperty(JSON_PROPERTY_OS_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsImageId(String osImageId) {
    this.osImageId = osImageId;
  }


  public TessellSoftwareImageCloudLocationEntityDTO dbEngineSnapshotId(String dbEngineSnapshotId) {
    
    this.dbEngineSnapshotId = dbEngineSnapshotId;
    return this;
  }

   /**
   * DB Engine disk Identifier.
   * @return dbEngineSnapshotId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Engine disk Identifier.")
  @JsonProperty(JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDbEngineSnapshotId() {
    return dbEngineSnapshotId;
  }


  @JsonProperty(JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbEngineSnapshotId(String dbEngineSnapshotId) {
    this.dbEngineSnapshotId = dbEngineSnapshotId;
  }


  public TessellSoftwareImageCloudLocationEntityDTO tessellLibrarySnapshotId(String tessellLibrarySnapshotId) {
    
    this.tessellLibrarySnapshotId = tessellLibrarySnapshotId;
    return this;
  }

   /**
   * Tessell Library Disk Snapshot Id. This will be deprecated once os image is self sufficient.
   * @return tessellLibrarySnapshotId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell Library Disk Snapshot Id. This will be deprecated once os image is self sufficient.")
  @JsonProperty(JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTessellLibrarySnapshotId() {
    return tessellLibrarySnapshotId;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTessellLibrarySnapshotId(String tessellLibrarySnapshotId) {
    this.tessellLibrarySnapshotId = tessellLibrarySnapshotId;
  }


  public TessellSoftwareImageCloudLocationEntityDTO version(TessellSoftwareImageVersionEntityDTO version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSoftwareImageVersionEntityDTO getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(TessellSoftwareImageVersionEntityDTO version) {
    this.version = version;
  }


  public TessellSoftwareImageCloudLocationEntityDTO cloudAndAvailability(String cloudAndAvailability) {
    
    this.cloudAndAvailability = cloudAndAvailability;
    return this;
  }

   /**
   * Cloud Location
   * @return cloudAndAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Location")
  @JsonProperty(JSON_PROPERTY_CLOUD_AND_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAndAvailability() {
    return cloudAndAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AND_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAndAvailability(String cloudAndAvailability) {
    this.cloudAndAvailability = cloudAndAvailability;
  }


  public TessellSoftwareImageCloudLocationEntityDTO status(TessellSoftwareImageStatusDTO status) {
    
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

  public TessellSoftwareImageStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellSoftwareImageStatusDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellSoftwareImageCloudLocationEntityDTO softwareImageCloudLocationEntity = (TessellSoftwareImageCloudLocationEntityDTO) o;
    return Objects.equals(this.id, softwareImageCloudLocationEntity.id) &&
        Objects.equals(this.osImageId, softwareImageCloudLocationEntity.osImageId) &&
        Objects.equals(this.dbEngineSnapshotId, softwareImageCloudLocationEntity.dbEngineSnapshotId) &&
        Objects.equals(this.tessellLibrarySnapshotId, softwareImageCloudLocationEntity.tessellLibrarySnapshotId) &&
        Objects.equals(this.version, softwareImageCloudLocationEntity.version) &&
        Objects.equals(this.cloudAndAvailability, softwareImageCloudLocationEntity.cloudAndAvailability) &&
        Objects.equals(this.status, softwareImageCloudLocationEntity.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, osImageId, dbEngineSnapshotId, tessellLibrarySnapshotId, version, cloudAndAvailability, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSoftwareImageCloudLocationEntityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    osImageId: ").append(toIndentedString(osImageId)).append("\n");
    sb.append("    dbEngineSnapshotId: ").append(toIndentedString(dbEngineSnapshotId)).append("\n");
    sb.append("    tessellLibrarySnapshotId: ").append(toIndentedString(tessellLibrarySnapshotId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    cloudAndAvailability: ").append(toIndentedString(cloudAndAvailability)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

