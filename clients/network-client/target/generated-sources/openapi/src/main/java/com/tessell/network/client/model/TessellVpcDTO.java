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
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellEntityAclSharingInfoDTO;
import com.tessell.network.client.model.TessellLoggedInUserRolesDTO;
import com.tessell.network.client.model.TessellMaturityStatusDTO;
import com.tessell.network.client.model.TessellSubnetDTO;
import com.tessell.network.client.model.TessellSubnetGroupMappingDTO;
import com.tessell.network.client.model.TessellVpcInternalStatusDTO;
import com.tessell.network.client.model.TessellVpcMetadataDTO;
import com.tessell.network.client.model.TessellVpcStatusDTO;
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
 * TessellVpcDTO
 */
@JsonPropertyOrder({
  TessellVpcDTO.JSON_PROPERTY_ID,
  TessellVpcDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellVpcDTO.JSON_PROPERTY_CLOUD_ID,
  TessellVpcDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellVpcDTO.JSON_PROPERTY_REGION,
  TessellVpcDTO.JSON_PROPERTY_CIDR_BLOCK,
  TessellVpcDTO.JSON_PROPERTY_NAME,
  TessellVpcDTO.JSON_PROPERTY_SUBNETS,
  TessellVpcDTO.JSON_PROPERTY_SUBNET_GROUPS,
  TessellVpcDTO.JSON_PROPERTY_STATUS,
  TessellVpcDTO.JSON_PROPERTY_INTERNAL_STATUS,
  TessellVpcDTO.JSON_PROPERTY_DATE_CREATED,
  TessellVpcDTO.JSON_PROPERTY_DATE_MODIFIED,
  TessellVpcDTO.JSON_PROPERTY_IS_DEFAULT,
  TessellVpcDTO.JSON_PROPERTY_IS_TESSELL_CREATED,
  TessellVpcDTO.JSON_PROPERTY_METADATA,
  TessellVpcDTO.JSON_PROPERTY_TENANT_ID,
  TessellVpcDTO.JSON_PROPERTY_OWNER,
  TessellVpcDTO.JSON_PROPERTY_LOGGED_IN_USER_ROLE,
  TessellVpcDTO.JSON_PROPERTY_SHARED_WITH,
  TessellVpcDTO.JSON_PROPERTY_MATURITY_STATUS,
  TessellVpcDTO.JSON_PROPERTY_IS_PRIVATE,
  TessellVpcDTO.JSON_PROPERTY_ONLY_FOR_PRIVATE_ACCESS
})
@JsonTypeName("Vpc")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellVpcDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_CLOUD_ID = "cloudId";
  private String cloudId;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_CIDR_BLOCK = "cidrBlock";
  private String cidrBlock;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SUBNETS = "subnets";
  private List<TessellSubnetDTO> subnets = null;

  public static final String JSON_PROPERTY_SUBNET_GROUPS = "subnetGroups";
  private List<TessellSubnetGroupMappingDTO> subnetGroups = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellVpcStatusDTO status;

  public static final String JSON_PROPERTY_INTERNAL_STATUS = "internalStatus";
  private TessellVpcInternalStatusDTO internalStatus;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private OffsetDateTime dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private OffsetDateTime dateModified;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault = false;

  public static final String JSON_PROPERTY_IS_TESSELL_CREATED = "isTessellCreated";
  private Boolean isTessellCreated = true;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellVpcMetadataDTO metadata;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_LOGGED_IN_USER_ROLE = "loggedInUserRole";
  private TessellLoggedInUserRolesDTO loggedInUserRole;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  private TessellEntityAclSharingInfoDTO sharedWith;

  public static final String JSON_PROPERTY_MATURITY_STATUS = "maturityStatus";
  private TessellMaturityStatusDTO maturityStatus;

  public static final String JSON_PROPERTY_IS_PRIVATE = "isPrivate";
  private Boolean isPrivate = false;

  public static final String JSON_PROPERTY_ONLY_FOR_PRIVATE_ACCESS = "onlyForPrivateAccess";
  private Boolean onlyForPrivateAccess = false;


  public TessellVpcDTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated UUID of the VPC
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated UUID of the VPC")
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


  public TessellVpcDTO subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Id of the subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the subscription")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public TessellVpcDTO cloudId(String cloudId) {
    
    this.cloudId = cloudId;
    return this;
  }

   /**
   * Id of the vpc cloud entity
   * @return cloudId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "vpc-123421", value = "Id of the vpc cloud entity")
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


  public TessellVpcDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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


  public TessellVpcDTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region of the VPC
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region of the VPC")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public TessellVpcDTO cidrBlock(String cidrBlock) {
    
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


  public TessellVpcDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the VPC
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Default VPC", value = "Name of the VPC")
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


  public TessellVpcDTO subnets(List<TessellSubnetDTO> subnets) {
    
    this.subnets = subnets;
    return this;
  }

  public TessellVpcDTO addSubnetsItem(TessellSubnetDTO subnetsItem) {
    if (this.subnets == null) {
      this.subnets = new ArrayList<>();
    }
    this.subnets.add(subnetsItem);
    return this;
  }

   /**
   * Get subnets
   * @return subnets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellSubnetDTO> getSubnets() {
    return subnets;
  }


  @JsonProperty(JSON_PROPERTY_SUBNETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnets(List<TessellSubnetDTO> subnets) {
    this.subnets = subnets;
  }


  public TessellVpcDTO subnetGroups(List<TessellSubnetGroupMappingDTO> subnetGroups) {
    
    this.subnetGroups = subnetGroups;
    return this;
  }

  public TessellVpcDTO addSubnetGroupsItem(TessellSubnetGroupMappingDTO subnetGroupsItem) {
    if (this.subnetGroups == null) {
      this.subnetGroups = new ArrayList<>();
    }
    this.subnetGroups.add(subnetGroupsItem);
    return this;
  }

   /**
   * Get subnetGroups
   * @return subnetGroups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBNET_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellSubnetGroupMappingDTO> getSubnetGroups() {
    return subnetGroups;
  }


  @JsonProperty(JSON_PROPERTY_SUBNET_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubnetGroups(List<TessellSubnetGroupMappingDTO> subnetGroups) {
    this.subnetGroups = subnetGroups;
  }


  public TessellVpcDTO status(TessellVpcStatusDTO status) {
    
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

  public TessellVpcStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellVpcStatusDTO status) {
    this.status = status;
  }


  public TessellVpcDTO internalStatus(TessellVpcInternalStatusDTO internalStatus) {
    
    this.internalStatus = internalStatus;
    return this;
  }

   /**
   * Get internalStatus
   * @return internalStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INTERNAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellVpcInternalStatusDTO getInternalStatus() {
    return internalStatus;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternalStatus(TessellVpcInternalStatusDTO internalStatus) {
    this.internalStatus = internalStatus;
  }


  public TessellVpcDTO dateCreated(OffsetDateTime dateCreated) {
    
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


  public TessellVpcDTO dateModified(OffsetDateTime dateModified) {
    
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


  public TessellVpcDTO isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Get isDefault
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public TessellVpcDTO isTessellCreated(Boolean isTessellCreated) {
    
    this.isTessellCreated = isTessellCreated;
    return this;
  }

   /**
   * Get isTessellCreated
   * @return isTessellCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_IS_TESSELL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsTessellCreated() {
    return isTessellCreated;
  }


  @JsonProperty(JSON_PROPERTY_IS_TESSELL_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsTessellCreated(Boolean isTessellCreated) {
    this.isTessellCreated = isTessellCreated;
  }


  public TessellVpcDTO metadata(TessellVpcMetadataDTO metadata) {
    
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

  public TessellVpcMetadataDTO getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellVpcMetadataDTO metadata) {
    this.metadata = metadata;
  }


  public TessellVpcDTO tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Get tenantId
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getTenantId() {
    return tenantId;
  }


  @JsonProperty(JSON_PROPERTY_TENANT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTenantId(UUID tenantId) {
    this.tenantId = tenantId;
  }


  public TessellVpcDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  public TessellVpcDTO loggedInUserRole(TessellLoggedInUserRolesDTO loggedInUserRole) {
    
    this.loggedInUserRole = loggedInUserRole;
    return this;
  }

   /**
   * Get loggedInUserRole
   * @return loggedInUserRole
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LOGGED_IN_USER_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellLoggedInUserRolesDTO getLoggedInUserRole() {
    return loggedInUserRole;
  }


  @JsonProperty(JSON_PROPERTY_LOGGED_IN_USER_ROLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLoggedInUserRole(TessellLoggedInUserRolesDTO loggedInUserRole) {
    this.loggedInUserRole = loggedInUserRole;
  }


  public TessellVpcDTO sharedWith(TessellEntityAclSharingInfoDTO sharedWith) {
    
    this.sharedWith = sharedWith;
    return this;
  }

   /**
   * Get sharedWith
   * @return sharedWith
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellEntityAclSharingInfoDTO getSharedWith() {
    return sharedWith;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWith(TessellEntityAclSharingInfoDTO sharedWith) {
    this.sharedWith = sharedWith;
  }


  public TessellVpcDTO maturityStatus(TessellMaturityStatusDTO maturityStatus) {
    
    this.maturityStatus = maturityStatus;
    return this;
  }

   /**
   * Get maturityStatus
   * @return maturityStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellMaturityStatusDTO getMaturityStatus() {
    return maturityStatus;
  }


  @JsonProperty(JSON_PROPERTY_MATURITY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMaturityStatus(TessellMaturityStatusDTO maturityStatus) {
    this.maturityStatus = maturityStatus;
  }


  public TessellVpcDTO isPrivate(Boolean isPrivate) {
    
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


  public TessellVpcDTO onlyForPrivateAccess(Boolean onlyForPrivateAccess) {
    
    this.onlyForPrivateAccess = onlyForPrivateAccess;
    return this;
  }

   /**
   * Get onlyForPrivateAccess
   * @return onlyForPrivateAccess
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONLY_FOR_PRIVATE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnlyForPrivateAccess() {
    return onlyForPrivateAccess;
  }


  @JsonProperty(JSON_PROPERTY_ONLY_FOR_PRIVATE_ACCESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnlyForPrivateAccess(Boolean onlyForPrivateAccess) {
    this.onlyForPrivateAccess = onlyForPrivateAccess;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellVpcDTO vpc = (TessellVpcDTO) o;
    return Objects.equals(this.id, vpc.id) &&
        Objects.equals(this.subscriptionId, vpc.subscriptionId) &&
        Objects.equals(this.cloudId, vpc.cloudId) &&
        Objects.equals(this.cloudType, vpc.cloudType) &&
        Objects.equals(this.region, vpc.region) &&
        Objects.equals(this.cidrBlock, vpc.cidrBlock) &&
        Objects.equals(this.name, vpc.name) &&
        Objects.equals(this.subnets, vpc.subnets) &&
        Objects.equals(this.subnetGroups, vpc.subnetGroups) &&
        Objects.equals(this.status, vpc.status) &&
        Objects.equals(this.internalStatus, vpc.internalStatus) &&
        Objects.equals(this.dateCreated, vpc.dateCreated) &&
        Objects.equals(this.dateModified, vpc.dateModified) &&
        Objects.equals(this.isDefault, vpc.isDefault) &&
        Objects.equals(this.isTessellCreated, vpc.isTessellCreated) &&
        Objects.equals(this.metadata, vpc.metadata) &&
        Objects.equals(this.tenantId, vpc.tenantId) &&
        Objects.equals(this.owner, vpc.owner) &&
        Objects.equals(this.loggedInUserRole, vpc.loggedInUserRole) &&
        Objects.equals(this.sharedWith, vpc.sharedWith) &&
        Objects.equals(this.maturityStatus, vpc.maturityStatus) &&
        Objects.equals(this.isPrivate, vpc.isPrivate) &&
        Objects.equals(this.onlyForPrivateAccess, vpc.onlyForPrivateAccess);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, subscriptionId, cloudId, cloudType, region, cidrBlock, name, subnets, subnetGroups, status, internalStatus, dateCreated, dateModified, isDefault, isTessellCreated, metadata, tenantId, owner, loggedInUserRole, sharedWith, maturityStatus, isPrivate, onlyForPrivateAccess);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellVpcDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    cloudId: ").append(toIndentedString(cloudId)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cidrBlock: ").append(toIndentedString(cidrBlock)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    subnets: ").append(toIndentedString(subnets)).append("\n");
    sb.append("    subnetGroups: ").append(toIndentedString(subnetGroups)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    internalStatus: ").append(toIndentedString(internalStatus)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isTessellCreated: ").append(toIndentedString(isTessellCreated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    loggedInUserRole: ").append(toIndentedString(loggedInUserRole)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
    sb.append("    maturityStatus: ").append(toIndentedString(maturityStatus)).append("\n");
    sb.append("    isPrivate: ").append(toIndentedString(isPrivate)).append("\n");
    sb.append("    onlyForPrivateAccess: ").append(toIndentedString(onlyForPrivateAccess)).append("\n");
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

