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
import com.tessell.tenant.client.model.AssociatedCloudInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SubscriptionInfraInfo
 */
@JsonPropertyOrder({
  SubscriptionInfraInfo.JSON_PROPERTY_ASSOCIATED_CLOUDS,
  SubscriptionInfraInfo.JSON_PROPERTY_INFO,
  SubscriptionInfraInfo.JSON_PROPERTY_ONBOARDING_INFO
})
@JsonTypeName("subscriptionInfraInfo")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionInfraInfo {
  public static final String JSON_PROPERTY_ASSOCIATED_CLOUDS = "associatedClouds";
  private Map<String, List<AssociatedCloudInfo>> associatedClouds = null;

  public static final String JSON_PROPERTY_INFO = "info";
  private Object info;

  public static final String JSON_PROPERTY_ONBOARDING_INFO = "onboardingInfo";
  private Object onboardingInfo;


  public SubscriptionInfraInfo associatedClouds(Map<String, List<AssociatedCloudInfo>> associatedClouds) {
    
    this.associatedClouds = associatedClouds;
    return this;
  }

  public SubscriptionInfraInfo putAssociatedCloudsItem(String key, List<AssociatedCloudInfo> associatedCloudsItem) {
    if (this.associatedClouds == null) {
      this.associatedClouds = new HashMap<>();
    }
    this.associatedClouds.put(key, associatedCloudsItem);
    return this;
  }

   /**
   * Get associatedClouds
   * @return associatedClouds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ASSOCIATED_CLOUDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, List<AssociatedCloudInfo>> getAssociatedClouds() {
    return associatedClouds;
  }


  @JsonProperty(JSON_PROPERTY_ASSOCIATED_CLOUDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAssociatedClouds(Map<String, List<AssociatedCloudInfo>> associatedClouds) {
    this.associatedClouds = associatedClouds;
  }


  public SubscriptionInfraInfo info(Object info) {
    
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(Object info) {
    this.info = info;
  }


  public SubscriptionInfraInfo onboardingInfo(Object onboardingInfo) {
    
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

  public Object getOnboardingInfo() {
    return onboardingInfo;
  }


  @JsonProperty(JSON_PROPERTY_ONBOARDING_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnboardingInfo(Object onboardingInfo) {
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
    SubscriptionInfraInfo subscriptionInfraInfo = (SubscriptionInfraInfo) o;
    return Objects.equals(this.associatedClouds, subscriptionInfraInfo.associatedClouds) &&
        Objects.equals(this.info, subscriptionInfraInfo.info) &&
        Objects.equals(this.onboardingInfo, subscriptionInfraInfo.onboardingInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedClouds, info, onboardingInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionInfraInfo {\n");
    sb.append("    associatedClouds: ").append(toIndentedString(associatedClouds)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
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
