/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload to revoke Tessell ACLs
 */
@ApiModel(description = "Payload to revoke Tessell ACLs")
@JsonPropertyOrder({
  AclRevokePayload.JSON_PROPERTY_USERS
})
@JsonTypeName("AclRevokePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AclRevokePayload {
  public static final String JSON_PROPERTY_USERS = "users";
  private List<String> users = new ArrayList<>();


  public AclRevokePayload users(List<String> users) {
    
    this.users = users;
    return this;
  }

  public AclRevokePayload addUsersItem(String usersItem) {
    this.users.add(usersItem);
    return this;
  }

   /**
   * List of users to be deleted
   * @return users
  **/
  @ApiModelProperty(required = true, value = "List of users to be deleted")
  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getUsers() {
    return users;
  }


  @JsonProperty(JSON_PROPERTY_USERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUsers(List<String> users) {
    this.users = users;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AclRevokePayload aclRevokePayload = (AclRevokePayload) o;
    return Objects.equals(this.users, aclRevokePayload.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AclRevokePayload {\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

