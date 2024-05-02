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


package com.tessell.integrations.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.integrations.client.model.TessellIntegrationTypeMetadataSupportedEngineTypesDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Metadata for integration type
 */
@ApiModel(description = "Metadata for integration type")
@JsonPropertyOrder({
  TessellIntegrationTypeMetadataDTO.JSON_PROPERTY_SUPPORTED_ENGINE_TYPES
})
@JsonTypeName("IntegrationTypeMetadata")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:57.635527+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellIntegrationTypeMetadataDTO {
  public static final String JSON_PROPERTY_SUPPORTED_ENGINE_TYPES = "supportedEngineTypes";
  private List<TessellIntegrationTypeMetadataSupportedEngineTypesDTO> supportedEngineTypes = null;


  public TessellIntegrationTypeMetadataDTO supportedEngineTypes(List<TessellIntegrationTypeMetadataSupportedEngineTypesDTO> supportedEngineTypes) {
    
    this.supportedEngineTypes = supportedEngineTypes;
    return this;
  }

  public TessellIntegrationTypeMetadataDTO addSupportedEngineTypesItem(TessellIntegrationTypeMetadataSupportedEngineTypesDTO supportedEngineTypesItem) {
    if (this.supportedEngineTypes == null) {
      this.supportedEngineTypes = new ArrayList<>();
    }
    this.supportedEngineTypes.add(supportedEngineTypesItem);
    return this;
  }

   /**
   * Get supportedEngineTypes
   * @return supportedEngineTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_ENGINE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellIntegrationTypeMetadataSupportedEngineTypesDTO> getSupportedEngineTypes() {
    return supportedEngineTypes;
  }


  @JsonProperty(JSON_PROPERTY_SUPPORTED_ENGINE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSupportedEngineTypes(List<TessellIntegrationTypeMetadataSupportedEngineTypesDTO> supportedEngineTypes) {
    this.supportedEngineTypes = supportedEngineTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellIntegrationTypeMetadataDTO integrationTypeMetadata = (TessellIntegrationTypeMetadataDTO) o;
    return Objects.equals(this.supportedEngineTypes, integrationTypeMetadata.supportedEngineTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedEngineTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellIntegrationTypeMetadataDTO {\n");
    sb.append("    supportedEngineTypes: ").append(toIndentedString(supportedEngineTypes)).append("\n");
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

