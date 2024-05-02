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
import com.tessell.dmm.client.model.TessellServiceInstanceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DBServiceTopology
 */
@JsonPropertyOrder({
  DBServiceTopology.JSON_PROPERTY_TYPE,
  DBServiceTopology.JSON_PROPERTY_CLOUD_TYPE,
  DBServiceTopology.JSON_PROPERTY_REGION,
  DBServiceTopology.JSON_PROPERTY_AVAILABILITY_ZONES
})
@JsonTypeName("DBServiceTopology")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DBServiceTopology {
  public static final String JSON_PROPERTY_TYPE = "type";
  private TessellServiceInstanceType type;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private CloudType cloudType;

  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_AVAILABILITY_ZONES = "availabilityZones";
  private List<String> availabilityZones = null;


  public DBServiceTopology type(TessellServiceInstanceType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellServiceInstanceType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TessellServiceInstanceType type) {
    this.type = type;
  }


  public DBServiceTopology cloudType(CloudType cloudType) {
    
    this.cloudType = cloudType;
    return this;
  }

   /**
   * Get cloudType
   * @return cloudType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CloudType getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(CloudType cloudType) {
    this.cloudType = cloudType;
  }


  public DBServiceTopology region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRegion(String region) {
    this.region = region;
  }


  public DBServiceTopology availabilityZones(List<String> availabilityZones) {
    
    this.availabilityZones = availabilityZones;
    return this;
  }

  public DBServiceTopology addAvailabilityZonesItem(String availabilityZonesItem) {
    if (this.availabilityZones == null) {
      this.availabilityZones = new ArrayList<>();
    }
    this.availabilityZones.add(availabilityZonesItem);
    return this;
  }

   /**
   * Get availabilityZones
   * @return availabilityZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getAvailabilityZones() {
    return availabilityZones;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_ZONES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityZones(List<String> availabilityZones) {
    this.availabilityZones = availabilityZones;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DBServiceTopology dbServiceTopology = (DBServiceTopology) o;
    return Objects.equals(this.type, dbServiceTopology.type) &&
        Objects.equals(this.cloudType, dbServiceTopology.cloudType) &&
        Objects.equals(this.region, dbServiceTopology.region) &&
        Objects.equals(this.availabilityZones, dbServiceTopology.availabilityZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, cloudType, region, availabilityZones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DBServiceTopology {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    availabilityZones: ").append(toIndentedString(availabilityZones)).append("\n");
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

