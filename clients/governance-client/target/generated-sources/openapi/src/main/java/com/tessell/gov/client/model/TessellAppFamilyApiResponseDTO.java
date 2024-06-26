/*
 * REST API Documentation
 * REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gov.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gov.client.model.TessellApiMetadataDTO;
import com.tessell.gov.client.model.TessellAppFamilyDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellAppFamilyApiResponseDTO
 */
@JsonPropertyOrder({
  TessellAppFamilyApiResponseDTO.JSON_PROPERTY_METADATA,
  TessellAppFamilyApiResponseDTO.JSON_PROPERTY_RESPONSE
})
@JsonTypeName("AppFamilyApiResponse")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppFamilyApiResponseDTO {
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private TessellApiMetadataDTO metadata;

  public static final String JSON_PROPERTY_RESPONSE = "response";
  private List<TessellAppFamilyDTO> response = null;


  public TessellAppFamilyApiResponseDTO metadata(TessellApiMetadataDTO metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellApiMetadataDTO getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(TessellApiMetadataDTO metadata) {
    this.metadata = metadata;
  }


  public TessellAppFamilyApiResponseDTO response(List<TessellAppFamilyDTO> response) {
    
    this.response = response;
    return this;
  }

  public TessellAppFamilyApiResponseDTO addResponseItem(TessellAppFamilyDTO responseItem) {
    if (this.response == null) {
      this.response = new ArrayList<>();
    }
    this.response.add(responseItem);
    return this;
  }

   /**
   * Get response
   * @return response
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellAppFamilyDTO> getResponse() {
    return response;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResponse(List<TessellAppFamilyDTO> response) {
    this.response = response;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppFamilyApiResponseDTO appFamilyApiResponse = (TessellAppFamilyApiResponseDTO) o;
    return Objects.equals(this.metadata, appFamilyApiResponse.metadata) &&
        Objects.equals(this.response, appFamilyApiResponse.response);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, response);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppFamilyApiResponseDTO {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    response: ").append(toIndentedString(response)).append("\n");
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

