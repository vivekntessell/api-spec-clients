/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.EntityAclSharingInfo;
import com.tessell.tenant.client.model.SubscriptionDeploymentType;
import com.tessell.tenant.client.model.SubscriptionInfraInfo;
import com.tessell.tenant.client.model.SubscriptionMetadata;
import com.tessell.tenant.client.model.SubscriptionStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell Subscription V2
 */
@ApiModel(description = "This is a definition for Tessell Subscription V2")
@JsonPropertyOrder({
  SubscriptionV2.JSON_PROPERTY_ID,
  SubscriptionV2.JSON_PROPERTY_NAME,
  SubscriptionV2.JSON_PROPERTY_DESCRIPTION,
  SubscriptionV2.JSON_PROPERTY_TENANT_ID,
  SubscriptionV2.JSON_PROPERTY_IS_DEFAULT,
  SubscriptionV2.JSON_PROPERTY_DEPLOYMENT_TYPE,
  SubscriptionV2.JSON_PROPERTY_STATUS,
  SubscriptionV2.JSON_PROPERTY_METADATA,
  SubscriptionV2.JSON_PROPERTY_INFRA_INFO,
  SubscriptionV2.JSON_PROPERTY_OWNER,
  SubscriptionV2.JSON_PROPERTY_SHARED_WITH,
  SubscriptionV2.JSON_PROPERTY_DATE_CREATED,
  SubscriptionV2.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("SubscriptionV2")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionV2 {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private UUID tenantId;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault = false;

  public static final String JSON_PROPERTY_DEPLOYMENT_TYPE = "deploymentType";
  private SubscriptionDeploymentType deploymentType;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SubscriptionStatus status;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SubscriptionMetadata metadata;

  public static final String JSON_PROPERTY_INFRA_INFO = "infraInfo";
  private SubscriptionInfraInfo infraInfo;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;

  public static final String JSON_PROPERTY_SHARED_WITH = "sharedWith";
  private EntityAclSharingInfo sharedWith;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;


  public SubscriptionV2 id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Tessell generated ID for the subscription
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tessell generated ID for the subscription")
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


  public SubscriptionV2 name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Subscription name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscription name")
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


  public SubscriptionV2 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Subscription description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscription description")
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


  public SubscriptionV2 tenantId(UUID tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Associated tenant ID for the subscription
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Associated tenant ID for the subscription")
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


  public SubscriptionV2 isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Specifies if this is the default subscription
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specifies if this is the default subscription")
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


  public SubscriptionV2 deploymentType(SubscriptionDeploymentType deploymentType) {
    
    this.deploymentType = deploymentType;
    return this;
  }

   /**
   * Get deploymentType
   * @return deploymentType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionDeploymentType getDeploymentType() {
    return deploymentType;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOYMENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeploymentType(SubscriptionDeploymentType deploymentType) {
    this.deploymentType = deploymentType;
  }


  public SubscriptionV2 status(SubscriptionStatus status) {
    
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

  public SubscriptionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(SubscriptionStatus status) {
    this.status = status;
  }


  public SubscriptionV2 metadata(SubscriptionMetadata metadata) {
    
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

  public SubscriptionMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(SubscriptionMetadata metadata) {
    this.metadata = metadata;
  }


  public SubscriptionV2 infraInfo(SubscriptionInfraInfo infraInfo) {
    
    this.infraInfo = infraInfo;
    return this;
  }

   /**
   * Get infraInfo
   * @return infraInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFRA_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionInfraInfo getInfraInfo() {
    return infraInfo;
  }


  @JsonProperty(JSON_PROPERTY_INFRA_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfraInfo(SubscriptionInfraInfo infraInfo) {
    this.infraInfo = infraInfo;
  }


  public SubscriptionV2 owner(String owner) {
    
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


  public SubscriptionV2 sharedWith(EntityAclSharingInfo sharedWith) {
    
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

  public EntityAclSharingInfo getSharedWith() {
    return sharedWith;
  }


  @JsonProperty(JSON_PROPERTY_SHARED_WITH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSharedWith(EntityAclSharingInfo sharedWith) {
    this.sharedWith = sharedWith;
  }


  public SubscriptionV2 dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Timestamp when the subscription was created
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the subscription was created")
  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateCreated() {
    return dateCreated;
  }


  @JsonProperty(JSON_PROPERTY_DATE_CREATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  public SubscriptionV2 dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Timestamp when the subscription entry was last modified
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timestamp when the subscription entry was last modified")
  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Date getDateModified() {
    return dateModified;
  }


  @JsonProperty(JSON_PROPERTY_DATE_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDateModified(Date dateModified) {
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
    SubscriptionV2 subscriptionV2 = (SubscriptionV2) o;
    return Objects.equals(this.id, subscriptionV2.id) &&
        Objects.equals(this.name, subscriptionV2.name) &&
        Objects.equals(this.description, subscriptionV2.description) &&
        Objects.equals(this.tenantId, subscriptionV2.tenantId) &&
        Objects.equals(this.isDefault, subscriptionV2.isDefault) &&
        Objects.equals(this.deploymentType, subscriptionV2.deploymentType) &&
        Objects.equals(this.status, subscriptionV2.status) &&
        Objects.equals(this.metadata, subscriptionV2.metadata) &&
        Objects.equals(this.infraInfo, subscriptionV2.infraInfo) &&
        Objects.equals(this.owner, subscriptionV2.owner) &&
        Objects.equals(this.sharedWith, subscriptionV2.sharedWith) &&
        Objects.equals(this.dateCreated, subscriptionV2.dateCreated) &&
        Objects.equals(this.dateModified, subscriptionV2.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, tenantId, isDefault, deploymentType, status, metadata, infraInfo, owner, sharedWith, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionV2 {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    deploymentType: ").append(toIndentedString(deploymentType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    infraInfo: ").append(toIndentedString(infraInfo)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    sharedWith: ").append(toIndentedString(sharedWith)).append("\n");
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

