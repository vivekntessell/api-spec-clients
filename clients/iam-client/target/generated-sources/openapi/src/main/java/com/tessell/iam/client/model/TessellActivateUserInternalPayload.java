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
import com.tessell.iam.client.model.TessellAuthType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a payload for Activating user
 */
@ApiModel(description = "This is a payload for Activating user")
@JsonPropertyOrder({
  TessellActivateUserInternalPayload.JSON_PROPERTY_AUTH_TYPE,
  TessellActivateUserInternalPayload.JSON_PROPERTY_EMAIL_ID,
  TessellActivateUserInternalPayload.JSON_PROPERTY_PASSWORD
})
@JsonTypeName("ActivateUserInternalPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellActivateUserInternalPayload {
  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TessellAuthType authType;

  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;


  public TessellActivateUserInternalPayload authType(TessellAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthType(TessellAuthType authType) {
    this.authType = authType;
  }


  public TessellActivateUserInternalPayload emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Email Id of the user
   * @return emailId
  **/
  @ApiModelProperty(example = "abc@tessell.com", required = true, value = "Email Id of the user")
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


  public TessellActivateUserInternalPayload password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the user
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Tessell@999", value = "Password of the user")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(String password) {
    this.password = password;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellActivateUserInternalPayload activateUserInternalPayload = (TessellActivateUserInternalPayload) o;
    return Objects.equals(this.authType, activateUserInternalPayload.authType) &&
        Objects.equals(this.emailId, activateUserInternalPayload.emailId) &&
        Objects.equals(this.password, activateUserInternalPayload.password);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authType, emailId, password);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellActivateUserInternalPayload {\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

