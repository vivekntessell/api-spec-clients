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
import com.tessell.softwarelib.client.model.TessellSoftwareImageMetadataDTO;
import com.tessell.softwarelib.client.model.TessellSoftwareImageStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Software Image Response Object (Internal View)
 */
@ApiModel(description = "Software Image Response Object (Internal View)")
@JsonPropertyOrder({
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_TERRAFORM_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_DESCRIPTION,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_NAME,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_DB_VERSION,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_DB_VERSION_NAME,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_DB_VERSION_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_OS_VERSION,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_OS_IMAGE_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_CLOUD_AND_REGION_AVAILABILTY,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_ID,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_STATUS,
  TessellSoftwareImageInternalViewDTO.JSON_PROPERTY_METADATA
})
@JsonTypeName("SoftwareImageInternalView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSoftwareImageInternalViewDTO {
  public static final String JSON_PROPERTY_TERRAFORM_ID = "terraformId";
  private UUID terraformId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DB_VERSION = "dbVersion";
  private String dbVersion;

  public static final String JSON_PROPERTY_DB_VERSION_NAME = "dbVersionName";
  private String dbVersionName;

  public static final String JSON_PROPERTY_DB_VERSION_ID = "dbVersionId";
  private UUID dbVersionId;

  public static final String JSON_PROPERTY_OS_VERSION = "osVersion";
  private String osVersion;

  public static final String JSON_PROPERTY_OS_IMAGE_ID = "osImageId";
  private String osImageId;

  public static final String JSON_PROPERTY_DB_ENGINE_SNAPSHOT_ID = "dbEngineSnapshotId";
  private String dbEngineSnapshotId;

  public static final String JSON_PROPERTY_TESSELL_LIBRARY_SNAPSHOT_ID = "tessellLibrarySnapshotId";
  private String tessellLibrarySnapshotId;

  public static final String JSON_PROPERTY_CLOUD_AND_REGION_AVAILABILTY = "cloudAndRegionAvailabilty";
  private String cloudAndRegionAvailabilty;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellSoftwareImageStatusDTO status;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellSoftwareImageMetadataDTO metadata;


  public TessellSoftwareImageInternalViewDTO terraformId(UUID terraformId) {
    
    this.terraformId = terraformId;
    return this;
  }

   /**
   * Software Image Identifier
   * @return terraformId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Software Image Identifier")
  @JsonProperty(JSON_PROPERTY_TERRAFORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTerraformId() {
    return terraformId;
  }


  @JsonProperty(JSON_PROPERTY_TERRAFORM_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTerraformId(UUID terraformId) {
    this.terraformId = terraformId;
  }


  public TessellSoftwareImageInternalViewDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the SoftwareImage.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the SoftwareImage.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellSoftwareImageInternalViewDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Software Image.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Software Image.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellSoftwareImageInternalViewDTO dbVersion(String dbVersion) {
    
    this.dbVersion = dbVersion;
    return this;
  }

   /**
   * DB Image Version
   * @return dbVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Image Version")
  @JsonProperty(JSON_PROPERTY_DB_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDbVersion() {
    return dbVersion;
  }


  @JsonProperty(JSON_PROPERTY_DB_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbVersion(String dbVersion) {
    this.dbVersion = dbVersion;
  }


  public TessellSoftwareImageInternalViewDTO dbVersionName(String dbVersionName) {
    
    this.dbVersionName = dbVersionName;
    return this;
  }

   /**
   * DB Version name string.
   * @return dbVersionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "DB Version name string.")
  @JsonProperty(JSON_PROPERTY_DB_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDbVersionName() {
    return dbVersionName;
  }


  @JsonProperty(JSON_PROPERTY_DB_VERSION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbVersionName(String dbVersionName) {
    this.dbVersionName = dbVersionName;
  }


  public TessellSoftwareImageInternalViewDTO dbVersionId(UUID dbVersionId) {
    
    this.dbVersionId = dbVersionId;
    return this;
  }

   /**
   * Get dbVersionId
   * @return dbVersionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getDbVersionId() {
    return dbVersionId;
  }


  @JsonProperty(JSON_PROPERTY_DB_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbVersionId(UUID dbVersionId) {
    this.dbVersionId = dbVersionId;
  }


  public TessellSoftwareImageInternalViewDTO osVersion(String osVersion) {
    
    this.osVersion = osVersion;
    return this;
  }

   /**
   * OS Image Version
   * @return osVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OS Image Version")
  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOsVersion() {
    return osVersion;
  }


  @JsonProperty(JSON_PROPERTY_OS_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  public TessellSoftwareImageInternalViewDTO osImageId(String osImageId) {
    
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


  public TessellSoftwareImageInternalViewDTO dbEngineSnapshotId(String dbEngineSnapshotId) {
    
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


  public TessellSoftwareImageInternalViewDTO tessellLibrarySnapshotId(String tessellLibrarySnapshotId) {
    
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


  public TessellSoftwareImageInternalViewDTO cloudAndRegionAvailabilty(String cloudAndRegionAvailabilty) {
    
    this.cloudAndRegionAvailabilty = cloudAndRegionAvailabilty;
    return this;
  }

   /**
   * Cloud region availability.
   * @return cloudAndRegionAvailabilty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud region availability.")
  @JsonProperty(JSON_PROPERTY_CLOUD_AND_REGION_AVAILABILTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAndRegionAvailabilty() {
    return cloudAndRegionAvailabilty;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AND_REGION_AVAILABILTY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAndRegionAvailabilty(String cloudAndRegionAvailabilty) {
    this.cloudAndRegionAvailabilty = cloudAndRegionAvailabilty;
  }


  public TessellSoftwareImageInternalViewDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * If provided, then use the provided uuid as the software image identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If provided, then use the provided uuid as the software image identifier.")
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


  public TessellSoftwareImageInternalViewDTO status(TessellSoftwareImageStatusDTO status) {
    
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


  public TessellSoftwareImageInternalViewDTO metadata(TessellSoftwareImageMetadataDTO metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSoftwareImageMetadataDTO getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellSoftwareImageMetadataDTO metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellSoftwareImageInternalViewDTO softwareImageInternalView = (TessellSoftwareImageInternalViewDTO) o;
    return Objects.equals(this.terraformId, softwareImageInternalView.terraformId) &&
        Objects.equals(this.description, softwareImageInternalView.description) &&
        Objects.equals(this.name, softwareImageInternalView.name) &&
        Objects.equals(this.dbVersion, softwareImageInternalView.dbVersion) &&
        Objects.equals(this.dbVersionName, softwareImageInternalView.dbVersionName) &&
        Objects.equals(this.dbVersionId, softwareImageInternalView.dbVersionId) &&
        Objects.equals(this.osVersion, softwareImageInternalView.osVersion) &&
        Objects.equals(this.osImageId, softwareImageInternalView.osImageId) &&
        Objects.equals(this.dbEngineSnapshotId, softwareImageInternalView.dbEngineSnapshotId) &&
        Objects.equals(this.tessellLibrarySnapshotId, softwareImageInternalView.tessellLibrarySnapshotId) &&
        Objects.equals(this.cloudAndRegionAvailabilty, softwareImageInternalView.cloudAndRegionAvailabilty) &&
        Objects.equals(this.id, softwareImageInternalView.id) &&
        Objects.equals(this.status, softwareImageInternalView.status) &&
        Objects.equals(this.metadata, softwareImageInternalView.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(terraformId, description, name, dbVersion, dbVersionName, dbVersionId, osVersion, osImageId, dbEngineSnapshotId, tessellLibrarySnapshotId, cloudAndRegionAvailabilty, id, status, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSoftwareImageInternalViewDTO {\n");
    sb.append("    terraformId: ").append(toIndentedString(terraformId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbVersion: ").append(toIndentedString(dbVersion)).append("\n");
    sb.append("    dbVersionName: ").append(toIndentedString(dbVersionName)).append("\n");
    sb.append("    dbVersionId: ").append(toIndentedString(dbVersionId)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osImageId: ").append(toIndentedString(osImageId)).append("\n");
    sb.append("    dbEngineSnapshotId: ").append(toIndentedString(dbEngineSnapshotId)).append("\n");
    sb.append("    tessellLibrarySnapshotId: ").append(toIndentedString(tessellLibrarySnapshotId)).append("\n");
    sb.append("    cloudAndRegionAvailabilty: ").append(toIndentedString(cloudAndRegionAvailabilty)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

