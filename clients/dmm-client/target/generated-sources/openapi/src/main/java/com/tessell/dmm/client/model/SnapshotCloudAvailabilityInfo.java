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
import com.tessell.dmm.client.model.SnapshotRegionAvailability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Snapshot&#39;s cloud availability details
 */
@ApiModel(description = "Snapshot's cloud availability details")
@JsonPropertyOrder({
  SnapshotCloudAvailabilityInfo.JSON_PROPERTY_CLOUD,
  SnapshotCloudAvailabilityInfo.JSON_PROPERTY_REGIONS
})
@JsonTypeName("SnapshotCloudAvailabilityInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapshotCloudAvailabilityInfo {
  public static final String JSON_PROPERTY_CLOUD = "cloud";
  private CloudType cloud;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<SnapshotRegionAvailability> regions = null;


  public SnapshotCloudAvailabilityInfo cloud(CloudType cloud) {
    
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


  public SnapshotCloudAvailabilityInfo regions(List<SnapshotRegionAvailability> regions) {
    
    this.regions = regions;
    return this;
  }

  public SnapshotCloudAvailabilityInfo addRegionsItem(SnapshotRegionAvailability regionsItem) {
    if (this.regions == null) {
      this.regions = new ArrayList<>();
    }
    this.regions.add(regionsItem);
    return this;
  }

   /**
   * The list of regions and respective availability status
   * @return regions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The list of regions and respective availability status")
  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SnapshotRegionAvailability> getRegions() {
    return regions;
  }


  @JsonProperty(JSON_PROPERTY_REGIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegions(List<SnapshotRegionAvailability> regions) {
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
    SnapshotCloudAvailabilityInfo snapshotCloudAvailabilityInfo = (SnapshotCloudAvailabilityInfo) o;
    return Objects.equals(this.cloud, snapshotCloudAvailabilityInfo.cloud) &&
        Objects.equals(this.regions, snapshotCloudAvailabilityInfo.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloud, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotCloudAvailabilityInfo {\n");
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

