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
import com.tessell.security.client.model.TessellEncryptionKeyEntityDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellEncryptionKeyAvailabilityEntityIdDTO
 */
@JsonPropertyOrder({
  TessellEncryptionKeyAvailabilityEntityIdDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellEncryptionKeyAvailabilityEntityIdDTO.JSON_PROPERTY_ENCRYPTION_KEY_ID,
  TessellEncryptionKeyAvailabilityEntityIdDTO.JSON_PROPERTY_REGION,
  TessellEncryptionKeyAvailabilityEntityIdDTO.JSON_PROPERTY_CLOUD
})
@JsonTypeName("EncryptionKeyAvailabilityEntity_id")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyAvailabilityEntityIdDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_ENCRYPTION_KEY_ID = "encryptionKeyId";
  private TessellEncryptionKeyEntityDTO encryptionKeyId;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private TessellCloudTypeDTO cloud;


  public TessellEncryptionKeyAvailabilityEntityIdDTO subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * subscription id of the encryption key
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "subscription id of the encryption key")
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


  public TessellEncryptionKeyAvailabilityEntityIdDTO encryptionKeyId(TessellEncryptionKeyEntityDTO encryptionKeyId) {
    
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

  public TessellEncryptionKeyEntityDTO getEncryptionKeyId() {
    return encryptionKeyId;
  }


  @JsonProperty(JSON_PROPERTY_ENCRYPTION_KEY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEncryptionKeyId(TessellEncryptionKeyEntityDTO encryptionKeyId) {
    this.encryptionKeyId = encryptionKeyId;
  }


  public TessellEncryptionKeyAvailabilityEntityIdDTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * availability region of the encryption key
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "availability region of the encryption key")
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


  public TessellEncryptionKeyAvailabilityEntityIdDTO cloud(TessellCloudTypeDTO cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * cloud of the encryption key availability
   * @return cloud
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "cloud of the encryption key availability")
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyAvailabilityEntityIdDTO encryptionKeyAvailabilityEntityId = (TessellEncryptionKeyAvailabilityEntityIdDTO) o;
    return Objects.equals(this.subscriptionId, encryptionKeyAvailabilityEntityId.subscriptionId) &&
        Objects.equals(this.encryptionKeyId, encryptionKeyAvailabilityEntityId.encryptionKeyId) &&
        Objects.equals(this.region, encryptionKeyAvailabilityEntityId.region) &&
        Objects.equals(this.cloud, encryptionKeyAvailabilityEntityId.cloud);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, encryptionKeyId, region, cloud);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyAvailabilityEntityIdDTO {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    encryptionKeyId: ").append(toIndentedString(encryptionKeyId)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
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

