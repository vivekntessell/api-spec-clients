/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

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
 * TessellServiceCredsDTOCreds
 */
@JsonPropertyOrder({
  TessellServiceCredsDTOCreds.JSON_PROPERTY_USER_NAME,
  TessellServiceCredsDTOCreds.JSON_PROPERTY_PASSWORD,
  TessellServiceCredsDTOCreds.JSON_PROPERTY_ACCESS_KEY,
  TessellServiceCredsDTOCreds.JSON_PROPERTY_ACCESS_CERTIFICATE,
  TessellServiceCredsDTOCreds.JSON_PROPERTY_CA_CERTIFICATE
})
@JsonTypeName("TessellServiceCredsDTO_creds")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellServiceCredsDTOCreds {
  public static final String JSON_PROPERTY_USER_NAME = "userName";
  private String userName;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  private String password;

  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_ACCESS_CERTIFICATE = "accessCertificate";
  private String accessCertificate;

  public static final String JSON_PROPERTY_CA_CERTIFICATE = "caCertificate";
  private String caCertificate;


  public TessellServiceCredsDTOCreds userName(String userName) {
    
    this.userName = userName;
    return this;
  }

   /**
   * Username
   * @return userName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Username")
  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserName() {
    return userName;
  }


  @JsonProperty(JSON_PROPERTY_USER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserName(String userName) {
    this.userName = userName;
  }


  public TessellServiceCredsDTOCreds password(String password) {
    
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Password")
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


  public TessellServiceCredsDTOCreds accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * client access key
   * @return accessKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client access key")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessKey() {
    return accessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public TessellServiceCredsDTOCreds accessCertificate(String accessCertificate) {
    
    this.accessCertificate = accessCertificate;
    return this;
  }

   /**
   * client access certificate
   * @return accessCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client access certificate")
  @JsonProperty(JSON_PROPERTY_ACCESS_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccessCertificate() {
    return accessCertificate;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccessCertificate(String accessCertificate) {
    this.accessCertificate = accessCertificate;
  }


  public TessellServiceCredsDTOCreds caCertificate(String caCertificate) {
    
    this.caCertificate = caCertificate;
    return this;
  }

   /**
   * CA certificate
   * @return caCertificate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CA certificate")
  @JsonProperty(JSON_PROPERTY_CA_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCaCertificate() {
    return caCertificate;
  }


  @JsonProperty(JSON_PROPERTY_CA_CERTIFICATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCaCertificate(String caCertificate) {
    this.caCertificate = caCertificate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellServiceCredsDTOCreds tessellServiceCredsDTOCreds = (TessellServiceCredsDTOCreds) o;
    return Objects.equals(this.userName, tessellServiceCredsDTOCreds.userName) &&
        Objects.equals(this.password, tessellServiceCredsDTOCreds.password) &&
        Objects.equals(this.accessKey, tessellServiceCredsDTOCreds.accessKey) &&
        Objects.equals(this.accessCertificate, tessellServiceCredsDTOCreds.accessCertificate) &&
        Objects.equals(this.caCertificate, tessellServiceCredsDTOCreds.caCertificate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, password, accessKey, accessCertificate, caCertificate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellServiceCredsDTOCreds {\n");
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    accessCertificate: ").append(toIndentedString(accessCertificate)).append("\n");
    sb.append("    caCertificate: ").append(toIndentedString(caCertificate)).append("\n");
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

