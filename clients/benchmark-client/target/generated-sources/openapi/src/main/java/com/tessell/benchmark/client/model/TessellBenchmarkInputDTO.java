/*
 * Benchmark Service API
 * Benchmark Service API Specification
 *
 * The version of the OpenAPI document: 1.0
 * Contact: yashesh.mankad@tessell.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.tessell.benchmark.client.model;

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
 * Benchmark input object
 */
@ApiModel(description = "Benchmark input object")
@JsonPropertyOrder({
  TessellBenchmarkInputDTO.JSON_PROPERTY_CLIENT_COUNT,
  TessellBenchmarkInputDTO.JSON_PROPERTY_DATASET_SIZE_IN_G_B,
  TessellBenchmarkInputDTO.JSON_PROPERTY_DURATION_IN_MIN
})
@JsonTypeName("BenchmarkInput")
@lombok.Builder
@lombok.NoArgsConstructor
@lombok.AllArgsConstructor
@javax.annotation.Generated(value = "com.tessell.codegen.TessellJavaGenerator", date = "2024-05-02T15:56:13.006260+05:30[Asia/Kolkata]")
@JsonIgnoreProperties(ignoreUnknown = true)
public class TessellBenchmarkInputDTO {
  public static final String JSON_PROPERTY_CLIENT_COUNT = "clientCount";
  private Integer clientCount;

  public static final String JSON_PROPERTY_DATASET_SIZE_IN_G_B = "datasetSizeInGB";
  private Integer datasetSizeInGB;

  public static final String JSON_PROPERTY_DURATION_IN_MIN = "durationInMin";
  private Integer durationInMin;


  public TessellBenchmarkInputDTO clientCount(Integer clientCount) {
    
    this.clientCount = clientCount;
    return this;
  }

   /**
   * client count
   * @return clientCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "client count")
  @JsonProperty(JSON_PROPERTY_CLIENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getClientCount() {
    return clientCount;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClientCount(Integer clientCount) {
    this.clientCount = clientCount;
  }


  public TessellBenchmarkInputDTO datasetSizeInGB(Integer datasetSizeInGB) {
    
    this.datasetSizeInGB = datasetSizeInGB;
    return this;
  }

   /**
   * dataset size
   * @return datasetSizeInGB
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "dataset size")
  @JsonProperty(JSON_PROPERTY_DATASET_SIZE_IN_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDatasetSizeInGB() {
    return datasetSizeInGB;
  }


  @JsonProperty(JSON_PROPERTY_DATASET_SIZE_IN_G_B)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDatasetSizeInGB(Integer datasetSizeInGB) {
    this.datasetSizeInGB = datasetSizeInGB;
  }


  public TessellBenchmarkInputDTO durationInMin(Integer durationInMin) {
    
    this.durationInMin = durationInMin;
    return this;
  }

   /**
   * run duration
   * @return durationInMin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "run duration")
  @JsonProperty(JSON_PROPERTY_DURATION_IN_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getDurationInMin() {
    return durationInMin;
  }


  @JsonProperty(JSON_PROPERTY_DURATION_IN_MIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDurationInMin(Integer durationInMin) {
    this.durationInMin = durationInMin;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TessellBenchmarkInputDTO benchmarkInput = (TessellBenchmarkInputDTO) o;
    return Objects.equals(this.clientCount, benchmarkInput.clientCount) &&
        Objects.equals(this.datasetSizeInGB, benchmarkInput.datasetSizeInGB) &&
        Objects.equals(this.durationInMin, benchmarkInput.durationInMin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientCount, datasetSizeInGB, durationInMin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TessellBenchmarkInputDTO {\n");
    sb.append("    clientCount: ").append(toIndentedString(clientCount)).append("\n");
    sb.append("    datasetSizeInGB: ").append(toIndentedString(datasetSizeInGB)).append("\n");
    sb.append("    durationInMin: ").append(toIndentedString(durationInMin)).append("\n");
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

