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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell&#39;s user payload object
 */
@ApiModel(description = "This is a definition for Tessell's user payload object")
@JsonPropertyOrder({
  TessellCreateUserPayload.JSON_PROPERTY_EMAIL_ID,
  TessellCreateUserPayload.JSON_PROPERTY_FIRST_NAME,
  TessellCreateUserPayload.JSON_PROPERTY_LAST_NAME,
  TessellCreateUserPayload.JSON_PROPERTY_PASSWORD,
  TessellCreateUserPayload.JSON_PROPERTY_AUTH_TYPE,
  TessellCreateUserPayload.JSON_PROPERTY_PERSONA,
  TessellCreateUserPayload.JSON_PROPERTY_SUBSCRIPTIONS
})
@JsonTypeName("CreateUserPayload")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:35.244225+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateUserPayload {
  public static final String JSON_PROPERTY_EMAIL_ID = "emailId";
  private String emailId;

  public static final String JSON_PROPERTY_FIRST_NAME = "firstName";
  private String firstName;

  public static final String JSON_PROPERTY_LAST_NAME = "lastName";
  private String lastName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_AUTH_TYPE = "authType";
  private TessellAuthType authType;

  public static final String JSON_PROPERTY_PERSONA = "persona";
  private String persona;

  public static final String JSON_PROPERTY_SUBSCRIPTIONS = "subscriptions";
  private List<String> subscriptions = null;


  public TessellCreateUserPayload emailId(String emailId) {
    
    this.emailId = emailId;
    return this;
  }

   /**
   * Email id of the user
   * @return emailId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email id of the user")
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


  public TessellCreateUserPayload firstName(String firstName) {
    
    this.firstName = firstName;
    return this;
  }

   /**
   * First name of the user
   * @return firstName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "First name of the user")
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


  public TessellCreateUserPayload lastName(String lastName) {
    
    this.lastName = lastName;
    return this;
  }

   /**
   * Last name of the user
   * @return lastName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Last name of the user")
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


  public TessellCreateUserPayload password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password of the user
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password of the user")
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


  public TessellCreateUserPayload authType(TessellAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAuthType getAuthType() {
    return authType;
  }


  @JsonProperty(JSON_PROPERTY_AUTH_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAuthType(TessellAuthType authType) {
    this.authType = authType;
  }


  public TessellCreateUserPayload persona(String persona) {
    
    this.persona = persona;
    return this;
  }

   /**
   * Persona of the user
   * @return persona
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Persona of the user")
  @JsonProperty(JSON_PROPERTY_PERSONA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPersona() {
    return persona;
  }


  @JsonProperty(JSON_PROPERTY_PERSONA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPersona(String persona) {
    this.persona = persona;
  }


  public TessellCreateUserPayload subscriptions(List<String> subscriptions) {
    
    this.subscriptions = subscriptions;
    return this;
  }

  public TessellCreateUserPayload addSubscriptionsItem(String subscriptionsItem) {
    if (this.subscriptions == null) {
      this.subscriptions = new ArrayList<>();
    }
    this.subscriptions.add(subscriptionsItem);
    return this;
  }

   /**
   * List of subscription names
   * @return subscriptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of subscription names")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSubscriptions() {
    return subscriptions;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptions(List<String> subscriptions) {
    this.subscriptions = subscriptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateUserPayload createUserPayload = (TessellCreateUserPayload) o;
    return Objects.equals(this.emailId, createUserPayload.emailId) &&
        Objects.equals(this.firstName, createUserPayload.firstName) &&
        Objects.equals(this.lastName, createUserPayload.lastName) &&
        Objects.equals(this.password, createUserPayload.password) &&
        Objects.equals(this.authType, createUserPayload.authType) &&
        Objects.equals(this.persona, createUserPayload.persona) &&
        Objects.equals(this.subscriptions, createUserPayload.subscriptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailId, firstName, lastName, password, authType, persona, subscriptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateUserPayload {\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
    sb.append("    subscriptions: ").append(toIndentedString(subscriptions)).append("\n");
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

