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


package com.tessell.integrations.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload to create an user&#39;s entity ACL
 */
@ApiModel(description = "Payload to create an user's entity ACL")
@JsonPropertyOrder({
  TessellAclUserPayloadDTO.JSON_PROPERTY_EMAIL_ID,
  TessellAclUserPayloadDTO.JSON_PROPERTY_ROLE
})
@JsonTypeName("AclUserPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:57.635527+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAclUserPayloadDTO {
  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_ROLE = "role";
  private String role;


  public TessellAclUserPayloadDTO emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Email id of the user
   * @return emailId
  **/
  @ApiModelProperty(required = true, value = "Email id of the user")
  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEmailId() {
    return emailId;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }


  public TessellAclUserPayloadDTO role(String role) {
    
    this.role = role;
    return this;
  }

   /**
   * Role Info
   * @return role
  **/
  @ApiModelProperty(required = true, value = "Role Info")
  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRole() {
    return role;
  }


  @JsonProperty(JSON_PROPERTY_ROLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAclUserPayloadDTO aclUserPayload = (TessellAclUserPayloadDTO) o;
    return Objects.equals(this.emailId, aclUserPayload.emailId) &&
        Objects.equals(this.role, aclUserPayload.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, role);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAclUserPayloadDTO {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

