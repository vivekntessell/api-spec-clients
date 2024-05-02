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
import com.tessell.security.client.model.TessellCloudAvailabilityDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Payload for making encryption Key available in regions
 */
@ApiModel(description = "Payload for making encryption Key available in regions")
@JsonPropertyOrder({
  TessellEncryptionKeyRegionAvailabilityPayloadDTO.JSON_PROPERTY_AVAILABILITY
})
@JsonTypeName("EncryptionKeyRegionAvailabilityPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellEncryptionKeyRegionAvailabilityPayloadDTO {
  public static final String JSON_PROPERTY_AVAILABILITY = "availability";
  private List<TessellCloudAvailabilityDTO> availability = null;


  public TessellEncryptionKeyRegionAvailabilityPayloadDTO availability(List<TessellCloudAvailabilityDTO> availability) {
    
    this.availability = availability;
    return this;
  }

  public TessellEncryptionKeyRegionAvailabilityPayloadDTO addAvailabilityItem(TessellCloudAvailabilityDTO availabilityItem) {
    if (this.availability == null) {
      this.availability = new ArrayList<>();
    }
    this.availability.add(availabilityItem);
    return this;
  }

   /**
   * Get availability
   * @return availability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellCloudAvailabilityDTO> getAvailability() {
    return availability;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailability(List<TessellCloudAvailabilityDTO> availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellEncryptionKeyRegionAvailabilityPayloadDTO encryptionKeyRegionAvailabilityPayload = (TessellEncryptionKeyRegionAvailabilityPayloadDTO) o;
    return Objects.equals(this.availability, encryptionKeyRegionAvailabilityPayload.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellEncryptionKeyRegionAvailabilityPayloadDTO {\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

