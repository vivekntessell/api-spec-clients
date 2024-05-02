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


package com.tessell.security.client.model;

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
 * Eligible user for sharing the entity
 */
@ApiModel(description = "Eligible user for sharing the entity")
@JsonPropertyOrder({
  TessellAclEligibleUserDTO.JSON_PROPERTY_FIRST_NAME,
  TessellAclEligibleUserDTO.JSON_PROPERTY_LAST_NAME,
  TessellAclEligibleUserDTO.JSON_PROPERTY_EMAIL_ID,
  TessellAclEligibleUserDTO.JSON_PROPERTY_ELIGIBLE_ROLES
})
@JsonTypeName("AclEligibleUser")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAclEligibleUserDTO {
  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_ELIGIBLE_ROLES = "eligibleRoles";
  private List<String> eligibleRoles = null;


  public TessellAclEligibleUserDTO firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * Get firstName
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public TessellAclEligibleUserDTO lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Get lastName
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLastName() {
    return lastName;
  }


  @JsonProperty(JSON_PROPERTY_LAST_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public TessellAclEligibleUserDTO emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Get emailId
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailId() {
    return emailId;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public TessellAclEligibleUserDTO eligibleRoles(List<String> eligibleRoles) {
    
    this.eligibleRoles = eligibleRoles;
    return this;
  }

  public TessellAclEligibleUserDTO addEligibleRolesItem(String eligibleRolesItem) {
    if (this.eligibleRoles == null) {
      this.eligibleRoles = new ArrayList<>();
    }
    this.eligibleRoles.add(eligibleRolesItem);
    return this;
  }

   /**
   * Get eligibleRoles
   * @return eligibleRoles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ELIGIBLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getEligibleRoles() {
    return eligibleRoles;
  }


  @JsonProperty(JSON_PROPERTY_ELIGIBLE_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEligibleRoles(List<String> eligibleRoles) {
    this.eligibleRoles = eligibleRoles;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAclEligibleUserDTO aclEligibleUser = (TessellAclEligibleUserDTO) o;
    return Objects.equals(this.firstName, aclEligibleUser.firstName) &&
        Objects.equals(this.lastName, aclEligibleUser.lastName) &&
        Objects.equals(this.emailId, aclEligibleUser.emailId) &&
        Objects.equals(this.eligibleRoles, aclEligibleUser.eligibleRoles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, lastName, emailId, eligibleRoles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAclEligibleUserDTO {\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    eligibleRoles: ").append(toIndentedString(eligibleRoles)).append("\n");
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

