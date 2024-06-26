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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * This is a definition for Tessell internal create app family payload object
 */
@ApiModel(description = "This is a definition for Tessell internal create app family payload object")
@JsonPropertyOrder({
  TessellAppFeatureCreatePayloadDTO.JSON_PROPERTY_DESCRIPTION,
  TessellAppFeatureCreatePayloadDTO.JSON_PROPERTY_NAME,
  TessellAppFeatureCreatePayloadDTO.JSON_PROPERTY_DISPLAY_NAME
})
@JsonTypeName("AppFeatureCreatePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppFeatureCreatePayloadDTO {
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName;


  public TessellAppFeatureCreatePayloadDTO description(String description) {
    
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


  public TessellAppFeatureCreatePayloadDTO name(String name) {
    
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


  public TessellAppFeatureCreatePayloadDTO displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the app family
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Display name of the app family")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppFeatureCreatePayloadDTO appFeatureCreatePayload = (TessellAppFeatureCreatePayloadDTO) o;
    return Objects.equals(this.description, appFeatureCreatePayload.description) &&
        Objects.equals(this.name, appFeatureCreatePayload.name) &&
        Objects.equals(this.displayName, appFeatureCreatePayload.displayName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name, displayName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppFeatureCreatePayloadDTO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
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

