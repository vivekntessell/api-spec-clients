/*
 * Event Service API
 * Event Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: samir.das@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.event.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Common API exception details
 */
@ApiModel(description = "Common API exception details")
@JsonPropertyOrder({
  TessellApiErrorDetailsDTO.JSON_PROPERTY_RESOLUTION
})
@JsonTypeName("ApiErrorDetails")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:47.078643+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellApiErrorDetailsDTO {
  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private String resolution;


  public TessellApiErrorDetailsDTO resolution(String resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * Resolution detail for API exception
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resolution detail for API exception")
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResolution() {
    return resolution;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolution(String resolution) {
    this.resolution = resolution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellApiErrorDetailsDTO apiErrorDetails = (TessellApiErrorDetailsDTO) o;
    return Objects.equals(this.resolution, apiErrorDetails.resolution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resolution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellApiErrorDetailsDTO {\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
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

