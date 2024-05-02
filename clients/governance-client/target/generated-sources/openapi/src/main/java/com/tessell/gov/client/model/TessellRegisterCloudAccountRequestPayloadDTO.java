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


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gov.client.model.TessellCloudTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is the payload definition for registering a new cloud account to Tessell ecosystem
 */
@ApiModel(description = "This is the payload definition for registering a new cloud account to Tessell ecosystem")
@JsonPropertyOrder({
  TessellRegisterCloudAccountRequestPayloadDTO.JSON_PROPERTY_ACCOUNT_ID,
  TessellRegisterCloudAccountRequestPayloadDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellRegisterCloudAccountRequestPayloadDTO.JSON_PROPERTY_DESCRIPTION,
  TessellRegisterCloudAccountRequestPayloadDTO.JSON_PROPERTY_NAME,
  TessellRegisterCloudAccountRequestPayloadDTO.JSON_PROPERTY_SECRET
})
@JsonTypeName("RegisterCloudAccountRequestPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellRegisterCloudAccountRequestPayloadDTO {
  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SECRET = "secret";
  private Map<String, String> secret = null;


  public TessellRegisterCloudAccountRequestPayloadDTO accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * Cloud Account accountId
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "For AWS, its could be '123456789', for azure, it could be ''HARRYPOTTER", value = "Cloud Account accountId")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public TessellRegisterCloudAccountRequestPayloadDTO cloudType(TessellCloudTypeDTO cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellCloudTypeDTO getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudType(TessellCloudTypeDTO cloudType) {
    this.cloudType = cloudType;
  }


  public TessellRegisterCloudAccountRequestPayloadDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Cloud Account&#39;s description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Account's description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellRegisterCloudAccountRequestPayloadDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Cloud Account&#39;s name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Cloud Account's name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellRegisterCloudAccountRequestPayloadDTO secret(Map<String, String> secret) {
    
    this.secret = secret;
    return this;
  }

  public TessellRegisterCloudAccountRequestPayloadDTO putSecretItem(String key, String secretItem) {
    if (this.secret == null) {
      this.secret = new HashMap<>();
    }
    this.secret.put(key, secretItem);
    return this;
  }

   /**
   * Secret information
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Secret information")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getSecret() {
    return secret;
  }


  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecret(Map<String, String> secret) {
    this.secret = secret;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellRegisterCloudAccountRequestPayloadDTO registerCloudAccountRequestPayload = (TessellRegisterCloudAccountRequestPayloadDTO) o;
    return Objects.equals(this.accountId, registerCloudAccountRequestPayload.accountId) &&
        Objects.equals(this.cloudType, registerCloudAccountRequestPayload.cloudType) &&
        Objects.equals(this.description, registerCloudAccountRequestPayload.description) &&
        Objects.equals(this.name, registerCloudAccountRequestPayload.name) &&
        Objects.equals(this.secret, registerCloudAccountRequestPayload.secret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, cloudType, description, name, secret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellRegisterCloudAccountRequestPayloadDTO {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
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

