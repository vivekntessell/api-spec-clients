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
import com.tessell.iam.client.model.TessellPermissionStatus;
import com.tessell.iam.client.model.TessellRoleEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellPermission1
 */
@JsonPropertyOrder({
  TessellPermission1.JSON_PROPERTY_ENTITY_TYPE,
  TessellPermission1.JSON_PROPERTY_PERMISSION,
  TessellPermission1.JSON_PROPERTY_DESCRIPTION,
  TessellPermission1.JSON_PROPERTY_INTERNAL,
  TessellPermission1.JSON_PROPERTY_ROLES,
  TessellPermission1.JSON_PROPERTY_STATUS
})
@JsonTypeName("Permission_1")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellPermission1 {
  public static final String JSON_PROPERTY_ENTITY_TYPE = "entity-type";
  private String entityType;

  public static final String JSON_PROPERTY_PERMISSION = "permission";
  private String permission;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_INTERNAL = "internal";
  private Boolean internal;

  public static final String JSON_PROPERTY_ROLES = "roles";
  private List<TessellRoleEntity> roles = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellPermissionStatus status;


  public TessellPermission1 entityType(String entityType) {
    
    this.entityType = entityType;
    return this;
  }

   /**
   * Entity type of the permission
   * @return entityType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entity type of the permission")
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


  public TessellPermission1 permission(String permission) {
    
    this.permission = permission;
    return this;
  }

   /**
   * Name of the permission
   * @return permission
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the permission")
  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPermission() {
    return permission;
  }


  @JsonProperty(JSON_PROPERTY_PERMISSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPermission(String permission) {
    this.permission = permission;
  }


  public TessellPermission1 description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the permission
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the permission")
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


  public TessellPermission1 internal(Boolean internal) {
    
    this.internal = internal;
    return this;
  }

   /**
   * Internal permission
   * @return internal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Internal permission")
  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getInternal() {
    return internal;
  }


  @JsonProperty(JSON_PROPERTY_INTERNAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInternal(Boolean internal) {
    this.internal = internal;
  }


  public TessellPermission1 roles(List<TessellRoleEntity> roles) {
    
    this.roles = roles;
    return this;
  }

  public TessellPermission1 addRolesItem(TessellRoleEntity rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellRoleEntity> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(List<TessellRoleEntity> roles) {
    this.roles = roles;
  }


  public TessellPermission1 status(TessellPermissionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Status of the permission
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Status of the permission")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellPermissionStatus getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellPermissionStatus status) {
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
    TessellPermission1 permission1 = (TessellPermission1) o;
    return Objects.equals(this.entityType, permission1.entityType) &&
        Objects.equals(this.permission, permission1.permission) &&
        Objects.equals(this.description, permission1.description) &&
        Objects.equals(this.internal, permission1.internal) &&
        Objects.equals(this.roles, permission1.roles) &&
        Objects.equals(this.status, permission1.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, permission, description, internal, roles, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellPermission1 {\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
