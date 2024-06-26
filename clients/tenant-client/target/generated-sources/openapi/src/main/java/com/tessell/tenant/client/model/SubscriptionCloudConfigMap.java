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
import com.tessell.tenant.client.model.SubscriptionAwsConfig;
import com.tessell.tenant.client.model.SubscriptionAzureConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Cloud configurations for the subscription
 */
@ApiModel(description = "Cloud configurations for the subscription")
@JsonPropertyOrder({
  SubscriptionCloudConfigMap.JSON_PROPERTY_AWS,
  SubscriptionCloudConfigMap.JSON_PROPERTY_AZURE
})
@JsonTypeName("SubscriptionCloudConfigMap")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionCloudConfigMap {
  public static final String JSON_PROPERTY_AWS = "aws";
  private SubscriptionAwsConfig aws;

  public static final String JSON_PROPERTY_AZURE = "azure";
  private SubscriptionAzureConfig azure;


  public SubscriptionCloudConfigMap aws(SubscriptionAwsConfig aws) {
    
    this.aws = aws;
    return this;
  }

   /**
   * Get aws
   * @return aws
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionAwsConfig getAws() {
    return aws;
  }


  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAws(SubscriptionAwsConfig aws) {
    this.aws = aws;
  }


  public SubscriptionCloudConfigMap azure(SubscriptionAzureConfig azure) {
    
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionAzureConfig getAzure() {
    return azure;
  }


  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzure(SubscriptionAzureConfig azure) {
    this.azure = azure;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCloudConfigMap subscriptionCloudConfigMap = (SubscriptionCloudConfigMap) o;
    return Objects.equals(this.aws, subscriptionCloudConfigMap.aws) &&
        Objects.equals(this.azure, subscriptionCloudConfigMap.azure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, azure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCloudConfigMap {\n");
    sb.append("    aws: ").append(toIndentedString(aws)).append("\n");
    sb.append("    azure: ").append(toIndentedString(azure)).append("\n");
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

