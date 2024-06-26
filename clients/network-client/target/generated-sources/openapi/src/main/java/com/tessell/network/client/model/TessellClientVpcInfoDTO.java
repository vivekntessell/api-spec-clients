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


package com.tessell.network.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Information about the Tessell created VPC to be peered
 */
@ApiModel(description = "Information about the Tessell created VPC to be peered")
@JsonPropertyOrder({
  TessellClientVpcInfoDTO.JSON_PROPERTY_SUBSCRIPTION_NAME,
  TessellClientVpcInfoDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellClientVpcInfoDTO.JSON_PROPERTY_REGION,
  TessellClientVpcInfoDTO.JSON_PROPERTY_NAME,
  TessellClientVpcInfoDTO.JSON_PROPERTY_OWNER
})
@JsonTypeName("ClientVpcInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellClientVpcInfoDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_NAME = "subscriptionName";
  private String subscriptionName;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private String owner;


  public TessellClientVpcInfoDTO subscriptionName(String subscriptionName) {
    
    this.subscriptionName = subscriptionName;
    return this;
  }

   /**
   * Subscription name of the Tessell client VPC
   * @return subscriptionName
  **/
  @ApiModelProperty(example = "default", required = true, value = "Subscription name of the Tessell client VPC")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSubscriptionName() {
    return subscriptionName;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }


  public TessellClientVpcInfoDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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


  public TessellClientVpcInfoDTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region of the Tessell VPC
   * @return region
  **/
  @ApiModelProperty(example = "us-east-1", required = true, value = "Region of the Tessell VPC")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(String region) {
    this.region = region;
  }


  public TessellClientVpcInfoDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the Tessell VPC
   * @return name
  **/
  @ApiModelProperty(example = "tessell-default-a1b2c3", required = true, value = "Name of the Tessell VPC")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellClientVpcInfoDTO owner(String owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Owner of the Tessell client VPC
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Owner of the Tessell client VPC")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOwner() {
    return owner;
  }


  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellClientVpcInfoDTO clientVpcInfo = (TessellClientVpcInfoDTO) o;
    return Objects.equals(this.subscriptionName, clientVpcInfo.subscriptionName) &&
        Objects.equals(this.cloudType, clientVpcInfo.cloudType) &&
        Objects.equals(this.region, clientVpcInfo.region) &&
        Objects.equals(this.name, clientVpcInfo.name) &&
        Objects.equals(this.owner, clientVpcInfo.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, cloudType, region, name, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellClientVpcInfoDTO {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

