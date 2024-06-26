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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SoftwareImage Curation Entity
 */
@ApiModel(description = "SoftwareImage Curation Entity")
@JsonPropertyOrder({
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_CURATION_ID,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_IMAGE_ID,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_IMAGE_NAME,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_CLOUD_AND_AVAILABILITY,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_TENANT_ID,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_DATE_CREATED,
  TessellSoftwareImageCurationEntityDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("SoftwareImageCurationEntity")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSoftwareImageCurationEntityDTO {
  public static final String JSON_PROPERTY_CURATION_ID = "curationId";
  private UUID curationId;

  public static final String JSON_PROPERTY_IMAGE_ID = "imageId";
  private UUID imageId;

  public static final String JSON_PROPERTY_IMAGE_NAME = "imageName";
  private String imageName;

  public static final String JSON_PROPERTY_CLOUD_AND_AVAILABILITY = "cloudAndAvailability";
  private String cloudAndAvailability;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;


  public TessellSoftwareImageCurationEntityDTO curationId(UUID curationId) {
    
    this.curationId = curationId;
    return this;
  }

   /**
   * Curation Identifier
   * @return curationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Curation Identifier")
  @JsonProperty(JSON_PROPERTY_CURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCurationId() {
    return curationId;
  }


  @JsonProperty(JSON_PROPERTY_CURATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurationId(UUID curationId) {
    this.curationId = curationId;
  }


  public TessellSoftwareImageCurationEntityDTO imageId(UUID imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Software image identifier
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Software image identifier")
  @JsonProperty(JSON_PROPERTY_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getImageId() {
    return imageId;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageId(UUID imageId) {
    this.imageId = imageId;
  }


  public TessellSoftwareImageCurationEntityDTO imageName(String imageName) {
    
    this.imageName = imageName;
    return this;
  }

   /**
   * Software image name
   * @return imageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Software image name")
  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getImageName() {
    return imageName;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImageName(String imageName) {
    this.imageName = imageName;
  }


  public TessellSoftwareImageCurationEntityDTO cloudAndAvailability(String cloudAndAvailability) {
    
    this.cloudAndAvailability = cloudAndAvailability;
    return this;
  }

   /**
   * Cloud and Availability
   * @return cloudAndAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud and Availability")
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


  public TessellSoftwareImageCurationEntityDTO tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Tenant Identifier.
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tenant Identifier.")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }


  public TessellSoftwareImageCurationEntityDTO dateCreated(OffsetDateTime dateCreated) {
    
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


  public TessellSoftwareImageCurationEntityDTO dateModified(OffsetDateTime dateModified) {
    
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
    TessellSoftwareImageCurationEntityDTO softwareImageCurationEntity = (TessellSoftwareImageCurationEntityDTO) o;
    return Objects.equals(this.curationId, softwareImageCurationEntity.curationId) &&
        Objects.equals(this.imageId, softwareImageCurationEntity.imageId) &&
        Objects.equals(this.imageName, softwareImageCurationEntity.imageName) &&
        Objects.equals(this.cloudAndAvailability, softwareImageCurationEntity.cloudAndAvailability) &&
        Objects.equals(this.tenantId, softwareImageCurationEntity.tenantId) &&
        Objects.equals(this.dateCreated, softwareImageCurationEntity.dateCreated) &&
        Objects.equals(this.dateModified, softwareImageCurationEntity.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(curationId, imageId, imageName, cloudAndAvailability, tenantId, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSoftwareImageCurationEntityDTO {\n");
    sb.append("    curationId: ").append(toIndentedString(curationId)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
    sb.append("    cloudAndAvailability: ").append(toIndentedString(cloudAndAvailability)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
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

