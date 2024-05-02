/*
 * Compute Governance API Documentation
 * Compute Governance  API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.compute.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.compute.client.model.TessellCloudTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellUpdateComputeRegionRequestDTO
 */
@JsonPropertyOrder({
  TessellUpdateComputeRegionRequestDTO.JSON_PROPERTY_CLOUD,
  TessellUpdateComputeRegionRequestDTO.JSON_PROPERTY_REGIONS
})
@JsonTypeName("UpdateComputeRegionRequest")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:15.462654+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellUpdateComputeRegionRequestDTO {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private TessellCloudTypeDTO cloud;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<String> regions = new ArrayList<>();


  public TessellUpdateComputeRegionRequestDTO cloud(TessellCloudTypeDTO cloud) {
    
    this.cloud = cloud;
    return this;
  }

   /**
   * Get cloud
   * @return cloud
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TessellCloudTypeDTO getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloud(TessellCloudTypeDTO cloud) {
    this.cloud = cloud;
  }


  public TessellUpdateComputeRegionRequestDTO regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public TessellUpdateComputeRegionRequestDTO addRegionsItem(String regionsItem) {
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * Get regions
   * @return regions
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegions(List<String> regions) {
    this.regions = regions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellUpdateComputeRegionRequestDTO updateComputeRegionRequest = (TessellUpdateComputeRegionRequestDTO) o;
    return Objects.equals(this.cloud, updateComputeRegionRequest.cloud) &&
        Objects.equals(this.regions, updateComputeRegionRequest.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellUpdateComputeRegionRequestDTO {\n");
    sb.append("    cloud: ").append(toIndentedString(cloud)).append("\n");
    sb.append("    regions: ").append(toIndentedString(regions)).append("\n");
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

