/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.network.client.model;

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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellSubnetDTO
 */
@JsonPropertyOrder({
  TessellSubnetDTO.JSON_PROPERTY_CLOUD_LOCATION_ID,
  TessellSubnetDTO.JSON_PROPERTY_ID,
  TessellSubnetDTO.JSON_PROPERTY_CLOUD_ID,
  TessellSubnetDTO.JSON_PROPERTY_CIDR_BLOCK,
  TessellSubnetDTO.JSON_PROPERTY_NAME,
  TessellSubnetDTO.JSON_PROPERTY_DATE_CREATED,
  TessellSubnetDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellSubnetDTO.JSON_PROPERTY_IS_PRIVATE,
  TessellSubnetDTO.JSON_PROPERTY_ELIGIBLE_FOR_PRIVATE,
  TessellSubnetDTO.JSON_PROPERTY_IS_OLD,
  TessellSubnetDTO.JSON_PROPERTY_SUBNET_GROUP_IDS
})
@JsonTypeName("Subnet")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSubnetDTO {
  public static final String JSON_PROPERTY_CLOUD_LOCATION_ID = "cloudLocationId";
  private String cloudLocationId;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_CLOUD_ID = "cloudId";
  private String cloudId;

  public static final String JSON_PROPERTY_CIDR_BLOCK = "cidrBlock";
  private String cidrBlock;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_IS_PRIVATE = "isPrivate";
  private Boolean isPrivate = false;

  public static final String JSON_PROPERTY_ELIGIBLE_FOR_PRIVATE = "eligibleForPrivate";
  private Boolean eligibleForPrivate = false;

  public static final String JSON_PROPERTY_IS_OLD = "isOld";
  private Boolean isOld = false;

  public static final String JSON_PROPERTY_SUBNET_GROUP_IDS = "subnetGroupIds";
  private List<UUID> subnetGroupIds = null;


  public TessellSubnetDTO cloudLocationId(String cloudLocationId) {
    
    this.cloudLocationId = cloudLocationId;
    return this;
  }

   /**
   * Cloud Location Id of the Subnet
   * @return cloudLocationId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Location Id of the Subnet")
  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudLocationId() {
    return cloudLocationId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_LOCATION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudLocationId(String cloudLocationId) {
    this.cloudLocationId = cloudLocationId;
  }


  public TessellSubnetDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID of the subnet
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID of the subnet")
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


  public TessellSubnetDTO cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * Id of the subnet cloud entity
   * @return cloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "subnet-1a2b3c4d", value = "Id of the subnet cloud entity")
  @JsonProperty(JSON_PROPERTY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudId() {
    return cloudId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudId(String cloudId) {
    this.cloudId = cloudId;
  }


  public TessellSubnetDTO cidrBlock(String cidrBlock) {
    
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * cidr block of the subnet
   * @return cidrBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0.0.4/24", value = "cidr block of the subnet")
  @JsonProperty(JSON_PROPERTY_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCidrBlock() {
    return cidrBlock;
  }


  @JsonProperty(JSON_PROPERTY_CIDR_BLOCK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCidrBlock(String cidrBlock) {
    this.cidrBlock = cidrBlock;
  }


  public TessellSubnetDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the subnet
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Default Subnet", value = "Name of the subnet")
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


  public TessellSubnetDTO dateCreated(OffsetDateTime dateCreated) {
    
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


  public TessellSubnetDTO dateModified(OffsetDateTime dateModified) {
    
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


  public TessellSubnetDTO isPrivate(Boolean isPrivate) {
    
    this.isPrivate = isPrivate;
    return this;
  }

   /**
   * Get isPrivate
   * @return isPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsPrivate() {
    return isPrivate;
  }


  @JsonProperty(JSON_PROPERTY_IS_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsPrivate(Boolean isPrivate) {
    this.isPrivate = isPrivate;
  }


  public TessellSubnetDTO eligibleForPrivate(Boolean eligibleForPrivate) {
    
    this.eligibleForPrivate = eligibleForPrivate;
    return this;
  }

   /**
   * Get eligibleForPrivate
   * @return eligibleForPrivate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_FOR_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEligibleForPrivate() {
    return eligibleForPrivate;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE_FOR_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligibleForPrivate(Boolean eligibleForPrivate) {
    this.eligibleForPrivate = eligibleForPrivate;
  }


  public TessellSubnetDTO isOld(Boolean isOld) {
    
    this.isOld = isOld;
    return this;
  }

   /**
   * Get isOld
   * @return isOld
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_OLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsOld() {
    return isOld;
  }


  @JsonProperty(JSON_PROPERTY_IS_OLD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsOld(Boolean isOld) {
    this.isOld = isOld;
  }


  public TessellSubnetDTO subnetGroupIds(List<UUID> subnetGroupIds) {
    
    this.subnetGroupIds = subnetGroupIds;
    return this;
  }

  public TessellSubnetDTO addSubnetGroupIdsItem(UUID subnetGroupIdsItem) {
    if (this.subnetGroupIds == null) {
      this.subnetGroupIds = new ArrayList<>();
    }
    this.subnetGroupIds.add(subnetGroupIdsItem);
    return this;
  }

   /**
   * Get subnetGroupIds
   * @return subnetGroupIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNET_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<UUID> getSubnetGroupIds() {
    return subnetGroupIds;
  }


  @JsonProperty(JSON_PROPERTY_SUBNET_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetGroupIds(List<UUID> subnetGroupIds) {
    this.subnetGroupIds = subnetGroupIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellSubnetDTO subnet = (TessellSubnetDTO) o;
    return Objects.equals(this.cloudLocationId, subnet.cloudLocationId) &&
        Objects.equals(this.id, subnet.id) &&
        Objects.equals(this.cloudId, subnet.cloudId) &&
        Objects.equals(this.cidrBlock, subnet.cidrBlock) &&
        Objects.equals(this.name, subnet.name) &&
        Objects.equals(this.dateCreated, subnet.dateCreated) &&
        Objects.equals(this.dateModified, subnet.dateModified) &&
        Objects.equals(this.isPrivate, subnet.isPrivate) &&
        Objects.equals(this.eligibleForPrivate, subnet.eligibleForPrivate) &&
        Objects.equals(this.isOld, subnet.isOld) &&
        Objects.equals(this.subnetGroupIds, subnet.subnetGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudLocationId, id, cloudId, cidrBlock, name, dateCreated, dateModified, isPrivate, eligibleForPrivate, isOld, subnetGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSubnetDTO {\n");
    sb.append("    cloudLocationId: ").append(toIndentedString(cloudLocationId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    eligibleForPrivate: ").append(toIndentedString(eligibleForPrivate)).append("\n");
    sb.append("    isOld: ").append(toIndentedString(isOld)).append("\n");
    sb.append("    subnetGroupIds: ").append(toIndentedString(subnetGroupIds)).append("\n");
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

