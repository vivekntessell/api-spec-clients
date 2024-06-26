/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellCloudTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell encryption key cloud availability object
 */
@ApiModel(description = "This is a definition for Tessell encryption key cloud availability object")
@JsonPropertyOrder({
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_CLOUD,
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_REGION,
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_SUBSCRIPTION_NAME,
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_EXTERNAL_ID,
  TessellRegisterEncryptionCloudAvailabilityDTO.JSON_PROPERTY_KEY_VAULT_NAME
})
@JsonTypeName("RegisterEncryptionCloudAvailability")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellRegisterEncryptionCloudAvailabilityDTO {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private TessellCloudTypeDTO cloud;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_SUBSCRIPTION_NAME = "subscriptionName";
  private String subscriptionName;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_KEY_VAULT_NAME = "keyVaultName";
  private String keyVaultName;


  public TessellRegisterEncryptionCloudAvailabilityDTO cloud(TessellCloudTypeDTO cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellCloudTypeDTO getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloud(TessellCloudTypeDTO cloud) {
    this.cloud = cloud;
  }


  public TessellRegisterEncryptionCloudAvailabilityDTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Region")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public TessellRegisterEncryptionCloudAvailabilityDTO subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Subscription ID
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subscription ID")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getSubscriptionId() {
    return subscriptionId;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionId(UUID subscriptionId) {
    this.subscriptionId = subscriptionId;
  }


  public TessellRegisterEncryptionCloudAvailabilityDTO subscriptionName(String subscriptionName) {
    
    this.subscriptionName = subscriptionName;
    return this;
  }

   /**
   * Name of the subscription
   * @return subscriptionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the subscription")
  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubscriptionName() {
    return subscriptionName;
  }


  @JsonProperty(JSON_PROPERTY_SUBSCRIPTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubscriptionName(String subscriptionName) {
    this.subscriptionName = subscriptionName;
  }


  public TessellRegisterEncryptionCloudAvailabilityDTO externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Id of the disk encryption set
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "External Id of the disk encryption set")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public TessellRegisterEncryptionCloudAvailabilityDTO keyVaultName(String keyVaultName) {
    
    this.keyVaultName = keyVaultName;
    return this;
  }

   /**
   * Name of the key vault where key is stored
   * @return keyVaultName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the key vault where key is stored")
  @JsonProperty(JSON_PROPERTY_KEY_VAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getKeyVaultName() {
    return keyVaultName;
  }


  @JsonProperty(JSON_PROPERTY_KEY_VAULT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setKeyVaultName(String keyVaultName) {
    this.keyVaultName = keyVaultName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellRegisterEncryptionCloudAvailabilityDTO registerEncryptionCloudAvailability = (TessellRegisterEncryptionCloudAvailabilityDTO) o;
    return Objects.equals(this.cloud, registerEncryptionCloudAvailability.cloud) &&
        Objects.equals(this.region, registerEncryptionCloudAvailability.region) &&
        Objects.equals(this.subscriptionId, registerEncryptionCloudAvailability.subscriptionId) &&
        Objects.equals(this.subscriptionName, registerEncryptionCloudAvailability.subscriptionName) &&
        Objects.equals(this.externalId, registerEncryptionCloudAvailability.externalId) &&
        Objects.equals(this.keyVaultName, registerEncryptionCloudAvailability.keyVaultName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, region, subscriptionId, subscriptionName, externalId, keyVaultName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellRegisterEncryptionCloudAvailabilityDTO {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    keyVaultName: ").append(toIndentedString(keyVaultName)).append("\n");
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

