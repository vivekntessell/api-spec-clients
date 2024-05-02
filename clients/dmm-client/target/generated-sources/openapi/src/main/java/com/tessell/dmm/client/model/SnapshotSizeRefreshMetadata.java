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
import com.tessell.dmm.client.model.PerTenantAmRefreshSizeInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * SnapshotSizeRefreshMetadata
 */
@JsonPropertyOrder({
  SnapshotSizeRefreshMetadata.JSON_PROPERTY_PER_TENANT_AM_INFO
})
@JsonTypeName("SnapshotSizeRefreshMetadata")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class SnapshotSizeRefreshMetadata {
  public static final String JSON_PROPERTY_PER_TENANT_AM_INFO = "perTenantAmInfo";
  private List<PerTenantAmRefreshSizeInfo> perTenantAmInfo = null;


  public SnapshotSizeRefreshMetadata perTenantAmInfo(List<PerTenantAmRefreshSizeInfo> perTenantAmInfo) {
    
    this.perTenantAmInfo = perTenantAmInfo;
    return this;
  }

  public SnapshotSizeRefreshMetadata addPerTenantAmInfoItem(PerTenantAmRefreshSizeInfo perTenantAmInfoItem) {
    if (this.perTenantAmInfo == null) {
      this.perTenantAmInfo = new ArrayList<>();
    }
    this.perTenantAmInfo.add(perTenantAmInfoItem);
    return this;
  }

   /**
   * Get perTenantAmInfo
   * @return perTenantAmInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PER_TENANT_AM_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PerTenantAmRefreshSizeInfo> getPerTenantAmInfo() {
    return perTenantAmInfo;
  }


  @JsonProperty(JSON_PROPERTY_PER_TENANT_AM_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerTenantAmInfo(List<PerTenantAmRefreshSizeInfo> perTenantAmInfo) {
    this.perTenantAmInfo = perTenantAmInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnapshotSizeRefreshMetadata snapshotSizeRefreshMetadata = (SnapshotSizeRefreshMetadata) o;
    return Objects.equals(this.perTenantAmInfo, snapshotSizeRefreshMetadata.perTenantAmInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(perTenantAmInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnapshotSizeRefreshMetadata {\n");
    sb.append("    perTenantAmInfo: ").append(toIndentedString(perTenantAmInfo)).append("\n");
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

