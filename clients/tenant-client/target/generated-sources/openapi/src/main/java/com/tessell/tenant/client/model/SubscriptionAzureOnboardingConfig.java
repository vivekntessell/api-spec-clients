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
import com.tessell.tenant.client.model.AzureByoaExecutionOutput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Azure onboarding configuration for the subscription
 */
@ApiModel(description = "Azure onboarding configuration for the subscription")
@JsonPropertyOrder({
  SubscriptionAzureOnboardingConfig.JSON_PROPERTY_ONBOARDING_TYPE,
  SubscriptionAzureOnboardingConfig.JSON_PROPERTY_EXECUTION_OUTPUT
})
@JsonTypeName("SubscriptionAzureOnboardingConfig")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:18.240366+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubscriptionAzureOnboardingConfig {
  /**
   * Gets or Sets onboardingType
   */
  public enum OnboardingTypeEnum {
    ARM_DEPLOYMENT("ARM_DEPLOYMENT"),
    
    SCRIPT("SCRIPT");

    private String value;

    OnboardingTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OnboardingTypeEnum fromValue(String value) {
      for (OnboardingTypeEnum b : OnboardingTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ONBOARDING_TYPE = "onboardingType";
  private OnboardingTypeEnum onboardingType;

  public static final String JSON_PROPERTY_EXECUTION_OUTPUT = "executionOutput";
  private AzureByoaExecutionOutput executionOutput;


  public SubscriptionAzureOnboardingConfig onboardingType(OnboardingTypeEnum onboardingType) {
    
    this.onboardingType = onboardingType;
    return this;
  }

   /**
   * Get onboardingType
   * @return onboardingType
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ONBOARDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OnboardingTypeEnum getOnboardingType() {
    return onboardingType;
  }


  @JsonProperty(JSON_PROPERTY_ONBOARDING_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setOnboardingType(OnboardingTypeEnum onboardingType) {
    this.onboardingType = onboardingType;
  }


  public SubscriptionAzureOnboardingConfig executionOutput(AzureByoaExecutionOutput executionOutput) {
    
    this.executionOutput = executionOutput;
    return this;
  }

   /**
   * Get executionOutput
   * @return executionOutput
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_EXECUTION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AzureByoaExecutionOutput getExecutionOutput() {
    return executionOutput;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTION_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExecutionOutput(AzureByoaExecutionOutput executionOutput) {
    this.executionOutput = executionOutput;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionAzureOnboardingConfig subscriptionAzureOnboardingConfig = (SubscriptionAzureOnboardingConfig) o;
    return Objects.equals(this.onboardingType, subscriptionAzureOnboardingConfig.onboardingType) &&
        Objects.equals(this.executionOutput, subscriptionAzureOnboardingConfig.executionOutput);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onboardingType, executionOutput);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionAzureOnboardingConfig {\n");
    sb.append("    onboardingType: ").append(toIndentedString(onboardingType)).append("\n");
    sb.append("    executionOutput: ").append(toIndentedString(executionOutput)).append("\n");
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

