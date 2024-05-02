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
import com.tessell.dmm.client.model.DapDatabaseAvailabilityCatalog;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellDapCloudCatalog
 */
@JsonPropertyOrder({
  TessellDapCloudCatalog.JSON_PROPERTY_AVAILABILITY_CATALOG,
  TessellDapCloudCatalog.JSON_PROPERTY_CLOUD_ACCOUNT_ID,
  TessellDapCloudCatalog.JSON_PROPERTY_CLOUD_ACCOUNT_NAME,
  TessellDapCloudCatalog.JSON_PROPERTY_CLOUD_TYPE,
  TessellDapCloudCatalog.JSON_PROPERTY_REGIONS
})
@JsonTypeName("TessellDapCloudCatalog")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDapCloudCatalog {
  public static final String JSON_PROPERTY_AVAILABILITY_CATALOG = "availabilityCatalog";
  private Map<String, List<DapDatabaseAvailabilityCatalog>> availabilityCatalog = null;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_ID = "cloudAccountId";
  private UUID cloudAccountId;

  public static final String JSON_PROPERTY_CLOUD_ACCOUNT_NAME = "cloudAccountName";
  private String cloudAccountName;

  public static final String JSON_PROPERTY_CLOUD_TYPE = "cloudType";
  private String cloudType;

  public static final String JSON_PROPERTY_REGIONS = "regions";
  private List<String> regions = null;


  public TessellDapCloudCatalog availabilityCatalog(Map<String, List<DapDatabaseAvailabilityCatalog>> availabilityCatalog) {
    
    this.availabilityCatalog = availabilityCatalog;
    return this;
  }

  public TessellDapCloudCatalog putAvailabilityCatalogItem(String key, List<DapDatabaseAvailabilityCatalog> availabilityCatalogItem) {
    if (this.availabilityCatalog == null) {
      this.availabilityCatalog = new HashMap<>();
    }
    this.availabilityCatalog.put(key, availabilityCatalogItem);
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

  public Map<String, List<DapDatabaseAvailabilityCatalog>> getAvailabilityCatalog() {
    return availabilityCatalog;
  }


  @JsonProperty(JSON_PROPERTY_AVAILABILITY_CATALOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAvailabilityCatalog(Map<String, List<DapDatabaseAvailabilityCatalog>> availabilityCatalog) {
    this.availabilityCatalog = availabilityCatalog;
  }


  public TessellDapCloudCatalog cloudAccountId(UUID cloudAccountId) {
    
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Get cloudAccountId
   * @return cloudAccountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UUID getCloudAccountId() {
    return cloudAccountId;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountId(UUID cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }


  public TessellDapCloudCatalog cloudAccountName(String cloudAccountName) {
    
    this.cloudAccountName = cloudAccountName;
    return this;
  }

   /**
   * Get cloudAccountName
   * @return cloudAccountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCloudAccountName() {
    return cloudAccountName;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_ACCOUNT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudAccountName(String cloudAccountName) {
    this.cloudAccountName = cloudAccountName;
  }


  public TessellDapCloudCatalog cloudType(String cloudType) {
    
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

  public String getCloudType() {
    return cloudType;
  }


  @JsonProperty(JSON_PROPERTY_CLOUD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }


  public TessellDapCloudCatalog regions(List<String> regions) {
    
    this.regions = regions;
    return this;
  }

  public TessellDapCloudCatalog addRegionsItem(String regionsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDapCloudCatalog tessellDapCloudCatalog = (TessellDapCloudCatalog) o;
    return Objects.equals(this.availabilityCatalog, tessellDapCloudCatalog.availabilityCatalog) &&
        Objects.equals(this.cloudAccountId, tessellDapCloudCatalog.cloudAccountId) &&
        Objects.equals(this.cloudAccountName, tessellDapCloudCatalog.cloudAccountName) &&
        Objects.equals(this.cloudType, tessellDapCloudCatalog.cloudType) &&
        Objects.equals(this.regions, tessellDapCloudCatalog.regions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availabilityCatalog, cloudAccountId, cloudAccountName, cloudType, regions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDapCloudCatalog {\n");
    sb.append("    availabilityCatalog: ").append(toIndentedString(availabilityCatalog)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    cloudAccountName: ").append(toIndentedString(cloudAccountName)).append("\n");
    sb.append("    cloudType: ").append(toIndentedString(cloudType)).append("\n");
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

