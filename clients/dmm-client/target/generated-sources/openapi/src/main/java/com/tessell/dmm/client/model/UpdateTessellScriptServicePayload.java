/*
 * Tessell Availability Machine REST Web Services' API Documentation
 * Tessell Availability Machine REST Web Services' Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: sagar.sontakke@tessell.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.dmm.client.model;

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
 * Tessell Update Script Service payload
 */
@ApiModel(description = "Tessell Update Script Service payload")
@JsonPropertyOrder({
  UpdateTessellScriptServicePayload.JSON_PROPERTY_NAME,
  UpdateTessellScriptServicePayload.JSON_PROPERTY_DESCRIPTION,
  UpdateTessellScriptServicePayload.JSON_PROPERTY_ACTIVE_VERSION
})
@JsonTypeName("UpdateTessellScriptServicePayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateTessellScriptServicePayload {
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ACTIVE_VERSION = "activeVersion";
  private String activeVersion;


  public UpdateTessellScriptServicePayload name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the script.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the script.")
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


  public UpdateTessellScriptServicePayload description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for the script.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for the script.")
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


  public UpdateTessellScriptServicePayload activeVersion(String activeVersion) {
    
    this.activeVersion = activeVersion;
    return this;
  }

   /**
   * version of the script
   * @return activeVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "version of the script")
  @JsonProperty(JSON_PROPERTY_ACTIVE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getActiveVersion() {
    return activeVersion;
  }


  @JsonProperty(JSON_PROPERTY_ACTIVE_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActiveVersion(String activeVersion) {
    this.activeVersion = activeVersion;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTessellScriptServicePayload updateTessellScriptServicePayload = (UpdateTessellScriptServicePayload) o;
    return Objects.equals(this.name, updateTessellScriptServicePayload.name) &&
        Objects.equals(this.description, updateTessellScriptServicePayload.description) &&
        Objects.equals(this.activeVersion, updateTessellScriptServicePayload.activeVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, activeVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTessellScriptServicePayload {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    activeVersion: ").append(toIndentedString(activeVersion)).append("\n");
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

