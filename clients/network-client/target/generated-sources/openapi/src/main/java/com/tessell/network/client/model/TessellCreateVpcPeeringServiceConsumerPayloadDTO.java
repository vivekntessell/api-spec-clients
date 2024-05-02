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
import com.tessell.network.client.model.TessellAzureClientVpcInfoDTO;
import com.tessell.network.client.model.TessellClientVpcInfoDTO;
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellCreateAwsClientVpcInfoPayloadDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Create VPC Peering Payload for Service Consumer
 */
@ApiModel(description = "Create VPC Peering Payload for Service Consumer")
@JsonPropertyOrder({
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_SUBSCRIPTION_NAME,
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_REGION,
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_AWS_CLIENT_VPC_INFO,
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_AZURE_CLIENT_VPC_INFO,
  TessellCreateVpcPeeringServiceConsumerPayloadDTO.JSON_PROPERTY_CLIENT_VPC_INFO
})
@JsonTypeName("CreateVpcPeeringServiceConsumerPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateVpcPeeringServiceConsumerPayloadDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_NAME = "subscriptionName";
  private String subscriptionName;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_AWS_CLIENT_VPC_INFO = "awsClientVpcInfo";
  private TessellCreateAwsClientVpcInfoPayloadDTO awsClientVpcInfo;

  public static final String JSON_PROPERTY_AZURE_CLIENT_VPC_INFO = "azureClientVpcInfo";
  private TessellAzureClientVpcInfoDTO azureClientVpcInfo;

  public static final String JSON_PROPERTY_CLIENT_VPC_INFO = "clientVpcInfo";
  private TessellClientVpcInfoDTO clientVpcInfo;


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO subscriptionName(String subscriptionName) {
    
    this.subscriptionName = subscriptionName;
    return this;
  }

   /**
   * Name of the subscription
   * @return subscriptionName
  **/
  @ApiModelProperty(example = "default", required = true, value = "Name of the subscription")
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


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO region(String region) {
    
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


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO awsClientVpcInfo(TessellCreateAwsClientVpcInfoPayloadDTO awsClientVpcInfo) {
    
    this.awsClientVpcInfo = awsClientVpcInfo;
    return this;
  }

   /**
   * Get awsClientVpcInfo
   * @return awsClientVpcInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCreateAwsClientVpcInfoPayloadDTO getAwsClientVpcInfo() {
    return awsClientVpcInfo;
  }


  @JsonProperty(JSON_PROPERTY_AWS_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwsClientVpcInfo(TessellCreateAwsClientVpcInfoPayloadDTO awsClientVpcInfo) {
    this.awsClientVpcInfo = awsClientVpcInfo;
  }


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO azureClientVpcInfo(TessellAzureClientVpcInfoDTO azureClientVpcInfo) {
    
    this.azureClientVpcInfo = azureClientVpcInfo;
    return this;
  }

   /**
   * Get azureClientVpcInfo
   * @return azureClientVpcInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAzureClientVpcInfoDTO getAzureClientVpcInfo() {
    return azureClientVpcInfo;
  }


  @JsonProperty(JSON_PROPERTY_AZURE_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzureClientVpcInfo(TessellAzureClientVpcInfoDTO azureClientVpcInfo) {
    this.azureClientVpcInfo = azureClientVpcInfo;
  }


  public TessellCreateVpcPeeringServiceConsumerPayloadDTO clientVpcInfo(TessellClientVpcInfoDTO clientVpcInfo) {
    
    this.clientVpcInfo = clientVpcInfo;
    return this;
  }

   /**
   * Get clientVpcInfo
   * @return clientVpcInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellClientVpcInfoDTO getClientVpcInfo() {
    return clientVpcInfo;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientVpcInfo(TessellClientVpcInfoDTO clientVpcInfo) {
    this.clientVpcInfo = clientVpcInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateVpcPeeringServiceConsumerPayloadDTO createVpcPeeringServiceConsumerPayload = (TessellCreateVpcPeeringServiceConsumerPayloadDTO) o;
    return Objects.equals(this.subscriptionName, createVpcPeeringServiceConsumerPayload.subscriptionName) &&
        Objects.equals(this.cloudType, createVpcPeeringServiceConsumerPayload.cloudType) &&
        Objects.equals(this.region, createVpcPeeringServiceConsumerPayload.region) &&
        Objects.equals(this.awsClientVpcInfo, createVpcPeeringServiceConsumerPayload.awsClientVpcInfo) &&
        Objects.equals(this.azureClientVpcInfo, createVpcPeeringServiceConsumerPayload.azureClientVpcInfo) &&
        Objects.equals(this.clientVpcInfo, createVpcPeeringServiceConsumerPayload.clientVpcInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, cloudType, region, awsClientVpcInfo, azureClientVpcInfo, clientVpcInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateVpcPeeringServiceConsumerPayloadDTO {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    awsClientVpcInfo: ").append(toIndentedString(awsClientVpcInfo)).append("\n");
    sb.append("    azureClientVpcInfo: ").append(toIndentedString(azureClientVpcInfo)).append("\n");
    sb.append("    clientVpcInfo: ").append(toIndentedString(clientVpcInfo)).append("\n");
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
