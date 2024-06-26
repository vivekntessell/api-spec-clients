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
import com.tessell.network.client.model.TessellSubnetTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellSubnetBasicDetailsDTO
 */
@JsonPropertyOrder({
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_NAME,
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_CLOUD_ID,
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_CIDR_BLOCK,
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_AVAILABILITY_ZONE,
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_TYPE,
  TessellSubnetBasicDetailsDTO.JSON_PROPERTY_SUBNET_GROUP_IDS
})
@JsonTypeName("SubnetBasicDetails")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellSubnetBasicDetailsDTO {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_CLOUD_ID = "cloudId";
  private String cloudId;

  public static final String JSON_PROPERTY_CIDR_BLOCK = "cidrBlock";
  private String cidrBlock;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONE = "availabilityZone";
  private String availabilityZone;

  public static final String JSON_PROPERTY_TYPE = "type";
  private TessellSubnetTypeDTO type;

  public static final String JSON_PROPERTY_SUBNET_GROUP_IDS = "subnetGroupIds";
  private List<UUID> subnetGroupIds = null;


  public TessellSubnetBasicDetailsDTO name(String name) {
    
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


  public TessellSubnetBasicDetailsDTO cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * cloudId of the subnet
   * @return cloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Default Subnet", value = "cloudId of the subnet")
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


  public TessellSubnetBasicDetailsDTO cidrBlock(String cidrBlock) {
    
    this.cidrBlock = cidrBlock;
    return this;
  }

   /**
   * cidr block of the VPC
   * @return cidrBlock
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.0.0.4/24", value = "cidr block of the VPC")
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


  public TessellSubnetBasicDetailsDTO availabilityZone(String availabilityZone) {
    
    this.availabilityZone = availabilityZone;
    return this;
  }

   /**
   * Availability Zone
   * @return availabilityZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Availability Zone")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAvailabilityZone() {
    return availabilityZone;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZone(String availabilityZone) {
    this.availabilityZone = availabilityZone;
  }


  public TessellSubnetBasicDetailsDTO type(TessellSubnetTypeDTO type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellSubnetTypeDTO getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TessellSubnetTypeDTO type) {
    this.type = type;
  }


  public TessellSubnetBasicDetailsDTO subnetGroupIds(List<UUID> subnetGroupIds) {
    
    this.subnetGroupIds = subnetGroupIds;
    return this;
  }

  public TessellSubnetBasicDetailsDTO addSubnetGroupIdsItem(UUID subnetGroupIdsItem) {
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
    TessellSubnetBasicDetailsDTO subnetBasicDetails = (TessellSubnetBasicDetailsDTO) o;
    return Objects.equals(this.name, subnetBasicDetails.name) &&
        Objects.equals(this.cloudId, subnetBasicDetails.cloudId) &&
        Objects.equals(this.cidrBlock, subnetBasicDetails.cidrBlock) &&
        Objects.equals(this.availabilityZone, subnetBasicDetails.availabilityZone) &&
        Objects.equals(this.type, subnetBasicDetails.type) &&
        Objects.equals(this.subnetGroupIds, subnetBasicDetails.subnetGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, cloudId, cidrBlock, availabilityZone, type, subnetGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellSubnetBasicDetailsDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    availabilityZone: ").append(toIndentedString(availabilityZone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

