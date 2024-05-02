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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell acl response for service consumers
 */
@ApiModel(description = "This is a definition for Tessell acl response for service consumers")
@JsonPropertyOrder({
  TessellUserAcls.JSON_PROPERTY_EMAIL_ID,
  TessellUserAcls.JSON_PROPERTY_ACL
})
@JsonTypeName("UserAcls")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellUserAcls {
  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_ACL = "acl";
  private String acl;


  public TessellUserAcls emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Email Id of the user
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abc@tessell.com", value = "Email Id of the user")
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


  public TessellUserAcls acl(String acl) {
    
    this.acl = acl;
    return this;
  }

   /**
   * acl
   * @return acl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "acl")
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
    TessellUserAcls userAcls = (TessellUserAcls) o;
    return Objects.equals(this.emailId, userAcls.emailId) &&
        Objects.equals(this.acl, userAcls.acl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, acl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellUserAcls {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
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
