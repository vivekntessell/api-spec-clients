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
import com.tessell.dmm.client.model.CloudType;
import com.tessell.dmm.client.model.RegionInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Cloud and region details
 */
@ApiModel(description = "Cloud and region details")
@JsonPropertyOrder({
  CloudRegionInfo.JSON_PROPERTY_CLOUD,
  CloudRegionInfo.JSON_PROPERTY_REGIONS
})
@JsonTypeName("CloudRegionInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class CloudRegionInfo {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private CloudType cloud;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<RegionInfo> regions = null;


  public CloudRegionInfo cloud(CloudType cloud) {
    
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

  public CloudType getCloud() {
    return cloud;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCloud(CloudType cloud) {
    this.cloud = cloud;
  }


  public CloudRegionInfo regions(List<RegionInfo> regions) {
    
    this.regions = regions;
    return this;
  }

  public CloudRegionInfo addRegionsItem(RegionInfo regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * The regions details
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The regions details")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RegionInfo> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(List<RegionInfo> regions) {
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
    CloudRegionInfo cloudRegionInfo = (CloudRegionInfo) o;
    return Objects.equals(this.cloud, cloudRegionInfo.cloud) &&
        Objects.equals(this.regions, cloudRegionInfo.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudRegionInfo {\n");
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

