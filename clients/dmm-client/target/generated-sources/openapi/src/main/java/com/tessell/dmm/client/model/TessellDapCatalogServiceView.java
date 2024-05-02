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
import com.tessell.dmm.client.model.CloudRegionInfo;
import com.tessell.dmm.client.model.DapDatabaseAvailabilityCatalogServiceView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellDapCatalogServiceView
 */
@JsonPropertyOrder({
  TessellDapCatalogServiceView.JSON_PROPERTY_AVAILABILITY_CATALOG,
  TessellDapCatalogServiceView.JSON_PROPERTY_CLOUD_AVAILABILITY,
  TessellDapCatalogServiceView.JSON_PROPERTY_DATA_ACCESS_POLICY,
  TessellDapCatalogServiceView.JSON_PROPERTY_DMM,
  TessellDapCatalogServiceView.JSON_PROPERTY_TIME_ZONE
})
@JsonTypeName("TessellDapCatalogServiceView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDapCatalogServiceView {
  public static final String JSON_PROPERTY_AVAILABILITY_CATALOG = "availabilityCatalog";
  private List<DapDatabaseAvailabilityCatalogServiceView> availabilityCatalog = null;

  public static final String JSON_PROPERTY_CLOUD_AVAILABILITY = "cloudAvailability";
  private List<CloudRegionInfo> cloudAvailability = null;

  public static final String JSON_PROPERTY_DATA_ACCESS_POLICY = "dataAccessPolicy";
  private String dataAccessPolicy;

  public static final String JSON_PROPERTY_DMM = "dmm";
  private String dmm;

  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;


  public TessellDapCatalogServiceView availabilityCatalog(List<DapDatabaseAvailabilityCatalogServiceView> availabilityCatalog) {
    
    this.availabilityCatalog = availabilityCatalog;
    return this;
  }

  public TessellDapCatalogServiceView addAvailabilityCatalogItem(DapDatabaseAvailabilityCatalogServiceView availabilityCatalogItem) {
    if (this.availabilityCatalog == null) {
      this.availabilityCatalog = new ArrayList<>();
    }
    this.availabilityCatalog.add(availabilityCatalogItem);
    return this;
  }

   /**
   * Get availabilityCatalog
   * @return availabilityCatalog
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_AVAILABILITY_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DapDatabaseAvailabilityCatalogServiceView> getAvailabilityCatalog() {
    return availabilityCatalog;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityCatalog(List<DapDatabaseAvailabilityCatalogServiceView> availabilityCatalog) {
    this.availabilityCatalog = availabilityCatalog;
  }


  public TessellDapCatalogServiceView cloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    
    this.cloudAvailability = cloudAvailability;
    return this;
  }

  public TessellDapCatalogServiceView addCloudAvailabilityItem(CloudRegionInfo cloudAvailabilityItem) {
    if (this.cloudAvailability == null) {
      this.cloudAvailability = new ArrayList<>();
    }
    this.cloudAvailability.add(cloudAvailabilityItem);
    return this;
  }

   /**
   * Get cloudAvailability
   * @return cloudAvailability
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CloudRegionInfo> getCloudAvailability() {
    return cloudAvailability;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_AVAILABILITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAvailability(List<CloudRegionInfo> cloudAvailability) {
    this.cloudAvailability = cloudAvailability;
  }


  public TessellDapCatalogServiceView dataAccessPolicy(String dataAccessPolicy) {
    
    this.dataAccessPolicy = dataAccessPolicy;
    return this;
  }

   /**
   * Get dataAccessPolicy
   * @return dataAccessPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDataAccessPolicy() {
    return dataAccessPolicy;
  }


  @JsonProperty(JSON_PROPERTY_DATA_ACCESS_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDataAccessPolicy(String dataAccessPolicy) {
    this.dataAccessPolicy = dataAccessPolicy;
  }


  public TessellDapCatalogServiceView dmm(String dmm) {
    
    this.dmm = dmm;
    return this;
  }

   /**
   * Get dmm
   * @return dmm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DMM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDmm() {
    return dmm;
  }


  @JsonProperty(JSON_PROPERTY_DMM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDmm(String dmm) {
    this.dmm = dmm;
  }


  public TessellDapCatalogServiceView timeZone(String timeZone) {
    
    this.timeZone = timeZone;
    return this;
  }

   /**
   * Get timeZone
   * @return timeZone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimeZone() {
    return timeZone;
  }


  @JsonProperty(JSON_PROPERTY_TIME_ZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeZone(String timeZone) {
    this.timeZone = timeZone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDapCatalogServiceView tessellDapCatalogServiceView = (TessellDapCatalogServiceView) o;
    return Objects.equals(this.availabilityCatalog, tessellDapCatalogServiceView.availabilityCatalog) &&
        Objects.equals(this.cloudAvailability, tessellDapCatalogServiceView.cloudAvailability) &&
        Objects.equals(this.dataAccessPolicy, tessellDapCatalogServiceView.dataAccessPolicy) &&
        Objects.equals(this.dmm, tessellDapCatalogServiceView.dmm) &&
        Objects.equals(this.timeZone, tessellDapCatalogServiceView.timeZone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityCatalog, cloudAvailability, dataAccessPolicy, dmm, timeZone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDapCatalogServiceView {\n");
    sb.append("    availabilityCatalog: ").append(toIndentedString(availabilityCatalog)).append("\n");
    sb.append("    cloudAvailability: ").append(toIndentedString(cloudAvailability)).append("\n");
    sb.append("    dataAccessPolicy: ").append(toIndentedString(dataAccessPolicy)).append("\n");
    sb.append("    dmm: ").append(toIndentedString(dmm)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

