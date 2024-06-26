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
import com.tessell.dmm.client.model.DmmSizeInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellDmmSizeDTO
 */
@JsonPropertyOrder({
  TessellDmmSizeDTO.JSON_PROPERTY_DMM,
  TessellDmmSizeDTO.JSON_PROPERTY_AGGREGATED_TOTAL_SIZE,
  TessellDmmSizeDTO.JSON_PROPERTY_AGGREGATED_BACKUP_SIZE,
  TessellDmmSizeDTO.JSON_PROPERTY_AGGREGATED_LOG_SIZE,
  TessellDmmSizeDTO.JSON_PROPERTY_RPO_SLA_SIZE,
  TessellDmmSizeDTO.JSON_PROPERTY_DAP_SIZE
})
@JsonTypeName("TessellDmmSizeDTO")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellDmmSizeDTO {
  public static final String JSON_PROPERTY_DMM = "dmm";
  private String dmm;

  public static final String JSON_PROPERTY_AGGREGATED_TOTAL_SIZE = "aggregatedTotalSize";
  private Long aggregatedTotalSize;

  public static final String JSON_PROPERTY_AGGREGATED_BACKUP_SIZE = "aggregatedBackupSize";
  private Long aggregatedBackupSize;

  public static final String JSON_PROPERTY_AGGREGATED_LOG_SIZE = "aggregatedLogSize";
  private Long aggregatedLogSize;

  public static final String JSON_PROPERTY_RPO_SLA_SIZE = "rpoSlaSize";
  private DmmSizeInfoDTO rpoSlaSize;

  public static final String JSON_PROPERTY_DAP_SIZE = "dapSize";
  private Map<String, DmmSizeInfoDTO> dapSize = null;


  public TessellDmmSizeDTO dmm(String dmm) {
    
    this.dmm = dmm;
    return this;
  }

   /**
   * Availability Machine Name
   * @return dmm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Availability Machine Name")
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


  public TessellDmmSizeDTO aggregatedTotalSize(Long aggregatedTotalSize) {
    
    this.aggregatedTotalSize = aggregatedTotalSize;
    return this;
  }

   /**
   * Aggregated total size
   * @return aggregatedTotalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aggregated total size")
  @JsonProperty(JSON_PROPERTY_AGGREGATED_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAggregatedTotalSize() {
    return aggregatedTotalSize;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATED_TOTAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregatedTotalSize(Long aggregatedTotalSize) {
    this.aggregatedTotalSize = aggregatedTotalSize;
  }


  public TessellDmmSizeDTO aggregatedBackupSize(Long aggregatedBackupSize) {
    
    this.aggregatedBackupSize = aggregatedBackupSize;
    return this;
  }

   /**
   * Aggregated backup size
   * @return aggregatedBackupSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aggregated backup size")
  @JsonProperty(JSON_PROPERTY_AGGREGATED_BACKUP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAggregatedBackupSize() {
    return aggregatedBackupSize;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATED_BACKUP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregatedBackupSize(Long aggregatedBackupSize) {
    this.aggregatedBackupSize = aggregatedBackupSize;
  }


  public TessellDmmSizeDTO aggregatedLogSize(Long aggregatedLogSize) {
    
    this.aggregatedLogSize = aggregatedLogSize;
    return this;
  }

   /**
   * Aggregated log size
   * @return aggregatedLogSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Aggregated log size")
  @JsonProperty(JSON_PROPERTY_AGGREGATED_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getAggregatedLogSize() {
    return aggregatedLogSize;
  }


  @JsonProperty(JSON_PROPERTY_AGGREGATED_LOG_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAggregatedLogSize(Long aggregatedLogSize) {
    this.aggregatedLogSize = aggregatedLogSize;
  }


  public TessellDmmSizeDTO rpoSlaSize(DmmSizeInfoDTO rpoSlaSize) {
    
    this.rpoSlaSize = rpoSlaSize;
    return this;
  }

   /**
   * Get rpoSlaSize
   * @return rpoSlaSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RPO_SLA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public DmmSizeInfoDTO getRpoSlaSize() {
    return rpoSlaSize;
  }


  @JsonProperty(JSON_PROPERTY_RPO_SLA_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRpoSlaSize(DmmSizeInfoDTO rpoSlaSize) {
    this.rpoSlaSize = rpoSlaSize;
  }


  public TessellDmmSizeDTO dapSize(Map<String, DmmSizeInfoDTO> dapSize) {
    
    this.dapSize = dapSize;
    return this;
  }

  public TessellDmmSizeDTO putDapSizeItem(String key, DmmSizeInfoDTO dapSizeItem) {
    if (this.dapSize == null) {
      this.dapSize = new HashMap<>();
    }
    this.dapSize.put(key, dapSizeItem);
    return this;
  }

   /**
   * Get dapSize
   * @return dapSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DAP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, DmmSizeInfoDTO> getDapSize() {
    return dapSize;
  }


  @JsonProperty(JSON_PROPERTY_DAP_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDapSize(Map<String, DmmSizeInfoDTO> dapSize) {
    this.dapSize = dapSize;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellDmmSizeDTO tessellDmmSizeDTO = (TessellDmmSizeDTO) o;
    return Objects.equals(this.dmm, tessellDmmSizeDTO.dmm) &&
        Objects.equals(this.aggregatedTotalSize, tessellDmmSizeDTO.aggregatedTotalSize) &&
        Objects.equals(this.aggregatedBackupSize, tessellDmmSizeDTO.aggregatedBackupSize) &&
        Objects.equals(this.aggregatedLogSize, tessellDmmSizeDTO.aggregatedLogSize) &&
        Objects.equals(this.rpoSlaSize, tessellDmmSizeDTO.rpoSlaSize) &&
        Objects.equals(this.dapSize, tessellDmmSizeDTO.dapSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dmm, aggregatedTotalSize, aggregatedBackupSize, aggregatedLogSize, rpoSlaSize, dapSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellDmmSizeDTO {\n");
    sb.append("    dmm: ").append(toIndentedString(dmm)).append("\n");
    sb.append("    aggregatedTotalSize: ").append(toIndentedString(aggregatedTotalSize)).append("\n");
    sb.append("    aggregatedBackupSize: ").append(toIndentedString(aggregatedBackupSize)).append("\n");
    sb.append("    aggregatedLogSize: ").append(toIndentedString(aggregatedLogSize)).append("\n");
    sb.append("    rpoSlaSize: ").append(toIndentedString(rpoSlaSize)).append("\n");
    sb.append("    dapSize: ").append(toIndentedString(dapSize)).append("\n");
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

