/*
 * Tessell REST API Documentation
 * Tessell REST API Documentation
 *
 * The version of the OpenAPI document: 1.0
 * Contact: support@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.security.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.tessell.security.client.model.TessellApiPaginationInfoDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * TessellApiMetadataDTO
 */
@JsonPropertyOrder({
  TessellApiMetadataDTO.JSON_PROPERTY_TIME_ZONE,
  TessellApiMetadataDTO.JSON_PROPERTY_RECORDS,
  TessellApiMetadataDTO.JSON_PROPERTY_PAGINATION
})
@JsonTypeName("apiMetadata")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:57:10.651077+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellApiMetadataDTO {
  public static final String JSON_PROPERTY_TIME_ZONE = "timeZone";
  private String timeZone;

  public static final String JSON_PROPERTY_RECORDS = "records";
  private Integer records;

  public static final String JSON_PROPERTY_PAGINATION = "pagination";
  private TessellApiPaginationInfoDTO pagination;


  public TessellApiMetadataDTO timeZone(String timeZone) {
    
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


  public TessellApiMetadataDTO records(Integer records) {
    
    this.records = records;
    return this;
  }

   /**
   * Get records
   * @return records
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRecords() {
    return records;
  }


  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRecords(Integer records) {
    this.records = records;
  }


  public TessellApiMetadataDTO pagination(TessellApiPaginationInfoDTO pagination) {
    
    this.pagination = pagination;
    return this;
  }

   /**
   * Get pagination
   * @return pagination
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TessellApiPaginationInfoDTO getPagination() {
    return pagination;
  }


  @JsonProperty(JSON_PROPERTY_PAGINATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPagination(TessellApiPaginationInfoDTO pagination) {
    this.pagination = pagination;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellApiMetadataDTO apiMetadata = (TessellApiMetadataDTO) o;
    return Objects.equals(this.timeZone, apiMetadata.timeZone) &&
        Objects.equals(this.records, apiMetadata.records) &&
        Objects.equals(this.pagination, apiMetadata.pagination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeZone, records, pagination);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellApiMetadataDTO {\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
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

