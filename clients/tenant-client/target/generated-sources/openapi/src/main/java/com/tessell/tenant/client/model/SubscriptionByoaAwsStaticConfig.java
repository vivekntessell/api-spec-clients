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
 * SubscriptionByoaAwsStaticConfig
 */
@JsonPropertyOrder({
  SubscriptionByoaAwsStaticConfig.JSON_PROPERTY_CLOUD_FORMATION_URL,
  SubscriptionByoaAwsStaticConfig.JSON_PROPERTY_COMMAND
})
@JsonTypeName("SubscriptionByoaAwsStaticConfig")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionByoaAwsStaticConfig {
  public static final String JSON_PROPERTY_CLOUD_FORMATION_URL = "cloudFormationUrl";
  private String cloudFormationUrl;

  public static final String JSON_PROPERTY_COMMAND = "command";
  private String command;


  public SubscriptionByoaAwsStaticConfig cloudFormationUrl(String cloudFormationUrl) {
    
    this.cloudFormationUrl = cloudFormationUrl;
    return this;
  }

   /**
   * Get cloudFormationUrl
   * @return cloudFormationUrl
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_FORMATION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCloudFormationUrl() {
    return cloudFormationUrl;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_FORMATION_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloudFormationUrl(String cloudFormationUrl) {
    this.cloudFormationUrl = cloudFormationUrl;
  }


  public SubscriptionByoaAwsStaticConfig command(String command) {
    
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
    SubscriptionByoaAwsStaticConfig subscriptionByoaAwsStaticConfig = (SubscriptionByoaAwsStaticConfig) o;
    return Objects.equals(this.cloudFormationUrl, subscriptionByoaAwsStaticConfig.cloudFormationUrl) &&
        Objects.equals(this.command, subscriptionByoaAwsStaticConfig.command);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudFormationUrl, command);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionByoaAwsStaticConfig {\n");
    sb.append("    cloudFormationUrl: ").append(toIndentedString(cloudFormationUrl)).append("\n");
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

