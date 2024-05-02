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
 * RefreshSnapshotSizeTaskPayload
 */
@JsonPropertyOrder({
  RefreshSnapshotSizeTaskPayload.JSON_PROPERTY_ON_DEMAND_REQUEST,
  RefreshSnapshotSizeTaskPayload.JSON_PROPERTY_PER_TENANT_AM_INFO
})
@JsonTypeName("RefreshSnapshotSizeTaskPayload")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class RefreshSnapshotSizeTaskPayload {
  public static final String JSON_PROPERTY_ON_DEMAND_REQUEST = "onDemandRequest";
  private Boolean onDemandRequest = false;

  public static final String JSON_PROPERTY_PER_TENANT_AM_INFO = "perTenantAmInfo";
  private List<PerTenantAmRefreshSizeInfo> perTenantAmInfo = null;


  public RefreshSnapshotSizeTaskPayload onDemandRequest(Boolean onDemandRequest) {
    
    this.onDemandRequest = onDemandRequest;
    return this;
  }

   /**
   * Get onDemandRequest
   * @return onDemandRequest
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ON_DEMAND_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getOnDemandRequest() {
    return onDemandRequest;
  }


  @JsonProperty(JSON_PROPERTY_ON_DEMAND_REQUEST)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOnDemandRequest(Boolean onDemandRequest) {
    this.onDemandRequest = onDemandRequest;
  }


  public RefreshSnapshotSizeTaskPayload perTenantAmInfo(List<PerTenantAmRefreshSizeInfo> perTenantAmInfo) {
    
    this.perTenantAmInfo = perTenantAmInfo;
    return this;
  }

  public RefreshSnapshotSizeTaskPayload addPerTenantAmInfoItem(PerTenantAmRefreshSizeInfo perTenantAmInfoItem) {
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
    RefreshSnapshotSizeTaskPayload refreshSnapshotSizeTaskPayload = (RefreshSnapshotSizeTaskPayload) o;
    return Objects.equals(this.onDemandRequest, refreshSnapshotSizeTaskPayload.onDemandRequest) &&
        Objects.equals(this.perTenantAmInfo, refreshSnapshotSizeTaskPayload.perTenantAmInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(onDemandRequest, perTenantAmInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefreshSnapshotSizeTaskPayload {\n");
    sb.append("    onDemandRequest: ").append(toIndentedString(onDemandRequest)).append("\n");
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

