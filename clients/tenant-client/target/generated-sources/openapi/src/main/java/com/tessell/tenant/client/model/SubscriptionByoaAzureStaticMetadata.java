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
 * Azure metadata for BYOA
 */
@ApiModel(description = "Azure metadata for BYOA")
@JsonPropertyOrder({
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_AUTHORIZE_TESSELL_URL,
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_AUTHORIZE_TESSELL_NETWORK_URL,
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_DEPLOY_RESOURCE_URL,
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_TESSELL_APP_ID,
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_TESSELL_NETWORK_APP_ID,
  SubscriptionByoaAzureStaticMetadata.JSON_PROPERTY_COMMAND
})
@JsonTypeName("SubscriptionByoaAzureStaticMetadata")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionByoaAzureStaticMetadata {
  public static final String JSON_PROPERTY_AUTHORIZE_TESSELL_URL = "authorizeTessellUrl";
  private String authorizeTessellUrl;

  public static final String JSON_PROPERTY_AUTHORIZE_TESSELL_NETWORK_URL = "authorizeTessellNetworkUrl";
  private String authorizeTessellNetworkUrl;

  public static final String JSON_PROPERTY_DEPLOY_RESOURCE_URL = "deployResourceUrl";
  private String deployResourceUrl;

  public static final String JSON_PROPERTY_TESSELL_APP_ID = "tessellAppId";
  private String tessellAppId;

  public static final String JSON_PROPERTY_TESSELL_NETWORK_APP_ID = "tessellNetworkAppId";
  private String tessellNetworkAppId;

  public static final String JSON_PROPERTY_COMMAND = "command";
  private String command;


  public SubscriptionByoaAzureStaticMetadata authorizeTessellUrl(String authorizeTessellUrl) {
    
    this.authorizeTessellUrl = authorizeTessellUrl;
    return this;
  }

   /**
   * Get authorizeTessellUrl
   * @return authorizeTessellUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTHORIZE_TESSELL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthorizeTessellUrl() {
    return authorizeTessellUrl;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZE_TESSELL_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizeTessellUrl(String authorizeTessellUrl) {
    this.authorizeTessellUrl = authorizeTessellUrl;
  }


  public SubscriptionByoaAzureStaticMetadata authorizeTessellNetworkUrl(String authorizeTessellNetworkUrl) {
    
    this.authorizeTessellNetworkUrl = authorizeTessellNetworkUrl;
    return this;
  }

   /**
   * Get authorizeTessellNetworkUrl
   * @return authorizeTessellNetworkUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AUTHORIZE_TESSELL_NETWORK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthorizeTessellNetworkUrl() {
    return authorizeTessellNetworkUrl;
  }


  @JsonProperty(JSON_PROPERTY_AUTHORIZE_TESSELL_NETWORK_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAuthorizeTessellNetworkUrl(String authorizeTessellNetworkUrl) {
    this.authorizeTessellNetworkUrl = authorizeTessellNetworkUrl;
  }


  public SubscriptionByoaAzureStaticMetadata deployResourceUrl(String deployResourceUrl) {
    
    this.deployResourceUrl = deployResourceUrl;
    return this;
  }

   /**
   * Get deployResourceUrl
   * @return deployResourceUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_DEPLOY_RESOURCE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDeployResourceUrl() {
    return deployResourceUrl;
  }


  @JsonProperty(JSON_PROPERTY_DEPLOY_RESOURCE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDeployResourceUrl(String deployResourceUrl) {
    this.deployResourceUrl = deployResourceUrl;
  }


  public SubscriptionByoaAzureStaticMetadata tessellAppId(String tessellAppId) {
    
    this.tessellAppId = tessellAppId;
    return this;
  }

   /**
   * Get tessellAppId
   * @return tessellAppId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TESSELL_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTessellAppId() {
    return tessellAppId;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTessellAppId(String tessellAppId) {
    this.tessellAppId = tessellAppId;
  }


  public SubscriptionByoaAzureStaticMetadata tessellNetworkAppId(String tessellNetworkAppId) {
    
    this.tessellNetworkAppId = tessellNetworkAppId;
    return this;
  }

   /**
   * Get tessellNetworkAppId
   * @return tessellNetworkAppId
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TESSELL_NETWORK_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTessellNetworkAppId() {
    return tessellNetworkAppId;
  }


  @JsonProperty(JSON_PROPERTY_TESSELL_NETWORK_APP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTessellNetworkAppId(String tessellNetworkAppId) {
    this.tessellNetworkAppId = tessellNetworkAppId;
  }


  public SubscriptionByoaAzureStaticMetadata command(String command) {
    
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommand() {
    return command;
  }


  @JsonProperty(JSON_PROPERTY_COMMAND)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommand(String command) {
    this.command = command;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionByoaAzureStaticMetadata subscriptionByoaAzureStaticMetadata = (SubscriptionByoaAzureStaticMetadata) o;
    return Objects.equals(this.authorizeTessellUrl, subscriptionByoaAzureStaticMetadata.authorizeTessellUrl) &&
        Objects.equals(this.authorizeTessellNetworkUrl, subscriptionByoaAzureStaticMetadata.authorizeTessellNetworkUrl) &&
        Objects.equals(this.deployResourceUrl, subscriptionByoaAzureStaticMetadata.deployResourceUrl) &&
        Objects.equals(this.tessellAppId, subscriptionByoaAzureStaticMetadata.tessellAppId) &&
        Objects.equals(this.tessellNetworkAppId, subscriptionByoaAzureStaticMetadata.tessellNetworkAppId) &&
        Objects.equals(this.command, subscriptionByoaAzureStaticMetadata.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorizeTessellUrl, authorizeTessellNetworkUrl, deployResourceUrl, tessellAppId, tessellNetworkAppId, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionByoaAzureStaticMetadata {\n");
    sb.append("    authorizeTessellUrl: ").append(toIndentedString(authorizeTessellUrl)).append("\n");
    sb.append("    authorizeTessellNetworkUrl: ").append(toIndentedString(authorizeTessellNetworkUrl)).append("\n");
    sb.append("    deployResourceUrl: ").append(toIndentedString(deployResourceUrl)).append("\n");
    sb.append("    tessellAppId: ").append(toIndentedString(tessellAppId)).append("\n");
    sb.append("    tessellNetworkAppId: ").append(toIndentedString(tessellNetworkAppId)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
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

