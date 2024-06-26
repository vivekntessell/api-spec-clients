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
import com.tessell.gov.client.model.TessellAppFamilyAppDTO;
import com.tessell.gov.client.model.TessellAppFamilyStatusDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellAppFamily1DTO
 */
@JsonPropertyOrder({
  TessellAppFamily1DTO.JSON_PROPERTY_APPS,
  TessellAppFamily1DTO.JSON_PROPERTY_DESCRIPTION,
  TessellAppFamily1DTO.JSON_PROPERTY_NAME,
  TessellAppFamily1DTO.JSON_PROPERTY_STATUS
})
@JsonTypeName("AppFamily_1")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:52.675868+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellAppFamily1DTO {
  public static final String JSON_PROPERTY_APPS = "apps";
  private List<TessellAppFamilyAppDTO> apps = null;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATUS = "status";
  private TessellAppFamilyStatusDTO status;


  public TessellAppFamily1DTO apps(List<TessellAppFamilyAppDTO> apps) {
    
    this.apps = apps;
    return this;
  }

  public TessellAppFamily1DTO addAppsItem(TessellAppFamilyAppDTO appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * List of apps.
   * @return apps
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of apps.")
  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<TessellAppFamilyAppDTO> getApps() {
    return apps;
  }


  @JsonProperty(JSON_PROPERTY_APPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApps(List<TessellAppFamilyAppDTO> apps) {
    this.apps = apps;
  }


  public TessellAppFamily1DTO description(String description) {
    
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


  public TessellAppFamily1DTO name(String name) {
    
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


  public TessellAppFamily1DTO status(TessellAppFamilyStatusDTO status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellAppFamilyStatusDTO getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(TessellAppFamilyStatusDTO status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellAppFamily1DTO appFamily1 = (TessellAppFamily1DTO) o;
    return Objects.equals(this.apps, appFamily1.apps) &&
        Objects.equals(this.description, appFamily1.description) &&
        Objects.equals(this.name, appFamily1.name) &&
        Objects.equals(this.status, appFamily1.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, description, name, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellAppFamily1DTO {\n");
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

