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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SubscriptionStaticConfigDefaultRegionsMap
 */
@JsonPropertyOrder({
  SubscriptionStaticConfigDefaultRegionsMap.JSON_PROPERTY_AWS,
  SubscriptionStaticConfigDefaultRegionsMap.JSON_PROPERTY_AZURE
})
@JsonTypeName("SubscriptionStaticConfig_defaultRegionsMap")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionStaticConfigDefaultRegionsMap {
  public static final String JSON_PROPERTY_AWS = "aws";
  private List<String> aws = new ArrayList<>();

  public static final String JSON_PROPERTY_AZURE = "azure";
  private List<String> azure = new ArrayList<>();


  public SubscriptionStaticConfigDefaultRegionsMap aws(List<String> aws) {
    
    this.aws = aws;
    return this;
  }

  public SubscriptionStaticConfigDefaultRegionsMap addAwsItem(String awsItem) {
    this.aws.add(awsItem);
    return this;
  }

   /**
   * Get aws
   * @return aws
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAws() {
    return aws;
  }


  @JsonProperty(JSON_PROPERTY_AWS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAws(List<String> aws) {
    this.aws = aws;
  }


  public SubscriptionStaticConfigDefaultRegionsMap azure(List<String> azure) {
    
    this.azure = azure;
    return this;
  }

  public SubscriptionStaticConfigDefaultRegionsMap addAzureItem(String azureItem) {
    this.azure.add(azureItem);
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getAzure() {
    return azure;
  }


  @JsonProperty(JSON_PROPERTY_AZURE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAzure(List<String> azure) {
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
    SubscriptionStaticConfigDefaultRegionsMap subscriptionStaticConfigDefaultRegionsMap = (SubscriptionStaticConfigDefaultRegionsMap) o;
    return Objects.equals(this.aws, subscriptionStaticConfigDefaultRegionsMap.aws) &&
        Objects.equals(this.azure, subscriptionStaticConfigDefaultRegionsMap.azure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aws, azure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionStaticConfigDefaultRegionsMap {\n");
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
