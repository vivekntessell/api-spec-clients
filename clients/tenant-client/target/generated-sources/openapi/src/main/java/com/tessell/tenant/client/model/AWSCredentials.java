/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

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
 * AWS Credentials
 */
@ApiModel(description = "AWS Credentials")
@JsonPropertyOrder({
  AWSCredentials.JSON_PROPERTY_ACCESS_KEY,
  AWSCredentials.JSON_PROPERTY_SECRET_KEY,
  AWSCredentials.JSON_PROPERTY_SECURITY_GROUP,
  AWSCredentials.JSON_PROPERTY_ROLE_ARN
})
@JsonTypeName("AWSCredentials")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class AWSCredentials {
  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_SECRET_KEY = "secretKey";
  private String secretKey;

  public static final String JSON_PROPERTY_SECURITY_GROUP = "securityGroup";
  private String securityGroup;

  public static final String JSON_PROPERTY_ROLE_ARN = "roleArn";
  private String roleArn;


  public AWSCredentials accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * AWS Access Key
   * @return accessKey
  **/
  @ApiModelProperty(required = true, value = "AWS Access Key")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessKey() {
    return accessKey;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public AWSCredentials secretKey(String secretKey) {
    
    this.secretKey = secretKey;
    return this;
  }

   /**
   * AWS Secret Key
   * @return secretKey
  **/
  @ApiModelProperty(required = true, value = "AWS Secret Key")
  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSecretKey() {
    return secretKey;
  }


  @JsonProperty(JSON_PROPERTY_SECRET_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSecretKey(String secretKey) {
    this.secretKey = secretKey;
  }


  public AWSCredentials securityGroup(String securityGroup) {
    
    this.securityGroup = securityGroup;
    return this;
  }

   /**
   * AWS Security Group
   * @return securityGroup
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Security Group")
  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecurityGroup() {
    return securityGroup;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_GROUP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityGroup(String securityGroup) {
    this.securityGroup = securityGroup;
  }


  public AWSCredentials roleArn(String roleArn) {
    
    this.roleArn = roleArn;
    return this;
  }

   /**
   * AWS Role ARN to be assumed
   * @return roleArn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "AWS Role ARN to be assumed")
  @JsonProperty(JSON_PROPERTY_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRoleArn() {
    return roleArn;
  }


  @JsonProperty(JSON_PROPERTY_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoleArn(String roleArn) {
    this.roleArn = roleArn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSCredentials awSCredentials = (AWSCredentials) o;
    return Objects.equals(this.accessKey, awSCredentials.accessKey) &&
        Objects.equals(this.secretKey, awSCredentials.secretKey) &&
        Objects.equals(this.securityGroup, awSCredentials.securityGroup) &&
        Objects.equals(this.roleArn, awSCredentials.roleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessKey, secretKey, securityGroup, roleArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSCredentials {\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    secretKey: ").append(toIndentedString(secretKey)).append("\n");
    sb.append("    securityGroup: ").append(toIndentedString(securityGroup)).append("\n");
    sb.append("    roleArn: ").append(toIndentedString(roleArn)).append("\n");
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

