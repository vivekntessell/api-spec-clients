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
 * Create VPC Peering Payload using AWS Cloudformation Payload for Service Consumer
 */
@ApiModel(description = "Create VPC Peering Payload using AWS Cloudformation Payload for Service Consumer")
@JsonPropertyOrder({
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_SUBSCRIPTION_NAME,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_REGION,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_CLIENT_ACCOUNT_ID,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_CLIENT_VPC_ID,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_CLIENT_VPC_REGION,
  TessellCreateVpcPeeringAwsCloudformationPayloadDTO.JSON_PROPERTY_CLIENT_ACCEPT_ROLE_ARN
})
@JsonTypeName("CreateVpcPeeringAwsCloudformationPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateVpcPeeringAwsCloudformationPayloadDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_NAME = "subscriptionName";
  private String subscriptionName;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_CLIENT_ACCOUNT_ID = "clientAccountId";
  private String clientAccountId;

  public static final String JSON_PROPERTY_CLIENT_VPC_ID = "clientVpcId";
  private String clientVpcId;

  public static final String JSON_PROPERTY_CLIENT_VPC_REGION = "clientVpcRegion";
  private String clientVpcRegion;

  public static final String JSON_PROPERTY_CLIENT_ACCEPT_ROLE_ARN = "clientAcceptRoleArn";
  private String clientAcceptRoleArn;


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO subscriptionName(String subscriptionName) {
    
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


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO region(String region) {
    
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


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO clientAccountId(String clientAccountId) {
    
    this.clientAccountId = clientAccountId;
    return this;
  }

   /**
   * Account Id of the Client VPC
   * @return clientAccountId
  **/
  @ApiModelProperty(example = "123456789", required = true, value = "Account Id of the Client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientAccountId() {
    return clientAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientAccountId(String clientAccountId) {
    this.clientAccountId = clientAccountId;
  }


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO clientVpcId(String clientVpcId) {
    
    this.clientVpcId = clientVpcId;
    return this;
  }

   /**
   * Id of the Client VPC
   * @return clientVpcId
  **/
  @ApiModelProperty(example = "vpc-1a2b3c4d", required = true, value = "Id of the Client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientVpcId() {
    return clientVpcId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientVpcId(String clientVpcId) {
    this.clientVpcId = clientVpcId;
  }


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO clientVpcRegion(String clientVpcRegion) {
    
    this.clientVpcRegion = clientVpcRegion;
    return this;
  }

   /**
   * Region of the Client VPC
   * @return clientVpcRegion
  **/
  @ApiModelProperty(example = "us-east-2", required = true, value = "Region of the Client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientVpcRegion() {
    return clientVpcRegion;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientVpcRegion(String clientVpcRegion) {
    this.clientVpcRegion = clientVpcRegion;
  }


  public TessellCreateVpcPeeringAwsCloudformationPayloadDTO clientAcceptRoleArn(String clientAcceptRoleArn) {
    
    this.clientAcceptRoleArn = clientAcceptRoleArn;
    return this;
  }

   /**
   * ARN of the client AWS Role to accept Peering
   * @return clientAcceptRoleArn
  **/
  @ApiModelProperty(required = true, value = "ARN of the client AWS Role to accept Peering")
  @JsonProperty(JSON_PROPERTY_CLIENT_ACCEPT_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientAcceptRoleArn() {
    return clientAcceptRoleArn;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ACCEPT_ROLE_ARN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientAcceptRoleArn(String clientAcceptRoleArn) {
    this.clientAcceptRoleArn = clientAcceptRoleArn;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateVpcPeeringAwsCloudformationPayloadDTO createVpcPeeringAwsCloudformationPayload = (TessellCreateVpcPeeringAwsCloudformationPayloadDTO) o;
    return Objects.equals(this.subscriptionName, createVpcPeeringAwsCloudformationPayload.subscriptionName) &&
        Objects.equals(this.cloudType, createVpcPeeringAwsCloudformationPayload.cloudType) &&
        Objects.equals(this.region, createVpcPeeringAwsCloudformationPayload.region) &&
        Objects.equals(this.clientAccountId, createVpcPeeringAwsCloudformationPayload.clientAccountId) &&
        Objects.equals(this.clientVpcId, createVpcPeeringAwsCloudformationPayload.clientVpcId) &&
        Objects.equals(this.clientVpcRegion, createVpcPeeringAwsCloudformationPayload.clientVpcRegion) &&
        Objects.equals(this.clientAcceptRoleArn, createVpcPeeringAwsCloudformationPayload.clientAcceptRoleArn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionName, cloudType, region, clientAccountId, clientVpcId, clientVpcRegion, clientAcceptRoleArn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateVpcPeeringAwsCloudformationPayloadDTO {\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    clientAccountId: ").append(toIndentedString(clientAccountId)).append("\n");
    sb.append("    clientVpcId: ").append(toIndentedString(clientVpcId)).append("\n");
    sb.append("    clientVpcRegion: ").append(toIndentedString(clientVpcRegion)).append("\n");
    sb.append("    clientAcceptRoleArn: ").append(toIndentedString(clientAcceptRoleArn)).append("\n");
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

