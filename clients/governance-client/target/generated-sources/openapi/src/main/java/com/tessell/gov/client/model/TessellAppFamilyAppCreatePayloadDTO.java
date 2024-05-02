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
import com.tessell.gov.client.model.TessellAppFeatureCreatePayloadDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell internal create app family payload object
 */
@ApiModel(description = "This is a definition for Tessell internal create app family payload object")
@JsonPropertyOrder({
  TessellAppFamilyAppCreatePayloadDTO.JSON_PROPERTY_DESCRIPTION,
  TessellAppFamilyAppCreatePayloadDTO.JSON_PROPERTY_NAME,
  TessellAppFamilyAppCreatePayloadDTO.JSON_PROPERTY_FEATURES
})
@JsonTypeName("AppFamilyAppCreatePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppFamilyAppCreatePayloadDTO {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_FEATURES = "features";
  private List<TessellAppFeatureCreatePayloadDTO> features = null;


  public TessellAppFamilyAppCreatePayloadDTO description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of the app family
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of the app family")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TessellAppFamilyAppCreatePayloadDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the app family
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the app family")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public TessellAppFamilyAppCreatePayloadDTO features(List<TessellAppFeatureCreatePayloadDTO> features) {
    
    this.features = features;
    return this;
  }

  public TessellAppFamilyAppCreatePayloadDTO addFeaturesItem(TessellAppFeatureCreatePayloadDTO featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

   /**
   * List of features associated with the app.
   * @return features
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of features associated with the app.")
  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellAppFeatureCreatePayloadDTO> getFeatures() {
    return features;
  }


  @JsonProperty(JSON_PROPERTY_FEATURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFeatures(List<TessellAppFeatureCreatePayloadDTO> features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppFamilyAppCreatePayloadDTO appFamilyAppCreatePayload = (TessellAppFamilyAppCreatePayloadDTO) o;
    return Objects.equals(this.description, appFamilyAppCreatePayload.description) &&
        Objects.equals(this.name, appFamilyAppCreatePayload.name) &&
        Objects.equals(this.features, appFamilyAppCreatePayload.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppFamilyAppCreatePayloadDTO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

