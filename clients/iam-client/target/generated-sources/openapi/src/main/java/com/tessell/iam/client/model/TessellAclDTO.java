/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.iam.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.iam.client.model.TessellAclStatus;
import com.tessell.iam.client.model.TessellRecipientType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell acl DTO object for service consumers
 */
@ApiModel(description = "This is a definition for Tessell acl DTO object for service consumers")
@JsonPropertyOrder({
  TessellAclDTO.JSON_PROPERTY_ENTITY_ID,
  TessellAclDTO.JSON_PROPERTY_ENTITY_TYPE,
  TessellAclDTO.JSON_PROPERTY_RECIPIENT_ID,
  TessellAclDTO.JSON_PROPERTY_RECIPIENT_TYPE,
  TessellAclDTO.JSON_PROPERTY_ACL,
  TessellAclDTO.JSON_PROPERTY_STATUS,
  TessellAclDTO.JSON_PROPERTY_TENANT_ID,
  TessellAclDTO.JSON_PROPERTY_DATE_CREATED,
  TessellAclDTO.JSON_PROPERTY_DATE_MODIFIED
})
@JsonTypeName("AclDTO")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAclDTO {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_ENTITY_TYPE = "entityType";
  private String entityType;

  public static final String JSON_PROPERTY_RECIPIENT_ID = "recipientId";
  private String recipientId;

  public static final String JSON_PROPERTY_RECIPIENT_TYPE = "recipientType";
  private TessellRecipientType recipientType;

  public static final String JSON_PROPERTY_ACL = "acl";
  private String acl;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellAclStatus status;

  public static final String JSON_PROPERTY_TENANT_ID = "tenantId";
  private String tenantId;

  public static final String JSON_PROPERTY_DATE_CREATED = "dateCreated";
  private Date dateCreated;

  public static final String JSON_PROPERTY_DATE_MODIFIED = "dateModified";
  private Date dateModified;


  public TessellAclDTO entityId(UUID entityId) {
    
    this.entityId = entityId;
    return this;
  }

   /**
   * entity id of the entity to share
   * @return entityId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entity id of the entity to share")
  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getEntityId() {
    return entityId;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityId(UUID entityId) {
    this.entityId = entityId;
  }


  public TessellAclDTO entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * entity type of the entity to share
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "entity type of the entity to share")
  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEntityType() {
    return entityType;
  }


  @JsonProperty(JSON_PROPERTY_ENTITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEntityType(String entityType) {
    this.entityType = entityType;
  }


  public TessellAclDTO recipientId(String recipientId) {
    
    this.recipientId = recipientId;
    return this;
  }

   /**
   * recipient id
   * @return recipientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "recipient id")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRecipientId() {
    return recipientId;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }


  public TessellAclDTO recipientType(TessellRecipientType recipientType) {
    
    this.recipientType = recipientType;
    return this;
  }

   /**
   * Get recipientType
   * @return recipientType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECIPIENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellRecipientType getRecipientType() {
    return recipientType;
  }


  @JsonProperty(JSON_PROPERTY_RECIPIENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecipientType(TessellRecipientType recipientType) {
    this.recipientType = recipientType;
  }


  public TessellAclDTO acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * Get acl
   * @return acl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAcl() {
    return acl;
  }


  @JsonProperty(JSON_PROPERTY_ACL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAcl(String acl) {
    this.acl = acl;
  }


  public TessellAclDTO status(TessellAclStatus status) {
    
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

  public TessellAclStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellAclStatus status) {
    this.status = status;
  }


  public TessellAclDTO tenantId(String tenantId) {
    
    this.tenantId = tenantId;
    return this;
  }

   /**
   * tenant id of the entity to share
   * @return tenantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "tenant id of the entity to share")
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


  public TessellAclDTO dateCreated(Date dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Date when the acl is created  metadata
   * @return dateCreated
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when the acl is created  metadata")
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


  public TessellAclDTO dateModified(Date dateModified) {
    
    this.dateModified = dateModified;
    return this;
  }

   /**
   * Date when acl is last modified  metadata
   * @return dateModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Date when acl is last modified  metadata")
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
    TessellAclDTO aclDTO = (TessellAclDTO) o;
    return Objects.equals(this.entityId, aclDTO.entityId) &&
        Objects.equals(this.entityType, aclDTO.entityType) &&
        Objects.equals(this.recipientId, aclDTO.recipientId) &&
        Objects.equals(this.recipientType, aclDTO.recipientType) &&
        Objects.equals(this.acl, aclDTO.acl) &&
        Objects.equals(this.status, aclDTO.status) &&
        Objects.equals(this.tenantId, aclDTO.tenantId) &&
        Objects.equals(this.dateCreated, aclDTO.dateCreated) &&
        Objects.equals(this.dateModified, aclDTO.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, entityType, recipientId, recipientType, acl, status, tenantId, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAclDTO {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientType: ").append(toIndentedString(recipientType)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

