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


package com.tessell.secretstore.client.model;

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
 * DeleteSecretPayload
 */
@JsonPropertyOrder({
  DeleteSecretPayload.JSON_PROPERTY_REGIONS,
  DeleteSecretPayload.JSON_PROPERTY_SOFT_DELETE
})
@JsonTypeName("DeleteSecretPayload")
@lombok.experimental.SuperBuilder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-01T23:17:31.013725+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeleteSecretPayload {
  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<String> regions = null;

  public static final String JSON_PROPERTY_SOFT_DELETE = "softDelete";
  private Boolean softDelete;


  public DeleteSecretPayload regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public DeleteSecretPayload addRegionsItem(String regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  public DeleteSecretPayload softDelete(Boolean softDelete) {
    
    this.softDelete = softDelete;
    return this;
  }

   /**
   * Soft delete the secret
   * @return softDelete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Soft delete the secret")
  @JsonProperty(JSON_PROPERTY_SOFT_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getSoftDelete() {
    return softDelete;
  }


  @JsonProperty(JSON_PROPERTY_SOFT_DELETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSoftDelete(Boolean softDelete) {
    this.softDelete = softDelete;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeleteSecretPayload deleteSecretPayload = (DeleteSecretPayload) o;
    return Objects.equals(this.regions, deleteSecretPayload.regions) &&
        Objects.equals(this.softDelete, deleteSecretPayload.softDelete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regions, softDelete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeleteSecretPayload {\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
    sb.append("    softDelete: ").append(toIndentedString(softDelete)).append("\n");
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
