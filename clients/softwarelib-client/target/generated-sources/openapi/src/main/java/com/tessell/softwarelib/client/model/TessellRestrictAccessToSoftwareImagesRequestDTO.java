/*
 * Software Library Governance Service API Documentation
 * Software Library Governance Service API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.softwarelib.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellRestrictAccessToSoftwareImagesRequestDTO
 */
@JsonPropertyOrder({
  TessellRestrictAccessToSoftwareImagesRequestDTO.JSON_PROPERTY_NAMES,
  TessellRestrictAccessToSoftwareImagesRequestDTO.JSON_PROPERTY_PERSONAS
})
@JsonTypeName("restrictAccessToSoftwareImagesRequest")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:13.690299+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellRestrictAccessToSoftwareImagesRequestDTO {
  public static final String JSON_PROPERTY_NAMES = "names";
  private List<String> names = new ArrayList<>();

  public static final String JSON_PROPERTY_PERSONAS = "personas";
  private List<String> personas = new ArrayList<>();


  public TessellRestrictAccessToSoftwareImagesRequestDTO names(List<String> names) {
    
    this.names = names;
    return this;
  }

  public TessellRestrictAccessToSoftwareImagesRequestDTO addNamesItem(String namesItem) {
    this.names.add(namesItem);
    return this;
  }

   /**
   * Get names
   * @return names
  **/
  @ApiModelProperty(example = "[\"MySQL 5.6\",\"MySQL 8.0\"]", required = true, value = "")
  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getNames() {
    return names;
  }


  @JsonProperty(JSON_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setNames(List<String> names) {
    this.names = names;
  }


  public TessellRestrictAccessToSoftwareImagesRequestDTO personas(List<String> personas) {
    
    this.personas = personas;
    return this;
  }

  public TessellRestrictAccessToSoftwareImagesRequestDTO addPersonasItem(String personasItem) {
    this.personas.add(personasItem);
    return this;
  }

   /**
   * Get personas
   * @return personas
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PERSONAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPersonas() {
    return personas;
  }


  @JsonProperty(JSON_PROPERTY_PERSONAS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPersonas(List<String> personas) {
    this.personas = personas;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellRestrictAccessToSoftwareImagesRequestDTO restrictAccessToSoftwareImagesRequest = (TessellRestrictAccessToSoftwareImagesRequestDTO) o;
    return Objects.equals(this.names, restrictAccessToSoftwareImagesRequest.names) &&
        Objects.equals(this.personas, restrictAccessToSoftwareImagesRequest.personas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(names, personas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellRestrictAccessToSoftwareImagesRequestDTO {\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    personas: ").append(toIndentedString(personas)).append("\n");
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

