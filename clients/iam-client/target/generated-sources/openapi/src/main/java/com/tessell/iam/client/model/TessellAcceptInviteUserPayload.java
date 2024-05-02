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
 * This is a definition for accept invite payload
 */
@ApiModel(description = "This is a definition for accept invite payload")
@JsonPropertyOrder({
  TessellAcceptInviteUserPayload.JSON_PROPERTY_EMAIL_ID,
  TessellAcceptInviteUserPayload.JSON_PROPERTY_OTP,
  TessellAcceptInviteUserPayload.JSON_PROPERTY_FIRST_NAME,
  TessellAcceptInviteUserPayload.JSON_PROPERTY_LAST_NAME,
  TessellAcceptInviteUserPayload.JSON_PROPERTY_PASSWORD,
  TessellAcceptInviteUserPayload.JSON_PROPERTY_AUTH_TYPE
})
@JsonTypeName("AcceptInviteUserPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAcceptInviteUserPayload {
  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_OTP = "otp";
  private String otp;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TessellAuthType authType;


  public TessellAcceptInviteUserPayload emailId(String emailId) {
    
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


  public TessellAcceptInviteUserPayload otp(String otp) {
    
    this.otp = otp;
    return this;
  }

   /**
   * OTP to validate the request
   * @return otp
  **/
  @ApiModelProperty(required = true, value = "OTP to validate the request")
  @JsonProperty(JSON_PROPERTY_OTP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOtp() {
    return otp;
  }


  @JsonProperty(JSON_PROPERTY_OTP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOtp(String otp) {
    this.otp = otp;
  }


  public TessellAcceptInviteUserPayload firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @ApiModelProperty(example = "John", required = true, value = "First name of the user")
  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFirstName() {
    return firstName;
  }


  @JsonProperty(JSON_PROPERTY_FIRST_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public TessellAcceptInviteUserPayload lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Martin", value = "Last name of the user")
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


  public TessellAcceptInviteUserPayload password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the user
   * @return password
  **/
  @ApiModelProperty(example = "Tessell@999", required = true, value = "Password of the user")
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPassword(String password) {
    this.password = password;
  }


  public TessellAcceptInviteUserPayload authType(TessellAuthType authType) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAcceptInviteUserPayload acceptInviteUserPayload = (TessellAcceptInviteUserPayload) o;
    return Objects.equals(this.emailId, acceptInviteUserPayload.emailId) &&
        Objects.equals(this.otp, acceptInviteUserPayload.otp) &&
        Objects.equals(this.firstName, acceptInviteUserPayload.firstName) &&
        Objects.equals(this.lastName, acceptInviteUserPayload.lastName) &&
        Objects.equals(this.password, acceptInviteUserPayload.password) &&
        Objects.equals(this.authType, acceptInviteUserPayload.authType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, otp, firstName, lastName, password, authType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAcceptInviteUserPayload {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    otp: ").append(toIndentedString(otp)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
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

