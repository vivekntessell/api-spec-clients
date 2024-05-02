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
import com.tessell.softwarelib.client.model.TessellDatabaseEngineTypeDTO;
import com.tessell.softwarelib.client.model.TessellSoftwareImageMetadataDTO;
import com.tessell.softwarelib.client.model.TessellSoftwareImageStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SoftwareImage Internal Entity
 */
@ApiModel(description = "SoftwareImage Internal Entity")
@JsonPropertyOrder({
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_ID,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_TERRAFORM_ID,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_DESCRIPTION,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_NAME,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_DB_ENGINE_TYPE,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_STATUS,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_METADATA,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_DATE_CREATED,
  TessellSoftwareImageInternalEntityDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("SoftwareImageInternalEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSoftwareImageInternalEntityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_TERRAFORM_ID = "terraformId";
  private UUID terraformId;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DB_ENGINE_TYPE = "dbEngineType";
  private TessellDatabaseEngineTypeDTO dbEngineType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellSoftwareImageStatusDTO status;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellSoftwareImageMetadataDTO metadata;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;


  public TessellSoftwareImageInternalEntityDTO id(UUID id) {
    
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


  public TessellSoftwareImageInternalEntityDTO terraformId(UUID terraformId) {
    
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


  public TessellSoftwareImageInternalEntityDTO description(String description) {
    
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


  public TessellSoftwareImageInternalEntityDTO name(String name) {
    
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


  public TessellSoftwareImageInternalEntityDTO dbEngineType(TessellDatabaseEngineTypeDTO dbEngineType) {
    
    this.dbEngineType = dbEngineType;
    return this;
  }

   /**
   * Get dbEngineType
   * @return dbEngineType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DB_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellDatabaseEngineTypeDTO getDbEngineType() {
    return dbEngineType;
  }


  @JsonProperty(JSON_PROPERTY_DB_ENGINE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbEngineType(TessellDatabaseEngineTypeDTO dbEngineType) {
    this.dbEngineType = dbEngineType;
  }


  public TessellSoftwareImageInternalEntityDTO status(TessellSoftwareImageStatusDTO status) {
    
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


  public TessellSoftwareImageInternalEntityDTO metadata(TessellSoftwareImageMetadataDTO metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Extra metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Extra metadata")
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


  public TessellSoftwareImageInternalEntityDTO dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the entity was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public TessellSoftwareImageInternalEntityDTO dateModified(OffsetDateTime dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the entity was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the entity was last modified")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(OffsetDateTime dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellSoftwareImageInternalEntityDTO softwareImageInternalEntity = (TessellSoftwareImageInternalEntityDTO) o;
    return Objects.equals(this.id, softwareImageInternalEntity.id) &&
        Objects.equals(this.terraformId, softwareImageInternalEntity.terraformId) &&
        Objects.equals(this.description, softwareImageInternalEntity.description) &&
        Objects.equals(this.name, softwareImageInternalEntity.name) &&
        Objects.equals(this.dbEngineType, softwareImageInternalEntity.dbEngineType) &&
        Objects.equals(this.status, softwareImageInternalEntity.status) &&
        Objects.equals(this.metadata, softwareImageInternalEntity.metadata) &&
        Objects.equals(this.dateCreated, softwareImageInternalEntity.dateCreated) &&
        Objects.equals(this.dateModified, softwareImageInternalEntity.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, terraformId, description, name, dbEngineType, status, metadata, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSoftwareImageInternalEntityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    terraformId: ").append(toIndentedString(terraformId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dbEngineType: ").append(toIndentedString(dbEngineType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

