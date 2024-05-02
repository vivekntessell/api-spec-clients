/*
 * Tessell Tenant Onboarding Service API
 * Tenant Onboarding API
 *
 * The version of the OpenAPI document: v1beta
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.tenant.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.tenant.client.model.SubscriptionAwsConfig1;
import com.tessell.tenant.client.model.SubscriptionAwsOnboardingConfig;
import com.tessell.tenant.client.model.SubscriptionCloudConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SubscriptionAwsConfig
 */
@JsonPropertyOrder({
  SubscriptionAwsConfig.JSON_PROPERTY_REGIONS,
  SubscriptionAwsConfig.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  SubscriptionAwsConfig.JSON_PROPERTY_ONBOARDING_INFO
})
@JsonTypeName("SubscriptionAwsConfig")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionAwsConfig {
  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<String> regions = new ArrayList<>();

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_ONBOARDING_INFO = "onboardingInfo";
  private SubscriptionAwsOnboardingConfig onboardingInfo;


  public SubscriptionAwsConfig regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public SubscriptionAwsConfig addRegionsItem(String regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  public SubscriptionAwsConfig cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public SubscriptionAwsConfig onboardingInfo(SubscriptionAwsOnboardingConfig onboardingInfo) {
    
    this.onboardingInfo = onboardingInfo;
    return this;
  }

   /**
   * Get onboardingInfo
   * @return onboardingInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ONBOARDING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SubscriptionAwsOnboardingConfig getOnboardingInfo() {
    return onboardingInfo;
  }


  @JsonProperty(JSON_PROPERTY_ONBOARDING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnboardingInfo(SubscriptionAwsOnboardingConfig onboardingInfo) {
    this.onboardingInfo = onboardingInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAwsConfig subscriptionAwsConfig = (SubscriptionAwsConfig) o;
    return Objects.equals(this.regions, subscriptionAwsConfig.regions) &&
        Objects.equals(this.cloudAccountId, subscriptionAwsConfig.cloudAccountId) &&
        Objects.equals(this.onboardingInfo, subscriptionAwsConfig.onboardingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, cloudAccountId, onboardingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAwsConfig {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    onboardingInfo: ").append(toIndentedString(onboardingInfo)).append("\n");
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
