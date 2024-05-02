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
import com.tessell.dmm.client.model.DapFromToDate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * DapPitrCatalogServiceView
 */
@JsonPropertyOrder({
  DapPitrCatalogServiceView.JSON_PROPERTY_TIME_RANGES
})
@JsonTypeName("DapPitrCatalogServiceView")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DapPitrCatalogServiceView {
  public static final String JSON_PROPERTY_TIME_RANGES = "timeRanges";
  private List<DapFromToDate> timeRanges = null;


  public DapPitrCatalogServiceView timeRanges(List<DapFromToDate> timeRanges) {
    
    this.timeRanges = timeRanges;
    return this;
  }

  public DapPitrCatalogServiceView addTimeRangesItem(DapFromToDate timeRangesItem) {
    if (this.timeRanges == null) {
      this.timeRanges = new ArrayList<>();
    }
    this.timeRanges.add(timeRangesItem);
    return this;
  }

   /**
   * Get timeRanges
   * @return timeRanges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TIME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<DapFromToDate> getTimeRanges() {
    return timeRanges;
  }


  @JsonProperty(JSON_PROPERTY_TIME_RANGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeRanges(List<DapFromToDate> timeRanges) {
    this.timeRanges = timeRanges;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DapPitrCatalogServiceView dapPitrCatalogServiceView = (DapPitrCatalogServiceView) o;
    return Objects.equals(this.timeRanges, dapPitrCatalogServiceView.timeRanges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeRanges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DapPitrCatalogServiceView {\n");
    sb.append("    timeRanges: ").append(toIndentedString(timeRanges)).append("\n");
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

