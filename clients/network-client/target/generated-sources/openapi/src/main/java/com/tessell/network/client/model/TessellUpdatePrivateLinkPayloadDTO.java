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
import com.tessell.network.client.model.TessellCreateAwsPrivateLinkPayloadDTO;
import com.tessell.network.client.model.TessellCreateAzurePrivateLinkPayloadDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Update Private Link Payload
 */
@ApiModel(description = "Update Private Link Payload")
@JsonPropertyOrder({
  TessellUpdatePrivateLinkPayloadDTO.JSON_PROPERTY_CLOUD_TYPE,
  TessellUpdatePrivateLinkPayloadDTO.JSON_PROPERTY_AWS_PRIVATE_LINK_INFO,
  TessellUpdatePrivateLinkPayloadDTO.JSON_PROPERTY_AZURE_PRIVATE_LINK_INFO
})
@JsonTypeName("UpdatePrivateLinkPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellUpdatePrivateLinkPayloadDTO {
  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private TessellCloudTypeDTO cloudType;

  public static final String JSON_PROPERTY_AWS_PRIVATE_LINK_INFO = "awsPrivateLinkInfo";
  private TessellCreateAwsPrivateLinkPayloadDTO awsPrivateLinkInfo;

  public static final String JSON_PROPERTY_AZURE_PRIVATE_LINK_INFO = "azurePrivateLinkInfo";
  private TessellCreateAzurePrivateLinkPayloadDTO azurePrivateLinkInfo;


  public TessellUpdatePrivateLinkPayloadDTO cloudType(TessellCloudTypeDTO cloudType) {
    
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


  public TessellUpdatePrivateLinkPayloadDTO awsPrivateLinkInfo(TessellCreateAwsPrivateLinkPayloadDTO awsPrivateLinkInfo) {
    
    this.awsPrivateLinkInfo = awsPrivateLinkInfo;
    return this;
  }

   /**
   * Get awsPrivateLinkInfo
   * @return awsPrivateLinkInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS_PRIVATE_LINK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCreateAwsPrivateLinkPayloadDTO getAwsPrivateLinkInfo() {
    return awsPrivateLinkInfo;
  }


  @JsonProperty(JSON_PROPERTY_AWS_PRIVATE_LINK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwsPrivateLinkInfo(TessellCreateAwsPrivateLinkPayloadDTO awsPrivateLinkInfo) {
    this.awsPrivateLinkInfo = awsPrivateLinkInfo;
  }


  public TessellUpdatePrivateLinkPayloadDTO azurePrivateLinkInfo(TessellCreateAzurePrivateLinkPayloadDTO azurePrivateLinkInfo) {
    
    this.azurePrivateLinkInfo = azurePrivateLinkInfo;
    return this;
  }

   /**
   * Get azurePrivateLinkInfo
   * @return azurePrivateLinkInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AZURE_PRIVATE_LINK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCreateAzurePrivateLinkPayloadDTO getAzurePrivateLinkInfo() {
    return azurePrivateLinkInfo;
  }


  @JsonProperty(JSON_PROPERTY_AZURE_PRIVATE_LINK_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAzurePrivateLinkInfo(TessellCreateAzurePrivateLinkPayloadDTO azurePrivateLinkInfo) {
    this.azurePrivateLinkInfo = azurePrivateLinkInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellUpdatePrivateLinkPayloadDTO updatePrivateLinkPayload = (TessellUpdatePrivateLinkPayloadDTO) o;
    return Objects.equals(this.cloudType, updatePrivateLinkPayload.cloudType) &&
        Objects.equals(this.awsPrivateLinkInfo, updatePrivateLinkPayload.awsPrivateLinkInfo) &&
        Objects.equals(this.azurePrivateLinkInfo, updatePrivateLinkPayload.azurePrivateLinkInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudType, awsPrivateLinkInfo, azurePrivateLinkInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellUpdatePrivateLinkPayloadDTO {\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    awsPrivateLinkInfo: ").append(toIndentedString(awsPrivateLinkInfo)).append("\n");
    sb.append("    azurePrivateLinkInfo: ").append(toIndentedString(azurePrivateLinkInfo)).append("\n");
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

