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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell create acl payload object
 */
@ApiModel(description = "This is a definition for Tessell create acl payload object")
@JsonPropertyOrder({
  TessellUpdateAclPayload.JSON_PROPERTY_ENTITY_ID,
  TessellUpdateAclPayload.JSON_PROPERTY_USERS,
  TessellUpdateAclPayload.JSON_PROPERTY_GROUPS,
  TessellUpdateAclPayload.JSON_PROPERTY_PERSONAS,
  TessellUpdateAclPayload.JSON_PROPERTY_ACL
})
@JsonTypeName("UpdateAclPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellUpdateAclPayload {
  public static final String JSON_PROPERTY_ENTITY_ID = "entityId";
  private UUID entityId;

  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users = null;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = null;

  public static final String JSON_PROPERTY_PERSONAS = "personas";
  private List<String> personas = null;

  public static final String JSON_PROPERTY_ACL = "acl";
  private String acl;


  public TessellUpdateAclPayload entityId(UUID entityId) {
    
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


  public TessellUpdateAclPayload users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public TessellUpdateAclPayload addUsersItem(String usersItem) {
    if (this.users == null) {
      this.users = new ArrayList<>();
    }
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of user ids
   * @return users
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of user ids")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  public TessellUpdateAclPayload groups(List<String> groups) {
    
    this.groups = groups;
    return this;
  }

  public TessellUpdateAclPayload addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * List of group ids
   * @return groups
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of group ids")
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public TessellUpdateAclPayload personas(List<String> personas) {
    
    this.personas = personas;
    return this;
  }

  public TessellUpdateAclPayload addPersonasItem(String personasItem) {
    if (this.personas == null) {
      this.personas = new ArrayList<>();
    }
    this.personas.add(personasItem);
    return this;
  }

   /**
   * List of personas
   * @return personas
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of personas")
  @JsonProperty(JSON_PROPERTY_PERSONAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getPersonas() {
    return personas;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersonas(List<String> personas) {
    this.personas = personas;
  }


  public TessellUpdateAclPayload acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * acl name of the entity to share
   * @return acl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "acl name of the entity to share")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellUpdateAclPayload updateAclPayload = (TessellUpdateAclPayload) o;
    return Objects.equals(this.entityId, updateAclPayload.entityId) &&
        Objects.equals(this.users, updateAclPayload.users) &&
        Objects.equals(this.groups, updateAclPayload.groups) &&
        Objects.equals(this.personas, updateAclPayload.personas) &&
        Objects.equals(this.acl, updateAclPayload.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityId, users, groups, personas, acl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellUpdateAclPayload {\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
    sb.append("    acl: ").append(toIndentedString(acl)).append("\n");
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
