/*
 * Tessell Database System REST Web Services' API Documentation
 * Tessell Database System REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.database.system.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.database.system.client.model.AwsInfraConfig;
import com.tessell.database.system.client.model.ComputeResourceDbserverInfo;
import com.tessell.database.system.client.model.ComputeResourceMetadataConnectivityInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Compute Resource&#39;s metadata information
 */
@ApiModel(description = "Compute Resource's metadata information")
@JsonPropertyOrder({
  ComputeResourceMetadata.JSON_PROPERTY_SUBSCRIPTION,
  ComputeResourceMetadata.JSON_PROPERTY_COMPUTE_TYPE,
  ComputeResourceMetadata.JSON_PROPERTY_VPC,
  ComputeResourceMetadata.JSON_PROPERTY_ENCRYPTION_KEY_ID,
  ComputeResourceMetadata.JSON_PROPERTY_ENCRYPTION_KEY,
  ComputeResourceMetadata.JSON_PROPERTY_CONNECTIVITY_INFO,
  ComputeResourceMetadata.JSON_PROPERTY_DBSERVER_INFO,
  ComputeResourceMetadata.JSON_PROPERTY_AWS_INFRA_CONFIG,
  ComputeResourceMetadata.JSON_PROPERTY_DATA
})
@JsonTypeName("ComputeResourceMetadata")

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@lombok.experimental.SuperBuilder
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T22:16:40.788615+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class ComputeResourceMetadata {
  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private String subscription;

  public static final String JSON_PROPERTY_COMPUTE_TYPE = "computeType";
  private String computeType;

  public static final String JSON_PROPERTY_VPC = "vpc";
  private String vpc;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY_ID = "encryptionKeyId";
  private UUID encryptionKeyId;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY = "encryptionKey";
  private String encryptionKey;

  public static final String JSON_PROPERTY_CONNECTIVITY_INFO = "connectivityInfo";
  private ComputeResourceMetadataConnectivityInfo connectivityInfo;

  public static final String JSON_PROPERTY_DBSERVER_INFO = "dbserverInfo";
  private ComputeResourceDbserverInfo dbserverInfo;

  public static final String JSON_PROPERTY_AWS_INFRA_CONFIG = "awsInfraConfig";
  private AwsInfraConfig awsInfraConfig;

  public static final String JSON_PROPERTY_DATA = "data";
  private Object data;


  public ComputeResourceMetadata subscription(String subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscription() {
    return subscription;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscription(String subscription) {
    this.subscription = subscription;
  }


  public ComputeResourceMetadata computeType(String computeType) {
    
    this.computeType = computeType;
    return this;
  }

   /**
   * Get computeType
   * @return computeType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getComputeType() {
    return computeType;
  }


  @JsonProperty(JSON_PROPERTY_COMPUTE_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setComputeType(String computeType) {
    this.computeType = computeType;
  }


  public ComputeResourceMetadata vpc(String vpc) {
    
    this.vpc = vpc;
    return this;
  }

   /**
   * Get vpc
   * @return vpc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVpc() {
    return vpc;
  }


  @JsonProperty(JSON_PROPERTY_VPC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVpc(String vpc) {
    this.vpc = vpc;
  }


  public ComputeResourceMetadata encryptionKeyId(UUID encryptionKeyId) {
    
    this.encryptionKeyId = encryptionKeyId;
    return this;
  }

   /**
   * Get encryptionKeyId
   * @return encryptionKeyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getEncryptionKeyId() {
    return encryptionKeyId;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKeyId(UUID encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }


  public ComputeResourceMetadata encryptionKey(String encryptionKey) {
    
    this.encryptionKey = encryptionKey;
    return this;
  }

   /**
   * Get encryptionKey
   * @return encryptionKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEncryptionKey() {
    return encryptionKey;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKey(String encryptionKey) {
    this.encryptionKey = encryptionKey;
  }


  public ComputeResourceMetadata connectivityInfo(ComputeResourceMetadataConnectivityInfo connectivityInfo) {
    
    this.connectivityInfo = connectivityInfo;
    return this;
  }

   /**
   * Get connectivityInfo
   * @return connectivityInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONNECTIVITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputeResourceMetadataConnectivityInfo getConnectivityInfo() {
    return connectivityInfo;
  }


  @JsonProperty(JSON_PROPERTY_CONNECTIVITY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setConnectivityInfo(ComputeResourceMetadataConnectivityInfo connectivityInfo) {
    this.connectivityInfo = connectivityInfo;
  }


  public ComputeResourceMetadata dbserverInfo(ComputeResourceDbserverInfo dbserverInfo) {
    
    this.dbserverInfo = dbserverInfo;
    return this;
  }

   /**
   * Get dbserverInfo
   * @return dbserverInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DBSERVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ComputeResourceDbserverInfo getDbserverInfo() {
    return dbserverInfo;
  }


  @JsonProperty(JSON_PROPERTY_DBSERVER_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDbserverInfo(ComputeResourceDbserverInfo dbserverInfo) {
    this.dbserverInfo = dbserverInfo;
  }


  public ComputeResourceMetadata awsInfraConfig(AwsInfraConfig awsInfraConfig) {
    
    this.awsInfraConfig = awsInfraConfig;
    return this;
  }

   /**
   * Get awsInfraConfig
   * @return awsInfraConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AWS_INFRA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AwsInfraConfig getAwsInfraConfig() {
    return awsInfraConfig;
  }


  @JsonProperty(JSON_PROPERTY_AWS_INFRA_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAwsInfraConfig(AwsInfraConfig awsInfraConfig) {
    this.awsInfraConfig = awsInfraConfig;
  }


  public ComputeResourceMetadata data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComputeResourceMetadata computeResourceMetadata = (ComputeResourceMetadata) o;
    return Objects.equals(this.subscription, computeResourceMetadata.subscription) &&
        Objects.equals(this.computeType, computeResourceMetadata.computeType) &&
        Objects.equals(this.vpc, computeResourceMetadata.vpc) &&
        Objects.equals(this.encryptionKeyId, computeResourceMetadata.encryptionKeyId) &&
        Objects.equals(this.encryptionKey, computeResourceMetadata.encryptionKey) &&
        Objects.equals(this.connectivityInfo, computeResourceMetadata.connectivityInfo) &&
        Objects.equals(this.dbserverInfo, computeResourceMetadata.dbserverInfo) &&
        Objects.equals(this.awsInfraConfig, computeResourceMetadata.awsInfraConfig) &&
        Objects.equals(this.data, computeResourceMetadata.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, computeType, vpc, encryptionKeyId, encryptionKey, connectivityInfo, dbserverInfo, awsInfraConfig, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComputeResourceMetadata {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    computeType: ").append(toIndentedString(computeType)).append("\n");
    sb.append("    vpc: ").append(toIndentedString(vpc)).append("\n");
    sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
    sb.append("    encryptionKey: ").append(toIndentedString(encryptionKey)).append("\n");
    sb.append("    connectivityInfo: ").append(toIndentedString(connectivityInfo)).append("\n");
    sb.append("    dbserverInfo: ").append(toIndentedString(dbserverInfo)).append("\n");
    sb.append("    awsInfraConfig: ").append(toIndentedString(awsInfraConfig)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

