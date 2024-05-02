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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * AWS VPC Peering Client Info for Service Consumer
 */
@ApiModel(description = "AWS VPC Peering Client Info for Service Consumer")
@JsonPropertyOrder({
  TessellAwsClientInfoServiceConsumerDTO.JSON_PROPERTY_CLIENT_VPC_ID,
  TessellAwsClientInfoServiceConsumerDTO.JSON_PROPERTY_CLIENT_VPC_REGION,
  TessellAwsClientInfoServiceConsumerDTO.JSON_PROPERTY_CLIENT_ACCOUNT_ID
})
@JsonTypeName("AwsClientInfoServiceConsumer")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:07.428121+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAwsClientInfoServiceConsumerDTO {
  public static final String JSON_PROPERTY_CLIENT_VPC_ID = "clientVpcId";
  private String clientVpcId;

  public static final String JSON_PROPERTY_CLIENT_VPC_REGION = "clientVpcRegion";
  private String clientVpcRegion;

  public static final String JSON_PROPERTY_CLIENT_ACCOUNT_ID = "clientAccountId";
  private String clientAccountId;


  public TessellAwsClientInfoServiceConsumerDTO clientVpcId(String clientVpcId) {
    
    this.clientVpcId = clientVpcId;
    return this;
  }

   /**
   * Id of the client VPC
   * @return clientVpcId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientVpcId() {
    return clientVpcId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientVpcId(String clientVpcId) {
    this.clientVpcId = clientVpcId;
  }


  public TessellAwsClientInfoServiceConsumerDTO clientVpcRegion(String clientVpcRegion) {
    
    this.clientVpcRegion = clientVpcRegion;
    return this;
  }

   /**
   * Region of the client VPC
   * @return clientVpcRegion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region of the client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientVpcRegion() {
    return clientVpcRegion;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_VPC_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientVpcRegion(String clientVpcRegion) {
    this.clientVpcRegion = clientVpcRegion;
  }


  public TessellAwsClientInfoServiceConsumerDTO clientAccountId(String clientAccountId) {
    
    this.clientAccountId = clientAccountId;
    return this;
  }

   /**
   * Account Id of the client VPC
   * @return clientAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Account Id of the client VPC")
  @JsonProperty(JSON_PROPERTY_CLIENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientAccountId() {
    return clientAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientAccountId(String clientAccountId) {
    this.clientAccountId = clientAccountId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAwsClientInfoServiceConsumerDTO awsClientInfoServiceConsumer = (TessellAwsClientInfoServiceConsumerDTO) o;
    return Objects.equals(this.clientVpcId, awsClientInfoServiceConsumer.clientVpcId) &&
        Objects.equals(this.clientVpcRegion, awsClientInfoServiceConsumer.clientVpcRegion) &&
        Objects.equals(this.clientAccountId, awsClientInfoServiceConsumer.clientAccountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientVpcId, clientVpcRegion, clientAccountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAwsClientInfoServiceConsumerDTO {\n");
    sb.append("    clientVpcId: ").append(toIndentedString(clientVpcId)).append("\n");
    sb.append("    clientVpcRegion: ").append(toIndentedString(clientVpcRegion)).append("\n");
    sb.append("    clientAccountId: ").append(toIndentedString(clientAccountId)).append("\n");
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

