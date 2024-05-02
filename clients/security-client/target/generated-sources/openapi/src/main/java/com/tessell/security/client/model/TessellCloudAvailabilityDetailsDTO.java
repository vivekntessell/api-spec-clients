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
import com.tessell.security.client.model.TessellCloudRegionsDetailsDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell encryption key cloud availability object
 */
@ApiModel(description = "This is a definition for Tessell encryption key cloud availability object")
@JsonPropertyOrder({
  TessellCloudAvailabilityDetailsDTO.JSON_PROPERTY_SUBSCRIPTION_ID,
  TessellCloudAvailabilityDetailsDTO.JSON_PROPERTY_REGION_AVAILABILITY_DETAILS
})
@JsonTypeName("CloudAvailabilityDetails")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellCloudAvailabilityDetailsDTO {
  public static final String JSON_PROPERTY_SUBSCRIPTION_ID = "subscriptionId";
  private UUID subscriptionId;

  public static final String JSON_PROPERTY_REGION_AVAILABILITY_DETAILS = "regionAvailabilityDetails";
  private List<TessellCloudRegionsDetailsDTO> regionAvailabilityDetails = null;


  public TessellCloudAvailabilityDetailsDTO subscriptionId(UUID subscriptionId) {
    
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * Name of the subscription
   * @return subscriptionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the subscription")
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


  public TessellCloudAvailabilityDetailsDTO regionAvailabilityDetails(List<TessellCloudRegionsDetailsDTO> regionAvailabilityDetails) {
    
    this.regionAvailabilityDetails = regionAvailabilityDetails;
    return this;
  }

  public TessellCloudAvailabilityDetailsDTO addRegionAvailabilityDetailsItem(TessellCloudRegionsDetailsDTO regionAvailabilityDetailsItem) {
    if (this.regionAvailabilityDetails == null) {
      this.regionAvailabilityDetails = new ArrayList<>();
    }
    this.regionAvailabilityDetails.add(regionAvailabilityDetailsItem);
    return this;
  }

   /**
   * Get regionAvailabilityDetails
   * @return regionAvailabilityDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellCloudRegionsDetailsDTO> getRegionAvailabilityDetails() {
    return regionAvailabilityDetails;
  }


  @JsonProperty(JSON_PROPERTY_REGION_AVAILABILITY_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegionAvailabilityDetails(List<TessellCloudRegionsDetailsDTO> regionAvailabilityDetails) {
    this.regionAvailabilityDetails = regionAvailabilityDetails;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellCloudAvailabilityDetailsDTO cloudAvailabilityDetails = (TessellCloudAvailabilityDetailsDTO) o;
    return Objects.equals(this.subscriptionId, cloudAvailabilityDetails.subscriptionId) &&
        Objects.equals(this.regionAvailabilityDetails, cloudAvailabilityDetails.regionAvailabilityDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, regionAvailabilityDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellCloudAvailabilityDetailsDTO {\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    regionAvailabilityDetails: ").append(toIndentedString(regionAvailabilityDetails)).append("\n");
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
