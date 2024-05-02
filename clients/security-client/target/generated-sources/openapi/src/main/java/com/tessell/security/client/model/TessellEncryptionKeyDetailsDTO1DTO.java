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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellEncryptionKeyDetailsDTO1DTO
 */
@JsonPropertyOrder({
  TessellEncryptionKeyDetailsDTO1DTO.JSON_PROPERTY_ID,
  TessellEncryptionKeyDetailsDTO1DTO.JSON_PROPERTY_REGION,
  TessellEncryptionKeyDetailsDTO1DTO.JSON_PROPERTY_SUBSCRIPTION_NAME
})
@JsonTypeName("EncryptionKeyDetailsDTO_1")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyDetailsDTO1DTO {
  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SUBSCRIPTION_NAME = "subscriptionName";
  private String subscriptionName;


  public TessellEncryptionKeyDetailsDTO1DTO id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(UUID id) {
    this.id = id;
  }


  public TessellEncryptionKeyDetailsDTO1DTO region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public TessellEncryptionKeyDetailsDTO1DTO subscriptionName(String subscriptionName) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyDetailsDTO1DTO encryptionKeyDetailsDTO1 = (TessellEncryptionKeyDetailsDTO1DTO) o;
    return Objects.equals(this.id, encryptionKeyDetailsDTO1.id) &&
        Objects.equals(this.region, encryptionKeyDetailsDTO1.region) &&
        Objects.equals(this.subscriptionName, encryptionKeyDetailsDTO1.subscriptionName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, region, subscriptionName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyDetailsDTO1DTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    subscriptionName: ").append(toIndentedString(subscriptionName)).append("\n");
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

