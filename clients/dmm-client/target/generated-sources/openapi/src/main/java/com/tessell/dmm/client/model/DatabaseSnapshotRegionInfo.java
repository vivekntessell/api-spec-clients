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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
/**
 * Region availability details for a snapshot
 */
@ApiModel(description = "Region availability details for a snapshot")
@JsonPropertyOrder({
  DatabaseSnapshotRegionInfo.JSON_PROPERTY_REGION,
  DatabaseSnapshotRegionInfo.JSON_PROPERTY_STATUS
})
@JsonTypeName("DatabaseSnapshotRegionInfo")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:39.699111+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DatabaseSnapshotRegionInfo {
  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  /**
   * The current status of the snapshot in the respective region
   */
  public enum StatusEnum {
    AVAILABLE("AVAILABLE"),
    
    COPYING("COPYING"),
    
    NOT_AVAILABLE("NOT_AVAILABLE");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;


  public DatabaseSnapshotRegionInfo region(String region) {
    
    this.region = region;
    return this;
  }

   /**
   * The region name
   * @return region
  **/
  @ApiModelProperty(required = true, value = "The region name")
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRegion() {
    return region;
  }


  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRegion(String region) {
    this.region = region;
  }


  public DatabaseSnapshotRegionInfo status(StatusEnum status) {
    
    this.status = status;
    return this;
  }

   /**
   * The current status of the snapshot in the respective region
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The current status of the snapshot in the respective region")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatabaseSnapshotRegionInfo databaseSnapshotRegionInfo = (DatabaseSnapshotRegionInfo) o;
    return Objects.equals(this.region, databaseSnapshotRegionInfo.region) &&
        Objects.equals(this.status, databaseSnapshotRegionInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatabaseSnapshotRegionInfo {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
