/*
 * Tessell Gateway Service API
 * Tessell Gateway Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: samir.das@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.gateway.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.gateway.client.model.LibraryUpgradeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * publish tenant services upgrade request
 */
@ApiModel(description = "publish tenant services upgrade request")
@JsonPropertyOrder({
  PublishTenantServicesUpgradeRequest.JSON_PROPERTY_LIBRARIES
})
@JsonTypeName("publishTenantServicesUpgradeRequest")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:22.183784+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PublishTenantServicesUpgradeRequest {
  public static final String JSON_PROPERTY_LIBRARIES = "libraries";
  private List<LibraryUpgradeInfo> libraries = null;


  public PublishTenantServicesUpgradeRequest libraries(List<LibraryUpgradeInfo> libraries) {
    
    this.libraries = libraries;
    return this;
  }

  public PublishTenantServicesUpgradeRequest addLibrariesItem(LibraryUpgradeInfo librariesItem) {
    if (this.libraries == null) {
      this.libraries = new ArrayList<>();
    }
    this.libraries.add(librariesItem);
    return this;
  }

   /**
   * List of libraries available for upgrade
   * @return libraries
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of libraries available for upgrade")
  @JsonProperty(JSON_PROPERTY_LIBRARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<LibraryUpgradeInfo> getLibraries() {
    return libraries;
  }


  @JsonProperty(JSON_PROPERTY_LIBRARIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLibraries(List<LibraryUpgradeInfo> libraries) {
    this.libraries = libraries;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishTenantServicesUpgradeRequest publishTenantServicesUpgradeRequest = (PublishTenantServicesUpgradeRequest) o;
    return Objects.equals(this.libraries, publishTenantServicesUpgradeRequest.libraries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(libraries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishTenantServicesUpgradeRequest {\n");
    sb.append("    libraries: ").append(toIndentedString(libraries)).append("\n");
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

