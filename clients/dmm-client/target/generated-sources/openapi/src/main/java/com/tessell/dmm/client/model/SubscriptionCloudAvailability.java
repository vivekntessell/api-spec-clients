/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.dmm.client.model.CloudRegionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SubscriptionCloudAvailability
 */
@JsonPropertyOrder({
  SubscriptionCloudAvailability.JSON_PROPERTY_SUBSCRIPTION,
  SubscriptionCloudAvailability.JSON_PROPERTY_CLOUD_AVAILABILITY
})
@JsonTypeName("SubscriptionCloudAvailability")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionCloudAvailability {
  public static final String JSON_PROPERTY_SUBSCRIPTION = "subscription";
  private String subscription;

  public static final String JSON_PROPERTY_CLOUD_AVAILABILITY = "cloudAvailability";
  private List<CloudRegionInfo> cloudAvailability = null;


  public SubscriptionCloudAvailability subscription(String subscription) {
    
    this.subscription = subscription;
    return this;
  }

   /**
   * The subscription name
   * @return subscription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The subscription name")
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


  public SubscriptionCloudAvailability cloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public SubscriptionCloudAvailability addCloudAvailabilityItem(CloudRegionInfo cloudAvailabilityItem) {
    if (this.cloudAvailability == null) {
      this.cloudAvailability = new ArrayList<>();
    }
    this.cloudAvailability.add(cloudAvailabilityItem);
    return this;
  }

   /**
   * Get cloudAvailability
   * @return cloudAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CloudRegionInfo> getCloudAvailability() {
    return cloudAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    this.cloudAvailability = cloudAvailability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionCloudAvailability subscriptionCloudAvailability = (SubscriptionCloudAvailability) o;
    return Objects.equals(this.subscription, subscriptionCloudAvailability.subscription) &&
        Objects.equals(this.cloudAvailability, subscriptionCloudAvailability.cloudAvailability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscription, cloudAvailability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionCloudAvailability {\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
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

