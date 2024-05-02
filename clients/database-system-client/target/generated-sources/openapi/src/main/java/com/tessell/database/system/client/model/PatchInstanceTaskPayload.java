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
import com.tessell.database.system.client.model.CloudLocationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * PatchInstanceTaskPayload
 */
@JsonPropertyOrder({
  PatchInstanceTaskPayload.JSON_PROPERTY_INSTANCE_ID,
  PatchInstanceTaskPayload.JSON_PROPERTY_SOFTWARE_IMAGE,
  PatchInstanceTaskPayload.JSON_PROPERTY_SOFTWARE_IMAGE_VERSION,
  PatchInstanceTaskPayload.JSON_PROPERTY_SOFTWARE_IMAGE_ID,
  PatchInstanceTaskPayload.JSON_PROPERTY_SOFTWARE_IMAGE_VERSION_ID,
  PatchInstanceTaskPayload.JSON_PROPERTY_CLOUD_LOCATION,
  PatchInstanceTaskPayload.JSON_PROPERTY_CLOUD_RESOURCE_ID,
  PatchInstanceTaskPayload.JSON_PROPERTY_CLOUD_RESOURCE_NAME
})
@JsonTypeName("PatchInstanceTaskPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchInstanceTaskPayload {
  public static final String JSON_PROPERTY_INSTANCE_ID = "instanceId";
  private UUID instanceId;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE = "softwareImage";
  private String softwareImage;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_VERSION = "softwareImageVersion";
  private String softwareImageVersion;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_ID = "softwareImageId";
  private UUID softwareImageId;

  public static final String JSON_PROPERTY_SOFTWARE_IMAGE_VERSION_ID = "softwareImageVersionId";
  private UUID softwareImageVersionId;

  public static final String JSON_PROPERTY_CLOUD_LOCATION = "cloudLocation";
  private CloudLocationInfo cloudLocation;

  public static final String JSON_PROPERTY_CLOUD_RESOURCE_ID = "cloudResourceId";
  private String cloudResourceId;

  public static final String JSON_PROPERTY_CLOUD_RESOURCE_NAME = "cloudResourceName";
  private String cloudResourceName;


  public PatchInstanceTaskPayload instanceId(UUID instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * Get instanceId
   * @return instanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getInstanceId() {
    return instanceId;
  }


  @JsonProperty(JSON_PROPERTY_INSTANCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInstanceId(UUID instanceId) {
    this.instanceId = instanceId;
  }


  public PatchInstanceTaskPayload softwareImage(String softwareImage) {
    
    this.softwareImage = softwareImage;
    return this;
  }

   /**
   * Get softwareImage
   * @return softwareImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoftwareImage() {
    return softwareImage;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImage(String softwareImage) {
    this.softwareImage = softwareImage;
  }


  public PatchInstanceTaskPayload softwareImageVersion(String softwareImageVersion) {
    
    this.softwareImageVersion = softwareImageVersion;
    return this;
  }

   /**
   * Get softwareImageVersion
   * @return softwareImageVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSoftwareImageVersion() {
    return softwareImageVersion;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImageVersion(String softwareImageVersion) {
    this.softwareImageVersion = softwareImageVersion;
  }


  public PatchInstanceTaskPayload softwareImageId(UUID softwareImageId) {
    
    this.softwareImageId = softwareImageId;
    return this;
  }

   /**
   * Get softwareImageId
   * @return softwareImageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSoftwareImageId() {
    return softwareImageId;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImageId(UUID softwareImageId) {
    this.softwareImageId = softwareImageId;
  }


  public PatchInstanceTaskPayload softwareImageVersionId(UUID softwareImageVersionId) {
    
    this.softwareImageVersionId = softwareImageVersionId;
    return this;
  }

   /**
   * Get softwareImageVersionId
   * @return softwareImageVersionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSoftwareImageVersionId() {
    return softwareImageVersionId;
  }


  @JsonProperty(JSON_PROPERTY_SOFTWARE_IMAGE_VERSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftwareImageVersionId(UUID softwareImageVersionId) {
    this.softwareImageVersionId = softwareImageVersionId;
  }


  public PatchInstanceTaskPayload cloudLocation(CloudLocationInfo cloudLocation) {
    
    this.cloudLocation = cloudLocation;
    return this;
  }

   /**
   * Get cloudLocation
   * @return cloudLocation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudLocationInfo getCloudLocation() {
    return cloudLocation;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocation(CloudLocationInfo cloudLocation) {
    this.cloudLocation = cloudLocation;
  }


  public PatchInstanceTaskPayload cloudResourceId(String cloudResourceId) {
    
    this.cloudResourceId = cloudResourceId;
    return this;
  }

   /**
   * Get cloudResourceId
   * @return cloudResourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudResourceId() {
    return cloudResourceId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudResourceId(String cloudResourceId) {
    this.cloudResourceId = cloudResourceId;
  }


  public PatchInstanceTaskPayload cloudResourceName(String cloudResourceName) {
    
    this.cloudResourceName = cloudResourceName;
    return this;
  }

   /**
   * Get cloudResourceName
   * @return cloudResourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudResourceName() {
    return cloudResourceName;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_RESOURCE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudResourceName(String cloudResourceName) {
    this.cloudResourceName = cloudResourceName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchInstanceTaskPayload patchInstanceTaskPayload = (PatchInstanceTaskPayload) o;
    return Objects.equals(this.instanceId, patchInstanceTaskPayload.instanceId) &&
        Objects.equals(this.softwareImage, patchInstanceTaskPayload.softwareImage) &&
        Objects.equals(this.softwareImageVersion, patchInstanceTaskPayload.softwareImageVersion) &&
        Objects.equals(this.softwareImageId, patchInstanceTaskPayload.softwareImageId) &&
        Objects.equals(this.softwareImageVersionId, patchInstanceTaskPayload.softwareImageVersionId) &&
        Objects.equals(this.cloudLocation, patchInstanceTaskPayload.cloudLocation) &&
        Objects.equals(this.cloudResourceId, patchInstanceTaskPayload.cloudResourceId) &&
        Objects.equals(this.cloudResourceName, patchInstanceTaskPayload.cloudResourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instanceId, softwareImage, softwareImageVersion, softwareImageId, softwareImageVersionId, cloudLocation, cloudResourceId, cloudResourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchInstanceTaskPayload {\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    softwareImage: ").append(toIndentedString(softwareImage)).append("\n");
    sb.append("    softwareImageVersion: ").append(toIndentedString(softwareImageVersion)).append("\n");
    sb.append("    softwareImageId: ").append(toIndentedString(softwareImageId)).append("\n");
    sb.append("    softwareImageVersionId: ").append(toIndentedString(softwareImageVersionId)).append("\n");
    sb.append("    cloudLocation: ").append(toIndentedString(cloudLocation)).append("\n");
    sb.append("    cloudResourceId: ").append(toIndentedString(cloudResourceId)).append("\n");
    sb.append("    cloudResourceName: ").append(toIndentedString(cloudResourceName)).append("\n");
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
