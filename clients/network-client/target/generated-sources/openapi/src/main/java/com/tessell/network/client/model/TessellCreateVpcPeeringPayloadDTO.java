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
import com.tessell.network.client.model.TessellCloudTypeDTO;
import com.tessell.network.client.model.TessellCreateAwsClientVpcInfoPayloadDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Create AWS VPC Peering
 */
@ApiModel(description = "Create AWS VPC Peering")
@JsonPropertyOrder({
  TessellCreateVpcPeeringPayloadDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellCreateVpcPeeringPayloadDTO.JSON_PROPERTY_AWS_CLIENT_VPC_INFO,
  TessellCreateVpcPeeringPayloadDTO.JSON_PROPERTY_AZURE_CLIENT_VPC_INFO,
  TessellCreateVpcPeeringPayloadDTO.JSON_PROPERTY_CLIENT_VPC_ID
})
@JsonTypeName("CreateVpcPeeringPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCreateVpcPeeringPayloadDTO {
  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_AWS_CLIENT_VPC_INFO = "awsClientVpcInfo";
  private TessellCreateAwsClientVpcInfoPayloadDTO awsClientVpcInfo;

  public static final String JSON_PROPERTY_AZURE_CLIENT_VPC_INFO = "azureClientVpcInfo";
  private TessellAzureClientVpcInfoDTO azureClientVpcInfo;

  public static final String JSON_PROPERTY_CLIENT_VPC_ID = "clientVpcId";
  private UUID clientVpcId;


  public TessellCreateVpcPeeringPayloadDTO cloudType(TessellCloudTypeDTO cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCloudTypeDTO getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(TessellCloudTypeDTO cloudType) {
    this.cloudType = cloudType;
  }


  public TessellCreateVpcPeeringPayloadDTO awsClientVpcInfo(TessellCreateAwsClientVpcInfoPayloadDTO awsClientVpcInfo) {
    
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


  public TessellCreateVpcPeeringPayloadDTO azureClientVpcInfo(TessellAzureClientVpcInfoDTO azureClientVpcInfo) {
    
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


  public TessellCreateVpcPeeringPayloadDTO clientVpcId(UUID clientVpcId) {
    
    this.clientVpcId = clientVpcId;
    return this;
  }

   /**
   * UUID of the Tessell created VPC
   * @return clientVpcId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UUID of the Tessell created VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getClientVpcId() {
    return clientVpcId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientVpcId(UUID clientVpcId) {
    this.clientVpcId = clientVpcId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCreateVpcPeeringPayloadDTO createVpcPeeringPayload = (TessellCreateVpcPeeringPayloadDTO) o;
    return Objects.equals(this.cloudType, createVpcPeeringPayload.cloudType) &&
        Objects.equals(this.awsClientVpcInfo, createVpcPeeringPayload.awsClientVpcInfo) &&
        Objects.equals(this.azureClientVpcInfo, createVpcPeeringPayload.azureClientVpcInfo) &&
        Objects.equals(this.clientVpcId, createVpcPeeringPayload.clientVpcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, awsClientVpcInfo, azureClientVpcInfo, clientVpcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCreateVpcPeeringPayloadDTO {\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    awsClientVpcInfo: ").append(toIndentedString(awsClientVpcInfo)).append("\n");
    sb.append("    azureClientVpcInfo: ").append(toIndentedString(azureClientVpcInfo)).append("\n");
    sb.append("    clientVpcId: ").append(toIndentedString(clientVpcId)).append("\n");
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
