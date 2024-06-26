/*
 * Compute Governance API Documentation
 * Compute Governance  API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.compute.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.compute.client.model.TessellCloudTypeDTO;
import com.tessell.compute.client.model.TessellComputeInternalViewAvailabilityDTO;
import com.tessell.compute.client.model.TessellComputeMetadataDTO;
import com.tessell.compute.client.model.TessellComputeProfileInfoInternalDTO;
import com.tessell.compute.client.model.TessellComputeStatusDTO;
import com.tessell.compute.client.model.TessellComputeUseCaseDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Compute Response Object (Internal View)
 */
@ApiModel(description = "Compute Response Object (Internal View)")
@JsonPropertyOrder({
  TessellComputeInternalViewDTO.JSON_PROPERTY_DESCRIPTION,
  TessellComputeInternalViewDTO.JSON_PROPERTY_NAME,
  TessellComputeInternalViewDTO.JSON_PROPERTY_FAMILY,
  TessellComputeInternalViewDTO.JSON_PROPERTY_CLOUD_SHAPE,
  TessellComputeInternalViewDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellComputeInternalViewDTO.JSON_PROPERTY_AVAILABILITY,
  TessellComputeInternalViewDTO.JSON_PROPERTY_PROFILE_INFO,
  TessellComputeInternalViewDTO.JSON_PROPERTY_TSM,
  TessellComputeInternalViewDTO.JSON_PROPERTY_ID,
  TessellComputeInternalViewDTO.JSON_PROPERTY_USE_CASES,
  TessellComputeInternalViewDTO.JSON_PROPERTY_IS_INTERNAL,
  TessellComputeInternalViewDTO.JSON_PROPERTY_METADATA,
  TessellComputeInternalViewDTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("ComputeInternalView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellComputeInternalViewDTO {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FAMILY = "family";
  private String family;

  public static final String JSON_PROPERTY_CLOUD_SHAPE = "cloudShape";
  private String cloudShape;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private List<TessellComputeInternalViewAvailabilityDTO> availability = null;

  public static final String JSON_PROPERTY_PROFILE_INFO = "profileInfo";
  private TessellComputeProfileInfoInternalDTO profileInfo;

  public static final String JSON_PROPERTY_TSM = "tsm";
  private Boolean tsm = false;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_USE_CASES = "useCases";
  private List<TessellComputeUseCaseDTO> useCases = null;

  public static final String JSON_PROPERTY_IS_INTERNAL = "isInternal";
  private Boolean isInternal;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellComputeMetadataDTO metadata;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellComputeStatusDTO status;


  public TessellComputeInternalViewDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the Compute.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the Compute.")
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


  public TessellComputeInternalViewDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Compute.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Compute.")
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


  public TessellComputeInternalViewDTO family(String family) {
    
    this.family = family;
    return this;
  }

   /**
   * Name of the Tessell Family
   * @return family
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the Tessell Family")
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamily() {
    return family;
  }


  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFamily(String family) {
    this.family = family;
  }


  public TessellComputeInternalViewDTO cloudShape(String cloudShape) {
    
    this.cloudShape = cloudShape;
    return this;
  }

   /**
   * Actual Cloud Shape
   * @return cloudShape
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Actual Cloud Shape")
  @JsonProperty(JSON_PROPERTY_CLOUD_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudShape() {
    return cloudShape;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_SHAPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudShape(String cloudShape) {
    this.cloudShape = cloudShape;
  }


  public TessellComputeInternalViewDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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

  public TessellCloudTypeDTO getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(TessellCloudTypeDTO cloudType) {
    this.cloudType = cloudType;
  }


  public TessellComputeInternalViewDTO availability(List<TessellComputeInternalViewAvailabilityDTO> availability) {
    
    this.availability = availability;
    return this;
  }

  public TessellComputeInternalViewDTO addAvailabilityItem(TessellComputeInternalViewAvailabilityDTO availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellComputeInternalViewAvailabilityDTO> getAvailability() {
    return availability;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailability(List<TessellComputeInternalViewAvailabilityDTO> availability) {
    this.availability = availability;
  }


  public TessellComputeInternalViewDTO profileInfo(TessellComputeProfileInfoInternalDTO profileInfo) {
    
    this.profileInfo = profileInfo;
    return this;
  }

   /**
   * Get profileInfo
   * @return profileInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellComputeProfileInfoInternalDTO getProfileInfo() {
    return profileInfo;
  }


  @JsonProperty(JSON_PROPERTY_PROFILE_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProfileInfo(TessellComputeProfileInfoInternalDTO profileInfo) {
    this.profileInfo = profileInfo;
  }


  public TessellComputeInternalViewDTO tsm(Boolean tsm) {
    
    this.tsm = tsm;
    return this;
  }

   /**
   * Is TSM Shape
   * @return tsm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is TSM Shape")
  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getTsm() {
    return tsm;
  }


  @JsonProperty(JSON_PROPERTY_TSM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTsm(Boolean tsm) {
    this.tsm = tsm;
  }


  public TessellComputeInternalViewDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * If provided, then use the provided uuid as the compute identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If provided, then use the provided uuid as the compute identifier.")
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


  public TessellComputeInternalViewDTO useCases(List<TessellComputeUseCaseDTO> useCases) {
    
    this.useCases = useCases;
    return this;
  }

  public TessellComputeInternalViewDTO addUseCasesItem(TessellComputeUseCaseDTO useCasesItem) {
    if (this.useCases == null) {
      this.useCases = new ArrayList<>();
    }
    this.useCases.add(useCasesItem);
    return this;
  }

   /**
   * Get useCases
   * @return useCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellComputeUseCaseDTO> getUseCases() {
    return useCases;
  }


  @JsonProperty(JSON_PROPERTY_USE_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUseCases(List<TessellComputeUseCaseDTO> useCases) {
    this.useCases = useCases;
  }


  public TessellComputeInternalViewDTO isInternal(Boolean isInternal) {
    
    this.isInternal = isInternal;
    return this;
  }

   /**
   * Get isInternal
   * @return isInternal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsInternal() {
    return isInternal;
  }


  @JsonProperty(JSON_PROPERTY_IS_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsInternal(Boolean isInternal) {
    this.isInternal = isInternal;
  }


  public TessellComputeInternalViewDTO metadata(TessellComputeMetadataDTO metadata) {
    
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

  public TessellComputeMetadataDTO getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellComputeMetadataDTO metadata) {
    this.metadata = metadata;
  }


  public TessellComputeInternalViewDTO status(TessellComputeStatusDTO status) {
    
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

  public TessellComputeStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellComputeStatusDTO status) {
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
    TessellComputeInternalViewDTO computeInternalView = (TessellComputeInternalViewDTO) o;
    return Objects.equals(this.description, computeInternalView.description) &&
        Objects.equals(this.name, computeInternalView.name) &&
        Objects.equals(this.family, computeInternalView.family) &&
        Objects.equals(this.cloudShape, computeInternalView.cloudShape) &&
        Objects.equals(this.cloudType, computeInternalView.cloudType) &&
        Objects.equals(this.availability, computeInternalView.availability) &&
        Objects.equals(this.profileInfo, computeInternalView.profileInfo) &&
        Objects.equals(this.tsm, computeInternalView.tsm) &&
        Objects.equals(this.id, computeInternalView.id) &&
        Objects.equals(this.useCases, computeInternalView.useCases) &&
        Objects.equals(this.isInternal, computeInternalView.isInternal) &&
        Objects.equals(this.metadata, computeInternalView.metadata) &&
        Objects.equals(this.status, computeInternalView.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, family, cloudShape, cloudType, availability, profileInfo, tsm, id, useCases, isInternal, metadata, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellComputeInternalViewDTO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    cloudShape: ").append(toIndentedString(cloudShape)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    profileInfo: ").append(toIndentedString(profileInfo)).append("\n");
    sb.append("    tsm: ").append(toIndentedString(tsm)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    useCases: ").append(toIndentedString(useCases)).append("\n");
    sb.append("    isInternal: ").append(toIndentedString(isInternal)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

